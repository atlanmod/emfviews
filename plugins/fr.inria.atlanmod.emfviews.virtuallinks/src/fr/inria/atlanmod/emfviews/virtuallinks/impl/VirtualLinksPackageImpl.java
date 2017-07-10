/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.NewProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VirtualLinksPackageImpl extends EPackageImpl implements VirtualLinksPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weavingModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualLinkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newConceptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newAssociationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contributingModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virtualElementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VirtualLinksPackageImpl() {
    super(eNS_URI, VirtualLinksFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VirtualLinksPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VirtualLinksPackage init() {
    if (isInited) return (VirtualLinksPackage)EPackage.Registry.INSTANCE.getEPackage(VirtualLinksPackage.eNS_URI);

    // Obtain or create and register package
    VirtualLinksPackageImpl theVirtualLinksPackage = (VirtualLinksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VirtualLinksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VirtualLinksPackageImpl());

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeavingModel() {
    return weavingModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeavingModel_Name() {
    return (EAttribute)weavingModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_VirtualLinks() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_ContributingModels() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeavingModel_Whitelist() {
    return (EAttribute)weavingModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_NewConcepts() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_NewProperties() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_NewAssociations() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_VirtualElements() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeavingModel_ElementFilters() {
    return (EReference)weavingModelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualLink() {
    return virtualLinkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirtualLink_Name() {
    return (EAttribute)virtualLinkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewConcept() {
    return newConceptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewConcept_SuperConcepts() {
    return (EReference)newConceptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewConcept_SubConcepts() {
    return (EReference)newConceptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewProperty() {
    return newPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewProperty_Parent() {
    return (EReference)newPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewProperty_Type() {
    return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewProperty_Optional() {
    return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewAssociation() {
    return newAssociationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewAssociation_Source() {
    return (EReference)newAssociationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewAssociation_Target() {
    return (EReference)newAssociationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewAssociation_LowerBound() {
    return (EAttribute)newAssociationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewAssociation_UpperBound() {
    return (EAttribute)newAssociationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNewAssociation_Opposite() {
    return (EReference)newAssociationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewAssociation_Composition() {
    return (EAttribute)newAssociationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementFilter() {
    return elementFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementFilter_Target() {
    return (EReference)elementFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContributingModel() {
    return contributingModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContributingModel_URI() {
    return (EAttribute)contributingModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContributingModel_ConcreteElements() {
    return (EReference)contributingModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteElement() {
    return concreteElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteElement_Model() {
    return (EReference)concreteElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConcreteElement_Path() {
    return (EAttribute)concreteElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkedElement() {
    return linkedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirtualElement() {
    return virtualElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualLinksFactory getVirtualLinksFactory() {
    return (VirtualLinksFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    weavingModelEClass = createEClass(WEAVING_MODEL);
    createEAttribute(weavingModelEClass, WEAVING_MODEL__NAME);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_LINKS);
    createEReference(weavingModelEClass, WEAVING_MODEL__CONTRIBUTING_MODELS);
    createEAttribute(weavingModelEClass, WEAVING_MODEL__WHITELIST);
    createEReference(weavingModelEClass, WEAVING_MODEL__NEW_CONCEPTS);
    createEReference(weavingModelEClass, WEAVING_MODEL__NEW_PROPERTIES);
    createEReference(weavingModelEClass, WEAVING_MODEL__NEW_ASSOCIATIONS);
    createEReference(weavingModelEClass, WEAVING_MODEL__VIRTUAL_ELEMENTS);
    createEReference(weavingModelEClass, WEAVING_MODEL__ELEMENT_FILTERS);

    virtualLinkEClass = createEClass(VIRTUAL_LINK);
    createEAttribute(virtualLinkEClass, VIRTUAL_LINK__NAME);

    newConceptEClass = createEClass(NEW_CONCEPT);
    createEReference(newConceptEClass, NEW_CONCEPT__SUPER_CONCEPTS);
    createEReference(newConceptEClass, NEW_CONCEPT__SUB_CONCEPTS);

    newPropertyEClass = createEClass(NEW_PROPERTY);
    createEReference(newPropertyEClass, NEW_PROPERTY__PARENT);
    createEAttribute(newPropertyEClass, NEW_PROPERTY__TYPE);
    createEAttribute(newPropertyEClass, NEW_PROPERTY__OPTIONAL);

    newAssociationEClass = createEClass(NEW_ASSOCIATION);
    createEReference(newAssociationEClass, NEW_ASSOCIATION__SOURCE);
    createEReference(newAssociationEClass, NEW_ASSOCIATION__TARGET);
    createEAttribute(newAssociationEClass, NEW_ASSOCIATION__LOWER_BOUND);
    createEAttribute(newAssociationEClass, NEW_ASSOCIATION__UPPER_BOUND);
    createEReference(newAssociationEClass, NEW_ASSOCIATION__OPPOSITE);
    createEAttribute(newAssociationEClass, NEW_ASSOCIATION__COMPOSITION);

    elementFilterEClass = createEClass(ELEMENT_FILTER);
    createEReference(elementFilterEClass, ELEMENT_FILTER__TARGET);

    contributingModelEClass = createEClass(CONTRIBUTING_MODEL);
    createEAttribute(contributingModelEClass, CONTRIBUTING_MODEL__URI);
    createEReference(contributingModelEClass, CONTRIBUTING_MODEL__CONCRETE_ELEMENTS);

    concreteElementEClass = createEClass(CONCRETE_ELEMENT);
    createEReference(concreteElementEClass, CONCRETE_ELEMENT__MODEL);
    createEAttribute(concreteElementEClass, CONCRETE_ELEMENT__PATH);

    linkedElementEClass = createEClass(LINKED_ELEMENT);

    virtualElementEClass = createEClass(VIRTUAL_ELEMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    newConceptEClass.getESuperTypes().add(this.getVirtualLink());
    newConceptEClass.getESuperTypes().add(this.getVirtualElement());
    newPropertyEClass.getESuperTypes().add(this.getVirtualLink());
    newPropertyEClass.getESuperTypes().add(this.getVirtualElement());
    newAssociationEClass.getESuperTypes().add(this.getVirtualLink());
    newAssociationEClass.getESuperTypes().add(this.getVirtualElement());
    elementFilterEClass.getESuperTypes().add(this.getVirtualLink());
    concreteElementEClass.getESuperTypes().add(this.getLinkedElement());
    virtualElementEClass.getESuperTypes().add(this.getLinkedElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(weavingModelEClass, WeavingModel.class, "WeavingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeavingModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_VirtualLinks(), this.getVirtualLink(), null, "virtualLinks", null, 0, -1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_ContributingModels(), this.getContributingModel(), null, "contributingModels", null, 0, -1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeavingModel_Whitelist(), ecorePackage.getEBoolean(), "whitelist", null, 0, 1, WeavingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_NewConcepts(), this.getNewConcept(), null, "newConcepts", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_NewProperties(), this.getNewProperty(), null, "newProperties", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_NewAssociations(), this.getNewAssociation(), null, "newAssociations", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_VirtualElements(), this.getVirtualElement(), null, "virtualElements", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getWeavingModel_ElementFilters(), this.getElementFilter(), null, "elementFilters", null, 0, -1, WeavingModel.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(virtualLinkEClass, VirtualLink.class, "VirtualLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirtualLink_Name(), ecorePackage.getEString(), "name", null, 1, 1, VirtualLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newConceptEClass, NewConcept.class, "NewConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewConcept_SuperConcepts(), this.getLinkedElement(), null, "superConcepts", null, 0, -1, NewConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewConcept_SubConcepts(), this.getLinkedElement(), null, "subConcepts", null, 0, -1, NewConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newPropertyEClass, NewProperty.class, "NewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewProperty_Parent(), this.getLinkedElement(), null, "parent", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewProperty_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(newAssociationEClass, NewAssociation.class, "NewAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNewAssociation_Source(), this.getLinkedElement(), null, "source", null, 1, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNewAssociation_Target(), this.getLinkedElement(), null, "target", null, 1, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNewAssociation_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getNewAssociation_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 1, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNewAssociation_Opposite(), this.getLinkedElement(), null, "opposite", null, 0, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getNewAssociation_Composition(), ecorePackage.getEBoolean(), "composition", null, 0, 1, NewAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementFilterEClass, ElementFilter.class, "ElementFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementFilter_Target(), this.getConcreteElement(), null, "target", null, 1, 1, ElementFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contributingModelEClass, ContributingModel.class, "ContributingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContributingModel_URI(), ecorePackage.getEString(), "URI", null, 1, 1, ContributingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContributingModel_ConcreteElements(), this.getConcreteElement(), this.getConcreteElement_Model(), "concreteElements", null, 0, -1, ContributingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteElementEClass, ConcreteElement.class, "ConcreteElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcreteElement_Model(), this.getContributingModel(), this.getContributingModel_ConcreteElements(), "model", null, 1, 1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConcreteElement_Path(), ecorePackage.getEString(), "path", null, 1, 1, ConcreteElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkedElementEClass, LinkedElement.class, "LinkedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(virtualElementEClass, VirtualElement.class, "VirtualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //VirtualLinksPackageImpl
