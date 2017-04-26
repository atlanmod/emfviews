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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Association</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getLowerBound
 * <em>Lower Bound</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getUpperBound
 * <em>Upper Bound</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getAssociationTypeName
 * <em>Association Type Name</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getOpposite
 * <em>Opposite</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getSourceElement
 * <em>Source Element</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getTargetElements
 * <em>Target Elements</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getOclExpression
 * <em>Ocl Expression</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getSourceAttribute
 * <em>Source Attribute</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getTargetAttribute
 * <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends VirtualLink {
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_LowerBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getLowerBound
   * <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value
   *          the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>Upper Bound</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Upper Bound</em>' attribute.
   * @see #setUpperBound(int)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_UpperBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getUpperBound
   * <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value
   *          the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

  /**
   * Returns the value of the '<em><b>Association Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Type Name</em>' attribute isn't
   * clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Association Type Name</em>' attribute.
   * @see #setAssociationTypeName(String)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_AssociationTypeName()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  String getAssociationTypeName();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getAssociationTypeName
   * <em>Association Type Name</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value
   *          the new value of the '<em>Association Type Name</em>' attribute.
   * @see #getAssociationTypeName()
   * @generated
   */
  void setAssociationTypeName(String value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Association)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_Opposite()
   * @model ordered="false"
   * @generated
   */
  Association getOpposite();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getOpposite
   * <em>Opposite</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value
   *          the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Association value);

  /**
   * Returns the value of the '<em><b>Source Element</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Source Element</em>' reference.
   * @see #setSourceElement(LinkedElement)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_SourceElement()
   * @model required="true"
   * @generated
   */
  LinkedElement getSourceElement();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getSourceElement
   * <em>Source Element</em>}' reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value
   *          the new value of the '<em>Source Element</em>' reference.
   * @see #getSourceElement()
   * @generated
   */
  void setSourceElement(LinkedElement value);

  /**
   * Returns the value of the '<em><b>Target Elements</b></em>' reference list.
   * The list contents are of type
   * {@link fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Elements</em>' reference list isn't
   * clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target Elements</em>' reference list.
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_TargetElements()
   * @model required="true"
   * @generated
   */
  EList<LinkedElement> getTargetElements();

  /**
   * Returns the value of the '<em><b>Ocl Expression</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocl Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Ocl Expression</em>' attribute.
   * @see #setOclExpression(String)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_OclExpression()
   * @model
   * @generated
   */
  String getOclExpression();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getOclExpression
   * <em>Ocl Expression</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value
   *          the new value of the '<em>Ocl Expression</em>' attribute.
   * @see #getOclExpression()
   * @generated
   */
  void setOclExpression(String value);

  /**
   * Returns the value of the '<em><b>Source Attribute</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Source Attribute</em>' attribute.
   * @see #setSourceAttribute(String)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_SourceAttribute()
   * @model
   * @generated
   */
  String getSourceAttribute();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getSourceAttribute
   * <em>Source Attribute</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value
   *          the new value of the '<em>Source Attribute</em>' attribute.
   * @see #getSourceAttribute()
   * @generated
   */
  void setSourceAttribute(String value);

  /**
   * Returns the value of the '<em><b>Target Attribute</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target Attribute</em>' attribute.
   * @see #setTargetAttribute(String)
   * @see fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage#getAssociation_TargetAttribute()
   * @model
   * @generated
   */
  String getTargetAttribute();

  /**
   * Sets the value of the
   * '{@link fr.inria.atlanmod.emfviews.virtualLinks.Association#getTargetAttribute
   * <em>Target Attribute</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   *
   * @param value
   *          the new value of the '<em>Target Attribute</em>' attribute.
   * @see #getTargetAttribute()
   * @generated
   */
  void setTargetAttribute(String value);

} // Association
