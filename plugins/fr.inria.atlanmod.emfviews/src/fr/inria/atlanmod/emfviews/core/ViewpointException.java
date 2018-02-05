/*******************************************************************************
 * Copyright (c) 2017, 2018 Armines
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

package fr.inria.atlanmod.emfviews.core;

@SuppressWarnings("serial")
public class ViewpointException extends RuntimeException {

  public ViewpointException() {
    super();
  }

  public ViewpointException(String msg) {
    super(msg);
  }

  public ViewpointException(String msg, Object... args) {
    this(String.format(msg, args));
  }
}
