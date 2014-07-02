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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.ITCPConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.security.PasswordCredentialsProvider;

import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinksdelegator.VirtualLinksDelegator;
import fr.inria.atlanmod.emfviews.virtuallinksocldelegate.OclforEmfDelegate;

public abstract class View extends ResourceImpl 
{
	protected Properties viewProperties=new Properties();

	protected ResourceSet virtualResourceSet=new ResourceSetImpl();
	
	protected MetamodelManager metamodelManager;
	
	protected VirtualLinkManager vLinkManager;

	protected EList<EObject> virtualContents;
	
	public View(URI uri) {
		super(uri);
	}

	public View() {
		super();
	}

	public List<Resource> getContributingModels() {
		ArrayList<Resource> contributingModels = new ArrayList<>();
		EList<Resource> allResources = virtualResourceSet.getResources();
		
		for (Resource resource : allResources) {
			if ((resource.getURI().toString().startsWith("platform")||resource.getURI().toString().startsWith("file")||resource.getURI().toString().startsWith("cdo")
					)&& !resource.getURI().toString().endsWith("ecore")) {
				contributingModels.add(resource);
			}

		}

		return contributingModels;
	}

	public MetamodelManager getMetamodelManager() {
		return metamodelManager;
	}

	public VirtualLinkManager getVirtualLinkManager() {
		return vLinkManager;
	}

	@Override
	public EList<EObject> getContents() {
		return virtualContents;
	}
	
	public void registerUmlProfileSubpackages(EPackage profilePackage)
	{
		EList<EPackage> subPackages=profilePackage.getESubpackages();
		if(subPackages.size()>0)
		{
			Iterator<EPackage> subPackIterator=subPackages.iterator();
			while(subPackIterator.hasNext())
			{
				EPackage subPackage=subPackIterator.next();
				virtualResourceSet.getPackageRegistry().put(subPackage.getNsURI(), subPackage);
				registerUmlProfileSubpackages(subPackage);
			}
			
		}
			
	}

	public void generateCorrespondenceLinks(java.net.URI  linksModelURI)
	{
		try
		{
			VirtualLinksDelegator vld = new VirtualLinksDelegator(
					viewProperties.getProperty("correspondenceModelBase"));

			vld.createVirtualModelLinks(org.eclipse.emf.common.util.URI
					.createURI(linksModelURI.toString()),
					getContributingModels());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void generateFilterLinks(VirtualLinks viewtypeLevelVirtualLinks,
			ResourceSet virtualResourceSet, VirtualLinks correspondenceModel, java.net.URI linksModelURI) {
		
		OclforEmfDelegate oclForEmfDelegate = new OclforEmfDelegate(viewtypeLevelVirtualLinks, virtualResourceSet,vLinkManager.getLinks());
		oclForEmfDelegate.createViewFilterLinks();
		oclForEmfDelegate.persistLinksModel(org.eclipse.emf.common.util.URI.createURI(linksModelURI.toString()));
		
	}
	
	protected void loadContributingModels(List<String> contributingModelsPaths) {

		for (String modelURI : contributingModelsPaths)
		{
			URI theModelUri= URI.createURI(modelURI);
			String modelUriSchema=theModelUri.scheme();
			Resource modelResource =null;
			
			if(modelUriSchema==null)
			{
				theModelUri=URI.createPlatformResourceURI(modelURI, true);
				modelResource = virtualResourceSet.getResource(theModelUri, true);
			}
			else if(modelUriSchema.equals("cdo"))
			{
				loadCdoResource(theModelUri);
			}
			else if(modelUriSchema.equals("file"))
			{
				if(theModelUri.toString().endsWith("profile.uml"))
				{
					
					modelResource = virtualResourceSet.getResource(theModelUri, true);
					EObject umlProfile=modelResource.getContents().get(0);
					EList<EObject> umlProfileContents = umlProfile.eContents();
					EObject firstUmlAnotation=umlProfileContents.get(0);
					EObject firstPackage=firstUmlAnotation.eContents().get(0);
					EPackage profilePackage = (EPackage)firstPackage;
					virtualResourceSet.getPackageRegistry().put(profilePackage.getNsURI(), profilePackage);
					registerUmlProfileSubpackages(profilePackage);	
				}
				else
				{
					modelResource = virtualResourceSet.getResource(theModelUri, true);
				}	
			}
		}

	}
	
	public void loadCdoResource(URI modelResourceUri)
	{
		IManagedContainer container=ContainerUtil.createContainer();
		String rawUri=modelResourceUri.toString();
		
	    //Parameters extraction
		String serverLocation=rawUri.substring(rawUri.indexOf("http://")+7,rawUri.indexOf("?"));
	    String repositoryName=rawUri.substring(rawUri.indexOf("repositoryName")+15, rawUri.indexOf("&", rawUri.indexOf("repositoryName")));
	    String modelName=null;
	    if(rawUri.indexOf("&", rawUri.indexOf("resourceName"))!=-1)
	    	modelName=rawUri.substring(rawUri.indexOf("resourceName")+13, rawUri.indexOf("&", rawUri.indexOf("resourceName")));
	    else
	    	modelName=rawUri.substring(rawUri.indexOf("resourceName")+13, rawUri.length());
	    String userName=null;
	    String password=null;
	    PasswordCredentialsProvider credentialsProvider = null;
	    if(rawUri.indexOf("&", rawUri.indexOf("resourceName"))!=-1)
	    {
	    	userName=rawUri.substring(rawUri.indexOf("userName")+9, rawUri.indexOf("&", rawUri.indexOf("userName")));
	    	password=rawUri.substring(rawUri.indexOf("password")+9, rawUri.length());
		    credentialsProvider = new PasswordCredentialsProvider(userName,password);
	    }
	    	
		Net4jUtil.prepareContainer(container); // Register Net4j factories
		TCPUtil.prepareContainer(container); // Register TCP factories
		CDONet4jUtil.prepareContainer(container); // Register CDO factories
		container.activate();
		
		// Create connector
	    ITCPConnector connector = TCPUtil.getConnector(container, serverLocation); //$NON-NLS-1$
		
	    // Create configuration
	    CDONet4jSessionConfiguration configuration = CDONet4jUtil.createNet4jSessionConfiguration();
	    configuration.setConnector(connector);
	    configuration.setRepositoryName(repositoryName); //$NON-NLS-1$
	    if(credentialsProvider!=null)
	    	configuration.setCredentialsProvider(credentialsProvider);
	    
	    // Open session
	    CDOSession session = configuration.openNet4jSession();
	    
	    
	    // Open transaction
	    CDOTransaction transaction = session.openTransaction(session.getBranchManager().getMainBranch().getBranch("Master"));
	    // Get or create resource
	    CDOResource resource = transaction.getResource(modelName); 
	    EList<EObject> resourceContents=resource.getContents();
	    EPackage cdoPackageInstance=resourceContents.get(0).eClass().getEPackage();
	    virtualResourceSet.getResources().add(resource);
	    
	    virtualResourceSet.getPackageRegistry().put(cdoPackageInstance.getNsURI(), cdoPackageInstance);
	       
	}

	protected void loadContributingMetamodels(
			List<String> contributingmetaModelsPaths) {

		for (String metamodelURI : contributingmetaModelsPaths) {
			if (metamodelURI.startsWith("http")) {
				virtualResourceSet.getPackageRegistry().put(metamodelURI,
						EPackage.Registry.INSTANCE.getEPackage(metamodelURI));

			} else if (metamodelURI.endsWith("ecore")) {
				
				Resource metamodelResource = virtualResourceSet
						.getResource(URI.createURI(
								metamodelURI), true);
				
				EList<EObject> contents = metamodelResource.getContents();
				EPackage thePack = (EPackage) contents.iterator().next();
				virtualResourceSet.getPackageRegistry().put(thePack.getNsURI(),
						thePack);
			}
		}

	}

	protected void setVirtualContents() {

		List<Resource> contributingModels = getContributingModels();

		List[] sublists = new List[contributingModels.size()];

		for (int i = 0; i < contributingModels.size(); i++) {

			ArrayList oneOftheSublists = new ArrayList<>();
			oneOftheSublists.add(translateToVirtualElement(contributingModels
					.get(i).getContents().get(0)));
			sublists[i] = oneOftheSublists;
		}

		this.virtualContents = new VirtualContents<EObject>(this, sublists);
	}

	public EObject translateToVirtualElement(EObject e) {
		if (e == null) {
			return null;
		} else {
			return vLinkManager.getVirtualElement(e);
		}
	}

	public InputStream openContentStream(String contents) {
		return new ByteArrayInputStream(contents.getBytes());
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		List<Resource> contributingModels = getContributingModels();
		for (Resource r : contributingModels) {
			r.save(options);
		}
		vLinkManager.save();
		viewProperties.store(outputStream, null);
	}



}
