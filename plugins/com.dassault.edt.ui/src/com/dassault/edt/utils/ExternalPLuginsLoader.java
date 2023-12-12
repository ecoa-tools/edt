/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

import com.dassault.edt.log.EDTLog;
import com.dassault.edt.menus.EcoadtUiActivator;

/**
 * Loader of external plugins
 *
 */
public enum ExternalPLuginsLoader {

	INSTANCE;

	private static char fileSeparator = File.separatorChar;
	private final String path2Plugins;
	private final String path2List;
	private final String path2Config;

	private ExternalPLuginsLoader() {
		String path = System.getProperty("user.home");
		path += File.separatorChar + "Ecoa";

		path2Plugins = path + File.separatorChar + "EDTPlugins" + File.separatorChar;
		path2List = path2Plugins + "plugins.ini";
		path2Config = path + File.separatorChar + "pluginsBind.ini";
	}

	/**
	 * This method lists the external plugins to load (if any) and loads them.
	 */
	public void register() {
		List<String> bundlesToLoad = new ArrayList<>();

		try {
			File f = new File(path2List);
			if (f.exists()) {
				List<String> allLines = Files.readAllLines(Path.of(f.getAbsolutePath()));
				for (String line : allLines) {
					addBundle(bundlesToLoad, path2Plugins, line.trim());
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Dynamic load of bundles
		TreeSet<String> loaded = new TreeSet<>();
		for (String file : bundlesToLoad) {
			// We have found a plug-in
			String child = getName(file);
			String pluginId = getShortName(child);
			String pluginVersion = "";
			int p = pluginId.lastIndexOf('_');
			if (p > 0) {
				pluginVersion = pluginId.substring(p + 1);
				pluginId = pluginId.substring(0, p);
			}

			if (loaded.contains(pluginId)) {
				EDTLog.toFile("Plugin already loaded : " + pluginId + " (" + getPath(file) + ")");
				continue;
			}

			final Bundle extBundle = loadAndActivateBundle(pluginId, pluginVersion, file);
			if (extBundle == null) {
				EDTLog.toFile("Can't load plugin:" + pluginId);
				continue;
			} else {
				EDTLog.toFile("External plugin loaded : " + pluginId);
				loaded.add(pluginId);
			}
		}
	}

	private void addBundle(List<String> bundlesToLoad, String pathPlugins, String prefix) {
		File root = new File(pathPlugins);
		if (!root.exists())
			return;
		File[] children = root.listFiles();
		if (children == null)
			return;
		File best = null;

		for (File file : children) {
			if (file.isFile()) {
				String name = file.getName();
				if (name.startsWith(prefix) && name.endsWith(".jar")) {
					if (best == null) {
						best = file;
					} else {
						if (best.lastModified() < file.lastModified()) {
							best = file;
						}
					}
				}
			}
		}

		if (best != null)
			bundlesToLoad.add(best.getAbsolutePath());

	}

	private Bundle loadAndActivateBundle(String id, String version, String path2jar) {
		Bundle res = getBundle(id, version);
		if (res == null) {
			try {
				String location = "file:" + path2jar;
				res = EcoadtUiActivator.getContext().installBundle(location);
			} catch (BundleException e) {
				e.printStackTrace();
				res = null;
			}
		}
		if (res != null) {
			try {
				if (res.getState() != Bundle.ACTIVE) {
					res.start();
				}
			} catch (BundleException e) {
				e.printStackTrace();
				res = null;
			}
		}
		return res;
	}

	private Bundle getBundle(String module, String version) {
		for (Bundle bundle : EcoadtUiActivator.getContext().getBundles()) {
			if (bundle.getSymbolicName() == null)
				continue;
			if (bundle.getVersion() == null)
				continue;
			if (bundle.getSymbolicName().equals(module) && bundle.getVersion().toString().equals(version))
				return bundle;
		}
		return null;
	}

	/**
	 * get bundle from name
	 * 
	 * @param module name
	 * @return bundle
	 */
	public Bundle getBundle(String module) {
		for (Bundle bundle : EcoadtUiActivator.getContext().getBundles()) {
			if (bundle.getSymbolicName() == null)
				continue;
			if (bundle.getVersion() == null)
				continue;
			if (bundle.getSymbolicName().equals(module))
				return bundle;
		}
		return null;
	}

	private String getPath(String path) {
		if (path == null)
			return "";
		if (path.startsWith("file://")) {
			path = path.substring(7);
		}
		int p = replaceFileSeparator(path).lastIndexOf(fileSeparator);
		if (p == -1)
			return path;
		return path.substring(0, p + 1);
	}

	private static String getShortName(String path) {
		String name = getName(path);
		int p = name.lastIndexOf(".");
		if (p == -1)
			return name;
		return name.substring(0, p);
	}

	private static String getName(String path) {
		File f1 = new File(path);
		return f1.getName();
	}

	private static String replaceFileSeparator(String path) {
		String path0 = path;
		if (fileSeparator == '/') {
			path0 = path.replace('\\', fileSeparator);
		} else {
			path0 = path.replace('/', fileSeparator);
		}
		return path0;
	}

	public String getPathToConfig() {
		return path2Config;
	}
}
