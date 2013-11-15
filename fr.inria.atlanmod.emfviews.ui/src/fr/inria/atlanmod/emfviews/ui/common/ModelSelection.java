package fr.inria.atlanmod.emfviews.ui.common;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import fr.inria.atlanmod.emfviews.ui.Messages;

public class ModelSelection extends AbstractSelection {

	private ResourceSelectionBox loadResourceBox;

	private ArrayList<String> pathsFromParent;

	public final static int INPUTMODEL = 1;

	public final static int INPUTMETAMODEL = 2;

	public final static int LINKSMODEL = 3;

	public final static int COMPOSITIONMETAMODEL = 4;

	private int modelType;

	public ModelSelection(Shell parent, String title, ArrayList<String> paths,
			int modelType) {
		super(parent, title);
		this.pathsFromParent = paths;
		this.modelType = modelType;

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.m2m.atl.adt.ui.common.AbstractAtlSelection#create()
	 */
	@Override
	public void create() {
		super.create();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
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
		result = new Object[] { modelType, resourceUri };
		setResult(Arrays.asList(result));
	}

}
