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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.inria.atlanmod.emfviews.util.EMFViewsUtil;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.ElementFilter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.NewAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.NewConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.NewProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

public class Viewpoint extends ResourceImpl {

  private static String EVIEWPOINT_CONTRIBUTING_METAMODELS = "contributingMetamodels";
  private static String EVIEWPOINT_WEAVING_MODEL = "weavingModel";
  private static String EVIEWPOINT_MATCHING_MODEL = "matchingModel";

  // Paths and URIs serialized in the EViewpoint file
  private List<String> contributingMetamodelsPaths;
  private URI weavingModelURI;
  private Optional<String> matchingModelPath;

  private List<EPackage> contributingEPackages; // original, unmodified EPackages
  private WeavingModel weavingModel; // how to modify the EPackages

  private ResourceSet virtualResourceSet; // contains the cloned and modified EPackages
  private EPackage virtualPackage; // contains the new concepts
  private EList<EObject> virtualContents; // built from the modified EPackages and the VirtualPackage

  // map to keep track of the EObject created by each New* element from the weaving model,
  // in order to be able to use VirtualElement as LinkedElements in findEObject
  private Map<VirtualElement, EObject> syntheticElements;

  public Viewpoint(URI uri) {
    super(uri);
  }

  @Override
  protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
    Properties p = new Properties();
    p.load(inputStream);

    parseProperties(p);

    contributingEPackages = loadMetamodels(contributingMetamodelsPaths);
    virtualResourceSet = new ResourceSetImpl();
    EPackage.Registry registry = virtualResourceSet.getPackageRegistry();
    // Clone each metamodel into our virtual resource set, so that we can add and
    // remove elements from them without affecting the originals.
    cloneEPackages(contributingEPackages, registry);

    weavingModel = loadWeavingModel(weavingModelURI);

    // Filter concrete elements
    applyFilters(weavingModel.getElementFilters(), registry);

    // Create all New* elements first, and set their EMF attribute after to avoid any circular dependencies
    syntheticElements = createSyntheticElements(weavingModel.getVirtualElements());

    // The virtualPackage holds all the new concepts, but is created only if
    // we have some concepts to put in it
    List<NewConcept> concepts = weavingModel.getNewConcepts();
    if (!concepts.isEmpty()) {
      virtualPackage = createVirtualPackage(weavingModel.getName());
      registry.put(virtualPackage.getNsURI(), virtualPackage);
      buildNewConcepts(weavingModel.getNewConcepts(), virtualPackage, registry);
    }

    buildNewProperties(weavingModel.getNewProperties(), registry);
    buildNewAssociations(weavingModel.getNewAssociations(), registry);

    virtualContents = buildVirtualContents();

    validateVirtualResourceSet(virtualResourceSet);
  }

  @Override
  protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
    Properties p = new Properties();
    p.setProperty(EVIEWPOINT_CONTRIBUTING_METAMODELS,
                  String.join(",", contributingMetamodelsPaths));
    p.setProperty(EVIEWPOINT_WEAVING_MODEL, weavingModelURI.toString());
    p.setProperty(EVIEWPOINT_MATCHING_MODEL, matchingModelPath.orElse(""));
    p.store(outputStream, null);
  }

  @Override
  public EList<EObject> getContents() {
    return virtualContents;
  }

  @Override
  public ResourceSet getResourceSet() {
    return virtualResourceSet;
  }

  private void parseProperties(Properties p) {
    // Parse contributingMetamodels line
    contributingMetamodelsPaths = new ArrayList<>();
    for (String path : p.getProperty(EVIEWPOINT_CONTRIBUTING_METAMODELS).split(",")) {
      contributingMetamodelsPaths.add(path);
    }

    // Parse weavingModel line
    String weavingModelPath = p.getProperty(EVIEWPOINT_WEAVING_MODEL);
    try {
      weavingModelURI = URI.createURI(weavingModelPath);
    } catch (IllegalArgumentException ex) {
      throw EX("Weaving model path is an invalid URI: '%s'", ex);
    }

    // Parse matchingModel line
    try {
      matchingModelPath = Optional.ofNullable(p.getProperty(EVIEWPOINT_MATCHING_MODEL));
    } catch (IllegalArgumentException ex) {
      matchingModelPath = Optional.empty();
    }
  }

  // Return a list of EPackage from the list of metamodels paths
  private List<EPackage> loadMetamodels(List<String> metamodelsPaths) {
    List<EPackage> packages = new ArrayList<>();
    for (String path : metamodelsPaths) {
      // Get the EPackage from each metamodel URI
      EPackage p = EMFViewsUtil.getEPackageFromPath(path)
          .orElseThrow(() -> EX("Could not load EPackage from contributing metamodel '%s'", path));
      packages.add(p);
    }
    return packages;
  }

  // Clone the packages into the given package registry
  private void cloneEPackages(List<EPackage> packages, EPackage.Registry registry) {
    for (EPackage p : packages) {
      EPackage copy = EcoreUtil.copy(p);
      registry.put(p.getNsURI(), copy);
    }
  }

  // Load and return the weaving model from URI
  private WeavingModel loadWeavingModel(URI weavingModelURI) {
    Resource r = new ResourceSetImpl().getResource(weavingModelURI, true);
    EObject wm = r.getContents().get(0);
    if (!(wm instanceof WeavingModel)) throw EX("Resource at '%s' is not a WeavingModel", r);
    return (WeavingModel) wm;
  }

  // Apply the given filters to all the packages in the virtual resource set.
  private void applyFilters(List<ElementFilter> filters, EPackage.Registry registry) {
    // TODO: whitelisting

    for (ElementFilter f : filters) {
      LinkedElement l = f.getTarget();
      EObject filteredElement = findEObject(l, registry);
      EcoreUtil.delete(filteredElement);
    }
  }

  private Map<VirtualElement, EObject> createSyntheticElements(List<VirtualElement> elems) {
    Map<VirtualElement, EObject> map = new HashMap<>();
    for (VirtualElement v : elems) {
      if (v instanceof NewConcept) {
        map.put(v, EcoreFactory.eINSTANCE.createEClass());
      } else if (v instanceof NewProperty) {
        map.put(v, EcoreFactory.eINSTANCE.createEAttribute());
      } else if (v instanceof NewAssociation) {
        map.put(v, EcoreFactory.eINSTANCE.createEReference());
      } else {
        throw EX("Unknown instance of virtual element, '%s'", v);
      }
    }
    return map;
  }

  private EPackage createVirtualPackage(String name) {
    EPackage p = EcoreFactory.eINSTANCE.createEPackage();
    p.setName(name);
    p.setNsURI("http://inria/atlanmod/emfviews/viewpoint/" + name);
    p.setNsPrefix(name);
    return p;
  }

  private void buildNewConcepts(List<NewConcept> concepts, EPackage virtualPackage,
                                EPackage.Registry registry) {
    for (NewConcept c : concepts) {
      EClass klass = (EClass) syntheticElements.get(c);
      klass.setName(c.getName());
      virtualPackage.getEClassifiers().add(klass);

      for (LinkedElement e : c.getSuperConcepts()) {
        EObject sup = findEObject(e, registry);
        if (!(sup instanceof EClass))
          throw EX("Superconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
        klass.getESuperTypes().add((EClass) sup);
      }

      for (LinkedElement e : c.getSubConcepts()) {
        EObject sub = findEObject(e, registry);
        if (!(sub instanceof EClass))
          throw EX("Subconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
        ((EClass) sub).getESuperTypes().add(klass);
      }
    }
  }

  private void buildNewProperties(List<NewProperty> properties, EPackage.Registry registry) {
    for (NewProperty p : properties) {
      EObject parent = findEObject(p.getParent(), registry);
      if (!(parent instanceof EClass))
        throw EX("Parent of new property '%s' should be an EClass", p.getName());
      EClass parentClass = (EClass) parent;

      String n = p.getName();
      EAttribute attr = (EAttribute) syntheticElements.get(p);
      attr.setName(n);
      attr.setEType(getTypeFromName(p.getType())
          .orElseThrow(() -> EX("Invalid type '%s' for new property '%s'", p.getType(), n)));
      attr.setUpperBound(1);
      if (p.isOptional())
        attr.setLowerBound(0);
      else
        attr.setLowerBound(1);
      parentClass.getEStructuralFeatures().add(attr);
    }
  }

  private void buildNewAssociations(List<NewAssociation> associations, EPackage.Registry registry) {
    for (NewAssociation a : associations) {
      // Each association is turned into an EReference

      EObject source = findEObject(a.getSource(), registry);
      EObject target = findEObject(a.getTarget(), registry);

      EReference ref = (EReference) syntheticElements.get(a);
      ref.setName(a.getName());
      if (!(target instanceof EClassifier))
        throw EX("Target '%s' of new association '%s' should be an EClassifier", target,
                 a.getName());
      ref.setEType((EClassifier) target);
      ref.setLowerBound(a.getLowerBound());
      ref.setUpperBound(a.getUpperBound());
      if (!(source instanceof EClass))
        throw EX("Source '%s' of new association '%s' should be an EClass", source, a.getName());

      LinkedElement opposite = a.getOpposite();
      if (opposite != null) {
        EObject o = findEObject(opposite, registry);
        if (!(o instanceof EReference))
          throw EX("Opposite of new association '%s' should be an EReference", a.getName());
        EReference opp = (EReference) o;
        ref.setEOpposite(opp);
        opp.setEOpposite(ref);
      }

      ref.setContainment(a.isComposition());

      ((EClass) source).getEStructuralFeatures().add(ref);
    }
  }

  private EObject findEObject(LinkedElement elem, EPackage.Registry registry) {
    if (elem instanceof ConcreteElement) {
      ConcreteElement e = (ConcreteElement) elem;

      String modelURI = e.getModel().getURI();
      EObject model = registry.getEPackage(modelURI);
      if (model == null)
        throw EX("Model '%s' of concrete element cannot be found in package registry", modelURI);

      String path = e.getPath();
      EObject obj = EMFViewsUtil.findElement(model, path)
          .orElseThrow(() -> EX("ConcreteElement '%s' cannot be found in model '%s'", path,
                                modelURI));

      return obj;

    } else if (elem instanceof VirtualElement) {
      if (!syntheticElements.containsKey(elem))
        throw EX("Virtual element for '%s' does not exist or has not been created yet", elem);

      EObject obj = syntheticElements.get(elem);
      if (obj == null) throw EX("Virtual element for '%s' is null.  This shouldn't happen.", elem);

      return obj;

    } else {
      throw EX("Unknown instance of LinkedElement: '%s'", elem.eClass().getName());
    }
  }

  private Optional<EClassifier> getTypeFromName(String name) {
    switch (name) {
    case "boolean":
      return Optional.of(EcorePackage.Literals.EBOOLEAN);
    case "byte":
      return Optional.of(EcorePackage.Literals.EBYTE);
    case "char":
      return Optional.of(EcorePackage.Literals.ECHAR);
    case "double":
      return Optional.of(EcorePackage.Literals.EDOUBLE);
    case "float":
      return Optional.of(EcorePackage.Literals.EFLOAT);
    case "int":
      return Optional.of(EcorePackage.Literals.EINT);
    case "long":
      return Optional.of(EcorePackage.Literals.ELONG);
    case "short":
      return Optional.of(EcorePackage.Literals.ESHORT);
    case "String":
      return Optional.of(EcorePackage.Literals.ESTRING);
    case "Date":
      return Optional.of(EcorePackage.Literals.EDATE);

    default:
      return Optional.empty();
    }
  }

  private VirtualContents<EObject> buildVirtualContents() {
    List<List<EObject>> sublists = new ArrayList<>();

    // The order of packages in the virtual contents matters. We use the order
    // specified by the contributing models, and the virtual package is last.
    for (EPackage p : contributingEPackages) {
      List<EObject> oneOftheSublists = new ArrayList<>();
      oneOftheSublists.add((EObject) virtualResourceSet.getPackageRegistry().get(p.getNsURI()));
      sublists.add(oneOftheSublists);
    }

    // The virtual package is not included if there are no new concepts.
    if (virtualPackage != null) {
      List<EObject> l = new ArrayList<>();
      l.add(virtualPackage);
      sublists.add(l);
    }

    return new VirtualContents<>(this, sublists);
  }

  private void validateVirtualResourceSet(ResourceSet r) {
    for (Object p : r.getPackageRegistry().values()) {
      // Since we inherit from Resource, which has an internal Diagnostic interface, we have to use the fully qualified
      // name here
      org.eclipse.emf.common.util.Diagnostic d = Diagnostician.INSTANCE.validate((EObject) p);
      if ((d.getSeverity() & org.eclipse.emf.common.util.Diagnostic.ERROR) != 0) {
        throw EX("Ecore validation error: '%s'", d);
      }
    }
  }

  private ViewpointException EX(String msg, Object... args) {
    return new ViewpointException(msg, args);
  }

  public Optional<String> getMatchingModelPath() {
    return matchingModelPath;
  }

  public List<String> getContributingMetamodelsPaths() {
    return contributingMetamodelsPaths;
  }

}
