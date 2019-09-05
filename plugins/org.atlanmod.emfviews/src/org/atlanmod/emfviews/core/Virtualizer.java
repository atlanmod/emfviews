/*******************************************************************************
 * Copyright (c) 2017-2019 Armines
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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.atlanmod.emfviews.elements.VirtualEObject;

/**
 * Projects an EObject to a virtual model element.
 */
public interface Virtualizer {
  VirtualEObject getVirtual(EObject o);
  EList<EObject> getVirtual(EList<EObject> list);

  List<EObject> getMatchesForRule(String ruleName, EObject param, boolean rightHand);

  /** Tell the virtualizer to correctly handle filtered objects */
  void activateObjectFiltering();
}
