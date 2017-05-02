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
package fr.inria.atlanmod.emfviews.virtualLinks.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 *
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage
 * @generated
 */
public class VirtualLinksSwitch<T> extends Switch<T> {
  /**
   * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected static VirtualLinksPackage modelPackage;

  /**
   * Creates an instance of the switch. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @generated
   */
  public VirtualLinksSwitch() {
    if (modelPackage == null) {
      modelPackage = VirtualLinksPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a
   * non null result; it yields that result. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
    case VirtualLinksPackage.VIRTUAL_LINKS: {
      VirtualLinks virtualLinks = (VirtualLinks) theEObject;
      T result = caseVirtualLinks(virtualLinks);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case VirtualLinksPackage.LINKED_ELEMENT: {
      LinkedElement linkedElement = (LinkedElement) theEObject;
      T result = caseLinkedElement(linkedElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case VirtualLinksPackage.ASSOCIATION: {
      Association association = (Association) theEObject;
      T result = caseAssociation(association);
      if (result == null)
        result = caseVirtualLink(association);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_LINK: {
      VirtualLink virtualLink = (VirtualLink) theEObject;
      T result = caseVirtualLink(virtualLink);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case VirtualLinksPackage.FILTER: {
      Filter filter = (Filter) theEObject;
      T result = caseFilter(filter);
      if (result == null)
        result = caseVirtualLink(filter);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Virtual Links</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Links</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualLinks(VirtualLinks object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linked
   * Element</em>'. <!-- begin-user-doc --> This implementation returns null;
   * returning a non-null result will terminate the switch. <!-- end-user-doc
   * -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linked
   *         Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkedElement(LinkedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Association</em>'. <!-- begin-user-doc --> This implementation returns
   * null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Virtual Link</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualLink(VirtualLink object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Filter</em>'. <!-- begin-user-doc --> This implementation returns
   * null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
   * null; returning a non-null result will terminate the switch, but this is
   * the last case anyway. <!-- end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} // VirtualLinksSwitch
