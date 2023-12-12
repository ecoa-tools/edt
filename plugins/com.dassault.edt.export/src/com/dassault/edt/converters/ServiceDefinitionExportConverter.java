/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtinterface.OperationType;
import edttype.EDTDataType;
import edttype.Library;
import technology.ecoa.interface_._2.Data;
import technology.ecoa.interface_._2.DocumentRoot;
import technology.ecoa.interface_._2.Event;
import technology.ecoa.interface_._2.Operation;
import technology.ecoa.interface_._2.Parameter;
import technology.ecoa.interface_._2.RequestResponse;
import technology.ecoa.interface_._2.UseType;
import technology.ecoa.interface_._2.interFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ServiceDefinitionExportConverter {
	private static final interFactory SERVICEFACTORY = interFactory.eINSTANCE;

	private ServiceDefinitionExportConverter() {
	}

	/**
	 * Convert EDT ServiceDefinition to Ecoa ServiceDefinition
	 * 
	 * @param edtServiceDefinition : serviceDefinition to convert
	 * @return ecoaServiceDefinition
	 */
	public static DocumentRoot recreateServiceDefinition(edtinterface.ServiceDefinition edtServiceDefinition) {
//		Create empty ecoa ServiceDefinition
		var ecoaServiceDefinition = SERVICEFACTORY.createServiceDefinition();

//		Set used libraries (conversion from link to string)
		EList<Library> usedLibraries = edtServiceDefinition.getUsedLibraries();
		usedLibraries.forEach(edtLibrary -> ecoaServiceDefinition.getUse().add(recreateUseType(edtLibrary)));

//		Create Ecoa operations object from Edt operations list
		EList<OperationType> edtOperations = edtServiceDefinition.getOperations();
		var operations = SERVICEFACTORY.createOperations();

		for (OperationType operationType : edtOperations) {
			if (operationType instanceof edtinterface.Data op) {
				operations.getData().add(recreateData(op));
			} else if (operationType instanceof edtinterface.Event op) {
				operations.getEvent().add(recreateEvent(op));
			} else if (operationType instanceof edtinterface.RequestResponse op) {
				operations.getRequestresponse().add(recreateRequest(op));
			}
		}
		ecoaServiceDefinition.setOperations(operations);

//		Create DocumentRoot to add ServiceDefinition
		var documentRoot = SERVICEFACTORY.createDocumentRoot();
		documentRoot.setServiceDefinition(ecoaServiceDefinition);

		return documentRoot;
	}

	/**
	 * Convert EDT used Library to Ecoa UseType
	 * 
	 * @param usedLibrary : library used
	 * @return useType
	 */
	public static UseType recreateUseType(edttype.Library usedLibrary) {
//		Create empty ecoa UseType
		var useType = SERVICEFACTORY.createUseType();

//		Converted referenced Library to useType
		useType.setLibrary(usedLibrary.getName());

		return useType;
	}

	/**
	 * Convert EDT Data to Ecoa Data
	 * 
	 * @param edtData
	 * @return ecoaData
	 */
	private static Data recreateData(edtinterface.Data edtData) {
//		Create empty ecoa Data
		var ecoaData = SERVICEFACTORY.createData();

//		Set common Operation attributes
		recreateOperation(ecoaData, edtData);

//		Convert EDTDataType link to String
		EDTDataType type = edtData.getType();
		if (type != null) {
			ecoaData.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
		}

		return ecoaData;
	}

	/**
	 * Convert EDT Parameter to Ecoa Parameter
	 * 
	 * @param edtParameter
	 * @return ecoaParameter
	 */
	private static Parameter recreateParameter(edtinterface.Parameter edtParameter) {
//		Create empty ecoa Parameter
		var ecoaParameter = SERVICEFACTORY.createParameter();

//		Fill ecoa Parameter from EDT Parameter
		ecoaParameter.setName(edtParameter.getName());

//		Convert EDTDataType link to String
		EDTDataType type = edtParameter.getType();
		if (type != null) {
			ecoaParameter.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
		}

		return ecoaParameter;
	}

	/**
	 * Convert EDT Event to Ecoa Event
	 * 
	 * @param edtEvent
	 * @return ecoaEvent
	 */
	private static Event recreateEvent(edtinterface.Event edtEvent) {
//		Create empty ecoa Event
		var ecoaEvent = SERVICEFACTORY.createEvent();
//		Set common Operation attributes
		recreateOperation(ecoaEvent, edtEvent);
		ecoaEvent.setDirection(edtEvent.getDirection());

//		Create Ecoa Parameters from EDT Parameters
		EList<edtinterface.Parameter> inputs = edtEvent.getInput();
		inputs.forEach(param -> ecoaEvent.getInput().add(recreateParameter(param)));

		return ecoaEvent;
	}

	/**
	 * Convert EDT RequestResponse to Ecoa RequestResponse
	 * 
	 * @param edtRequestResponse
	 * @return ecoaRequest
	 */
	private static RequestResponse recreateRequest(edtinterface.RequestResponse edtRequestResponse) {
//		Create empty ecoa RequestResponse
		var ecoaRequest = SERVICEFACTORY.createRequestResponse();
//		Set common Operation attributes
		recreateOperation(ecoaRequest, edtRequestResponse);

//		Create Ecoa Parameters from EDT Parameters
		EList<edtinterface.Parameter> inputs = edtRequestResponse.getInput();
		inputs.forEach(param -> ecoaRequest.getInput().add(recreateParameter(param)));

		EList<edtinterface.Parameter> outputs = edtRequestResponse.getOutput();
		outputs.forEach(param -> ecoaRequest.getOutput().add(recreateParameter(param)));

		return ecoaRequest;
	}

	/**
	 * Convert EDT OperationType to Ecoa Operation
	 * 
	 * @param ecoa
	 * @param edt
	 */
	private static void recreateOperation(Operation ecoa, OperationType edt) {
		ecoa.setName(edt.getName());
		if (edt.getComment() != null && !edt.getComment().isBlank()) {
			ecoa.setComment(edt.getComment());
		}
	}

}
