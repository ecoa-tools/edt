/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;

/**
 * Workspace modify operation for the Project -> Rename functionality.
 */
public class EcoadtModelingProjectRenameOperation extends WorkspaceModifyOperation {

	private String newName;

	/**
	 * Create a "Rename" project operation given the new project name.
	 * 
	 * @param newName the new project name
	 */
	public EcoadtModelingProjectRenameOperation(String newName) {
		this.newName = newName;
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		try {
			final ProjectServices projectService = new ProjectServices();
			EcoadtServices service = new EcoadtServices();

			monitor.beginTask("Rename project", 100);
			projectService.moveProject(new NullProgressMonitor(), service.getWorkspaceProject(), newName);
			monitor.worked(100);
		} finally {
			monitor.done();
		}
	}
}
