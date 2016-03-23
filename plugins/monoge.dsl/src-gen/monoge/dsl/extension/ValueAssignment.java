/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.ValueAssignment#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link monoge.dsl.extension.ValueAssignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getValueAssignment()
 * @model
 * @generated
 */
public interface ValueAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see monoge.dsl.extension.ExtensionPackage#getValueAssignment_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.ValueAssignment#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

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
   * @see monoge.dsl.extension.ExtensionPackage#getValueAssignment_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.ValueAssignment#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ValueAssignment
