/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Juan David Villa Calle - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.emfviews.core;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;

public class Viewtype extends ResourceImpl {

  private Properties properties;

  private ResourceSet virtualResourceSet;
  /**
   * The contents of the virtual model
   */
  private EList<EObject> virtualContents; // list of resources

  /**
   * Contains all the attributes we have removed from packages in the virtual
   * resource set. Used by the ViewtypeEditor.
   */
  private ArrayList<EObject> hiddenAttributes;

  public ArrayList<EObject> getHiddenAttributes() {
    return hiddenAttributes;
  }

  private String contributingMetamodels;
  private String filtersMM;
  private String correspondenceModel;
  private String correspondenceModelBase;

  public String getCorrespondenceModelBase() {
    return correspondenceModelBase;
  }

  private XMIResourceImpl correspondenceModelResource;
  private ArrayList<EPackage> contributingEpackages;

  public ArrayList<EPackage> getContributingEpackages() {
    return contributingEpackages;
  }

  @Override
  public EList<EObject> getContents() {
    return virtualContents;
  }

  public Viewtype(URI uri) {
    super(uri);
    virtualResourceSet = new ResourceSetImpl();

  }

  public XMIResourceImpl getCorrespondenceModelResource() {
    return correspondenceModelResource;
  }

  // FIXME: unused?
  public void setCorrespondenceModelResource(XMIResourceImpl correspondenceModelResource) {
    this.correspondenceModelResource = correspondenceModelResource;
  }

  // FIXME: unused?
  public void createCorrespondenceModel(URI modelURI) throws IOException {
    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks virtualLinks = vLinksFactory.createVirtualLinks();
    correspondenceModelResource = new XMIResourceImpl();
    correspondenceModelResource.setURI(modelURI);
    correspondenceModelResource.getContents().add(virtualLinks);
    correspondenceModelResource.save(null);
  }

  // FIXME: unused?
  public Viewtype(List<String> nsURIs, String filtersMMUri) {
    super();
    virtualResourceSet = new ResourceSetImpl();
    String nsURISs = "";

    for (String nsURI : nsURIs) {
      if (nsURI.startsWith("platform:/resource/")) {
        nsURI = nsURI.replace("platform:/resource/", "");
      }
      if (nsURISs.length() > 0) {
        nsURISs += "," + nsURI.toString();
      } else {
        nsURISs = nsURI.toString();
      }
    }
    filtersMM = filtersMMUri;
    contributingMetamodels = nsURISs;
    loadContributingMetamodels(nsURISs);
    setVirtualContents();
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    properties = new Properties();
    properties.load(inputStream);
    if (properties.getProperty("correspondenceModelBase") != null) {
      correspondenceModelBase = properties.getProperty("correspondenceModelBase");
      // IWorkspace workspace = ResourcesPlugin.getWorkspace();
      // java.net.URI uri = workspace.getRoot()
      // .findMember("/" + properties.getProperty("correspondenceModel"))
      // .getLocationURI();
      // try {
      // VirtualLinksDelegator vld = new VirtualLinksDelegator(
      // properties.getProperty("correspondenceModelBase"));
      // vld.createVirtualMetamodelLinks(org.eclipse.emf.common.util.URI.createURI(uri.toString()));
      // //extendedMMviewpoint.xmi is rewrited
      // } catch (CoreException e) {
      // e.printStackTrace();
      // }
    }

    cloneContributingMetamodels(properties.getProperty("contributingMetamodels"));
    loadCorrespondenceModel(properties.getProperty("correspondenceModel"));
    setVirtualContents();
  }

  Resource attributesToHideMM;

  public Resource getAttributesToHideMM() {
    return attributesToHideMM;
  }

  // Clone each metamodel into our virtual resource set, so that we can add and
  // remove elements from them without affecting the originals.
  private void cloneContributingMetamodels(String contributingModelsURIs) {
    contributingEpackages = new ArrayList<>();

    // Get the EPackage from each metamodel URI
    for (String modelURI : contributingModelsURIs.split(",")) {
      if (modelURI.startsWith("http")) {
        contributingEpackages.add(EPackage.Registry.INSTANCE.getEPackage(modelURI));
      } else if (modelURI.endsWith("ecore")) {
        // XXX: Since the virtual resource set is empty at this point, this
        // should merely delegate to the global registry, and be equivalent to
        // the line above, so we can dispense of this case
        Resource r =
            virtualResourceSet.getResource(URI.createPlatformResourceURI(modelURI, true), true);
        contributingEpackages.add((EPackage) r.getContents().get(0));
      }
    }

    // Clone each package into our virtual resource set
    for (EPackage p : contributingEpackages) {
      EPackage copy = EcoreUtil.copy(p);
      // EcoreUtil.remove(copiedPackage);
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), copy);
    }
  }

  // Apply the filters from the given virtual links to all the packages in the
  // virtual resource set.
  private void filterMetamodels(VirtualLinks vl) {
    hiddenAttributes = new ArrayList<>();

    for (VirtualLink l : vl.getVirtualLinks()) {
      if (l instanceof Filter) {
        Filter f = (Filter) l;
        LinkedElement e = f.getFilteredElement();
        EObject root = virtualResourceSet.getPackageRegistry().getEPackage(e.getModelRef());
        EObject filteredElement = findElement(root, e.getElementRef());
        if (filteredElement != null) {
          EcoreUtil.remove(filteredElement);
          hiddenAttributes.add(filteredElement);
        }
      }
    }
  }

  // Try to match all components of the path by with the named contents of the
  // object. If all components match, return this element. Otherwise, return
  // null.
  private EObject findElement(EObject root, String path) {
    String[] components = path.split("\\.");
    Queue<EObject> objs = new ArrayDeque<>();
    objs.add(root);

    EObject o = null;
    for (String c : components) {
      boolean match = false;
      while (!match) {
        o = objs.poll();
        // No more objects, give up
        if (o == null) {
          return null;
        }
        EStructuralFeature nameFeature = o.eClass().getEStructuralFeature("name");
        // Unnamed feature, cannot match
        if (nameFeature == null) {
          return null;
        }
        String objName = (String) o.eGet(nameFeature);
        if (c.equals(objName)) {
          // Match: add the contents of the current object to the search, and
          // continue with the next component
          objs.clear();
          objs.addAll(o.eContents());
          match = true;
        }
      }
    }

    return o;
  }

  private void loadContributingMetamodels(String contributingModelsURIs) {

    hiddenAttributes = new ArrayList<>();
    contributingEpackages = new ArrayList<>();
    EList<EObject> epackagesWithAttsToHide = attributesToHideMM.getContents();

    String modelsURIs[] = contributingModelsURIs.split(",");
    for (int i = 0; i < modelsURIs.length; i++) {
      String modelURI = modelsURIs[i];
      if (modelURI.startsWith("http")) {
        EPackage contributingEcoreModelPackage = EPackage.Registry.INSTANCE.getEPackage(modelURI);

        Copier copier = new Copier();
        EObject copy = copier.copy(contributingEcoreModelPackage);
        copier.copyReferences();
        EPackage copiedPackage = (EPackage) copy;
        EcoreUtil.remove(copiedPackage);
        contributingEpackages.add(contributingEcoreModelPackage);
        // FIXME: would make more sense to start with packages that have
        // elements to be filtered, and have a visitor to filter recursively
        for (int j = 0; j < epackagesWithAttsToHide.size(); j++) {
          EPackage tempPack = (EPackage) epackagesWithAttsToHide.get(j);
          if (tempPack.getNsURI().compareToIgnoreCase(copiedPackage.getNsURI()) == 0) {
            EList<EClassifier> eClassifiersWithItemsToHide = tempPack.getEClassifiers();
            for (EClassifier eClassifierWithItemsToHide : eClassifiersWithItemsToHide) {
              EClassifier requiredEclassifier =
                  copiedPackage.getEClassifier(eClassifierWithItemsToHide.getName());
              // FIXME: there are other classifiers beyond EClass (EEnum and
              // EDataType), so this downcast is unsafe [Note: classifiers]
              EClass eClassWithItemsToHide = (EClass) requiredEclassifier;
              EList<EStructuralFeature> attsToHide =
                  ((EClass) eClassifierWithItemsToHide).getEStructuralFeatures();
              for (EStructuralFeature eAttributeToHide : attsToHide) {
                EStructuralFeature theAtt =
                    eClassWithItemsToHide.getEStructuralFeature(eAttributeToHide.getName());
                EClassifier originalClassifier = contributingEcoreModelPackage
                    .getEClassifier(eClassifierWithItemsToHide.getName());
                EClass originalEClass = (EClass) originalClassifier;
                hiddenAttributes.add(originalEClass.getEStructuralFeature(theAtt.getName()));
                eClassWithItemsToHide.getEStructuralFeatures().remove(theAtt);
              }
            }
          }
        }

        // FIXME: is the temp Resource necessary?
        ResourceImpl resourceTemp = new ResourceImpl();
        resourceTemp.setURI(URI.createURI(contributingEcoreModelPackage.getNsURI()));
        resourceTemp.getContents().add(copiedPackage);
        virtualResourceSet.getPackageRegistry().put(contributingEcoreModelPackage.getNsURI(),
                                                    copiedPackage);

        // FIXME: this looks like a nasty duplication: the only change is how we
        // fetch the EPackage
      } else if (modelURI.endsWith("ecore")) {
        Resource metamodelResource =
            virtualResourceSet.getResource(URI.createPlatformResourceURI(modelURI, true), true);
        EPackage mmPackage = (EPackage) metamodelResource.getContents().get(0);

        Copier copier = new Copier();
        EObject copy = copier.copy(mmPackage);
        copier.copyReferences();
        EPackage copiedPackage = (EPackage) copy;
        EcoreUtil.remove(copiedPackage);

        contributingEpackages.add(mmPackage);
        for (int j = 0; j < epackagesWithAttsToHide.size(); j++) {
          EPackage tempPack = (EPackage) epackagesWithAttsToHide.get(j);
          if (tempPack.getNsURI().compareToIgnoreCase(copiedPackage.getNsURI()) == 0) {
            EList<EClassifier> eClassifiersWithItemsToHide = tempPack.getEClassifiers();
            for (EClassifier eClassifierWithItemsToHide : eClassifiersWithItemsToHide) {
              EClassifier requiredEclassifier =
                  copiedPackage.getEClassifier(eClassifierWithItemsToHide.getName());
              EClass eClassWithItemsToHide = (EClass) requiredEclassifier;
              EList<EStructuralFeature> attsToHide =
                  ((EClass) eClassifierWithItemsToHide).getEStructuralFeatures();
              for (EStructuralFeature eAttributeToHide : attsToHide) {
                EStructuralFeature theAtt =
                    eClassWithItemsToHide.getEStructuralFeature(eAttributeToHide.getName());
                EClassifier originalClassifier =
                    mmPackage.getEClassifier(eClassifierWithItemsToHide.getName());
                EClass originalEClass = (EClass) originalClassifier;
                hiddenAttributes.add(originalEClass.getEStructuralFeature(theAtt.getName()));
                eClassWithItemsToHide.getEStructuralFeatures().remove(theAtt);
              }

            }
          }
        }
        virtualResourceSet.getPackageRegistry().put(mmPackage.getNsURI(), copiedPackage);
      }
    }
  }

  private void loadCorrespondenceModel(String correspondenceModelURI) throws FileNotFoundException,
                                                                      IOException {
    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    correspondenceModelResource = new XMIResourceImpl();
    IWorkspace workspace = ResourcesPlugin.getWorkspace();
    // FIXME: why is the '/' not mandatory in the first place?
    java.net.URI uri =
        workspace.getRoot().findMember("/" + correspondenceModelURI).getLocationURI();
    correspondenceModelResource.load(uri.toURL().openStream(), null);
    correspondenceModelResource.setURI(org.eclipse.emf.common.util.URI.createURI(uri.toString()));

    // Get the virtual links from the serialized resource
    // FIXME: this cast can fail if the XMI is not a VirtualLinks
    VirtualLinks virtualLinks = (VirtualLinks) correspondenceModelResource.getContents().get(0);

    filterMetamodels(virtualLinks);

    EList<VirtualLink> allVirtualLinks = virtualLinks.getVirtualLinks();

    List<Association> associations = new ArrayList<>();
    for (VirtualLink virtualLink : allVirtualLinks) {
      if (virtualLink instanceof Association) {
        Association association = (Association) virtualLink;
        associations.add(association);
      }
    }
    System.out
        .println("contributingMetamodels:  " + properties.getProperty("contributingMetamodels"));

    // if there is only one contributingMetamodel: metamodel extension (Monoge)
    if (properties.getProperty("contributingMetamodels").split(",").length > 1) {
      System.out.println("Composition");
      for (Association association : associations) {
        // The name of the association corresponds to the type of change
        // String associationName = association.getName();
        LinkedElement sourceElement = association.getSourceElement();
        String sourceElementName = sourceElement.getName();
        String sourcePackageUri = sourceElement.getModelRef();

        EList<LinkedElement> targetElements = association.getTargetElements();
        LinkedElement targetElement = targetElements.get(0);

        String targetElementName = targetElement.getName();
        String targetPackageUri = targetElement.getModelRef();

        EPackage sourcePackage =
            virtualResourceSet.getPackageRegistry().getEPackage(sourcePackageUri);
        // FIXME: unsafe downcast see [Note: classifiers]
        EClass theSourceEClass = (EClass) sourcePackage.getEClassifier(sourceElementName);

        EPackage targetPackage =
            virtualResourceSet.getPackageRegistry().getEPackage(targetPackageUri);
        // FIXME: unsafe downcast see [Note: classifiers]
        EClass theTargetEClass = (EClass) targetPackage.getEClassifier(targetElementName);

        EReference theR = EcoreFactory.eINSTANCE.createEReference();
        theR.setName(association.getName());
        theR.setLowerBound(association.getLowerBound());
        theR.setUpperBound(association.getUpperBound());
        theR.setEType(theTargetEClass);

        // XXX: is this annotation used anywhere?
        EAnnotation theAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
        theAnnotation.setSource("va");

        theR.getEAnnotations().add(theAnnotation);

        // XXX: not sure when this should match, but comparison to string using
        // equals is fishy
        if (association.getSourceAttribute() != null && association.getSourceAttribute() != ""
            && association.getTargetAttribute() != null && association.getTargetAttribute() != "") {
          EStringToStringMapEntryImpl detailSource =
              (EStringToStringMapEntryImpl) EcoreFactory.eINSTANCE
                  .create(EcorePackage.eINSTANCE.getEStringToStringMapEntry());
          detailSource.setKey("source");
          detailSource.setValue(association.getSourceAttribute());
          EStringToStringMapEntryImpl detailTarget =
              (EStringToStringMapEntryImpl) EcoreFactory.eINSTANCE
                  .create(EcorePackage.eINSTANCE.getEStringToStringMapEntry());
          detailTarget.setKey("target");
          detailTarget.setValue(association.getTargetAttribute());
          theAnnotation.getDetails().add(detailSource);
          theAnnotation.getDetails().add(detailTarget);
        }
        theSourceEClass.getEStructuralFeatures().add(theR);
      } // for Association
    } else {
      System.out.println("Extension");
      // EPackage originalPackage =
      // virtualResourceSet.getPackageRegistry().getEPackage(properties.getProperty("originalMetamodel"));
      Resource metamodelResource = virtualResourceSet.getResource(URI
          .createPlatformResourceURI(properties.getProperty("contributingMetamodels"), true), true);
      System.out
          .println("originalMetamodel2:  " + metamodelResource.getContents().get(0).toString());
      EPackage originalPackage = (EPackage) metamodelResource.getContents().get(0);
      // Create extendedPackage and copy the originalPackage
      EPackage extendedPackage = EcoreFactory.eINSTANCE.createEPackage();
      extendedPackage = originalPackage;
      extendedPackage.setName("Extended_Metamodel");
      extendedPackage.setNsPrefix("Extended_Metamodel");
      extendedPackage.setNsURI("http://Extended_Metamodel/1.0");
      // From the associations of virtuallinks, changes are done in the MM
      for (Association association : associations) {
        // The name of the association corresponds to the type of change
        String associationName = association.getName();
        // 1- Refining: create Y subtyping C
        if (associationName.compareTo("Refine") == 0) {
          String newClass = association.getTargetAttribute();
          String superClass = association.getSourceElement().getName();
          System.out.println("Create: " + newClass + " subtyping: " + superClass);
          EClass classY = EcoreFactory.eINSTANCE.createEClass();
          classY.setName(newClass); // Y
          EClass classC = (EClass) extendedPackage.getEClassifier(superClass); // C
          classY.getESuperTypes().add(classC);
          extendedPackage.getEClassifiers().add(classY);
          // 2- Generalize: New class Z superclass of A and B
        } else if (associationName.compareTo("Generalize") == 0) {
          String newClass = association.getTargetAttribute();
          System.out.println("Generalize: class " + newClass);
          EClass classZ = EcoreFactory.eINSTANCE.createEClass();
          classZ.setName(newClass);
          // get subclasses and add new class as superclass
          for (int i = 0; i < association.getTargetElements().size(); i++) {
            String subclassName = association.getTargetElements().get(i).getName();
            EClass subClass = (EClass) extendedPackage.getEClassifier(subclassName);
            subClass.getESuperTypes().add(classZ);
          }
          extendedPackage.getEClassifiers().add(classZ);
          // 3- AddProperty: propertyA to metaclass A
        } else if (associationName.compareTo("AddProperty") == 0) {
          String addedProperty = association.getTargetAttribute();
          String targetElement = association.getTargetElements().get(0).getName();
          String typeString = association.getSourceAttribute();
          System.out.println("Add property: " + addedProperty + " of type: " + typeString
              + " to class: " + targetElement);
          EClass classA = (EClass) extendedPackage.getEClassifier(targetElement); // A
          EAttribute attrA = EcoreFactory.eINSTANCE.createEAttribute();
          attrA.setName(addedProperty); // propertyA
          if (typeString.toLowerCase().compareTo("string") == 0) {
            attrA.setEType(EcorePackage.Literals.ESTRING);
          } else if (typeString.toLowerCase().compareTo("boolean") == 0
              || typeString.toLowerCase().compareTo("bool") == 0) {
            attrA.setEType(EcorePackage.Literals.EBOOLEAN);
          } else if (typeString.toLowerCase().compareTo("integer") == 0
              || typeString.toLowerCase().compareTo("int") == 0) {
            attrA.setEType(EcorePackage.Literals.EINT);
          } else if (typeString.toLowerCase().compareTo("double") == 0) {
            attrA.setEType(EcorePackage.Literals.EDOUBLE);
          } else if (typeString.toLowerCase().compareTo("date") == 0) {
            attrA.setEType(EcorePackage.Literals.EDATE);
          } else if (typeString.toLowerCase().compareTo("float") == 0) {
            attrA.setEType(EcorePackage.Literals.EFLOAT);
          } else if (typeString.toLowerCase().compareTo("long") == 0) {
            attrA.setEType(EcorePackage.Literals.ELONG);
          } else if (typeString.toLowerCase().compareTo("short") == 0) {
            attrA.setEType(EcorePackage.Literals.ESHORT);
          } else if (typeString.toLowerCase().compareTo("byte") == 0) {
            attrA.setEType(EcorePackage.Literals.EBYTE);
          } else {
            attrA.setEType(EcorePackage.Literals.ESTRING);
          }
          classA.getEStructuralFeatures().add(attrA);
          // 4- FilterProperty: property propertyB of class B
        } else if (associationName.compareTo("FilterProperty") == 0) {
          String filteredProperty = association.getSourceAttribute();
          String sourceElement = association.getSourceElement().getName();
          EClass classB = (EClass) extendedPackage.getEClassifier(sourceElement); // B
          // System.out.println("Filter property: "+ filteredProperty + " from
          // class: " + sourceElement);
          System.out.println("Filter property structuralFeatures size: "
              + classB.getEStructuralFeatures().size());
          for (int i = 0; i < classB.getEStructuralFeatures().size(); i++) {
            if (classB.getEStructuralFeatures().get(i).getName().compareTo(filteredProperty) == 0) {
              System.out.println("Filter property ");
              EStructuralFeature theAtt = classB.getEAllStructuralFeatures().get(i);
              classB.getEStructuralFeatures().remove(theAtt);
            }
          }
          // 5- FilterClass D
        } else if (associationName.compareTo("FilterClass") == 0) {
          String filteredClass = association.getSourceElement().getName();
          System.out.println("FilterClass: " + filteredClass);
          for (int i = 0; i < extendedPackage.getEClassifiers().size(); i++) {
            if (extendedPackage.getEClassifiers().get(i).getName().compareTo(filteredClass) == 0) {
              extendedPackage.getEClassifiers().remove(i);
            }
          }
          // 6- AddConstraint class="A" constraint="constraint1" value="value1"
        } else if (associationName.compareTo("AddConstraint") == 0) {
          String classConstraint = association.getSourceElement().getName();
          String constraint = association.getSourceAttribute();
          String value = association.getTargetAttribute();
          System.out.println("AddConstraint " + constraint + "with value: " + value + "on class "
              + classConstraint);
          EClass classA = (EClass) extendedPackage.getEClassifier(classConstraint);
          EAnnotation constraint1 = EcoreFactory.eINSTANCE.createEAnnotation();
          constraint1.setSource(constraint);
          classA.getEAnnotations().add(constraint1);
          // 7- FilterConstraint class="C" constraint="constraint2"
        } else if (associationName.compareTo("FilterConstraint") == 0) {
          String classConstraint = association.getSourceElement().getName();
          String constraint = association.getSourceAttribute();
          System.out.println("FilterConstraint " + constraint + "from class " + classConstraint);
          EClass classC = (EClass) extendedPackage.getEClassifier(classConstraint);
          for (int i = 0; i < classC.getEAnnotations().size(); i++) {
            if (classC.getEAnnotations().get(i).getSource().compareTo(constraint) == 0) {
              classC.getEAnnotations().remove(i);
            }
          }
          // 8- ModifyProperty class="C" property="propertyC" <value
          // attribute="name" value="propertyC2"/>
        } else if (associationName.compareTo("ModifyProperty") == 0) {
          String classModify = association.getSourceElement().getName();
          String property = association.getSourceAttribute();
          System.out.println("ModifyProperty " + property + "from class " + classModify);
          EClass classC = (EClass) extendedPackage.getEClassifier(classModify);
          for (int i = 0; i < classC.getEAttributes().size(); i++) {
            if (classC.getEAttributes().get(i).getName().compareTo(property) == 0) {
              // attribute:value, attribute:value, ...
              String attribute_values = association.getTargetAttribute();
              String[] attribute_values_array = attribute_values.split(",");
              // iterate over all attributes
              for (int j = 0; j < attribute_values_array.length; j++) {
                String attribute_value = attribute_values_array[j];
                String attribute = attribute_value.split(":")[0];
                String value = attribute_value.split(":")[1];
                if (attribute.compareTo("name") == 0) {
                  classC.getEAttributes().get(i).setName(value);
                }
              }
            }
          }
          // 9- AddReference: refB to A
        } else if (associationName.compareTo("AddReference") == 0) {
          System.out.println(association.getTargetAttribute());
          String addedProperty = association.getTargetAttribute().split(";")[0]; // refB
          String typeRelation = association.getTargetAttribute().split(";")[1]; // composition
          String targetElement = association.getTargetElements().get(0).getName(); // A
          String typeString = association.getSourceAttribute(); // B
          System.out.println("Add reference: " + addedProperty + " of type: " + typeString
              + "and relation" + typeRelation + " to class: " + targetElement);
          EClass classA = (EClass) extendedPackage.getEClassifier(targetElement); // A
          EReference refB = EcoreFactory.eINSTANCE.createEReference();
          refB.setName(addedProperty);
          EClass classB = (EClass) extendedPackage.getEClassifier(typeString); // B
          refB.setEType(classB);
          if (typeRelation.compareTo("composition") == 0) {
            refB.setContainment(true);
          } else {
            refB.setContainment(false);
          }
          // cardinality
          refB.setLowerBound(association.getLowerBound());
          refB.setUpperBound(association.getUpperBound());
          classA.getEStructuralFeatures().add(refB);
          // 10- FilterReference: reference refA of class B
        } else if (associationName.compareTo("FilterReference") == 0) {
          String filteredReference = association.getSourceAttribute();
          String sourceElement = association.getSourceElement().getName();
          EClass classB = (EClass) extendedPackage.getEClassifier(sourceElement); // B
          // System.out.println("Filter property: "+ filteredProperty + " from
          // class: " + sourceElement);
          System.out.println("Filter reference structuralFeatures size: "
              + classB.getEStructuralFeatures().size());
          for (int i = 0; i < classB.getEStructuralFeatures().size(); i++) {
            if (classB.getEStructuralFeatures().get(i).getName()
                .compareTo(filteredReference) == 0) {
              System.out.println("Filter reference ");
              EStructuralFeature theRef = classB.getEAllStructuralFeatures().get(i);
              classB.getEStructuralFeatures().remove(theRef);
            }
          }
        } else { // EMFViews
          System.out.println("Unrecognized Association");
        } // else EMFViews

      } // for
        // Register the new virtual MM
      EPackage.Registry.INSTANCE.put("http://Extended_Metamodel/1.0", extendedPackage);
    } // end if (composition or extension)

  }

  // FIXME: unused?
  public void serialize(IFile file, String dslTechnology) throws IOException, CoreException {
    StringBuffer fileContent = new StringBuffer();
    String contributingMetamodelsLine = "contributingMetamodels=" + contributingMetamodels;
    fileContent.append(contributingMetamodelsLine);
    fileContent.append("\n");
    if (correspondenceModel == null) {
      IPath filePath = file.getFullPath().removeFileExtension();
      IPath correspondenceModelPath = filePath.addFileExtension("xmi");

      URI linksURI = URI.createFileURI(correspondenceModelPath.toString());
      createCorrespondenceModel(linksURI);
      correspondenceModelPath = correspondenceModelPath.makeRelative();
      correspondenceModel = correspondenceModelPath.toString();
    }

    if (dslTechnology.compareToIgnoreCase("none") != 0 && correspondenceModelBase == null) {
      IPath modelBasePath = file.getFullPath().removeFileExtension().addFileExtension("ecl");

      IWorkspace workspace = ResourcesPlugin.getWorkspace();
      String veamosA = new File(workspace.getRoot().getLocationURI().getPath()).getAbsolutePath();
      String laRuta = veamosA.concat(modelBasePath.toString());

      correspondenceModelBase = modelBasePath.toString();

      File fileModelBase = new File(laRuta);
      fileModelBase.createNewFile();

      String correspondenceModelLine = "correspondenceModel=" + correspondenceModel;

      fileContent.append(correspondenceModelLine);
      fileContent.append("\n");

      String correspondenceModelBaseLine =
          "correspondenceModelBase=" + correspondenceModel.replaceAll("xmi", dslTechnology);
      fileContent.append(correspondenceModelBaseLine);
      fileContent.append("\n");
      String filtersMetamodelLine = "filtersMetamodel=" + filtersMM;
      fileContent.append(filtersMetamodelLine);

      InputStream stream = openContentStream(fileContent.toString());
      if (file.exists()) {
        file.setContents(stream, true, true, null);
      } else {
        file.create(stream, true, null);
      }
      stream.close();
    }

  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    // VirtualLinksFactory linksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks vLinks = (VirtualLinks) correspondenceModelResource.getContents().get(0);
    vLinks.getVirtualLinks().clear();
    vLinks.getLinkedElements().clear();
    correspondenceModelResource.save(new HashMap<String, String>());
    properties.store(outputStream, null);
  }

  private void setVirtualContents() {
    Collection<Object> localPackages = virtualResourceSet.getPackageRegistry().values();
    List<List<EObject>> sublists = new ArrayList<>();

    for (Object object : localPackages) {
      if (object instanceof EPackage) {
        List<EObject> oneOftheSublists = new ArrayList<>();
        oneOftheSublists.add((EObject) object);
        sublists.add(oneOftheSublists);
      }
    }
    this.virtualContents = new VirtualContents<>(this, sublists);
  }

  // FIXME: unused?
  private InputStream openContentStream(String contents) {
    return new ByteArrayInputStream(contents.getBytes());
  }

  @Override
  public ResourceSet getResourceSet() {
    return virtualResourceSet;
  }

}
