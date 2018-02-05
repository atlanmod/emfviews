/*
 * generated by Xtext 2.12.0
 */
package fr.inria.atlanmod.emfviews.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import fr.inria.atlanmod.emfviews.mel.MelPackage
import fr.inria.atlanmod.emfviews.mel.ConcreteClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.scoping.Scopes
import fr.inria.atlanmod.emfviews.mel.ModifyClass
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EDataType

/*
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MelScopeProvider extends AbstractMelScopeProvider {

  override getScope(EObject context, EReference reference) {
    if (reference == MelPackage.Literals.CONCRETE_CLASS__CLASS) {
      val cc = context as ConcreteClass
      val package = EPackage.Registry.INSTANCE.getEPackage(cc.metamodel.nsURI)
      if (package !== null) {
        val candidates = package.EClassifiers
        return Scopes.scopeFor(candidates)
      }
    }
    
    else if (reference == MelPackage.Literals.MODIFY_ATTRIBUTE__PROPERTY) {
      val mc = context.eContainer as ModifyClass
      return Scopes.scopeFor(mc.class_.class_.EAttributes)
    }
    
    else if (reference == MelPackage.Literals.MODIFY_REFERENCE__PROPERTY) {
      val mc = context.eContainer as ModifyClass
      return Scopes.scopeFor(mc.class_.class_.EReferences)
    }
    
    else if (reference == MelPackage.Literals.FILTER_PROPERTY__PROPERTY) {
      val mc = context.eContainer as ModifyClass
      return Scopes.scopeFor(mc.class_.class_.EStructuralFeatures) 
    }
    
    else if (reference == MelPackage.Literals.ADD_ATTRIBUTE__TYPE
          || reference == MelPackage.Literals.MODIFY_ATTRIBUTE__TYPE) {
      return Scopes.scopeFor(EcorePackage.eINSTANCE.EClassifiers.filter(EDataType))
    }
    
    return super.getScope(context, reference)
  } 
}