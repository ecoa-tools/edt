/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.EdtimplementationFactory;
import edtimplementation.EventReceived;
import edtimplementation.EventSent;
import edtimplementation.RequestReceived;
import edtimplementation.RequestSent;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataWritten;
import edtproject.Step0;
import edttype.EDTDataType;
import technology.ecoa.implementation._2.DataReadType;
import technology.ecoa.implementation._2.DataWrittenType;
import technology.ecoa.implementation._2.Event;
import technology.ecoa.implementation._2.EventReceivedType;
import technology.ecoa.implementation._2.OperationsType;
import technology.ecoa.implementation._2.Parameter;
import technology.ecoa.implementation._2.RequestReceivedType;
import technology.ecoa.implementation._2.RequestSentType;

/**
 * 
 * Helper class to convert ECOA Model Objects to EDT.
 * 
 */
public class ComponentImplementationOperationsImportConverter {
	private static final String NO_TYPE_WAS_FOUND_WITH_THE_NAME = "No Type was found with the name :";
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationOperationsImportConverter() {
	}

	/**
	 * 
	 * @param typeStep
	 * @param edtModuleType
	 * @param operations
	 * @throws FailedImportException
	 */
	static void createEDTOperations(Step0 typeStep, edtimplementation.ModuleType edtModuleType,
			OperationsType operations) throws FailedImportException {
		if (operations != null) {
			EList<DataReadType> dataReads = operations.getDataRead();
			for (DataReadType dataRead : dataReads) {
				edtModuleType.getOperations().add(createEDTDataRead(dataRead, typeStep));
			}

			EList<DataWrittenType> dataWrittens = operations.getDataWritten();
			for (DataWrittenType dataWritten : dataWrittens) {
				edtModuleType.getOperations().add(createEDTDataWritten(dataWritten, typeStep));
			}

			EList<EventReceivedType> eventReceiveds = operations.getEventReceived();
			for (EventReceivedType eventReceived : eventReceiveds) {
				edtModuleType.getOperations().add(createEDTEventReceived(eventReceived, typeStep));

			}
			EList<Event> eventSents = operations.getEventSent();
			for (Event eventSent : eventSents) {
				edtModuleType.getOperations().add(createEDTEventSent(eventSent, typeStep));
			}

			EList<RequestReceivedType> requestReceiveds = operations.getRequestReceived();
			for (RequestReceivedType requestReceivedType : requestReceiveds) {
				edtModuleType.getOperations().add(createEDTRequestReceived(requestReceivedType, typeStep));
			}

			EList<RequestSentType> requestSents = operations.getRequestSent();
			for (RequestSentType requestSentType : requestSents) {
				edtModuleType.getOperations().add(createEDTRequestSent(requestSentType, typeStep));
			}
		}
	}

	/**
	 * 
	 * @param ecoaDataRead
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static VersionedDataRead createEDTDataRead(DataReadType ecoaDataRead, Step0 typeStep)
			throws FailedImportException {
		VersionedDataRead edtDataRead = EDTIMPFACTORY.createVersionedDataRead();
		edtDataRead.setName(ecoaDataRead.getName());

		if (ecoaDataRead.isSetMaxVersions()) {
			edtDataRead.setMaxVersions(ecoaDataRead.getMaxVersions());
		}
		if (ecoaDataRead.isSetNotifying()) {
			edtDataRead.setNotifying(ecoaDataRead.isNotifying());
		}

		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaDataRead.getType());
		if (edtDataType != null) {
			edtDataRead.setType(edtDataType);
		} else {
			throw new FailedImportException(NO_TYPE_WAS_FOUND_WITH_THE_NAME + ecoaDataRead.getType());
		}

		return edtDataRead;
	}

	/**
	 * 
	 * @param ecoaDataWritten
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static VersionedDataWritten createEDTDataWritten(DataWrittenType ecoaDataWritten, Step0 typeStep)
			throws FailedImportException {
		VersionedDataWritten edtDataWritten = EDTIMPFACTORY.createVersionedDataWritten();
		edtDataWritten.setName(ecoaDataWritten.getName());

		if (ecoaDataWritten.isSetMaxVersions()) {
			edtDataWritten.setMaxVersions(ecoaDataWritten.getMaxVersions());
		}
		if (ecoaDataWritten.isSetWriteOnly()) {
			edtDataWritten.setWriteOnly(ecoaDataWritten.isWriteOnly());
		}

		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaDataWritten.getType());
		if (edtDataType != null) {
			edtDataWritten.setType(edtDataType);
		} else {
			throw new FailedImportException(NO_TYPE_WAS_FOUND_WITH_THE_NAME + ecoaDataWritten.getType());
		}

		return edtDataWritten;
	}

	/**
	 * 
	 * @param ecoaEventSent
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static EventSent createEDTEventSent(Event ecoaEventSent, Step0 typeStep) throws FailedImportException {
		EventSent edtEventSent = EDTIMPFACTORY.createEventSent();
		edtEventSent.setName(ecoaEventSent.getName());
		EList<Parameter> ecoaInputs = ecoaEventSent.getInput();
		for (Parameter ecoaParameter : ecoaInputs) {
			edtEventSent.getInput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		return edtEventSent;
	}

	/**
	 * 
	 * @param ecoaEventReceived
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static EventReceived createEDTEventReceived(EventReceivedType ecoaEventReceived, Step0 typeStep)
			throws FailedImportException {
		EventReceived edtEventReceived = EDTIMPFACTORY.createEventReceived();
		edtEventReceived.setName(ecoaEventReceived.getName());
		EList<Parameter> ecoaInputs = ecoaEventReceived.getInput();
		for (Parameter ecoaParameter : ecoaInputs) {
			edtEventReceived.getInput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		return edtEventReceived;
	}

	/**
	 * 
	 * @param ecoaRequestReceived
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static RequestReceived createEDTRequestReceived(RequestReceivedType ecoaRequestReceived, Step0 typeStep)
			throws FailedImportException {
		RequestReceived edtRequestReceived = EDTIMPFACTORY.createRequestReceived();
		edtRequestReceived.setName(ecoaRequestReceived.getName());
		if (ecoaRequestReceived.isSetMaxConcurrentRequests()) {
			edtRequestReceived.setMaxConcurrentRequests(ecoaRequestReceived.getMaxConcurrentRequests());
		}

		EList<Parameter> ecoaInputs = ecoaRequestReceived.getInput();
		for (Parameter ecoaParameter : ecoaInputs) {
			edtRequestReceived.getInput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		EList<Parameter> ecoaOutputs = ecoaRequestReceived.getOutput();
		for (Parameter ecoaParameter : ecoaOutputs) {
			edtRequestReceived.getOutput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		return edtRequestReceived;
	}

	/**
	 * 
	 * @param ecoaRequestSent
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static RequestSent createEDTRequestSent(RequestSentType ecoaRequestSent, Step0 typeStep)
			throws FailedImportException {
		RequestSent edtRequestSent = EDTIMPFACTORY.createRequestSent();
		edtRequestSent.setName(ecoaRequestSent.getName());
		if (ecoaRequestSent.isSetMaxConcurrentRequests()) {
			edtRequestSent.setMaxConcurrentRequests(ecoaRequestSent.getMaxConcurrentRequests());
		}

		if (ecoaRequestSent.isSetIsSynchronous()) {
			edtRequestSent.setIsSynchronous(ecoaRequestSent.isIsSynchronous());
		}
		if (ecoaRequestSent.isSetTimeout()) {
			edtRequestSent.setTimeout(ecoaRequestSent.getTimeout());
		}

		EList<Parameter> ecoaInputs = ecoaRequestSent.getInput();
		for (Parameter ecoaParameter : ecoaInputs) {
			edtRequestSent.getInput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		EList<Parameter> ecoaOutputs = ecoaRequestSent.getOutput();
		for (Parameter ecoaParameter : ecoaOutputs) {
			edtRequestSent.getOutput().add(createEDTParameter(ecoaParameter, typeStep));
		}

		return edtRequestSent;
	}

	/**
	 * 
	 * @param ecoaParameter
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	private static edtimplementation.Parameter createEDTParameter(Parameter ecoaParameter, Step0 typeStep)
			throws FailedImportException {
		edtimplementation.Parameter edtParameter = EDTIMPFACTORY.createParameter();
		edtParameter.setName(ecoaParameter.getName());
		EDTDataType edtDataType = TypesImportConverter.findEDTDataTypeForNonTypes(typeStep, ecoaParameter.getType());
		if (edtDataType != null) {
			edtParameter.setType(edtDataType);
		} else {
			throw new FailedImportException(NO_TYPE_WAS_FOUND_WITH_THE_NAME + ecoaParameter.getType());
		}

		return edtParameter;
	}

}
