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
   * The feature id for the '<em><b>Metamodel</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__CLASS = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ATTRIBUTE = 3;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.FromImpl <em>From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.FromImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getFrom()
   * @generated
   */
  int FROM = 4;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM__CLASS = 1;

  /**
   * The number of structural features of the '<em>From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FROM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.AttributeImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 5;

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
  int CLASS = 6;

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
  int METAMODEL_NAME = 7;

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
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ConditionImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

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
   * The meta object id for the '{@link emfviews.dsl.sqlview.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see emfviews.dsl.sqlview.impl.ComparisonImpl
   * @see emfviews.dsl.sqlview.impl.SqlviewPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 9;

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
  int LEFT = 10;

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
  int RIGHT = 11;

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
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.Select#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.Select#getMetamodel()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Select#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.Select#getClass_()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Class();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.Select#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see emfviews.dsl.sqlview.Select#getAttribute()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Attribute();

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
   * Returns the meta object for the reference list '{@link emfviews.dsl.sqlview.From#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Metamodel</em>'.
   * @see emfviews.dsl.sqlview.From#getMetamodel()
   * @see #getFrom()
   * @generated
   */
  EReference getFrom_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link emfviews.dsl.sqlview.From#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class</em>'.
   * @see emfviews.dsl.sqlview.From#getClass_()
   * @see #getFrom()
   * @generated
   */
  EReference getFrom_Class();

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
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__METAMODEL = eINSTANCE.getSelect_Metamodel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__CLASS = eINSTANCE.getSelect_Class();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__ATTRIBUTE = eINSTANCE.getSelect_Attribute();

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
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM__METAMODEL = eINSTANCE.getFrom_Metamodel();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FROM__CLASS = eINSTANCE.getFrom_Class();

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
