package fr.inria.atlanmod.emfviews.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
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

    EStructuralFeature dp;

    {
      Viewtype v = new Viewtype(URI
          .createPlatformResourceURI("viewtype-test/viewtype/full.eviewtype", true));
      v.load(null);

      // FIXME: after this point, ideally we should just compare the Viewtype
      // with
      // a serialized "expected" result, or at the very least do an exhaustive
      // comparison with the base models. For now, comparing by hand a few
      // select
      // features will do.
      EList<EObject> l = v.getContents();

      // Ensure we have the three packages we want
      assertEquals(l.size(), 3);
      assertEquals(((EPackage) l.get(0)).getName(), "contentfwk");
      assertEquals(((EPackage) l.get(1)).getName(), "reqif10");
      assertEquals(((EPackage) l.get(2)).getName(), "bpmn2");

      // Ensure the filtered elements are absent
      EClass c = (EClass) ((EPackage) l.get(0)).getEClassifier("BusinessArchitecture");
      assertEquals(c.getFeatureCount(), 1);
      // and make sure the feature we left is in there
      assertNotNull(c.getEStructuralFeature("processes"));

      // Ensure our virtual associations are in there
      EClass p = (EClass) ((EPackage) l.get(0)).getEClassifier("Process");
      assertNotNull(p.getEStructuralFeature("detailedProcess"));
      dp = p.getEStructuralFeature("detailedProcess");

      EClass r = (EClass) ((EPackage) l.get(0)).getEClassifier("Requirement");
      assertNotNull(r.getEStructuralFeature("detailedRequirement"));
    }

    // Then, do the same for models
    {
      EView v = new EView(URI.createPlatformResourceURI("viewtype-test/view/full.eview", true));
      v.load(null);

      EList<EObject> l = v.getContents();

      assertEquals(l.size(), 3);

      // Check we only have "Process" instances (others are filtered out)

      System.out.println(l.get(0).eContents().get(1).eContents().get(0));
      System.out.println(l.get(0).eContents().get(1).eContents().get(0).eGet(dp));

      // System.out.println(l.get(0).eGet(p.getEStructuralFeature("detailedProcess")));
      // assertEquals(l.get(0).eGet(), "contentfwk");
      // assertEquals(((EPackage) l.get(1)).getName(), "reqif10");
      // assertEquals(((EPackage) l.get(2)).getName(), "bpmn2");
    }
  }

}
