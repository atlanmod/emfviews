/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.Type#getType <em>Type</em>}</li>
 *   <li>{@link monoge.dsl.extension.Type#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.Type#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getType_Type()
   * @model unique="false"
   * @generated
   */
  EList<String> getType();

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' reference list.
   * The list contents are of type {@link monoge.dsl.extension.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getType_Prefix()
   * @model
   * @generated
   */
  EList<Prefix> getPrefix();

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute list.
   * @see monoge.dsl.extension.ExtensionPackage#getType_Class()
   * @model unique="false"
   * @generated
   */
  EList<String> getClass_();

} // Type
