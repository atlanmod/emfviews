/**
 */
package fr.inria.atlanmod.emfviews.virtualLinks;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Linked Element</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getElementRef
 * <em>Element Ref</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getModelRef
 * <em>Model Ref</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getName <em>
 * Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getLinkedElement()
 * @model
 * @generated
 */
public interface LinkedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Ref</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Ref</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Element Ref</em>' attribute.
	 * @see #setElementRef(String)
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getLinkedElement_ElementRef()
	 * @model
	 * @generated
	 */
	String getElementRef();

	/**
	 * Sets the value of the '
	 * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getElementRef
	 * <em>Element Ref</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Element Ref</em>' attribute.
	 * @see #getElementRef()
	 * @generated
	 */
	void setElementRef(String value);

	/**
	 * Returns the value of the '<em><b>Model Ref</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Ref</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model Ref</em>' attribute.
	 * @see #setModelRef(String)
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getLinkedElement_ModelRef()
	 * @model
	 * @generated
	 */
	String getModelRef();

	/**
	 * Sets the value of the '
	 * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getModelRef
	 * <em>Model Ref</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Model Ref</em>' attribute.
	 * @see #getModelRef()
	 * @generated
	 */
	void setModelRef(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getLinkedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LinkedElement
