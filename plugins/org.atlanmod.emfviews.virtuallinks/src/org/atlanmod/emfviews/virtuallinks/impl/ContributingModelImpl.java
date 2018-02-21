/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Contributing Model</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl#getURI <em>URI</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl#getConcreteElements <em>Concrete
 * Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributingModelImpl extends MinimalEObjectImpl.Container
    implements ContributingModel {
  /**
   * The default value of the '{@link #getURI() <em>URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getURI()
   * @generated
   * @ordered
   */
  protected static final String URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getURI() <em>URI</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getURI()
   * @generated
   * @ordered
   */
  protected String uri = URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getConcreteElements() <em>Concrete Elements</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getConcreteElements()
   * @generated
   * @ordered
   */
  protected EList<ConcreteElement> concreteElements;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected ContributingModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.CONTRIBUTING_MODEL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getURI() {
    return uri;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setURI(String newURI) {
    String oldURI = uri;
    uri = newURI;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.CONTRIBUTING_MODEL__URI, oldURI, uri));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<ConcreteElement> getConcreteElements() {
    if (concreteElements == null) {
      concreteElements =
          new EObjectContainmentWithInverseEList<>(ConcreteElement.class, this,
                                                                  VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS,
                                                                  VirtualLinksPackage.CONCRETE_ELEMENT__MODEL);
    }
    return concreteElements;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
                                       NotificationChain msgs) {
    switch (featureID) {
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      return ((InternalEList<InternalEObject>) (InternalEList<?>) getConcreteElements())
          .basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
                                          NotificationChain msgs) {
    switch (featureID) {
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      return ((InternalEList<?>) getConcreteElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.CONTRIBUTING_MODEL__URI:
      return getURI();
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      return getConcreteElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case VirtualLinksPackage.CONTRIBUTING_MODEL__URI:
      setURI((String) newValue);
      return;
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      getConcreteElements().clear();
      getConcreteElements().addAll((Collection<? extends ConcreteElement>) newValue);
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
    case VirtualLinksPackage.CONTRIBUTING_MODEL__URI:
      setURI(URI_EDEFAULT);
      return;
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      getConcreteElements().clear();
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
    case VirtualLinksPackage.CONTRIBUTING_MODEL__URI:
      return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
    case VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS:
      return concreteElements != null && !concreteElements.isEmpty();
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
    result.append(" (URI: ");
    result.append(uri);
    result.append(')');
    return result.toString();
  }

} // ContributingModelImpl
