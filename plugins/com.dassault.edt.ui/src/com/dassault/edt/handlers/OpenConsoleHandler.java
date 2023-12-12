/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

/**
 * Show View -> Console functionality handler.
 */
public class OpenConsoleHandler {

	/**
	 * Execute the handler.
	 * 
	 * @param partService The part service
	 */
	@Execute
	public void execute(EPartService partService) {
		partService.showPart("org.eclipse.ui.console.ConsoleView", PartState.ACTIVATE);
	}

}
