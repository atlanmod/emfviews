/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Expression;
import emfviews.dsl.sqlview.Metamodel;
import emfviews.dsl.sqlview.Model;
import emfviews.dsl.sqlview.SqlviewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.impl.ModelImpl#getViewName <em>View Name</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.ModelImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.impl.ModelImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getViewName() <em>View Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewName()
   * @generated
   * @ordered
   */
  protected static final String VIEW_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewName() <em>View Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewName()
   * @generated
   * @ordered
   */
  protected String viewName = VIEW_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected EList<Metamodel> metamodel;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<Expression> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return SqlviewPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewName()
  {
    return viewName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewName(String newViewName)
  {
    String oldViewName = viewName;
    viewName = newViewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlviewPackage.MODEL__VIEW_NAME, oldViewName, viewName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Metamodel> getMetamodel()
  {
    if (metamodel == null)
    {
      metamodel = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, SqlviewPackage.MODEL__METAMODEL);
    }
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<Expression>(Expression.class, this, SqlviewPackage.MODEL__EXPRESSION);
    }
    return expression;
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
      case SqlviewPackage.MODEL__METAMODEL:
        return ((InternalEList<?>)getMetamodel()).basicRemove(otherEnd, msgs);
      case SqlviewPackage.MODEL__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case SqlviewPackage.MODEL__VIEW_NAME:
        return getViewName();
      case SqlviewPackage.MODEL__METAMODEL:
        return getMetamodel();
      case SqlviewPackage.MODEL__EXPRESSION:
        return getExpression();
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
      case SqlviewPackage.MODEL__VIEW_NAME:
        setViewName((String)newValue);
        return;
      case SqlviewPackage.MODEL__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends Metamodel>)newValue);
        return;
      case SqlviewPackage.MODEL__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends Expression>)newValue);
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
      case SqlviewPackage.MODEL__VIEW_NAME:
        setViewName(VIEW_NAME_EDEFAULT);
        return;
      case SqlviewPackage.MODEL__METAMODEL:
        getMetamodel().clear();
        return;
      case SqlviewPackage.MODEL__EXPRESSION:
        getExpression().clear();
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
      case SqlviewPackage.MODEL__VIEW_NAME:
        return VIEW_NAME_EDEFAULT == null ? viewName != null : !VIEW_NAME_EDEFAULT.equals(viewName);
      case SqlviewPackage.MODEL__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case SqlviewPackage.MODEL__EXPRESSION:
        return expression != null && !expression.isEmpty();
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
    result.append(" (viewName: ");
    result.append(viewName);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
