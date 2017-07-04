/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory
 * @model kind="package"
 * @generated
 */
public interface VirtualLinksPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "virtuallinks";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://inria.fr/virtualLinks";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "virtualLinks";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VirtualLinksPackage eINSTANCE = fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl <em>Weaving Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getWeavingModel()
   * @generated
   */
  int WEAVING_MODEL = 0;

  /**
   * The feature id for the '<em><b>Virtual Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__VIRTUAL_LINKS = 0;

  /**
   * The feature id for the '<em><b>Contributing Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__CONTRIBUTING_MODELS = 1;

  /**
   * The feature id for the '<em><b>Whitelist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__WHITELIST = 2;

  /**
   * The feature id for the '<em><b>New Concepts</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__NEW_CONCEPTS = 3;

  /**
   * The feature id for the '<em><b>New Properties</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__NEW_PROPERTIES = 4;

  /**
   * The feature id for the '<em><b>New Associations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__NEW_ASSOCIATIONS = 5;

  /**
   * The feature id for the '<em><b>Element Filters</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL__ELEMENT_FILTERS = 6;

  /**
   * The number of structural features of the '<em>Weaving Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL_FEATURE_COUNT = 7;

  /**
   * The number of operations of the '<em>Weaving Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAVING_MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl <em>Virtual Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLink()
   * @generated
   */
  int VIRTUAL_LINK = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK__NAME = 0;

  /**
   * The number of structural features of the '<em>Virtual Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Virtual Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl <em>New Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewConcept()
   * @generated
   */
  int NEW_CONCEPT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONCEPT__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Super Concepts</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONCEPT__SUPER_CONCEPTS = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Concepts</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONCEPT__SUB_CONCEPTS = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>New Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONCEPT_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>New Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_CONCEPT_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl <em>New Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewProperty()
   * @generated
   */
  int NEW_PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY__PARENT = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY__TYPE = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY__OPTIONAL = VIRTUAL_LINK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>New Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>New Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_PROPERTY_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl <em>New Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewAssociation()
   * @generated
   */
  int NEW_ASSOCIATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__SOURCE = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__TARGET = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__LOWER_BOUND = VIRTUAL_LINK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__UPPER_BOUND = VIRTUAL_LINK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION__OPPOSITE = VIRTUAL_LINK_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>New Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>New Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ASSOCIATION_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ElementFilterImpl <em>Element Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ElementFilterImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getElementFilter()
   * @generated
   */
  int ELEMENT_FILTER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FILTER__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FILTER__TARGET = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Element Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FILTER_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Element Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FILTER_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl <em>Contributing Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getContributingModel()
   * @generated
   */
  int CONTRIBUTING_MODEL = 6;

  /**
   * The feature id for the '<em><b>URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTING_MODEL__URI = 0;

  /**
   * The feature id for the '<em><b>Concrete Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTING_MODEL__CONCRETE_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Contributing Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTING_MODEL_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Contributing Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRIBUTING_MODEL_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl <em>Linked Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getLinkedElement()
   * @generated
   */
  int LINKED_ELEMENT = 8;

  /**
   * The number of structural features of the '<em>Linked Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Linked Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl <em>Concrete Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getConcreteElement()
   * @generated
   */
  int CONCRETE_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Model</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_ELEMENT__MODEL = LINKED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_ELEMENT__PATH = LINKED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concrete Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_ELEMENT_FEATURE_COUNT = LINKED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Concrete Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCRETE_ELEMENT_OPERATION_COUNT = LINKED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualElementImpl <em>Virtual Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualElementImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualElement()
   * @generated
   */
  int VIRTUAL_ELEMENT = 9;

  /**
   * The number of structural features of the '<em>Virtual Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_ELEMENT_FEATURE_COUNT = LINKED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Virtual Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRTUAL_ELEMENT_OPERATION_COUNT = LINKED_ELEMENT_OPERATION_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel <em>Weaving Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weaving Model</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel
   * @generated
   */
  EClass getWeavingModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getVirtualLinks <em>Virtual Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Virtual Links</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getVirtualLinks()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_VirtualLinks();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getContributingModels <em>Contributing Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contributing Models</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getContributingModels()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_ContributingModels();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#isWhitelist <em>Whitelist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Whitelist</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#isWhitelist()
   * @see #getWeavingModel()
   * @generated
   */
  EAttribute getWeavingModel_Whitelist();

  /**
   * Returns the meta object for the reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewConcepts <em>New Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>New Concepts</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewConcepts()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_NewConcepts();

  /**
   * Returns the meta object for the reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewProperties <em>New Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>New Properties</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewProperties()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_NewProperties();

  /**
   * Returns the meta object for the reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewAssociations <em>New Associations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>New Associations</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewAssociations()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_NewAssociations();

  /**
   * Returns the meta object for the reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getElementFilters <em>Element Filters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Element Filters</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getElementFilters()
   * @see #getWeavingModel()
   * @generated
   */
  EReference getWeavingModel_ElementFilters();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink <em>Virtual Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Link</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink
   * @generated
   */
  EClass getVirtualLink();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName()
   * @see #getVirtualLink()
   * @generated
   */
  EAttribute getVirtualLink_Name();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept <em>New Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Concept</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewConcept
   * @generated
   */
  EClass getNewConcept();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSuperConcepts <em>Super Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Concepts</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSuperConcepts()
   * @see #getNewConcept()
   * @generated
   */
  EReference getNewConcept_SuperConcepts();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSubConcepts <em>Sub Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub Concepts</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewConcept#getSubConcepts()
   * @see #getNewConcept()
   * @generated
   */
  EReference getNewConcept_SubConcepts();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty <em>New Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Property</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewProperty
   * @generated
   */
  EClass getNewProperty();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#getParent()
   * @see #getNewProperty()
   * @generated
   */
  EReference getNewProperty_Parent();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#getType()
   * @see #getNewProperty()
   * @generated
   */
  EAttribute getNewProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewProperty#isOptional()
   * @see #getNewProperty()
   * @generated
   */
  EAttribute getNewProperty_Optional();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation <em>New Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Association</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation
   * @generated
   */
  EClass getNewAssociation();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getSource()
   * @see #getNewAssociation()
   * @generated
   */
  EReference getNewAssociation_Source();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getTarget()
   * @see #getNewAssociation()
   * @generated
   */
  EReference getNewAssociation_Target();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getLowerBound()
   * @see #getNewAssociation()
   * @generated
   */
  EAttribute getNewAssociation_LowerBound();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getUpperBound <em>Upper Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getUpperBound()
   * @see #getNewAssociation()
   * @generated
   */
  EAttribute getNewAssociation_UpperBound();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation#getOpposite()
   * @see #getNewAssociation()
   * @generated
   */
  EReference getNewAssociation_Opposite();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter <em>Element Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Filter</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter
   * @generated
   */
  EClass getElementFilter();

  /**
   * Returns the meta object for the reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter#getTarget()
   * @see #getElementFilter()
   * @generated
   */
  EReference getElementFilter_Target();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel <em>Contributing Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contributing Model</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel
   * @generated
   */
  EClass getContributingModel();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getURI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>URI</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getURI()
   * @see #getContributingModel()
   * @generated
   */
  EAttribute getContributingModel_URI();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getConcreteElements <em>Concrete Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concrete Elements</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel#getConcreteElements()
   * @see #getContributingModel()
   * @generated
   */
  EReference getContributingModel_ConcreteElements();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement <em>Concrete Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concrete Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement
   * @generated
   */
  EClass getConcreteElement();

  /**
   * Returns the meta object for the container reference '{@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Model</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getModel()
   * @see #getConcreteElement()
   * @generated
   */
  EReference getConcreteElement_Model();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement#getPath()
   * @see #getConcreteElement()
   * @generated
   */
  EAttribute getConcreteElement_Path();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement <em>Linked Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linked Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement
   * @generated
   */
  EClass getLinkedElement();

  /**
   * Returns the meta object for class '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement <em>Virtual Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virtual Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement
   * @generated
   */
  EClass getVirtualElement();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VirtualLinksFactory getVirtualLinksFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl <em>Weaving Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.WeavingModelImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getWeavingModel()
     * @generated
     */
    EClass WEAVING_MODEL = eINSTANCE.getWeavingModel();

    /**
     * The meta object literal for the '<em><b>Virtual Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__VIRTUAL_LINKS = eINSTANCE.getWeavingModel_VirtualLinks();

    /**
     * The meta object literal for the '<em><b>Contributing Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__CONTRIBUTING_MODELS = eINSTANCE.getWeavingModel_ContributingModels();

    /**
     * The meta object literal for the '<em><b>Whitelist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEAVING_MODEL__WHITELIST = eINSTANCE.getWeavingModel_Whitelist();

    /**
     * The meta object literal for the '<em><b>New Concepts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__NEW_CONCEPTS = eINSTANCE.getWeavingModel_NewConcepts();

    /**
     * The meta object literal for the '<em><b>New Properties</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__NEW_PROPERTIES = eINSTANCE.getWeavingModel_NewProperties();

    /**
     * The meta object literal for the '<em><b>New Associations</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__NEW_ASSOCIATIONS = eINSTANCE.getWeavingModel_NewAssociations();

    /**
     * The meta object literal for the '<em><b>Element Filters</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEAVING_MODEL__ELEMENT_FILTERS = eINSTANCE.getWeavingModel_ElementFilters();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl <em>Virtual Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLink()
     * @generated
     */
    EClass VIRTUAL_LINK = eINSTANCE.getVirtualLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRTUAL_LINK__NAME = eINSTANCE.getVirtualLink_Name();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl <em>New Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewConceptImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewConcept()
     * @generated
     */
    EClass NEW_CONCEPT = eINSTANCE.getNewConcept();

    /**
     * The meta object literal for the '<em><b>Super Concepts</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_CONCEPT__SUPER_CONCEPTS = eINSTANCE.getNewConcept_SuperConcepts();

    /**
     * The meta object literal for the '<em><b>Sub Concepts</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_CONCEPT__SUB_CONCEPTS = eINSTANCE.getNewConcept_SubConcepts();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl <em>New Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewPropertyImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewProperty()
     * @generated
     */
    EClass NEW_PROPERTY = eINSTANCE.getNewProperty();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_PROPERTY__PARENT = eINSTANCE.getNewProperty_Parent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_PROPERTY__TYPE = eINSTANCE.getNewProperty_Type();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_PROPERTY__OPTIONAL = eINSTANCE.getNewProperty_Optional();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl <em>New Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.NewAssociationImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getNewAssociation()
     * @generated
     */
    EClass NEW_ASSOCIATION = eINSTANCE.getNewAssociation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ASSOCIATION__SOURCE = eINSTANCE.getNewAssociation_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ASSOCIATION__TARGET = eINSTANCE.getNewAssociation_Target();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_ASSOCIATION__LOWER_BOUND = eINSTANCE.getNewAssociation_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_ASSOCIATION__UPPER_BOUND = eINSTANCE.getNewAssociation_UpperBound();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEW_ASSOCIATION__OPPOSITE = eINSTANCE.getNewAssociation_Opposite();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ElementFilterImpl <em>Element Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ElementFilterImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getElementFilter()
     * @generated
     */
    EClass ELEMENT_FILTER = eINSTANCE.getElementFilter();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_FILTER__TARGET = eINSTANCE.getElementFilter_Target();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl <em>Contributing Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ContributingModelImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getContributingModel()
     * @generated
     */
    EClass CONTRIBUTING_MODEL = eINSTANCE.getContributingModel();

    /**
     * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRIBUTING_MODEL__URI = eINSTANCE.getContributingModel_URI();

    /**
     * The meta object literal for the '<em><b>Concrete Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRIBUTING_MODEL__CONCRETE_ELEMENTS = eINSTANCE.getContributingModel_ConcreteElements();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl <em>Concrete Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getConcreteElement()
     * @generated
     */
    EClass CONCRETE_ELEMENT = eINSTANCE.getConcreteElement();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCRETE_ELEMENT__MODEL = eINSTANCE.getConcreteElement_Model();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCRETE_ELEMENT__PATH = eINSTANCE.getConcreteElement_Path();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl <em>Linked Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getLinkedElement()
     * @generated
     */
    EClass LINKED_ELEMENT = eINSTANCE.getLinkedElement();

    /**
     * The meta object literal for the '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualElementImpl <em>Virtual Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualElementImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualElement()
     * @generated
     */
    EClass VIRTUAL_ELEMENT = eINSTANCE.getVirtualElement();

  }

} //VirtualLinksPackage
