/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.tools.api.command.SiriusCommand;
import org.eclipse.sirius.tree.DTreeItem;
import org.eclipse.sirius.tree.business.api.command.DTreeItemExpansionChangeCommand;
import org.eclipse.sirius.tree.business.internal.dialect.common.tree.TreeRefreshContext;
import org.eclipse.sirius.tree.business.internal.dialect.common.viewpoint.GlobalContext;
import org.eclipse.sirius.tree.business.internal.helper.RefreshTreeElementTask;
import org.eclipse.sirius.tree.tools.internal.Messages;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

import edtimplementation.ComponentImplementation;
import edtimplementation.OperationInheritingFromMT;
import edtimplementation.OperationInheritingFromSD;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.ServRefOfLinkedComponentDefinition;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.Step;
import edtproject.Steps;

/**
 * Functions used to find objects of a View in another view
 * 
 *
 */
public class EcoaDtServicesDisplay {
	private EcoadtServices service = new EcoadtServices();

	/**
	 * Select corresponding ComponentDefinition Service of Service implemented
	 * 
	 * @param eObject : Service or Reference implemented in ComponentImplementation
	 * @return self
	 */
	public EObject findComponentDefinitionServRefInTreeView(EObject eObject) {
		if (eObject instanceof ServiceOfLinkedComponentDefinition serv) {
			findInTreeView(serv.getComponentDefinitionServiceLink());
		} else if (eObject instanceof ReferenceOfLinkedComponentDefinition ref) {
			findInTreeView(ref.getComponentDefinitionReferenceLink());
		}
		return eObject;
	}

	/**
	 * Select corresponding ServiceDefinition of Service implemented
	 * 
	 * @param eObject : Service or Reference implemented in ComponentImplementation
	 * @return self
	 */
	public EObject findServiceDefinitionInTreeView(EObject eObject) {
		if (eObject instanceof ServRefOfLinkedComponentDefinition serv) {
			findInTreeView(serv.getServiceDefinitionLink());
		}
		return eObject;
	}

	/**
	 * Select corresponding ServiceDefinition Operation of ModuleInstance of
	 * Implemented Service
	 * 
	 * @param eObject : Operation of Service implemented or ModuleInstance
	 * @return self
	 */
	public EObject findDefiningOperationInTreeView(EObject eObject) {
		if (eObject instanceof OperationInheritingFromMT op) {
			findInTreeView(op.getMTOperationRef());
		} else if (eObject instanceof OperationInheritingFromSD op) {
			findInTreeView(op.getSDOperationRef());
		}
		return eObject;
	}

	/**
	 * From semantic object (graphical view) select its equivalent representation in
	 * tree view
	 * 
	 * @param eObject : object to find
	 * @return self
	 */
	public EObject findInTreeView(EObject eObject) {
//		Find Tree View
		DRepresentation dRepresentation = findAndOpenView("Tree View");
		if (dRepresentation != null) {
//			Get editor
			DialectEditor editor = SessionUIManager.INSTANCE.getUISession(service.getSession())
					.getEditor(dRepresentation);

//			Find object in Tree View
			EList<DRepresentationElement> findInRepresentation = findInTreeByExpanding(eObject, dRepresentation, false);

//			If not found ==> error message
			if (findInRepresentation == null || findInRepresentation.isEmpty()) {
				EDTLog.toPopUpAndConsole("The object was not found in the Tree View", "");

//			If found, select only non-descriptive elements. All descriptive nodes have "Description" in their names 
			} else {
				EList<DRepresentationElement> findNotDescription = new BasicEList<>();
				for (DRepresentationElement dRepresentationElement : findInRepresentation) {
					String mapping = dRepresentationElement.getMapping().getName();
					if (!mapping.contains("Description")) {
						expandAncestors(dRepresentationElement);
						if (dRepresentationElement instanceof DTreeItem dt && !dt.isExpanded()) {
							expandDTreeItem(dt);

						}
						findNotDescription.add(dRepresentationElement);
					}
				}
				DialectUIManager.INSTANCE.setSelection(editor, findNotDescription);
			}
		} else {
			EDTLog.toPopUpAndConsole("No Representation with the name Tree View was found", "");
		}
		return eObject;
	}

	/**
	 * @param dRepresentationElement
	 */
	protected void expandAncestors(DRepresentationElement dRepresentationElement) {
		EObject dtContainer = dRepresentationElement.eContainer();
		while (dtContainer instanceof DTreeItem dtParent) {
			if (!dtParent.isExpanded()) {
				expandDTreeItem(dtParent);
			}
			dtContainer = dtParent.eContainer();
		}
	}

	/***
	 * Find EObject in DRepresentation
	 * 
	 * @param eObject         : object to find
	 * @param dRepresentation : representation that should contain object
	 * 
	 *                        return list of DRepresentationElement that correspond
	 *                        to the eObject
	 */
	private EList<DRepresentationElement> findInRepresentation(EObject eObject, DRepresentation dRepresentation) {
		EList<DRepresentationElement> findings = new BasicEList<>();

//		Get all elements represented
		EList<DRepresentationElement> representationElements = dRepresentation.getRepresentationElements();
		for (DRepresentationElement dRepresentationElement : representationElements) {

//			Add to list only DRepresentationElement that target EObject
			if (Objects.equals(dRepresentationElement.getTarget(), eObject)) {
				findings.add(dRepresentationElement);
			}
		}
		return findings;
	}

	private EList<DRepresentationElement> findInTreeByExpanding(EObject eObject, DRepresentation dRepresentation,
			boolean expand) {

		EList<DRepresentationElement> findInRepresentation = findInRepresentation(eObject, dRepresentation);
//		DTreeItem already visible
		if (!findInRepresentation.isEmpty()) {
			for (DRepresentationElement dRepresentationElement : findInRepresentation) {
				expandAncestors(dRepresentationElement);

				return findInRepresentation;
			}
//			DTreeItem not yet visible ==> searching for Container DTreeItem
		} else if (eObject.eContainer() != null) {
			EList<DRepresentationElement> findEContainerInRepresentation = findInTreeByExpanding(eObject.eContainer(),
					dRepresentation, true);
//			Container DTreeItem Container found
			if (!findEContainerInRepresentation.isEmpty()) {
				for (DRepresentationElement dRepresentationElement : findEContainerInRepresentation) {
					if (dRepresentationElement.eContainer() instanceof DTreeItem dtContainer
							&& !dtContainer.isExpanded()) {
						expandDTreeItem(dtContainer);
					}
					if (expand && dRepresentationElement instanceof DTreeItem dt && !dt.isExpanded()) {
						expandDTreeItem(dt);

					}
				}
//				Search for true object
				EList<DRepresentationElement> findTrueObjectInRepresentation = findInRepresentation(eObject,
						dRepresentation);
//				True object found
				if (!findTrueObjectInRepresentation.isEmpty()) {
					return findTrueObjectInRepresentation;
//					True object not found, searching in children of DTreeItem
				} else {
					return searchingDTreeItemChildren(eObject, dRepresentation, findEContainerInRepresentation);
				}
//				Container DTreeItem not found, searching for container of container
			} else {
				return findInTreeByExpanding(eObject.eContainer(), dRepresentation, true);
			}
		}
		return null;
	}

	/**
	 * @param eObject
	 * @param dRepresentation
	 * @param findEContainerInRepresentation
	 * @return
	 */
	protected EList<DRepresentationElement> searchingDTreeItemChildren(EObject eObject, DRepresentation dRepresentation,
			EList<DRepresentationElement> findEContainerInRepresentation) {
		EList<DRepresentationElement> childrenDRepresentationElements = new BasicEList<>();
		for (DRepresentationElement dRepresentationElement : findEContainerInRepresentation) {
			if (dRepresentationElement instanceof DTreeItem dt) {
				if (dRepresentationElement.eContainer() instanceof DTreeItem dtContainer && !dtContainer.isExpanded()) {
					expandDTreeItem(dtContainer);
				}
				EList<DTreeItem> ownedTreeItems = dt.getOwnedTreeItems();
				childrenDRepresentationElements.addAll(ownedTreeItems);
				for (DTreeItem dRepresentationElementChildren : ownedTreeItems) {
					expandDTreeItem(dRepresentationElementChildren);

				}
			}
		}
		if (childrenDRepresentationElements.isEmpty()) {
			return null;
		}
		EList<DRepresentationElement> findInRepresentationChildren = findInRepresentation(eObject, dRepresentation);
		for (DRepresentationElement dRepresentationElement : findInRepresentationChildren) {
			if (dRepresentationElement.eContainer() instanceof DTreeItem dtContainer && !dtContainer.isExpanded()) {

				expandDTreeItem(dtContainer);

			}
			if (dRepresentationElement instanceof DTreeItem dt) {

				expandDTreeItem(dt);
			}
		}
		if (findInRepresentationChildren.isEmpty()) {
			return searchingDTreeItemChildren(eObject, dRepresentation, childrenDRepresentationElements);
		} else {
			DialectEditor editor = SessionUIManager.INSTANCE.getUISession(service.getSession())
					.getEditor(dRepresentation);
			DialectUIManager.INSTANCE.setSelection(editor, findInRepresentationChildren);

			return findInRepresentationChildren;
		}
	}

	/**
	 * Expand DTreeItem (Tree View Node)
	 * 
	 * @param dt : tree node
	 */
	protected void expandDTreeItem(DTreeItem dt) {
		/* Get TransactionalEditingDomain to launch command */
		TransactionalEditingDomain domain = service.getSession().getTransactionalEditingDomain();
		CommandStack commandStack = domain.getCommandStack();

		/* Need context */
		GlobalContext globalContext = new TreeRefreshContext(service.getSession().getModelAccessor(),
				service.getSession().getInterpreter(), service.getSession().getSemanticResources(),
				service.getSession().getTransactionalEditingDomain());

		/* Create Command */
		CompoundCommand expandDTreeItemCmd = new CompoundCommand(
				MessageFormat.format(Messages.DTreeItemExpansionChangeCommand_expandItem, dt.getName()));

		/* Add expand command */
		expandDTreeItemCmd.append(
				new DTreeItemExpansionChangeCommand(globalContext, domain, dt, new NullProgressMonitor(), true));

		/* Refresh command */
		SiriusCommand siriusCommand = new SiriusCommand(domain);
		siriusCommand.getTasks().add(new RefreshTreeElementTask(dt));
		expandDTreeItemCmd.append(siriusCommand);

		/* launch command */
		commandStack.execute(expandDTreeItemCmd);
	}

	/**
	 * Find representation and open it (graphical or tree view)
	 * 
	 * @param name : name of representation to find
	 * @return representation that is now open
	 */
	public DRepresentation findAndOpenView(String name) {

//		Get all Representations 
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE
				.getAllRepresentations(service.getSession());

//		Iterate on them
		Iterator<DRepresentation> iterator = allRepresentations.iterator();
		while (iterator.hasNext()) {
			DRepresentation dRepresentation = iterator.next();

//			Search for DRepresentation with correct name
			if (Objects.equals(dRepresentation.getName(), name)) {

//				Open editor of DRepresentation
				DialectUIManager.INSTANCE.openEditor(service.getSession(), dRepresentation, new NullProgressMonitor());
				return dRepresentation;
			}
		}
		return null;
	}

	/**
	 * From semantic object (tree view) find its equivalent representation in
	 * assembly view
	 * 
	 * @param eObject : object to find
	 * @return selection of object (return eObject to be able to use change context)
	 */
	public EObject findInAssembly(EObject eObject) {
		DRepresentation dRepresentation = findAndOpenView("Assembly Graphical View");
		if (dRepresentation != null) {
			DialectEditor editor = SessionUIManager.INSTANCE.getUISession(service.getSession())
					.getEditor(dRepresentation);
			EList<DRepresentationElement> findInRepresentation = findInRepresentation(eObject, dRepresentation);
			if (findInRepresentation.isEmpty()) {
				EDTLog.toPopUpAndConsole("The object was not found in the Assembly Graphical View", "");
			} else {
				DialectUIManager.INSTANCE.setSelection(editor, findInRepresentation);
			}
		} else {
			EDTLog.toPopUpAndConsole("No Representation with the name Assembly Graphical View was found", "");
		}
		return eObject;
	}

	/**
	 * From semantic object (tree view) find its equivalent representation in
	 * Logical and Deployment view
	 * 
	 * @param eObject : object to find
	 * @return selection of object (return eObject to be able to use change context)
	 */
	public EObject findInLogicalDeploymentView(EObject eObject) {
		DRepresentation dRepresentation = findAndOpenView("Logical System And Deployment Schema Graphical View");
		if (dRepresentation != null) {
			DialectEditor editor = SessionUIManager.INSTANCE.getUISession(service.getSession())
					.getEditor(dRepresentation);
			EList<DRepresentationElement> findInRepresentation = findInRepresentation(eObject, dRepresentation);
			if (findInRepresentation.isEmpty()) {
				EDTLog.toPopUpAndConsole(
						"The object was not found in the Logical System And Deployment Schema Graphical View", "");
			} else {
				DialectUIManager.INSTANCE.setSelection(editor, findInRepresentation);
			}
		} else {
			EDTLog.toPopUpAndConsole(
					"No Representation with the name Logical System And Deployment Schema Graphical View was found",
					"");
		}
		return eObject;
	}

	/**
	 * From semantic object (tree view) find its equivalent representation in
	 * component implementation view
	 * 
	 * @param eObject : object to find
	 * @return selection of object (return eObject to be able to use change context)
	 */
	public EObject findInComponentImplementationView(EObject eObject) {
		ComponentImplementation findComponentImplementationAncestor = findComponentImplementationAncestor(eObject);
		if (findComponentImplementationAncestor != null) {
			DRepresentation dRepresentation = findAndOpenView(
					findComponentImplementationAncestor.getName() + " Graphical View");
			if (dRepresentation != null) {
				DialectEditor editor = SessionUIManager.INSTANCE.getUISession(service.getSession())
						.getEditor(dRepresentation);
				EList<DRepresentationElement> findInRepresentation = findInRepresentation(eObject, dRepresentation);
				if (findInRepresentation.isEmpty()) {
					EDTLog.toPopUpAndConsole("The object was not found in the "
							+ findComponentImplementationAncestor.getName() + " Graphical View", "");
				} else {

					DialectUIManager.INSTANCE.setSelection(editor, findInRepresentation);
				}
			} else {
				EDTLog.toPopUpAndConsole("No Representation with the name "
						+ findComponentImplementationAncestor.getName() + " Graphical View was found", "");
			}
		} else

		{
			EDTLog.toPopUpAndConsole("The object does not seem to be part of a ComponentImplementation", "");

		}
		return eObject;
	}

	/**
	 * Find ComponentImplementation that contains object.
	 * 
	 * @param eObject : object to find in ComponentImplementation Graph
	 * @return ComponentImplement or null
	 */
	public ComponentImplementation findComponentImplementationAncestor(EObject eObject) {
		if (eObject instanceof ComponentImplementation cptImp) {
			return cptImp;
		} else if (eObject.eContainer() != null) {
			return findComponentImplementationAncestor(eObject.eContainer());
		}
		return null;
	}

	/**
	 * From semantic object (tree view) find its equivalent representation in
	 * assembly view
	 * 
	 * @param eObject : object to find
	 * @return selection of object (return eObject to be able to use change context)
	 */
	public EObject expandAll(EObject eObject) {
		DRepresentation dRepresentation = findAndOpenView("Tree View");
		if (dRepresentation != null) {
			Steps findStepsContainer = Steps.findStepsContainer(eObject);
			if (findStepsContainer != null) {
				EList<Step> step = findStepsContainer.getStep();
				for (Step step2 : step) {
					EList<DRepresentationElement> findInTreeByExpanding = findInRepresentation(step2, dRepresentation);
					for (DRepresentationElement dRepresentationElement : findInTreeByExpanding) {
						if (dRepresentationElement instanceof DTreeItem dt) {
							expandDTreeItem(dt);
							expandNode(dRepresentation, dt);
						}
					}

				}
			}
		} else {
			EDTLog.toPopUpAndConsole("No Representation with the name Assembly Graphical View was found", "");
		}
		return eObject;
	}

	/**
	 * @param dRepresentation
	 * @param findInTreeByExpanding
	 */
	protected void expandNode(DRepresentation dRepresentation, DTreeItem dt) {
		for (DRepresentationElement dRepresentationElement : dt.getOwnedTreeItems()) {
			if (dRepresentationElement instanceof DTreeItem dt2) {
				expandDTreeItem(dt2);
				EList<DTreeItem> ownedTreeItems = dt2.getOwnedTreeItems();
				for (DTreeItem dOwnedT : ownedTreeItems) {
					expandDTreeItem(dOwnedT);
					expandNode(dRepresentation, dOwnedT);
				}
			}
		}
	}
}
