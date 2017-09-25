/*******************************************************************************
 * Copyright (c) 2013 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Cau� Clasen - initial API and implementation
 *******************************************************************************/

package fr.inria.atlanmod.emfviews.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class EmfViewsFactory extends ResourceFactoryImpl {

  @Override
  public Resource createResource(URI uri) {
    if (uri.fileExtension().equals("eview")) {
      return new View(uri);
    } else if (uri.fileExtension().equals("eviewpoint")) {
      return new Viewpoint(uri);
    } else {
      return null;
    }
  }
}
