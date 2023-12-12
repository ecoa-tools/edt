/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.compatibility;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * Class for EDT's action bar configuration.
 * 
 *
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	/**
	 * Constructor calls super method
	 * 
	 * @param configurer action bar configuration
	 */
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	@Override
	protected void makeActions(IWorkbenchWindow window) {
		register(ActionFactory.UNDO.create(window));
		register(ActionFactory.REDO.create(window));
		register(ActionFactory.COPY.create(window));
		register(ActionFactory.PASTE.create(window));
	}

	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
	}

}
