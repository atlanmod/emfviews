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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;
import org.eclipse.core.runtime.Status;

import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;

public class AbstractSelection extends SelectionStatusDialog {

  protected static final String NAMING_REGEX = "[a-zA-Z0-9]+"; //$NON-NLS-1$

  private IStatus status;

  public AbstractSelection(Shell parent, String title) {
    super(parent);
    setTitle(title);
    setStatusLineAboveButtons(true);
    setShellStyle(
        SWT.CLOSE | SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM | SWT.RESIZE);
  }

  /**
   * {@inheritDoc}
   *
   * @see org.eclipse.ui.dialogs.SelectionStatusDialog#create()
   */
  @Override
  public void create() {
    status = new Status(IStatus.OK, EmfViewsUIPlugin.PLUGIN_ID, IStatus.OK, "", //$NON-NLS-1$
        null);
    updateStatus(status);
    super.create();
  }

  /**
   * Displays an error.
   *
   * @param message
   *          the message
   */
  protected void nok(String message) {
    if (Platform.isRunning()) {

      status = new Status(IStatus.ERROR, EmfViewsUIPlugin.PLUGIN_ID,
          IStatus.ERROR, message, null);
      updateStatus(status);
    }
    getOkButton().setEnabled(false);

  }

  /**
   * Updates the status to OK.
   */
  protected void ok() {
    status = new Status(IStatus.OK, EmfViewsUIPlugin.PLUGIN_ID, IStatus.OK, "", //$NON-NLS-1$
        null);
    updateStatus(status);
    getOkButton().setEnabled(true);
  }

  /**
   * Displays a warning.
   *
   * @param message
   *          the warning message
   */
  protected void warn(String message) {
    status = new Status(IStatus.WARNING, EmfViewsUIPlugin.PLUGIN_ID, message);
    updateStatus(status);
    getOkButton().setEnabled(true);
  }

  @Override
  protected void computeResult() {

  }

}
