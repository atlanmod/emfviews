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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;

public class EView extends View {

  private Resource viewpoint;

  public EView(URI uri) {
    super(uri);
  }

  // FIXME: unused?
  public EView(List<String> contributingModels, String viewpointUri,
               String weavingModelAbsolutePath) throws MalformedURLException, IOException {
    super();
    virtualResourceSet = new ResourceSetImpl();

    viewpointURI = viewpointUri;
    EmfViewsFactory vFac = new EmfViewsFactory();
    org.eclipse.emf.common.util.URI emfURI =
        org.eclipse.emf.common.util.URI.createURI(viewpointUri);

    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    java.net.URI uri = workspace.getRoot().findMember("/" + viewpointUri).getLocationURI();
    viewpoint = vFac.createResource(emfURI);
    viewpoint.load(uri.toURL().openStream(), null);

    String contributingMetamodels = ((Viewpoint) viewpoint).getContributingMetamodelsURIs();
    String[] contributingMMs = contributingMetamodels.split(",");
    ArrayList<String> contributingMMsURIs = new ArrayList<>();
    for (String contributingMM : contributingMMs) {
      contributingMMsURIs.add(contributingMM);
    }

    loadContributingMetamodels(contributingMMsURIs);

    metamodelManager =
        new MetamodelManager(virtualResourceSet.getPackageRegistry().values(), viewpoint, this);

    loadContributingModels(contributingModels);

    IPath filePath = new Path(weavingModelAbsolutePath).removeFileExtension();
    IPath weavingModelPath = filePath.addFileExtension("xmi");

    URI linksURI = URI.createFileURI(weavingModelPath.toString());
    createWeavingModel(linksURI);
    weavingModelPath = weavingModelPath.makeRelative();
    weavingModelURI = weavingModelPath.toString();

    this.vLinkManager = new VirtualLinkManager(weavingModelURI, this);
    vLinkManager.initialize();

    setVirtualContents();
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {

    properties = new Properties();
    properties.load(inputStream);
    virtualResourceSet = new ResourceSetImpl();

    loadViewpoint();
    String matchingModel = ((Viewpoint) viewpoint).getMatchingModel();

    // FIXME: instead of peeking at the raw contributing model URIs, we could
    // just get the contributing packages Viewpoint already collected.
    loadContributingMetamodels(new ArrayList<>(Arrays
        .asList(((Viewpoint) viewpoint).getContributingMetamodelsURIs().split(","))));

    metamodelManager =
        new MetamodelManager(virtualResourceSet.getPackageRegistry().values(), viewpoint, this);

    loadContributingModels(new ArrayList<>(Arrays
        .asList(properties.getProperty("contributingModels").split(","))));

    if (matchingModel != null) {
      // XXX: we could mark the weaving model file as derived
      try {
        VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModel);

        vld.createVirtualModelLinks(URI
            .createPlatformResourceURI(properties.getProperty("weavingModel"), true),
                                    getContributingModels());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    this.vLinkManager = new VirtualLinkManager(properties.getProperty("weavingModel"), this);
    vLinkManager.initialize();

    setVirtualContents();
  }

  private void loadViewpoint() throws FileNotFoundException, IOException {
    String viewpointPath = properties.getProperty("viewpoint");

    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    // FIXME: Why not require the '/' in the properties file?
    java.net.URI viewpointURI =
        workspace.getRoot().findMember("/" + viewpointPath).getLocationURI();

    EmfViewsFactory vFac = new EmfViewsFactory();
    URI emfURI = URI.createURI(viewpointPath);

    viewpoint = vFac.createResource(emfURI);
    viewpoint.load(viewpointURI.toURL().openStream(), null);
  }

  // FIXME: unused?
  @Override
  public void createWeavingModel(URI modelURI) throws IOException {
    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks virtualLinksModelLevel = vLinksFactory.createVirtualLinks();

    weavingModelResource = new XMIResourceImpl();

    weavingModelResource.setURI(modelURI);
    weavingModelResource.getContents().add(virtualLinksModelLevel);

    Viewpoint vm = (Viewpoint) viewpoint;
    XMIResourceImpl weavingForMetamodelResource = vm.getWeavingModelResource();

    List<Association> associations = new ArrayList<>();

    VirtualLinks virtualLinks = (VirtualLinks) weavingForMetamodelResource.getContents().get(0);
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
        TreeIterator<EObject> sourceModelContents = sourceResource.getAllContents();

        ArrayList<EObject> sourceModelElementsThatConform = new ArrayList<>();
        while (sourceModelContents.hasNext()) {
          EObject eObject = sourceModelContents.next();
          if (eObject.eClass().getName().compareToIgnoreCase(sourceCLassName) == 0) {
            sourceModelElementsThatConform.add(eObject);
          }

        }

        Resource targetResource = getcontributingModel(targetPackagensURI);
        TreeIterator<EObject> targetModelContents = targetResource.getAllContents();
        ArrayList<EObject> targetModelElementsThatConform = new ArrayList<>();
        while (targetModelContents.hasNext()) {
          EObject eObject = targetModelContents.next();
          if (eObject.eClass().getName().compareToIgnoreCase(targetCLassName) == 0) {
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
            if (theSourceAttVal.compareToIgnoreCase(tempTargetAttVal) == 0) {
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

  // FIXME: unused?
  @Override
  public void serialize(IFile file) throws IOException, CoreException {
    StringBuffer fileContent = new StringBuffer();
    String contributingModelsLine = "contributingModels=" + getContributingModelsUris();
    fileContent.append(contributingModelsLine);
    fileContent.append("\n");

    String viewpointLine = "viewpoint=" + viewpointURI;
    fileContent.append(viewpointLine);
    fileContent.append("\n");

    String weavingModelLine = "weavingModel=" + weavingModelURI;

    fileContent.append(weavingModelLine);

    fileContent.append("\n");
    Viewpoint vm = (Viewpoint) viewpoint;
    String matchingModelLine = "matchingModel=" + vm.getMatchingModel();
    fileContent.append(matchingModelLine);

    InputStream stream = openContentStream(fileContent.toString());
    if (file.exists()) {
      file.setContents(stream, true, true, null);
    } else {
      file.create(stream, true, null);
    }
    stream.close();

  }

}
