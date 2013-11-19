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
package fr.inria.atlanmod.emfviews.vlink_mm;

//fr.inria.atlanmod.emfviews.vlink_mm
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class VirtualLinksMetamodel {

	public static void registerVirtualLinksMetamodel() {
		String path = "/resource/VirtualLinksMM2.ecore";
		Resource virtualLinksMetamodelResource = new ResourceSetImpl()
				.getResource(
						URI.createURI(VirtualLinksMetamodel.class.getResource(
								path).toString()), true);
		for (Iterator<EObject> i = virtualLinksMetamodelResource
				.getAllContents(); i.hasNext();) {
			EObject eo = i.next();
			if (eo instanceof EPackage) {
				EPackage.Registry.INSTANCE.put(((EPackage) eo).getNsURI(), eo);
			}
		}
	}
}
