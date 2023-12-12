/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.interface_.qos._2.OperationRate;
import technology.ecoa.interface_.qos._2.qosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.OperationRateImpl#getNumberOfOccurrences <em>Number Of Occurrences</em>}</li>
 *   <li>{@link technology.ecoa.interface_.qos._2.impl.OperationRateImpl#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationRateImpl extends MinimalEObjectImpl.Container implements OperationRate {
	/**
	 * The default value of the '{@link #getNumberOfOccurrences() <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMBER_OF_OCCURRENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfOccurrences() <em>Number Of Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numberOfOccurrences = NUMBER_OF_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeFrame() <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_FRAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeFrame() <em>Time Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected double timeFrame = TIME_FRAME_EDEFAULT;

	/**
	 * This is true if the Time Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeFrameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return qosPackage.Literals.OPERATION_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNumberOfOccurrences() {
		return numberOfOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfOccurrences(BigDecimal newNumberOfOccurrences) {
		BigDecimal oldNumberOfOccurrences = numberOfOccurrences;
		numberOfOccurrences = newNumberOfOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.OPERATION_RATE__NUMBER_OF_OCCURRENCES, oldNumberOfOccurrences, numberOfOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeFrame() {
		return timeFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeFrame(double newTimeFrame) {
		double oldTimeFrame = timeFrame;
		timeFrame = newTimeFrame;
		boolean oldTimeFrameESet = timeFrameESet;
		timeFrameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, qosPackage.OPERATION_RATE__TIME_FRAME, oldTimeFrame, timeFrame, !oldTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeFrame() {
		double oldTimeFrame = timeFrame;
		boolean oldTimeFrameESet = timeFrameESet;
		timeFrame = TIME_FRAME_EDEFAULT;
		timeFrameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, qosPackage.OPERATION_RATE__TIME_FRAME, oldTimeFrame, TIME_FRAME_EDEFAULT, oldTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeFrame() {
		return timeFrameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case qosPackage.OPERATION_RATE__NUMBER_OF_OCCURRENCES:
				return getNumberOfOccurrences();
			case qosPackage.OPERATION_RATE__TIME_FRAME:
				return getTimeFrame();
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
			case qosPackage.OPERATION_RATE__NUMBER_OF_OCCURRENCES:
				setNumberOfOccurrences((BigDecimal)newValue);
				return;
			case qosPackage.OPERATION_RATE__TIME_FRAME:
				setTimeFrame((Double)newValue);
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
			case qosPackage.OPERATION_RATE__NUMBER_OF_OCCURRENCES:
				setNumberOfOccurrences(NUMBER_OF_OCCURRENCES_EDEFAULT);
				return;
			case qosPackage.OPERATION_RATE__TIME_FRAME:
				unsetTimeFrame();
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
			case qosPackage.OPERATION_RATE__NUMBER_OF_OCCURRENCES:
				return NUMBER_OF_OCCURRENCES_EDEFAULT == null ? numberOfOccurrences != null : !NUMBER_OF_OCCURRENCES_EDEFAULT.equals(numberOfOccurrences);
			case qosPackage.OPERATION_RATE__TIME_FRAME:
				return isSetTimeFrame();
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
		result.append(" (numberOfOccurrences: ");
		result.append(numberOfOccurrences);
		result.append(", timeFrame: ");
		if (timeFrameESet) result.append(timeFrame); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OperationRateImpl
