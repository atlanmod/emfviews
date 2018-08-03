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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.atlanmod.emfviews.core.EcoreVirtualizer;

public class VirtualEDataType<T extends EDataType> extends VirtualEClassifier<T> implements EDataType, EDataType.Internal {

  public VirtualEDataType(T concreteDataType, EcoreVirtualizer virtualizer) {
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
    return concrete().isSerializable();
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
      return concrete().isInstance(object);
    }
  }

  @Override
  public int getClassifierID() {
    throw new UnsupportedOperationException();
  }

  @Override
  public ConversionDelegate getConversionDelegate() {
    // @Correctness: what is a conversion delegate, and do we need to return the
    // one from the concrete classifier?
    // Ecore validator needs this.
    return null;
  }

  @Override
  public void setConversionDelegate(ConversionDelegate conversionDelegate) {
    throw new UnsupportedOperationException();
  }

}
