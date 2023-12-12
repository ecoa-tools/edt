/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.utils.ProjectServices;

/**
 * Import Wizard class for Ecoadt project.
 */
public class EcoadtProjectPartialImportWizard extends BasicNewProjectResourceWizard {

	private ProjectServices projectServices = new ProjectServices();
	private EcoadtWizardPartialImportProjectCreationPage wizardPartialImportProjectCreationPage;
	protected IWorkbench workbench;

	/**
	 * Default constructor.
	 */
	public EcoadtProjectPartialImportWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Import part of ECOA DT Project");
		setNeedsProgressMonitor(true);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addPages() {
		wizardPartialImportProjectCreationPage = new EcoadtWizardPartialImportProjectCreationPage(
				"Create a new ECOA project") {

			@Override
			public void createControl(Composite parent) {
				super.createControl(parent);

				Composite control = (Composite) getControl();
				GridLayout layout = new GridLayout();
				control.setLayout(layout);
				Dialog.applyDialogFont(control);
			}
		};

		wizardPartialImportProjectCreationPage.setTitle("Add new elements to the current ECOA projet");
		wizardPartialImportProjectCreationPage.setDescription("Select an ECOA XML project to import partially");
		addPage(wizardPartialImportProjectCreationPage);
	}

	@Override
	public boolean performFinish() {

		final EcoadtModelingProjectPartialImportOperation ecoaDtModelingProjectPartialImportOperation = new EcoadtModelingProjectPartialImportOperation(
				wizardPartialImportProjectCreationPage.getImportPathFieldValue(),
				wizardPartialImportProjectCreationPage.getLogLevel());

		try {
			getContainer().run(true, false, ecoaDtModelingProjectPartialImportOperation);
		} catch (InvocationTargetException | InterruptedException e) {
			EcoadtUiActivator.log(IStatus.ERROR, "Import project failed", e);
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
		}
		return true;
	}
}
