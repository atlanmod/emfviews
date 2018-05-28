/*******************************************************************************
 * Copyright (c) 2018 Armines
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

import org.atlanmod.emfviews.core.EcoreVirtualizer;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class VirtualEDataType extends VirtualEClassifier implements EDataType {

  public VirtualEDataType(EDataType concreteDataType, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.EDATA_TYPE, concreteDataType, virtualizer);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.EDATA_TYPE__SERIALIZABLE) {
      return isSerializable();
    }

    return super.dynamicGet(dynamicFeatureID);
  }

  @Override
  public boolean isSerializable() {
    return ((EDataType) concreteClassifier).isSerializable();
  }

  @Override
  public void setSerializable(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInstance(Object object) {
    if (object instanceof EObject) {
      return ((EObject) object).eClass() == this;
    } else {
      // @Correctness: not sure this is all the cases we need to care about
      return false;
    }
  }

  @Override
  public int getClassifierID() {
    throw new UnsupportedOperationException();
  }

}
