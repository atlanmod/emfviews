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

import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ResourceSelectionBox;

public class ViewSelectionDialog extends AbstractSelection {

	private ResourceSelectionBox loadResourceBox;

	public ViewSelectionDialog(Shell parent, String title) {
		super(parent, title);

	}

	@Override
	public void create() {
		super.create();
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		final Composite container = (Composite) super.createDialogArea(parent);
		GridData data = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(data);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);

		Group uriSection = new Group(container, SWT.NULL);
		uriSection.setText(Messages.getString("ModelSelection.MODEL_LOCATION")); //$NON-NLS-1$
		uriSection.setLayout(new GridLayout());
		data = new GridData(GridData.FILL_HORIZONTAL);
		uriSection.setLayoutData(data);

		loadResourceBox = new ResourceSelectionBox(getShell());
		final Composite composite = (Composite) loadResourceBox
				.createDialogArea(uriSection);
		composite.getChildren()[composite.getChildren().length - 1].dispose();

		composite.setLayoutData(data);
		return container;
	}

	@Override
	protected void computeResult() {
		Object[] result;
		String resourceUri = loadResourceBox.getURIText();
		result = new Object[] { resourceUri };
		setResult(Arrays.asList(result));
	}

}
