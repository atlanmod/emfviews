/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Juan David Villa Calle - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.ui.linkingviewprordelegate;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import fr.inria.atlanmod.emfviews.ui.linkingview.view.IEditorDelegate;

public class ProrDelegate implements IEditorDelegate {

	@Override
	public EObject getSelectedElement() {
		EObject selectedEobject=null;
		IEditorPart activeEditor=PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(activeEditor instanceof SpecificationEditor)
		{
			SpecificationEditor specificationEditor=(SpecificationEditor)activeEditor;
			ISelection currentSelection=specificationEditor.getSelection();
			if(!currentSelection.isEmpty())
			{currentSelection.getClass();
				if(currentSelection instanceof StructuredSelection)
				{                 
					SpecObject selectedElement=null;
					StructuredSelection structuredSelection=(StructuredSelection)currentSelection;
					Object selectedElementTemp = structuredSelection.getFirstElement();
					if(selectedElementTemp instanceof SpecHierarchyImpl)
					{
						SpecHierarchyImpl specHierarchy=(SpecHierarchyImpl)selectedElementTemp;
						selectedElement=specHierarchy.getObject();
						selectedEobject= (EObject)selectedElement;
					}	
				}
			}	
		}
		return selectedEobject;
		
		
	}

}
