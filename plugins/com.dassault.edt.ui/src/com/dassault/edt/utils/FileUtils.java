/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.utils;

import java.io.File;

/**
 * Utility class for File operations.
 */
public class FileUtils {
	/**
	 * Delete a File, delete content recursively if it is a directory.
	 * 
	 * @param file the File to delete
	 * @return true if the given File is successfully deleted
	 */
	public static boolean deleteDirectory(File file) {
		File[] allContents = file.listFiles();
		if (allContents != null) {
			for (File content : allContents) {
				deleteDirectory(content);
			}
		}
		return file.delete();
	}

}
