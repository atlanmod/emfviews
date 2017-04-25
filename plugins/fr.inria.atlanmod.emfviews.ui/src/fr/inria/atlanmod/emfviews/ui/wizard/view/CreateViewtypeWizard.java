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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;
import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.util.EmfViewsUtil;

public class CreateViewtypeWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	/**
	 * Wizard page to select the location and name of the new virtual metamodel
	 */
	private WizardNewFileCreationPage simplePage;

	private CreateViewtypeScreen advancedPage;

	private AttributesSelectionPage attSelectionPage;

	
	private IStructuredSelection selection;

	public CreateViewtypeWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.getString("VirtualMetamodelFileWizard.Title")); //$NON-NLS-1$
	}

	/**
	 * The wizard is composed of two pages
	 */
	@Override
	public void addPages() {
		simplePage = new WizardNewFileCreationPage(
				Messages.getString("VirtualMetamodelFileWizard.Page.Name"), selection); //$NON-NLS-1$
		simplePage.setImageDescriptor(EmfViewsUIPlugin
				.getImageDescriptor("VirtualModelWizard.png")); //$NON-NLS-1$

		simplePage.setTitle(Messages
				.getString("VirtualMetamodelFileWizard.Title")); //$NON-NLS-1$
		simplePage.setDescription(Messages
				.getString("VirtualModelFileWizard.Page.Description")); //$NON-NLS-1$
		simplePage.setFileExtension("eviewtype"); //$NON-NLS-1$
		addPage(simplePage);

		advancedPage = new CreateViewtypeScreen(selection);
		addPage(advancedPage);

		attSelectionPage = new AttributesSelectionPage();
		addPage(attSelectionPage);

	}

	@Override
	public void init(IWorkbench currentWorkbench,
			IStructuredSelection structuredSelection) {

		this.selection = structuredSelection;

	}

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {

	}

	@Override
	public boolean performFinish() {

		ResourceSet metaResourceSet = new ResourceSetImpl();

		metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new XMLResourceFactoryImpl());

		IFile viewTypeFile = simplePage.createNewFile();
		IPath viewTypeFolderFullPath = viewTypeFile.getFullPath()
				.removeFileExtension();
		VirtualLinks filterLinks = EmfViewsUtil.createLinksModel();
		Object[] treeElementsSelected = attSelectionPage.getCheckedElements();

		if (treeElementsSelected != null && treeElementsSelected.length > 0) {
			for (Object treeItem : treeElementsSelected) {

				if (treeItem instanceof EStructuralFeature) {
					EStructuralFeature estFeature = (EStructuralFeature) treeItem;
					Filter filter = EmfViewsUtil.createFilter("filter"
							+ estFeature.getEContainingClass().getName(), "",
							true);
					LinkedElement filterLinkedElement = EmfViewsUtil
							.createLinkedElement(estFeature
									.getEContainingClass().getName(),
									estFeature.getEContainingClass()
											.getEPackage().getNsURI(), "//"
											+ estFeature.getEContainingClass()
													.getName(), estFeature
											.getName());
					EmfViewsUtil.associateFilters(filterLinks, filter,
							filterLinkedElement);
				} else if (treeItem instanceof EClass) {
					EClass tempEclass = (EClass) treeItem;
					Filter filter = EmfViewsUtil.createFilter("filter"
							+ tempEclass.getName(), tempEclass.getName()
							+ ".allInstances()", false);
					LinkedElement filterLinkedElement = EmfViewsUtil
							.createLinkedElement(tempEclass.getName(),
									tempEclass.getEPackage().getNsURI(), "//"
											+ tempEclass.getName(), null);
					filter.setFilteredElement(filterLinkedElement);
					filterLinks.getVirtualLinks().add(filter);
					filterLinks.getLinkedElements().add(filterLinkedElement);
					EmfViewsUtil.associateFilters(filterLinks, filter,
							filterLinkedElement);
				}

			}

		}
		
		try {
			EmfViewsUtil.persistLinksModel(filterLinks,
					org.eclipse.emf.common.util.URI
							.createURI(viewTypeFolderFullPath
									.addFileExtension("xmi").toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ArrayList<String> inputMetaModels = advancedPage
					.getInputMetaModelPaths();

			StringBuffer fileContent = new StringBuffer();

			String nsURISs = "";

			for (String nsURI : inputMetaModels) {
				if (nsURI.startsWith("platform:/resource/")) {
					nsURI = nsURI.replace("platform:/resource/", "");
				}
				if (nsURISs.length() > 0) {
					nsURISs += "," + nsURI.toString();
				} else {
					nsURISs = nsURI.toString();
				}
			}
			fileContent.append("contributingMetamodels=");
			fileContent.append(nsURISs);
			fileContent.append("\n");
			String correspondenceModelLine = "correspondenceModel="
					+ org.eclipse.emf.common.util.URI
							.createURI(viewTypeFolderFullPath.addFileExtension(
									"xmi").toString());

			// Up to this point it should serilize a vietype without an ecl file
			// and a links model with filters.
			fileContent.append(correspondenceModelLine);
			fileContent.append("\n");

			serializeViewtype(viewTypeFile, fileContent);
			IProject[] workspaceProjects = ResourcesPlugin.getWorkspace()
					.getRoot().getProjects();
			for (IProject iProject : workspaceProjects) {
				iProject.refreshLocal(IResource.DEPTH_INFINITE, null);

			}

			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			IDE.openEditor(page, viewTypeFile);

			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	private void serializeViewtype(IFile viewTypeFile, StringBuffer fileContent)
			throws CoreException, IOException {
		InputStream stream = new ByteArrayInputStream(fileContent.toString()
				.getBytes());
		if (viewTypeFile.exists()) {
			viewTypeFile.setContents(stream, true, true, null);
		} else {
			viewTypeFile.create(stream, true, null);
		}
		stream.close();
	}

	@Override
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == advancedPage) {
			return advancedPage.isPageComplete();
		}
		return simplePage.isPageComplete();
	}

}
