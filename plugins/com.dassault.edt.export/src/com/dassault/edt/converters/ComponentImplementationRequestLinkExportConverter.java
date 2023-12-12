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
import java.util.Objects;

import edtimplementation.ModuleInstance;
import edtimplementation.ReferenceOfLinkedComponentDefinition;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLink;
import edtimplementation.RequestLinkActivatableFifo;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.RequestReferenceInstance;
import edtimplementation.RequestServerInstance;
import edtimplementation.RequestServiceInstance;
import edtimplementation.ServiceOfLinkedComponentDefinition;
import technology.ecoa.implementation._2.ClientsType;
import technology.ecoa.implementation._2.OpRefActivatable;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.ServerType;
import technology.ecoa.implementation._2.impFactory;

/**
 * Convert EDT Objects to ECOA Objects
 * 
 */
public class ComponentImplementationRequestLinkExportConverter {
	private static final impFactory IMPFACTORY = impFactory.eINSTANCE;

	private ComponentImplementationRequestLinkExportConverter() {

	}

	/**
	 * Convert EDT RequestLinks to ECOA RequestLinks
	 * 
	 * @param edtRequestLinks : EDT objects to convert
	 * @return ecoaRequestLinks: Converted objects
	 */
	public static ArrayList<technology.ecoa.implementation._2.RequestLink> recreateECOARequestLinks(
			ArrayList<RequestLink> edtRequestLinks) {
		ArrayList<technology.ecoa.implementation._2.RequestLink> ecoaRequestLinks = new ArrayList<>();

		HashMap<OpServer, ArrayList<OpClient>> requestLinkAssociation = new HashMap<>();

//		Recreate links
		for (RequestLink edtOperationLink : edtRequestLinks) {
			convertEDTRequestLinksToHashMap(requestLinkAssociation, edtOperationLink);
		}

		for (Entry<OpServer, ArrayList<OpClient>> entry : requestLinkAssociation.entrySet()) {
			OpServer server = entry.getKey();
			ArrayList<OpClient> clients = entry.getValue();

			technology.ecoa.implementation._2.RequestLink ecoaRequestLink = IMPFACTORY.createRequestLink();
			ServerType serverType = IMPFACTORY.createServerType();
			if (server instanceof OpRef op) {
				technology.ecoa.implementation._2.OpRef opRef = IMPFACTORY.createOpRef();

				if (op.id != null) {
					ecoaRequestLink.setId(op.id);
				}

				opRef.setInstanceName(((ReferenceOfLinkedComponentDefinition) op.server.eContainer()).getName());
				opRef.setOperationName(op.server.getName());

				serverType.setReference(opRef);

			} else if (server instanceof OpActivableFifo op) {
				OpRefActivatableFifo opRefActivatableFifo = IMPFACTORY.createOpRefActivatableFifo();

				if (op.id != null) {
					ecoaRequestLink.setId(op.id);
				}
				if (op.activating != null) {
					opRefActivatableFifo.setActivating(op.activating);
				}

				if (op.fifo != null) {
					opRefActivatableFifo.setFifoSize(op.fifo);
				}

				opRefActivatableFifo.setInstanceName(((ModuleInstance) op.server.eContainer()).getName());
				opRefActivatableFifo.setOperationName(op.server.getName());

				serverType.setModuleInstance(opRefActivatableFifo);
			}
			ecoaRequestLink.setServer(serverType);

			ClientsType clientsType = IMPFACTORY.createClientsType();
			for (OpClient client : clients) {
				if (client instanceof OpActivating op) {
					OpRefActivatable opRefActivatable = IMPFACTORY.createOpRefActivatable();

					if (op.activating != null) {
						opRefActivatable.setActivating(op.activating);
					}

					opRefActivatable.setInstanceName(((ModuleInstance) op.client.eContainer()).getName());
					opRefActivatable.setOperationName(op.client.getName());

					clientsType.getModuleInstance().add(opRefActivatable);

				} else if (client instanceof OpServ op) {

					technology.ecoa.implementation._2.OpRef opRef = IMPFACTORY.createOpRef();

					opRef.setInstanceName(((ServiceOfLinkedComponentDefinition) op.client.eContainer()).getName());
					opRef.setOperationName(op.client.getName());

					clientsType.getService().add(opRef);
				}
			}
			ecoaRequestLink.setClients(clientsType);
			ecoaRequestLinks.add(ecoaRequestLink);
		}
		return ecoaRequestLinks;
	}

	/**
	 * @param requestLinkAssociation
	 * @param edtOperationLink
	 */
	private static void convertEDTRequestLinksToHashMap(HashMap<OpServer, ArrayList<OpClient>> requestLinkAssociation,
			RequestLink edtOperationLink) {
		Integer id = null;
		if (edtOperationLink.isSetId()) {
			id = edtOperationLink.getId();
		}

		if (edtOperationLink instanceof RequestLinkActivatingToReferenceOperation requestLink
				&& requestLink.getClient() != null && requestLink.getServer() != null) {
			RequestReferenceInstance server = requestLink.getServer();

			OpRef opRef = new OpRef(id, server);

			RequestClientInstance client = requestLink.getClient();
			Boolean activating = null;
			if (requestLink.isSetClientActivating()) {
				activating = requestLink.isClientActivating();
			}
			OpActivating opActivating = new OpActivating(activating, client);
			requestLinkAssociation.putIfAbsent(opRef, new ArrayList<>());
			requestLinkAssociation.get(opRef).add(opActivating);

		} else if (edtOperationLink instanceof RequestLinkActivatableFifo requestLink && requestLink.getClient() != null
				&& requestLink.getServer() != null) {
			RequestServerInstance server = requestLink.getServer();
			BigInteger serverFifoSize = null;
			if (requestLink.isSetServerFifoSize()) {
				serverFifoSize = requestLink.getServerFifoSize();
			}

			Boolean activating = null;
			if (requestLink.isSetServerActivating()) {
				activating = requestLink.isServerActivating();
			}

			OpActivableFifo opActivableFifo = new OpActivableFifo(id, serverFifoSize, activating, server);

			RequestServiceInstance client = requestLink.getClient();
			OpServ opServ = new OpServ(client);

			requestLinkAssociation.putIfAbsent(opActivableFifo, new ArrayList<>());
			requestLinkAssociation.get(opActivableFifo).add(opServ);
		} else if (edtOperationLink instanceof RequestLinkActivatingActivatableFifo requestLink
				&& requestLink.getClient() != null && requestLink.getServer() != null) {
			RequestServerInstance server = requestLink.getServer();
			BigInteger serverFifoSize = null;
			if (requestLink.isSetServerFifoSize()) {
				serverFifoSize = requestLink.getServerFifoSize();
			}

			Boolean serverActivating = null;
			if (requestLink.isSetServerActivating()) {
				serverActivating = requestLink.isServerActivating();
			}

			OpActivableFifo opActivableFifo = new OpActivableFifo(id, serverFifoSize, serverActivating, server);

			RequestClientInstance client = requestLink.getClient();

			Boolean clientActivating = null;
			if (requestLink.isSetClientActivating()) {
				clientActivating = requestLink.isClientActivating();
			}

			OpActivating opActivating = new OpActivating(clientActivating, client);

			requestLinkAssociation.putIfAbsent(opActivableFifo, new ArrayList<>());
			requestLinkAssociation.get(opActivableFifo).add(opActivating);
		}
	}

	static interface OpClient {

	}

	static class OpActivating implements OpClient {
		protected Boolean activating;
		protected RequestClientInstance client;

		public OpActivating(Boolean activating, RequestClientInstance client) {
			this.activating = activating;
			this.client = client;
		}

		@Override
		public int hashCode() {
			return Objects.hash(activating, client);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpActivating other = (OpActivating) obj;
			return Objects.equals(activating, other.activating) && Objects.equals(client, other.client);
		}
	}

	static class OpServ implements OpClient {
		protected RequestServiceInstance client;

		public OpServ(RequestServiceInstance client) {
			this.client = client;
		}

		@Override
		public int hashCode() {
			return Objects.hash(client);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpServ other = (OpServ) obj;
			return Objects.equals(client, other.client);
		}
	}

	static interface OpServer {

	}

	static class OpActivableFifo implements OpServer {
		protected Integer id;
		protected RequestServerInstance server;
		protected Boolean activating;
		protected BigInteger fifo;

		public OpActivableFifo(Integer id, BigInteger fifo, Boolean activating, RequestServerInstance server) {
			this.activating = activating;
			this.fifo = fifo;
			this.id = id;
			this.server = server;
		}

		@Override
		public int hashCode() {
			return Objects.hash(activating, fifo, id, server);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpActivableFifo other = (OpActivableFifo) obj;
			return Objects.equals(activating, other.activating) && Objects.equals(fifo, other.fifo)
					&& Objects.equals(id, other.id) && Objects.equals(server, other.server);
		}

	}

	static class OpRef implements OpServer {
		protected Integer id;
		protected RequestReferenceInstance server;

		public OpRef(Integer id, RequestReferenceInstance server) {
			this.id = id;
			this.server = server;
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, server);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OpRef other = (OpRef) obj;
			return Objects.equals(id, other.id) && Objects.equals(server, other.server);
		}
	}
}
