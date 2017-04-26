package fr.inria.atlanmod.emfviews.ui.linkingview.action;

import java.util.LinkedHashSet;
import java.util.List;

import java.util.Set;

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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.ui.common.EmfViewsUiUtil;
import fr.inria.atlanmod.emfviews.ui.linkingview.view.IEditorDelegate;
import fr.inria.atlanmod.emfviews.ui.linkingview.view.LinksView;
import fr.inria.atlanmod.emfviews.ui.linkingview.view.ModelSelectionDialog;
import fr.inria.atlanmod.emfviews.ui.linkingview.view.ModelToLinkDialog;

public class AddLinkAction extends Action {

  private LinksView linksView;

  private Composite parent;

  public AddLinkAction(LinksView linksView, Composite parent) {
    this.linksView = linksView;
    this.parent = parent;
  }

  @Override
  public void run() {
    if (linksView.viewSelected()) {
      IExtension matchingExtension = EmfViewsUiUtil.getCurrentEditorDelegate();
      if (matchingExtension != null) {
        IConfigurationElement[] matchingConfigElements =
            matchingExtension.getConfigurationElements();

        IEditorDelegate editorDelegate;
        try {
          editorDelegate =
              (IEditorDelegate) matchingConfigElements[0].createExecutableExtension("class");
          EObject selectedElement = editorDelegate.getSelectedElement();
          if (selectedElement != null) {
            Set<String> modelTypes = new LinkedHashSet<String>();
            for (Resource contributingModel : linksView.getCurrentView().getContributingModels()) {
              modelTypes
                  .add(contributingModel.getContents().get(0).eClass().getEPackage().getNsPrefix());
            }
            ModelToLinkDialog modelToLinkDialog =
                new ModelToLinkDialog(parent.getShell(), modelTypes);
            modelToLinkDialog.create();
            int returnCodeT = modelToLinkDialog.open();
            if (returnCodeT == Window.OK) {
              String buttonSelected = modelToLinkDialog.getSelectedButton();
              EView currentView = linksView.getCurrentView();
              List<Resource> viewInputModels = currentView.getContributingModels();
              boolean modelFound = false;
              Resource lookedForResource = null;

              for (int i = 0; i < viewInputModels.size() && !modelFound; i++) {
                Resource resource = viewInputModels.get(i);
                EObject rootElem = resource.getContents().get(0);
                if (rootElem.eClass().getEPackage().getNsURI()
                    .contains(buttonSelected.toLowerCase())
                    || rootElem.eClass().getEPackage().getNsURI().contains(buttonSelected)
                    || rootElem.eClass().getEPackage().getNsURI()
                        .contains(buttonSelected.toUpperCase())) {
                  lookedForResource = resource;
                  modelFound = true;
                }
              }
              if (lookedForResource != null) {
                ModelSelectionDialog modelSelectionDialog =
                    new ModelSelectionDialog(parent.getShell(),
                                             lookedForResource.getContents().get(0), currentView);
                modelSelectionDialog.setSelectedElement(selectedElement);
                modelSelectionDialog.create();

                int returnCode = modelSelectionDialog.open();

                if (returnCode == Window.OK) {
                  MessageDialog.openInformation(parent.getShell(), "Link created",
                                                "A link has been created");
                }
              }
            } else {
              // TODO The user canceled the selection of the link
              // end element
            }
          } else {
            MessageDialog.openInformation(parent.getShell(), "Select element to link",
                                          "You should first select an element to link");
          }
        } catch (CoreException e) {

          e.printStackTrace();
        }

      } else {
        MessageDialog.openInformation(parent.getShell(), "Editor not yet supported by Emf Views",
                                      "Editor not yet supported by Emf Views");

      }
    } else {
      MessageDialog.openInformation(parent.getShell(), "No view selected", "Select a view first");
    }
  }

}
