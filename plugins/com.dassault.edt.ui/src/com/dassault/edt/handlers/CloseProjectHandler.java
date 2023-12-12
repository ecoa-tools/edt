/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;

/**
 * Project -> Close functionality handler.
 */
public class CloseProjectHandler {

	private EcoadtServices service = new EcoadtServices();
	private ProjectServices projectService = new ProjectServices();

	/**
	 * Returns true if the handler can be executed.
	 * 
	 * @return true if the handler can be executed
	 */
	@CanExecute
	public boolean canExecute() {
		return service.getWorkspaceProject() != null;
	}

	/**
	 * Execute the handler.
	 * 
	 * @param shell The active {@link Shell}
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		IProject project = service.getWorkspaceProject();

		projectService.saveProject(project, true);
		projectService.closeOpenedEditors(false);
		projectService.closeProject(new NullProgressMonitor());
		projectService.closeOpenedEditors(false);
	}

}
