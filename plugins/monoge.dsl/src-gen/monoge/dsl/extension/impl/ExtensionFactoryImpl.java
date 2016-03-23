/**
 */
package monoge.dsl.extension.impl;

import monoge.dsl.extension.*;

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
public class ExtensionFactoryImpl extends EFactoryImpl implements ExtensionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExtensionFactory init()
  {
    try
    {
      ExtensionFactory theExtensionFactory = (ExtensionFactory)EPackage.Registry.INSTANCE.getEFactory(ExtensionPackage.eNS_URI);
      if (theExtensionFactory != null)
      {
        return theExtensionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtensionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionFactoryImpl()
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
      case ExtensionPackage.MODEL: return createModel();
      case ExtensionPackage.EXTENSION: return createExtension();
      case ExtensionPackage.METAMODEL: return createMetamodel();
      case ExtensionPackage.PREFIX: return createPrefix();
      case ExtensionPackage.CREATE: return createCreate();
      case ExtensionPackage.REFINE: return createRefine();
      case ExtensionPackage.GENERALIZE: return createGeneralize();
      case ExtensionPackage.MODIFY_CLASS: return createModifyClass();
      case ExtensionPackage.MODIFY_OPERATOR: return createModifyOperator();
      case ExtensionPackage.ADD_PROPERTY: return createAddProperty();
      case ExtensionPackage.TYPE: return createType();
      case ExtensionPackage.MODIFY_PROPERTY: return createModifyProperty();
      case ExtensionPackage.VALUE_ASSIGNMENT: return createValueAssignment();
      case ExtensionPackage.FILTER_PROPERTY: return createFilterProperty();
      case ExtensionPackage.FILTER_CLASS: return createFilterClass();
      case ExtensionPackage.ADD_CONSTRAINT: return createAddConstraint();
      case ExtensionPackage.FILTER_CONSTRAINT: return createFilterConstraint();
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
  public Extension createExtension()
  {
    ExtensionImpl extension = new ExtensionImpl();
    return extension;
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
  public Prefix createPrefix()
  {
    PrefixImpl prefix = new PrefixImpl();
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refine createRefine()
  {
    RefineImpl refine = new RefineImpl();
    return refine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generalize createGeneralize()
  {
    GeneralizeImpl generalize = new GeneralizeImpl();
    return generalize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyClass createModifyClass()
  {
    ModifyClassImpl modifyClass = new ModifyClassImpl();
    return modifyClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyOperator createModifyOperator()
  {
    ModifyOperatorImpl modifyOperator = new ModifyOperatorImpl();
    return modifyOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddProperty createAddProperty()
  {
    AddPropertyImpl addProperty = new AddPropertyImpl();
    return addProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModifyProperty createModifyProperty()
  {
    ModifyPropertyImpl modifyProperty = new ModifyPropertyImpl();
    return modifyProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueAssignment createValueAssignment()
  {
    ValueAssignmentImpl valueAssignment = new ValueAssignmentImpl();
    return valueAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterProperty createFilterProperty()
  {
    FilterPropertyImpl filterProperty = new FilterPropertyImpl();
    return filterProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterClass createFilterClass()
  {
    FilterClassImpl filterClass = new FilterClassImpl();
    return filterClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddConstraint createAddConstraint()
  {
    AddConstraintImpl addConstraint = new AddConstraintImpl();
    return addConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterConstraint createFilterConstraint()
  {
    FilterConstraintImpl filterConstraint = new FilterConstraintImpl();
    return filterConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionPackage getExtensionPackage()
  {
    return (ExtensionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtensionPackage getPackage()
  {
    return ExtensionPackage.eINSTANCE;
  }

} //ExtensionFactoryImpl
