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
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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

  protected void loadContributingModels(List<String> contributingModelsPaths) {
    for (String modelURI : contributingModelsPaths) {
      Resource r = virtualResourceSet.getResource(URI.createURI(modelURI, true), true);
      if (r != null) {
        virtualResourceSet.getResources().add(r);
      } else {
        // XXX: maybe signal an error here?
      }
    }
  }

  protected void loadContributingMetamodels(List<String> contributingmetaModelsPaths) {
    for (String metamodelURI : contributingmetaModelsPaths) {
      EPackage p = EMFViewsUtil.getEPackageFromPath(metamodelURI)
          .orElseThrow(() -> new ViewOperationException("Cannot load contributing metamodel "
              + metamodelURI));
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

  protected Resource getContributingModel(String packageURI) {
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
