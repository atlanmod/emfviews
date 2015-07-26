/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Condition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Comparison}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getCondition_Value()
   * @model containment="true"
   * @generated
   */
  EList<Comparison> getValue();

} // Condition
