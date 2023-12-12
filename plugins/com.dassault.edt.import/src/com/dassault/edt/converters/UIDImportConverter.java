/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtinterface.OperationType;
import edtinterface.ServiceDefinition;
import edtproject.ComponentReference;
import edtproject.ComponentService;
import edtproject.Composite;
import edtproject.ServiceLink;
import edtuid.EdtuidFactory;
import technology.ecoa.uid._2.ID;
import technology.ecoa.uid._2.IDMap;

/**
 * Convert imported ECOA UDPBinding objects to EDT objects
 *
 */
public class UIDImportConverter {
	private static final EdtuidFactory EDTUIDFACTORY = EdtuidFactory.eINSTANCE;

	private UIDImportConverter() {
	}

	/**
	 * Create a EDT model IDMap from a Ecoa model IDMap
	 * 
	 * @param ecoaIDMap : ECOA IDMap object
	 * @param fileName  : name of the file
	 * @param composite : composite
	 * @return edtUDP
	 * @throws FailedImportException : if problem with key
	 */
	public static edtuid.IDMap createEDTIDMap(IDMap ecoaIDMap, String fileName, Composite composite)
			throws FailedImportException {

// 		Create empty EDT UDPBinding
		var edtIDMap = EDTUIDFACTORY.createIDMap();
		edtIDMap.setName(EDTProjectImportConverter.getObjectName(fileName, ".ids.xml"));

//		Set IDS
		EList<ID> ecoaIDs = ecoaIDMap.getID();
		for (ID ecoaId : ecoaIDs) {
			edtuid.ID edtID = EDTUIDFACTORY.createID();
			edtID.setValue(ecoaId.getValue());
			String key = ecoaId.getKey();
			if (key != null && key.split(":").length == 3) {
				String[] split = key.split(":");
				String source = split[0];
				String target = split[1];
				String op = split[2];

				ComponentReference findComponentReferenceFromWire = composite.findComponentReferenceFromWire(source);
				if (findComponentReferenceFromWire == null) {
					throw new FailedImportException("The ComponentReference " + source + " was not found");
				}
				ComponentService findComponentServiceFromWire = composite.findComponentServiceFromWire(target);
				if (findComponentServiceFromWire == null) {
					throw new FailedImportException("The ComponentService " + target + " was not found");
				}

				ServiceLink findServiceLink = composite.findServiceLink(findComponentReferenceFromWire,
						findComponentServiceFromWire);
				if (findServiceLink == null) {
					throw new FailedImportException("No ServiceLink was found  between " + source + " and " + target);
				}
				edtID.setServiceLink(findServiceLink);
				if (findComponentReferenceFromWire.getComponentDefinitionReference() != null
						&& findComponentReferenceFromWire.getComponentDefinitionReference().getSyntax() != null) {
					ServiceDefinition syntax = findComponentReferenceFromWire.getComponentDefinitionReference()
							.getSyntax();
					OperationType findServiceDefinitionOperation = syntax.findServiceDefinitionOperation(op);
					edtID.setOperation(findServiceDefinitionOperation);
				}
			} else {
				throw new FailedImportException("There seems to be a problem with the key of the ID. The key " + key
						+ " does not contain 3 elements separated by ':'");
			}

			edtIDMap.getIDs().add(edtID);
		}

		return edtIDMap;
	}

}
