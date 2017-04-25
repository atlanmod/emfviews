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
package fr.inria.atlanmod.emfviews.ui.wizard.view;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class AttributeSelectionContentProvider implements ITreeContentProvider {

  ResourceSet virtualResourceSet;
  ITreeContentProvider emfContentProvider;

  public AttributeSelectionContentProvider() {

    emfContentProvider = new AdapterFactoryContentProvider(
        new ReflectiveItemProviderAdapterFactory());
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub

  }

  @Override
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    // TODO Auto-generated method stub

  }

  @Override
  public Object[] getElements(Object inputElement) {
    if (inputElement instanceof Collection<?>) {
      return ((Collection<?>) inputElement).toArray();
    }

    return getChildren(inputElement);
  }

  @Override
  public Object[] getChildren(Object parentElement) {
    Object[] result = new Object[0];

    if (parentElement instanceof EPackage) {
      EPackage pack = (EPackage) parentElement;
      return pack.getEClassifiers().toArray();
    } else if (parentElement instanceof EObject) {
      result = emfContentProvider.getChildren(parentElement);
    }

    else if (!hasChildren(parentElement)) {}

    return result;

  }

  @Override
  public Object getParent(Object element) {

    Object parent = null;
    if (element instanceof EObject)
      parent = emfContentProvider.getParent(element);
    return parent;
  }

  @Override
  public boolean hasChildren(Object element) {
    if (element instanceof EObject)
      return true;
    return false;
  }

}
