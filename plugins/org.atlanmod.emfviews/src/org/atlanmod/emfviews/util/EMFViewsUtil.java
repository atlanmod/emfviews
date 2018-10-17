/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public final class EMFViewsUtil {
  // Prevent instances
  private EMFViewsUtil() {}

  /**
   * Find and return the element that matches the path. Path is a dot-separated
   * list of names describing the full hierarchy of the target element from the
   * root object, not including the root object itself. E.g.,
   *
   * "className.attributeName"
   *
   * @param root the root object to begin the search with
   * @param path dot-separated list of names to match
   * @return the matching object, if it can be found
   */
  public static Optional<EObject> findElement(EObject root, String path) {
    String[] components = path.split("\\.");
    Queue<EObject> objs = new ArrayDeque<>();
    objs.addAll(root.eContents());

    // Try to match each component with each object in the queue
    EObject o = null;
    for (String comp : components) {
      boolean componentMatched = false;
      while (!componentMatched) {
        o = objs.poll();
        // No more objects to search, give up since we haven't matched all the
        // components
        if (o == null) {
          return Optional.empty();
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
    return Optional.ofNullable(o);
  }

  /**
   * Return the path to the EObject, such that:
   *
   *   findElement(o.eContainer(), getEObjectPath(o)) == o
   */
  public static String getEObjectPath(EObject o) {
    List<String> comps = new ArrayList<>();

    // Don't include package in the path
    while (o != null && !(o instanceof EPackage)) {
      EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
      if (nameFeature != null) {
        comps.add((String) o.eGet(nameFeature));
      }
      o = o.eContainer();
    }

    Collections.reverse(comps);
    return String.join(".", comps);
  }

  /** Return a list containing `p` and all its subpackages, recursively. */
  public static List<EPackage> getAllPackages(EPackage p) {
    List<EPackage> allPackages = new ArrayList<>();
    allPackages.add(p);
    for (EPackage sub : p.getESubpackages()) {
      allPackages.addAll(getAllPackages(sub));
    }
    return allPackages;
  }

}
