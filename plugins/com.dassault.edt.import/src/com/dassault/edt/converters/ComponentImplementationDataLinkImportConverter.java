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

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtimplementation.DataLinkActivatableFifo;
import edtimplementation.DataLinkToServiceOperation;
import edtimplementation.DataLinkWriter;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.OperationInstance;
import edtimplementation.VersionedDataReferenceInstance;
import edtimplementation.VersionedDataServiceInstance;
import technology.ecoa.implementation._2.DataLink;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.ReadersType;
import technology.ecoa.implementation._2.WritersType;

/**
 * 
 * Helper class to convert ECOA Model Operation Links to EDT.
 *
 */
public class ComponentImplementationDataLinkImportConverter {
	private static final String OPERATION_NAME = " operationName=";
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationDataLinkImportConverter() {
	}

	static ArrayList<edtimplementation.DataLink> createEDTDataLink(DataLink ecoaDataLink,
			ComponentImplementation componentImplementation) throws FailedImportException {
		ArrayList<edtimplementation.DataLink> edtDataLinks = new ArrayList<>();

		ReadersType readersType = ecoaDataLink.getReaders();
		EList<OpRefActivatableFifo> moduleInstancesReader = readersType.getModuleInstance();
		ArrayList<edtimplementation.VersionedDataServiceInstance> dataServiceReadersList = new ArrayList<>();
		HashMap<edtimplementation.DataReaderInstance, Object[]> dataReadersWithActivatableFifoList = new HashMap<>();
		ArrayList<edtimplementation.DataLinkWriter> dataWritersList = new ArrayList<>();
		for (OpRefActivatableFifo ecoaDataReaderInstance : moduleInstancesReader) {
			convertOpRefActivatableFifo(componentImplementation, dataReadersWithActivatableFifoList,
					ecoaDataReaderInstance);

		}

		EList<OpRef> services = readersType.getService();
		for (OpRef ecoaDataReaderService : services) {
			convertOpRefReader(componentImplementation, dataServiceReadersList, ecoaDataReaderService);
		}

		WritersType writersType = ecoaDataLink.getWriters();
		EList<OpRef> moduleInstanceWriters = writersType.getModuleInstance();
		for (OpRef ecoaDataReaderInstance : moduleInstanceWriters) {
			convertOpRefWriterInstance(componentImplementation, dataWritersList, ecoaDataReaderInstance);

		}

		EList<OpRef> references = writersType.getReference();
		for (OpRef ecoaDataWriterRef : references) {
			convertOpRefWriterReference(componentImplementation, dataWritersList, ecoaDataWriterRef);
		}

		for (DataLinkWriter edtWriter : dataWritersList) {
			for (VersionedDataServiceInstance edtReader : dataServiceReadersList) {
				createDataLinkToServiceOperation(ecoaDataLink, edtDataLinks, edtReader, edtWriter);
			}

			for (Entry<DataReaderInstance, Object[]> entry : dataReadersWithActivatableFifoList.entrySet()) {
				createDataLinkActivatableFiFo(ecoaDataLink, edtDataLinks, edtWriter, entry);
			}
		}
		return edtDataLinks;
	}

	/**
	 * @param ecoaDataLink
	 * @param edtDataLinks
	 * @param edtWriter
	 * @param entry
	 */
	private static void createDataLinkActivatableFiFo(DataLink ecoaDataLink,
			ArrayList<edtimplementation.DataLink> edtDataLinks, DataLinkWriter edtWriter,
			Entry<DataReaderInstance, Object[]> entry) {
		DataLinkActivatableFifo dataLinkActivatableFifo = EDTIMPFACTORY.createDataLinkActivatableFifo();
		DataReaderInstance key = entry.getKey();
		Object[] val = entry.getValue();
		Object activating = val[0];
		Object fifoSize = val[1];
		if (activating instanceof Boolean activatingBoolean) {
			dataLinkActivatableFifo.setReaderActivating(activatingBoolean);
		}

		if (fifoSize instanceof BigInteger fifoSizeInt) {
			dataLinkActivatableFifo.setReaderFifoSize(fifoSizeInt);
		}

		if (ecoaDataLink.isSetId()) {
			dataLinkActivatableFifo.setId(ecoaDataLink.getId());
		}

		if (ecoaDataLink.isSetControlled()) {
			dataLinkActivatableFifo.setControlled(ecoaDataLink.isControlled());
		}

		dataLinkActivatableFifo.setWriter(edtWriter);
		dataLinkActivatableFifo.setReader(key);
		edtDataLinks.add(dataLinkActivatableFifo);
	}

	/**
	 * @param ecoaDataLink
	 * @param edtDataLinks
	 * @param edtReader
	 * @param edtWriter
	 */
	private static void createDataLinkToServiceOperation(DataLink ecoaDataLink,
			ArrayList<edtimplementation.DataLink> edtDataLinks, VersionedDataServiceInstance edtReader,
			DataLinkWriter edtWriter) {
		DataLinkToServiceOperation edtDataLink = EDTIMPFACTORY.createDataLinkToServiceOperation();
		if (ecoaDataLink.isSetId()) {
			edtDataLink.setId(ecoaDataLink.getId());
		}

		if (ecoaDataLink.isSetControlled()) {
			edtDataLink.setControlled(ecoaDataLink.isControlled());
		}
		if (edtWriter instanceof DataWriterInstance edtWriterInstance) {
			edtDataLink.setWriter(edtWriterInstance);
			edtDataLink.setReader(edtReader);
			edtDataLinks.add(edtDataLink);
		}
	}

	/**
	 * @param componentImplementation
	 * @param dataWritersList
	 * @param ecoaDataWriterRef
	 * @throws FailedImportException
	 */
	private static void convertOpRefWriterReference(ComponentImplementation componentImplementation,
			ArrayList<edtimplementation.DataLinkWriter> dataWritersList, OpRef ecoaDataWriterRef)
			throws FailedImportException {
		OperationInstance operationInstance = componentImplementation.findOperationInstanceInReferences(
				ecoaDataWriterRef.getInstanceName(), ecoaDataWriterRef.getOperationName());
		if (operationInstance instanceof VersionedDataReferenceInstance edtDataReaderInstance) {
			dataWritersList.add(edtDataReaderInstance);
		} else {
			throw new FailedImportException("No Reference VersionedData Operation exists corresponding to instanceName="
					+ ecoaDataWriterRef.getInstanceName() + OPERATION_NAME + ecoaDataWriterRef.getOperationName());
		}
	}

	/**
	 * @param componentImplementation
	 * @param dataWritersList
	 * @param ecoaDataReaderInstance
	 * @throws FailedImportException
	 */
	private static void convertOpRefWriterInstance(ComponentImplementation componentImplementation,
			ArrayList<edtimplementation.DataLinkWriter> dataWritersList, OpRef ecoaDataReaderInstance)
			throws FailedImportException {
		OperationInstance operationInstance = componentImplementation.findOperationInstanceInModuleInstances(
				ecoaDataReaderInstance.getInstanceName(), ecoaDataReaderInstance.getOperationName());
		if (operationInstance instanceof DataWriterInstance edtDataReaderInstance) {
			dataWritersList.add(edtDataReaderInstance);
		} else {
			throw new FailedImportException(
					"No ModuleInstance DataWriter Operation exists corresponding to instanceName="
							+ ecoaDataReaderInstance.getInstanceName() + OPERATION_NAME
							+ ecoaDataReaderInstance.getOperationName());
		}
	}

	/**
	 * @param componentImplementation
	 * @param dataServiceReadersList
	 * @param ecoaDataReaderService
	 * @throws FailedImportException
	 */
	private static void convertOpRefReader(ComponentImplementation componentImplementation,
			ArrayList<edtimplementation.VersionedDataServiceInstance> dataServiceReadersList,
			OpRef ecoaDataReaderService) throws FailedImportException {
		OperationInstance operationInstance = componentImplementation.findOperationInstanceInServices(
				ecoaDataReaderService.getInstanceName(), ecoaDataReaderService.getOperationName());
		if (operationInstance instanceof VersionedDataServiceInstance edtDataReaderInstance) {
			dataServiceReadersList.add(edtDataReaderInstance);
		} else {
			throw new FailedImportException("No Service VersionedData Operation exists corresponding to instanceName="
					+ ecoaDataReaderService.getInstanceName() + OPERATION_NAME
					+ ecoaDataReaderService.getOperationName());
		}
	}

	/**
	 * @param componentImplementation
	 * @param dataReadersWithActivatableFifoList
	 * @param ecoaDataReaderInstance
	 * @throws FailedImportException
	 */
	private static void convertOpRefActivatableFifo(ComponentImplementation componentImplementation,
			HashMap<edtimplementation.DataReaderInstance, Object[]> dataReadersWithActivatableFifoList,
			OpRefActivatableFifo ecoaDataReaderInstance) throws FailedImportException {
		OperationInstance operationInstance = componentImplementation.findOperationInstanceInModuleInstances(
				ecoaDataReaderInstance.getInstanceName(), ecoaDataReaderInstance.getOperationName());
		if (operationInstance instanceof DataReaderInstance edtDataReaderInstance) {
			Boolean activating = null;
			BigInteger fifoSize = null;
			if (ecoaDataReaderInstance.isSetActivating()) {
				activating = ecoaDataReaderInstance.isActivating();
			}
			if (ecoaDataReaderInstance.isSetFifoSize()) {
				fifoSize = ecoaDataReaderInstance.getFifoSize();
			}
			dataReadersWithActivatableFifoList.put(edtDataReaderInstance, new Object[] { activating, fifoSize });
		} else {
			throw new FailedImportException(
					"No ModuleInstance DataReader Operation exists corresponding to instanceName="
							+ ecoaDataReaderInstance.getInstanceName() + OPERATION_NAME
							+ ecoaDataReaderInstance.getOperationName());
		}
	}

}
