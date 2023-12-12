/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import javax.inject.Named;

import org.eclipse.core.resources.IProject;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;
import com.dassault.edt.wizard.EcoadtProjectRenameWizard;

/**
 * Project -> Rename functionality handler.
 */
public class RenameProjectHandler {
	private EcoadtServices service = new EcoadtServices();

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

		IProject currentProject = service.getWorkspaceProject();
		ProjectServices projectService = new ProjectServices();

		int response = -1;
		if (currentProject != null && projectService.isOpenedProjectDirty()) {
			String message = "There are unsaved editors. Do you want to save your work before renaming ?";
			MessageDialog dialog = new MessageDialog(shell, "Unsaved files", null, message,
					MessageDialog.QUESTION_WITH_CANCEL, new String[] { "Yes", "No", "Cancel" }, 0);
			response = dialog.open();
			if (response == 0) {
				projectService.saveProject(currentProject, false);
			}

		}

		if (response != 2) {
			WizardDialog wizard = new WizardDialog(shell, new EcoadtProjectRenameWizard());
			wizard.open();
		}
	}
}
