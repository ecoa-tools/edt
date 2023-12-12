/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;
import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WorkingSetGroup;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IIDEHelpContextIds;
import org.eclipse.ui.internal.ide.dialogs.IDEResourceInfoUtils;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea.IErrorMessageReporter;

import com.dassault.edt.xmlimport.ImportUtils;

/**
 * The EcoadtWizardExportProjectCreationPage is the page that allows the user to
 * export projects to a particular location.
 */
@SuppressWarnings("restriction")
public class EcoadtWizardExportProjectCreationPage extends WizardPage {

	// constants
	private static final int SIZING_TEXT_FIELD_WIDTH = 250;

	private static final String BROWSE_LABEL = IDEWorkbenchMessages.ProjectLocationSelectionDialog_browseLabel;

	private static final String SAVED_LOCATION_ATTR = "OUTSIDE_LOCATION";

	private Text locationPathField;

	private ProjectContentsLocationArea locationArea;

	private WorkingSetGroup workingSetGroup;

	private Combo comboLogLevel;

	/**
	 * Creates a new project creation wizard page.
	 *
	 * @param pageName The name of this page
	 */
	public EcoadtWizardExportProjectCreationPage(String pageName) {
		super(pageName);
		super.setPageComplete(false);
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);

		initializeDialogUnits(parent);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IIDEHelpContextIds.NEW_PROJECT_WIZARD_PAGE);

		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		createProjectExportPathGroup(composite);
		createProjectEcoaExvtLogLevel(composite);

		setPageComplete(validatePage());
		// Show description on opening
		setErrorMessage(null);
		setMessage(null);
		setControl(composite);
		Dialog.applyDialogFont(composite);
	}

	/**
	 * Create a working set group for this page. This method can only be called
	 * once.
	 *
	 * @param composite                the composite in which to create the group
	 * @param selection                the current workbench selection
	 * @param supportedWorkingSetTypes an array of working set type IDs that will
	 *                                 restrict what types of working sets can be
	 *                                 chosen in this group
	 * @return the created group. If this method has been called previously the
	 *         original group will be returned.
	 * @since 3.4
	 */
	public WorkingSetGroup createWorkingSetGroup(Composite composite, IStructuredSelection selection,
			String[] supportedWorkingSetTypes) {
		if (workingSetGroup != null)
			return workingSetGroup;
		workingSetGroup = new WorkingSetGroup(composite, selection, supportedWorkingSetTypes);
		return workingSetGroup;
	}

	/**
	 * Get an error reporter for the receiver.
	 *
	 * @return IErrorMessageReporter
	 */
	@SuppressWarnings("unused")
	private IErrorMessageReporter getErrorReporter() {
		return (errorMessage, infoOnly) -> {
			if (infoOnly) {
				setMessage(errorMessage, IStatus.INFO);
				setErrorMessage(null);
			} else {
				setErrorMessage(errorMessage);
			}
			boolean valid = errorMessage == null;
			if (valid) {
				valid = validatePage();
			}

			setPageComplete(valid);
		};
	}

	/**
	 * Creates the project import path specification controls.
	 *
	 * @param parent the parent composite
	 */
	private void createProjectExportPathGroup(Composite parent) {
		Button browseButton;
		Label locationLabel;
		// project specification group
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// location label
		locationLabel = new Label(projectGroup, SWT.NONE);
		locationLabel.setText("XML Export path:");

		// project location entry field
		locationPathField = new Text(projectGroup, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		data.horizontalSpan = 2;
		locationPathField.setLayoutData(data);

		// browse button
		browseButton = new Button(projectGroup, SWT.PUSH);
		browseButton.setText(BROWSE_LABEL);
		browseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				handleLocationBrowseButtonPressed();
			}
		});

	}

	/**
	 * Creates the project import ecoa-exvt process log level.
	 *
	 * @param parent the parent composite
	 */
	private void createProjectEcoaExvtLogLevel(Composite parent) {
		Label verbosityLabel;

		// project group composite
		Composite projectGroup = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 4;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// combo label
		verbosityLabel = new Label(projectGroup, SWT.NONE);
		verbosityLabel.setText("ecoa-exvt verbosity level: ");

		// combo box
		comboLogLevel = new Combo(projectGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		comboLogLevel.setItems("0 - critical", "1 - crit. + error", "2 - crit. + err. + warning",
				"3 - crit. + err. + warn. + info", "4 - crit. + err. + warn. + inf. + debug");
		// select default log level "3"
		comboLogLevel.select(3);
	}

	/**
	 * Open an appropriate directory browser.
	 */
	private void handleLocationBrowseButtonPressed() {

		String selectedDirectory = null;
		String dirName = locationPathField.getText();

		if (!dirName.equals(IDEResourceInfoUtils.EMPTY_STRING)) {
			if (!new File(dirName).isDirectory()) {
				dirName = IDEResourceInfoUtils.EMPTY_STRING;
			}
		} else {
			String value = getDialogSettings().get(SAVED_LOCATION_ATTR);
			if (value != null) {
				dirName = value;
			}
		}

		DirectoryDialog dialog = new DirectoryDialog(locationPathField.getShell(), SWT.SHEET);
		dialog.setMessage(IDEWorkbenchMessages.ProjectLocationSelectionDialog_directoryLabel);
		dialog.setText("Please select the ECOA Export directory.");
		dialog.setFilterPath(dirName);

		selectedDirectory = dialog.open();

		if (selectedDirectory != null) {
			updateLocationField(selectedDirectory);
			getDialogSettings().put(SAVED_LOCATION_ATTR, selectedDirectory);
			ImportUtils.guessProjectName(selectedDirectory);
		}
		setPageComplete(validatePage());
	}

	/**
	 * Update the location field based on the selected path.
	 *
	 * @param selectedPath
	 */
	private void updateLocationField(String selectedPath) {
		locationPathField.setText(TextProcessor.process(selectedPath));
	}

	/**
	 * Returns the selected log level from the wizard combo. ecoa-exvt log level can
	 * range from 0 to 4.
	 * 
	 * @return the selected log level from the wizard combo
	 */
	public int getLogLevel() {
		return comboLogLevel.getSelectionIndex();
	}

	/**
	 * Returns the current project location path as entered by the user, or its
	 * anticipated initial value. Note that if the default has been returned the
	 * path in a project description used to create a project should not be set.
	 *
	 * @return the project location path or its anticipated initial value.
	 */
	public IPath getLocationPath() {
		return new Path(locationArea.getProjectLocation());
	}

	/**
	 * /** Returns the current project location URI as entered by the user, or
	 * <code>null</code> if a valid project location has not been entered.
	 *
	 * @return the project location URI, or <code>null</code>
	 * @since 3.2
	 */
	public URI getLocationURI() {
		return locationArea.getProjectLocationURI();
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
		// There is only one opened project : this is the one to export
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		if (projects.length == 0) {
			return null;
		}
		if (projects.length != 1) {
			return null;
		} else {
			return projects[0];
		}
	}

	/**
	 * Returns the value of the import path field with leading and trailing spaces
	 * removed.
	 *
	 * @return the import path in the field
	 */
	public String getExportPathFieldValue() {
		return locationPathField.getText().trim();
	}

	/**
	 * Returns whether this page's controls currently all contain valid values.
	 *
	 * @return <code>true</code> if all controls are valid, and <code>false</code>
	 *         if at least one is invalid
	 */
	protected boolean validatePage() {
		String selectedPath = getExportPathFieldValue();
		if (!selectedPath.isEmpty()) {
			File exportDirectory = new File(selectedPath);
			if (!exportDirectory.isDirectory()) {
				setErrorMessage(null);
				setMessage(ImportUtils.NOT_ECOA_PROJECT);
				return false;
			}
		} else {
			setErrorMessage(null);
			setMessage("XML export PATH is empty");
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
			locationPathField.setFocus();
		}
	}

	/**
	 * Returns the useDefaults.
	 *
	 * @return boolean
	 */
	public boolean useDefaults() {
		return locationArea.isDefault();
	}

	/**
	 * Return the selected working sets, if any. If this page is not configured to
	 * interact with working sets this will be an empty array.
	 *
	 * @return the selected working sets
	 * @since 3.4
	 */
	public IWorkingSet[] getSelectedWorkingSets() {
		if (workingSetGroup == null) {
			return new IWorkingSet[0];
		}
		return workingSetGroup.getSelectedWorkingSets();
	}

	/**
	 * Returns the project name for which we want to export files. Returns empty
	 * string if there is no project opened.
	 * 
	 * @return the project name
	 */
	public String getProjectName() {
		IProject project = getProjectHandle();
		if (project != null) {
			return project.getName();
		}
		return "";
	}

}
