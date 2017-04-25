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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class EmfViewsFactory extends ResourceFactoryImpl {

  @Override
  public Resource createResource(URI uri) {
    if (uri.toString().endsWith(".eview")) {
      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      java.net.URI uriInworkspace = workspace.getRoot()
          .findMember(uri.toPlatformString(true)).getLocationURI();

      Properties properties = new Properties();
      InputStream inStream;
      try {
        inStream = uriInworkspace.toURL().openStream();
        properties.load(inStream);
        inStream.close();

        return new EView(uri);

      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }

    } else if (uri.toString().endsWith(".eviewtype")) {
      return new Viewtype(uri);
    }

    else
      return null;

  }

  public Resource createEView(List<String> contributingModels,
                              String compositionMetamodel,
                              String correspondenceModelAbsolutePath)
      throws MalformedURLException, IOException {
    return new EView(contributingModels, compositionMetamodel,
        correspondenceModelAbsolutePath);
  }

  public Resource createViewtype(List<String> contributingMetamodels,
                                 String filtersMMUri)
      throws FileNotFoundException, IOException {
    return new Viewtype(contributingMetamodels, filtersMMUri);
  }

}
