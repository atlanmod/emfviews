/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
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
 *   Cauê Clasen - initial API an implementation
 *******************************************************************************/

package org.atlanmod.emfviews.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class EmfViewsFactory extends ResourceFactoryImpl {

  // TODO: Split into two factories, one for eview and one for eviewpoint.

  @Override
  public Resource createResource(URI uri) {
    if (uri.fileExtension().equals("eview")) {
      return new ViewResource(uri);
    } else if (uri.fileExtension().equals("eviewpoint")) {
      return new ViewpointResource(uri);
    } else {
      return null;
    }
  }
}
