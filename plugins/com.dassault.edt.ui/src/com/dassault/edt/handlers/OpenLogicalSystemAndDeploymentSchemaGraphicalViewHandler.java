/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import java.util.Collection;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Shell;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;

import edtlogical.LogicalSystem;

/**
 * Open the logical system and deployment schema graphical view
 */

public class OpenLogicalSystemAndDeploymentSchemaGraphicalViewHandler {

	private EcoadtServices service = new EcoadtServices();

	private ProjectServices projectService = new ProjectServices();

	/**
	 * Returns true if the handler can be executed.
	 * 
	 * @return true if the handler can be executed
	 */
	@CanExecute
	public boolean canExecute() {

		Session session = service.getSession();
		LogicalSystem logicalSystem = service.getExistingLogicalSystem(session);
		return (logicalSystem != null);
	}

	/**
	 * Execute the handler.
	 * 
	 * @param shell The active {@link Shell}
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		Session session = service.getSession();
		boolean logicalSystemGraphExist = false;
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			if ("Logical System And Deployment Schema Graphical View".equals(representation.getName())) {
				logicalSystemGraphExist = true;
			}
		}
		if (!logicalSystemGraphExist) {
			service.createLogicalSystemGraphicalView(session);
		}
		projectService.openLogicalSystemGraphicalView(session);
	}

}
