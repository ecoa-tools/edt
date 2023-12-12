/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestLinkActivatingToReferenceOperation;
import edtimplementation.RequestReferenceInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Link Activating To Reference Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl#getId <em>Id</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl#getClient <em>Client</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl#getServer <em>Server</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestLinkActivatingToReferenceOperationImpl#isClientActivating <em>Client Activating</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestLinkActivatingToReferenceOperationImpl extends MinimalEObjectImpl.Container implements RequestLinkActivatingToReferenceOperation {
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
	protected RequestReferenceInstance server;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestLinkActivatingToReferenceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID, oldId, ID_EDEFAULT, oldIdESet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT, oldClient, client));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestReferenceInstance getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (RequestReferenceInstance)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestReferenceInstance basicGetServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer(RequestReferenceInstance newServer) {
		RequestReferenceInstance oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER, oldServer, server));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING, oldClientActivating, clientActivating, !oldClientActivatingESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING, oldClientActivating, CLIENT_ACTIVATING_EDEFAULT, oldClientActivatingESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID:
				return getId();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING:
				return isClientActivating();
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
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID:
				setId((Integer)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT:
				setClient((RequestClientInstance)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER:
				setServer((RequestReferenceInstance)newValue);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING:
				setClientActivating((Boolean)newValue);
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
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID:
				unsetId();
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT:
				setClient((RequestClientInstance)null);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER:
				setServer((RequestReferenceInstance)null);
				return;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING:
				unsetClientActivating();
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
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__ID:
				return isSetId();
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT:
				return client != null;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__SERVER:
				return server != null;
			case EdtimplementationPackage.REQUEST_LINK_ACTIVATING_TO_REFERENCE_OPERATION__CLIENT_ACTIVATING:
				return isSetClientActivating();
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
		result.append(')');
		return result.toString();
	}

} //RequestLinkActivatingToReferenceOperationImpl
