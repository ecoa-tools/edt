/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import java.lang.reflect.InvocationTargetException;

import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;

/**
 * Project -> Delete functionality handler.
 */
public class DeleteProjectHandler {

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
		final IProject project = service.getWorkspaceProject();

		boolean confirmation = MessageDialog.openConfirm(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Confirm",
				"Do you want to delete the project " + project.getName() + " ? (cannot be undone)");
		if (confirmation) {
			projectService.closeOpenedEditors();

			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().run(false, false, new IRunnableWithProgress() {

					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						try {
							project.delete(true, true, monitor);
						} catch (CoreException e) {
							EcoadtUiActivator.log(IStatus.ERROR, "Delete project failed", e);
						}
					}
				});
				projectService.emptyWindowTitle();

			} catch (InvocationTargetException | InterruptedException e) {
				EcoadtUiActivator.log(IStatus.ERROR, "Delete project failed", e);
				Thread.currentThread().interrupt();
			}

		}
	}
}
