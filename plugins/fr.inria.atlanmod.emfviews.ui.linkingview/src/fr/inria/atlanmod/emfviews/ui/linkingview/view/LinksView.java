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
package fr.inria.atlanmod.emfviews.ui.linkingview.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.EmfViewsFactory;
import fr.inria.atlanmod.emfviews.ui.linkingview.Activator;
import fr.inria.atlanmod.emfviews.ui.linkingview.action.AddLinkAction;
import fr.inria.atlanmod.emfviews.ui.linkingview.action.SelectViewAction;

public class LinksView extends ViewPart {

  public static final String SELECTVIEW_ACTION_ICON = "icons/selectview.png";

  public static final String ADDLINK_ACTION_ICON = "icons/add.png";

  private EView currentView;

  private TreeViewer linkedElementsViewer;

  private Composite parent;

  public EView getCurrentView() {
    return currentView;
  }

  @Override
  public void createPartControl(Composite parent) {

    this.parent = parent;
    linkedElementsViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    linkedElementsViewer
        .setLabelProvider(new AdapterFactoryLabelProvider(new ReflectiveItemProviderAdapterFactory()));
    linkedElementsViewer.setContentProvider(new LinksViewContentProvider());

    Action selectViewAction = new SelectViewAction(this, parent);

    Action addLinkAction = new AddLinkAction(this, parent);

    IActionBars bars = getViewSite().getActionBars();

    selectViewAction.setText("Select view");
    selectViewAction.setToolTipText("Select view");
    selectViewAction.setImageDescriptor(Activator.getImage(SELECTVIEW_ACTION_ICON));
    bars.getMenuManager().add(selectViewAction);
    bars.getToolBarManager().add(selectViewAction);

    addLinkAction.setText("Create link");
    addLinkAction.setToolTipText("Create link");
    addLinkAction.setImageDescriptor(Activator.getImage(ADDLINK_ACTION_ICON));
    bars.getMenuManager().add(addLinkAction);
    bars.getToolBarManager().add(addLinkAction);

  }

  @Override
  public void setFocus() {

  }

  public boolean viewSelected() {
    return currentView != null;
  }

  public void loadView(String viewPath) {
    EmfViewsFactory factory = new EmfViewsFactory();
    URI viewURI = URI.createURI(viewPath, true);
    currentView = (EView) factory.createResource(viewURI);

    try {
      ExtensibleURIConverterImpl eui = new ExtensibleURIConverterImpl();
      InputStream is = eui.createInputStream(viewURI);
      currentView.load(is, new HashMap<>());
      linkedElementsViewer.setInput(currentView.getVirtualLinkManager().getVirtualLinks());
      ((LinksViewContentProvider) (linkedElementsViewer.getContentProvider()))
          .setLinkedModels(currentView.getContributingModels());
      MessageDialog.openInformation(parent.getShell(), "View selected", "View selected");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
