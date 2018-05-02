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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEObject;
import org.atlanmod.emfviews.util.EMFViewsUtil;
import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;

public class View extends ResourceImpl implements Virtualizer {

  public static final String EVIEW_VIEWPOINT = "viewpoint";
  public static final String EVIEW_CONTRIBUTING_MODELS = "contributingModels";
  public static final String EVIEW_MATCHING_MODEL = "matchingModel";
  public static final String EVIEW_WEAVING_MODEL = "weavingModel";

  // Values from the eview file, used for loading/saving
  private String viewpointPath;
  private String contributingModelsPaths;
  private String matchingModelPath;
  private String weavingModelPath;

  private Viewpoint viewpoint;
  private Map<EObject, EObject> concreteToVirtual;
  private EList<EObject> virtualContents;
  private Map<String, Resource> modelResources;
  private List<String> contributingModelURIs;
  private Resource weavingModelResource;
  private WeavingModel weavingModel;

  public View() {
    super();
  }

  public View(URI uri) {
    super(uri);
  }

  public void setViewpoint(Viewpoint viewpoint) {
    this.viewpoint = viewpoint;
  }

  @Override
  public EObject getVirtual(EObject obj) {
    if (concreteToVirtual == null) {
      concreteToVirtual = new HashMap<>();
    }

    if (obj == null) {
      return null;
    }

    // Idempotent
    if (obj instanceof VirtualEObject) {
      return obj;
    }

    return concreteToVirtual.computeIfAbsent(obj, o ->
      new VirtualEObject(o, viewpoint.getVirtual(o.eClass()), this)
    );
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    parse(inputStream);

    ResourceSet virtualResourceSet = new ResourceSetImpl();

    URI viewpointURI = URI.createURI(viewpointPath).resolve(getURI());
    viewpoint = new Viewpoint(viewpointURI);
    viewpoint.load(null);

    // Load contributing metamodels into the virtual resource set,
    // to allow model ressources to be loaded with getResource
    for (EPackage p : viewpoint.getContributingEPackages()) {
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), p);
    }

    // Load contributing models

    contributingModelURIs = new ArrayList<>();
    modelResources = new HashMap<>();

    // @Correctness: we shouldn't directly depend on NeoEMF for that
    // The initialization can be done programmatically, but how to
    // do it when opening a view with a graphical editor?
    PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME,
                                               BlueprintsPersistenceBackendFactory.getInstance());
    virtualResourceSet.getResourceFactoryRegistry()
    .getProtocolToFactoryMap()
    .put(BlueprintsURI.SCHEME,
         PersistentResourceFactory.getInstance());

    for (String modelURI : contributingModelsPaths.split(",")) {
      URI uri = URI.createURI(modelURI).resolve(getURI());

      // @Correctness: matching on file extension is brittle, unless NeoEMF resources
      // always ends with it.
      Map<?,?> loadOptions = Collections.EMPTY_MAP;
      if (modelURI.endsWith(".graphdb")) {
        uri = BlueprintsURI.createURI(uri);
        loadOptions = BlueprintsNeo4jOptionsBuilder.newBuilder()
            .softCache().directWriteLongListSupport().asMap();
      }
      Resource r = virtualResourceSet.createResource(uri);
      r.load(loadOptions);

      // @Refactor: maybe there's a better way to obtain the URI of the metamodel?
      String nsURI = r.getContents().get(0).eClass().getEPackage().getNsURI();
      contributingModelURIs.add(nsURI);
      modelResources.put(nsURI, r);
    }

    // Get the weaving model from the matching model, if there is one
    if (!matchingModelPath.isEmpty()) {
      URI matchingModelURI = URI.createURI(matchingModelPath).resolve(getURI());
      VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModelURI);

      try {
        weavingModel = vld.createWeavingModel(getContributingModels());
      } catch (Exception e) {
        throw new RuntimeException("Exception while creating weaving model from matching model", e);
      }
    } else {
      // Otherwise, the weaving model should be provided in the eview file

      URI weavingModelURI = URI.createURI(weavingModelPath).resolve(getURI());
      Map<?,?> loadOptions = Collections.EMPTY_MAP;
      if (weavingModelPath.endsWith(".graphdb")) {
        weavingModelURI = BlueprintsURI.createURI(weavingModelURI);
        loadOptions = BlueprintsNeo4jOptionsBuilder.newBuilder()
            .softCache().directWriteLongListSupport().asMap();
      }
      weavingModelResource = new ResourceSetImpl().createResource(weavingModelURI);
      weavingModelResource.load(loadOptions);

      weavingModel = (WeavingModel) weavingModelResource.getContents().get(0);
    }
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    // @Correctness: This rewrites the eview file as it was found.
    // I think we should rather use the eview file to init the state of the View, and
    // write from the correct state on save.  This would prevent writing garbage.
    Properties p = new Properties();
    p.setProperty(EVIEW_VIEWPOINT, viewpointPath);
    p.setProperty(EVIEW_CONTRIBUTING_MODELS, contributingModelsPaths);
    p.setProperty(EVIEW_MATCHING_MODEL, matchingModelPath);
    p.setProperty(EVIEW_WEAVING_MODEL, weavingModelPath);
    p.store(outputStream, null);
  }

  private void parse(InputStream s) throws IOException {
    Properties p = new Properties();
    p.load(s);

    // @Correctness: if we did not expose the eview values directly, this wouldn't be needed.
    matchingModelPath = "";

    // Check all required fields are present
    // FIXME: Ecore editor silently eats these exceptions (test with empty viewpoint
    // and see)
    if (!p.containsKey(EVIEW_VIEWPOINT)) {
      throw new IllegalArgumentException(String.format("Error in parsing eview file: missing %s field", EVIEW_VIEWPOINT));
    }
    if (!p.containsKey(EVIEW_CONTRIBUTING_MODELS)) {
      throw new IllegalArgumentException(String.format("Error in parsing eview file: missing %s field", EVIEW_CONTRIBUTING_MODELS));
    }

    // There cannot be a matching model and weaving model specified together, but
    // at least one of them must be present.
    if (p.containsKey(EVIEW_MATCHING_MODEL) == p.containsKey(EVIEW_WEAVING_MODEL)) {
      throw new IllegalArgumentException("Error in parsing eview file: exactly one of {matching model, weaving model} must be present");
    }

    for (String key : p.stringPropertyNames()) {
      switch (key) {
      case EVIEW_VIEWPOINT:
        viewpointPath = p.getProperty(key, "").trim();
        break;

      case EVIEW_CONTRIBUTING_MODELS:
        contributingModelsPaths = p.getProperty(key, "").trim();
        break;

      case EVIEW_MATCHING_MODEL:
        matchingModelPath = p.getProperty(key, "").trim();
        break;

      case EVIEW_WEAVING_MODEL:
        weavingModelPath = p.getProperty(key, "").trim();
        break;

      default:
        throw new IllegalArgumentException(String.format("Invalid key in eview file: '%s'", key));
      }
    }
  }

  public void close() {
    // Make sure to close any contributing resource
    for (Resource r : getContributingModels()) {
      if (r instanceof PersistentResource) {
        ((PersistentResource) r).close();
      }
    }

    // And the weaving model
    if (weavingModelResource instanceof PersistentResource) {
      ((PersistentResource) weavingModelResource).close();
    }
  }

  public Object getInitialContentForVirtualAssociation(EObject owner, EStructuralFeature feature) {
    List<Object> contents = new ArrayList<>();

    // If there is no weaving model, there are no contents
    if (weavingModel == null) {
      return null;
    }

    // @Correctness: this should work with VirtualConcept as well
    for (VirtualAssociation assoc : weavingModel.getVirtualAssociations()) {
      // We only care about the associations that populate our feature
      // for the given source
      if (assoc.getName().equals(feature.getName())) {
        ConcreteElement elem = (ConcreteConcept) assoc.getSource();
        EObject source = getVirtual(modelResources.get(elem.getModel().getURI()).getEObject(elem.getPath()));

        if (owner.equals(source)) {
          // Get the target
          elem = (ConcreteConcept) assoc.getTarget();
          EObject target = getVirtual(modelResources.get(elem.getModel().getURI()).getEObject(elem.getPath()));

          // If it's a many feature, add the target to the list
          if (feature.isMany()) {
            contents.add(target);
          } else {
            return target;
          }
        }
      }
    }

    return contents;
  }

  @Override
  public EList<EObject> getContents() {
    if (virtualContents == null) {
      List<EObject> contents = new ArrayList<>();

      // @Correctness: we could apply view-level filters here

      for (Resource r : getContributingModels()) {
        for (EObject o : r.getContents()) {
          contents.add(getVirtual(o));
        }
      }

      virtualContents = ECollections.asEList(contents);
    }
    return virtualContents;
  }

  public List<Resource> getContributingModels() {
    List<Resource> models = new ArrayList<>(contributingModelURIs.size());

    for (String uri : contributingModelURIs) {
      models.add(modelResources.get(uri));
    }

    return models;
  }

  public List<EObject> getAllInstances(EClass cls) {

    // If the classifier does not exist on the viewpoint,
    // there can be no instances
    if (!viewpoint.hasClassifier(cls)) {
      return Collections.emptyList();
    } else {
      // Get the concrete classifier
      EClass ccls = ((VirtualEClass) cls).getConcreteEClass();
      List<EObject> result = new ArrayList<>();
      for (Resource r : getContributingModels()) {
        // If the class belongs to a NeoEMF resource, then we can use the
        // more efficient getAllInstances
        if (r instanceof PersistentResource) {
          result.addAll(((PersistentResource) r).getAllInstances(ccls));
        } else {
          // Otherwise iterate on contents and check instances
          result.addAll(EMFViewsUtil.asStream(r.getAllContents()).filter(ccls::isInstance).collect(Collectors.toList()));
        }
      }

      return result.stream().map(this::getVirtual).collect(Collectors.toList());
    }
  }

}
