/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Select;
import emfviews.dsl.sqlview.SelectAttribute;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getSelectAttribute <em>Select Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends MinimalEObjectImpl.Container implements Select
{
  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected EList<String> select;

  /**
   * The cached value of the '{@link #getSelectAttribute() <em>Select Attribute</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectAttribute()
   * @generated
   * @ordered
   */
  protected EList<SelectAttribute> selectAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
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
    return SqlviewPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSelect()
  {
    if (select == null)
    {
      select = new EDataTypeEList<String>(String.class, this, SqlviewPackage.SELECT__SELECT);
    }
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SelectAttribute> getSelectAttribute()
  {
    if (selectAttribute == null)
    {
      selectAttribute = new EObjectContainmentEList<SelectAttribute>(SelectAttribute.class, this, SqlviewPackage.SELECT__SELECT_ATTRIBUTE);
    }
    return selectAttribute;
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
      case SqlviewPackage.SELECT__SELECT_ATTRIBUTE:
        return ((InternalEList<?>)getSelectAttribute()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.SELECT__SELECT:
        return getSelect();
      case SqlviewPackage.SELECT__SELECT_ATTRIBUTE:
        return getSelectAttribute();
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
      case SqlviewPackage.SELECT__SELECT:
        getSelect().clear();
        getSelect().addAll((Collection<? extends String>)newValue);
        return;
      case SqlviewPackage.SELECT__SELECT_ATTRIBUTE:
        getSelectAttribute().clear();
        getSelectAttribute().addAll((Collection<? extends SelectAttribute>)newValue);
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
      case SqlviewPackage.SELECT__SELECT:
        getSelect().clear();
        return;
      case SqlviewPackage.SELECT__SELECT_ATTRIBUTE:
        getSelectAttribute().clear();
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
      case SqlviewPackage.SELECT__SELECT:
        return select != null && !select.isEmpty();
      case SqlviewPackage.SELECT__SELECT_ATTRIBUTE:
        return selectAttribute != null && !selectAttribute.isEmpty();
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
    result.append(" (select: ");
    result.append(select);
    result.append(')');
    return result.toString();
  }

} //SelectImpl
