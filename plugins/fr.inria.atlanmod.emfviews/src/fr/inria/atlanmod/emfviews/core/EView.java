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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.atlanmod.emfviews.virtuallinks.delegator.VirtualLinksDelegator;

public class EView extends View {

  private Resource viewpoint;

  public EView(URI uri) {
    super(uri);
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

    if (matchingModel != null && !matchingModel.isEmpty()) {
      // XXX: we could mark the weaving model file as derived
      try {
        VirtualLinksDelegator vld = new VirtualLinksDelegator(matchingModel);

        vld.createVirtualModelLinks(URI.createURI(properties.getProperty("weavingModel"), true),
                                    getContributingModels());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    this.vLinkManager = new VirtualLinkManager(properties.getProperty("weavingModel"), this);
    vLinkManager.initialize();

    setVirtualContents();
  }

  private void loadViewpoint() throws IOException {
    viewpoint = new Viewpoint(URI.createURI(properties.getProperty("viewpoint")));
    viewpoint.load(null);
  }

}
