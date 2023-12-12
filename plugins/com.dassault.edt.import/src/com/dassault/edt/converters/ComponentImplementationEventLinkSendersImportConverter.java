/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtimplementation.DynamicTriggerEventSenderInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventSenderInstance;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.OperationInstance;
import edtimplementation.TriggerSender;
import edtinterface.Event;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefExternal;
import technology.ecoa.implementation._2.OpRefTrigger;
import technology.ecoa.implementation._2.SendersType;
import technology.ecoa.interface_._2.EEventDirection;

/**
 * 
 * Helper class to convert ECOA Model Operation Links to EDT.
 *
 */
public class ComponentImplementationEventLinkSendersImportConverter {
	private static final String OPERATION_NAME = " operationName=";
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationEventLinkSendersImportConverter() {
	}

	/**
	 * @param defReferences
	 * @param defServices
	 * @param edtComponentImplementation
	 * @param eventSendersList
	 * @param triggerEventSenderWithPeriodList
	 * @param sendersType
	 * @throws FailedImportException
	 */
	static void getEventLinkSenders(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList,
			HashMap<edtimplementation.TriggerSender, Double> triggerEventSenderWithPeriodList, SendersType sendersType)
			throws FailedImportException {

		EList<OpRef> moduleInstancesSender = sendersType.getModuleInstance();

		for (OpRef ecoaEventSenderInstance : moduleInstancesSender) {

			convertOpRefSenderInstance(edtComponentImplementation, eventSendersList, ecoaEventSenderInstance);
		}

		EList<OpRef> sendersServices = sendersType.getService();
		for (OpRef ecoaEventSenderService : sendersServices) {

			convertOpRefSenderService(edtComponentImplementation, eventSendersList, ecoaEventSenderService);
		}

		EList<OpRef> sendersReferences = sendersType.getReference();
		for (OpRef ecoaEventSenderReference : sendersReferences) {
			convertOpRefSenderReference(edtComponentImplementation, eventSendersList, ecoaEventSenderReference);
		}

		EList<OpRef> dynamicTriggerSenders = sendersType.getDynamicTrigger();
		for (OpRef ecoaDynamicTriggerSenderInstance : dynamicTriggerSenders) {
			convertOpRefSenderDynamicTrigger(edtComponentImplementation, eventSendersList,
					ecoaDynamicTriggerSenderInstance);
		}

		EList<OpRefTrigger> ecoaTriggerSenders = sendersType.getTrigger();
		for (OpRefTrigger ecoaTriggerSender : ecoaTriggerSenders) {

			convertOpRefTrigger(edtComponentImplementation, triggerEventSenderWithPeriodList, ecoaTriggerSender);
		}

		EList<OpRefExternal> externalSender = sendersType.getExternal();
		for (OpRefExternal opRefExternal : externalSender) {
			convertOpRefExternal(edtComponentImplementation, eventSendersList, opRefExternal);
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventSendersList
	 * @param opRefExternal
	 */
	private static void convertOpRefExternal(edtimplementation.ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList, OpRefExternal opRefExternal) {
		ExternalSenderOperation externalSenderOperation = EDTIMPFACTORY.createExternalSenderOperation();
		externalSenderOperation.setLanguage(opRefExternal.getLanguage());
		externalSenderOperation.setName(opRefExternal.getOperationName());
		edtComponentImplementation.getExternalSenders().add(externalSenderOperation);
		eventSendersList.add(externalSenderOperation);
	}

	/**
	 * @param edtComponentImplementation
	 * @param triggerEventSenderWithPeriodList
	 * @param ecoaTriggerSender
	 * @throws FailedImportException
	 */
	private static void convertOpRefTrigger(ComponentImplementation edtComponentImplementation,
			HashMap<edtimplementation.TriggerSender, Double> triggerEventSenderWithPeriodList,
			OpRefTrigger ecoaTriggerSender) throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation
				.findOperationInstanceInTriggerInstances(ecoaTriggerSender.getInstanceName());

		if (operationInstance instanceof TriggerSender edtTriggerSender) {
			Double period = null;
			if (ecoaTriggerSender.isSetPeriod()) {
				period = ecoaTriggerSender.getPeriod();
			}

			triggerEventSenderWithPeriodList.put(edtTriggerSender, period);
		} else {
			throw new FailedImportException("No Trigger exists with the name=" + ecoaTriggerSender.getInstanceName());
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventSendersList
	 * @param ecoaDynamicTriggerSenderInstance
	 * @throws FailedImportException
	 */
	private static void convertOpRefSenderDynamicTrigger(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList, OpRef ecoaDynamicTriggerSenderInstance)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInDynamicTriggerInstances(
				ecoaDynamicTriggerSenderInstance.getInstanceName(),
				ecoaDynamicTriggerSenderInstance.getOperationName());

		if (operationInstance instanceof DynamicTriggerEventSenderInstance edtDynamicTriggerSenderOperation) {
			eventSendersList.add(edtDynamicTriggerSenderOperation);

		} else {
			throw new FailedImportException("No DynamicTrigger Operation exists corresponding to instanceName="
					+ ecoaDynamicTriggerSenderInstance.getInstanceName() + OPERATION_NAME
					+ ecoaDynamicTriggerSenderInstance.getOperationName());

		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventSendersList
	 * @param ecoaEventSenderReference
	 * @throws FailedImportException
	 */
	private static void convertOpRefSenderReference(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList, OpRef ecoaEventSenderReference)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInReferences(
				ecoaEventSenderReference.getInstanceName(), ecoaEventSenderReference.getOperationName());

		if (operationInstance instanceof EventDefinitionInstance edtEventSenderInstance
				&& edtEventSenderInstance.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.SENTBYPROVIDER)) {
			eventSendersList.add(edtEventSenderInstance);

		} else {
			throw new FailedImportException(
					"No Reference Event Operation SENT_BY_PROVIDER exists corresponding to instanceName="
							+ ecoaEventSenderReference.getInstanceName() + OPERATION_NAME
							+ ecoaEventSenderReference.getOperationName());
		}
	}

	/**
	 * @param edtComponentImplementation
	 * @param eventSendersList
	 * @param ecoaEventSenderService
	 * @throws FailedImportException
	 */
	private static void convertOpRefSenderService(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList, OpRef ecoaEventSenderService)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInServices(
				ecoaEventSenderService.getInstanceName(), ecoaEventSenderService.getOperationName());

		if (operationInstance instanceof EventDefinitionInstance edtEventSenderInstance
				&& edtEventSenderInstance.getSDOperationRef() instanceof Event eventDef
				&& Objects.equals(eventDef.getDirection(), EEventDirection.RECEIVEDBYPROVIDER)) {
			eventSendersList.add(edtEventSenderInstance);

		} else {
			throw new FailedImportException(
					"No Service Event Operation RECEIVED_BY_PROVIDER exists corresponding to instanceName="
							+ ecoaEventSenderService.getInstanceName() + OPERATION_NAME
							+ ecoaEventSenderService.getOperationName());
		}
	}

	/**
	 * @param
	 * @param eventSendersList
	 * @param ecoaEventSender
	 * @throws FailedImportException
	 */
	private static void convertOpRefSenderInstance(ComponentImplementation edtComponentImplementation,
			ArrayList<edtimplementation.EventLinkSender> eventSendersList, OpRef ecoaEventSender)
			throws FailedImportException {
		OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInModuleInstances(
				ecoaEventSender.getInstanceName(), ecoaEventSender.getOperationName());

		if (operationInstance instanceof EventSenderInstance edtEventSenderInstance) {
			eventSendersList.add(edtEventSenderInstance);

		} else {
			throw new FailedImportException(
					"No ModuleInstance EventSender Operation exists corresponding to instanceName="
							+ ecoaEventSender.getInstanceName() + OPERATION_NAME + ecoaEventSender.getOperationName());
		}
	}

}
