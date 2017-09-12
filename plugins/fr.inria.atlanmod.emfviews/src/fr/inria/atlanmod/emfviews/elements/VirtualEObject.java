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

  // Using a map here so we don't have to compute the feature ID.
  // @Optimize: However, an array of feature values (like eSettings on the parent class) would
  // probably take less memory.
  //
  // The main hassle with an array is that if we add a feature, we might need to realloc it.
  // (Using an ArrayList might be equivalent)
  //
  // @Correctness: holding features as keys does not have the semantics as using ID.
  // e.g., class A with feature 'a', 'b', 'c'.  Delete feature 'b', add feature 'd'.
  // Now the ID mapping is: 'a': 0, 'c': 1, 'd': 2, so the virtual value associated to 'b' is
  // now associated to 'c'.  With a map, that does not happen.
  private Map<EStructuralFeature, Object> virtualValues;

  public VirtualEObject(EObject concreteEObject, VirtualEClass virtualEClass) {
    this.concreteEObject = concreteEObject;
    eSetClass(virtualEClass);
  }

  protected Map<EStructuralFeature, Object> virtualValues() {
    if (virtualValues == null) {
      // @Optimize: maybe a weak hashmap since we don't need to hold onto pairs
      // if the key would be garbage collected?
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
