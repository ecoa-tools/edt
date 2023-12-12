/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.ecore.util.EcoreUtil;

import edtudp.EdtudpFactory;
import technology.ecoa.udpbinding._2.UDPBindingType;

/**
 * Convert imported ECOA UDPBinding objects to EDT objects
 *
 */
public class UDPBindingImportConverter {
	private static final EdtudpFactory EDTUDPFACTORY = EdtudpFactory.eINSTANCE;

	private UDPBindingImportConverter() {
	}

	/**
	 * Create a EDT model UDPBinding from a Ecoa model UDPBinding
	 * 
	 * @param ecoaUDPBinding : ECOA UDPBinding object
	 * @param fileName       : name of the file
	 * @return edtUDP
	 */
	public static edtudp.UDPBinding createEDTUDPBinding(UDPBindingType ecoaUDPBinding, String fileName) {

// 		Create empty EDT UDPBinding
		var edtUDP = EDTUDPFACTORY.createUDPBinding();
		edtUDP.setName(fileName);

//		Set 
		edtUDP.getPlatform().addAll(EcoreUtil.copyAll(ecoaUDPBinding.getPlatform()));

		return edtUDP;
	}

}
