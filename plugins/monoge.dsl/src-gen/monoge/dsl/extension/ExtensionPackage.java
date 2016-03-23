/**
 */
package monoge.dsl.extension;

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
 * @see monoge.dsl.extension.ExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "extension";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.monoge/Extension";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "extension";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtensionPackage eINSTANCE = monoge.dsl.extension.impl.ExtensionPackageImpl.init();

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ModelImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Extension Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXTENSION_NAME = 0;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PREFIX = 2;

  /**
   * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__EXTENSIONS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ExtensionImpl <em>Extension</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ExtensionImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getExtension()
   * @generated
   */
  int EXTENSION = 1;

  /**
   * The number of structural features of the '<em>Extension</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.MetamodelImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.PrefixImpl <em>Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.PrefixImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getPrefix()
   * @generated
   */
  int PREFIX = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX__NAME = 0;

  /**
   * The number of structural features of the '<em>Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.CreateImpl <em>Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.CreateImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getCreate()
   * @generated
   */
  int CREATE = 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__CLASS = EXTENSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.RefineImpl <em>Refine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.RefineImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getRefine()
   * @generated
   */
  int REFINE = 5;

  /**
   * The feature id for the '<em><b>Class New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE__CLASS_NEW = EXTENSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE__PREFIX = EXTENSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class Original</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE__CLASS_ORIGINAL = EXTENSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Refine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.GeneralizeImpl <em>Generalize</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.GeneralizeImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getGeneralize()
   * @generated
   */
  int GENERALIZE = 6;

  /**
   * The feature id for the '<em><b>Class New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZE__CLASS_NEW = EXTENSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZE__PREFIX = EXTENSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZE__CLASS = EXTENSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generalize</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZE_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ModifyClassImpl <em>Modify Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ModifyClassImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyClass()
   * @generated
   */
  int MODIFY_CLASS = 7;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_CLASS__PREFIX = EXTENSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_CLASS__CLASS = EXTENSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Modify Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_CLASS__MODIFY_OPERATORS = EXTENSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Modify Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_CLASS_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ModifyOperatorImpl <em>Modify Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ModifyOperatorImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyOperator()
   * @generated
   */
  int MODIFY_OPERATOR = 8;

  /**
   * The number of structural features of the '<em>Modify Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_OPERATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.AddPropertyImpl <em>Add Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.AddPropertyImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getAddProperty()
   * @generated
   */
  int ADD_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PROPERTY__PROPERTY = MODIFY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PROPERTY__TYPE = MODIFY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PROPERTY__CARDINALITY = MODIFY_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Relation Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PROPERTY__RELATION_TYPE = MODIFY_OPERATOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Add Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PROPERTY_FEATURE_COUNT = MODIFY_OPERATOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.TypeImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getType()
   * @generated
   */
  int TYPE = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PREFIX = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CLASS = 2;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ModifyPropertyImpl <em>Modify Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ModifyPropertyImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyProperty()
   * @generated
   */
  int MODIFY_PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_PROPERTY__PROPERTY = MODIFY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_PROPERTY__VALUE = MODIFY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Modify Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODIFY_PROPERTY_FEATURE_COUNT = MODIFY_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.ValueAssignmentImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getValueAssignment()
   * @generated
   */
  int VALUE_ASSIGNMENT = 12;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Value Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.FilterPropertyImpl <em>Filter Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.FilterPropertyImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterProperty()
   * @generated
   */
  int FILTER_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PROPERTY__PROPERTY = MODIFY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_PROPERTY_FEATURE_COUNT = MODIFY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.FilterClassImpl <em>Filter Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.FilterClassImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterClass()
   * @generated
   */
  int FILTER_CLASS = 14;

  /**
   * The feature id for the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CLASS__PREFIX = EXTENSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CLASS__CLASS = EXTENSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Filter Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CLASS_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.AddConstraintImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getAddConstraint()
   * @generated
   */
  int ADD_CONSTRAINT = 15;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CONSTRAINT__CONSTRAINT = MODIFY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CONSTRAINT__VALUE = MODIFY_OPERATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Add Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CONSTRAINT_FEATURE_COUNT = MODIFY_OPERATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link monoge.dsl.extension.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see monoge.dsl.extension.impl.FilterConstraintImpl
   * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterConstraint()
   * @generated
   */
  int FILTER_CONSTRAINT = 16;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CONSTRAINT__CONSTRAINT = MODIFY_OPERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Filter Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CONSTRAINT_FEATURE_COUNT = MODIFY_OPERATOR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see monoge.dsl.extension.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Model#getExtensionName <em>Extension Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extension Name</em>'.
   * @see monoge.dsl.extension.Model#getExtensionName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_ExtensionName();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.Model#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metamodel</em>'.
   * @see monoge.dsl.extension.Model#getMetamodel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Metamodel();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.Model#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix</em>'.
   * @see monoge.dsl.extension.Model#getPrefix()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Prefix();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.Model#getExtensions <em>Extensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensions</em>'.
   * @see monoge.dsl.extension.Model#getExtensions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Extensions();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Extension <em>Extension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension</em>'.
   * @see monoge.dsl.extension.Extension
   * @generated
   */
  EClass getExtension();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see monoge.dsl.extension.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Metamodel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see monoge.dsl.extension.Metamodel#getName()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_Name();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Prefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix</em>'.
   * @see monoge.dsl.extension.Prefix
   * @generated
   */
  EClass getPrefix();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Prefix#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see monoge.dsl.extension.Prefix#getName()
   * @see #getPrefix()
   * @generated
   */
  EAttribute getPrefix_Name();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create</em>'.
   * @see monoge.dsl.extension.Create
   * @generated
   */
  EClass getCreate();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Create#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see monoge.dsl.extension.Create#getClass_()
   * @see #getCreate()
   * @generated
   */
  EAttribute getCreate_Class();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Refine <em>Refine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refine</em>'.
   * @see monoge.dsl.extension.Refine
   * @generated
   */
  EClass getRefine();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Refine#getClassNew <em>Class New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class New</em>'.
   * @see monoge.dsl.extension.Refine#getClassNew()
   * @see #getRefine()
   * @generated
   */
  EAttribute getRefine_ClassNew();

  /**
   * Returns the meta object for the reference '{@link monoge.dsl.extension.Refine#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see monoge.dsl.extension.Refine#getPrefix()
   * @see #getRefine()
   * @generated
   */
  EReference getRefine_Prefix();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Refine#getClassOriginal <em>Class Original</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Original</em>'.
   * @see monoge.dsl.extension.Refine#getClassOriginal()
   * @see #getRefine()
   * @generated
   */
  EAttribute getRefine_ClassOriginal();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Generalize <em>Generalize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalize</em>'.
   * @see monoge.dsl.extension.Generalize
   * @generated
   */
  EClass getGeneralize();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.Generalize#getClassNew <em>Class New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class New</em>'.
   * @see monoge.dsl.extension.Generalize#getClassNew()
   * @see #getGeneralize()
   * @generated
   */
  EAttribute getGeneralize_ClassNew();

  /**
   * Returns the meta object for the reference list '{@link monoge.dsl.extension.Generalize#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Prefix</em>'.
   * @see monoge.dsl.extension.Generalize#getPrefix()
   * @see #getGeneralize()
   * @generated
   */
  EReference getGeneralize_Prefix();

  /**
   * Returns the meta object for the attribute list '{@link monoge.dsl.extension.Generalize#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Class</em>'.
   * @see monoge.dsl.extension.Generalize#getClass_()
   * @see #getGeneralize()
   * @generated
   */
  EAttribute getGeneralize_Class();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.ModifyClass <em>Modify Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modify Class</em>'.
   * @see monoge.dsl.extension.ModifyClass
   * @generated
   */
  EClass getModifyClass();

  /**
   * Returns the meta object for the reference '{@link monoge.dsl.extension.ModifyClass#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see monoge.dsl.extension.ModifyClass#getPrefix()
   * @see #getModifyClass()
   * @generated
   */
  EReference getModifyClass_Prefix();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.ModifyClass#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see monoge.dsl.extension.ModifyClass#getClass_()
   * @see #getModifyClass()
   * @generated
   */
  EAttribute getModifyClass_Class();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.ModifyClass#getModifyOperators <em>Modify Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modify Operators</em>'.
   * @see monoge.dsl.extension.ModifyClass#getModifyOperators()
   * @see #getModifyClass()
   * @generated
   */
  EReference getModifyClass_ModifyOperators();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.ModifyOperator <em>Modify Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modify Operator</em>'.
   * @see monoge.dsl.extension.ModifyOperator
   * @generated
   */
  EClass getModifyOperator();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.AddProperty <em>Add Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Property</em>'.
   * @see monoge.dsl.extension.AddProperty
   * @generated
   */
  EClass getAddProperty();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.AddProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see monoge.dsl.extension.AddProperty#getProperty()
   * @see #getAddProperty()
   * @generated
   */
  EAttribute getAddProperty_Property();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.AddProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see monoge.dsl.extension.AddProperty#getType()
   * @see #getAddProperty()
   * @generated
   */
  EReference getAddProperty_Type();

  /**
   * Returns the meta object for the attribute list '{@link monoge.dsl.extension.AddProperty#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cardinality</em>'.
   * @see monoge.dsl.extension.AddProperty#getCardinality()
   * @see #getAddProperty()
   * @generated
   */
  EAttribute getAddProperty_Cardinality();

  /**
   * Returns the meta object for the attribute list '{@link monoge.dsl.extension.AddProperty#getRelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Relation Type</em>'.
   * @see monoge.dsl.extension.AddProperty#getRelationType()
   * @see #getAddProperty()
   * @generated
   */
  EAttribute getAddProperty_RelationType();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see monoge.dsl.extension.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute list '{@link monoge.dsl.extension.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type</em>'.
   * @see monoge.dsl.extension.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the meta object for the reference list '{@link monoge.dsl.extension.Type#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Prefix</em>'.
   * @see monoge.dsl.extension.Type#getPrefix()
   * @see #getType()
   * @generated
   */
  EReference getType_Prefix();

  /**
   * Returns the meta object for the attribute list '{@link monoge.dsl.extension.Type#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Class</em>'.
   * @see monoge.dsl.extension.Type#getClass_()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Class();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.ModifyProperty <em>Modify Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modify Property</em>'.
   * @see monoge.dsl.extension.ModifyProperty
   * @generated
   */
  EClass getModifyProperty();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.ModifyProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see monoge.dsl.extension.ModifyProperty#getProperty()
   * @see #getModifyProperty()
   * @generated
   */
  EAttribute getModifyProperty_Property();

  /**
   * Returns the meta object for the containment reference list '{@link monoge.dsl.extension.ModifyProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see monoge.dsl.extension.ModifyProperty#getValue()
   * @see #getModifyProperty()
   * @generated
   */
  EReference getModifyProperty_Value();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.ValueAssignment <em>Value Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Assignment</em>'.
   * @see monoge.dsl.extension.ValueAssignment
   * @generated
   */
  EClass getValueAssignment();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.ValueAssignment#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see monoge.dsl.extension.ValueAssignment#getAttribute()
   * @see #getValueAssignment()
   * @generated
   */
  EAttribute getValueAssignment_Attribute();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.ValueAssignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see monoge.dsl.extension.ValueAssignment#getValue()
   * @see #getValueAssignment()
   * @generated
   */
  EAttribute getValueAssignment_Value();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.FilterProperty <em>Filter Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Property</em>'.
   * @see monoge.dsl.extension.FilterProperty
   * @generated
   */
  EClass getFilterProperty();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.FilterProperty#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see monoge.dsl.extension.FilterProperty#getProperty()
   * @see #getFilterProperty()
   * @generated
   */
  EAttribute getFilterProperty_Property();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.FilterClass <em>Filter Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Class</em>'.
   * @see monoge.dsl.extension.FilterClass
   * @generated
   */
  EClass getFilterClass();

  /**
   * Returns the meta object for the reference '{@link monoge.dsl.extension.FilterClass#getPrefix <em>Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Prefix</em>'.
   * @see monoge.dsl.extension.FilterClass#getPrefix()
   * @see #getFilterClass()
   * @generated
   */
  EReference getFilterClass_Prefix();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.FilterClass#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see monoge.dsl.extension.FilterClass#getClass_()
   * @see #getFilterClass()
   * @generated
   */
  EAttribute getFilterClass_Class();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.AddConstraint <em>Add Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Constraint</em>'.
   * @see monoge.dsl.extension.AddConstraint
   * @generated
   */
  EClass getAddConstraint();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.AddConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see monoge.dsl.extension.AddConstraint#getConstraint()
   * @see #getAddConstraint()
   * @generated
   */
  EAttribute getAddConstraint_Constraint();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.AddConstraint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see monoge.dsl.extension.AddConstraint#getValue()
   * @see #getAddConstraint()
   * @generated
   */
  EAttribute getAddConstraint_Value();

  /**
   * Returns the meta object for class '{@link monoge.dsl.extension.FilterConstraint <em>Filter Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Constraint</em>'.
   * @see monoge.dsl.extension.FilterConstraint
   * @generated
   */
  EClass getFilterConstraint();

  /**
   * Returns the meta object for the attribute '{@link monoge.dsl.extension.FilterConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see monoge.dsl.extension.FilterConstraint#getConstraint()
   * @see #getFilterConstraint()
   * @generated
   */
  EAttribute getFilterConstraint_Constraint();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExtensionFactory getExtensionFactory();

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
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ModelImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__EXTENSION_NAME = eINSTANCE.getModel_ExtensionName();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PREFIX = eINSTANCE.getModel_Prefix();

    /**
     * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__EXTENSIONS = eINSTANCE.getModel_Extensions();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ExtensionImpl <em>Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ExtensionImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getExtension()
     * @generated
     */
    EClass EXTENSION = eINSTANCE.getExtension();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.MetamodelImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.PrefixImpl <em>Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.PrefixImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getPrefix()
     * @generated
     */
    EClass PREFIX = eINSTANCE.getPrefix();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX__NAME = eINSTANCE.getPrefix_Name();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.CreateImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getCreate()
     * @generated
     */
    EClass CREATE = eINSTANCE.getCreate();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE__CLASS = eINSTANCE.getCreate_Class();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.RefineImpl <em>Refine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.RefineImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getRefine()
     * @generated
     */
    EClass REFINE = eINSTANCE.getRefine();

    /**
     * The meta object literal for the '<em><b>Class New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFINE__CLASS_NEW = eINSTANCE.getRefine_ClassNew();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINE__PREFIX = eINSTANCE.getRefine_Prefix();

    /**
     * The meta object literal for the '<em><b>Class Original</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFINE__CLASS_ORIGINAL = eINSTANCE.getRefine_ClassOriginal();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.GeneralizeImpl <em>Generalize</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.GeneralizeImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getGeneralize()
     * @generated
     */
    EClass GENERALIZE = eINSTANCE.getGeneralize();

    /**
     * The meta object literal for the '<em><b>Class New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZE__CLASS_NEW = eINSTANCE.getGeneralize_ClassNew();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZE__PREFIX = eINSTANCE.getGeneralize_Prefix();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZE__CLASS = eINSTANCE.getGeneralize_Class();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ModifyClassImpl <em>Modify Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ModifyClassImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyClass()
     * @generated
     */
    EClass MODIFY_CLASS = eINSTANCE.getModifyClass();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_CLASS__PREFIX = eINSTANCE.getModifyClass_Prefix();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFY_CLASS__CLASS = eINSTANCE.getModifyClass_Class();

    /**
     * The meta object literal for the '<em><b>Modify Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_CLASS__MODIFY_OPERATORS = eINSTANCE.getModifyClass_ModifyOperators();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ModifyOperatorImpl <em>Modify Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ModifyOperatorImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyOperator()
     * @generated
     */
    EClass MODIFY_OPERATOR = eINSTANCE.getModifyOperator();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.AddPropertyImpl <em>Add Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.AddPropertyImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getAddProperty()
     * @generated
     */
    EClass ADD_PROPERTY = eINSTANCE.getAddProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_PROPERTY__PROPERTY = eINSTANCE.getAddProperty_Property();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_PROPERTY__TYPE = eINSTANCE.getAddProperty_Type();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_PROPERTY__CARDINALITY = eINSTANCE.getAddProperty_Cardinality();

    /**
     * The meta object literal for the '<em><b>Relation Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_PROPERTY__RELATION_TYPE = eINSTANCE.getAddProperty_RelationType();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.TypeImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__PREFIX = eINSTANCE.getType_Prefix();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__CLASS = eINSTANCE.getType_Class();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ModifyPropertyImpl <em>Modify Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ModifyPropertyImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getModifyProperty()
     * @generated
     */
    EClass MODIFY_PROPERTY = eINSTANCE.getModifyProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODIFY_PROPERTY__PROPERTY = eINSTANCE.getModifyProperty_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODIFY_PROPERTY__VALUE = eINSTANCE.getModifyProperty_Value();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.ValueAssignmentImpl <em>Value Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.ValueAssignmentImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getValueAssignment()
     * @generated
     */
    EClass VALUE_ASSIGNMENT = eINSTANCE.getValueAssignment();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_ASSIGNMENT__ATTRIBUTE = eINSTANCE.getValueAssignment_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_ASSIGNMENT__VALUE = eINSTANCE.getValueAssignment_Value();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.FilterPropertyImpl <em>Filter Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.FilterPropertyImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterProperty()
     * @generated
     */
    EClass FILTER_PROPERTY = eINSTANCE.getFilterProperty();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_PROPERTY__PROPERTY = eINSTANCE.getFilterProperty_Property();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.FilterClassImpl <em>Filter Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.FilterClassImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterClass()
     * @generated
     */
    EClass FILTER_CLASS = eINSTANCE.getFilterClass();

    /**
     * The meta object literal for the '<em><b>Prefix</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_CLASS__PREFIX = eINSTANCE.getFilterClass_Prefix();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_CLASS__CLASS = eINSTANCE.getFilterClass_Class();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.AddConstraintImpl <em>Add Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.AddConstraintImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getAddConstraint()
     * @generated
     */
    EClass ADD_CONSTRAINT = eINSTANCE.getAddConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_CONSTRAINT__CONSTRAINT = eINSTANCE.getAddConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_CONSTRAINT__VALUE = eINSTANCE.getAddConstraint_Value();

    /**
     * The meta object literal for the '{@link monoge.dsl.extension.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see monoge.dsl.extension.impl.FilterConstraintImpl
     * @see monoge.dsl.extension.impl.ExtensionPackageImpl#getFilterConstraint()
     * @generated
     */
    EClass FILTER_CONSTRAINT = eINSTANCE.getFilterConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_CONSTRAINT__CONSTRAINT = eINSTANCE.getFilterConstraint_Constraint();

  }

} //ExtensionPackage
