/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Left</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.JoinLeft#getMetamodelLeft <em>Metamodel Left</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.JoinLeft#getClassLeft <em>Class Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinLeft()
 * @model
 * @generated
 */
public interface JoinLeft extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel Left</b></em>' reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.MetamodelName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel Left</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Left</em>' reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinLeft_MetamodelLeft()
   * @model
   * @generated
   */
  EList<MetamodelName> getMetamodelLeft();

  /**
   * Returns the value of the '<em><b>Class Left</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Left</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Left</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinLeft_ClassLeft()
   * @model containment="true"
   * @generated
   */
  EList<emfviews.dsl.sqlview.Class> getClassLeft();

} // JoinLeft
