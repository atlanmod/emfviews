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

  private EStructuralFeature concreteFeature;
  private Virtualizer virtualizer;

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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setTransient(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isVolatile() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setVolatile(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isChangeable() {
    return concreteFeature.isChangeable();
  }

  @Override
  public void setChangeable(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getDefaultValueLiteral() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDefaultValueLiteral(String value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object getDefaultValue() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDefaultValue(Object value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnsettable() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUnsettable(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isDerived() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setDerived(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClass getEContainingClass() {
    return virtualizer.getVirtual(concreteFeature.getEContainingClass());
  }

  @Override
  public int getFeatureID() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Class<?> getContainerClass() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isOrdered() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setOrdered(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isUnique() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUnique(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getLowerBound() {
    return concreteFeature.getLowerBound();
  }

  @Override
  public void setLowerBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getUpperBound() {
    return concreteFeature.getUpperBound();
  }

  @Override
  public void setUpperBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isMany() {
    return concreteFeature.isMany();
  }

  @Override
  public boolean isRequired() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEType() {
    return concreteFeature.getEType();
  }

  @Override
  public void setEType(EClassifier value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getEGenericType() {
    return concreteFeature.getEGenericType();
  }

  @Override
  public void setEGenericType(EGenericType value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return concreteFeature.getName();
  }

  @Override
  public void setName(String value) {
    // TODO: Auto-generated method stub
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isResolveProxies() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isContainer() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isContainment() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EReference getEOpposite() {
    return virtualizer.getVirtual(((EStructuralFeature.Internal) concreteFeature).getEOpposite());
  }

}
