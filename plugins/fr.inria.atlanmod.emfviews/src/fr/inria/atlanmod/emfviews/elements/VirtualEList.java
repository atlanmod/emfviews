package fr.inria.atlanmod.emfviews.elements;

import java.util.AbstractList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class VirtualEList<E> extends AbstractList<E> implements EList<E> {

  private EList<E> concreteList;
  private Virtualizer virtualizer;

  public VirtualEList(EList<E> concreteList, Virtualizer virtualizer) {
    this.concreteList = concreteList;
    this.virtualizer = virtualizer;
  }

  @Override
  public void move(int newPosition, Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public E move(int newPosition, int oldPosition) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public E get(int index) {
    E o = concreteList.get(index);

    if (o instanceof EObject) {
      return (E) virtualizer.getVirtual((EObject) o);
    } else {
      return o;
    }
  }

  @Override
  public int size() {
    return concreteList.size();
  }

}
