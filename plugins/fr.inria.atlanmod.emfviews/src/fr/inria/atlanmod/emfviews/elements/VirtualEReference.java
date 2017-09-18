package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

public class VirtualEReference extends VirtualFeature implements EReference {

  public VirtualEReference(EReference concreteReference, Virtualizer virtualizer) {
    super(EcorePackage.Literals.EREFERENCE, concreteReference, virtualizer);
  }

  @Override
  public void setContainment(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setResolveProxies(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public void setEOpposite(EReference value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EClass getEReferenceType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EList<EAttribute> getEKeys() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

}
