/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edtinterface.Data;
import edtinterface.EDTInterfaceFactory;
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
public class EcoaDtServicesCopyStep1 {
	private static final String COPY_OF = "Copy_of_";

	/**
	 * Creates copy of RequestResponse inputs Parameters
	 * 
	 * @param requestResponseToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyRequestResponseInput(edtinterface.RequestResponse requestResponseToCopy) {
		EList<Parameter> parametersToCopy = requestResponseToCopy.getInput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = EDTInterfaceFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of RequestResponse outputs Parameters
	 * 
	 * @param requestResponseToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyRequestResponseOutput(edtinterface.RequestResponse requestResponseToCopy) {
		EList<Parameter> parametersToCopy = requestResponseToCopy.getOutput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = edtinterface.EDTInterfaceFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Event inputs Parameters
	 * 
	 * @param eventToCopy : element copied
	 * @return list of copies
	 */
	public EList<Parameter> copyEventInput(edtinterface.Event eventToCopy) {
		EList<Parameter> parametersToCopy = eventToCopy.getInput();
		EList<Parameter> copiedEList = new BasicEList<>();
		Parameter copied;
		for (Parameter parameter : parametersToCopy) {
			copied = edtinterface.EDTInterfaceFactory.eINSTANCE.createParameter();
			copied.setName(parameter.getName());
			copied.setType(parameter.getType());
			copiedEList.add(copied);
		}
		return copiedEList;
	}

	/**
	 * Creates copy of Operations of ServiceDefinition
	 * 
	 * @param serviceDefinitionToCopy : element copied
	 * @return list of copies
	 */
	public EList<OperationType> copyServiceDefinitionOperations(ServiceDefinition serviceDefinitionToCopy) {
		EList<OperationType> operationsToCopy = serviceDefinitionToCopy.getOperations();
		EList<OperationType> copiedEList = new BasicEList<>();
		Data copiedData;
		Event copiedEvent;
		RequestResponse copiedRequest;
		for (OperationType operation : operationsToCopy) {
			if (operation instanceof edtinterface.Data op) {
				copiedData = edtinterface.EDTInterfaceFactory.eINSTANCE.createData();
				copiedData.setName(op.getName());
				copiedData.setType(op.getType());
				copiedData.setComment(op.getComment());
				copiedEList.add(copiedData);
			} else if (operation instanceof edtinterface.Event op) {
				copiedEvent = edtinterface.EDTInterfaceFactory.eINSTANCE.createEvent();
				copiedEvent.setComment(op.getComment());
				if (op.isSetDirection()) {
					copiedEvent.setDirection(op.getDirection());
				}
				copiedEvent.setName(op.getName());
				copiedEvent.getInput().addAll(copyEventInput(op));
				copiedEList.add(copiedEvent);
			} else if (operation instanceof edtinterface.RequestResponse op) {
				copiedRequest = edtinterface.EDTInterfaceFactory.eINSTANCE.createRequestResponse();
				copiedRequest.setComment(op.getComment());
				copiedRequest.setName(op.getName());
				copiedRequest.getInput().addAll(copyRequestResponseInput(op));
				copiedRequest.getOutput().addAll(copyRequestResponseOutput(op));
				copiedEList.add(copiedRequest);
			}
		}
		return copiedEList;
	}

	/**
	 * Set name of a service definition when performing a "Create Copy Of"
	 * 
	 * @param serviceDefinition : The service definition that must receive a name
	 * @return the new service definition name
	 */

	public String setNameToCopyOfServiceDefinition(ServiceDefinition serviceDefinition) {
		Step1 step1 = ((Step1) serviceDefinition.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + serviceDefinition.getName(),
				step1.getServices().toArray(new ServiceDefinition[0]), 0);
	}

	/**
	 * Set name of a service definition data when performing a "Create Copy Of"
	 * 
	 * @param data : The service definition data that must receive a name
	 * @return the new service definition data name
	 */

	public String setNameToCopyOfServiceDefinitionData(Data data) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) data.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + data.getName(),
				serviceDefinition.getOperations().toArray(new OperationType[0]), 0);
	}

	/**
	 * Set name of a service definition event when performing a "Create Copy Of"
	 * 
	 * @param event : The service definition event that must receive a name
	 * @return the new service definition event name
	 */

	public String setNameToCopyOfServiceDefinitionEvent(Event event) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) event.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + event.getName(),
				serviceDefinition.getOperations().toArray(new OperationType[0]), 0);
	}

	/**
	 * Set name of a service definition event input when performing a "Create Copy
	 * Of"
	 * 
	 * @param eventInput : The service definition event input that must receive a
	 *                   name
	 * @return the new service definition event input name
	 */

	public String setNameToCopyOfServiceDefinitionEventInput(Parameter eventInput) {
		Event event = ((Event) eventInput.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + eventInput.getName(),
				event.getInput().toArray(new Parameter[0]), 0);
	}

	/**
	 * Set name of a service definition request response when performing a "Create
	 * Copy Of"
	 * 
	 * @param requestResponse : The service definition request response that must
	 *                        receive a name
	 * @return the new service definition request response name
	 */

	public String setNameToCopyOfServiceDefinitionRequestResponse(RequestResponse requestResponse) {
		ServiceDefinition serviceDefinition = ((ServiceDefinition) requestResponse.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + requestResponse.getName(),
				serviceDefinition.getOperations().toArray(new OperationType[0]), 0);
	}

	/**
	 * Set name of a service definition request response input when performing a
	 * "Create Copy Of"
	 * 
	 * @param requestResponseInput : The service definition request response input
	 *                             that must receive a name
	 * @return the new service definition request response input name
	 */

	public String setNameToCopyOfServiceDefinitionRequestResponseInput(Parameter requestResponseInput) {
		RequestResponse requestResponse = ((RequestResponse) requestResponseInput.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + requestResponseInput.getName(),
				requestResponse.getInput().toArray(new Parameter[0]), 0);
	}

	/**
	 * Set name of a service definition request response output when performing a
	 * "Create Copy Of"
	 * 
	 * @param requestResponseOutput : The service definition request response output
	 *                              that must receive a name
	 * @return the new service definition request response output name
	 */

	public String setNameToCopyOfServiceDefinitionRequestResponseOutput(Parameter requestResponseOutput) {
		RequestResponse requestResponse = ((RequestResponse) requestResponseOutput.eContainer());
		return EcoaDtServicesCopy.checkNameWhenCopy(COPY_OF + requestResponseOutput.getName(),
				requestResponse.getOutput().toArray(new Parameter[0]), 0);
	}

}
