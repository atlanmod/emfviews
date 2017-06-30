/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewPropertyImpl extends VirtualLinkImpl implements NewProperty {
  /**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
  protected LinkedElement parent;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewPropertyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.NEW_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getParent() {
    if (parent != null && parent.eIsProxy()) {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (LinkedElement)eResolveProxy(oldParent);
      if (parent != oldParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_PROPERTY__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetParent() {
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(LinkedElement newParent) {
    LinkedElement oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_PROPERTY__PARENT, oldParent, parent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType) {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_PROPERTY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional() {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional) {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_PROPERTY__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_PROPERTY__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case VirtualLinksPackage.NEW_PROPERTY__TYPE:
        return getType();
      case VirtualLinksPackage.NEW_PROPERTY__OPTIONAL:
        return isOptional();
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
      case VirtualLinksPackage.NEW_PROPERTY__PARENT:
        setParent((LinkedElement)newValue);
        return;
      case VirtualLinksPackage.NEW_PROPERTY__TYPE:
        setType((String)newValue);
        return;
      case VirtualLinksPackage.NEW_PROPERTY__OPTIONAL:
        setOptional((Boolean)newValue);
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
      case VirtualLinksPackage.NEW_PROPERTY__PARENT:
        setParent((LinkedElement)null);
        return;
      case VirtualLinksPackage.NEW_PROPERTY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case VirtualLinksPackage.NEW_PROPERTY__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
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
      case VirtualLinksPackage.NEW_PROPERTY__PARENT:
        return parent != null;
      case VirtualLinksPackage.NEW_PROPERTY__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case VirtualLinksPackage.NEW_PROPERTY__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", optional: ");
    result.append(optional);
    result.append(')');
    return result.toString();
  }

} //NewPropertyImpl
