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

package fr.inria.atlanmod.emfviews.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.rules.TranslationRule;
import fr.inria.atlanmod.emfviews.rules.VirtualModelList;

public class VirtualAssociation {

	private EObject container;
	private List<EObject> referencedElements;
	private EStructuralFeature virtualFeature;

	public VirtualAssociation(EObject container,
			EStructuralFeature virtualFeature, EObject referenceElement) {
		init(container, virtualFeature);
		referencedElements = new ArrayList<EObject>();
		referencedElements.add(referenceElement);
	}

	public VirtualAssociation(EObject container,
			EStructuralFeature virtualFeature, List<EObject> referenceElements) {
		init(container, virtualFeature);
		this.referencedElements = referenceElements;
	}

	private void init(EObject container, EStructuralFeature virtualFeature) {
		this.container = container;
		this.virtualFeature = virtualFeature;
	}

	public EObject getContainingObject() {
		return container;
	}

	@SuppressWarnings("unchecked")
	public Object get(int index) {
		if (virtualFeature.isMany()) {
			if (index == TranslationRule.NO_INDEX) {
				return new VirtualModelList<EObject>(container, virtualFeature,
						referencedElements);
			} else {
				return ((View) container.eResource())
						.translateToVirtualElement(referencedElements
								.get(index));
			}
		} else {
			return ((View) container.eResource())
					.translateToVirtualElement(referencedElements.get(0));
		}
	}

	public Object set(EObject target, int index) {
		if (virtualFeature.isMany()) {
			if (index == TranslationRule.NO_INDEX) {
				referencedElements.add(target);
			} else {
				referencedElements.add(index, target);
			}
		} else {
			this.referencedElements.clear();
			this.referencedElements.add(target);
		}
		return null;
	}

	public void removeTargetElement(EObject target) {
		this.referencedElements.remove(target);
	}

}
