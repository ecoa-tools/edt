/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import edtinterface.Data;
import edtinterface.Event;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;
import edtproject.Step1;

/**
 * Contains Java Services used in Sirius
 * 
 */
public class EcoaDtServicesDefaultNameStep1 {

	/**
	 * Count the amount of Services contained in Step1.
	 *
	 * @param serviceDefinition - active ServiceDefinition
	 * @return the amount of ComponentDefinitions contained in Step1
	 */
	public String countServiceDefinitions(ServiceDefinition serviceDefinition) {
		Step1 step1 = ((Step1) serviceDefinition.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Service" + step1.getServices().size(),
				step1.getServices().toArray(new ServiceDefinition[0]), step1.getServices().size());
	}

	/**
	 * Count the amount of Datas contained in a Service.
	 *
	 * @param data - active Data
	 * @return the amount of Datas contained in the Service
	 */
	public String countDatas(Data data) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) data.eContainer());
		int dataCount = 0;
		for (int i = 0; i < serviceDefinition.getOperations().size(); i++) {
			if ((serviceDefinition.getOperations().get(i)) instanceof Data) {
				dataCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Data" + dataCount,
				serviceDefinition.getOperations().toArray(new OperationType[0]), dataCount);
	}

	/**
	 * Count the amount of Events contained in a Service.
	 *
	 * @param event - active Event
	 * @return the amount of Events contained in the Service
	 */
	public String countEvents(Event event) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) event.eContainer());
		int eventCount = 0;
		for (int i = 0; i < serviceDefinition.getOperations().size(); i++) {
			if ((serviceDefinition.getOperations().get(i)) instanceof Event) {
				eventCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Event" + eventCount,
				serviceDefinition.getOperations().toArray(new OperationType[0]), eventCount);
	}

	/**
	 * Count the amount of inputs contained in a Event.
	 *
	 * @param eventInput parameter - active Event parameter
	 * @return the amount of inputs contained in the Event
	 */
	public String countEventInputs(Parameter eventInput) {
		Event event = ((Event) eventInput.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Input" + event.getInput().size(),
				event.getInput().toArray(new Parameter[0]), event.getInput().size());
	}

	/**
	 * Count the amount of RequestResponses contained in a Service.
	 *
	 * @param requestResponse - active RequestResponse
	 * @return the amount of RequestResponses contained in the Service
	 */
	public String countRequestResponses(RequestResponse requestResponse) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) requestResponse.eContainer());
		int requestResponseCount = 0;
		for (int i = 0; i < serviceDefinition.getOperations().size(); i++) {
			if ((serviceDefinition.getOperations().get(i)) instanceof RequestResponse) {
				requestResponseCount++;
			}
		}
		return EcoaDtServicesDefaultName.checkNameWhenCreate("RequestResponse" + requestResponseCount,
				serviceDefinition.getOperations().toArray(new OperationType[0]), requestResponseCount);
	}

	/**
	 * Count the amount of inputs contained in a RequestResponses.
	 *
	 * @param requestResponseInput parameter - active RequestResponse parameter
	 * @return the amount of inputs contained in the RequestResponses
	 */
	public String countRequestResponsesInputs(Parameter requestResponseInput) {
		RequestResponse requestResponse = ((RequestResponse) requestResponseInput.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Input" + requestResponse.getInput().size(),
				requestResponse.getInput().toArray(new Parameter[0]), requestResponse.getInput().size());
	}

	/**
	 * Count the amount of outputs contained in a RequestResponses.
	 *
	 * @param requestResponseOutput - active RequestResponse output
	 * @return the amount of RequestResponses contained in the RequestResponses
	 */
	public String countRequestResponsesOutputs(Parameter requestResponseOutput) {
		RequestResponse requestResponse = ((RequestResponse) requestResponseOutput.eContainer());
		return EcoaDtServicesDefaultName.checkNameWhenCreate("Output" + requestResponse.getOutput().size(),
				requestResponse.getOutput().toArray(new Parameter[0]), requestResponse.getOutput().size());
	}
}
