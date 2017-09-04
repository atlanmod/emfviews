package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEObject extends DynamicEObjectImpl {

  private EObject concreteEObject;
  private Object[] virtualValues; // XXX: maybe use eSettings from the parent DynamicEObject?

  public VirtualEObject(EObject concreteEObject, VirtualEClass virtualEClass) {
    this.concreteEObject = concreteEObject;
    eSetClass(virtualEClass);
    virtualValues = new Object[virtualEClass.getVirtualFeaturesSize()];
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    // If it's a concrete feature, delegate to the concrete object
    EStructuralFeature feature = concreteEObject.eClass().getEStructuralFeature(dynamicFeatureID);
    if (feature != null) {
      return concreteEObject.eGet(feature);
    } else {
      // If not, maybe it's a virtual feature?
      int featureID = dynamicFeatureID - concreteEObject.eClass().getFeatureCount();
      if (featureID >= 0 && featureID < virtualValues.length) {
        return virtualValues[featureID];
      } else {
        // If not, it's an invalid feature
        throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
      }
    }
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    // If it's a concrete feature, delegate to the concrete object
    EStructuralFeature feature = concreteEObject.eClass().getEStructuralFeature(dynamicFeatureID);
    if (feature != null) {
      concreteEObject.eSet(feature, value);
    } else {
      // If not, maybe it's a virtual feature?
      int featureID = dynamicFeatureID - concreteEObject.eClass().getFeatureCount();
      if (featureID >= 0 && featureID < virtualValues.length) {
        virtualValues[featureID] = value;
      } else {
        // If not, it's an invalid feature
        throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
      }
    }
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }


}
