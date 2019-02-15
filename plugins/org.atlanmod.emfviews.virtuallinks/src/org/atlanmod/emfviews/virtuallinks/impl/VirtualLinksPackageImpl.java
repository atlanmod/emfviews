/**
 */
package org.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.atlanmod.emfviews.virtuallinks.Association;
import org.atlanmod.emfviews.virtuallinks.Concept;
import org.atlanmod.emfviews.virtuallinks.ConcreteAssociation;
import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.Element;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualConcept;
import org.atlanmod.emfviews.virtuallinks.VirtualElement;
import org.atlanmod.emfviews.virtuallinks.VirtualLink;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import org.atlanmod.emfviews.virtuallinks.VirtualProperty;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class VirtualLinksPackageImpl extends EPackageImpl implements VirtualLinksPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass weavingModelEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass virtualLinkEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass virtualConceptEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass virtualPropertyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass virtualAssociationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass contributingModelEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass concreteElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass conceptEClass = null;

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
  private EClass concreteConceptEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass concreteAssociationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass virtualElementEClass = null;

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
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#eNS_URI
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
   * Creates, registers, and initializes the <b>Package</b> for this model, and
   * for any others upon which it depends.
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
    if (isInited) {
      return (VirtualLinksPackage) EPackage.Registry.INSTANCE
        .getEPackage(VirtualLinksPackage.eNS_URI);
    }

    // Obtain or create and register package
    Object registeredVirtualLinksPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    VirtualLinksPackageImpl theVirtualLinksPackage =
      registeredVirtualLinksPackage instanceof VirtualLinksPackageImpl
        ? (VirtualLinksPackageImpl) registeredVirtualLinksPackage : new VirtualLinksPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theVirtualLinksPackage.createPackageContents();

    // Initialize created meta-data
    theVirtualLinksPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVirtualLinksPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VirtualLinksPackage.eNS_URI, theVirtualLinksPackage);
    return theVirtualLinksPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getWeavingModel() {
    return weavingModelEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getWeavingModel_Name() {
    return (EAttribute) weavingModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_VirtualLinks() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_ContributingModels() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getWeavingModel_Whitelist() {
    return (EAttribute) weavingModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_VirtualConcepts() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_VirtualProperties() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_VirtualAssociations() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_VirtualElements() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getWeavingModel_Filters() {
    return (EReference) weavingModelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getVirtualLink() {
    return virtualLinkEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualLink_Name() {
    return (EAttribute) virtualLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getVirtualConcept() {
    return virtualConceptEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualConcept_SuperConcepts() {
    return (EReference) virtualConceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualConcept_SubConcepts() {
    return (EReference) virtualConceptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getVirtualProperty() {
    return virtualPropertyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualProperty_Parent() {
    return (EReference) virtualPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualProperty_Type() {
    return (EAttribute) virtualPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualProperty_Optional() {
    return (EAttribute) virtualPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualProperty_Query() {
    return (EAttribute) virtualPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getVirtualAssociation() {
    return virtualAssociationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualAssociation_Source() {
    return (EReference) virtualAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualAssociation_Target() {
    return (EReference) virtualAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualAssociation_LowerBound() {
    return (EAttribute) virtualAssociationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualAssociation_UpperBound() {
    return (EAttribute) virtualAssociationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getVirtualAssociation_Opposite() {
    return (EReference) virtualAssociationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getVirtualAssociation_Composition() {
    return (EAttribute) virtualAssociationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getFilter() {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getFilter_Target() {
    return (EReference) filterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getContributingModel() {
    return contributingModelEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getContributingModel_URI() {
    return (EAttribute) contributingModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getContributingModel_ConcreteElements() {
    return (EReference) contributingModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getConcreteElement() {
    return concreteElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getConcreteElement_Model() {
    return (EReference) concreteElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getConcreteElement_Path() {
    return (EAttribute) concreteElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getConcept() {
    return conceptEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getAssociation() {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getConcreteConcept() {
    return concreteConceptEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getConcreteAssociation() {
    return concreteAssociationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getElement() {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getVirtualElement() {
    return virtualElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
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
    if (isCreated) {
      return;
    }
    isCreated = true;

    // Create classes and their features
    weavingModelEClass = createEClass(WEAVING_MODEL);
    createEAttribute(weavingModelEClass, WEAVING_MODEL__NAME);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_LINKS);
    createEReference(weavingModelEClass, WEAVING_MODEL__CONTRIBUTING_MODELS);
    createEAttribute(weavingModelEClass, WEAVING_MODEL__WHITELIST);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_CONCEPTS);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_PROPERTIES);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_ASSOCIATIONS);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_ELEMENTS);
    createEReference(weavingModelEClass, WEAVING_MODEL__FILTERS);

    virtualLinkEClass = createEClass(VIRTUAL_LINK);
    createEAttribute(virtualLinkEClass, VIRTUAL_LINK__NAME);

    virtualConceptEClass = createEClass(VIRTUAL_CONCEPT);
    createEReference(virtualConceptEClass, VIRTUAL_CONCEPT__SUPER_CONCEPTS);
    createEReference(virtualConceptEClass, VIRTUAL_CONCEPT__SUB_CONCEPTS);

    virtualPropertyEClass = createEClass(VIRTUAL_PROPERTY);
    createEReference(virtualPropertyEClass, VIRTUAL_PROPERTY__PARENT);
    createEAttribute(virtualPropertyEClass, VIRTUAL_PROPERTY__TYPE);
    createEAttribute(virtualPropertyEClass, VIRTUAL_PROPERTY__OPTIONAL);
    createEAttribute(virtualPropertyEClass, VIRTUAL_PROPERTY__QUERY);

    virtualAssociationEClass = createEClass(VIRTUAL_ASSOCIATION);
    createEReference(virtualAssociationEClass, VIRTUAL_ASSOCIATION__SOURCE);
    createEReference(virtualAssociationEClass, VIRTUAL_ASSOCIATION__TARGET);
    createEAttribute(virtualAssociationEClass, VIRTUAL_ASSOCIATION__LOWER_BOUND);
    createEAttribute(virtualAssociationEClass, VIRTUAL_ASSOCIATION__UPPER_BOUND);
    createEReference(virtualAssociationEClass, VIRTUAL_ASSOCIATION__OPPOSITE);
    createEAttribute(virtualAssociationEClass, VIRTUAL_ASSOCIATION__COMPOSITION);

    filterEClass = createEClass(FILTER);
    createEReference(filterEClass, FILTER__TARGET);

    contributingModelEClass = createEClass(CONTRIBUTING_MODEL);
    createEAttribute(contributingModelEClass, CONTRIBUTING_MODEL__URI);
    createEReference(contributingModelEClass, CONTRIBUTING_MODEL__CONCRETE_ELEMENTS);

    concreteElementEClass = createEClass(CONCRETE_ELEMENT);
    createEReference(concreteElementEClass, CONCRETE_ELEMENT__MODEL);
    createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__PATH);

    conceptEClass = createEClass(CONCEPT);

    associationEClass = createEClass(ASSOCIATION);

    concreteConceptEClass = createEClass(CONCRETE_CONCEPT);

    concreteAssociationEClass = createEClass(CONCRETE_ASSOCIATION);

    elementEClass = createEClass(ELEMENT);

    virtualElementEClass = createEClass(VIRTUAL_ELEMENT);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method
   * is guarded to have no affect on any invocation but its first. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    virtualConceptEClass.getESuperTypes().add(this.getVirtualLink());
    virtualConceptEClass.getESuperTypes().add(this.getVirtualElement());
    virtualConceptEClass.getESuperTypes().add(this.getConcept());
    virtualPropertyEClass.getESuperTypes().add(this.getVirtualLink());
    virtualPropertyEClass.getESuperTypes().add(this.getVirtualElement());
    virtualAssociationEClass.getESuperTypes().add(this.getVirtualLink());
    virtualAssociationEClass.getESuperTypes().add(this.getVirtualElement());
    virtualAssociationEClass.getESuperTypes().add(this.getAssociation());
    filterEClass.getESuperTypes().add(this.getVirtualLink());
    concreteElementEClass.getESuperTypes().add(this.getElement());
    conceptEClass.getESuperTypes().add(this.getElement());
    associationEClass.getESuperTypes().add(this.getElement());
    concreteConceptEClass.getESuperTypes().add(this.getConcreteElement());
    concreteConceptEClass.getESuperTypes().add(this.getConcept());
    concreteAssociationEClass.getESuperTypes().add(this.getConcreteElement());
    concreteAssociationEClass.getESuperTypes().add(this.getAssociation());
    virtualElementEClass.getESuperTypes().add(this.getElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(weavingModelEClass, WeavingModel.class, "WeavingModel", !IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeavingModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
      WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_VirtualLinks(), this.getVirtualLink(), null, "virtualLinks",
      null, 0, -1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
      !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_ContributingModels(), this.getContributingModel(), null,
      "contributingModels", null, 0, -1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE,
      IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
      IS_ORDERED);
    initEAttribute(getWeavingModel_Whitelist(), ecorePackage.getEBoolean(), "whitelist", null, 0, 1,
      WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_VirtualConcepts(), this.getVirtualConcept(), null,
      "virtualConcepts", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
      !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_VirtualProperties(), this.getVirtualProperty(), null,
      "virtualProperties", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE,
      !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
      IS_ORDERED);
    initEReference(getWeavingModel_VirtualAssociations(), this.getVirtualAssociation(), null,
      "virtualAssociations", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE,
      !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
      IS_ORDERED);
    initEReference(getWeavingModel_VirtualElements(), this.getVirtualElement(), null,
      "virtualElements", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
      !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_Filters(), this.getFilter(), null, "filters", null, 0, -1,
      WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(virtualLinkEClass, VirtualLink.class, "VirtualLink", IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualLink_Name(), ecorePackage.getEString(), "name", null, 1, 1,
      VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualConceptEClass, VirtualConcept.class, "VirtualConcept", !IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVirtualConcept_SuperConcepts(), this.getConcept(), null, "superConcepts",
      null, 0, -1, VirtualConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualConcept_SubConcepts(), this.getConcept(), null, "subConcepts", null, 0,
      -1, VirtualConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualPropertyEClass, VirtualProperty.class, "VirtualProperty", !IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVirtualProperty_Parent(), this.getConcept(), null, "parent", null, 1, 1,
      VirtualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1,
      VirtualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualProperty_Optional(), ecorePackage.getEBoolean(), "optional", null, 0,
      1, VirtualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualProperty_Query(), ecorePackage.getEString(), "query", "", 0, 1,
      VirtualProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virtualAssociationEClass, VirtualAssociation.class, "VirtualAssociation",
      !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVirtualAssociation_Source(), this.getConcept(), null, "source", null, 1, 1,
      VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVirtualAssociation_Target(), this.getConcept(), null, "target", null, 1, 1,
      VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVirtualAssociation_LowerBound(), ecorePackage.getEInt(), "lowerBound", null,
      1, 1, VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
      !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getVirtualAssociation_UpperBound(), ecorePackage.getEInt(), "upperBound", null,
      1, 1, VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
      !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getVirtualAssociation_Opposite(), this.getAssociation(), null, "opposite", null,
      0, 1, VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
      IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getVirtualAssociation_Composition(), ecorePackage.getEBoolean(), "composition",
      null, 0, 1, VirtualAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
      !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilter_Target(), this.getConcreteElement(), null, "target", null, 1, 1,
      Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
      !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributingModelEClass, ContributingModel.class, "ContributingModel", !IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributingModel_URI(), ecorePackage.getEString(), "URI", null, 1, 1,
      ContributingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributingModel_ConcreteElements(), this.getConcreteElement(),
      this.getConcreteElement_Model(), "concreteElements", null, 0, -1, ContributingModel.class,
      !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteElementEClass, ConcreteElement.class, "ConcreteElement", !IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcreteElement_Model(), this.getContributingModel(),
      this.getContributingModel_ConcreteElements(), "model", null, 1, 1, ConcreteElement.class,
      !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
      !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcreteElement_Path(), ecorePackage.getEString(), "path", null, 1, 1,
      ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
      IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conceptEClass, Concept.class, "Concept", IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);

    initEClass(associationEClass, Association.class, "Association", IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);

    initEClass(concreteConceptEClass, ConcreteConcept.class, "ConcreteConcept", !IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(concreteAssociationEClass, ConcreteAssociation.class, "ConcreteAssociation",
      !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE,
      IS_GENERATED_INSTANCE_CLASS);

    initEClass(virtualElementEClass, VirtualElement.class, "VirtualElement", IS_ABSTRACT,
      !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} // VirtualLinksPackageImpl
