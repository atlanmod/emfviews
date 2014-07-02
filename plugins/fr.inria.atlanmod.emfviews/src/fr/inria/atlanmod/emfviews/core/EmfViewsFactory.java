/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cauê Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class EmfViewsFactory extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		if (uri.toString().endsWith(".eview")) 
		{
			return new EView(uri);
		} else if (uri.toString().endsWith(".eviewtype")) 
		{
			return new Viewtype(uri);
		}
		else
			return null;
	}

	public Resource createEView(List<String> contributingModels,
			String viewtype, String linksModelPath)
			throws Exception {
		return new EView(contributingModels, viewtype,
				linksModelPath);
	}

	public Resource createViewtype(List<String> contributingMetamodels) throws FileNotFoundException, IOException {
		return new Viewtype(contributingMetamodels);
	}

}
