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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.util.EMFViewsUtil;
import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;

public abstract class View extends ResourceImpl {
  protected Properties properties;

  protected ResourceSet virtualResourceSet;

  protected String contributingModelsURIs;

  protected String viewpointURI;

  protected String contributingMetamodelsURIs;

  protected String weavingModelURI;

  protected XMIResourceImpl weavingModelResource;

  /**
   * The contents of the virtual model
   */
  protected EList<EObject> virtualContents;

  public List<Resource> getContributingModels() {
    ArrayList<Resource> contributingModels = new ArrayList<>();
    EList<Resource> allResources = virtualResourceSet.getResources();
    for (Resource resource : allResources) {
      // XXX: why skip ECore resources?
      if (!resource.getURI().toString().endsWith("ecore")) {
        contributingModels.add(resource);
      }
    }

    return contributingModels;
  }

  public MetamodelManager getMetamodelManager() {
    return metamodelManager;
  }

  /**
   * Utility for the virtual links
   */
  protected VirtualLinkManager vLinkManager;

  public VirtualLinkManager getVirtualLinkManager() {
    return vLinkManager;
  }

  protected MetamodelManager metamodelManager;

  @Override
  public EList<EObject> getContents() {
    return virtualContents;
  }

  public View(URI uri) {
    super(uri);

  }

  public View() {
    super();

  }
  //
  // public View(List<URI> contributingModels, List<URI> contributingMetamodels,
  // URI linksModel, URI viewpoint) {
  // super();
  //
  // }
  //
  // public View(List<String> contributingModels,
  // List<String> contributingMetamodels, String viewpoint) {
  // super();
  // }

  protected void loadContributingModels(List<String> contributingModelsPaths) {
    // This loads the resources into the virtual resource set as a side effect,
    // so we can get them in getContributingModels later.
    for (String modelURI : contributingModelsPaths) {
      virtualResourceSet.getResource(URI.createURI(modelURI, true), true);
    }

  }

  protected void loadContributingMetamodels(List<String> contributingmetaModelsPaths) {
    for (String metamodelURI : contributingmetaModelsPaths) {
      EPackage p = EMFViewsUtil.getEPackageFromURI(metamodelURI);
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), p);
    }
  }

  protected void setVirtualContents() {

    List<Resource> contributingModels = getContributingModels();

    List<List<EObject>> sublists = new ArrayList<>();

    for (Resource r : contributingModels) {
      ArrayList<EObject> oneOftheSublists = new ArrayList<>();
      for (EObject o : r.getContents()) {
        oneOftheSublists.add(translateToVirtualElement(o));
      }
      sublists.add(oneOftheSublists);
    }

    this.virtualContents = new VirtualContents<>(this, sublists);
  }

  public EObject translateToVirtualElement(EObject e) {
    if (e == null) {
      return null;
    } else {
      return vLinkManager.getVirtualElement(e);
    }
  }

  // FIXME: unused?
  public void serialize(IFile file) throws IOException, CoreException {
    StringBuffer fileContent = new StringBuffer();
    String contributingModelsLine = "contributingModels=" + contributingModelsURIs;
    fileContent.append(contributingModelsLine);
    fileContent.append("\n");

    String viewpointLine = "viewpoint=" + viewpointURI;
    fileContent.append(viewpointLine);
    fileContent.append("\n");

    String contributingMetamodelsLine = "contributingMetamodels=" + contributingMetamodelsURIs;
    fileContent.append(contributingMetamodelsLine);
    fileContent.append("\n");

    String weavingModelLine = "weavingModel=" + weavingModelURI;

    fileContent.append(weavingModelLine);

    String matchingModelLine = "matchingModel=" + weavingModelURI;
    fileContent.append(matchingModelLine);

    InputStream stream = openContentStream(fileContent.toString());
    if (file.exists()) {
      file.setContents(stream, true, true, null);
    } else {
      file.create(stream, true, null);
    }
    stream.close();

  }

  // FIXME: unused?
  public InputStream openContentStream(String contents) {
    return new ByteArrayInputStream(contents.getBytes());
  }

  // FIXME: unused?
  public void createWeavingModel(URI modelURI) throws IOException {

    weavingModelURI = modelURI.toString();

    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks virtualLinksModelLevel = vLinksFactory.createVirtualLinks();

    weavingModelResource = new XMIResourceImpl();

    weavingModelResource.setURI(modelURI);
    weavingModelResource.getContents().add(virtualLinksModelLevel);

    // XMIResourceImpl weavingForMetamodelResource = new XMIResourceImpl();

    IWorkspace workspace = ResourcesPlugin.getWorkspace();

    java.net.URI uri = workspace.getRoot().findMember("/" + weavingModelURI).getLocationURI();
    weavingModelResource.load(uri.toURL().openStream(), null);

    weavingModelResource.setURI(org.eclipse.emf.common.util.URI.createURI(uri.toString()));

    List<Association> associations = new ArrayList<>();

    VirtualLinks virtualLinks = (VirtualLinks) weavingModelResource.getContents().get(0);
    EList<VirtualLink> allVirtualLinks = virtualLinks.getVirtualLinks();
    for (VirtualLink virtualLink : allVirtualLinks) {
      if (virtualLink instanceof Association) {
        Association association = (Association) virtualLink;
        associations.add(association);
      }

    }
    for (Association association : associations) {
      LinkedElement sourceElement = association.getSourceElement();
      String sourceCLassName = sourceElement.getName();
      String sourcePackagensURI = sourceElement.getModelRef();

      LinkedElement targetElement = association.getTargetElements().get(0);
      String targetCLassName = targetElement.getName();
      String targetPackagensURI = targetElement.getModelRef();
      String sourceAtt = association.getSourceAttribute();
      String targetAtt = association.getTargetAttribute();
      if (sourceAtt != null && targetAtt != null) {

        Resource sourceResource = getcontributingModel(sourcePackagensURI);
        EList<EObject> sourceModelContents = sourceResource.getContents();
        ArrayList<EObject> sourceModelElementsThatConform = new ArrayList<>();
        for (EObject eObject : sourceModelContents) {
          if (eObject.eClass().getName() == sourceCLassName) {
            sourceModelElementsThatConform.add(eObject);
          }

        }
        Resource targetResource = getcontributingModel(targetPackagensURI);
        EList<EObject> targetModelContents = targetResource.getContents();
        ArrayList<EObject> targetModelElementsThatConform = new ArrayList<>();
        for (EObject eObject : targetModelContents) {
          if (eObject.eClass().getName() == targetCLassName) {
            targetModelElementsThatConform.add(eObject);
          }

        }

        for (EObject tempSourceElement : sourceModelElementsThatConform) {
          boolean matchFound = false;
          String theSourceAttVal = (String) tempSourceElement
              .eGet(tempSourceElement.eClass().getEStructuralFeature(sourceAtt));

          for (int i = 0; i < targetModelElementsThatConform.size() && !matchFound; i++) {
            EObject tempTargetElement = targetModelElementsThatConform.get(i);
            String tempTargetAttVal = (String) tempSourceElement
                .eGet(tempTargetElement.eClass().getEStructuralFeature(targetAtt));
            if (theSourceAttVal.equalsIgnoreCase(tempTargetAttVal)) {

              matchFound = true;
              Association associationModelLevel = vLinksFactory.createAssociation();
              associationModelLevel.setName(association.getName());

              LinkedElement lSource = vLinksFactory.createLinkedElement();
              lSource.setModelRef(sourcePackagensURI);
              lSource.setElementRef(sourceResource.getURIFragment(tempSourceElement));

              associationModelLevel.setSourceElement(lSource);
              LinkedElement lTarget = vLinksFactory.createLinkedElement();
              lTarget.setModelRef(targetPackagensURI);
              lTarget.setElementRef(targetResource.getURIFragment(tempTargetElement));

              associationModelLevel.getTargetElements().add(lTarget);
              virtualLinksModelLevel.getVirtualLinks().add(associationModelLevel);

              virtualLinksModelLevel.getLinkedElements().add(lSource);
              virtualLinksModelLevel.getLinkedElements().add(lTarget);
            }
          }

        }
      }
    }

    weavingModelResource.save(null);

  }

  protected Resource getcontributingModel(String packageURI) {
    boolean packageFound = false;
    Resource r = null;

    List<Resource> contributingModels = getContributingModels();
    for (int i = 0; i < contributingModels.size() && !packageFound; i++) {
      Resource temp = contributingModels.get(i);
      EClassifier rootClass = temp.getContents().get(0).eClass();
      if (rootClass.getEPackage().getNsURI().compareToIgnoreCase(packageURI) == 0) {
        packageFound = true;
        r = temp;
      }

    }
    return r;
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    List<Resource> contributingModels = getContributingModels();
    for (Resource r : contributingModels) {
      r.save(options);
    }
    vLinkManager.save();
    properties.store(outputStream, null);
  }

  public String getContributingModelsUris() {
    List<Resource> contributingModels = getContributingModels();
    String contributingModelsURIs = "";

    for (int i = 0; i < contributingModels.size(); i++) {
      contributingModelsURIs = contributingModelsURIs
          .concat(contributingModels.get(i).getURI().toString().replace("platform:/resource/", ""));
      if (i < contributingModels.size() - 1) {
        contributingModelsURIs = contributingModelsURIs.concat(",");
      }
    }

    return contributingModelsURIs;
  }

}
