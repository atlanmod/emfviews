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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Virtual
 * Links</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.VirtualLinksImpl#getVirtualLinks
 * <em>Virtual Links</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.VirtualLinksImpl#getLinkedElements
 * <em>Linked Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualLinksImpl extends MinimalEObjectImpl.Container
    implements VirtualLinks {
  /**
   * The cached value of the '{@link #getVirtualLinks() <em>Virtual Links</em>}'
   * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getVirtualLinks()
   * @generated
   * @ordered
   */
  protected EList<VirtualLink> virtualLinks;

  /**
   * The cached value of the '{@link #getLinkedElements() <em>Linked
   * Elements</em>}' containment reference list. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getLinkedElements()
   * @generated
   * @ordered
   */
  protected EList<LinkedElement> linkedElements;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected VirtualLinksImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.VIRTUAL_LINKS;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<VirtualLink> getVirtualLinks() {
    if (virtualLinks == null) {
      virtualLinks = new EObjectContainmentEList<VirtualLink>(VirtualLink.class,
          this, VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS);
    }
    return virtualLinks;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<LinkedElement> getLinkedElements() {
    if (linkedElements == null) {
      linkedElements = new EObjectContainmentEList<LinkedElement>(
          LinkedElement.class, this,
          VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS);
    }
    return linkedElements;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd,
                                          int featureID,
                                          NotificationChain msgs) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS:
      return ((InternalEList<?>) getVirtualLinks()).basicRemove(otherEnd, msgs);
    case VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS:
      return ((InternalEList<?>) getLinkedElements()).basicRemove(otherEnd,
          msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS:
      return getVirtualLinks();
    case VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS:
      return getLinkedElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS:
      getVirtualLinks().clear();
      getVirtualLinks().addAll((Collection<? extends VirtualLink>) newValue);
      return;
    case VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS:
      getLinkedElements().clear();
      getLinkedElements()
          .addAll((Collection<? extends LinkedElement>) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS:
      getVirtualLinks().clear();
      return;
    case VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS:
      getLinkedElements().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.VIRTUAL_LINKS__VIRTUAL_LINKS:
      return virtualLinks != null && !virtualLinks.isEmpty();
    case VirtualLinksPackage.VIRTUAL_LINKS__LINKED_ELEMENTS:
      return linkedElements != null && !linkedElements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} // VirtualLinksImpl
