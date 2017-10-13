/*******************************************************************************
 * Copyright (c) 2017 Armines
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * fmdkdd - initial implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.ESuperAdapter;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EClassifierExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreEList;

public class VirtualEClass extends DynamicEObjectImpl implements EClass, ESuperAdapter.Holder, EClassifierExtendedMetaData.Holder {

  private EClass concreteEClass;
  private List<VirtualEStructuralFeature> virtualFeatures = new ArrayList<>();
  private Set<EStructuralFeature> filteredFeatures = new HashSet<>();
  private List<EClass> virtualSuperTypes = new ArrayList<>();
  private Virtualizer virtualizer;

  public VirtualEClass(EClass concreteEClass, Virtualizer virtualizer) {
    super(EcorePackage.Literals.ECLASS);
    this.concreteEClass = concreteEClass;
    this.virtualizer = virtualizer;
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

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
      return getName();
    }
    if (feature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
      return getEAnnotations();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__DEFAULT_VALUE) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__EPACKAGE) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS) {
      return getInstanceClass();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_CLASS_NAME) {
      return getInstanceClassName();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__INSTANCE_TYPE_NAME) {
      return getInstanceTypeName();
    }
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

    throw new IllegalArgumentException("Unknown feature: " + feature.getName());
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
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
    return virtualizer.getVirtual(concreteEClass.eContainer());
  }

  @Override
  public EReference eContainmentFeature() {
    return virtualizer.getVirtual(concreteEClass.eContainmentFeature());
  }

  @Override
  public String getInstanceClassName() {
    return concreteEClass.getInstanceClassName();
  }

  @Override
  public void setInstanceClassName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Class<?> getInstanceClass() {
    return concreteEClass.getInstanceClass();
  }

  @Override
  public void setInstanceClass(Class<?> value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    return concreteEClass.getDefaultValue();
  }

  @Override
  public String getInstanceTypeName() {
    return concreteEClass.getInstanceTypeName();
  }

  @Override
  public void setInstanceTypeName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EPackage getEPackage() {
    return virtualizer.getVirtual(concreteEClass.getEPackage());
  }

  @Override
  public EList<ETypeParameter> getETypeParameters() {
    return concreteEClass.getETypeParameters();
  }

  @Override
  public boolean isInstance(Object object) {
    return concreteEClass.isInstance(object);
  }

  @Override
  public int getClassifierID() {
    // @Correctness: not sure what this should return in the presence of filters
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return concreteEClass.getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concreteEClass.getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    return concreteEClass.getEAnnotation(source);
  }

  @Override
  public boolean isAbstract() {
    return concreteEClass.isAbstract();
  }

  @Override
  public void setAbstract(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInterface() {
    return concreteEClass.isInterface();
  }

  @Override
  public void setInterface(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EClass> getESuperTypes() {
    // @Optimize: could use an iterator

    // This is just a map(getVirtual).filter(!filtered)
    List<EClass> types = new ArrayList<>();

    // @Assumption: this class and its super types are part of the same package,
    // so we can query it only once.
    VirtualEPackage vpackage = (VirtualEPackage) getEPackage();

    for (EClass c : concreteEClass.getESuperTypes()) {
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
    List<EClass> sups = new ArrayList<>();

    for (EClass sup : getESuperTypes()) {
      sups.addAll(sup.getEAllSuperTypes());
    }

    sups.addAll(getESuperTypes());

    return ECollections.unmodifiableEList(sups);
  }

  @Override
  public EAttribute getEIDAttribute() {
    return virtualizer.getVirtual(concreteEClass.getEIDAttribute());
  }

  protected List<EStructuralFeature> getAllFeatures() {
    // @Optimize: could use a lazy iterator

    List<EStructuralFeature> elems = new ArrayList<>();

    for (EClass sup : getESuperTypes()) {
      // Add all (filtered and non-filtered) features from supertypes
      elems.addAll(((VirtualEClass) sup).getAllFeatures());
    }

    // Add all features from the concrete class
    for (EStructuralFeature f : concreteEClass.getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature f : virtualFeatures) {
      elems.add(f);
    }

    return elems;
  }

  protected List<EStructuralFeature> getAllLocalFeatures() {
    // @Optimize: could use a lazy iterator

    List<EStructuralFeature> elems = new ArrayList<>();

    // Add all features from the concrete class
    for (EStructuralFeature f : concreteEClass.getEStructuralFeatures()) {
      elems.add(virtualizer.getVirtual(f));
    }

    // Add virtual feature at the end
    for (VirtualEStructuralFeature f : virtualFeatures) {
      elems.add(f);
    }

    return elems;
  }

  protected List<EStructuralFeature> getVisibleFeatures() {
    // @Optimize: could use a lazy iterator

    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : getAllFeatures()) {
      if (!isFeatureFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }

  protected List<EStructuralFeature> getVisibleLocalFeatures() {
    // @Optimize: could use a lazy iterator

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
    return concreteEClass.getEGenericSuperTypes();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    // @Optimize: could use a lazy iterator
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
    // @Optimize: could use a lazy iterator
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
    // @Optimize: could use a layz iterator
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
    // @Optimize: could use a lazy iterator
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
    // @Optimize: could use a lazy iterator
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
    return concreteEClass.getEOperations();
  }

  @Override
  public EList<EOperation> getEAllOperations() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isSuperTypeOf(EClass someClass) {
    boolean concreteSuper = concreteEClass.isSuperTypeOf(someClass);

    boolean virtualSuper = someClass instanceof VirtualEClass
        && ((VirtualEClass) someClass).virtualSuperTypes.contains(this);

    return concreteSuper || virtualSuper;
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
    return concreteEClass.getFeatureType(feature);
  }

  @Override
  public int getFeatureID(EStructuralFeature feature) {
    return getEAllStructuralFeatures().indexOf(feature);
  }

  @Override
  public ESuperAdapter getESuperAdapter() {
    return ((ESuperAdapter.Holder) concreteEClass).getESuperAdapter();
  }

  @Override
  public boolean isFrozen() {
    // @Correctness: not sure whether we should delegate this, or just return false
    return ((ESuperAdapter.Holder) concreteEClass).isFrozen();
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

}
