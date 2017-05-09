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

    emfContentProvider =
        new AdapterFactoryContentProvider(new ReflectiveItemProviderAdapterFactory());
  }

  @Override
  public void dispose() {
    emfContentProvider.dispose();
  }

  @Override
  public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    // TODO Auto-generated method stub

  }

  @Override
  public Object[] getElements(Object inputElement) {
    if (inputElement instanceof Collection<?>) {
      return ((Collection<?>) inputElement).toArray();
    } else {
      return new Object[0];
    }
  }

  @Override
  public Object[] getChildren(Object parentElement) {
    if (parentElement instanceof EPackage) {
      EPackage pack = (EPackage) parentElement;
      return pack.getEClassifiers().toArray();
    } else if (parentElement instanceof EObject) {
      return emfContentProvider.getChildren(parentElement);
    } else {
      return new Object[0];
    }
  }

  @Override
  public Object getParent(Object element) {
    if (element instanceof EPackage) {
      return null;
    } else if (element instanceof EObject) {
      return emfContentProvider.getParent(element);
    } else {
      return null;
    }
  }

  @Override
  public boolean hasChildren(Object element) {
    if (element instanceof EPackage) {
      return getChildren(element).length > 0;
    } else if (element instanceof EObject) {
      return emfContentProvider.hasChildren(element);
    } else {
      return false;
    }
  }

}
