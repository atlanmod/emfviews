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
package fr.inria.atlanmod.emfviews.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinksdelegator.VirtualLinksDelegator;

public class EView extends View {

	private Properties viewtypeProperties;

	private Resource viewtype;

	public EView(URI uri) {
		super(uri);
	}

	public EView(List<String> contributingModels, String viewtypeUri,
			String correspondenceModelAbsolutePath)
			throws MalformedURLException, IOException {
		super();
		virtualResourceSet = new ResourceSetImpl();

		compositionMetamodelURI = viewtypeUri;
		EmfViewsFactory vFac = new EmfViewsFactory();
		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
				.createURI(viewtypeUri);

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		java.net.URI uri = workspace.getRoot().findMember("/" + viewtypeUri)
				.getLocationURI();
		viewtypeProperties = new Properties();
		viewtypeProperties.load(uri.toURL().openStream());

		String contributingMetamodels = viewtypeProperties
				.getProperty("contributingMetamodels");
		String[] contributingMMs = contributingMetamodels.split(",");
		ArrayList<String> contributingMMsURIs = new ArrayList<>();
		for (String contributingMM : contributingMMs) {
			contributingMMsURIs.add(contributingMM);
		}

		loadContributingMetamodels(contributingMMsURIs);

		viewtype = vFac.createResource(emfURI);
		viewtype.load(uri.toURL().openStream(), new HashMap<Object, Object>());

		metamodelManager = new MetamodelManager(virtualResourceSet
				.getPackageRegistry().values(), viewtype, this);

		loadContributingModels(contributingModels);

		IPath filePath = new Path(correspondenceModelAbsolutePath)
				.removeFileExtension();
		IPath correspondenceModelPath = filePath.addFileExtension("xmi");

		URI linksURI = URI.createFileURI(correspondenceModelPath.toString());
		createCorrespondenceModel(linksURI);
		correspondenceModelPath = correspondenceModelPath.makeRelative();
		correspondenceModelURI = correspondenceModelPath.toString();

		this.vLinkManager = new VirtualLinkManager(correspondenceModelURI, this);
		vLinkManager.initialize();

		setVirtualContents();
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		properties = new Properties();
		properties.load(inputStream);
		virtualResourceSet = new ResourceSetImpl();

		readVirtualCompositionMMProperties();

		loadContributingMetamodels(new ArrayList<String>(
				Arrays.asList(viewtypeProperties.getProperty(
						"contributingMetamodels").split(","))));

		metamodelManager = new MetamodelManager(virtualResourceSet
				.getPackageRegistry().values(), viewtype, this);

		loadContributingModels(new ArrayList<String>(Arrays.asList(properties
				.getProperty("contributingModels").split(","))));

		if (properties.getProperty("correspondenceModelBase") != null) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			java.net.URI linksModelURI = workspace
					.getRoot()
					.findMember(
							"/" + properties.getProperty("correspondenceModel"))
					.getLocationURI();
			try {
				VirtualLinksDelegator vld = new VirtualLinksDelegator(
						properties.getProperty("correspondenceModelBase"));

				vld.createVirtualModelLinks(org.eclipse.emf.common.util.URI
						.createURI(linksModelURI.toString()),
						getContributingModels());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		this.vLinkManager = new VirtualLinkManager(
				properties.getProperty("correspondenceModel"), this);
		vLinkManager.initialize();

		setVirtualContents();
	}

	private void readVirtualCompositionMMProperties()
			throws FileNotFoundException, IOException {
		String virtualMMPath = properties.getProperty("compositionMetamodel");

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		java.net.URI uri = workspace.getRoot().findMember("/" + virtualMMPath)
				.getLocationURI();
		viewtypeProperties = new Properties();
		viewtypeProperties.load(uri.toURL().openStream());

		EmfViewsFactory vFac = new EmfViewsFactory();

		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
				.createURI(virtualMMPath);

		viewtype = vFac.createResource(emfURI);
		viewtype.load(uri.toURL().openStream(), new HashMap<Object, Object>());
	}

	@Override
	public void createCorrespondenceModel(URI modelURI) throws IOException {
		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
		VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks virtualLinksModelLevel = vLinksFactory
				.createVirtualLinks();

		correspondenceModelResource = new XMIResourceImpl();

		correspondenceModelResource.setURI(modelURI);
		correspondenceModelResource.getContents().add(virtualLinksModelLevel);

		Viewtype vm = (Viewtype) viewtype;
		XMIResourceImpl correspondenceBetweenMetaModelResource = vm
				.getCorrespondenceModelResource();

		List<Association> associations = new ArrayList<Association>();

		VirtualLinks virtualLinks = (VirtualLinks) correspondenceBetweenMetaModelResource
				.getContents().get(0);
		EList<VirtualLink> allVirtualLinks = virtualLinks.getVirtualLinks();
		for (VirtualLink virtualLink : allVirtualLinks) {
			if (virtualLink instanceof Association) {
				Association association = (Association) virtualLink;
				associations.add(association);
			}

		}
		for (Association association : associations) {
			LinkedElement sourceElement = association.getSourceElement();
			String sourceCLassName = sourceElement.getName();
			String sourcePackagensURI = sourceElement.getModelRef();

			LinkedElement targetElement = association.getTargetElements()
					.get(0);
			String targetCLassName = targetElement.getName();
			String targetPackagensURI = targetElement.getModelRef();

			String sourceAtt = association.getSourceAttribute();
			String targetAtt = association.getTargetAttribute();
			if (sourceAtt != null && targetAtt != null) {
				Resource sourceResource = getcontributingModel(sourcePackagensURI);
				TreeIterator<EObject> sourceModelContents = sourceResource
						.getAllContents();

				ArrayList<EObject> sourceModelElementsThatConform = new ArrayList<>();
				while (sourceModelContents.hasNext()) {
					EObject eObject = sourceModelContents.next();
					if (eObject.eClass().getName()
							.compareToIgnoreCase(sourceCLassName) == 0) {
						sourceModelElementsThatConform.add(eObject);
					}

				}

				Resource targetResource = getcontributingModel(targetPackagensURI);
				TreeIterator<EObject> targetModelContents = targetResource
						.getAllContents();
				ArrayList<EObject> targetModelElementsThatConform = new ArrayList<>();
				while (targetModelContents.hasNext()) {
					EObject eObject = targetModelContents.next();
					if (eObject.eClass().getName()
							.compareToIgnoreCase(targetCLassName) == 0) {
						targetModelElementsThatConform.add(eObject);
					}

				}
				for (EObject tempSourceElement : sourceModelElementsThatConform) {
					boolean matchFound = false;
					String theSourceAttVal = (String) tempSourceElement
							.eGet(tempSourceElement.eClass()
									.getEStructuralFeature(sourceAtt));

					for (int i = 0; i < targetModelElementsThatConform.size()
							&& !matchFound; i++) {
						EObject tempTargetElement = targetModelElementsThatConform
								.get(i);
						String tempTargetAttVal = (String) tempSourceElement
								.eGet(tempTargetElement.eClass()
										.getEStructuralFeature(targetAtt));
						if (theSourceAttVal
								.compareToIgnoreCase(tempTargetAttVal) == 0) {
							matchFound = true;
							Association associationModelLevel = vLinksFactory
									.createAssociation();
							associationModelLevel
									.setName(association.getName());
							LinkedElement lSource = vLinksFactory
									.createLinkedElement();
							lSource.setModelRef(sourcePackagensURI);
							lSource.setElementRef(sourceResource
									.getURIFragment(tempSourceElement));

							associationModelLevel.setSourceElement(lSource);
							LinkedElement lTarget = vLinksFactory
									.createLinkedElement();
							lTarget.setModelRef(targetPackagensURI);
							lTarget.setElementRef(targetResource
									.getURIFragment(tempTargetElement));

							associationModelLevel.getTargetElements().add(
									lTarget);

							virtualLinksModelLevel.getVirtualLinks().add(
									associationModelLevel);

							virtualLinksModelLevel.getLinkedElements().add(
									lSource);
							virtualLinksModelLevel.getLinkedElements().add(
									lTarget);
						}
					}

				}
			}
		}
		correspondenceModelResource.save(null);

	}

	@Override
	public void serialize(IFile file) throws IOException, CoreException {
		StringBuffer fileContent = new StringBuffer();
		String contributingModelsLine = "contributingModels="
				+ getContributingModelsUris();
		fileContent.append(contributingModelsLine);
		fileContent.append("\n");

		String compositionMetamodelLine = "compositionMetamodel="
				+ compositionMetamodelURI;
		fileContent.append(compositionMetamodelLine);
		fileContent.append("\n");

		String correspondenceModelLine = "correspondenceModel="
				+ correspondenceModelURI;

		fileContent.append(correspondenceModelLine);

		fileContent.append("\n");
		Viewtype vm = (Viewtype) viewtype;
		String correspondenceModelBaseLine = "correspondenceModelBase="
				+ vm.getCorrespondenceModelBase();
		fileContent.append(correspondenceModelBaseLine);

		InputStream stream = openContentStream(fileContent.toString());
		if (file.exists()) {
			file.setContents(stream, true, true, null);
		} else {
			file.create(stream, true, null);
		}
		stream.close();

	}

}
