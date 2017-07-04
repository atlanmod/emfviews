/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSuperConcepts <em>Super Concepts</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSubConcepts <em>Sub Concepts</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewConcept()
 * @model
 * @generated
 */
public interface NewConcept extends VirtualLink, VirtualElement {
  /**
   * Returns the value of the '<em><b>Super Concepts</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Concepts</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Concepts</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewConcept_SuperConcepts()
   * @model
   * @generated
   */
  EList<LinkedElement> getSuperConcepts();

  /**
   * Returns the value of the '<em><b>Sub Concepts</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Concepts</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Concepts</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewConcept_SubConcepts()
   * @model
   * @generated
   */
  EList<LinkedElement> getSubConcepts();

} // NewConcept
