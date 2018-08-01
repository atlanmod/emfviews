/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
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

public class VirtualEList extends AbstractList<EObject> implements EList<EObject> {

  private EList<EObject> concreteList;
  private Virtualizer virtualizer;

  public VirtualEList(EList<EObject> concreteList, Virtualizer virtualizer) {
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
    EObject o = concreteList.get(index);
    return virtualizer.getVirtual(o);
  }

  @Override
  public int size() {
    return concreteList.size();
  }

}
