package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.Viewtype;

public class TestViewtype {

  // To test Filters:
  // 1. Load an EViewtype file
  // 2. Assert that filtered elements are absent from the contents of the
  // Viewtype

  // To test Associations:
  // 1. Load an EViewtype file
  // 2. Assert that the virtual association is present

  // To test reproduce:
  // 1. Load an EViewtype file
  // 2. Assert that the virtual metamodel is the same as the concrete metamodel

  @Test
  public void testFull() throws IOException {
    // Based on the EA_viewtest examples, this is an integration test combining
    // three metamodels (contentfwk, BPMN2 and reqif10), with filters and
    // associations.

    // First check the metamodels (Viewtype)
    {
      Viewtype v = new Viewtype(URI
          .createPlatformResourceURI("viewtype-test/viewtype/full.eviewtype", true));
      v.load(null);

      // FIXME: after this point, ideally we should just compare the Viewtype
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
      EView v = new EView(URI.createPlatformResourceURI("viewtype-test/view/full.eview", true));
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
}
