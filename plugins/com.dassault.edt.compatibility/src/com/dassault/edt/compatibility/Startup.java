/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.compatibility;

import org.eclipse.ui.IStartup;

import com.dassault.edt.log.EDTLog;

/**
 * Start up
 *
 */
public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		EDTLog.toConsole("Welcome to ECOA Design Tool!");
		EDTLog.toConsoleSeparationLine();
	}

}
