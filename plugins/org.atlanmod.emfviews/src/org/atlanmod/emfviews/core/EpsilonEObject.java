package org.atlanmod.emfviews.core;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.introspection.IPropertyGetter;

public class EpsilonEObject implements EObject {

  Map<String, List<EObject>> features = new HashMap<>();
  Object obj;
  IPropertyGetter getter;
  EClass eClass;

  public EpsilonEObject(Object epsilonObject, IPropertyGetter getter, EClass eClass) {
    this.obj = epsilonObject;
    this.getter = getter;
    this.eClass = eClass;
  }

  @Override
  public EList<Adapter> eAdapters() {
    return new BasicEList<>();
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
  public EClass eClass() {
    if (eClass != null) {
      return eClass;
    } else {
      return EpsilonEClass.INSTANCE;
    }
  }

  @Override
  public Resource eResource() {
    return null;
  }

  @Override
  public EObject eContainer() {
    return null;
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
    return ECollections.emptyEList();
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
    try {
      return getter.invoke(obj, feature.getName());
    } catch (EolRuntimeException e) {
      return null;
    }
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


}
