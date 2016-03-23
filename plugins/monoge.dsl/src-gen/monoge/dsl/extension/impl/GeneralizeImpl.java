/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Generalize;
import monoge.dsl.extension.Prefix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.GeneralizeImpl#getClassNew <em>Class New</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.GeneralizeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.GeneralizeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizeImpl extends ExtensionImpl implements Generalize
{
  /**
   * The default value of the '{@link #getClassNew() <em>Class New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassNew()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassNew() <em>Class New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassNew()
   * @generated
   * @ordered
   */
  protected String classNew = CLASS_NEW_EDEFAULT;

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
  protected GeneralizeImpl()
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
    return ExtensionPackage.Literals.GENERALIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassNew()
  {
    return classNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassNew(String newClassNew)
  {
    String oldClassNew = classNew;
    classNew = newClassNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.GENERALIZE__CLASS_NEW, oldClassNew, classNew));
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
      prefix = new EObjectResolvingEList<Prefix>(Prefix.class, this, ExtensionPackage.GENERALIZE__PREFIX);
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
      class_ = new EDataTypeEList<String>(String.class, this, ExtensionPackage.GENERALIZE__CLASS);
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
      case ExtensionPackage.GENERALIZE__CLASS_NEW:
        return getClassNew();
      case ExtensionPackage.GENERALIZE__PREFIX:
        return getPrefix();
      case ExtensionPackage.GENERALIZE__CLASS:
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
      case ExtensionPackage.GENERALIZE__CLASS_NEW:
        setClassNew((String)newValue);
        return;
      case ExtensionPackage.GENERALIZE__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends Prefix>)newValue);
        return;
      case ExtensionPackage.GENERALIZE__CLASS:
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
      case ExtensionPackage.GENERALIZE__CLASS_NEW:
        setClassNew(CLASS_NEW_EDEFAULT);
        return;
      case ExtensionPackage.GENERALIZE__PREFIX:
        getPrefix().clear();
        return;
      case ExtensionPackage.GENERALIZE__CLASS:
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
      case ExtensionPackage.GENERALIZE__CLASS_NEW:
        return CLASS_NEW_EDEFAULT == null ? classNew != null : !CLASS_NEW_EDEFAULT.equals(classNew);
      case ExtensionPackage.GENERALIZE__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case ExtensionPackage.GENERALIZE__CLASS:
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
    result.append(" (classNew: ");
    result.append(classNew);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //GeneralizeImpl
