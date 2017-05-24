package fr.inria.atlanmod.emfviews.util;

import java.util.ArrayDeque;
import java.util.Queue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
}
