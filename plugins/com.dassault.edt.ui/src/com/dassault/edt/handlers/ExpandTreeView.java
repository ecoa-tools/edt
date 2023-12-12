/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import javax.inject.Named;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.tools.api.command.SiriusCommand;
import org.eclipse.sirius.tree.DTreeItem;
import org.eclipse.sirius.tree.business.api.command.DTreeItemExpansionChangeCommand;
import org.eclipse.sirius.tree.business.internal.dialect.common.tree.TreeRefreshContext;
import org.eclipse.sirius.tree.business.internal.dialect.common.viewpoint.GlobalContext;
import org.eclipse.sirius.tree.business.internal.helper.RefreshTreeElementTask;
import org.eclipse.sirius.tree.tools.internal.Messages;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

/**
 * Class to manage enambling/disabling of graphicalErrorDisplay
 *
 */
public class ExpandTreeView {

	private EcoadtServices service = new EcoadtServices();

	/**
	 * Assert if graphical error display is enabled
	 * 
	 * @return true if tree view opened
	 */
	@CanExecute
	public boolean canExecute() {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (IEditorReference editorRef : editorReferences) {
			IEditorPart editor = editorRef.getEditor(true);
			if (editor.getTitle().contains("Tree View"))
				return true;
		}
		return false;
	}

	/**
	 * Toggle option
	 * 
	 * @param shell : shell
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
//		Get all Representations 
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE
				.getAllRepresentations(service.getSession());

//		Iterate on them
		Iterator<DRepresentation> iterator = allRepresentations.iterator();
		while (iterator.hasNext()) {
			DRepresentation dRepresentation = iterator.next();

//			Search for DRepresentation with correct name
			if (Objects.equals(dRepresentation.getName(), "Tree View")) {
//				Open editor of DRepresentation
				DialectUIManager.INSTANCE.openEditor(service.getSession(), dRepresentation, new NullProgressMonitor());
				EList<DRepresentationElement> representationElements = dRepresentation.getOwnedRepresentationElements();
				for (DRepresentationElement dRepresentationElement : representationElements) {
					String name = dRepresentationElement.getName();
					if (dRepresentationElement instanceof DTreeItem dt) {
						expandDTreeItem(dt);
						expandNode(dRepresentation, dt);
					}
					EDTLog.toConsole(name + " is expanded");
				}
				service.getSession().save(new NullProgressMonitor());
				return;
			}
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
