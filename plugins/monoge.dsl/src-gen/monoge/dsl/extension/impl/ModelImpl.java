/**
 */
package monoge.dsl.extension.impl;

import java.util.Collection;

import monoge.dsl.extension.Extension;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Metamodel;
import monoge.dsl.extension.Model;
import monoge.dsl.extension.Prefix;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link monoge.dsl.extension.impl.ModelImpl#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.ModelImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.ModelImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link monoge.dsl.extension.impl.ModelImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionName()
   * @generated
   * @ordered
   */
  protected static final String EXTENSION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensionName()
   * @generated
   * @ordered
   */
  protected String extensionName = EXTENSION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetamodel()
   * @generated
   * @ordered
   */
  protected EList<Metamodel> metamodel;

  /**
   * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefix()
   * @generated
   * @ordered
   */
  protected EList<Prefix> prefix;

  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected EList<Extension> extensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return ExtensionPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtensionName()
  {
    return extensionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtensionName(String newExtensionName)
  {
    String oldExtensionName = extensionName;
    extensionName = newExtensionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionPackage.MODEL__EXTENSION_NAME, oldExtensionName, extensionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Metamodel> getMetamodel()
  {
    if (metamodel == null)
    {
      metamodel = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, ExtensionPackage.MODEL__METAMODEL);
    }
    return metamodel;
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
      prefix = new EObjectContainmentEList<Prefix>(Prefix.class, this, ExtensionPackage.MODEL__PREFIX);
    }
    return prefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Extension> getExtensions()
  {
    if (extensions == null)
    {
      extensions = new EObjectContainmentEList<Extension>(Extension.class, this, ExtensionPackage.MODEL__EXTENSIONS);
    }
    return extensions;
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
      case ExtensionPackage.MODEL__METAMODEL:
        return ((InternalEList<?>)getMetamodel()).basicRemove(otherEnd, msgs);
      case ExtensionPackage.MODEL__PREFIX:
        return ((InternalEList<?>)getPrefix()).basicRemove(otherEnd, msgs);
      case ExtensionPackage.MODEL__EXTENSIONS:
        return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
      case ExtensionPackage.MODEL__EXTENSION_NAME:
        return getExtensionName();
      case ExtensionPackage.MODEL__METAMODEL:
        return getMetamodel();
      case ExtensionPackage.MODEL__PREFIX:
        return getPrefix();
      case ExtensionPackage.MODEL__EXTENSIONS:
        return getExtensions();
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
      case ExtensionPackage.MODEL__EXTENSION_NAME:
        setExtensionName((String)newValue);
        return;
      case ExtensionPackage.MODEL__METAMODEL:
        getMetamodel().clear();
        getMetamodel().addAll((Collection<? extends Metamodel>)newValue);
        return;
      case ExtensionPackage.MODEL__PREFIX:
        getPrefix().clear();
        getPrefix().addAll((Collection<? extends Prefix>)newValue);
        return;
      case ExtensionPackage.MODEL__EXTENSIONS:
        getExtensions().clear();
        getExtensions().addAll((Collection<? extends Extension>)newValue);
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
      case ExtensionPackage.MODEL__EXTENSION_NAME:
        setExtensionName(EXTENSION_NAME_EDEFAULT);
        return;
      case ExtensionPackage.MODEL__METAMODEL:
        getMetamodel().clear();
        return;
      case ExtensionPackage.MODEL__PREFIX:
        getPrefix().clear();
        return;
      case ExtensionPackage.MODEL__EXTENSIONS:
        getExtensions().clear();
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
      case ExtensionPackage.MODEL__EXTENSION_NAME:
        return EXTENSION_NAME_EDEFAULT == null ? extensionName != null : !EXTENSION_NAME_EDEFAULT.equals(extensionName);
      case ExtensionPackage.MODEL__METAMODEL:
        return metamodel != null && !metamodel.isEmpty();
      case ExtensionPackage.MODEL__PREFIX:
        return prefix != null && !prefix.isEmpty();
      case ExtensionPackage.MODEL__EXTENSIONS:
        return extensions != null && !extensions.isEmpty();
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
    result.append(" (extensionName: ");
    result.append(extensionName);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
