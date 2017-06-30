/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.util;

import fr.inria.atlanmod.emfviews.virtuallinks.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage
 * @generated
 */
public class VirtualLinksAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VirtualLinksPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VirtualLinksAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = VirtualLinksPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
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
  protected VirtualLinksSwitch<Adapter> modelSwitch =
    new VirtualLinksSwitch<Adapter>() {
      @Override
      public Adapter caseWeavingModel(WeavingModel object) {
        return createWeavingModelAdapter();
      }
      @Override
      public Adapter caseVirtualLink(VirtualLink object) {
        return createVirtualLinkAdapter();
      }
      @Override
      public Adapter caseNewConcept(NewConcept object) {
        return createNewConceptAdapter();
      }
      @Override
      public Adapter caseNewProperty(NewProperty object) {
        return createNewPropertyAdapter();
      }
      @Override
      public Adapter caseNewAssociation(NewAssociation object) {
        return createNewAssociationAdapter();
      }
      @Override
      public Adapter caseElementFilter(ElementFilter object) {
        return createElementFilterAdapter();
      }
      @Override
      public Adapter caseContributingModel(ContributingModel object) {
        return createContributingModelAdapter();
      }
      @Override
      public Adapter caseConcreteElement(ConcreteElement object) {
        return createConcreteElementAdapter();
      }
      @Override
      public Adapter caseLinkedElement(LinkedElement object) {
        return createLinkedElementAdapter();
      }
      @Override
      public Adapter caseVirtualElement(VirtualElement object) {
        return createVirtualElementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object) {
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
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel <em>Weaving Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel
   * @generated
   */
  public Adapter createWeavingModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink <em>Virtual Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink
   * @generated
   */
  public Adapter createVirtualLinkAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewConcept <em>New Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewConcept
   * @generated
   */
  public Adapter createNewConceptAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewProperty <em>New Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewProperty
   * @generated
   */
  public Adapter createNewPropertyAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation <em>New Association</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation
   * @generated
   */
  public Adapter createNewAssociationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter <em>Element Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter
   * @generated
   */
  public Adapter createElementFilterAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel <em>Contributing Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel
   * @generated
   */
  public Adapter createContributingModelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement <em>Concrete Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement
   * @generated
   */
  public Adapter createConcreteElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement <em>Linked Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement
   * @generated
   */
  public Adapter createLinkedElementAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement <em>Virtual Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement
   * @generated
   */
  public Adapter createVirtualElementAdapter() {
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
  public Adapter createEObjectAdapter() {
    return null;
  }

} //VirtualLinksAdapterFactory
