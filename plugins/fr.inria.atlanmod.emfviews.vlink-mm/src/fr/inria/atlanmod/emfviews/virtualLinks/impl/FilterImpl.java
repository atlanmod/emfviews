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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.inria.atlanmod.emfviews.virtualLinks.Filter;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.FilterImpl#getFilteredElement <em>Filtered Element</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.FilterImpl#getOclQuery <em>Ocl Query</em>}</li>
 *   <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.impl.FilterImpl#isFilterOnlyEstructuralFeatures <em>Filter Only Estructural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterImpl extends VirtualLinkImpl implements Filter {
	/**
	 * The cached value of the '{@link #getFilteredElement() <em>Filtered Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilteredElement()
	 * @generated
	 * @ordered
	 */
	protected LinkedElement filteredElement;

	/**
	 * The default value of the '{@link #getOclQuery() <em>Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String OCL_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOclQuery() <em>Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOclQuery()
	 * @generated
	 * @ordered
	 */
	protected String oclQuery = OCL_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilterOnlyEstructuralFeatures() <em>Filter Only Estructural Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterOnlyEstructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_ONLY_ESTRUCTURAL_FEATURES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterOnlyEstructuralFeatures() <em>Filter Only Estructural Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterOnlyEstructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected boolean filterOnlyEstructuralFeatures = FILTER_ONLY_ESTRUCTURAL_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VirtualLinksPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedElement getFilteredElement() {
		if (filteredElement != null && filteredElement.eIsProxy()) {
			InternalEObject oldFilteredElement = (InternalEObject)filteredElement;
			filteredElement = (LinkedElement)eResolveProxy(oldFilteredElement);
			if (filteredElement != oldFilteredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VirtualLinksPackage.FILTER__FILTERED_ELEMENT, oldFilteredElement, filteredElement));
			}
		}
		return filteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedElement basicGetFilteredElement() {
		return filteredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteredElement(LinkedElement newFilteredElement) {
		LinkedElement oldFilteredElement = filteredElement;
		filteredElement = newFilteredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.FILTER__FILTERED_ELEMENT, oldFilteredElement, filteredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOclQuery() {
		return oclQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOclQuery(String newOclQuery) {
		String oldOclQuery = oclQuery;
		oclQuery = newOclQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.FILTER__OCL_QUERY, oldOclQuery, oclQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterOnlyEstructuralFeatures() {
		return filterOnlyEstructuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterOnlyEstructuralFeatures(boolean newFilterOnlyEstructuralFeatures) {
		boolean oldFilterOnlyEstructuralFeatures = filterOnlyEstructuralFeatures;
		filterOnlyEstructuralFeatures = newFilterOnlyEstructuralFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VirtualLinksPackage.FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES, oldFilterOnlyEstructuralFeatures, filterOnlyEstructuralFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VirtualLinksPackage.FILTER__FILTERED_ELEMENT:
				if (resolve) return getFilteredElement();
				return basicGetFilteredElement();
			case VirtualLinksPackage.FILTER__OCL_QUERY:
				return getOclQuery();
			case VirtualLinksPackage.FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES:
				return isFilterOnlyEstructuralFeatures();
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
			case VirtualLinksPackage.FILTER__FILTERED_ELEMENT:
				setFilteredElement((LinkedElement)newValue);
				return;
			case VirtualLinksPackage.FILTER__OCL_QUERY:
				setOclQuery((String)newValue);
				return;
			case VirtualLinksPackage.FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES:
				setFilterOnlyEstructuralFeatures((Boolean)newValue);
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
			case VirtualLinksPackage.FILTER__FILTERED_ELEMENT:
				setFilteredElement((LinkedElement)null);
				return;
			case VirtualLinksPackage.FILTER__OCL_QUERY:
				setOclQuery(OCL_QUERY_EDEFAULT);
				return;
			case VirtualLinksPackage.FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES:
				setFilterOnlyEstructuralFeatures(FILTER_ONLY_ESTRUCTURAL_FEATURES_EDEFAULT);
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
			case VirtualLinksPackage.FILTER__FILTERED_ELEMENT:
				return filteredElement != null;
			case VirtualLinksPackage.FILTER__OCL_QUERY:
				return OCL_QUERY_EDEFAULT == null ? oclQuery != null : !OCL_QUERY_EDEFAULT.equals(oclQuery);
			case VirtualLinksPackage.FILTER__FILTER_ONLY_ESTRUCTURAL_FEATURES:
				return filterOnlyEstructuralFeatures != FILTER_ONLY_ESTRUCTURAL_FEATURES_EDEFAULT;
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
		result.append(" (oclQuery: ");
		result.append(oclQuery);
		result.append(", filterOnlyEstructuralFeatures: ");
		result.append(filterOnlyEstructuralFeatures);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
