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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;
import fr.inria.atlanmod.emfviews.rules.TranslationRule;
import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.elements.FilterElement;

public class LinksProjector {

	private View view;

	public LinksProjector(View view) 
	{
		this.view = view;
	}

	public void load(VirtualLinks virtualLinks)
	{

		List<Association> associations = new ArrayList<Association>();
		List<Filter> filters = new ArrayList<Filter>();
		EList<VirtualLink> links = virtualLinks.getVirtualLinks();
		for (VirtualLink link : links)
		{
			if (link instanceof Association) {
				associations.add((Association) link);
			}
			else if(link instanceof Filter)
			{
				filters.add((Filter)link);
			}
		}
		loadAssociations(associations);
		loadFilters(filters);

	}
	
	private void loadFilters(List<Filter> filters)
	{
		for(Filter filter : filters)
		{
			LinkedElement filterElementLink=filter.getFilteredElement();
			String filterElemetRef = filterElementLink.getElementRef();
			String filterElementModelURI = filterElementLink.getModelRef(); 
			EObject filteredElement = getReferencedObject(filterElemetRef, filterElementModelURI);
			FilterElement filterElement = new FilterElement(filteredElement);
			view.getVirtualLinkManager().setVirtualLink(filteredElement, filterElement);
			
		}
	}

	private void loadAssociations(List<Association> associations) {

		for (Association association : associations) {
			LinkedElement sourceElementLink = association.getSourceElement();
			String sourceElementRef = sourceElementLink.getElementRef();
			String sourceModelURI = sourceElementLink.getModelRef();

			EObject sourceElement = getReferencedObject(sourceElementRef,
					sourceModelURI);

			List<EObject> targetElements = new ArrayList<EObject>();

			for (LinkedElement targetEnd : (List<LinkedElement>) association
					.getTargetElements()) {
				String targetElementRef = targetEnd.getElementRef();
				String targetModelURI = targetEnd.getModelRef();
				targetElements.add(getReferencedObject(targetElementRef,
						targetModelURI));
			}

			ReproduceElementImpl vElement = (ReproduceElementImpl) view
					.getVirtualLinkManager().getVirtualElement(sourceElement);

			String virtualFeatureName = association.getName();
			EStructuralFeature virtualFeature = view
					.getMetamodelManager().getVirtualAssociation(vElement,
							virtualFeatureName);

			vElement.setVirtualAssociation(virtualFeature,
					TranslationRule.NO_INDEX, targetElements);
			vElement.toString();
		}
	}

	private EObject getReferencedObject(String elementRef, String packageNsuri) {
		EObject referencedElement = null;
		List<Resource> contributingModels = view
				.getContributingModels();
		boolean elemFound = false;
		for (int i = 0; i < contributingModels.size() && !elemFound; i++) {
			Resource r = contributingModels.get(i);
			EObject firstElem = r.getContents().get(0);
			if (firstElem.eClass().getEPackage().getNsURI()
					.compareToIgnoreCase(packageNsuri) == 0 && !r.getURI().toString().endsWith("profile.uml")) {
				referencedElement = r.getEObject(elementRef);
				elemFound = true;
			}

		}
		return referencedElement;

	}

	public void save(VirtualLinks correspondenceModel) {

	}

}
