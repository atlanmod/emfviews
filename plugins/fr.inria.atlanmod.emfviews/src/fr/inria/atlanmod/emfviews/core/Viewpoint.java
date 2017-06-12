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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import fr.inria.atlanmod.emfviews.util.EMFViewsUtil;
import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;

public class Viewpoint extends ResourceImpl {

  private Properties properties;

  private ResourceSet virtualResourceSet;
  /**
   * The contents of the virtual model
   */
  private EList<EObject> virtualContents; // list of resources

  /**
   * Contains all the attributes we have removed from packages in the virtual
   * resource set. Used by the ViewpointEditor.
   */
  private ArrayList<EObject> hiddenAttributes;

  public ArrayList<EObject> getHiddenAttributes() {
    return hiddenAttributes;
  }

  private String contributingMetamodels;
  private String matchingModel;

  public String getMatchingModel() {
    return matchingModel;
  }

  private Resource weavingModelResource;
  private ArrayList<EPackage> contributingEpackages;

  public ArrayList<EPackage> getContributingEpackages() {
    return contributingEpackages;
  }

  public String getContributingMetamodelsURIs() {
    return contributingMetamodels;
  }

  @Override
  public EList<EObject> getContents() {
    return virtualContents;
  }

  public Viewpoint(URI uri) {
    super(uri);
    virtualResourceSet = new ResourceSetImpl();

  }

  public Resource getWeavingModelResource() {
    return weavingModelResource;
  }

  // FIXME: unused?
  public void setWeavingModelResource(Resource weavingModelResource) {
    this.weavingModelResource = weavingModelResource;
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    properties = new Properties();
    properties.load(inputStream);
    // FIXME: this should create a weaving model XMI from the ECL file, but do
    // we actually need it?
    if (properties.getProperty("matchingModel") != null) {
      matchingModel = properties.getProperty("matchingModel");
      // try {
      // VirtualLinksDelegator vld = new VirtualLinksDelegator(
      // properties.getProperty("matchingModel"));
      // vld.createVirtualMetamodelLinks(URI.createURI(properties.getProperty("weavingModel"));
      // //extendedMMviewpoint.xmi is rewrited
      // } catch (CoreException e) {
      // e.printStackTrace();
      // }
    }

    cloneContributingMetamodels(properties.getProperty("contributingMetamodels"));
    loadWeavingModel(properties.getProperty("weavingModel"));
    setVirtualContents();
  }

  Resource attributesToHideMM;

  public Resource getAttributesToHideMM() {
    return attributesToHideMM;
  }

  // Clone each metamodel into our virtual resource set, so that we can add and
  // remove elements from them without affecting the originals.
  private void cloneContributingMetamodels(String contributingModelsURIs) {
    this.contributingMetamodels = contributingModelsURIs;
    contributingEpackages = new ArrayList<>();

    for (String modelURI : contributingModelsURIs.split(",")) {
      // Get the EPackage from each metamodel URI
      EPackage p = EMFViewsUtil.getEPackageFromURI(modelURI);
      contributingEpackages.add(p);

      // Clone the package into our virtual resource set
      EPackage copy = EcoreUtil.copy(p);
      virtualResourceSet.getPackageRegistry().put(p.getNsURI(), copy);
    }
  }

  /**
   * Apply the given filters to all the packages in the virtual resource set.
   *
   * @param filters The filters describing the elements to remove from the
   *          packages in the resource set.
   */
  private void filterMetamodels(List<Filter> filters) {
    hiddenAttributes = new ArrayList<>();

    for (Filter f : filters) {
      LinkedElement e = f.getFilteredElement();
      EObject root = virtualResourceSet.getPackageRegistry().getEPackage(e.getModelRef());
      EObject filteredElement = EMFViewsUtil.findElement(root, e.getElementRef());
      if (filteredElement != null) {
        EcoreUtil.remove(filteredElement);
        hiddenAttributes.add(filteredElement);
      }
    }
  }

  private void loadWeavingModel(String weavingModelURI) throws FileNotFoundException, IOException {
    // VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
    weavingModelResource = new ResourceSetImpl().getResource(URI.createURI(weavingModelURI), true);

    // Get the virtual links from the serialized resource
    // FIXME: this cast can fail if the XMI is not a VirtualLinks
    VirtualLinks virtualLinks = (VirtualLinks) weavingModelResource.getContents().get(0);

    // Separate associations and filters links
    List<Association> associations = new ArrayList<>();
    List<Filter> filters = new ArrayList<>();
    for (VirtualLink link : virtualLinks.getVirtualLinks()) {
      if (link instanceof Association) {
        associations.add((Association) link);
      } else if (link instanceof Filter) {
        filters.add((Filter) link);
      }
    }

    // Remove filtered elements from the packages in the resource set
    filterMetamodels(filters);

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
      Resource metamodelResource = virtualResourceSet
          .getResource(URI.createURI(properties.getProperty("contributingMetamodels"), true), true);
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

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    // VirtualLinksFactory linksFactory = VirtualLinksFactory.eINSTANCE;
    VirtualLinks vLinks = (VirtualLinks) weavingModelResource.getContents().get(0);
    vLinks.getVirtualLinks().clear();
    vLinks.getLinkedElements().clear();
    weavingModelResource.save(null);
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
