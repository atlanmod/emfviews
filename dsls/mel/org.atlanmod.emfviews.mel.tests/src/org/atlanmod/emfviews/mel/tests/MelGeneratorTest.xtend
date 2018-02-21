/*******************************************************************************
 * Copyright (c) 2018 Armines
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

package org.atlanmod.emfviews.mel.tests

import com.google.inject.Inject
import org.atlanmod.emfviews.mel.mel.Model
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory
import org.atlanmod.sexp2emf.Sexp2EMF
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

import static org.hamcrest.CoreMatchers.*

@RunWith(XtextRunner)
@InjectWith(MelInjectorProvider)
class MelGeneratorTest {
  @Inject IGenerator2 underTest
  @Inject ParseHelper<Model> parseHelper

  @Test
  def void minExample() {
    val model = parseHelper.parse('''
      import uml from 'http://www.eclipse.org/uml2/5.0.0/UML'

      define extension1 extending uml {
        add class X specializing uml.Class
      }
    ''')
    Assert.assertThat(model.eResource.errors, is(emptyList))

    val fsa = new InMemoryFileSystemAccess()
    underTest.doGenerate(model.eResource, fsa, null)
    Assert.assertEquals(2, fsa.allFiles.size)

    val eviewpointPath = IFileSystemAccess::DEFAULT_OUTPUT + "extension1.eviewpoint"
    Assert.assertTrue(fsa.allFiles.containsKey(eviewpointPath))
    Assert.assertEquals('''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML
      weavingModel=extension1.xmi
      '''.toString, fsa.allFiles.get(eviewpointPath).toString)

    val weavingPath = IFileSystemAccess::DEFAULT_OUTPUT + "extension1.xmi"
    Assert.assertTrue(fsa.allFiles.containsKey(weavingPath))

    val r = new ResourceSetImpl().createResource(URI.createURI('no:need'))
    r.load(new URIConverter.ReadableInputStream(fsa.allFiles.get(weavingPath).toString), emptyMap)

    val expected = Sexp2EMF.build('''
    (WeavingModel
       :name 'extension1'
       :virtualLinks [(VirtualConcept :name 'X' :superConcepts [@1])]
       :contributingModels [(ContributingModel
                               :URI 'http://www.eclipse.org/uml2/5.0.0/UML'
                               :concreteElements [#1(ConcreteConcept :path 'Class')])])
    ''', VirtualLinksFactory.eINSTANCE)

    Assert.assertTrue(EcoreUtil.equals(expected.get(0), r.getContents().get(0)));
  }

}
