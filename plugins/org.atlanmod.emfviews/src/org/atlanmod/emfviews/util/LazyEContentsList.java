package org.atlanmod.emfviews.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.atlanmod.emfviews.elements.VirtualEObject;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.InternalEList;

public class LazyEContentsList implements EList<EObject>, InternalEList<EObject> {

  private VirtualEObject owner;

  // Cached values
  private EList<EReference> containments;
  private int numContainments = -1;
  private Object[] containedValues;
  private int[] containedSizes;
  private int size = -1;

  public LazyEContentsList(VirtualEObject owner) {
    this.owner = owner;
  }

  private EList<EReference> containments() {
    if (containments == null) {
      containments = owner.eClass().getEAllContainments();
      numContainments = containments.size();
    }
    return containments;
  }

  private int numContainments() {
    if (numContainments == -1) {
      numContainments = containments().size();
    }
    return numContainments;
  }

  private Object containedValue(int index) {
    if (containedValues == null) {
      containedValues = new Object[numContainments()];
    }

    if (containedValues[index] == null) {
      // @Optimize: what if eGet returns null?  We will call eGet again
      // We should differentiate between null (unfetched) and null (fetched).
      containedValues[index] = owner.eGet(containments().get(index));
    }

    return containedValues[index];
  }

  private int containedSize(int index) {
    if (containedSizes == null) {
      containedSizes = new int[numContainments()];
      Arrays.fill(containedSizes, -1);
    }

    if (containedSizes[index] == -1) {
      if (containments().get(index).isMany()) {
        containedSizes[index] = ((List<?>) containedValue(index)).size();
      } else {
        containedSizes[index] = containedValue(index) == null ? 0 : 1;
      }
    }

    return containedSizes[index];
  }

  @Override
  public int size() {
    if (size == -1) {
      size = 0;
      for (int i=0; i < numContainments(); ++i) {
        size += containedSize(i);
      }
    }
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  @Override
  public boolean contains(Object o) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterator<EObject> iterator() {
    return new Iterator<EObject>() {
      int cursor = 0;

      @Override
      public boolean hasNext() {
        return cursor < size();
      }

      @Override
      public EObject next() {
        return get(cursor++);
      }
    };
  }

  @Override
  public Object[] toArray() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean add(EObject e) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean remove(Object o) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(Collection<? extends EObject> c) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(int index, Collection<? extends EObject> c) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void clear() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject get(int index) {
    for (int i=0; i < numContainments(); ++i) {
      int s = containedSize(i);
      if (index < s) {
        Object v = containedValue(i);
        if (containments().get(i).isMany()) {
          @SuppressWarnings("unchecked")
          List<EObject> list = (List<EObject>) v;
          return list.get(index);
        } else {
          return (EObject) v;
        }
      } else {
        index -= s;
      }
    }

    throw new IndexOutOfBoundsException(index + "");
  }

  @Override
  public EObject set(int index, EObject element) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void add(int index, EObject element) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject remove(int index) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int indexOf(Object o) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int lastIndexOf(Object o) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<EObject> listIterator() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<EObject> listIterator(int index) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public List<EObject> subList(int fromIndex, int toIndex) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject basicGet(int index) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public List<EObject> basicList() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Iterator<EObject> basicIterator() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<EObject> basicListIterator() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public ListIterator<EObject> basicListIterator(int index) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public Object[] basicToArray() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public <T> T[] basicToArray(T[] array) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int basicIndexOf(Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public int basicLastIndexOf(Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean basicContains(Object object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean basicContainsAll(Collection<?> collection) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public NotificationChain basicRemove(Object object, NotificationChain notifications) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public NotificationChain basicAdd(EObject object, NotificationChain notifications) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void addUnique(EObject object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void addUnique(int index, EObject object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAllUnique(Collection<? extends EObject> collection) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAllUnique(int index, Collection<? extends EObject> collection) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject setUnique(int index, EObject object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void move(int newPosition, EObject object) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EObject move(int newPosition, int oldPosition) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

}
