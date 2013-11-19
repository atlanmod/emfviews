/**
 */
package fr.inria.atlanmod.emfviews.virtualLinks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage
 * @generated
 */
public interface VirtualLinksFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	VirtualLinksFactory eINSTANCE = fr.inria.atlanmod.emfviews.virtualLinks.impl.VirtualLinksFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Virtual Links</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Virtual Links</em>'.
	 * @generated
	 */
	VirtualLinks createVirtualLinks();

	/**
	 * Returns a new object of class '<em>Linked Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Linked Element</em>'.
	 * @generated
	 */
	LinkedElement createLinkedElement();

	/**
	 * Returns a new object of class '<em>Association</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association</em>'.
	 * @generated
	 */
	Association createAssociation();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	VirtualLinksPackage getVirtualLinksPackage();

} // VirtualLinksFactory
