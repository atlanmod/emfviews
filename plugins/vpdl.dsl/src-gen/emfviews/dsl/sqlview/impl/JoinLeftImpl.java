/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.JoinLeft;
import emfviews.dsl.sqlview.MetamodelName;
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
 * An implementation of the model object '<em><b>Join Left</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinLeftImpl#getMetamodelLeft <em>Metamodel Left</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinLeftImpl#getClassLeft <em>Class Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinLeftImpl extends MinimalEObjectImpl.Container implements JoinLeft
{
  /**
   * The cached value of the '{@link #getMetamodelLeft() <em>Metamodel Left</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodelLeft()
   * @generated
   * @ordered
   */
  protected EList<MetamodelName> metamodelLeft;

  /**
   * The cached value of the '{@link #getClassLeft() <em>Class Left</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassLeft()
   * @generated
   * @ordered
   */
  protected EList<emfviews.dsl.sqlview.Class> classLeft;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinLeftImpl()
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
    return SqlviewPackage.Literals.JOIN_LEFT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelName> getMetamodelLeft()
  {
    if (metamodelLeft == null)
    {
      metamodelLeft = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.JOIN_LEFT__METAMODEL_LEFT);
    }
    return metamodelLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<emfviews.dsl.sqlview.Class> getClassLeft()
  {
    if (classLeft == null)
    {
      classLeft = new EObjectContainmentEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.JOIN_LEFT__CLASS_LEFT);
    }
    return classLeft;
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
      case SqlviewPackage.JOIN_LEFT__CLASS_LEFT:
        return ((InternalEList<?>)getClassLeft()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.JOIN_LEFT__METAMODEL_LEFT:
        return getMetamodelLeft();
      case SqlviewPackage.JOIN_LEFT__CLASS_LEFT:
        return getClassLeft();
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
      case SqlviewPackage.JOIN_LEFT__METAMODEL_LEFT:
        getMetamodelLeft().clear();
        getMetamodelLeft().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.JOIN_LEFT__CLASS_LEFT:
        getClassLeft().clear();
        getClassLeft().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
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
      case SqlviewPackage.JOIN_LEFT__METAMODEL_LEFT:
        getMetamodelLeft().clear();
        return;
      case SqlviewPackage.JOIN_LEFT__CLASS_LEFT:
        getClassLeft().clear();
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
      case SqlviewPackage.JOIN_LEFT__METAMODEL_LEFT:
        return metamodelLeft != null && !metamodelLeft.isEmpty();
      case SqlviewPackage.JOIN_LEFT__CLASS_LEFT:
        return classLeft != null && !classLeft.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JoinLeftImpl
