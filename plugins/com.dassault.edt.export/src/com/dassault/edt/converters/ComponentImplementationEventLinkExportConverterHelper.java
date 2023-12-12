/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLink;
import edtimplementation.EventLinkActivatableFifo;
import edtimplementation.EventLinkActivatableFifoFromTrigger;
import edtimplementation.EventLinkActivatingFifo;
import edtimplementation.EventLinkActivatingFifoFromTrigger;
import edtimplementation.EventLinkSender;
import edtimplementation.EventLinkToDefinitionOperation;
import edtimplementation.EventLinkToDefinitionOperationFromTrigger;
import edtimplementation.EventReceiverInstance;
import edtimplementation.TriggerSender;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationEventLinkExportConverterHelper {

	private ComponentImplementationEventLinkExportConverterHelper() {

	}

	/**
	 * @param eventLinkAssociationFromSender
	 * @param eventLinkAssociationFromReceiver
	 * @param edtOperationLink
	 */
	static void convertEventLinksToHashMap(
			ConcurrentHashMap<OpSender, ArrayList<OpReceiver>> eventLinkAssociationFromSender,
			ConcurrentHashMap<OpReceiver, ArrayList<OpSender>> eventLinkAssociationFromReceiver,
			EventLink edtOperationLink) {
		Integer id = null;
		if (edtOperationLink.isSetId()) {
			id = edtOperationLink.getId();
		}

		if (edtOperationLink instanceof EventLinkToDefinitionOperation eventLink && eventLink.getSender() != null
				&& eventLink.getReceiver() != null) {
			EventLinkSender sender = eventLink.getSender();
			EventDefinitionInstance receiver = eventLink.getReceiver();
			OpAnySender opAnySender = new OpAnySender(sender, id);
			OpDef opDef = new OpDef(receiver, id);
			eventLinkAssociationFromSender.putIfAbsent(opAnySender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opAnySender).contains(opDef)) {
				eventLinkAssociationFromSender.get(opAnySender).add(opDef);
			}

			eventLinkAssociationFromReceiver.putIfAbsent(opDef, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opDef).contains(opAnySender)) {
				eventLinkAssociationFromReceiver.get(opDef).add(opAnySender);
			}

		} else if (edtOperationLink instanceof EventLinkActivatableFifo eventLink && eventLink.getSender() != null
				&& eventLink.getReceiver() != null) {
			EventLinkSender sender = eventLink.getSender();
			EventReceiverInstance receiver = eventLink.getReceiver();

			BigInteger receiverFifoSize = null;
			if (eventLink.isSetReceiverFifoSize()) {
				receiverFifoSize = eventLink.getReceiverFifoSize();
			}

			Boolean activating = null;
			if (eventLink.isSetReceiverActivating()) {
				activating = eventLink.isReceiverActivating();
			}

			OpAnySender opAnySender = new OpAnySender(sender, id);
			OpActivatableFifo opActivatableFifo = new OpActivatableFifo(receiverFifoSize, activating, receiver, id);
			eventLinkAssociationFromSender.putIfAbsent(opAnySender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opAnySender).contains(opActivatableFifo)) {
				eventLinkAssociationFromSender.get(opAnySender).add(opActivatableFifo);
			}

			eventLinkAssociationFromReceiver.putIfAbsent(opActivatableFifo, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opActivatableFifo).contains(opAnySender)) {
				eventLinkAssociationFromReceiver.get(opActivatableFifo).add(opAnySender);
			}

		} else if (edtOperationLink instanceof EventLinkActivatingFifo eventLink && eventLink.getSender() != null
				&& eventLink.getReceiver() != null) {
			EventLinkSender sender = eventLink.getSender();
			DynamicTriggerEventReceiverInstance receiver = eventLink.getReceiver();

			BigInteger receiverFifoSize = null;
			if (eventLink.isSetReceiverFifoSize()) {
				receiverFifoSize = eventLink.getReceiverFifoSize();
			}

			OpAnySender opAnySender = new OpAnySender(sender, id);
			OpDynamicReceiver opDynamicReceiver = new OpDynamicReceiver(receiver, receiverFifoSize, id);
			eventLinkAssociationFromSender.putIfAbsent(opAnySender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opAnySender).contains(opDynamicReceiver)) {
				eventLinkAssociationFromSender.get(opAnySender).add(opDynamicReceiver);
			}
			eventLinkAssociationFromReceiver.putIfAbsent(opDynamicReceiver, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opDynamicReceiver).contains(opAnySender)) {
				eventLinkAssociationFromReceiver.get(opDynamicReceiver).add(opAnySender);
			}
		} else if (edtOperationLink instanceof EventLinkActivatingFifoFromTrigger eventLink
				&& eventLink.getSender() != null && eventLink.getReceiver() != null) {
			TriggerSender sender = eventLink.getSender();
			DynamicTriggerEventReceiverInstance receiver = eventLink.getReceiver();

			BigInteger receiverFifoSize = null;
			if (eventLink.isSetReceiverFifoSize()) {
				receiverFifoSize = eventLink.getReceiverFifoSize();
			}

			Double period = null;
			period = eventLink.getTriggerPeriod();

			OpTriggerSender opTriggerSender = new OpTriggerSender(sender, period, id);
			OpDynamicReceiver opDynamicReceiver = new OpDynamicReceiver(receiver, receiverFifoSize, id);
			eventLinkAssociationFromSender.putIfAbsent(opTriggerSender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opTriggerSender).contains(opDynamicReceiver)) {
				eventLinkAssociationFromSender.get(opTriggerSender).add(opDynamicReceiver);
			}
			eventLinkAssociationFromReceiver.putIfAbsent(opDynamicReceiver, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opDynamicReceiver).contains(opTriggerSender)) {
				eventLinkAssociationFromReceiver.get(opDynamicReceiver).add(opTriggerSender);
			}
		} else if (edtOperationLink instanceof EventLinkActivatableFifoFromTrigger eventLink
				&& eventLink.getSender() != null && eventLink.getReceiver() != null) {
			TriggerSender sender = eventLink.getSender();
			EventReceiverInstance receiver = eventLink.getReceiver();

			Double period = null;
			period = eventLink.getTriggerPeriod();

			OpTriggerSender opTriggerSender = new OpTriggerSender(sender, period, id);

			BigInteger receiverFifoSize = null;
			if (eventLink.isSetReceiverFifoSize()) {
				receiverFifoSize = eventLink.getReceiverFifoSize();
			}

			Boolean activating = null;
			if (eventLink.isSetReceiverActivating()) {
				activating = eventLink.isReceiverActivating();
			}
			OpActivatableFifo opActivatableFifo = new OpActivatableFifo(receiverFifoSize, activating, receiver, id);

			eventLinkAssociationFromSender.putIfAbsent(opTriggerSender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opTriggerSender).contains(opActivatableFifo)) {
				eventLinkAssociationFromSender.get(opTriggerSender).add(opActivatableFifo);
			}
			eventLinkAssociationFromReceiver.putIfAbsent(opActivatableFifo, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opActivatableFifo).contains(opTriggerSender)) {
				eventLinkAssociationFromReceiver.get(opActivatableFifo).add(opTriggerSender);
			}
		} else if (edtOperationLink instanceof EventLinkToDefinitionOperationFromTrigger eventLink
				&& eventLink.getSender() != null && eventLink.getReceiver() != null) {
			TriggerSender sender = eventLink.getSender();

			Double period = null;
			period = eventLink.getTriggerPeriod();

			OpTriggerSender opTriggerSender = new OpTriggerSender(sender, period, id);

			EventDefinitionInstance receiver = eventLink.getReceiver();
			OpDef opDef = new OpDef(receiver, id);

			eventLinkAssociationFromSender.putIfAbsent(opTriggerSender, new ArrayList<>());
			if (!eventLinkAssociationFromSender.get(opTriggerSender).contains(opDef)) {
				eventLinkAssociationFromSender.get(opTriggerSender).add(opDef);
			}

			eventLinkAssociationFromReceiver.putIfAbsent(opDef, new ArrayList<>());
			if (!eventLinkAssociationFromReceiver.get(opDef).contains(opTriggerSender)) {
				eventLinkAssociationFromReceiver.get(opDef).add(opTriggerSender);
			}
		}
	}

	static interface OpReceiver {
		Integer getId();
	}

	static class OpActivatableFifo implements OpReceiver {
		protected Boolean activating;
		protected BigInteger fifo;
		protected edtimplementation.EventReceiverInstance receiver;
		protected Integer id;

		public OpActivatableFifo(BigInteger fifo, Boolean activating, edtimplementation.EventReceiverInstance receiver,
				Integer id) {
			this.activating = activating;
			this.id = id;
			this.fifo = fifo;
			this.receiver = receiver;
		}

		@Override
		public int hashCode() {
			return Objects.hash(activating, fifo, id, receiver);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpActivatableFifo other = (OpActivatableFifo) obj;
			return Objects.equals(activating, other.activating) && Objects.equals(fifo, other.fifo)
					&& Objects.equals(id, other.id) && Objects.equals(receiver, other.receiver);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static class OpDef implements OpReceiver {
		protected EventDefinitionInstance receiver;
		protected Integer id;

		public OpDef(EventDefinitionInstance receiver, Integer id) {
			this.receiver = receiver;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, receiver);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpDef other = (OpDef) obj;
			return Objects.equals(id, other.id) && Objects.equals(receiver, other.receiver);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static class OpDynamicReceiver implements OpReceiver {
		protected DynamicTriggerEventReceiverInstance receiver;
		protected BigInteger fifo;
		protected Integer id;

		public OpDynamicReceiver(DynamicTriggerEventReceiverInstance receiver, BigInteger fifo, Integer id) {
			this.receiver = receiver;
			this.fifo = fifo;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(fifo, id, receiver);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpDynamicReceiver other = (OpDynamicReceiver) obj;
			return Objects.equals(fifo, other.fifo) && Objects.equals(id, other.id)
					&& Objects.equals(receiver, other.receiver);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static interface OpSender {
		Integer getId();

	}

	static class OpTriggerSender implements OpSender {
		protected TriggerSender sender;
		protected Double period;
		protected Integer id;

		public OpTriggerSender(TriggerSender sender, Double period, Integer id) {
			this.sender = sender;
			this.period = period;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, period, sender);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpTriggerSender other = (OpTriggerSender) obj;
			return Objects.equals(id, other.id) && Objects.equals(period, other.period)
					&& Objects.equals(sender, other.sender);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}

	static class OpAnySender implements OpSender {
		protected EventLinkSender sender;
		protected Integer id;

		public OpAnySender(EventLinkSender sender, Integer id) {
			this.sender = sender;
			this.id = id;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, sender);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpAnySender other = (OpAnySender) obj;
			return Objects.equals(id, other.id) && Objects.equals(sender, other.sender);
		}

		@Override
		public Integer getId() {
			return id;
		}
	}
}
