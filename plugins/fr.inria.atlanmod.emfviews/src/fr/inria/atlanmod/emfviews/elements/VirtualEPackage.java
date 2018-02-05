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

package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEList;

public class VirtualEPackage extends DynamicEObjectImpl implements EPackage {

  private EPackage concreteEPackage;
  private List<VirtualEClass> virtualClassifiers = new ArrayList<>();
  private Set<EClassifier> filteredClassifiers = new HashSet<>();
  private Virtualizer virtualizer;

  public VirtualEPackage(EPackage concreteEPackage, Virtualizer virtualizer) {
    super(EcorePackage.Literals.EPACKAGE);
    this.concreteEPackage = concreteEPackage;
    this.virtualizer = virtualizer;
  }

  // @Correctness: should we accept VirtualClassifier (a supertype) as well?
  // I guess since only Viewpoint calls this method, and only with VirtualEClass,
  // there is need for the moment.
  public void addVirtualClassifier(VirtualEClass f) {
    if (!virtualClassifiers.contains(f)) {
      virtualClassifiers.add(f);
    }
  }

  public void filterClassifier(EClassifier c) {
    filteredClassifiers.add(c);
  }

  public void unfilterClassifier(EClassifier c) {
    filteredClassifiers.remove(c);
  }

  public boolean isClassifierFiltered(EClassifier c) {
    return filteredClassifiers.contains(c);
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
    if (feature == EcorePackage.Literals.EPACKAGE__ECLASSIFIERS) {
      return getEClassifiers();
    }
    if (feature == EcorePackage.Literals.EPACKAGE__EFACTORY_INSTANCE) {
      return getEFactoryInstance();
    }
    if (feature == EcorePackage.Literals.EPACKAGE__ESUBPACKAGES) {
      return getESubpackages();
    }
    if (feature == EcorePackage.Literals.EPACKAGE__ESUPER_PACKAGE) {
      return getESuperPackage();
    }
    if (feature == EcorePackage.Literals.EPACKAGE__NS_PREFIX) {
      return getNsPrefix();
    }
    if (feature == EcorePackage.Literals.EPACKAGE__NS_URI) {
      return getNsURI();
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


  @Override
  public String getName() {
    return concreteEPackage.getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concreteEPackage.getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getNsURI() {
    return concreteEPackage.getNsURI();
  }

  @Override
  public void setNsURI(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getNsPrefix() {
    return concreteEPackage.getNsPrefix();
  }

  @Override
  public void setNsPrefix(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EFactory getEFactoryInstance() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEFactoryInstance(EFactory value) {
    throw new UnsupportedOperationException();
  }

  // @Refactor: quite close to getAllFeatures in VirtualEClass
  protected List<EClassifier> getAllClassifiers() {
    // @Optimize: an iterator would be best here

    List<EClassifier> elems = new ArrayList<>();

    for (EClassifier f : concreteEPackage.getEClassifiers()) {
      elems.add(virtualizer.getVirtual(f));
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
      if (!isClassifierFiltered(f)) {
        elems.add(f);
      }
    }

    return elems;
  }


  @Override
  public EList<EClassifier> getEClassifiers() {
    // The return value must be castable to EStructuralFeature.Setting,
    // hence why we use an EcoreList.UnmodifiableElist
    List<EClassifier> cs = getNonFilteredClassifiers();
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.EPACKAGE__ECLASSIFIERS, cs.size(), cs.toArray());
  }

  @Override
  public EList<EPackage> getESubpackages() {
    return new VirtualESettingList<>(concreteEPackage.getESubpackages(), virtualizer,
        this, EcorePackage.Literals.EPACKAGE__ESUBPACKAGES);
  }

  @Override
  public EPackage getESuperPackage() {
    EPackage sup = concreteEPackage.getESuperPackage();
    if (sup != null) {
      return virtualizer.getVirtual(sup);
    } else {
      return sup;
    }
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
