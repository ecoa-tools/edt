/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLinkActivatingActivatableFifo;
import edtimplementation.RequestServerInstance;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Link Activating Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#getClient <em>Client</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#getServer <em>Server</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#isClientActivating <em>Client Activating</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#getServerFifoSize <em>Server Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingActivatableFifoImpl#isServerActivating <em>Server Activating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestLinkActivatingActivatableFifoImpl extends MinimalEObjectImpl.Container implements RequestLinkActivatingActivatableFifo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected RequestClientInstance client;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected RequestServerInstance server;

	/**
	 * The default value of the '{@link #isClientActivating() <em>Client Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClientActivating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLIENT_ACTIVATING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isClientActivating() <em>Client Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClientActivating()
	 * @generated
	 * @ordered
	 */
	protected boolean clientActivating = CLIENT_ACTIVATING_EDEFAULT;

	/**
	 * This is true if the Client Activating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clientActivatingESet;

	/**
	 * The default value of the '{@link #getServerFifoSize() <em>Server Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerFifoSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SERVER_FIFO_SIZE_EDEFAULT = new BigInteger("8");

	/**
	 * The cached value of the '{@link #getServerFifoSize() <em>Server Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerFifoSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger serverFifoSize = SERVER_FIFO_SIZE_EDEFAULT;

	/**
	 * This is true if the Server Fifo Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverFifoSizeESet;

	/**
	 * The default value of the '{@link #isServerActivating() <em>Server Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServerActivating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVER_ACTIVATING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isServerActivating() <em>Server Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServerActivating()
	 * @generated
	 * @ordered
	 */
	protected boolean serverActivating = SERVER_ACTIVATING_EDEFAULT;

	/**
	 * This is true if the Server Activating attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverActivatingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestLinkActivatingActivatableFifoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestClientInstance getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (RequestClientInstance)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestClientInstance basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClient(RequestClientInstance newClient) {
		RequestClientInstance oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestServerInstance getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (RequestServerInstance)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestServerInstance basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer(RequestServerInstance newServer) {
		RequestServerInstance oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER, oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isClientActivating() {
		return clientActivating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientActivating(boolean newClientActivating) {
		boolean oldClientActivating = clientActivating;
		clientActivating = newClientActivating;
		boolean oldClientActivatingESet = clientActivatingESet;
		clientActivatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING, oldClientActivating, clientActivating, !oldClientActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetClientActivating() {
		boolean oldClientActivating = clientActivating;
		boolean oldClientActivatingESet = clientActivatingESet;
		clientActivating = CLIENT_ACTIVATING_EDEFAULT;
		clientActivatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING, oldClientActivating, CLIENT_ACTIVATING_EDEFAULT, oldClientActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetClientActivating() {
		return clientActivatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getServerFifoSize() {
		return serverFifoSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerFifoSize(BigInteger newServerFifoSize) {
		BigInteger oldServerFifoSize = serverFifoSize;
		serverFifoSize = newServerFifoSize;
		boolean oldServerFifoSizeESet = serverFifoSizeESet;
		serverFifoSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE, oldServerFifoSize, serverFifoSize, !oldServerFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServerFifoSize() {
		BigInteger oldServerFifoSize = serverFifoSize;
		boolean oldServerFifoSizeESet = serverFifoSizeESet;
		serverFifoSize = SERVER_FIFO_SIZE_EDEFAULT;
		serverFifoSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE, oldServerFifoSize, SERVER_FIFO_SIZE_EDEFAULT, oldServerFifoSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServerFifoSize() {
		return serverFifoSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isServerActivating() {
		return serverActivating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerActivating(boolean newServerActivating) {
		boolean oldServerActivating = serverActivating;
		serverActivating = newServerActivating;
		boolean oldServerActivatingESet = serverActivatingESet;
		serverActivatingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING, oldServerActivating, serverActivating, !oldServerActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetServerActivating() {
		boolean oldServerActivating = serverActivating;
		boolean oldServerActivatingESet = serverActivatingESet;
		serverActivating = SERVER_ACTIVATING_EDEFAULT;
		serverActivatingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING, oldServerActivating, SERVER_ACTIVATING_EDEFAULT, oldServerActivatingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetServerActivating() {
		return serverActivatingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID:
				return getId();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING:
				return isClientActivating();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE:
				return getServerFifoSize();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING:
				return isServerActivating();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT:
				setClient((RequestClientInstance)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER:
				setServer((RequestServerInstance)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING:
				setClientActivating((Boolean)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE:
				setServerFifoSize((BigInteger)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING:
				setServerActivating((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID:
				unsetId();
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT:
				setClient((RequestClientInstance)null);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER:
				setServer((RequestServerInstance)null);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING:
				unsetClientActivating();
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE:
				unsetServerFifoSize();
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING:
				unsetServerActivating();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__ID:
				return isSetId();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT:
				return client != null;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER:
				return server != null;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__CLIENT_ACTIVATING:
				return isSetClientActivating();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_FIFO_SIZE:
				return isSetServerFifoSize();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_ACTIVATABLE_FIFO__SERVER_ACTIVATING:
				return isSetServerActivating();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", clientActivating: ");
		if (clientActivatingESet) result.append(clientActivating); else result.append("<unset>");
		result.append(", serverFifoSize: ");
		if (serverFifoSizeESet) result.append(serverFifoSize); else result.append("<unset>");
		result.append(", serverActivating: ");
		if (serverActivatingESet) result.append(serverActivating); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequestLinkActivatingActivatableFifoImpl
