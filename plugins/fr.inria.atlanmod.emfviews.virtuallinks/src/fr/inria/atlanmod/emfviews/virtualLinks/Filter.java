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
package fr.inria.atlanmod.emfviews.virtualLinks;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Filter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#getFilteredElement
 * <em>Filtered Element</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#getOclQuery <em>Ocl
 * Query</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#isFilterOnlyEstructuralFeatures
 * <em>Filter Only Estructural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends VirtualLink {
  /**
   * Returns the value of the '<em><b>Filtered Element</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filtered Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Filtered Element</em>' reference.
   * @see #setFilteredElement(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getFilter_FilteredElement()
   * @model required="true"
   * @generated
   */
  LinkedElement getFilteredElement();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#getFilteredElement
   * <em>Filtered Element</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value the new value of the '<em>Filtered Element</em>' reference.
   * @see #getFilteredElement()
   * @generated
   */
  void setFilteredElement(LinkedElement value);

  /**
   * Returns the value of the '<em><b>Ocl Query</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocl Query</em>' attribute isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Ocl Query</em>' attribute.
   * @see #setOclQuery(String)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getFilter_OclQuery()
   * @model
   * @generated
   */
  String getOclQuery();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#getOclQuery <em>Ocl
   * Query</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Ocl Query</em>' attribute.
   * @see #getOclQuery()
   * @generated
   */
  void setOclQuery(String value);

  /**
   * Returns the value of the '<em><b>Filter Only Estructural Features</b></em>'
   * attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter Only Estructural Features</em>' attribute
   * isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Filter Only Estructural Features</em>'
   *         attribute.
   * @see #setFilterOnlyEstructuralFeatures(boolean)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getFilter_FilterOnlyEstructuralFeatures()
   * @model
   * @generated
   */
  boolean isFilterOnlyEstructuralFeatures();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Filter#isFilterOnlyEstructuralFeatures
   * <em>Filter Only Estructural Features</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Filter Only Estructural
   *          Features</em>' attribute.
   * @see #isFilterOnlyEstructuralFeatures()
   * @generated
   */
  void setFilterOnlyEstructuralFeatures(boolean value);

} // Filter
