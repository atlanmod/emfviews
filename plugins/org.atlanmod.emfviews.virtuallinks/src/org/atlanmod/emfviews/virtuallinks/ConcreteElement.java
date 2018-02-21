/**
 */
package org.atlanmod.emfviews.virtuallinks;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Concrete Element</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel <em>Model</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.ConcreteElement#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getConcreteElement()
 * @model
 * @generated
 */
public interface ConcreteElement extends Element {
  /**
   * Returns the value of the '<em><b>Model</b></em>' container reference. It is bidirectional and its opposite is
   * '{@link org.atlanmod.emfviews.virtuallinks.ContributingModel#getConcreteElements <em>Concrete Elements</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' container reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Model</em>' container reference.
   * @see #setModel(ContributingModel)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getConcreteElement_Model()
   * @see org.atlanmod.emfviews.virtuallinks.ContributingModel#getConcreteElements
   * @model opposite="concreteElements" required="true" transient="false"
   * @generated
   */
  ContributingModel getModel();

  /**
   * Sets the value of the '{@link org.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel <em>Model</em>}'
   * container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Model</em>' container reference.
   * @see #getModel()
   * @generated
   */
  void setModel(ContributingModel value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getConcreteElement_Path()
   * @model required="true"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.atlanmod.emfviews.virtuallinks.ConcreteElement#getPath <em>Path</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // ConcreteElement
