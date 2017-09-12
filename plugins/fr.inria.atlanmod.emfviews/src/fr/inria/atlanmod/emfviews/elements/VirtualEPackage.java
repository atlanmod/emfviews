package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEPackage extends DynamicEObjectImpl implements EPackage {

  private EPackage concreteEPackage;
  private List<VirtualEClass> virtualClassifiers = new ArrayList<>();

  public VirtualEPackage(EPackage concreteEPackage) {
    super(EcorePackage.Literals.EPACKAGE);
    this.concreteEPackage = concreteEPackage;
  }


  // @Correctness: should we accept VirtualClassifier (a supertype) as well?
  public void addVirtualClassifier(VirtualEClass f) {
    virtualClassifiers.add(f);
  }

  public int getVirtualClassifiersSize() {
    return virtualClassifiers.size();
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.EPACKAGE__ECLASSIFIERS) {
      return getEClassifiers();
    }

    // @Correctness: reflexive access for other methods of the metaclass

    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }


  @Override
  public String getName() {
    return concreteEPackage.getName();
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
  public String getNsURI() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setNsURI(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getNsPrefix() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setNsPrefix(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EFactory getEFactoryInstance() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEFactoryInstance(EFactory value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  // @Refactor: similar to VirtualEClass
  private Map<EClassifier, VirtualEClass> concreteToVirtual = new HashMap<>();

  protected VirtualEClass getVirtual(EClassifier f) {
    return concreteToVirtual.computeIfAbsent(f, (o) -> {
      if (o instanceof EClass) return new VirtualEClass((EClass) o);
      else throw new IllegalArgumentException("Cannot virtualize classifier" + f);
    });
  }


  // @Refactor: quite close to getAllFeatures in VirtualEClass
  protected List<EClassifier> getAllClassifiers() {
    // @Optimize: an iterator would be best here

    List<EClassifier> elems = new ArrayList<>();

    for (EClassifier f : concreteEPackage.getEClassifiers()) {
      elems.add(getVirtual(f));
    }

    for (VirtualEClass f : virtualClassifiers) {
      elems.add(f);
    }

    return elems;
  }

  // @Refactor: quite close to getAllFeatures in VirtualEClass
  protected List<EClassifier> getNonFilteredClassifiers() {
    // @Optimize: an iterator would be best here

    List<EClassifier> elems = new ArrayList<>();

    for (EClassifier f : getAllClassifiers()) {
      if (!((VirtualEClass) f).isFiltered()) {
        elems.add(f);
      }
    }

    return elems;
  }


  @Override
  public EList<EClassifier> getEClassifiers() {
    return ECollections.unmodifiableEList(getNonFilteredClassifiers());
  }

  @Override
  public EList<EPackage> getESubpackages() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EPackage getESuperPackage() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEClassifier(String name) {
    for (EClassifier f : getEClassifiers()) {
      if (name.equals(f.getName())) {
        return f;
      }
    }
    return null;
  }

}
