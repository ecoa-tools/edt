/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.dassault.edt.utils.ProjectServices;

/**
 * Workspace modify operation for the Project -> New functionality.
 */
public class EcoadtModelingProjectCreationOperation extends WorkspaceModifyOperation {

	private IProject project;
	private IPath path;

	/**
	 * Create a "New" operation for the given project at the given location.
	 * 
	 * @param project  The workspace project to create
	 * @param location The location at which to create the project, can be null to
	 *                 specify default location
	 */
	public EcoadtModelingProjectCreationOperation(IProject project, IPath location) {
		this.project = project;
		this.path = location;
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		try {
			final ProjectServices service = new ProjectServices();

			monitor.beginTask("Load project", 100);
			monitor.subTask("Close project");
			service.closeProject(monitor);
			monitor.worked(50);
			monitor.subTask("Create project");
			service.createProject(monitor, project, path);
			monitor.worked(50);
		} finally {
			monitor.done();
		}
	}
}
