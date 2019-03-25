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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.impl.ESuperAdapter;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreEList;

import org.atlanmod.emfviews.core.DynamicStructuralFeature;
import org.atlanmod.emfviews.core.EcoreVirtualizer;

// @Note @UnmodifiableElist:
// We want views to be immutable.  When returning lists, we could use
// ECollections.unmodifiableEList.  Unfortunately, EMF expects most lists that
// correspond to features to be castable to EStructuralFeature.Setting.  To comply,
// we use EcoreEList.UnmodifiableEList instead.

public class VirtualEClass extends VirtualEClassifier<EClass>
    implements EClass, ESuperAdapter.Holder, EClassifierExtendedMetaData.Holder {

  // Features that exist only on the virtual class, not the concrete one.
  private List<VirtualEStructuralFeature<?>> virtualFeatures = new ArrayList<>();

  // Supertypes that exist only on the virtual class, not the concrete one.
  private List<EClass> virtualSuperTypes = new ArrayList<>();

  // Features from the concrete class that should not appear on the virtual one.
  private Set<EStructuralFeature> filteredFeatures = new HashSet<>();

  // If true, will always getEStructuralFeature(name) will always return a valid
  // structural feature. Virtual objects that have this VirtualEClass as class
  // will proceed as if the feature exists: eGet and eSet will work.
  public boolean allowDynamicFeatures = false;

  public VirtualEClass(EClass concreteEClass, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.ECLASS, concreteEClass, virtualizer);
  }

  public void addVirtualFeature(VirtualEStructuralFeature<?> f) {
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
  public boolean isAbstract() {
    return concrete().isAbstract();
  }

  @Override
  public void setAbstract(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInterface() {
    return concrete().isInterface();
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

    for (EClass c : concrete().getESuperTypes()) {
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

    // See @UnmodifiableEList
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__ESUPER_TYPES, types.size(), types.toArray());
  }

  @Override
  public EList<EClass> getEAllSuperTypes() {
    // Use a set to ensure no duplicate super types.
    // LinkedHashSet preserves the insertion order for stability.
    Set<EClass> sups = new LinkedHashSet<>();

    // We have to take all concrete supertypes into account, and do the
    // filtering again, otherwise we may miss the case where A <- B <- C
    // and B is filtered.  We want to maintain A <- C.
    EClass c = concrete();
    for (EClass sup : c.getEAllSuperTypes()) {
      EClass vsup = virtualizer.getVirtual(sup);
      VirtualEPackage p = (VirtualEPackage) vsup.getEPackage();
      if (!p.isClassifierFiltered(vsup)) {
        sups.add(vsup);
      }
    }

    // This gets us all the virtual super types as well
    sups.addAll(getESuperTypes());

    // See @UnmodifiableEList.
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EALL_SUPER_TYPES, sups.size(), sups.toArray());
  }

  @Override
  public EAttribute getEIDAttribute() {
    return virtualizer.getVirtual(concrete().getEIDAttribute());
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
    for (EStructuralFeature f : concrete().getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature<?> f : virtualFeatures) {
      elems.add(f);
    }

    return new ArrayList<>(elems);
  }

  protected List<EStructuralFeature> getAllLocalFeatures() {
    List<EStructuralFeature> elems = new ArrayList<>();

    // Add all features from the concrete class
    for (EStructuralFeature f : concrete().getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature<?> f : virtualFeatures) {
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
    List<EStructuralFeature> cs = getVisibleLocalFeatures();
    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, cs.size(), cs.toArray());
  }

  @Override
  public EList<EGenericType> getEGenericSuperTypes() {
    return concrete().getEGenericSuperTypes();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    // @Correctness: get them from the supertypes?
    return getEGenericSuperTypes();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    List<EAttribute> attrs = new ArrayList<>();

    for (EStructuralFeature f : getEStructuralFeatures()) {
      if (f instanceof EAttribute) {
        attrs.add((EAttribute) f);
      }
    }

    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EATTRIBUTES, attrs.size(), attrs.toArray());
  }

  @Override
  public EList<EAttribute> getEAllAttributes() {
    List<EAttribute> attrs = new ArrayList<>();

    for (EStructuralFeature f : getEAllStructuralFeatures()) {
      if (f instanceof EAttribute) {
        attrs.add((EAttribute) f);
      }
    }

    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EALL_ATTRIBUTES, attrs.size(), attrs.toArray());
  }

  @Override
  public EList<EReference> getEReferences() {
    List<EReference> refs = new ArrayList<>();

    for (EStructuralFeature f : getEStructuralFeatures()) {
      if (f instanceof EReference) {
        refs.add((EReference) f);
      }
    }

    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EREFERENCES, refs.size(), refs.toArray());
  }

  @Override
  public EList<EReference> getEAllReferences() {
    List<EReference> refs = new ArrayList<>();

    for (EStructuralFeature f : getEAllStructuralFeatures()) {
      if (f instanceof EReference) {
        refs.add((EReference) f);
      }
    }

    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EALL_REFERENCES, refs.size(), refs.toArray());
  }

  @Override
  public EList<EReference> getEAllContainments() {
    List<EReference> containments = new ArrayList<>();

    for (EReference ref : getEAllReferences()) {
      if (ref.isContainment()) {
        containments.add(ref);
      }
    }

    // See @UnmodifiableElist
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.ECLASS__EALL_CONTAINMENTS, containments.size(), containments.toArray());
  }

  @Override
  public EList<EStructuralFeature> getEAllStructuralFeatures() {
    List<EStructuralFeature> cs = getVisibleFeatures();
    // ECrossReferenceList expects this method to be castable to EClassImpl.FeatureSubsetSupplier.
    return new FeatureSupplierList<>(
        this, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, cs.size(), cs.toArray());
  }

  class FeatureSupplierList<E> extends EcoreEList.UnmodifiableEList<E> implements EClassImpl.FeatureSubsetSupplier {
    private static final long serialVersionUID = 1L;

    public FeatureSupplierList(InternalEObject owner, EStructuralFeature eStructuralFeature,
                               int size, Object[] data) {
      super(owner, eStructuralFeature, size, data);
    }

    @Override
    public EStructuralFeature[] containments() {
      return getEAllContainments().toArray(new EStructuralFeature[0]);
    }

    @Override
    public EStructuralFeature[] crossReferences() {
      // @Correctness: blatantly incorrect, but this quells down an exception for
      // the Sample Ecore Editor
      return new EStructuralFeature[] {};
    }

    @Override
    public EStructuralFeature[] features() {
      return (EStructuralFeature[]) data;
    }
  }

  @Override
  public EList<EOperation> getEOperations() {
    return concrete().getEOperations();
  }

  @Override
  public EList<EOperation> getEAllOperations() {
    // @Correctness: get them from the supertypes?
    return getEOperations();
  }

  @Override
  public boolean isSuperTypeOf(EClass someClass) {
    if (someClass instanceof VirtualEClass) {
      VirtualEClass c = (VirtualEClass) someClass;

      return c.concrete() == this.concrete()
          || c.virtualSuperTypes.contains(this)
          || c.getEAllSuperTypes().contains(this);
    } else {
      return concrete().isSuperTypeOf(someClass);
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

    if (allowDynamicFeatures) {
      return new DynamicStructuralFeature(featureName);
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
    return concrete().getFeatureType(feature);
  }

  @Override
  public int getFeatureID(EStructuralFeature feature) {
    return getEAllStructuralFeatures().indexOf(feature);
  }

  @Override
  public ESuperAdapter getESuperAdapter() {
    return ((ESuperAdapter.Holder) concrete()).getESuperAdapter();
  }

  @Override
  public boolean isFrozen() {
    // @Correctness: not sure whether we should delegate this, or just return false
    return ((ESuperAdapter.Holder) concrete()).isFrozen();
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
      return concrete().isInstance(object);
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
    sb.append(concrete().toString());
    return sb.toString();
  }

}
