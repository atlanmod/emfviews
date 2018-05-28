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

package org.atlanmod.emfviews.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.atlanmod.emfviews.elements.VirtualEAttribute;
import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEClassifier;
import org.atlanmod.emfviews.elements.VirtualEDataType;
import org.atlanmod.emfviews.elements.VirtualEEnum;
import org.atlanmod.emfviews.elements.VirtualEPackage;
import org.atlanmod.emfviews.elements.VirtualEReference;
import org.atlanmod.emfviews.elements.VirtualEStructuralFeature;
import org.atlanmod.emfviews.util.EMFViewsUtil;
import org.atlanmod.emfviews.virtuallinks.Association;
import org.atlanmod.emfviews.virtuallinks.Concept;
import org.atlanmod.emfviews.virtuallinks.ConcreteElement;
import org.atlanmod.emfviews.virtuallinks.Element;
import org.atlanmod.emfviews.virtuallinks.Filter;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualConcept;
import org.atlanmod.emfviews.virtuallinks.VirtualElement;
import org.atlanmod.emfviews.virtuallinks.VirtualProperty;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

public class Viewpoint implements EcoreVirtualizer {

  // Options
  private List<EPackage> contributingPackages; // original, unmodified EPackages
  private WeavingModel weavingModel; // how to modify the EPackages

  private String rootPackageName = "viewpoint";
  private String rootPackageNsURI = "http://www.atlanmod.org/emfviews/viewpoint";

  // Attributes
  private ResourceSet baseResourceSet; // contains the contributing EPackages
  private ResourceSet virtualResourceSet; // contains the virtualized EPackages
  private VirtualEPackage rootPackage; // contains the virtual contributing packages and the virtual package
  private EPackage virtualPackage; // contains the new concepts

  // Map to keep track of the EObject created by each *new* element from the weaving model,
  // in order to be able to use VirtualElement as LinkedElements in findEObject
  private Map<VirtualElement, EObject> syntheticElements;

  // Used by the Virtualizer implementation to cache virtual elements
  private Map<EObject, EObject> concreteToVirtual;

  // A viewpoint without contributing metamodels is still useful as a virtualizer
  public Viewpoint() {}

  public Viewpoint(List<EPackage> contributingMetamodels) {
    this(contributingMetamodels, null);
  }

  public Viewpoint(List<EPackage> contributingMetamodels, WeavingModel weavingModel) {
    this.contributingPackages = contributingMetamodels;
    this.weavingModel = weavingModel;

    build();
  }

  // Create the virtual elements and virtual packages.
  protected void build() {
    baseResourceSet = new ResourceSetImpl();
    virtualResourceSet = new ResourceSetImpl();
    EPackage.Registry baseRegistry = baseResourceSet.getPackageRegistry();
    EPackage.Registry virtualRegistry = virtualResourceSet.getPackageRegistry();

    // All contributing packages are put under a parent virtual package,
    // otherwise OCL will have difficulties finding classifiers
    EPackage concreteRoot = EcoreFactory.eINSTANCE.createEPackage();
    concreteRoot.setName(rootPackageName);
    concreteRoot.setNsURI(rootPackageNsURI);
    rootPackage = getVirtual(concreteRoot);

    // Put each metamodel into a resource set, so that we can easily find elements
    // from it using findEObject.
    // We have to register all subpackages of contributing packages to allow
    // findEObject to find a model when looking up only the URI.
    Iterable<EPackage> allPackages = contributingPackages.stream()
        .flatMap(p -> EMFViewsUtil.getAllPackages(p).stream())
        ::iterator;
    for (EPackage p : allPackages) {
      baseRegistry.put(p.getNsURI(), p);
    }

    // We also put *virtual* elements in the virtual resource set, so that we can add and
    // remove elements from them without affecting the originals.
    for (EPackage p : contributingPackages) {
      virtualRegistry.put(p.getNsURI(), getVirtual(p));
      // The order of packages in the root package matters. We use the order
      // specified by the contributing models, and the virtual package is last.
      rootPackage.addVirtualPackage(getVirtual(p));
    }

    // Filter concrete elements (we don't allow filtering of virtual elements, so we can apply filters
    // before creating those)
    applyFilters(virtualRegistry);

    // Create all *new* elements first, and set their EMF attributes after to avoid any circular dependencies
    syntheticElements = createSyntheticElements();

    // The virtualPackage holds all the new concepts, but is created only if
    // we have some concepts to put in it
    List<VirtualConcept> concepts = weavingModel.getVirtualConcepts();
    if (!concepts.isEmpty()) {
      String name = weavingModel.getName();
      virtualPackage = EcoreFactory.eINSTANCE.createEPackage();
      virtualPackage.setName(name);
      virtualPackage.setNsURI("http://www.atlanmod.org/emfviews/viewpoint/" + name);
      virtualPackage.setNsPrefix("virtualpackage" + name);
      virtualRegistry.put(virtualPackage.getNsURI(), virtualPackage);
      buildNewConcepts(baseRegistry);

      rootPackage.addVirtualPackage(getVirtual(virtualPackage));
    }

    buildNewProperties(baseRegistry);
    buildNewAssociations(baseRegistry);

    // @Correctness: the resulting package should be a valid Ecore metamodel.
    // That is not the case currently due to filters.
    // validateVirtualResourceSet(virtualResourceSet);
  }

  // Apply the given filters to all the packages in the virtual resource set.
  private void applyFilters(EPackage.Registry registry) {
    List<Filter> filters = weavingModel.getFilters();
    boolean blacklist = !weavingModel.isWhitelist();

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

            // If path does not match any filter, we can delete this object
            if (!filters.stream()
                .anyMatch(f -> matchesFilter(f.getTarget().getPath(), path))) {
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
          ((VirtualEPackage) c.getEPackage()).filterClassifier(c);
        }
      }
    }
  }

  private static boolean matchesFilter(String filter, String path) {
    if (filter.endsWith(".*")) {
      // In the case of a wildcard 'a.b.*', it's a match if the path is
      // of the form 'a.b.x', but not 'a.b.x.y'.
      // It's also a match if the path is 'a.b' and 'a', to include parents.

      // Drop the '.*'
      String filterBase = filter.substring(0, filter.length() - 3);

      // Drop anything after the last dot
      String[] pathComp = path.split("\\.");
      String pathBase = Arrays.stream(pathComp)
          .limit(Math.max(1, pathComp.length - 1)).collect(Collectors.joining(","));

      return pathBase.startsWith(filterBase);
    } else {
      // Otherwise, if path is a prefix of filter, it's a match
      return filter.startsWith(path);
    }
  }

  private Map<VirtualElement, EObject> createSyntheticElements() {
    Map<VirtualElement, EObject> map = new HashMap<>();
    for (VirtualElement v : weavingModel.getVirtualElements()) {
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

  private void buildNewConcepts(EPackage.Registry registry) {
    for (VirtualConcept c : weavingModel.getVirtualConcepts()) {
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
        getVirtual((EClass) sub).addVirtualSuperType(klass);
      }
    }
  }

  private void buildNewProperties(EPackage.Registry registry) {
    for (VirtualProperty p : weavingModel.getVirtualProperties()) {
      EObject parent = findEObject(p.getParent(), registry);
      if (!(parent instanceof EClass))
        throw EX("Parent of new property '%s' should be an EClass", p.getName());
      VirtualEClass parentClass = getVirtual((EClass) parent);

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
      parentClass.addVirtualFeature(getVirtual(attr));
    }
  }

  private void buildNewAssociations(EPackage.Registry registry) {
    for (VirtualAssociation a : weavingModel.getVirtualAssociations()) {
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
        getVirtual(ref).setVirtualOpposite(getVirtual(opp));
        getVirtual(opp).setVirtualOpposite(getVirtual(ref));
      }

      ref.setContainment(a.isComposition());

      getVirtual((EClass) source).addVirtualFeature(getVirtual(ref));

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
        throw EX("Model '%s' of concrete element '%s' cannot be found in package registry", modelURI, e.getPath());

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

  private void validateVirtualResourceSet(ResourceSet r) {
    for (Object p : r.getPackageRegistry().values()) {
      // Since we inherit from Resource, which has an internal Diagnostic interface, we have to use the fully qualified
      // name here
      org.eclipse.emf.common.util.Diagnostic d = Diagnostician.INSTANCE.validate((EObject) p);
      // Pretty print the message into an exception for readability
      if ((d.getSeverity() & org.eclipse.emf.common.util.Diagnostic.ERROR) != 0) {
        StringJoiner sj = new StringJoiner("\n");
        sj.add(d.getMessage());
        for (org.eclipse.emf.common.util.Diagnostic dd : d.getChildren()) {
          sj.add(dd.getMessage());
        }
        throw EX("Ecore validation error: '%s'", sj.toString());
      }
    }
  }

  static private ViewpointException EX(String msg, Object... args) {
    return new ViewpointException(msg, args);
  }

  public List<EPackage> getContributingEPackages() {
    return contributingPackages;
  }

  public EPackage getRootPackage() {
    return rootPackage;
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // Implementation of Virtualizer

  // Lazy constructor
  protected Map<EObject, EObject> concreteToVirtual() {
    if (concreteToVirtual == null) {
      concreteToVirtual = new HashMap<>();
    }
    return concreteToVirtual;
  }

  @Override
  public VirtualEPackage getVirtual(EPackage o) {
    if (o == null) {
      return null;
    }

    return (VirtualEPackage) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEPackage(o, this));
  }

  @Override
  public VirtualEClassifier getVirtual(EClassifier o) {
    if (o == null) {
      return null;
    }

    if (o instanceof EClass) {
      return getVirtual((EClass) o);
    } else if (o instanceof EDataType) {
      return getVirtual((EDataType) o);
    } else {
      throw EX("Cannot virtualize EClassifier %s", o);
    }
  }

  @Override
  public VirtualEClass getVirtual(EClass o) {
    if (o == null) {
      return null;
    }

    return (VirtualEClass) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEClass(o, this));
  }

  @Override
  public VirtualEDataType getVirtual(EDataType o) {
    if (o == null) {
      return null;
    }

    if (o instanceof EEnum) {
      return getVirtual((EEnum) o);
    } else {
      return (VirtualEDataType) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEDataType(o, this));
    }
  }

  @Override
  public VirtualEEnum getVirtual(EEnum o) {
    if (o == null) {
      return null;
    }

    return (VirtualEEnum) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEEnum(o, this));
  }

  @Override
  public VirtualEStructuralFeature getVirtual(EStructuralFeature o) {
    if (o == null) {
      return null;
    }

    if (o instanceof EAttribute) {
      return getVirtual((EAttribute) o);
    } else if (o instanceof EReference) {
      return getVirtual((EReference) o);
    } else {
      throw EX("Cannot virtualize EStructuralFeature %s", o);
    }
  }

  @Override
  public VirtualEAttribute getVirtual(EAttribute o) {
    if (o == null) {
      return null;
    }

    return (VirtualEAttribute) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEAttribute(o, this));
  }


  @Override
  public VirtualEReference getVirtual(EReference o) {
    if (o == null) {
      return null;
    }

    return (VirtualEReference) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEReference(o, this));
  }

}
