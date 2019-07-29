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

package org.atlanmod.emfviews.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.atlanmod.emfviews.elements.VirtualEAttribute;
import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEClassifier;
import org.atlanmod.emfviews.elements.VirtualEDataType;
import org.atlanmod.emfviews.elements.VirtualEEnum;
import org.atlanmod.emfviews.elements.VirtualEGenericType;
import org.atlanmod.emfviews.elements.VirtualEPackage;
import org.atlanmod.emfviews.elements.VirtualEReference;
import org.atlanmod.emfviews.elements.VirtualEStructuralFeature;

/**
 * A set of methods to project an Ecore class to its virtual counterpart.
 */
public interface EcoreVirtualizer {
  // This could have been included directly into Viewpoint since it's the only
  // implementation, but having the interface is useful to decouple the virtual
  // elements from the viewpoint.

  // We used to only have Virtualizer, but having the more specific methods of
  // EcoreVirtualizer gives us type safety when dealing with metamodel elements,
  // and saves us from casting EObject into EPackage, EClass, etc.

  VirtualEPackage getVirtual(EPackage o);
  VirtualEClassifier<?> getVirtual(EClassifier o);
  VirtualEClass getVirtual(EClass o);
  VirtualEDataType<?> getVirtual(EDataType o);
  VirtualEEnum getVirtual(EEnum o);
  VirtualEStructuralFeature<?> getVirtual(EStructuralFeature o);
  VirtualEAttribute getVirtual(EAttribute o);
  VirtualEReference getVirtual(EReference o);
  VirtualEGenericType getVirtual(EGenericType o);

  boolean isWhitelist();
}
