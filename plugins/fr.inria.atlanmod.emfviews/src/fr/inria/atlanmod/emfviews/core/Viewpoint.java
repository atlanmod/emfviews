/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 3
 * which is available at https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *   fmdkdd - refactoring and extension
 *   Juan David Villa Calle - initial API and implementation
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

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.inria.atlanmod.emfviews.elements.VirtualEAttribute;
import fr.inria.atlanmod.emfviews.elements.VirtualEClass;
import fr.inria.atlanmod.emfviews.elements.VirtualEPackage;
import fr.inria.atlanmod.emfviews.elements.VirtualEReference;
import fr.inria.atlanmod.emfviews.elements.VirtualEStructuralFeature;
import fr.inria.atlanmod.emfviews.elements.Virtualizer;
import fr.inria.atlanmod.emfviews.util.EMFViewsUtil;
import fr.inria.atlanmod.emfviews.virtuallinks.Association;
import fr.inria.atlanmod.emfviews.virtuallinks.Concept;
import fr.inria.atlanmod.emfviews.virtuallinks.ConcreteElement;
import fr.inria.atlanmod.emfviews.virtuallinks.Element;
import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualConcept;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualProperty;
import fr.inria.atlanmod.emfviews.virtuallinks.WeavingModel;

public class Viewpoint extends ResourceImpl implements Virtualizer {

  public static String EVIEWPOINT_CONTRIBUTING_METAMODELS = "contributingMetamodels";
  public static String EVIEWPOINT_WEAVING_MODEL = "weavingModel";
  public static String EVIEWPOINT_MATCHING_MODEL = "matchingModel";

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

  // Used by the Virtualizer implementation
  private Map<EObject, EObject> concreteToVirtual;

  public Viewpoint() {
    super();
  }

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
    applyFilters(weavingModel.getFilters(), registry, !weavingModel.isWhitelist());

    // Create all New* elements first, and set their EMF attribute after to avoid any circular dependencies
    syntheticElements = createSyntheticElements(weavingModel.getVirtualElements());

    // The virtualPackage holds all the new concepts, but is created only if
    // we have some concepts to put in it
    List<VirtualConcept> concepts = weavingModel.getVirtualConcepts();
    if (!concepts.isEmpty()) {
      virtualPackage = createVirtualPackage(weavingModel.getName());
      registry.put(virtualPackage.getNsURI(), virtualPackage);
      buildNewConcepts(concepts, virtualPackage, registry);
    }

    buildNewProperties(weavingModel.getVirtualProperties(), registry);
    buildNewAssociations(weavingModel.getVirtualAssociations(), registry);

    //validateVirtualResourceSet(virtualResourceSet);
  }

  @Override
  protected void doUnload() {
    virtualContents = null;
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
    if (virtualContents == null) {
      virtualContents = buildVirtualContents();
    }
    return virtualContents;
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
      // Whitespace is the same as an absent field
      if (matchingModelPath.isPresent() && matchingModelPath.get().trim().isEmpty()) {
        matchingModelPath = Optional.empty();
      }
    } catch (IllegalArgumentException ex) {
      matchingModelPath = Optional.empty();
    }
  }

  // Return a list of EPackage from the list of metamodels paths
  private List<EPackage> loadMetamodels(List<String> metamodelsPaths) {
    List<EPackage> packages = new ArrayList<>();
    for (String path : metamodelsPaths) {
      // Get the EPackage from each metamodel URI
      URI uri = URI.createURI(path).resolve(getURI());

      Optional<EPackage> p = Optional.empty();

      // If it's a namespace URI, fetch from the package registry
      if ("http".equals(uri.scheme())) {
        p = Optional.ofNullable(EPackage.Registry.INSTANCE.getEPackage(uri.toString()));
      }
      // If it's an Ecore file, then get the EPackage from the resource
      else if (uri.fileExtension().equals("ecore")) {
        Resource r = new ResourceSetImpl().getResource(uri, true);
        // @Assumption: the Ecore contains only one EPackage we care about
        p = Optional.of((EPackage) r.getContents().get(0));
      }

      packages.add(p.orElseThrow(() -> EX("Could not load EPackage from contributing metamodel '%s'", path)));
    }
    return packages;
  }

  // Lazy constructor
  protected Map<EObject, EObject> concreteToVirtual() {
    if (concreteToVirtual == null) {
      concreteToVirtual = new HashMap<>();
    }
    return concreteToVirtual;
  }

  @Override
  public <E extends EObject> E getVirtual(E o) {
    if (o == null) {
      return o;
    }

    // Don't virtualize virtual objects!
    if (o instanceof VirtualEPackage
        || o instanceof VirtualEClass
        || o instanceof VirtualEStructuralFeature)
      return o;

    @SuppressWarnings("unchecked") // trust me, we map E to E
    E virtual = (E) concreteToVirtual().computeIfAbsent(o, obj -> {
      // @Refactor: looks like a factory
      if (o instanceof EPackage) return new VirtualEPackage((EPackage) obj, this);
      if (o instanceof EClass) return new VirtualEClass((EClass) obj, this);
      if (o instanceof EAttribute) return new VirtualEAttribute((EAttribute) obj, this);
      if (o instanceof EReference) return new VirtualEReference((EReference) obj, this);

      // Abort the mapping if it's an object we cannot virtualize
      return null;
    });

    if (virtual != null) {
      return virtual;
    } else {
      // @Correctness: maybe we should fail here.  Currently, this lets EDataType and EEnum
      // pass unvirtualized
      return o;
    }
  }

  // Clone the packages into the given package registry
  private void cloneEPackages(List<EPackage> packages, EPackage.Registry registry) {
    for (EPackage p : packages) {
      // @Optimize: maybe we can avoid virtualizing everything early.  But delaying
      // their creation could be tricky to get right.
      registry.put(p.getNsURI(), getVirtual(p));
    }
  }

  // Load and return the weaving model from URI
  private WeavingModel loadWeavingModel(URI weavingModelURI) {
    URI uri = weavingModelURI.resolve(getURI());
    Resource r = new ResourceSetImpl().getResource(uri, true);
    EObject wm = r.getContents().get(0);
    if (!(wm instanceof WeavingModel)) throw EX("Resource at '%s' is not a WeavingModel", r);
    return (WeavingModel) wm;
  }

  // Apply the given filters to all the packages in the virtual resource set.
  private void applyFilters(List<Filter> filters, EPackage.Registry registry, boolean blacklist) {
    if (blacklist) {
      for (Filter f : filters) {
        ConcreteElement l = f.getTarget();
        EObject filteredElement = findEObject(l, registry);

        if (filteredElement instanceof EStructuralFeature) {
          EStructuralFeature feature = (EStructuralFeature) filteredElement;
          ((VirtualEClass) feature.getEContainingClass()).filterFeature(feature);
        } else if (filteredElement instanceof EClassifier) {
          EClassifier classifier = (EClassifier) filteredElement;
          ((VirtualEPackage) classifier.getEPackage()).filterClassifier(classifier);
        }
      }
    } else {
      // Whitelisting: build a list of objects to delete, then delete them
      // @Optimize: complexity is O(n*m) where n is the total numbef of EObjects
      // in all packages from the registry, and m is the number of filters.
      List<EObject> filtered = new ArrayList<>();

      for (Object po : registry.values()) {
        EPackage p = (EPackage) po;
        TreeIterator<EObject> it = p.eAllContents();
        while (it.hasNext()) {
          EObject o = it.next();

          // @Correctness: Cannot target elements that do not have a name, so we leave them alone
          // Crucially, EGenericType is not an ENamedElement, but is contained by
          // EStructuralFeature, and we don't want to delete those.
          if ((o instanceof ENamedElement)) {
            String path = EMFViewsUtil.getEObjectPath(o);

            // If path is not a prefix for any element filter, we can delete this object
            if (!filters.stream().anyMatch(f -> f.getTarget().getPath().startsWith(path))) {
              filtered.add(o);
            }
          }
        }
      }

      for (EObject o : filtered) {
        if (o instanceof EStructuralFeature) {
          EStructuralFeature feature = (EStructuralFeature) o;
          ((VirtualEClass) feature.getEContainingClass()).filterFeature(feature);
        } else if (o instanceof EClassifier) {
          EClassifier c = (EClassifier) o;
          // @Correctness: the getVirtual is necessary because EEnum are not virtualized,
          // and hence their getEPackage result will not be virtualized either.
          // Maybe we should implement VirtualEClassifier after all?
          VirtualEPackage p = (VirtualEPackage) getVirtual(c.getEPackage());
          p.filterClassifier(c);
        }
      }
    }
  }

  private Map<VirtualElement, EObject> createSyntheticElements(List<VirtualElement> elems) {
    Map<VirtualElement, EObject> map = new HashMap<>();
    for (VirtualElement v : elems) {
      if (v instanceof VirtualConcept) {
        map.put(v, EcoreFactory.eINSTANCE.createEClass());
      } else if (v instanceof VirtualProperty) {
        map.put(v, EcoreFactory.eINSTANCE.createEAttribute());
      } else if (v instanceof VirtualAssociation) {
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

  private void buildNewConcepts(List<VirtualConcept> concepts, EPackage virtualPackage,
                                EPackage.Registry registry) {
    for (VirtualConcept c : concepts) {
      EClass klass = (EClass) syntheticElements.get(c);
      klass.setName(c.getName());
      virtualPackage.getEClassifiers().add(klass);

      for (Concept e : c.getSuperConcepts()) {
        EObject sup = findEObject(e, registry);
        if (!(sup instanceof EClass))
          throw EX("Superconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
        klass.getESuperTypes().add((EClass) sup);
      }

      for (Concept e : c.getSubConcepts()) {
        EObject sub = findEObject(e, registry);
        if (!(sub instanceof EClass))
          throw EX("Subconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
        ((VirtualEClass) getVirtual(sub)).addVirtualSuperType(klass);
      }
    }
  }

  private void buildNewProperties(List<VirtualProperty> properties, EPackage.Registry registry) {
    for (VirtualProperty p : properties) {
      EObject parent = findEObject(p.getParent(), registry);
      if (!(parent instanceof EClass))
        throw EX("Parent of new property '%s' should be an EClass", p.getName());
      VirtualEClass parentClass = (VirtualEClass) getVirtual(parent);

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
      parentClass.addVirtualFeature((VirtualEAttribute) getVirtual(attr));
    }
  }

  private void buildNewAssociations(List<VirtualAssociation> associations,
                                    EPackage.Registry registry) {
    for (VirtualAssociation a : associations) {
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

      Association opposite = a.getOpposite();
      if (opposite != null) {
        EObject o = findEObject(opposite, registry);
        if (!(o instanceof EReference))
          throw EX("Opposite of new association '%s' should be an EReference", a.getName());
        EReference opp = (EReference) o;
        ((VirtualEReference) getVirtual(ref)).setVirtualOpposite(getVirtual(opp));
        ((VirtualEReference) getVirtual(opp)).setVirtualOpposite(getVirtual(ref));
      }

      ref.setContainment(a.isComposition());

      ((VirtualEClass) source).addVirtualFeature((VirtualEStructuralFeature) getVirtual(ref));

      // We have to set the eContainingClass feature of the reference manually, since the feature is virtual.
      // We don't want this to be done automatically in addVirtualFeature, because we don't want to alter
      // a contributing metamodel accidentally.  Here, we know `ref` is synthetic, and not part of an existing
      // metamodel, so we can modify it.
      ((InternalEObject) ref).eInverseAdd((InternalEObject) source, EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS,
                                          EStructuralFeature.class, null);

    }
  }

  private EObject findEObject(Element elem, EPackage.Registry registry) {
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

  private EList<EObject> buildVirtualContents() {
    List<EObject> contents = new ArrayList<>();

    // The order of packages in the virtual contents matters. We use the order
    // specified by the contributing models, and the virtual package is last.
    for (EPackage p : contributingEPackages) {
      contents.add((EObject) virtualResourceSet.getPackageRegistry().get(p.getNsURI()));
    }

    // The virtual package is not included if there are no new concepts.
    if (virtualPackage != null) {
      contents.add(getVirtual(virtualPackage));
    }

    return ECollections.unmodifiableEList(contents);
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

  public Optional<URI> getMatchingModelURI() {
    return matchingModelPath.map(path -> URI.createURI(path).resolve(getURI()));
  }

  public List<String> getContributingMetamodelsPaths() {
    return contributingMetamodelsPaths;
  }

  public List<EPackage> getContributingEPackages() {
    return contributingEPackages;
  }

}
