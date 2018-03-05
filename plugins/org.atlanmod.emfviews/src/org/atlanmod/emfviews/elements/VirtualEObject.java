/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.DynamicValueHolder;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEList;

public class VirtualEObject extends DynamicEObjectImpl {

  private EObject concreteEObject;

  // Using a map here as using feature ID as keys for virtual values is unreliable
  // when filters come into play.
  //
  // e.g., class A with feature 'a', 'b', 'c'.  Delete feature 'b', add feature 'd'.
  // With feature ID, the mapping is: 'a': 0, 'c': 1, 'd': 2, so the virtual value associated to 'b'
  // is now associated to 'c'.  With a map we keep track of all structural features, filtered or not.
  private Map<EStructuralFeature, Object> virtualValues;

  private Virtualizer virtualizer;

  public VirtualEObject(EObject concreteEObject, VirtualEClass virtualEClass, Virtualizer virtualizer) {
    this.concreteEObject = concreteEObject;
    this.virtualizer = virtualizer;
    eSetClass(virtualEClass);
  }

  protected Map<EStructuralFeature, Object> virtualValues() {
    if (virtualValues == null) {
      virtualValues = new HashMap<>();
    }
    return virtualValues;
  }

  @Override
  public EList<EObject> eContents() {
    // @Optimize: maybe use an iterator?

    List<EObject> contents = new ArrayList<>();

    for (EReference ref : eClass().getEAllContainments()) {
      if (ref.isMany()) {
        @SuppressWarnings("unchecked")
        List<EObject> list = (List<EObject>) eGet(ref);
        if (list != null) {
          for (EObject o : list) {
            contents.add(virtualizer.getVirtual(o));
          }
        }
      } else {
        EObject value = (EObject) eGet(ref);
        if (value != null) {
          contents.add(virtualizer.getVirtual(value));
        }
      }
    }

    // We need an InternalEList here, at least for MoDiSco to work with views.
    // @Correctness: not sure what the owning feature should be, but null seems to work.
    return new EcoreEList.UnmodifiableEList<>(this, null, contents.size(), contents.toArray());
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

    // Lookup the feature by name.  Names are unique, while IDs involve messy
    // calculations that introduce bugs.
    EStructuralFeature concreteFeature = concreteEObject.eClass().getEStructuralFeature(feature.getName());

    // If it's a concrete feature, delegate to the concrete object
    if (concreteFeature != null) {
      // Make sure to virtualize whatever this returns
      // @Refactor: this could be the job of the virtualizer, or at least it could expose
      // a virtualizeList object.
      Object value = concreteEObject.eGet(concreteFeature);
      if (feature.isMany()) {
        @SuppressWarnings("unchecked")
        EList<EObject> list = (EList<EObject>) value;
        return new VirtualEList<>(list, virtualizer);
      } else if (value instanceof EObject) {
        return virtualizer.getVirtual((EObject) value);
      } else {
        return value;
      }
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
    // @Refactor: mostly the same flow as dynamicGet above

    // If it's a concrete feature, delegate to the concrete object
    EStructuralFeature feature = eClass().getEStructuralFeature(dynamicFeatureID);

    if (feature == null) {
      throw new IllegalArgumentException("Invalid feature ID " + dynamicFeatureID);
    }

    EStructuralFeature concreteFeature = concreteEObject.eClass().getEStructuralFeature(feature.getName());
    // If it's a concrete feature, delegate to the concrete object
    if (concreteFeature != null) {
      concreteEObject.eSet(concreteFeature, value);
    } else {
      // If not then it's a virtual feature
      virtualValues().put(feature, value);
    }
  }

  @Override
  protected boolean eDynamicIsSet(int featureID, EStructuralFeature eFeature) {
    // If it's a concrete feature, delegate to the concrete object
    EStructuralFeature feature = eClass().getEStructuralFeature(featureID);

    if (feature == null) {
      throw new IllegalArgumentException("Invalid feature ID " + featureID);
    }

    EStructuralFeature concreteFeature = concreteEObject.eClass().getEStructuralFeature(feature.getName());
    // If it's a concrete feature, delegate to the concrete object
    if (concreteFeature != null) {
      return concreteEObject.eIsSet(concreteFeature);
    } else {
      // If not, then it's a virtual feature.
      // @Correctness: No idea what to return
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }


}
