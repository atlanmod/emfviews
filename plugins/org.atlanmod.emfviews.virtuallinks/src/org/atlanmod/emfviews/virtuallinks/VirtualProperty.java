/**
 */
package org.atlanmod.emfviews.virtuallinks;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Virtual Property</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#getParent <em>Parent</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#getType <em>Type</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualProperty()
 * @model
 * @generated
 */
public interface VirtualProperty extends VirtualLink, VirtualElement {
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Concept)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualProperty_Parent()
   * @model required="true"
   * @generated
   */
  Concept getParent();

  /**
   * Sets the value of the '{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#getParent <em>Parent</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Concept value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualProperty_Type()
   * @model required="true"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#getType <em>Type</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualProperty_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.atlanmod.emfviews.virtuallinks.VirtualProperty#isOptional
   * <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

} // VirtualProperty
