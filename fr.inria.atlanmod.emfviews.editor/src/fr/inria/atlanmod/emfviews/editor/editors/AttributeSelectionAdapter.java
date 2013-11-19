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

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.TreeItem;

public class AttributeSelectionAdapter extends SelectionAdapter {

	ViewtypeEditor mpe;

	public AttributeSelectionAdapter(ViewtypeEditor mpe) {
		super();
		this.mpe = mpe;

	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		TreeItem item = (TreeItem) e.item;
		mpe.updateAttributesToHide(item);

	}

}
