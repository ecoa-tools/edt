/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import org.eclipse.emf.common.util.EList;

import edtimplementation.EventReceived;
import edtimplementation.EventSent;
import edtimplementation.ModuleOperation;
import edtimplementation.Parameter;
import edtimplementation.RequestReceived;
import edtimplementation.RequestSent;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataWritten;
import edttype.EDTDataType;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationOperationsExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationOperationsExportConverter() {

	}

	/**
	 * @param ecoaOperationsType
	 */
	static void recreateECOAOperations(technology.ecoa.implementation._2.OperationsType ecoaOperationsType,
			ModuleOperation edtModuleOperation) {
		if (edtModuleOperation instanceof VersionedDataRead op) {
			ecoaOperationsType.getDataRead()
					.add(ComponentImplementationOperationsExportConverter.recreateECOADataRead(op));

		} else if (edtModuleOperation instanceof VersionedDataWritten op) {
			ecoaOperationsType.getDataWritten()
					.add(ComponentImplementationOperationsExportConverter.recreateECOADataWritten(op));

		} else if (edtModuleOperation instanceof EventSent op) {
			ecoaOperationsType.getEventSent()
					.add(ComponentImplementationOperationsExportConverter.recreateECOAEventSent(op));

		} else if (edtModuleOperation instanceof EventReceived op) {
			ecoaOperationsType.getEventReceived()
					.add(ComponentImplementationOperationsExportConverter.recreateECOAEventReceived(op));

		} else if (edtModuleOperation instanceof RequestSent op) {
			ecoaOperationsType.getRequestSent()
					.add(ComponentImplementationOperationsExportConverter.recreateECOARequestSent(op));

		} else if (edtModuleOperation instanceof RequestReceived op) {
			ecoaOperationsType.getRequestReceived()
					.add(ComponentImplementationOperationsExportConverter.recreateECOARequestReceived(op));

		}
	}

	/**
	 * 
	 * @param edtDataRead
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.DataReadType recreateECOADataRead(VersionedDataRead edtDataRead) {
		technology.ecoa.implementation._2.DataReadType ecoaDataRead = IMPFACTORY.createDataReadType();
		ecoaDataRead.setName(edtDataRead.getName());

		if (edtDataRead.isSetMaxVersions()) {
			ecoaDataRead.setMaxVersions(edtDataRead.getMaxVersions());
		}
		if (edtDataRead.isSetNotifying()) {
			ecoaDataRead.setNotifying(edtDataRead.isNotifying());
		}

//		Convert EDTDataType link to String
		EDTDataType type = edtDataRead.getType();
		if (type != null) {
			ecoaDataRead.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
		}

		return ecoaDataRead;
	}

	/**
	 * 
	 * @param edtDataWritten
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.DataWrittenType recreateECOADataWritten(
			VersionedDataWritten edtDataWritten) {
		technology.ecoa.implementation._2.DataWrittenType ecoaDataWritten = IMPFACTORY.createDataWrittenType();
		ecoaDataWritten.setName(edtDataWritten.getName());

		if (edtDataWritten.isSetMaxVersions()) {
			ecoaDataWritten.setMaxVersions(edtDataWritten.getMaxVersions());
		}
		if (edtDataWritten.isSetWriteOnly()) {
			ecoaDataWritten.setWriteOnly(edtDataWritten.isWriteOnly());
		}

//		Convert EDTDataType link to String
		EDTDataType type = edtDataWritten.getType();
		if (type != null) {
			ecoaDataWritten.setType(TypesExportConverter.recreateDataTypeNameForNonTypes(type));
		}

		return ecoaDataWritten;
	}

	/**
	 * 
	 * @param edtEventSent
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.Event recreateECOAEventSent(EventSent edtEventSent) {
		technology.ecoa.implementation._2.Event ecoaEventSent = IMPFACTORY.createEvent();
		ecoaEventSent.setName(edtEventSent.getName());
		EList<Parameter> edtInputs = edtEventSent.getInput();
		for (Parameter edtParameter : edtInputs) {
			ecoaEventSent.getInput().add(ComponentImplementationExportConverter.recreateECOAParameter(edtParameter));
		}

		return ecoaEventSent;
	}

	/**
	 * 
	 * @param edtEventReceived
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.EventReceivedType recreateECOAEventReceived(
			EventReceived edtEventReceived) {
		technology.ecoa.implementation._2.EventReceivedType ecoaEventReceived = IMPFACTORY.createEventReceivedType();
		ecoaEventReceived.setName(edtEventReceived.getName());
		EList<Parameter> edtInputs = edtEventReceived.getInput();
		for (Parameter edtParameter : edtInputs) {
			ecoaEventReceived.getInput()
					.add(ComponentImplementationExportConverter.recreateECOAParameter(edtParameter));
		}

		return ecoaEventReceived;
	}

	/**
	 * 
	 * @param edtRequestReceived
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.RequestReceivedType recreateECOARequestReceived(
			RequestReceived edtRequestReceived) {
		technology.ecoa.implementation._2.RequestReceivedType ecoaRequestReceived = IMPFACTORY
				.createRequestReceivedType();
		ecoaRequestReceived.setName(edtRequestReceived.getName());
		if (edtRequestReceived.isSetMaxConcurrentRequests()) {
			ecoaRequestReceived.setMaxConcurrentRequests(edtRequestReceived.getMaxConcurrentRequests());
		}

		EList<Parameter> edtInputs = edtRequestReceived.getInput();
		for (Parameter edtParameter : edtInputs) {
			ecoaRequestReceived.getInput()
					.add(ComponentImplementationExportConverter.recreateECOAParameter(edtParameter));
		}

		EList<Parameter> edtOutputs = edtRequestReceived.getOutput();
		for (Parameter edtParameter : edtOutputs) {
			ecoaRequestReceived.getOutput()
					.add(ComponentImplementationExportConverter.recreateECOAParameter(edtParameter));
		}

		return ecoaRequestReceived;
	}

	/**
	 * 
	 * @param edtRequestSent
	 * @param typeStep
	 * @return
	 * @throws FailedImportException
	 */
	static technology.ecoa.implementation._2.RequestSentType recreateECOARequestSent(RequestSent edtRequestSent) {
		technology.ecoa.implementation._2.RequestSentType ecoaRequestSent = IMPFACTORY.createRequestSentType();
		ecoaRequestSent.setName(edtRequestSent.getName());
		if (edtRequestSent.isSetMaxConcurrentRequests()) {
			ecoaRequestSent.setMaxConcurrentRequests(edtRequestSent.getMaxConcurrentRequests());
		}

//		if (edtRequestSent.isSetIsSynchronous()) {
		ecoaRequestSent.setIsSynchronous(edtRequestSent.isIsSynchronous());
//		}
		if (edtRequestSent.isSetTimeout()) {
			ecoaRequestSent.setTimeout(edtRequestSent.getTimeout());
		}

		EList<Parameter> edtInputs = edtRequestSent.getInput();
		for (Parameter ecoaParameter : edtInputs) {
			ecoaRequestSent.getInput().add(ComponentImplementationExportConverter.recreateECOAParameter(ecoaParameter));
		}

		EList<Parameter> edtOutputs = edtRequestSent.getOutput();
		for (Parameter ecoaParameter : edtOutputs) {
			ecoaRequestSent.getOutput()
					.add(ComponentImplementationExportConverter.recreateECOAParameter(ecoaParameter));
		}

		return ecoaRequestSent;
	}

}
