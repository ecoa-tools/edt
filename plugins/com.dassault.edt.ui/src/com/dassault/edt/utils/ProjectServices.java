/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionCreationOperation;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.menus.EcoadtUiActivator;
import com.dassault.edt.xmlimport.ImportUtils;
import com.google.common.collect.Maps;

/**
 * Helper class for project related functionalities.
 */
@SuppressWarnings("restriction")
public class ProjectServices {

	private static final String TOGGLE_GRAPHICAL_DISPLAY_ERROR = "toggleGraphicalDisplayError";
	public static final String EDT_WINDOW_DEFAULT_NAME = "ECOA Design Tool";
	private static final String REPRESENTATIONS_AIRD = "/representations.aird";
	public static final String ECOADT_VP = "ecoadt";
	public static final String ASSEMBLY_GRAPH_NAME = "Assembly Graphical View";
	public static final String LOGICAL_SYSTEM_GRAPH_NAME = "Logical System And Deployment Schema Graphical View";
	public static final String TREE_NAME = "Tree View";
	public static final String OPEN_PROJECT_FAILED = "Open project failed";
	public static final String PROPERTY_VIEW_ID = "org.eclipse.ui.views.PropertySheet";

	private EcoadtServices service = new EcoadtServices();

	/**
	 * A console that displays message
	 */

	public MessageConsole messageConsole;

	@SuppressWarnings("unused")
	private MessageConsole getMessageConsole() {
		if (messageConsole == null) {
			messageConsole = new MessageConsole("CONSOLE_NAME", null);
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[] { messageConsole });
		}
		return messageConsole;
	}

	/**
	 * Create a new project. Use null for the location when using the default
	 * location.
	 * 
	 * @param monitor  The progress monitor
	 * @param project  The workspace project
	 * @param location The project location
	 */
	public void createProject(IProgressMonitor monitor, IProject project, IPath location) {
		createProjectImpl(monitor, project, location);

		String modelPath = '/' + project.getName();
		final Session session = getOrCreateAird(project,
				URI.createPlatformResourceURI(modelPath + REPRESENTATIONS_AIRD, true), monitor);

		final String semanticModelPath = getSemanticModelPath(session);
		initSemanticModel(session, semanticModelPath, monitor);

		final String[] viewpointsToActivate = { ECOADT_VP };
		enableViewpoints(session, viewpointsToActivate);

		QualifiedName test = new QualifiedName("", TOGGLE_GRAPHICAL_DISPLAY_ERROR);
		try {
			if (project.getPersistentProperty(test) == null) {
				project.setPersistentProperty(test, "NONE");
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		boolean assemblyGraphExist = false;
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			assemblyGraphExist = ASSEMBLY_GRAPH_NAME.equals(representation.getName());
		}
		if (!assemblyGraphExist) {
			service.createCompositeGraphicalView(session);
		}

		boolean treeViewExist = false;
		Collection<DRepresentation> representations2 = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation2 : representations2) {
			treeViewExist = TREE_NAME.equals(representation2.getName());
		}
		if (!treeViewExist) {
			service.createTreeView(session);
		}

		boolean logicalSystemGraphExist = false;
		Collection<DRepresentation> representations3 = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation3 : representations3) {
			logicalSystemGraphExist = LOGICAL_SYSTEM_GRAPH_NAME.equals(representation3.getName());
		}
		if (!logicalSystemGraphExist) {
			service.createLogicalSystemGraphicalView(session);
		}

		service.createComponentImplementationGraphicalView(session);
		changeWindowTitle(project.getName());

		openCompositeGraphicalView(session);
		openTreeView(session);
		openPropertyView();
	}

	/**
	 * When no project is opened, erases the project name from the window title.
	 */
	public void emptyWindowTitle() {
		changeWindowTitle("");
	}

	/**
	 * When a project is opened, updates the window title by adding the project
	 * name.
	 * 
	 * @param projectName : the project name
	 */
	public void changeWindowTitle(String projectName) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				WorkbenchWindowConfigurer.get().setTitle(getEDTWindowName(projectName));
			}
		});
	}

	/**
	 *
	 * Get the EcoaDT window name
	 * 
	 * @param projectName : the name of the current project
	 * @return The EcoaDT window name
	 */

	public String getEDTWindowName(String projectName) {
		String suffix;
		if ((projectName == null) || projectName.isEmpty()) {
			suffix = "";
		} else {
			suffix = " - " + projectName;
		}
		return ProjectServices.EDT_WINDOW_DEFAULT_NAME + suffix;
	}

	/**
	 *
	 * Import an existing project in EDT
	 * 
	 * @param monitor    : the given monitor
	 * @param project    : the project to be imported
	 * @param location   : the location of the project to be imported
	 * @param edtProject : the new EDT project
	 */

	public void importProject(IProgressMonitor monitor, IProject project, IPath location, edtproject.Steps edtProject) {
		createProjectImpl(monitor, project, location);

		String modelPath = '/' + project.getName();
		final Session session = getOrCreateAird(project,
				URI.createPlatformResourceURI(modelPath + REPRESENTATIONS_AIRD, true), monitor);

		final String semanticModelPath = getSemanticModelPath(session);
		importSemanticModel(session, semanticModelPath, monitor, edtProject);

		final String[] viewpointsToActivate = { ECOADT_VP };
		enableViewpoints(session, viewpointsToActivate);

		QualifiedName test = new QualifiedName("", TOGGLE_GRAPHICAL_DISPLAY_ERROR);
		try {
			if (project.getPersistentProperty(test) == null) {
				project.setPersistentProperty(test, "NONE");
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		boolean assemblyGraphExist = false;
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			assemblyGraphExist = ASSEMBLY_GRAPH_NAME.equals(representation.getName());
		}
		if (!assemblyGraphExist) {
			service.createCompositeGraphicalView(session);
		}

		boolean treeViewExist = false;
		Collection<DRepresentation> representations2 = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation2 : representations2) {
			treeViewExist = TREE_NAME.equals(representation2.getName());
		}
		if (!treeViewExist) {
			service.createTreeView(session);
		}

		boolean logicalSystemGraphExist = false;
		Collection<DRepresentation> representations3 = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation3 : representations3) {
			logicalSystemGraphExist = LOGICAL_SYSTEM_GRAPH_NAME.equals(representation3.getName());
		}
		if (!logicalSystemGraphExist) {
			service.createLogicalSystemGraphicalView(session);
		}

		service.createComponentImplementationGraphicalView(session);

		changeWindowTitle(project.getName());

		openCompositeGraphicalView(session);
		openTreeView(session);
		openPropertyView();
	}

	private void createProjectImpl(IProgressMonitor monitor, IProject project, IPath location) {
		try {
			IWorkspace workspace = IDEWorkbenchPlugin.getPluginWorkspace();

			IProjectDescription description = workspace.newProjectDescription(project.getName());
			if (location != null) {
				String path = location.toOSString();
				if (!path.endsWith(project.getName())) {
					location = location.append(project.getName());
				}
			}
			description.setLocation(location);
			description.setNatureIds(new String[] { "org.eclipse.sirius.nature.modelingproject" });
			project.create(description, monitor);
			project.open(monitor);
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		} catch (CoreException e) {
			EcoadtUiActivator.log(IStatus.ERROR, OPEN_PROJECT_FAILED, e);
		}
	}

	/**
	 *
	 * Get the existing logical system in the model
	 * 
	 * @param monitor : the given monitor
	 * @param project : the project to be moved
	 * @param newName : the new name of the project
	 */

	public void moveProject(IProgressMonitor monitor, IProject project, String newName) {
		try {
			final IPath location = project.getRawLocation();
			IPath newProjectPath = null;
			if (location != null) {
				newProjectPath = location.removeLastSegments(1).append(newName);
			}

			final IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { "org.eclipse.sirius.nature.modelingproject" });
			description.setName(newName);
			description.setLocation(newProjectPath);
			project.move(description, IResource.FORCE | IResource.SHALLOW, new NullProgressMonitor());
			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor);
		} catch (CoreException e) {
			EcoadtUiActivator.log(IStatus.ERROR, OPEN_PROJECT_FAILED, e);
		}

		String modelPath = '/' + newName;
		final Session session = getOrCreateAird(project,
				URI.createPlatformResourceURI(modelPath + REPRESENTATIONS_AIRD, true), monitor);

		final String[] viewpointsToActivate = { ECOADT_VP };
		enableViewpoints(session, viewpointsToActivate);

		QualifiedName test = new QualifiedName("", TOGGLE_GRAPHICAL_DISPLAY_ERROR);
		try {
			if (project.getPersistentProperty(test) == null) {
				project.setPersistentProperty(test, "NONE");

			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		boolean assemblyGraphExist = false;
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			assemblyGraphExist = ASSEMBLY_GRAPH_NAME.equals(representation.getName());
		}
		if (!assemblyGraphExist) {
			service.createCompositeGraphicalView(session);
		}

		boolean treeViewExist = false;
		Collection<DRepresentation> representations2 = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation2 : representations2) {
			treeViewExist = TREE_NAME.equals(representation2.getName());
		}
		if (!treeViewExist) {
			service.createTreeView(session);
		}

		changeWindowTitle(newName);

		openCompositeGraphicalView(session);
		openTreeView(session);
	}

	/**
	 *
	 * Get or create the aird file
	 * 
	 * @param project            : The current project
	 * @param representationsURI : the given URI representations
	 * @param monitor            : the given monitor
	 * @return the current Sirius session
	 */

	public Session getOrCreateAird(IProject project, URI representationsURI, IProgressMonitor monitor) {
		final Session session;
		Option<ModelingProject> modelingProject = ModelingProject.asModelingProject(project);
		if (modelingProject.some()) {
			session = modelingProject.get().getSession();
		} else {
			Session tempSession = null;
			SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
					representationsURI, monitor);
			try {
				sessionCreationOperation.execute();
				tempSession = sessionCreationOperation.getCreatedSession();
			} catch (CoreException e) {
				EcoadtUiActivator.log(IStatus.ERROR, "Create representations file failed", e);
			}
			if (tempSession != null) {
				session = tempSession;
			} else {
				session = null;
			}
		}
		return session;
	}

	/**
	 *
	 * Open a project
	 * 
	 * @param projectPath : The current Sirius session
	 * @return The location of the project to be opened
	 */

	public void openProject(final String projectPath) {
		try {
			ProjectServices service1 = new ProjectServices();
			service1.closeOpenedEditors();
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().run(true, true, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) {
					monitor.beginTask("Open project" + projectPath, 100);
					ProjectServices service2 = new ProjectServices();
					service2.closeProject(monitor);

					monitor.worked(25);

					IProjectDescription description;
					try {
						description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(projectPath));
						IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
						monitor.subTask("Open project : " + description.getName());
						project.create(description, null);
						monitor.worked(25);
						project.open(null);
						monitor.worked(25);
					} catch (CoreException e) {
						EcoadtUiActivator.log(IStatus.ERROR, OPEN_PROJECT_FAILED, e);
					}
					monitor.done();
				}
			});
		} catch (InvocationTargetException | InterruptedException e1) {
			EcoadtUiActivator.log(IStatus.ERROR, OPEN_PROJECT_FAILED, e1);
			Thread.currentThread().interrupt();
		}
		Session session = service.getSession();
		while (session == null) {
			session = service.getSession();
		}
		openCompositeGraphicalView(session);
	}

	/**
	 *
	 * Open the composite graphical view
	 * 
	 * @param session : The current Sirius session
	 */

	public void openCompositeGraphicalView(final Session session) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			if (ASSEMBLY_GRAPH_NAME.equals(representation.getName())) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
				return;
			}
		}
	}

	/**
	 *
	 * Open the logical system and deployment schema graphical view
	 * 
	 * @param session : The current Sirius session
	 */

	public void openLogicalSystemGraphicalView(final Session session) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			if (LOGICAL_SYSTEM_GRAPH_NAME.equals(representation.getName())) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
				return;
			}
		}
	}

	/**
	 *
	 * Open the tree view
	 * 
	 * @param session : The current Sirius session
	 */

	public void openTreeView(final Session session) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			if (TREE_NAME.equals(representation.getName())) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
				return;
			}
		}
	}

	/**
	 * Returns {@code true} if the given session has a representation "Tree View"
	 * that can be opened, false otherwise.
	 * 
	 * @param session Sirius session
	 * @return true if the given session has a representation "Tree View" that can
	 *         be opened.
	 */
	public boolean canOpenTreeView(Session session) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : representations) {
			if (TREE_NAME.equals(representation.getName())) {
				return true;
			}
		}
		return false;
	}

	private String getSemanticModelPath(final Session session) {
		Resource aird = (Resource) session.getAllSessionResources().toArray()[0];
		String airdUri = aird.getURI().toPlatformString(true);
		return airdUri.substring(0, airdUri.lastIndexOf("/") + 1) + "model.ecoadt";
	}

	private void initSemanticModel(final Session session, final String semanticModelPath,
			final IProgressMonitor monitor) {
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
						Resource res = new ResourceSetImpl().createResource(semanticModelURI);
						// Add the initial model object to the contents.
						final edtproject.Steps rootObject = EcoadtServices.createEDTProject();
						if (rootObject != null) {
							res.getContents().add(rootObject);
						}

						try {
							res.save(Maps.newHashMap());
						} catch (IOException e) {
							EcoadtUiActivator.log(IStatus.ERROR, "Init semantic model failed", e);
						}

						session.addSemanticResource(semanticModelURI, monitor);
						session.save(monitor);
					}
				});
	}

	private void importSemanticModel(final Session session, final String semanticModelPath,
			final IProgressMonitor monitor, edtproject.Steps edtProject) {
		session.getTransactionalEditingDomain().getCommandStack()
				.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
					@Override
					protected void doExecute() {

						final URI semanticModelURI = URI.createPlatformResourceURI(semanticModelPath, true);
						Resource res = new ResourceSetImpl().createResource(semanticModelURI);

						if (edtProject != null) {
							res.getContents().add(edtProject);
						}
						Map<String, Object> saveOptions = new HashMap<>();
						saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
						saveOptions.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);

						try {
							res.save(saveOptions);
						} catch (IOException e) {
							EcoadtUiActivator.log(IStatus.ERROR, "Init semantic model failed", e);
						}

						session.addSemanticResource(semanticModelURI, monitor);

						session.save(monitor);
					}
				});
	}

	/**
	 *
	 * Enable the viewpoint in aird
	 * 
	 * @param session              : the current Sirius session
	 * @param viewpointsToActivate : the viewpoints to be enabled
	 */

	public static void enableViewpoints(final Session session, final String... viewpointsToActivate) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback callback = new ViewpointSelectionCallback();

							for (Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
								for (String viewpoint : viewpointsToActivate) {
									if (viewpoint.equals(vp.getName()))
										callback.selectViewpoint(vp, session, new NullProgressMonitor());
								}
							}
						}
					});
		}
	}

	/**
	 *
	 * Disable the viewpoint in aird
	 * 
	 * @param session             : the current Sirius session
	 * @param viewpointsToDisable : the viewpoints to be disabled
	 */

	public static void disableViewpoints(final Session session, final String... viewpointsToDisable) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
					.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
						@Override
						protected void doExecute() {
							ViewpointSelectionCallback callback = new ViewpointSelectionCallback();

							for (Viewpoint vp : ViewpointRegistry.getInstance().getViewpoints()) {
								for (String viewpoint : viewpointsToDisable) {
									if (viewpoint.equals(vp.getName()))
										callback.deselectViewpoint(vp, session, new NullProgressMonitor());
								}
							}
						}
					});
		}
	}

	/**
	 *
	 * Check if the given viewpoint is enable
	 * 
	 * @param session          : the current Sirius session
	 * @param viewpointToCheck : the viewpoints to be checked
	 * @return the state of the tested viewpoint
	 */

	public static boolean isViewpointEnabled(final Session session, final String viewpointToCheck) {
		if (session != null) {
			for (Viewpoint vp : session.getSelectedViewpoints(false)) {
				if (viewpointToCheck.equals(vp.getName()))
					return true;
			}
		}
		return false;
	}

	/**
	 *
	 * Close the current project
	 * 
	 * @param monitor : given monitor
	 */

	public void closeProject(IProgressMonitor monitor) {
		monitor.subTask("Close project");
		closePropertyView();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for (IProject project : root.getProjects()) {
			try {
				project.close(monitor);
				project.delete(false, false, monitor);
				emptyWindowTitle();
				monitor.worked(25);
			} catch (CoreException e) {
				EcoadtUiActivator.log(IStatus.ERROR, "Close project failed", e);
			}
		}
	}

	/**
	 * Save all editors for the given project. Always prompt the user before saving.
	 * 
	 * @param project The project to be saved
	 * @param prompt  true to prompt the user before saving
	 */
	public void saveProject(IProject project, boolean prompt) {
		IDE.saveAllEditors(new IResource[] { project }, prompt);
	}

	/**
	 * Utility method to close the eclipse opened editors. Editor part are saved
	 * before they are closed. Must be called from a UI thread.
	 */
	public void closeOpenedEditors() {
		closeOpenedEditors(true);
	}

	/**
	 * Utility method to close the eclipse opened editors. Must be called from a UI
	 * thread.
	 * 
	 * @param save if true, save the editor part before saving it.
	 */
	public void closeOpenedEditors(boolean save) {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (IEditorReference editorRef : editorReferences) {
			IEditorPart editor = editorRef.getEditor(true);
			if (editor != null) {
				if (save) {
					editor.doSave(new NullProgressMonitor());
				}
				DialectUIManager.INSTANCE.closeEditor(editor, false);
			}
		}
	}

	public boolean isOpenedProjectDirty() {
		IWorkbenchWindow[] wbWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (IWorkbenchWindow iWorkbenchWindow : wbWindows) {
			IWorkbenchPage activePage = iWorkbenchWindow.getActivePage();
			IEditorReference[] editorRefs = activePage.getEditorReferences();
			for (IEditorReference editorRef : editorRefs) {
				if (editorRef.isDirty()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Returns true if the ecoa-exvt python module is installed
	 * 
	 * @return true if the ecoa-exvt python module is installed
	 */
	public boolean verifyExvtPresent() {
		ProcessBuilder builder = new ProcessBuilder("ecoa-exvt", "-h");
		// merge both standard error and standard output streams
		builder.redirectErrorStream(true);
		Process process;
		try {
			process = builder.start();
			int returnValue = process.waitFor();

			if (returnValue == 0) {
				return true;
			}
		} catch (IOException | InterruptedException e) {
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
		}
		return false;
	}

	/**
	 * Verify the project pointed by the given exportPath, calling the external
	 * process ecoa-exvt.
	 * 
	 * @param exportPath       path to the project file.
	 * @param verificationStep The step for which to start the ecoa-exvt process
	 * @param logLevel         The ecoa-exvt desired log level
	 * @return -1 in case of ecoa-exvt reported error, or 0 to 5 to report the last
	 *         import step success.
	 */
	public int verifyProjectWithLogLevel(String exportPath, int verificationStep, int logLevel) {
		File projectFile = null;
		if (new File(exportPath).isFile() && exportPath.endsWith(".project.xml")) {
			projectFile = new File(exportPath);
		} else {
			var folder = new File(exportPath, ImportUtils.STEPS_SUBDIR);
			if (folder.exists() && folder.isDirectory()) {
				for (File file : folder.listFiles()) {
					if (file.isFile() && file.getName().endsWith("project.xml")) {
						projectFile = file;
						break;
					}
				}
			}
		}
		if (projectFile == null) {
			EDTLog.toFileAndConsole("Project file not found for export directory: " + exportPath);
			return -1;
		}

		int exvtStep = verificationStep;
		int lastExvtStepSuccess = -1;
		String lastLinesError = null;
		String lastLinesSuccess = null;
		try {
			lastLinesSuccess = verifyProjectToStep(projectFile, exvtStep, logLevel);
			lastExvtStepSuccess = exvtStep;
		} catch (VerifyProjectException e) {
			lastLinesError = e.getMessage();
		}
		if (lastLinesError != null) {
			EDTLog.toFileAndConsole("ecoa-exvt reported ERROR for level: " + exvtStep);
			EDTLog.toFileAndConsole(lastLinesError);
			return -1;
		}
		if (lastLinesSuccess != null) {
			EDTLog.toFileAndConsole("ecoa-exvt reported SUCCESS for level: " + lastExvtStepSuccess);
			EDTLog.toFileAndConsole(lastLinesSuccess);
		}

		return lastExvtStepSuccess;
	}

	/**
	 * Verify the project pointed by the given importPath, calling the external
	 * process ecoa-exvt.
	 * 
	 * @param importPath path to the project file.
	 * @param logLevel   The selected ecoa-exvt log level
	 * @return -1 in case of ecoa-exvt reported error, or 0 to 5 to report the last
	 *         import step success.
	 */
	public int verifyProjectWithLogLevel(String importPath, int logLevel) {
		File projectFile = null;
		if (new File(importPath).isFile() && importPath.endsWith(".project.xml")) {
			projectFile = new File(importPath);
		} else {
			var folder = new File(importPath, ImportUtils.STEPS_SUBDIR);
			if (folder.exists() && folder.isDirectory()) {
				for (File file : folder.listFiles()) {
					if (file.isFile() && file.getName().endsWith("project.xml")) {
						projectFile = file;
						break;
					}
				}
			}
		}
		if (projectFile == null) {
			EDTLog.toFileAndConsole("Project file not found for import directory: " + importPath);
			return -1;
		}

		int exvtStep = 0;
		int lastExvtStepSuccess = -1;
		String lastLinesError = null;
		String lastLinesSuccess = null;
		do {
			try {
				lastLinesSuccess = verifyProjectToStep(projectFile, exvtStep, logLevel);
				lastExvtStepSuccess = exvtStep;
			} catch (VerifyProjectException e) {
				lastLinesError = e.getMessage();
				break;
			}
			exvtStep++;
		} while (exvtStep <= 5);
		if (lastLinesSuccess != null) {
			EDTLog.toFileAndConsole("ecoa-exvt reported SUCCESS for level: " + lastExvtStepSuccess);
			EDTLog.toFileAndConsole(lastLinesSuccess);
		}
		if (lastLinesError != null) {
			EDTLog.toFileAndConsole("ecoa-exvt reported ERROR for level: " + exvtStep);
			EDTLog.toFileAndConsole(lastLinesError);
		}
		return lastExvtStepSuccess;
	}

	/**
	 *
	 * Log in file and console the missing elements
	 * 
	 * @param missingElements : the missing elements to be displayed
	 */

	public void logMissingElements(StringBuilder missingElements) {
		EDTLog.toFileAndConsole(missingElements.toString());
	}

	private String verifyProjectToStep(File projectFile, int importStep, int logLevel) throws VerifyProjectException {

		if (!(importStep >= 0 && importStep <= 5)) {
			throw new IllegalArgumentException("importStep parameter must be between 0 and 5 included");
		}

		if (!(logLevel >= 0 && logLevel <= 4)) {
			throw new IllegalArgumentException("logLevel parameter must be between 0 and 4 included");
		}

		ProcessBuilder builder = new ProcessBuilder("ecoa-exvt", "-p", projectFile.getAbsolutePath(), "-l",
				String.valueOf(importStep), "-v", String.valueOf(logLevel));
		// merge both standard error and standard output streams
		builder.redirectErrorStream(true);
		Process process;
		try {
			File redirectOutput = Files.createTempFile("ecoa-ext", "immport").toFile();
			builder.redirectOutput(redirectOutput);
			process = builder.start();
			int returnValue = process.waitFor();
			String lines = Files.readString(redirectOutput.toPath());
			redirectOutput.delete();

			if (returnValue < 0 || returnValue > 0) {
				throw new VerifyProjectException(lines);
			} else {
				return lines;
			}
		} catch (IOException | InterruptedException e) {
			String lines = "Exception during 'ecoa-exvt' processing: " + e.getMessage();
			if (e instanceof InterruptedException) {
				Thread.currentThread().interrupt();
			}
			throw new VerifyProjectException(lines);
		}
	}

	/**
	 * Close property view.
	 */
	public static void closePropertyView() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(() -> {
			// Get current page
			IWorkbenchPage wp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			if (wp != null) {
				// Find desired view :
				IViewPart myView = wp.findView(PROPERTY_VIEW_ID);

				// Hide the view :
				if (myView != null) {
					wp.hideView(myView);
				}
			}
		});
	}

	/**
	 * Open property view.
	 */
	public static void openPropertyView() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(() -> {
			IWorkbenchPage wp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			if (wp != null) {
				try {
					wp.showView(PROPERTY_VIEW_ID);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Verify the project exception
	 */

	public static class VerifyProjectException extends Exception {

		private static final long serialVersionUID = 1L;

		/**
		 *
		 * Verify the project exception
		 * 
		 * @param errorMessage : the error message to be displayed
		 * @param err          : the error
		 */

		public VerifyProjectException(String errorMessage, Throwable err) {
			super(errorMessage, err);
		}

		/**
		 *
		 * Verify the project exception
		 * 
		 * @param errorMessage : the error message to be displayed
		 */

		public VerifyProjectException(String errorMessage) {
			super(errorMessage);
		}
	}
}
