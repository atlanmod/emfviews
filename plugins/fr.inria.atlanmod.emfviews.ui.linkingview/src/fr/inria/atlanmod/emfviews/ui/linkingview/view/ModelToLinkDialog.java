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

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class ModelToLinkDialog extends TitleAreaDialog {

  ArrayList<Button> buttons;
  Set<String> modelTypes;
  String selectedButton = "";

  public ModelToLinkDialog(Shell parent, Set<String> modelTypes) {
    super(parent);
    this.modelTypes = modelTypes;
    this.buttons = new ArrayList<Button>();
  }

  @Override
  protected Control createDialogArea(Composite parent) {

    Composite area = (Composite) super.createDialogArea(parent);

    for (String modelType : modelTypes) {
      Button b = new Button(area, SWT.RADIO);
      b.setText(modelType);
      buttons.add(b);
    }

    return area;

  }

  @Override
  public void create() {
    super.create();
    setTitle("Select the model you want to link");
    setMessage("Select the model you want to link", IMessageProvider.INFORMATION);
  }

  @Override
  protected void okPressed() {

    for (Button b : buttons) {
      if (b.getSelection()) {
        selectedButton = b.getText();
      }
    }

    super.okPressed();
  }

  public String getSelectedButton() {
    return selectedButton;
  }

}
