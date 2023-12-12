/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package com.dassault.edt.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import com.dassault.edt.xmlimport.FailedImportException;

import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.OperationInstance;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLinkActivatableFifo;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestServerInstance;
import edtimplementation.RequestServiceInstance;
import technology.ecoa.implementation._2.ClientsType;
import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatable;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.ServerType;

/**
 * 
 * Helper class to convert ECOA Model Operation Links to EDT.
 * 
 */
public class ComponentImplementationRequestLinkImportConverter {
	private static final String OPERATION_NAME = " operationName=";
	private static final EdtimplementationFactory EDTIMPFACTORY = EdtimplementationFactory.eINSTANCE;

	private ComponentImplementationRequestLinkImportConverter() {
	}

	/**
	 * 
	 * @param ecoaRequestLink
	 * @param edtComponentImplementation
	 * @param defReferences
	 * @return
	 * @throws FailedImportException
	 */
	static ArrayList<edtimplementation.RequestLink> createEDTRequestLink(RequestLink ecoaRequestLink,
			ComponentImplementation edtComponentImplementation) throws FailedImportException {
		ArrayList<edtimplementation.RequestLink> edtRequestLinks = new ArrayList<>();

		ArrayList<edtimplementation.RequestServiceInstance> requestClientFromDefList = new ArrayList<>();
		HashMap<edtimplementation.RequestClientInstance, Boolean> requestClientActivatableMap = new HashMap<>();

		ClientsType clientsType = ecoaRequestLink.getClients();
		EList<OpRefActivatable> moduleInstanceClients = clientsType.getModuleInstance();
		for (OpRefActivatable ecoaRequestClientInstance : moduleInstanceClients) {
			OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInModuleInstances(
					ecoaRequestClientInstance.getInstanceName(), ecoaRequestClientInstance.getOperationName());
			if (operationInstance instanceof RequestClientInstance edtRequestClientInstance) {
				Boolean activating = null;
				if (ecoaRequestClientInstance.isSetActivating()) {
					activating = ecoaRequestClientInstance.isActivating();
				}
				requestClientActivatableMap.put(edtRequestClientInstance, activating);
			} else {
				throw new FailedImportException(
						"No ModuleInstance RequestSent Operation exists corresponding to instanceName="
								+ ecoaRequestClientInstance.getInstanceName() + OPERATION_NAME
								+ ecoaRequestClientInstance.getOperationName());
			}

		}

		EList<OpRef> serviceClients = clientsType.getService();
		for (OpRef ecoaRequestServiceClient : serviceClients) {
			OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInServices(
					ecoaRequestServiceClient.getInstanceName(), ecoaRequestServiceClient.getOperationName());
			if (operationInstance instanceof RequestServiceInstance edtRequestFromDefInstance) {
				requestClientFromDefList.add(edtRequestFromDefInstance);
			} else {
				throw new FailedImportException("No Service Request Operation exists corresponding to instanceName="
						+ ecoaRequestServiceClient.getInstanceName() + OPERATION_NAME
						+ ecoaRequestServiceClient.getOperationName());
			}
		}

		ServerType serversType = ecoaRequestLink.getServer();

		if (serversType.getModuleInstance() != null) {
			OpRefActivatableFifo ecoaModuleInstanceServer = serversType.getModuleInstance();

			OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInModuleInstances(
					ecoaModuleInstanceServer.getInstanceName(), ecoaModuleInstanceServer.getOperationName());
			if (!(operationInstance instanceof RequestServerInstance edtRequestServerInstance)) {
				throw new FailedImportException(
						"No ModuleInstance RequestSent Operation exists corresponding to instanceName="
								+ ecoaModuleInstanceServer.getInstanceName() + OPERATION_NAME
								+ ecoaModuleInstanceServer.getOperationName());
			}

			for (RequestServiceInstance clientFromDef : requestClientFromDefList) {
				RequestLinkActivatableFifo edtRequestLinkActivatableFifo = EDTIMPFACTORY
						.createRequestLinkActivatableFifo();
				edtRequestLinkActivatableFifo.setServer(edtRequestServerInstance);
				if (ecoaModuleInstanceServer.isSetActivating()) {
					edtRequestLinkActivatableFifo.setServerActivating(ecoaModuleInstanceServer.isActivating());
				}

				if (ecoaModuleInstanceServer.isSetFifoSize()) {
					edtRequestLinkActivatableFifo.setServerFifoSize(ecoaModuleInstanceServer.getFifoSize());
				}

				if (ecoaRequestLink.isSetId()) {
					edtRequestLinkActivatableFifo.setId(ecoaRequestLink.getId());
				}

				edtRequestLinkActivatableFifo.setClient(clientFromDef);
				edtRequestLinks.add(edtRequestLinkActivatableFifo);
			}

			for (Entry<RequestClientInstance, Boolean> entry : requestClientActivatableMap.entrySet()) {
				RequestClientInstance client = entry.getKey();
				Boolean activating = entry.getValue();

				RequestLinkActivatingActivatableFifo edtRequestLinkActivatingActivatableFifo = EDTIMPFACTORY
						.createRequestLinkActivatingActivatableFifo();
				if (activating != null) {
					edtRequestLinkActivatingActivatableFifo.setClientActivating(activating);
				}

				if (ecoaModuleInstanceServer.isSetActivating()) {
					edtRequestLinkActivatingActivatableFifo
							.setServerActivating(ecoaModuleInstanceServer.isActivating());
				}

				if (ecoaModuleInstanceServer.isSetFifoSize()) {
					edtRequestLinkActivatingActivatableFifo.setServerFifoSize(ecoaModuleInstanceServer.getFifoSize());
				}

				if (ecoaRequestLink.isSetId()) {
					edtRequestLinkActivatingActivatableFifo.setId(ecoaRequestLink.getId());
				}

				edtRequestLinkActivatingActivatableFifo.setClient(client);
				edtRequestLinkActivatingActivatableFifo.setServer(edtRequestServerInstance);
				edtRequestLinks.add(edtRequestLinkActivatingActivatableFifo);
			}
		} else if (serversType.getReference() != null) {
			OpRef ecoaReferenceServer = serversType.getReference();

			OperationInstance operationInstance = edtComponentImplementation.findOperationInstanceInReferences(
					ecoaReferenceServer.getInstanceName(), ecoaReferenceServer.getOperationName());
			if (!(operationInstance instanceof RequestReferenceInstance edtRequestServerInstance)) {
				throw new FailedImportException("No Reference Request Operation exists corresponding to instanceName="
						+ ecoaReferenceServer.getInstanceName() + OPERATION_NAME
						+ ecoaReferenceServer.getOperationName());
			}

			for (Entry<RequestClientInstance, Boolean> entry : requestClientActivatableMap.entrySet()) {
				RequestClientInstance client = entry.getKey();
				Boolean activating = entry.getValue();

				RequestLinkActivatingToReferenceOperation edtRequestLinkActivatingToReferenceOperation = EDTIMPFACTORY
						.createRequestLinkActivatingToReferenceOperation();
				if (activating != null) {
					edtRequestLinkActivatingToReferenceOperation.setClientActivating(activating);
				}

				if (ecoaRequestLink.isSetId()) {
					edtRequestLinkActivatingToReferenceOperation.setId(ecoaRequestLink.getId());
				}

				edtRequestLinkActivatingToReferenceOperation.setClient(client);
				edtRequestLinkActivatingToReferenceOperation.setServer(edtRequestServerInstance);
				edtRequestLinks.add(edtRequestLinkActivatingToReferenceOperation);
			}
		}

		return edtRequestLinks;
	}

}
