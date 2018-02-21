/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.atlanmod.emfviews.virtuallinks.Concept;
import org.atlanmod.emfviews.virtuallinks.VirtualConcept;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Virtual Concept</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualConceptImpl#getSuperConcepts <em>Super
 * Concepts</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.impl.VirtualConceptImpl#getSubConcepts <em>Sub Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualConceptImpl extends VirtualLinkImpl implements VirtualConcept {
  /**
   * The cached value of the '{@link #getSuperConcepts() <em>Super Concepts</em>}' reference list. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @see #getSuperConcepts()
   * @generated
   * @ordered
   */
  protected EList<Concept> superConcepts;

  /**
   * The cached value of the '{@link #getSubConcepts() <em>Sub Concepts</em>}' reference list. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getSubConcepts()
   * @generated
   * @ordered
   */
  protected EList<Concept> subConcepts;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected VirtualConceptImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.VIRTUAL_CONCEPT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Concept> getSuperConcepts() {
    if (superConcepts == null) {
      superConcepts =
          new EObjectResolvingEList<>(Concept.class, this,
                                             VirtualLinksPackage.VIRTUAL_CONCEPT__SUPER_CONCEPTS);
    }
    return superConcepts;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Concept> getSubConcepts() {
    if (subConcepts == null) {
      subConcepts =
          new EObjectResolvingEList<>(Concept.class, this,
                                             VirtualLinksPackage.VIRTUAL_CONCEPT__SUB_CONCEPTS);
    }
    return subConcepts;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUPER_CONCEPTS:
      return getSuperConcepts();
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUB_CONCEPTS:
      return getSubConcepts();
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
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUPER_CONCEPTS:
      getSuperConcepts().clear();
      getSuperConcepts().addAll((Collection<? extends Concept>) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUB_CONCEPTS:
      getSubConcepts().clear();
      getSubConcepts().addAll((Collection<? extends Concept>) newValue);
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
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUPER_CONCEPTS:
      getSuperConcepts().clear();
      return;
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUB_CONCEPTS:
      getSubConcepts().clear();
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
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUPER_CONCEPTS:
      return superConcepts != null && !superConcepts.isEmpty();
    case VirtualLinksPackage.VIRTUAL_CONCEPT__SUB_CONCEPTS:
      return subConcepts != null && !subConcepts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // VirtualConceptImpl
