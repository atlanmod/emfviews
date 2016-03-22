/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.Comparison#getLeft <em>Left</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Comparison#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Left}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getComparison_Left()
   * @model containment="true"
   * @generated
   */
  EList<Left> getLeft();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Right}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getComparison_Right()
   * @model containment="true"
   * @generated
   */
  EList<Right> getRight();

} // Comparison
