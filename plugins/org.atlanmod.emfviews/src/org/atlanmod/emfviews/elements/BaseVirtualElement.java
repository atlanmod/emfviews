/*******************************************************************************
 * Copyright (c) 2018 Armines
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.atlanmod.emfviews.core.EcoreVirtualizer;
import org.atlanmod.emfviews.core.Viewpoint;

/**
 * Convenience base class for all virtual Ecore classes.
 *
 * Contains a concrete EObject and an EcoreVirtualizer, and implements
 * EObject methods so subclasses don't have to.
 *
 * All virtual elements work the same way: we inherit from the interface
 * (EClass, EPackage, EReference, ...) and implement the methods by delegating
 * to the concrete object, and eventually virtualize some results.  The point is
 * to ensure values given by the concrete elements are projected into their
 * virtual counterparts (using the Virtualizer or EcoreVirtualizer), so that
 * browsing the virtual model should only yield virtual elements, and never
 * concrete ones.  (Although there are exceptions, e.g. when going to the
 * metametalevel or when returning primitive types.)
 *
 *
 * In addition, virtual elements can be filtered in or out, and even have new,
 * virtual-only features (see VirtualEPackage or VirtualEClass).
 * */
public class BaseVirtualElement<T extends EObject> extends DynamicEObjectImpl implements EObject {

  private T concreteObject;
  protected EcoreVirtualizer virtualizer;

  public boolean filtered = false;
  public boolean synthetic = false;

  /**
   * Construct a virtual element as a proxy to a concrete object whose metaclass
   * is eClass, and using virtualizer to project other concrete elements into
   * virtual ones.
   */
  public BaseVirtualElement(EClass eClass, T concrete, EcoreVirtualizer virtualizer) {
    super(eClass);
    this.concreteObject = concrete;
    this.virtualizer = virtualizer;
  }

  /**
   * Whether the element is visible in a view. Depends on its filtered attribute
   * and the whitelisting mode of the virtualizer.
   * Synthetic elements are always visible.
   */
  public boolean isVisible() {
    return synthetic || filtered == virtualizer.isWhitelist();
  }

  /**
   * @return the concrete element held by this virtual element.
   */
  protected T concrete() {
    return concreteObject;
  }

  @Override
  public EObject eContainer() {
    EObject c = concrete().eContainer();

    if (c == null || c instanceof EAnnotation || c instanceof EOperation || c instanceof EParameter
			|| c instanceof EStringToStringMapEntryImpl) {
      return null;
    } else if (c instanceof EPackage) {
      return virtualizer.getVirtual((EPackage) c);
    } else if (c instanceof EClassifier) {
      return virtualizer.getVirtual((EClassifier) c);
    } else if (c instanceof EStructuralFeature) {
      return virtualizer.getVirtual((EStructuralFeature) c);
    } else if (c instanceof EGenericType) {
      return c;
    } else {
      throw new IllegalArgumentException("Cannot virtualize EObject " + c);
    }
  }

  @Override
  public EReference eContainmentFeature() {
    return virtualizer.getVirtual(concrete().eContainmentFeature());
  }

  @Override
  public Resource eResource() {
    // This should actually be set as part of the opposite reference of a
    // VirtualEPackage.getContents().add, but in our case we know the
    // virtualizer is the resource.
    if (virtualizer instanceof Viewpoint) {
      return ((Viewpoint) virtualizer).getResource();
    }
    return null;
  }

}
