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

package org.atlanmod.emfviews.vpdl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.atlanmod.emfviews.vpdl.vpdl.Metamodel
import org.atlanmod.emfviews.vpdl.vpdl.View
import org.atlanmod.emfviews.vpdl.vpdl.SelectFeature
import org.eclipse.m2m.atl.core.emf.EMFInjector
import org.eclipse.m2m.atl.core.emf.EMFModelFactory
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.m2m.atl.core.launch.ILauncher
import java.io.ByteArrayOutputStream
import org.atlanmod.emfviews.vpdl.vpdl.Rule
import org.atlanmod.emfviews.vpdl.vpdl.Relation
import org.eclipse.emf.ecore.EClass
import org.eclipse.m2m.atl.core.emf.EMFExtractor
import java.net.URL
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.XMLResource
import java.util.Collections

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
    var injector = new EMFInjector()
    var factory = new EMFModelFactory()

    var ecoreMM = factory.newReferenceModel()
    injector.inject(ecoreMM, "http://www.eclipse.org/emf/2002/Ecore")

    var sourceMM = factory.newReferenceModel()
    injector.inject(sourceMM, "http://www.atlanmod.org/emfviews/vpdl/0.3.0")

    var targetMM = factory.newReferenceModel()
    injector.inject(targetMM, "http://www.atlanmod.org/emfviews/virtuallinks/0.3.0")

    var sourceModel = factory.newModel(sourceMM)
    injector.inject(sourceModel, r)

    var targetModel = factory.newModel(targetMM)

    var launcher = new EMFVMLauncher();
    launcher.initialize(null)
    launcher.addInModel(ecoreMM, "ECORE", "ECORE")
    launcher.addInModel(sourceModel, "IN", "VPDL")
    launcher.addOutModel(targetModel, "OUT", "VirtualLinks")
    launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections.EMPTY_MAP,
      new URL("platform:/plugin/org.atlanmod.emfviews.vpdl/transformation/VPDL2VirtualLinks.asm").openStream)

    var extractor = new EMFExtractor()
    var out = new ByteArrayOutputStream()
    var options = new HashMap()
    options.put(XMLResource.OPTION_ENCODING, "ASCII")
    extractor.extract(targetModel, out, options)

    new String(out.toByteArray())
  }

}
