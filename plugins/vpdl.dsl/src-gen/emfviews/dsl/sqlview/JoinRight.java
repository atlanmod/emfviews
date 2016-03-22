/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Right</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.JoinRight#getMetamodelRight <em>Metamodel Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.JoinRight#getClassRight <em>Class Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinRight()
 * @model
 * @generated
 */
public interface JoinRight extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel Right</b></em>' reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.MetamodelName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel Right</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel Right</em>' reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinRight_MetamodelRight()
   * @model
   * @generated
   */
  EList<MetamodelName> getMetamodelRight();

  /**
   * Returns the value of the '<em><b>Class Right</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Right</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoinRight_ClassRight()
   * @model containment="true"
   * @generated
   */
  EList<emfviews.dsl.sqlview.Class> getClassRight();

} // JoinRight
