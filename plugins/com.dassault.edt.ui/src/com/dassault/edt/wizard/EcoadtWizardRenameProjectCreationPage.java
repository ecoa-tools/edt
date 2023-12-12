/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import com.dassault.edt.utils.EcoadtServices;

/**
 * Main page for the Ecoadt rename project Wizard.
 */
@SuppressWarnings("restriction")
public class EcoadtWizardRenameProjectCreationPage extends WizardPage {

	// constants
	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	// initial value stores
	private String initialProjectFieldValue;
	private EcoadtServices service = new EcoadtServices();

	// widgets
	private Text projectNameField;

	private Listener nameModifyListener = e -> {
		boolean valid = validatePage();
		setPageComplete(valid);

	};

	/**
	 * Rename a project wizard page.
	 *
	 * @param pageName the name of this page
	 */
	public EcoadtWizardRenameProjectCreationPage(String pageName) {
		super(pageName);
		super.setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);

		initializeDialogUnits(parent);

		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createProjectNameGroup(composite);

		setPageComplete(validatePage());
		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(composite);
		Dialog.applyDialogFont(composite);
	}

	/**
	 * Creates the project name specification controls.
	 *
	 * @param parent the parent composite
	 */
	private final void createProjectNameGroup(Composite parent) {
		// project specification group
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// new project label
		Label projectLabel = new Label(projectGroup, SWT.NONE);
		projectLabel.setText(IDEWorkbenchMessages.WizardNewProjectCreationPage_nameLabel);
		projectLabel.setFont(parent.getFont());

		// new project name entry field
		projectNameField = new Text(projectGroup, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		projectNameField.setLayoutData(data);
		projectNameField.setFont(parent.getFont());

		// Set the initial value first before listener
		// to avoid handling an event during the creation.
		if (initialProjectFieldValue != null) {
			projectNameField.setText(initialProjectFieldValue);
		}
		projectNameField.addListener(SWT.Modify, nameModifyListener);
	}

	/**
	 * Creates a project resource handle for the current project name field value.
	 * The project handle is created relative to the workspace root.
	 * <p>
	 * This method does not create the project resource; this is the responsibility
	 * of <code>IProject::create</code> invoked by the new project resource wizard.
	 * </p>
	 *
	 * @return the new project resource handle
	 */
	public IProject getProjectHandle() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(getProjectName());
	}

	/**
	 * Returns the current project name as entered by the user, or its anticipated
	 * initial value.
	 *
	 * @return the project name, its anticipated initial value, or <code>null</code>
	 *         if no project name is known
	 */
	public String getProjectName() {
		if (projectNameField == null) {
			return initialProjectFieldValue;
		}

		return getProjectNameFieldValue();
	}

	/**
	 * Returns the value of the project name field with leading and trailing spaces
	 * removed.
	 *
	 * @return the project name in the field
	 */
	private String getProjectNameFieldValue() {
		if (projectNameField == null) {
			return ""; //$NON-NLS-1$
		}

		return projectNameField.getText().trim();
	}

	/**
	 * Returns whether this page's controls currently all contain valid values.
	 *
	 * @return <code>true</code> if all controls are valid, and <code>false</code>
	 *         if at least one is invalid
	 */
	protected boolean validatePage() {
		IWorkspace workspace = IDEWorkbenchPlugin.getPluginWorkspace();

		String projectFieldContents = getProjectNameFieldValue();
		if (projectFieldContents.isEmpty()) {
			setErrorMessage(null);
			setMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectNameEmpty);
			return false;
		}

		IStatus nameStatus = workspace.validateName(projectFieldContents, IResource.PROJECT);
		if (!nameStatus.isOK()) {
			setErrorMessage(nameStatus.getMessage());
			setMessage(null);
			return false;
		}

		IProject project = getProjectHandle();
		if (project.exists()) {
			setErrorMessage(IDEWorkbenchMessages.WizardNewProjectCreationPage_projectExistsMessage);
			setMessage(null);
			return false;
		}

		IPath location = service.getWorkspaceProject().getRawLocation();
		if (location == null) {
			location = workspace.getRoot().getLocation().append(project.getName());
		}
		File file = new File(new File(location.toOSString()).getParent(), project.getName());

		if (file.exists()) {
			setErrorMessage("There's already a project with this name on the file system.");
			setMessage(null);
			return false;
		}

		setErrorMessage(null);
		setMessage(null);
		return true;
	}

	/*
	 * see @DialogPage.setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			projectNameField.setFocus();
		}
	}
}
