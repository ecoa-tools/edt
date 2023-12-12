/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.IntegrityType;
import technology.ecoa.insertion.policy._2.QualityType;
import technology.ecoa.insertion.policy._2.TransportProtocol;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl#getMaxLatency <em>Max Latency</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl#getMinBandwidth <em>Min Bandwidth</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.TransportProtocolImpl#getQuality <em>Quality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransportProtocolImpl extends MinimalEObjectImpl.Container implements TransportProtocol {
	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final IntegrityType INTEGRITY_EDEFAULT = IntegrityType.HIGH;

	/**
	 * The cached value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected IntegrityType integrity = INTEGRITY_EDEFAULT;

	/**
	 * This is true if the Integrity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean integrityESet;

	/**
	 * The default value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected double maxLatency = MAX_LATENCY_EDEFAULT;

	/**
	 * This is true if the Max Latency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLatencyESet;

	/**
	 * The default value of the '{@link #getMinBandwidth() <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_BANDWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinBandwidth() <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBandwidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minBandwidth = MIN_BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final QualityType QUALITY_EDEFAULT = QualityType.LOSSLESS;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected QualityType quality = QUALITY_EDEFAULT;

	/**
	 * This is true if the Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.TRANSPORT_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityType getIntegrity() {
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegrity(IntegrityType newIntegrity) {
		IntegrityType oldIntegrity = integrity;
		integrity = newIntegrity == null ? INTEGRITY_EDEFAULT : newIntegrity;
		boolean oldIntegrityESet = integrityESet;
		integrityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.TRANSPORT_PROTOCOL__INTEGRITY, oldIntegrity, integrity, !oldIntegrityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntegrity() {
		IntegrityType oldIntegrity = integrity;
		boolean oldIntegrityESet = integrityESet;
		integrity = INTEGRITY_EDEFAULT;
		integrityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.TRANSPORT_PROTOCOL__INTEGRITY, oldIntegrity, INTEGRITY_EDEFAULT, oldIntegrityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntegrity() {
		return integrityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxLatency() {
		return maxLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLatency(double newMaxLatency) {
		double oldMaxLatency = maxLatency;
		maxLatency = newMaxLatency;
		boolean oldMaxLatencyESet = maxLatencyESet;
		maxLatencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY, oldMaxLatency, maxLatency, !oldMaxLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxLatency() {
		double oldMaxLatency = maxLatency;
		boolean oldMaxLatencyESet = maxLatencyESet;
		maxLatency = MAX_LATENCY_EDEFAULT;
		maxLatencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY, oldMaxLatency, MAX_LATENCY_EDEFAULT, oldMaxLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxLatency() {
		return maxLatencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinBandwidth() {
		return minBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBandwidth(BigInteger newMinBandwidth) {
		BigInteger oldMinBandwidth = minBandwidth;
		minBandwidth = newMinBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.TRANSPORT_PROTOCOL__MIN_BANDWIDTH, oldMinBandwidth, minBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityType getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(QualityType newQuality) {
		QualityType oldQuality = quality;
		quality = newQuality == null ? QUALITY_EDEFAULT : newQuality;
		boolean oldQualityESet = qualityESet;
		qualityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.TRANSPORT_PROTOCOL__QUALITY, oldQuality, quality, !oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuality() {
		QualityType oldQuality = quality;
		boolean oldQualityESet = qualityESet;
		quality = QUALITY_EDEFAULT;
		qualityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.TRANSPORT_PROTOCOL__QUALITY, oldQuality, QUALITY_EDEFAULT, oldQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuality() {
		return qualityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.TRANSPORT_PROTOCOL__INTEGRITY:
				return getIntegrity();
			case polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY:
				return getMaxLatency();
			case polPackage.TRANSPORT_PROTOCOL__MIN_BANDWIDTH:
				return getMinBandwidth();
			case polPackage.TRANSPORT_PROTOCOL__QUALITY:
				return getQuality();
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
			case polPackage.TRANSPORT_PROTOCOL__INTEGRITY:
				setIntegrity((IntegrityType)newValue);
				return;
			case polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY:
				setMaxLatency((Double)newValue);
				return;
			case polPackage.TRANSPORT_PROTOCOL__MIN_BANDWIDTH:
				setMinBandwidth((BigInteger)newValue);
				return;
			case polPackage.TRANSPORT_PROTOCOL__QUALITY:
				setQuality((QualityType)newValue);
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
			case polPackage.TRANSPORT_PROTOCOL__INTEGRITY:
				unsetIntegrity();
				return;
			case polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY:
				unsetMaxLatency();
				return;
			case polPackage.TRANSPORT_PROTOCOL__MIN_BANDWIDTH:
				setMinBandwidth(MIN_BANDWIDTH_EDEFAULT);
				return;
			case polPackage.TRANSPORT_PROTOCOL__QUALITY:
				unsetQuality();
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
			case polPackage.TRANSPORT_PROTOCOL__INTEGRITY:
				return isSetIntegrity();
			case polPackage.TRANSPORT_PROTOCOL__MAX_LATENCY:
				return isSetMaxLatency();
			case polPackage.TRANSPORT_PROTOCOL__MIN_BANDWIDTH:
				return MIN_BANDWIDTH_EDEFAULT == null ? minBandwidth != null : !MIN_BANDWIDTH_EDEFAULT.equals(minBandwidth);
			case polPackage.TRANSPORT_PROTOCOL__QUALITY:
				return isSetQuality();
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
		result.append(" (integrity: ");
		if (integrityESet) result.append(integrity); else result.append("<unset>");
		result.append(", maxLatency: ");
		if (maxLatencyESet) result.append(maxLatency); else result.append("<unset>");
		result.append(", minBandwidth: ");
		result.append(minBandwidth);
		result.append(", quality: ");
		if (qualityESet) result.append(quality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransportProtocolImpl
