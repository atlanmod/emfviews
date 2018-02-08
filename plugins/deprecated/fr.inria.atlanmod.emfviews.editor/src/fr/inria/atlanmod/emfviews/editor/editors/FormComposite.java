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

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;

// FIXME: unused
public class FormComposite extends Composite {

  private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

  /**
   * Create the composite.
   *
   * @param parent
   * @param style
   */
  public FormComposite(Composite parent, int style) {
    super(parent, style);
    addDisposeListener(new DisposeListener() {
      @Override
      public void widgetDisposed(DisposeEvent e) {
        toolkit.dispose();
      }
    });
    toolkit.adapt(this);
    toolkit.paintBordersFor(this);

  }

}
