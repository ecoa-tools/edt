/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.dassault.edt.utils.EcoadtServices;

import edtproject.Steps;
import edtproject.util.EDTProjectValidator;

/**
 * The activator class controls the plug-in life cycle
 */
public class EcoaDtDesignerPlugin extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "com.dassault.edt.design";

	// The shared instance
	private static EcoaDtDesignerPlugin plugin;

	private static Set<Viewpoint> viewpoints;

	/**
	 * The constructor
	 */
	public EcoaDtDesignerPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		viewpoints = new HashSet<Viewpoint>();
		viewpoints
				.addAll(ViewpointRegistry.getInstance().registerFromPlugin(PLUGIN_ID + "/description/ecoadt.odesign"));

		SessionListener sessionListener = new SessionListener() {

			@Override
			public void notify(int changeKind) {
				if (changeKind == SessionListener.SYNC) {
					EcoadtServices service = new EcoadtServices();
					Steps edtProject = service.getEDTProject();
					if (edtProject != null) {
						EDTProjectValidator.checkSteps(edtProject);
					}

				}

			}
		};
		EcoadtServices service = new EcoadtServices();
		service.getSession().addListener(sessionListener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		if (viewpoints != null) {
			for (final Viewpoint viewpoint : viewpoints) {
				ViewpointRegistry.getInstance().disposeFromPlugin(viewpoint);
			}
			viewpoints.clear();
			viewpoints = null;
		}
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EcoaDtDesignerPlugin getDefault() {
		return plugin;
	}
}
