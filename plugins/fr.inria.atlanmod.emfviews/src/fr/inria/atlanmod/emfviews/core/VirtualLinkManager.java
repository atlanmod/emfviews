/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cau� Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;
import fr.inria.atlanmod.emfviews.elements.VirtualElement;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

public class VirtualLinkManager {

  private View virtualModel;

  private WeavingModel weavingModel;

  private Map<EObject, VirtualElement> virtualLinks = new HashMap<>();

  public VirtualLinkManager(String weavingModelURI, View vModel) throws MalformedURLException,
                                                                 IOException {
    this.virtualModel = vModel;

    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;

    Resource weavingModelResource =
        new ResourceSetImpl().getResource(URI.createURI(weavingModelURI), true);
    weavingModelResource.load(null);

    WeavingModel virtualLinks = (WeavingModel) weavingModelResource.getContents().get(0);

    this.weavingModel = virtualLinks;
  }

  public void initialize() {
    LinksProjector projector = new LinksProjector(virtualModel);
    projector.load(weavingModel);
  }

  public void setVirtualLink(EObject concreteElement, VirtualElement virtualElement) {
    virtualLinks.put(concreteElement, virtualElement);
  }

  public Map<EObject, VirtualElement> getVirtualLinks() {
    return virtualLinks;
  }

  public boolean isVirtuallyLinked(EObject concreteElement) {
    return virtualLinks.containsKey(concreteElement);
  }

  public EObject getVirtualElement(EObject e) {
    VirtualElement vElem = virtualLinks.get(e);
    if (vElem == null) {
      vElem = new ReproduceElementImpl(virtualModel, e);
      virtualLinks.put(e, vElem);
    }
    return vElem;
  }

  public void save() {
    LinksProjector projector = new LinksProjector(virtualModel);
    projector.save(weavingModel);
  }

}
