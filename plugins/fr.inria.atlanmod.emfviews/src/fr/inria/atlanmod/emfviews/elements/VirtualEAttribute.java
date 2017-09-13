package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

public class VirtualEAttribute extends VirtualFeature implements EAttribute {

  public VirtualEAttribute(EAttribute concreteAttribute) {
    super(EcorePackage.Literals.EATTRIBUTE, concreteAttribute);
  }

  @Override
  public void setID(boolean value) {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

  @Override
  public EDataType getEAttributeType() {
    // TODO: Auto-generated method stub
    throw new UnsupportedOperationException();
  }

}
