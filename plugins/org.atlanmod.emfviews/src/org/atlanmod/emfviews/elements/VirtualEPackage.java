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
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData.EPackageExtendedMetaData;

import org.atlanmod.emfviews.core.EcoreVirtualizer;
import org.atlanmod.emfviews.core.View;
import org.atlanmod.emfviews.core.Viewpoint;

public class VirtualEPackage extends BaseVirtualElement<EPackage> implements EPackage,
  BasicExtendedMetaData.EPackageExtendedMetaData.Holder {

  private List<VirtualEClass> virtualClassifiers = new ArrayList<>();
  private List<VirtualEPackage> virtualPackages = new ArrayList<>();
  private VirtualEPackage virtualSuperPackage;
  private Set<EClassifier> filteredClassifiers = new HashSet<>();

  public VirtualEPackage(EPackage concreteEPackage, EcoreVirtualizer virtualizer) {
    super(EcorePackage.Literals.EPACKAGE, concreteEPackage, virtualizer);
  }

  // @Correctness: should we accept VirtualClassifier (a supertype) as well?
  // I guess since only Viewpoint calls this method, and only with VirtualEClass,
  // there is need for the moment.
  public void addVirtualClassifier(VirtualEClass f) {
    if (!virtualClassifiers.contains(f)) {
      virtualClassifiers.add(f);
    }
  }

  public void addVirtualPackage(VirtualEPackage p) {
    if (!virtualPackages.contains(p)) {
      virtualPackages.add(p);
      p.virtualSuperPackage = this;
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
    return concrete().getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concrete().getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    return concrete().getEAnnotation(source);
  }

  @Override
  public String getNsURI() {
    return concrete().getNsURI();
  }

  @Override
  public void setNsURI(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getNsPrefix() {
    return concrete().getNsPrefix();
  }

  @Override
  public void setNsPrefix(String value) {
    // No-op to please EGL.
  }

  // The Ecore metamodel requires an EFactory for each EPackage, so we provide one
  // but we don't support creating viewpoint objects with it.
  class VirtualEFactory extends DynamicEObjectImpl implements EFactory {

    @Override
    public EList<EAnnotation> getEAnnotations() {
      throw new UnsupportedOperationException();
    }

    @Override
    public EAnnotation getEAnnotation(String source) {
      throw new UnsupportedOperationException();
    }

    @Override
    public EPackage getEPackage() {
      return VirtualEPackage.this;
    }

    @Override
    public void setEPackage(EPackage value) {
      throw new UnsupportedOperationException();
    }

    @Override
    public EObject create(EClass eClass) {
      // The MoDisco Browser will create instances in order to determine the icon to use,
      // so we should avoid throwing here.
      //
      // One way to provide sensible values is to instantiate instances of the
      // concrete EClass and virtualize them.
      if (!(eClass instanceof VirtualEClass)) {
        throw new IllegalArgumentException("The class " + eClass.getName() + " is not a valid classifier");
      }

      EClass concrete = ((VirtualEClass) eClass).concrete();

      // We don't have a hold on the actual view used, but we don't want to pollute it anyway,
      // so we just use a throwaway.
      return new VirtualEObject(
        concrete.getEPackage().getEFactoryInstance().create(concrete),
        (VirtualEClass) eClass,
        new View((Viewpoint) virtualizer));
    }

    @Override
    public Object createFromString(EDataType eDataType, String literalValue) {
      throw new UnsupportedOperationException();
    }

    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
      return instanceValue == null ? null: instanceValue.toString();
    }
  }

  @Override
  public EFactory getEFactoryInstance() {
    return new VirtualEFactory();
  }

  @Override
  public void setEFactoryInstance(EFactory value) {
    throw new UnsupportedOperationException();
  }

  protected List<EClassifier> getAllClassifiers() {
    List<EClassifier> elems = new ArrayList<>();

    for (EClassifier f : concrete().getEClassifiers()) {
      elems.add(virtualizer.getVirtual(f));
    }

    for (VirtualEClass f : virtualClassifiers) {
      elems.add(f);
    }

    return elems;
  }

  // @Refactor: quite close to getAllFeatures in VirtualEClass
  protected List<EClassifier> getNonFilteredClassifiers() {
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
    List<EClassifier> cs = getNonFilteredClassifiers();
    // See @UnmodifiableEList
    return new EcoreEList.UnmodifiableEList<>(
        this, EcorePackage.Literals.EPACKAGE__ECLASSIFIERS, cs.size(), cs.toArray());
  }

  @Override
  public EList<EPackage> getESubpackages() {
    List<EPackage> subs = new ArrayList<>();

    for (EPackage p : concrete().getESubpackages()) {
      subs.add(virtualizer.getVirtual(p));
    }

    subs.addAll(virtualPackages);

    // See @UnmodifiableEList
    return new EcoreEList.UnmodifiableEList<>(this,
        EcorePackage.Literals.EPACKAGE__ESUBPACKAGES,
        subs.size(), subs.toArray());
  }

  @Override
  public EPackage getESuperPackage() {
    // The virtual super package overrides the concrete one
    if (virtualSuperPackage != null) {
      return virtualSuperPackage;
    }

    EPackage sup = concrete().getESuperPackage();
    return sup != null ? virtualizer.getVirtual(sup) : null;
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

  @Override
  public EPackageExtendedMetaData getExtendedMetaData() {
    return ((BasicExtendedMetaData.EPackageExtendedMetaData.Holder) concrete()).getExtendedMetaData();
  }

  @Override
  public void setExtendedMetaData(EPackageExtendedMetaData ePackageExtendedMetaData) {
    throw new UnsupportedOperationException();
  }

}
