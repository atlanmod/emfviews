/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.AddProperty;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.AddPropertyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddPropertyImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.AddPropertyImpl#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddPropertyImpl extends ModifyOperatorImpl implements AddProperty
{
  /**
   * The default value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected String property = PROPERTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<Type> type;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected EList<String> cardinality;

  /**
   * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationType()
   * @generated
   * @ordered
   */
  protected EList<String> relationType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddPropertyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtensionPackage.Literals.ADD_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperty(String newProperty)
  {
    String oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.ADD_PROPERTY__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<Type>(Type.class, this, ExtensionPackage.ADD_PROPERTY__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCardinality()
  {
    if (cardinality == null)
    {
      cardinality = new EDataTypeEList<String>(String.class, this, ExtensionPackage.ADD_PROPERTY__CARDINALITY);
    }
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelationType()
  {
    if (relationType == null)
    {
      relationType = new EDataTypeEList<String>(String.class, this, ExtensionPackage.ADD_PROPERTY__RELATION_TYPE);
    }
    return relationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_PROPERTY__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_PROPERTY__PROPERTY:
        return getProperty();
      case ExtensionPackage.ADD_PROPERTY__TYPE:
        return getType();
      case ExtensionPackage.ADD_PROPERTY__CARDINALITY:
        return getCardinality();
      case ExtensionPackage.ADD_PROPERTY__RELATION_TYPE:
        return getRelationType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_PROPERTY__PROPERTY:
        setProperty((String)newValue);
        return;
      case ExtensionPackage.ADD_PROPERTY__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends Type>)newValue);
        return;
      case ExtensionPackage.ADD_PROPERTY__CARDINALITY:
        getCardinality().clear();
        getCardinality().addAll((Collection<? extends String>)newValue);
        return;
      case ExtensionPackage.ADD_PROPERTY__RELATION_TYPE:
        getRelationType().clear();
        getRelationType().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_PROPERTY__PROPERTY:
        setProperty(PROPERTY_EDEFAULT);
        return;
      case ExtensionPackage.ADD_PROPERTY__TYPE:
        getType().clear();
        return;
      case ExtensionPackage.ADD_PROPERTY__CARDINALITY:
        getCardinality().clear();
        return;
      case ExtensionPackage.ADD_PROPERTY__RELATION_TYPE:
        getRelationType().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.ADD_PROPERTY__PROPERTY:
        return PROPERTY_EDEFAULT == null ? property != null : !PROPERTY_EDEFAULT.equals(property);
      case ExtensionPackage.ADD_PROPERTY__TYPE:
        return type != null && !type.isEmpty();
      case ExtensionPackage.ADD_PROPERTY__CARDINALITY:
        return cardinality != null && !cardinality.isEmpty();
      case ExtensionPackage.ADD_PROPERTY__RELATION_TYPE:
        return relationType != null && !relationType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (property: ");
    result.append(property);
    result.append(", cardinality: ");
    result.append(cardinality);
    result.append(", relationType: ");
    result.append(relationType);
    result.append(')');
    return result.toString();
  }

} //AddPropertyImpl
