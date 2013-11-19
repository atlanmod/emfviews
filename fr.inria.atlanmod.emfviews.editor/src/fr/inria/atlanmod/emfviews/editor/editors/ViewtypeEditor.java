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

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.*;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.ide.IDE;

import fr.inria.atlanmod.emfviews.core.EmfViewsFactory;
import fr.inria.atlanmod.emfviews.core.Viewtype;
import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ModelSelection;

/**
 * An example showing how to create a multi-page editor. This example has 3
 * pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class ViewtypeEditor extends MultiPageEditorPart implements
		IResourceChangeListener {

	private List inputMetamodelsList;

	private ArrayList<String> inputMetaModelPaths;

	private TextEditor viewtypeTextEditor;

	private Text linksDslText;

	private String linksDslFile;

	private Button btnRemoveMetamodel;

	private Viewtype viewtype;

	private ArrayList<Object> structuralFeaturesToHide;

	boolean firstTimeToSave = true;

	/**
	 * Creates a multi-page editor example.
	 */
	public ViewtypeEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		structuralFeaturesToHide = new ArrayList<>();
	}

	public void createViewtypeTreeEditorPage() {
		IEditorInput editorInput = getEditorInput();
		FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
		EmfViewsFactory vFac = new EmfViewsFactory();
		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
				.createURI(fileEditorInput.getPath().toString());
		Resource viewtypeResource = vFac.createResource(emfURI);
		viewtype = (Viewtype) viewtypeResource;
		java.net.URI uri = fileEditorInput.getURI();

		try {
			viewtypeResource.load(uri.toURL().openStream(),
					new HashMap<Object, Object>());
			FormToolkit toolkit = new FormToolkit(getContainer().getDisplay());
			ScrolledForm virtualMetamodelForm = toolkit
					.createScrolledForm(getContainer());
			virtualMetamodelForm.setText("View type contents");

			Composite body = virtualMetamodelForm.getBody();
			toolkit.decorateFormHeading(virtualMetamodelForm.getForm());
			toolkit.paintBordersFor(body);
			body.setLayout(new GridLayout(1, true));

			CheckboxTreeViewer treeViewer = new CheckboxTreeViewer(body,
					SWT.BORDER);
			Tree tree = treeViewer.getTree();
			tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
					1));

			tree.addSelectionListener(new AttributeSelectionAdapter(this));

			toolkit.paintBordersFor(tree);

			treeViewer
					.setContentProvider(new fr.inria.atlanmod.emfviews.ui.wizard.view.AttributeSelectionContentProvider());

			treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
					new ReflectiveItemProviderAdapterFactory()));

			treeViewer.setInput(((Viewtype) viewtypeResource)
					.getContributingEpackages());

			ArrayList<EClass> containingClasses = new ArrayList<>();
			Viewtype theVirtualMM = (Viewtype) viewtypeResource;
			ArrayList<EObject> hiddenAtts = theVirtualMM.getHiddenAttributes();
			for (EObject eObject : hiddenAtts) {

				EStructuralFeature temp = (EStructuralFeature) eObject;

				containingClasses.add(temp.getEContainingClass());
			}
			treeViewer.setExpandedElements(containingClasses.toArray());
			treeViewer.setCheckedElements(hiddenAtts.toArray());

			int index = addPage(virtualMetamodelForm);
			setPageText(index, "Contents");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates page 2 of the multi-page editor, which shows the sorted text.
	 */
	void createViewtypePropertiesEditorPage() {
		FormToolkit toolkit = new FormToolkit(getContainer().getDisplay());
		ScrolledForm viewtypeForm = toolkit.createScrolledForm(getContainer());
		viewtypeForm.setText("Viewtype details");
		Composite body = viewtypeForm.getBody();
		body.setLayout(new GridLayout(1, false));
		toolkit.decorateFormHeading(viewtypeForm.getForm());
		toolkit.paintBordersFor(body);

		Section contributingMetamodelsSection = toolkit.createSection(
				viewtypeForm.getForm().getBody(), Section.DESCRIPTION
						| Section.TWISTIE | Section.TITLE_BAR);
		contributingMetamodelsSection.setLayoutData(new GridData(SWT.LEFT,
				SWT.CENTER, true, false, 1, 1));
		contributingMetamodelsSection
				.setDescription("Specify the list of contributing metamodels");

		toolkit.paintBordersFor(contributingMetamodelsSection);
		contributingMetamodelsSection.setText("Contributing metamodels");
		contributingMetamodelsSection.setExpanded(true);

		Composite composite = toolkit.createComposite(
				contributingMetamodelsSection, SWT.NONE);
		toolkit.paintBordersFor(composite);

		contributingMetamodelsSection.setClient(composite);
		composite.setLayout(new GridLayout(2, false));

		inputMetamodelsList = new List(composite, SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL | SWT.MULTI);
		GridData gd_list = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1);
		gd_list.widthHint = 430;
		gd_list.heightHint = 20;
		inputMetamodelsList.setLayoutData(gd_list);

		Composite composite_1 = toolkit.createComposite(composite, SWT.NONE);
		toolkit.paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		Button btnAddMetamodel = toolkit.createButton(composite_1, "Add",
				SWT.NONE);
		GridData gd_btnAddMetamodel = new GridData(SWT.LEFT, SWT.CENTER, true,
				false, 1, 1);
		gd_btnAddMetamodel.widthHint = 100;
		btnAddMetamodel.setLayoutData(gd_btnAddMetamodel);

		final Composite container = new Composite(getContainer(), SWT.NULL);
		GridData data = new GridData(GridData.FILL_BOTH);
		container.setLayoutData(data);
		GridLayout layout = new GridLayout(3, false);
		container.setLayout(layout);
		btnAddMetamodel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				AbstractSelection dialog = new ModelSelection(
						container.getShell(),
						Messages.getString("VirtualModelFileScreen.InputMetamodelCreation"),
						inputMetaModelPaths, ModelSelection.INPUTMETAMODEL);
				dialog.create();
				if (dialog.open() == Dialog.OK) {
					Object[] result = dialog.getResult();
					int modelType = Integer.parseInt(result[0].toString());
					switch (modelType) {

					case ModelSelection.INPUTMETAMODEL:
						inputMetaModelPaths.add(result[1].toString());
						IDocument theDoc = viewtypeTextEditor
								.getDocumentProvider().getDocument(
										viewtypeTextEditor.getEditorInput());

						String editorText = theDoc.get();
						Properties properties = createPropertiesFromViewtypeInTextEditor(editorText);
						String metamodels = properties
								.getProperty("contributingMetamodels");
						String correspondenceModel = properties
								.getProperty("correspondenceModel");
						String correspondenceModelBase = properties
								.getProperty("correspondenceModelBase");
						if (metamodels.length() > 0)
							metamodels = metamodels + ","
									+ result[1].toString();
						else
							metamodels = result[1].toString();
						String updatedVMM = updateViewtype(
								"contributingMetamodels=" + metamodels,
								"correspondenceModel=" + correspondenceModel,
								"correspondenceModelBase="
										+ correspondenceModelBase);
						theDoc.set(updatedVMM);
						break;

					default:
						break;
					}

				}

				updateLists();

			}

		});

		btnRemoveMetamodel = toolkit.createButton(composite_1, "Remove",
				SWT.NONE);
		GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_btnNewButton.widthHint = 100;
		btnRemoveMetamodel.setLayoutData(gd_btnNewButton);
		btnRemoveMetamodel.addSelectionListener(new SelectionAdapter() {
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent evt) {
				int[] indices = inputMetamodelsList.getSelectionIndices();
				for (int i = 0; i < indices.length; i++) {
					int j = indices[i];
					String selectedItem = inputMetamodelsList.getItem(j);
					inputMetamodelsList.remove(j);
					boolean found = false;
					for (int k = 0; i < inputMetaModelPaths.size() & !found; k++) {
						if (inputMetaModelPaths.get(k).compareToIgnoreCase(
								selectedItem) == 0) {
							inputMetaModelPaths.remove(inputMetaModelPaths
									.get(k));
							found = true;
						}
					}

				}
				updateLists();
				btnRemoveMetamodel.setEnabled(inputMetamodelsList.getItems().length > 0);

				IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
						.getDocument(viewtypeTextEditor.getEditorInput());
				String editorText = theDoc.get();
				Properties properties = createPropertiesFromViewtypeInTextEditor(editorText);
				String correspondenceModel = properties
						.getProperty("correspondenceModel");
				String correspondenceModelBase = properties
						.getProperty("correspondenceModelBase");
				String mm = "";
				for (int i = 0; i < inputMetaModelPaths.size(); i++) {
					if (i < inputMetaModelPaths.size() - 1) {
						mm = mm + inputMetaModelPaths.get(i) + ",";
					} else {
						mm = mm + inputMetaModelPaths.get(i);
					}
				}
				String updatedVMM = updateViewtype("contributingMetamodels="
						+ mm, "correspondenceModel=" + correspondenceModel,
						"correspondenceModelBase=" + correspondenceModelBase);
				theDoc.set(updatedVMM);
			}
		});

		Section sctnLinksTechnology = toolkit.createSection(viewtypeForm
				.getForm().getBody(), Section.DESCRIPTION | Section.TWISTIE
				| Section.TITLE_BAR);
		GridData gd_sctnLinksTechnology = new GridData(SWT.LEFT, SWT.CENTER,
				true, false, 1, 1);
		gd_sctnLinksTechnology.widthHint = 588;
		sctnLinksTechnology.setLayoutData(gd_sctnLinksTechnology);
		sctnLinksTechnology
				.setDescription("Select a DSL technology to specify links between models");
		sctnLinksTechnology.setBounds(0, 193, 584, 187);
		toolkit.paintBordersFor(sctnLinksTechnology);
		sctnLinksTechnology.setText("Links Technology");
		sctnLinksTechnology.setExpanded(true);

		Composite composite_2 = toolkit.createComposite(sctnLinksTechnology,
				SWT.NONE);
		toolkit.paintBordersFor(composite_2);
		sctnLinksTechnology.setClient(composite_2);
		composite_2.setLayout(null);

		linksDslText = new Text(composite_2, SWT.BORDER);
		linksDslText.setEnabled(true);
		linksDslText.setBounds(0, 0, 456, 25);
		toolkit.adapt(linksDslText, true, true);

		Button modifyLinksDslButton = new Button(composite_2, SWT.NONE);
		modifyLinksDslButton.setBounds(469, 0, 107, 25);
		toolkit.adapt(modifyLinksDslButton, true, true);
		modifyLinksDslButton.setText("Modify");
		modifyLinksDslButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent evt) {
				ResourceListSelectionDialog selectLinksDslDialog = new ResourceListSelectionDialog(
						container.getShell(), ResourcesPlugin.getWorkspace()
								.getRoot(), IResource.FILE);
				selectLinksDslDialog.setTitle("Select DSL technology");

				selectLinksDslDialog.create();

				if (selectLinksDslDialog.open() == Dialog.OK) {
					IFile correspondenceModelBaseFile = (IFile) selectLinksDslDialog
							.getResult()[0];

					String correspondenceModelBasePath = correspondenceModelBaseFile
							.getFullPath().toString();
					correspondenceModelBasePath = correspondenceModelBasePath
							.replaceFirst("/", "");

					linksDslText.setText(correspondenceModelBasePath);

					IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
							.getDocument(viewtypeTextEditor.getEditorInput());
					String editorText = theDoc.get();
					Properties properties = createPropertiesFromViewtypeInTextEditor(editorText);
					String metamodels = properties
							.getProperty("contributingMetamodels");
					String correspondenceModel = properties
							.getProperty("correspondenceModel");

					String updatedVMM = updateViewtype(
							"contributingMetamodels=" + metamodels,
							"correspondenceModel=" + correspondenceModel,
							"correspondenceModelBase="
									+ correspondenceModelBasePath);
					theDoc.set(updatedVMM);
				}
			}

		});
		int index = addPage(viewtypeForm);
		setPageText(index, "Properties");
	}

	/**
	 * Creates page 0 of the multi-page editor, which contains a text editor.
	 */
	void createViewtypeTextEditorPage() {
		try {
			viewtypeTextEditor = new TextEditor();
			int index = addPage(viewtypeTextEditor, getEditorInput());
			setPageText(index, "Source");
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
		}
	}

	private String updateViewtype(String contributingMetamodelsProperty,
			String correspondenceModelProperty,
			String correspondenceModelBaseProperty) {
		StringBuffer fileContent = new StringBuffer();
		fileContent.append(contributingMetamodelsProperty);
		fileContent.append("\n");
		fileContent.append(correspondenceModelProperty);
		fileContent.append("\n");
		fileContent.append(correspondenceModelBaseProperty);
		return fileContent.toString();
	}

	private void updateLinksDslText() {
		linksDslText.setText(linksDslFile);
	}

	private void updateLists() {

		inputMetamodelsList.removeAll();
		for (String path : inputMetaModelPaths) {
			inputMetamodelsList.add(path);
		}

	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createViewtypeTextEditorPage();
		createViewtypePropertiesEditorPage();
		createViewtypeTreeEditorPage();

	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
		Resource attMM = viewtype.getAttributesToHideMM();
		if (firstTimeToSave) {
			structuralFeaturesToHide.addAll(viewtype.getHiddenAttributes());
			firstTimeToSave = false;
		}

		ArrayList<EClass> completeContainingClasses = new ArrayList<>();
		ArrayList<EClass> containingClasses = new ArrayList<>();
		ArrayList<EPackage> containingEpackages = new ArrayList<>();
		ArrayList<EPackage> completeContainingEpackages = new ArrayList<>();

		EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
		if (structuralFeaturesToHide != null
				&& structuralFeaturesToHide.size() > 0) {
			for (Object attributeToHide : structuralFeaturesToHide) {

				EObject eo = (EObject) attributeToHide;
				if (eo instanceof EStructuralFeature) {
					EStructuralFeature estFeature = (EStructuralFeature) eo;
					EStructuralFeature theEstF = null;
					if (estFeature instanceof EAttribute) {
						theEstF = theCoreFactory.createEAttribute();

					} else if (estFeature instanceof EReference) {
						theEstF = theCoreFactory.createEReference();
					}
					theEstF.setName(estFeature.getName());

					EClass owningClass = (EClass) estFeature.eContainer();
					EClass tempEClass = null;
					if (!completeContainingClasses.contains(owningClass)) {
						tempEClass = theCoreFactory.createEClass();
						tempEClass.setName(owningClass.getName());
						containingClasses.add(tempEClass);
						completeContainingClasses.add(owningClass);
						EPackage containingPack = owningClass.getEPackage();

						if (!completeContainingEpackages
								.contains(containingPack)) {
							EPackage tempEpackage = theCoreFactory
									.createEPackage();
							tempEpackage.setNsURI(containingPack.getNsURI());
							tempEpackage.setName(containingPack.getName());
							containingEpackages.add(tempEpackage);
							completeContainingEpackages.add(containingPack);
							tempEpackage.getEClassifiers().add(tempEClass);
						}
					} else {
						boolean found = false;
						for (int i = 0; i < containingClasses.size() && !found; i++) {
							EClass tempC = containingClasses.get(i);
							String tempId = tempC.getEPackage().getNsURI()
									.concat(tempC.getName());
							if (tempId.compareToIgnoreCase(owningClass
									.getEPackage().getNsURI()
									.concat(owningClass.getName())) == 0) {
								found = true;
								tempEClass = tempC;
							}

						}
					}

					tempEClass.getEStructuralFeatures().add(theEstF);

				}
			}
		} else {
			EPackage tempEpackage = theCoreFactory.createEPackage();
			tempEpackage.setNsURI("Empty");
			tempEpackage.setName("Empty");
			attMM.getContents().add(tempEpackage);
		}

		int numPacks = attMM.getContents().size();
		for (int i = 0; i < numPacks; i++) {
			attMM.getContents().remove(0);
		}

		for (EPackage ePackage : containingEpackages) {
			attMM.getContents().add(ePackage);
		}

		try {
			/*
			 * Save the resource
			 */
			attMM.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}

	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	public Properties createPropertiesFromViewtypeInTextEditor(String editorText) {
		String[] lines = editorText.split("\r\n|\r|\n");
		Properties properties = new Properties();
		for (String line : lines) {
			String[] property = line.split("=");
			properties.setProperty(property[0], property[1]);
		}

		return properties;
	}

	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);

		if (newPageIndex == 1) {

			String editorText = viewtypeTextEditor.getDocumentProvider()
					.getDocument(viewtypeTextEditor.getEditorInput()).get();
			Properties properties = createPropertiesFromViewtypeInTextEditor(editorText);
			String metamodels = properties
					.getProperty("contributingMetamodels");
			String[] splitMetamodels = metamodels.split(",");
			inputMetaModelPaths = new ArrayList<>();
			for (String metamodel : splitMetamodels) {
				inputMetaModelPaths.add(metamodel);
			}

			String correspondenceModelBase = properties
					.getProperty("correspondenceModelBase");
			linksDslFile = correspondenceModelBase;
			updateLists();
			updateLinksDslText();

		}
	}

	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
							.getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) viewtypeTextEditor
								.getEditorInput()).getFile().getProject()
								.equals(event.getResource())) {
							IEditorPart editorPart = pages[i]
									.findEditor(viewtypeTextEditor
											.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}

	public void updateAttributesToHide(TreeItem item) {

		if (item.getChecked()) {
			if (structuralFeaturesToHide.indexOf(item.getData()) == -1)
				structuralFeaturesToHide.add(item.getData());
		} else {
			boolean elimino = false;
			for (int i = 0; i < structuralFeaturesToHide.size() && !elimino; i++) {
				if (structuralFeaturesToHide.get(i).equals(item.getData())) {
					structuralFeaturesToHide.remove(i);
				}

			}
		}

		IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
				.getDocument(viewtypeTextEditor.getEditorInput());
		theDoc.set(theDoc.get());

	}

}
