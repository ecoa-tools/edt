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

import technology.ecoa.logicalsystem._2.LatencyType;
import technology.ecoa.logicalsystem._2.LinkType;
import technology.ecoa.logicalsystem._2.ThroughputType;
import technology.ecoa.logicalsystem._2.TransportBindingType;
import technology.ecoa.logicalsystem._2.logPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getTransportBinding <em>Transport Binding</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.impl.LinkTypeImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkTypeImpl extends MinimalEObjectImpl.Container implements LinkType {
	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected ThroughputType throughput;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected LatencyType latency;

	/**
	 * The cached value of the '{@link #getTransportBinding() <em>Transport Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportBinding()
	 * @generated
	 * @ordered
	 */
	protected TransportBindingType transportBinding;

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
	protected LinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return logPackage.Literals.LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputType getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(ThroughputType newThroughput, NotificationChain msgs) {
		ThroughputType oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(ThroughputType newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject)throughput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject)newThroughput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__THROUGHPUT, newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatencyType getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(LatencyType newLatency, NotificationChain msgs) {
		LatencyType oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__LATENCY, oldLatency, newLatency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(LatencyType newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject)latency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject)newLatency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__LATENCY, newLatency, newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportBindingType getTransportBinding() {
		return transportBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportBinding(TransportBindingType newTransportBinding, NotificationChain msgs) {
		TransportBindingType oldTransportBinding = transportBinding;
		transportBinding = newTransportBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__TRANSPORT_BINDING, oldTransportBinding, newTransportBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportBinding(TransportBindingType newTransportBinding) {
		if (newTransportBinding != transportBinding) {
			NotificationChain msgs = null;
			if (transportBinding != null)
				msgs = ((InternalEObject)transportBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__TRANSPORT_BINDING, null, msgs);
			if (newTransportBinding != null)
				msgs = ((InternalEObject)newTransportBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - logPackage.LINK_TYPE__TRANSPORT_BINDING, null, msgs);
			msgs = basicSetTransportBinding(newTransportBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__TRANSPORT_BINDING, newTransportBinding, newTransportBinding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__FROM, oldFrom, from));
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
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, logPackage.LINK_TYPE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case logPackage.LINK_TYPE__THROUGHPUT:
				return basicSetThroughput(null, msgs);
			case logPackage.LINK_TYPE__LATENCY:
				return basicSetLatency(null, msgs);
			case logPackage.LINK_TYPE__TRANSPORT_BINDING:
				return basicSetTransportBinding(null, msgs);
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
			case logPackage.LINK_TYPE__THROUGHPUT:
				return getThroughput();
			case logPackage.LINK_TYPE__LATENCY:
				return getLatency();
			case logPackage.LINK_TYPE__TRANSPORT_BINDING:
				return getTransportBinding();
			case logPackage.LINK_TYPE__FROM:
				return getFrom();
			case logPackage.LINK_TYPE__ID:
				return getId();
			case logPackage.LINK_TYPE__TO:
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
			case logPackage.LINK_TYPE__THROUGHPUT:
				setThroughput((ThroughputType)newValue);
				return;
			case logPackage.LINK_TYPE__LATENCY:
				setLatency((LatencyType)newValue);
				return;
			case logPackage.LINK_TYPE__TRANSPORT_BINDING:
				setTransportBinding((TransportBindingType)newValue);
				return;
			case logPackage.LINK_TYPE__FROM:
				setFrom((String)newValue);
				return;
			case logPackage.LINK_TYPE__ID:
				setId((String)newValue);
				return;
			case logPackage.LINK_TYPE__TO:
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
			case logPackage.LINK_TYPE__THROUGHPUT:
				setThroughput((ThroughputType)null);
				return;
			case logPackage.LINK_TYPE__LATENCY:
				setLatency((LatencyType)null);
				return;
			case logPackage.LINK_TYPE__TRANSPORT_BINDING:
				setTransportBinding((TransportBindingType)null);
				return;
			case logPackage.LINK_TYPE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case logPackage.LINK_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case logPackage.LINK_TYPE__TO:
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
			case logPackage.LINK_TYPE__THROUGHPUT:
				return throughput != null;
			case logPackage.LINK_TYPE__LATENCY:
				return latency != null;
			case logPackage.LINK_TYPE__TRANSPORT_BINDING:
				return transportBinding != null;
			case logPackage.LINK_TYPE__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case logPackage.LINK_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case logPackage.LINK_TYPE__TO:
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

} //LinkTypeImpl
