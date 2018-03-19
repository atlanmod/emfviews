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

import org.atlanmod.emfviews.elements.VirtualEAttribute;
import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEClassifier;
import org.atlanmod.emfviews.elements.VirtualEDataType;
import org.atlanmod.emfviews.elements.VirtualEPackage;
import org.atlanmod.emfviews.elements.VirtualEReference;
import org.atlanmod.emfviews.elements.VirtualEStructuralFeature;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface EcoreVirtualizer {
  VirtualEPackage getVirtual(EPackage o);
  VirtualEClassifier getVirtual(EClassifier o);
  VirtualEClass getVirtual(EClass o);
  VirtualEDataType getVirtual(EDataType o);
  VirtualEStructuralFeature getVirtual(EStructuralFeature o);
  VirtualEAttribute getVirtual(EAttribute o);
  VirtualEReference getVirtual(EReference o);
}
