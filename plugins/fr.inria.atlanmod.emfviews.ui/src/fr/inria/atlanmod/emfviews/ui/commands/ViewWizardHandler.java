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
package fr.inria.atlanmod.emfviews.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;

import fr.inria.atlanmod.emfviews.ui.wizard.view.CreateViewWizard;

public class ViewWizardHandler extends AbstractHandler implements IHandler {

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    IStructuredSelection selection = (IStructuredSelection) PlatformUI.getWorkbench()
        .getActiveWorkbenchWindow().getSelectionService().getSelection();
    IFile virtualMetamodel = (IFile) selection.getFirstElement();
    launchVirtualModelWizard(virtualMetamodel);
    return null;
  }

  public void launchVirtualModelWizard(IFile virtualMetamodel) {
    CreateViewWizard wizard = new CreateViewWizard(virtualMetamodel);
    wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(virtualMetamodel.getParent()));
    WizardDialog dialog =
        new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
    dialog.setMinimumPageSize(686, 100);
    dialog.open();
  }

}
