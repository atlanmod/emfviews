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
