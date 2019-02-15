/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualConcept;
import org.atlanmod.emfviews.virtuallinks.VirtualElement;
import org.atlanmod.emfviews.virtuallinks.VirtualLink;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import org.atlanmod.emfviews.virtuallinks.VirtualProperty;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Weaving
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualLinks
 * <em>Virtual Links</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getContributingModels
 * <em>Contributing Models</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#isWhitelist
 * <em>Whitelist</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualConcepts
 * <em>Virtual Concepts</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualProperties
 * <em>Virtual Properties</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualAssociations
 * <em>Virtual Associations</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualElements
 * <em>Virtual Elements</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getFilters
 * <em>Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeavingModelImpl extends MinimalEObjectImpl.Container implements WeavingModel {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVirtualLinks() <em>Virtual Links</em>}'
   * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getVirtualLinks()
   * @generated
   * @ordered
   */
  protected EList<VirtualLink> virtualLinks;

  /**
   * The cached value of the '{@link #getContributingModels() <em>Contributing
   * Models</em>}' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @see #getContributingModels()
   * @generated
   * @ordered
   */
  protected EList<ContributingModel> contributingModels;

  /**
   * The default value of the '{@link #isWhitelist() <em>Whitelist</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #isWhitelist()
   * @generated
   * @ordered
   */
  protected static final boolean WHITELIST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWhitelist() <em>Whitelist</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #isWhitelist()
   * @generated
   * @ordered
   */
  protected boolean whitelist = WHITELIST_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected WeavingModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.WEAVING_MODEL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
        VirtualLinksPackage.WEAVING_MODEL__NAME, oldName, name));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<VirtualLink> getVirtualLinks() {
    if (virtualLinks == null) {
      virtualLinks = new EObjectContainmentEList<>(VirtualLink.class, this,
        VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS);
    }
    return virtualLinks;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<ContributingModel> getContributingModels() {
    if (contributingModels == null) {
      contributingModels = new EObjectContainmentEList<>(ContributingModel.class,
        this, VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS);
    }
    return contributingModels;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean isWhitelist() {
    return whitelist;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setWhitelist(boolean newWhitelist) {
    boolean oldWhitelist = whitelist;
    whitelist = newWhitelist;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
        VirtualLinksPackage.WEAVING_MODEL__WHITELIST, oldWhitelist, whitelist));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<VirtualConcept> getVirtualConcepts() {
    ArrayList<VirtualConcept> virtualConcepts = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof VirtualConcept) {
        virtualConcepts.add((VirtualConcept) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
      VirtualLinksPackage.eINSTANCE.getWeavingModel_VirtualConcepts(), virtualConcepts.size(),
      virtualConcepts.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<VirtualProperty> getVirtualProperties() {
    ArrayList<VirtualProperty> virtualProperties = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof VirtualProperty) {
        virtualProperties.add((VirtualProperty) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
      VirtualLinksPackage.eINSTANCE.getWeavingModel_VirtualProperties(), virtualProperties.size(),
      virtualProperties.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<VirtualAssociation> getVirtualAssociations() {
    ArrayList<VirtualAssociation> virtualAssociations = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof VirtualAssociation) {
        virtualAssociations.add((VirtualAssociation) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
      VirtualLinksPackage.eINSTANCE.getWeavingModel_VirtualAssociations(),
      virtualAssociations.size(), virtualAssociations.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<VirtualElement> getVirtualElements() {
    ArrayList<VirtualElement> virtualElements = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof VirtualElement) {
        virtualElements.add((VirtualElement) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
      VirtualLinksPackage.eINSTANCE.getWeavingModel_VirtualElements(), virtualElements.size(),
      virtualElements.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<Filter> getFilters() {
    ArrayList<Filter> filters = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof Filter) {
        filters.add((Filter) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
      VirtualLinksPackage.eINSTANCE.getWeavingModel_Filters(), filters.size(), filters.toArray());
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
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      return ((InternalEList<?>) getVirtualLinks()).basicRemove(otherEnd, msgs);
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      return ((InternalEList<?>) getContributingModels()).basicRemove(otherEnd, msgs);
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
    case VirtualLinksPackage.WEAVING_MODEL__NAME:
      return getName();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      return getVirtualLinks();
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      return getContributingModels();
    case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
      return isWhitelist();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_CONCEPTS:
      return getVirtualConcepts();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_PROPERTIES:
      return getVirtualProperties();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_ASSOCIATIONS:
      return getVirtualAssociations();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_ELEMENTS:
      return getVirtualElements();
    case VirtualLinksPackage.WEAVING_MODEL__FILTERS:
      return getFilters();
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
    case VirtualLinksPackage.WEAVING_MODEL__NAME:
      setName((String) newValue);
      return;
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      getVirtualLinks().clear();
      getVirtualLinks().addAll((Collection<? extends VirtualLink>) newValue);
      return;
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      getContributingModels().clear();
      getContributingModels().addAll((Collection<? extends ContributingModel>) newValue);
      return;
    case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
      setWhitelist((Boolean) newValue);
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
    case VirtualLinksPackage.WEAVING_MODEL__NAME:
      setName(NAME_EDEFAULT);
      return;
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.WEAVING_MODEL__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      return virtualLinks != null && !virtualLinks.isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      return contributingModels != null && !contributingModels.isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
      return whitelist != WHITELIST_EDEFAULT;
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_CONCEPTS:
      return !getVirtualConcepts().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_PROPERTIES:
      return !getVirtualProperties().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_ASSOCIATIONS:
      return !getVirtualAssociations().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_ELEMENTS:
      return !getVirtualElements().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__FILTERS:
      return !getFilters().isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", whitelist: ");
    result.append(whitelist);
    result.append(')');
    return result.toString();
  }

} // WeavingModelImpl
