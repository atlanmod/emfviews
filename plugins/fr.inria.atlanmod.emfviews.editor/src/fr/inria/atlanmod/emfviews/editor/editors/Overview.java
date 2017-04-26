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
package fr.inria.atlanmod.emfviews.editor.editors;

import java.util.ArrayList;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ModelSelection;

public class Overview extends SectionPart {

  private List inputMetamodelsList;

  private ArrayList<String> inputMetaModelPaths;

  /**
   * Create the SectionPart.
   *
   * @param parent
   * @param toolkit
   * @param style
   */
  public Overview(Composite parent, FormToolkit toolkit, int style) {
    super(parent, toolkit, style);
    inputMetaModelPaths = new ArrayList<>();
    createClient(getSection(), toolkit);
  }

  /**
   * Fill the section.
   */
  private void createClient(Section section, FormToolkit toolkit) {
    section.setText("Overview");
    Composite container = toolkit.createComposite(section);

    section.setClient(container);
    container.setLayout(new GridLayout(3, false));

    GridData dataLists = new GridData(GridData.FILL_BOTH | GridData.VERTICAL_ALIGN_BEGINNING);

    inputMetamodelsList =
        createModelControl(container, Messages.getString("VirtualModelFileScreen.InputMetamodels"), //$NON-NLS-1$
                           new ModelSelection(container.getShell(), Messages
                               .getString("VirtualModelFileScreen.InputMetamodelCreation"), //$NON-NLS-1$
                                              inputMetaModelPaths, ModelSelection.INPUTMETAMODEL),
                           dataLists); // 2$
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
        // int[] indices = list.getSelectionIndices();
        // for (int i = 0; i < indices.length; i++) {
        // int j = indices[i];

        // }
        updateLists();
        removeIn.setEnabled(list.getSelection().length > 0);
      }
    });
    return list;
  }

  private Button createButton(Composite parent, String text) {
    Button button = new Button(parent, SWT.PUSH);
    button.setAlignment(SWT.CENTER);
    button.setText(text);
    button.setFont(parent.getFont());
    GridData data = new GridData();
    button.setLayoutData(data);
    return button;
  }

  private void updateLists() {

    inputMetamodelsList.removeAll();
    for (String path : inputMetaModelPaths) {
      inputMetamodelsList.add(path);
    }

  }

}
