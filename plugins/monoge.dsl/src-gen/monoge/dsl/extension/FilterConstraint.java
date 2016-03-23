/**
 */
package monoge.dsl.extension;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.FilterConstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getFilterConstraint()
 * @model
 * @generated
 */
public interface FilterConstraint extends ModifyOperator
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
   * @see monoge.dsl.extension.ExtensionPackage#getFilterConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.FilterConstraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

} // FilterConstraint
