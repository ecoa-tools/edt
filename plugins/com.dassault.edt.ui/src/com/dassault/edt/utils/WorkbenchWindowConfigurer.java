/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.utils;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;

/**
 * 
 * This class keeps track of the configurer that only "appears" when EDT is
 * launched, so that we can use it later to update EDT's title with the name of
 * the opened project.
 *
 */
public class WorkbenchWindowConfigurer {
	/**
	 * The class to keep track of.
	 */
	private static IWorkbenchWindowConfigurer configurer;

	/**
	 * Setter.
	 * 
	 * @param configurer value
	 */
	public static final void set(IWorkbenchWindowConfigurer configurer) {
		WorkbenchWindowConfigurer.configurer = configurer;
	}

	/**
	 * Getter.
	 * 
	 * @return the configurer.
	 */
	public static IWorkbenchWindowConfigurer get() {
		return WorkbenchWindowConfigurer.configurer;
	}

}
