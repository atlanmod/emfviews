/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.From#getJoin <em>Join</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getFrom()
 * @model
 * @generated
 */
public interface From extends EObject
{
  /**
   * Returns the value of the '<em><b>Join</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Join}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getFrom_Join()
   * @model containment="true"
   * @generated
   */
  EList<Join> getJoin();

} // From
