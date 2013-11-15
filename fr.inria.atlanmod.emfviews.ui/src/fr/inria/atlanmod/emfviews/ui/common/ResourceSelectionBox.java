package fr.inria.atlanmod.emfviews.ui.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.jface.dialogs.Dialog;

public class ResourceSelectionBox extends LoadResourceDialog {

	private Shell shell;

	private Set<EPackage> registeredPackages = new LinkedHashSet<EPackage>();

	public ResourceSelectionBox(Shell parent) {
		super(parent);
		this.shell = parent;
	}

	@Override
	protected boolean processResource(Resource resource) {
		ResourceSet resourceSet = domain.getResourceSet();
		if (!resourceSet.getResources().contains(resource)) {
			Registry packageRegistry = resourceSet.getPackageRegistry();
			for (EPackage ePackage : getAllPackages(resource)) {
				packageRegistry.put(ePackage.getNsURI(), ePackage);
				registeredPackages.add(ePackage);
			}
		}
		return true;
	}

	private Collection<EPackage> getAllPackages(Resource resource) {
		List<EPackage> result = new ArrayList<EPackage>();
		for (TreeIterator<?> j = new EcoreUtil.ContentTreeIterator<Object>(
				resource.getContents()) {
			private static final long serialVersionUID = 1L;

			@Override
			protected Iterator<? extends EObject> getEObjectChildren(
					EObject eObject) {
				return eObject instanceof EPackage ? ((EPackage) eObject)
						.getESubpackages().iterator() : Collections
						.<EObject> emptyList().iterator();
			}
		}; j.hasNext();) {
			Object content = j.next();
			if (content instanceof EPackage) {
				result.add((EPackage) content);
			}
		}
		return result;
	}

	@Override
	public Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Composite buttonComposite = (Composite) composite.getChildren()[0];
		Button browseRegisteredPackagesButton = new Button(buttonComposite,
				SWT.PUSH);
		browseRegisteredPackagesButton.setText(EcoreEditorPlugin.INSTANCE
				.getString("_UI_BrowseRegisteredPackages_label")); //$NON-NLS-1$
		prepareBrowseRegisteredPackagesButton(browseRegisteredPackagesButton);

		FormData data = new FormData();
		Control[] children = buttonComposite.getChildren();
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
		browseRegisteredPackagesButton.setLayoutData(data);

		uriField.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String text = uriField.getText();
				if (text.contains(" ")) { //$NON-NLS-1$
					String[] uris = text.split(" "); //$NON-NLS-1$
					if (uris.length > 0) {
						uriField.setText(uris[uris.length - 1]);

					}
				}
			}
		});

		return composite;
	}

	private void prepareBrowseRegisteredPackagesButton(
			Button browseRegisteredPackagesButton) {
		browseRegisteredPackagesButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						RegisteredPackageDialog dialog = new RegisteredPackageDialog(
								getShell());
						if (dialog.open() == Dialog.OK) {
							uriField.setText(dialog.getResultAsString());
						}
					}
				});
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#getURIText()
	 */
	@Override
	public String getURIText() {
		String res = super.getURIText();
		if (res != null && res.contains(" ")) { //$NON-NLS-1$
			res = res.split(" ")[0]; //$NON-NLS-1$
		}
		return res;
	}

	/**
	 * Sets the dialog text.
	 * 
	 * @param text
	 *            the text
	 */
	public void setText(String text) {
		uriField.setText(text);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.window.Window#getShell()
	 */
	@Override
	public Shell getShell() {
		return shell;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.common.ui.dialogs.ResourceDialog#isMulti()
	 */
	@Override
	protected boolean isMulti() {
		return false;
	}

}
