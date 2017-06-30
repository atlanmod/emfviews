/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

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
 * An implementation of the model object '<em><b>Weaving Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getContributingModels <em>Contributing Models</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#isWhitelist <em>Whitelist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeavingModelImpl extends MinimalEObjectImpl.Container implements WeavingModel {
  /**
   * The cached value of the '{@link #getVirtualLinks() <em>Virtual Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtualLinks()
   * @generated
   * @ordered
   */
  protected EList<VirtualLink> virtualLinks;

  /**
   * The cached value of the '{@link #getContributingModels() <em>Contributing Models</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContributingModels()
   * @generated
   * @ordered
   */
  protected EList<ContributingModel> contributingModels;

  /**
   * The default value of the '{@link #isWhitelist() <em>Whitelist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhitelist()
   * @generated
   * @ordered
   */
  protected static final boolean WHITELIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWhitelist() <em>Whitelist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWhitelist()
   * @generated
   * @ordered
   */
  protected boolean whitelist = WHITELIST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeavingModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.WEAVING_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VirtualLink> getVirtualLinks() {
    if (virtualLinks == null) {
      virtualLinks = new EObjectContainmentEList<VirtualLink>(VirtualLink.class, this, VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS);
    }
    return virtualLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributingModel> getContributingModels() {
    if (contributingModels == null) {
      contributingModels = new EObjectContainmentEList<ContributingModel>(ContributingModel.class, this, VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS);
    }
    return contributingModels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWhitelist() {
    return whitelist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhitelist(boolean newWhitelist) {
    boolean oldWhitelist = whitelist;
    whitelist = newWhitelist;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.WEAVING_MODEL__WHITELIST, oldWhitelist, whitelist));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
        return ((InternalEList<?>)getVirtualLinks()).basicRemove(otherEnd, msgs);
      case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
        return ((InternalEList<?>)getContributingModels()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
        return getVirtualLinks();
      case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
        return getContributingModels();
      case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
        return isWhitelist();
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
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
        getVirtualLinks().clear();
        getVirtualLinks().addAll((Collection<? extends VirtualLink>)newValue);
        return;
      case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
        getContributingModels().clear();
        getContributingModels().addAll((Collection<? extends ContributingModel>)newValue);
        return;
      case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
        setWhitelist((Boolean)newValue);
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
      case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
        getVirtualLinks().clear();
        return;
      case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
        getContributingModels().clear();
        return;
      case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
        setWhitelist(WHITELIST_EDEFAULT);
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
      case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
        return virtualLinks != null && !virtualLinks.isEmpty();
      case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
        return contributingModels != null && !contributingModels.isEmpty();
      case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
        return whitelist != WHITELIST_EDEFAULT;
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
    result.append(" (whitelist: ");
    result.append(whitelist);
    result.append(')');
    return result.toString();
  }

} //WeavingModelImpl
