/**
 */
package monoge.dsl.extension;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.FilterProperty#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getFilterProperty()
 * @model
 * @generated
 */
public interface FilterProperty extends ModifyOperator
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
   * @see monoge.dsl.extension.ExtensionPackage#getFilterProperty_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.FilterProperty#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

} // FilterProperty
