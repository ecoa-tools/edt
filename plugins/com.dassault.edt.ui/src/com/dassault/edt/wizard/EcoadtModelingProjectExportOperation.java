/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.dassault.edt.export.XMLExporter;
import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.ProjectServices;

/**
 * Workspace modify operation for the Project -> Export functionality.
 */
public class EcoadtModelingProjectExportOperation extends WorkspaceModifyOperation {

	private IProject project;
	private String exportPath;
	private int logLevel;

	/**
	 * Create an "Export" operation for the given project at the given export path.
	 * 
	 * @param projectHandle The workspace project to export
	 * @param exportPath    The export path
	 * @param logLevel      The ecoa-exvt desired log level for export operation
	 */
	public EcoadtModelingProjectExportOperation(IProject projectHandle, String exportPath, int logLevel) {
		this.project = projectHandle;
		this.exportPath = exportPath;
		this.logLevel = logLevel;
	}

	private String getProjectEcoadtModel() {
		return project.getFile("model.ecoadt").getLocation().toOSString();
	}

	private String getProjectName() {
		return project.getName();
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		ProjectServices services = new ProjectServices();
		try {
			monitor.beginTask("Export project", 100);
			monitor.worked(20);
			monitor.subTask("Export project");
			int verificationStep = new XMLExporter().launchFromEcoadtFile(getProjectEcoadtModel(), exportPath,
					getProjectName());
			monitor.worked(80);
			monitor.subTask("Check project");
			if (verificationStep >= 0) {
				int cmdValue = services.verifyProjectWithLogLevel(exportPath + File.separator + getProjectName(),
						verificationStep, logLevel);
				if (cmdValue >= 0) {
					EDTLog.displayPopUp("Export successful, exported model checked and compliant.");
				} else { // cmdValue < 0
					EDTLog.displayPopUp(
							"Error during execution of ecoa-exvt external tool, check console for message.");
				}
			} else {
				EDTLog.displayPopUp("Export successful, but project is empty, 'ecoa-exvt' not executed");
			}

		} catch (IOException e) {
			EDTLog.toPopUpAndConsole("Export failed. See console for more details.", e.getMessage());
		} catch (Exception e) {
			EDTLog.toPopUpAndConsole("Export failed.", e.getMessage());
			e.printStackTrace();
		} finally {

			monitor.done();
		}
	}
}
