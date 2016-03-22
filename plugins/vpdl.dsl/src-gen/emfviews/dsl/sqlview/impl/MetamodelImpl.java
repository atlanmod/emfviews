/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Metamodel;
import emfviews.dsl.sqlview.MetamodelName;
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
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.MetamodelImpl#getMetamodelURL <em>Metamodel URL</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.MetamodelImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel
{
  /**
   * The cached value of the '{@link #getMetamodelURL() <em>Metamodel URL</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodelURL()
   * @generated
   * @ordered
   */
  protected EList<String> metamodelURL;

  /**
   * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodelName()
   * @generated
   * @ordered
   */
  protected EList<MetamodelName> metamodelName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetamodelImpl()
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
    return SqlviewPackage.Literals.METAMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMetamodelURL()
  {
    if (metamodelURL == null)
    {
      metamodelURL = new EDataTypeEList<String>(String.class, this, SqlviewPackage.METAMODEL__METAMODEL_URL);
    }
    return metamodelURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelName> getMetamodelName()
  {
    if (metamodelName == null)
    {
      metamodelName = new EObjectContainmentEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.METAMODEL__METAMODEL_NAME);
    }
    return metamodelName;
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
      case SqlviewPackage.METAMODEL__METAMODEL_NAME:
        return ((InternalEList<?>)getMetamodelName()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.METAMODEL__METAMODEL_URL:
        return getMetamodelURL();
      case SqlviewPackage.METAMODEL__METAMODEL_NAME:
        return getMetamodelName();
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
      case SqlviewPackage.METAMODEL__METAMODEL_URL:
        getMetamodelURL().clear();
        getMetamodelURL().addAll((Collection<? extends String>)newValue);
        return;
      case SqlviewPackage.METAMODEL__METAMODEL_NAME:
        getMetamodelName().clear();
        getMetamodelName().addAll((Collection<? extends MetamodelName>)newValue);
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
      case SqlviewPackage.METAMODEL__METAMODEL_URL:
        getMetamodelURL().clear();
        return;
      case SqlviewPackage.METAMODEL__METAMODEL_NAME:
        getMetamodelName().clear();
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
      case SqlviewPackage.METAMODEL__METAMODEL_URL:
        return metamodelURL != null && !metamodelURL.isEmpty();
      case SqlviewPackage.METAMODEL__METAMODEL_NAME:
        return metamodelName != null && !metamodelName.isEmpty();
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
    result.append(" (metamodelURL: ");
    result.append(metamodelURL);
    result.append(')');
    return result.toString();
  }

} //MetamodelImpl
