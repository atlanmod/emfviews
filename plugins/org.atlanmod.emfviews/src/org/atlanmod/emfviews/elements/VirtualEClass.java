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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.atlanmod.emfviews.core.EcoreVirtualizer;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.ESuperAdapter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreEList;

public class VirtualEClass extends VirtualEClassifier implements EClass, ESuperAdapter.Holder, EClassifierExtendedMetaData.Holder {

  private List<VirtualEStructuralFeature> virtualFeatures = new ArrayList<>();
  private Set<EStructuralFeature> filteredFeatures = new HashSet<>();
  private List<EClass> virtualSuperTypes = new ArrayList<>();

  public VirtualEClass(EClass concreteEClass, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.ECLASS, concreteEClass, virtualizer);
  }

  public void addVirtualFeature(VirtualEStructuralFeature f) {
    virtualFeatures.add(f);
  }

  public int getVirtualFeaturesSize() {
    return virtualFeatures.size();
  }

  public void addVirtualSuperType(EClass c) {
    if (!virtualSuperTypes.contains(c)) {
      virtualSuperTypes.add(c);
    }
  }

  public boolean isFeatureVirtual(EStructuralFeature f) {
    return virtualFeatures.contains(virtualizer.getVirtual(f));
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.ECLASS__ABSTRACT) {
      return isAbstract();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_ATTRIBUTES) {
      return getEAllAttributes();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_CONTAINMENTS) {
      return getEAllContainments();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_GENERIC_SUPER_TYPES) {
      return getEAllGenericSuperTypes();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_OPERATIONS) {
      return getEAllOperations();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_REFERENCES) {
      return getEAllReferences();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_STRUCTURAL_FEATURES) {
      return getEAllStructuralFeatures();
    }
    if (feature == EcorePackage.Literals.ECLASS__EALL_SUPER_TYPES) {
      return getEAllSuperTypes();
    }
    if (feature == EcorePackage.Literals.ECLASS__EATTRIBUTES) {
      return getEAttributes();
    }
    if (feature == EcorePackage.Literals.ECLASS__EGENERIC_SUPER_TYPES) {
      return getEGenericSuperTypes();
    }
    if (feature == EcorePackage.Literals.ECLASS__EID_ATTRIBUTE) {
      return getEIDAttribute();
    }
    if (feature == EcorePackage.Literals.ECLASS__EOPERATIONS) {
      return getEOperations();
    }
    if (feature == EcorePackage.Literals.ECLASS__EREFERENCES) {
      return getEReferences();
    }
    if (feature == EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES) {
      return getEStructuralFeatures();
    }
    if (feature == EcorePackage.Literals.ECLASS__ESUPER_TYPES) {
      return getESuperTypes();
    }
    if (feature == EcorePackage.Literals.ECLASS__INTERFACE) {
      return isInterface();
    }

    return super.dynamicGet(dynamicFeatureID);
  }

  public void filterFeature(EStructuralFeature f) {
    filteredFeatures.add(f);
  }

  public void unfilterFeature(EStructuralFeature f) {
    filteredFeatures.remove(f);
  }

  public boolean isFeatureFiltered(EStructuralFeature f) {
    return filteredFeatures.contains(f);
  }

  @Override
  public EObject eContainer() {
    return virtualizer.getVirtual((EPackage) concreteClassifier.eContainer());
  }

  @Override
  public EReference eContainmentFeature() {
    return virtualizer.getVirtual(concreteClassifier.eContainmentFeature());
  }

  @Override
  public boolean isAbstract() {
    return ((EClass) concreteClassifier).isAbstract();
  }

  @Override
  public void setAbstract(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInterface() {
    return ((EClass) concreteClassifier).isInterface();
  }

  @Override
  public void setInterface(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EClass> getESuperTypes() {
    // This is just a map(getVirtual).filter(!filtered)
    List<EClass> types = new ArrayList<>();

    // @Assumption: this class and its super types are part of the same package,
    // so we can query it only once.
    VirtualEPackage vpackage = (VirtualEPackage) getEPackage();

    for (EClass c : ((EClass) concreteClassifier).getESuperTypes()) {
      EClass vc = virtualizer.getVirtual(c);
      if (!vpackage.isClassifierFiltered(vc)) {
        types.add(vc);
      }
    }

    for (EClass c : virtualSuperTypes) {
      EClass vc = virtualizer.getVirtual(c);
      if (!vpackage.isClassifierFiltered(vc)) {
        types.add(vc);
      }
    }

    return ECollections.unmodifiableEList(types);
  }

  @Override
  public EList<EClass> getEAllSuperTypes() {
    // Use a set to ensure no duplicate super types.
    // LinkedHashSet preserves the insertion order for stability.
    Set<EClass> sups = new LinkedHashSet<>();

    for (EClass sup : getESuperTypes()) {
      sups.addAll(sup.getEAllSuperTypes());
    }

    sups.addAll(getESuperTypes());

    return ECollections.unmodifiableEList(new ArrayList<>(sups));
  }

  @Override
  public EAttribute getEIDAttribute() {
    return virtualizer.getVirtual(((EClass) concreteClassifier).getEIDAttribute());
  }

  protected List<EStructuralFeature> getAllFeatures() {
    // Use a set to ensure features are not added twice.
    // LinkedHashSet preserves the insertion order for stability.
    Set<EStructuralFeature> elems = new LinkedHashSet<>();

    for (EClass sup : getESuperTypes()) {
      // Add all (filtered and non-filtered) features from supertypes
      elems.addAll(((VirtualEClass) sup).getAllFeatures());
    }

    // Add all features from the concrete class
    for (EStructuralFeature f : ((EClass) concreteClassifier).getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature f : virtualFeatures) {
      elems.add(f);
    }

    return new ArrayList<>(elems);
  }

  protected List<EStructuralFeature> getAllLocalFeatures() {
    List<EStructuralFeature> elems = new ArrayList<>();

    // Add all features from the concrete class
    for (EStructuralFeature f : ((EClass) concreteClassifier).getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature f : virtualFeatures) {
      elems.add(f);
    }

    return elems;
  }

  protected List<EStructuralFeature> getVisibleFeatures() {
    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : getAllFeatures()) {
      if (!isFeatureFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }

  protected List<EStructuralFeature> getVisibleLocalFeatures() {
    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : getAllLocalFeatures()) {
      if (!isFeatureFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }

  @Override
  public EList<EStructuralFeature> getEStructuralFeatures() {
    // The return value must be castable to EStructuralFeature.Setting,
    // hence why we use an EcoreList.UnmodifiableElist
    List<EStructuralFeature> cs = getVisibleLocalFeatures();
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, cs.size(), cs.toArray());
  }

  @Override
  public EList<EGenericType> getEGenericSuperTypes() {
    return ((EClass) concreteClassifier).getEGenericSuperTypes();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    // @Correctness: get them from the supertypes?
    return ECollections.emptyEList();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    List<EAttribute> attrs = new ArrayList<>();

    for (EStructuralFeature f : getEStructuralFeatures()) {
      if (f instanceof EAttribute) {
        attrs.add((EAttribute) f);
      }
    }

    return ECollections.unmodifiableEList(attrs);
  }

  @Override
  public EList<EAttribute> getEAllAttributes() {
    List<EAttribute> attrs = new ArrayList<>();

    for (EStructuralFeature f : getEAllStructuralFeatures()) {
      if (f instanceof EAttribute) {
        attrs.add((EAttribute) f);
      }
    }

    return ECollections.unmodifiableEList(attrs);
  }

  @Override
  public EList<EReference> getEReferences() {
    List<EReference> refs = new ArrayList<>();

    for (EStructuralFeature f : getEStructuralFeatures()) {
      if (f instanceof EReference) {
        refs.add((EReference) f);
      }
    }

    return ECollections.unmodifiableEList(refs);
  }

  @Override
  public EList<EReference> getEAllReferences() {
    List<EReference> references = new ArrayList<>();

    for (EStructuralFeature f : getEAllStructuralFeatures()) {
      if (f instanceof EReference) {
        references.add((EReference) f);
      }
    }

    return ECollections.unmodifiableEList(references);
  }

  @Override
  public EList<EReference> getEAllContainments() {
    List<EReference> containments = new ArrayList<>();

    for (EReference ref : getEAllReferences()) {
      if (ref.isContainment()) {
        containments.add(ref);
      }
    }

    return ECollections.unmodifiableEList(containments);
  }

  @Override
  public EList<EStructuralFeature> getEAllStructuralFeatures() {
    // The return value must be castable to EStructuralFeature.Setting,
    // hence why we use an EcoreList.UnmodifiableElist
    List<EStructuralFeature> cs = getVisibleFeatures();
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, cs.size(), cs.toArray());
  }

  @Override
  public EList<EOperation> getEOperations() {
    return ((EClass) concreteClassifier).getEOperations();
  }

  @Override
  public EList<EOperation> getEAllOperations() {
    // @Correctness: get them from the supertypes?
    return ECollections.emptyEList();
  }

  @Override
  public boolean isSuperTypeOf(EClass someClass) {
    if (someClass instanceof VirtualEClass) {
      VirtualEClass c = (VirtualEClass) someClass;

      return c.concreteClassifier == this.concreteClassifier
          || c.virtualSuperTypes.contains(this)
          || c.getEAllSuperTypes().contains(this);
    } else {
      return ((EClass) concreteClassifier).isSuperTypeOf(someClass);
    }
  }

  @Override
  public int getFeatureCount() {
    return getEStructuralFeatures().size();
  }

  @Override
  public EStructuralFeature getEStructuralFeature(int featureID) {
    EList<EStructuralFeature> features = getEAllStructuralFeatures();
    if (featureID < features.size()) {
      return features.get(featureID);
    } else {
      return null;
    }
  }

  @Override
  public EStructuralFeature getEStructuralFeature(String featureName) {
    for (EStructuralFeature f : getEAllStructuralFeatures()) {
      if (featureName.equals(f.getName())) {
        return f;
      }
    }
    return null;
  }

  @Override
  public int getOperationCount() {
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getEOperation(int operationID) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getOperationID(EOperation operation) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getOverride(EOperation operation) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getFeatureType(EStructuralFeature feature) {
    return ((EClass) concreteClassifier).getFeatureType(feature);
  }

  @Override
  public int getFeatureID(EStructuralFeature feature) {
    return getEAllStructuralFeatures().indexOf(feature);
  }

  @Override
  public ESuperAdapter getESuperAdapter() {
    return ((ESuperAdapter.Holder) concreteClassifier).getESuperAdapter();
  }

  @Override
  public boolean isFrozen() {
    // @Correctness: not sure whether we should delegate this, or just return false
    return ((ESuperAdapter.Holder) concreteClassifier).isFrozen();
  }

  // Not sure what this is useful for, but the Sample ECore editor seems to use it
  protected EClassifierExtendedMetaData eClassifierExtendedMetaData;

  @Override
  public EClassifierExtendedMetaData getExtendedMetaData() {
    return eClassifierExtendedMetaData;
  }

  @Override
  public void setExtendedMetaData(EClassifierExtendedMetaData eClassifierExtendedMetaData) {
    this.eClassifierExtendedMetaData = eClassifierExtendedMetaData;
  }

  @Override
  public boolean isInstance(Object object) {
    if (object instanceof VirtualEObject) {
      return isSuperTypeOf(((VirtualEObject) object).eClass());
    } else {
      return concreteClassifier.isInstance(object);
    }
  }

  @Override
  public int getClassifierID() {
    // @Correctness: not sure what this should return in the presence of filters
    throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("VirtualEClass of ");
    sb.append(concreteClassifier.toString());
    return sb.toString();
  }

  @Override
  public Resource eResource() {
    // @Refactor: this belongs to a BaseVirtualEObject of some kind
    // since this is duplicated in VirtualEObject.
    // @Correctness: this should actually be set as part of the opposite reference
    // of a VirtualEPackage.getContents().add, but in our case we know the virtualizer
    // is the resource.
    if (virtualizer instanceof Resource) {
      return (Resource) virtualizer;
    }
    return null;
  }

}
