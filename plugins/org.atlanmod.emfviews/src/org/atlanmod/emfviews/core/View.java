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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import org.atlanmod.emfviews.elements.VirtualEObject;
import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;

public class View implements Virtualizer {

  private Viewpoint viewpoint; // holds the metamodel the view needs to conform to
  private WeavingModel weavingModel; // what virtual links to create
  private Resource resource; // the resource using this view, if any.  This is used by VirtualEObject.eResource,
                             // to please some modeling tools (e.g. OCL).

  private Map<String, Resource> modelResources;
  private List<Resource> contributingModels;

  private EList<EObject> virtualContents; // cache the results of getVirtualContents
  private Map<EObject, EObject> concreteToVirtual; // used by the Virtualizer implementation to cache virtual elements

  // A View without models is still useful as a virtualizer
  public View(Viewpoint viewpoint) {
    this.viewpoint = viewpoint;
  }

  public View(Viewpoint viewpoint, List<Resource> contributingModels) {
    this(viewpoint, contributingModels, Viewpoint.emptyWeavingModel);
  }

  public View(Viewpoint viewpoint, List<Resource> contributingModels, WeavingModel weavingModel) {
    this.viewpoint = viewpoint;
    this.contributingModels = contributingModels;
    this.weavingModel = weavingModel;

    build();
  }

  protected void build() {
    modelResources = new HashMap<>();

    // Load contributing models
    for (Resource r : contributingModels) {
      String nsURI = r.getContents().get(0).eClass().getEPackage().getNsURI();
      modelResources.put(nsURI, r);
    }

    // Populate the model with values for virtual associations
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

  public EList<EObject> getVirtualContents() {
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
    return contributingModels;
  }

  public void setResource(Resource r) {
    this.resource = r;
  }

  public Resource getResource() {
    return resource;
  }

  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Implementation of Virtualizer

  @Override
  public EObject getVirtual(EObject obj) {
    if (obj == null) {
      return null;
    }

    if (concreteToVirtual == null) {
      concreteToVirtual = new HashMap<>();
    }

    return concreteToVirtual.computeIfAbsent(obj, o ->
      new VirtualEObject(o, viewpoint.getVirtual(o.eClass()), this)
    );
  }

}
