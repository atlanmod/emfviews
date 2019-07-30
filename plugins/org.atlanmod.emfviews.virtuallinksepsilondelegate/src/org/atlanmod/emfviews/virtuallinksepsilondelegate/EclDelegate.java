/*******************************************************************************
 * Copyright (c) 2017--2019 Armines
 * Copyright (c) 2013 INRIA
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

package org.atlanmod.emfviews.virtuallinksepsilondelegate;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.execute.EclOperationFactory;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

import org.atlanmod.emfviews.virtuallinks.ConcreteConcept;
import org.atlanmod.emfviews.virtuallinks.ContributingModel;
import org.atlanmod.emfviews.virtuallinks.VirtualAssociation;
import org.atlanmod.emfviews.virtuallinks.VirtualLinksFactory;
import org.atlanmod.emfviews.virtuallinks.WeavingModel;
import org.atlanmod.emfviews.virtuallinks.delegator.IVirtualLinksDelegate;

/**
 * Create a weaving model from an ECL file and input models.
 *
 * An ECL file contains multiple rules which are used to find matches between
 * two elements of two metamodels.  In EMF Views, we use ECL files as a
 * declarative way to build a weaving model.  Any time two elements match a
 * rule, we create a VirtualAssociation between them.  This association will be
 * used by the View to populate a virtual reference associated to the ECL rule.
 *
 * The role of the EclDelegate is to create the weaving model for the view by
 * using ECL to execute the rules.
 *
 * EclDelegate is the default implementation of IVirtualLinksDelegate provided
 * by EMF Views, but other means of creating weaving models could be used by
 * implementing this interface.
 */
public class EclDelegate implements IVirtualLinksDelegate {

  private VirtualLinksFactory vlFactory = VirtualLinksFactory.eINSTANCE;

  @Override
  public WeavingModel createWeavingModel(URI linksDslURI, Map<String, Resource> inputModels) {

    File f;

    // Need to turn an EMF URI into an actual File location. We cannot use the
    // URIConverter.INSTANCE since it only provides InputStream, and EclModule
    // needs an actual file.
    if (linksDslURI.isPlatform()) {
      // Find the system path for the file from the workspace URI
      IContainer wsroot = EcorePlugin.getWorkspaceRoot();
      IFile ifile = wsroot.getFile(new Path(linksDslURI.toPlatformString(true)));
      f = new File(ifile.getLocationURI());
    } else {
      // Assume a regular file path. Will throw if it cannot be found anyway.
      f = new File(linksDslURI.toFileString());
    }

    // Prepare the ECL Module
    EclModule module = new EclModule();
    try {
      module.parse(f);
      if (module.getParseProblems().size() > 0) {
        System.err.println("Parse errors occured...");
        for (ParseProblem problem : module.getParseProblems()) {
          System.err.println(problem.toString());
        }
        throw new RuntimeException("Error in parsing ECL file.  See stderr for details");
      }
    } catch (Exception ex) {
      throw new RuntimeException("Error in parsing ECL file", ex);
    }

    EclOperationFactory operationFactory = new EclOperationFactory();
    module.getContext().setOperationFactory(operationFactory);

    for (Entry<String, Resource> e : inputModels.entrySet()) {
      String name = e.getKey();
      Resource modelResource = e.getValue();
      EmfModel inputModel = new InMemoryEmfModel(name, modelResource);
      module.getContext().getModelRepository().addModel(inputModel);
    }

    // Execute the module
    MatchTrace mt;
    try {
      mt = (MatchTrace) module.execute();
    } catch (EolRuntimeException ex) {
      throw new RuntimeException("Error in executing ECL file", ex);
    }

    List<Match> matches = mt.getMatches();

    // Use the matches to construct a weaving model
    WeavingModel weavingModel = vlFactory.createWeavingModel();

    HashMap<String, ContributingModel> modelsByURI = new HashMap<>();

    for (Match match : matches) {
      if (match.isMatching()) {
        EObject left = (EObject) match.getLeft();
        EObject right = (EObject) match.getRight();

        VirtualAssociation vAsso = vlFactory.createVirtualAssociation();
        vAsso.setName(match.getRule().getName());
        vAsso.setLowerBound(0);
        vAsso.setUpperBound(1);

        vAsso.setSource(addConcreteConcept(left, modelsByURI, weavingModel));
        vAsso.setTarget(addConcreteConcept(right, modelsByURI, weavingModel));

        weavingModel.getVirtualLinks().add(vAsso);
      }
    }

    return weavingModel;
  }

  // Create ConcreteConcept and add it to the weaving model, ensuring
  // the owning contributing model is added as well.
  private ConcreteConcept addConcreteConcept(EObject obj, Map<String,
                                             ContributingModel> modelsByURI, WeavingModel weavingModel) {
    ConcreteConcept cc = vlFactory.createConcreteConcept();
    cc.setPath(obj.eResource().getURIFragment(obj));

    String modelURI = obj.eClass().getEPackage().getNsURI();
    cc.setModel(modelsByURI.computeIfAbsent(modelURI, (uri) -> {
      ContributingModel m = vlFactory.createContributingModel();
      m.setURI(uri);
      weavingModel.getContributingModels().add(m);
      return m;
    }));
    return cc;
  }

}
