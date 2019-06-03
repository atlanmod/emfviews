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

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.atlanmod.emfviews.vpdl.vpdl.Metamodel
import org.atlanmod.emfviews.vpdl.vpdl.View
import org.atlanmod.emfviews.vpdl.vpdl.SelectFeature
import java.io.ByteArrayOutputStream
import org.atlanmod.emfviews.vpdl.vpdl.Rule
import org.atlanmod.emfviews.vpdl.vpdl.Relation
import org.eclipse.emf.ecore.EClass
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver

/*
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VpdlGenerator extends AbstractGenerator {

  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val name = viewpointName(resource)

    fsa.generateFile(name + '.eviewpoint', resource.compileEviewpoint(fsa))
    // TODO: do not generate ECL if WHERE clause is empty
    fsa.generateFile(name + '.ecl', resource.compileEcl)
    fsa.generateFile(name + '.xmi', resource.compileXmi)
  }

  def String viewpointName(Resource r) {
    return r.allContents.toIterable().filter(View).<View>head.name
  }

  def Iterable<Metamodel> getListMetamodels(Resource r){
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
        return «r.condition»;
      }
    }
    «ENDFOR»
  '''

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

}
