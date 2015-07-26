/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Expression#getSelect <em>Select</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Expression#getFrom <em>From</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Expression#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Select}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Select</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getExpression_Select()
   * @model containment="true"
   * @generated
   */
  EList<Select> getSelect();

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.From}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getExpression_From()
   * @model containment="true"
   * @generated
   */
  EList<From> getFrom();

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getExpression_Condition()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getCondition();

} // Expression
