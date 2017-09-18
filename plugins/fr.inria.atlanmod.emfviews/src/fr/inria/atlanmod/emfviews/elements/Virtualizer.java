package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EObject;

public interface Virtualizer {
  <E extends EObject> E getVirtual(E o);
}
