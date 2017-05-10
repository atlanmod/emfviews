/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory
 * @model kind="package"
 * @generated
 */
public interface VirtualLinksPackage extends EPackage {
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNAME = "virtuallinks";

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_URI = "http://inria.fr/virtualLinks";

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_PREFIX = "virtualLinks";

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  VirtualLinksPackage eINSTANCE =
      fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl.init();

  /**
   * The meta object id for the
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksImpl
   * <em>Virtual Links</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLinks()
   * @generated
   */
  int VIRTUAL_LINKS = 0;

  /**
   * The feature id for the '<em><b>Virtual Links</b></em>' containment
   * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINKS__VIRTUAL_LINKS = 0;

  /**
   * The feature id for the '<em><b>Linked Elements</b></em>' containment
   * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINKS__LINKED_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Virtual Links</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINKS_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Virtual Links</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINKS_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
   * <em>Linked Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getLinkedElement()
   * @generated
   */
  int LINKED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Element Ref</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT__ELEMENT_REF = 0;

  /**
   * The feature id for the '<em><b>Model Ref</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT__MODEL_REF = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT__NAME = 2;

  /**
   * The feature id for the '<em><b>Estructural Features</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT__ESTRUCTURAL_FEATURES = 3;

  /**
   * The number of structural features of the '<em>Linked Element</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Linked Element</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int LINKED_ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
   * <em>Virtual Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLink()
   * @generated
   */
  int VIRTUAL_LINK = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK__NAME = 0;

  /**
   * The number of structural features of the '<em>Virtual Link</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Virtual Link</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int VIRTUAL_LINK_OPERATION_COUNT = 0;

  /**
   * The meta object id for the
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl
   * <em>Association</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__LOWER_BOUND = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__UPPER_BOUND = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Association Type Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__ASSOCIATION_TYPE_NAME = VIRTUAL_LINK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__OPPOSITE = VIRTUAL_LINK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source Element</b></em>' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__SOURCE_ELEMENT = VIRTUAL_LINK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Elements</b></em>' reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__TARGET_ELEMENTS = VIRTUAL_LINK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ocl Expression</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__OCL_EXPRESSION = VIRTUAL_LINK_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Source Attribute</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__SOURCE_ATTRIBUTE = VIRTUAL_LINK_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Target Attribute</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION__TARGET_ATTRIBUTE = VIRTUAL_LINK_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Association</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 9;

  /**
   * The number of operations of the '<em>Association</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int ASSOCIATION_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * The meta object id for the
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.FilterImpl
   * <em>Filter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.FilterImpl
   * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER__NAME = VIRTUAL_LINK__NAME;

  /**
   * The feature id for the '<em><b>Filtered Element</b></em>' reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER__FILTERED_ELEMENT = VIRTUAL_LINK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ocl Query</b></em>' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER__OCL_QUERY = VIRTUAL_LINK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter Only Estructural Features</b></em>'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES = VIRTUAL_LINK_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Filter</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = VIRTUAL_LINK_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Filter</em>' class. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int FILTER_OPERATION_COUNT = VIRTUAL_LINK_OPERATION_COUNT + 0;

  /**
   * Returns the meta object for class
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks <em>Virtual
   * Links</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Virtual Links</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks
   * @generated
   */
  EClass getVirtualLinks();

  /**
   * Returns the meta object for the containment reference list
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks#getVirtualLinks
   * <em>Virtual Links</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the containment reference list '<em>Virtual
   *         Links</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks#getVirtualLinks()
   * @see #getVirtualLinks()
   * @generated
   */
  EReference getVirtualLinks_VirtualLinks();

  /**
   * Returns the meta object for the containment reference list
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks#getLinkedElements
   * <em>Linked Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the containment reference list '<em>Linked
   *         Elements</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks#getLinkedElements()
   * @see #getVirtualLinks()
   * @generated
   */
  EReference getVirtualLinks_LinkedElements();

  /**
   * Returns the meta object for class
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement <em>Linked
   * Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Linked Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement
   * @generated
   */
  EClass getLinkedElement();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getElementRef
   * <em>Element Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Element Ref</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getElementRef()
   * @see #getLinkedElement()
   * @generated
   */
  EAttribute getLinkedElement_ElementRef();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getModelRef
   * <em>Model Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Model Ref</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getModelRef()
   * @see #getLinkedElement()
   * @generated
   */
  EAttribute getLinkedElement_ModelRef();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getName
   * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getName()
   * @see #getLinkedElement()
   * @generated
   */
  EAttribute getLinkedElement_Name();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getEstructuralFeatures
   * <em>Estructural Features</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @return the meta object for the attribute '<em>Estructural Features</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement#getEstructuralFeatures()
   * @see #getLinkedElement()
   * @generated
   */
  EAttribute getLinkedElement_EstructuralFeatures();

  /**
   * Returns the meta object for class
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association
   * <em>Association</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Association</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getLowerBound
   * <em>Lower Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getLowerBound()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_LowerBound();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getUpperBound
   * <em>Upper Bound</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Upper Bound</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getUpperBound()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_UpperBound();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getAssociationTypeName
   * <em>Association Type Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @return the meta object for the attribute '<em>Association Type Name</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getAssociationTypeName()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_AssociationTypeName();

  /**
   * Returns the meta object for the reference
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getOpposite
   * <em>Opposite</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getOpposite()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Opposite();

  /**
   * Returns the meta object for the reference
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getSourceElement
   * <em>Source Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Source Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getSourceElement()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_SourceElement();

  /**
   * Returns the meta object for the reference list
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getTargetElements
   * <em>Target Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the reference list '<em>Target Elements</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getTargetElements()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_TargetElements();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getOclExpression
   * <em>Ocl Expression</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Ocl Expression</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getOclExpression()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_OclExpression();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getSourceAttribute
   * <em>Source Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Source Attribute</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getSourceAttribute()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_SourceAttribute();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Association#getTargetAttribute
   * <em>Target Attribute</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Target Attribute</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Association#getTargetAttribute()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_TargetAttribute();

  /**
   * Returns the meta object for class
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink <em>Virtual
   * Link</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Virtual Link</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink
   * @generated
   */
  EClass getVirtualLink();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName
   * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink#getName()
   * @see #getVirtualLink()
   * @generated
   */
  EAttribute getVirtualLink_Name();

  /**
   * Returns the meta object for class
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Filter</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for the reference
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Filter#getFilteredElement
   * <em>Filtered Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Filtered Element</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Filter#getFilteredElement()
   * @see #getFilter()
   * @generated
   */
  EReference getFilter_FilteredElement();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Filter#getOclQuery <em>Ocl
   * Query</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Ocl Query</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Filter#getOclQuery()
   * @see #getFilter()
   * @generated
   */
  EAttribute getFilter_OclQuery();

  /**
   * Returns the meta object for the attribute
   * '{@link fr.inria.atlanmod.emfviews.virtuallinks.Filter#isFilterOnlyEstructuralFeatures
   * <em>Filter Only Estructural Features</em>}'. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Filter Only Estructural
   *         Features</em>'.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.Filter#isFilterOnlyEstructuralFeatures()
   * @see #getFilter()
   * @generated
   */
  EAttribute getFilter_FilterOnlyEstructuralFeatures();

  /**
   * Returns the factory that creates the instances of the model. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VirtualLinksFactory getVirtualLinksFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that
   * represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each operation of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   *
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the
     * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksImpl
     * <em>Virtual Links</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLinks()
     * @generated
     */
    EClass VIRTUAL_LINKS = eINSTANCE.getVirtualLinks();

    /**
     * The meta object literal for the '<em><b>Virtual Links</b></em>'
     * containment reference list feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    EReference VIRTUAL_LINKS__VIRTUAL_LINKS = eINSTANCE.getVirtualLinks_VirtualLinks();

    /**
     * The meta object literal for the '<em><b>Linked Elements</b></em>'
     * containment reference list feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    EReference VIRTUAL_LINKS__LINKED_ELEMENTS = eINSTANCE.getVirtualLinks_LinkedElements();

    /**
     * The meta object literal for the
     * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
     * <em>Linked Element</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.LinkedElementImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getLinkedElement()
     * @generated
     */
    EClass LINKED_ELEMENT = eINSTANCE.getLinkedElement();

    /**
     * The meta object literal for the '<em><b>Element Ref</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute LINKED_ELEMENT__ELEMENT_REF = eINSTANCE.getLinkedElement_ElementRef();

    /**
     * The meta object literal for the '<em><b>Model Ref</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute LINKED_ELEMENT__MODEL_REF = eINSTANCE.getLinkedElement_ModelRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute LINKED_ELEMENT__NAME = eINSTANCE.getLinkedElement_Name();

    /**
     * The meta object literal for the '<em><b>Estructural Features</b></em>'
     * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute LINKED_ELEMENT__ESTRUCTURAL_FEATURES =
        eINSTANCE.getLinkedElement_EstructuralFeatures();

    /**
     * The meta object literal for the
     * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl
     * <em>Association</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__LOWER_BOUND = eINSTANCE.getAssociation_LowerBound();

    /**
     * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__UPPER_BOUND = eINSTANCE.getAssociation_UpperBound();

    /**
     * The meta object literal for the '<em><b>Association Type Name</b></em>'
     * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__ASSOCIATION_TYPE_NAME = eINSTANCE.getAssociation_AssociationTypeName();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EReference ASSOCIATION__OPPOSITE = eINSTANCE.getAssociation_Opposite();

    /**
     * The meta object literal for the '<em><b>Source Element</b></em>'
     * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EReference ASSOCIATION__SOURCE_ELEMENT = eINSTANCE.getAssociation_SourceElement();

    /**
     * The meta object literal for the '<em><b>Target Elements</b></em>'
     * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EReference ASSOCIATION__TARGET_ELEMENTS = eINSTANCE.getAssociation_TargetElements();

    /**
     * The meta object literal for the '<em><b>Ocl Expression</b></em>'
     * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__OCL_EXPRESSION = eINSTANCE.getAssociation_OclExpression();

    /**
     * The meta object literal for the '<em><b>Source Attribute</b></em>'
     * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__SOURCE_ATTRIBUTE = eINSTANCE.getAssociation_SourceAttribute();

    /**
     * The meta object literal for the '<em><b>Target Attribute</b></em>'
     * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute ASSOCIATION__TARGET_ATTRIBUTE = eINSTANCE.getAssociation_TargetAttribute();

    /**
     * The meta object literal for the
     * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
     * <em>Virtual Link</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinkImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getVirtualLink()
     * @generated
     */
    EClass VIRTUAL_LINK = eINSTANCE.getVirtualLink();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute VIRTUAL_LINK__NAME = eINSTANCE.getVirtualLink_Name();

    /**
     * The meta object literal for the
     * '{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.FilterImpl
     * <em>Filter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.FilterImpl
     * @see fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '<em><b>Filtered Element</b></em>'
     * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EReference FILTER__FILTERED_ELEMENT = eINSTANCE.getFilter_FilteredElement();

    /**
     * The meta object literal for the '<em><b>Ocl Query</b></em>' attribute
     * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute FILTER__OCL_QUERY = eINSTANCE.getFilter_OclQuery();

    /**
     * The meta object literal for the '<em><b>Filter Only Estructural
     * Features</b></em>' attribute feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    EAttribute FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES =
        eINSTANCE.getFilter_FilterOnlyEstructuralFeatures();

  }

} // VirtualLinksPackage
