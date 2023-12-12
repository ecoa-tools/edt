/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtqos.EdtqosPackage;
import edtqos.Event;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Event</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtqos.impl.EventImpl#getHighestRateNumberOfOccurrences
 * <em>Highest Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getHighestRateTimeFrame <em>Highest Rate
 * Time Frame</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getLowestRateNumberOfOccurrences <em>Lowest
 * Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getLowestRateTimeFrame <em>Lowest Rate Time
 * Frame</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getName <em>Name</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getMaxHandlingTime <em>Max Handling
 * Time</em>}</li>
 * <li>{@link edtqos.impl.EventImpl#getServiceDefinitionEvent <em>Service
 * Definition Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The default value of the '{@link #getHighestRateNumberOfOccurrences()
	 * <em>Highest Rate Number Of Occurrences</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getHighestRateNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHighestRateNumberOfOccurrences()
	 * <em>Highest Rate Number Of Occurrences</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getHighestRateNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal highestRateNumberOfOccurrences = HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHighestRateTimeFrame() <em>Highest Rate
	 * Time Frame</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHighestRateTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected static final double HIGHEST_RATE_TIME_FRAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHighestRateTimeFrame() <em>Highest Rate
	 * Time Frame</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHighestRateTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected double highestRateTimeFrame = HIGHEST_RATE_TIME_FRAME_EDEFAULT;

	/**
	 * This is true if the Highest Rate Time Frame attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean highestRateTimeFrameESet;

	/**
	 * The default value of the '{@link #getLowestRateNumberOfOccurrences()
	 * <em>Lowest Rate Number Of Occurrences</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLowestRateNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowestRateNumberOfOccurrences()
	 * <em>Lowest Rate Number Of Occurrences</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getLowestRateNumberOfOccurrences()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lowestRateNumberOfOccurrences = LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowestRateTimeFrame() <em>Lowest Rate
	 * Time Frame</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLowestRateTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWEST_RATE_TIME_FRAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLowestRateTimeFrame() <em>Lowest Rate
	 * Time Frame</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLowestRateTimeFrame()
	 * @generated
	 * @ordered
	 */
	protected double lowestRateTimeFrame = LOWEST_RATE_TIME_FRAME_EDEFAULT;

	/**
	 * This is true if the Lowest Rate Time Frame attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean lowestRateTimeFrameESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxHandlingTime() <em>Max Handling
	 * Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxHandlingTime() <em>Max Handling
	 * Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double maxHandlingTime = MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Max Handling Time attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxHandlingTimeESet;

	/**
	 * The cached value of the '{@link #getServiceDefinitionEvent() <em>Service
	 * Definition Event</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getServiceDefinitionEvent()
	 * @generated
	 * @ordered
	 */
	protected edtinterface.Event serviceDefinitionEvent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtqosPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getHighestRateNumberOfOccurrences() {
		return highestRateNumberOfOccurrences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHighestRateNumberOfOccurrences(BigDecimal newHighestRateNumberOfOccurrences) {
		BigDecimal oldHighestRateNumberOfOccurrences = highestRateNumberOfOccurrences;
		highestRateNumberOfOccurrences = newHighestRateNumberOfOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES, oldHighestRateNumberOfOccurrences,
					highestRateNumberOfOccurrences));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getHighestRateTimeFrame() {
		return highestRateTimeFrame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setHighestRateTimeFrame(double newHighestRateTimeFrame) {
		double oldHighestRateTimeFrame = highestRateTimeFrame;
		highestRateTimeFrame = newHighestRateTimeFrame;
		boolean oldHighestRateTimeFrameESet = highestRateTimeFrameESet;
		highestRateTimeFrameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME,
					oldHighestRateTimeFrame, highestRateTimeFrame, !oldHighestRateTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetHighestRateTimeFrame() {
		double oldHighestRateTimeFrame = highestRateTimeFrame;
		boolean oldHighestRateTimeFrameESet = highestRateTimeFrameESet;
		highestRateTimeFrame = HIGHEST_RATE_TIME_FRAME_EDEFAULT;
		highestRateTimeFrameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME,
					oldHighestRateTimeFrame, HIGHEST_RATE_TIME_FRAME_EDEFAULT, oldHighestRateTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetHighestRateTimeFrame() {
		return highestRateTimeFrameESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getLowestRateNumberOfOccurrences() {
		return lowestRateNumberOfOccurrences;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLowestRateNumberOfOccurrences(BigDecimal newLowestRateNumberOfOccurrences) {
		BigDecimal oldLowestRateNumberOfOccurrences = lowestRateNumberOfOccurrences;
		lowestRateNumberOfOccurrences = newLowestRateNumberOfOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES, oldLowestRateNumberOfOccurrences,
					lowestRateNumberOfOccurrences));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getLowestRateTimeFrame() {
		return lowestRateTimeFrame;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLowestRateTimeFrame(double newLowestRateTimeFrame) {
		double oldLowestRateTimeFrame = lowestRateTimeFrame;
		lowestRateTimeFrame = newLowestRateTimeFrame;
		boolean oldLowestRateTimeFrameESet = lowestRateTimeFrameESet;
		lowestRateTimeFrameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME,
					oldLowestRateTimeFrame, lowestRateTimeFrame, !oldLowestRateTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetLowestRateTimeFrame() {
		double oldLowestRateTimeFrame = lowestRateTimeFrame;
		boolean oldLowestRateTimeFrameESet = lowestRateTimeFrameESet;
		lowestRateTimeFrame = LOWEST_RATE_TIME_FRAME_EDEFAULT;
		lowestRateTimeFrameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME,
					oldLowestRateTimeFrame, LOWEST_RATE_TIME_FRAME_EDEFAULT, oldLowestRateTimeFrameESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetLowestRateTimeFrame() {
		return lowestRateTimeFrameESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getMaxHandlingTime() {
		return maxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxHandlingTime(double newMaxHandlingTime) {
		double oldMaxHandlingTime = maxHandlingTime;
		maxHandlingTime = newMaxHandlingTime;
		boolean oldMaxHandlingTimeESet = maxHandlingTimeESet;
		maxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.EVENT__MAX_HANDLING_TIME,
					oldMaxHandlingTime, maxHandlingTime, !oldMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetMaxHandlingTime() {
		double oldMaxHandlingTime = maxHandlingTime;
		boolean oldMaxHandlingTimeESet = maxHandlingTimeESet;
		maxHandlingTime = MAX_HANDLING_TIME_EDEFAULT;
		maxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.EVENT__MAX_HANDLING_TIME,
					oldMaxHandlingTime, MAX_HANDLING_TIME_EDEFAULT, oldMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetMaxHandlingTime() {
		return maxHandlingTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public edtinterface.Event getServiceDefinitionEvent() {
		if (serviceDefinitionEvent != null && serviceDefinitionEvent.eIsProxy()) {
			InternalEObject oldServiceDefinitionEvent = (InternalEObject) serviceDefinitionEvent;
			serviceDefinitionEvent = (edtinterface.Event) eResolveProxy(oldServiceDefinitionEvent);
			if (serviceDefinitionEvent != oldServiceDefinitionEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT, oldServiceDefinitionEvent,
							serviceDefinitionEvent));
			}
		}
		return serviceDefinitionEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public edtinterface.Event basicGetServiceDefinitionEvent() {
		return serviceDefinitionEvent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setServiceDefinitionEvent(edtinterface.Event newServiceDefinitionEvent) {
		edtinterface.Event oldServiceDefinitionEvent = serviceDefinitionEvent;
		serviceDefinitionEvent = newServiceDefinitionEvent;
		/*
		 * The ServiceDefinition Event shall become null, only if it is removed (Sirius
		 * deletes the crossreference before, removing from the list
		 */
		if (serviceDefinitionEvent != null) {
			name = serviceDefinitionEvent.getName();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT,
					oldServiceDefinitionEvent, serviceDefinitionEvent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtqosPackage.EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return getHighestRateNumberOfOccurrences();
		case EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME:
			return getHighestRateTimeFrame();
		case EdtqosPackage.EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return getLowestRateNumberOfOccurrences();
		case EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME:
			return getLowestRateTimeFrame();
		case EdtqosPackage.EVENT__NAME:
			return getName();
		case EdtqosPackage.EVENT__MAX_HANDLING_TIME:
			return getMaxHandlingTime();
		case EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT:
			if (resolve)
				return getServiceDefinitionEvent();
			return basicGetServiceDefinitionEvent();
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
		case EdtqosPackage.EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME:
			setHighestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME:
			setLowestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.EVENT__NAME:
			setName((String) newValue);
			return;
		case EdtqosPackage.EVENT__MAX_HANDLING_TIME:
			setMaxHandlingTime((Double) newValue);
			return;
		case EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT:
			setServiceDefinitionEvent((edtinterface.Event) newValue);
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
		case EdtqosPackage.EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences(HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME:
			unsetHighestRateTimeFrame();
			return;
		case EdtqosPackage.EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences(LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME:
			unsetLowestRateTimeFrame();
			return;
		case EdtqosPackage.EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdtqosPackage.EVENT__MAX_HANDLING_TIME:
			unsetMaxHandlingTime();
			return;
		case EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT:
			setServiceDefinitionEvent((edtinterface.Event) null);
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
		case EdtqosPackage.EVENT__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? highestRateNumberOfOccurrences != null
					: !HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(highestRateNumberOfOccurrences);
		case EdtqosPackage.EVENT__HIGHEST_RATE_TIME_FRAME:
			return isSetHighestRateTimeFrame();
		case EdtqosPackage.EVENT__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? lowestRateNumberOfOccurrences != null
					: !LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(lowestRateNumberOfOccurrences);
		case EdtqosPackage.EVENT__LOWEST_RATE_TIME_FRAME:
			return isSetLowestRateTimeFrame();
		case EdtqosPackage.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdtqosPackage.EVENT__MAX_HANDLING_TIME:
			return isSetMaxHandlingTime();
		case EdtqosPackage.EVENT__SERVICE_DEFINITION_EVENT:
			return serviceDefinitionEvent != null;
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
		result.append(" (highestRateNumberOfOccurrences: ");
		result.append(highestRateNumberOfOccurrences);
		result.append(", highestRateTimeFrame: ");
		if (highestRateTimeFrameESet)
			result.append(highestRateTimeFrame);
		else
			result.append("<unset>");
		result.append(", lowestRateNumberOfOccurrences: ");
		result.append(lowestRateNumberOfOccurrences);
		result.append(", lowestRateTimeFrame: ");
		if (lowestRateTimeFrameESet)
			result.append(lowestRateTimeFrame);
		else
			result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", maxHandlingTime: ");
		if (maxHandlingTimeESet)
			result.append(maxHandlingTime);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

} // EventImpl
