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
package fr.inria.atlanmod.emfviews.ui.common;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class EmfViewsUiUtil {

  public static IExtension getCurrentEditorDelegate() {

    IExtension matchingExtension = null;

    IEditorPart activeEditor =
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

    if (activeEditor != null) {
      IExtension[] extensions = Platform.getExtensionRegistry()
          .getExtensionPoint("fr.inria.atlanmod.emfviews.ui.linkingview.linkend").getExtensions();

      boolean finished = false;

      for (int i = 0; i < extensions.length && !finished; i++) {
        IConfigurationElement[] configElements = extensions[i].getConfigurationElements();
        for (int j = 0; j < configElements.length && !finished; j++) {
          if (configElements[j].getAttribute("editorId")
              .compareToIgnoreCase(activeEditor.getSite().getId()) == 0) {
            matchingExtension = extensions[i];
            finished = true;
          }
        }
      }
    }

    return matchingExtension;
  }

}
