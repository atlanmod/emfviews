/**
 */
package monoge.dsl.extension;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.AddConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link monoge.dsl.extension.AddConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getAddConstraint()
 * @model
 * @generated
 */
public interface AddConstraint extends ModifyOperator
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see monoge.dsl.extension.ExtensionPackage#getAddConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.AddConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

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
   * @see monoge.dsl.extension.ExtensionPackage#getAddConstraint_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.AddConstraint#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AddConstraint
