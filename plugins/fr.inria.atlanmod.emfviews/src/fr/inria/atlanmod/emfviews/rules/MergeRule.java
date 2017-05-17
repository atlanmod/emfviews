/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cau� Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.core.ViewOperationException;
import fr.inria.atlanmod.emfviews.elements.MergeElementImpl;

// FIXME: unused?  These are never created anywhere, and not part of the VirtualLinks metamodel.
public class MergeRule extends TranslationRule {

  public static TranslationRule INSTANCE = new MergeRule();

  @Override
  public Object get(InternalEObject object, EStructuralFeature feature, int index) {

    return null;
  }

  @Override
  public Object set(InternalEObject object, EStructuralFeature feature, int index, Object value) {

    return null;
  }

  @Override
  public boolean isSet(InternalEObject object, EStructuralFeature feature) {

    return false;
  }

  @Override
  public void unset(InternalEObject object, EStructuralFeature feature) {

  }

  @Override
  public int hashCode(InternalEObject object, EStructuralFeature feature) {

    throw new ViewOperationException("hashCode not implemented for merged elements");
  }

  @Override
  public InternalEObject getContainer(InternalEObject object) {
    View vModel = (View) object.eResource();
    MergeElementImpl mergeElement = (MergeElementImpl) object;
    EObject cElement = mergeElement.getPreferableElement();
    EObject cContainer = cElement.eContainer();
    EObject vContainer = vModel.translateToVirtualElement(cContainer);
    return (InternalEObject) vContainer;
  }

  @Override
  public EStructuralFeature getContainingFeature(InternalEObject object) {
    View vModel = (View) object.eResource();
    MergeElementImpl mergeElement = (MergeElementImpl) object;
    EObject cElement = mergeElement.getPreferableElement();
    EStructuralFeature vFeature = vModel.getMetamodelManager()
        .translateToVirtualFeature(object, cElement.eContainingFeature());
    return vFeature;
  }

  @Override
  public EObject create(EClass eClass) {
    throw new ViewOperationException("EStore.move()");
  }

}
