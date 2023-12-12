/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.dassault.edt.export.XMLExporter;
import com.dassault.edt.log.EDTLog;
import com.dassault.edt.partialimport.PartialImporter;
import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;
import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtproject.Steps;

/**
 * Workspace modify operation for the Project -> Import functionality.
 */
public class EcoadtModelingProjectPartialImportOperation extends WorkspaceModifyOperation {

	private static final String EXPORT_PROJECT_NAME = "exportTest";
	private IPath location;
	private IProject project;
	private String importPath;
	private int logLevel;

	/**
	 * Create an "Import" project operation for the given project and the given
	 * import path.
	 * 
	 * @param location   The project location
	 * @param importPath The import path
	 * @param logLevel   The ecoa-exvt selected log level
	 */
	public EcoadtModelingProjectPartialImportOperation(String importPath, int logLevel) {
		this.importPath = importPath;
		this.logLevel = logLevel;
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		try {
			final ProjectServices service = new ProjectServices();
			Session session = new EcoadtServices().getSession();
			Resource next = session.getSemanticResources().iterator().next();
			Steps steps = ((Steps) next.getContents().get(0));
			monitor.beginTask("Load project", 100);
			monitor.subTask("Verify Project");
			monitor.subTask("Close project");
			monitor.worked(20);
			monitor.subTask("Import project");

			PartialImporter partialImporter = new PartialImporter(importPath, steps);
			EDTLog.toConsoleSeparationLine();
			EDTLog.toConsole("Finding files to import in current project");
			int numberOfStepsToExport = partialImporter.findNumberOfStepsToImport();
			if (numberOfStepsToExport > -1) {
				String tmpdir = java.nio.file.Files.createTempDirectory("PartialExport").toFile().getAbsolutePath();

				EDTLog.toConsoleSeparationLine();
				EDTLog.toConsole("Exporting current project in temporary directory");
				new XMLExporter().launchFromObject(steps, tmpdir, EXPORT_PROJECT_NAME, numberOfStepsToExport);
				int cmdValue = service.verifyProjectWithLogLevel(tmpdir + File.separator + EXPORT_PROJECT_NAME,
						numberOfStepsToExport, logLevel);
				if (cmdValue >= 0) {
					partialImporter.verifyWithNewFiles(tmpdir);
					int cmdValue2 = service.verifyProjectWithLogLevel(tmpdir + File.separator + EXPORT_PROJECT_NAME,
							numberOfStepsToExport, logLevel);
					if (cmdValue2 >= 0) {
						EDTLog.toConsoleSeparationLine();
						EDTLog.toConsole("Export of current project successful, exported model checked and compliant.");
						StringBuilder missingElementsToLog = new StringBuilder();
						ArrayList<ComponentImplementation> componentImplementationToDiagram = new ArrayList<>();
						partialImporter.addToCurrentProject(session, missingElementsToLog,
								componentImplementationToDiagram);
						if (!missingElementsToLog.isEmpty()) {
							service.logMissingElements(missingElementsToLog);
						}
						for (ComponentImplementation componentImplementation : componentImplementationToDiagram) {
							new EcoadtServices().createComponentImplementationDiagram(componentImplementation);
						}
					} else { // cmdValue < 0
						throw new FailedImportException(
								"The project with new files added is not valid. See the console for more details.");
					}
				} else { // cmdValue < 0
					throw new FailedImportException("The current project needs to be valid to add new elements");
				}
			}
		} catch (Exception e) {
			EDTLog.toPopUpAndConsole("Partial Import failed.", e.getMessage());
			e.printStackTrace();
		} finally {
			monitor.done();
		}
	}
}
