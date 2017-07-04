/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
   * The cached value of the '{@link #getSuperConcepts() <em>Super Concepts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperConcepts()
   * @generated
   * @ordered
   */
  protected EList<LinkedElement> superConcepts;

  /**
   * The cached value of the '{@link #getSubConcepts() <em>Sub Concepts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubConcepts()
   * @generated
   * @ordered
   */
  protected EList<LinkedElement> subConcepts;

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
  public EList<LinkedElement> getSuperConcepts() {
    if (superConcepts == null) {
      superConcepts = new EObjectResolvingEList<LinkedElement>(LinkedElement.class, this, VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS);
    }
    return superConcepts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkedElement> getSubConcepts() {
    if (subConcepts == null) {
      subConcepts = new EObjectResolvingEList<LinkedElement>(LinkedElement.class, this, VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS);
    }
    return subConcepts;
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
        return getSuperConcepts();
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        return getSubConcepts();
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
      case VirtualLinksPackage.NEW_CONCEPT__SUPER_CONCEPTS:
        getSuperConcepts().clear();
        getSuperConcepts().addAll((Collection<? extends LinkedElement>)newValue);
        return;
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        getSubConcepts().clear();
        getSubConcepts().addAll((Collection<? extends LinkedElement>)newValue);
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
        getSuperConcepts().clear();
        return;
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        getSubConcepts().clear();
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
        return superConcepts != null && !superConcepts.isEmpty();
      case VirtualLinksPackage.NEW_CONCEPT__SUB_CONCEPTS:
        return subConcepts != null && !subConcepts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NewConceptImpl
