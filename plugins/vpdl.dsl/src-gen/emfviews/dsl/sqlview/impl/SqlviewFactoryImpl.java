/**
 */
package emfviews.dsl.sqlview.impl;

import emfviews.dsl.sqlview.Attribute;
import emfviews.dsl.sqlview.Comparison;
import emfviews.dsl.sqlview.Condition;
import emfviews.dsl.sqlview.EclExpression;
import emfviews.dsl.sqlview.Expression;
import emfviews.dsl.sqlview.From;
import emfviews.dsl.sqlview.Join;
import emfviews.dsl.sqlview.JoinLeft;
import emfviews.dsl.sqlview.JoinRight;
import emfviews.dsl.sqlview.Left;
import emfviews.dsl.sqlview.Metamodel;
import emfviews.dsl.sqlview.MetamodelName;
import emfviews.dsl.sqlview.Model;
import emfviews.dsl.sqlview.Relation;
import emfviews.dsl.sqlview.Right;
import emfviews.dsl.sqlview.Select;
import emfviews.dsl.sqlview.SelectAttribute;
import emfviews.dsl.sqlview.SqlviewFactory;
import emfviews.dsl.sqlview.SqlviewPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlviewFactoryImpl extends EFactoryImpl implements SqlviewFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SqlviewFactory init()
  {
    try
    {
      SqlviewFactory theSqlviewFactory = (SqlviewFactory)EPackage.Registry.INSTANCE.getEFactory(SqlviewPackage.eNS_URI);
      if (theSqlviewFactory != null)
      {
        return theSqlviewFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqlviewFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlviewFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SqlviewPackage.MODEL: return createModel();
      case SqlviewPackage.METAMODEL: return createMetamodel();
      case SqlviewPackage.EXPRESSION: return createExpression();
      case SqlviewPackage.SELECT: return createSelect();
      case SqlviewPackage.SELECT_ATTRIBUTE: return createSelectAttribute();
      case SqlviewPackage.FROM: return createFrom();
      case SqlviewPackage.JOIN: return createJoin();
      case SqlviewPackage.JOIN_LEFT: return createJoinLeft();
      case SqlviewPackage.JOIN_RIGHT: return createJoinRight();
      case SqlviewPackage.ATTRIBUTE: return createAttribute();
      case SqlviewPackage.CLASS: return createClass();
      case SqlviewPackage.METAMODEL_NAME: return createMetamodelName();
      case SqlviewPackage.RELATION: return createRelation();
      case SqlviewPackage.CONDITION: return createCondition();
      case SqlviewPackage.ECL_EXPRESSION: return createEclExpression();
      case SqlviewPackage.COMPARISON: return createComparison();
      case SqlviewPackage.LEFT: return createLeft();
      case SqlviewPackage.RIGHT: return createRight();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectAttribute createSelectAttribute()
  {
    SelectAttributeImpl selectAttribute = new SelectAttributeImpl();
    return selectAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public From createFrom()
  {
    FromImpl from = new FromImpl();
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Join createJoin()
  {
    JoinImpl join = new JoinImpl();
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinLeft createJoinLeft()
  {
    JoinLeftImpl joinLeft = new JoinLeftImpl();
    return joinLeft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinRight createJoinRight()
  {
    JoinRightImpl joinRight = new JoinRightImpl();
    return joinRight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public emfviews.dsl.sqlview.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelName createMetamodelName()
  {
    MetamodelNameImpl metamodelName = new MetamodelNameImpl();
    return metamodelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclExpression createEclExpression()
  {
    EclExpressionImpl eclExpression = new EclExpressionImpl();
    return eclExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Left createLeft()
  {
    LeftImpl left = new LeftImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Right createRight()
  {
    RightImpl right = new RightImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlviewPackage getSqlviewPackage()
  {
    return (SqlviewPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqlviewPackage getPackage()
  {
    return SqlviewPackage.eINSTANCE;
  }

} //SqlviewFactoryImpl
