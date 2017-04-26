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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.window.Window;
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
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import fr.inria.atlanmod.emfviews.core.EmfViewsFactory;
import fr.inria.atlanmod.emfviews.core.Viewtype;
import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.common.AbstractSelection;
import fr.inria.atlanmod.emfviews.ui.common.ModelSelection;
import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.util.EmfViewsUtil;

public class ViewtypeEditor extends MultiPageEditorPart
    implements IResourceChangeListener {

  private List inputMetamodelsList;

  private ArrayList<String> inputMetaModelPaths;

  private TextEditor viewtypeTextEditor;

  private Text linksDslText;

  private String linksDslFile;

  private Button btnAddMetamodel;

  private Button btnRemoveMetamodel;

  private ArrayList<Object> elementsToFilter = new ArrayList<>();

  CheckboxTreeViewer treeViewer;

  /**
   * Creates a multi-page editor example.
   */
  public ViewtypeEditor() {
    super();
    ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
  }

  public void createViewtypeTreeEditorPage() {
    IEditorInput editorInput = getEditorInput();
    FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
    EmfViewsFactory vFac = new EmfViewsFactory();
    org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
        .createURI(fileEditorInput.getPath().toString());
    Resource viewtypeResource = vFac.createResource(emfURI);
    java.net.URI uri = fileEditorInput.getURI();

    try {
      viewtypeResource.load(uri.toURL().openStream(), new HashMap<>());
      FormToolkit toolkit = new FormToolkit(getContainer().getDisplay());
      ScrolledForm virtualMetamodelForm = toolkit
          .createScrolledForm(getContainer());
      virtualMetamodelForm.setText("View type contents");

      Composite body = virtualMetamodelForm.getBody();
      toolkit.decorateFormHeading(virtualMetamodelForm.getForm());
      toolkit.paintBordersFor(body);
      body.setLayout(new GridLayout(1, true));

      treeViewer = new CheckboxTreeViewer(body, SWT.BORDER);
      Tree tree = treeViewer.getTree();
      tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

      tree.addSelectionListener(new AttributeSelectionAdapter(this));

      toolkit.paintBordersFor(tree);

      treeViewer.setContentProvider(
          new fr.inria.atlanmod.emfviews.ui.wizard.view.AttributeSelectionContentProvider());

      treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
          new ReflectiveItemProviderAdapterFactory()));

      treeViewer.setInput(((Viewtype) viewtypeResource).getResourceSet()
          .getPackageRegistry().values());

      ArrayList<EClass> containingClasses = new ArrayList<>();
      Viewtype viewtype = (Viewtype) viewtypeResource;

      ArrayList<EObject> hiddenElemens = viewtype.getHiddenAttributes();
      if (hiddenElemens != null && hiddenElemens.size() > 0) {
        for (EObject eObject : hiddenElemens) {

          if (eObject instanceof EStructuralFeature) {
            EStructuralFeature temp = (EStructuralFeature) eObject;
            containingClasses.add(temp.getEContainingClass());
          }

        }

        treeViewer.setCheckedElements(hiddenElemens.toArray());
        if (containingClasses.size() > 0)
          treeViewer.setExpandedElements(containingClasses.toArray());
      }

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

    Section contributingMetamodelsSection = toolkit
        .createSection(viewtypeForm.getForm().getBody(), Section.DESCRIPTION
            | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
    contributingMetamodelsSection
        .setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
    contributingMetamodelsSection
        .setDescription("Specify the list of contributing metamodels");

    toolkit.paintBordersFor(contributingMetamodelsSection);
    contributingMetamodelsSection.setText("Contributing metamodels");
    contributingMetamodelsSection.setExpanded(true);

    Composite composite = toolkit.createComposite(contributingMetamodelsSection,
        SWT.NONE);
    toolkit.paintBordersFor(composite);

    contributingMetamodelsSection.setClient(composite);
    composite.setLayout(new GridLayout(2, false));

    inputMetamodelsList = new List(composite,
        SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI);
    GridData gd_list = new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1);
    gd_list.widthHint = 430;
    gd_list.heightHint = 20;
    inputMetamodelsList.setLayoutData(gd_list);

    Composite composite_1 = toolkit.createComposite(composite, SWT.NONE);
    toolkit.paintBordersFor(composite_1);
    composite_1.setLayout(new GridLayout(1, false));

    btnAddMetamodel = toolkit.createButton(composite_1, "Add", SWT.NONE);
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
        AbstractSelection dialog = new ModelSelection(container.getShell(),
            Messages.getString("VirtualModelFileScreen.InputMetamodelCreation"),
            inputMetaModelPaths, ModelSelection.INPUTMETAMODEL);
        dialog.create();
        if (dialog.open() == Window.OK) {
          Object[] result = dialog.getResult();
          int modelType = Integer.parseInt(result[0].toString());
          switch (modelType) {

          case ModelSelection.INPUTMETAMODEL:
            inputMetaModelPaths.add(result[1].toString());
            IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
                .getDocument(viewtypeTextEditor.getEditorInput());

            String editorText = theDoc.get();

            theDoc.set(updateViewtypeDefinition(editorText,
                result[1].toString(), null));
            break;

          default:
            break;
          }

        }

        updateLists();

      }

    });

    btnRemoveMetamodel = toolkit.createButton(composite_1, "Remove", SWT.NONE);
    GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.CENTER, false, false,
        1, 1);
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
            if (inputMetaModelPaths.get(k)
                .compareToIgnoreCase(selectedItem) == 0) {
              inputMetaModelPaths.remove(inputMetaModelPaths.get(k));
              found = true;
            }
          }

        }
        updateLists();
        btnRemoveMetamodel
            .setEnabled(inputMetamodelsList.getItems().length > 0);

        IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
            .getDocument(viewtypeTextEditor.getEditorInput());
        String editorText = theDoc.get();
        theDoc.set(updateViewtypeDefinition(editorText, null, null));

      }
    });

    Section sctnLinksTechnology = toolkit
        .createSection(viewtypeForm.getForm().getBody(), Section.DESCRIPTION
            | ExpandableComposite.TWISTIE | ExpandableComposite.TITLE_BAR);
    GridData gd_sctnLinksTechnology = new GridData(SWT.LEFT, SWT.CENTER, true,
        false, 1, 1);
    gd_sctnLinksTechnology.widthHint = 588;
    sctnLinksTechnology.setLayoutData(gd_sctnLinksTechnology);
    sctnLinksTechnology.setDescription(
        "Select a DSL technology to specify links between models");
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
            container.getShell(), ResourcesPlugin.getWorkspace().getRoot(),
            IResource.FILE);
        selectLinksDslDialog.setTitle("Select DSL technology");

        selectLinksDslDialog.create();

        if (selectLinksDslDialog.open() == Window.OK) {
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
          theDoc.set(updateViewtypeDefinition(editorText, null,
              correspondenceModelBasePath));

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

  private String updateViewtypeDefinition(String existingViewtypeDefinition,
                                          String addedMetamodelUri,
                                          String dslBase) {
    Properties properties = createPropertiesFromViewtypeInTextEditor(
        existingViewtypeDefinition);
    String correspondenceModel = properties.getProperty("correspondenceModel");
    String correspondenceModelBase = properties
        .getProperty("correspondenceModelBase");
    String metamodels = properties.getProperty("contributingMetamodels");

    if (addedMetamodelUri != null) {
      if (addedMetamodelUri.startsWith("platform:/resource/")) {
        addedMetamodelUri = addedMetamodelUri.replace("platform:/resource/",
            "");
      }
      if (metamodels.length() > 0) {
        metamodels = metamodels + "," + addedMetamodelUri;
      } else
        metamodels = addedMetamodelUri;
    } else {
      String mm = "";
      for (int i = 0; i < inputMetaModelPaths.size(); i++) {
        if (i < inputMetaModelPaths.size() - 1) {
          mm = mm + inputMetaModelPaths.get(i) + ",";
        } else {
          mm = mm + inputMetaModelPaths.get(i);
        }
      }

      metamodels = mm;
    }
    if (dslBase != null) {
      correspondenceModelBase = dslBase;
    }

    String updatedVMM = updateViewtype("contributingMetamodels=" + metamodels,
        "correspondenceModel=" + correspondenceModel,
        "correspondenceModelBase=" + correspondenceModelBase);

    return updatedVMM;
  }

  private String updateViewtype(String contributingMetamodelsProperty,
                                String correspondenceModelProperty,
                                String correspondenceModelBaseProperty) {
    StringBuffer fileContent = new StringBuffer();
    fileContent.append(contributingMetamodelsProperty);
    fileContent.append("\n");
    fileContent.append(correspondenceModelProperty);
    fileContent.append("\n");
    if (correspondenceModelBaseProperty != null) {
      fileContent.append(correspondenceModelBaseProperty);
      fileContent.append("\n");
    }

    return fileContent.toString();
  }

  private void updateLinksDslText() {
    if (linksDslFile != null)
      linksDslText.setText(linksDslFile);
    else
      linksDslText.setText("");
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
  @Override
  protected void createPages() {
    createViewtypeTextEditorPage();
    createViewtypePropertiesEditorPage();
    createViewtypeTreeEditorPage();

  }

  /**
   * The <code>MultiPageEditorPart</code> implementation of this
   * <code>IWorkbenchPart</code> method disposes all nested editors. Subclasses
   * may extend.
   */
  @Override
  public void dispose() {
    ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
    super.dispose();
  }

  /**
   * Saves the multi-page editor's document.
   */
  @Override
  public void doSave(IProgressMonitor monitor) {

    getEditor(0).doSave(monitor);

    EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
    if (elementsToFilter != null && elementsToFilter.size() > 0) {
      String linksResourcePath = createPropertiesFromViewtypeInTextEditor(
          viewtypeTextEditor.getDocumentProvider()
              .getDocument(viewtypeTextEditor.getEditorInput()).get())
                  .getProperty("correspondenceModel");
      java.net.URI linksUri = null;
      try {
        linksUri = EmfViewsUtil.toURI(linksResourcePath);
      } catch (URISyntaxException e) {
        e.printStackTrace();
      }
      Resource modelResource = new ResourceSetImpl().getResource(
          org.eclipse.emf.common.util.URI.createURI(linksUri.toString()), true);

      VirtualLinks filterLinks = (VirtualLinks) modelResource.getContents()
          .get(0);
      for (Object elementToFilter : elementsToFilter) {
        if (elementToFilter instanceof EStructuralFeature) {
          EStructuralFeature estFeature = (EStructuralFeature) elementToFilter;
          Filter filter = EmfViewsUtil.createFilter(
              "filter" + estFeature.getEContainingClass().getName(), "", true);
          LinkedElement filterLinkedElement = EmfViewsUtil.createLinkedElement(
              estFeature.getEContainingClass().getName(),
              estFeature.getEContainingClass().getEPackage().getNsURI(),
              "//" + estFeature.getEContainingClass().getName(),
              estFeature.getName());
          EmfViewsUtil.associateFilters(filterLinks, filter,
              filterLinkedElement);
        } else if (elementToFilter instanceof EClass) {
          EClass tempEclass = (EClass) elementToFilter;
          Filter filter = EmfViewsUtil.createFilter(
              "filter" + tempEclass.getName(),
              tempEclass.getName() + ".allInstances()", false);
          LinkedElement filterLinkedElement = EmfViewsUtil.createLinkedElement(
              tempEclass.getName(), tempEclass.getEPackage().getNsURI(),
              "//" + tempEclass.getName(), null);
          filter.setFilteredElement(filterLinkedElement);
          filterLinks.getVirtualLinks().add(filter);
          filterLinks.getLinkedElements().add(filterLinkedElement);
          EmfViewsUtil.associateFilters(filterLinks, filter,
              filterLinkedElement);
        }
      }

      try {
        modelResource.save(null);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Saves the multi-page editor's document as another file. Also updates the
   * text for page 0's tab, and updates this multi-page editor's input to
   * correspond to the nested editor's.
   */
  @Override
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
  @Override
  public void init(IEditorSite site, IEditorInput editorInput)
      throws PartInitException {
    if (!(editorInput instanceof IFileEditorInput))
      throw new PartInitException("Invalid Input: Must be IFileEditorInput");
    super.init(site, editorInput);
  }

  /*
   * (non-Javadoc) Method declared on IEditorPart.
   */
  @Override
  public boolean isSaveAsAllowed() {
    return true;
  }

  public Properties createPropertiesFromViewtypeInTextEditor(String editorText) {
    String[] lines = editorText.split("\r\n|\r|\n");
    Properties properties = new Properties();
    for (String line : lines) {
      String[] property = line.split("=");
      if (property.length == 2)
        properties.setProperty(property[0], property[1]);
      else
        properties.setProperty(property[0], "");
    }

    return properties;
  }

  /**
   * Calculates the contents of page 2 when the it is activated.
   */
  @Override
  protected void pageChange(int newPageIndex) {
    super.pageChange(newPageIndex);

    String editorText = viewtypeTextEditor.getDocumentProvider()
        .getDocument(viewtypeTextEditor.getEditorInput()).get();
    Properties properties = createPropertiesFromViewtypeInTextEditor(
        editorText);
    String metamodels = properties.getProperty("contributingMetamodels");
    String[] splitMetamodels = metamodels.split(",");
    inputMetaModelPaths = new ArrayList<>();

    for (String metamodel : splitMetamodels) {
      inputMetaModelPaths.add(metamodel);
    }
    if (newPageIndex == 1) {

      String correspondenceModelBase = properties
          .getProperty("correspondenceModelBase");
      linksDslFile = correspondenceModelBase;
      updateLists();
      updateLinksDslText();

    } else if (newPageIndex == 2) {
      Collection treeViewerContents = (Collection) treeViewer.getInput();

      int numPacksInTree = treeViewerContents.size();
      if (inputMetaModelPaths.size() < numPacksInTree) {
        ArrayList packsToRemove = new ArrayList();

        for (Object tempTreePack : treeViewerContents) {
          boolean packageNeedsDeletion = true;
          for (int i = 0; i < inputMetaModelPaths.size(); i++) {
            if (inputMetaModelPaths.get(i).startsWith("http")) {
              if (inputMetaModelPaths.get(i).compareToIgnoreCase(
                  ((EPackage) tempTreePack).getNsURI()) == 0) {
                packageNeedsDeletion = false;
              }
            } else {
              ResourceSet virtualResourceSet = new ResourceSetImpl();
              Resource metamodelResource = virtualResourceSet.getResource(URI
                  .createPlatformResourceURI(inputMetaModelPaths.get(i), true),
                  true);
              EPackage mmPackage = (EPackage) metamodelResource.getContents()
                  .get(0);
              if (mmPackage.getNsURI().compareToIgnoreCase(
                  ((EPackage) tempTreePack).getNsURI()) == 0) {
                packageNeedsDeletion = false;
              }

            }

          }

          if (packageNeedsDeletion) {
            packsToRemove.add(tempTreePack);

          }

        }
        for (Object packToRemove : packsToRemove) {
          treeViewerContents.remove(packToRemove);
        }

        treeViewer.setInput(treeViewerContents);

        IEditorInput editorInput = getEditorInput();
        FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
        EmfViewsFactory vFac = new EmfViewsFactory();
        org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
            .createURI(fileEditorInput.getPath().toString());
        Resource viewtypeResource = vFac.createResource(emfURI);

        java.net.URI uri = fileEditorInput.getURI();
        try {
          viewtypeResource.load(uri.toURL().openStream(), new HashMap<>());
          ArrayList<EClass> containingClasses = new ArrayList<>();
          ArrayList<EObject> realAttrsToDelete = new ArrayList<>();
          Viewtype theVirtualMM = (Viewtype) viewtypeResource;

          treeViewer.setExpandedElements(containingClasses.toArray());
          treeViewer.setCheckedElements(realAttrsToDelete.toArray());
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

      } else if (inputMetaModelPaths.size() > numPacksInTree) {
        for (String inputmetamodelPath : inputMetaModelPaths) {
          boolean packIsFound = false;
          for (Object tempTreePack : treeViewerContents) {

            EPackage tempPack = (EPackage) tempTreePack;
            if (tempPack.getNsURI()
                .compareToIgnoreCase(inputmetamodelPath) == 0)
              ;
            {
              packIsFound = true;

            }
          }
          if (!packIsFound) {
            ResourceSet theMMResourceSet = new ResourceSetImpl();
          }
        }
      }

    }
  }

  /**
   * Closes all project files on project close.
   */
  @Override
  public void resourceChanged(final IResourceChangeEvent event) {
    if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
      Display.getDefault().asyncExec(new Runnable() {
        @Override
        public void run() {
          IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
          for (int i = 0; i < pages.length; i++) {
            if (((FileEditorInput) viewtypeTextEditor.getEditorInput())
                .getFile().getProject().equals(event.getResource())) {
              IEditorPart editorPart = pages[i]
                  .findEditor(viewtypeTextEditor.getEditorInput());
              pages[i].closeEditor(editorPart, true);
            }
          }
        }
      });
    }
  }

  public void updateAttributesToHide(TreeItem item) {

    if (item.getChecked()) {
      if (elementsToFilter.indexOf(item.getData()) == -1)
        elementsToFilter.add(item.getData());
    } else {
      boolean elimino = false;
      for (int i = 0; i < elementsToFilter.size() && !elimino; i++) {
        if (elementsToFilter.get(i).equals(item.getData())) {
          elementsToFilter.remove(i);
        }

      }
    }

    IDocument theDoc = viewtypeTextEditor.getDocumentProvider()
        .getDocument(viewtypeTextEditor.getEditorInput());
    theDoc.set(theDoc.get());

  }

}
