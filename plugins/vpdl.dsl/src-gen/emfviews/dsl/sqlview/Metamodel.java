/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Metamodel#getMetamodelURL <em>Metamodel URL</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Metamodel#getMetamodelName <em>Metamodel Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel URL</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel URL</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel URL</em>' attribute list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getMetamodel_MetamodelURL()
   * @model unique="false"
   * @generated
   */
  EList<String> getMetamodelURL();

  /**
   * Returns the value of the '<em><b>Metamodel Name</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.MetamodelName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Name</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getMetamodel_MetamodelName()
   * @model containment="true"
   * @generated
   */
  EList<MetamodelName> getMetamodelName();

} // Metamodel
