/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.utils.FileUtils;

/**
 * Project -> New functionality wizard.
 */
public class EcoadtProjectNewWizard extends BasicNewProjectResourceWizard {

	private WizardNewProjectCreationPage wizardNewProjectCreationPage;
	protected IWorkbench workbench;

	/**
	 * Basic wizard initialization.
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("New ECOA Project"); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		wizardNewProjectCreationPage = new WizardNewProjectCreationPage("Create a new ECOA project") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);

				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				Dialog.applyDialogFont(control);
			}
		};

		wizardNewProjectCreationPage.setInitialProjectName("NewEcoadtProject");//$NON-NLS-1$
		wizardNewProjectCreationPage.setTitle("Create a new ECOA project"); //$NON-NLS-1$
		wizardNewProjectCreationPage.setDescription("Enter the name of the new ECOA project"); //$NON-NLS-1$

		addPage(wizardNewProjectCreationPage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean performFinish() {

		File newFile = new File(wizardNewProjectCreationPage.getLocationPath()
				.append(wizardNewProjectCreationPage.getProjectName()).toOSString());
		if (newFile.exists()) {
			String message = "Target file (" + newFile.toString() + ") exists, OK to delete this directory ?";
			if (MessageDialog.openConfirm(getShell(), "Target file exists", message)) {
				if (!FileUtils.deleteDirectory(newFile)) {
					EDTLog.toConsole("Failed to delete directory: " + newFile.toString());
					return false;
				}
			} else {
				return false;
			}
		}

		IPath location = wizardNewProjectCreationPage.getLocationPath();
		final EcoadtModelingProjectCreationOperation ecoaDtModelingProjectCreationOperation = new EcoadtModelingProjectCreationOperation(
				wizardNewProjectCreationPage.getProjectHandle(), location);

		try {
			getContainer().run(true, false, ecoaDtModelingProjectCreationOperation);
		} catch (InvocationTargetException | InterruptedException e) {
			EcoadtUiActivator.log(IStatus.ERROR, "Create project failed", e);
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
		}
		return true;
	}
}
