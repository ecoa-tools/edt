/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.utils.FileUtils;

/**
 * Export Wizard class for Ecoadt project.
 */
public class EcoadtProjectExportWizard extends BasicNewProjectResourceWizard {

	private EcoadtWizardExportProjectCreationPage wizardExportProjectCreationPage;
	protected IWorkbench workbench;

	/**
	 * Default constructor.
	 */
	public EcoadtProjectExportWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Export ECOA DT Project");
		setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		wizardExportProjectCreationPage = new EcoadtWizardExportProjectCreationPage(
				"Export ECOA project to XML files") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);

				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				Dialog.applyDialogFont(control);
			}
		};

		wizardExportProjectCreationPage.getProjectHandle();

		wizardExportProjectCreationPage.setTitle("Export ECOA project to XML files");
		wizardExportProjectCreationPage.setDescription("Select the export directory");

		addPage(wizardExportProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		File exportFile = new File(wizardExportProjectCreationPage.getExportPathFieldValue(),
				wizardExportProjectCreationPage.getProjectName());
		if (exportFile.exists()) {
			String message = "Target file (" + exportFile.toString() + ") exists, OK to delete this directory ?";
			if (MessageDialog.openConfirm(getShell(), "Target file exists", message)) {
				if (!FileUtils.deleteDirectory(exportFile)) {
					EDTLog.toPopUpAndConsole("Failed to delete directory: " + exportFile.toString(), "");
					return false;
				}
			} else {
				return false;
			}
		}

		final EcoadtModelingProjectExportOperation ecoaDtModelingProjectExportOperation = new EcoadtModelingProjectExportOperation(
				wizardExportProjectCreationPage.getProjectHandle(),
				wizardExportProjectCreationPage.getExportPathFieldValue(),
				wizardExportProjectCreationPage.getLogLevel());

		try {
			getContainer().run(true, false, ecoaDtModelingProjectExportOperation);
		} catch (InvocationTargetException | InterruptedException e) {
			EcoadtUiActivator.log(IStatus.ERROR, "Export project failed", e);
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
		}
		return true;
	}
}
