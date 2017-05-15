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

package fr.inria.atlanmod.emfviews.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.emfviews.elements.MergeElementImpl;
import fr.inria.atlanmod.emfviews.elements.ReproduceElementImpl;

public class MetamodelManager {

  private Resource compositionMetamodel;

  private List<EPackage> contributingMetamodels = new ArrayList<>();

  private Map<String, EClass> mergeClassesByName = new HashMap<>();

  private Map<EStructuralFeature, EStructuralFeature> virtualToConcreteFeature = new HashMap<>();
  private Map<EStructuralFeature, EStructuralFeature> concreteToVirtualFeature = new HashMap<>();
  private Map<EStructuralFeature, EStructuralFeature> concreteToMergedFeature = new HashMap<>();
  private Map<String, List<EStructuralFeature>> virtualAssociations = new HashMap<>();

  private Map<EClass, EClass> concreteToVirtualClass = new HashMap<>();

  private View virtualModel;

  public MetamodelManager(Collection<Object> contributingMetamodels, Resource compositionMetamodel,
                          View virtualModel) {
    this.virtualModel = virtualModel;
    this.compositionMetamodel = compositionMetamodel;
    this.contributingMetamodels = new ArrayList<>();
    for (Object object : contributingMetamodels) {
      if (object instanceof EPackage) {
        EPackage tp = (EPackage) object;
        this.contributingMetamodels.add(tp);
      }

    }
    this.buildMaps();
  }

  private Map<String, List<EClass>> produceCompositionClasses() {
    Map<String, List<EClass>> compositionClassesByName = new HashMap<>();

    if (virtualModel != null && virtualModel.getResourceSet() != null
        && virtualModel.getResourceSet().getPackageRegistry() != null
        && virtualModel.getResourceSet().getPackageRegistry().values() != null
        && virtualModel.getResourceSet().getPackageRegistry().values().size() > 0) {
      Collection<Object> listOfVirtualMMPackages =
          virtualModel.getResourceSet().getPackageRegistry().values();
      ArrayList<EPackage> packs = new ArrayList<>();
      for (Object object : listOfVirtualMMPackages) {

        if (object instanceof EPackage) {
          EPackage tempPack = (EPackage) object;
          if (tempPack.getName().compareToIgnoreCase("ecore") != 0) {
            packs.add(tempPack);
          }
        }

      }
      ArrayList<EClassifier> classifiers = new ArrayList<>();
      for (EPackage tempPack : packs) {
        classifiers.addAll(tempPack.getEClassifiers());
      }

      for (EClassifier obj : classifiers) {

        if (obj instanceof EClass) {
          if (((EClass) obj).getEPackage().getName().equals("MergePackage")) {
            mergeClassesByName.put(((EClass) obj).getName(), (EClass) obj);
          } else {
            if (compositionClassesByName.get(((EClass) obj).getName()) == null) {
              List<EClass> ecs = new ArrayList<>();
              ecs.add((EClass) obj);
              compositionClassesByName.put(((EClass) obj).getName(), ecs);
            } else {
              compositionClassesByName.get(((EClass) obj).getName()).add((EClass) obj);
            }
          }
        }
      }
    } else {
      for (Iterator<EObject> i = compositionMetamodel.getAllContents(); i.hasNext();) {
        EObject obj = i.next();
        if (obj instanceof EClass) {
          if (((EClass) obj).getEPackage().getName().equals("MergePackage")) {
            mergeClassesByName.put(((EClass) obj).getName(), (EClass) obj);
          } else {
            if (compositionClassesByName.get(((EClass) obj).getName()) == null) {
              List<EClass> ecs = new ArrayList<>();
              ecs.add((EClass) obj);
              compositionClassesByName.put(((EClass) obj).getName(), ecs);
            } else {
              compositionClassesByName.get(((EClass) obj).getName()).add((EClass) obj);
            }
          }
        }
      }

    }

    return compositionClassesByName;
  }

  private void buildMaps() {

    Map<String, List<EClass>> contributingClassesByName = new HashMap<>();
    Map<String, List<EClass>> compositionClassesByName = null;

    compositionClassesByName = produceCompositionClasses();

    for (EPackage metamodel : contributingMetamodels) {
      for (EClassifier obj : metamodel.getEClassifiers()) {

        if (obj instanceof EClass) {
          if (contributingClassesByName.get(((EClass) obj).getName()) == null) {
            List<EClass> ecs = new ArrayList<>();
            ecs.add((EClass) obj);
            contributingClassesByName.put(((EClass) obj).getName(), ecs);
          } else {
            contributingClassesByName.get(((EClass) obj).getName()).add((EClass) obj);
          }
        }
      }
    }

    // XXX: why the special case for lists of a single EClass? Performance?
    for (List<EClass> lcec : contributingClassesByName.values()) {
      if (lcec.size() > 1) {
        for (EClass cec : lcec) {
          List<EClass> lvec = compositionClassesByName.get(cec.getName());
          for (EClass vec : lvec) {
            if (vec.getEPackage().getNsURI().equals(cec.getEPackage().getNsURI())) {
              this.concreteToVirtualClass.put(cec, vec);
              mapFeatures(cec, vec);
            }
          }
        }
      } else {
        EClass cec = lcec.get(0);
        EClass vec = compositionClassesByName.get(cec.getName()).get(0);
        this.concreteToVirtualClass.put(cec, vec);
        mapFeatures(cec, vec);
      }
    }
    for (List<EClass> lec : compositionClassesByName.values()) {
      for (EClass ec : lec) {
        for (EStructuralFeature sf : ec.getEStructuralFeatures()) {
          if (virtualToConcreteFeature.get(sf) == null)
            if (virtualAssociations.get(sf.getName()) == null) {
              List<EStructuralFeature> sfs = new ArrayList<>();
              sfs.add(sf);
              virtualAssociations.put(sf.getName(), sfs);
            } else {
              virtualAssociations.get(sf.getName()).add(sf);
            }
        }
      }
    }
  }

  private void mapFeatures(EClass concEC, EClass virtuEC) {
    for (EStructuralFeature feature : concEC.getEStructuralFeatures()) {
      EStructuralFeature vf = virtuEC.getEStructuralFeature(feature.getName());
      if (vf != null) {
        this.virtualToConcreteFeature.put(vf, feature);
        this.concreteToVirtualFeature.put(feature, vf);
      }

    }
  }

  public EStructuralFeature translateToVirtualFeature(EObject object, EStructuralFeature feature) {
    if (object instanceof ReproduceElementImpl)
      return this.concreteToVirtualFeature.get(feature);
    else if (object instanceof MergeElementImpl) {
      if (this.concreteToMergedFeature.get(feature) == null) {

        return this.concreteToVirtualFeature.get(feature);
      } else {
        return this.concreteToMergedFeature.get(feature);
      }
    }
    return null;
  }

  public EStructuralFeature translateFromVirtualFeature(EObject object,
                                                        EStructuralFeature feature) {
    if (object instanceof ReproduceElementImpl)
      return this.virtualToConcreteFeature.get(feature);
    else if (object instanceof MergeElementImpl)
      throw new ViewOperationException("could not translate feature for merged element");
    return null;
  }

  public EClass translateToVirtualEClass(EClass eClass) {
    return this.concreteToVirtualClass.get(eClass);
  }

  public EStructuralFeature getVirtualAssociation(EObject object, String name) {
    List<EStructuralFeature> sfs = virtualAssociations.get(name);
    for (EStructuralFeature sf : sfs) {
      if (object.eClass().getEAllStructuralFeatures().contains(sf)) {
        return sf;
      }
    }
    throw new ViewOperationException("could not find virtual association");
  }

  public boolean isVirtualAssociation(EStructuralFeature feature) {
    List<EStructuralFeature> sfs = virtualAssociations.get(feature.getName());
    if (sfs == null)
      return false;
    else
      return sfs.contains(feature);
  }
}
