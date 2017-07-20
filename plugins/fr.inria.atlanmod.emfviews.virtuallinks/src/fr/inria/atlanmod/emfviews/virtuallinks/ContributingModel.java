/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Contributing Model</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getURI <em>URI</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getConcreteElements <em>Concrete
 * Elements</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getContributingModel()
 * @model
 * @generated
 */
public interface ContributingModel extends EObject {
  /**
   * Returns the value of the '<em><b>URI</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>URI</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>URI</em>' attribute.
   * @see #setURI(String)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getContributingModel_URI()
   * @model required="true"
   * @generated
   */
  String getURI();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getURI <em>URI</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>URI</em>' attribute.
   * @see #getURI()
   * @generated
   */
  void setURI(String value);

  /**
   * Returns the value of the '<em><b>Concrete Elements</b></em>' containment reference list. The list contents are of
   * type {@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement}. It is bidirectional and its opposite is
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel <em>Model</em>}'. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concrete Elements</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Concrete Elements</em>' containment reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getContributingModel_ConcreteElements()
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel
   * @model opposite="model" containment="true"
   * @generated
   */
  EList<ConcreteElement> getConcreteElements();

} // ContributingModel
