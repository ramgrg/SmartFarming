/*
 * generated by Xtext 2.25.0
 */
package com.se4gd.smartfarming.ui;

import com.google.inject.Injector;
import com.se4gd.smartfarming.ui.internal.SmartfarmingActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmartFarmingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SmartfarmingActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SmartfarmingActivator activator = SmartfarmingActivator.getInstance();
		return activator != null ? activator.getInjector(SmartfarmingActivator.COM_SE4GD_SMARTFARMING_SMARTFARMING) : null;
	}

}