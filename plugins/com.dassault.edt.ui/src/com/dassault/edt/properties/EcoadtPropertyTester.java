/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.properties;

import org.eclipse.core.expressions.PropertyTester;

import com.dassault.edt.utils.EcoadtServices;

import edtproject.Steps;

/**
 * Property tester class for Ecoadt project.
 */
public class EcoadtPropertyTester extends PropertyTester {

	private EcoadtServices service = new EcoadtServices();

	/**
	 * Default constructor.
	 */
	public EcoadtPropertyTester() {
	}

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		Steps project = service.getEDTProject();
		if (project == null) {
			return false;
		}

		return "existProject".equals(property) && project != null;
	}
}
