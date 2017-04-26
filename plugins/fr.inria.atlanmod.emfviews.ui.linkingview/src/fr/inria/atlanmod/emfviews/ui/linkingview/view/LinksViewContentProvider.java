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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import fr.inria.atlanmod.emfviews.ui.common.EmfViewsUiUtil;
import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;

public class LinksViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {

  private ITreeContentProvider emfContentProvider;

  private List<Resource> linkedModels;

  public LinksViewContentProvider() {
    emfContentProvider =
        new AdapterFactoryContentProvider(new ReflectiveItemProviderAdapterFactory());
  }

  public void setLinkedModels(List<Resource> linkedModels) {
    this.linkedModels = linkedModels;
  }

  private String getCurrentEObject() {
    String currentElementId = null;
    IExtension matchingExtension = EmfViewsUiUtil.getCurrentEditorDelegate();
    if (matchingExtension != null) {
      IConfigurationElement[] matchingConfigElements = matchingExtension.getConfigurationElements();

      IEditorDelegate editorDelegate;
      try {
        editorDelegate =
            (IEditorDelegate) matchingConfigElements[0].createExecutableExtension("class");
        EObject selectedElement = editorDelegate.getSelectedElement();
        currentElementId = selectedElement.eResource().getURIFragment(selectedElement);
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }

    return currentElementId;

  }

  @Override
  public void dispose() {

  }

  @Override
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {

  }

  @Override
  public Object[] getChildren(Object linksModelElement) {

    String currentSelectObjectId = getCurrentEObject();
    if (currentSelectObjectId != null) {
      if (linksModelElement instanceof VirtualLinks) {
        VirtualLinks virtualLinks = (VirtualLinks) linksModelElement;
        EList<VirtualLink> allLinks = virtualLinks.getVirtualLinks();
        ArrayList<Association> associations = new ArrayList<Association>();
        for (VirtualLink virtualLink : allLinks) {
          if (virtualLink instanceof Association)
            associations.add((Association) virtualLink);
        }
        ArrayList<EObject> linkedElements = new ArrayList<EObject>();
        for (Association association : associations) {

          if (association.getSourceElement().getElementRef()
              .compareToIgnoreCase(currentSelectObjectId) == 0) {
            for (LinkedElement targetEnd : (List<LinkedElement>) association.getTargetElements()) {
              String targetElementRef = targetEnd.getElementRef();
              String targetModelURI = targetEnd.getModelRef();
              if (getReferencedObject(targetElementRef, targetModelURI) != null)
                linkedElements.add(getReferencedObject(targetElementRef, targetModelURI));
            }
          }

        }

        return linkedElements.toArray();
      } else {
        return emfContentProvider.getChildren(linksModelElement);
      }
    } else {
      return new Object[0];
    }

  }

  private EObject getReferencedObject(String elementRef, String packageNsuri) {

    boolean elemFound = false;
    EObject referencedElement = null;
    for (int i = 0; i < linkedModels.size() && !elemFound; i++) {
      Resource r = linkedModels.get(i);
      EObject firstElem = r.getContents().get(0);
      if (firstElem.eClass().getEPackage().getNsURI().compareToIgnoreCase(packageNsuri) == 0
          && !r.getURI().toString().endsWith("profile.uml")) {
        referencedElement = r.getEObject(elementRef);
        elemFound = true;
      }

    }
    return referencedElement;

  }

  @Override
  public Object getParent(Object element) {
    return null;
  }

  @Override
  public boolean hasChildren(Object element) {

    return emfContentProvider.hasChildren(element);
  }

  @Override
  public Object[] getElements(Object inputElement) {
    if (inputElement instanceof Collection<?>) {
      return ((Collection<?>) inputElement).toArray();
    }

    return getChildren(inputElement);
  }

}
