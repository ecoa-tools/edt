/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */package com.dassault.edt.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.utils.ProjectServices;

/**
 * Project -> Rename functionality wizard.
 */
public class EcoadtProjectRenameWizard extends Wizard {

	private ProjectServices projectServices = new ProjectServices();
	private EcoadtWizardRenameProjectCreationPage wizardRenameProjectCreationPage;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		wizardRenameProjectCreationPage = new EcoadtWizardRenameProjectCreationPage("Rename an ECOA project") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);

				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				Dialog.applyDialogFont(control);
			}
		};

		wizardRenameProjectCreationPage.setTitle("Rename an ECOA project"); //$NON-NLS-1$
		wizardRenameProjectCreationPage.setDescription("Enter the new name of the ECOA project"); //$NON-NLS-1$

		addPage(wizardRenameProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		projectServices.closeOpenedEditors(false);
		final EcoadtModelingProjectRenameOperation ecoaDtModelingProjectRenameOperation = new EcoadtModelingProjectRenameOperation(
				wizardRenameProjectCreationPage.getProjectName());

		try {
			getContainer().run(true, false, ecoaDtModelingProjectRenameOperation);
		} catch (InvocationTargetException | InterruptedException e) {
			EcoadtUiActivator.log(IStatus.ERROR, "Rename project failed", e);
			Thread.currentThread().interrupt();
		}
		return true;
	}
}
