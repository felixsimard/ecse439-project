/*
 * generated by Xtext 2.25.0
 */
package org.xtext.project.rds.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.project.rds.ui.internal.RdsActivator;

public class MyRdsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RdsActivator.getInstance().getInjector("org.xtext.project.rds.MyRds");
	}

}
