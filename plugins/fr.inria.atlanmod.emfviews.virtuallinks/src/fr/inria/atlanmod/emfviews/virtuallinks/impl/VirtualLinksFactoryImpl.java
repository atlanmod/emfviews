/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class VirtualLinksFactoryImpl extends EFactoryImpl implements VirtualLinksFactory {
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public static VirtualLinksFactory init() {
    try {
      VirtualLinksFactory theVirtualLinksFactory =
          (VirtualLinksFactory) EPackage.Registry.INSTANCE.getEFactory(VirtualLinksPackage.eNS_URI);
      if (theVirtualLinksFactory != null) {
        return theVirtualLinksFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VirtualLinksFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public VirtualLinksFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case VirtualLinksPackage.WEAVING_MODEL:
      return createWeavingModel();
    case VirtualLinksPackage.VIRTUAL_CONCEPT:
      return createVirtualConcept();
    case VirtualLinksPackage.VIRTUAL_PROPERTY:
      return createVirtualProperty();
    case VirtualLinksPackage.VIRTUAL_ASSOCIATION:
      return createVirtualAssociation();
    case VirtualLinksPackage.FILTER:
      return createFilter();
    case VirtualLinksPackage.CONTRIBUTING_MODEL:
      return createContributingModel();
    case VirtualLinksPackage.CONCRETE_ELEMENT:
      return createConcreteElement();
    case VirtualLinksPackage.CONCRETE_CONCEPT:
      return createConcreteConcept();
    case VirtualLinksPackage.CONCRETE_ASSOCIATION:
      return createConcreteAssociation();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName()
          + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public WeavingModel createWeavingModel() {
    WeavingModelImpl weavingModel = new WeavingModelImpl();
    return weavingModel;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualConcept createVirtualConcept() {
    VirtualConceptImpl virtualConcept = new VirtualConceptImpl();
    return virtualConcept;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualProperty createVirtualProperty() {
    VirtualPropertyImpl virtualProperty = new VirtualPropertyImpl();
    return virtualProperty;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualAssociation createVirtualAssociation() {
    VirtualAssociationImpl virtualAssociation = new VirtualAssociationImpl();
    return virtualAssociation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Filter createFilter() {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ContributingModel createContributingModel() {
    ContributingModelImpl contributingModel = new ContributingModelImpl();
    return contributingModel;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ConcreteElement createConcreteElement() {
    ConcreteElementImpl concreteElement = new ConcreteElementImpl();
    return concreteElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ConcreteConcept createConcreteConcept() {
    ConcreteConceptImpl concreteConcept = new ConcreteConceptImpl();
    return concreteConcept;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ConcreteAssociation createConcreteAssociation() {
    ConcreteAssociationImpl concreteAssociation = new ConcreteAssociationImpl();
    return concreteAssociation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public VirtualLinksPackage getVirtualLinksPackage() {
    return (VirtualLinksPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VirtualLinksPackage getPackage() {
    return VirtualLinksPackage.eINSTANCE;
  }

} // VirtualLinksFactoryImpl
