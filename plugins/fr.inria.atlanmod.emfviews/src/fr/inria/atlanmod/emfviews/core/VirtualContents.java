/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cau� Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.core;

import java.util.AbstractList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

public class VirtualContents<E> extends AbstractList<E> implements EList<E> {

  private List<List<E>> subLists;

  public VirtualContents(Resource resource, List<List<E>> subLists) {
    this.subLists = subLists;
  }

  @Override
  public E get(int index) {
    if (index >= 0) {
      for (List<E> l : subLists) {
        if (index < l.size()) {
          return l.get(index);
        } else {
          index -= l.size();
        }
      }
    }
    throw new IndexOutOfBoundsException();
  }

  @Override
  public E set(int index, E object) {
    return super.set(index, object);
  }

  @Override
  public int size() {
    int ret = 0;
    for (List<E> l : subLists) {
      ret += l.size();
    }
    return ret;
  }

  @Override
  public void move(int newPosition, E object) {

  }

  @Override
  public E move(int newPosition, int oldPosition) {

    return null;
  }
}
