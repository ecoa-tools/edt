/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.ProjectServices;
import com.dassault.edt.xmlimport.FailedImportException;
import com.dassault.edt.xmlimport.XmlImporter;

/**
 * Workspace modify operation for the Project -> Import functionality.
 */
public class EcoadtModelingProjectImportOperation extends WorkspaceModifyOperation {

	private IPath location;
	private IProject project;
	private String importPath;
	private int logLevel;

	/**
	 * Create an "Import" project operation for the given project and the given
	 * import path.
	 * 
	 * @param location      The project location
	 * @param projectHandle The workspace project
	 * @param importPath    The import path
	 * @param logLevel      The ecoa-exvt selected log level
	 */
	public EcoadtModelingProjectImportOperation(IPath location, IProject projectHandle, String importPath,
			int logLevel) {
		this.location = location;
		this.project = projectHandle;
		this.importPath = importPath;
		this.logLevel = logLevel;
	}

	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		try {
			final ProjectServices service = new ProjectServices();

			monitor.beginTask("Load project", 100);

//			Verify project with EXVT
			monitor.subTask("Verify Project");
			int importStep = service.verifyProjectWithLogLevel(importPath, logLevel);

//			Close previous tabs
			monitor.subTask("Close project");
			service.closeProject(monitor);
			monitor.worked(20);

//			Import XML project
			monitor.subTask("Import project");
			/**
			 * -1 : Error : import only basic Types
			 * 
			 * 0 : Only Steps0 : Types
			 * 
			 * 1 : Steps0 + Steps1 : +ServiceDefinition
			 * 
			 * 2 : Steps0 -> Steps2 : +ComponentDefinition
			 * 
			 * 3 : Steps0 -> Steps3 : +InitialAssembly
			 * 
			 * 4 : Steps0 -> Steps4 : +ComponentImplementation
			 * 
			 * 5 : Steps0 -> Step5 : +Integration
			 * 
			 * 
			 */
			StringBuilder missingElementsToLog = new StringBuilder();
			int trueSteps = 5;
			edtproject.Steps edtProject = new XmlImporter().getEDTProject(importPath, importStep, missingElementsToLog,
					trueSteps);
			if (edtProject != null) {

//				Create aird and model.ecoadt 
				service.importProject(monitor, project, location, edtProject);

//				Create import status message
				String message = null;
				if (importStep > -1) {
					if (trueSteps == importStep) {
						message = "Import successful";
					} else {
						message = "Import partially successful. The project is only valid unto Step"
								+ Math.min(importStep, trueSteps);
					}
					if (!missingElementsToLog.isEmpty()) {
						service.logMissingElements(missingElementsToLog);
						message = message.concat(" but with missing elements. See console for more details.");
					}
				} else {
					message = "Import failed. The project is not valid, only the BasicTypes are available";
				}
				EDTLog.toPopUpAndConsole(message, "");
			}
			monitor.worked(80);
			service.saveProject(project, false);

		} catch (FailedImportException | FileNotFoundException e) {
			EDTLog.toPopUpAndConsole("Import failed. See console for more informations", e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			EDTLog.toPopUpAndConsole("Import failed.", e.getMessage());
			e.printStackTrace();
		} finally {
			monitor.done();
		}
	}
}
