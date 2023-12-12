/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.wizard;

import org.eclipse.swt.widgets.Display;

/**
 * Contains threading utils functions
 * 
 *
 */
public class SWTThreadingUtils {

	private static boolean fileProcessed = false;

	/**
	 * Wait for asynchronous executions to finish
	 * 
	 * @param display : The display which need an asynchronous execution
	 */
	public static void waitForAsyncExecsToFinish(Display display) {
		Object waitObj = new Object();

		display.asyncExec(new DummyRunnable(waitObj));
		while (!fileProcessed) {
			synchronized (waitObj) {
				try {
					waitObj.wait();

				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					throw new RuntimeException(e);
				}
			}
		}
	}

	private static class DummyRunnable implements Runnable {
		private Object waitObj;

		public DummyRunnable(Object waitObj) {
			this.waitObj = waitObj;
		}

		@Override
		public void run() {
			synchronized (waitObj) {
				waitObj.notifyAll();
			}
		}
	}

}
