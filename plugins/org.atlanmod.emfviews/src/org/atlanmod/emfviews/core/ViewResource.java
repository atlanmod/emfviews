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
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.StringJoiner;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.execute.EclOperationFactory;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.models.IModel;

import org.atlanmod.emfviews.virtuallinks.WeavingModel;

import cdobackend.CDOBackend;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;

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

  /** Associate a view to this resource. */
  public void setView(View view) {
    // Cannot be private because it is used for creating purely in-memory views
    // (see TestEMFViews.viewOnView)
    this.view = view;
    view.setResource(this);
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

  private CDOBackend cdoBackend;
  private CDOBackend getCDOBackend() {
    if (cdoBackend == null) {
      cdoBackend = new CDOBackend();
    }
    return cdoBackend;
  }

  private Map<String, Resource> loadModels(Map<String, EPackage> metamodels) {
    Map<String, Resource> contributingModels = new HashMap<>();
    for (String modelPath : contributingModelsPaths.split(",")) {

      // Format is alias::URI
      if (!modelPath.contains("::")) {
        throw new IllegalArgumentException(String.format("Contributing model path '%s' does not contain alias separator '::'", modelPath));
      }
      String parts[] = modelPath.split("::");
      String alias = parts[0];
      URI uri = URI.createURI(parts[1]).resolve(getURI());

      // Each resource needs to use a different resource set, otherwise we may
      // have name clashes in EPackages.
      EPackage metamodel = metamodels.get(alias);
      if (metamodel == null)
        throw new IllegalArgumentException(String.format("No metamodel declared in viewpoint for alias '%s'", alias));
      ResourceSet rs = new ResourceSetImpl();
      rs.getPackageRegistry().put(metamodel.getNsURI(), metamodel);

      Map<?,?> loadOptions = Collections.EMPTY_MAP;

      // @Correctness: matching on file extension is brittle, but we don't have
      // a fool-proof way to detect NeoEMF resources
      if ("graphdb".equals(uri.fileExtension())) {
        // @Correctness: we shouldn't directly depend on NeoEMF for that
        // The initialization can be done programmatically, but how to
        // do it when opening a view with a graphical editor?
        PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME,
                                                   BlueprintsPersistenceBackendFactory.getInstance());
        rs.getResourceFactoryRegistry()
          .getProtocolToFactoryMap()
          .put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());

        loadOptions = BlueprintsNeo4jOptionsBuilder.newBuilder()
          .softCache().directWriteLongListSupport().asMap();

        if (uri.isPlatform()) {
          // Convert to a file URI since Blueprints does not support platform URI
          File f = ResourcesPlugin.getWorkspace().getRoot()
            .getFile(new Path(uri.toPlatformString(true))).getLocation().toFile();
          uri = BlueprintsURI.createFileURI(f);
        } else {
          uri = BlueprintsURI.createURI(uri);
        }
      }

      Resource r;

      if ("cdo".equals(uri.fileExtension())) {
        try {
          r = getCDOBackend().getResource(new File(uri.toFileString()), "res1");
          // @Hack: the CDOResource resourceset has a package registry full of
          // garbage. We don't want that, as that causes name clashes when using
          // ECL.  The only metamodel we need is the one specified by the viewpoint.
          r.getResourceSet().getPackageRegistry().clear();
          r.getResourceSet().getPackageRegistry().put(metamodel.getNsURI(), metamodel);
        } catch (Exception e) {
          throw new RuntimeException("Exception while loading CDO resource", e);
        }
      } else {
        r = rs.createResource(uri);
        try {
          r.load(loadOptions);
        } catch (IOException e) {
          throw new RuntimeException(String.format("Exception while loading model %s", uri), e);
        }
      }

      if (r != null) {
        contributingModels.put(alias, r);
      } else {
        getErrors().add(new Err("Could not load contributing model resource '%s'", modelPath));
      }
    }
    return contributingModels;
  }

  private List<VirtualLinkMatch> loadWeavingModel(Map<String, Resource> models) throws Exception  {
    // Get the weaving model from the matching model, if there is one
    List<VirtualLinkMatch> weavingModel = new ArrayList<>();

    if (matchingModelPath == null || matchingModelPath.isEmpty()) {
      return weavingModel;
    }

    URI matchingModelURI = URI.createURI(matchingModelPath).resolve(getURI());

    // @Temp: bypass VirtualLinksDelegator, run ECL directly and use that to populate the view
    {
      File eclFile = new File(matchingModelURI.toFileString());

      EclModule module = new EclModule();
      module.parse(eclFile);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new Exception("Error in parsing ECL file.  See stderr for details");
      }
      EclOperationFactory operationFactory = new EclOperationFactory();
      module.getContext().setOperationFactory(operationFactory);

      // Keep track of which Epsilon models are owned by which EpsilonResource.
      Map<IModel, EpsilonResource> epsToResource = new HashMap<>();

      // Add models
      for (Entry<String, Resource> e : models.entrySet()) {
        String name = e.getKey();
        Resource r = e.getValue();
        IModel m;

        // If it's an EpsilonResource, we can add the underlying Epsilon model
        // directly. Otherwise, wrap it using InMemoryEmfModel. We also keep
        // track of that relationship since we need to call the EpsilonResource
        // containing an object from a match.
        if (r instanceof EpsilonResource) {
          m = ((EpsilonResource) r).getEpsilonModel();
          epsToResource.put(m, (EpsilonResource) r);
        } else {
          m = new InMemoryEmfModel(r);
        }

        m.setName(name);
        module.getContext().getModelRepository().addModel(m);
      }

      // Execute the module
      MatchTrace mt = (MatchTrace) module.execute();

      Map<Object, EObject> targets = new HashMap<>();
      for (Match m : mt.getMatches()) {
        if (m.isMatching()) {
          VirtualLinkMatch vlm = new VirtualLinkMatch();
          vlm.linkName = m.getRule().getName();

          // @Optimize: getOwningModel may be O(n) depending of the backing model.
          vlm.source = targets.computeIfAbsent(m.getLeft(), obj -> asEObject(obj, module, epsToResource));
          vlm.target = targets.computeIfAbsent(m.getRight(), obj -> asEObject(obj, module, epsToResource));

          weavingModel.add(vlm);
        }
      }
    }

    return weavingModel;
  }

  public void close() {
    // Make sure to close any contributing resource
    for (Resource r : view.getContributingModels()) {
      if (r instanceof PersistentResource) {
        ((PersistentResource) r).close();
      }
    }

    // And the weaving model
    /*if (weavingModelResource instanceof PersistentResource) {
      ((PersistentResource) weavingModelResource).close();
    }*/

    // And the CDO backend
    if (cdoBackend != null) {
      cdoBackend.close();
    }
  }

  private EObject asEObject(Object obj, EclModule module, Map<IModel, EpsilonResource> epsToResource) {
    if (obj instanceof EObject) {
      return (EObject) obj;
    } else {
      IModel owner = module.getContext().getModelRepository().getOwningModel(obj);
      EpsilonResource r = epsToResource.get(owner);
      return r.asEObject(obj);
    }
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    parse(inputStream);

    // Load everything and create the view
    Viewpoint viewpoint = loadViewpoint();
    Map<String, Resource> contributingModels = loadModels(viewpoint.getContributingEPackages());
    try {
      List<VirtualLinkMatch> weavingModel = loadWeavingModel(contributingModels);
      setView(new View(viewpoint, new ArrayList<>(contributingModels.values()), weavingModel));
    } catch (Exception e) {
      e.printStackTrace();
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
    if (p.containsKey(EVIEW_MATCHING_MODEL) && p.containsKey(EVIEW_WEAVING_MODEL)) {
      getErrors().add(new Err("Error in parsing eview file: the keys {matching model, weaving model} are exclusive"));
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
