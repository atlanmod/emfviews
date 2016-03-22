/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Join;
import emfviews.dsl.sqlview.JoinLeft;
import emfviews.dsl.sqlview.JoinRight;
import emfviews.dsl.sqlview.Relation;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinImpl#getJoinLeft <em>Join Left</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinImpl#getJoinRight <em>Join Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.JoinImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends MinimalEObjectImpl.Container implements Join
{
  /**
   * The cached value of the '{@link #getJoinLeft() <em>Join Left</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinLeft()
   * @generated
   * @ordered
   */
  protected EList<JoinLeft> joinLeft;

  /**
   * The cached value of the '{@link #getJoinRight() <em>Join Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinRight()
   * @generated
   * @ordered
   */
  protected EList<JoinRight> joinRight;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected EList<Relation> relation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinImpl()
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
    return SqlviewPackage.Literals.JOIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinLeft> getJoinLeft()
  {
    if (joinLeft == null)
    {
      joinLeft = new EObjectContainmentEList<JoinLeft>(JoinLeft.class, this, SqlviewPackage.JOIN__JOIN_LEFT);
    }
    return joinLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JoinRight> getJoinRight()
  {
    if (joinRight == null)
    {
      joinRight = new EObjectContainmentEList<JoinRight>(JoinRight.class, this, SqlviewPackage.JOIN__JOIN_RIGHT);
    }
    return joinRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getRelation()
  {
    if (relation == null)
    {
      relation = new EObjectContainmentEList<Relation>(Relation.class, this, SqlviewPackage.JOIN__RELATION);
    }
    return relation;
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
      case SqlviewPackage.JOIN__JOIN_LEFT:
        return ((InternalEList<?>)getJoinLeft()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.JOIN__JOIN_RIGHT:
        return ((InternalEList<?>)getJoinRight()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.JOIN__RELATION:
        return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.JOIN__JOIN_LEFT:
        return getJoinLeft();
      case SqlviewPackage.JOIN__JOIN_RIGHT:
        return getJoinRight();
      case SqlviewPackage.JOIN__RELATION:
        return getRelation();
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
      case SqlviewPackage.JOIN__JOIN_LEFT:
        getJoinLeft().clear();
        getJoinLeft().addAll((Collection<? extends JoinLeft>)newValue);
        return;
      case SqlviewPackage.JOIN__JOIN_RIGHT:
        getJoinRight().clear();
        getJoinRight().addAll((Collection<? extends JoinRight>)newValue);
        return;
      case SqlviewPackage.JOIN__RELATION:
        getRelation().clear();
        getRelation().addAll((Collection<? extends Relation>)newValue);
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
      case SqlviewPackage.JOIN__JOIN_LEFT:
        getJoinLeft().clear();
        return;
      case SqlviewPackage.JOIN__JOIN_RIGHT:
        getJoinRight().clear();
        return;
      case SqlviewPackage.JOIN__RELATION:
        getRelation().clear();
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
      case SqlviewPackage.JOIN__JOIN_LEFT:
        return joinLeft != null && !joinLeft.isEmpty();
      case SqlviewPackage.JOIN__JOIN_RIGHT:
        return joinRight != null && !joinRight.isEmpty();
      case SqlviewPackage.JOIN__RELATION:
        return relation != null && !relation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JoinImpl
