/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.log;

import java.io.IOException;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

/**
 * Logger class for EDT.
 *
 */
public class EDTLog {

	private static final Logger logger = Logger.getLogger("com.dassault.edt");
	private static final String EDT_CONSOLE_NAME = "Console EDT";
	private static MessageConsole edtConsole = null;

	private EDTLog() {
		throw new IllegalStateException("Utility class");
	}

	private static final MessageConsole findEDTConsole() {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (Objects.equals(EDT_CONSOLE_NAME, existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(EDT_CONSOLE_NAME, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

	/**
	 * This methods logs a message in the log file and in the EDT Console.
	 * 
	 * @param message message logged.
	 */
	public static void toFileAndConsole(String message) {
		toConsole(message);
		logger.info(message);
	}

	/**
	 * This methods logs a message in the log file.
	 * 
	 * @param message message logged.
	 */
	public static void toFile(String message) {
		logger.info(message);
	}

	/**
	 * This methods logs a message in EDT Console.
	 * 
	 * @param longMessage message logged.
	 */
	public static void toConsole(String longMessage) {
		if (edtConsole == null) {
			edtConsole = findEDTConsole();
		}
		MessageConsoleStream out = edtConsole.newMessageStream();
		out.println(longMessage);
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This methods logs a "separation" message in EDT Console. Call this method
	 * after you finish logging a method's action, to create a separation between
	 * your message and the next one.
	 * 
	 */
	public static void toConsoleSeparationLine() {
		toConsole("--");
	}

	/**
	 * This methods logs a message in a pop-up.
	 * 
	 * @param shortMessage message logged.
	 */
	public static void displayPopUp(String shortMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				Display display = Display.getCurrent();
				Shell shell = new Shell(display);
				MessageBox mb = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
				mb.setMessage(shortMessage);
				mb.open();
			}
		});
	}

	/**
	 * This methods logs messages in a pop-up and in EDT Console.
	 * 
	 * @param shortMessage displayed in EDT console and in a pop-up.
	 * @param longMessage  displayed in EDT console.
	 */
	public static void toPopUpAndConsole(String shortMessage, String longMessage) {
		toConsole("\n" + shortMessage);
		toConsole("\n" + longMessage);
		toConsoleSeparationLine();
		displayPopUp(shortMessage);
	}
}
