/*
* generated by Xtext
*/
package monoge.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ExtensionUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return monoge.dsl.ui.internal.ExtensionActivator.getInstance().getInjector("monoge.dsl.Extension");
	}
	
}
