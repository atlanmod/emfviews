/*******************************************************************************
 * Copyright (c) 2017 Armines
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * fmdkdd - initial implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class VirtualESettingList<E extends EObject> extends VirtualEList<E> implements EStructuralFeature.Setting {

  private EObject owner;
  private EStructuralFeature feature;

  public VirtualESettingList(EList<E> concreteList, Virtualizer virtualizer, EObject owner, EStructuralFeature feature) {
    super(concreteList, virtualizer);
    this.owner = owner;
    this.feature = feature;
  }

  @Override
  public EObject getEObject() {
    return owner;
  }

  @Override
  public EStructuralFeature getEStructuralFeature() {
    return feature;
  }

  @Override
  public Object get(boolean resolve) {
    return this;
  }

  @Override
  public void set(Object newValue) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isSet() {
    return !isEmpty();
  }

  @Override
  public void unset() {
    throw new UnsupportedOperationException();
  }



}
