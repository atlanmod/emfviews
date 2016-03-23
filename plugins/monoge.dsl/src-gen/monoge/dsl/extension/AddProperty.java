/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.AddProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddProperty#getType <em>Type</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddProperty#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddProperty#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getAddProperty()
 * @model
 * @generated
 */
public interface AddProperty extends ModifyOperator
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see monoge.dsl.extension.ExtensionPackage#getAddProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.AddProperty#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddProperty_Type()
   * @model containment="true"
   * @generated
   */
  EList<Type> getType();

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddProperty_Cardinality()
   * @model unique="false"
   * @generated
   */
  EList<String> getCardinality();

  /**
   * Returns the value of the '<em><b>Relation Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Type</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getAddProperty_RelationType()
   * @model unique="false"
   * @generated
   */
  EList<String> getRelationType();

} // AddProperty
