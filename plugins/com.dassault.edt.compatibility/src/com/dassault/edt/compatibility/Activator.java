/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.compatibility;

import java.net.URL;

import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.dassault.edt.compatibility"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private static BundleContext context;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		Activator.context = context;
		URL confURL = getBundle().getEntry("log4j.properties");
		System.setProperty("workspace_loc", Platform.getLocation().toFile().toString());
		PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
		Activator.context = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	
	static BundleContext getContext() {
		return context;
	}
	
	/**
	 * A helper to log plugin errors.
	 * 
	 * @param severity
	 *            the error severity.
	 * @param message
	 *            the error message.
	 * @param exception
	 *            the error exception.
	 */
	public static void log(int severity, String message, Throwable exception) {
		getDefault().getLog().log(
				new Status(severity, PLUGIN_ID, message, exception));
	}
}
