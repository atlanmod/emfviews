/**
 */
package emfviews.dsl.sqlview;

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
 *   <li>{@link emfviews.dsl.sqlview.Model#getViewName <em>View Name</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Model#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.Model#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>View Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Name</em>' attribute.
   * @see #setViewName(String)
   * @see emfviews.dsl.sqlview.SqlviewPackage#getModel_ViewName()
   * @model
   * @generated
   */
  String getViewName();

  /**
   * Sets the value of the '{@link emfviews.dsl.sqlview.Model#getViewName <em>View Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View Name</em>' attribute.
   * @see #getViewName()
   * @generated
   */
  void setViewName(String value);

  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Metamodel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getModel_Metamodel()
   * @model containment="true"
   * @generated
   */
  EList<Metamodel> getMetamodel();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getModel_Expression()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpression();

} // Model
