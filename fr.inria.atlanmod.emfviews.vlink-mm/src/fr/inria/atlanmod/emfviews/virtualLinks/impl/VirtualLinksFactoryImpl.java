/**
 */
package fr.inria.atlanmod.emfviews.virtualLinks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.inria.atlanmod.emfviews.virtualLinks.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualLinksFactoryImpl extends EFactoryImpl implements VirtualLinksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VirtualLinksFactory init() {
		try {
			VirtualLinksFactory theVirtualLinksFactory = (VirtualLinksFactory)EPackage.Registry.INSTANCE.getEFactory(VirtualLinksPackage.eNS_URI);
			if (theVirtualLinksFactory != null) {
				return theVirtualLinksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VirtualLinksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualLinksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VirtualLinksPackage.VIRTUAL_LINKS: return createVirtualLinks();
			case VirtualLinksPackage.LINKED_ELEMENT: return createLinkedElement();
			case VirtualLinksPackage.ASSOCIATION: return createAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualLinks createVirtualLinks() {
		VirtualLinksImpl virtualLinks = new VirtualLinksImpl();
		return virtualLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedElement createLinkedElement() {
		LinkedElementImpl linkedElement = new LinkedElementImpl();
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualLinksPackage getVirtualLinksPackage() {
		return (VirtualLinksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VirtualLinksPackage getPackage() {
		return VirtualLinksPackage.eINSTANCE;
	}

} //VirtualLinksFactoryImpl
