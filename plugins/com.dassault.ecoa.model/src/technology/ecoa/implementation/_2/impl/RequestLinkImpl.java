/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.ClientsType;
import technology.ecoa.implementation._2.RequestLink;
import technology.ecoa.implementation._2.ServerType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.RequestLinkImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.RequestLinkImpl#getServer <em>Server</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.RequestLinkImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestLinkImpl extends MinimalEObjectImpl.Container implements RequestLink {
	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected ClientsType clients;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected ServerType server;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.REQUEST_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientsType getClients() {
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClients(ClientsType newClients, NotificationChain msgs) {
		ClientsType oldClients = clients;
		clients = newClients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_LINK__CLIENTS, oldClients, newClients);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClients(ClientsType newClients) {
		if (newClients != clients) {
			NotificationChain msgs = null;
			if (clients != null)
				msgs = ((InternalEObject)clients).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.REQUEST_LINK__CLIENTS, null, msgs);
			if (newClients != null)
				msgs = ((InternalEObject)newClients).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.REQUEST_LINK__CLIENTS, null, msgs);
			msgs = basicSetClients(newClients, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_LINK__CLIENTS, newClients, newClients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerType getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(ServerType newServer, NotificationChain msgs) {
		ServerType oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_LINK__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(ServerType newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.REQUEST_LINK__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.REQUEST_LINK__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_LINK__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.REQUEST_LINK__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		int oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.REQUEST_LINK__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.REQUEST_LINK__CLIENTS:
				return basicSetClients(null, msgs);
			case impPackage.REQUEST_LINK__SERVER:
				return basicSetServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.REQUEST_LINK__CLIENTS:
				return getClients();
			case impPackage.REQUEST_LINK__SERVER:
				return getServer();
			case impPackage.REQUEST_LINK__ID:
				return getId();
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
			case impPackage.REQUEST_LINK__CLIENTS:
				setClients((ClientsType)newValue);
				return;
			case impPackage.REQUEST_LINK__SERVER:
				setServer((ServerType)newValue);
				return;
			case impPackage.REQUEST_LINK__ID:
				setId((Integer)newValue);
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
			case impPackage.REQUEST_LINK__CLIENTS:
				setClients((ClientsType)null);
				return;
			case impPackage.REQUEST_LINK__SERVER:
				setServer((ServerType)null);
				return;
			case impPackage.REQUEST_LINK__ID:
				unsetId();
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
			case impPackage.REQUEST_LINK__CLIENTS:
				return clients != null;
			case impPackage.REQUEST_LINK__SERVER:
				return server != null;
			case impPackage.REQUEST_LINK__ID:
				return isSetId();
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
		result.append(')');
		return result.toString();
	}

} //RequestLinkImpl
