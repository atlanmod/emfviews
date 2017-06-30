/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import fr.inria.atlanmod.emfviews.virtuallinks.*;

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
public class VirtualLinksFactoryImpl extends EFactoryImpl implements VirtualLinksFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VirtualLinksFactory init() {
    try {
      VirtualLinksFactory theVirtualLinksFactory = (VirtualLinksFactory)EPackage.Registry.INSTANCE.getEFactory(VirtualLinksPackage.eNS_URI);
      if (theVirtualLinksFactory != null) {
        return theVirtualLinksFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VirtualLinksFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualLinksFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case VirtualLinksPackage.WEAVING_MODEL: return createWeavingModel();
      case VirtualLinksPackage.NEW_CONCEPT: return createNewConcept();
      case VirtualLinksPackage.NEW_PROPERTY: return createNewProperty();
      case VirtualLinksPackage.NEW_ASSOCIATION: return createNewAssociation();
      case VirtualLinksPackage.ELEMENT_FILTER: return createElementFilter();
      case VirtualLinksPackage.CONTRIBUTING_MODEL: return createContributingModel();
      case VirtualLinksPackage.CONCRETE_ELEMENT: return createConcreteElement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeavingModel createWeavingModel() {
    WeavingModelImpl weavingModel = new WeavingModelImpl();
    return weavingModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewConcept createNewConcept() {
    NewConceptImpl newConcept = new NewConceptImpl();
    return newConcept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewProperty createNewProperty() {
    NewPropertyImpl newProperty = new NewPropertyImpl();
    return newProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewAssociation createNewAssociation() {
    NewAssociationImpl newAssociation = new NewAssociationImpl();
    return newAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementFilter createElementFilter() {
    ElementFilterImpl elementFilter = new ElementFilterImpl();
    return elementFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributingModel createContributingModel() {
    ContributingModelImpl contributingModel = new ContributingModelImpl();
    return contributingModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConcreteElement createConcreteElement() {
    ConcreteElementImpl concreteElement = new ConcreteElementImpl();
    return concreteElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualLinksPackage getVirtualLinksPackage() {
    return (VirtualLinksPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VirtualLinksPackage getPackage() {
    return VirtualLinksPackage.eINSTANCE;
  }

} //VirtualLinksFactoryImpl
