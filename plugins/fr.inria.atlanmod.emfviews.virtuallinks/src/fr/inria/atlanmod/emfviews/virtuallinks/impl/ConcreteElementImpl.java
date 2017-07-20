/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.ContributingModel;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Concrete Element</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl#getModel <em>Model</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.ConcreteElementImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteElementImpl extends ElementImpl implements ConcreteElement {
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected ConcreteElementImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.CONCRETE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public ContributingModel getModel() {
    if (eContainerFeatureID() != VirtualLinksPackage.CONCRETE_ELEMENT__MODEL) {
      return null;
    }
    return (ContributingModel) eInternalContainer();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public NotificationChain basicSetModel(ContributingModel newModel, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newModel,
                              VirtualLinksPackage.CONCRETE_ELEMENT__MODEL, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setModel(ContributingModel newModel) {
    if (newModel != eInternalContainer()
        || (eContainerFeatureID() != VirtualLinksPackage.CONCRETE_ELEMENT__MODEL
            && newModel != null)) {
      if (EcoreUtil.isAncestor(this, newModel)) {
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      }
      NotificationChain msgs = null;
      if (eInternalContainer() != null) {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      if (newModel != null) {
        msgs = ((InternalEObject) newModel)
            .eInverseAdd(this, VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS,
                         ContributingModel.class, msgs);
      }
      msgs = basicSetModel(newModel, msgs);
      if (msgs != null) {
        msgs.dispatch();
      }
    } else if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.CONCRETE_ELEMENT__MODEL, newModel,
                                    newModel));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getPath() {
    return path;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setPath(String newPath) {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.CONCRETE_ELEMENT__PATH, oldPath, path));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
                                       NotificationChain msgs) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      if (eInternalContainer() != null) {
        msgs = eBasicRemoveFromContainer(msgs);
      }
      return basicSetModel((ContributingModel) otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
                                          NotificationChain msgs) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      return basicSetModel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      return eInternalContainer()
          .eInverseRemove(this, VirtualLinksPackage.CONTRIBUTING_MODEL__CONCRETE_ELEMENTS,
                          ContributingModel.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      return getModel();
    case VirtualLinksPackage.CONCRETE_ELEMENT__PATH:
      return getPath();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      setModel((ContributingModel) newValue);
      return;
    case VirtualLinksPackage.CONCRETE_ELEMENT__PATH:
      setPath((String) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      setModel((ContributingModel) null);
      return;
    case VirtualLinksPackage.CONCRETE_ELEMENT__PATH:
      setPath(PATH_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case VirtualLinksPackage.CONCRETE_ELEMENT__MODEL:
      return getModel() != null;
    case VirtualLinksPackage.CONCRETE_ELEMENT__PATH:
      return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (path: ");
    result.append(path);
    result.append(')');
    return result.toString();
  }

} // ConcreteElementImpl
