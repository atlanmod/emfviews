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
import org.eclipse.emf.ecore.util.EcoreEList;

public class VirtualEClass extends DynamicEObjectImpl implements EClass, ESuperAdapter.Holder {

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
    // @Correctness: we shouldn't be able to add the same EClass twice
    virtualSuperTypes.add(c);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES) {
      return getEStructuralFeatures();
    }
    if (feature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
      return getName();
    }
    if (feature == EcorePackage.Literals.EMODEL_ELEMENT__EANNOTATIONS) {
      return getEAnnotations();
    }
    if (feature == EcorePackage.Literals.ECLASSIFIER__ETYPE_PARAMETERS) {
      return getETypeParameters();
    }
    if (feature == EcorePackage.Literals.ECLASS__EOPERATIONS) {
      return getEOperations();
    }
    if (feature == EcorePackage.Literals.ECLASS__EGENERIC_SUPER_TYPES) {
      return getEGenericSuperTypes();
    }
    if (feature == EcorePackage.Literals.ECLASS__ESUPER_TYPES) {
      return getESuperTypes();
    }

    // @Correctness: reflexive access for other methods of the metaclass
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getClassifierID() {
    return concreteEClass.getClassifierID();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // @Optimize: is there any way to make this less wasteful?

    // This is just a map(getVirtual).filter(!filtered)
    List<EClass> types = new ArrayList<>();

    // @Assumption: this class and its super typs are part of the same package,
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
    // @Optimize: an iterator would be best here

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
    // @Optimize: an iterator would be best here

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
    // @Optimize: an iterator would be best here

    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : getAllFeatures()) {
      if (!isFeatureFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }

  protected List<EStructuralFeature> getVisibleLocalFeatures() {
    // @Optimize: an iterator would be best here

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
    // FIXME: the return value must be castable to EStructuralFeature.Setting

    List<EStructuralFeature> cs = getVisibleLocalFeatures();
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.ECLASS__ESTRUCTURAL_FEATURES, cs.size(), cs.toArray());

    //return new VirtualFeaturesList(getNonFilteredFeatures());
  }

  @Override
  public EList<EGenericType> getEGenericSuperTypes() {
    return concreteEClass.getEGenericSuperTypes();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    // @Optimize: use an iterator
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
    // @Optimize: use an iterator
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
    // @Optimize: use an iterator
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
    // @Optimize: use an iterator
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
    // @Optimize: use an iterator
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
    // FIXME: the return value must be castable to EStructuralFeature.Setting

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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isSuperTypeOf(EClass someClass) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getEOperation(int operationID) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getOperationID(EOperation operation) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EOperation getOverride(EOperation operation) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getFeatureType(EStructuralFeature feature) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // @Correctness: not sure whether we should delegate this
    return ((ESuperAdapter.Holder) concreteEClass).isFrozen();
  }

}
