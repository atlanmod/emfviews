/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emfviews.dsl.sqlview.SqlviewFactory
 * @model kind="package"
 * @generated
 */
public interface SqlviewPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sqlview";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.emfviews/Sqlview";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sqlview";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqlviewPackage eINSTANCE = emfviews.dsl.sqlview.impl.SqlviewPackageImpl.init();

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ModelImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>View Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__VIEW_NAME = 0;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.MetamodelImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Metamodel URL</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__METAMODEL_URL = 0;

  /**
   * The feature id for the '<em><b>Metamodel Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__METAMODEL_NAME = 1;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ExpressionImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Select</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SELECT = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__FROM = 1;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CONDITION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.SelectImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 3;

  /**
   * The feature id for the '<em><b>Select</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SELECT = 0;

  /**
   * The feature id for the '<em><b>Select Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SELECT_ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.SelectAttributeImpl <em>Select Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.SelectAttributeImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getSelectAttribute()
   * @generated
   */
  int SELECT_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ATTRIBUTE__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ATTRIBUTE__CLASS = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ATTRIBUTE__ATTRIBUTE = 2;

  /**
   * The number of structural features of the '<em>Select Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.FromImpl <em>From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.FromImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getFrom()
   * @generated
   */
  int FROM = 5;

  /**
   * The feature id for the '<em><b>Join</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__JOIN = 0;

  /**
   * The number of structural features of the '<em>From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.JoinImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoin()
   * @generated
   */
  int JOIN = 6;

  /**
   * The feature id for the '<em><b>Join Left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__JOIN_LEFT = 0;

  /**
   * The feature id for the '<em><b>Join Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__JOIN_RIGHT = 1;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__RELATION = 2;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.JoinLeftImpl <em>Join Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.JoinLeftImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoinLeft()
   * @generated
   */
  int JOIN_LEFT = 7;

  /**
   * The feature id for the '<em><b>Metamodel Left</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_LEFT__METAMODEL_LEFT = 0;

  /**
   * The feature id for the '<em><b>Class Left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_LEFT__CLASS_LEFT = 1;

  /**
   * The number of structural features of the '<em>Join Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_LEFT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.JoinRightImpl <em>Join Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.JoinRightImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoinRight()
   * @generated
   */
  int JOIN_RIGHT = 8;

  /**
   * The feature id for the '<em><b>Metamodel Right</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_RIGHT__METAMODEL_RIGHT = 0;

  /**
   * The feature id for the '<em><b>Class Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_RIGHT__CLASS_RIGHT = 1;

  /**
   * The number of structural features of the '<em>Join Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_RIGHT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.AttributeImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ClassImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.MetamodelNameImpl <em>Metamodel Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.MetamodelNameImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getMetamodelName()
   * @generated
   */
  int METAMODEL_NAME = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Metamodel Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.RelationImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ConditionImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.EclExpressionImpl <em>Ecl Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.EclExpressionImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getEclExpression()
   * @generated
   */
  int ECL_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_EXPRESSION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Ecl Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ComparisonImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = 1;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.LeftImpl <em>Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.LeftImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getLeft()
   * @generated
   */
  int LEFT = 16;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT__CLASS = 1;

  /**
   * The feature id for the '<em><b>Attribute Where Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT__ATTRIBUTE_WHERE_LEFT = 2;

  /**
   * The number of structural features of the '<em>Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.RightImpl <em>Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.RightImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getRight()
   * @generated
   */
  int RIGHT = 17;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__CLASS = 1;

  /**
   * The feature id for the '<em><b>Attribute Where Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__ATTRIBUTE_WHERE_RIGHT = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__VALUE = 3;

  /**
   * The number of structural features of the '<em>Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see emfviews.dsl.sqlview.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.Model#getViewName <em>View Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View Name</em>'.
   * @see emfviews.dsl.sqlview.Model#getViewName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_ViewName();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Model#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.Model#getMetamodel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Model#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see emfviews.dsl.sqlview.Model#getExpression()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Expression();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the attribute list '{@link emfviews.dsl.sqlview.Metamodel#getMetamodelURL <em>Metamodel URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Metamodel URL</em>'.
   * @see emfviews.dsl.sqlview.Metamodel#getMetamodelURL()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_MetamodelURL();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Metamodel#getMetamodelName <em>Metamodel Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodel Name</em>'.
   * @see emfviews.dsl.sqlview.Metamodel#getMetamodelName()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_MetamodelName();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see emfviews.dsl.sqlview.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Expression#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select</em>'.
   * @see emfviews.dsl.sqlview.Expression#getSelect()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Select();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Expression#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>From</em>'.
   * @see emfviews.dsl.sqlview.Expression#getFrom()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_From();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Expression#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Condition</em>'.
   * @see emfviews.dsl.sqlview.Expression#getCondition()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Condition();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see emfviews.dsl.sqlview.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the attribute list '{@link emfviews.dsl.sqlview.Select#getSelect <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Select</em>'.
   * @see emfviews.dsl.sqlview.Select#getSelect()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Select();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Select#getSelectAttribute <em>Select Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select Attribute</em>'.
   * @see emfviews.dsl.sqlview.Select#getSelectAttribute()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_SelectAttribute();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.SelectAttribute <em>Select Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Attribute</em>'.
   * @see emfviews.dsl.sqlview.SelectAttribute
   * @generated
   */
  EClass getSelectAttribute();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.SelectAttribute#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.SelectAttribute#getMetamodel()
   * @see #getSelectAttribute()
   * @generated
   */
  EReference getSelectAttribute_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.SelectAttribute#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.SelectAttribute#getClass_()
   * @see #getSelectAttribute()
   * @generated
   */
  EReference getSelectAttribute_Class();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.SelectAttribute#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see emfviews.dsl.sqlview.SelectAttribute#getAttribute()
   * @see #getSelectAttribute()
   * @generated
   */
  EReference getSelectAttribute_Attribute();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.From <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>From</em>'.
   * @see emfviews.dsl.sqlview.From
   * @generated
   */
  EClass getFrom();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.From#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join</em>'.
   * @see emfviews.dsl.sqlview.From#getJoin()
   * @see #getFrom()
   * @generated
   */
  EReference getFrom_Join();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see emfviews.dsl.sqlview.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Join#getJoinLeft <em>Join Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Left</em>'.
   * @see emfviews.dsl.sqlview.Join#getJoinLeft()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_JoinLeft();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Join#getJoinRight <em>Join Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Right</em>'.
   * @see emfviews.dsl.sqlview.Join#getJoinRight()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_JoinRight();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Join#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation</em>'.
   * @see emfviews.dsl.sqlview.Join#getRelation()
   * @see #getJoin()
   * @generated
   */
  EReference getJoin_Relation();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.JoinLeft <em>Join Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Left</em>'.
   * @see emfviews.dsl.sqlview.JoinLeft
   * @generated
   */
  EClass getJoinLeft();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.JoinLeft#getMetamodelLeft <em>Metamodel Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel Left</em>'.
   * @see emfviews.dsl.sqlview.JoinLeft#getMetamodelLeft()
   * @see #getJoinLeft()
   * @generated
   */
  EReference getJoinLeft_MetamodelLeft();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.JoinLeft#getClassLeft <em>Class Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Left</em>'.
   * @see emfviews.dsl.sqlview.JoinLeft#getClassLeft()
   * @see #getJoinLeft()
   * @generated
   */
  EReference getJoinLeft_ClassLeft();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.JoinRight <em>Join Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Right</em>'.
   * @see emfviews.dsl.sqlview.JoinRight
   * @generated
   */
  EClass getJoinRight();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.JoinRight#getMetamodelRight <em>Metamodel Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel Right</em>'.
   * @see emfviews.dsl.sqlview.JoinRight#getMetamodelRight()
   * @see #getJoinRight()
   * @generated
   */
  EReference getJoinRight_MetamodelRight();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.JoinRight#getClassRight <em>Class Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Right</em>'.
   * @see emfviews.dsl.sqlview.JoinRight#getClassRight()
   * @see #getJoinRight()
   * @generated
   */
  EReference getJoinRight_ClassRight();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see emfviews.dsl.sqlview.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emfviews.dsl.sqlview.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emfviews.dsl.sqlview.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.MetamodelName <em>Metamodel Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel Name</em>'.
   * @see emfviews.dsl.sqlview.MetamodelName
   * @generated
   */
  EClass getMetamodelName();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.MetamodelName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emfviews.dsl.sqlview.MetamodelName#getName()
   * @see #getMetamodelName()
   * @generated
   */
  EAttribute getMetamodelName_Name();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see emfviews.dsl.sqlview.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.Relation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see emfviews.dsl.sqlview.Relation#getName()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Name();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see emfviews.dsl.sqlview.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Condition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see emfviews.dsl.sqlview.Condition#getValue()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Value();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.EclExpression <em>Ecl Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ecl Expression</em>'.
   * @see emfviews.dsl.sqlview.EclExpression
   * @generated
   */
  EClass getEclExpression();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.EclExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see emfviews.dsl.sqlview.EclExpression#getValue()
   * @see #getEclExpression()
   * @generated
   */
  EAttribute getEclExpression_Value();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see emfviews.dsl.sqlview.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Left</em>'.
   * @see emfviews.dsl.sqlview.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see emfviews.dsl.sqlview.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Left</em>'.
   * @see emfviews.dsl.sqlview.Left
   * @generated
   */
  EClass getLeft();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.Left#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.Left#getMetamodel()
   * @see #getLeft()
   * @generated
   */
  EReference getLeft_Metamodel();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.Left#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.Left#getClass_()
   * @see #getLeft()
   * @generated
   */
  EReference getLeft_Class();

  /**
   * Returns the meta object for the containment reference '{@link emfviews.dsl.sqlview.Left#getAttributeWhereLeft <em>Attribute Where Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Where Left</em>'.
   * @see emfviews.dsl.sqlview.Left#getAttributeWhereLeft()
   * @see #getLeft()
   * @generated
   */
  EReference getLeft_AttributeWhereLeft();

  /**
   * Returns the meta object for class '{@link emfviews.dsl.sqlview.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right</em>'.
   * @see emfviews.dsl.sqlview.Right
   * @generated
   */
  EClass getRight();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.Right#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.Right#getMetamodel()
   * @see #getRight()
   * @generated
   */
  EReference getRight_Metamodel();

  /**
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.Right#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.Right#getClass_()
   * @see #getRight()
   * @generated
   */
  EReference getRight_Class();

  /**
   * Returns the meta object for the containment reference '{@link emfviews.dsl.sqlview.Right#getAttributeWhereRight <em>Attribute Where Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Where Right</em>'.
   * @see emfviews.dsl.sqlview.Right#getAttributeWhereRight()
   * @see #getRight()
   * @generated
   */
  EReference getRight_AttributeWhereRight();

  /**
   * Returns the meta object for the attribute '{@link emfviews.dsl.sqlview.Right#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see emfviews.dsl.sqlview.Right#getValue()
   * @see #getRight()
   * @generated
   */
  EAttribute getRight_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SqlviewFactory getSqlviewFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.ModelImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>View Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__VIEW_NAME = eINSTANCE.getModel_ViewName();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXPRESSION = eINSTANCE.getModel_Expression();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.MetamodelImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

    /**
     * The meta object literal for the '<em><b>Metamodel URL</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__METAMODEL_URL = eINSTANCE.getMetamodel_MetamodelURL();

    /**
     * The meta object literal for the '<em><b>Metamodel Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL__METAMODEL_NAME = eINSTANCE.getMetamodel_MetamodelName();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.ExpressionImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SELECT = eINSTANCE.getExpression_Select();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__FROM = eINSTANCE.getExpression_From();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__CONDITION = eINSTANCE.getExpression_Condition();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.SelectImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Select</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__SELECT = eINSTANCE.getSelect_Select();

    /**
     * The meta object literal for the '<em><b>Select Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__SELECT_ATTRIBUTE = eINSTANCE.getSelect_SelectAttribute();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.SelectAttributeImpl <em>Select Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.SelectAttributeImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getSelectAttribute()
     * @generated
     */
    EClass SELECT_ATTRIBUTE = eINSTANCE.getSelectAttribute();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_ATTRIBUTE__METAMODEL = eINSTANCE.getSelectAttribute_Metamodel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_ATTRIBUTE__CLASS = eINSTANCE.getSelectAttribute_Class();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getSelectAttribute_Attribute();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.FromImpl <em>From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.FromImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getFrom()
     * @generated
     */
    EClass FROM = eINSTANCE.getFrom();

    /**
     * The meta object literal for the '<em><b>Join</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM__JOIN = eINSTANCE.getFrom_Join();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.JoinImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '<em><b>Join Left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__JOIN_LEFT = eINSTANCE.getJoin_JoinLeft();

    /**
     * The meta object literal for the '<em><b>Join Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__JOIN_RIGHT = eINSTANCE.getJoin_JoinRight();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN__RELATION = eINSTANCE.getJoin_Relation();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.JoinLeftImpl <em>Join Left</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.JoinLeftImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoinLeft()
     * @generated
     */
    EClass JOIN_LEFT = eINSTANCE.getJoinLeft();

    /**
     * The meta object literal for the '<em><b>Metamodel Left</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_LEFT__METAMODEL_LEFT = eINSTANCE.getJoinLeft_MetamodelLeft();

    /**
     * The meta object literal for the '<em><b>Class Left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_LEFT__CLASS_LEFT = eINSTANCE.getJoinLeft_ClassLeft();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.JoinRightImpl <em>Join Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.JoinRightImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getJoinRight()
     * @generated
     */
    EClass JOIN_RIGHT = eINSTANCE.getJoinRight();

    /**
     * The meta object literal for the '<em><b>Metamodel Right</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_RIGHT__METAMODEL_RIGHT = eINSTANCE.getJoinRight_MetamodelRight();

    /**
     * The meta object literal for the '<em><b>Class Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_RIGHT__CLASS_RIGHT = eINSTANCE.getJoinRight_ClassRight();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.AttributeImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.ClassImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.MetamodelNameImpl <em>Metamodel Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.MetamodelNameImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getMetamodelName()
     * @generated
     */
    EClass METAMODEL_NAME = eINSTANCE.getMetamodelName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL_NAME__NAME = eINSTANCE.getMetamodelName_Name();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.RelationImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.ConditionImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__VALUE = eINSTANCE.getCondition_Value();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.EclExpressionImpl <em>Ecl Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.EclExpressionImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getEclExpression()
     * @generated
     */
    EClass ECL_EXPRESSION = eINSTANCE.getEclExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECL_EXPRESSION__VALUE = eINSTANCE.getEclExpression_Value();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.ComparisonImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.LeftImpl <em>Left</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.LeftImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getLeft()
     * @generated
     */
    EClass LEFT = eINSTANCE.getLeft();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT__METAMODEL = eINSTANCE.getLeft_Metamodel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT__CLASS = eINSTANCE.getLeft_Class();

    /**
     * The meta object literal for the '<em><b>Attribute Where Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEFT__ATTRIBUTE_WHERE_LEFT = eINSTANCE.getLeft_AttributeWhereLeft();

    /**
     * The meta object literal for the '{@link emfviews.dsl.sqlview.impl.RightImpl <em>Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see emfviews.dsl.sqlview.impl.RightImpl
     * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getRight()
     * @generated
     */
    EClass RIGHT = eINSTANCE.getRight();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT__METAMODEL = eINSTANCE.getRight_Metamodel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT__CLASS = eINSTANCE.getRight_Class();

    /**
     * The meta object literal for the '<em><b>Attribute Where Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT__ATTRIBUTE_WHERE_RIGHT = eINSTANCE.getRight_AttributeWhereRight();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RIGHT__VALUE = eINSTANCE.getRight_Value();

  }

} //SqlviewPackage
