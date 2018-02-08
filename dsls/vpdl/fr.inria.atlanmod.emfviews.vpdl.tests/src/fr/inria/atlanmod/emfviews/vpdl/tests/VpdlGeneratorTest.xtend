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

package fr.inria.atlanmod.emfviews.vpdl.tests

import com.google.inject.Inject
import fr.inria.atlanmod.emfviews.vpdl.vpdl.View
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
@InjectWith(VpdlInjectorProvider)
class VpdlGeneratorTest {
  
  @Inject IGenerator2 underTest
  @Inject ParseHelper<View> parseHelper
 
  @Test
  def void minExample() {
    val view = parseHelper.parse('''
      create view min as 
      
      select uml.Class
      
      from
        'http://www.eclipse.org/uml2/5.0.0/UML' as uml
    ''')
    val fsa = new InMemoryFileSystemAccess()
    underTest.doGenerate(view.eResource, fsa, null)
    Assert.assertEquals(3, fsa.allFiles.size)
    
    val eviewpointPath = IFileSystemAccess::DEFAULT_OUTPUT + "min.eviewpoint"
    Assert.assertTrue(fsa.allFiles.containsKey(eviewpointPath))
    Assert.assertEquals('''
      contributingMetamodels=http://www.eclipse.org/uml2/5.0.0/UML
      weavingModel=min.xmi
      matchingModel=min.ecl
      '''.toString, fsa.allFiles.get(eviewpointPath).toString)
      
    val weavingPath = IFileSystemAccess::DEFAULT_OUTPUT + "min.xmi"
    Assert.assertTrue(fsa.allFiles.containsKey(weavingPath))
    Assert.assertEquals('''
      <?xml version="1.0" encoding="ASCII"?>
      <virtualLinks:WeavingModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:virtualLinks="http://inria.fr/virtualLinks" name="min" whitelist="true">
        <contributingModels URI="http://www.eclipse.org/uml2/5.0.0/UML"/>
      </virtualLinks:WeavingModel>
      '''.toString, fsa.allFiles.get(weavingPath).toString)
      
    val matchingPath = IFileSystemAccess::DEFAULT_OUTPUT + "min.ecl"
    Assert.assertTrue(fsa.allFiles.containsKey(matchingPath))
    Assert.assertEquals('''
      //alias_uml=http://www.eclipse.org/uml2/5.0.0/UML
      
    '''.toString, fsa.allFiles.get(matchingPath).toString)
  } 
}