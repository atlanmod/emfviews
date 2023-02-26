/*******************************************************************************
 * Copyright (c) 2017--2019 Armines
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.atlanmod.emfviews.elements.BaseVirtualElement;
import org.atlanmod.emfviews.elements.VirtualEAttribute;
import org.atlanmod.emfviews.elements.VirtualEClass;
import org.atlanmod.emfviews.elements.VirtualEClassifier;
import org.atlanmod.emfviews.elements.VirtualEDataType;
import org.atlanmod.emfviews.elements.VirtualEEnum;
import org.atlanmod.emfviews.elements.VirtualEGenericType;
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
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import org.atlanmod.emfviews.virtuallinks.VirtualProperty;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;

/**
 * Metamodel for a view.
 *
 * The Viewpoint's role is to use the WeavingModel instructions to create the
 * virtual metamodel used by views.
 *
 * A Viewpoint is created from the contributing metamodels, given as EPackages,
 * and a WeavingModel. The virtual metamodel result is the root package (see
 * getRootPackage), which contains virtual classes from the contributing
 * metamodels and potentially new classes depending on instructions of the
 * WeavingModel.
 *
 * A Viewpoint is usually created through a ViewpointResource which represents
 * an '.eviewpoint' file. But the Viewpoint class is standalone, and is able to
 * create a virtual metamodel without an associated resource.
 */
public class Viewpoint implements EcoreVirtualizer {
	/*
	 * The meat of the work is done in `build`, which uses various private functions
	 * to handle different steps of the metamodel creation.
	 *
	 * The later part of the file contains an implementation of EcoreVirtualizer,
	 * which is straightforward.
	 */

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Internal state

	private ResourceSet baseResourceSet; // contains the contributing EPackages
	private ResourceSet virtualResourceSet; // contains the virtualized EPackages
	private VirtualEPackage rootPackage; // contains the virtual contributing packages and the virtual package
	private EPackage virtualPackage; // contains the new concepts
	private Resource resource; // the resource using this view, if any. This is
								// used by VirtualEObject.eResource, to please some
								// modeling tools (e.g. OCL).

	/**
	 * Map to keep track of the EObjects created by each *new* element from the
	 * weaving model, in order to be able to use VirtualElement as LinkedElements in
	 * findEObject.
	 */
	private Map<VirtualElement, EObject> syntheticElements;

	/** Used by the Virtualizer implementation to cache virtual elements */
	private Map<EObject, EObject> concreteToVirtual;

	private boolean whitelist = false; // whether we are in whitelist mode

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Constructors

	/**
	 * Singleton instance of a weaving model with no instructions. Used for
	 * 'eviewpoint' files that do not specify a weaving model, and for testing.
	 */
	public static final WeavingModel emptyWeavingModel;
	static {
		emptyWeavingModel = VirtualLinksFactory.eINSTANCE.createWeavingModel();
		emptyWeavingModel.setName("empty");
	};

	/**
	 * Viewpoint Options. A POJO that can be passed as argument to the Viewpoint
	 * constructor to override some defaults.
	 */
	static class Options {

		/** Prefix for the root package in the viewpoint. */
		public String rootPackageNamePrefix = "viewpoint";

		/** Prefix for the namespace URI of the root package in the viewpoint. */
		public String rootPackageNsURIPrefix = "http://www.atlanmod.org/emfviews/viewpoint";

		/**
		 * Namespace prefix of the virtual package in the viewpoint. The virtual package
		 * contains new concepts, if any.
		 */
		public String virtualPackageNsPrefix = "virtualpackage";

		/** Whether to save this viewpoint in the viewpoint registry. */
		public boolean saveInRegistry = false;

		/**
		 * Whether to validate the resulting metamodel using the Ecore diagnostician.
		 * Views will still work with an invalid viewpoint, but some modeling tools
		 * might not deal with it correctly.
		 */
		public boolean strictEcore = false;

		// These build default rootPackage names and namespace URIs by concatenating
		// the weaving model to the option prefixes.
		public String rootPackageName(String name) {
			return rootPackageNamePrefix + name;
		}

		public String rootPackageNsURI(String name) {
			return rootPackageNsURIPrefix + "/" + name;
		}

		public String virtualPackageNsURI(String name) {
			return rootPackageNsURI(name) + "/virtual";
		}
	}

	// Singleton used as fallback when no options are provided
	private static final Options defaultOptions = new Options();

	private Map<String, EPackage> contributingPackages; // original, unmodified EPackages
	private WeavingModel weavingModel; // how to modify the EPackages

	/**
	 * A viewpoint without contributing metamodels is still useful as a virtualizer
	 */
	public Viewpoint() {
	}

	/**
	 * Construct a Viewpoint from a map of aliases to contributing metamodels, an
	 * empty weaving model, and the default options.
	 */
	public Viewpoint(Map<String, EPackage> contributingMetamodels) {
		this(contributingMetamodels, emptyWeavingModel);
	}

	/**
	 * Construct a Viewpoint from a map of aliases to contributing metamodels, a
	 * WeavingModel, and the default options.
	 */
	public Viewpoint(Map<String, EPackage> contributingMetamodels, WeavingModel weavingModel) {
		this(contributingMetamodels, weavingModel, null);
	}

	/**
	 * Construct a Viewpoint from a map of aliases to contributing metamodels, a
	 * WeavingModel, and provided Options.
	 */
	public Viewpoint(Map<String, EPackage> contributingMetamodels, WeavingModel weavingModel, Options options) {
		this.contributingPackages = contributingMetamodels;
		this.weavingModel = weavingModel;

		if (options != null) {
			build(options);
		} else {
			build(defaultOptions);
		}
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Public API

	/**
	 * Return the root package of the virtual metamodel. The root package should
	 * contain the virtualized contributing metamodels as subpackages, and
	 * eventually a new virtual package to hold the new classifiers.
	 */
	public EPackage getRootPackage() {
		return rootPackage;
	}

	/**
	 * Return the (unvirtualized) contributing metamodels given as input to this
	 * Viewpoint. This is a map from an alias to a package.
	 */
	public Map<String, EPackage> getContributingEPackages() {
		return contributingPackages;
	}

	/**
	 * Associate r as resource to this viewpoint. Mainly useful for serializing a
	 * Viewpoint created without a resource, by attaching a ViewpointResource
	 * pointing to a file on disk.
	 */
	public void setResource(Resource r) {
		this.resource = r;
	}

	/**
	 * Return the resource attached to this viewpoint.
	 */
	public Resource getResource() {
		return resource;
	}

	@Override
	public boolean isWhitelist() {
		return whitelist;
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Constructing the virtual metamodel

	// Create the virtual elements and virtual packages.
	//
	// First we virtualize the contributing packages in the virtual package, then
	// we apply filters, then we create all the new objects as instructed by the
	// weaving model.
	protected void build(Options options) {
		baseResourceSet = new ResourceSetImpl();
		virtualResourceSet = new ResourceSetImpl();
		EPackage.Registry baseRegistry = baseResourceSet.getPackageRegistry();
		EPackage.Registry virtualRegistry = virtualResourceSet.getPackageRegistry();

		// All contributing packages are put under a parent virtual package,
		// otherwise OCL will have difficulties finding classifiers
		EPackage concreteRoot = EcoreFactory.eINSTANCE.createEPackage();
		String weavingModelName = weavingModel.getName();
		concreteRoot.setName(options.rootPackageName(weavingModelName));
		concreteRoot.setNsURI(options.rootPackageNsURI(weavingModelName));
		rootPackage = getVirtual(concreteRoot);

		// Put each metamodel into a resource set, so that we can easily find elements
		// from it using findEObject.
		// We have to register all subpackages of contributing packages to allow
		// findEObject to find a model when looking up only the URI.
		Iterable<EPackage> allPackages = contributingPackages.values().stream()
				.flatMap(p -> EMFViewsUtil.getAllPackages(p).stream())::iterator;
		for (EPackage p : allPackages) {
			baseRegistry.put(p.getNsURI(), p);
		}

		// We also put *virtual* elements in the virtual resource set, so that we can
		// add and
		// remove elements from them without affecting the originals.
		for (EPackage p : contributingPackages.values()) {
			virtualRegistry.put(p.getNsURI(), getVirtual(p));
			// The order of packages in the root package matters. We use the order
			// specified by the contributing models, and the virtual package is last.
			rootPackage.addVirtualPackage(getVirtual(p));
		}

		// Filter concrete elements (we don't allow filtering of virtual elements, so we
		// can apply filters
		// before creating those).
		applyFilters(baseRegistry);

		// Create all *new* elements first, and set their EMF attributes after to avoid
		// any circular dependencies
		syntheticElements = createSyntheticElements();

		// The virtualPackage holds all the new concepts, but is created only if
		// we have some concepts to put in it
		List<VirtualConcept> concepts = weavingModel.getVirtualConcepts();
		if (!concepts.isEmpty()) {
			virtualPackage = EcoreFactory.eINSTANCE.createEPackage();
			virtualPackage.setName(weavingModelName);
			virtualPackage.setNsURI(options.virtualPackageNsURI(weavingModelName));
			virtualPackage.setNsPrefix(options.virtualPackageNsPrefix);
			virtualRegistry.put(virtualPackage.getNsURI(), virtualPackage);
			buildNewConcepts(baseRegistry);

			rootPackage.addVirtualPackage(getVirtual(virtualPackage));
		}

		buildNewProperties(baseRegistry);
		buildNewAssociations(baseRegistry);

		// The resulting package should be a valid Ecore metamodel. That is not the
		// case currently due to filters, so validation is opt-in.
		if (options.strictEcore) {
			validateVirtualResourceSet(virtualResourceSet);
		}
	}

	// Apply the given filters to all the packages in the virtual resource set.
	private void applyFilters(EPackage.Registry registry) {
		whitelist = weavingModel.isWhitelist();

		// Since the order of filter analysis are not predictable, it's necessary to
		// hold the excluded elements into a list to ensure that they will not be
		// included again by mistake
		List<EAttribute> eliminatedAttr = new ArrayList<>();

		for (Filter filter : weavingModel.getFilters()) {
			ConcreteElement elementToFind = filter.getTarget();

			List<EObject> filteredElements = new ArrayList<>();
			EObject baseObject;

			// If it's a wildcard, then find the base element and collect
			// all its contents
			if (elementToFind.getPath().endsWith(".*")) {
				ConcreteElement baseObjectConcrete = VirtualLinksFactory.eINSTANCE.createConcreteElement();
				baseObjectConcrete.setModel(elementToFind.getModel());
				baseObjectConcrete.setPath(elementToFind.getPath().replace(".*", ""));
				baseObject = findEObject(baseObjectConcrete, registry);
				filteredElements.add(baseObject);

				// Since the viewpoint should include every attribute (*), it's necessary to add
				// all superTypes and their attributes to the filtered elements, so the view
				// will be able to virtualize everything
				List<EClass> allSuperTypes = new ArrayList<EClass>();
				if (baseObject instanceof EClass) {
					EClass baseObjecteClass = (EClass) baseObject;
					allSuperTypes.addAll(baseObjecteClass.getEAllSuperTypes());
				}

				for (EClass superClass : allSuperTypes) {
					filteredElements.add(superClass);
					Iterator<EAttribute> superTypeAttrIt = superClass.getEAllAttributes().iterator();
					while (superTypeAttrIt.hasNext()) {
						EAttribute superTypeAttrNext = superTypeAttrIt.next();
						if (!eliminatedAttr.contains(superTypeAttrNext)) {
							filteredElements.add(superTypeAttrNext);
						}
					}
				}

				// Also filter all contents (*) from the baseObject
				Iterator<EObject> it = baseObject.eAllContents();
				while (it.hasNext()) {
					EObject next = it.next();
					filteredElements.add(next);
				}
			} else {
				// Otherwise it's a single object
				baseObject = findEObject(elementToFind, registry);
				filteredElements.add(baseObject);

				// Business logic: When the viewpoint includes a single object, sometimes is
				// necessary to exclude its supertypes from filtered elements
				// even when other elements previously included them
				// e.g., elements inheritance are like A <- B and A <- C, but not B <- C.
				// The view includes all elements of B (so also everything from A), but just a
				// single attribute of C, which makes it mandatory, to exclude (at least some) A
				// attributes
				EObject parentBaseObject = baseObject.eContainer();
				List<EClass> allSuperTypesOfParent = new ArrayList<EClass>();
				if (parentBaseObject instanceof EClass) {
					EClass parentBaseObjecteClass = (EClass) parentBaseObject;
					allSuperTypesOfParent.add(parentBaseObjecteClass);
					allSuperTypesOfParent.addAll(parentBaseObjecteClass.getEAllSuperTypes());

					for (EClass superClass : allSuperTypesOfParent) {
						Iterator<EAttribute> superTypeAttrIt = superClass.getEAllAttributes().iterator();
						while (superTypeAttrIt.hasNext()) {
							EAttribute superTypeAttrNext = superTypeAttrIt.next();
							if (!superTypeAttrNext.equals(baseObject)) {
								filteredElements.remove(superTypeAttrNext);
								eliminatedAttr.add(superTypeAttrNext);
							}
						}
					}
				}

			}

			// In whitelist mode, a filter implies that all the parent (container) elements
			// are also filtered (the alternative is to explicitly filter all
			// containers, which is tedious)
			if (whitelist) {
				EObject baseObjectCopy = baseObject;
				while (baseObjectCopy != null) {
					BaseVirtualElement<?> genericVirtualElement = (BaseVirtualElement<?>) getVirtualGeneric(
							baseObjectCopy);
					if (genericVirtualElement != null) {
						genericVirtualElement.filtered = true;
					}
					baseObjectCopy = baseObjectCopy.eContainer();
				}
			}

			// Now go over each elements to be filtered, and flip their filtered bit
			for (EObject element : filteredElements) {
				BaseVirtualElement<?> genericVirtualElement = (BaseVirtualElement<?>) getVirtualGeneric(element);
				if (genericVirtualElement != null) {
					genericVirtualElement.filtered = true;
				}
			}
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
			getVirtual(klass).synthetic = true;

			for (Concept e : c.getSuperConcepts()) {
				EObject sup = findEObject(e, registry);
				if (!(sup instanceof EClass)) {
					throw EX("Superconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
				}
				klass.getESuperTypes().add((EClass) sup);
			}

			for (Concept e : c.getSubConcepts()) {
				EObject sub = findEObject(e, registry);
				if (!(sub instanceof EClass)) {
					throw EX("Subconcept '%s' of new concept '%s' should be an EClass", e, c.getName());
				}
				getVirtual((EClass) sub).addVirtualSuperType(klass);
			}
		}
	}

	private void buildNewProperties(EPackage.Registry registry) {
		for (VirtualProperty p : weavingModel.getVirtualProperties()) {
			EObject parent = findEObject(p.getParent(), registry);
			if (!(parent instanceof EClass)) {
				throw EX("Parent of new property '%s' should be an EClass", p.getName());
			}
			VirtualEClass parentClass = getVirtual((EClass) parent);

			String n = p.getName();
			EAttribute attr = (EAttribute) syntheticElements.get(p);
			attr.setName(n);
			attr.setEType(getTypeFromName(p.getType())
					.orElseThrow(() -> EX("Invalid type '%s' for new property '%s'", p.getType(), n)));
			attr.setUpperBound(1);
			if (p.isOptional()) {
				attr.setLowerBound(0);
			} else {
				attr.setLowerBound(1);
			}
			parentClass.addVirtualFeature(getVirtual(attr));
			getVirtual(attr).synthetic = true;
		}
	}

	private void buildNewAssociations(EPackage.Registry registry) {
		for (VirtualAssociation a : weavingModel.getVirtualAssociations()) {
			// Each association is turned into an EReference

			EObject source = findEObject(a.getSource(), registry);
			EObject target = findEObject(a.getTarget(), registry);

			EReference ref = (EReference) syntheticElements.get(a);
			ref.setName(a.getName());
			if (!(target instanceof EClassifier)) {
				throw EX("Target '%s' of new association '%s' should be an EClassifier", target, a.getName());
			}

			ref.setEType((EClassifier) target);
			ref.setLowerBound(a.getLowerBound());
			ref.setUpperBound(a.getUpperBound());
			if (!(source instanceof EClass)) {
				throw EX("Source '%s' of new association '%s' should be an EClass", source, a.getName());
			}

			Association opposite = a.getOpposite();
			if (opposite != null) {
				EObject o = findEObject(opposite, registry);
				if (!(o instanceof EReference)) {
					throw EX("Opposite of new association '%s' should be an EReference", a.getName());
				}
				EReference opp = (EReference) o;
				getVirtual(ref).virtualOpposite = getVirtual(opp);
				getVirtual(opp).virtualOpposite = getVirtual(ref);
			}

			ref.setContainment(a.isComposition());

			getVirtual((EClass) source).addVirtualFeature(getVirtual(ref));
			getVirtual(ref).synthetic = true;

			// We have to set the eContainingClass feature of the reference manually, since
			// the feature is virtual.
			// We don't want this to be done automatically in addVirtualFeature, because we
			// don't want to alter
			// a contributing metamodel accidentally. Here, we know `ref` is synthetic, and
			// not part of an existing
			// metamodel, so we can modify it.
			((InternalEObject) ref).eInverseAdd((InternalEObject) source,
					EcorePackage.ESTRUCTURAL_FEATURE__ECONTAINING_CLASS, EStructuralFeature.class, null);
		}
	}

	/**
	 * Helper function to find the EObject referenced to in a weaving model Element.
	 *
	 * Return an EObject that may not have been virtualized yet (depending on the
	 * registry), so be sure to call getVirtual on the result if the object is to be
	 * added to the virtual metamodel.
	 */
	private EObject findEObject(Element elementToFind, EPackage.Registry registry) {
		// If it's a ConcreteElement, we are looking for an EObject from the
		// contributing metamodels.
		if (elementToFind instanceof ConcreteElement) {
			// just cast to ensure to work with ConcreteElement
			ConcreteElement element = (ConcreteElement) elementToFind;

			String modelURI = element.getModel().getURI();
			EObject model = registry.getEPackage(modelURI);
			if (model == null) {
				throw EX("Model '%s' of concrete element '%s' cannot be found in package registry", modelURI,
						element.getPath());
			}

			String path = element.getPath();
			EObject obj = EMFViewsUtil.findElement(model, path)
					.orElseThrow(() -> EX("ConcreteElement '%s' cannot be found in model '%s'", path, modelURI));

			return obj;

		}

		// If it's a VirtualElement, then we need to look in the
		// synthetic elements map.
		else if (elementToFind instanceof VirtualElement) {
			if (!syntheticElements.containsKey(elementToFind)) {
				throw EX("Virtual element for '%s' does not exist or has not been created yet", elementToFind);
			}

			EObject obj = syntheticElements.get(elementToFind);
			if (obj == null) {
				throw EX("Virtual element for '%s' is null.  This shouldn't happen.", elementToFind);
			}

			return obj;

		} else {
			throw EX("Unknown instance of LinkedElement: '%s'", elementToFind.eClass().getName());
		}
	}

	// This maps the datatype strings of the weaving model to the actual Ecore
	// datatype.
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
			// Since we inherit from Resource, which has an internal Diagnostic
			// interface, we have to use the fully qualified name here
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

	// Shortcut method to create an exception
	static private ViewpointException EX(String msg, Object... args) {
		return new ViewpointException(msg, args);
	}

	protected EObject getVirtualGeneric(EObject o) {
		// ignore null objects and also some objects not useful for views for the
		// moment, like
		// EAnnotations, EOperations and EParameters for example
		if (o == null || o instanceof EAnnotation || o instanceof EOperation || o instanceof EParameter
				|| o instanceof EStringToStringMapEntryImpl) {
			return null;
		}
		if (o instanceof EPackage)
			return getVirtual((EPackage) o);
		if (o instanceof EClass)
			return getVirtual((EClass) o);
		if (o instanceof EDataType)
			return getVirtual((EDataType) o);
		if (o instanceof EEnum)
			return getVirtual((EStructuralFeature) o);
		if (o instanceof EAttribute)
			return getVirtual((EAttribute) o);
		if (o instanceof EReference)
			return getVirtual((EReference) o);
		if (o instanceof EGenericType)
			return getVirtual((EGenericType) o);

		throw EX("Cannot virtualize object '%s'", o);
	}

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// Implementation of EcoreVirtualizer
	//
	// Straightforward. For each class of object from Ecore, we project a
	// concrete EObject into its virtual counterpart, and we save projected
	// objects into a map to ensure two projections of the same object yield the
	// same virtual object.
	//
	// The rest is boilerplate because the Java type system is poor.

	protected Map<EObject, EObject> concreteToVirtual() {
		// Lazy constructor
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
	public VirtualEClassifier<?> getVirtual(EClassifier o) {
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
	public VirtualEDataType<?> getVirtual(EDataType o) {
		if (o == null) {
			return null;
		}

		if (o instanceof EEnum) {
			return getVirtual((EEnum) o);
		} else {
			return (VirtualEDataType<?>) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEDataType<>(o, this));
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
	public VirtualEStructuralFeature<?> getVirtual(EStructuralFeature o) {
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

	@Override
	public VirtualEGenericType getVirtual(EGenericType o) {
		if (o == null) {
			return null;
		}

		return (VirtualEGenericType) concreteToVirtual().computeIfAbsent(o, obj -> new VirtualEGenericType(o, this));
	}

}