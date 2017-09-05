package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;

import org.eclipse.emf.common.util.ECollections;
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
      feature = eClass().getEStructuralFeature(dynamicFeatureID);

      if (feature == null) {
        // If not, it's an invalid feature
        throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
      }

      int valueIndex = dynamicFeatureID - concreteEObject.eClass().getFeatureCount();

      // If it's a reference, make sure it's a list
      if (feature.isMany() && virtualValues[valueIndex] == null) {
          virtualValues[valueIndex] = ECollections.asEList(new ArrayList<EObject>());
      }

      return virtualValues[valueIndex];
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
