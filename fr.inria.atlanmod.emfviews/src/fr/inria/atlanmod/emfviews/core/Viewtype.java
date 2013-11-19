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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinksdelegator.VirtualLinksDelegator;

public class Viewtype extends ResourceImpl {

	private Properties properties;

	private ResourceSet virtualResourceSet;
	/**
	 * The contents of the virtual model
	 */
	private EList<EObject> virtualContents;

	private ArrayList<EObject> hiddenAttributes;

	public ArrayList<EObject> getHiddenAttributes() {
		return hiddenAttributes;
	}

	private String contributingMetamodels;

	private String filtersMM;

	private String correspondenceModel;
	private String correspondenceModelBase;

	public String getCorrespondenceModelBase() {
		System.out.println("Cuantas veces se retorna: "
				+ correspondenceModelBase);
		return correspondenceModelBase;
	}

	private XMIResourceImpl correspondenceModelResource;

	private ArrayList<EPackage> contributingEpackages;

	public ArrayList<EPackage> getContributingEpackages() {
		return contributingEpackages;
	}

	@Override
	public EList<EObject> getContents() {
		return virtualContents;
	}

	public Viewtype(URI uri) {
		super(uri);
		virtualResourceSet = new ResourceSetImpl();

	}

	public XMIResourceImpl getCorrespondenceModelResource() {
		return correspondenceModelResource;
	}

	public void setCorrespondenceModelResource(
			XMIResourceImpl correspondenceModelResource) {
		this.correspondenceModelResource = correspondenceModelResource;
	}

	public void createCorrespondenceModel(URI modelURI) throws IOException {
		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
		VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks virtualLinks = vLinksFactory.createVirtualLinks();
		correspondenceModelResource = new XMIResourceImpl();

		correspondenceModelResource.setURI(modelURI);
		correspondenceModelResource.getContents().add(virtualLinks);
		correspondenceModelResource.save(null);

	}

	public Viewtype(List<String> nsURIs, String filtersMMUri) {
		super();
		virtualResourceSet = new ResourceSetImpl();
		String nsURISs = "";

		for (String nsURI : nsURIs) {
			if (nsURI.startsWith("platform:/resource/")) {
				nsURI = nsURI.replace("platform:/resource/", "");
			}
			if (nsURISs.length() > 0) {
				nsURISs += "," + nsURI.toString();
			} else {
				nsURISs = nsURI.toString();
			}

		}

		filtersMM = filtersMMUri;
		contributingMetamodels = nsURISs;
		loadFilterMetamodel(filtersMM);
		loadContributingMetamodels(nsURISs);
		setVirtualContents();
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		properties = new Properties();
		properties.load(inputStream);
		if (properties.getProperty("correspondenceModelBase") != null) {
			correspondenceModelBase = properties
					.getProperty("correspondenceModelBase");
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			java.net.URI uri = workspace
					.getRoot()
					.findMember(
							"/" + properties.getProperty("correspondenceModel"))
					.getLocationURI();
			try {
				VirtualLinksDelegator vld = new VirtualLinksDelegator(
						properties.getProperty("correspondenceModelBase"));
				vld.createVirtualMetamodelLinks(org.eclipse.emf.common.util.URI
						.createURI(uri.toString()));
			} catch (CoreException e) {

				e.printStackTrace();
			}
		}
		loadFilterMetamodel(properties.getProperty("filtersMetamodel"));
		loadContributingMetamodels(properties
				.getProperty("contributingMetamodels"));
		loadCorrespondenceModel(properties.getProperty("correspondenceModel"));
		setVirtualContents();
	}

	Resource attributesToHideMM;

	private void loadFilterMetamodel(String filtersMetamodel) {
		ResourceSet filtersResourceSet = new ResourceSetImpl();
		attributesToHideMM = filtersResourceSet.getResource(
				URI.createPlatformResourceURI(filtersMetamodel, true), true);

	}

	public Resource getAttributesToHideMM() {
		return attributesToHideMM;
	}

	private void loadContributingMetamodels(String contributingModelsURIs) {

		hiddenAttributes = new ArrayList<>();
		contributingEpackages = new ArrayList<>();
		EList<EObject> epackagesWithAttsToHide = attributesToHideMM
				.getContents();

		String modelsURIs[] = contributingModelsURIs.split(",");
		for (int i = 0; i < modelsURIs.length; i++) {
			System.out
					.println("Cuantos paquetes hay en el registro de paquetes del metamodelo virtual: "
							+ virtualResourceSet.getPackageRegistry().size());
			String modelURI = modelsURIs[i];
			if (modelURI.startsWith("http")) {
				EPackage contributingEcoreModelPackage = EPackage.Registry.INSTANCE
						.getEPackage(modelURI);

				Copier copier = new Copier();
				EObject copy = copier.copy(contributingEcoreModelPackage);
				copier.copyReferences();
				EPackage copiedPackage = (EPackage) copy;
				EcoreUtil.remove(copiedPackage);
				contributingEpackages.add(contributingEcoreModelPackage);
				for (int j = 0; j < epackagesWithAttsToHide.size(); j++) {
					EPackage tempPack = (EPackage) epackagesWithAttsToHide
							.get(j);
					if (tempPack.getNsURI().compareToIgnoreCase(
							copiedPackage.getNsURI()) == 0) {

						EList<EClassifier> eClassifiersWithItemsToHide = tempPack
								.getEClassifiers();
						for (EClassifier eClassifierWithItemsToHide : eClassifiersWithItemsToHide) {
							EClassifier requiredEclassifier = copiedPackage
									.getEClassifier(eClassifierWithItemsToHide
											.getName());
							EClass eClassWithItemsToHide = (EClass) requiredEclassifier;
							EList<EStructuralFeature> attsToHide = ((EClass) eClassifierWithItemsToHide)
									.getEStructuralFeatures();
							for (EStructuralFeature eAttributeToHide : attsToHide) {
								EStructuralFeature theAtt = eClassWithItemsToHide
										.getEStructuralFeature(eAttributeToHide
												.getName());
								EClassifier originalClassifier = contributingEcoreModelPackage
										.getEClassifier(eClassifierWithItemsToHide
												.getName());
								EClass originalEClass = (EClass) originalClassifier;
								hiddenAttributes
										.add(originalEClass
												.getEStructuralFeature(theAtt
														.getName()));

								eClassWithItemsToHide.getEStructuralFeatures()
										.remove(theAtt);
							}
						}
					}
				}

				ResourceImpl resourceTemp = new ResourceImpl();
				resourceTemp.setURI(URI.createURI(contributingEcoreModelPackage
						.getNsURI()));
				resourceTemp.getContents().add(copiedPackage);

				virtualResourceSet.getPackageRegistry()
						.put(contributingEcoreModelPackage.getNsURI(),
								copiedPackage);

			} else if (modelURI.endsWith("ecore")) {

				Resource metamodelResource = virtualResourceSet.getResource(
						URI.createPlatformResourceURI(modelURI, true), true);
				EPackage mmPackage = (EPackage) metamodelResource.getContents()
						.get(0);

				Copier copier = new Copier();
				EObject copy = copier.copy(mmPackage);
				copier.copyReferences();
				EPackage copiedPackage = (EPackage) copy;
				EcoreUtil.remove(copiedPackage);

				contributingEpackages.add(mmPackage);
				for (int j = 0; j < epackagesWithAttsToHide.size(); j++) {
					EPackage tempPack = (EPackage) epackagesWithAttsToHide
							.get(j);
					if (tempPack.getNsURI().compareToIgnoreCase(
							copiedPackage.getNsURI()) == 0) {

						EList<EClassifier> eClassifiersWithItemsToHide = tempPack
								.getEClassifiers();
						for (EClassifier eClassifierWithItemsToHide : eClassifiersWithItemsToHide) {

							EClassifier requiredEclassifier = copiedPackage
									.getEClassifier(eClassifierWithItemsToHide
											.getName());
							EClass eClassWithItemsToHide = (EClass) requiredEclassifier;

							EList<EStructuralFeature> attsToHide = ((EClass) eClassifierWithItemsToHide)
									.getEStructuralFeatures();

							for (EStructuralFeature eAttributeToHide : attsToHide) {
								EStructuralFeature theAtt = eClassWithItemsToHide
										.getEStructuralFeature(eAttributeToHide
												.getName());

								EClassifier originalClassifier = mmPackage
										.getEClassifier(eClassifierWithItemsToHide
												.getName());
								EClass originalEClass = (EClass) originalClassifier;
								hiddenAttributes
										.add(originalEClass
												.getEStructuralFeature(theAtt
														.getName()));

								eClassWithItemsToHide.getEStructuralFeatures()
										.remove(theAtt);
							}

						}
					}
				}

				virtualResourceSet.getPackageRegistry().put(
						mmPackage.getNsURI(), copiedPackage);

			}
		}

	}

	private void loadCorrespondenceModel(String correspondenceModelURI)
			throws FileNotFoundException, IOException {

		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
		correspondenceModelResource = new XMIResourceImpl();

		IWorkspace workspace = ResourcesPlugin.getWorkspace();

		java.net.URI uri = workspace.getRoot()
				.findMember("/" + correspondenceModelURI).getLocationURI();
		correspondenceModelResource.load(uri.toURL().openStream(),
				new HashMap<Object, Object>());

		correspondenceModelResource.setURI(org.eclipse.emf.common.util.URI
				.createURI(uri.toString()));

		List<Association> associations = new ArrayList<Association>();

		VirtualLinks virtualLinks = (VirtualLinks) correspondenceModelResource
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
			String sourceElementName = sourceElement.getName();
			String sourcePackageUri = sourceElement.getModelRef();

			EList<LinkedElement> targetElements = association
					.getTargetElements();
			LinkedElement targetElement = targetElements.get(0);

			String targetElementName = targetElement.getName();
			String targetPackageUri = targetElement.getModelRef();

			EPackage sourcePackage = virtualResourceSet.getPackageRegistry()
					.getEPackage(sourcePackageUri);
			EClass theSourceEClass = (EClass) sourcePackage
					.getEClassifier(sourceElementName);

			EPackage targetPackage = virtualResourceSet.getPackageRegistry()
					.getEPackage(targetPackageUri);
			EClass theTargetEClass = (EClass) targetPackage
					.getEClassifier(targetElementName);

			EReference theR = EcoreFactory.eINSTANCE.createEReference();
			theR.setName(association.getName());
			theR.setLowerBound(association.getLowerBound());
			theR.setUpperBound(association.getUpperBound());
			theR.setEType(theTargetEClass);

			EAnnotation theAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			theAnnotation.setSource("va");

			theR.getEAnnotations().add(theAnnotation);

			if (association.getSourceAttribute() != null
					&& association.getSourceAttribute() != ""
					&& association.getTargetAttribute() != null
					&& association.getTargetAttribute() != "") {
				EStringToStringMapEntryImpl detailSource = (EStringToStringMapEntryImpl) EcoreFactory.eINSTANCE
						.create(EcorePackage.eINSTANCE
								.getEStringToStringMapEntry());
				detailSource.setKey("source");
				detailSource.setValue(association.getSourceAttribute());
				EStringToStringMapEntryImpl detailTarget = (EStringToStringMapEntryImpl) EcoreFactory.eINSTANCE
						.create(EcorePackage.eINSTANCE
								.getEStringToStringMapEntry());
				detailTarget.setKey("target");
				detailTarget.setValue(association.getTargetAttribute());
				theAnnotation.getDetails().add(detailSource);
				theAnnotation.getDetails().add(detailTarget);
			}

			theSourceEClass.getEStructuralFeatures().add(theR);
		}

	}

	public void serialize(IFile file, String dslTechnology) throws IOException,
			CoreException {
		StringBuffer fileContent = new StringBuffer();
		String contributingMetamodelsLine = "contributingMetamodels="
				+ contributingMetamodels;
		fileContent.append(contributingMetamodelsLine);
		fileContent.append("\n");
		if (correspondenceModel == null) {
			IPath filePath = file.getFullPath().removeFileExtension();
			IPath correspondenceModelPath = filePath.addFileExtension("xmi");

			URI linksURI = URI
					.createFileURI(correspondenceModelPath.toString());
			createCorrespondenceModel(linksURI);
			correspondenceModelPath = correspondenceModelPath.makeRelative();
			correspondenceModel = correspondenceModelPath.toString();
		}

		if (dslTechnology.compareToIgnoreCase("none") != 0
				&& correspondenceModelBase == null) {

			IPath modelBasePath = file.getFullPath().removeFileExtension()
					.addFileExtension("ecl");

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			String veamosA = new File(workspace.getRoot().getLocationURI()
					.getPath()).getAbsolutePath();
			String laRuta = veamosA.concat(modelBasePath.toString());

			correspondenceModelBase = modelBasePath.toString();

			File fileModelBase = new File(laRuta);
			System.out.println("Veamos: " + modelBasePath);
			fileModelBase.createNewFile();

			String correspondenceModelLine = "correspondenceModel="
					+ correspondenceModel;

			fileContent.append(correspondenceModelLine);
			fileContent.append("\n");

			String correspondenceModelBaseLine = "correspondenceModelBase="
					+ correspondenceModel.replaceAll("xmi", dslTechnology);
			fileContent.append(correspondenceModelBaseLine);
			fileContent.append("\n");
			String filtersMetamodelLine = "filtersMetamodel=" + filtersMM;
			fileContent.append(filtersMetamodelLine);

			InputStream stream = openContentStream(fileContent.toString());
			if (file.exists()) {
				file.setContents(stream, true, true, null);
			} else {
				file.create(stream, true, null);
			}
			stream.close();
		}

	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		VirtualLinksFactory linksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks vLinks = (VirtualLinks) correspondenceModelResource
				.getContents().get(0);
		vLinks.getVirtualLinks().clear();
		vLinks.getLinkedElements().clear();
		correspondenceModelResource.save(new HashMap<String, String>());
		properties.store(outputStream, null);
	}

	private void setVirtualContents() {
		Collection<Object> localPackages = virtualResourceSet
				.getPackageRegistry().values();
		int numPackages = virtualResourceSet.getPackageRegistry().size();
		List[] sublists = new List[numPackages];
		int i = 0;

		for (Object object : localPackages) {
			if (object instanceof EPackage) {
				ArrayList oneOftheSublists = new ArrayList<>();
				oneOftheSublists.add(object);
				sublists[i] = oneOftheSublists;
				i++;
			}
		}

		this.virtualContents = new VirtualContents<EObject>(this, sublists);

	}

	private InputStream openContentStream(String contents) {
		return new ByteArrayInputStream(contents.getBytes());
	}

}
