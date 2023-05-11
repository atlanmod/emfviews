/*******************************************************************************
 * Copyright (c) 2019 Armines
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *******************************************************************************/

package org.atlanmod.emfviews.virtuallinksepsilondelegate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.ecl.dom.MatchRule;
import org.eclipse.epsilon.ecl.execute.context.IEclContext;
import org.eclipse.epsilon.emc.emf.EmfModelMetamodel;
import org.eclipse.epsilon.eol.m3.MetaClass;
import org.eclipse.epsilon.eol.dom.BooleanLiteral;
import org.eclipse.epsilon.eol.dom.EqualsOperatorExpression;
import org.eclipse.epsilon.eol.dom.ExecutableBlock;
import org.eclipse.epsilon.eol.dom.Expression;
import org.eclipse.epsilon.eol.dom.FirstOrderOperationCallExpression;
import org.eclipse.epsilon.eol.dom.IExecutableModuleElement;
import org.eclipse.epsilon.eol.dom.IntegerLiteral;
import org.eclipse.epsilon.eol.dom.ItemSelectorExpression;
import org.eclipse.epsilon.eol.dom.NameExpression;
import org.eclipse.epsilon.eol.dom.OperationCallExpression;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.dom.PropertyCallExpression;
import org.eclipse.epsilon.eol.dom.ReturnStatement;
import org.eclipse.epsilon.eol.dom.Statement;
import org.eclipse.epsilon.eol.dom.StatementBlock;
import org.eclipse.epsilon.eol.dom.StringLiteral;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;
import org.eclipse.epsilon.eol.types.EolModelElementType;
import org.eclipse.epsilon.eol.types.EolObjectComparator;
import org.eclipse.epsilon.eol.types.EolType;
import org.eclipse.epsilon.eol.util.ReflectionUtil;

import org.atlanmod.emfviews.virtuallinksepsilondelegate.EclDelegate.Lambda;

/**
 * Optimize ECL rules execution via partial evaluation.
 *
 * Executing ECL rules on many object instances can be slow, as most of the
 * overhead will be in redoing the interpretation of the AST.  Instead, we can
 * do most of the AST recursive interpretation work ahead of time, and suspend
 * the rest to runtime in closures (lambdas).  Benchmarks show a 50x to 100x
 * speedup using compiled rules.
 */
public class EclPartialEvaluator {

  static class CompilationException extends Exception {
    public CompilationException(String string) {
      super(string);
    }

    private static final long serialVersionUID = -7925342055070955597L;
  }

  static Lambda compileMatchRule(MatchRule m, IEclContext context) {
    Parameter left = (Parameter) getField(m, "leftParameter");
    Parameter right = (Parameter) getField(m, "rightParameter");
    ExecutableBlock<?> block = (ExecutableBlock<?>) getField(m, "compareBlock");

    // Fallback on the interpreter if we can't compile the rule
    try {
      return compile(block.getBody(), Arrays.asList(left.getName(), right.getName()), context);
    } catch (CompilationException ex) {
      return args -> m.match(args[0], args[1], context, null, false).isMatching();
    }
  }


  // Currently unused, but can be useful to determine the static type of a parameter for further optimization
  static EolType getParamType(Parameter p, Map<String, String> aliasToMetamodelURI, IEclContext context) throws EolRuntimeException {
    EolModelElementType type = (EolModelElementType) p.getType(context);
    StringProperties props = new StringProperties();
    props.put("nsuri", aliasToMetamodelURI.get(type.getModelName()));
    MetaClass mc = new EmfModelMetamodel(props, null).getMetaClass(type.getTypeName());
    type.setMetaClass(mc);
    return type;
  }

  static Lambda compile(IExecutableModuleElement expr, List<String> vars, IEclContext context) throws CompilationException {
    if (expr instanceof StatementBlock) {
      List<Statement> ss = ((StatementBlock) expr).getStatements();
      List<Lambda> statements = new ArrayList<>(ss.size());
      for (Statement s: ss)
        statements.add(compile(s, vars, context));

      return args -> {
        Object ret = null;
        for (Lambda l: statements) {
          ret = l.exec(args);
        }
        return ret;
      };
    }

    else if (expr instanceof ReturnStatement) {
      return compile(((ReturnStatement) expr).getReturnedExpression(), vars, context);
    }

    else if (expr instanceof EqualsOperatorExpression) {
      EqualsOperatorExpression e = (EqualsOperatorExpression) expr;

      Lambda l1 = compile(e.getFirstOperand(), vars, context);
      Lambda l2 = compile(e.getSecondOperand(), vars, context);

      return args -> {
        Object o1 = l1.exec(args);
        Object o2 = l2.exec(args);
        return EolObjectComparator.equals(o1, o2);
      };
    }

    else if (expr instanceof PropertyCallExpression) {
      PropertyCallExpression e = (PropertyCallExpression) expr;
      Lambda target = compile(e.getTargetExpression(), vars, context);
      String name = e.getName();

      // @Optimize: Could determine the property getter statically, and even
      // hardcode some (i.e., eGet).

      return args -> {
        Object source = target.exec(args);
        IPropertyGetter getter = context.getIntrospectionManager().getPropertyGetterFor(source, name, context);
        return getter.invoke(source, name, context);
      };
    }

    else if (expr instanceof NameExpression) {
      String name = ((NameExpression) expr).getName();
      int idx = vars.indexOf(name);
      if (idx == -1) {
        throw new CompilationException("Unknown name " + name);
      } else {
        return args -> args[idx];
      }
    }

    else if (expr instanceof FirstOrderOperationCallExpression) {
      FirstOrderOperationCallExpression e = (FirstOrderOperationCallExpression) expr;
      Lambda target = compile(e.getTargetExpression(), vars, context);
      String opName = e.getNameExpression().getName();
      List<String> new_vars = new ArrayList<>(vars);
      for (Parameter p: e.getParameters())
        new_vars.add(p.getName());
      Lambda body = compile(e.getExpressions().get(0), new_vars, context);

      switch (opName) {
      case "exists":
        return args -> {
          Collection<?> values = (Collection<?>) target.exec(args);
          for (Object o: values) {
            if ((boolean) body.exec(o))
              return true;
          }
          return false;
        };

      default:
        throw new CompilationException("Unsupported first order operation " + opName);
      }
    }

    else if (expr instanceof OperationCallExpression) {
      OperationCallExpression e = (OperationCallExpression) expr;
      Lambda target = compile(e.getTargetExpression(), vars, context);
      String opName = e.getNameExpression().getName();
      List<Lambda> params = new ArrayList<>(e.getParameterExpressions().size());
      for (Expression ex: e.getParameterExpressions())
        params.add(compile(ex, vars, context));

      // @Optimize: we could be faster if we determined the method to call statically and only executed it
      // at runtime.  We could even hardcode some critical methods (return specialized lambdas).

      return args -> {
        Object receiver = target.exec(args);
        Object[] evaledParams = new Object[params.size()];
        for (int i=0; i < params.size(); ++i)
          evaledParams[i] = params.get(i).exec(args);
        try {
          return ReflectionUtil.executeMethod(receiver, opName, evaledParams);
        } catch (Throwable t) {
          throw new RuntimeException("Failed to execute method " + opName, t);
        }
      };
    }

    else if (expr instanceof BooleanLiteral) {
      return ((BooleanLiteral) expr).getValue() ? args -> true : args -> false;
    }

    else if (expr instanceof StringLiteral) {
      return args -> ((StringLiteral) expr).getValue();
    }

    else if (expr instanceof IntegerLiteral) {
      return args -> ((IntegerLiteral) expr).getValue();
    }

    else if (expr instanceof ItemSelectorExpression) {
      ItemSelectorExpression e = (ItemSelectorExpression) expr;
      Lambda target = compile((IExecutableModuleElement) getField(e, "targetExpression"), vars, context);
      Lambda index = compile((IExecutableModuleElement) getField(e, "indexExpression"), vars, context);
      return args -> {
        Object[] c = (Object[]) target.exec(args);
        int idx = (int) index.exec(args);
        return c[idx];
      };
    }

    throw new CompilationException("Unhandled AST variant");
  }

  // Workaround missing bits of the EOL DOM API by using reflection
  static Object getField(Object e, String field) {
    try {
      Field f = e.getClass().getDeclaredField(field);
      f.setAccessible(true);
      return f.get(e);
    } catch (NoSuchFieldException | IllegalAccessException ex) {
      throw new RuntimeException("Failed to access non-API field " + field, ex);
    }
  }
}
