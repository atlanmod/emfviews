/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Prefix;
import monoge.dsl.extension.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.TypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.TypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.TypeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<String> type;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<Prefix> prefix;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<String> class_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExtensionPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getType()
  {
    if (type == null)
    {
      type = new EDataTypeEList<String>(String.class, this, ExtensionPackage.TYPE__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Prefix> getPrefix()
  {
    if (prefix == null)
    {
      prefix = new EObjectResolvingEList<Prefix>(Prefix.class, this, ExtensionPackage.TYPE__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EDataTypeEList<String>(String.class, this, ExtensionPackage.TYPE__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExtensionPackage.TYPE__TYPE:
        return getType();
      case ExtensionPackage.TYPE__PREFIX:
        return getPrefix();
      case ExtensionPackage.TYPE__CLASS:
        return getClass_();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtensionPackage.TYPE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends String>)newValue);
        return;
      case ExtensionPackage.TYPE__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends Prefix>)newValue);
        return;
      case ExtensionPackage.TYPE__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.TYPE__TYPE:
        getType().clear();
        return;
      case ExtensionPackage.TYPE__PREFIX:
        getPrefix().clear();
        return;
      case ExtensionPackage.TYPE__CLASS:
        getClass_().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExtensionPackage.TYPE__TYPE:
        return type != null && !type.isEmpty();
      case ExtensionPackage.TYPE__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case ExtensionPackage.TYPE__CLASS:
        return class_ != null && !class_.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
