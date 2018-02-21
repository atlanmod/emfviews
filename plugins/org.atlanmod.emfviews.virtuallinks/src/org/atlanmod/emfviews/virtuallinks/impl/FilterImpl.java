/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Filter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.FilterImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends VirtualLinkImpl implements Filter {
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ConcreteElement target;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected FilterImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.FILTER;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ConcreteElement getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject) target;
      target = (ConcreteElement) eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.FILTER__TARGET, oldTarget, target));
        }
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public ConcreteElement basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setTarget(ConcreteElement newTarget) {
    ConcreteElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.FILTER__TARGET,
                                    oldTarget, target));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.FILTER__TARGET:
      if (resolve) {
        return getTarget();
      }
      return basicGetTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case VirtualLinksPackage.FILTER__TARGET:
      setTarget((ConcreteElement) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.FILTER__TARGET:
      setTarget((ConcreteElement) null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.FILTER__TARGET:
      return target != null;
    }
    return super.eIsSet(featureID);
  }

} // FilterImpl
