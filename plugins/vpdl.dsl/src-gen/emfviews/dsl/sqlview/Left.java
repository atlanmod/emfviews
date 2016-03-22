/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Left#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Left#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Left#getAttributeWhereLeft <em>Attribute Where Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getLeft()
 * @model
 * @generated
 */
public interface Left extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.MetamodelName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getLeft_Metamodel()
   * @model
   * @generated
   */
  EList<MetamodelName> getMetamodel();

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getLeft_Class()
   * @model
   * @generated
   */
  EList<emfviews.dsl.sqlview.Class> getClass_();

  /**
   * Returns the value of the '<em><b>Attribute Where Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Where Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Where Left</em>' containment reference.
   * @see #setAttributeWhereLeft(Attribute)
   * @see emfviews.dsl.sqlview.SqlviewPackage#getLeft_AttributeWhereLeft()
   * @model containment="true"
   * @generated
   */
  Attribute getAttributeWhereLeft();

  /**
   * Sets the value of the '{@link emfviews.dsl.sqlview.Left#getAttributeWhereLeft <em>Attribute Where Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Where Left</em>' containment reference.
   * @see #getAttributeWhereLeft()
   * @generated
   */
  void setAttributeWhereLeft(Attribute value);

} // Left
