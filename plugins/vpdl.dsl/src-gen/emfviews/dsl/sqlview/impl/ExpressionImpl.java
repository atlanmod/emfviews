/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Condition;
import emfviews.dsl.sqlview.Expression;
import emfviews.dsl.sqlview.From;
import emfviews.dsl.sqlview.Select;
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
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.ExpressionImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.ExpressionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.ExpressionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect()
   * @generated
   * @ordered
   */
  protected EList<Select> select;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected EList<From> from;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected EList<Condition> condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return SqlviewPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Select> getSelect()
  {
    if (select == null)
    {
      select = new EObjectContainmentEList<Select>(Select.class, this, SqlviewPackage.EXPRESSION__SELECT);
    }
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<From> getFrom()
  {
    if (from == null)
    {
      from = new EObjectContainmentEList<From>(From.class, this, SqlviewPackage.EXPRESSION__FROM);
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getCondition()
  {
    if (condition == null)
    {
      condition = new EObjectContainmentEList<Condition>(Condition.class, this, SqlviewPackage.EXPRESSION__CONDITION);
    }
    return condition;
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
      case SqlviewPackage.EXPRESSION__SELECT:
        return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.EXPRESSION__FROM:
        return ((InternalEList<?>)getFrom()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.EXPRESSION__CONDITION:
        return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.EXPRESSION__SELECT:
        return getSelect();
      case SqlviewPackage.EXPRESSION__FROM:
        return getFrom();
      case SqlviewPackage.EXPRESSION__CONDITION:
        return getCondition();
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
      case SqlviewPackage.EXPRESSION__SELECT:
        getSelect().clear();
        getSelect().addAll((Collection<? extends Select>)newValue);
        return;
      case SqlviewPackage.EXPRESSION__FROM:
        getFrom().clear();
        getFrom().addAll((Collection<? extends From>)newValue);
        return;
      case SqlviewPackage.EXPRESSION__CONDITION:
        getCondition().clear();
        getCondition().addAll((Collection<? extends Condition>)newValue);
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
      case SqlviewPackage.EXPRESSION__SELECT:
        getSelect().clear();
        return;
      case SqlviewPackage.EXPRESSION__FROM:
        getFrom().clear();
        return;
      case SqlviewPackage.EXPRESSION__CONDITION:
        getCondition().clear();
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
      case SqlviewPackage.EXPRESSION__SELECT:
        return select != null && !select.isEmpty();
      case SqlviewPackage.EXPRESSION__FROM:
        return from != null && !from.isEmpty();
      case SqlviewPackage.EXPRESSION__CONDITION:
        return condition != null && !condition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
