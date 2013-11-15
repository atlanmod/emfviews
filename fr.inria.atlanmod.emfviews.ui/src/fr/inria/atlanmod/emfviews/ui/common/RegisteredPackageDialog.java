package fr.inria.atlanmod.emfviews.ui.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class RegisteredPackageDialog extends ElementListSelectionDialog {

	private boolean isRuntimeOnly;

	private boolean isDevelopmentTimeVersion;

	public RegisteredPackageDialog(Shell parent) {
		super(parent, new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				return ExtendedImageRegistry.getInstance().getImage(
						EcoreEditPlugin.INSTANCE
								.getImage("full/obj16/EPackage")); //$NON-NLS-1$
			}
		});

		setMultipleSelection(false);
		setMessage(EcoreEditorPlugin.INSTANCE
				.getString("_UI_SelectRegisteredPackageURI")); //$NON-NLS-1$
		setFilter("*"); //$NON-NLS-1$
		setTitle(EcoreEditorPlugin.INSTANCE
				.getString("_UI_PackageSelection_label")); //$NON-NLS-1$
	}

	/**
	 * Returns the uri result as a String.
	 * 
	 * @return the uri result as a String
	 */
	public String getResultAsString() {
		Object[] result = getResult();
		if (result != null && result.length == 1) {
			Object nsURI = result[0];
			if (isDevelopmentTimeVersion() && !isRuntimeOnly) {
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getURIConverter().getURIMap()
						.putAll(EcorePlugin.computePlatformURIMap());
				String uri = ""; //$NON-NLS-1$
				Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin
						.getEPackageNsURIToGenModelLocationMap();

				URI location = ePackageNsURItoGenModelLocationMap.get(nsURI);
				Resource resource = resourceSet.getResource(location, true);
				EcoreUtil.resolveAll(resource);

				for (Resource r : resourceSet.getResources()) {
					for (EPackage ePackage : getAllPackages(r)) {
						if (nsURI.equals(ePackage.getNsURI())) {
							uri = r.getURI().toString();
							break;
						}
					}
				}
				return uri;
			} else {
				return nsURI.toString();
			}
		}
		return null;
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

	public boolean isDevelopmentTimeVersion() {
		return isDevelopmentTimeVersion;
	}

	private void updateElements() {
		if (isDevelopmentTimeVersion) {
			Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin
					.getEPackageNsURIToGenModelLocationMap();
			Object[] result = ePackageNsURItoGenModelLocationMap.keySet()
					.toArray(
							new Object[ePackageNsURItoGenModelLocationMap
									.size()]);
			Arrays.sort(result);
			setListElements(result);
		} else {
			Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(
					new Object[EPackage.Registry.INSTANCE.size()]);
			Arrays.sort(result);
			setListElements(result);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.dialogs.ElementListSelectionDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite result = (Composite) super.createDialogArea(parent);
		Composite buttonGroup = new Composite(result, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		buttonGroup.setLayout(layout);
		final Button developmentTimeVersionButton = new Button(buttonGroup,
				SWT.RADIO);
		developmentTimeVersionButton
				.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent event) {
						isDevelopmentTimeVersion = developmentTimeVersionButton
								.getSelection();
						updateElements();
					}
				});
		developmentTimeVersionButton.setText(EcoreEditorPlugin.INSTANCE
				.getString("_UI_DevelopmentTimeVersion_label")); //$NON-NLS-1$
		Button runtimeTimeVersionButton = new Button(buttonGroup, SWT.RADIO);
		runtimeTimeVersionButton.setText(EcoreEditorPlugin.INSTANCE
				.getString("_UI_RuntimeVersion_label")); //$NON-NLS-1$
		runtimeTimeVersionButton.setSelection(true);

		updateElements();

		return result;
	}

	public void setRuntimeOnly(boolean value) {
		this.isRuntimeOnly = value;
	}

	public boolean isRuntimeOnly() {
		return isRuntimeOnly;
	}

}
