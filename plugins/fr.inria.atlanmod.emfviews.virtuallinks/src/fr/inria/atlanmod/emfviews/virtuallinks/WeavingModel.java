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
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getVirtualLinks <em>Virtual Links</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getContributingModels <em>Contributing Models</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#isWhitelist <em>Whitelist</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewConcepts <em>New Concepts</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewProperties <em>New Properties</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getNewAssociations <em>New Associations</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getVirtualElements <em>Virtual Elements</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getElementFilters <em>Element Filters</em>}</li>
 * </ul>
 *
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel()
 * @model
 * @generated
 */
public interface WeavingModel extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_Name()
   * @model required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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

  /**
   * Returns the value of the '<em><b>New Concepts</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Concepts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Concepts</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_NewConcepts()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<NewConcept> getNewConcepts();

  /**
   * Returns the value of the '<em><b>New Properties</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Properties</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Properties</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_NewProperties()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<NewProperty> getNewProperties();

  /**
   * Returns the value of the '<em><b>New Associations</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Associations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Associations</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_NewAssociations()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<NewAssociation> getNewAssociations();

  /**
   * Returns the value of the '<em><b>Virtual Elements</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Virtual Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Virtual Elements</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_VirtualElements()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<VirtualElement> getVirtualElements();

  /**
   * Returns the value of the '<em><b>Element Filters</b></em>' reference list.
   * The list contents are of type {@link fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Filters</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Filters</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getWeavingModel_ElementFilters()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<ElementFilter> getElementFilters();

} // WeavingModel
