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
package fr.inria.atlanmod.emfviews.ui.linkingview.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;

import fr.inria.atlanmod.emfviews.ui.linkingview.view.LinksView;
import fr.inria.atlanmod.emfviews.ui.linkingview.view.ViewSelectionDialog;

public class SelectViewAction extends Action {
	LinksView linksView;
	Composite parent;

	public SelectViewAction(LinksView linksView, Composite parent) {
		this.linksView = linksView;
		this.parent = parent;
	}

	public void run() {
		ViewSelectionDialog viewSelection = new ViewSelectionDialog(
				parent.getShell(), "Select a view");
		viewSelection.create();
		if (viewSelection.open() == Dialog.OK) {
			Object[] result = viewSelection.getResult();
			String viewPath = (String) result[0];
			linksView.loadView(viewPath);
		}
	}

}
