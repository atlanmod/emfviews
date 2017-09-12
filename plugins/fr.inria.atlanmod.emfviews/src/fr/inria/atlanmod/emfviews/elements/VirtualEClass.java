package fr.inria.atlanmod.emfviews.elements;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEClass extends DynamicEObjectImpl implements EClass {

  private EClass concreteEClass;
  private List<VirtualFeature> virtualFeatures = new ArrayList<>();
  private Set<EStructuralFeature> filteredFeatures = new HashSet<>();

  public VirtualEClass(EClass concreteEClass) {
    super(EcorePackage.Literals.ECLASS);
    this.concreteEClass = concreteEClass;
  }

  public void addVirtualFeature(VirtualFeature f) {
    virtualFeatures.add(f);
  }

  public int getVirtualFeaturesSize() {
    return virtualFeatures.size();
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

    // @Correctness: reflexive access for other methods of the metaclass

    throw new IllegalArgumentException("Unknown feature: " + feature);
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
  public String getInstanceClassName() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceClassName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Class<?> getInstanceClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceClass(Class<?> value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstanceTypeName() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInstanceTypeName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EPackage getEPackage() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<ETypeParameter> getETypeParameters() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInstance(Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getClassifierID() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return concreteEClass.getName();
  }

  @Override
  public void setName(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isAbstract() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setAbstract(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isInterface() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setInterface(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EClass> getESuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EClass> getEAllSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EAttribute getEIDAttribute() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  // @Refactor: I think a simple ECollections.unmodifiableEList is enough here
  public class VirtualFeaturesList extends AbstractList<EStructuralFeature> implements EList<EStructuralFeature> {

    private List<EStructuralFeature> concreteList;

    public VirtualFeaturesList(List<EStructuralFeature> concreteList) {
      this.concreteList = concreteList;
    }

    @Override
    public EStructuralFeature get(int index) {
      return concreteList.get(index);
    }

    @Override
    public EStructuralFeature set(int index, EStructuralFeature element) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public EStructuralFeature remove(int index) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public void move(int newPosition, EStructuralFeature object) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public EStructuralFeature move(int newPosition, int oldPosition) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
      return concreteList.size();
    }

  }

  protected List<EStructuralFeature> getAllFeatures() {
    // @Optimize: an iterator would be best here

    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : concreteEClass.getEStructuralFeatures()) {
      elems.add(f);
    }

    for (VirtualFeature f : virtualFeatures) {
      elems.add(f);
    }

    return elems;
  }

  protected List<EStructuralFeature> getNonFilteredFeatures() {
    // @Optimize: an iterator would be best here

    List<EStructuralFeature> elems = new ArrayList<>();

    for (EStructuralFeature f : getAllFeatures()) {
      if (!isFeatureFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }

  @Override
  public EList<EStructuralFeature> getEStructuralFeatures() {
    return new VirtualFeaturesList(getNonFilteredFeatures());
  }

  @Override
  public EList<EGenericType> getEGenericSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EGenericType> getEAllGenericSuperTypes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAttributes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEAllAttributes() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEReferences() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEAllReferences() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EReference> getEAllContainments() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EStructuralFeature> getEAllStructuralFeatures() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EOperation> getEOperations() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    EList<EStructuralFeature> features = getEStructuralFeatures();
    if (featureID < features.size()) {
      return features.get(featureID);
    } else {
      return null;
    }
  }

  @Override
  public EStructuralFeature getEStructuralFeature(String featureName) {
    for (EStructuralFeature f : getEStructuralFeatures()) {
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
    return getEStructuralFeatures().indexOf(feature);
  }

  // Return the ID of the feature, counting all concrete features and virtual features,
  // including filtered ones.
  public int getFeatureAbsoluteID(EStructuralFeature feature) {
    return getAllFeatures().indexOf(feature);
  }

}
