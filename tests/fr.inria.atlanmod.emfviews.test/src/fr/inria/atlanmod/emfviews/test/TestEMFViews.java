package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.Viewpoint;

public class TestEMFViews {

  // TODO: test failures

  @Test
  public void threeModelComposition() throws IOException, InvocationTargetException {
    // Based on the EA_viewtest examples, this is an integration test combining
    // three metamodels (contentfwk, BPMN2 and reqif10), with filters and
    // associations.

    // First check the metamodels (Viewpoint)
    {
      Viewpoint v = new Viewpoint(URI
          .createURI("resources/viewpoints/three-model-composition/viewpoint.eviewpoint", true));
      v.load(null);

      // FIXME: after this point, ideally we should just compare the Viewpoint
      // with a serialized "expected" result, or at the very least do an
      // exhaustive comparison with the base models. For now, comparing by hand
      // a few select features will do.
      EList<EObject> l = v.getContents();

      // Ensure we have the three packages we want
      assertEquals(3, l.size());
      assertEquals("contentfwk", eGet(l.get(0), "name"));
      assertEquals("bpmn2", eGet(l.get(1), "name"));
      assertEquals("reqif10", eGet(l.get(2), "name"));

      // Ensure the filtered elements are absent
      EObject c = getClassifier(l.get(0), "BusinessArchitecture").get();
      assertEquals(1, getFeatures(c).size());
      // and make sure the feature we left is in there
      assertNotNull(getFeature(c, "processes"));

      // The original model is *not* modified
      c = v.getContributingEPackages().get(0).getEClassifier("BusinessArchitecture");
      assertEquals(16, getFeatures(c).size());

      // Ensure our virtual associations are in there
      EObject p = getClassifier(l.get(0), "Process").get();
      assertNotNull(getFeature(p, "detailedProcess"));

      EObject r = getClassifier(l.get(0), "Requirement").get();
      assertNotNull(getFeature(r, "detailedRequirement"));
    }

    // Then, do the same for models (EView)
    {
      EView v =
          new EView(URI.createURI("resources/views/three-model-composition/view.eview", true));
      v.load(null);

      EList<EObject> l = v.getContents();

      assertEquals(3, l.size());
      assertEquals("EnterpriseArchitecture", l.get(0).eClass().getName());
      assertEquals("ReqIF", l.get(1).eClass().getName());
      assertEquals("Definitions", l.get(2).eClass().getName());

      // Find the Business Architecture instance
      EObject ba = l.get(0).eContents().get(1);
      assertEquals("BusinessArchitecture", ba.eClass().getName());

      // Check we only have "Process" instances in there (others are filtered
      // out), and that they each have a detailedProcess feature
      for (EObject e : ba.eContents()) {
        assertEquals(e.eClass().getName(), "Process");
        assertNotNull(e.eClass().getEStructuralFeature("detailedProcess"));
      }

      // Furthermore, the detailed process for "Booking a trip" should link to a
      // BPMN Process
      EObject p = ba.eContents().get(0);
      EObject dp = (EObject) eGet(p, "detailedProcess");
      assertEquals("bpmn2", eGet(dp.eClass().eContainer(), "name"));
    }
  }

  @Test
  public void viewUpdate() throws IOException {
    // When modifying a contributing model, the change should propagate to the
    // virtual model

    // Get the virtual model
    EView v = new EView(URI.createURI("resources/views/three-model-composition/view.eview", true));
    v.load(null);

    // Get the concrete model loaded by the virtual model. We could also load
    // the model ourselves from the resource, but it would have no connection to
    // the model used by the view.
    Resource m = v.getContributingModels().get(0);

    // Descend into the contents
    EObject ea = m.getContents().get(0);
    EObject vea = v.getContents().get(0);

    // Get an interesting feature in both concrete and virtual models
    EList<EObject> ea_labels = eList(ea, "labels");
    EList<EObject> vea_labels = eList(vea, "labels");

    // Make sure there is at least one label
    assertTrue(ea_labels.size() > 0);

    // Make sure the virtual values are equal to the concrete values

    // Save the feature to avoid searching it in the loop. We cannot use the
    // same feature for both since the virtual model might have added/filtered
    // features, so the indices might not be the same.
    EStructuralFeature label_ft = ea_labels.get(0).eClass().getEStructuralFeature("name");
    EStructuralFeature vlabel_ft = vea_labels.get(0).eClass().getEStructuralFeature("name");

    for (int i = 0; i < ea_labels.size(); ++i) {
      EObject l = ea_labels.get(i);
      EObject vl = vea_labels.get(i);
      assertEquals(l.eGet(label_ft), vl.eGet(vlabel_ft));
    }

    // Now change the concrete value (after making sure we are changing it)
    assertNotEquals("foo", ea_labels.get(0).eGet(label_ft));
    assertNotEquals("foo", vea_labels.get(0).eGet(vlabel_ft));
    ea_labels.get(0).eSet(label_ft, "foo");

    // Make sure it's reflected in the virtual model
    assertEquals("foo", vea_labels.get(0).eGet(vlabel_ft));
  }

  @Test
  public void accessToFilteredFeature() throws IOException {
    // We should not be able to access a filtered feature in any way.

    // Get the view
    EView v = new EView(URI.createURI("resources/views/three-model-composition/view.eview", true));
    v.load(null);

    EList<EObject> l = v.getContents();

    // Find the Business Architecture instance where there are filtered elements
    EObject vba = l.get(0).eContents().get(1);

    // Make sure filtered features are absent
    for (EObject e : vba.eContents()) {
      assertEquals(e.eClass().getName(), "Process");
    }

    // If we have the original feature from the unfiltered model
    Resource m = v.getContributingModels().get(0);
    EObject ba = m.getContents().get(0).eContents().get(1);
    EStructuralFeature f = ba.eClass().getEStructuralFeature("drivers");

    // Make sure we cannot access it that way
    try {
      vba.eGet(f);
      fail("Expected the feature to not be found");
    } catch (IllegalArgumentException ex) {
      assertEquals("The feature 'drivers' is not a valid feature", ex.getMessage());
    }
  }

  @Test
  public void filterBidirectionalReference() throws IOException {
    // When we filter a reference that has an opposite, its opposite still
    // exists, but its EOpposite link should be null.

    // Create the view
    EView v = new EView(URI.createURI("resources/views/minimal/view.eview", true));
    v.load(null);

    // The model has a many ref from A to B, and a single ref from B to A, but
    // the metamodel has filtered the ref in A.
    EList<EObject> l = v.getContents();
    EObject a = l.get(0);

    // Make sure the ref in A is filtered
    assertEquals("A", a.eClass().getName());
    assertNull(a.eClass().getEStructuralFeature("manyB"));

    // The opposite feature should still exist on the metamodel for B
    EObject b = l.get(1);
    EObject parentA = b.eClass().getEStructuralFeature("parentA");
    assertNotNull(parentA);

    // Make sure we cannot access the feature through its opposite
    assertNull(eGet(parentA, "eOpposite"));
  }

  @Test
  public void virtualAssociation() throws IOException {
    // Creating a virtual association between two minimal models.

    // Create the view
    EView v = new EView(URI.createURI("resources/views/minimal-assoc/view.eview", true));
    v.load(null);

    // Get the virtual model
    EList<EObject> l = v.getContents();

    // Check it contains attributes from the source models
    EObject A = l.get(0);
    EObject B = l.get(1);
    assertEquals(true, eGet(A, "a"));
    assertEquals(42, eGet(B, "b"));

    // Check it contains the virtual association
    assertEquals(B, eGet(A, "assoc"));
  }

  @Test
  public void addConcept() throws IOException {
    // A new concept in the weaving model should be added to the virtual package

    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/addconcept/viewpoint.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(1);
    // The virtual package takes the WeavingModel name
    assertEquals("addconcept", eGet(p, "name"));
    // And it holds our new concept
    assertNotNull(getClassifier(p, "C"));
  }

  @Test
  public void addSubConcept() throws IOException {
    // A new subconcept in the weaving model should be added to the virtual
    // package, and should reference its superconcept.

    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/addconcept/subconcept.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(2);
    // The virtual package takes the WeavingModel name
    assertEquals("subconcept", eGet(p, "name"));
    // It holds our new concept
    EObject c = getClassifier(p, "C").get();
    assertNotNull(c);
    // C has A and B as super types
    EList<EObject> sups = eList(c, "eSuperTypes");
    assertEquals(2, sups.size());
    assertEquals(getClassifier(l.get(0), "A").get(), sups.get(0));
    assertEquals(getClassifier(l.get(1), "B").get(), sups.get(1));
  }

  @Test
  public void addSuperConcept() throws IOException {
    // A new subconcept in the weaving model should be added to the virtual
    // package, and should reference its superconcept.

    Viewpoint v = new Viewpoint(URI
        .createURI("resources/viewpoints/addconcept/superconcept.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(2);
    // The virtual package takes the WeavingModel name
    assertEquals("superconcept", eGet(p, "name"));
    // It holds our new concept
    EObject C = getClassifier(p, "C").get();
    assertNotNull(C);
    // A and B both have C as super type
    {
      EList<EObject> sups = eList(getClassifier(l.get(0), "A").get(), "eSuperTypes");
      assertEquals(1, sups.size());
      assertEquals(C, sups.get(0));
    }
    {
      EList<EObject> sups = eList(getClassifier(l.get(1), "B").get(), "eSuperTypes");
      assertEquals(1, sups.size());
      assertEquals(C, sups.get(0));
    }
  }

  @Test
  public void addProperty() throws IOException, InvocationTargetException {
    // A new property should be added to its target concept.

    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/addproperty/viewpoint.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    EObject A = getClassifier(l.get(0), "A").get();

    // Check the new property is created on A
    {
      EObject f = getFeature(A, "newProperty");
      assertNotNull(f);
      assertEquals("newProperty", eGet(f, "name"));
      assertEquals(EcorePackage.Literals.ESTRING, eGet(f, "eType"));
      // It's not optional by default
      assertEquals(1, eGet(f, "lowerBound"));
      assertEquals(1, eGet(f, "upperBound"));
    }

    // Check the optional property is also created
    {
      EObject f = getFeature(A, "newOptionalProperty");
      assertNotNull(f);
      assertEquals("newOptionalProperty", eGet(f, "name"));
      assertEquals(EcorePackage.Literals.EINT, eGet(f, "eType"));
      assertEquals(0, eGet(f, "lowerBound"));
      assertEquals(1, eGet(f, "upperBound"));
    }
  }

  @Test
  public void addCompositionAssociation() throws IOException, InvocationTargetException {
    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/addassoc/composition.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    EObject A = getClassifier(l.get(0), "A").get();
    EObject B = getClassifier(l.get(1), "B").get();

    // Check the references exist with the right EType
    EObject AtoB = getFeature(A, "refToB");
    assertNotNull(AtoB);
    assertEquals(B, eGet(AtoB, "eType"));
    // And it's a containment
    assertEquals(true, eGet(AtoB, "containment"));
  }

  @Test
  public void addBidirectionalAssociation() throws IOException, InvocationTargetException {
    // A NewAssociation from A to B should create an EReference in A with EType B.

    Viewpoint v = new Viewpoint(URI
        .createURI("resources/viewpoints/addassoc/bidirectional.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    EObject A = getClassifier(l.get(0), "A").get();
    EObject B = getClassifier(l.get(1), "B").get();

    // Check the references exist with the right EType
    EObject AtoB = getFeature(A, "refToB");
    assertNotNull(AtoB);
    assertEquals(B, eGet(AtoB, "eType"));
    EObject BtoA = getFeature(B, "refToA");
    assertNotNull(BtoA);
    assertEquals(A, eGet(BtoA, "eType"));

    // Check they are each other's opposite
    assertEquals(AtoB, eGet(BtoA, "eOpposite"));
    assertEquals(BtoA, eGet(AtoB, "eOpposite"));
  }

  @Test
  public void addPropertyToNewConcept() throws IOException, InvocationTargetException {
    // We can link virtual elements from NewConcept/NewProperties/NewAssociation.
    // E.g., we can add properties to a new concept in the same weaving model.

    Viewpoint v = new Viewpoint(URI
        .createURI("resources/viewpoints/synthetic-elements/property-to-newconcept.eviewpoint",
                   true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(1);
    // It holds our new concept
    EObject C = getClassifier(p, "NewConcept").get();
    assertNotNull(C);
    // And the new concept holds our new property
    assertNotNull(getFeature(C, "newProperty"));
  }

  @Test
  public void addSuperconceptToNewConcept() throws IOException {
    // We can add concepts and a concept that generalizes those.

    Viewpoint v = new Viewpoint(URI
        .createURI("resources/viewpoints/synthetic-elements/concept-to-newconcept.eviewpoint",
                   true));
    v.load(null);

    EList<EObject> l = v.getContents();
    EObject A = getClassifier(l.get(0), "A").get();
    assertNotNull(A);
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(1);
    // It holds our new concepts
    EObject C1 = getClassifier(p, "NewConcept").get();
    assertNotNull(C1);
    EObject C2 = getClassifier(p, "SuperConcept").get();
    assertNotNull(C2);
    // And the super concept has one existing and one new concepts has subconcepts
    assertEquals(C2, eList(A, "eSuperTypes").get(0));
    assertEquals(C2, eList(C1, "eSuperTypes").get(0));
  }

  @Test
  public void addAssociationToNewConcept() throws IOException, InvocationTargetException {
    // We can add new properties and an association between them.

    Viewpoint v = new Viewpoint(URI
        .createURI("resources/viewpoints/synthetic-elements/assoc-to-newconcept.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    EObject A = getClassifier(l.get(0), "A").get();
    // The virtual package comes after packages from the contributing models
    EObject p = l.get(1);
    // It holds our new concept
    EObject C = getClassifier(p, "C").get();
    // There is a reference from A to C
    EObject AtoC = getFeature(A, "refToC");
    assertNotNull(AtoC);
    assertEquals(C, eGet(AtoC, "eType"));

    // The original model is *not* modified
    A = v.getContributingEPackages().get(0).getEClassifier("A");
    assertEquals(1, getFeatures(A).size());
  }

  @Test
  public void filterBlacklist() throws IOException, InvocationTargetException {
    // Filtered elements should not exist on the viewpoint.

    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/filter/blacklist.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // There is only the A and B packages
    assertEquals(2, l.size());

    // A has no features, since it was filtered
    EObject A = getClassifier(l.get(0), "A").get();
    assertEquals(0, getFeatures(A).size());

    // The original model is *not* modified
    A = v.getContributingEPackages().get(0).getEClassifier("A");
    assertEquals(1, getFeatures(A).size());

    // B has its feature, since it was not filtered
    EObject B = getClassifier(l.get(1), "B").get();
    assertNotNull(getFeature(B, "b"));
  }

  @Test
  public void filterWhitelist() throws IOException, InvocationTargetException {
    // In a weaving model in whitelist mode, filtered elements should be
    // the only remaining elements in the view.

    Viewpoint v =
        new Viewpoint(URI.createURI("resources/viewpoints/filter/whitelist.eviewpoint", true));
    v.load(null);

    EList<EObject> l = v.getContents();
    // There is only the contentfwk package
    assertEquals(1, l.size());
    EObject p = l.get(0);

    // Package has only one classifier
    assertEquals(1, getClassifiers(p).size());
    EObject C = getClassifiers(p).get(0);

    // Only 1 feature is left
    assertEquals(1, getFeatures(C).size());
    assertNotNull(getFeature(C, "ID"));

    // The original model is *not* modified
    p = v.getContributingEPackages().get(0);
    assertEquals(53, getClassifiers(p).size());
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Helpers for reducing the boilerplate of calling the reflective EMF API

  Object eGet(EObject o, String featureName) {
    EStructuralFeature f = o.eClass().getEStructuralFeature(featureName);
    // Throw immediately rather than waiting for other objects to complain
    // about the missing feature
    if (f == null) throw new NullPointerException();
    return o.eGet(f);
  }

  Object eInvoke(EObject o, EOperation operation, Object... args) throws InvocationTargetException {
    // TODO: remove
    return o.eInvoke(operation, ECollections.asEList(args));
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

  EObject getFeature(EObject o, String featureName) throws InvocationTargetException {
    // TODO: use eGet as above
    return (EStructuralFeature) eInvoke(o,
                                        EcorePackage.Literals.ECLASS___GET_ESTRUCTURAL_FEATURE__STRING,
                                        featureName);
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
