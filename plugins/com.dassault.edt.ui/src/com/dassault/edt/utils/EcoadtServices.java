/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import edtimplementation.ComponentImplementation;
import edtlogical.LogicalSystem;
import edtproject.Composite;
import edtproject.EDTProjectFactory;
import edtproject.FinalAssembly;
import edtproject.Step3;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;
import edttype.util.EDTTypeDefaultCreator;

/**
 * ECOA DT project related utility class.
 */
public class EcoadtServices {

	public static final String ASSEMBLY_GRAPH_NAME = "Assembly Graphical View";
	public static final String LOGICAL_SYSTEM_GRAPH_NAME = "Logical System And Deployment Schema Graphical View";
	public static final String COMPONENT_IMPLEMENTATION_NAME = " Graphical View";
	public static final String TREE_NAME = "Tree View";

	public IProject getWorkspaceProject() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		if (projects.length > 0) {
			return projects[0];
		}
		return null;
	}

	public Session getSession() {
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
		if (!sessions.isEmpty()) {
			return (Session) sessions.toArray()[0];
		}
		return null;
	}

	public Steps getEDTProject() {
		Session session = getSession();
		if (session == null) {
			return null;
		}
		Collection<Resource> resources = session.getSemanticResources();
		if (resources.isEmpty()) {
			return null;
		}
		Resource resource = (Resource) resources.toArray()[0];

		List<EObject> contents = resource.getContents();
		if (contents == null || contents.isEmpty()) {
			return null;
		}
		if (contents.get(0) instanceof Steps steps) {
			return steps;
		}
		return null;
	}

	/**
	 *
	 * Create the composite graphical view
	 * 
	 * @param session : the current Sirius session
	 */

	public void createCompositeGraphicalView(final Session session) {

		Composite composite = getExistingComposite(session);
		if (composite != null) {
			TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(composite);
			transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {

				@Override
				protected void doExecute() {
					Collection<RepresentationDescription> descs = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), composite);
					for (RepresentationDescription desc : descs) {
						if (DialectManager.INSTANCE.canCreate(composite, desc)) {
							DialectManager.INSTANCE.createRepresentation(ASSEMBLY_GRAPH_NAME, composite, desc, session,
									new NullProgressMonitor());
//							session.save(new NullProgressMonitor());
							final IWorkbench workbench = PlatformUI.getWorkbench();
							final Display display = workbench.getDisplay();
							display.syncExec(() -> {
								IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
										.getPages();
								for (IWorkbenchPage representationDescription : pages) {
									IEditorReference[] editorReferences = representationDescription
											.getEditorReferences();
									for (IEditorReference representationDescription2 : editorReferences) {
										if (Objects.equals(ASSEMBLY_GRAPH_NAME, representationDescription2.getName())) {
											DiagramEditPart diagramEditPart = null;
											IEditorPart editor = representationDescription2.getEditor(false);
											if (editor instanceof DiagramEditor) {
												DiagramEditor diagramEditor = (DiagramEditor) editor;
												diagramEditPart = diagramEditor.getDiagramEditPart();

												ArrangeRequest arrangeRequest = new ArrangeRequest(
														ActionIds.ACTION_ARRANGE_ALL);
												ArrayList<Object> partsToArrange = new ArrayList<Object>(1);
												partsToArrange.add(diagramEditPart);
												arrangeRequest.setPartsToArrange(partsToArrange);
												diagramEditPart.performRequest(arrangeRequest);
											}
										}
									}
								}
							});
//							getSession().save(new NullProgressMonitor());
						}
					}
				}
			});
		}
	}

	/**
	 *
	 * Create the Logical System and Deployment Schema graphical view
	 * 
	 * @param session : the current Sirius session
	 */

	public void createLogicalSystemGraphicalView(final Session session) {

		LogicalSystem logicalSystem = getExistingLogicalSystem(session);
		if (logicalSystem != null) {
			TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(logicalSystem);
			transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {

				@Override
				protected void doExecute() {
					Collection<RepresentationDescription> descs = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false),
									logicalSystem);
					for (RepresentationDescription desc : descs) {
						if (DialectManager.INSTANCE.canCreate(logicalSystem, desc)) {
							DialectManager.INSTANCE.createRepresentation(LOGICAL_SYSTEM_GRAPH_NAME, logicalSystem, desc,
									session, new NullProgressMonitor());
//							session.save(new NullProgressMonitor());
							final IWorkbench workbench = PlatformUI.getWorkbench();
							final Display display = workbench.getDisplay();
							display.syncExec(() -> {
								IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
										.getPages();
								for (IWorkbenchPage representationDescription : pages) {
									IEditorReference[] editorReferences = representationDescription
											.getEditorReferences();
									for (IEditorReference representationDescription2 : editorReferences) {
										if (Objects.equals(LOGICAL_SYSTEM_GRAPH_NAME,
												representationDescription2.getName())) {
											DiagramEditPart diagramEditPart = null;
											IEditorPart editor = representationDescription2.getEditor(false);
											if (editor instanceof DiagramEditor) {
												DiagramEditor diagramEditor = (DiagramEditor) editor;
												diagramEditPart = diagramEditor.getDiagramEditPart();

												ArrangeRequest arrangeRequest = new ArrangeRequest(
														ActionIds.ACTION_ARRANGE_ALL);
												ArrayList<Object> partsToArrange = new ArrayList<Object>(1);
												partsToArrange.add(diagramEditPart);
												arrangeRequest.setPartsToArrange(partsToArrange);
												diagramEditPart.performRequest(arrangeRequest);
											}
										}
									}
								}
							});
//							getSession().save(new NullProgressMonitor());
						}
					}
				}
			});
		}

	}

	/**
	 *
	 * Create the component implementation graphical view
	 * 
	 * @param session : the current Sirius session
	 */

	public void createComponentImplementationGraphicalView(final Session session) {

		EList<ComponentImplementation> componentImplementations = getExistingComponentImplementations(session);
		if (componentImplementations != null && !componentImplementations.isEmpty()) {
			for (int i = 0; i < componentImplementations.size(); i++) {
				ComponentImplementation current = componentImplementations.get(i);
				createComponentImplementationDiagram(current);
			}
		}
	}

	/**
	 * Create ComponentImplementationDiagram
	 * 
	 * @param current : current ComponentImplementation
	 */
	public void createComponentImplementationDiagram(ComponentImplementation current) {
		TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(current);
		transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {

			@Override
			protected void doExecute() {
				Collection<RepresentationDescription> descs = DialectManager.INSTANCE
						.getAvailableRepresentationDescriptions(getSession().getSelectedViewpoints(false), current);
				for (RepresentationDescription desc : descs) {
					if (DialectManager.INSTANCE.canCreate(current, desc)) {
						DialectManager.INSTANCE.createRepresentation(current.getName() + COMPONENT_IMPLEMENTATION_NAME,
								current, desc, getSession(), new NullProgressMonitor());
//						getSession().save(new NullProgressMonitor());
						final IWorkbench workbench = PlatformUI.getWorkbench();
						final Display display = workbench.getDisplay();
						display.syncExec(() -> {
							IWorkbenchPage[] pages = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPages();
							for (IWorkbenchPage representationDescription : pages) {
								IEditorReference[] editorReferences = representationDescription.getEditorReferences();
								for (IEditorReference representationDescription2 : editorReferences) {
									if (Objects.equals(current.getName() + COMPONENT_IMPLEMENTATION_NAME,
											representationDescription2.getName())) {
										DiagramEditPart diagramEditPart = null;
										IEditorPart editor = representationDescription2.getEditor(false);
										if (editor instanceof DiagramEditor) {
											DiagramEditor diagramEditor = (DiagramEditor) editor;
											diagramEditPart = diagramEditor.getDiagramEditPart();

											ArrangeRequest arrangeRequest = new ArrangeRequest(
													ActionIds.ACTION_ARRANGE_ALL);
											ArrayList<Object> partsToArrange = new ArrayList<Object>(1);
											partsToArrange.add(diagramEditPart);
											arrangeRequest.setPartsToArrange(partsToArrange);
											diagramEditPart.performRequest(arrangeRequest);
										}
									}
								}
							}
						});
//						getSession().save(new NullProgressMonitor());
					}
				}
			}
		});
	}

	/**
	 *
	 * Create the tree view
	 * 
	 * @param session : the current Sirius session
	 */

	public void createTreeView(final Session session) {
		Steps steps = getSteps(session);
		if (steps != null) {
			TransactionalEditingDomain transactionalEditingDomain = TransactionUtil.getEditingDomain(steps);
			transactionalEditingDomain.getCommandStack().execute(new RecordingCommand(transactionalEditingDomain) {

				@Override
				protected void doExecute() {
					Collection<RepresentationDescription> descs = DialectManager.INSTANCE
							.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), steps);
					for (RepresentationDescription desc : descs) {
						if (DialectManager.INSTANCE.canCreate(steps, desc)) {
							DialectManager.INSTANCE.createRepresentation(TREE_NAME, steps, desc, session,
									new NullProgressMonitor());
//							session.save(new NullProgressMonitor());
						}
					}
				}
			});
		}
	}

	/**
	 *
	 * Get the existing composite in the model
	 * 
	 * @param session : the current Sirius session
	 * @return the existing composite
	 */

	public Composite getExistingComposite(final Session session) {
		XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) session.getSemanticResources().iterator().next();
		return ((Step3) ((Steps) xmiressourceImpl.getContents().get(0)).getStep().get(3)).getInitialAssembly();
	}

	/**
	 *
	 * Get the existing Logical System in the model
	 * 
	 * @param session : The current
	 * @return LogicalSystem
	 */

	public LogicalSystem getExistingLogicalSystem(final Session session) {
		XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) session.getSemanticResources().iterator().next();
		return ((Step5) ((Steps) xmiressourceImpl.getContents().get(0)).getStep().get(5)).getLogicalSystem();
	}

	/**
	 * Get the existing ComponentImplementation in the model
	 * 
	 * @param session : current session
	 * @return : list of ComponentImplementations
	 */
	public EList<ComponentImplementation> getExistingComponentImplementations(final Session session) {
		XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) session.getSemanticResources().iterator().next();
		return ((Step4) ((Steps) xmiressourceImpl.getContents().get(0)).getStep().get(4)).getComponentImplementations();
	}

	/**
	 * Get the existing Steps root element in the model
	 * 
	 * @param session : current session
	 * @return : root element
	 */
	public Steps getSteps(final Session session) {
		XMIResourceImpl xmiressourceImpl = (XMIResourceImpl) session.getSemanticResources().iterator().next();
		return (Steps) xmiressourceImpl.getContents().get(0);
	}

	public boolean isProjectOpened() {
		return getWorkspaceProject() != null;
	}

	/**
	 * Find diagram by name
	 * 
	 * @param session     : current session
	 * @param diagramName : name of diagram to find
	 * @return diagram found
	 */
	public DRepresentation getDiagram(Session session, String diagramName) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getAllRepresentations(session);
		DRepresentation diagram = null;
		for (DRepresentation representation : representations) {
			if (diagramName.equals(representation.getName())) {
				diagram = representation;
			}
		}
		return diagram;
	}

	/**
	 * Creation the EDTProject structure The name of the folders are fixed
	 * 
	 * @return the EDTProject
	 */
	public static Steps createEDTProject() {
		// Get Factory instance to instantiate all the objects
		EDTProjectFactory einstance = edtproject.EDTProjectFactory.eINSTANCE;

		// Instantiate the steps
		var steps = einstance.createSteps();

		// Instantiate and the set the different directories of the project
		var typesStep = einstance.createStep0();
		var serviceDefinitionStep = einstance.createStep1();
		var componentDefinitionStep = einstance.createStep2();
		var initialAssemblyStep = einstance.createStep3();
		var componentImplementationStep = einstance.createStep4();
		var integrationStep = einstance.createStep5();
		typesStep.setFolderName("0-Types");
		serviceDefinitionStep.setFolderName("1-Services");
		componentDefinitionStep.setFolderName("2-ComponentDefinitions");
		initialAssemblyStep.setFolderName("3-InitialAssembly");
		componentImplementationStep.setFolderName("4-ComponentImplementations");
		integrationStep.setFolderName("5-Integration");

		// Set BasicTypes
		typesStep.getBasicTypes().addAll(EDTTypeDefaultCreator.createBasicTypes());
		typesStep.getEcoaPredefinedTypes().addAll(EDTTypeDefaultCreator.createPredefinedTypes(typesStep));

		// Set Composite
		Composite composite = einstance.createComposite();
		composite.setName("Composite");
		composite.setTargetNamespace("http://www.ecoa.technology/default");
		initialAssemblyStep.setInitialAssembly(composite);

		FinalAssembly finalAssembly = einstance.createFinalAssembly();
		finalAssembly.setName("Composite");
		finalAssembly.setFinalAssembly(composite);
		integrationStep.setFinalAssembly(finalAssembly);

		// Add the steps
		steps.getStep().add(typesStep);
		steps.getStep().add(serviceDefinitionStep);
		steps.getStep().add(componentDefinitionStep);
		steps.getStep().add(initialAssemblyStep);
		steps.getStep().add(componentImplementationStep);
		steps.getStep().add(integrationStep);
		return steps;
	}

	public static IProject getCurrentSelectedProject() {
		IProject project = null;
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();

		ISelection selection = selectionService.getSelection();

		if (selection instanceof IStructuredSelection selectionCast) {
			Object element = selectionCast.getFirstElement();

			if (element instanceof IResource elementCast) {
				project = elementCast.getProject();
			}
		}
		return project;
	}
}
