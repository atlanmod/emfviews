/*******************************************************************************
 * Copyright (c) 2017 Armines
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * fmdkdd - initial implementation
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
