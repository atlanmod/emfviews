/*******************************************************************************
 * Copyright (c) 2018 Armines
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
 *   fmdkdd - initial API and implementation
 *******************************************************************************/

package org.atlanmod.emfviews.elements;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import org.atlanmod.emfviews.core.EcoreVirtualizer;

public class VirtualEEnum extends VirtualEDataType<EEnum> implements EEnum {

  public VirtualEEnum(EEnum concreteEnum, EcoreVirtualizer virtualizer) {
    super(concreteEnum, virtualizer);
  }

  @Override
  public EList<EEnumLiteral> getELiterals() {
    return concrete().getELiterals();
  }

  @Override
  public EEnumLiteral getEEnumLiteral(String name) {
    return concrete().getEEnumLiteral(name);
  }

  @Override
  public EEnumLiteral getEEnumLiteral(int value) {
    return concrete().getEEnumLiteral(value);
  }

  @Override
  public EEnumLiteral getEEnumLiteralByLiteral(String literal) {
    return concrete().getEEnumLiteralByLiteral(literal);
  }

}
