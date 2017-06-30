/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.util;

import fr.inria.atlanmod.emfviews.virtuallinks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
 * @generated
 */
public class VirtualLinksSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VirtualLinksPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualLinksSwitch() {
    if (modelPackage == null) {
      modelPackage = VirtualLinksPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case VirtualLinksPackage.WEAVING_MODEL: {
        WeavingModel weavingModel = (WeavingModel)theEObject;
        T result = caseWeavingModel(weavingModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.VIRTUAL_LINK: {
        VirtualLink virtualLink = (VirtualLink)theEObject;
        T result = caseVirtualLink(virtualLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.NEW_CONCEPT: {
        NewConcept newConcept = (NewConcept)theEObject;
        T result = caseNewConcept(newConcept);
        if (result == null) result = caseVirtualLink(newConcept);
        if (result == null) result = caseVirtualElement(newConcept);
        if (result == null) result = caseLinkedElement(newConcept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.NEW_PROPERTY: {
        NewProperty newProperty = (NewProperty)theEObject;
        T result = caseNewProperty(newProperty);
        if (result == null) result = caseVirtualLink(newProperty);
        if (result == null) result = caseVirtualElement(newProperty);
        if (result == null) result = caseLinkedElement(newProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.NEW_ASSOCIATION: {
        NewAssociation newAssociation = (NewAssociation)theEObject;
        T result = caseNewAssociation(newAssociation);
        if (result == null) result = caseVirtualLink(newAssociation);
        if (result == null) result = caseVirtualElement(newAssociation);
        if (result == null) result = caseLinkedElement(newAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.ELEMENT_FILTER: {
        ElementFilter elementFilter = (ElementFilter)theEObject;
        T result = caseElementFilter(elementFilter);
        if (result == null) result = caseVirtualLink(elementFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.CONTRIBUTING_MODEL: {
        ContributingModel contributingModel = (ContributingModel)theEObject;
        T result = caseContributingModel(contributingModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.CONCRETE_ELEMENT: {
        ConcreteElement concreteElement = (ConcreteElement)theEObject;
        T result = caseConcreteElement(concreteElement);
        if (result == null) result = caseLinkedElement(concreteElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.LINKED_ELEMENT: {
        LinkedElement linkedElement = (LinkedElement)theEObject;
        T result = caseLinkedElement(linkedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VirtualLinksPackage.VIRTUAL_ELEMENT: {
        VirtualElement virtualElement = (VirtualElement)theEObject;
        T result = caseVirtualElement(virtualElement);
        if (result == null) result = caseLinkedElement(virtualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weaving Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weaving Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeavingModel(WeavingModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualLink(VirtualLink object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Concept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewConcept(NewConcept object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewProperty(NewProperty object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewAssociation(NewAssociation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementFilter(ElementFilter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contributing Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contributing Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributingModel(ContributingModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concrete Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concrete Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteElement(ConcreteElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linked Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linked Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkedElement(LinkedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Virtual Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Virtual Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualElement(VirtualElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //VirtualLinksSwitch
