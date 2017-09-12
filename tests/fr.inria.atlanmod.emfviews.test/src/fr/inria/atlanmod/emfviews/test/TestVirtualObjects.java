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
  private EAttribute a;

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
  }

  @After
  public void destroyConcreteModel() {
    P = null;
    A = null;
    B = null;
    a = null;
  }

  @Test
  public void virtualEPackage() {
    // Wrapping an EPackage with VirtualEPackage, we can access its classifiers

    // Create the virtual package
    VirtualEPackage VP = new VirtualEPackage(P);

    // The have the same name
    assertEquals(VP.getName(), P.getName());

    // Can access classifiers using the EPackage method and reflective API
    assertEquals("A", eGet(VP.getEClassifier("A"), "name"));
    assertEquals("A", eGet(getClassifier(VP, "A").get(), "name"));
  }

  @Test
  public void addVirtualClass() {
    // Adding a virtual class to a VirtualEPackage

    // Create the virtual package
    VirtualEPackage VP = new VirtualEPackage(P);

    // Create the virtual class
    EClass c = EcoreFactory.eINSTANCE.createEClass();
    c.setName("C");
    VirtualEClass Vc = new VirtualEClass(c);
    VP.addVirtualClassifier(Vc);

    EAttribute a = EcoreFactory.eINSTANCE.createEAttribute();
    a.setName("a");
    a.setEType(EcorePackage.Literals.EINT);
    c.getEStructuralFeatures().add(a);

    // Can access the classifier using the EPackage method and reflective API
    assertEquals(Vc, VP.getEClassifier("C"));
    assertEquals(Vc, getClassifier(VP, "C").get());

    // Can create a virtual object with that new class as metaclass
    // XXX: looks like we have to have an EPackage for C if we want to create an instance of it.
    // Even manually creating a DynamicEObjectImpl with C as eClass ends up
    // with a NPE in eGet if there is no EPackage.
    EPackage dumbPackage = EcoreFactory.eINSTANCE.createEPackage();
    dumbPackage.getEClassifiers().add(c);
    VirtualEObject Vo = new VirtualEObject(EcoreUtil.create(c), Vc);

    // Can access set and get the feature in there
    Vo.eSet(0, 1);
    assertEquals(1, Vo.eGet(0, false, false));
    assertEquals(1, eGet(Vo, "a"));
  }

  @Test
  public void filterClass() {
    // Hide class from a virtual package

    VirtualEPackage VP = new VirtualEPackage(P);

    assertTrue(getClassifier(VP, "A").isPresent());
    assertTrue(getClassifier(VP, "B").isPresent());

    VP.filterClassifier((EClassifier) getClassifier(VP, "A").get());

    assertFalse(getClassifier(VP, "A").isPresent());
    assertTrue(getClassifier(VP, "B").isPresent());
  }

  @Test
  public void virtualEClass() {
    // Wrapping an EClass with VirtualEClass, we can still access its features

    // Create the virtual class
    VirtualEClass VA = new VirtualEClass(A);

    // They have the same name
    assertEquals(VA.getName(), A.getName());

    // Can access features using the EClass method and reflective API
    assertEquals("a", eGet(VA.getEStructuralFeature("a"), "name"));
    assertEquals("a", eGet(getFeature(VA, "a").get(), "name"));
  }

  @Test
  public void dynamicObject() {
    // We can use a VirtualEClass with a DynamicEObject, but
    // the dynamic object is oblivious to virtual and filtered features

    VirtualEClass VA = new VirtualEClass(A);

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
    VirtualEAttribute Vb = new VirtualEAttribute(b);
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
    VirtualEClass VA = new VirtualEClass(A);

    // Create the virtual object
    EObject o = EcoreUtil.create(A);
    o.eSet(a, 1);
    VirtualEObject VO = new VirtualEObject(o, VA);

    // We can still access the value of the feature 'a'
    assertEquals(1, eGet(VO, "a"));

    // Add a virtual feature 'b' to VA
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = new VirtualEAttribute(b);
    VA.addVirtualFeature(Vb);

    // The feature can be set and get on the same virtual object
    VO.eSet(Vb, 2);
    assertEquals(2, VO.eGet(Vb));
    assertEquals(1, eGet(VO, "a"));

    // Filter the first feature
    VA.filterFeature((EStructuralFeature) getFeature(VA, "a").get());

    // We can still access the non-filtered feature 'b', through different means
    assertEquals(2, VO.eGet(Vb));
    assertEquals(2, VO.eGet(0, false, false));
    assertEquals(2, eGet(VO, "b"));

    // Accessing the 'a' feature fails
    try {
      assertEquals(1, eGet(VO, "a"));
      fail("Expected eGet to fail");
    } catch (IllegalArgumentException ex) {
      assertEquals("Feature 'a' does not exist on eClass", ex.getMessage());
    }

    // The feature of index 0 is the feature 'b'
    assertEquals(2, VO.eGet(0, false, false));
  }

  @Test
  public void addVirtualAttribute() {
    // Adding a virtual attribute to a VirtualEClass

    // Create the virtual class
    VirtualEClass VA = new VirtualEClass(A);

    // Add a virtual attribute
    EAttribute b = EcoreFactory.eINSTANCE.createEAttribute();
    b.setName("b");
    b.setEType(EcorePackage.Literals.EINT);
    VirtualEAttribute Vb = new VirtualEAttribute(b);
    VA.addVirtualFeature(Vb);

    // Can access the features using the EClass method and reflective API
    assertEquals(Vb, VA.getEStructuralFeature("b"));
    assertEquals(Vb, getFeature(VA, "b").get());

    // A virtual model object with the virtual class as metaclass can use the feature
    EObject o = EcoreUtil.create(A);
    VirtualEObject VO = new VirtualEObject(o, VA);

    // We can set a value
    VO.eSet(Vb, 2);

    // And get it back
    assertEquals(2, eGet(VO, "b"));
  }

  @Test
  public void addVirtualReference() {
    // Adding a virtual reference to a VirtualEClass

    // Create the virtual classes
    VirtualEClass VA = new VirtualEClass(A);
    VirtualEClass VB = new VirtualEClass(B);

    // Add the new reference
    EReference r = EcoreFactory.eINSTANCE.createEReference();
    r.setName("AtoB");
    r.setEType(VB);
    r.setLowerBound(0);
    r.setUpperBound(-1);
    VirtualEReference Vr = new VirtualEReference(r);
    VA.addVirtualFeature(Vr);

    // Create one A and two Bs
    EObject a = EcoreUtil.create(A);
    EObject b1 = EcoreUtil.create(B);
    EObject b2 = EcoreUtil.create(B);

    VirtualEObject Va = new VirtualEObject(a, VA);
    VirtualEObject Vb1 = new VirtualEObject(b1, VA);
    VirtualEObject Vb2 = new VirtualEObject(b2, VA);

    // Populate the feature with two Bs
    EList<EObject> listOfB = eList(Va, "AtoB");
    listOfB.add(Vb1);
    listOfB.add(Vb2);

    assertEquals(Vb1, eList(Va, "AtoB").get(0));
    assertEquals(Vb2, eList(Va, "AtoB").get(1));
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
    VirtualEClass VA = new VirtualEClass(A);

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
    VirtualEObject Vo = new VirtualEObject(o, VA);

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
