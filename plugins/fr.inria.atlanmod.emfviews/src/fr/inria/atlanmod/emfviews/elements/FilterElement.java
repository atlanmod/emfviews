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

package fr.inria.atlanmod.emfviews.elements;

import org.eclipse.emf.ecore.EObject;

public class FilterElement extends VirtualElement {

  EObject filteredElement;

  public FilterElement(EObject obj) {
    filteredElement = obj;
  }

  public EObject getFilteredElement() {
    return filteredElement;
  }
}
