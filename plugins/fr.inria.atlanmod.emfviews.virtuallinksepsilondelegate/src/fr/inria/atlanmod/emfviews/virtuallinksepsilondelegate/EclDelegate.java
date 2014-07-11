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
package fr.inria.atlanmod.emfviews.virtuallinksepsilondelegate;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.AstUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.execute.EclOperationFactory;
import org.eclipse.epsilon.ecl.parse.EclParser;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import fr.inria.atlanmod.emfviews.util.EmfViewsUtil;
import fr.inria.atlanmod.emfviews.virtualLinks.Association;
import fr.inria.atlanmod.emfviews.virtualLinks.LinkedElement;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinks;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksFactory;
import fr.inria.atlanmod.emfviews.virtualLinks.VirtualLinksPackage;
import fr.inria.atlanmod.emfviews.virtuallinksdelegator.IVirtualLinksDelegate;

public class EclDelegate implements IVirtualLinksDelegate {
	
	@Override
	public void createVirtualMetamodelLinks(String linksDslFilePath,
			URI modelLinksURI) throws Exception {

		VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks virtualLinks = EmfViewsUtil.createLinksModel();

		EclModule eclModule = new EclModule();
		
		java.net.URI uri= EmfViewsUtil.toURI(linksDslFilePath);
		
		File f = new File(uri.getSchemeSpecificPart());
		FileReader fr = new FileReader(f);
		BufferedReader br = null;
		String sCurrentLine = "";
		StringBuffer sb = new StringBuffer();

		br = new BufferedReader(fr);

		Map<String, String> metamodelsMap = new HashMap();

		while ((sCurrentLine = br.readLine()) != null) {
			if (sCurrentLine.startsWith("//alias")) {
				String metamodelAlias = sCurrentLine.substring(
						sCurrentLine.indexOf("_") + 1,
						sCurrentLine.indexOf("="));
				String packageUri = sCurrentLine.substring(sCurrentLine
						.indexOf("=") + 1);
				metamodelsMap.put(metamodelAlias, packageUri);
			}
			sb.append(sCurrentLine);
			sb.append("\n");
		}
		br.close();
		eclModule.parse(sb.toString());
		AST ast = eclModule.getAst();
		for (AST matchRuleAst : AstUtil.getChildren(ast, EclParser.MATCH)) {
			// The rule AST
			String ruleName = matchRuleAst.getFirstChild().getText();

			// The left parameter
			AST leftParameterAst = matchRuleAst.getFirstChild()
					.getNextSibling();

			String leftParameterType = leftParameterAst.getFirstChild()
					.getNextSibling().getText();
			String[] leftParameterTypeParts = leftParameterType.split("!");
			String sourceMetamodelAlias = leftParameterTypeParts[0];
			String sourceElementName = leftParameterTypeParts[1];

			AST rightParameterAst = leftParameterAst.getNextSibling();
			String rightParameterType = rightParameterAst.getFirstChild()
					.getNextSibling().getText();
			String[] rightParameterTypeParts = rightParameterType.split("!");
			String targetMetamodelAlias = rightParameterTypeParts[0];
			String targetElementName = rightParameterTypeParts[1];

			Association vAsso = vLinksFactory.createAssociation();
			vAsso.setName(ruleName);
			vAsso.setAssociationTypeName(ruleName);

			vAsso.setLowerBound(0);
			vAsso.setUpperBound(1);

			LinkedElement sourceElement = vLinksFactory.createLinkedElement();

			sourceElement.setElementRef("//" + sourceElementName);

			sourceElement.setModelRef(metamodelsMap.get(sourceMetamodelAlias));
			sourceElement.setName(sourceElementName);

			vAsso.setSourceElement(sourceElement);

			LinkedElement targetElement = vLinksFactory.createLinkedElement();
			targetElement.setElementRef("//" + targetElementName);
			targetElement.setModelRef(metamodelsMap.get(targetMetamodelAlias));
			targetElement.setName(targetElementName);

			vAsso.getTargetElements().add(targetElement);

			virtualLinks.getLinkedElements().add(sourceElement);
			virtualLinks.getLinkedElements().add(targetElement);
			virtualLinks.getVirtualLinks().add(vAsso);

		}
		EmfViewsUtil.persistLinksModel(virtualLinks, modelLinksURI);
	}
	


	@Override
	public void createVirtualModelLinks(String linksDslFile, URI linksModel,
			List<Resource> inputModelsResourcesList) throws Exception {
		
		java.net.URI linksDslUri =EmfViewsUtil.toURI(linksDslFile);

		File f = new File(linksDslUri.getSchemeSpecificPart());
		FileReader fr = new FileReader(f);
		BufferedReader br = null;
		String sCurrentLine = "";

		br = new BufferedReader(fr);

		Map<String, Resource> inputModelsAliasMapToResource = new HashMap<String, Resource>();
		Map<String, String> inputmodelsAliasMapMetamodelUri = new HashMap<String, String>();

		while (((sCurrentLine = br.readLine()) != null)
				&& sCurrentLine.startsWith("//alias")) {
			String metamodelAlias = sCurrentLine.substring(
					sCurrentLine.indexOf("_") + 1, sCurrentLine.indexOf("="));
			String packageUri = sCurrentLine.substring(sCurrentLine
					.indexOf("=") + 1);

			Resource correctResource = null;
			boolean foundCorrectResource = false;
			for (int i = 0; i < inputModelsResourcesList.size()
					&& !foundCorrectResource; i++) {
				Resource r = inputModelsResourcesList.get(i);
				EClassifier rootClassifier = (EClassifier) r.getContents()
						.get(0).eClass();
				if (rootClassifier.getEPackage().getNsURI()
						.compareToIgnoreCase(packageUri) == 0 && !r.getURI().toString().endsWith("profile.uml")) {
					correctResource = r;
					foundCorrectResource = true;
				}

			}
			inputModelsAliasMapToResource.put(metamodelAlias, correctResource);

			inputmodelsAliasMapMetamodelUri.put(metamodelAlias, packageUri);

		}
		br.close();
		VirtualLinksPackage vl = VirtualLinksPackage.eINSTANCE;
		VirtualLinksFactory vLinksFactory = VirtualLinksFactory.eINSTANCE;
		VirtualLinks virtualLinks = vLinksFactory.createVirtualLinks();

		XMIResourceImpl correspondenceModelResource = new XMIResourceImpl();

		correspondenceModelResource.setURI(linksModel);
		correspondenceModelResource.getContents().add(virtualLinks);

		EclModule module = new EclModule();
		module.parse(f);
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
		}
		EclOperationFactory operationFactory = new EclOperationFactory();
		module.getContext().setOperationFactory(operationFactory);

		Iterator<Map.Entry<String, Resource>> iter = inputModelsAliasMapToResource
				.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Resource> tempEntry = iter.next();
			Resource modelResource = tempEntry.getValue();
			EmfModel inputModel=null;
			if(!modelResource.getURI().toString().startsWith("cdo"))
			{
			inputModel = createEmfModelByURI(tempEntry.getKey(),
					modelResource.getURI().toString(),
					inputmodelsAliasMapMetamodelUri.get(tempEntry.getKey()),
					true, false);
			}
			else
			{
				inputModel = new EmfModel();
				inputModel.setResource(modelResource);
				StringProperties properties = new StringProperties();
				properties.put(EmfModel.PROPERTY_NAME, tempEntry.getKey());
				properties.put(EmfModel.PROPERTY_METAMODEL_URI, inputmodelsAliasMapMetamodelUri.get(tempEntry.getKey()));
				properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
				inputModel.load(properties, null);
				inputModel.setCachingEnabled(true);
				TreeIterator<EObject> modelContents=modelResource.getAllContents();
				ArrayList<EObject> allModelContents=new ArrayList<>();
				while (modelContents.hasNext()) {
					allModelContents.add(modelContents.next());
					
				}
				inputModel.allContents().addAll(allModelContents);
				
				
			}
			module.getContext().getModelRepository().addModel(inputModel);
		}

		MatchTrace mt = (MatchTrace) module.execute();

		List<Match> matches = mt.getMatches();

		for (Match match : matches) {
			if (match.isMatching()) {
				EObject left = (EObject) match.getLeft();
				EObject right = (EObject) match.getRight();

				Association vAsso = vLinksFactory.createAssociation();
				vAsso.setName(match.getRule().getName());
				vAsso.setAssociationTypeName(match.getRule().getName());
				vAsso.setLowerBound(0);
				vAsso.setUpperBound(1);

				LinkedElement lSource = vLinksFactory.createLinkedElement();
				lSource.setModelRef(left.eClass().getEPackage().getNsURI());

				lSource.setElementRef(left.eResource().getURIFragment(left));
				vAsso.setSourceElement(lSource);

				LinkedElement lTarget = vLinksFactory.createLinkedElement();
				lTarget.setModelRef(right.eClass().getEPackage().getNsURI());
				lTarget.setElementRef(right.eResource().getURIFragment(right));
				vAsso.getTargetElements().add(lTarget);

				virtualLinks.getVirtualLinks().add(vAsso);
				virtualLinks.getLinkedElements().add(lSource);
				virtualLinks.getLinkedElements().add(lTarget);

			}
		}
		correspondenceModelResource.setURI(linksModel);
		correspondenceModelResource.getContents().add(virtualLinks);
		correspondenceModelResource.save(new HashMap<String, String>());

	}

	protected EmfModel createEmfModelByURI(String name, String model,
			String metamodel, boolean readOnLoad, boolean storeOnDisposal)
			throws EolModelLoadingException, URISyntaxException {
		if(metamodel.contains("UML"))
			UMLResourcesUtil.init(null);
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
	


}
