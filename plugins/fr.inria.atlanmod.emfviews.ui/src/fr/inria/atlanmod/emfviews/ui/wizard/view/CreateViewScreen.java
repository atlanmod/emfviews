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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;
import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ModelSelection;

public class CreateViewScreen extends WizardPage {

  public static final String VIRTUALMODELTYPE_MODEL = "model"; //$NON-NLS-1$

  public static final String VIRTUALMODELTYPE_METAMODEL = "metamodel"; //$NON-NLS-1$

  private ArrayList<String> inputModelPaths;

  public ArrayList<String> getInputModelPaths() {
    return inputModelPaths;
  }

  public ArrayList<String> getCompositionMetaModelPath() {
    return compositionMetaModelPath;
  }

  public ArrayList<String> getLinksModelPath() {
    return linksModelPath;
  }

  private ArrayList<String> compositionMetaModelPath;

  private ArrayList<String> linksModelPath;

  /**
   * The contributing models (Pero es la lista donde se muestran al usuario las
   * uris de los modelos)
   */
  private List inputmodelsList;

  private List compositionMetaModelList;

  public CreateViewScreen(String virtualCompositionMetamodel) {

    super(Messages.getString("VirtualModelFileScreen.Page.Name"));
    setTitle(Messages.getString("VirtualModelFileScreen.Title")); //$NON-NLS-1$
    setDescription(Messages.getString("VirtualModelFileScreen.Page.Description")); //$NON-NLS-1$
    setImageDescriptor(EmfViewsUIPlugin.getImageDescriptor("VirtualModelWizard.png")); //$NON-NLS-1$

    this.setPageComplete(false);
    inputModelPaths = new ArrayList<>();
    compositionMetaModelPath = new ArrayList<>();
    compositionMetaModelPath.add(virtualCompositionMetamodel);
    linksModelPath = new ArrayList<>();
  }

  private void addBlank(Composite container) {
    Composite blank = new Composite(container, SWT.NULL);
    blank.setLayout(new GridLayout());
  }

  private void addSeparator(Composite container) {
    Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
    GridData data = new GridData(GridData.FILL_HORIZONTAL);
    data.horizontalSpan = 3;
    data.verticalIndent = 5;
    separator.setLayoutData(data);
  }

  @Override
  public void createControl(Composite parent) {
    final Composite container = new Composite(parent, SWT.NULL);
    initializeDialogUnits(container);
    GridData data = new GridData(GridData.FILL_BOTH);
    container.setLayoutData(data);
    GridLayout layout = new GridLayout(3, false);

    container.setLayout(layout);

    addBlank(container);

    addSeparator(container);

    GridData dataLists = new GridData(GridData.FILL_BOTH | GridData.VERTICAL_ALIGN_BEGINNING);

    compositionMetaModelList =
        createModelControl(container,
                           Messages.getString("VirtualModelFileScreen.CompositionMetamodel"), //$NON-NLS-1$
                           new ModelSelection(container.getShell(), Messages
                               .getString("VirtualModelFileScreen.CompositionMetamodelCreation"), //$NON-NLS-1$
                                              compositionMetaModelPath,
                                              ModelSelection.COMPOSITIONMETAMODEL),
                           dataLists); // $NON-NLS-2$
    inputmodelsList =
        createModelControl(container, Messages.getString("VirtualModelFileScreen.InputModels"), //$NON-NLS-1$
                           new ModelSelection(container.getShell(), Messages
                               .getString("VirtualModelFileScreen.InputModelCreation"), //$NON-NLS-1$
                                              inputModelPaths, ModelSelection.INPUTMODEL),
                           dataLists); // $NON-NLS-2$

    updateLists();

    container.layout();
    setControl(container);
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
          case ModelSelection.INPUTMODEL:
            inputModelPaths.add(result[1].toString());
            break;
          case ModelSelection.COMPOSITIONMETAMODEL:
            compositionMetaModelPath.add(result[1].toString());
            break;
          case ModelSelection.LINKSMODEL:
            linksModelPath.add(result[1].toString());
            break;

          default:
            break;
          }

        }
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
        for (int i = 0; i < indices.length; i++) {
          // int j = indices[i];

        }
        updateLists();
        removeIn.setEnabled(list.getSelection().length > 0);
      }
    });

    return list;
  }

  private void updateLists() {

    inputmodelsList.removeAll();
    compositionMetaModelList.removeAll();
    for (String path : inputModelPaths) {
      inputmodelsList.add(path);
    }
    for (String path : compositionMetaModelPath) {
      compositionMetaModelList.add(path);
    }
    checkValid();

  }

  private void checkValid() {
    setPageComplete(checkModelsConsistancy());
  }

  private boolean checkModelsConsistancy() {

    if (inputModelPaths.isEmpty()) {
      setErrorMessage(Messages.getString("VirtualModelFileWizard.INPUT_MODELS_ISSUE")); //$NON-NLS-1$
      return false;
    }

    if (compositionMetaModelPath.isEmpty()) {

      setErrorMessage(Messages
          .getString("VirtualModelFileWizard.INPUT_COMPOSITION_METAMODEL_ISSUE")); //$NON-NLS-1$
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

}
