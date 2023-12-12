/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import java.util.List;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.PlainMessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Project -> Quit functionality handler.
 */
public class QuitApplicationHandler {

	/**
	 * Execute the handler.
	 * 
	 * @param shell     The active {@link Shell}
	 * @param workbench The workbench
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell, IWorkbench workbench) {

		PlainMessageDialog dialog = PlainMessageDialog.getBuilder(shell, "Confirmation").message("Do you want to exit?")
				.buttonLabels(List.of("Exit", "Cancel")).build();

		if (dialog.open() == 0) {
			workbench.close();
		}
	}

}
