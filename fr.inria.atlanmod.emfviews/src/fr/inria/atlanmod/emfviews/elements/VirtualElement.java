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

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

import fr.inria.atlanmod.emfviews.rules.TranslationRule;

public abstract class VirtualElement extends EStoreEObjectImpl {

	private TranslationRule translationRule;

	public VirtualElement() {
		super();
	}

	public TranslationRule getTranslationRule() {
		return this.translationRule;
	}

	public void setTranslationRule(TranslationRule rule) {
		this.translationRule = rule;
	}

}
