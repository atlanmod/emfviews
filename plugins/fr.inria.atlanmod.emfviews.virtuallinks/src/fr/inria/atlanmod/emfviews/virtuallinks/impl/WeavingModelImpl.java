/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

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

import fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.NewProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Weaving
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getVirtualLinks
 * <em>Virtual Links</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getContributingModels
 * <em>Contributing Models</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#isWhitelist
 * <em>Whitelist</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getNewConcepts
 * <em>New Concepts</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getNewProperties
 * <em>New Properties</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getNewAssociations
 * <em>New Associations</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl#getElementFilters
 * <em>Element Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeavingModelImpl extends MinimalEObjectImpl.Container implements WeavingModel {
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
  public EList<VirtualLink> getVirtualLinks() {
    if (virtualLinks == null) {
      virtualLinks =
          new EObjectContainmentEList<>(VirtualLink.class, this,
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
      contributingModels =
          new EObjectContainmentEList<>(ContributingModel.class, this,
                                        VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS);
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
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.WEAVING_MODEL__WHITELIST, oldWhitelist,
                                    whitelist));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<NewConcept> getNewConcepts() {
    ArrayList<NewConcept> newConcepts = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof NewConcept) {
        newConcepts.add((NewConcept) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
                                              VirtualLinksPackage.eINSTANCE
                                                  .getWeavingModel_NewConcepts(),
                                              newConcepts.size(), newConcepts.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<NewProperty> getNewProperties() {
    ArrayList<NewProperty> newProperties = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof NewProperty) {
        newProperties.add((NewProperty) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
                                              VirtualLinksPackage.eINSTANCE
                                                  .getWeavingModel_NewProperties(),
                                              newProperties.size(), newProperties.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<NewAssociation> getNewAssociations() {
    ArrayList<NewAssociation> newAssociations = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof NewAssociation) {
        newAssociations.add((NewAssociation) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
                                              VirtualLinksPackage.eINSTANCE
                                                  .getWeavingModel_NewAssociations(),
                                              newAssociations.size(), newAssociations.toArray());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated NOT
   */
  @Override
  public EList<ElementFilter> getElementFilters() {
    ArrayList<ElementFilter> elementFilters = new ArrayList<>();
    for (VirtualLink l : getVirtualLinks()) {
      if (l instanceof ElementFilter) {
        elementFilters.add((ElementFilter) l);
      }
    }
    return new EcoreEList.UnmodifiableEList<>(this,
                                              VirtualLinksPackage.eINSTANCE
                                                  .getWeavingModel_ElementFilters(),
                                              elementFilters.size(), elementFilters.toArray());
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
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      return getVirtualLinks();
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      return getContributingModels();
    case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
      return isWhitelist();
    case VirtualLinksPackage.WEAVING_MODEL__NEW_CONCEPTS:
      return getNewConcepts();
    case VirtualLinksPackage.WEAVING_MODEL__NEW_PROPERTIES:
      return getNewProperties();
    case VirtualLinksPackage.WEAVING_MODEL__NEW_ASSOCIATIONS:
      return getNewAssociations();
    case VirtualLinksPackage.WEAVING_MODEL__ELEMENT_FILTERS:
      return getElementFilters();
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
    case VirtualLinksPackage.WEAVING_MODEL__VIRTUAL_LINKS:
      return virtualLinks != null && !virtualLinks.isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__CONTRIBUTING_MODELS:
      return contributingModels != null && !contributingModels.isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__WHITELIST:
      return whitelist != WHITELIST_EDEFAULT;
    case VirtualLinksPackage.WEAVING_MODEL__NEW_CONCEPTS:
      return !getNewConcepts().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__NEW_PROPERTIES:
      return !getNewProperties().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__NEW_ASSOCIATIONS:
      return !getNewAssociations().isEmpty();
    case VirtualLinksPackage.WEAVING_MODEL__ELEMENT_FILTERS:
      return !getElementFilters().isEmpty();
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
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (whitelist: ");
    result.append(whitelist);
    result.append(')');
    return result.toString();
  }

} // WeavingModelImpl
