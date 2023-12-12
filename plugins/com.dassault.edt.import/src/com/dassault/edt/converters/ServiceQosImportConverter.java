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
import edtqos.EdtqosFactory;
import technology.ecoa.interface_.qos._2.Data;
import technology.ecoa.interface_.qos._2.Event;
import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.Operations;
import technology.ecoa.interface_.qos._2.RequestResponse;
import technology.ecoa.interface_.qos._2.ServiceInstanceQoS;

/**
 * Convert imported ECOA ServiceQoS objects to EDT objects
 * 
 */
public class ServiceQosImportConverter {
	private static final String IN_THE_SERVICE_DEFINITION = " in the ServiceDefinition ";
	private static final String SERVICE_INSTANCE_QOS_COULD_NOT_BE_CREATED = "Service QoS could not be created.";
	private static final EdtqosFactory EDTQOSFACTORY = EdtqosFactory.eINSTANCE;

	private ServiceQosImportConverter() {
	}

	/**
	 * Create a EDT model ServiceInstanceQos from a Ecoa model ServiceInstanceQos
	 * 
	 * @param ecoaQos               : ecoa ServiceInstanceQos
	 * @param qosName               : name of QoS
	 * @param serviceDefinitionName : name of ServiceDefinition to find
	 * @param serviceDefinition     : associated ServiceDefinition
	 * @return EDT ServiceInstanceQoS
	 * @throws FailedImportException : thrown if no ServiceDefinition found
	 */
	public static edtqos.ServiceInstanceQos createEDTQos(ServiceInstanceQoS ecoaQos, String qosName,
			ServiceDefinition serviceDefinition) throws FailedImportException {
		// Create empty EDT ServiceInstanceQoS
		edtqos.ServiceInstanceQos edtServiceInstanceQoS = EDTQOSFACTORY.createServiceInstanceQos();

		// Set name
		edtServiceInstanceQoS.setName(qosName);

		// Set ServiceDefinition and fill Operations
		edtServiceInstanceQoS.setServiceDefinition(serviceDefinition);

		Operations operations = ecoaQos.getOperations();

		EList<Data> datas = operations.getData();
		for (Data data : datas) {
			edtqos.Data edtData = createEDTData(data, serviceDefinition);
			edtServiceInstanceQoS.getOperations().add(edtData);
		}

		EList<Event> events = operations.getEvent();

		for (Event event : events) {
			edtqos.Event edtEvent = createEDTEvent(event, serviceDefinition);
			edtServiceInstanceQoS.getOperations().add(edtEvent);
		}

		EList<RequestResponse> requestResponses = operations.getRequestresponse();
		for (RequestResponse request : requestResponses) {
			edtqos.RequestResponse edtRequest = createEDTRequest(request, serviceDefinition);
			if (edtRequest != null) {
				edtServiceInstanceQoS.getOperations().add(edtRequest);
			} else {
				throw new FailedImportException(SERVICE_INSTANCE_QOS_COULD_NOT_BE_CREATED);
			}
		}

		return edtServiceInstanceQoS;

	}

	/**
	 * Create a EDT model Data from a Ecoa model Data
	 * 
	 * @param ecoaData
	 * @param serviceDefinition
	 * @return edtData
	 * @throws FailedImportException : if no Operation corresponds in
	 *                               ServiceDefinition
	 */
	private static edtqos.Data createEDTData(Data ecoaData, ServiceDefinition serviceDefinition)
			throws FailedImportException {
		// Create empty EDT Data
		var edtData = EDTQOSFACTORY.createData();

		// Fill edtData with ecoaData attributes
		String name = ecoaData.getName();

		var ecoaHighestRate = ecoaData.getHighestRate();
		createEDTHighestRate(ecoaHighestRate, edtData);

		var ecoaLowestRate = ecoaData.getLowestRate();
		createEDTLowestRate(ecoaLowestRate, edtData);

		if (ecoaData.isSetMaxAgeing()) {
			edtData.setMaxAgeing(ecoaData.getMaxAgeing());
		}
		if (ecoaData.isSetNotificationMaxHandlingTime()) {
			edtData.setNotificationMaxHandlingTime(ecoaData.getNotificationMaxHandlingTime());
		}

		// Associate ServiceDefinition Operation to QoS Operation
		if (serviceDefinition != null) {
			OperationType serviceDefinitionOperation = serviceDefinition.findServiceDefinitionOperation(name);

			if (serviceDefinitionOperation instanceof edtinterface.Data data) {
				edtData.setServiceDefinitionData(data);
			} else if (serviceDefinitionOperation == null) {
				throw new FailedImportException(
						"No Data was found with name " + name + IN_THE_SERVICE_DEFINITION + serviceDefinition.getName());
			}
		}

		return edtData;
	}

	/**
	 * Create a EDT model Event from a Ecoa model Event
	 * 
	 * @param ecoaEvent
	 * @param serviceDefinition
	 * @return edtEvent
	 * @throws FailedImportException : if no Operation corresponds in
	 *                               ServiceDefinition
	 */
	private static edtqos.Event createEDTEvent(Event ecoaEvent, ServiceDefinition serviceDefinition)
			throws FailedImportException {
		// Create empty EDT Event
		var edtEvent = EDTQOSFACTORY.createEvent();

		// Fill edtEvent with ecoaEvent attributes
		String name = ecoaEvent.getName();

		var ecoaHighestRate = ecoaEvent.getHighestRate();
		createEDTHighestRate(ecoaHighestRate, edtEvent);

		var ecoaLowestRate = ecoaEvent.getLowestRate();
		createEDTLowestRate(ecoaLowestRate, edtEvent);

		if (ecoaEvent.isSetMaxHandlingTime()) {
			edtEvent.setMaxHandlingTime(ecoaEvent.getMaxHandlingTime());
		}

		// Associate ServiceDefinition Operation to QoS Operation
		if (serviceDefinition != null) {
			OperationType serviceDefinitionOperation = serviceDefinition.findServiceDefinitionOperation(name);

			if (serviceDefinitionOperation instanceof edtinterface.Event event) {
				edtEvent.setServiceDefinitionEvent(event);
			} else if (serviceDefinitionOperation == null) {
				throw new FailedImportException(
						"No Event was found with name " + name + IN_THE_SERVICE_DEFINITION + serviceDefinition.getName());
			}
		}

		return edtEvent;
	}

	/**
	 * Create a EDT model RequestResponse from a Ecoa model RequestResponse
	 * 
	 * @param ecoaRequestResponse
	 * @param serviceDefinition
	 * @return edtRequestResponse
	 * @throws FailedImportException : if no Operation corresponds in
	 *                               ServiceDefinition
	 */
	private static edtqos.RequestResponse createEDTRequest(RequestResponse ecoaRequestResponse,
			ServiceDefinition serviceDefinition) throws FailedImportException {
		// Create empty EDT RequestResponse
		var edtRequest = EDTQOSFACTORY.createRequestResponse();

		// Fill edtRequestResponse with ecoaRequestResponse attributes
		String name = ecoaRequestResponse.getName();

		var ecoaHighestRate = ecoaRequestResponse.getHighestRate();
		createEDTHighestRate(ecoaHighestRate, edtRequest);

		var ecoaLowestRate = ecoaRequestResponse.getLowestRate();
		createEDTLowestRate(ecoaLowestRate, edtRequest);

		if (ecoaRequestResponse.isSetCallbackMaxHandlingTime()) {
			edtRequest.setCallbackMaxHandlingTime(ecoaRequestResponse.getCallbackMaxHandlingTime());
		}

		if (ecoaRequestResponse.isSetMaxResponseTime()) {
			edtRequest.setMaxResponseTime(ecoaRequestResponse.getMaxResponseTime());
		}
		// Associate ServiceDefinition Operation to QoS Operation
		if (serviceDefinition != null) {
			OperationType serviceDefinitionOperation = serviceDefinition.findServiceDefinitionOperation(name);
			if (serviceDefinitionOperation instanceof edtinterface.RequestResponse request) {
				edtRequest.setServiceDefinitionRequestResponse(request);
			} else if (serviceDefinitionOperation == null) {
				throw new FailedImportException("No RequestResponse was found with name " + name
						+ IN_THE_SERVICE_DEFINITION + serviceDefinition.getName());
			}
		}
		return edtRequest;
	}

	/**
	 * Set HighestRate
	 * 
	 * @param ecoaHighestRate
	 * @param edtOperation
	 */
	private static void createEDTHighestRate(OperationRate ecoaHighestRate, edtqos.Operation edtOperation) {
		if (ecoaHighestRate != null) {
			if (ecoaHighestRate.isSetTimeFrame()) {
				edtOperation.setHighestRateTimeFrame(ecoaHighestRate.getTimeFrame());
			}
			edtOperation.setHighestRateNumberOfOccurrences(ecoaHighestRate.getNumberOfOccurrences());
		}
	}

	/**
	 * Set LowestRate
	 * 
	 * @param ecoaLowestRate
	 * @param edtOperation
	 */
	private static void createEDTLowestRate(OperationRate ecoaLowestRate, edtqos.Operation edtOperation) {
		if (ecoaLowestRate != null) {
			if (ecoaLowestRate.isSetTimeFrame()) {
				edtOperation.setLowestRateTimeFrame(ecoaLowestRate.getTimeFrame());
			}
			edtOperation.setLowestRateNumberOfOccurrences(ecoaLowestRate.getNumberOfOccurrences());
		}
	}
}
