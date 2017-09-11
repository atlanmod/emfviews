package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEObject extends DynamicEObjectImpl {

  private EObject concreteEObject;
  private Map<EStructuralFeature, Object> virtualValues;

  public VirtualEObject(EObject concreteEObject, VirtualEClass virtualEClass) {
    this.concreteEObject = concreteEObject;
    eSetClass(virtualEClass);
  }

  protected Map<EStructuralFeature, Object> virtualValues() {
    if (virtualValues == null) {
      virtualValues = new HashMap<>();
    }
    return virtualValues;
  }

  @Override
  protected DynamicValueHolder eSettings() {
    // Override to avoid creating the eSettings array we do not use
    // (We do not use the array because it has a static size, as it assumes
    //  the eClass features never change)
    return this;
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    // Get the actual feature from our eClass, since it will take filtered features into account
    EStructuralFeature feature = eClass().getEStructuralFeature(dynamicFeatureID);

    if (feature == null) {
      throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
    }

    // Now get the absolute ID so we can use that to eGet into the concrete EClass
    int absoluteFeatureID = ((VirtualEClass) eClass()).getFeatureAbsoluteID(feature);

    EStructuralFeature concreteFeature = concreteEObject.eClass().getEStructuralFeature(absoluteFeatureID);
    // If it's a concrete feature, delegate to the concrete object
    if (concreteFeature != null) {
      return concreteEObject.eGet(concreteFeature);
    } else {
      // If it's a reference, make sure it's a list
      if (feature.isMany() && virtualValues().get(feature) == null) {
          virtualValues().put(feature, ECollections.asEList(new ArrayList<EObject>()));
      }

      return virtualValues().get(feature);
    }
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    // If it's a concrete feature, delegate to the concrete object
    EStructuralFeature feature = eClass().getEStructuralFeature(dynamicFeatureID);

    if (feature == null) {
      throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
    }

    // Now get the absolute ID so we can use that to eSet into the concrete EClass
    int absoluteFeatureID = ((VirtualEClass) eClass()).getFeatureAbsoluteID(feature);
    EStructuralFeature concreteFeature = concreteEObject.eClass().getEStructuralFeature(absoluteFeatureID);
    // If it's a concrete feature, delegate to the concrete object
    if (concreteFeature != null) {
      concreteEObject.eSet(concreteFeature, value);
    } else {
      // If not then it's a virtual feature
      virtualValues().put(feature, value);
    }
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }


}
