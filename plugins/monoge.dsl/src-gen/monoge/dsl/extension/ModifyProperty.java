/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.ModifyProperty#getProperty <em>Property</em>}</li>
 *   <li>{@link monoge.dsl.extension.ModifyProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getModifyProperty()
 * @model
 * @generated
 */
public interface ModifyProperty extends ModifyOperator
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
   * @see monoge.dsl.extension.ExtensionPackage#getModifyProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.ModifyProperty#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.ValueAssignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getModifyProperty_Value()
   * @model containment="true"
   * @generated
   */
  EList<ValueAssignment> getValue();

} // ModifyProperty
