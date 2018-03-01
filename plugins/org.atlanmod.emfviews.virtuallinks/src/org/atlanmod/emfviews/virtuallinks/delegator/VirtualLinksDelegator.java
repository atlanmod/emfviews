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
package org.atlanmod.emfviews.virtuallinks.delegator;

import java.util.List;

import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class VirtualLinksDelegator {

  IVirtualLinksDelegate virtualLinksDelegate;
  URI linksDslFile;

  public VirtualLinksDelegator(URI linksDslFile) {

    this.linksDslFile = linksDslFile;
    String dslExtension = linksDslFile.fileExtension();
    // FIXME: hardcoding the extension point ID seems brittle
    IExtension[] extensions = Platform.getExtensionRegistry()
        .getExtensionPoint("org.atlanmod.emfviews.virtuallinks.delegator").getExtensions();
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
    // FIXME: what if there is no matching extension?
    IConfigurationElement[] matchingConfigElements = matchingExtension.getConfigurationElements();
    try {
      virtualLinksDelegate =
          (IVirtualLinksDelegate) matchingConfigElements[0].createExecutableExtension("class");
    } catch (CoreException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public WeavingModel createWeavingModel(List<Resource> contributingModels) throws Exception {
    return delegate.createWeavingModel(matchingModelURI, contributingModels);
  }

}
