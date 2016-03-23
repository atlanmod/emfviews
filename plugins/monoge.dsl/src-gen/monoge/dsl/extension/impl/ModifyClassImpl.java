/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.ModifyClass;
import monoge.dsl.extension.ModifyOperator;
import monoge.dsl.extension.Prefix;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modify Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.ModifyClassImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.ModifyClassImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.ModifyClassImpl#getModifyOperators <em>Modify Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModifyClassImpl extends ExtensionImpl implements ModifyClass
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
   * The cached value of the '{@link #getModifyOperators() <em>Modify Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifyOperators()
   * @generated
   * @ordered
   */
  protected EList<ModifyOperator> modifyOperators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModifyClassImpl()
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
    return ExtensionPackage.Literals.MODIFY_CLASS;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtensionPackage.MODIFY_CLASS__PREFIX, oldPrefix, prefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MODIFY_CLASS__PREFIX, oldPrefix, prefix));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MODIFY_CLASS__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModifyOperator> getModifyOperators()
  {
    if (modifyOperators == null)
    {
      modifyOperators = new EObjectContainmentEList<ModifyOperator>(ModifyOperator.class, this, ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS);
    }
    return modifyOperators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS:
        return ((InternalEList<?>)getModifyOperators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExtensionPackage.MODIFY_CLASS__PREFIX:
        if (resolve) return getPrefix();
        return basicGetPrefix();
      case ExtensionPackage.MODIFY_CLASS__CLASS:
        return getClass_();
      case ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS:
        return getModifyOperators();
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
      case ExtensionPackage.MODIFY_CLASS__PREFIX:
        setPrefix((Prefix)newValue);
        return;
      case ExtensionPackage.MODIFY_CLASS__CLASS:
        setClass((String)newValue);
        return;
      case ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS:
        getModifyOperators().clear();
        getModifyOperators().addAll((Collection<? extends ModifyOperator>)newValue);
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
      case ExtensionPackage.MODIFY_CLASS__PREFIX:
        setPrefix((Prefix)null);
        return;
      case ExtensionPackage.MODIFY_CLASS__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS:
        getModifyOperators().clear();
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
      case ExtensionPackage.MODIFY_CLASS__PREFIX:
        return prefix != null;
      case ExtensionPackage.MODIFY_CLASS__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case ExtensionPackage.MODIFY_CLASS__MODIFY_OPERATORS:
        return modifyOperators != null && !modifyOperators.isEmpty();
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

} //ModifyClassImpl
