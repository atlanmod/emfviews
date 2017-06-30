/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weaving Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getContributingModels <em>Contributing Models</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#isWhitelist <em>Whitelist</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel()
 * @model
 * @generated
 */
public interface WeavingModel extends EObject {
  /**
   * Returns the value of the '<em><b>Virtual Links</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Links</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Links</em>' containment reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_VirtualLinks()
   * @model containment="true"
   * @generated
   */
  EList<VirtualLink> getVirtualLinks();

  /**
   * Returns the value of the '<em><b>Contributing Models</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contributing Models</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contributing Models</em>' containment reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_ContributingModels()
   * @model containment="true"
   * @generated
   */
  EList<ContributingModel> getContributingModels();

  /**
   * Returns the value of the '<em><b>Whitelist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whitelist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whitelist</em>' attribute.
   * @see #setWhitelist(boolean)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_Whitelist()
   * @model
   * @generated
   */
  boolean isWhitelist();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#isWhitelist <em>Whitelist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whitelist</em>' attribute.
   * @see #isWhitelist()
   * @generated
   */
  void setWhitelist(boolean value);

} // WeavingModel
