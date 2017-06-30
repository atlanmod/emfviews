/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
 * @generated
 */
public interface VirtualLinksFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VirtualLinksFactory eINSTANCE = fr.inria.atlanmod.emfviews.virtuallinks.impl.VirtualLinksFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Weaving Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weaving Model</em>'.
   * @generated
   */
  WeavingModel createWeavingModel();

  /**
   * Returns a new object of class '<em>New Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Concept</em>'.
   * @generated
   */
  NewConcept createNewConcept();

  /**
   * Returns a new object of class '<em>New Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Property</em>'.
   * @generated
   */
  NewProperty createNewProperty();

  /**
   * Returns a new object of class '<em>New Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>New Association</em>'.
   * @generated
   */
  NewAssociation createNewAssociation();

  /**
   * Returns a new object of class '<em>Element Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Filter</em>'.
   * @generated
   */
  ElementFilter createElementFilter();

  /**
   * Returns a new object of class '<em>Contributing Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contributing Model</em>'.
   * @generated
   */
  ContributingModel createContributingModel();

  /**
   * Returns a new object of class '<em>Concrete Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concrete Element</em>'.
   * @generated
   */
  ConcreteElement createConcreteElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VirtualLinksPackage getVirtualLinksPackage();

} //VirtualLinksFactory
