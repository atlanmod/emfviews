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
package fr.inria.atlanmod.emfviews.ui.wizard.emfviewsproject;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

import fr.inria.atlanmod.emfviews.ui.Messages;
import fr.inria.atlanmod.emfviews.ui.EmfViewsUIPlugin;

public class EmfViewsProjectCreator extends Wizard implements INewWizard,
		IExecutableExtension {
	protected WizardNewProjectCreationPage page;

	protected IConfigurationElement configElement;

	public EmfViewsProjectCreator() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle(Messages.getString("VirtualEMFProjectCreator.Page.Name")); //$NON-NLS-1$
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		page = new WizardNewProjectCreationPage(
				Messages.getString("VirtualEMFProjectCreator.Page.Name")); //$NON-NLS-1$
		page.setTitle(Messages.getString("VirtualEMFProjectCreator.Title")); //$NON-NLS-1$
		page.setDescription(Messages
				.getString("VirtualEMFProjectCreator.Page.Description")); //$NON-NLS-1$
		page.setImageDescriptor(EmfViewsUIPlugin
				.getImageDescriptor("VirtualModelWizard.png")); //$NON-NLS-1$
		addPage(page);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		IWorkspaceRunnable create = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = ResourcesPlugin.getWorkspace().getRoot()
						.getProject(page.getProjectName());
				IPath location = page.getLocationPath();
				if (!project.exists()) {
					IProjectDescription desc = project.getWorkspace()
							.newProjectDescription(page.getProjectName());
					if (location != null
							&& ResourcesPlugin.getWorkspace().getRoot()
									.getLocation().equals(location)) {
						location = null;
					}
					desc.setLocation(location);
					project.create(desc, monitor);

				}
				if (!project.isOpen()) {
					project.open(monitor);
				}

				String[] paths = { "views", //$NON-NLS-1$
						"models",//$NON-NLS-1$
						"viewtypes",//$NON-NLS-1$
						"metamodels"//$NON-NLS-1$

				};
				addToProjectStructure(project, paths);
				project.open(monitor);
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(create, null);
			return true;
		} catch (CoreException e) {
			IStatus status = new Status(IStatus.ERROR,
					EmfViewsUIPlugin.PLUGIN_ID, IStatus.OK, e.getMessage(), e);
			return false;
		}

	}

	private void addToProjectStructure(IProject project, String[] paths) {

		for (String path : paths) {
			IFolder etcFolders = project.getFolder(path);
			try {
				createFolder(etcFolders);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void createFolder(IFolder folder) throws CoreException {
		IContainer parent = folder.getParent();
		if (parent instanceof IFolder) {
			createFolder((IFolder) parent);
		}
		if (!folder.exists()) {
			folder.create(false, true, null);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 *      org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
	 *      java.lang.String, java.lang.Object)
	 */
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.configElement = config;
	}
}
