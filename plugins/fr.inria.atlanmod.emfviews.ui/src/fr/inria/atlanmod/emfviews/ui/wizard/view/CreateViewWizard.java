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
package fr.inria.atlanmod.emfviews.ui.wizard.view;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import fr.inria.atlanmod.emfviews.core.EView;
import fr.inria.atlanmod.emfviews.core.EmfViewsFactory;
import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.util.EmfViewsUtil;

public class CreateViewWizard extends Wizard
    implements INewWizard, IExecutableExtension {

  /**
   * Wizard page to select the location and name of the new virtual model
   */
  private WizardNewFileCreationPage viewContainerFolderSelectionPage;

  /**
   * Wizard page to select the models and metamodels needed to create the
   * virtual model
   */
  private CreateViewScreen createViewScreen;

  /**
   *
   */
  private IStructuredSelection selection;

  private IFile virtualMetamodel;

  private EmfViewsFactory vm;

  public CreateViewWizard(IFile virtualMetamodel) {

    super();
    this.virtualMetamodel = virtualMetamodel;
    vm = new EmfViewsFactory();
    setNeedsProgressMonitor(true);
    setWindowTitle(Messages.getString("VirtualModelFileWizard.Title")); //$NON-NLS-1$
  }

  /**
   * The wizard is composed of two pages
   */
  @Override
  public void addPages() {
    viewContainerFolderSelectionPage = new WizardNewFileCreationPage(
        Messages.getString("VirtualModelFileWizard.Page.Name"), selection); //$NON-NLS-1$
    viewContainerFolderSelectionPage.setImageDescriptor(
        EmfViewsUIPlugin.getImageDescriptor("VirtualModelWizard.png")); //$NON-NLS-1$

    viewContainerFolderSelectionPage
        .setTitle(Messages.getString("VirtualModelFileWizard.Title")); //$NON-NLS-1$
    viewContainerFolderSelectionPage.setDescription(
        Messages.getString("VirtualModelFileWizard.Page.Description")); //$NON-NLS-1$
    viewContainerFolderSelectionPage.setFileExtension("eview"); //$NON-NLS-1$
    addPage(viewContainerFolderSelectionPage);
    String compositionMetamodel = virtualMetamodel.getFullPath().makeRelative()
        .toString();
    createViewScreen = new CreateViewScreen(compositionMetamodel);

    addPage(createViewScreen);
  }

  @Override
  public void init(IWorkbench currentWorkbench,
                   IStructuredSelection structuredSelection) {

    this.selection = structuredSelection;
  }

  @Override
  public boolean canFinish() {
    if (getContainer().getCurrentPage() == createViewScreen) {
      return createViewScreen.isPageComplete();
    }
    return viewContainerFolderSelectionPage.isPageComplete();
  }

  @Override
  public IWizardPage getNextPage(IWizardPage page) {
    return super.getNextPage(page);
  }

  @Override
  public boolean performFinish() {

    String viewtypePath = createViewScreen.getCompositionMetaModelPath().get(0);

    ArrayList<String> inputmodelsPlatformUris = createViewScreen
        .getInputModelPaths();
    ArrayList<String> relativeInputmodelsUris = new ArrayList<>();
    String contributingModelsToSerialize = "";
    for (String modelPlatformURI : inputmodelsPlatformUris) {
      if (modelPlatformURI.startsWith("platform:/resource/")) {
        String inputModelRelativeURI = modelPlatformURI
            .replace("platform:/resource/", "");
        relativeInputmodelsUris.add(inputModelRelativeURI);
        contributingModelsToSerialize = contributingModelsToSerialize
            + inputModelRelativeURI + ",";
      }
    }
    contributingModelsToSerialize = contributingModelsToSerialize.substring(0,
        contributingModelsToSerialize.length() - 1);
    EView eview;
    try {
      String viewFileWorkspaceRelativePath = viewContainerFolderSelectionPage
          .getContainerFullPath()
          .append(viewContainerFolderSelectionPage.getFileName()).toString();

      IPath filePath = new Path(viewFileWorkspaceRelativePath)
          .removeFileExtension();
      IPath linksModelPath = filePath.addFileExtension("xmi");

      VirtualLinks viewLinks = EmfViewsUtil.createLinksModel();
      EmfViewsUtil.persistLinksModel(viewLinks, org.eclipse.emf.common.util.URI
          .createURI(EmfViewsUtil.toURI(linksModelPath.toString()).toString()));

      eview = (EView) vm.createEView(relativeInputmodelsUris, viewtypePath,
          linksModelPath.toString());

      IFile newViewFile = viewContainerFolderSelectionPage.createNewFile();
      StringBuffer fileContent = new StringBuffer();

      fileContent.append("contributingModels=");
      fileContent.append(contributingModelsToSerialize);
      fileContent.append("\n");
      fileContent.append("compositionMetamodel=");
      fileContent.append(viewtypePath);
      fileContent.append("\n");
      fileContent.append("correspondenceModel=");
      fileContent.append(linksModelPath.toString());
      serializeView(newViewFile, fileContent);

    } catch (Exception e) {
      e.printStackTrace();
    }
    return true;

  }

  private void serializeView(IFile viewFile, StringBuffer fileContent)
      throws CoreException, IOException {
    InputStream stream = new ByteArrayInputStream(
        fileContent.toString().getBytes());
    if (viewFile.exists()) {
      viewFile.setContents(stream, true, true, null);
    } else {
      viewFile.create(stream, true, null);
    }
    stream.close();
  }

  /**
   * {@inheritDoc}
   *
   * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
   *      java.lang.String, java.lang.Object)
   */
  @Override
  public void setInitializationData(IConfigurationElement config,
                                    String propertyName, Object data)
      throws CoreException {

  }

}
