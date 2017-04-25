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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

import fr.inria.atlanmod.emfviews.core.View;

public abstract class TranslationRule implements EStore {

  @SuppressWarnings("unchecked")
  @Override
  public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
    EList<Object> list = (EList<Object>) get(object, feature, NO_INDEX);
    return list.isEmpty();
  }

  @SuppressWarnings("unchecked")
  public int size(InternalEObject object, EStructuralFeature feature) {
    try {
      return ((List<Object>) get(object, feature, NO_INDEX)).size();
    } catch (Exception e) {}
    return 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public boolean contains(InternalEObject object, EStructuralFeature feature,
                          Object value) {
    try {
      EList<Object> ret = (EList<Object>) get(object, feature,
          TranslationRule.NO_INDEX);
      return ret.contains(value);
    } catch (Exception e) {}
    return false;
  }

  @SuppressWarnings("unchecked")
  @Override
  public int indexOf(InternalEObject object, EStructuralFeature feature,
                     Object value) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.indexOf(value);
  }

  @SuppressWarnings("unchecked")
  @Override
  public int lastIndexOf(InternalEObject object, EStructuralFeature feature,
                         Object value) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.lastIndexOf(value);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void add(InternalEObject object, EStructuralFeature feature, int index,
                  Object value) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    ret.add(index,
        ((View) object.eResource()).translateToVirtualElement((EObject) value));
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object remove(InternalEObject object, EStructuralFeature feature,
                       int index) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.remove(index);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object move(InternalEObject object, EStructuralFeature feature,
                     int targetIndex, int sourceIndex) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.move(targetIndex, sourceIndex);
  }

  @SuppressWarnings("unchecked")
  @Override
  public void clear(InternalEObject object, EStructuralFeature feature) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    ret.clear();
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.toArray();
  }

  @SuppressWarnings("unchecked")
  @Override
  public <T> T[] toArray(InternalEObject object, EStructuralFeature feature,
                         T[] array) {
    EList<Object> ret = (EList<Object>) get(object, feature,
        TranslationRule.NO_INDEX);
    return ret.toArray(array);
  }

}
