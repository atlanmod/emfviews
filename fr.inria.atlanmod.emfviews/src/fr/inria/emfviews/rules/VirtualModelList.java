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

package fr.inria.emfviews.rules;

import java.util.AbstractList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.emfviews.core.View;

public class VirtualModelList<E> extends AbstractList<E> implements EList<E> {
	// public class VirtualModelList<E> extends BasicEStoreEList<E> implements
	// EList<E> {

	private List<E>[] subLists;
	private View virtualModel;

	public VirtualModelList(EObject object, EStructuralFeature feature,
			List<E>... subLists) {
		// super((InternalEObject) object, feature);
		this.subLists = subLists;
		this.virtualModel = (View) object.eResource();
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index >= 0) {
			for (int i = 0; i < this.subLists.length; i++) {
				if (index < subListSize(subLists[i])) {
					for (int k = 0; k <= index; k++) {
						EObject concreteEO = (EObject) subLists[i].get(k);
						EObject virtualEO = virtualModel
								.getVirtualLinkManager().getVirtualElement(
										concreteEO);
						
					}
					return (E) virtualModel
							.translateToVirtualElement((EObject) subLists[i]
									.get(index));
				} else {
					index -= subListSize(subLists[i]);
				}
			}
		}
		throw new IndexOutOfBoundsException();
	}

	@Override
	public int size() {
		int count = 0;
		for (int i = 0; i < subLists.length; i++) {
			count += subListSize(subLists[i]);
		}
		return count;
	}

	private int subListSize(List<E> list) {
		int count = 0;
		for (E e : list) {
			EObject eo = (EObject) virtualModel.getVirtualLinkManager()
					.getVirtualElement((EObject) e);
		
		}
		return count;
	}

	@Override
	public void move(int newPosition, E object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E move(int newPosition, int oldPosition) {
		throw new UnsupportedOperationException();
	}
}
