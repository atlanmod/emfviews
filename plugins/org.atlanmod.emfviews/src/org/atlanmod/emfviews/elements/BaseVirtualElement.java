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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

import org.atlanmod.emfviews.core.EcoreVirtualizer;
import org.atlanmod.emfviews.core.Viewpoint;

/**
 * Convenience base class for all virtual Ecore classes.
 *
 * Contains a concrete EObject and an EcoreVirtualizer, and implements
 * EObject methods so subclasses don't have to.
 */
public class BaseVirtualElement<T extends EObject> extends DynamicEObjectImpl implements EObject {

  private T concreteObject;
  protected EcoreVirtualizer virtualizer;

  public BaseVirtualElement(EClass eClass, T concrete, EcoreVirtualizer virtualizer) {
    super(eClass);
    this.concreteObject = concrete;
    this.virtualizer = virtualizer;
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

    if (c == null) {
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
    // @Correctness: this should actually be set as part of the opposite reference
    // of a VirtualEPackage.getContents().add, but in our case we know the virtualizer
    // is the resource.
    if (virtualizer instanceof Viewpoint) {
      return ((Viewpoint) virtualizer).getResource();
    }
    return null;
  }

}
