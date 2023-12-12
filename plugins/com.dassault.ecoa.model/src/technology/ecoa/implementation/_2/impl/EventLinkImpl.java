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

import technology.ecoa.implementation._2.EventLink;
import technology.ecoa.implementation._2.ReceiversType;
import technology.ecoa.implementation._2.SendersType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.EventLinkImpl#getSenders <em>Senders</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.EventLinkImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.EventLinkImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventLinkImpl extends MinimalEObjectImpl.Container implements EventLink {
	/**
	 * The cached value of the '{@link #getSenders() <em>Senders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenders()
	 * @generated
	 * @ordered
	 */
	protected SendersType senders;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected ReceiversType receivers;

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
	protected EventLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.EVENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendersType getSenders() {
		return senders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSenders(SendersType newSenders, NotificationChain msgs) {
		SendersType oldSenders = senders;
		senders = newSenders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.EVENT_LINK__SENDERS, oldSenders, newSenders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenders(SendersType newSenders) {
		if (newSenders != senders) {
			NotificationChain msgs = null;
			if (senders != null)
				msgs = ((InternalEObject)senders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.EVENT_LINK__SENDERS, null, msgs);
			if (newSenders != null)
				msgs = ((InternalEObject)newSenders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.EVENT_LINK__SENDERS, null, msgs);
			msgs = basicSetSenders(newSenders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.EVENT_LINK__SENDERS, newSenders, newSenders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiversType getReceivers() {
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivers(ReceiversType newReceivers, NotificationChain msgs) {
		ReceiversType oldReceivers = receivers;
		receivers = newReceivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.EVENT_LINK__RECEIVERS, oldReceivers, newReceivers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivers(ReceiversType newReceivers) {
		if (newReceivers != receivers) {
			NotificationChain msgs = null;
			if (receivers != null)
				msgs = ((InternalEObject)receivers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.EVENT_LINK__RECEIVERS, null, msgs);
			if (newReceivers != null)
				msgs = ((InternalEObject)newReceivers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.EVENT_LINK__RECEIVERS, null, msgs);
			msgs = basicSetReceivers(newReceivers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.EVENT_LINK__RECEIVERS, newReceivers, newReceivers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.EVENT_LINK__ID, oldId, id, !oldIdESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, impPackage.EVENT_LINK__ID, oldId, ID_EDEFAULT, oldIdESet));
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
			case impPackage.EVENT_LINK__SENDERS:
				return basicSetSenders(null, msgs);
			case impPackage.EVENT_LINK__RECEIVERS:
				return basicSetReceivers(null, msgs);
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
			case impPackage.EVENT_LINK__SENDERS:
				return getSenders();
			case impPackage.EVENT_LINK__RECEIVERS:
				return getReceivers();
			case impPackage.EVENT_LINK__ID:
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
			case impPackage.EVENT_LINK__SENDERS:
				setSenders((SendersType)newValue);
				return;
			case impPackage.EVENT_LINK__RECEIVERS:
				setReceivers((ReceiversType)newValue);
				return;
			case impPackage.EVENT_LINK__ID:
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
			case impPackage.EVENT_LINK__SENDERS:
				setSenders((SendersType)null);
				return;
			case impPackage.EVENT_LINK__RECEIVERS:
				setReceivers((ReceiversType)null);
				return;
			case impPackage.EVENT_LINK__ID:
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
			case impPackage.EVENT_LINK__SENDERS:
				return senders != null;
			case impPackage.EVENT_LINK__RECEIVERS:
				return receivers != null;
			case impPackage.EVENT_LINK__ID:
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

} //EventLinkImpl
