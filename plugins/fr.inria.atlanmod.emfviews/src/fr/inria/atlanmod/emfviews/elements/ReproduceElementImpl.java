/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cau� Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.elements;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.rules.ReproduceRule;
import fr.inria.atlanmod.emfviews.rules.TranslationRule;

public class ReproduceElementImpl extends VirtualElement {

  private EObject concreteElement;
  private Map<EStructuralFeature, VirtualAssociation> virtualAssociations;

  public ReproduceElementImpl(View vModel, EObject concreteElement) {
    super();
    EClass tempEClass = vModel.getMetamodelManager()
        .translateToVirtualEClass(concreteElement.eClass());
    this.init(vModel, concreteElement, tempEClass);
  }

  public ReproduceElementImpl(View vModel, EObject concreteElement,
      EClass eClass) {
    this.init(vModel, concreteElement, eClass);
  }

  public Object setVirtualAssociation(EStructuralFeature feature, int index,
                                      List<EObject> targets) {
    for (EObject target : targets) {
      setVirtualAssociation(feature, index, target);
    }
    return null;
  }

  public Object setVirtualAssociation(EStructuralFeature feature, int index,
                                      EObject target) {
    if (virtualAssociations == null) {
      virtualAssociations = new HashMap<EStructuralFeature, VirtualAssociation>();
    }
    VirtualAssociation vAss = virtualAssociations.get(feature);
    if (vAss == null) {
      vAss = new VirtualAssociation(this, feature, target);
      virtualAssociations.put(feature, vAss);
    } else {
      vAss.set(target, TranslationRule.NO_INDEX);
    }
    return null;
  }

  public Object getVirtualAssociation(EStructuralFeature feature, int index) {
    if (virtualAssociations == null) {
      if (feature.isMany()) {
        return new BasicEList<EObject>();
      } else {
        return null;
      }
    } else {
      VirtualAssociation vAss = this.virtualAssociations.get(feature);
      if (vAss == null) {
        if (feature.isMany()) {
          return new BasicEList<EObject>();
        } else {
          return null;
        }
      } else {
        return vAss.get(index);
      }
    }
  }

  private void init(View vModel, EObject concreteElement, EClass eClass) {
    this.eProperties().setEResource(vModel);
    this.concreteElement = concreteElement;
    this.eSetClass(eClass);
    this.eClass();
    setTranslationRule(ReproduceRule.INSTANCE);
    eSetStore(this.getTranslationRule());
  }

  public EObject getConcreteElement() {
    return concreteElement;
  }

  @Override
  public int hashCode() {
    return this.getConcreteElement().hashCode();
  }

  public EStructuralFeature getConcreteFeature(EStructuralFeature virtualFeature) {
    return ((View) eResource()).getMetamodelManager()
        .translateFromVirtualFeature(this, virtualFeature);
  }

}
