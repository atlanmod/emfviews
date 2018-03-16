package org.atlanmod.emfviews.core;

import java.util.Map;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;

/**
 * Keep track of Viewpoints created from a resource.
 *
 * Used to ensure that one eviewpoint resource does not end up having
 * multiple viewpoints associated to it, in contexts where one need to
 * provide a model (View) and metamodel (Viewpoint) separately (e.g.,
 * EGL template launchers).
 *
 * @author fmdkdd
  */
public class ViewpointRegistry {
  private Map<String, Viewpoint> viewpoints;

  public static final ViewpointRegistry INSTANCE = new ViewpointRegistry();

  private ViewpointRegistry() {
    viewpoints = new HashMap<>();
  }

  public Viewpoint getViewpoint(URI uri) {
    // Convert URI to String, since equivalent URIs do not have the same hashcode
    return viewpoints.computeIfAbsent(uri.toString(), k -> new Viewpoint(uri));
  }
}
