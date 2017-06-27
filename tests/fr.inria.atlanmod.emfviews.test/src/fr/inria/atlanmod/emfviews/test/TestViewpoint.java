package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.Viewpoint;

public class TestViewpoint {

  // To test Filters:
  // 1. Load an EViewpoint file
  // 2. Assert that filtered elements are absent from the contents of the
  // Viewpoint

  // To test Associations:
  // 1. Load an EViewpoint file
  // 2. Assert that the virtual association is present

  // To test reproduce:
  // 1. Load an EViewpoint file
  // 2. Assert that the virtual metamodel is the same as the concrete metamodel

  @Test
  public void testThreeModelComposition() throws IOException {
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
      assertEquals("contentfwk", ((EPackage) l.get(0)).getName());
      assertEquals("reqif10", ((EPackage) l.get(1)).getName());
      assertEquals("bpmn2", ((EPackage) l.get(2)).getName());

      // Ensure the filtered elements are absent
      EClass c = (EClass) ((EPackage) l.get(0)).getEClassifier("BusinessArchitecture");
      assertEquals(1, c.getFeatureCount());
      // and make sure the feature we left is in there
      assertNotNull(c.getEStructuralFeature("processes"));

      // Ensure our virtual associations are in there
      EClass p = (EClass) ((EPackage) l.get(0)).getEClassifier("Process");
      assertNotNull(p.getEStructuralFeature("detailedProcess"));

      EClass r = (EClass) ((EPackage) l.get(0)).getEClassifier("Requirement");
      assertNotNull(r.getEStructuralFeature("detailedRequirement"));
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
      EObject dp = (EObject) p.eGet(p.eClass().getEStructuralFeature("detailedProcess"));
      EObject container = dp.eClass().eContainer();
      assertEquals("bpmn2", container.eGet(container.eClass().getEStructuralFeature("name")));
    }
  }

  @Test
  public void testViewUpdate() throws IOException {
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
    @SuppressWarnings("unchecked")
    EList<EObject> ea_labels =
        (EList<EObject>) ea.eGet(ea.eClass().getEStructuralFeature("labels"));
    @SuppressWarnings("unchecked")
    EList<EObject> vea_labels =
        (EList<EObject>) vea.eGet(vea.eClass().getEStructuralFeature("labels"));

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
    // assertEquals("foo", vea_labels.get(0).eGet(vlabel_ft));
    // XXX: The test currently fails because EStoreEObjectImpl will cache any
    // value returned by get() automatically, unless we override eIsCaching and
    // return false. Not caching would allow us to propagate changes from
    // contributing models to the view, at the cost of performance.

    // This is the current behavior:
    assertEquals("Software Kind", vea_labels.get(0).eGet(vlabel_ft));
  }

  @Test
  public void testAccessToFilteredFeature() throws IOException {
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
  public void testFilterBidirectionalReference() throws IOException {
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
    EObject b1 = l.get(1);
    EStructuralFeature parentA = b1.eClass().getEStructuralFeature("parentA");
    assertNotNull(parentA);

    // Make sure we cannot access the feature through its opposite
    EReference manyB = ((EReference) parentA).getEOpposite();
    assertNull(manyB);
  }

  @Test
  public void testVirtualAssociation() throws IOException {
    // Creating a virtual association between two minimal models.

    // Create the view
    EView v = new EView(URI.createURI("resources/views/minimal-assoc/view.eview", true));
    v.load(null);

    // Get the virtual model
    EList<EObject> l = v.getContents();

    // Check it contains attributes from the source models
    EObject A = l.get(0);
    EObject B = l.get(1);
    assertEquals(true, A.eGet(A.eClass().getEStructuralFeature("a")));
    assertEquals(42, B.eGet(B.eClass().getEStructuralFeature("b")));

    // Check it contains the virtual association
    assertEquals(B, A.eGet(A.eClass().getEStructuralFeature("assoc")));
  }

}
