/*******************************************************************************
 * Copyright (c) 2019 Armines
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

import java.util.AbstractList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.atlanmod.emfviews.core.Virtualizer;

// Like a VirtualEList, but behaves as if hidden virtual elements are not in the list.
// Handling filtered elements makes the get and size methods O(n) instead of O(1), which
// is unfortunate.
public class FilteredVirtualEList extends AbstractList<EObject> implements EList<EObject> {
  // Optimization: if we precompute a list of indices of visible objects in
  // concreteList at construction time, this initialization is O(n), but
  // further calls to get and size can be made in O(1).
  //
  // This comes at the cost of requiring that a new FilteredVirtualEList be obtained by the
  // client whenever the set of hidden objects in this feature changes.

  private EList<EObject> concreteList;
  private Virtualizer virtualizer;

  public FilteredVirtualEList(EList<EObject> concreteList, Virtualizer virtualizer) {
    this.concreteList = concreteList;
    this.virtualizer = virtualizer;
  }

  @Override
  public void move(int newPosition, EObject object) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject move(int newPosition, int oldPosition) {
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject get(int index) {
    VirtualEObject vo = null;
    for (int i=0; i < concreteList.size() && index >= 0; ++i) {
      vo = virtualizer.getVirtual(concreteList.get(i));
      if (!vo.isHidden())
        --index;
    }

    if (index >= 0 || (index == -1 && vo == null))
      throw new IndexOutOfBoundsException();
    else
      return vo;
  }

  @Override
  public int size() {
    int size = 0;
    for (EObject o : concreteList)
      if (!virtualizer.getVirtual(o).isHidden())
        ++size;
    return size;
  }

}
