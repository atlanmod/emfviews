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
import java.io.ByteArrayOutputStream

@RunWith(XtextRunner)
@InjectWith(MelInjectorProvider)
class MelGeneratorTest {
  @Inject IGenerator2 underTest
  @Inject ParseHelper<Model> parseHelper
  
  def void expect(String extensionName, CharSequence vpdl, CharSequence viewpointContent, CharSequence expectedModel) {
    val model = parseHelper.parse(vpdl)
    Assert.assertThat(model.eResource.errors, is(emptyList))
    
    val fsa = new InMemoryFileSystemAccess()
    underTest.doGenerate(model.eResource, fsa, null)
    Assert.assertEquals(2, fsa.allFiles.size)

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
  }

  @Test
  def void minExample() {
    expect( "extension1",
    '''
      import uml from 'http://www.eclipse.org/uml2/5.0.0/UML'

      define extension1 extending uml {
        add class X specializing uml.Class
      }
    ''',
    '''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML
      weavingModel=extension1.xmi
    ''',
    '''
    (WeavingModel
       :name 'extension1'
       :virtualLinks [(VirtualConcept :name 'X' :superConcepts [@1])]
       :contributingModels [(ContributingModel
                               :URI 'http://www.eclipse.org/uml2/5.0.0/UML'
                               :concreteElements [#1(ConcreteConcept :path 'Class')])])
    ''')
  }
  
  @Test
  def void modifyProperty() {
    expect("extension1",
    '''
    import uml from 'http://www.eclipse.org/uml2/5.0.0/UML' 
              
    define extension1 extending uml, bpmn {    
      modify class uml.Behavior {
        modify property isReentrant {
          type EString  
          cardinality 0
        } 
      }
      
      modify class uml.Activity {
        modify property isReadOnly {
          type EBoolean 
          cardinality 0 
        }
      }
    }
    ''', 
    '''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML
      weavingModel=extension1.xmi
    ''',
    '''
    (WeavingModel
      :name 'extension1'
      :virtualLinks [
        (VirtualProperty :name 'isReentrant' :parent @10 :type 'String' :optional true)
        (Filter :name 'uml.Behavior.isReentrant' :target @11)
        
        (VirtualProperty :name 'isReadOnly' :parent @12 :type 'boolean' :optional true)
        (Filter :name 'uml.Activity.isReadOnly' :target @13)
      ]
      :contributingModels [(ContributingModel
                             :URI 'http://www.eclipse.org/uml2/5.0.0/UML'
                             :concreteElements [#10(ConcreteConcept :path 'Behavior')
                                                #11(ConcreteElement :path 'Behavior.isReentrant')
                                                #12(ConcreteConcept :path 'Activity')
                                                #13(ConcreteElement :path 'Activity.isReadOnly')
                                                ])])
    ''')
  }
  
  @Test
  def void fullExample() {
    expect("extension1",
    '''
    import uml from 'http://www.eclipse.org/uml2/5.0.0/UML' 
    import bpmn from 'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI'
              
    define extension1 extending uml, bpmn {    
      add class X
      add class Y specializing uml.Class, uml.Abstraction
      add class Z supertyping uml.Activity, uml.Action, X 
      add class B specializing Y supertyping Z 
         
      modify class Z { 
        add property foo : EString 0
      }   
     
      modify class uml.Class {
        add property opt : EString 0
        add property nonOpt : EString 1
        add composition refC : Y 0..*
        add association ref : uml.Action 1..*
        add constraint constraint1 "one e1" 
      }
         
      modify class bpmn.Activity { 
        modify association default {
          name defaultRenamed 
          type X 
          cardinality 0..*
          relation-type association
        }
        filter constraint constraint2
      }  
      
      modify class uml.Behavior {
        modify property isReentrant {
          type EString  
          cardinality 0
        } 
      }
      
      modify class uml.Activity {
        modify property isReadOnly {
          type EBoolean 
          cardinality 0 
        }
      }
       
      filter class uml.DataType 
    }
    ''', 
    '''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML,http://www.omg.org/spec/BPMN/20100524/MODEL-XMI
      weavingModel=extension1.xmi
    ''',
    '''
    (WeavingModel
      :name 'extension1'
      :virtualLinks [
      #1(VirtualConcept :name 'X')
      #2(VirtualConcept :name 'Y' :superConcepts [@12 @13])
      #3(VirtualConcept :name 'Z' :subConcepts [@14 @15 @1])        
        (VirtualConcept :name 'B' :superConcepts [@2] :subConcepts [@3])
                
        (VirtualProperty :name 'foo' :parent @3 :type 'String' :optional true)
        
        (VirtualProperty :name 'opt' :parent @12 :type 'String' :optional true)
        (VirtualProperty :name 'nonOpt' :parent @12 :type 'String' :optional false)
        (VirtualAssociation :name 'refC' :source @12 :target @2 :lowerBound 0 :upperBound -1 :composition true)
        (VirtualAssociation :name 'ref' :source @12 :target @15 :lowerBound 1 :upperBound -1)
        
        (Filter :name 'uml.DataType' :target @17)

        (VirtualProperty :name 'isReentrant' :parent @11 :type 'String' :optional true)        
        (Filter :name 'uml.Behavior.isReentrant' :target @10)

        (VirtualProperty :name 'isReadOnly' :parent @14 :type 'boolean' :optional true)  
        (Filter :name 'uml.Activity.isReadOnly' :target @16)
        
        (VirtualAssociation :name 'defaultRenamed' :source @20 :target @1 :lowerBound 0 :upperBound -1)
        (Filter :name 'bpmn.Activity.default' :target @21)
      ]
      :contributingModels [(ContributingModel
                             :URI 'http://www.eclipse.org/uml2/5.0.0/UML'
                             :concreteElements [#11(ConcreteConcept :path 'Behavior')
                                                #10(ConcreteElement :path 'Behavior.isReentrant')
                                                #14(ConcreteConcept :path 'Activity')
                                                #16(ConcreteElement :path 'Activity.isReadOnly')                                                                                                                                                                                                
                                                #12(ConcreteConcept :path 'Class')
                                                #13(ConcreteConcept :path 'Abstraction')
                                                #15(ConcreteConcept :path 'Action')
                                                #17(ConcreteConcept :path 'DataType')                                                                                                
                                                ])
                           (ContributingModel
                             :URI 'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI'
                             :concreteElements [#20(ConcreteConcept :path 'Activity')
                                                #21(ConcreteElement :path 'Activity.default')])])
    ''')
  }

}
