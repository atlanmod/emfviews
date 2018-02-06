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

@RunWith(XtextRunner)
@InjectWith(VpdlInjectorProvider)
class VpdlParsingTest {
	@Inject
	ParseHelper<View> parseHelper
	
	@Test
	def void fullSyntax() {
		val result = parseHelper.parse('''
			create view threeModelComposition as
			 
			select
			    // New relations 
			    togaf.Requirement join reqif.SpecObject as detailedRequirement, 
			    togaf.Process join bpmn.Process as detailedProcess,
			    
			    // Filters
			    togaf.Process.isAutomated,
			    togaf.Requirement[statementOfRequirement, acceptanceCriteria],
			    reqif.SpecObject.type,
			    bpmn.Process[isClosed, isExecutable, processType], 
			           
			    // Need their containers as well if we want to see anything
			    togaf.Element.name,
			    togaf.EnterpriseArchitecture.architectures, 
			    togaf.StrategicArchitecture.strategicElements,
			    togaf.BusinessArchitecture.processes, 
			    
			    reqif.ReqIFContent.specObjects,
			    reqif.ReqIF.coreContent, 
			    reqif.Identifiable[desc, longName], 
			                       
			    bpmn.Definitions[name, rootElements],
			    bpmn.CallableElement.name,  
			       
			from 
			  'http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0' as togaf,
			  'http://www.omg.org/spec/BPMN/20100524/MODEL-XMI' as bpmn,
			  'http://www.omg.org/spec/ReqIF/20110401/reqif.xsd' as reqif,
			   
			where "s.name=t.name and
			       s.isAutomated = false"
			      for detailedProcess 
			      "t.values.exists(v | v.theValue=s.name)"
			      for detailedRequirement       
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
