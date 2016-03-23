/**
 */
package monoge.dsl.extension;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.FilterClass#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.FilterClass#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getFilterClass()
 * @model
 * @generated
 */
public interface FilterClass extends Extension
{
  /**
   * Returns the value of the '<em><b>Prefix</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' reference.
   * @see #setPrefix(Prefix)
   * @see monoge.dsl.extension.ExtensionPackage#getFilterClass_Prefix()
   * @model
   * @generated
   */
  Prefix getPrefix();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.FilterClass#getPrefix <em>Prefix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' reference.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(Prefix value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see monoge.dsl.extension.ExtensionPackage#getFilterClass_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.FilterClass#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

} // FilterClass
