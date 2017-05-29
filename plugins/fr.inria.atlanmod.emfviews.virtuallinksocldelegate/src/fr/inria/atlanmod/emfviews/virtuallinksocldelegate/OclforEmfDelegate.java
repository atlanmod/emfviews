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
package fr.inria.atlanmod.emfviews.virtuallinksocldelegate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import fr.inria.atlanmod.emfviews.virtuallinks.Filter;
import fr.inria.atlanmod.emfviews.virtuallinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLink;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtuallinks.util.VirtualLinksUtil;

/**
 * Executes ocl queries on the contributing models conforming to ecore.
 *
 * @author juandavid
 *
 */
public class OclforEmfDelegate {

  VirtualLinks viewVirtualLinks;
  List<Filter> viewpointFilters;
  List<Filter> viewFilters;
  ResourceSet virtualResourceSet;
  OCLHelper<EClassifier, EOperation, EStructuralFeature, org.eclipse.ocl.ecore.Constraint> helper;
  VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;

  public OclforEmfDelegate(VirtualLinks viewpointVirtualLinks, ResourceSet virtualResourceSet,
                           VirtualLinks viewVirtualLinks) {
    this.viewVirtualLinks = viewVirtualLinks;
    EList<VirtualLink> allViewpointVirtualLinks = viewpointVirtualLinks.getVirtualLinks();
    viewpointFilters = new ArrayList<>();
    this.virtualResourceSet = virtualResourceSet;

    for (VirtualLink virtualLink : allViewpointVirtualLinks) {
      if (virtualLink instanceof Filter) {
        viewpointFilters.add((Filter) virtualLink);
      }
    }
  }

  public void createViewFilterLinks() {
    for (Filter viewpointFilter : viewpointFilters) {
      // Part 1: Execute the ocl query.
      if (!viewpointFilter.isFilterOnlyEstructuralFeatures()) {
        String oclQuery = viewpointFilter.getOclQuery();
        OCL<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter,
            EObject, CallOperationAction, SendSignalAction, org.eclipse.ocl.ecore.Constraint,
            EClass, EObject> ocl;
        ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

        // create an OCL helper object
        helper = ocl.createOCLHelper();
        try {
          // En el caso que el query sea un allInstances toca crear un extentMap
          // para su evaluacion. (Lo que pasa es que en el caso que estoy usando
          // no hay condiciones que se apliquen sobre el allInstances)
          // TODO El extentMap se necesita solo si el ocl es un allInstances.
          ocl.setExtentMap(createExtentMapHelper(viewpointFilter));

          OCLExpression<EClassifier> parsedQuery = helper.createQuery(oclQuery);
          Query<EClassifier, EClass, EObject> theQueryCreatedByOcl = ocl.createQuery(parsedQuery);
          Object objectsToFilter = theQueryCreatedByOcl.evaluate();
          if (objectsToFilter instanceof Collection) {
            Collection<EObject> objs = (Collection<EObject>) objectsToFilter;
            createFilterLinks(objs, viewpointFilter);
          } else if (objectsToFilter instanceof EObject) {
            createFilterLink((EObject) objectsToFilter, viewpointFilter);
          }

          // Part 2: Generate the link.

        } catch (ParserException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }

    }
  }

  private void createFilterLinks(Collection<EObject> objectsToFilter, Filter viewpointFilter) {
    Iterator<EObject> iter = objectsToFilter.iterator();
    while (iter.hasNext()) {
      EObject objectToFilter = iter.next();
      createFilterLink(objectToFilter, viewpointFilter);

    }

  }

  private void createFilterLink(EObject objectToFilter, Filter viewpointFilter) {
    Filter filter = VirtualLinksUtil.createFilter(viewpointFilter.getName(),
                                                  viewpointFilter.getOclQuery(), false);
    LinkedElement filterLinkedElement = VirtualLinksUtil
        .createLinkedElement(viewpointFilter.getFilteredElement().getName(),
                             viewpointFilter.getFilteredElement().getModelRef(),
                             objectToFilter.eResource().getURIFragment(objectToFilter), null);
    filter.setFilteredElement(filterLinkedElement);
    viewVirtualLinks.getVirtualLinks().add(filter);
    viewVirtualLinks.getLinkedElements().add(filterLinkedElement);

  }

  private Map<EClass, Set<? extends EObject>> createExtentMapHelper(Filter viewpointFilter) {
    Map<EClass, Set<? extends EObject>> extents = new HashMap<>();

    LinkedElement metaclassToFilter = viewpointFilter.getFilteredElement();

    String metaclassRef = metaclassToFilter.getElementRef(); // EnterpriseArchitecture
    String metamodelUri = metaclassToFilter.getModelRef(); // http://www.obeonetwork.org/dsl/togaf/contentfwk/9.0.0

    EPackage correctPackage = virtualResourceSet.getPackageRegistry().getEPackage(metamodelUri);
    EClassifier correctEclass = correctPackage.getEClassifier(metaclassRef.substring(2));

    // TODO, esto tiene que cambiar para que se pueda sacar el recurso que es,
    // lo que pasa es que no se por ejemplo cual es la uir del modelo. En el
    // peor de los casos toca
    // hacer un for sobre todos los resources. Quiero depurar para saber cual es
    // la uri del modelo.
    EList<Resource> resources = virtualResourceSet.getResources();
    boolean foundModel = false;
    Resource correctResource = null;
    for (int i = 0; i < resources.size() && !foundModel; i++) {
      EClassifier firstElement = resources.get(i).getContents().get(0).eClass();
      if (firstElement.getEPackage().getNsURI().compareToIgnoreCase(metamodelUri) == 0) {
        foundModel = true;
        correctResource = resources.get(i);
      }

    }

    Set<EObject> theEclassExtents = new HashSet<>();
    // Lo segundo aqui es saber como puedo obtener todas las instancias. Lo
    // puedo hacer manual y luego tratar de encontrar una mejor manera.
    TreeIterator<EObject> resourceContents = correctResource.getAllContents();
    while (resourceContents.hasNext()) {
      EObject tempContent = resourceContents.next();
      if (tempContent.eClass().getName().compareToIgnoreCase(correctEclass.getName()) == 0) {
        theEclassExtents.add(tempContent);
      }

    }
    helper.setContext(correctEclass);
    extents.put((EClass) correctEclass, theEclassExtents);

    return extents;
  }

  public void persistLinksModel(org.eclipse.emf.common.util.URI linksModelURI) {
    XMIResourceImpl correspondenceModelResource = new XMIResourceImpl();

    correspondenceModelResource.setURI(linksModelURI);
    correspondenceModelResource.getContents().add(viewVirtualLinks);
    try {
      correspondenceModelResource.save(null);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
