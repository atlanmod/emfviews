/*******************************************************************************
 * Copyright (c) 2011 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cauê Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.emfviews.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.emfviews.elements.ReproduceElementImpl;
import fr.inria.emfviews.elements.VirtualElement;
import fr.inria.emfviews.rules.TranslationRule;

public class LinksProjector {

	private View virtualModel;

	public LinksProjector(View vModel) {

		this.virtualModel = vModel;

	}

	@SuppressWarnings("unchecked")
	public void load(VirtualLinks virtualLinks) {

		List<Association> associations = new ArrayList<Association>();
		List<EObject> merges = new ArrayList<EObject>();
		List<EObject> filters = new ArrayList<EObject>();
		EList<VirtualLink> links = virtualLinks.getVirtualLinks();
		for (VirtualLink link : links) {
			if (link instanceof Association) {
				associations.add((Association) link);
			}
		}
		loadAssociations(associations);

	}

	@SuppressWarnings("unchecked")
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

			ReproduceElementImpl vElement = (ReproduceElementImpl) virtualModel
					.getVirtualLinkManager().getVirtualElement(sourceElement);

			String virtualFeatureName = association.getName();
			EStructuralFeature virtualFeature = virtualModel
					.getMetamodelManager().getVirtualAssociation(vElement,
							virtualFeatureName);

			
			vElement.setVirtualAssociation(virtualFeature,
					TranslationRule.NO_INDEX, targetElements);
			vElement.toString();
		}
	}

	private EObject getReferencedObject(String elementRef, String packageNsuri) {
		EObject referencedElement = null;
		List<Resource> contributingModels = virtualModel
				.getContributingModels();
		boolean elemFound = false;
		for (int i = 0; i < contributingModels.size() && !elemFound; i++) {
			Resource r = contributingModels.get(i);
			EObject firstElem = r.getContents().get(0);
			if (firstElem.eClass().getEPackage().getNsURI()
					.compareToIgnoreCase(packageNsuri) == 0) {
				referencedElement = r.getEObject(elementRef);
				elemFound = true;
			}

		}
		return referencedElement;

	}

	public void save(VirtualLinks correspondenceModel) {

	}

}
