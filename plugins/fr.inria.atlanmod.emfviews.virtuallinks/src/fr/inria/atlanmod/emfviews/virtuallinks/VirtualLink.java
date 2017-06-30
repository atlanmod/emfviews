/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualLink()
 * @model abstract="true"
 * @generated
 */
public interface VirtualLink extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualLink_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VirtualLink
