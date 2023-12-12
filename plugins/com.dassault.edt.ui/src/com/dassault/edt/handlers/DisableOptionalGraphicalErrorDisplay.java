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
 * Class to manage disabling of graphical Error & Warning Display
 *
 */
public class DisableOptionalGraphicalErrorDisplay {

	private EcoadtServices service = new EcoadtServices();

	/**
	 * Assert if graphical error display is enabled
	 * 
	 * @return true if option enabled
	 */
	@CanExecute
	public boolean canExecute() {

		QualifiedName test = new QualifiedName("", "toggleGraphicalDisplayError");
		try {
			String persistentProperty = service.getWorkspaceProject().getPersistentProperty(test);
			if (persistentProperty == null) {
				service.getWorkspaceProject().setPersistentProperty(test, "NONE");
				return false;
			}
			return !(persistentProperty.equals("NONE"));
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
			if (!persistentProperty.equals("NONE")) {
				service.getWorkspaceProject().setPersistentProperty(test, "NONE");
				EDTLog.toConsole("Graphical Display Of Error And Warning Disabled");
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
