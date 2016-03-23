/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.Generalize#getClassNew <em>Class New</em>}</li>
 *   <li>{@link monoge.dsl.extension.Generalize#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.Generalize#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getGeneralize()
 * @model
 * @generated
 */
public interface Generalize extends Extension
{
  /**
   * Returns the value of the '<em><b>Class New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class New</em>' attribute.
   * @see #setClassNew(String)
   * @see monoge.dsl.extension.ExtensionPackage#getGeneralize_ClassNew()
   * @model
   * @generated
   */
  String getClassNew();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.Generalize#getClassNew <em>Class New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class New</em>' attribute.
   * @see #getClassNew()
   * @generated
   */
  void setClassNew(String value);

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
   * @see monoge.dsl.extension.ExtensionPackage#getGeneralize_Prefix()
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
   * @see monoge.dsl.extension.ExtensionPackage#getGeneralize_Class()
   * @model unique="false"
   * @generated
   */
  EList<String> getClass_();

} // Generalize
