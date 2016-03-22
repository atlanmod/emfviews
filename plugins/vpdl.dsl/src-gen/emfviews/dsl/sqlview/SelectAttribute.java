/**
 */
package emfviews.dsl.sqlview;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emfviews.dsl.sqlview.SelectAttribute#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.SelectAttribute#getClass_ <em>Class</em>}</li>
 *   <li>{@link emfviews.dsl.sqlview.SelectAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see emfviews.dsl.sqlview.SqlviewPackage#getSelectAttribute()
 * @model
 * @generated
 */
public interface SelectAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Metamodel</b></em>' reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.MetamodelName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metamodel</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metamodel</em>' reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getSelectAttribute_Metamodel()
   * @model
   * @generated
   */
  EList<MetamodelName> getMetamodel();

  /**
   * Returns the value of the '<em><b>Class</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getSelectAttribute_Class()
   * @model containment="true"
   * @generated
   */
  EList<emfviews.dsl.sqlview.Class> getClass_();

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link emfviews.dsl.sqlview.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see emfviews.dsl.sqlview.SqlviewPackage#getSelectAttribute_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // SelectAttribute
