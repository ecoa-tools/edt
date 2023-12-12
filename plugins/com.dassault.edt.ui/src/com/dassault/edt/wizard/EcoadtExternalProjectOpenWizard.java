/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

/**
 * Open project wizard for Ecoadt project.
 */
@SuppressWarnings("restriction")
public class EcoadtExternalProjectOpenWizard extends Wizard implements IImportWizard {
	private static final String EXTERNAL_PROJECT_SECTION = "ExternalProjectImportWizard";//$NON-NLS-1$
	private EcoadtWizardProjectsOpenPage mainPage;
	private IStructuredSelection currentSelection = null;
	private String initialPath = null;

	/**
	 * Constructor for ExternalProjectImportWizard.
	 */
	public EcoadtExternalProjectOpenWizard() {
		this(null);
	}

	/**
	 * Constructor for ExternalProjectImportWizard.
	 * 
	 * @param initialPath Default path for wizard to import
	 * @since 3.5
	 */
	public EcoadtExternalProjectOpenWizard(String initialPath) {
		super();
		this.initialPath = initialPath;
		super.setNeedsProgressMonitor(true);
		IDialogSettings workbenchSettings = IDEWorkbenchPlugin.getDefault().getDialogSettings();

		IDialogSettings wizardSettings = workbenchSettings.getSection(EXTERNAL_PROJECT_SECTION);
		if (wizardSettings == null) {
			wizardSettings = workbenchSettings.addNewSection(EXTERNAL_PROJECT_SECTION);
		}
		super.setDialogSettings(wizardSettings);
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new EcoadtWizardProjectsOpenPage("wizardExternalProjectsPage", initialPath);
		addPage(mainPage);
	}

	/*
	 * (non-Javadoc) Method declared on IWorkbenchWizard.
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		setWindowTitle("Open");
		setDefaultPageImageDescriptor(IDEWorkbenchPlugin.getIDEImageDescriptor("wizban/importproj_wiz.png")); //$NON-NLS-1$
		this.currentSelection = currentSelection;
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public boolean performCancel() {
		mainPage.performCancel();
		return true;
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public boolean performFinish() {
		return mainPage.createProjects();
	}
}
