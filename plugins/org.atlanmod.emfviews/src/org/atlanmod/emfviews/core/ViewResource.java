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

package org.atlanmod.emfviews.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringJoiner;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;

/**
 * A Resource that can load or save a View through an 'eview' file.
 *
 * An 'eview' file is a property (key=value) file that describes a View.  The
 * role of the ViewResource is to parse the 'eview' file and create a
 * corresponding View when loading the resource, and to serialize the View
 * information into the 'eview' file when saving the resource.
 *
 * A ViewResource is usually created by associating 'eview' file extension to
 * the EmfViewsFactory.
 */
public class ViewResource extends ResourceImpl {

  // Valid fields for an eview file
  public static final String EVIEW_VIEWPOINT = "viewpoint";
  public static final String EVIEW_CONTRIBUTING_MODELS = "contributingModels";
  public static final String EVIEW_MATCHING_MODEL = "matchingModel";
  public static final String EVIEW_WEAVING_MODEL = "weavingModel";

  // Values from the eview file, used for loading/saving
  private String viewpointPath;
  private String contributingModelsPaths;
  private String matchingModelPath;
  private String weavingModelPath;

  private View view; // the constructed view


  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Public API

  public ViewResource() {
    super();
  }

  public ViewResource(URI uri) {
    super(uri);
  }

  @Override
  public EList<EObject> getContents() {
    if (view != null) {
      return view.getVirtualContents();
    } else {
      return ECollections.emptyEList();
    }
  }

  /** The view associated with this resource, if any. */
  public View getView() {
    return view;
  }


  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Loading/saving the 'eview' file

  private Viewpoint loadViewpoint() throws IOException {
    URI uri = URI.createURI(viewpointPath).resolve(getURI());

    // First look up the viewpoint registry using the resolved URI
    Viewpoint v = ViewpointResource.registry.get(uri.toString());
    if (v != null) {
      return v;
    }

    // Otherwise, load a viewpoint resource and return its viewpoint
    ViewpointResource vpr = new ViewpointResource(uri);
    vpr.load(null);
    if (!vpr.getErrors().isEmpty()) {
      getErrors().add(new Err("Failed to load viewpoint due to the following errors"));
      getErrors().addAll(vpr.getErrors());

      // Because the viewpoint is critical to loading the rest of the view,
      // we bail with a descriptive exception rather than throwing NPEs around
      // by returning a null Viewpoint.
      StringJoiner sj = new StringJoiner("\n");
      for (Diagnostic err : vpr.getErrors()) {
        sj.add(err.getMessage());
      }
      throw new IllegalStateException("Viewpoint could not be loaded",
                                      new ViewpointException(sj.toString()));
    } else {
      return vpr.getViewpoint();
    }
  }

  private List<Resource> loadModels(List<EPackage> metamodels) {
    // Load contributing metamodels into a virtual resource set,
    // to allow model ressources to be loaded with getResource
    ResourceSet virtualResourceSet = new ResourceSetImpl();
    for (EPackage p : metamodels) {
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), p);
    }

    List<Resource> contributingModels = new ArrayList<>();
    for (String modelPath : contributingModelsPaths.split(",")) {
      URI uri = URI.createURI(modelPath).resolve(getURI());
      Resource r = virtualResourceSet.getResource(uri, true);
      if (r != null) {
        contributingModels.add(r);
      } else {
        getErrors().add(new Err("Could not load contributing model resource '%s'", modelPath));
      }
    }
    return contributingModels;
  }

  private WeavingModel loadWeavingModel(List<Resource> models) {
    // Get the weaving model from the matching model, if there is one
    WeavingModel weavingModel = null;

    if (matchingModelPath != null && !matchingModelPath.isEmpty()) {
      URI matchingModelURI = URI.createURI(matchingModelPath).resolve(getURI());
      VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModelURI);

      try {
        weavingModel = vld.createWeavingModel(models);
      } catch (Exception e) {
        getErrors().add(new Err("Exception while creating weaving model from matching model: %s", e.toString()));
      }
    } else {
      // Otherwise, the weaving model should be provided in the eview file
      URI weavingModelURI = URI.createURI(weavingModelPath).resolve(getURI());
      Resource weavingModelResource = new ResourceSetImpl().getResource(weavingModelURI, true);
      weavingModel = (WeavingModel) weavingModelResource.getContents().get(0);
    }

    return weavingModel;
  }

  private void setView(View view) {
    this.view = view;
    view.setResource(this);
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    parse(inputStream);

    // Load everything and create the view
    Viewpoint viewpoint = loadViewpoint();
    List<Resource> contributingModels = loadModels(viewpoint.getContributingEPackages());
    WeavingModel weavingModel = loadWeavingModel(contributingModels);

    try {
      setView(new View(viewpoint, contributingModels, weavingModel));
    } catch (Exception e) {
      // If we failed, add the exception to the resource errors, as this way
      // resource browsers can show multiple errors at once rather than barfing
      // on just one exception.
      getErrors().add(new Err(e.toString()));
    }
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    Properties p = new Properties();
    p.setProperty(EVIEW_VIEWPOINT, viewpointPath);
    p.setProperty(EVIEW_CONTRIBUTING_MODELS, contributingModelsPaths);
    if (matchingModelPath != null) {
      p.setProperty(EVIEW_MATCHING_MODEL, matchingModelPath);
    }
    if (weavingModelPath != null) {
      p.setProperty(EVIEW_WEAVING_MODEL, weavingModelPath);
    }
    p.store(outputStream, null);
  }

  @Override
  protected void doUnload() {
    view = null;
    viewpointPath = null;
    contributingModelsPaths = null;
    weavingModelPath = null;
    matchingModelPath = null;

    getErrors().clear();
    getWarnings().clear();
  }

  private void parse(InputStream s) throws IOException {
    Properties p = new Properties();
    p.load(s);

    // Check all required fields are present
    if (!p.containsKey(EVIEW_VIEWPOINT)) {
      getErrors().add(new Err("Error in parsing eview file: missing %s field", EVIEW_VIEWPOINT));
    }
    if (!p.containsKey(EVIEW_CONTRIBUTING_MODELS)) {
      getErrors().add(new Err("Error in parsing eview file: missing %s field", EVIEW_CONTRIBUTING_MODELS));
    }

    // There cannot be a matching model and weaving model specified together, but
    // at least one of them must be present.
    if (p.containsKey(EVIEW_MATCHING_MODEL) == p.containsKey(EVIEW_WEAVING_MODEL)) {
      getErrors().add(new Err("Error in parsing eview file: exactly one of {matching model, weaving model} must be present"));
    }

    for (String key : p.stringPropertyNames()) {
      switch (key) {
      case EVIEW_VIEWPOINT:
        viewpointPath = p.getProperty(key).trim();
        break;

      case EVIEW_CONTRIBUTING_MODELS:
        contributingModelsPaths = p.getProperty(key).trim();
        break;

      case EVIEW_MATCHING_MODEL:
        matchingModelPath = p.getProperty(key).trim();
        break;

      case EVIEW_WEAVING_MODEL:
        weavingModelPath = p.getProperty(key).trim();
        break;

      default:
        getErrors().add(new Err("Invalid key in eview file: '%s'", key));
      }
    }
  }

  // Helper class to create Diagnostic for resource errors.
  class Err implements Diagnostic {

    String msg;

    Err(String msg) {
      this.msg = msg;
    }

    Err(String msg, Object... args) {
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
