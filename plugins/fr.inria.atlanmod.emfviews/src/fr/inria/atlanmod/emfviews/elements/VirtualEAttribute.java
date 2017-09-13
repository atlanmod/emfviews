package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

import fr.inria.atlanmod.emfviews.core.Viewpoint;

public class VirtualEAttribute extends VirtualFeature implements EAttribute {

  public VirtualEAttribute(EAttribute concreteAttribute, Viewpoint viewpoint) {
    super(EcorePackage.Literals.EATTRIBUTE, concreteAttribute, viewpoint);
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
