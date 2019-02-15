/**
 */
package org.atlanmod.emfviews.virtuallinks.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import org.atlanmod.emfviews.virtuallinks.Association;
import org.atlanmod.emfviews.virtuallinks.Concept;
import org.atlanmod.emfviews.virtuallinks.ConcreteAssociation;
import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.Element;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualConcept;
import org.atlanmod.emfviews.virtuallinks.VirtualElement;
import org.atlanmod.emfviews.virtuallinks.VirtualLink;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import org.atlanmod.emfviews.virtuallinks.VirtualProperty;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
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
   * @param ePackage the package in question.
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
    case VirtualLinksPackage.WEAVING_MODEL: {
      WeavingModel weavingModel = (WeavingModel) theEObject;
      T result = caseWeavingModel(weavingModel);
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_LINK: {
      VirtualLink virtualLink = (VirtualLink) theEObject;
      T result = caseVirtualLink(virtualLink);
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_CONCEPT: {
      VirtualConcept virtualConcept = (VirtualConcept) theEObject;
      T result = caseVirtualConcept(virtualConcept);
      if (result == null) {
        result = caseVirtualLink(virtualConcept);
      }
      if (result == null) {
        result = caseVirtualElement(virtualConcept);
      }
      if (result == null) {
        result = caseConcept(virtualConcept);
      }
      if (result == null) {
        result = caseElement(virtualConcept);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_PROPERTY: {
      VirtualProperty virtualProperty = (VirtualProperty) theEObject;
      T result = caseVirtualProperty(virtualProperty);
      if (result == null) {
        result = caseVirtualLink(virtualProperty);
      }
      if (result == null) {
        result = caseVirtualElement(virtualProperty);
      }
      if (result == null) {
        result = caseElement(virtualProperty);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION: {
      VirtualAssociation virtualAssociation = (VirtualAssociation) theEObject;
      T result = caseVirtualAssociation(virtualAssociation);
      if (result == null) {
        result = caseVirtualLink(virtualAssociation);
      }
      if (result == null) {
        result = caseVirtualElement(virtualAssociation);
      }
      if (result == null) {
        result = caseAssociation(virtualAssociation);
      }
      if (result == null) {
        result = caseElement(virtualAssociation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.FILTER: {
      Filter filter = (Filter) theEObject;
      T result = caseFilter(filter);
      if (result == null) {
        result = caseVirtualLink(filter);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.CONTRIBUTING_MODEL: {
      ContributingModel contributingModel = (ContributingModel) theEObject;
      T result = caseContributingModel(contributingModel);
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.CONCRETE_ELEMENT: {
      ConcreteElement concreteElement = (ConcreteElement) theEObject;
      T result = caseConcreteElement(concreteElement);
      if (result == null) {
        result = caseElement(concreteElement);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.CONCEPT: {
      Concept concept = (Concept) theEObject;
      T result = caseConcept(concept);
      if (result == null) {
        result = caseElement(concept);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.ASSOCIATION: {
      Association association = (Association) theEObject;
      T result = caseAssociation(association);
      if (result == null) {
        result = caseElement(association);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.CONCRETE_CONCEPT: {
      ConcreteConcept concreteConcept = (ConcreteConcept) theEObject;
      T result = caseConcreteConcept(concreteConcept);
      if (result == null) {
        result = caseConcreteElement(concreteConcept);
      }
      if (result == null) {
        result = caseConcept(concreteConcept);
      }
      if (result == null) {
        result = caseElement(concreteConcept);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.CONCRETE_ASSOCIATION: {
      ConcreteAssociation concreteAssociation = (ConcreteAssociation) theEObject;
      T result = caseConcreteAssociation(concreteAssociation);
      if (result == null) {
        result = caseConcreteElement(concreteAssociation);
      }
      if (result == null) {
        result = caseAssociation(concreteAssociation);
      }
      if (result == null) {
        result = caseElement(concreteAssociation);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.ELEMENT: {
      Element element = (Element) theEObject;
      T result = caseElement(element);
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case VirtualLinksPackage.VIRTUAL_ELEMENT: {
      VirtualElement virtualElement = (VirtualElement) theEObject;
      T result = caseVirtualElement(virtualElement);
      if (result == null) {
        result = caseElement(virtualElement);
      }
      if (result == null) {
        result = defaultCase(theEObject);
      }
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Weaving Model</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Weaving Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeavingModel(WeavingModel object) {
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
   * '<em>Virtual Concept</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualConcept(VirtualConcept object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Virtual Property</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualProperty(VirtualProperty object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Virtual Association</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualAssociation(VirtualAssociation object) {
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
   * '<em>Contributing Model</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Contributing Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContributingModel(ContributingModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Concrete Element</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Concrete Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteElement(ConcreteElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Concept</em>'. <!-- begin-user-doc --> This implementation returns
   * null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcept(Concept object) {
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
   * '<em>Concrete Concept</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Concrete Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteConcept(ConcreteConcept object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Concrete Association</em>'. <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the
   * switch. <!-- end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Concrete Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcreteAssociation(ConcreteAssociation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Element</em>'. <!-- begin-user-doc --> This implementation returns
   * null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of
   * '<em>Virtual Element</em>'. <!-- begin-user-doc --> This implementation
   * returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of
   *         '<em>Virtual Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVirtualElement(VirtualElement object) {
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
