package org.atlanmod.emfviews.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

import org.atlanmod.emfviews.core.EcoreVirtualizer;

public class VirtualEGenericType extends DynamicEObjectImpl implements EGenericType {

  private EGenericType concreteType;
  private EcoreVirtualizer virtualizer;

  public VirtualEGenericType(EGenericType concreteType, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.EGENERIC_TYPE);
    this.concreteType = concreteType;
    this.virtualizer = virtualizer;
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
    return concreteType.getEUpperBound();
  }

  @Override
  public void setEUpperBound(EGenericType value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EGenericType> getETypeArguments() {
    return concreteType.getETypeArguments();
  }

  @Override
  public EClassifier getERawType() {
    return concreteType.getERawType();
  }

  @Override
  public EGenericType getELowerBound() {
    return concreteType.getELowerBound();
  }

  @Override
  public void setELowerBound(EGenericType value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ETypeParameter getETypeParameter() {
    return concreteType.getETypeParameter();
  }

  @Override
  public void setETypeParameter(ETypeParameter value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEClassifier() {
    // We don't want to virtualize all classifiers here.  If we virtual raw
    // data types like EString, OCL will get confused.
    // @Correctness: but maybe we want to virtualize types that are part of the
    // package?
    return concreteType.getEClassifier();
  }

  @Override
  public void setEClassifier(EClassifier value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInstance(Object object) {
    throw new UnsupportedOperationException();
  }

}
