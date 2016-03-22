/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.JoinRight;
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
 * An implementation of the model object '<em><b>Join Right</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinRightImpl#getMetamodelRight <em>Metamodel Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinRightImpl#getClassRight <em>Class Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinRightImpl extends MinimalEObjectImpl.Container implements JoinRight
{
  /**
   * The cached value of the '{@link #getMetamodelRight() <em>Metamodel Right</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodelRight()
   * @generated
   * @ordered
   */
  protected EList<MetamodelName> metamodelRight;

  /**
   * The cached value of the '{@link #getClassRight() <em>Class Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRight()
   * @generated
   * @ordered
   */
  protected EList<emfviews.dsl.sqlview.Class> classRight;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinRightImpl()
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
    return SqlviewPackage.Literals.JOIN_RIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetamodelName> getMetamodelRight()
  {
    if (metamodelRight == null)
    {
      metamodelRight = new EObjectResolvingEList<MetamodelName>(MetamodelName.class, this, SqlviewPackage.JOIN_RIGHT__METAMODEL_RIGHT);
    }
    return metamodelRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<emfviews.dsl.sqlview.Class> getClassRight()
  {
    if (classRight == null)
    {
      classRight = new EObjectContainmentEList<emfviews.dsl.sqlview.Class>(emfviews.dsl.sqlview.Class.class, this, SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT);
    }
    return classRight;
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
      case SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT:
        return ((InternalEList<?>)getClassRight()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.JOIN_RIGHT__METAMODEL_RIGHT:
        return getMetamodelRight();
      case SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT:
        return getClassRight();
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
      case SqlviewPackage.JOIN_RIGHT__METAMODEL_RIGHT:
        getMetamodelRight().clear();
        getMetamodelRight().addAll((Collection<? extends MetamodelName>)newValue);
        return;
      case SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT:
        getClassRight().clear();
        getClassRight().addAll((Collection<? extends emfviews.dsl.sqlview.Class>)newValue);
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
      case SqlviewPackage.JOIN_RIGHT__METAMODEL_RIGHT:
        getMetamodelRight().clear();
        return;
      case SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT:
        getClassRight().clear();
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
      case SqlviewPackage.JOIN_RIGHT__METAMODEL_RIGHT:
        return metamodelRight != null && !metamodelRight.isEmpty();
      case SqlviewPackage.JOIN_RIGHT__CLASS_RIGHT:
        return classRight != null && !classRight.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JoinRightImpl
