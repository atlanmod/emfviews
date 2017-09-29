package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.core.Viewpoint;
import fr.inria.atlanmod.emfviews.elements.VirtualEAttribute;
import fr.inria.atlanmod.emfviews.elements.VirtualEClass;
import fr.inria.atlanmod.emfviews.elements.VirtualEObject;
import fr.inria.atlanmod.emfviews.elements.VirtualEPackage;
import fr.inria.atlanmod.emfviews.elements.VirtualEReference;

public class TestVirtualObjects {

  // Create a concrete metamodel before each test instead of one per class,
  // since a test might modify it.
  private EPackage P;
  private EClass A;
  private EClass B;
  private EClass S;
  private EAttribute a;
  private EAttribute s;
  private Viewpoint viewpoint;
  private View view;

  @Before
  public void createConcreteModel() {
    P = EcoreFactory.eINSTANCE.createEPackage();
    P.setName("P");

    A = EcoreFactory.eINSTANCE.createEClass();
    A.setName("A");
    P.getEClassifiers().add(A);

    a = EcoreFactory.eINSTANCE.createEAttribute();
    a.setName("a");
    a.setEType(EcorePackage.Literals.EINT);
    A.getEStructuralFeatures().add(a);

    B = EcoreFactory.eINSTANCE.createEClass();
    B.setName("B");
    P.getEClassifiers().add(B);

    S = EcoreFactory.eINSTANCE.createEClass();
    S.setName("S");
    S.getESuperTypes().add(A);
    P.getEClassifiers().add(S);

    s = EcoreFactory.eINSTANCE.createEAttribute();
    s.setName("s");
    s.setEType(EcorePackage.Literals.ESTRING);
    S.getEStructuralFeatures().add(s);

    viewpoint = new Viewpoint();
    view = new View();
    view.setViewpoint(viewpoint);
  }

  @After
  public void destroyConcreteModel() {
    P = null;
    A = null;
    B = null;
    a = null;
    view = null;
    viewpoint = null;
  }

  @Test
  public void virtualEPackage() {
    // Wrapping an EPackage with VirtualEPackage, we can still access its features

    // Create the virtual package
    EPackage VP = viewpoint.getVirtual(P);

    // Simple features
    assertEquals(P.getName(), VP.getName());
    assertEquals(P.getNsPrefix(), VP.getNsPrefix());
    assertEquals(P.getNsURI(), VP.getNsURI());

    // Create a super package to check sub/superpackage features consistency
    EPackage SP = EcoreFactory.eINSTANCE.createEPackage();
    SP.setName("SP");
    SP.getESubpackages().add(P);
    EPackage VSP = viewpoint.getVirtual(SP);

    assertEquals(viewpoint.getVirtual(P.getESuperPackage()), VP.getESuperPackage());
    assertEquals(1, VSP.getESubpackages().size());
    assertEquals(VP, VSP.getESubpackages().get(0));

    // eClassifiers feature
    assertEquals(3, VP.getEClassifiers().size());
    assertEquals(viewpoint.getVirtual(A), VP.getEClassifiers().get(0));
    assertEquals(viewpoint.getVirtual(B), VP.getEClassifiers().get(1));
    assertEquals(viewpoint.getVirtual(S), VP.getEClassifiers().get(2));

    // Can access classifiers using the EPackage method and reflective API
    assertEquals(viewpoint.getVirtual(A), VP.getEClassifier("A"));
    assertEquals(viewpoint.getVirtual(A), getClassifier(VP, "A").get());

    // eContents should return all containment references, so classifiers
    assertEquals(3, VP.eContents().size());
    assertEquals(viewpoint.getVirtual(A), VP.eContents().get(0));
    assertEquals(viewpoint.getVirtual(B), VP.eContents().get(1));
    assertEquals(viewpoint.getVirtual(S), VP.eContents().get(2));

    // For the super package, we only have the subpackage P as contents
    assertEquals(1, VSP.eContents().size());
    assertEquals(VP, VSP.eContents().get(0));
  }

  @Test
  public void virtualEClass() {
    // Wrapping an EClass with VirtualEClass, we can still access its features

    // Create the virtual class
    EClass VA = viewpoint.getVirtual(A);

    // Simple features
    assertEquals(A.getName(), VA.getName());
    assertEquals(VA.getInstanceClassName(), A.getInstanceClassName());
    assertEquals(VA.getInstanceClass(), A.getInstanceClass());
    assertEquals(VA.getInstanceTypeName(), A.getInstanceTypeName());
    assertEquals(VA.getDefaultValue(), A.getDefaultValue());
    // @Correctness: not sure what this should return in the presence of filters
    //assertEquals(VA.getClassifierID(), A.getClassifierID());
    assertEquals(VA.isAbstract(), A.isAbstract());
    assertEquals(VA.isInterface(), A.isInterface());

    // eStructuralFeatures
    assertEquals(1, VA.getEStructuralFeatures().size());
    assertEquals(viewpoint.getVirtual(a), VA.getEStructuralFeatures().get(0));

    // Can access features using the EClass method and reflective API
    assertEquals("a", eGet(VA.getEStructuralFeature("a"), "name"));
    assertEquals("a", eGet(getFeature(VA, "a").get(), "name"));

    // eAllStructuralFeatures
    EClass VS = viewpoint.getVirtual(S);
    assertEquals(2, VS.getEAllStructuralFeatures().size());
    assertEquals(viewpoint.getVirtual(a), VS.getEAllStructuralFeatures().get(0));
    assertEquals(viewpoint.getVirtual(s), VS.getEAllStructuralFeatures().get(1));

    // eSuperTypes
    assertEquals(1, VS.getESuperTypes().size());
    assertEquals(VA, VS.getESuperTypes().get(0));

    // eAllSuperTypes
    assertEquals(1, VS.getEAllSuperTypes().size());
    A.getESuperTypes().add(B);
    assertEquals(2, VS.getEAllSuperTypes().size());
    assertEquals(viewpoint.getVirtual(B), VS.getEAllSuperTypes().get(0));
    assertEquals(viewpoint.getVirtual(A), VS.getEAllSuperTypes().get(1));

    // eReferences
    assertEquals(0, VA.getEReferences().size());
    EReference r = EcoreFactory.eINSTANCE.createEReference();
    A.getEStructuralFeatures().add(r);
    assertEquals(1, VA.getEReferences().size());
    assertEquals(viewpoint.getVirtual(r), VA.getEReferences().get(0));

    // eAllReferences
    EReference r2 = EcoreFactory.eINSTANCE.createEReference();
    S.getEStructuralFeatures().add(r2);
    assertEquals(2, VS.getEAllReferences().size());
    assertEquals(viewpoint.getVirtual(r), VS.getEAllReferences().get(0));
    assertEquals(viewpoint.getVirtual(r2), VS.getEAllReferences().get(1));

    // eAllContainments
    r.setContainment(true);
    assertEquals(1, VS.getEAllContainments().size());
    assertEquals(viewpoint.getVirtual(r), VS.getEAllContainments().get(0));

    // eAttributes
    assertEquals(1, VA.getEAttributes().size());
    assertEquals(viewpoint.getVirtual(a), VA.getEAttributes().get(0));

    // eAllAttributes
    assertEquals(2, VS.getEAllAttributes().size());
    assertEquals(viewpoint.getVirtual(a), VS.getEAllAttributes().get(0));
    assertEquals(viewpoint.getVirtual(s), VS.getEAllAttributes().get(1));

    // eIDAttribute
    assertEquals(A.getEIDAttribute(), VA.getEIDAttribute());

    // ePackage
    assertEquals(viewpoint.getVirtual(A.getEPackage()), VA.getEPackage());

    assertEquals(A.getFeatureCount(), VA.getFeatureCount());
  }

  @Test
  public void virtualEFeature() {
    EStructuralFeature va = viewpoint.getVirtual(a);

    assertEquals(a.getName(), va.getName());

    // ETypedElement features
    assertEquals(a.isOrdered(), va.isOrdered());
    assertEquals(a.isUnique(), va.isUnique());
    assertEquals(a.getLowerBound(), va.getLowerBound());
    assertEquals(a.getUpperBound(), va.getUpperBound());
    assertEquals(a.isMany(), va.isMany());
    assertEquals(a.isRequired(), va.isRequired());
    assertEquals(viewpoint.getVirtual(a.getEType()), va.getEType());

    // Test eType with an EClass instead of an EDataType
    a.setEType(A);
    assertEquals(viewpoint.getVirtual(a.getEType()), va.getEType());

    // EStructuralFeature features
    assertEquals(a.isChangeable(), va.isChangeable());
    assertEquals(a.isVolatile(), va.isVolatile());
    assertEquals(a.isTransient(), va.isTransient());
    assertEquals(a.getDefaultValueLiteral(), va.getDefaultValueLiteral());
    assertEquals(a.getDefaultValue(), va.getDefaultValue());
    assertEquals(a.isUnsettable(), va.isUnsettable());
    assertEquals(a.isDerived(), va.isDerived());
    // @Correctness: not sure what this should return in the presence of filters
    //assertEquals(a.getFeatureID(), va.getFeatureID());
    assertEquals(a.getContainerClass(), va.getContainerClass());
    assertEquals(viewpoint.getVirtual(a.getEContainingClass()), va.getEContainingClass());
  }

  @Test
  public void virtualEAttribute() {
    EAttribute va = viewpoint.getVirtual(a);

    // EAttribute features
    assertEquals(a.isID(), va.isID());
    assertEquals(a.getEAttributeType(), va.getEAttributeType());
  }

  @Test
  public void virtualEReference() {
    // Create the references
    EReference r = EcoreFactory.eINSTANCE.createEReference();
    r.setName("r");
    r.setEType(A);
    A.getEStructuralFeatures().add(r);

    EReference r2 = EcoreFactory.eINSTANCE.createEReference();
    r2.setName("r2");
    r2.setEType(B);
    A.getEStructuralFeatures().add(r2);

    r.setEOpposite(r2);

    EReference vr = viewpoint.getVirtual(r);

    // EReference features
    assertEquals(r.isContainment(), vr.isContainment());
    assertEquals(r.isContainer(), vr.isContainer());
    assertEquals(r.isResolveProxies(), vr.isResolveProxies());
    assertEquals(viewpoint.getVirtual(r.getEReferenceType()), vr.getEReferenceType());
    assertEquals(viewpoint.getVirtual(r.getEOpposite()), vr.getEOpposite());
  }

  @Test
  public void addVirtualClass() {
    // Adding a virtual class to a VirtualEPackage

    // Create the virtual package
    VirtualEPackage VP = (VirtualEPackage) viewpoint.getVirtual(P);

    // Create the virtual class
    EClass c = EcoreFactory.eINSTANCE.createEClass();
    c.setName("C");
    VirtualEClass Vc = (VirtualEClass) viewpoint.getVirtual(c);
    VP.addVirtualClassifier(Vc);

    EAttribute a = EcoreFactory.eINSTANCE.createEAttribute();
    a.setName("a");
    a.setEType(EcorePackage.Literals.EINT);
    c.getEStructuralFeatures().add(a);

    // Can access the classifier using the EPackage method and reflective API
    assertEquals(Vc, VP.getEClassifier("C"));
    assertEquals(Vc, getClassifier(VP, "C").get());

    // Can create a virtual object with that new class as metaclass
    //
    // Looks like we have to have an EPackage for C if we want to create an instance of it.
    // Even manually creating a DynamicEObjectImpl with C as eClass ends up
    // with a NPE in eGet if there is no EPackage.
    EPackage dumbPackage = EcoreFactory.eINSTANCE.createEPackage();
    dumbPackage.getEClassifiers().add(c);
    VirtualEObject Vo = (VirtualEObject) view.getVirtual(EcoreUtil.create(c));

    // Can access set and get the feature in there
    Vo.eSet(0, 1);
    assertEquals(1, Vo.eGet(0, false, false));
    assertEquals(1, eGet(Vo, "a"));
  }

  @Test
  public void filterClass() {
    // Hide class from a virtual package

    VirtualEPackage VP = (VirtualEPackage) viewpoint.getVirtual(P);

    assertTrue(getClassifier(VP, "A").isPresent());
    assertTrue(getClassifier(VP, "B").isPresent());

    VP.filterClassifier((EClassifier) getClassifier(VP, "A").get());

    assertFalse(getClassifier(VP, "A").isPresent());
    assertTrue(getClassifier(VP, "B").isPresent());
  }

  @Test
  public void dynamicObject() {
    // We can use a VirtualEClass with a DynamicEObject, but
    // the dynamic object is oblivious to virtual and filtered features

    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);

    {
      DynamicEObjectImpl Do = new DynamicEObjectImpl(VA);

      // Have to get the virtual feature instead of the concrete one for the reflexive calls
      EStructuralFeature a = (EStructuralFeature) getFeature(VA, "a").get();

      // But the dynamic object can access the feature
      Do.eSet(a, 1);
      assertEquals(1, Do.eGet(a));
      assertEquals(1, eGet(Do, "a"));
    }

    // Create a virtual feature
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = (VirtualEAttribute) viewpoint.getVirtual(b);
    VA.addVirtualFeature(Vb);

    {
      // Have to recreate the dynamic object because the eSettings object is
      // fixed to the number of features of the metaclass and does not change dynamically
      DynamicEObjectImpl Do = new DynamicEObjectImpl(VA);

      // The dynamic object can access the virtual feature as well
      Do.eSet(Vb, 2);
      assertEquals(2, Do.eGet(Vb));
      assertEquals(2, eGet(Do, "b"));

      // But once we filter out a feature, dynamic object is lost
      VA.filterFeature((EStructuralFeature) getFeature(VA, "a").get());

      // We should get 2, but we get null, because the feature "b" now has index 0
      // in the eSettings object of dynamic object.
      assertEquals(null, Do.eGet(Vb));
    }
  }

  @Test
  public void virtualEObject() {
    // Wrapping an object with a VirtualEObject, we can still access its features
    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);

    // Create the virtual object
    EObject o = EcoreUtil.create(A);
    o.eSet(a, 1);
    EObject VO = view.getVirtual(o);

    // We can still access the value of the feature 'a'
    assertEquals(1, eGet(VO, "a"));

    // Add a virtual feature 'b' to VA
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = (VirtualEAttribute) viewpoint.getVirtual(b);
    VA.addVirtualFeature(Vb);

    // The feature can be set and get on the same virtual object
    VO.eSet(Vb, 2);
    assertEquals(2, VO.eGet(Vb));
    assertEquals(1, eGet(VO, "a"));

    // Filter the first feature
    VA.filterFeature((EStructuralFeature) getFeature(VA, "a").get());

    // We can still access the non-filtered feature 'b', through different means
    assertEquals(2, VO.eGet(Vb));
    assertEquals(2, ((VirtualEObject) VO).eGet(0, false, false));
    assertEquals(2, eGet(VO, "b"));

    // Accessing the 'a' feature fails
    try {
      assertEquals(1, eGet(VO, "a"));
      fail("Expected eGet to fail");
    } catch (IllegalArgumentException ex) {
      assertEquals("Feature 'a' does not exist on eClass", ex.getMessage());
    }

    // The feature of index 0 is the feature 'b'
    assertEquals(2, ((VirtualEObject) VO).eGet(0, false, false));
  }

  @Test
  public void addVirtualAttribute() {
    // Adding a virtual attribute to a VirtualEClass

    // Create the virtual class
    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);

    // Add a virtual attribute
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = (VirtualEAttribute) viewpoint.getVirtual(b);
    VA.addVirtualFeature(Vb);

    // Can access the features using the EClass method and reflective API
    assertEquals(Vb, VA.getEStructuralFeature("b"));
    assertEquals(Vb, getFeature(VA, "b").get());

    // A virtual model object with the virtual class as metaclass can use the feature
    EObject o = EcoreUtil.create(A);
    VirtualEObject VO = (VirtualEObject) view.getVirtual(o);

    // We can set a value
    VO.eSet(Vb, 2);

    // And get it back
    assertEquals(2, eGet(VO, "b"));
  }

  @Test
  public void addVirtualReference() {
    // Adding a virtual reference to a VirtualEClass

    // Create the virtual classes
    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);
    VirtualEClass VB = (VirtualEClass) viewpoint.getVirtual(B);

    // Add the new reference
    EReference r = EcoreFactory.eINSTANCE.createEReference();
    r.setName("AtoB");
    r.setEType(VB);
    r.setLowerBound(0);
    r.setUpperBound(-1);
    VirtualEReference Vr = (VirtualEReference) viewpoint.getVirtual(r);
    VA.addVirtualFeature(Vr);

    // Create one A and two Bs
    EObject a = EcoreUtil.create(A);
    EObject b1 = EcoreUtil.create(B);
    EObject b2 = EcoreUtil.create(B);

    VirtualEObject Va = (VirtualEObject) view.getVirtual(a);
    VirtualEObject Vb1 = (VirtualEObject) view.getVirtual(b1);
    VirtualEObject Vb2 = (VirtualEObject) view.getVirtual(b2);

    // Populate the feature with two Bs
    EList<EObject> listOfB = eList(Va, "AtoB");
    listOfB.add(Vb1);
    listOfB.add(Vb2);

    assertEquals(Vb1, eList(Va, "AtoB").get(0));
    assertEquals(Vb2, eList(Va, "AtoB").get(1));
  }

  @Test
  public void concreteReference() {
    // Accessing a concrete reference through a virtual object should return
    // virtualized objects

    // Add a reference from A to B
    EReference r = EcoreFactory.eINSTANCE.createEReference();
    r.setName("AtoB");
    r.setEType(B);
    r.setLowerBound(0);
    r.setUpperBound(-1);
    A.getEStructuralFeatures().add(r);

    // Create one A and two Bs
    EObject a = EcoreUtil.create(A);
    EObject b1 = EcoreUtil.create(B);
    EObject b2 = EcoreUtil.create(B);

    // Populate the reference AtoB in a
    EList<EObject> listOfB = eList(a, "AtoB");
    listOfB.add(b1);
    listOfB.add(b2);

    // Ensure the b are virtualized when accessing the feature virtually
    VirtualEObject Va = (VirtualEObject) view.getVirtual(a);
    listOfB = eList(Va, "AtoB");

    assertEquals(view.getVirtual(b1), listOfB.get(0));
    assertEquals(view.getVirtual(b2), listOfB.get(1));
  }

  @Test
  public void filterFeature() {
    // Filter an existing feature

    // Add a feature on A
    EAttribute a2 = EcoreFactory.eINSTANCE.createEAttribute();
    a2.setName("a2");
    a2.setEType(EcorePackage.Literals.EINT);
    A.getEStructuralFeatures().add(a2);

    // Wrap A in a virtual class
    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);

    // Ensure both features are here
    assertTrue(getFeature(VA, "a").isPresent());
    assertTrue(getFeature(VA, "a2").isPresent());

    // Filter the first one
    VA.filterFeature((EStructuralFeature) getFeature(VA, "a").get());

    // Now you can't see it
    assertEquals(Optional.empty(), getFeature(VA, "a"));
    assertTrue(getFeature(VA, "a2").isPresent());

    // The feature is not available on model objects either
    EObject o = EcoreUtil.create(A);
    o.eSet(a, 1);
    o.eSet(a2, 2);
    VirtualEObject Vo = (VirtualEObject) view.getVirtual(o);

    try {
      assertEquals(1, eGet(Vo, "a"));
      fail("Expected eGet to fail on hidden feature");
    } catch (IllegalArgumentException ex) {
      assertEquals("Feature 'a' does not exist on eClass", ex.getMessage());
    }
    assertEquals(2, eGet(Vo, "a2"));

    // Directly accessing the feature "0" returns "a2"
    assertEquals(2, Vo.eGet(0, false, false));
  }

  @Test
  public void addSuperclass() {
    // Create a virtual class that has a virtual class as subclass

    EClass sup = EcoreFactory.eINSTANCE.createEClass();
    sup.setName("Sup");
    VirtualEClass VSup = (VirtualEClass) viewpoint.getVirtual(sup);

    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);

    assertEquals(0, VA.getESuperTypes().size());

    VA.addVirtualSuperType(VSup);
    assertEquals(VSup, VA.getESuperTypes().get(0));
  }

  @Test
  public void filterSuperclass() {
    // A filtered superclass should not be visible

    EClass VS = viewpoint.getVirtual(S);

    // The superclass is visible at first
    assertEquals(1, VS.getESuperTypes().size());

    // Filter the superclass it through its package
    VirtualEPackage VP = (VirtualEPackage) viewpoint.getVirtual(P);
    VP.filterClassifier(viewpoint.getVirtual(A));

    assertEquals(0, VS.getESuperTypes().size());
  }

  @Test
  public void inheritVirtualFeatures() {
    // If a superclass has a virtual feature, it should appear in the eAllFeature feature
    // of the subclass

    VirtualEClass VA = (VirtualEClass) viewpoint.getVirtual(A);
    VirtualEClass VS = (VirtualEClass) viewpoint.getVirtual(S);

    // Add the virtual feature on parent A
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = (VirtualEAttribute) viewpoint.getVirtual(b);
    VA.addVirtualFeature(Vb);

    // Add also a virtual feature on S
    EAttribute c = EcoreFactory.eINSTANCE.createEAttribute();
    c.setName("c");
    c.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vc = (VirtualEAttribute) viewpoint.getVirtual(c);
    VS.addVirtualFeature(Vc);

    // Check the feature is present
    EList<EStructuralFeature> fs = VS.getEAllStructuralFeatures();

    assertEquals(4, fs.size());
    assertEquals(viewpoint.getVirtual(a), fs.get(0));
    assertEquals(Vb, fs.get(1));
    assertEquals(viewpoint.getVirtual(s), fs.get(2));
    assertEquals(Vc, fs.get(3));
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Helpers for reducing the boilerplate of calling the reflective EMF API

  // @Refactor: lifted from TestEMFViews

  Object eGet(EObject o, String featureName) {
    EStructuralFeature f = o.eClass().getEStructuralFeature(featureName);
    // Throw immediately rather than waiting for other objects to complain
    // about the missing feature
    if (f == null) throw new IllegalArgumentException(String.format("Feature '%s' does not exist on eClass", featureName));
    return o.eGet(f);
  }

  Optional<EObject> getClassifier(EObject o, String classifierName) {
    // @Optimize we could memoize this like the EPackage one does, but for the tests it's okay
    for (EObject c : getClassifiers(o)) {
      if (classifierName.equals(eGet(c, "name"))) {
        return Optional.of(c);
      }
    }
    return Optional.empty();
  }

  Optional<EObject> getFeature(EObject o, String featureName) {
    // @Optimize we could memoize this
    for (EObject c : getFeatures(o)) {
      if (featureName.equals(eGet(c, "name"))) {
        return Optional.of(c);
      }
    }
    return Optional.empty();
  }

  @SuppressWarnings("unchecked")
  EList<EObject> eList(EObject o, String featureName) {
    return (EList<EObject>) eGet(o, featureName);
  }

  EList<EObject> getClassifiers(EObject o) {
    return eList(o, "eClassifiers");
  }

  EList<EObject> getFeatures(EObject o) {
    return eList(o, "eStructuralFeatures");
  }

}
