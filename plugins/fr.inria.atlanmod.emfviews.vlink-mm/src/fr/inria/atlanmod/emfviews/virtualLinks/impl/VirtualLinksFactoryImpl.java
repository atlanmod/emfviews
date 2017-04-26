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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.inria.atlanmod.emfviews.virtualLinks.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class VirtualLinksFactoryImpl extends EFactoryImpl
    implements VirtualLinksFactory {
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  public static VirtualLinksFactory init() {
    try {
      VirtualLinksFactory theVirtualLinksFactory = (VirtualLinksFactory) EPackage.Registry.INSTANCE
          .getEFactory(VirtualLinksPackage.eNS_URI);
      if (theVirtualLinksFactory != null) {
        return theVirtualLinksFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VirtualLinksFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  public VirtualLinksFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case VirtualLinksPackage.VIRTUAL_LINKS:
      return createVirtualLinks();
    case VirtualLinksPackage.LINKED_ELEMENT:
      return createLinkedElement();
    case VirtualLinksPackage.ASSOCIATION:
      return createAssociation();
    case VirtualLinksPackage.FILTER:
      return createFilter();
    default:
      throw new IllegalArgumentException(
          "The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualLinks createVirtualLinks() {
    VirtualLinksImpl virtualLinks = new VirtualLinksImpl();
    return virtualLinks;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public LinkedElement createLinkedElement() {
    LinkedElementImpl linkedElement = new LinkedElementImpl();
    return linkedElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Association createAssociation() {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Filter createFilter() {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualLinksPackage getVirtualLinksPackage() {
    return (VirtualLinksPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VirtualLinksPackage getPackage() {
    return VirtualLinksPackage.eINSTANCE;
  }

} // VirtualLinksFactoryImpl
