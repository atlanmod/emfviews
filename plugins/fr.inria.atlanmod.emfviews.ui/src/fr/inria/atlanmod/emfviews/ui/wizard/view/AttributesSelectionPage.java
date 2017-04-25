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
package fr.inria.atlanmod.emfviews.ui.wizard.view;

import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import fr.inria.atlanmod.emfviews.ui.Messages;

public class AttributesSelectionPage extends WizardPage {

  ArrayList<String> inputMetamodels;

  String contributingMetamodels;

  ResourceSet virtualResourceSet;

  CheckboxTreeViewer checkboxTreeViewer;

  public AttributesSelectionPage() {
    super("AttributeSelectionPage");
    setTitle("Excluded features");
    setDescription("Select which features to hide on the view");

  }

  public void setTreeContents() {
    CreateViewtypeScreen page = (CreateViewtypeScreen) getWizard()
        .getPage(Messages.getString("VirtualMetamodelFileScreen.Page.Name"));
    inputMetamodels = page.getInputMetaModelPaths();
    String nsURISs = "";

    for (String nsURI : inputMetamodels) {
      if (nsURI.startsWith("platform:/resource/")) {
        nsURI = nsURI.replace("platform:/resource/", "");
      }
      if (nsURISs.length() > 0) {
        nsURISs += "," + nsURI.toString();
      } else {
        nsURISs = nsURI.toString();
      }

    }

    contributingMetamodels = nsURISs;

    loadContributingMetamodels(contributingMetamodels);
    checkboxTreeViewer
        .setInput(virtualResourceSet.getPackageRegistry().values());
  }

  @Override
  public void createControl(Composite parent) {

    Composite container = new Composite(parent, SWT.NULL);
    setControl(container);

    checkboxTreeViewer = new CheckboxTreeViewer(container, SWT.BORDER);
    Tree tree = checkboxTreeViewer.getTree();
    tree.setBounds(0, 0, 574, 282);

    AttributeSelectionContentProvider adapterContentProvider = new AttributeSelectionContentProvider();
    checkboxTreeViewer.setContentProvider(adapterContentProvider);
    checkboxTreeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
        new ReflectiveItemProviderAdapterFactory()));

  }

  public Object[] getCheckedElements() {
    return checkboxTreeViewer.getCheckedElements();
  }

  private void loadContributingMetamodels(String contributingModelsURIs) {
    virtualResourceSet = new ResourceSetImpl();
    String modelsURIs[] = contributingModelsURIs.split(",");
    for (int i = 0; i < modelsURIs.length; i++) {
      String modelURI = modelsURIs[i];
      if (modelURI.startsWith("http")) {
        EPackage contributingEcoreModelPackage = EPackage.Registry.INSTANCE
            .getEPackage(modelURI);
        virtualResourceSet.getPackageRegistry().put(
            contributingEcoreModelPackage.getNsURI(),
            contributingEcoreModelPackage);

      } else if (modelURI.endsWith("ecore")) {
        Resource metamodelResource = virtualResourceSet
            .getResource(URI.createPlatformResourceURI(modelURI, true), true);
        EPackage mmPackage = (EPackage) metamodelResource.getContents().get(0);
        virtualResourceSet.getPackageRegistry().put(mmPackage.getNsURI(),
            mmPackage);
      }
    }

  }

}
