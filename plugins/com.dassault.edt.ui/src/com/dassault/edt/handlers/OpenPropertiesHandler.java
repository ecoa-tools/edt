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

import com.dassault.edt.utils.ProjectServices;

/**
 * Show View -> Properties functionality handler.
 */
public class OpenPropertiesHandler {

	/**
	 * Execute the handler.
	 * 
	 * @param partService The part service
	 */
	@Execute
	public void execute(EPartService partService) {
		partService.showPart(ProjectServices.PROPERTY_VIEW_ID, PartState.ACTIVATE);
	}

}
