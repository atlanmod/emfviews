/**
 */
package monoge.dsl.extension.impl;

import monoge.dsl.extension.AddConstraint;
import monoge.dsl.extension.AddProperty;
import monoge.dsl.extension.Create;
import monoge.dsl.extension.Extension;
import monoge.dsl.extension.ExtensionFactory;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.FilterClass;
import monoge.dsl.extension.FilterConstraint;
import monoge.dsl.extension.FilterProperty;
import monoge.dsl.extension.Generalize;
import monoge.dsl.extension.Metamodel;
import monoge.dsl.extension.Model;
import monoge.dsl.extension.ModifyClass;
import monoge.dsl.extension.ModifyOperator;
import monoge.dsl.extension.ModifyProperty;
import monoge.dsl.extension.Prefix;
import monoge.dsl.extension.Refine;
import monoge.dsl.extension.Type;
import monoge.dsl.extension.ValueAssignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionPackageImpl extends EPackageImpl implements ExtensionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterConstraintEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see monoge.dsl.extension.ExtensionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExtensionPackageImpl()
  {
    super(eNS_URI, ExtensionFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ExtensionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExtensionPackage init()
  {
    if (isInited) return (ExtensionPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionPackage.eNS_URI);

    // Obtain or create and register package
    ExtensionPackageImpl theExtensionPackage = (ExtensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theExtensionPackage.createPackageContents();

    // Initialize created meta-data
    theExtensionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExtensionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExtensionPackage.eNS_URI, theExtensionPackage);
    return theExtensionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_ExtensionName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Metamodel()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Prefix()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Extensions()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtension()
  {
    return extensionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodel()
  {
    return metamodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodel_Name()
  {
    return (EAttribute)metamodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefix()
  {
    return prefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefix_Name()
  {
    return (EAttribute)prefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreate()
  {
    return createEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreate_Class()
  {
    return (EAttribute)createEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefine()
  {
    return refineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefine_ClassNew()
  {
    return (EAttribute)refineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefine_Prefix()
  {
    return (EReference)refineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefine_ClassOriginal()
  {
    return (EAttribute)refineEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralize()
  {
    return generalizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralize_ClassNew()
  {
    return (EAttribute)generalizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralize_Prefix()
  {
    return (EReference)generalizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralize_Class()
  {
    return (EAttribute)generalizeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifyClass()
  {
    return modifyClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyClass_Prefix()
  {
    return (EReference)modifyClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModifyClass_Class()
  {
    return (EAttribute)modifyClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyClass_ModifyOperators()
  {
    return (EReference)modifyClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifyOperator()
  {
    return modifyOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddProperty()
  {
    return addPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddProperty_Property()
  {
    return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddProperty_Type()
  {
    return (EReference)addPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddProperty_Cardinality()
  {
    return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddProperty_RelationType()
  {
    return (EAttribute)addPropertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Type()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Prefix()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Class()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModifyProperty()
  {
    return modifyPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModifyProperty_Property()
  {
    return (EAttribute)modifyPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModifyProperty_Value()
  {
    return (EReference)modifyPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueAssignment()
  {
    return valueAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueAssignment_Attribute()
  {
    return (EAttribute)valueAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueAssignment_Value()
  {
    return (EAttribute)valueAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterProperty()
  {
    return filterPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterProperty_Property()
  {
    return (EAttribute)filterPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterClass()
  {
    return filterClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterClass_Prefix()
  {
    return (EReference)filterClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterClass_Class()
  {
    return (EAttribute)filterClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddConstraint()
  {
    return addConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddConstraint_Constraint()
  {
    return (EAttribute)addConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddConstraint_Value()
  {
    return (EAttribute)addConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterConstraint()
  {
    return filterConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterConstraint_Constraint()
  {
    return (EAttribute)filterConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionFactory getExtensionFactory()
  {
    return (ExtensionFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__EXTENSION_NAME);
    createEReference(modelEClass, MODEL__METAMODEL);
    createEReference(modelEClass, MODEL__PREFIX);
    createEReference(modelEClass, MODEL__EXTENSIONS);

    extensionEClass = createEClass(EXTENSION);

    metamodelEClass = createEClass(METAMODEL);
    createEAttribute(metamodelEClass, METAMODEL__NAME);

    prefixEClass = createEClass(PREFIX);
    createEAttribute(prefixEClass, PREFIX__NAME);

    createEClass = createEClass(CREATE);
    createEAttribute(createEClass, CREATE__CLASS);

    refineEClass = createEClass(REFINE);
    createEAttribute(refineEClass, REFINE__CLASS_NEW);
    createEReference(refineEClass, REFINE__PREFIX);
    createEAttribute(refineEClass, REFINE__CLASS_ORIGINAL);

    generalizeEClass = createEClass(GENERALIZE);
    createEAttribute(generalizeEClass, GENERALIZE__CLASS_NEW);
    createEReference(generalizeEClass, GENERALIZE__PREFIX);
    createEAttribute(generalizeEClass, GENERALIZE__CLASS);

    modifyClassEClass = createEClass(MODIFY_CLASS);
    createEReference(modifyClassEClass, MODIFY_CLASS__PREFIX);
    createEAttribute(modifyClassEClass, MODIFY_CLASS__CLASS);
    createEReference(modifyClassEClass, MODIFY_CLASS__MODIFY_OPERATORS);

    modifyOperatorEClass = createEClass(MODIFY_OPERATOR);

    addPropertyEClass = createEClass(ADD_PROPERTY);
    createEAttribute(addPropertyEClass, ADD_PROPERTY__PROPERTY);
    createEReference(addPropertyEClass, ADD_PROPERTY__TYPE);
    createEAttribute(addPropertyEClass, ADD_PROPERTY__CARDINALITY);
    createEAttribute(addPropertyEClass, ADD_PROPERTY__RELATION_TYPE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__TYPE);
    createEReference(typeEClass, TYPE__PREFIX);
    createEAttribute(typeEClass, TYPE__CLASS);

    modifyPropertyEClass = createEClass(MODIFY_PROPERTY);
    createEAttribute(modifyPropertyEClass, MODIFY_PROPERTY__PROPERTY);
    createEReference(modifyPropertyEClass, MODIFY_PROPERTY__VALUE);

    valueAssignmentEClass = createEClass(VALUE_ASSIGNMENT);
    createEAttribute(valueAssignmentEClass, VALUE_ASSIGNMENT__ATTRIBUTE);
    createEAttribute(valueAssignmentEClass, VALUE_ASSIGNMENT__VALUE);

    filterPropertyEClass = createEClass(FILTER_PROPERTY);
    createEAttribute(filterPropertyEClass, FILTER_PROPERTY__PROPERTY);

    filterClassEClass = createEClass(FILTER_CLASS);
    createEReference(filterClassEClass, FILTER_CLASS__PREFIX);
    createEAttribute(filterClassEClass, FILTER_CLASS__CLASS);

    addConstraintEClass = createEClass(ADD_CONSTRAINT);
    createEAttribute(addConstraintEClass, ADD_CONSTRAINT__CONSTRAINT);
    createEAttribute(addConstraintEClass, ADD_CONSTRAINT__VALUE);

    filterConstraintEClass = createEClass(FILTER_CONSTRAINT);
    createEAttribute(filterConstraintEClass, FILTER_CONSTRAINT__CONSTRAINT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    createEClass.getESuperTypes().add(this.getExtension());
    refineEClass.getESuperTypes().add(this.getExtension());
    generalizeEClass.getESuperTypes().add(this.getExtension());
    modifyClassEClass.getESuperTypes().add(this.getExtension());
    addPropertyEClass.getESuperTypes().add(this.getModifyOperator());
    modifyPropertyEClass.getESuperTypes().add(this.getModifyOperator());
    filterPropertyEClass.getESuperTypes().add(this.getModifyOperator());
    filterClassEClass.getESuperTypes().add(this.getExtension());
    addConstraintEClass.getESuperTypes().add(this.getModifyOperator());
    filterConstraintEClass.getESuperTypes().add(this.getModifyOperator());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_ExtensionName(), ecorePackage.getEString(), "extensionName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Metamodel(), this.getMetamodel(), null, "metamodel", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Prefix(), this.getPrefix(), null, "prefix", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Extensions(), this.getExtension(), null, "extensions", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetamodel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixEClass, Prefix.class, "Prefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefix_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreate_Class(), ecorePackage.getEString(), "class", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refineEClass, Refine.class, "Refine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefine_ClassNew(), ecorePackage.getEString(), "classNew", null, 0, 1, Refine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefine_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, Refine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRefine_ClassOriginal(), ecorePackage.getEString(), "classOriginal", null, 0, 1, Refine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generalizeEClass, Generalize.class, "Generalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralize_ClassNew(), ecorePackage.getEString(), "classNew", null, 0, 1, Generalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeneralize_Prefix(), this.getPrefix(), null, "prefix", null, 0, -1, Generalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeneralize_Class(), ecorePackage.getEString(), "class", null, 0, -1, Generalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyClassEClass, ModifyClass.class, "ModifyClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModifyClass_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, ModifyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModifyClass_Class(), ecorePackage.getEString(), "class", null, 0, 1, ModifyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModifyClass_ModifyOperators(), this.getModifyOperator(), null, "modifyOperators", null, 0, -1, ModifyClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyOperatorEClass, ModifyOperator.class, "ModifyOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addPropertyEClass, AddProperty.class, "AddProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddProperty_Type(), this.getType(), null, "type", null, 0, -1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddProperty_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, -1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddProperty_RelationType(), ecorePackage.getEString(), "relationType", null, 0, -1, AddProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Type(), ecorePackage.getEString(), "type", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Prefix(), this.getPrefix(), null, "prefix", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_Class(), ecorePackage.getEString(), "class", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyPropertyEClass, ModifyProperty.class, "ModifyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModifyProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, ModifyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModifyProperty_Value(), this.getValueAssignment(), null, "value", null, 0, -1, ModifyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueAssignmentEClass, ValueAssignment.class, "ValueAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueAssignment_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, ValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueAssignment_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterPropertyEClass, FilterProperty.class, "FilterProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilterProperty_Property(), ecorePackage.getEString(), "property", null, 0, 1, FilterProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterClassEClass, FilterClass.class, "FilterClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterClass_Prefix(), this.getPrefix(), null, "prefix", null, 0, 1, FilterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFilterClass_Class(), ecorePackage.getEString(), "class", null, 0, 1, FilterClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addConstraintEClass, AddConstraint.class, "AddConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, AddConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddConstraint_Value(), ecorePackage.getEString(), "value", null, 0, 1, AddConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterConstraintEClass, FilterConstraint.class, "FilterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilterConstraint_Constraint(), ecorePackage.getEString(), "constraint", null, 0, 1, FilterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ExtensionPackageImpl
