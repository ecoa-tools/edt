/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import java.util.Collection;

import javax.inject.Named;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Shell;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.utils.EcoadtServices;

/**
 * Class to manage enabling of graphical Error+ Warning Display
 *
 */
public class EnableOptionalGraphicalWarningErrorDisplay {

	private static final String WARNING = "WARNING";
	private EcoadtServices service = new EcoadtServices();

	/**
	 * Assert if graphical error + warning display is enabled
	 * 
	 * @return true if option disabled
	 */
	@CanExecute
	public boolean canExecute() {

		QualifiedName test = new QualifiedName("", "toggleGraphicalDisplayError");
		try {
			String persistentProperty = service.getWorkspaceProject().getPersistentProperty(test);
			if (persistentProperty == null) {
				service.getWorkspaceProject().setPersistentProperty(test, "NONE");
				return true;
			}
			return !(persistentProperty.equals(WARNING));
		} catch (CoreException e) {
			e.printStackTrace();
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
		QualifiedName test = new QualifiedName("", "toggleGraphicalDisplayError");
		try {
			String persistentProperty = service.getWorkspaceProject().getPersistentProperty(test);
			if (!persistentProperty.equals(WARNING)) {
				service.getWorkspaceProject().setPersistentProperty(test, WARNING);
				EDTLog.toConsole("Graphical Display Of Error and Warnings Enabled");
				EDTLog.toConsoleSeparationLine();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		Collection<DRepresentation> rep = DialectManager.INSTANCE.getAllRepresentations(service.getSession());
		TransactionalEditingDomain domain = service.getSession().getTransactionalEditingDomain();
		final RefreshRepresentationsCommand refresh = new RefreshRepresentationsCommand(domain,
				new NullProgressMonitor(), rep);
		domain.getCommandStack().execute(refresh);
		service.getSession().save(new NullProgressMonitor());
	}
}
