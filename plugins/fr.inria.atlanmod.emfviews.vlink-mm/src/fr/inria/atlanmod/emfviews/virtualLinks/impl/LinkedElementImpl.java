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
package fr.inria.atlanmod.emfviews.virtualLinks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.LinkedElementImpl#getElementRef <em>Element Ref</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.LinkedElementImpl#getModelRef <em>Model Ref</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.LinkedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.LinkedElementImpl#getEstructuralFeatures <em>Estructural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkedElementImpl extends MinimalEObjectImpl.Container implements LinkedElement {
	/**
	 * The default value of the '{@link #getElementRef() <em>Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementRef() <em>Element Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected String elementRef = ELEMENT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelRef() <em>Model Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelRef() <em>Model Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRef()
	 * @generated
	 * @ordered
	 */
	protected String modelRef = MODEL_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstructuralFeatures() <em>Estructural Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTRUCTURAL_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstructuralFeatures() <em>Estructural Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected String estructuralFeatures = ESTRUCTURAL_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VirtualLinksPackage.Literals.LINKED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementRef() {
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementRef(String newElementRef) {
		String oldElementRef = elementRef;
		elementRef = newElementRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.LINKED_ELEMENT__ELEMENT_REF, oldElementRef, elementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelRef() {
		return modelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRef(String newModelRef) {
		String oldModelRef = modelRef;
		modelRef = newModelRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.LINKED_ELEMENT__MODEL_REF, oldModelRef, modelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.LINKED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstructuralFeatures() {
		return estructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstructuralFeatures(String newEstructuralFeatures) {
		String oldEstructuralFeatures = estructuralFeatures;
		estructuralFeatures = newEstructuralFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.LINKED_ELEMENT__ESTRUCTURAL_FEATURES, oldEstructuralFeatures, estructuralFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VirtualLinksPackage.LINKED_ELEMENT__ELEMENT_REF:
				return getElementRef();
			case VirtualLinksPackage.LINKED_ELEMENT__MODEL_REF:
				return getModelRef();
			case VirtualLinksPackage.LINKED_ELEMENT__NAME:
				return getName();
			case VirtualLinksPackage.LINKED_ELEMENT__ESTRUCTURAL_FEATURES:
				return getEstructuralFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VirtualLinksPackage.LINKED_ELEMENT__ELEMENT_REF:
				setElementRef((String)newValue);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__MODEL_REF:
				setModelRef((String)newValue);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__ESTRUCTURAL_FEATURES:
				setEstructuralFeatures((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VirtualLinksPackage.LINKED_ELEMENT__ELEMENT_REF:
				setElementRef(ELEMENT_REF_EDEFAULT);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__MODEL_REF:
				setModelRef(MODEL_REF_EDEFAULT);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VirtualLinksPackage.LINKED_ELEMENT__ESTRUCTURAL_FEATURES:
				setEstructuralFeatures(ESTRUCTURAL_FEATURES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VirtualLinksPackage.LINKED_ELEMENT__ELEMENT_REF:
				return ELEMENT_REF_EDEFAULT == null ? elementRef != null : !ELEMENT_REF_EDEFAULT.equals(elementRef);
			case VirtualLinksPackage.LINKED_ELEMENT__MODEL_REF:
				return MODEL_REF_EDEFAULT == null ? modelRef != null : !MODEL_REF_EDEFAULT.equals(modelRef);
			case VirtualLinksPackage.LINKED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VirtualLinksPackage.LINKED_ELEMENT__ESTRUCTURAL_FEATURES:
				return ESTRUCTURAL_FEATURES_EDEFAULT == null ? estructuralFeatures != null : !ESTRUCTURAL_FEATURES_EDEFAULT.equals(estructuralFeatures);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (elementRef: ");
		result.append(elementRef);
		result.append(", modelRef: ");
		result.append(modelRef);
		result.append(", name: ");
		result.append(name);
		result.append(", estructuralFeatures: ");
		result.append(estructuralFeatures);
		result.append(')');
		return result.toString();
	}

} //LinkedElementImpl
