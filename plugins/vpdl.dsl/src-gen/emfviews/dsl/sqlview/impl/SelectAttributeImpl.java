/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.SelectAttribute;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectAttributeImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectAttributeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectAttributeImpl extends MinimalEObjectImpl.Container implements SelectAttribute
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
   * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<emfviews.dsl.sqlview.Class> class_;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectAttributeImpl()
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
    return SqlviewPackage.Literals.SELECT_ATTRIBUTE;
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
      metamodel = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.SELECT_ATTRIBUTE__METAMODEL);
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
      class_ = new EObjectContainmentEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.SELECT_ATTRIBUTE__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttribute()
  {
    if (attribute == null)
    {
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE);
    }
    return attribute;
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
      case SqlviewPackage.SELECT_ATTRIBUTE__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE:
        return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.SELECT_ATTRIBUTE__METAMODEL:
        return getMetamodel();
      case SqlviewPackage.SELECT_ATTRIBUTE__CLASS:
        return getClass_();
      case SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE:
        return getAttribute();
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
      case SqlviewPackage.SELECT_ATTRIBUTE__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.SELECT_ATTRIBUTE__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
        return;
      case SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE:
        getAttribute().clear();
        getAttribute().addAll((Collection<? extends Attribute>)newValue);
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
      case SqlviewPackage.SELECT_ATTRIBUTE__METAMODEL:
        getMetamodel().clear();
        return;
      case SqlviewPackage.SELECT_ATTRIBUTE__CLASS:
        getClass_().clear();
        return;
      case SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE:
        getAttribute().clear();
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
      case SqlviewPackage.SELECT_ATTRIBUTE__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case SqlviewPackage.SELECT_ATTRIBUTE__CLASS:
        return class_ != null && !class_.isEmpty();
      case SqlviewPackage.SELECT_ATTRIBUTE__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SelectAttributeImpl
