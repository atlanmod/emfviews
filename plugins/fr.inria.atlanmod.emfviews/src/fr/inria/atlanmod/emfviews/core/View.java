/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Juan David Villa Calle - initial API and implementation
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

    viewpoint = new Viewpoint(URI.createURI(properties.getProperty("viewpoint")));
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
      Resource r = virtualResourceSet.getResource(URI.createURI(modelURI, true), true);
      if (r != null) {
        // @Refactor: maybe there's a better way to obtain the URI of the metamodel?
        String nsURI = r.getContents().get(0).eClass().getEPackage().getNsURI();
        contributingModelURIs.add(nsURI);
        modelResources.put(nsURI, r);
      } else {
        throw new NullPointerException("No such resource: " + modelURI);
      }
    }

    /*
    Optional<String> matchingModelPath = viewpoint.getMatchingModelPath();
    if (matchingModelPath.isPresent() && !matchingModelPath.get().isEmpty()) {
      // XXX: we could mark the weaving model file as derived
      try {
        VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModelPath.get());

        vld.createVirtualModelLinks(URI.createURI(properties.getProperty("weavingModel"), true),
                                    getContributingModels());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    */

    // Populate the model with values for virtual associations
    Resource weavingModelResource = new ResourceSetImpl().getResource(URI.createURI(properties.getProperty("weavingModel")), true);
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

    // Prepare virtual contents
    List<EObject> contents = new ArrayList<>();

    for (Resource r : getContributingModels()) {
      for (EObject o : r.getContents()) {
        contents.add(getVirtual(o));
      }
    }

    virtualContents = ECollections.unmodifiableEList(contents);
  }

  @Override
  public EList<EObject> getContents() {
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
