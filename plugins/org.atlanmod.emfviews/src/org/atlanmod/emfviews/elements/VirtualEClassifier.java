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
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;

import org.atlanmod.emfviews.core.EcoreVirtualizer;

public abstract class VirtualEClassifier<T extends EClassifier> extends BaseVirtualElement<T>
    implements EClassifier, BasicExtendedMetaData.EClassifierExtendedMetaData.Holder {

  protected VirtualEClassifier(EClass eClass, T concreteClassifier, EcoreVirtualizer virtualizer) {
    super(eClass, concreteClassifier, virtualizer);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
      return getName();
    }
    if (feature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
      return getEAnnotations();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__DEFAULT_VALUE) {
      return getDefaultValue();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__EPACKAGE) {
      return getEPackage();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS) {
      return getInstanceClass();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME) {
      return getInstanceClassName();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME) {
      return getInstanceTypeName();
    }

    throw new IllegalArgumentException("Unknown feature: " + feature.getName());
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EReference eContainmentFeature() {
    // We do not want to virtualize this, as the feature is part of the
    // Ecore metamodel, and not of a viewpoint.
    return concrete().eContainmentFeature();
  }

  @Override
  public String getName() {
    return concrete().getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concrete().getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    return concrete().getEAnnotation(source);
  }

  @Override
  public EList<ETypeParameter> getETypeParameters() {
    return concrete().getETypeParameters();
  }

  @Override
  public Object getDefaultValue() {
    return concrete().getDefaultValue();
  }

  @Override
  public EPackage getEPackage() {
    return virtualizer.getVirtual(concrete().getEPackage());
  }


  @Override
  public Class<?> getInstanceClass() {
    return concrete().getInstanceClass();
  }

  @Override
  public void setInstanceClass(Class<?> value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceClassName() {
    return concrete().getInstanceClassName();
  }

  @Override
  public void setInstanceClassName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceTypeName() {
    return concrete().getInstanceTypeName();
  }

  @Override
  public void setInstanceTypeName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public abstract boolean isInstance(Object object);

  @Override
  public abstract int getClassifierID();

  @Override
  public EClassifierExtendedMetaData getExtendedMetaData() {
    return ((BasicExtendedMetaData.EClassifierExtendedMetaData.Holder) concrete()).getExtendedMetaData();
  }

  @Override
  public void setExtendedMetaData(EClassifierExtendedMetaData eClassifierExtendedMetaData) {
    throw new UnsupportedOperationException();
  }

}
