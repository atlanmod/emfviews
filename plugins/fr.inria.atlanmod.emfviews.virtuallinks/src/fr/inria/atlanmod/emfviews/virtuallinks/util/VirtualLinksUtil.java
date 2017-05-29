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
package fr.inria.atlanmod.emfviews.virtuallinks.util;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;

public class VirtualLinksUtil {

  public static URI toURI(String resourcePath) throws URISyntaxException {
    IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

    IResource resource = workspaceRoot
        .findMember((resourcePath.startsWith("/") ? resourcePath : "/" + resourcePath));

    URI resourceUri =
        (resource != null ? resource.getLocationURI() : new java.net.URI(resourcePath));

    return resourceUri;
  }

  public static VirtualLinks createLinksModel() {
    return VirtualLinksFactory.eINSTANCE.createVirtualLinks();
  }

  public static void persistLinksModel(VirtualLinks linksModel,
                                       org.eclipse.emf.common.util.URI theUri) throws IOException {
    XMIResourceImpl linksModelResource = new XMIResourceImpl();
    linksModelResource.setURI(theUri);
    linksModelResource.getContents().add(linksModel);
    linksModelResource.save(null);

  }

  public static Filter createFilter(String name, String oclQuery, boolean filterOnlyFeatures) {
    Filter filter = VirtualLinksFactory.eINSTANCE.createFilter();
    filter.setName(name);
    filter.setOclQuery(oclQuery);
    filter.setFilterOnlyEstructuralFeatures(filterOnlyFeatures);

    return filter;
  }

  public static LinkedElement createLinkedElement(String name, String modelRef, String elementRef,
                                                  String features) {
    LinkedElement linkedElement = VirtualLinksFactory.eINSTANCE.createLinkedElement();
    linkedElement.setName(name);
    linkedElement.setModelRef(modelRef);
    linkedElement.setElementRef(elementRef);
    if (features != null)
      linkedElement.setEstructuralFeatures(features);

    return linkedElement;
  }

  public static void associateFilters(VirtualLinks virtualLinks, Filter filter,
                                      LinkedElement linkedElement) {
    filter.setFilteredElement(linkedElement);
    virtualLinks.getVirtualLinks().add(filter);
    virtualLinks.getLinkedElements().add(linkedElement);
  }

}
