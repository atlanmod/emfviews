/*
 * generated by Xtext 2.12.0
 */
package fr.inria.atlanmod.emfviews.mel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MelStandaloneSetup extends MelStandaloneSetupGenerated {

	def static void doSetup() {
		new MelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}