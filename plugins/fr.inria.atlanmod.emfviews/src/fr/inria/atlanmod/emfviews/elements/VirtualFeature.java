package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public abstract class VirtualFeature extends DynamicEObjectImpl implements EStructuralFeature.Internal {

  protected EStructuralFeature concreteFeature;
  protected Virtualizer virtualizer;

  protected VirtualFeature(EClass eClass, EStructuralFeature concreteFeature, Virtualizer virtualizer) {
    super(eClass);
    this.concreteFeature = concreteFeature;
    this.virtualizer = virtualizer;
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
    if (feature == EcorePackage.Literals.ETYPED_ELEMENT__EGENERIC_TYPE) {
      return getEGenericType();
    }
    if (feature == EcorePackage.Literals.ETYPED_ELEMENT__ETYPE) {
      return getEType();
    }
    if (feature == EcorePackage.Literals.ETYPED_ELEMENT__LOWER_BOUND) {
      return getLowerBound();
    }
    if (feature == EcorePackage.Literals.ETYPED_ELEMENT__UPPER_BOUND) {
      return getUpperBound();
    }
    if (feature == EcorePackage.Literals.EREFERENCE__EOPPOSITE) {
      return getEOpposite();
    }
    if (feature == EcorePackage.Literals.EREFERENCE__CONTAINMENT) {
      return isContainment();
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

  @Override
  public EObject eContainer() {
    return virtualizer.getVirtual(concreteFeature.eContainer());
  }

  @Override
  protected DynamicValueHolder eSettings() {
    // This override avoids the creation of the eSettings object that we do not use
    return this;
  }

  @Override
  public boolean isTransient() {
    return concreteFeature.isTransient();
  }

  @Override
  public void setTransient(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isVolatile() {
    return concreteFeature.isVolatile();
  }

  @Override
  public void setVolatile(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isChangeable() {
    return concreteFeature.isChangeable();
  }

  @Override
  public void setChangeable(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getDefaultValueLiteral() {
    return concreteFeature.getDefaultValueLiteral();
  }

  @Override
  public void setDefaultValueLiteral(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    return concreteFeature.getDefaultValue();
  }

  @Override
  public void setDefaultValue(Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnsettable() {
    return concreteFeature.isUnsettable();
  }

  @Override
  public void setUnsettable(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isDerived() {
    return concreteFeature.isDerived();
  }

  @Override
  public void setDerived(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EClass getEContainingClass() {
    return virtualizer.getVirtual(concreteFeature.getEContainingClass());
  }

  @Override
  public int getFeatureID() {
    // @Correctness: Should we return the featureID of the underlying class,
    // or a feature ID that makes sense for this virtual feature?

    // Currently, implement the former
    return concreteFeature.getFeatureID();
  }

  @Override
  public Class<?> getContainerClass() {
    return concreteFeature.getContainerClass();
  }

  @Override
  public boolean isOrdered() {
    return concreteFeature.isOrdered();
  }

  @Override
  public void setOrdered(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnique() {
    return concreteFeature.isUnique();
  }

  @Override
  public void setUnique(boolean value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getLowerBound() {
    return concreteFeature.getLowerBound();
  }

  @Override
  public void setLowerBound(int value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getUpperBound() {
    return concreteFeature.getUpperBound();
  }

  @Override
  public void setUpperBound(int value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isMany() {
    return concreteFeature.isMany();
  }

  @Override
  public boolean isRequired() {
    return concreteFeature.isRequired();
  }

  @Override
  public EClassifier getEType() {
    return virtualizer.getVirtual(concreteFeature.getEType());
  }

  @Override
  public void setEType(EClassifier value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getEGenericType() {
    return concreteFeature.getEGenericType();
  }

  @Override
  public void setEGenericType(EGenericType value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return concreteFeature.getName();
  }

  @Override
  public void setName(String value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAnnotation> getEAnnotations() {
    return concreteFeature.getEAnnotations();
  }

  @Override
  public EAnnotation getEAnnotation(String source) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  static class DumbSettingDelegate implements SettingDelegate {
    static protected SettingDelegate INSTANCE = new DumbSettingDelegate();

    @Override
    public Setting dynamicSetting(InternalEObject owner, DynamicValueHolder settings,
                                  int dynamicFeatureID) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public Object dynamicGet(InternalEObject owner, DynamicValueHolder settings,
                             int dynamicFeatureID, boolean resolve, boolean coreType) {
      return settings.dynamicGet(dynamicFeatureID);
    }

    @Override
    public void dynamicSet(InternalEObject owner, DynamicValueHolder settings,
                           int dynamicFeatureID, Object newValue) {
      settings.dynamicSet(dynamicFeatureID, newValue);
    }

    @Override
    public boolean dynamicIsSet(InternalEObject owner, DynamicValueHolder settings,
                                int dynamicFeatureID) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public void dynamicUnset(InternalEObject owner, DynamicValueHolder settings,
                             int dynamicFeatureID) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public NotificationChain dynamicInverseAdd(InternalEObject owner, DynamicValueHolder settings,
                                               int dynamicFeatureID, InternalEObject otherEnd,
                                               NotificationChain notifications) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }

    @Override
    public NotificationChain dynamicInverseRemove(InternalEObject owner,
                                                  DynamicValueHolder settings,
                                                  int dynamicFeatureID, InternalEObject otherEnd,
                                                  NotificationChain notifications) {
      // TODO: Auto-generated method stub
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public SettingDelegate getSettingDelegate() {
    return DumbSettingDelegate.INSTANCE;
  }

  @Override
  public void setSettingDelegate(SettingDelegate settingDelegate) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isFeatureMap() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public org.eclipse.emf.ecore.util.FeatureMap.Entry.Internal getFeatureMapEntryPrototype() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void
      setFeatureMapEntryPrototype(org.eclipse.emf.ecore.util.FeatureMap.Entry.Internal prototype) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isID() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isResolveProxies() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isContainer() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isContainment() {
    return ((EStructuralFeature.Internal) concreteFeature).isContainment();
  }

  @Override
  public EReference getEOpposite() {
    return virtualizer.getVirtual(((EStructuralFeature.Internal) concreteFeature).getEOpposite());
  }

}
