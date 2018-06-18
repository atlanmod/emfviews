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
 *   fmdkdd - refactoring and extension
 *   Juan David Villa Calle - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ViewpointResource extends ResourceImpl {

  public static final String EVIEWPOINT_CONTRIBUTING_METAMODELS = "contributingMetamodels";
  public static final String EVIEWPOINT_WEAVING_MODEL = "weavingModel";

  private List<String> contributingMetamodelsPaths;
  private URI weavingModelURI;

  private Viewpoint viewpoint;

  public ViewpointResource() {
    super();
  }

  public ViewpointResource(URI uri) {
    super(uri);
  }

  // This viewpoint will be replaced if another one is loaded from the URI.
  public void setViewpoint(Viewpoint v) {
    viewpoint = v;
  }

  public Viewpoint getViewpoint() {
    return viewpoint;
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    // Parse from eviewpoint file
    Properties p = new Properties();
    p.load(inputStream);

    // Ensure required fields are present
    if (!p.containsKey(EVIEWPOINT_CONTRIBUTING_METAMODELS)) {
      getErrors().add(new Err("Error in parsing eviewpoint file: missing %s field", EVIEWPOINT_CONTRIBUTING_METAMODELS));
    }

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

      default:
        getErrors().add(new Err("Invalid key in eviewpoint file: '%s'", key));
      }
    }

    // Then create the viewpoint
    try {
      viewpoint = new Viewpoint(loadMetamodels(),
                                loadWeavingModel());
    } catch (Exception ex) {
      getErrors().add(new Err("Failed to create the viewpoint due to exception:\n%s", ex));
      throw ex;
    }
  }

  // Return a list of EPackage from the list of metamodels paths
  private List<EPackage> loadMetamodels() {
    List<EPackage> packages = new ArrayList<>();
    for (String path : contributingMetamodelsPaths) {
      // Get the EPackage from each metamodel URI
      URI uri = URI.createURI(path).resolve(getURI());

      EPackage p = null;

      // If it's a namespace URI, fetch from the package registry
      if ("http".equals(uri.scheme())) {
        p = EPackage.Registry.INSTANCE.getEPackage(uri.toString());
      }
      // If it's an Ecore file, then get the EPackage from the resource
      else if (uri.fileExtension().equals("ecore")) {
        Resource r = new ResourceSetImpl().getResource(uri, true);
        EPackage pack = (EPackage) r.getContents().get(0);
        // @Assumption: the Ecore contains only one EPackage we care about

        // Add the package to the global registry, in order for ECL to find it
        EPackage.Registry.INSTANCE.put(pack.getNsURI(), pack);

        p = pack;
      }

      if (p == null) {
        throw new IllegalArgumentException(String.format("Could not load EPackage from contributing metamodel '%s'", path));
      } else {
        packages.add(p);
      }
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

  @Override
  public EList<EObject> getContents() {
    if (viewpoint != null) {
      return ECollections.unmodifiableEList(Arrays.asList(viewpoint.getRootPackage()));
    } else {
      return ECollections.emptyEList();
    }
  }

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

}
