/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
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
 
package fr.inria.atlanmod.emfviews.vpdl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.inria.atlanmod.emfviews.vpdl.vpdl.Metamodel
import fr.inria.atlanmod.emfviews.vpdl.vpdl.View
import fr.inria.atlanmod.emfviews.vpdl.vpdl.SelectFeature
import org.eclipse.m2m.atl.emftvm.EmftvmFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.m2m.atl.emftvm.util.DefaultModuleResolver
import org.eclipse.m2m.atl.emftvm.util.TimingData
import java.io.ByteArrayOutputStream
import fr.inria.atlanmod.emfviews.vpdl.vpdl.Rule
import fr.inria.atlanmod.emfviews.vpdl.vpdl.Relation
import org.eclipse.emf.ecore.EClass

/*
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VpdlGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val name = viewpointName(resource)
	  
    fsa.generateFile(name + '.eviewpoint', resource.compileEviewpoint(fsa))
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
    contributingMetamodels=«r.getListMetamodels.map([m | m.nsURI]).join(',')»
    weavingModel=«viewpointName(r)».xmi
    matchingModel=«viewpointName(r)».ecl
  ''' 
  
  def CharSequence compileEcl(Resource resource) '''
    «FOR m : resource.listMetamodels»
    //alias_«m.name»=«m.nsURI»
    «ENDFOR»
    
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
    var factory = EmftvmFactory.eINSTANCE
    var rs = new ResourceSetImpl()
    
    var env = factory.createExecEnv();
    
    // Load metamodels
    var sourceMM = factory.createMetamodel()
    sourceMM.resource = rs.getResource(URI.createURI("http://www.inria.fr/atlanmod/emfviews/vpdl"), true)
    env.registerMetaModel("VPDL", sourceMM)
    
    var targetMM = factory.createMetamodel()
    targetMM.resource = rs.getResource(URI.createURI("http://inria.fr/virtualLinks"), true)
    env.registerMetaModel("VirtualLinks", targetMM)
    
    // Load models
    var sourceModel = factory.createModel()
    sourceModel.resource = r
    env.registerInputModel("IN", sourceModel)
    
    var targetModel = factory.createModel()
    // The URI does not actually matter here, as we save the resource to a String
    targetModel.resource = rs.createResource(URI.createFileURI(viewpointName(r) + ".xmi"))    
    env.registerOutputModel("OUT", targetModel)
    
    // Run the transformation
    var mr = new DefaultModuleResolver("platform:/plugin/fr.inria.atlanmod.emfviews.vpdl/transformation/",
      new ResourceSetImpl())
    
    var timing = new TimingData()
    env.loadModule(mr, "VPDL2VirtualLinks")
    timing.finishLoading    
    env.run(timing)
    timing.finish
    
    // Write to a String and return
    var out = new ByteArrayOutputStream()
    targetModel.resource.save(out, null)
    
    return new String(out.toByteArray())
  }
   
}
