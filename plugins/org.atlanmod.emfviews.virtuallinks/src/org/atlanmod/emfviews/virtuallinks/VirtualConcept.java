/**
 */
package org.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Virtual
 * Concept</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualConcept#getSuperConcepts
 * <em>Super Concepts</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualConcept#getSubConcepts
 * <em>Sub Concepts</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualConcept()
 * @model
 * @generated
 */
public interface VirtualConcept extends VirtualLink, VirtualElement, Concept {
  /**
   * Returns the value of the '<em><b>Super Concepts</b></em>' reference list.
   * The list contents are of type
   * {@link org.atlanmod.emfviews.virtuallinks.Concept}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Concepts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Super Concepts</em>' reference list.
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualConcept_SuperConcepts()
   * @model
   * @generated
   */
  EList<Concept> getSuperConcepts();

  /**
   * Returns the value of the '<em><b>Sub Concepts</b></em>' reference list. The
   * list contents are of type
   * {@link org.atlanmod.emfviews.virtuallinks.Concept}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Concepts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Sub Concepts</em>' reference list.
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualConcept_SubConcepts()
   * @model
   * @generated
   */
  EList<Concept> getSubConcepts();

} // VirtualConcept
