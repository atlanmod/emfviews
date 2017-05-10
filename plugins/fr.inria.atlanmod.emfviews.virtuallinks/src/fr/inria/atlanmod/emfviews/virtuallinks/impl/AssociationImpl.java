/**
 */
package fr.inria.atlanmod.emfviews.virtuallinks.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Association</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getLowerBound
 * <em>Lower Bound</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getUpperBound
 * <em>Upper Bound</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getAssociationTypeName
 * <em>Association Type Name</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getOpposite
 * <em>Opposite</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getSourceElement
 * <em>Source Element</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getTargetElements
 * <em>Target Elements</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getOclExpression
 * <em>Ocl Expression</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getSourceAttribute
 * <em>Source Attribute</em>}</li>
 * <li>{@link fr.inria.atlanmod.emfviews.virtuallinks.impl.AssociationImpl#getTargetAttribute
 * <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends VirtualLinkImpl implements Association {
  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperBound() <em>Upper Bound</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected static final int UPPER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getUpperBound()
   * @generated
   * @ordered
   */
  protected int upperBound = UPPER_BOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getAssociationTypeName() <em>Association
   * Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getAssociationTypeName()
   * @generated
   * @ordered
   */
  protected static final String ASSOCIATION_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssociationTypeName() <em>Association
   * Type Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getAssociationTypeName()
   * @generated
   * @ordered
   */
  protected String associationTypeName = ASSOCIATION_TYPE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}'
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected Association opposite;

  /**
   * The cached value of the '{@link #getSourceElement() <em>Source
   * Element</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getSourceElement()
   * @generated
   * @ordered
   */
  protected LinkedElement sourceElement;

  /**
   * The cached value of the '{@link #getTargetElements() <em>Target
   * Elements</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @see #getTargetElements()
   * @generated
   * @ordered
   */
  protected EList<LinkedElement> targetElements;

  /**
   * The default value of the '{@link #getOclExpression() <em>Ocl
   * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getOclExpression()
   * @generated
   * @ordered
   */
  protected static final String OCL_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOclExpression() <em>Ocl
   * Expression</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getOclExpression()
   * @generated
   * @ordered
   */
  protected String oclExpression = OCL_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getSourceAttribute() <em>Source
   * Attribute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getSourceAttribute()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceAttribute() <em>Source
   * Attribute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getSourceAttribute()
   * @generated
   * @ordered
   */
  protected String sourceAttribute = SOURCE_ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetAttribute() <em>Target
   * Attribute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getTargetAttribute()
   * @generated
   * @ordered
   */
  protected static final String TARGET_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetAttribute() <em>Target
   * Attribute</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @see #getTargetAttribute()
   * @generated
   * @ordered
   */
  protected String targetAttribute = TARGET_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  protected AssociationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return VirtualLinksPackage.Literals.ASSOCIATION;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getLowerBound() {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setLowerBound(int newLowerBound) {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__LOWER_BOUND, oldLowerBound,
                                    lowerBound));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getUpperBound() {
    return upperBound;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setUpperBound(int newUpperBound) {
    int oldUpperBound = upperBound;
    upperBound = newUpperBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__UPPER_BOUND, oldUpperBound,
                                    upperBound));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getAssociationTypeName() {
    return associationTypeName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setAssociationTypeName(String newAssociationTypeName) {
    String oldAssociationTypeName = associationTypeName;
    associationTypeName = newAssociationTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__ASSOCIATION_TYPE_NAME,
                                    oldAssociationTypeName, associationTypeName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Association getOpposite() {
    if (opposite != null && opposite.eIsProxy()) {
      InternalEObject oldOpposite = (InternalEObject) opposite;
      opposite = (Association) eResolveProxy(oldOpposite);
      if (opposite != oldOpposite) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.ASSOCIATION__OPPOSITE, oldOpposite,
                                        opposite));
      }
    }
    return opposite;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public Association basicGetOpposite() {
    return opposite;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setOpposite(Association newOpposite) {
    Association oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__OPPOSITE, oldOpposite,
                                    opposite));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public LinkedElement getSourceElement() {
    if (sourceElement != null && sourceElement.eIsProxy()) {
      InternalEObject oldSourceElement = (InternalEObject) sourceElement;
      sourceElement = (LinkedElement) eResolveProxy(oldSourceElement);
      if (sourceElement != oldSourceElement) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                                        VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT,
                                        oldSourceElement, sourceElement));
      }
    }
    return sourceElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  public LinkedElement basicGetSourceElement() {
    return sourceElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setSourceElement(LinkedElement newSourceElement) {
    LinkedElement oldSourceElement = sourceElement;
    sourceElement = newSourceElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT,
                                    oldSourceElement, sourceElement));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<LinkedElement> getTargetElements() {
    if (targetElements == null) {
      targetElements =
          new EObjectResolvingEList<>(LinkedElement.class, this,
                                                   VirtualLinksPackage.ASSOCIATION__TARGET_ELEMENTS);
    }
    return targetElements;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getOclExpression() {
    return oclExpression;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setOclExpression(String newOclExpression) {
    String oldOclExpression = oclExpression;
    oclExpression = newOclExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__OCL_EXPRESSION,
                                    oldOclExpression, oclExpression));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getSourceAttribute() {
    return sourceAttribute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setSourceAttribute(String newSourceAttribute) {
    String oldSourceAttribute = sourceAttribute;
    sourceAttribute = newSourceAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__SOURCE_ATTRIBUTE,
                                    oldSourceAttribute, sourceAttribute));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getTargetAttribute() {
    return targetAttribute;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setTargetAttribute(String newTargetAttribute) {
    String oldTargetAttribute = targetAttribute;
    targetAttribute = newTargetAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
                                    VirtualLinksPackage.ASSOCIATION__TARGET_ATTRIBUTE,
                                    oldTargetAttribute, targetAttribute));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case VirtualLinksPackage.ASSOCIATION__LOWER_BOUND:
      return getLowerBound();
    case VirtualLinksPackage.ASSOCIATION__UPPER_BOUND:
      return getUpperBound();
    case VirtualLinksPackage.ASSOCIATION__ASSOCIATION_TYPE_NAME:
      return getAssociationTypeName();
    case VirtualLinksPackage.ASSOCIATION__OPPOSITE:
      if (resolve)
        return getOpposite();
      return basicGetOpposite();
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT:
      if (resolve)
        return getSourceElement();
      return basicGetSourceElement();
    case VirtualLinksPackage.ASSOCIATION__TARGET_ELEMENTS:
      return getTargetElements();
    case VirtualLinksPackage.ASSOCIATION__OCL_EXPRESSION:
      return getOclExpression();
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ATTRIBUTE:
      return getSourceAttribute();
    case VirtualLinksPackage.ASSOCIATION__TARGET_ATTRIBUTE:
      return getTargetAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case VirtualLinksPackage.ASSOCIATION__LOWER_BOUND:
      setLowerBound((Integer) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__UPPER_BOUND:
      setUpperBound((Integer) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__ASSOCIATION_TYPE_NAME:
      setAssociationTypeName((String) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__OPPOSITE:
      setOpposite((Association) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT:
      setSourceElement((LinkedElement) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__TARGET_ELEMENTS:
      getTargetElements().clear();
      getTargetElements().addAll((Collection<? extends LinkedElement>) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__OCL_EXPRESSION:
      setOclExpression((String) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ATTRIBUTE:
      setSourceAttribute((String) newValue);
      return;
    case VirtualLinksPackage.ASSOCIATION__TARGET_ATTRIBUTE:
      setTargetAttribute((String) newValue);
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
    case VirtualLinksPackage.ASSOCIATION__LOWER_BOUND:
      setLowerBound(LOWER_BOUND_EDEFAULT);
      return;
    case VirtualLinksPackage.ASSOCIATION__UPPER_BOUND:
      setUpperBound(UPPER_BOUND_EDEFAULT);
      return;
    case VirtualLinksPackage.ASSOCIATION__ASSOCIATION_TYPE_NAME:
      setAssociationTypeName(ASSOCIATION_TYPE_NAME_EDEFAULT);
      return;
    case VirtualLinksPackage.ASSOCIATION__OPPOSITE:
      setOpposite((Association) null);
      return;
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT:
      setSourceElement((LinkedElement) null);
      return;
    case VirtualLinksPackage.ASSOCIATION__TARGET_ELEMENTS:
      getTargetElements().clear();
      return;
    case VirtualLinksPackage.ASSOCIATION__OCL_EXPRESSION:
      setOclExpression(OCL_EXPRESSION_EDEFAULT);
      return;
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ATTRIBUTE:
      setSourceAttribute(SOURCE_ATTRIBUTE_EDEFAULT);
      return;
    case VirtualLinksPackage.ASSOCIATION__TARGET_ATTRIBUTE:
      setTargetAttribute(TARGET_ATTRIBUTE_EDEFAULT);
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
    case VirtualLinksPackage.ASSOCIATION__LOWER_BOUND:
      return lowerBound != LOWER_BOUND_EDEFAULT;
    case VirtualLinksPackage.ASSOCIATION__UPPER_BOUND:
      return upperBound != UPPER_BOUND_EDEFAULT;
    case VirtualLinksPackage.ASSOCIATION__ASSOCIATION_TYPE_NAME:
      return ASSOCIATION_TYPE_NAME_EDEFAULT == null ? associationTypeName != null
          : !ASSOCIATION_TYPE_NAME_EDEFAULT.equals(associationTypeName);
    case VirtualLinksPackage.ASSOCIATION__OPPOSITE:
      return opposite != null;
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ELEMENT:
      return sourceElement != null;
    case VirtualLinksPackage.ASSOCIATION__TARGET_ELEMENTS:
      return targetElements != null && !targetElements.isEmpty();
    case VirtualLinksPackage.ASSOCIATION__OCL_EXPRESSION:
      return OCL_EXPRESSION_EDEFAULT == null ? oclExpression != null
          : !OCL_EXPRESSION_EDEFAULT.equals(oclExpression);
    case VirtualLinksPackage.ASSOCIATION__SOURCE_ATTRIBUTE:
      return SOURCE_ATTRIBUTE_EDEFAULT == null ? sourceAttribute != null
          : !SOURCE_ATTRIBUTE_EDEFAULT.equals(sourceAttribute);
    case VirtualLinksPackage.ASSOCIATION__TARGET_ATTRIBUTE:
      return TARGET_ATTRIBUTE_EDEFAULT == null ? targetAttribute != null
          : !TARGET_ATTRIBUTE_EDEFAULT.equals(targetAttribute);
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
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", upperBound: ");
    result.append(upperBound);
    result.append(", associationTypeName: ");
    result.append(associationTypeName);
    result.append(", oclExpression: ");
    result.append(oclExpression);
    result.append(", sourceAttribute: ");
    result.append(sourceAttribute);
    result.append(", targetAttribute: ");
    result.append(targetAttribute);
    result.append(')');
    return result.toString();
  }

} // AssociationImpl
