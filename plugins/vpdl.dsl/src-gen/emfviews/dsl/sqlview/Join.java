/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Join#getJoinLeft <em>Join Left</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Join#getJoinRight <em>Join Right</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Join#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject
{
  /**
   * Returns the value of the '<em><b>Join Left</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.JoinLeft}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Left</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Left</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoin_JoinLeft()
   * @model containment="true"
   * @generated
   */
  EList<JoinLeft> getJoinLeft();

  /**
   * Returns the value of the '<em><b>Join Right</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.JoinRight}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Right</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoin_JoinRight()
   * @model containment="true"
   * @generated
   */
  EList<JoinRight> getJoinRight();

  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getJoin_Relation()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelation();

} // Join
