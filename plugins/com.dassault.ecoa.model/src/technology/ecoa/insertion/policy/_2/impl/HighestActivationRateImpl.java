/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.HighestActivationRate;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Highest Activation Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl#getNumberOfActivations <em>Number Of Activations</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.HighestActivationRateImpl#getTimeFrame <em>Time Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighestActivationRateImpl extends MinimalEObjectImpl.Container implements HighestActivationRate {
	/**
	 * The default value of the '{@link #getNumberOfActivations() <em>Number Of Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActivations()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NUMBER_OF_ACTIVATIONS_EDEFAULT = new BigDecimal("1");

	/**
	 * The cached value of the '{@link #getNumberOfActivations() <em>Number Of Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfActivations()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal numberOfActivations = NUMBER_OF_ACTIVATIONS_EDEFAULT;

	/**
	 * This is true if the Number Of Activations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfActivationsESet;

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
	protected HighestActivationRateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.HIGHEST_ACTIVATION_RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNumberOfActivations() {
		return numberOfActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfActivations(BigDecimal newNumberOfActivations) {
		BigDecimal oldNumberOfActivations = numberOfActivations;
		numberOfActivations = newNumberOfActivations;
		boolean oldNumberOfActivationsESet = numberOfActivationsESet;
		numberOfActivationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS, oldNumberOfActivations, numberOfActivations, !oldNumberOfActivationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfActivations() {
		BigDecimal oldNumberOfActivations = numberOfActivations;
		boolean oldNumberOfActivationsESet = numberOfActivationsESet;
		numberOfActivations = NUMBER_OF_ACTIVATIONS_EDEFAULT;
		numberOfActivationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS, oldNumberOfActivations, NUMBER_OF_ACTIVATIONS_EDEFAULT, oldNumberOfActivationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfActivations() {
		return numberOfActivationsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME, oldTimeFrame, timeFrame, !oldTimeFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME, oldTimeFrame, TIME_FRAME_EDEFAULT, oldTimeFrameESet));
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
			case polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS:
				return getNumberOfActivations();
			case polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME:
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
			case polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS:
				setNumberOfActivations((BigDecimal)newValue);
				return;
			case polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME:
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
			case polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS:
				unsetNumberOfActivations();
				return;
			case polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME:
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
			case polPackage.HIGHEST_ACTIVATION_RATE__NUMBER_OF_ACTIVATIONS:
				return isSetNumberOfActivations();
			case polPackage.HIGHEST_ACTIVATION_RATE__TIME_FRAME:
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
		result.append(" (numberOfActivations: ");
		if (numberOfActivationsESet) result.append(numberOfActivations); else result.append("<unset>");
		result.append(", timeFrame: ");
		if (timeFrameESet) result.append(timeFrame); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HighestActivationRateImpl
