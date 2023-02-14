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

package org.atlanmod.emfviews.vpdl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.atlanmod.emfviews.vpdl.vpdl.VpdlPackage
import org.eclipse.xtext.scoping.Scopes
import org.atlanmod.emfviews.vpdl.vpdl.SelectFeature
import org.eclipse.emf.ecore.EPackage
import org.atlanmod.emfviews.vpdl.vpdl.Relation
import org.atlanmod.emfviews.vpdl.vpdl.Attribute
import org.atlanmod.emfviews.vpdl.vpdl.SelectFeatureRest

/*
 * This class contains custom scoping description.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class VpdlScopeProvider extends AbstractVpdlScopeProvider {

  override getScope(EObject context, EReference reference) {
    /*if (reference == VpdlPackage.Literals.SELECT_FEATURE__METAMODEL) {
      val sf = context as SelectFeature
      val from = sf.metamodel.eContainer as From
      if (from != null) {
        return Scopes.scopeFor(from.metamodels)
      }
    }

    else*/
    if (reference == VpdlPackage.Literals.SELECT_FEATURE__CLASS) {
      val sf = context as SelectFeature
      val package = EPackage.Registry.INSTANCE.getEPackage(sf.metamodel.nsURI)
      if (package !== null) {
        val candidates = package.EClassifiers
        return Scopes.scopeFor(candidates)
      }
    }

    else if (reference == VpdlPackage.Literals.RELATION__CLASS_RIGHT) {
      val r = context as Relation
      val package = EPackage.Registry.INSTANCE.getEPackage(r.metamodelRight.nsURI)
      if (package !== null) {
        val candidates = package.EClassifiers
        return Scopes.scopeFor(candidates)
      }
    }

    else if (context instanceof Attribute && reference == VpdlPackage.Literals.ATTRIBUTE__ATTRIBUTE) {
      val sf = context.eContainer.eContainer as SelectFeature
      return Scopes.scopeFor(sf.class_.EAllStructuralFeatures)
    }

    else if (context instanceof SelectFeatureRest && reference == VpdlPackage.Literals.ATTRIBUTE__ATTRIBUTE) {
      val sf = context.eContainer as SelectFeature
      return Scopes.scopeFor(sf.class_.EAllStructuralFeatures)      
    }

    return super.getScope(context, reference)
  }

}
