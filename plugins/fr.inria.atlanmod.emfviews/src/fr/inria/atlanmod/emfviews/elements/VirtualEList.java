package fr.inria.atlanmod.emfviews.elements;

import java.util.AbstractList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

// @Refactor: unused
public class VirtualEList<E> extends AbstractList<E> implements EList<E> {

  private List<E> concreteList;
  private List<E> virtualList;

  public VirtualEList(List<E> concreteList, List<E> virtualList) {
    this.concreteList = concreteList;
    this.virtualList = virtualList;
  }

  @Override
  public E get(int index) {
    if (index < concreteList.size()) {
      return concreteList.get(index);
    } else {
      return virtualList.get(index - concreteList.size());
    }
  }

  @Override
  public E set(int index, E element) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public E remove(int index) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void move(int newPosition, E object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public E move(int newPosition, int oldPosition) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int size() {
    return concreteList.size() + virtualList.size();
  }

}
