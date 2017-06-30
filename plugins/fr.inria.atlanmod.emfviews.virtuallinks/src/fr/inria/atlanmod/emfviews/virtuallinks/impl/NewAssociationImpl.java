/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewAssociationImpl extends VirtualLinkImpl implements NewAssociation {
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected LinkedElement source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected LinkedElement target;

  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected LinkedElement opposite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewAssociationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.NEW_ASSOCIATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getSource() {
    if (source != null && source.eIsProxy()) {
      InternalEObject oldSource = (InternalEObject)source;
      source = (LinkedElement)eResolveProxy(oldSource);
      if (source != oldSource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_ASSOCIATION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(LinkedElement newSource) {
    LinkedElement oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_ASSOCIATION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (LinkedElement)eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_ASSOCIATION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(LinkedElement newTarget) {
    LinkedElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_ASSOCIATION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerBound() {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(int newLowerBound) {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_ASSOCIATION__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpperBound() {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperBound(int newUpperBound) {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_ASSOCIATION__UPPER_BOUND, oldUpperBound, upperBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getOpposite() {
    if (opposite != null && opposite.eIsProxy()) {
      InternalEObject oldOpposite = (InternalEObject)opposite;
      opposite = (LinkedElement)eResolveProxy(oldOpposite);
      if (opposite != oldOpposite) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetOpposite() {
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpposite(LinkedElement newOpposite) {
    LinkedElement oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE, oldOpposite, opposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_ASSOCIATION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case VirtualLinksPackage.NEW_ASSOCIATION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case VirtualLinksPackage.NEW_ASSOCIATION__LOWER_BOUND:
        return getLowerBound();
      case VirtualLinksPackage.NEW_ASSOCIATION__UPPER_BOUND:
        return getUpperBound();
      case VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE:
        if (resolve) return getOpposite();
        return basicGetOpposite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_ASSOCIATION__SOURCE:
        setSource((LinkedElement)newValue);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__TARGET:
        setTarget((LinkedElement)newValue);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__UPPER_BOUND:
        setUpperBound((Integer)newValue);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE:
        setOpposite((LinkedElement)newValue);
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
  public void eUnset(int featureID) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_ASSOCIATION__SOURCE:
        setSource((LinkedElement)null);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__TARGET:
        setTarget((LinkedElement)null);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__UPPER_BOUND:
        setUpperBound(UPPER_BOUND_EDEFAULT);
        return;
      case VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE:
        setOpposite((LinkedElement)null);
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
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_ASSOCIATION__SOURCE:
        return source != null;
      case VirtualLinksPackage.NEW_ASSOCIATION__TARGET:
        return target != null;
      case VirtualLinksPackage.NEW_ASSOCIATION__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case VirtualLinksPackage.NEW_ASSOCIATION__UPPER_BOUND:
        return upperBound != UPPER_BOUND_EDEFAULT;
      case VirtualLinksPackage.NEW_ASSOCIATION__OPPOSITE:
        return opposite != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(')');
    return result.toString();
  }

} //NewAssociationImpl
