/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtlogical.EdtlogicalPackage;
import edtlogical.LogicalComputingNode;
import edtlogical.LogicalComputingNodeLink;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Logical
 * Computing Node Link</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtlogical.impl.LogicalComputingNodeLinkImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeLinkImpl#getThroughputMegaBytesPerSecond
 * <em>Throughput Mega Bytes Per Second</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeLinkImpl#getLatencyMicroSeconds
 * <em>Latency Micro Seconds</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeLinkImpl#getFrom
 * <em>From</em>}</li>
 * <li>{@link edtlogical.impl.LogicalComputingNodeLinkImpl#getTo
 * <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComputingNodeLinkImpl extends MinimalEObjectImpl.Container implements LogicalComputingNodeLink {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputMegaBytesPerSecond()
	 * <em>Throughput Mega Bytes Per Second</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getThroughputMegaBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THROUGHPUT_MEGA_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputMegaBytesPerSecond()
	 * <em>Throughput Mega Bytes Per Second</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getThroughputMegaBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected BigInteger throughputMegaBytesPerSecond = THROUGHPUT_MEGA_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyMicroSeconds() <em>Latency Micro
	 * Seconds</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLatencyMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LATENCY_MICRO_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatencyMicroSeconds() <em>Latency Micro
	 * Seconds</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLatencyMicroSeconds()
	 * @generated
	 * @ordered
	 */
	protected BigInteger latencyMicroSeconds = LATENCY_MICRO_SECONDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingNode from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingNode to;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LogicalComputingNodeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtlogicalPackage.Literals.LOGICAL_COMPUTING_NODE_LINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID,
					oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getThroughputMegaBytesPerSecond() {
		return throughputMegaBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setThroughputMegaBytesPerSecond(BigInteger newThroughputMegaBytesPerSecond) {
		BigInteger oldThroughputMegaBytesPerSecond = throughputMegaBytesPerSecond;
		throughputMegaBytesPerSecond = newThroughputMegaBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND,
					oldThroughputMegaBytesPerSecond, throughputMegaBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigInteger getLatencyMicroSeconds() {
		return latencyMicroSeconds;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLatencyMicroSeconds(BigInteger newLatencyMicroSeconds) {
		BigInteger oldLatencyMicroSeconds = latencyMicroSeconds;
		latencyMicroSeconds = newLatencyMicroSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS, oldLatencyMicroSeconds,
					latencyMicroSeconds));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalComputingNode getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (LogicalComputingNode) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingNode basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFrom(LogicalComputingNode newFrom) {
		LogicalComputingNode oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM,
					oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalComputingNode getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (LogicalComputingNode) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LogicalComputingNode basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTo(LogicalComputingNode newTo) {
		LogicalComputingNode oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO,
					oldTo, to));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID:
			return getId();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND:
			return getThroughputMegaBytesPerSecond();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS:
			return getLatencyMicroSeconds();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID:
			setId((String) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND:
			setThroughputMegaBytesPerSecond((BigInteger) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS:
			setLatencyMicroSeconds((BigInteger) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM:
			setFrom((LogicalComputingNode) newValue);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO:
			setTo((LogicalComputingNode) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID:
			setId(ID_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND:
			setThroughputMegaBytesPerSecond(THROUGHPUT_MEGA_BYTES_PER_SECOND_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS:
			setLatencyMicroSeconds(LATENCY_MICRO_SECONDS_EDEFAULT);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM:
			setFrom((LogicalComputingNode) null);
			return;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO:
			setTo((LogicalComputingNode) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__THROUGHPUT_MEGA_BYTES_PER_SECOND:
			return THROUGHPUT_MEGA_BYTES_PER_SECOND_EDEFAULT == null ? throughputMegaBytesPerSecond != null
					: !THROUGHPUT_MEGA_BYTES_PER_SECOND_EDEFAULT.equals(throughputMegaBytesPerSecond);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__LATENCY_MICRO_SECONDS:
			return LATENCY_MICRO_SECONDS_EDEFAULT == null ? latencyMicroSeconds != null
					: !LATENCY_MICRO_SECONDS_EDEFAULT.equals(latencyMicroSeconds);
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__FROM:
			return from != null;
		case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK__TO:
			return to != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", throughputMegaBytesPerSecond: ");
		result.append(throughputMegaBytesPerSecond);
		result.append(", latencyMicroSeconds: ");
		result.append(latencyMicroSeconds);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getLatencyMicroSeconds() != null && this.getFrom() != null && this.getTo() != null
				&& this.getThroughputMegaBytesPerSecond() != null);
	}

} // LogicalComputingNodeLinkImpl
