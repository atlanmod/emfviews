/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;


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
   * Returns the value of the '<em><b>Super Concepts</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Concepts</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Concepts</em>' reference.
   * @see #setSuperConcepts(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewConcept_SuperConcepts()
   * @model
   * @generated
   */
  LinkedElement getSuperConcepts();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSuperConcepts <em>Super Concepts</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Concepts</em>' reference.
   * @see #getSuperConcepts()
   * @generated
   */
  void setSuperConcepts(LinkedElement value);

  /**
   * Returns the value of the '<em><b>Sub Concepts</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Concepts</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Concepts</em>' reference.
   * @see #setSubConcepts(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewConcept_SubConcepts()
   * @model
   * @generated
   */
  LinkedElement getSubConcepts();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSubConcepts <em>Sub Concepts</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Concepts</em>' reference.
   * @see #getSubConcepts()
   * @generated
   */
  void setSubConcepts(LinkedElement value);

} // NewConcept
