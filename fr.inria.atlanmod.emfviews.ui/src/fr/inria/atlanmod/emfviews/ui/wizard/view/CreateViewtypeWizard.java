package fr.inria.atlanmod.emfviews.ui.wizard.view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
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
import fr.inria.emfviews.core.EmfViewsFactory;
import fr.inria.emfviews.core.Viewtype;

public class CreateViewtypeWizard extends Wizard implements INewWizard,
		IExecutableExtension {

	private EmfViewsFactory vm;

	/**
	 * Wizard page to select the location and name of the new virtual metamodel
	 */
	private WizardNewFileCreationPage simplePage;

	private CreateViewtypeScreen advancedPage;

	private AttributesSelectionPage attSelectionPage;

	/**
	 * 
	 */
	private IStructuredSelection selection;

	public CreateViewtypeWizard() {
		super();
		vm = new EmfViewsFactory();
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

		IFile virtualMetamodelFile = simplePage.createNewFile();
		IPath filePath = virtualMetamodelFile.getFullPath()
				.removeFileExtension();
		IPath atributesToHideMetaModelPath = filePath.addFileExtension("ecore");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		String veamosA = new File(workspace.getRoot().getLocationURI()
				.getPath()).getAbsolutePath();
		String laRuta = veamosA.concat(atributesToHideMetaModelPath.toString());

		URI atributesToHideMetaModelURI = URI.createFileURI(laRuta);
		Resource metaResource = metaResourceSet
				.createResource(atributesToHideMetaModelURI);

		Object[] treeElementsSelected = attSelectionPage.getCheckedElements();
		ArrayList<EClass> completeContainingClasses = new ArrayList<>();
		ArrayList<EClass> containingClasses = new ArrayList<>();
		ArrayList<EPackage> containingEpackages = new ArrayList<>();
		ArrayList<EPackage> completeContainingEpackages = new ArrayList<>();

		EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
		if (treeElementsSelected != null && treeElementsSelected.length > 0) {
			for (Object treeItem : treeElementsSelected) {

				if (treeItem instanceof EStructuralFeature) {
					EStructuralFeature estFeature = (EStructuralFeature) treeItem;

					EStructuralFeature markedEstFeature = null;
					if (estFeature instanceof EAttribute) {
						markedEstFeature = theCoreFactory.createEAttribute();
					} else if (estFeature instanceof EReference) {
						markedEstFeature = theCoreFactory.createEReference();
					}

					markedEstFeature.setName(estFeature.getName());

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
					tempEClass.getEStructuralFeatures().add(markedEstFeature);

				}

			}

			for (EPackage ePackage : containingEpackages) {
				metaResource.getContents().add(ePackage);
			}
		}

		else {
			EPackage tempEpackage = theCoreFactory.createEPackage();
			tempEpackage.setNsURI("Empty");
			tempEpackage.setName("Empty");
			metaResource.getContents().add(tempEpackage);
		}

		try {
			/*
			 * Save the resource
			 */
			metaResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			ArrayList<String> inputMetaModels = advancedPage
					.getInputMetaModelPaths();
			Viewtype virtualMetamodel = (Viewtype) vm.createViewtype(
					inputMetaModels, atributesToHideMetaModelPath.toString());

			virtualMetamodel.serialize(virtualMetamodelFile,
					advancedPage.getdslForLinks());
			IProject[] workspaceProjects = ResourcesPlugin.getWorkspace()
					.getRoot().getProjects();
			for (IProject iProject : workspaceProjects) {
				iProject.refreshLocal(IResource.DEPTH_INFINITE, null);

			}

			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			IDE.openEditor(page, virtualMetamodelFile);

			return true;
		} catch (Exception e) {
			

			e.printStackTrace();
			return false;
		}

		
	}

	@Override
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == advancedPage) {
			return advancedPage.isPageComplete();
		}
		return simplePage.isPageComplete();
	}

}
