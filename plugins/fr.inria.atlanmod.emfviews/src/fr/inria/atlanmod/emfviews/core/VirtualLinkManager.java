/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cauê Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.core;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;
import fr.inria.atlanmod.emfviews.elements.VirtualElement;
import fr.inria.atlanmod.emfviews.util.EmfViewsUtil;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

public class VirtualLinkManager {

	private View view;

	private VirtualLinks links;
	
	private Map<EObject, VirtualElement> virtualLinks = new HashMap<EObject, VirtualElement>();
	
	public VirtualLinkManager(String linksModelURI, View vModel)
			throws MalformedURLException, IOException {
		this.view = vModel;

		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;

		XMIResourceImpl linksModel = new XMIResourceImpl();
	
		try 
		{
			if(linksModelURI!=null)
			{
				linksModel.load(EmfViewsUtil.toURI(linksModelURI).toURL().openStream(),
						new HashMap<Object, Object>());

				VirtualLinks virtualLinks = (VirtualLinks) linksModel
						.getContents().get(0);

				this.links = virtualLinks;
			}
				
		} 
		catch (URISyntaxException e1)
		{
			e1.printStackTrace();
		}	
			
	}

	public void initialize() {
		LinksProjector projector = new LinksProjector(view);
		if(links!=null)
			projector.load(links);
	}

	public VirtualLinks getLinks()
	{
		return links;
	}

	public void setVirtualLink(EObject concreteElement,
			VirtualElement virtualElement) {
		virtualLinks.put(concreteElement, virtualElement);
	}

	public EObject getVirtualElement(EObject e) {
		VirtualElement vElem = virtualLinks.get(e);
		if (vElem == null) {
			vElem = new ReproduceElementImpl(view, e);
			virtualLinks.put(e, vElem);
		}
		return vElem;
	}

	public void save() {
		LinksProjector projector = new LinksProjector(view);
		projector.save(links);
	}

}
