/*******************************************************************************
 * Copyright (c) 2017 Armines
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * fmdkdd - initial implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.elements;

import java.util.AbstractList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class VirtualEList<E extends EObject> extends AbstractList<E> implements EList<E> {

  private EList<E> concreteList;
  private Virtualizer virtualizer;

  public VirtualEList(EList<E> concreteList, Virtualizer virtualizer) {
    this.concreteList = concreteList;
    this.virtualizer = virtualizer;
  }

  @Override
  public void move(int newPosition, E object) {
    throw new UnsupportedOperationException();
  }

  @Override
  public E move(int newPosition, int oldPosition) {
    throw new UnsupportedOperationException();
  }

  @Override
  public E get(int index) {
    E o = concreteList.get(index);
    return virtualizer.getVirtual(o);
  }

  @Override
  public int size() {
    return concreteList.size();
  }

}
