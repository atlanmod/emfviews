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
package fr.inria.atlanmod.emfviews.virtuallinks.delegator;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class VirtualLinksDelegator {

  IVirtualLinksDelegate virtualLinksDelegate;
  String linksDslFile;

  public VirtualLinksDelegator(String linksDslFile) throws CoreException {

    this.linksDslFile = linksDslFile;
    String dslExtension = linksDslFile.substring(linksDslFile.lastIndexOf('.') + 1);

    IExtension[] extensions = Platform.getExtensionRegistry()
        .getExtensionPoint("fr.inria.atlanmod.emfviews.virtuallinks.delegator").getExtensions();
    boolean finished = false;
    IExtension matchingExtension = null;
    for (int i = 0; i < extensions.length && !finished; i++) {
      IConfigurationElement[] configElements = extensions[i].getConfigurationElements();
      for (int j = 0; j < configElements.length && !finished; j++) {
        if (configElements[j].getAttribute("fileExtension")
            .compareToIgnoreCase(dslExtension) == 0) {
          matchingExtension = extensions[i];
          if (Boolean.parseBoolean(configElements[j].getAttribute("default")) == true)
            finished = true;
        }
      }
    }

    IConfigurationElement[] matchingConfigElements = matchingExtension.getConfigurationElements();
    virtualLinksDelegate =
        (IVirtualLinksDelegate) matchingConfigElements[0].createExecutableExtension("class");
  }

  public void createVirtualMetamodelLinks(URI virtualLinksModelURI) throws CoreException {

    try {
      virtualLinksDelegate.createVirtualMetamodelLinks(linksDslFile, virtualLinksModelURI);
    } catch (Exception e) {

      e.printStackTrace();
    }
  }

  public void createVirtualModelLinks(URI linksModelURI,
                                      List<Resource> contributingModels) throws Exception {

    virtualLinksDelegate.createVirtualModelLinks(linksDslFile, linksModelURI, contributingModels);
  }

}
