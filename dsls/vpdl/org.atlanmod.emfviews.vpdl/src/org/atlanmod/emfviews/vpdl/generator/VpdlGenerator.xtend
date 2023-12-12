/*******************************************************************************
 * Copyright (c) 2017--2019 Armines
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
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.vpdl.generator

import com.google.common.collect.Maps
import java.io.ByteArrayOutputStream
import java.util.Map
import java.util.regex.Pattern
import org.atlanmod.emfviews.vpdl.vpdl.BoolExpr
import org.atlanmod.emfviews.vpdl.vpdl.BoolLiteral
import org.atlanmod.emfviews.vpdl.vpdl.BoolOp
import org.atlanmod.emfviews.vpdl.vpdl.Comparison
import org.atlanmod.emfviews.vpdl.vpdl.Constant
import org.atlanmod.emfviews.vpdl.vpdl.IntLiteral
import org.atlanmod.emfviews.vpdl.vpdl.Lambda
import org.atlanmod.emfviews.vpdl.vpdl.Metamodel
import org.atlanmod.emfviews.vpdl.vpdl.MethodArg
import org.atlanmod.emfviews.vpdl.vpdl.MethodCall
import org.atlanmod.emfviews.vpdl.vpdl.Nav
import org.atlanmod.emfviews.vpdl.vpdl.NavFeature
import org.atlanmod.emfviews.vpdl.vpdl.NavRest
import org.atlanmod.emfviews.vpdl.vpdl.Relation
import org.atlanmod.emfviews.vpdl.vpdl.Rule
import org.atlanmod.emfviews.vpdl.vpdl.SelectFeature
import org.atlanmod.emfviews.vpdl.vpdl.StringLiteral
import org.atlanmod.emfviews.vpdl.vpdl.View
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/*
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VpdlGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val name = viewpointName(resource)

		fsa.generateFile(name + '.eviewpoint', resource.compileEviewpoint(fsa))
		fsa.generateFile(name + '.xmi', resource.compileXmi)
		if (!resource.allRules.empty) {
//      fsa.generateFile(name + '.ecl', resource.compileEcl)
			fsa.generateFile(name + '.json', resource.compileJson)
		}
	}

	def String viewpointName(Resource r) {
		return r.allContents.toIterable().filter(View).<View>head.name
	}

	def Iterable<Metamodel> getListMetamodels(Resource r) {
		return r.allContents.toIterable().filter(Metamodel);
	}

	def Iterable<Rule> getAllRules(Resource r) {
		return r.allContents.toIterable().filter(Rule)
	}

	def Metamodel metamodel(Relation r) {
		return (r.eContainer.eContainer as SelectFeature).metamodel
	}

	def EClass class_(Relation r) {
		return (r.eContainer.eContainer as SelectFeature).class_
	}

	def CharSequence compileEviewpoint(Resource r, IFileSystemAccess2 fsa) '''
		contributingMetamodels=«r.getListMetamodels.map([m | m.name + '::' + m.nsURI]).join(',')»
		weavingModel=«viewpointName(r)».xmi
	'''

	def CharSequence compileEcl(Resource resource) '''
		«FOR r : resource.allRules»
			rule «r.relation.name»
			match s : «r.relation.metamodel.name»!«r.relation.class_.name»
			with  t : «r.relation.metamodelRight.name»!«r.relation.classRight.name»
			{
			  compare
			  {
			    return «r.condition.prettyPrint»;
			  }
			}
		«ENDFOR»
	'''

	def CharSequence compileJson(Resource resource) {
		val result = Maps::<Object, Object>newHashMap
		val subResult = Maps::<Object, Object>newHashMap

		for (r : resource.allRules) {
			val split = (r.condition.prettyPrint as String).splitRuleString;
			subResult.put("ARCHITECTURE", getArchitecture());
			subResult.put("TRAINING_PARAMETERS", getTrainingParams(split.get(1)));

			subResult.put("S", r.relation.class_.name);
			subResult.put("T", r.relation.classRight.name);

			val leftEmbeddings = split.get(0).replace("{", "").replace("}", "")
			val leftEmbeddingsList = leftEmbeddings.split(',').map[trim]
			val leftMap = newHashMap
			leftEmbeddingsList.forEach[
			  
			    val key = it.trim
			    val value = "string"
			    leftMap.put(key, value)
			  
			]
			
			val rightEmbeddings = split.get(2).replace("{", "").replace("}", "");
			val rightEmbeddingsList = rightEmbeddings.split(',').map[trim]
			val rightMap = newHashMap
			rightEmbeddingsList.forEach[
			  
			    val key = it.trim
			    val value = "string"
			    rightMap.put(key, value)
			  
			]
			subResult.put("EMBEDDINGS", leftMap + rightMap);
			
			result.put(r.relation.name, subResult);
		}

		return result.prettyPrintJson;
	}

	def String compileXmi(Resource r) {
		val factory = EmftvmFactory.eINSTANCE
		val rs = new ResourceSetImpl()

		val env = factory.createExecEnv()

		// Load metamodels
		val sourceMM = factory.createMetamodel()
		sourceMM.resource = rs.getResource(URI.createURI("http://www.atlanmod.org/emfviews/vpdl/0.3.0"), true)
		env.registerMetaModel("VPDL", sourceMM)

		val targetMM = factory.createMetamodel()
		targetMM.resource = rs.getResource(URI.createURI("http://www.atlanmod.org/emfviews/virtuallinks/0.3.0"), true)
		env.registerMetaModel("VirtualLinks", targetMM)

		// Load models
		val sourceModel = factory.createModel()
		sourceModel.resource = r
		env.registerInputModel("IN", sourceModel)

		val targetModel = factory.createModel()
		// The URI does not actually matter here, as we save the resource to a String
		targetModel.resource = rs.createResource(URI.createFileURI("foo.xmi"))
		env.registerOutputModel("OUT", targetModel)

		// Run the transformation
		val mr = new DefaultModuleResolver("platform:/plugin/org.atlanmod.emfviews.vpdl/transformation/",
			new ResourceSetImpl())

		env.loadModule(mr, "VPDL2VirtualLinks")
		env.run(null)

		// Write to a String and return
		val out = new ByteArrayOutputStream()
		targetModel.resource.save(out, null)

		out.toString
	}

	// Pretty printer for boolean expressions of the WHERE clause
	def CharSequence prettyPrint(BoolExpr expr) {
		if (expr instanceof Constant)
			return expr.prettyPrint();
		if (expr instanceof Comparison)
			return expr.prettyPrint();
		if (expr instanceof Nav)
			return expr.prettyPrint();
		throw new IllegalArgumentException();
	}

	def CharSequence prettyPrint(Constant c) {
		if (c instanceof IntLiteral)
			return c.value.toString();
		if (c instanceof BoolLiteral)
			return c.value.toString();
		if (c instanceof StringLiteral)
			return c.value;
	}

	def CharSequence prettyPrint(Comparison c) '''«c.left.prettyPrint» «c.op.prettyPrint» «c.right.prettyPrint»'''

	def CharSequence prettyPrint(BoolOp op) {
		return switch (op) {
			case BoolOp.EQ: '='
			case BoolOp.NEQ: '<>'
			case BoolOp.LT: '<'
			case BoolOp.LTEQ: '<='
			case BoolOp.GT: '>'
			case BoolOp.GTEQ: '>='
			case BoolOp.AND: 'and'
			case BoolOp.OR: 'or'
		}
	}

	def CharSequence prettyPrint(Nav n) '''«n.start»«FOR b : n.body».«b.prettyPrint»«ENDFOR»'''

	def CharSequence prettyPrint(NavRest r) {
		if (r instanceof NavFeature)
			return r.prettyPrint();
		if (r instanceof MethodCall)
			return r.prettyPrint();
	}

	def CharSequence prettyPrint(NavFeature f) {
		f.name
	}

	def CharSequence prettyPrint(MethodCall m) '''«m.method»(«FOR a : m.args»«a.prettyPrint»«ENDFOR»)'''

	def CharSequence prettyPrint(MethodArg a) {
		if (a instanceof BoolExpr)
			return a.prettyPrint
		if (a instanceof Lambda)
			return a.prettyPrint
	}

	def CharSequence prettyPrint(Lambda l) '''«l.arg» | «l.body.prettyPrint»'''

	def String prettyPrintJson(Map<Object, Object> map) {
		var value = ""

		val mapAsString = new StringBuilder("{");

		for (Map.Entry<Object, Object> entry : map.entrySet()) {
			val key = entry.getKey().toString();
			val valueObj = entry.getValue();
			if (valueObj instanceof Map) {
				value = valueObj.prettyPrintJson;
				mapAsString.append("\"").append(key).append("\":").append(value).append(",");
			} else {
				value = valueObj.toString;
				mapAsString.append("\"").append(key).append("\":\"").append(value).append("\",");
			}

		}

		mapAsString.deleteCharAt(mapAsString.length() - 1);
		mapAsString.append("}");

		return mapAsString.toString;
	}

	def String[] splitRuleString(String input) {
		// pattern to get everything between <~X~> where X is the name of a relation
		val pattern = Pattern.compile("\\{(.*?)\\}<~(.*?)~>(\\{(.*?)\\})");
		val matcher = pattern.matcher(input);

		if (matcher.find()) {
			val leftSet = matcher.group(1);
			val relation = matcher.group(2);
			val rightSet = matcher.group(4);

			return #[leftSet, relation, rightSet]
		}

		return #[];
	}

	def getArchitecture() {
		val arch = Maps::<Object, Object>newHashMap;

		arch.put("OPERATOR", "SAGEConv");
		arch.put("CONVOLUTIONS", 2);
		arch.put("ACTIVATION", "relu");
		arch.put("HIDDEN_CHANNELS", 64);
		arch.put("CLASSIFIER", "dot_product");

		return arch;
	}

	def getTrainingParams(String linkName) {
		val params = Maps::<Object, Object>newHashMap;

		params.put("EPOCHS", 2);
		params.put("LEARNING_RATE", 0.001);
		params.put("ADD_NEGATIVE_TRAINING", false);
		params.put("NEG_SAMPLING_RATIO", 2.0);
		params.put("TRAINING_SPLIT", 0.1);
		params.put("VALIDATION_SPLIT", 0.1);
		params.put("SOURCE_MODEL_PATH", "");
		params.put("TARGET_MODEL_PATH", "");
		params.put("LINK_PATH", linkName);

		return params;
	}
}
