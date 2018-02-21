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

package org.atlanmod.emfviews.mel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.atlanmod.emfviews.mel.mel.Model
import java.io.ByteArrayOutputStream
import org.atlanmod.emfviews.mel.mel.Metamodel
import org.eclipse.m2m.atl.core.emf.EMFInjector
import org.eclipse.m2m.atl.core.emf.EMFModelFactory
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.m2m.atl.core.launch.ILauncher
import java.util.Collections
import java.net.URL
import org.eclipse.m2m.atl.core.emf.EMFExtractor
import java.util.HashMap
import org.eclipse.emf.ecore.xmi.XMLResource

/*
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MelGenerator extends AbstractGenerator {

  def String extensionName(Resource r) {
    r.allContents.toIterable().filter(Model).<Model>head.extensionName
  }

  def Iterable<Metamodel> getAllMetamodels(Resource r) {
    r.allContents.toIterable().filter(Metamodel)
  }

  override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    val name = extensionName(resource)

    fsa.generateFile(name + '.eviewpoint', resource.compileEviewpoint(fsa))
    fsa.generateFile(name + '.xmi', resource.compileXMI)
  }

  def CharSequence compileEviewpoint(Resource r, IFileSystemAccess2 fsa) '''
    contributingMetamodels=«r.getAllMetamodels.map([m | m.nsURI]).join(',')»
    weavingModel=«extensionName(r)».xmi
  '''

  def String compileXMI(Resource r) {
    // @Refactor: lifted from VpdlGenerator

    var injector = new EMFInjector()
    var factory = new EMFModelFactory()

    var ecoreMM = factory.newReferenceModel()
    injector.inject(ecoreMM, "http://www.eclipse.org/emf/2002/Ecore")

    var sourceMM = factory.newReferenceModel()
    injector.inject(sourceMM, "http://www.atlanmod.org/emfviews/mel/0.3.0")

    var targetMM = factory.newReferenceModel()
    injector.inject(targetMM, "http://www.atlanmod.org/emfviews/virtuallinks/0.3.0")

    var sourceModel = factory.newModel(sourceMM)
    injector.inject(sourceModel, r)

    var targetModel = factory.newModel(targetMM)

    var launcher = new EMFVMLauncher();
    launcher.initialize(null)
    launcher.addInModel(ecoreMM, "ECORE", "ECORE")
    launcher.addInModel(sourceModel, "IN", "MEL")
    launcher.addOutModel(targetModel, "OUT", "VirtualLinks")
    launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), Collections.EMPTY_MAP,
      new URL("platform:/plugin/org.atlanmod.emfviews.mel/transformation/MEL2VirtualLinks.asm").openStream)

    var extractor = new EMFExtractor()
    var out = new ByteArrayOutputStream()
    var options = new HashMap()
    options.put(XMLResource.OPTION_ENCODING, "ASCII")
    extractor.extract(targetModel, out, options)

    new String(out.toByteArray())
  }
}
