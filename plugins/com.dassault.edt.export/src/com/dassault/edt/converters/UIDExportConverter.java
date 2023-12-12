/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtuid.ID;
import edtuid.IDMap;
import technology.ecoa.uid._2.uidFactory;

/**
 * Convert EDT Objects to ECOA Objects
 *
 */
public class UIDExportConverter {
	private static final uidFactory ECOAUIDFACTORY = uidFactory.eINSTANCE;

	private UIDExportConverter() {
	}

	/**
	 * Create a EDT model UDPBinding from a Ecoa model UDPBinding
	 * 
	 * @param edtIDMap : EDT UDPBinding object
	 * @return ecoaUDP
	 */
	public static technology.ecoa.uid._2.DocumentRoot recreateECOAIDMap(IDMap edtIDMap) {

// 		Create empty ECO IDMap
		var documentRoot = ECOAUIDFACTORY.createDocumentRoot();
		var ecoaIDMap = ECOAUIDFACTORY.createIDMap();

//		Set 
		EList<ID> edtIds = edtIDMap.getIDs();
		for (ID edtId : edtIds) {
			technology.ecoa.uid._2.ID ecoaId = ECOAUIDFACTORY.createID();
			ecoaId.setValue(edtId.getValue());
			ecoaId.setKey(getIDKey(edtId));
			ecoaIDMap.getID().add(ecoaId);
		}
		documentRoot.setIDMap(ecoaIDMap);
		return documentRoot;
	}

	/**
	 * Return ECOA String of ID Key
	 * 
	 * @param id : ID
	 * @return String form of ID key
	 */
	public static String getIDKey(ID id) {
		String name = "";
		if (id.getServiceLink() != null) {
			if (id.getServiceLink().getSource() != null) {
				name = name.concat(id.getServiceLink().getSource().getWireString());
			}
			name = name.concat(":");
			if (id.getServiceLink().getTarget() != null) {
				name = name.concat(id.getServiceLink().getTarget().getWireString());
			}
			name = name.concat(":");
			if (id.getOperation() != null) {
				name = name.concat(id.getOperation().getName());
			}
		} else {
			name = "::";
		}
		return name;
	}

}
