/**
 */
package org.atlanmod.emfviews.virtuallinks;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Filter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.Filter#getTarget
 * <em>Target</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends VirtualLink {
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(ConcreteElement)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getFilter_Target()
   * @model required="true"
   * @generated
   */
  ConcreteElement getTarget();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.Filter#getTarget
   * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(ConcreteElement value);

} // Filter
