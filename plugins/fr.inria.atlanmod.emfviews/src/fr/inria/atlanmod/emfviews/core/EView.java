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
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.atlanmod.emfviews.util.EmfViewsUtil;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;

public class EView extends View {

	private Properties viewtypeProperties = new Properties();

	private Resource viewtype;

	public EView(URI uri)
	{
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException 
	{

		viewProperties.load(inputStream);

		loadViewtype();

		loadContributingMetamodels(new ArrayList<String>(
				Arrays.asList(viewtypeProperties.getProperty(
						"contributingMetamodels").split(","))));

		loadContributingModels(new ArrayList<String>(Arrays.asList(viewProperties
				.getProperty("contributingModels").split(","))));
		
		metamodelManager = new MetamodelManager(virtualResourceSet
				.getPackageRegistry().values(), viewtype, this);

		try
		{
			
			String linksModelPath=viewProperties.getProperty("correspondenceModel");
			java.net.URI  linksModelURI =null;
			VirtualLinks viewtypeLevelVirtualLinks = null;
			if(linksModelPath!=null)
			{
				linksModelURI = EmfViewsUtil.toURI(linksModelPath);
				if (viewProperties.getProperty("correspondenceModelBase") != null) 
				{
					generateCorrespondenceLinks(linksModelURI);
				}
				
				viewtypeLevelVirtualLinks = (VirtualLinks)((((Viewtype) viewtype).getCorrespondenceModelResource()).getContents().get(0));
				
			}
			
			this.vLinkManager = new VirtualLinkManager(linksModelPath, this);
			if(viewtypeLevelVirtualLinks!=null)
				generateFilterLinks(viewtypeLevelVirtualLinks, virtualResourceSet,vLinkManager.getLinks(),linksModelURI);
			vLinkManager.initialize();
			setVirtualContents();
			
		} 
		catch (URISyntaxException e1) 
		{
			e1.printStackTrace();
		}		
	}

	private void loadViewtype() throws FileNotFoundException, IOException 
	{
		String viewtypePath = viewProperties.getProperty("compositionMetamodel");
		try
		{
			java.net.URI uri = EmfViewsUtil.toURI(viewtypePath);
			
			viewtypeProperties.load(uri.toURL().openStream());

			org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
					.createURI(viewtypePath);

			viewtype = new EmfViewsFactory().createResource(emfURI);
			viewtype.load(uri.toURL().openStream(), new HashMap<Object, Object>());
			
		} 
		catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
		
		
	}
	
	public EView(List<String> contributingModels, String viewtypeUri,
			String linksModelPath)
			throws Exception {
		super();
		virtualResourceSet = new ResourceSetImpl();
		EmfViewsFactory vFac = new EmfViewsFactory();
		org.eclipse.emf.common.util.URI emfURI = org.eclipse.emf.common.util.URI
				.createURI(viewtypeUri);

		java.net.URI uri =EmfViewsUtil.toURI(viewtypeUri);
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

		this.vLinkManager = new VirtualLinkManager(linksModelPath, this);
		vLinkManager.initialize();

		setVirtualContents();
	}
	
	public Viewtype getViewtype() {
		return (Viewtype)viewtype;
	}
}
