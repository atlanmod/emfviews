package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public class VirtualEAttribute  extends DynamicEObjectImpl implements EAttribute, EStructuralFeature.Internal {

  private EAttribute concreteAttribute;

  public VirtualEAttribute(EAttribute concreteAttribute) {
    super(EcorePackage.Literals.EATTRIBUTE);
    this.concreteAttribute = concreteAttribute;
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    System.out.println(feature);

    if (feature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
      return getName();
    }

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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setLowerBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int getUpperBound() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setUpperBound(int value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isMany() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isRequired() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClassifier getEType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEType(EClassifier value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EGenericType getEGenericType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEGenericType(EGenericType value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public String getName() {
    return concreteAttribute.getName();
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
  public boolean isID() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setID(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EDataType getEAttributeType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public SettingDelegate getSettingDelegate() {
    throw new UnsupportedOperationException();
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
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

}
