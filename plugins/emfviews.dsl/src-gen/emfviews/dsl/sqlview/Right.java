/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Right#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Right#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Right#getAttributeWhereRight <em>Attribute Where Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Right#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getRight()
 * @model
 * @generated
 */
public interface Right extends EObject
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
   * @see emfviews.dsl.sqlview.SqlviewPackage#getRight_Metamodel()
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
   * @see emfviews.dsl.sqlview.SqlviewPackage#getRight_Class()
   * @model
   * @generated
   */
  EList<emfviews.dsl.sqlview.Class> getClass_();

  /**
   * Returns the value of the '<em><b>Attribute Where Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Where Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Where Right</em>' containment reference.
   * @see #setAttributeWhereRight(Attribute)
   * @see emfviews.dsl.sqlview.SqlviewPackage#getRight_AttributeWhereRight()
   * @model containment="true"
   * @generated
   */
  Attribute getAttributeWhereRight();

  /**
   * Sets the value of the '{@link emfviews.dsl.sqlview.Right#getAttributeWhereRight <em>Attribute Where Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Where Right</em>' containment reference.
   * @see #getAttributeWhereRight()
   * @generated
   */
  void setAttributeWhereRight(Attribute value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see emfviews.dsl.sqlview.SqlviewPackage#getRight_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link emfviews.dsl.sqlview.Right#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Right
