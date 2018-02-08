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

package fr.inria.atlanmod.emfviews.mel.tests

import com.google.inject.Inject
import fr.inria.atlanmod.emfviews.mel.mel.Model
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IFileSystemAccess

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
    Assert.assertEquals('''
      <?xml version="1.0" encoding="ASCII"?>
      <virtualLinks:WeavingModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:virtualLinks="http://inria.fr/virtualLinks" name="extension1">
        <virtualLinks xsi:type="virtualLinks:VirtualConcept" name="X" superConcepts="//@contributingModels.0/@concreteElements.0"/>
        <contributingModels URI="http://www.eclipse.org/uml2/5.0.0/UML">
          <concreteElements xsi:type="virtualLinks:ConcreteConcept"/>
        </contributingModels>
      </virtualLinks:WeavingModel>
      '''.toString, fsa.allFiles.get(weavingPath).toString)
  }
  
}