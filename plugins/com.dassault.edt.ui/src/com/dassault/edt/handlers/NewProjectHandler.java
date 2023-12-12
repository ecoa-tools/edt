/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;
import com.dassault.edt.wizard.EcoadtProjectNewWizard;

/**
 * Project -> New functionality handler.
 */
public class NewProjectHandler {

	/**
	 * Execute the handler.
	 * 
	 * @param shell The active {@link Shell}
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		// does the user want to save its actual project first ?
		// (if a project is opened and changes were made)
		EcoadtServices service = new EcoadtServices();
		IProject currentProject = service.getWorkspaceProject();

		int response = -1;
		ProjectServices projectService = new ProjectServices();
		if (currentProject != null && projectService.isOpenedProjectDirty()) {
			String message = "This will close the current project. Do you want to save your work before proceeding ?";
			MessageDialog dialog = new MessageDialog(shell, "Unsaved files", null, message,
					MessageDialog.QUESTION_WITH_CANCEL, new String[] { "Yes", "No", "Cancel" }, 0);
			response = dialog.open();
			if (response == 0) {
				projectService.saveProject(currentProject, false);
			}
		}
		if (response != 2) {
			openNewWizard(shell);
		}

	}

	private void openNewWizard(Shell shell) {
		WizardDialog wizard = new WizardDialog(shell, new EcoadtProjectNewWizard());
		wizard.open();
	}
}
