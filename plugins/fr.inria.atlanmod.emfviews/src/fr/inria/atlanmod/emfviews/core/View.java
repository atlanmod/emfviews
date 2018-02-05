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

package fr.inria.atlanmod.emfviews.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import fr.inria.atlanmod.emfviews.elements.VirtualEClass;
import fr.inria.atlanmod.emfviews.elements.VirtualEObject;
import fr.inria.atlanmod.emfviews.elements.Virtualizer;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;

public class View extends ResourceImpl implements Virtualizer {

  private Viewpoint viewpoint;
  private Map<EObject, EObject> concreteToVirtual;
  private EList<EObject> virtualContents;
  private Map<String, Resource> modelResources;
  private List<String> contributingModelURIs;

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
  public <E extends EObject> E getVirtual(E obj) {
    if (concreteToVirtual == null) {
      concreteToVirtual = new HashMap<>();
    }

    @SuppressWarnings("unchecked") // we map anything to a VirtualEObject, so it works
    E virtual = (E) concreteToVirtual.computeIfAbsent(obj, o -> {
      if (o == null) {
        return o;
      }

      // Don't virtualize virtual objects
      if (o instanceof VirtualEObject)
        return o;

      return new VirtualEObject(o, (VirtualEClass) viewpoint.getVirtual(o.eClass()), this);
    });

    return virtual;
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

    Properties properties = new Properties();
    properties.load(inputStream);
    ResourceSet virtualResourceSet = new ResourceSetImpl();

    URI viewpointURI = URI.createURI(properties.getProperty("viewpoint")).resolve(getURI());
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

    for (String modelURI : properties.getProperty("contributingModels").split(",")) {
      URI uri = URI.createURI(modelURI).resolve(getURI());
      Resource r = virtualResourceSet.getResource(uri, true);
      if (r != null) {
        // @Refactor: maybe there's a better way to obtain the URI of the metamodel?
        String nsURI = r.getContents().get(0).eClass().getEPackage().getNsURI();
        contributingModelURIs.add(nsURI);
        modelResources.put(nsURI, r);
      } else {
        throw new NullPointerException("No such resource: " + modelURI);
      }
    }

    URI weavingModelURI = URI.createURI(properties.getProperty("weavingModel")).resolve(getURI());

    Optional<URI> matchingModelURI = viewpoint.getMatchingModelURI();
    if (matchingModelURI.isPresent()) {
      VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModelURI.get());

      try {
        vld.createVirtualModelLinks(weavingModelURI, getContributingModels());
      } catch (Exception e) {
        throw new RuntimeException("Exception while creating weaving model from matching model", e);
      }
    }

    // Populate the model with values for virtual associations
    Resource weavingModelResource = new ResourceSetImpl().getResource(weavingModelURI, true);
    WeavingModel weavingModel = (WeavingModel) weavingModelResource.getContents().get(0);

    for (VirtualAssociation assoc : weavingModel.getVirtualAssociations()) {
      // @Correctness: this should work with VirtualConcept as well

      ConcreteElement elem = (ConcreteConcept) assoc.getSource();
      // Get the NsURI of the metamodel
      String nsURI = elem.getModel().getURI();
      // Find the corresponding resource
      Resource model = modelResources.get(nsURI);
      // Find the referenced element in that resource
      EObject source = model.getEObject(elem.getPath());

      // Do the same for the target
      elem = (ConcreteConcept) assoc.getTarget();
      EObject target = modelResources.get(elem.getModel().getURI()).getEObject(elem.getPath());

      // Find the feature for this virtual association
      EObject vSource = getVirtual(source);
      EStructuralFeature feature = vSource.eClass().getEStructuralFeature(assoc.getName());

      // If it's a many feature, add to the list
      if (feature.isMany()) {
        @SuppressWarnings("unchecked")
        List<EObject> list = (List<EObject>) vSource.eGet(feature);
        list.add(getVirtual(target));
      } else {
        vSource.eSet(feature, getVirtual(target));
      }
    }
  }

  @Override
  public EList<EObject> getContents() {
    if (virtualContents == null) {
      List<EObject> contents = new ArrayList<>();

      for (Resource r : getContributingModels()) {
        for (EObject o : r.getContents()) {
          contents.add(getVirtual(o));
        }
      }

      virtualContents = ECollections.unmodifiableEList(contents);
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

}
