/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

/**
 * Handler for the license text.
 *
 */
public class LicenseHandler {

	/**
	 * Method to execute.
	 * 
	 * @param shell the active shell.
	 */
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		String licenceText = "Copyright 2023 Dassault Aviation" + System.lineSeparator() + System.lineSeparator()
				+ "Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the \"Software\"), "
				+ "to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, "
				+ "and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:"
				+ System.lineSeparator() + System.lineSeparator()
				+ "The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software."
				+ System.lineSeparator() + System.lineSeparator()
				+ "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, "
				+ "FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, "
				+ "WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.";

		MessageDialog.openInformation(shell, "MIT License", licenceText);
	}

}
