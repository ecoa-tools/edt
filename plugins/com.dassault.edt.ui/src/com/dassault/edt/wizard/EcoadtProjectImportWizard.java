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
import com.dassault.edt.utils.ProjectServices;

/**
 * Import Wizard class for Ecoadt project.
 */
public class EcoadtProjectImportWizard extends BasicNewProjectResourceWizard {

	private ProjectServices projectServices = new ProjectServices();
	private EcoadtWizardImportProjectCreationPage wizardImportProjectCreationPage;
	protected IWorkbench workbench;

	/**
	 * Default constructor.
	 */
	public EcoadtProjectImportWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Import ECOA DT Project");
		setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		wizardImportProjectCreationPage = new EcoadtWizardImportProjectCreationPage("Create a new ECOA project") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);

				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				Dialog.applyDialogFont(control);
			}
		};

		wizardImportProjectCreationPage.setInitialProjectName("NewEcoadtProject");
		wizardImportProjectCreationPage.setTitle("Import an ECOA projet from XML files");
		wizardImportProjectCreationPage.setDescription("Select an ECOA XML project to import");

		addPage(wizardImportProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		File importFile = new File(wizardImportProjectCreationPage.getLocationPath()
				.append(wizardImportProjectCreationPage.getProjectName()).toOSString());
		if (importFile.exists()) {
			String message = "Target file (" + importFile.toString() + ") exists, OK to delete this directory ?";
			if (MessageDialog.openConfirm(getShell(), "Target file exists", message)) {
				if (!FileUtils.deleteDirectory(importFile)) {
					EDTLog.toConsole("Failed to delete directory: " + importFile.toString());
					return false;
				}
			} else {
				return false;
			}
		}

		projectServices.closeOpenedEditors(false);
		final EcoadtModelingProjectImportOperation ecoaDtModelingProjectImportOperation = new EcoadtModelingProjectImportOperation(
				wizardImportProjectCreationPage.getLocationPath(), wizardImportProjectCreationPage.getProjectHandle(),
				wizardImportProjectCreationPage.getImportPathFieldValue(),
				wizardImportProjectCreationPage.getLogLevel());

		try {
			getContainer().run(true, false, ecoaDtModelingProjectImportOperation);
		} catch (InvocationTargetException | InterruptedException e) {
			EcoadtUiActivator.log(IStatus.ERROR, "Import project failed", e);
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
		}
		return true;
	}
}
