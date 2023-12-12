/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtinterface.EDTInterfaceFactory;
import edtproject.Step0;
import edttype.EDTDataType;
import edttype.Library;
import technology.ecoa.interface_._2.Data;
import technology.ecoa.interface_._2.Event;
import technology.ecoa.interface_._2.Operation;
import technology.ecoa.interface_._2.Parameter;
import technology.ecoa.interface_._2.RequestResponse;
import technology.ecoa.interface_._2.ServiceDefinition;
import technology.ecoa.interface_._2.UseType;

/**
 * Convert imported ECOA ServiceDefinition objects to EDT objects
 * 
 */
public class ServiceDefinitionImportConverter {
	private static final EDTInterfaceFactory EDTSERVICEFACTORY = EDTInterfaceFactory.eINSTANCE;

	private ServiceDefinitionImportConverter() {
	}

	/**
	 * Create a EDT model ServiceDefinition from a Ecoa model ServiceDefinition
	 * 
	 * @param ecoaServiceDefinition : ECOA ServiceDefinition object
	 * @param fileName              : name of the file to get ServiceDefinition name
	 * @param typeStep              : Types + BasicTypes
	 * @return edtServiceDefinition
	 * @throws FailedImportException if a Type is not found for Data or Parameter
	 */
	public static edtinterface.ServiceDefinition createEDTServiceDefinition(ServiceDefinition ecoaServiceDefinition,
			String fileName, Step0 typeStep) throws FailedImportException {
		// Create empty EDT ServiceDefinition
		var edtServiceDefinition = EDTSERVICEFACTORY.createServiceDefinition();

		// Set edtServiceDefinition Name from File Name
		edtServiceDefinition.setName(EDTProjectImportConverter.getObjectName(fileName, ".interface.xml"));

		// Fill edtServiceDefinition with ecoaServiceDefinition attributes
		var operations = ecoaServiceDefinition.getOperations();

		EList<Data> ecoaDatas = operations.getData();
		for (Data ecoaData : ecoaDatas) {
			edtServiceDefinition.getOperations().add(createEDTData(typeStep, ecoaData));
		}

		EList<Event> ecoaEvents = operations.getEvent();
		for (Event ecoaEvent : ecoaEvents) {
			edtServiceDefinition.getOperations().add(createEDTEvent(typeStep, ecoaEvent));
		}

		EList<RequestResponse> ecoaRequestResponses = operations.getRequestresponse();
		for (RequestResponse ecoaRequestResponse : ecoaRequestResponses) {
			edtServiceDefinition.getOperations().add(createEDTRequest(typeStep, ecoaRequestResponse));
		}

		// Get Libraries used in the ServiceDefinition
		EList<UseType> usedLibraries = ecoaServiceDefinition.getUse();
		for (UseType useType : usedLibraries) {
			if (useType.equals("ECOA")) {
				continue;
			}
			Library libraryToBeAssociated = typeStep.findLibrary(useType.getLibrary());
			if (libraryToBeAssociated != null) {
				edtServiceDefinition.getUsedLibraries().add(libraryToBeAssociated);
			} else {
				throw new FailedImportException("No Library was found with the name " + useType.getLibrary());
			}
		}

		return edtServiceDefinition;
	}

	/**
	 * Create a EDT model Data from a Ecoa model Data
	 * 
	 * @param typeStep
	 * @param ecoaData
	 * @return edtData
	 * @throws FailedImportException if a Type is not found
	 */
	private static edtinterface.Data createEDTData(Step0 typeStep, Data ecoaData) throws FailedImportException {
		// Create empty EDT ServiceInstanceQoS
		var edtData = EDTSERVICEFACTORY.createData();

		// Fill edtData with ecoaData attributes
		createEDTOperationType(ecoaData, edtData);

		String ecoaType = ecoaData.getType();
		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaType);
		if (edtDataType != null) {
			edtData.setType(edtDataType);
		} else {
			throw new FailedImportException("No Type was found with the name :" + ecoaType);
		}

		return edtData;
	}

	/**
	 * Create a EDT model Event from a Ecoa model Event
	 * 
	 * @param typeStep
	 * @param ecoaEvent
	 * @return edtEvent
	 * @throws FailedImportException if a Type is not found for Parameter
	 */
	private static edtinterface.Event createEDTEvent(Step0 typeStep, Event ecoaEvent) throws FailedImportException {
		// Create empty EDT Event
		var edtEvent = EDTSERVICEFACTORY.createEvent();

		// Fill edtEvent with ecoaEvent attributes
		createEDTOperationType(ecoaEvent, edtEvent);

		edtEvent.setDirection(ecoaEvent.getDirection());

		EList<Parameter> inputs = ecoaEvent.getInput();
		for (Parameter parameter : inputs) {
			edtEvent.getInput().add(createEDTParameter(typeStep, parameter));
		}
		return edtEvent;
	}

	/**
	 * Create a EDT model RequestResponse from a Ecoa model RequestResponse
	 * 
	 * @param typeStep
	 * @param ecoaRequestResponse
	 * @return edtRequest
	 * @throws FailedImportException if a Type is not found for Parameter
	 */
	private static edtinterface.RequestResponse createEDTRequest(Step0 typeStep, RequestResponse ecoaRequestResponse)
			throws FailedImportException {
		// Create empty EDT ServiceInstanceQoS
		var edtRequest = EDTSERVICEFACTORY.createRequestResponse();

		// Fill edtRequestResponse with ecoaRequestResponse attributes
		createEDTOperationType(ecoaRequestResponse, edtRequest);

		EList<Parameter> inputs = ecoaRequestResponse.getInput();
		for (Parameter parameter : inputs) {
			edtRequest.getInput().add(createEDTParameter(typeStep, parameter));
		}

		EList<Parameter> outputs = ecoaRequestResponse.getOutput();
		for (Parameter parameter : outputs) {
			edtRequest.getOutput().add(createEDTParameter(typeStep, parameter));
		}
		return edtRequest;
	}

	/**
	 * Create a EDT model OperationType from a Ecoa model Operation
	 * 
	 * @param ecoa
	 * @param edtOperationType
	 */
	private static void createEDTOperationType(Operation ecoa, edtinterface.OperationType edtOperationType) {
		edtOperationType.setName(ecoa.getName());
		edtOperationType.setComment(ecoa.getComment());
	}

	/**
	 * Create a EDT model Parameter from a Ecoa model Parameter
	 * 
	 * @param typeStep
	 * @param ecoaParameter
	 * @return edtParameter
	 * @throws FailedImportException if type not found
	 */
	private static edtinterface.Parameter createEDTParameter(Step0 typeStep, Parameter ecoaParameter)
			throws FailedImportException {
		// Create empty EDT Parameter
		var edtParameter = EDTSERVICEFACTORY.createParameter();

		// Fill edtParameter with ecoaParameter attributes
		edtParameter.setName(ecoaParameter.getName());
		String ecoaType = ecoaParameter.getType();

		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaType);
		if (edtDataType != null) {
			edtParameter.setType(edtDataType);
		} else {
			throw new FailedImportException("No Type was found with the name :" + ecoaType);
		}
		return edtParameter;
	}

}
