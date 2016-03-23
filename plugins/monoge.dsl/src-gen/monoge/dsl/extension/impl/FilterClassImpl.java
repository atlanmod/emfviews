/**
 */
package monoge.dsl.extension.impl;

import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.FilterClass;
import monoge.dsl.extension.Prefix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.FilterClassImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.FilterClassImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterClassImpl extends ExtensionImpl implements FilterClass
{
  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected Prefix prefix;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterClassImpl()
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
    return ExtensionPackage.Literals.FILTER_CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix getPrefix()
  {
    if (prefix != null && prefix.eIsProxy())
    {
      InternalEObject oldPrefix = (InternalEObject)prefix;
      prefix = (Prefix)eResolveProxy(oldPrefix);
      if (prefix != oldPrefix)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionPackage.FILTER_CLASS__PREFIX, oldPrefix, prefix));
      }
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prefix basicGetPrefix()
  {
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefix(Prefix newPrefix)
  {
    Prefix oldPrefix = prefix;
    prefix = newPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FILTER_CLASS__PREFIX, oldPrefix, prefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(String newClass)
  {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.FILTER_CLASS__CLASS, oldClass, class_));
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
      case ExtensionPackage.FILTER_CLASS__PREFIX:
        if (resolve) return getPrefix();
        return basicGetPrefix();
      case ExtensionPackage.FILTER_CLASS__CLASS:
        return getClass_();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExtensionPackage.FILTER_CLASS__PREFIX:
        setPrefix((Prefix)newValue);
        return;
      case ExtensionPackage.FILTER_CLASS__CLASS:
        setClass((String)newValue);
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
      case ExtensionPackage.FILTER_CLASS__PREFIX:
        setPrefix((Prefix)null);
        return;
      case ExtensionPackage.FILTER_CLASS__CLASS:
        setClass(CLASS_EDEFAULT);
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
      case ExtensionPackage.FILTER_CLASS__PREFIX:
        return prefix != null;
      case ExtensionPackage.FILTER_CLASS__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
    result.append(" (class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //FilterClassImpl
