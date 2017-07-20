/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.inria.atlanmod.emfviews.virtuallinks.Concept;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Virtual Property</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualPropertyImpl#getParent <em>Parent</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualPropertyImpl#getType <em>Type</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualPropertyImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualPropertyImpl extends VirtualLinkImpl implements VirtualProperty {
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected Concept parent;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected VirtualPropertyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.VIRTUAL_PROPERTY;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Concept getParent() {
    if (parent != null && parent.eIsProxy()) {
      InternalEObject oldParent = (InternalEObject) parent;
      parent = (Concept) eResolveProxy(oldParent);
      if (parent != oldParent) {
        if (eNotificationRequired()) {
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT, oldParent,
                                        parent));
        }
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public Concept basicGetParent() {
    return parent;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setParent(Concept newParent) {
    Concept oldParent = parent;
    parent = newParent;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT, oldParent,
                                    parent));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_PROPERTY__TYPE, oldType, type));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean isOptional() {
    return optional;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.VIRTUAL_PROPERTY__OPTIONAL, oldOptional,
                                    optional));
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
    case VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT:
      if (resolve) {
        return getParent();
      }
      return basicGetParent();
    case VirtualLinksPackage.VIRTUAL_PROPERTY__TYPE:
      return getType();
    case VirtualLinksPackage.VIRTUAL_PROPERTY__OPTIONAL:
      return isOptional();
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
    case VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT:
      setParent((Concept) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_PROPERTY__TYPE:
      setType((String) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_PROPERTY__OPTIONAL:
      setOptional((Boolean) newValue);
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
    case VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT:
      setParent((Concept) null);
      return;
    case VirtualLinksPackage.VIRTUAL_PROPERTY__TYPE:
      setType(TYPE_EDEFAULT);
      return;
    case VirtualLinksPackage.VIRTUAL_PROPERTY__OPTIONAL:
      setOptional(OPTIONAL_EDEFAULT);
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
    case VirtualLinksPackage.VIRTUAL_PROPERTY__PARENT:
      return parent != null;
    case VirtualLinksPackage.VIRTUAL_PROPERTY__TYPE:
      return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
    case VirtualLinksPackage.VIRTUAL_PROPERTY__OPTIONAL:
      return optional != OPTIONAL_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", optional: ");
    result.append(optional);
    result.append(')');
    return result.toString();
  }

} // VirtualPropertyImpl
