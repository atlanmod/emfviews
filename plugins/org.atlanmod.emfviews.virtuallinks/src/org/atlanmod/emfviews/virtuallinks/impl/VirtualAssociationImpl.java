/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.atlanmod.emfviews.virtuallinks.Association;
import org.atlanmod.emfviews.virtuallinks.Concept;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Virtual Association</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#getSource <em>Source</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#getTarget <em>Target</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#getLowerBound <em>Lower
 * Bound</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#getUpperBound <em>Upper
 * Bound</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#getOpposite <em>Opposite</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualAssociationImpl#isComposition
 * <em>Composition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualAssociationImpl extends VirtualLinkImpl implements VirtualAssociation {
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Concept source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Concept target;

  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected Association opposite;

  /**
   * The default value of the '{@link #isComposition() <em>Composition</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #isComposition()
   * @generated
   * @ordered
   */
  protected static final boolean COMPOSITION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isComposition() <em>Composition</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #isComposition()
   * @generated
   * @ordered
   */
  protected boolean composition = COMPOSITION_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected VirtualAssociationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.VIRTUAL_ASSOCIATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Concept getSource() {
    if (source != null && source.eIsProxy()) {
      InternalEObject oldSource = (InternalEObject) source;
      source = (Concept) eResolveProxy(oldSource);
      if (source != oldSource) {
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE, oldSource,
                                        source));
        }
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public Concept basicGetSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setSource(Concept newSource) {
    Concept oldSource = source;
    source = newSource;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE, oldSource,
                                    source));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Concept getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject) target;
      target = (Concept) eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET, oldTarget,
                                        target));
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
  public Concept basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setTarget(Concept newTarget) {
    Concept oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET, oldTarget,
                                    target));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getLowerBound() {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setLowerBound(int newLowerBound) {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__LOWER_BOUND,
                                    oldLowerBound, lowerBound));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getUpperBound() {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setUpperBound(int newUpperBound) {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__UPPER_BOUND,
                                    oldUpperBound, upperBound));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Association getOpposite() {
    if (opposite != null && opposite.eIsProxy()) {
      InternalEObject oldOpposite = (InternalEObject) opposite;
      opposite = (Association) eResolveProxy(oldOpposite);
      if (opposite != oldOpposite) {
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE,
                                        oldOpposite, opposite));
        }
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public Association basicGetOpposite() {
    return opposite;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setOpposite(Association newOpposite) {
    Association oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE, oldOpposite,
                                    opposite));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean isComposition() {
    return composition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setComposition(boolean newComposition) {
    boolean oldComposition = composition;
    composition = newComposition;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_ASSOCIATION__COMPOSITION,
                                    oldComposition, composition));
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
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE:
      if (resolve) {
        return getSource();
      }
      return basicGetSource();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET:
      if (resolve) {
        return getTarget();
      }
      return basicGetTarget();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__LOWER_BOUND:
      return getLowerBound();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__UPPER_BOUND:
      return getUpperBound();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE:
      if (resolve) {
        return getOpposite();
      }
      return basicGetOpposite();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__COMPOSITION:
      return isComposition();
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
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE:
      setSource((Concept) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET:
      setTarget((Concept) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__LOWER_BOUND:
      setLowerBound((Integer) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__UPPER_BOUND:
      setUpperBound((Integer) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE:
      setOpposite((Association) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__COMPOSITION:
      setComposition((Boolean) newValue);
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
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE:
      setSource((Concept) null);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET:
      setTarget((Concept) null);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__LOWER_BOUND:
      setLowerBound(LOWER_BOUND_EDEFAULT);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__UPPER_BOUND:
      setUpperBound(UPPER_BOUND_EDEFAULT);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE:
      setOpposite((Association) null);
      return;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__COMPOSITION:
      setComposition(COMPOSITION_EDEFAULT);
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
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__SOURCE:
      return source != null;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__TARGET:
      return target != null;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__LOWER_BOUND:
      return lowerBound != LOWER_BOUND_EDEFAULT;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__UPPER_BOUND:
      return upperBound != UPPER_BOUND_EDEFAULT;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__OPPOSITE:
      return opposite != null;
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION__COMPOSITION:
      return composition != COMPOSITION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(", composition: ");
    result.append(composition);
    result.append(')');
    return result.toString();
  }

} // VirtualAssociationImpl
