/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.logicalsystem._2.LatencyType1;
import technology.ecoa.logicalsystem._2.LinkType1;
import technology.ecoa.logicalsystem._2.ThroughputType1;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl#getLatency <em>Latency</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl#getFrom <em>From</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkType1Impl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkType1Impl extends MinimalEObjectImpl.Container implements LinkType1 {
	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected ThroughputType1 throughput;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected LatencyType1 latency;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LINK_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputType1 getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(ThroughputType1 newThroughput, NotificationChain msgs) {
		ThroughputType1 oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(ThroughputType1 newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE1__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE1__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyType1 getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(LatencyType1 newLatency, NotificationChain msgs) {
		LatencyType1 oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__LATENCY, oldLatency, newLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(LatencyType1 newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE1__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE1__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE1__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LINK_TYPE1__THROUGHPUT:
				return basicSetThroughput(null, msgs);
			case logPackage.LINK_TYPE1__LATENCY:
				return basicSetLatency(null, msgs);
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
			case logPackage.LINK_TYPE1__THROUGHPUT:
				return getThroughput();
			case logPackage.LINK_TYPE1__LATENCY:
				return getLatency();
			case logPackage.LINK_TYPE1__FROM:
				return getFrom();
			case logPackage.LINK_TYPE1__ID:
				return getId();
			case logPackage.LINK_TYPE1__TO:
				return getTo();
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
			case logPackage.LINK_TYPE1__THROUGHPUT:
				setThroughput((ThroughputType1)newValue);
				return;
			case logPackage.LINK_TYPE1__LATENCY:
				setLatency((LatencyType1)newValue);
				return;
			case logPackage.LINK_TYPE1__FROM:
				setFrom((String)newValue);
				return;
			case logPackage.LINK_TYPE1__ID:
				setId((String)newValue);
				return;
			case logPackage.LINK_TYPE1__TO:
				setTo((String)newValue);
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
			case logPackage.LINK_TYPE1__THROUGHPUT:
				setThroughput((ThroughputType1)null);
				return;
			case logPackage.LINK_TYPE1__LATENCY:
				setLatency((LatencyType1)null);
				return;
			case logPackage.LINK_TYPE1__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case logPackage.LINK_TYPE1__ID:
				setId(ID_EDEFAULT);
				return;
			case logPackage.LINK_TYPE1__TO:
				setTo(TO_EDEFAULT);
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
			case logPackage.LINK_TYPE1__THROUGHPUT:
				return throughput != null;
			case logPackage.LINK_TYPE1__LATENCY:
				return latency != null;
			case logPackage.LINK_TYPE1__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case logPackage.LINK_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case logPackage.LINK_TYPE1__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
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
		result.append(" (from: ");
		result.append(from);
		result.append(", id: ");
		result.append(id);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //LinkType1Impl
