/*******************************************************************************
 * Copyright (c) 2017--2019 Armines
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
 *   fmdkdd - refactoring and extension
 *   Juan David Villa Calle - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * An EMF resource representing an 'eviewpoint' file.
 *
 * An 'eviewpoint' file is a simply a property (key=value) file which describes
 * a viewpoint.
 *
 * This resource can be used either to load an existing 'eviewpoint' file and
 * obtain a Viewpoint, or to serialize an existing Viewpoint.
 */
public class ViewpointResource extends ResourceImpl {
  /*
   * All this code used to be part of Viewpoint, which also extended
   * ResourceImpl, but separating the two lets us create Viewpoint objects from
   * Java with a clean API, without having to use the weird EMF resource
   * ceremony.
   */

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Internal state

  private List<String> contributingMetamodelsPaths; // paths to contributing metamodels
  private URI weavingModelURI;                      // path to the weaving model
  private Viewpoint viewpoint;                      // created viewpoint

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Public API

  // Valid fields for an eviewpoint file
  public static final String EVIEWPOINT_CONTRIBUTING_METAMODELS = "contributingMetamodels";
  public static final String EVIEWPOINT_WEAVING_MODEL = "weavingModel";
  public static final String EVIEWPOINT_ROOTPKG_NSURI = "rootPackageNsURI";
  public static final String EVIEWPOINT_SAVE_IN_REGISTRY = "saveInRegistry";

  /**
   * Keep track of created Viewpoints.
   *
   * Used to ensure that one eviewpoint resource does not end up having
   * multiple viewpoints associated to it, in contexts where one need to
   * provide a model (View) and metamodel (Viewpoint) separately (e.g.,
   * EGL template launchers).
   *
   * We keep track of viewpoints in ViewpointResource because we use the
   * resource URI as key, to let views find the viewpoint associated with a
   * given file path.
   */
  public static final Map<String, Viewpoint> registry = new HashMap<>();


  public ViewpointResource() {
    super();
  }

  public ViewpointResource(URI uri) {
    super(uri);
  }

  @Override
  public EList<EObject> getContents() {
    if (viewpoint != null) {
      return ECollections.unmodifiableEList(Arrays.asList(viewpoint.getRootPackage()));
    } else {
      return ECollections.emptyEList();
    }
  }

  /** The viewpoint associated to this resource, if any. */
  public Viewpoint getViewpoint() {
    return viewpoint;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Loading/saving the 'eviewpoint' file


  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> _options) throws IOException {
    // Parse from eviewpoint file
    Properties p = new Properties();
    p.load(inputStream);

    // Ensure required fields are present
    if (!p.containsKey(EVIEWPOINT_CONTRIBUTING_METAMODELS)) {
      getErrors().add(new Err("Error in parsing eviewpoint file: missing %s field", EVIEWPOINT_CONTRIBUTING_METAMODELS));
    }

    Viewpoint.Options options = new Viewpoint.Options();

    for (String key : p.stringPropertyNames()) {
      switch (key) {

      // Parse contributingMetamodels line
      case EVIEWPOINT_CONTRIBUTING_METAMODELS:
        contributingMetamodelsPaths = Arrays.asList(p.getProperty(key).split(","));
        contributingMetamodelsPaths.replaceAll(m -> m.trim());
        break;

      // Parse weavingModel line
      case EVIEWPOINT_WEAVING_MODEL:
        String uriString = p.getProperty(key).trim();
        try {
          weavingModelURI = URI.createURI(uriString);
        } catch (IllegalArgumentException ex) {
          getErrors().add(new Err("Weaving model path is an invalid URI: '%s'", uriString));
        }
        break;

      // Parse options
      case EVIEWPOINT_ROOTPKG_NSURI:
        options.rootPackageNsURIPrefix = p.getProperty(key).trim();
        break;

      case EVIEWPOINT_SAVE_IN_REGISTRY:
        options.saveInRegistry = true;
        break;

      default:
        getErrors().add(new Err("Invalid key in eviewpoint file: '%s'", key));
      }
    }

    // Then create the viewpoint
    try {
      setViewpoint(new Viewpoint(loadMetamodels(),
                                 loadWeavingModel(),
                                 options));
      // Register the viewpoint in the viewpoint registry. This allows views to
      // load viewpoints from the registry instead of creating them anew in a
      // resource.
      if(options.saveInRegistry) {
        registry.put(getURI().toString(), viewpoint);
      }
    } catch (Exception ex) {
      // see @ResourceErrors
      getErrors().add(new Err("Failed to create the viewpoint due to exception:\n%s", ex));
      throw ex;
    }
  }

  // Return a map of aliases to EPackage from the list of metamodels paths
  private Map<String, EPackage> loadMetamodels() {
    Map<String, EPackage> packages = new HashMap<>();
    for (String path : contributingMetamodelsPaths) {

      // Format is alias::URI
      if (!path.contains("::")) {
        throw new IllegalArgumentException(String.format("Contributing metamodel path '%s' does not contain alias separator '::'", path));
      }
      String parts[] = path.split("::");
      String alias = parts[0];

      // Get the EPackage from each metamodel URI
      URI uri = URI.createURI(parts[1]).resolve(getURI());

      // First try to fetch from the package registry
      EPackage p = EPackage.Registry.INSTANCE.getEPackage(uri.toString());

      // Then try to load it as a resource
      if (p == null) {
        Resource r = new ResourceSetImpl().getResource(uri, true);
        EPackage pack = (EPackage) r.getContents().get(0);
        // @Assumption: the Ecore contains only one EPackage we care about

        // Add the package to the global registry, in order for ECL to find it
        EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);

        p = pack;
      }

      packages.put(alias, p);
    }
    return packages;
  }

  // Load and return the weaving model from URI
  private WeavingModel loadWeavingModel() {
    // If the eviewpoint file does not specify the weaving model,
    // return an empty one.
    if (weavingModelURI == null) {
      return Viewpoint.emptyWeavingModel;
    }

    URI uri = weavingModelURI.resolve(getURI());
    Resource r = new ResourceSetImpl().getResource(uri, true);
    EObject wm = r.getContents().get(0);
    if (!(wm instanceof WeavingModel)) {
      throw new IllegalArgumentException(String.format("Resource at '%s' is not an instance of WeavingModel", uri));
    }
    return (WeavingModel) wm;
  }

  @Override
  protected void doUnload() {
    viewpoint = null;
    contributingMetamodelsPaths = null;
    weavingModelURI = null;

    getErrors().clear();
    getWarnings().clear();
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    Properties p = new Properties();
    p.setProperty(EVIEWPOINT_CONTRIBUTING_METAMODELS,
                  String.join(",", contributingMetamodelsPaths));
    p.setProperty(EVIEWPOINT_WEAVING_MODEL, weavingModelURI.toString());
    p.store(outputStream, null);
  }

  // Helper class to create Diagnostic for resource errors.
  class Err implements Diagnostic {

    String msg;

    Err(String msg) {
      this.msg = msg;
    }

    Err(String msg, Object ...args) {
      this.msg = String.format(msg, args);
    }

    @Override
    public String getMessage() {
      return msg;
    }

    @Override
    public String getLocation() {
      return getURI().toString();
    }

    @Override
    public int getLine() {
      return 0;
    }

    @Override
    public int getColumn() {
      return 0;
    }

  }

  // This viewpoint will be replaced if another one is loaded from the URI.
  private void setViewpoint(Viewpoint v) {
    viewpoint = v;
    viewpoint.setResource(this);
  }

}
