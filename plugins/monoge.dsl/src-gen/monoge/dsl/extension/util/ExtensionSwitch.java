/**
 */
package monoge.dsl.extension.util;

import monoge.dsl.extension.*;

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
 * @see monoge.dsl.extension.ExtensionPackage
 * @generated
 */
public class ExtensionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExtensionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExtensionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExtensionPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.EXTENSION:
      {
        Extension extension = (Extension)theEObject;
        T result = caseExtension(extension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.METAMODEL:
      {
        Metamodel metamodel = (Metamodel)theEObject;
        T result = caseMetamodel(metamodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.CREATE:
      {
        Create create = (Create)theEObject;
        T result = caseCreate(create);
        if (result == null) result = caseExtension(create);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.REFINE:
      {
        Refine refine = (Refine)theEObject;
        T result = caseRefine(refine);
        if (result == null) result = caseExtension(refine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.GENERALIZE:
      {
        Generalize generalize = (Generalize)theEObject;
        T result = caseGeneralize(generalize);
        if (result == null) result = caseExtension(generalize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.MODIFY_CLASS:
      {
        ModifyClass modifyClass = (ModifyClass)theEObject;
        T result = caseModifyClass(modifyClass);
        if (result == null) result = caseExtension(modifyClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.MODIFY_OPERATOR:
      {
        ModifyOperator modifyOperator = (ModifyOperator)theEObject;
        T result = caseModifyOperator(modifyOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.ADD_PROPERTY:
      {
        AddProperty addProperty = (AddProperty)theEObject;
        T result = caseAddProperty(addProperty);
        if (result == null) result = caseModifyOperator(addProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.MODIFY_PROPERTY:
      {
        ModifyProperty modifyProperty = (ModifyProperty)theEObject;
        T result = caseModifyProperty(modifyProperty);
        if (result == null) result = caseModifyOperator(modifyProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.VALUE_ASSIGNMENT:
      {
        ValueAssignment valueAssignment = (ValueAssignment)theEObject;
        T result = caseValueAssignment(valueAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.FILTER_PROPERTY:
      {
        FilterProperty filterProperty = (FilterProperty)theEObject;
        T result = caseFilterProperty(filterProperty);
        if (result == null) result = caseModifyOperator(filterProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.FILTER_CLASS:
      {
        FilterClass filterClass = (FilterClass)theEObject;
        T result = caseFilterClass(filterClass);
        if (result == null) result = caseExtension(filterClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.ADD_CONSTRAINT:
      {
        AddConstraint addConstraint = (AddConstraint)theEObject;
        T result = caseAddConstraint(addConstraint);
        if (result == null) result = caseModifyOperator(addConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExtensionPackage.FILTER_CONSTRAINT:
      {
        FilterConstraint filterConstraint = (FilterConstraint)theEObject;
        T result = caseFilterConstraint(filterConstraint);
        if (result == null) result = caseModifyOperator(filterConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtension(Extension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetamodel(Metamodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreate(Create object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefine(Refine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generalize</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generalize</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralize(Generalize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifyClass(ModifyClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifyOperator(ModifyOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddProperty(AddProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Modify Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Modify Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModifyProperty(ModifyProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueAssignment(ValueAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterProperty(FilterProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterClass(FilterClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddConstraint(AddConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterConstraint(FilterConstraint object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExtensionSwitch
