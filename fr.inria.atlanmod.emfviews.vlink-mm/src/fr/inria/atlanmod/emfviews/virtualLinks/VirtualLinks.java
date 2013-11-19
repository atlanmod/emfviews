/**
 */
package fr.inria.atlanmod.emfviews.virtualLinks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Virtual Links</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks#getVirtualLinks
 * <em>Virtual Links</em>}</li>
 * <li>
 * {@link fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks#getLinkedElements
 * <em>Linked Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getVirtualLinks()
 * @model
 * @generated
 */
public interface VirtualLinks extends EObject {
	/**
	 * Returns the value of the '<em><b>Virtual Links</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Links</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Virtual Links</em>' containment reference
	 *         list.
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getVirtualLinks_VirtualLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualLink> getVirtualLinks();

	/**
	 * Returns the value of the '<em><b>Linked Elements</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Elements</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Linked Elements</em>' containment reference
	 *         list.
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getVirtualLinks_LinkedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkedElement> getLinkedElements();

} // VirtualLinks
