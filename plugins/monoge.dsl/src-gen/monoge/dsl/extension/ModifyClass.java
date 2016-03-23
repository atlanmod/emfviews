/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modify Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.ModifyClass#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.ModifyClass#getClass_ <em>Class</em>}</li>
 *   <li>{@link monoge.dsl.extension.ModifyClass#getModifyOperators <em>Modify Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getModifyClass()
 * @model
 * @generated
 */
public interface ModifyClass extends Extension
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
   * @see monoge.dsl.extension.ExtensionPackage#getModifyClass_Prefix()
   * @model
   * @generated
   */
  Prefix getPrefix();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.ModifyClass#getPrefix <em>Prefix</em>}' reference.
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
   * @see monoge.dsl.extension.ExtensionPackage#getModifyClass_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.ModifyClass#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Modify Operators</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.ModifyOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modify Operators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modify Operators</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getModifyClass_ModifyOperators()
   * @model containment="true"
   * @generated
   */
  EList<ModifyOperator> getModifyOperators();

} // ModifyClass
