/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.ecore.util.EcoreUtil;

import edtudp.UDPBinding;
import technology.ecoa.udpbinding._2.udpFactory;

/**
 * Convert EDT Objects to ECOA Objects
 *
 */
public class UDPBindingExportConverter {
	private static final udpFactory ECOAUDPFACTORY = udpFactory.eINSTANCE;

	private UDPBindingExportConverter() {
	}

	/**
	 * Create a EDT model UDPBinding from a Ecoa model UDPBinding
	 * 
	 * @param edtUDPBinding : EDT UDPBinding object
	 * @return ecoaUDP
	 */
	public static technology.ecoa.udpbinding._2.DocumentRoot recreateECOAUDPBinding(UDPBinding edtUDPBinding) {

// 		Create empty ECO UDPBinding
		var documentRoot = ECOAUDPFACTORY.createDocumentRoot();
		var ecoaUDP = ECOAUDPFACTORY.createUDPBindingType();

//		Set 
		ecoaUDP.getPlatform().addAll(EcoreUtil.copyAll(edtUDPBinding.getPlatform()));
		documentRoot.setUDPBinding(ecoaUDP);
		return documentRoot;
	}

}
