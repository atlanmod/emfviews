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

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;
import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ModelSelection;

public class CreateViewtypeScreen extends WizardPage {
  private ArrayList<String> inputMetaModelPaths;

  private List inputMetamodelsList;

  /**
   * The dsl used to create the links
   */
  private Combo comboLinksDsl;

  public String[] availableLinksDsls;

  public CreateViewtypeScreen(ISelection selection) {
    super(Messages.getString("VirtualMetamodelFileScreen.Page.Name"));

    IExtension[] extensions = Platform.getExtensionRegistry()
        .getExtensionPoint("fr.inria.atlanmod.emfviews.virtuallinksdelegator.type").getExtensions();
    availableLinksDsls = new String[extensions.length];
    int i = 0;
    for (IExtension iExtension : extensions) {
      IConfigurationElement[] configElements = iExtension.getConfigurationElements();
      for (IConfigurationElement iConfigurationElement : configElements) {
        availableLinksDsls[i] = iConfigurationElement.getAttribute("fileExtension");
        i = i++;
      }
    }

    setTitle(Messages.getString("VirtualMetamodelFileScreen.Title")); //$NON-NLS-1$
    setDescription(Messages.getString("VirtualMetamodelFileScreen.Page.Description")); //$NON-NLS-1$
    setImageDescriptor(EmfViewsUIPlugin.getImageDescriptor("VirtualModelWizard.png")); //$NON-NLS-1$

    this.setPageComplete(false);
    inputMetaModelPaths = new ArrayList<>();
  }

  public String getdslForLinks() {
    return comboLinksDsl.getText();
  }

  private void addSeparator(Composite container) {
    Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
    GridData data = new GridData(GridData.FILL_HORIZONTAL);
    data.horizontalSpan = 3;
    data.verticalIndent = 5;
    separator.setLayoutData(data);
  }

  private void addBlank(Composite container) {
    Composite blank = new Composite(container, SWT.NULL);
    blank.setLayout(new GridLayout());
  }

  @Override
  public void createControl(Composite parent) {

    final Composite container = new Composite(parent, SWT.NULL);
    initializeDialogUnits(container);
    GridData data = new GridData(GridData.FILL_BOTH);
    container.setLayoutData(data);
    GridLayout layout = new GridLayout(3, false);
    container.setLayout(layout);

    GridData dataLists = new GridData(GridData.FILL_BOTH | GridData.VERTICAL_ALIGN_BEGINNING);

    inputMetamodelsList =
        createModelControl(container, Messages.getString("VirtualModelFileScreen.InputMetamodels"), //$NON-NLS-1$
                           new ModelSelection(container.getShell(), Messages
                               .getString("VirtualModelFileScreen.InputMetamodelCreation"), //$NON-NLS-1$
                                              inputMetaModelPaths, ModelSelection.INPUTMETAMODEL),
                           dataLists); // 2$

    container.layout();
    setControl(container);

    addBlank(container);

    addSeparator(container);

    new Label(container, SWT.NULL).setText("Select a dsl to create virtual links"); //$NON-NLS-1$
    comboLinksDsl = new Combo(container, SWT.BORDER | SWT.READ_ONLY);
    comboLinksDsl.setItems(availableLinksDsls);
    comboLinksDsl.setText(availableLinksDsls[0]);
    data = new GridData(GridData.FILL_HORIZONTAL | GridData.BEGINNING);
    comboLinksDsl.setLayoutData(data);

  }

  private List createModelControl(final Composite parent, final String entryLabel,
                                  final AbstractSelection dialog, GridData listLayoutData) {

    final Label typeLabel = new Label(parent, SWT.NONE);
    GridData data = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
    data.verticalIndent = 5;
    typeLabel.setLayoutData(data);
    typeLabel.setText(entryLabel);

    final List list = new List(parent, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI);
    listLayoutData.verticalIndent = 5;
    list.setLayoutData(listLayoutData);

    Composite composite = new Composite(parent, SWT.NONE);
    GridLayout layout = new GridLayout();
    layout.verticalSpacing = 15;
    layout.marginHeight = 0;
    layout.marginWidth = 0;
    composite.setLayout(layout);
    data = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
    data.verticalIndent = 5;
    composite.setLayoutData(data);

    final Button addIn = createButton(composite, Messages.getString("VirtualModelFileScreen.Add")); //$NON-NLS-1$
    final Button removeIn =
        createButton(composite, Messages.getString("VirtualModelFileScreen.Remove")); //$NON-NLS-1$
    removeIn.setEnabled(false);
    addIn.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent evt) {
        dialog.create();
        if (dialog.open() == Window.OK) {
          Object[] result = dialog.getResult();
          int modelType = Integer.parseInt(result[0].toString());
          switch (modelType) {

          case ModelSelection.INPUTMETAMODEL:
            inputMetaModelPaths.add(result[1].toString());
            break;

          default:
            break;
          }

        }
        removeIn.setEnabled(true);
        updateLists();
      }
    });

    removeIn.addSelectionListener(new SelectionAdapter() {
      /**
       * {@inheritDoc}
       *
       * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
       */
      @Override
      public void widgetSelected(SelectionEvent evt) {
        int[] indices = list.getSelectionIndices();
        if (indices.length > 0) {
          for (int i = 0; i < indices.length; i++) {

            inputMetaModelPaths.remove(list.getItem(i));

          }
          updateLists();
          // removeIn.setEnabled(list.getSelection().length > 0);
          removeIn.setEnabled(inputMetamodelsList.getItemCount() > 0);
        }

      }
    });

    return list;
  }

  private void updateLists() {
    inputMetamodelsList.removeAll();
    for (String path : inputMetaModelPaths) {
      inputMetamodelsList.add(path);
    }

    checkValid();

  }

  private void checkValid() {

    setPageComplete(checkModelsConsistancy());
  }

  private boolean checkModelsConsistancy() {

    if (inputMetaModelPaths.isEmpty()) {
      setErrorMessage(Messages.getString("VirtualModelFileWizard.INPUT_METAMODELS_ISSUE")); //$NON-NLS-1$
      return false;

    }
    setErrorMessage(null);
    return true;

  }

  private Button createButton(Composite parent, String text) {
    Button button = new Button(parent, SWT.PUSH);
    button.setAlignment(SWT.CENTER);
    button.setText(text);
    button.setFont(parent.getFont());
    GridData data = new GridData();
    data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.BUTTON_WIDTH);
    button.setLayoutData(data);
    return button;
  }

  public ArrayList<String> getInputMetaModelPaths() {
    return inputMetaModelPaths;
  }

  @Override
  public IWizardPage getNextPage() {
    if (isPageComplete()) {
      AttributesSelectionPage asp =
          (AttributesSelectionPage) getWizard().getPage("AttributeSelectionPage");
      asp.setTreeContents();
    }
    return super.getNextPage();
  }

}
