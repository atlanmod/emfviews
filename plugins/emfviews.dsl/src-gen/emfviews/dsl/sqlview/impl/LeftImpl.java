/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.Left;
import emfviews.dsl.sqlview.MetamodelName;
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
 * An implementation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.LeftImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.LeftImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.LeftImpl#getAttributeWhereLeft <em>Attribute Where Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftImpl extends MinimalEObjectImpl.Container implements Left
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
   * The cached value of the '{@link #getAttributeWhereLeft() <em>Attribute Where Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeWhereLeft()
   * @generated
   * @ordered
   */
  protected Attribute attributeWhereLeft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeftImpl()
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
    return SqlviewPackage.Literals.LEFT;
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
      metamodel = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.LEFT__METAMODEL);
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
      class_ = new EObjectResolvingEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.LEFT__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributeWhereLeft()
  {
    return attributeWhereLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeWhereLeft(Attribute newAttributeWhereLeft, NotificationChain msgs)
  {
    Attribute oldAttributeWhereLeft = attributeWhereLeft;
    attributeWhereLeft = newAttributeWhereLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT, oldAttributeWhereLeft, newAttributeWhereLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeWhereLeft(Attribute newAttributeWhereLeft)
  {
    if (newAttributeWhereLeft != attributeWhereLeft)
    {
      NotificationChain msgs = null;
      if (attributeWhereLeft != null)
        msgs = ((InternalEObject)attributeWhereLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT, null, msgs);
      if (newAttributeWhereLeft != null)
        msgs = ((InternalEObject)newAttributeWhereLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT, null, msgs);
      msgs = basicSetAttributeWhereLeft(newAttributeWhereLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT, newAttributeWhereLeft, newAttributeWhereLeft));
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
      case SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT:
        return basicSetAttributeWhereLeft(null, msgs);
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
      case SqlviewPackage.LEFT__METAMODEL:
        return getMetamodel();
      case SqlviewPackage.LEFT__CLASS:
        return getClass_();
      case SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT:
        return getAttributeWhereLeft();
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
      case SqlviewPackage.LEFT__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.LEFT__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
        return;
      case SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT:
        setAttributeWhereLeft((Attribute)newValue);
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
      case SqlviewPackage.LEFT__METAMODEL:
        getMetamodel().clear();
        return;
      case SqlviewPackage.LEFT__CLASS:
        getClass_().clear();
        return;
      case SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT:
        setAttributeWhereLeft((Attribute)null);
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
      case SqlviewPackage.LEFT__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case SqlviewPackage.LEFT__CLASS:
        return class_ != null && !class_.isEmpty();
      case SqlviewPackage.LEFT__ATTRIBUTE_WHERE_LEFT:
        return attributeWhereLeft != null;
    }
    return super.eIsSet(featureID);
  }

} //LeftImpl
