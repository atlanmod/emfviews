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
import java.util.HashMap;
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

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

public abstract class View extends ResourceImpl {
  protected Properties properties;

  protected ResourceSet virtualResourceSet;

  protected String contributingModelsURIs;

  protected String compositionMetamodelURI;

  protected String contributingMetamodelsURIs;

  protected String correspondenceModelURI;

  protected XMIResourceImpl correspondenceModelResource;

  /**
   * The contents of the virtual model
   */
  protected EList<EObject> virtualContents;

  public List<Resource> getContributingModels() {
    ArrayList<Resource> contributingModels = new ArrayList<>();
    EList<Resource> allResources = virtualResourceSet.getResources();
    for (Resource resource : allResources) {
      if (resource.getURI().toString().startsWith("platform")
          && !resource.getURI().toString().endsWith("ecore")) {
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

  public View(List<URI> contributingModels, List<URI> contributingMetamodels,
      URI linksModel, URI compositionMetamodel) {
    super();

  }

  public View(List<String> contributingModels,
      List<String> contributingMetamodels, String compositionMetamodel) {
    super();
  }

  protected void loadContributingModels(List<String> contributingModelsPaths) {

    for (String modelURI : contributingModelsPaths) {
      Resource modelResource = virtualResourceSet
          .getResource(URI.createPlatformResourceURI(modelURI, true), true);
    }

  }

  protected void loadContributingMetamodels(List<String> contributingmetaModelsPaths) {

    for (String metamodelURI : contributingmetaModelsPaths) {
      if (metamodelURI.startsWith("http")) {
        virtualResourceSet.getPackageRegistry().put(metamodelURI,
            EPackage.Registry.INSTANCE.getEPackage(metamodelURI));

      } else if (metamodelURI.endsWith("ecore")) {
        Resource metamodelResource = virtualResourceSet.getResource(
            URI.createPlatformResourceURI(metamodelURI, true), true);
        EList<EObject> contents = metamodelResource.getContents();
        EPackage thePack = (EPackage) contents.iterator().next();
        virtualResourceSet.getPackageRegistry().put(thePack.getNsURI(),
            thePack);

      }
    }

  }

  protected void setVirtualContents() {

    List<Resource> contributingModels = getContributingModels();

    List[] sublists = new List[contributingModels.size()];

    for (int i = 0; i < contributingModels.size(); i++) {

      ArrayList oneOftheSublists = new ArrayList<>();
      oneOftheSublists.add(translateToVirtualElement(
          contributingModels.get(i).getContents().get(0)));
      sublists[i] = oneOftheSublists;
    }

    this.virtualContents = new VirtualContents<EObject>(this, sublists);
  }

  public EObject translateToVirtualElement(EObject e) {
    if (e == null) {
      return null;
    } else {
      return vLinkManager.getVirtualElement(e);
    }
  }

  public void serialize(IFile file) throws IOException, CoreException {
    StringBuffer fileContent = new StringBuffer();
    String contributingModelsLine = "contributingModels="
        + contributingModelsURIs;
    fileContent.append(contributingModelsLine);
    fileContent.append("\n");

    String compositionMetamodelLine = "compositionMetamodel="
        + compositionMetamodelURI;
    fileContent.append(compositionMetamodelLine);
    fileContent.append("\n");

    String contributingMetamodelsLine = "contributingMetamodels="
        + contributingMetamodelsURIs;
    fileContent.append(contributingMetamodelsLine);
    fileContent.append("\n");

    String correspondenceModelLine = "correspondenceModel="
        + correspondenceModelURI;

    fileContent.append(correspondenceModelLine);

    String correspondenceModelBaseLine = "correspondenceModelBase="
        + correspondenceModelURI;
    fileContent.append(correspondenceModelBaseLine);

    InputStream stream = openContentStream(fileContent.toString());
    if (file.exists()) {
      file.setContents(stream, true, true, null);
    } else {
      file.create(stream, true, null);
    }
    stream.close();

  }

  public InputStream openContentStream(String contents) {
    return new ByteArrayInputStream(contents.getBytes());
  }

  public void createCorrespondenceModel(URI modelURI) throws IOException {

    correspondenceModelURI = modelURI.toString();

    VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks virtualLinksModelLevel = vLinksFactory.createVirtualLinks();

    correspondenceModelResource = new XMIResourceImpl();

    correspondenceModelResource.setURI(modelURI);
    correspondenceModelResource.getContents().add(virtualLinksModelLevel);

    XMIResourceImpl correspondenceBetweenMetaModelResource = new XMIResourceImpl();

    IWorkspace workspace = ResourcesPlugin.getWorkspace();

    java.net.URI uri = workspace.getRoot()
        .findMember("/" + correspondenceModelURI).getLocationURI();
    correspondenceModelResource.load(uri.toURL().openStream(),
        new HashMap<Object, Object>());

    correspondenceModelResource
        .setURI(org.eclipse.emf.common.util.URI.createURI(uri.toString()));

    List<Association> associations = new ArrayList<Association>();

    VirtualLinks virtualLinks = (VirtualLinks) correspondenceModelResource
        .getContents().get(0);
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
          String theSourceAttVal = (String) tempSourceElement.eGet(
              tempSourceElement.eClass().getEStructuralFeature(sourceAtt));

          for (int i = 0; i < targetModelElementsThatConform.size()
              && !matchFound; i++) {
            EObject tempTargetElement = targetModelElementsThatConform.get(i);
            String tempTargetAttVal = (String) tempSourceElement.eGet(
                tempTargetElement.eClass().getEStructuralFeature(targetAtt));
            if (theSourceAttVal.equalsIgnoreCase(tempTargetAttVal)) {

              matchFound = true;
              Association associationModelLevel = vLinksFactory
                  .createAssociation();
              associationModelLevel.setName(association.getName());

              LinkedElement lSource = vLinksFactory.createLinkedElement();
              lSource.setModelRef(sourcePackagensURI);
              lSource.setElementRef(
                  sourceResource.getURIFragment(tempSourceElement));

              associationModelLevel.setSourceElement(lSource);
              LinkedElement lTarget = vLinksFactory.createLinkedElement();
              lTarget.setModelRef(targetPackagensURI);
              lTarget.setElementRef(
                  targetResource.getURIFragment(tempTargetElement));

              associationModelLevel.getTargetElements().add(lTarget);
              virtualLinksModelLevel.getVirtualLinks()
                  .add(associationModelLevel);

              virtualLinksModelLevel.getLinkedElements().add(lSource);
              virtualLinksModelLevel.getLinkedElements().add(lTarget);
            }
          }

        }
      }
    }

    correspondenceModelResource.save(null);

  }

  protected Resource getcontributingModel(String packageURI) {
    boolean packageFound = false;
    Resource r = null;

    List<Resource> contributingModels = getContributingModels();
    for (int i = 0; i < contributingModels.size() && !packageFound; i++) {
      Resource temp = contributingModels.get(i);
      EClassifier rootClass = (EClassifier) temp.getContents().get(0).eClass();
      if (rootClass.getEPackage().getNsURI()
          .compareToIgnoreCase(packageURI) == 0) {
        packageFound = true;
        r = temp;
      }

    }
    return r;
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options)
      throws IOException {
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
      contributingModelsURIs = contributingModelsURIs.concat(contributingModels
          .get(i).getURI().toString().replace("platform:/resource/", ""));
      if (i < contributingModels.size() - 1) {
        contributingModelsURIs = contributingModelsURIs.concat(",");
      }
    }

    return contributingModelsURIs;
  }

}
