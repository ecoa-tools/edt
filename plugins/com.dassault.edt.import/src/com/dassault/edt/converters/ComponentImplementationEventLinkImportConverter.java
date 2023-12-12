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
import java.util.Map.Entry;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifo;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkSender;
import edtimplementation.EventLinkToDefinitionOperation;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.EventReceiverInstance;
import edtimplementation.TriggerSender;
import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.implementation._2.SendersType;

/**
 * 
 * Helper class to convert ECOA Model Operation Links to EDT.
 *
 */
public class ComponentImplementationEventLinkImportConverter {
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationEventLinkImportConverter() {
	}

	/**
	 * @param ecoaEventLink
	 * @param edtComponentImplementation
	 * @param defReferences
	 * @param defServices
	 * @param edtComponentImplementation
	 * @return
	 * @throws FailedImportException
	 */
	static ArrayList<edtimplementation.EventLink> createEDTEventLink(EventLink ecoaEventLink,
			edtimplementation.ComponentImplementation edtComponentImplementation) throws FailedImportException {
		ArrayList<edtimplementation.EventLink> edtEventLinks = new ArrayList<>();

		ArrayList<edtimplementation.EventLinkSender> eventSendersList = new ArrayList<>();
		HashMap<edtimplementation.TriggerSender, Double> triggerEventSenderWithPeriodList = new HashMap<>();

		ArrayList<edtimplementation.EventDefinitionInstance> eventDefReceiversList = new ArrayList<>();
		HashMap<edtimplementation.EventReceiverInstance, Object[]> eventReceiverWithActivatableFifoList = new HashMap<>();
		HashMap<edtimplementation.DynamicTriggerEventReceiverInstance, BigInteger> dynamicTriggerEventReceiverWithActivatingFifoList = new HashMap<>();

		SendersType sendersType = ecoaEventLink.getSenders();
		ComponentImplementationEventLinkSendersImportConverter.getEventLinkSenders(edtComponentImplementation,
				eventSendersList, triggerEventSenderWithPeriodList, sendersType);

		ReceiversType receiversType = ecoaEventLink.getReceivers();
		ComponentImplementationEventLinkReceiversImportConverter.getEventLinkReceivers(edtComponentImplementation,
				eventDefReceiversList, eventReceiverWithActivatableFifoList,
				dynamicTriggerEventReceiverWithActivatingFifoList, receiversType);

		for (EventLinkSender edtEventSender : eventSendersList) {
			for (EventDefinitionInstance edtReader : eventDefReceiversList) {
				createEventLinkToDefinition(ecoaEventLink, edtEventLinks, edtEventSender, edtReader);
			}

			for (Entry<EventReceiverInstance, Object[]> entry : eventReceiverWithActivatableFifoList.entrySet()) {
				createEventLinkActivatableFifo(ecoaEventLink, edtEventLinks, edtEventSender, entry);
			}

			for (Entry<DynamicTriggerEventReceiverInstance, BigInteger> entry : dynamicTriggerEventReceiverWithActivatingFifoList
					.entrySet()) {
				createEventLinkActivatingFifo(ecoaEventLink, edtEventLinks, edtEventSender, entry);
			}
		}

		for (Entry<TriggerSender, Double> entry : triggerEventSenderWithPeriodList.entrySet()) {
			createEventLinkFromTrigger(ecoaEventLink, edtEventLinks, eventDefReceiversList,
					eventReceiverWithActivatableFifoList, dynamicTriggerEventReceiverWithActivatingFifoList, entry);
		}
		return edtEventLinks;
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param eventDefReceiversList
	 * @param eventReceiverWithActivatableFifoList
	 * @param dynamicTriggerEventReceiverWithActivatingFifoList
	 * @param entry
	 */
	private static void createEventLinkFromTrigger(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks,
			ArrayList<edtimplementation.EventDefinitionInstance> eventDefReceiversList,
			HashMap<edtimplementation.EventReceiverInstance, Object[]> eventReceiverWithActivatableFifoList,
			HashMap<edtimplementation.DynamicTriggerEventReceiverInstance, BigInteger> dynamicTriggerEventReceiverWithActivatingFifoList,
			Entry<TriggerSender, Double> entry) {
		TriggerSender triggerSender = entry.getKey();
		Double period = entry.getValue();

		for (EventDefinitionInstance edtReader : eventDefReceiversList) {
			createEventLinkToDefinitionOperationFromTrigger(ecoaEventLink, edtEventLinks, triggerSender, period,
					edtReader);
		}

		for (Entry<EventReceiverInstance, Object[]> entry1 : eventReceiverWithActivatableFifoList.entrySet()) {
			createEventLinkActivatableFifoFromTrigger(ecoaEventLink, edtEventLinks, triggerSender, period, entry1);
		}

		for (Entry<DynamicTriggerEventReceiverInstance, BigInteger> entry1 : dynamicTriggerEventReceiverWithActivatingFifoList
				.entrySet()) {
			createEventLinkActivatingFifoFromTrigger(ecoaEventLink, edtEventLinks, triggerSender, period, entry1);
		}
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param triggerSender
	 * @param period
	 * @param entry1
	 */
	private static void createEventLinkActivatingFifoFromTrigger(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, TriggerSender triggerSender, Double period,
			Entry<DynamicTriggerEventReceiverInstance, BigInteger> entry1) {
		DynamicTriggerEventReceiverInstance key = entry1.getKey();
		BigInteger fifoSize = entry1.getValue();
		EventLinkActivatingFifoFromTrigger edtEventLink = EDTIMPFACTORY.createEventLinkActivatingFifoFromTrigger();
		if (fifoSize != null) {
			edtEventLink.setReceiverFifoSize(fifoSize);
		}

		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}

		if (period != null) {
			edtEventLink.setTriggerPeriod(period);
		}

		edtEventLink.setSender(triggerSender);
		edtEventLink.setReceiver(key);
		edtEventLinks.add(edtEventLink);
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param triggerSender
	 * @param period
	 * @param entry1
	 */
	private static void createEventLinkActivatableFifoFromTrigger(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, TriggerSender triggerSender, Double period,
			Entry<EventReceiverInstance, Object[]> entry1) {
		EventLinkActivatableFifoFromTrigger edtEventLink = EDTIMPFACTORY.createEventLinkActivatableFifoFromTrigger();
		EventReceiverInstance key = entry1.getKey();
		Object[] val = entry1.getValue();
		Object activating = val[0];
		Object fifoSize = val[1];
		if (activating instanceof Boolean activatingBoolean) {
			edtEventLink.setReceiverActivating(activatingBoolean);
		}

		if (fifoSize instanceof BigInteger fifoSizeInt) {
			edtEventLink.setReceiverFifoSize(fifoSizeInt);
		}

		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}
		if (period != null) {
			edtEventLink.setTriggerPeriod(period);
		}

		edtEventLink.setSender(triggerSender);
		edtEventLink.setReceiver(key);
		edtEventLinks.add(edtEventLink);
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param triggerSender
	 * @param period
	 * @param edtReader
	 */
	private static void createEventLinkToDefinitionOperationFromTrigger(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, TriggerSender triggerSender, Double period,
			EventDefinitionInstance edtReader) {
		EventLinkToDefinitionOperationFromTrigger edtEventLink = EDTIMPFACTORY
				.createEventLinkToDefinitionOperationFromTrigger();
		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}
		if (period != null) {
			edtEventLink.setTriggerPeriod(period);
		}

		edtEventLink.setSender(triggerSender);
		edtEventLink.setReceiver(edtReader);
		edtEventLinks.add(edtEventLink);
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param edtEventSender
	 * @param entry
	 */
	private static void createEventLinkActivatingFifo(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, EventLinkSender edtEventSender,
			Entry<DynamicTriggerEventReceiverInstance, BigInteger> entry) {
		DynamicTriggerEventReceiverInstance dynamicTriggerReceiver = entry.getKey();
		BigInteger fifoSize = entry.getValue();
		EventLinkActivatingFifo edtEventLink = EDTIMPFACTORY.createEventLinkActivatingFifo();
		if (fifoSize != null) {
			edtEventLink.setReceiverFifoSize(fifoSize);
		}

		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}

		edtEventLink.setSender(edtEventSender);
		edtEventLink.setReceiver(dynamicTriggerReceiver);
		edtEventLinks.add(edtEventLink);
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param edtEventSender
	 * @param entry
	 */
	private static void createEventLinkActivatableFifo(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, EventLinkSender edtEventSender,
			Entry<EventReceiverInstance, Object[]> entry) {
		EventLinkActivatableFifo edtEventLink = EDTIMPFACTORY.createEventLinkActivatableFifo();
		EventReceiverInstance eventReceiver = entry.getKey();
		Object[] val = entry.getValue();
		Object activating = val[0];
		Object fifoSize = val[1];
		if (activating instanceof Boolean activatingBoolean) {
			edtEventLink.setReceiverActivating(activatingBoolean);
		}

		if (fifoSize instanceof BigInteger fifoSizeInt) {
			edtEventLink.setReceiverFifoSize(fifoSizeInt);
		}

		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}

		edtEventLink.setSender(edtEventSender);
		edtEventLink.setReceiver(eventReceiver);
		edtEventLinks.add(edtEventLink);
	}

	/**
	 * @param ecoaEventLink
	 * @param edtEventLinks
	 * @param edtEventSender
	 * @param edtReader
	 */
	private static void createEventLinkToDefinition(EventLink ecoaEventLink,
			ArrayList<edtimplementation.EventLink> edtEventLinks, EventLinkSender edtEventSender,
			EventDefinitionInstance edtReader) {
		EventLinkToDefinitionOperation edtEventLink = EDTIMPFACTORY.createEventLinkToDefinitionOperation();
		if (ecoaEventLink.isSetId()) {
			edtEventLink.setId(ecoaEventLink.getId());
		}

		edtEventLink.setSender(edtEventSender);
		edtEventLink.setReceiver(edtReader);
		edtEventLinks.add(edtEventLink);
	}

}
