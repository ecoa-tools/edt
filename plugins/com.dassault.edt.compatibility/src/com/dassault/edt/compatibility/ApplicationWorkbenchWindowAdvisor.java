/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.compatibility;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.dassault.edt.utils.EcoadtServices;
import com.dassault.edt.utils.ProjectServices;
import com.dassault.edt.utils.WorkbenchWindowConfigurer;

/**
 * Specialization of an Eclipse class to pass to the ApplicationWorkbenchAdvisor
 * class. 
*
* Copyright (c) 2023 Dassault Aviation 
* 
* SPDX-License-Identifier: MIT

 *
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	/**
	 * Constructor.
	 * 
	 * @param configurer configurer
	 */
	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	@Override
	public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	@Override
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(1024, 768));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(false);
		WorkbenchWindowConfigurer.set(configurer);
		configurer.setTitle(ProjectServices.EDT_WINDOW_DEFAULT_NAME);
	}

	@Override
	public void postWindowOpen() {
		super.postWindowOpen();

		IWorkbenchWindowConfigurer workbenchWindowConfigurer = getWindowConfigurer();
		IActionBarConfigurer actionBarConfigurer = workbenchWindowConfigurer.getActionBarConfigurer();
		IMenuManager menuManager = actionBarConfigurer.getMenuManager();

		IContributionItem[] menuItems = menuManager.getItems();
		for (int i = 0; i < menuItems.length; i++) {
			IContributionItem menuItem = menuItems[i];

			// Hack to remove the Run menu - it seems you cannot do this using
			// the "org.eclipse.ui.activities" extension
			if ("org.eclipse.ui.run".equals(menuItem.getId()) || "org.eclipse.search.menu".equals(menuItem.getId())
					|| "org.eclipse.pde.ui.productEditor".equals(menuItem.getId())
					|| "org.eclipse.search.OpenSearchDialogPage".equals(menuItem.getId())) {
				menuManager.remove(menuItem);
			}
		}

		menuManager.update(true);

		EcoadtServices ecoadtServices = new EcoadtServices();
		IProject project = ecoadtServices.getWorkspaceProject();
		if (project != null) {
			workbenchWindowConfigurer.setTitle(new ProjectServices().getEDTWindowName(project.getName()));
		}
	}
}
