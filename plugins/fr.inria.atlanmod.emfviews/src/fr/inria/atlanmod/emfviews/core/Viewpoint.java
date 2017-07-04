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

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.inria.atlanmod.emfviews.util.EMFViewsUtil;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

public class Viewpoint extends ResourceImpl {

  private Properties properties;

  private ResourceSet virtualResourceSet;
  /**
   * The contents of the virtual model
   */
  private EList<EObject> virtualContents; // list of resources

  /**
   * Contains all the attributes we have removed from packages in the virtual
   * resource set. Used by the ViewpointEditor.
   */
  private List<EObject> hiddenAttributes;

  private String contributingMetamodels;
  private String matchingModel;

  private Resource weavingModelResource;
  private List<EPackage> contributingEpackages;
  private EPackage virtualPackage;

  private Resource attributesToHideMM;

  public Viewpoint(URI uri) {
    super(uri);
    virtualResourceSet = new ResourceSetImpl();
  }

  public String getMatchingModel() {
    return matchingModel;
  }

  public List<EObject> getHiddenAttributes() {
    return hiddenAttributes;
  }

  public List<EPackage> getContributingEpackages() {
    return contributingEpackages;
  }

  public String getContributingMetamodelsURIs() {
    return contributingMetamodels;
  }

  @Override
  public EList<EObject> getContents() {
    return virtualContents;
  }

  public Resource getWeavingModelResource() {
    return weavingModelResource;
  }

  // FIXME: unused?
  public void setWeavingModelResource(Resource weavingModelResource) {
    this.weavingModelResource = weavingModelResource;
  }

  public Resource getAttributesToHideMM() {
    return attributesToHideMM;
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    properties = new Properties();
    properties.load(inputStream);
    // FIXME: this should create a weaving model XMI from the ECL file, but do
    // we actually need it?
    if (properties.getProperty("matchingModel") != null) {
      matchingModel = properties.getProperty("matchingModel");
      // try {
      // VirtualLinksDelegator vld = new VirtualLinksDelegator(
      // properties.getProperty("matchingModel"));
      // vld.createVirtualMetamodelLinks(URI.createURI(properties.getProperty("weavingModel"));
      // //extendedMMviewpoint.xmi is rewrited
      // } catch (CoreException e) {
      // e.printStackTrace();
      // }
    }

    cloneContributingMetamodels(properties.getProperty("contributingMetamodels"));
    loadWeavingModel(properties.getProperty("weavingModel"));
    setVirtualContents();
  }

  // Clone each metamodel into our virtual resource set, so that we can add and
  // remove elements from them without affecting the originals.
  private void cloneContributingMetamodels(String contributingModelsURIs) {
    this.contributingMetamodels = contributingModelsURIs;
    contributingEpackages = new ArrayList<>();

    for (String modelURI : contributingModelsURIs.split(",")) {
      // Get the EPackage from each metamodel URI
      EPackage p = EMFViewsUtil.getEPackageFromURI(modelURI);
      contributingEpackages.add(p);

      // Clone the package into our virtual resource set
      EPackage copy = EcoreUtil.copy(p);
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), copy);
    }
  }

  // TODO: might move into virtuallinks.util
  private EObject findEObjectOrBail(LinkedElement elem) {
    if (elem instanceof ConcreteElement) {
      ConcreteElement e = (ConcreteElement) elem;

      EObject model = virtualResourceSet.getPackageRegistry().getEPackage(e.getModel().getURI());
      if (model == null) {
        throw new InvalidLinkedElementException(String
            .format("Model '%s' of concrete element cannot be found", e.getModel().getURI()));
      }

      EObject obj = EMFViewsUtil.findElement(model, e.getPath());
      if (obj == null) {
        throw new InvalidLinkedElementException(String
            .format("Concrete element '%s' cannot be found in model '%s'", e.getPath(),
                    e.getModel().getURI()));
      }
      return obj;
    } else {
      // TODO: handle non-concrete elements
      throw new UnsupportedOperationException("Cannot link to non-concrete elements");
    }
  }

  /**
   * Apply the given filters to all the packages in the virtual resource set.
   *
   * @param filters The filters describing the elements to remove from the
   *          packages in the resource set.
   */
  private void filterMetamodels(List<ElementFilter> filters) {
    hiddenAttributes = new ArrayList<>();

    for (ElementFilter f : filters) {
      LinkedElement l = f.getTarget();
      EObject filteredElement = findEObjectOrBail(l);
      EcoreUtil.delete(filteredElement);
      hiddenAttributes.add(filteredElement);
    }
  }

  private void loadWeavingModel(String weavingModelURI) throws FileNotFoundException, IOException {
    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    weavingModelResource = new ResourceSetImpl().getResource(URI.createURI(weavingModelURI), true);

    // Get the virtual links from the serialized resource
    // FIXME: this cast can fail if the XMI is not a VirtualLinks
    WeavingModel wm = (WeavingModel) weavingModelResource.getContents().get(0);

    // Remove filtered elements from the packages in the resource set
    filterMetamodels(wm.getElementFilters());

    {
      // The viewpointPackage holds all the new concepts

      // First we make sure the chosen name is non-empty and does not clash with
      // any contributing packages
      String n = wm.getName();
      if (n == null)
        throw new ViewpointException("Weaving model name is null");
      if (!n.matches("[a-z][a-z0-9]*"))
        throw new ViewpointException(String
            .format("Weaving model name '%s' should be non-empty, all lowercase", n));
      for (EPackage p : contributingEpackages) {
        if (n.equalsIgnoreCase(p.getName()))
          throw new ViewpointException(String
              .format("Weaving model name '%s' is the same as contributing package '%s'", n,
                      p.getNsURI()));
      }

      // Then, if we have some concepts to put in the package
      if (!wm.getNewConcepts().isEmpty()) {
        virtualPackage = EcoreFactory.eINSTANCE.createEPackage();
        virtualPackage.setName(n);
        virtualPackage.setNsURI("http://inria/atlanmod/emfviews/viewpoint/" + n);
        // TODO: should we set NsPrefix as well?
        virtualResourceSet.getPackageRegistry().put(virtualPackage.getNsURI(), virtualPackage);
      }
    }

    // Add new concepts
    for (NewConcept c : wm.getNewConcepts()) {
      EClass n = EcoreFactory.eINSTANCE.createEClass();
      n.setName(c.getName());
      virtualPackage.getEClassifiers().add(n);

      for (LinkedElement e : c.getSuperConcepts()) {
        EObject sup = findEObjectOrBail(e);
        if (!(sup instanceof EClass))
          throw new InvalidLinkedElementException(String
              .format("Superconcept '%s' of new concept '%s' should be an EClass", e, c.getName()));
        n.getESuperTypes().add((EClass) sup);
      }
    }

    // Add virtual associations
    for (NewAssociation a : wm.getNewAssociations()) {
      // Each association is turned into an EReference

      EObject source = findEObjectOrBail(a.getSource());
      EObject target = findEObjectOrBail(a.getTarget());

      EReference ref = EcoreFactory.eINSTANCE.createEReference();
      ref.setName(a.getName());
      // XXX: target: EClassifier should be a model constraint
      ref.setEType((EClassifier) target);
      ref.setLowerBound(a.getLowerBound());
      ref.setUpperBound(a.getUpperBound());
      // XXX: source: EClass should be a model constraint
      ((EClass) source).getEStructuralFeatures().add(ref);

      // TODO: opposite
    }
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    // VirtualLinksFactory linksFactory = VirtualLinksFactory.eINSTANCE;
    WeavingModel vLinks = (WeavingModel) weavingModelResource.getContents().get(0);
    vLinks.getVirtualLinks().clear();
    vLinks.getContributingModels().clear();
    weavingModelResource.save(null);
    properties.store(outputStream, null);
  }

  private void setVirtualContents() {
    List<List<EObject>> sublists = new ArrayList<>();

    // The order of packages in the virtual contents matters. We use the order
    // specified by the contributing models, and the virtual package is last.
    for (EPackage p : contributingEpackages) {
      List<EObject> oneOftheSublists = new ArrayList<>();
      oneOftheSublists.add((EObject) virtualResourceSet.getPackageRegistry().get(p.getNsURI()));
      sublists.add(oneOftheSublists);
    }

    // The virtual package is not included if there are no new concepts.
    if (virtualPackage != null) {
      List<EObject> l = new ArrayList<>();
      l.add(virtualPackage);
      sublists.add(l);
    }

    this.virtualContents = new VirtualContents<>(this, sublists);
  }

  // FIXME: unused?
  private InputStream openContentStream(String contents) {
    return new ByteArrayInputStream(contents.getBytes());
  }

  @Override
  public ResourceSet getResourceSet() {
    return virtualResourceSet;
  }

}
