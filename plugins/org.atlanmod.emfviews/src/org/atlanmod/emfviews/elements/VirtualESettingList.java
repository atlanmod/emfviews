/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.elements;

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
