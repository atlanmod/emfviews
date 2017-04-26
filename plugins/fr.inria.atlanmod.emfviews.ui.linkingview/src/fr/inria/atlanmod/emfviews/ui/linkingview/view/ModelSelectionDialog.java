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
package fr.inria.atlanmod.emfviews.ui.linkingview.view;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.Viewtype;
import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtualLinks.util.VirtualLinksUtil;

public class ModelSelectionDialog extends TitleAreaDialog {

  private CheckboxTreeViewer treeViewer;

  // The model element that is currently selected on an editor
  private EObject selectedElement;

  private EObject modelRoot;

  Composite parent;

  // The views link model element
  private VirtualLinks tempLinksModel;

  private EView currentView;

  public void setSelectedElement(EObject selectedElement) {
    this.selectedElement = selectedElement;

  }

  public ModelSelectionDialog(Shell parentShell, EObject modelRoot, EView currentView) {
    super(parentShell);
    this.modelRoot = modelRoot;
    this.currentView = currentView;
    this.tempLinksModel = currentView.getVirtualLinkManager().getLinks();
  }

  @Override
  public void create() {
    super.create();
    setTitle("Create a link");
    setMessage("You can select several elements", IMessageProvider.INFORMATION);
  }

  public Association getConformantToAssociation(EObject sourceEObject, EObject targetEObject) {
    Association conformantToAssociation = null;
    Viewtype currentViewtype = currentView.getViewtype();
    XMIResourceImpl viewtypeLinks = currentViewtype.getCorrespondenceModelResource();

    if (viewtypeLinks.getContents() != null && viewtypeLinks.getContents().size() > 0) {
      if (viewtypeLinks.getContents().get(0) instanceof VirtualLinks) {
        VirtualLinks vl = (VirtualLinks) (viewtypeLinks.getContents().get(0));
        EList<VirtualLink> virtualLinks = vl.getVirtualLinks();
        ArrayList<Association> associations = new ArrayList<>();
        for (VirtualLink virtualLink : virtualLinks) {
          if (virtualLink instanceof Association)
            associations.add((Association) virtualLink);
        }
        boolean associationFound = false;
        for (int i = 0; i < associations.size() && !associationFound; i++) {
          Association a = associations.get(i);
          EList<LinkedElement> targetElements = a.getTargetElements();
          for (LinkedElement linkedElement : targetElements) {
            // TODO Simplify this conditional
            if (a.getSourceElement().getModelRef()
                .compareToIgnoreCase(sourceEObject.eClass().getEPackage().getNsURI()) == 0
                && a.getSourceElement().getName()
                    .compareToIgnoreCase(sourceEObject.eClass().getName()) == 0
                && linkedElement.getModelRef()
                    .compareToIgnoreCase(targetEObject.eClass().getEPackage().getNsURI()) == 0
                && linkedElement.getName()
                    .compareToIgnoreCase(targetEObject.eClass().getName()) == 0) {
              associationFound = true;
              conformantToAssociation = a;
            }

          }

        }
      }
    }

    return conformantToAssociation;
  }

  @Override
  protected Control createDialogArea(Composite parent) {
    this.parent = parent;
    Composite area = (Composite) super.createDialogArea(parent);
    Composite container = new Composite(area, SWT.NONE);
    container.setLayoutData(new GridData(GridData.FILL_BOTH));
    GridLayout layout = new GridLayout(1, false);
    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    container.setLayout(layout);

    treeViewer = new CheckboxTreeViewer(area, SWT.BORDER);

    Tree tree = treeViewer.getTree();
    tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

    treeViewer
        .setLabelProvider(new AdapterFactoryLabelProvider(new ReflectiveItemProviderAdapterFactory()));

    treeViewer
        .setContentProvider(new AdapterFactoryContentProvider(new ReflectiveItemProviderAdapterFactory()));

    treeViewer.setInput(modelRoot);
    return area;
  }

  @Override
  protected void okPressed() {

    Object[] treeElementsSelected = treeViewer.getCheckedElements();
    if (treeElementsSelected != null && treeElementsSelected.length > 0) {

      ArrayList<Association> newAssociations = new ArrayList<>();
      LinkedElement source = VirtualLinksUtil
          .createLinkedElement("referenceFrom" + selectedElement.eClass().getName() + "ElementFrom"
              + selectedElement.eClass().getEPackage().getNsPrefix() + "Model",
                               selectedElement.eClass().getEPackage().getNsURI(),
                               selectedElement.eResource().getURIFragment(selectedElement), null);
      for (Object treeItem : treeElementsSelected) {
        EObject selectedEobject = (EObject) treeItem;
        // So here is where i need to save the link.
        VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
        VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
        Association vAsso = vLinksFactory.createAssociation();
        // TODO Choose a different name so that they will not all be
        // named the same.
        Association conformantAssociation =
            getConformantToAssociation(selectedElement, selectedEobject);
        if (conformantAssociation != null) {
          vAsso.setName(conformantAssociation.getName());
          // TODO this one is important, because it needs to have the name
          // of an association on the metamodel
          vAsso.setAssociationTypeName(conformantAssociation.getAssociationTypeName());
          LinkedElement target = VirtualLinksUtil
              .createLinkedElement("referenceTo" + selectedEobject.eClass().getName()
                  + "ElementFrom" + selectedEobject.eClass().getEPackage().getNsPrefix() + "Model",
                                   selectedEobject.eClass().getEPackage().getNsURI(),
                                   selectedEobject.eResource().getURIFragment(selectedEobject),
                                   null);

          vAsso.setSourceElement(source);
          vAsso.getTargetElements().add(target);
          newAssociations.add(vAsso);

          tempLinksModel.getLinkedElements().add(source);
          tempLinksModel.getLinkedElements().add(target);
          tempLinksModel.getVirtualLinks().add(vAsso);
        } else {
          MessageDialog
              .openInformation(parent.getShell(), "Link not created",
                               "Link not created: Create first an association of this type at the viewtype level");
          this.setReturnCode(Window.CANCEL);
        }

      }

      try {

        VirtualLinksUtil.persistLinksModel(tempLinksModel, org.eclipse.emf.common.util.URI
            .createURI(tempLinksModel.eResource().getURI().toString()));

      } catch (IOException e) {
        e.printStackTrace();
      }

    }

    super.okPressed();
  }

}
