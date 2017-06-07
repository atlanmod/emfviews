package fr.inria.atlanmod.emfviews.util;

import java.util.ArrayDeque;
import java.util.Queue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public final class EMFViewsUtil {
  // Prevent instances
  private EMFViewsUtil() {}

  /**
   * Find and return the element that matches the path. Path is a dot-separated
   * list of names describing the full hierarchy of the target element from the
   * root object. E.g.,
   *
   * "packageName.className.attributeName"
   *
   * @param root the root object to begin the search with
   * @param path dot-separated list of names to match
   * @return the matc
   */
  public static EObject findElement(EObject root, String path) {
    String[] components = path.split("\\.");
    Queue<EObject> objs = new ArrayDeque<>();
    objs.add(root);

    // Try to match each component with each object in the queue
    EObject o = null;
    for (String comp : components) {
      boolean componentMatched = false;
      while (!componentMatched) {
        o = objs.poll();
        // No more objects to search, give up since we haven't matched all the
        // components
        if (o == null) {
          return null;
        }
        EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
        // Can only match named features
        if (nameFeature != null) {
          String objName = (String) o.eGet(nameFeature);
          if (comp.equals(objName)) {
            // Match: continue with the next component and the contents of the
            // matching object
            objs.clear();
            objs.addAll(o.eContents());
            componentMatched = true;
          }
        }
        // Mismatch: continue with the next object in the queue
      }
    }

    // Return the object that matched the last component, or null if the path
    // was empty
    return o;
  }

  // Return an EPackage from a modelURI, which can start with http or point to a
  // workspace Ecore file. If the package cannot be found, return null.
  public static EPackage getEPackageFromURI(String modelURI) {
    // FIXME: this distinction between http and ecore seems arbitrary; can't we
    // use URI with different protocols in the argument, and let EMF resolve it?
    if (modelURI.startsWith("http")) {
      return EPackage.Registry.INSTANCE.getEPackage(modelURI);
    } else if (modelURI.endsWith("ecore")) {
      // XXX: can we get the resource without creating the ResourceSet?
      Resource r = new ResourceSetImpl().getResource(URI.createURI(modelURI, true), true);
      // HYPO: the Ecore contains only one EPackage we care about
      return (EPackage) r.getContents().get(0);
    } else {
      return null;
    }
  }
}
