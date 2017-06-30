/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl#getSuperConcepts <em>Super Concepts</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl#getSubConcepts <em>Sub Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewConceptImpl extends VirtualLinkImpl implements NewConcept {
  /**
   * The cached value of the '{@link #getSuperConcepts() <em>Super Concepts</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperConcepts()
   * @generated
   * @ordered
   */
  protected LinkedElement superConcepts;

  /**
   * The cached value of the '{@link #getSubConcepts() <em>Sub Concepts</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubConcepts()
   * @generated
   * @ordered
   */
  protected LinkedElement subConcepts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewConceptImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.NEW_CONCEPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getSuperConcepts() {
    if (superConcepts != null && superConcepts.eIsProxy()) {
      InternalEObject oldSuperConcepts = (InternalEObject)superConcepts;
      superConcepts = (LinkedElement)eResolveProxy(oldSuperConcepts);
      if (superConcepts != oldSuperConcepts) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS, oldSuperConcepts, superConcepts));
      }
    }
    return superConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetSuperConcepts() {
    return superConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperConcepts(LinkedElement newSuperConcepts) {
    LinkedElement oldSuperConcepts = superConcepts;
    superConcepts = newSuperConcepts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS, oldSuperConcepts, superConcepts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement getSubConcepts() {
    if (subConcepts != null && subConcepts.eIsProxy()) {
      InternalEObject oldSubConcepts = (InternalEObject)subConcepts;
      subConcepts = (LinkedElement)eResolveProxy(oldSubConcepts);
      if (subConcepts != oldSubConcepts) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS, oldSubConcepts, subConcepts));
      }
    }
    return subConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedElement basicGetSubConcepts() {
    return subConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubConcepts(LinkedElement newSubConcepts) {
    LinkedElement oldSubConcepts = subConcepts;
    subConcepts = newSubConcepts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS, oldSubConcepts, subConcepts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS:
        if (resolve) return getSuperConcepts();
        return basicGetSuperConcepts();
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        if (resolve) return getSubConcepts();
        return basicGetSubConcepts();
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
      case VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS:
        setSuperConcepts((LinkedElement)newValue);
        return;
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        setSubConcepts((LinkedElement)newValue);
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
      case VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS:
        setSuperConcepts((LinkedElement)null);
        return;
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        setSubConcepts((LinkedElement)null);
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
      case VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS:
        return superConcepts != null;
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        return subConcepts != null;
    }
    return super.eIsSet(featureID);
  }

} //NewConceptImpl
