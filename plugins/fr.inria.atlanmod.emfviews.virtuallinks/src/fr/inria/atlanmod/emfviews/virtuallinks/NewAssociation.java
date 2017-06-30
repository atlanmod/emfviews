/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation()
 * @model
 * @generated
 */
public interface NewAssociation extends VirtualLink, VirtualElement {
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation_Source()
   * @model required="true"
   * @generated
   */
  LinkedElement getSource();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(LinkedElement value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation_Target()
   * @model required="true"
   * @generated
   */
  LinkedElement getTarget();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(LinkedElement value);

  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation_LowerBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation_UpperBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getUpperBound <em>Upper Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getNewAssociation_Opposite()
   * @model ordered="false"
   * @generated
   */
  LinkedElement getOpposite();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(LinkedElement value);

} // NewAssociation
