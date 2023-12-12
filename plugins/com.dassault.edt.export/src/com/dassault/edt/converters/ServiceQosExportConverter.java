/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtqos.Operation;
import technology.ecoa.interface_.qos._2.Data;
import technology.ecoa.interface_.qos._2.DocumentRoot;
import technology.ecoa.interface_.qos._2.Event;
import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.Operations;
import technology.ecoa.interface_.qos._2.RequestResponse;
import technology.ecoa.interface_.qos._2.ServiceInstanceQoS;
import technology.ecoa.interface_.qos._2.qosFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ServiceQosExportConverter {
	private static final qosFactory QOSFACTORY = qosFactory.eINSTANCE;

	private ServiceQosExportConverter() {
	}

	/**
	 * Convert EDT ServiceInstanceQos to Ecoa ServiceInstanceQos
	 *
	 * @param edtServiceDefinitionQoS : QoS to convert
	 * @return ecoaServiceInstanceQoS
	 */
	public static DocumentRoot recreateQos(edtqos.ServiceInstanceQos edtServiceDefinitionQoS) {
//		Create empty ecoa ServiceInstanceQos
		ServiceInstanceQoS ecoaServiceInstanceQoS = QOSFACTORY.createServiceInstanceQoS();

//		Create Operations and fill them with EDT Operations
		Operations ecoaOperations = QOSFACTORY.createOperations();

		EList<Operation> operations = edtServiceDefinitionQoS.getOperations();
		for (Operation operation : operations) {
			if (operation instanceof edtqos.Data data) {
				ecoaOperations.getData().add(recreateData(data));

			} else if (operation instanceof edtqos.Event event) {
				ecoaOperations.getEvent().add(recreateEvent(event));

			} else if (operation instanceof edtqos.RequestResponse requestResponse) {
				ecoaOperations.getRequestresponse().add(recreateRequest(requestResponse));
			}
		}
		ecoaServiceInstanceQoS.setOperations(ecoaOperations);

//		Create DocumentRoot to add ServiceInstanceQoS
		DocumentRoot documentRoot = QOSFACTORY.createDocumentRoot();
		documentRoot.setServiceInstanceQoS(ecoaServiceInstanceQoS);

		return documentRoot;
	}

	/**
	 * Convert EDT Data to Ecoa Data
	 * 
	 * @param edtData
	 * @return ecoaData
	 */
	private static Data recreateData(edtqos.Data edtData) {
//		Create empty ecoa Data
		var ecoaData = QOSFACTORY.createData();

//		Recreate OperationsRate
		ecoaData.setHighestRate(recreateHighestRate(edtData));
		ecoaData.setLowestRate(recreateLowesttRate(edtData));

//		Fill other attributes from EDT Data
		if (edtData.isSetMaxAgeing()) {
			ecoaData.setMaxAgeing(edtData.getMaxAgeing());
		}

		if (edtData.isSetNotificationMaxHandlingTime()) {
			ecoaData.setNotificationMaxHandlingTime(edtData.getNotificationMaxHandlingTime());
		}

//		Convert referenced ServiceDefinitionData to String
		edtinterface.Data serviceDefinitionData = edtData.getServiceDefinitionData();
		if (serviceDefinitionData != null) {
			ecoaData.setName(serviceDefinitionData.getName());
		}

		return ecoaData;
	}

	/**
	 * Convert EDT Event to Ecoa Event
	 * 
	 * @param edtEvent
	 * @return ecoaEvent
	 */
	private static Event recreateEvent(edtqos.Event edtEvent) {
//		Create empty ecoa Event
		var ecoaEvent = QOSFACTORY.createEvent();

//		Recreate OperationsRate
		ecoaEvent.setHighestRate(recreateHighestRate(edtEvent));
		ecoaEvent.setLowestRate(recreateLowesttRate(edtEvent));

//		Fill other attributes from EDT Event
		if (edtEvent.isSetMaxHandlingTime()) {
			ecoaEvent.setMaxHandlingTime(edtEvent.getMaxHandlingTime());
		}
//		Convert referenced ServiceDefinitionEvent to String
		edtinterface.Event serviceDefinitionEvent = edtEvent.getServiceDefinitionEvent();
		if (serviceDefinitionEvent != null) {
			ecoaEvent.setName(serviceDefinitionEvent.getName());
		}

		return ecoaEvent;
	}

	/**
	 * Convert EDT RequestResponse to Ecoa RequestResponse
	 * 
	 * @param edtRequestResponse
	 * @return ecoaRequestResponse
	 */
	private static RequestResponse recreateRequest(edtqos.RequestResponse edtRequestResponse) {
//		Create empty ecoa RequestResponse
		var ecoaRequestResponse = QOSFACTORY.createRequestResponse();

//		Recreate OperationsRate
		ecoaRequestResponse.setHighestRate(recreateHighestRate(edtRequestResponse));
		ecoaRequestResponse.setLowestRate(recreateLowesttRate(edtRequestResponse));

//		Fill other attributes from EDT RequestResponse
		if (edtRequestResponse.isSetCallbackMaxHandlingTime()) {
			ecoaRequestResponse.setCallbackMaxHandlingTime(edtRequestResponse.getCallbackMaxHandlingTime());
		}

		if (edtRequestResponse.isSetMaxResponseTime()) {
			ecoaRequestResponse.setMaxResponseTime(edtRequestResponse.getMaxResponseTime());
		}

//		Convert referenced ServiceDefinitionRequestResponse to String
		edtinterface.RequestResponse serviceDefinitionRequest = edtRequestResponse
				.getServiceDefinitionRequestResponse();
		if (serviceDefinitionRequest != null) {
			ecoaRequestResponse.setName(serviceDefinitionRequest.getName());
		}

		return ecoaRequestResponse;
	}

	/**
	 * 
	 * @param edtOperation
	 * @return HighestRate OperationRate
	 */
	private static OperationRate recreateHighestRate(edtqos.Operation edtOperation) {
//		Create empty ecoa OperationRate
		var ecoaRate = QOSFACTORY.createOperationRate();

//		Fill from EDT operation
		if (edtOperation.isSetHighestRateTimeFrame()) {
			ecoaRate.setTimeFrame(edtOperation.getHighestRateTimeFrame());
		}
		ecoaRate.setNumberOfOccurrences(edtOperation.getHighestRateNumberOfOccurrences());

		return ecoaRate;
	}

	/**
	 * 
	 * @param edtOperation
	 * @return LowestRate OperationRate
	 */
	private static OperationRate recreateLowesttRate(edtqos.Operation edtOperation) {
//		Create empty ecoa OperationRate
		var ecoaRate = QOSFACTORY.createOperationRate();

//		Fill from EDT operation
		if (edtOperation.isSetLowestRateTimeFrame()) {
			ecoaRate.setTimeFrame(edtOperation.getLowestRateTimeFrame());
		}
		ecoaRate.setNumberOfOccurrences(edtOperation.getLowestRateNumberOfOccurrences());

		return ecoaRate;
	}

}
