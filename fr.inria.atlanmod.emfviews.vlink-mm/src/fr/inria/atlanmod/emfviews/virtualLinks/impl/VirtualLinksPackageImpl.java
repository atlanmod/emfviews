/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Juan David Villa Calle - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.virtualLinks.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class VirtualLinksPackageImpl extends EPackageImpl implements
		VirtualLinksPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass virtualLinksEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass linkedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass virtualLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VirtualLinksPackageImpl() {
		super(eNS_URI, VirtualLinksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link VirtualLinksPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VirtualLinksPackage init() {
		if (isInited)
			return (VirtualLinksPackage) EPackage.Registry.INSTANCE
					.getEPackage(VirtualLinksPackage.eNS_URI);

		// Obtain or create and register package
		VirtualLinksPackageImpl theVirtualLinksPackage = (VirtualLinksPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VirtualLinksPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new VirtualLinksPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVirtualLinksPackage.createPackageContents();

		// Initialize created meta-data
		theVirtualLinksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVirtualLinksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VirtualLinksPackage.eNS_URI,
				theVirtualLinksPackage);
		return theVirtualLinksPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVirtualLinks() {
		return virtualLinksEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVirtualLinks_VirtualLinks() {
		return (EReference) virtualLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVirtualLinks_LinkedElements() {
		return (EReference) virtualLinksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLinkedElement() {
		return linkedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLinkedElement_ElementRef() {
		return (EAttribute) linkedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLinkedElement_ModelRef() {
		return (EAttribute) linkedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLinkedElement_Name() {
		return (EAttribute) linkedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_LowerBound() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_UpperBound() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_AssociationTypeName() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_Opposite() {
		return (EReference) associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_SourceElement() {
		return (EReference) associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAssociation_TargetElements() {
		return (EReference) associationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_OclExpression() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_SourceAttribute() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAssociation_TargetAttribute() {
		return (EAttribute) associationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVirtualLink() {
		return virtualLinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVirtualLink_Name() {
		return (EAttribute) virtualLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VirtualLinksFactory getVirtualLinksFactory() {
		return (VirtualLinksFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		virtualLinksEClass = createEClass(VIRTUAL_LINKS);
		createEReference(virtualLinksEClass, VIRTUAL_LINKS__VIRTUAL_LINKS);
		createEReference(virtualLinksEClass, VIRTUAL_LINKS__LINKED_ELEMENTS);

		linkedElementEClass = createEClass(LINKED_ELEMENT);
		createEAttribute(linkedElementEClass, LINKED_ELEMENT__ELEMENT_REF);
		createEAttribute(linkedElementEClass, LINKED_ELEMENT__MODEL_REF);
		createEAttribute(linkedElementEClass, LINKED_ELEMENT__NAME);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__LOWER_BOUND);
		createEAttribute(associationEClass, ASSOCIATION__UPPER_BOUND);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_TYPE_NAME);
		createEReference(associationEClass, ASSOCIATION__OPPOSITE);
		createEReference(associationEClass, ASSOCIATION__SOURCE_ELEMENT);
		createEReference(associationEClass, ASSOCIATION__TARGET_ELEMENTS);
		createEAttribute(associationEClass, ASSOCIATION__OCL_EXPRESSION);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE_ATTRIBUTE);
		createEAttribute(associationEClass, ASSOCIATION__TARGET_ATTRIBUTE);

		virtualLinkEClass = createEClass(VIRTUAL_LINK);
		createEAttribute(virtualLinkEClass, VIRTUAL_LINK__NAME);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		associationEClass.getESuperTypes().add(this.getVirtualLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(virtualLinksEClass, VirtualLinks.class, "VirtualLinks",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualLinks_VirtualLinks(), this.getVirtualLink(),
				null, "virtualLinks", null, 0, -1, VirtualLinks.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getVirtualLinks_LinkedElements(),
				this.getLinkedElement(), null, "linkedElements", null, 0, -1,
				VirtualLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(linkedElementEClass, LinkedElement.class, "LinkedElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkedElement_ElementRef(),
				ecorePackage.getEString(), "elementRef", null, 0, 1,
				LinkedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLinkedElement_ModelRef(), ecorePackage.getEString(),
				"modelRef", null, 0, 1, LinkedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkedElement_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, LinkedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_LowerBound(), ecorePackage.getEInt(),
				"lowerBound", null, 1, 1, Association.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssociation_UpperBound(), ecorePackage.getEInt(),
				"upperBound", null, 1, 1, Association.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssociation_AssociationTypeName(),
				ecorePackage.getEString(), "associationTypeName", null, 1, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_Opposite(), this.getAssociation(), null,
				"opposite", null, 0, 1, Association.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_SourceElement(), this.getLinkedElement(),
				null, "sourceElement", null, 1, 1, Association.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAssociation_TargetElements(),
				this.getLinkedElement(), null, "targetElements", null, 1, -1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_OclExpression(),
				ecorePackage.getEString(), "oclExpression", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_SourceAttribute(),
				ecorePackage.getEString(), "sourceAttribute", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_TargetAttribute(),
				ecorePackage.getEString(), "targetAttribute", null, 0, 1,
				Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualLinkEClass, VirtualLink.class, "VirtualLink",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualLink_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, VirtualLink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // VirtualLinksPackageImpl
