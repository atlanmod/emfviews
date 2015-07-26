/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.Select;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.SelectImpl#getAttribute <em>Attribute</em>}</li>
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
  public EList<MetamodelName> getMetamodel()
  {
    if (metamodel == null)
    {
      metamodel = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.SELECT__METAMODEL);
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
      class_ = new EObjectContainmentEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.SELECT__CLASS);
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
      attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, SqlviewPackage.SELECT__ATTRIBUTE);
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
      case SqlviewPackage.SELECT__CLASS:
        return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.SELECT__ATTRIBUTE:
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
      case SqlviewPackage.SELECT__SELECT:
        return getSelect();
      case SqlviewPackage.SELECT__METAMODEL:
        return getMetamodel();
      case SqlviewPackage.SELECT__CLASS:
        return getClass_();
      case SqlviewPackage.SELECT__ATTRIBUTE:
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
      case SqlviewPackage.SELECT__SELECT:
        getSelect().clear();
        getSelect().addAll((Collection<? extends String>)newValue);
        return;
      case SqlviewPackage.SELECT__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.SELECT__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
        return;
      case SqlviewPackage.SELECT__ATTRIBUTE:
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
      case SqlviewPackage.SELECT__SELECT:
        getSelect().clear();
        return;
      case SqlviewPackage.SELECT__METAMODEL:
        getMetamodel().clear();
        return;
      case SqlviewPackage.SELECT__CLASS:
        getClass_().clear();
        return;
      case SqlviewPackage.SELECT__ATTRIBUTE:
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
      case SqlviewPackage.SELECT__SELECT:
        return select != null && !select.isEmpty();
      case SqlviewPackage.SELECT__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case SqlviewPackage.SELECT__CLASS:
        return class_ != null && !class_.isEmpty();
      case SqlviewPackage.SELECT__ATTRIBUTE:
        return attribute != null && !attribute.isEmpty();
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
