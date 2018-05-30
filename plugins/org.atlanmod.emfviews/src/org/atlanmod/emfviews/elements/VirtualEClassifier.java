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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;

public abstract class VirtualEClassifier extends DynamicEObjectImpl
    implements EClassifier, BasicExtendedMetaData.EClassifierExtendedMetaData.Holder {

  protected EClassifier concreteClassifier;
  protected EcoreVirtualizer virtualizer;

  protected VirtualEClassifier(EClass eClass, EClassifier concreteClassifier, EcoreVirtualizer virtualizer) {
    super(eClass);
    this.concreteClassifier = concreteClassifier;
    this.virtualizer = virtualizer;
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

  // @Correctness: these may need to go in a BaseVirtualEObject to avoid
  // duplication and for all implementing classes to benefit
  @Override
  public EObject eContainer() {
    return virtualizer.getVirtual((EPackage) concreteClassifier.eContainer());
  }

  @Override
  public EReference eContainmentFeature() {
    // We do not want to virtualize this, as the feature is part of the
    // Ecore metamodel, and not of a viewpoint.
    return concreteClassifier.eContainmentFeature();
  }

  @Override
  public String getName() {
    return concreteClassifier.getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concreteClassifier.getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    return concreteClassifier.getEAnnotation(source);
  }

  @Override
  public EList<ETypeParameter> getETypeParameters() {
    return concreteClassifier.getETypeParameters();
  }

  @Override
  public Object getDefaultValue() {
    return concreteClassifier.getDefaultValue();
  }

  @Override
  public EPackage getEPackage() {
    return virtualizer.getVirtual(concreteClassifier.getEPackage());
  }


  @Override
  public Class<?> getInstanceClass() {
    return concreteClassifier.getInstanceClass();
  }

  @Override
  public void setInstanceClass(Class<?> value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceClassName() {
    return concreteClassifier.getInstanceClassName();
  }

  @Override
  public void setInstanceClassName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceTypeName() {
    return concreteClassifier.getInstanceTypeName();
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
    return ((BasicExtendedMetaData.EClassifierExtendedMetaData.Holder) concreteClassifier).getExtendedMetaData();
  }

  @Override
  public void setExtendedMetaData(EClassifierExtendedMetaData eClassifierExtendedMetaData) {
    throw new UnsupportedOperationException();
  }

}
