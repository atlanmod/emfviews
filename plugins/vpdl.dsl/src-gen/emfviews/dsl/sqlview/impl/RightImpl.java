/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.Right;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.RightImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.RightImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.RightImpl#getAttributeWhereRight <em>Attribute Where Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.RightImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightImpl extends MinimalEObjectImpl.Container implements Right
{
  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected EList<MetamodelName> metamodel;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<emfviews.dsl.sqlview.Class> class_;

  /**
   * The cached value of the '{@link #getAttributeWhereRight() <em>Attribute Where Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeWhereRight()
   * @generated
   * @ordered
   */
  protected Attribute attributeWhereRight;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightImpl()
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
    return SqlviewPackage.Literals.RIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelName> getMetamodel()
  {
    if (metamodel == null)
    {
      metamodel = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.RIGHT__METAMODEL);
    }
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<emfviews.dsl.sqlview.Class> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EObjectResolvingEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.RIGHT__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributeWhereRight()
  {
    return attributeWhereRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeWhereRight(Attribute newAttributeWhereRight, NotificationChain msgs)
  {
    Attribute oldAttributeWhereRight = attributeWhereRight;
    attributeWhereRight = newAttributeWhereRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT, oldAttributeWhereRight, newAttributeWhereRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeWhereRight(Attribute newAttributeWhereRight)
  {
    if (newAttributeWhereRight != attributeWhereRight)
    {
      NotificationChain msgs = null;
      if (attributeWhereRight != null)
        msgs = ((InternalEObject)attributeWhereRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT, null, msgs);
      if (newAttributeWhereRight != null)
        msgs = ((InternalEObject)newAttributeWhereRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT, null, msgs);
      msgs = basicSetAttributeWhereRight(newAttributeWhereRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT, newAttributeWhereRight, newAttributeWhereRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlviewPackage.RIGHT__VALUE, oldValue, value));
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
      case SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT:
        return basicSetAttributeWhereRight(null, msgs);
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
      case SqlviewPackage.RIGHT__METAMODEL:
        return getMetamodel();
      case SqlviewPackage.RIGHT__CLASS:
        return getClass_();
      case SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT:
        return getAttributeWhereRight();
      case SqlviewPackage.RIGHT__VALUE:
        return getValue();
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
      case SqlviewPackage.RIGHT__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.RIGHT__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
        return;
      case SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT:
        setAttributeWhereRight((Attribute)newValue);
        return;
      case SqlviewPackage.RIGHT__VALUE:
        setValue((String)newValue);
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
      case SqlviewPackage.RIGHT__METAMODEL:
        getMetamodel().clear();
        return;
      case SqlviewPackage.RIGHT__CLASS:
        getClass_().clear();
        return;
      case SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT:
        setAttributeWhereRight((Attribute)null);
        return;
      case SqlviewPackage.RIGHT__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case SqlviewPackage.RIGHT__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case SqlviewPackage.RIGHT__CLASS:
        return class_ != null && !class_.isEmpty();
      case SqlviewPackage.RIGHT__ATTRIBUTE_WHERE_RIGHT:
        return attributeWhereRight != null;
      case SqlviewPackage.RIGHT__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //RightImpl
