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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class VirtualEAttribute extends VirtualEStructuralFeature implements EAttribute {

  public VirtualEAttribute(EAttribute concreteAttribute, Virtualizer virtualizer) {
    super(EcorePackage.Literals.EATTRIBUTE, concreteAttribute, virtualizer);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.EATTRIBUTE__EATTRIBUTE_TYPE) {
      return getEAttributeType();
    }
    if (feature == EcorePackage.Literals.EATTRIBUTE__ID) {
      return isID();
    }

    return super.dynamicGet(dynamicFeatureID);
  }

  @Override
  public boolean isID() {
    return ((EAttribute) concreteFeature).isID();
  }

  @Override
  public void setID(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EDataType getEAttributeType() {
    return ((EAttribute) concreteFeature).getEAttributeType();
  }

}
