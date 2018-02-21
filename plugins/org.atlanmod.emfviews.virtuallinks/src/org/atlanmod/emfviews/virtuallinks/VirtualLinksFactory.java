/**
 */
package org.atlanmod.emfviews.virtuallinks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
 * @generated
 */
public interface VirtualLinksFactory extends EFactory {
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  VirtualLinksFactory eINSTANCE =
      org.atlanmod.emfviews.virtuallinks.impl.VirtualLinksFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Weaving Model</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Weaving Model</em>'.
   * @generated
   */
  WeavingModel createWeavingModel();

  /**
   * Returns a new object of class '<em>Virtual Concept</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Virtual Concept</em>'.
   * @generated
   */
  VirtualConcept createVirtualConcept();

  /**
   * Returns a new object of class '<em>Virtual Property</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Virtual Property</em>'.
   * @generated
   */
  VirtualProperty createVirtualProperty();

  /**
   * Returns a new object of class '<em>Virtual Association</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Virtual Association</em>'.
   * @generated
   */
  VirtualAssociation createVirtualAssociation();

  /**
   * Returns a new object of class '<em>Filter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Contributing Model</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Contributing Model</em>'.
   * @generated
   */
  ContributingModel createContributingModel();

  /**
   * Returns a new object of class '<em>Concrete Element</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Concrete Element</em>'.
   * @generated
   */
  ConcreteElement createConcreteElement();

  /**
   * Returns a new object of class '<em>Concrete Concept</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Concrete Concept</em>'.
   * @generated
   */
  ConcreteConcept createConcreteConcept();

  /**
   * Returns a new object of class '<em>Concrete Association</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Concrete Association</em>'.
   * @generated
   */
  ConcreteAssociation createConcreteAssociation();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the package supported by this factory.
   * @generated
   */
  VirtualLinksPackage getVirtualLinksPackage();

} // VirtualLinksFactory
