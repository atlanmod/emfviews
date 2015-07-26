/**
 */
package emfviews.dsl.sqlview.util;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.Comparison;
import emfviews.dsl.sqlview.Condition;
import emfviews.dsl.sqlview.Expression;
import emfviews.dsl.sqlview.From;
import emfviews.dsl.sqlview.Left;
import emfviews.dsl.sqlview.Metamodel;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.Model;
import emfviews.dsl.sqlview.Right;
import emfviews.dsl.sqlview.Select;
import emfviews.dsl.sqlview.SqlviewPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see emfviews.dsl.sqlview.SqlviewPackage
 * @generated
 */
public class SqlviewAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SqlviewPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlviewAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SqlviewPackage.eINSTANCE;
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
  protected SqlviewSwitch<Adapter> modelSwitch =
    new SqlviewSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseMetamodel(Metamodel object)
      {
        return createMetamodelAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseFrom(From object)
      {
        return createFromAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseClass(emfviews.dsl.sqlview.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseMetamodelName(MetamodelName object)
      {
        return createMetamodelNameAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseLeft(Left object)
      {
        return createLeftAdapter();
      }
      @Override
      public Adapter caseRight(Right object)
      {
        return createRightAdapter();
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
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Metamodel
   * @generated
   */
  public Adapter createMetamodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.From
   * @generated
   */
  public Adapter createFromAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.MetamodelName <em>Metamodel Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.MetamodelName
   * @generated
   */
  public Adapter createMetamodelNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Left
   * @generated
   */
  public Adapter createLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link emfviews.dsl.sqlview.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see emfviews.dsl.sqlview.Right
   * @generated
   */
  public Adapter createRightAdapter()
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

} //SqlviewAdapterFactory
