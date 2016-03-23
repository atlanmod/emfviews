/**
 */
package monoge.dsl.extension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link monoge.dsl.extension.Model#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link monoge.dsl.extension.Model#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link monoge.dsl.extension.Model#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.Model#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see monoge.dsl.extension.ExtensionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Extension Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Name</em>' attribute.
   * @see #setExtensionName(String)
   * @see monoge.dsl.extension.ExtensionPackage#getModel_ExtensionName()
   * @model
   * @generated
   */
  String getExtensionName();

  /**
   * Sets the value of the '{@link monoge.dsl.extension.Model#getExtensionName <em>Extension Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension Name</em>' attribute.
   * @see #getExtensionName()
   * @generated
   */
  void setExtensionName(String value);

  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.Metamodel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getModel_Metamodel()
   * @model containment="true"
   * @generated
   */
  EList<Metamodel> getMetamodel();

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.Prefix}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getModel_Prefix()
   * @model containment="true"
   * @generated
   */
  EList<Prefix> getPrefix();

  /**
   * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
   * The list contents are of type {@link monoge.dsl.extension.Extension}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' containment reference list.
   * @see monoge.dsl.extension.ExtensionPackage#getModel_Extensions()
   * @model containment="true"
   * @generated
   */
  EList<Extension> getExtensions();

} // Model
