/**
 */
package monoge.dsl.extension.util;

import monoge.dsl.extension.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see monoge.dsl.extension.ExtensionPackage
 * @generated
 */
public class ExtensionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExtensionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ExtensionPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtensionSwitch<Adapter> modelSwitch =
    new ExtensionSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseExtension(Extension object)
      {
        return createExtensionAdapter();
      }
      @Override
      public Adapter caseMetamodel(Metamodel object)
      {
        return createMetamodelAdapter();
      }
      @Override
      public Adapter casePrefix(Prefix object)
      {
        return createPrefixAdapter();
      }
      @Override
      public Adapter caseCreate(Create object)
      {
        return createCreateAdapter();
      }
      @Override
      public Adapter caseRefine(Refine object)
      {
        return createRefineAdapter();
      }
      @Override
      public Adapter caseGeneralize(Generalize object)
      {
        return createGeneralizeAdapter();
      }
      @Override
      public Adapter caseModifyClass(ModifyClass object)
      {
        return createModifyClassAdapter();
      }
      @Override
      public Adapter caseModifyOperator(ModifyOperator object)
      {
        return createModifyOperatorAdapter();
      }
      @Override
      public Adapter caseAddProperty(AddProperty object)
      {
        return createAddPropertyAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseModifyProperty(ModifyProperty object)
      {
        return createModifyPropertyAdapter();
      }
      @Override
      public Adapter caseValueAssignment(ValueAssignment object)
      {
        return createValueAssignmentAdapter();
      }
      @Override
      public Adapter caseFilterProperty(FilterProperty object)
      {
        return createFilterPropertyAdapter();
      }
      @Override
      public Adapter caseFilterClass(FilterClass object)
      {
        return createFilterClassAdapter();
      }
      @Override
      public Adapter caseAddConstraint(AddConstraint object)
      {
        return createAddConstraintAdapter();
      }
      @Override
      public Adapter caseFilterConstraint(FilterConstraint object)
      {
        return createFilterConstraintAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Extension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Extension
   * @generated
   */
  public Adapter createExtensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Metamodel
   * @generated
   */
  public Adapter createMetamodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Prefix
   * @generated
   */
  public Adapter createPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Create
   * @generated
   */
  public Adapter createCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Refine <em>Refine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Refine
   * @generated
   */
  public Adapter createRefineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Generalize <em>Generalize</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Generalize
   * @generated
   */
  public Adapter createGeneralizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.ModifyClass <em>Modify Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.ModifyClass
   * @generated
   */
  public Adapter createModifyClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.ModifyOperator <em>Modify Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.ModifyOperator
   * @generated
   */
  public Adapter createModifyOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.AddProperty <em>Add Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.AddProperty
   * @generated
   */
  public Adapter createAddPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.ModifyProperty <em>Modify Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.ModifyProperty
   * @generated
   */
  public Adapter createModifyPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.ValueAssignment <em>Value Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.ValueAssignment
   * @generated
   */
  public Adapter createValueAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.FilterProperty <em>Filter Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.FilterProperty
   * @generated
   */
  public Adapter createFilterPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.FilterClass <em>Filter Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.FilterClass
   * @generated
   */
  public Adapter createFilterClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.AddConstraint <em>Add Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.AddConstraint
   * @generated
   */
  public Adapter createAddConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link monoge.dsl.extension.FilterConstraint <em>Filter Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see monoge.dsl.extension.FilterConstraint
   * @generated
   */
  public Adapter createFilterConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ExtensionAdapterFactory
