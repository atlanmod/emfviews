package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.emfviews.elements.VirtualEAttribute;
import fr.inria.atlanmod.emfviews.elements.VirtualEClass;
import fr.inria.atlanmod.emfviews.elements.VirtualEObject;
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
  public void virtualEObject() {
    // Wrapping an object with a VirtualEObject, we can still access its features
    VirtualEClass VA = new VirtualEClass(A);

    // Create the virtual object
    EObject o = EcoreUtil.create(A);
    o.eSet(a, 1);
    VirtualEObject VO = new VirtualEObject(o, VA);

    // We can still access the value of the feature 'a'
    assertEquals(1, eGet(VO, "a"));
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
    ((VirtualEAttribute) getFeature(VA, "a").get()).setFiltered(true);

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

    // FIXME: this should fail, but doesn't
    assertEquals(1, Vo.eGet(0, false, false));
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Helpers for reducing the boilerplate of calling the reflective EMF API

  // FIXME: lifted from TestEMFViews

  Object eGet(EObject o, String featureName) {
    EStructuralFeature f = o.eClass().getEStructuralFeature(featureName);
    // Throw immediately rather than waiting for other objects to complain
    // about the missing feature
    if (f == null) throw new IllegalArgumentException(String.format("Feature '%s' does not exist on eClass", featureName));
    return o.eGet(f);
  }

  Optional<EObject> getClassifier(EObject o, String classifierName) {
    // XXX: we could memoize this like the EPackage one does, but for the tests it's okay
    for (EObject c : getClassifiers(o)) {
      if (classifierName.equals(eGet(c, "name"))) {
        return Optional.of(c);
      }
    }
    return Optional.empty();
  }

  Optional<EObject> getFeature(EObject o, String featureName) {
    // XXX: we could memoize this
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
