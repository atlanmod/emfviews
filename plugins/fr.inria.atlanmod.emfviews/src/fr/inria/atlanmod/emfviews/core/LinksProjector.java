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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

public class LinksProjector {

  private View virtualModel;

  public LinksProjector(View vModel) {

    this.virtualModel = vModel;

  }

  public void load(WeavingModel virtualLinks) {

    List<NewAssociation> associations = new ArrayList<>();
    EList<VirtualLink> links = virtualLinks.getVirtualLinks();
    for (VirtualLink link : links) {
      if (link instanceof NewAssociation) {
        associations.add((NewAssociation) link);
      }
    }
    loadAssociations(associations);

  }

  private void loadAssociations(List<NewAssociation> associations) {

    for (NewAssociation association : associations) {
      // TODO: Handle VirtualElement variants

      EObject sourceElement = getReferencedObject((ConcreteElement) association.getSource());
      EObject targetElement = getReferencedObject((ConcreteElement) association.getTarget());

      ReproduceElementImpl vElement = (ReproduceElementImpl) virtualModel.getVirtualLinkManager()
          .getVirtualElement(sourceElement);

      String virtualFeatureName = association.getName();
      EStructuralFeature virtualFeature =
          virtualModel.getMetamodelManager().getVirtualAssociation(vElement, virtualFeatureName);

      vElement.setVirtualAssociation(virtualFeature, EStore.NO_INDEX, targetElement);
    }
  }

  private EObject getReferencedObject(ConcreteElement elem) {
    // FIXME: Associations use Resource.getEObject to find the element, but
    // Filters use EMFViewsUtil.findElement

    Resource model = virtualModel.getContributingModel(elem.getModel().getURI());

    // FIXME: what if null? Can happen when elementRef is a bad URIFragment or
    // object ID. Shouldn't happen if we trust ECL to generate these
    // correctly, but the XMI can also be created manually.
    return model.getEObject(elem.getPath());
  }

  public void save(WeavingModel weavingModel) {
    // FIXME: shouldn't we do something here?
  }

}
