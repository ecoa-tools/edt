/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventReceiverInstance;
import edtimplementation.OperationInstance;
import edtinterface.Event;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.OpRefActivatingFifo;
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.interface_._2.EEventDirection;

/**
 * 
 * Helper class to convert ECOA Model Operation Links to EDT.
 *
 */
public class ComponentImplementationEventLinkReceiversImportConverter {

	private static final String OPERATION_NAME = " operationName=";

	private ComponentImplementationEventLinkReceiversImportConverter() {
	}

	/**
	 * @param edtComponentImplementation
	 * @param defReferences
	 * @param defServices
	 * @param eventDefReceiversList
	 * @param eventReceiverWithActivatableFifoList
	 * @param dynamicTriggerEventReceiverWithActivatingFifoList
	 * @param receiversType
	 * @throws FailedImportException
	 */
	static void getEventLinkReceivers(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventDefinitionInstance> eventDefReceiversList,
			HashMap<edtimplementation.EventReceiverInstance, Object[]> eventReceiverWithActivatableFifoList,
			HashMap<edtimplementation.DynamicTriggerEventReceiverInstance, BigInteger> dynamicTriggerEventReceiverWithActivatingFifoList,
			ReceiversType receiversType) throws FailedImportException {
		EList<OpRefActivatableFifo> moduleInstanceReceivers = receiversType.getModuleInstance();
		for (OpRefActivatableFifo ecoaEventReceiverActivatableFifo : moduleInstanceReceivers) {
			convertOpRefActivatableFifo(edtComponentImplementation, eventReceiverWithActivatableFifoList,
					ecoaEventReceiverActivatableFifo);

		}

		EList<OpRef> referencesReceivers = receiversType.getReference();
		for (OpRef ecoaEventDefReceivers : referencesReceivers) {
			convertOpRefReceiverReference(edtComponentImplementation, eventDefReceiversList, ecoaEventDefReceivers);
		}

		EList<OpRef> serviceReceivers = receiversType.getService();
		for (OpRef ecoaEventDefReceivers : serviceReceivers) {
			convertOpRefReceiversService(edtComponentImplementation, eventDefReceiversList, ecoaEventDefReceivers);
		}

		EList<OpRefActivatingFifo> ecoaDynamicTriggerReceivers = receiversType.getDynamicTrigger();
		for (OpRefActivatingFifo ecoaDynamicTriggerReceiver : ecoaDynamicTriggerReceivers) {
			convertOpRefActivatingFifo(edtComponentImplementation, dynamicTriggerEventReceiverWithActivatingFifoList,
					ecoaDynamicTriggerReceiver);
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param dynamicTriggerEventReceiverWithActivatingFifoList
	 * @param ecoaDynamicTriggerReceiver
	 * @throws FailedImportException
	 */
	private static void convertOpRefActivatingFifo(ComponentImplementation edtComponentImplementation,
			HashMap<edtimplementation.DynamicTriggerEventReceiverInstance, BigInteger> dynamicTriggerEventReceiverWithActivatingFifoList,
			OpRefActivatingFifo ecoaDynamicTriggerReceiver) throws FailedImportException {
		edtimplementation.OperationInstance operationInstance = edtComponentImplementation
				.findOperationInstanceInDynamicTriggerInstances(ecoaDynamicTriggerReceiver.getInstanceName(),
						ecoaDynamicTriggerReceiver.getOperationName());
		if (operationInstance instanceof DynamicTriggerEventReceiverInstance edtDynamicTriggerReceiver) {
			BigInteger fifoSize = null;
			if (ecoaDynamicTriggerReceiver.isSetFifoSize()) {
				fifoSize = ecoaDynamicTriggerReceiver.getFifoSize();
			}
			dynamicTriggerEventReceiverWithActivatingFifoList.put(edtDynamicTriggerReceiver, fifoSize);
		} else {
			throw new FailedImportException("No DynamicTrigger Operation exists corresponding to instanceName="
					+ ecoaDynamicTriggerReceiver.getInstanceName() + OPERATION_NAME
					+ ecoaDynamicTriggerReceiver.getOperationName());
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventDefReceiversList
	 * @param ecoaEventDefReceivers
	 * @throws FailedImportException
	 */
	private static void convertOpRefReceiversService(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventDefinitionInstance> eventDefReceiversList, OpRef ecoaEventDefReceivers)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInServices(
				ecoaEventDefReceivers.getInstanceName(), ecoaEventDefReceivers.getOperationName());
		if (operationInstance instanceof EventDefinitionInstance edtEventDefinitionInstance
				&& edtEventDefinitionInstance.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.SENTBYPROVIDER)) {
			eventDefReceiversList.add(edtEventDefinitionInstance);
		} else {
			throw new FailedImportException("No Service Event Operation exists corresponding to instanceName="
					+ ecoaEventDefReceivers.getInstanceName() + OPERATION_NAME
					+ ecoaEventDefReceivers.getOperationName());
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventDefReceiversList
	 * @param ecoaEventDefReceivers
	 * @throws FailedImportException
	 */
	private static void convertOpRefReceiverReference(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventDefinitionInstance> eventDefReceiversList, OpRef ecoaEventDefReceivers)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInReferences(
				ecoaEventDefReceivers.getInstanceName(), ecoaEventDefReceivers.getOperationName());
		if (operationInstance instanceof EventDefinitionInstance edtEventDefinitionInstance
				&& edtEventDefinitionInstance.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.RECEIVEDBYPROVIDER)) {
			eventDefReceiversList.add(edtEventDefinitionInstance);
		} else {
			throw new FailedImportException("No Reference Event Operation exists corresponding to instanceName="
					+ ecoaEventDefReceivers.getInstanceName() + OPERATION_NAME
					+ ecoaEventDefReceivers.getOperationName());
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventReceiverWithActivatableFifoList
	 * @param ecoaEventReceiverActivatableFifo
	 * @throws FailedImportException
	 */
	private static void convertOpRefActivatableFifo(ComponentImplementation edtComponentImplementation,
			HashMap<edtimplementation.EventReceiverInstance, Object[]> eventReceiverWithActivatableFifoList,
			OpRefActivatableFifo ecoaEventReceiverActivatableFifo) throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInModuleInstances(
				ecoaEventReceiverActivatableFifo.getInstanceName(),
				ecoaEventReceiverActivatableFifo.getOperationName());
		if (operationInstance instanceof EventReceiverInstance edtEventReceiverInstance) {
			Boolean activating = null;
			BigInteger fifoSize = null;
			if (ecoaEventReceiverActivatableFifo.isSetActivating()) {
				activating = ecoaEventReceiverActivatableFifo.isActivating();
			}
			if (ecoaEventReceiverActivatableFifo.isSetFifoSize()) {
				fifoSize = ecoaEventReceiverActivatableFifo.getFifoSize();
			}
			eventReceiverWithActivatableFifoList.put(edtEventReceiverInstance, new Object[] { activating, fifoSize });

		} else {
			throw new FailedImportException(
					"No ModuleInstance EventReceived Operation exists corresponding to instanceName="
							+ ecoaEventReceiverActivatableFifo.getInstanceName() + OPERATION_NAME
							+ ecoaEventReceiverActivatableFifo.getOperationName());
		}
	}

}
