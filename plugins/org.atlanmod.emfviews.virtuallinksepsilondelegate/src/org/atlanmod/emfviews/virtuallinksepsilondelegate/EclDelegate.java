/*******************************************************************************
 * Copyright (c) 2017--2019 Armines
 * Copyright (c) 2013 INRIA
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *   fmdkdd - refactoring and extension
 *   Juan David Villa Calle - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.virtuallinksepsilondelegate;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.dom.MatchRule;
import org.eclipse.epsilon.ecl.execute.EclOperationFactory;
import org.eclipse.epsilon.ecl.execute.context.IEclContext;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.dom.Parameter;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

import org.atlanmod.emfviews.virtuallinks.delegator.IVirtualLinksDelegate;

/**
 * Execute ECL rules on input models.
 *
 * An ECL file contains multiple rules which are used to find matches between
 * two elements of two metamodels.  In EMF Views, we use ECL files as a
 * declarative way to populate virtual associations.  Any time two elements
 * match a rule, we populate the corresponding virtual feature with the matching
 * elements.
 *
 * The role of the EclDelegate is to execute the ECL rules when the view
 * requests it.
 *
 * EclDelegate is the default implementation of IVirtualLinksDelegate provided
 * by EMF Views, but other means of creating weaving models could be used by
 * implementing this interface.
 */
public class EclDelegate implements IVirtualLinksDelegate {

  private EclModule module;
  private Map<String, Lambda> compiledRules;

  static interface Lambda {
    Object exec(Object ...args) throws EolRuntimeException;
  }

  @Override
  public void init(URI linksDslURI, Map<String, Resource> inputModels) {

    File f;

    // Need to turn an EMF URI into an actual File location. We cannot use the
    // URIConverter.INSTANCE since it only provides InputStream, and EclModule
    // needs an actual file.
    if (linksDslURI.isPlatform()) {
      // Find the system path for the file from the workspace URI
      IContainer wsroot = EcorePlugin.getWorkspaceRoot();
      IFile ifile = wsroot.getFile(new Path(linksDslURI.toPlatformString(true)));
      f = new File(ifile.getLocationURI());
    } else {
      // Assume a regular file path. Will throw if it cannot be found anyway.
      f = new File(linksDslURI.toFileString());
    }

    // Prepare the ECL Module
    module = new EclModule();
    try {
      module.parse(f);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Error in parsing ECL file.  See stderr for details");
      }
    } catch (Exception ex) {
      throw new RuntimeException("Error in parsing ECL file", ex);
    }

    module.getContext().setOperationFactory(new EclOperationFactory());

    // Add input models and grab the metamodel URI
    for (Entry<String, Resource> e : inputModels.entrySet()) {
      String name = e.getKey();
      Resource modelResource = e.getValue();
      EmfModel inputModel = new InMemoryEmfModel(name, modelResource);
      module.getContext().getModelRepository().addModel(inputModel);
    }

    compiledRules = new HashMap<>();
    for (MatchRule m: module.getMatchRules()) {
      compiledRules.put(m.getName(), EclPartialEvaluator.compileMatchRule(m, module.getContext()));
    }
  }

  /**
   * Execute the rule RULENAME with given PARAM. If RIGHTHAND is false, then
   * PARAM is used as the left parameter to the rule, and matched against all
   * instances of the right parameter specified in the rule. If RIGHTHAND is
   * true, PARAM is used as the right parameter, and matched against all
   * instances of the left parameter specified by the rule.
   */
  @Override
  public List<EObject> executeMatchRule(String ruleName, EObject param, boolean rightHand) throws EolRuntimeException {

    // Find the rule
    Optional<MatchRule> ruleOpt = module.getMatchRules().stream()
      .filter(r -> ruleName.equals(r.getName())).findFirst();

    if (!ruleOpt.isPresent())
      return Collections.emptyList();

    MatchRule rule = ruleOpt.get();
    Lambda compiledRule = compiledRules.get(ruleName);

    // Now execute it

    // Find the instance type of the missing param
    // @Correctness: this is brittle; an API from ECL would be welcome
    int otherParamIndex = rightHand ? 1 : 2;
    Parameter otherParam = (Parameter) rule.getChildren().get(otherParamIndex);

    IEclContext context = module.getContext();
    
    //workaround to deal with epsilon 2.4 that apparently clean-up the module when get the context
    context.setModule(module);

    List<Match> matches = new ArrayList<>();

    for (Object other: rule.getAllInstances(otherParam, context, false)) {
      Object left  = rightHand ? other : param;
      Object right = rightHand ? param : other;

      if ((boolean) compiledRule.exec(left, right))
        matches.add(new Match(left, right, true, null));
    }

    return matches.stream()
      .map(m -> (EObject) (rightHand ? m.getLeft() : m.getRight()))
      .collect(Collectors.toList());
  }

}
