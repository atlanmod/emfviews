/**
 */
package org.atlanmod.emfviews.virtuallinks;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
 * @generated
 */
public interface VirtualLinksFactory extends CommonVirtualLinksFactory {
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  VirtualLinksFactory eINSTANCE =
      org.atlanmod.emfviews.virtuallinks.impl.VirtualLinksFactoryImpl.init();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the package supported by this factory.
   * @generated
   */
  VirtualLinksPackage getVirtualLinksPackage();

} // VirtualLinksFactory
