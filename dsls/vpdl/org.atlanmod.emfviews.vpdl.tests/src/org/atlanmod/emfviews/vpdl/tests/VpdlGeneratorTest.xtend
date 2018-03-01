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

package org.atlanmod.emfviews.vpdl.tests

import static org.hamcrest.CoreMatchers.*;

import com.google.inject.Inject
import org.atlanmod.emfviews.vpdl.vpdl.View
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.ByteArrayOutputStream
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory
import org.atlanmod.sexp2emf.Sexp2EMF

@RunWith(XtextRunner)
@InjectWith(VpdlInjectorProvider)
class VpdlGeneratorTest {

  @Inject IGenerator2 underTest
  @Inject ParseHelper<View> parseHelper


  def void expect(String extensionName, CharSequence vpdl, CharSequence viewpointContent,
                  CharSequence expectedModel, CharSequence matchingModel) {
    // @Refactor: similar from MelGeneratorTest, with matchingModel in there

    val model = parseHelper.parse(vpdl)
    Assert.assertThat(model.eResource.errors, is(emptyList))

    val fsa = new InMemoryFileSystemAccess()
    underTest.doGenerate(model.eResource, fsa, null)
    Assert.assertEquals(3, fsa.allFiles.size)

    val eviewpointPath = IFileSystemAccess::DEFAULT_OUTPUT + extensionName + ".eviewpoint"
    Assert.assertTrue(fsa.allFiles.containsKey(eviewpointPath))
    Assert.assertEquals(viewpointContent.toString, fsa.allFiles.get(eviewpointPath).toString)

    val weavingPath = IFileSystemAccess::DEFAULT_OUTPUT + extensionName + ".xmi"
    Assert.assertTrue(fsa.allFiles.containsKey(weavingPath))

    val weavingModelXMI = fsa.allFiles.get(weavingPath).toString()
    val r = new ResourceSetImpl().createResource(URI.createURI('no:need'))
    r.load(new URIConverter.ReadableInputStream(weavingModelXMI), emptyMap)

    val expected = Sexp2EMF.build(expectedModel.toString, VirtualLinksFactory.eINSTANCE)
    if (!EcoreUtil.equals(expected.get(0), r.getContents().get(0))) {
      // Write the expected resource to XMI and compare that, so that we can
      // actually understand what is different between the two models.
      // There might be a way to leverage EMF compare here, but at least it's better
      // than getting "AssertionError".
      val out = new ResourceSetImpl().createResource(URI.createURI('no:need'))
      out.contents.add(expected.get(0))
      val expectedXMI = new ByteArrayOutputStream
      out.save(expectedXMI, emptyMap)
      Assert.assertEquals(expectedXMI.toString, weavingModelXMI)
    }

    val matchingPath = IFileSystemAccess::DEFAULT_OUTPUT + extensionName + ".ecl"
    Assert.assertTrue(fsa.allFiles.containsKey(matchingPath))
    Assert.assertEquals(matchingModel.toString, fsa.allFiles.get(matchingPath).toString)
  }

  @Test
  def void minExample() {
    expect("min", '''
      create view min as

      select uml.Class.superClass

      from
        'http://www.eclipse.org/uml2/5.0.0/UML' as uml
    ''',
    '''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML
      weavingModel=min.xmi
    ''',
    '''
    (WeavingModel
      :name 'min' :whitelist true
      :virtualLinks [(Filter :name 'superClass' :target @1)]
      :contributingModels [(ContributingModel :URI 'http://www.eclipse.org/uml2/5.0.0/UML'
                                              :concreteElements [#1(ConcreteElement :path 'Class.superClass')])])
    ''',
    '''
      //alias_uml=http://www.eclipse.org/uml2/5.0.0/UML

    ''')
  }

  @Test
  def void fullExample() {
    expect("full", '''
      create view full as

      select v.ConcreteElement[model, path],
             v.ConcreteConcept join ecore.EClass as eClass,

      from 'http://www.atlanmod.org/emfviews/virtuallinks/0.3.0' as v,
           'http://www.eclipse.org/emf/2002/Ecore' as ecore,

      where 'this is not tested yet' for eClass
    ''',
    '''
      contributingMetamodels=http://www.atlanmod.org/emfviews/virtuallinks/0.3.0,http://www.eclipse.org/emf/2002/Ecore
      weavingModel=full.xmi
    ''',
    '''
    (WeavingModel
      :name 'full' :whitelist true
      :virtualLinks [(Filter :name 'model' :target @1)
                     (Filter :name 'path' :target @2)
                     (VirtualAssociation :name 'eClass' :source @3  :target @4 :upperBound 1)]
      :contributingModels [(ContributingModel :URI 'http://www.atlanmod.org/emfviews/virtuallinks/0.3.0'
                                              :concreteElements [#1(ConcreteElement :path 'ConcreteElement.model')
                                                                 #2(ConcreteElement :path 'ConcreteElement.path')
                                                                 #3(ConcreteConcept :path 'ConcreteConcept')])
                           (ContributingModel :URI 'http://www.eclipse.org/emf/2002/Ecore'
                                              :concreteElements [#4(ConcreteConcept :path 'EClass')])])
    ''',
    '''
    //alias_v=http://www.atlanmod.org/emfviews/virtuallinks/0.3.0
    //alias_ecore=http://www.eclipse.org/emf/2002/Ecore

    rule eClass
    match s : v!ConcreteConcept
    with  t : ecore!EClass
    {
      compare
      {
        return this is not tested yet;
      }
    }
    ''')
  }

  @Test
  def void wildcardSelect() {
    expect("v", '''
      create view v as
      select m.ConcreteElement.*
      from 'http://www.atlanmod.org/emfviews/virtuallinks/0.3.0' as m
    ''',
    '''
      contributingMetamodels=http://www.atlanmod.org/emfviews/virtuallinks/0.3.0
      weavingModel=v.xmi
    ''',
    '''
    (WeavingModel
      :name 'v' :whitelist true
      :virtualLinks [(Filter :name '*' :target @1)]
      :contributingModels [(ContributingModel :URI 'http://www.atlanmod.org/emfviews/virtuallinks/0.3.0'
                                              :concreteElements [#1(ConcreteElement :path 'ConcreteElement.*')])])
    ''',
    '''
      //alias_m=http://www.atlanmod.org/emfviews/virtuallinks/0.3.0

    '''
    )
  }
}
