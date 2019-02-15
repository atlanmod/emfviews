/**
 */
package org.atlanmod.emfviews.virtuallinks;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Virtual
 * Association</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getSource
 * <em>Source</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getTarget
 * <em>Target</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getLowerBound
 * <em>Lower Bound</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getUpperBound
 * <em>Upper Bound</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getOpposite
 * <em>Opposite</em>}</li>
 * <li>{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#isComposition
 * <em>Composition</em>}</li>
 * </ul>
 *
 * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation()
 * @model
 * @generated
 */
public interface VirtualAssociation extends VirtualLink, VirtualElement, Association {
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Concept)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_Source()
   * @model required="true"
   * @generated
   */
  Concept getSource();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getSource
   * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Concept value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Concept)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_Target()
   * @model required="true"
   * @generated
   */
  Concept getTarget();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getTarget
   * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Concept value);

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
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_LowerBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getLowerBound
   * <em>Lower Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
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
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_UpperBound()
   * @model unique="false" required="true" ordered="false"
   * @generated
   */
  int getUpperBound();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getUpperBound
   * <em>Upper Bound</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value the new value of the '<em>Upper Bound</em>' attribute.
   * @see #getUpperBound()
   * @generated
   */
  void setUpperBound(int value);

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
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_Opposite()
   * @model ordered="false"
   * @generated
   */
  Association getOpposite();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#getOpposite
   * <em>Opposite</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Association value);

  /**
   * Returns the value of the '<em><b>Composition</b></em>' attribute. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composition</em>' attribute isn't clear, there
   * really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Composition</em>' attribute.
   * @see #setComposition(boolean)
   * @see org.atlanmod.emfviews.virtuallinks.VirtualLinksPackage#getVirtualAssociation_Composition()
   * @model
   * @generated
   */
  boolean isComposition();

  /**
   * Sets the value of the
   * '{@link org.atlanmod.emfviews.virtuallinks.VirtualAssociation#isComposition
   * <em>Composition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @param value the new value of the '<em>Composition</em>' attribute.
   * @see #isComposition()
   * @generated
   */
  void setComposition(boolean value);

} // VirtualAssociation
