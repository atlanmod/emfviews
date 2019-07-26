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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;

import org.atlanmod.emfviews.core.EcoreVirtualizer;

public class VirtualEGenericType extends BaseVirtualElement<EGenericType> implements EGenericType {

  public VirtualEGenericType(EGenericType concreteType, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.EGENERIC_TYPE, concreteType, virtualizer);
  }

  @Override
  public EReference eContainmentFeature() {
    // We don't want to serialize this, as it would confuse the Ecore
    // validator which expects literals of the EcorePackage.
    return concrete().eContainmentFeature();
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.EGENERIC_TYPE__ECLASSIFIER) {
      return getEClassifier();
    }
    if (feature == EcorePackage.Literals.EGENERIC_TYPE__ELOWER_BOUND) {
     return getELowerBound();
    }
    if (feature == EcorePackage.Literals.EGENERIC_TYPE__ERAW_TYPE) {
      return getERawType();
    }
    if (feature == EcorePackage.Literals.EGENERIC_TYPE__ETYPE_ARGUMENTS) {
      return getETypeArguments();
    }
    if (feature == EcorePackage.Literals.EGENERIC_TYPE__ETYPE_PARAMETER) {
      return getETypeParameter();
    }
    if (feature == EcorePackage.Literals.EGENERIC_TYPE__EUPPER_BOUND) {
      return getEUpperBound();
    }

    throw new IllegalArgumentException("Unknown feature: " + feature.getName());
  }

  @Override
  public EGenericType getEUpperBound() {
    return concrete().getEUpperBound();
  }

  @Override
  public void setEUpperBound(EGenericType value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EGenericType> getETypeArguments() {
    return concrete().getETypeArguments();
  }

  @Override
  public EClassifier getERawType() {
    return concrete().getERawType();
  }

  @Override
  public EGenericType getELowerBound() {
    return concrete().getELowerBound();
  }

  @Override
  public void setELowerBound(EGenericType value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ETypeParameter getETypeParameter() {
    return concrete().getETypeParameter();
  }

  @Override
  public void setETypeParameter(ETypeParameter value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEClassifier() {
    // We don't want to virtualize all classifiers here.  If we virtualize raw
    // data types like EString, OCL will get confused.
    // @Correctness: maybe we want to virtualize only types that are part of the
    // package?
    return concrete().getEClassifier();
  }

  @Override
  public void setEClassifier(EClassifier value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInstance(Object object) {
    return concrete().isInstance(object);
  }

}
