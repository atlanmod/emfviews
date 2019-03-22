package org.atlanmod.emfviews.core;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EStructuralFeatureExtendedMetaData;

public class EpsilonEStructuralFeature implements EStructuralFeature, EStructuralFeatureExtendedMetaData.Holder {

  String name;

  public EpsilonEStructuralFeature(String name) {
    this.name = name;
  }

  @Override
  public boolean isOrdered() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setOrdered(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnique() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUnique(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getLowerBound() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setLowerBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getUpperBound() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUpperBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isMany() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isRequired() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEType(EClassifier value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getEGenericType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEGenericType(EGenericType value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    return null;
  }

  @Override
  public EClass eClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Resource eResource() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject eContainer() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EStructuralFeature eContainingFeature() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EReference eContainmentFeature() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EObject> eContents() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public TreeIterator<EObject> eAllContents() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean eIsProxy() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EObject> eCrossReferences() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object eGet(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object eGet(EStructuralFeature feature, boolean resolve) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void eSet(EStructuralFeature feature, Object newValue) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean eIsSet(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void eUnset(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<Adapter> eAdapters() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean eDeliver() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void eSetDeliver(boolean deliver) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void eNotify(Notification notification) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  // Not sure what this is useful for, but the Sample ECore editor seems to use it
  protected EStructuralFeatureExtendedMetaData eStructuralFeatureExtendedMetaData;

  @Override
  public EStructuralFeatureExtendedMetaData getExtendedMetaData() {
    return eStructuralFeatureExtendedMetaData;
  }

  @Override
  public void
    setExtendedMetaData(EStructuralFeatureExtendedMetaData eStructuralFeatureExtendedMetaData) {
    this.eStructuralFeatureExtendedMetaData = eStructuralFeatureExtendedMetaData;
  }

  @Override
  public boolean isTransient() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setTransient(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isVolatile() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setVolatile(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isChangeable() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setChangeable(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getDefaultValueLiteral() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDefaultValueLiteral(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDefaultValue(Object value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnsettable() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUnsettable(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isDerived() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDerived(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClass getEContainingClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getFeatureID() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Class<?> getContainerClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }


}
