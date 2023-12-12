/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.design.services;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import edtimplementation.ComponentImplementation;
import edtimplementation.DataLinkReader;
import edtimplementation.DataLinkWriter;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EventLinkReceiver;
import edtimplementation.EventLinkSender;
import edtimplementation.Instance;
import edtimplementation.ModuleInstance;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestLinkClient;
import edtimplementation.RequestLinkServer;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import edtproject.Component;

/**
 * All the functions to size automatically elements
 * 
 */
public class EcoaDtServicesSize {

	private int operationSize = 5;

	/**
	 * Count number of operations to size element
	 * 
	 * @param reference : element to size
	 * @return size
	 */
	public int giveComponentImplementationReferenceSize(ReferenceOfLinkedComponentDefinition reference) {
		if (reference.getOperations().isEmpty()) {
			return 10;
		}
		return reference.getOperations().size() * operationSize;
	}

	/**
	 * Count number of operations to size element
	 * 
	 * @param service : element to size
	 * @return size
	 */

	public int giveComponentImplementationServiceSize(ServiceOfLinkedComponentDefinition service) {
		if (service.getOperations().isEmpty()) {
			return 10;
		}
		return service.getOperations().size() * operationSize;
	}

	/**
	 * Count number of operations to size element
	 * 
	 * @param componentImplementation : element to size
	 * @return size
	 */
	public int giveComponentImplementationExternalSize(ComponentImplementation componentImplementation) {
		if (componentImplementation.getExternalSenders().isEmpty()) {
			return 10;
		}
		return (componentImplementation.getExternalSenders().size() * operationSize);
	}

	/**
	 * Compare number of references/services/properties to size element
	 * 
	 * @param component : element to size
	 * @return size
	 */
	public int giveComponentSize(Component component) {
		Collection<Integer> arrayList = Arrays.asList(component.getComponentReferences().size(),
				component.getComponentServices().size(), component.getProperties().size());

		// Create maxValue variable and initialize with
		// minimum value
		int maxValue = Integer.MIN_VALUE;

		// Check maximum element using for loop
		for (Integer integer : arrayList) {
			if (integer > maxValue)
				maxValue = integer;
		}

		return 20 + (maxValue * 9);
	}

	/**
	 * Compare number of operations on the left and the right to size element
	 * 
	 * @param moduleInstance : element to size
	 * @return size
	 */
	public int giveModuleInstanceSizeHeight(ModuleInstance moduleInstance) {
		int requestOrDataLinkWestCount = 0;
		int requestOrDataLinkEastCount = 0;
		for (int i = 0; i < moduleInstance.getOperations().size(); i++) {
			if (moduleInstance.getOperations().get(i) instanceof RequestLinkServer
					|| moduleInstance.getOperations().get(i) instanceof DataLinkWriter) {
				requestOrDataLinkWestCount++;
			}
			if (moduleInstance.getOperations().get(i) instanceof RequestLinkClient
					|| moduleInstance.getOperations().get(i) instanceof DataLinkReader) {
				requestOrDataLinkEastCount++;
			}
		}
		if (requestOrDataLinkWestCount == 0 && requestOrDataLinkEastCount == 0) {
			return 10;
		}

		int largestOperations = Math.max(requestOrDataLinkWestCount, requestOrDataLinkEastCount);

		return largestOperations * operationSize + 10;
	}

	/**
	 * Count number of operations that can be on north and south side to size
	 * element
	 * 
	 * @param moduleInstance : element to size
	 * @return size
	 */
	public int giveModuleInstanceSizeWidth(ModuleInstance moduleInstance) {
		int eventLinkCount = 0;
		for (int i = 0; i < moduleInstance.getOperations().size(); i++) {
			if (moduleInstance.getOperations().get(i) instanceof EventLinkSender
					|| moduleInstance.getOperations().get(i) instanceof EventLinkReceiver) {
				eventLinkCount++;
			}
		}

		if (eventLinkCount == 0) {
			return 10;
		}

		return eventLinkCount * operationSize + 10;
	}

	/**
	 * Count number of operations to size element
	 * 
	 * @param dynamicTriggerInstance : element to size
	 * @return size
	 */
	public int giveDynamicTriggerInstanceSize(DynamicTriggerInstance dynamicTriggerInstance) {
		return 10 + (dynamicTriggerInstance.getOperations().size() * 7);
	}

	/**
	 * Count all operations that can impact height
	 * 
	 * @param componentImplementation : element to size
	 * @return size
	 */
	public int giveComponentImplementationSizeHeight(ComponentImplementation componentImplementation) {
		EList<ReferenceOfLinkedComponentDefinition> componentDefinitionReferences = componentImplementation
				.getComponentDefinitionReferences();
		EList<ServiceOfLinkedComponentDefinition> componentDefinitionServices = componentImplementation
				.getComponentDefinitionServices();
		int componentDefinitionReferencesOperations = 0;
		for (int i = 0; i < componentDefinitionReferences.size(); i++) {
			componentDefinitionReferencesOperations += componentDefinitionReferences.get(i).getOperations().size();
		}
		int componentDefinitionServicesOperations = 0;
		for (int i = 0; i < componentDefinitionServices.size(); i++) {

			componentDefinitionServicesOperations += componentDefinitionServices.get(i).getOperations().size();
		}

		int largestOperations = Math.max(componentDefinitionReferencesOperations,
				componentDefinitionServicesOperations);
		if (largestOperations == 0) {
			return 25;
		}
		return 25 + largestOperations * operationSize;
	}

	/**
	 * Count number of moduleInstance to size element
	 * 
	 * @param componentImplementation : element to size
	 * @return size
	 */
	public int giveComponentImplementationSizeWidth(ComponentImplementation componentImplementation) {
		EList<Instance> componentDefinitionInstances = componentImplementation.getInstances();
		if (componentDefinitionInstances.isEmpty()) {
			return 45;
		}
		return (componentDefinitionInstances.size() * 35);
	}

}
