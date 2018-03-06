package org.atlanmod.emfviews.ui.editors;

import java.util.Optional;

import org.atlanmod.emfviews.elements.VirtualEAttribute;
import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEObject;
import org.atlanmod.emfviews.elements.VirtualEReference;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class VirtualEObjectLabelProvider extends LabelProvider implements IColorProvider {

  @Override
  public String getText(Object element) {
    if (element instanceof Resource) {
      return ((Resource) element).getURI().toString();
    } else if (element instanceof EObject) {
      EObject o = (EObject) element;
      String className = o.eClass().getName();

      // Use the "name" feature, if it exists and is not empty
      EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
      String shortName = null;
      if (nameFeature != null && nameFeature.getEType() == EcorePackage.Literals.ESTRING) {
        String s = (String) o.eGet(nameFeature);
        if (s != null && !s.isEmpty()) {
          shortName = s;
        }
      }

      // Otherwise, use the first non-empty String-valued attribute
      // @Correctness: this seems to not pick up aliases of EString
      // or subtypes maybe?
      if (shortName != null) {
        Optional<String> stringValue = o.eClass().getEAllStructuralFeatures().stream()
            .filter(feature -> (feature.getEType() == EcorePackage.Literals.ESTRING)
                && o.eIsSet(feature))
            .map(feature -> (String) o.eGet(feature)).filter(value -> !value.isEmpty())
            .findFirst();

        if (stringValue.isPresent()) {
          shortName = stringValue.get();
        }
      }

      if (shortName == null) {
        shortName = "";
      }

      return String.format("%s %s", className, shortName);
    } else {
      return element.toString();
    }
  }

  @Override
  public Color getForeground(Object element) {
    if (element instanceof EStructuralFeature) {
      EStructuralFeature feature = (EStructuralFeature) element;
      EObject eClass = feature.eContainer();
      if (eClass instanceof VirtualEClass) {
        if (((VirtualEClass)eClass).isFeatureVirtual(feature)) {
          return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
        }
      }
    }
    return null;
  }

  @Override
  public Color getBackground(Object element) {
    return null;
  }

}
