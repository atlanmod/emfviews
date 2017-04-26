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
package fr.inria.atlanmod.emfviews.virtuallinks.delegator;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.URI;

public interface IVirtualLinksDelegate {

  public void createVirtualMetamodelLinks(String linksDslFile, URI linksModel) throws Exception;

  public void createVirtualModelLinks(String linksDslFile, URI linksModelURI,
                                      List<Resource> inputModels) throws Exception;

}
