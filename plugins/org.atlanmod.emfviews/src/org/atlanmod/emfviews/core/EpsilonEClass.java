package org.atlanmod.emfviews.core;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.resource.Resource;

public class EpsilonEClass implements EClass {

  public static EpsilonEClass INSTANCE = new EpsilonEClass();

  @Override
  public String getInstanceClassName() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceClassName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Class<?> getInstanceClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceClass(Class<?> value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceTypeName() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceTypeName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EPackage getEPackage() {
    return new EPackage() {

      @Override
      public String getName() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
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
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
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
      public Object eInvoke(EOperation operation,
                            EList<?> arguments) throws InvocationTargetException {
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

      @Override
      public String getNsURI() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public void setNsURI(String value) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public String getNsPrefix() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public void setNsPrefix(String value) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public EFactory getEFactoryInstance() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public void setEFactoryInstance(EFactory value) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public EList<EClassifier> getEClassifiers() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public EList<EPackage> getESubpackages() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public EPackage getESuperPackage() {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

      @Override
      public EClassifier getEClassifier(String name) {
        // TODO: Auto-generated method stub
        throw new UnsupportedOperationException();
      }

    };
  }

  @Override
  public EList<ETypeParameter> getETypeParameters() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInstance(Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getClassifierID() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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

  @Override
  public boolean isAbstract() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setAbstract(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInterface() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInterface(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EClass> getESuperTypes() {
    return ECollections.emptyEList();
  }

  @Override
  public EList<EClass> getEAllSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EAttribute getEIDAttribute() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EStructuralFeature> getEStructuralFeatures() {
    return ECollections.emptyEList();
  }

  @Override
  public EList<EGenericType> getEGenericSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAllAttributes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEReferences() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEAllReferences() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEAllContainments() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EStructuralFeature> getEAllStructuralFeatures() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EOperation> getEOperations() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EOperation> getEAllOperations() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isSuperTypeOf(EClass someClass) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getFeatureCount() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EStructuralFeature getEStructuralFeature(int featureID) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EStructuralFeature getEStructuralFeature(String featureName) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getOperationCount() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getEOperation(int operationID) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getOperationID(EOperation operation) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getOverride(EOperation operation) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getFeatureType(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getFeatureID(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

}
