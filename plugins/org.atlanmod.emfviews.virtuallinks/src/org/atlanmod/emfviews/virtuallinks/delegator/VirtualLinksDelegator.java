/*******************************************************************************
 * Copyright (c) 2018--2019 Armines
 * Copyright (c) 2013 INRIA
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   fmdkdd - refactoring and extension
 *   Juan David Villa Calle - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.virtuallinks.delegator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class VirtualLinksDelegator {

  static final String EXTENSION_POINT = "org.atlanmod.emfviews.virtuallinks.delegator";

  static Map<String, IVirtualLinksDelegate> extensionsToDelegate = new HashMap<>();
  static public boolean skipRegistry = false; // used for testing

  public static void register(String fileExtension, IVirtualLinksDelegate delegate) {
    extensionsToDelegate.put(fileExtension, delegate);
  }

  IVirtualLinksDelegate delegate;
  URI matchingModelURI;

  public VirtualLinksDelegator(URI matchingModelURI) {
    this.matchingModelURI = matchingModelURI;
    String extension = matchingModelURI.fileExtension();

    IExtensionRegistry registry = Platform.getExtensionRegistry();

    if (registry == null || skipRegistry) {
      // We are not running in an Eclipse platform, so use the map instead
      delegate = extensionsToDelegate.get(extension);
      if (delegate == null) {
        throw new IllegalStateException(String.format("No registered virtual links delegator for extension %s", extension));
      }
    } else {
      // Find the virtual links delegate that is the default handler for
      // the file extension

      IExtension[] handlers = registry.getExtensionPoint(EXTENSION_POINT).getExtensions();

      // Get all handlers for this file extension.  Default handlers are picked first.
      IConfigurationElement handler = Arrays.stream(handlers)
          .flatMap(h -> Arrays.stream(h.getConfigurationElements()))
          .filter(c -> extension.compareToIgnoreCase(c.getAttribute("fileExtension")) == 0)
          .sorted((a, b) -> Boolean.parseBoolean(a.getAttribute("default")) ? -1 : 1)
          .findFirst()
          .orElseThrow(() -> new IllegalStateException(String.format("No registered virtual links delegator for extension %s", extension)));

      try {
        delegate = (IVirtualLinksDelegate) handler.createExecutableExtension("class");
      } catch (CoreException e) {
        throw new IllegalStateException(String.format("Cannot instantiate virtual links delegator"), e);
      }
    }
  }

  public void init(Map<String, Resource> contributingModels) {
    delegate.init(matchingModelURI, contributingModels);
  }

  public List<EObject> executeMatchRule(String ruleName, EObject param, boolean rightHand) throws Exception {
    return delegate.executeMatchRule(ruleName, param, rightHand);
  }

}
