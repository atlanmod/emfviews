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
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.util.EmfViewsUtil;
import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinksdelegator.VirtualLinksDelegator;

public class Viewtype extends ResourceImpl {

	private Properties viewtypeProperties;

	private ResourceSet viewtypeVirtualResourceSet;
	
	private EList<EObject> viewtypeVirtualContents;
	
	private XMIResourceImpl linksModelResource;

	public Viewtype(URI uri) {
		super(uri);
		viewtypeVirtualResourceSet = new ResourceSetImpl();
		resourceSet= new ResourceSetImpl();
	}
	
	@Override
	public EList<EObject> getContents() {
		return viewtypeVirtualContents;
	}

	public XMIResourceImpl getCorrespondenceModelResource() {
		return linksModelResource;
	}

	public Viewtype(List<String> nsURIs) {
		super();
		viewtypeVirtualResourceSet = new ResourceSetImpl();
		String nsURISs = "";

		for (String nsURI : nsURIs) {
			if (nsURISs.length() > 0) {
				nsURISs += "," + nsURI.toString();
			} else {
				nsURISs = nsURI.toString();
			}
		}
		loadContributingMetamodels(nsURISs);
		setVirtualContents();
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {

		viewtypeProperties = new Properties();
		viewtypeProperties.load(inputStream);
		
		String correspondenceModelBaseTemp=viewtypeProperties.getProperty("correspondenceModelBase") ;
		
		if (correspondenceModelBaseTemp != null) 
		{
			try 
			{
				java.net.URI linksModelUri= EmfViewsUtil.toURI(viewtypeProperties.getProperty("correspondenceModel"));
				try
				{
					VirtualLinksDelegator vld = new VirtualLinksDelegator(
							viewtypeProperties.getProperty("correspondenceModelBase"));
					vld.createVirtualMetamodelLinks(org.eclipse.emf.common.util.URI
							.createURI(linksModelUri.toString()));
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			} 
			catch (URISyntaxException e1)
			{
				e1.printStackTrace();
			}
		}
		
		loadContributingMetamodels(viewtypeProperties
				.getProperty("contributingMetamodels"));

		if(viewtypeProperties.getProperty("correspondenceModel")!=null)
			loadLinksModel(viewtypeProperties.getProperty("correspondenceModel"));
		setVirtualContents();
		registerViewtypeMetamodel();
	}

	private void registerViewtypeMetamodel()
	{
		for (EObject  tempi: viewtypeVirtualContents) 
		{
			EPackage p=(EPackage)tempi;
			EPackage.Registry.INSTANCE.put(p.getNsURI(), tempi);	
		}
		
		for (EObject  tempi: viewtypeVirtualContents)
		{
			EPackage p=(EPackage)tempi;
			TreeIterator<EObject> packageContentsIterator=p.eAllContents();
			
			while (packageContentsIterator.hasNext())
			{
				EObject eo=packageContentsIterator.next();
				if(eo.eClass().getName().equals("EDataType"))
				{
					EStructuralFeature sf = eo.eClass().getEStructuralFeature("name");
					EStructuralFeature isf = eo.eClass().getEStructuralFeature("instanceClassName");
					String tname = (String)eo.eGet(sf);
					String icn = (String)eo.eGet(isf);
					
					if(icn==null)
					{
						if(tname.equals("Boolean"))
						{
							icn="boolean";
						}
						else if(tname.equals("Double")|| tname.equals("Real"))
						{
							icn="java.lang.Double";
						}
						else if(tname.equals("Float"))
						{
							icn="java.lang.Float";
						}
						else if(tname.equals("Integer"))
						{
							icn="java.lang.Integer";
						}
						else if(tname.equals("String"))
						{
							icn = "java.lang.String";
						}
						if(icn!=null)
						{
							sf=eo.eClass().getEStructuralFeature("instanceClassName");
							eo.eSet(sf, icn);
						}	
					}	
				}
			}
		}
		
		
	}

	private void loadContributingMetamodels(String contributingModelsURIs) {

		String modelsURIs[] = contributingModelsURIs.split(",");
		for (int i = 0; i < modelsURIs.length; i++) {
			String modelURI = modelsURIs[i];
			if (modelURI.startsWith("http")) {
				EPackage contributingEcoreModelPackage = EPackage.Registry.INSTANCE
						.getEPackage(modelURI);

				Copier copier = new Copier();
				EObject copy = copier.copy(contributingEcoreModelPackage);
				copier.copyReferences();
				EPackage copiedPackage = (EPackage) copy;
				//TODO changing the ns_prefix of the package
				copiedPackage.setNsPrefix(copiedPackage.getNsPrefix()+"_viewtype");
				copiedPackage.setNsURI(copiedPackage.getNsURI()+"/viewtype");
				
				
				EcoreUtil.remove(copiedPackage);
				this.getResourceSet().getPackageRegistry().put(contributingEcoreModelPackage.getNsURI(), contributingEcoreModelPackage);

				ResourceImpl resourceTemp = new ResourceImpl();
				resourceTemp.setURI(URI.createURI(contributingEcoreModelPackage
						.getNsURI()));
				resourceTemp.getContents().add(copiedPackage);

				viewtypeVirtualResourceSet.getPackageRegistry()
						.put(contributingEcoreModelPackage.getNsURI(),
								copiedPackage);

			}
			else if(modelURI.endsWith("profile.uml"))
			{
				Resource metamodelResource = viewtypeVirtualResourceSet.getResource(
						URI.createURI(modelURI), true);
				
				EObject umlProfile=metamodelResource.getContents().get(0);
				EList<EObject> umlProfileContents = umlProfile.eContents();
				EObject firstUmlAnotation=umlProfileContents.get(0);
				EObject firstPackage=firstUmlAnotation.eContents().get(0);
				EPackage mmPackage = (EPackage)firstPackage;
				
				
				this.getResourceSet().getPackageRegistry().put(mmPackage.getNsURI(), mmPackage);
				
				//Ver si hay mas paquetes anidados:
				//registerUmlProfileSubpackages(profilePackage);
				
				Copier copier = new Copier();
				EObject copy = copier.copy(mmPackage);
				
				copier.copyReferences();
				EPackage copiedPackage = (EPackage) copy;
				EcoreUtil.remove(copiedPackage);
				
				// TODO changing the ns_prefix of the package
				//copiedPackage.setNsPrefix(copiedPackage.getNsPrefix()+"_viewtype");
				//copiedPackage.setNsURI(copiedPackage.getNsURI()+"/viewtype");
				copiedPackage.setNsPrefix(copiedPackage.getNsPrefix());
				copiedPackage.setNsURI(copiedPackage.getNsURI());
				
				//contributingEpackages.add(mmPackage);


				viewtypeVirtualResourceSet.getPackageRegistry().put(
						mmPackage.getNsURI(), copiedPackage);
			}
			else if (modelURI.endsWith("ecore"))
			{

				Resource metamodelResource = viewtypeVirtualResourceSet.getResource(
						URI.createURI(modelURI), true);
				EPackage mmPackage = (EPackage) metamodelResource.getContents()
						.get(0);
				this.getResourceSet().getPackageRegistry().put(mmPackage.getNsURI(), mmPackage);
				

				Copier copier = new Copier();
				EObject copy = copier.copy(mmPackage);
				
				copier.copyReferences();
				EPackage copiedPackage = (EPackage) copy;
				EcoreUtil.remove(copiedPackage);
				
				// TODO changing the ns_prefix of the package
				copiedPackage.setNsPrefix(copiedPackage.getNsPrefix()+"_viewtype");
				copiedPackage.setNsURI(copiedPackage.getNsURI()+"/viewtype");

				viewtypeVirtualResourceSet.getPackageRegistry().put(
						mmPackage.getNsURI(), copiedPackage);
			}
		}

	}

	private void loadLinksModel(String correspondenceModelURI)
			throws FileNotFoundException, IOException {

		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
		linksModelResource = new XMIResourceImpl();

		try 
		{
			java.net.URI uri=EmfViewsUtil.toURI(correspondenceModelURI);
			linksModelResource.load(uri.toURL().openStream(),
					new HashMap<Object, Object>());

			linksModelResource.setURI(org.eclipse.emf.common.util.URI
					.createURI(uri.toString()));

			List<Association> associations = new ArrayList<Association>();
			List<Filter> filters = new ArrayList<Filter>();

			VirtualLinks virtualLinks = (VirtualLinks) linksModelResource
					.getContents().get(0);
			EList<VirtualLink> allVirtualLinks = virtualLinks.getVirtualLinks();
			for (VirtualLink virtualLink : allVirtualLinks) {
				if (virtualLink instanceof Association) {
					Association association = (Association) virtualLink;
					associations.add(association);
				}
				else if(virtualLink instanceof Filter)
				{
					Filter filter = (Filter)virtualLink;
					filters.add(filter);
				}
			}
			
			generateVirtualAssociationsFromCorrespondenceLinks(associations);
			filterViewtypeElementsFromFilterLinks(filters);
		}
		catch (URISyntaxException e1) {
			
			e1.printStackTrace();
		}
	}
	
	public void filterViewtypeElementsFromFilterLinks(List<Filter> filters)
	{
		for(Filter filter : filters)
		{
			
				LinkedElement metaclassToFilter = filter.getFilteredElement();
		    	String metaclassRef = metaclassToFilter.getElementRef(); 
		    	String metamodelUri = metaclassToFilter.getModelRef(); 
		    	
		    	EClassifier correctEclass = viewtypeVirtualResourceSet.getPackageRegistry().getEPackage(metamodelUri).getEClassifier(metaclassRef.substring(2));
		    	if(!filter.isFilterOnlyEstructuralFeatures())
				{
		    		EcoreUtil.remove(correctEclass);
		    		hiddenElements.add(getResourceSet().getPackageRegistry().getEPackage(metamodelUri).getEClassifier(correctEclass.getName()));
				}
		    	else
		    	{
		    		String estructuralFeaturesToFilter = filter.getFilteredElement().getEstructuralFeatures();
		    		String[] theParts=estructuralFeaturesToFilter.split(",");
		    		for(int i=0; i <theParts.length;i++)
		    		{
		    			EStructuralFeature featureToRemove = ((EClass)correctEclass).getEStructuralFeature(theParts[i]);
		    			EcoreUtil.remove(featureToRemove);
		    			hiddenElements.add(((EClass)(getResourceSet().getPackageRegistry().getEPackage(metamodelUri).getEClassifier(correctEclass.getName()))).getEStructuralFeature(theParts[i]));
		    		}
		    		
		    	}

		}
		
	}
	
	public ArrayList<EObject> hiddenElements = new ArrayList<>();
	
	
	
	public ArrayList<EObject> getHiddenElements() {
		return hiddenElements;
	}

	public void generateVirtualAssociationsFromCorrespondenceLinks(List<Association> associations)
	{
		for (Association association : associations) {
			LinkedElement sourceElement = association.getSourceElement();
			String sourceElementName = sourceElement.getName();
			String sourcePackageUri = sourceElement.getModelRef();

			EList<LinkedElement> targetElements = association
					.getTargetElements();
			LinkedElement targetElement = targetElements.get(0);

			String targetElementName = targetElement.getName();
			String targetPackageUri = targetElement.getModelRef();

			
			EClass theSourceEClass = (EClass) viewtypeVirtualResourceSet.getPackageRegistry()
					.getEPackage(sourcePackageUri)
					.getEClassifier(sourceElementName);

			EClass theTargetEClass = (EClass) viewtypeVirtualResourceSet.getPackageRegistry()
					.getEPackage(targetPackageUri)
					.getEClassifier(targetElementName);

			EReference theR = EcoreFactory.eINSTANCE.createEReference();
			theR.setName(association.getName());
			theR.setLowerBound(association.getLowerBound());
			theR.setUpperBound(association.getUpperBound());
			theR.setEType(theTargetEClass);

			theSourceEClass.getEStructuralFeatures().add(theR);
		}
	}



	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		VirtualLinksFactory linksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks vLinks = (VirtualLinks) linksModelResource
				.getContents().get(0);
		vLinks.getVirtualLinks().clear();
		vLinks.getLinkedElements().clear();
		linksModelResource.save(new HashMap<String, String>());
		viewtypeProperties.store(outputStream, null);
	}

	private void setVirtualContents() {
		Collection<Object> localPackages = viewtypeVirtualResourceSet
				.getPackageRegistry().values();
		int numPackages = viewtypeVirtualResourceSet.getPackageRegistry().size();
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
		this.viewtypeVirtualContents = new VirtualContents<EObject>(this, sublists);
	}

}
