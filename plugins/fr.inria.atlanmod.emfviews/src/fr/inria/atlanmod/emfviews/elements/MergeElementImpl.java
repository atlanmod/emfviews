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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.emfviews.core.View;
import fr.inria.atlanmod.emfviews.core.ViewOperationException;
import fr.inria.atlanmod.emfviews.rules.MergeRule;
import fr.inria.atlanmod.emfviews.rules.VirtualModelList;

public class MergeElementImpl extends VirtualElement {

  private EObject preferableElement;
  private List<EObject> concreteElements = new ArrayList<>();
  private EClass mergeClass = null;

  public MergeElementImpl(View vModel, List<EObject> concreteElements,
      EObject preferableElement, String mergeClassName) {
    super();

    init(vModel, concreteElements, preferableElement, mergeClass);
  }

  public MergeElementImpl(View vModel, List<EObject> concreteElements,
      EClass eClass, EObject preferableElement) {
    super();
    init(vModel, concreteElements, preferableElement, eClass);
  }

  private void init(View vModel, List<EObject> concreteElements,
                    EObject preferableElement, EClass eClass) {

    this.eProperties().setEResource(vModel);
    this.concreteElements = concreteElements;
    setTranslationRule(MergeRule.INSTANCE);
    this.eSetClass(eClass);
    eSetStore(this.getTranslationRule());
    setPreferableElement(preferableElement);
    List<EClass> ecs = new ArrayList<>();
    for (EObject eo : concreteElements) {
      try {
        ecs.add(eo.eClass());
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public EObject getPreferableElement() {
    return preferableElement;
  }

  public void setPreferableElement(EObject object) {
    this.preferableElement = object;
  }

  public EObject getContainmentElement(EStructuralFeature concreteFeature) {
    for (EObject obj : this.concreteElements) {
      for (EStructuralFeature sf : obj.eClass().getEAllStructuralFeatures()) {
        if (sf == concreteFeature) {
          return obj;
        }
      }
    }
    throw new ViewOperationException("concrete element could not found");
  }

  @SuppressWarnings("unchecked")
  public List<EObject> getMergedList(EStructuralFeature feature) {
    EList<EObject>[] subLists = new EList[concreteElements.size()];
    for (int i = 0; i < subLists.length; i++) {}
    return new VirtualModelList<>(this, feature, subLists);
  }

  public List<EObject> getConcreteElements() {
    return concreteElements;
  }

}
