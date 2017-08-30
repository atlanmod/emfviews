package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEObject extends DynamicEObjectImpl {

  private EObject concreteEObject;

  public VirtualEObject(EObject concreteEObject, EClass virtualEClass) {
    this.concreteEObject = concreteEObject;
    eSetClass(virtualEClass);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    return concreteEObject.eGet(eDynamicFeature(dynamicFeatureID));
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }


}
