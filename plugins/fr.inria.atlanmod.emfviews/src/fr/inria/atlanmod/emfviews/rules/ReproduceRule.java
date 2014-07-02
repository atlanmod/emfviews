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

package fr.inria.atlanmod.emfviews.rules;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.core.ViewOperationException;
import fr.inria.atlanmod.emfviews.elements.FilterElement;
import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;

public class ReproduceRule extends TranslationRule {

	public static TranslationRule INSTANCE = new ReproduceRule();

	@SuppressWarnings("unchecked")
	@Override
	public Object get(InternalEObject object, EStructuralFeature feature,
			int index) {
		try {
			ReproduceElementImpl vElement = (ReproduceElementImpl) object;

			View vModel = (View) vElement.eResource();
			if (vModel.getMetamodelManager().isVirtualAssociation(feature)) {
				return vElement.getVirtualAssociation(feature, index);
			}
			EStructuralFeature cFeature = vElement.getConcreteFeature(feature);
			Object value = vElement.getConcreteElement().eGet(cFeature);
			if (feature instanceof EReference) {
				if (feature.isMany()) {
					value = new VirtualModelList<EObject>(object, feature,
							(EList<EObject>) value);
					if (index != NO_INDEX) {
						value = ((VirtualModelList<EObject>) value).get(index);
					}
				} else {
					value = vModel.translateToVirtualElement((EObject) value);
					if (value instanceof FilterElement) {
						value = null;
					}
				}
			} else {
				if (feature.getUpperBound() != 1 && index != NO_INDEX) {
					value = ((List<Object>) value).get(index);
				}
			}
			return value;
		} catch (Exception e) {

		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object set(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		ReproduceElementImpl vElement = (ReproduceElementImpl) object;
		View vModel = (View) vElement.eResource();
		if (vModel.getMetamodelManager().isVirtualAssociation(feature)) {
			return vElement.setVirtualAssociation(feature, index,
					(EObject) value);
		}
		EStructuralFeature cFeature = vElement.getConcreteFeature(feature);
		EObject cElement = vElement.getConcreteElement();
		Object oldValue = null;
		if (feature instanceof EReference) {
			if (feature.getUpperBound() != 1) {
				if (index != NO_INDEX) {
					oldValue = new VirtualModelList<EObject>(object, feature,
							(EList<EObject>) cElement.eGet(cFeature));
					value = ((ReproduceElementImpl) value).getConcreteElement();
					cElement.eSet(cFeature, value);
				} else {
					oldValue = ((EList<EObject>) cElement.eGet(cFeature))
							.get(index);
					oldValue = vModel
							.translateToVirtualElement((EObject) oldValue);
					((EList<EObject>) cElement.eGet(cFeature)).set(index,
							(EObject) value);
				}
			} else {
				oldValue = vModel.translateToVirtualElement((EObject) cElement
						.eGet(cFeature));
				value = ((ReproduceElementImpl) value).getConcreteElement();
				cElement.eSet(cFeature, value);
			}
		} else {
			if (feature.getUpperBound() != 1) {
				if (index == NO_INDEX) {
					oldValue = cElement.eGet(cFeature);
					((List<Object>) cElement.eGet(cFeature)).set(index, value);
				} else {
					List<Object> list = (List<Object>) cElement.eGet(cFeature);
					oldValue = list.get(index);
					list.set(index, value);
				}
			} else {
				oldValue = cElement.eGet(cFeature);
				cElement.eSet(cFeature, value);
			}
		}
		return oldValue;
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		try {
			View vModel = (View) object.eResource();
			ReproduceElementImpl vElement = (ReproduceElementImpl) object;
			if (vModel.getMetamodelManager().isVirtualAssociation(feature)) {
				if (vElement.getVirtualAssociation(feature, NO_INDEX) == null) {
					return false;
				} else {
					return true;
				}
			} else {
				EStructuralFeature cFeature = vModel.getMetamodelManager()
						.translateFromVirtualFeature(vElement, feature);
				EObject cElement = ((ReproduceElementImpl) object)
						.getConcreteElement();
				return cElement.eIsSet(cFeature);
			}
		} catch (Exception e) {

		}
		return false;
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		View vModel = (View) object.eResource();
		ReproduceElementImpl vElement = (ReproduceElementImpl) object;
		EObject cElement = ((ReproduceElementImpl) object).getConcreteElement();
		EStructuralFeature cFeature = vModel.getMetamodelManager()
				.translateFromVirtualFeature(vElement, feature);
		cElement.eUnset(cFeature);
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {

		View vModel = (View) object.eResource();
		ReproduceElementImpl vElement = (ReproduceElementImpl) object;
		EObject cElement = ((ReproduceElementImpl) object).getConcreteElement();
		Object value = cElement.eGet(vModel.getMetamodelManager()
				.translateFromVirtualFeature(vElement, feature));
		return value.hashCode();
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		View vModel = (View) object.eResource();
		EObject cElement = ((ReproduceElementImpl) object).getConcreteElement();
		EObject cContainer = cElement.eContainer();
		EObject vContainer = vModel.translateToVirtualElement(cContainer);
		return (InternalEObject) vContainer;
	}

	public EStructuralFeature getContainingFeature(InternalEObject object) {
		View vModel = (View) object.eResource();
		EObject cElement = ((ReproduceElementImpl) object).getConcreteElement();
		EStructuralFeature vFeature = vModel.getMetamodelManager()
				.translateToVirtualFeature(object,
						cElement.eContainingFeature());

		return vFeature;
	}

	@Override
	public EObject create(EClass eClass) {

		throw new ViewOperationException("EStore.move()");
	}

}
