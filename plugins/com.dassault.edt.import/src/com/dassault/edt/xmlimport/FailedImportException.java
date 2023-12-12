/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.xmlimport;

/**
 * Exception thrown in case of failed import
 * 
 */
@SuppressWarnings("serial")
public class FailedImportException extends Exception {

	/**
	 * Constructor when exception caught
	 * 
	 * @param errorMessage : message describing the cause of error
	 * @param err          : exception caught to be displayed also
	 */
	public FailedImportException(String errorMessage, Throwable err) {
		super(errorMessage + "\nCaused by :" + err.getMessage(), err);
	}

	/**
	 * Constructor when no exception caught
	 * 
	 * @param errorMessage : message describing the cause of error
	 */
	public FailedImportException(String errorMessage) {
		super(errorMessage);
	}
}
