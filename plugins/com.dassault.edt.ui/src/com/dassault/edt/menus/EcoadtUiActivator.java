/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.menus;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EcoadtUiActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.dassault.edt.ui"; //$NON-NLS-1$

	// The shared instance
	private static EcoadtUiActivator plugin;

	private static BundleContext context;

	/**
	 * The constructor
	 */
	public EcoadtUiActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		EcoadtUiActivator.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		EcoadtUiActivator.context = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static EcoadtUiActivator getDefault() {
		return plugin;
	}

	public static BundleContext getContext() {
		return context;
	}

	/**
	 * A helper to log plugin errors.
	 * 
	 * @param severity  the error severity.
	 * @param message   the error message.
	 * @param exception the error exception.
	 */
	public static void log(int severity, String message, Throwable exception) {
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, message, exception));
	}
}
