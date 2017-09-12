package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;

public abstract class VirtualFeature extends DynamicEObjectImpl implements EStructuralFeature {

  public VirtualFeature(EClass eClass) {
    super(eClass);
  }

  @Override
  public Object dynamicGet(int dynamicFeatureID) {
    EStructuralFeature feature = eDynamicFeature(dynamicFeatureID);

    if (feature == EcorePackage.Literals.ENAMED_ELEMENT__NAME) {
      return getName();
    }

    // @Correctness: reflexive access for other methods of the metaclass
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicSet(int dynamicFeatureID, Object value) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void dynamicUnset(int dynamicFeatureID) {
    throw new UnsupportedOperationException();
  }

  private boolean filtered;

  public void setFiltered(boolean filtered) {
    this.filtered = filtered;
  }

  public boolean isFiltered() {
    return filtered;
  }

}
