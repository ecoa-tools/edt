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

import edtqos.Data;
import edtqos.EdtqosPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtqos.impl.DataImpl#getHighestRateNumberOfOccurrences <em>Highest
 * Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getHighestRateTimeFrame <em>Highest Rate Time
 * Frame</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getLowestRateNumberOfOccurrences <em>Lowest
 * Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getLowestRateTimeFrame <em>Lowest Rate Time
 * Frame</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getName <em>Name</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getMaxAgeing <em>Max Ageing</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getNotificationMaxHandlingTime
 * <em>Notification Max Handling Time</em>}</li>
 * <li>{@link edtqos.impl.DataImpl#getServiceDefinitionData <em>Service
 * Definition Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The default value of the '{@link #getMaxAgeing() <em>Max Ageing</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxAgeing()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_AGEING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAgeing() <em>Max Ageing</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxAgeing()
	 * @generated
	 * @ordered
	 */
	protected double maxAgeing = MAX_AGEING_EDEFAULT;

	/**
	 * This is true if the Max Ageing attribute has been set. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxAgeingESet;

	/**
	 * The default value of the '{@link #getNotificationMaxHandlingTime()
	 * <em>Notification Max Handling Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNotificationMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNotificationMaxHandlingTime()
	 * <em>Notification Max Handling Time</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getNotificationMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double notificationMaxHandlingTime = NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Notification Max Handling Time attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean notificationMaxHandlingTimeESet;

	/**
	 * The cached value of the '{@link #getServiceDefinitionData() <em>Service
	 * Definition Data</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getServiceDefinitionData()
	 * @generated
	 * @ordered
	 */
	protected edtinterface.Data serviceDefinitionData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtqosPackage.Literals.DATA;
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
					EdtqosPackage.DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES, oldHighestRateNumberOfOccurrences,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES,
					oldLowestRateNumberOfOccurrences, lowestRateNumberOfOccurrences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getMaxAgeing() {
		return maxAgeing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxAgeing(double newMaxAgeing) {
		double oldMaxAgeing = maxAgeing;
		maxAgeing = newMaxAgeing;
		boolean oldMaxAgeingESet = maxAgeingESet;
		maxAgeingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__MAX_AGEING, oldMaxAgeing,
					maxAgeing, !oldMaxAgeingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetMaxAgeing() {
		double oldMaxAgeing = maxAgeing;
		boolean oldMaxAgeingESet = maxAgeingESet;
		maxAgeing = MAX_AGEING_EDEFAULT;
		maxAgeingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.DATA__MAX_AGEING, oldMaxAgeing,
					MAX_AGEING_EDEFAULT, oldMaxAgeingESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetMaxAgeing() {
		return maxAgeingESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getNotificationMaxHandlingTime() {
		return notificationMaxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNotificationMaxHandlingTime(double newNotificationMaxHandlingTime) {
		double oldNotificationMaxHandlingTime = notificationMaxHandlingTime;
		notificationMaxHandlingTime = newNotificationMaxHandlingTime;
		boolean oldNotificationMaxHandlingTimeESet = notificationMaxHandlingTimeESet;
		notificationMaxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME,
					oldNotificationMaxHandlingTime, notificationMaxHandlingTime, !oldNotificationMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetNotificationMaxHandlingTime() {
		double oldNotificationMaxHandlingTime = notificationMaxHandlingTime;
		boolean oldNotificationMaxHandlingTimeESet = notificationMaxHandlingTimeESet;
		notificationMaxHandlingTime = NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT;
		notificationMaxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME,
					oldNotificationMaxHandlingTime, NOTIFICATION_MAX_HANDLING_TIME_EDEFAULT,
					oldNotificationMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetNotificationMaxHandlingTime() {
		return notificationMaxHandlingTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public edtinterface.Data getServiceDefinitionData() {
		if (serviceDefinitionData != null && serviceDefinitionData.eIsProxy()) {
			InternalEObject oldServiceDefinitionData = (InternalEObject) serviceDefinitionData;
			serviceDefinitionData = (edtinterface.Data) eResolveProxy(oldServiceDefinitionData);
			if (serviceDefinitionData != oldServiceDefinitionData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtqosPackage.DATA__SERVICE_DEFINITION_DATA, oldServiceDefinitionData,
							serviceDefinitionData));
			}
		}
		return serviceDefinitionData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public edtinterface.Data basicGetServiceDefinitionData() {
		return serviceDefinitionData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setServiceDefinitionData(edtinterface.Data newServiceDefinitionData) {
		edtinterface.Data oldServiceDefinitionData = serviceDefinitionData;
		serviceDefinitionData = newServiceDefinitionData;
		/*
		 * The ServiceDefinition Data shall become null, only if it is removed (Sirius
		 * deletes the crossreference before, removing from the list
		 */
		if (serviceDefinitionData != null) {
			name = serviceDefinitionData.getName();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.DATA__SERVICE_DEFINITION_DATA,
					oldServiceDefinitionData, serviceDefinitionData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtqosPackage.DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return getHighestRateNumberOfOccurrences();
		case EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME:
			return getHighestRateTimeFrame();
		case EdtqosPackage.DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return getLowestRateNumberOfOccurrences();
		case EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME:
			return getLowestRateTimeFrame();
		case EdtqosPackage.DATA__NAME:
			return getName();
		case EdtqosPackage.DATA__MAX_AGEING:
			return getMaxAgeing();
		case EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
			return getNotificationMaxHandlingTime();
		case EdtqosPackage.DATA__SERVICE_DEFINITION_DATA:
			if (resolve)
				return getServiceDefinitionData();
			return basicGetServiceDefinitionData();
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
		case EdtqosPackage.DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME:
			setHighestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME:
			setLowestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.DATA__NAME:
			setName((String) newValue);
			return;
		case EdtqosPackage.DATA__MAX_AGEING:
			setMaxAgeing((Double) newValue);
			return;
		case EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
			setNotificationMaxHandlingTime((Double) newValue);
			return;
		case EdtqosPackage.DATA__SERVICE_DEFINITION_DATA:
			setServiceDefinitionData((edtinterface.Data) newValue);
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
		case EdtqosPackage.DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences(HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME:
			unsetHighestRateTimeFrame();
			return;
		case EdtqosPackage.DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences(LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME:
			unsetLowestRateTimeFrame();
			return;
		case EdtqosPackage.DATA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdtqosPackage.DATA__MAX_AGEING:
			unsetMaxAgeing();
			return;
		case EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
			unsetNotificationMaxHandlingTime();
			return;
		case EdtqosPackage.DATA__SERVICE_DEFINITION_DATA:
			setServiceDefinitionData((edtinterface.Data) null);
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
		case EdtqosPackage.DATA__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? highestRateNumberOfOccurrences != null
					: !HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(highestRateNumberOfOccurrences);
		case EdtqosPackage.DATA__HIGHEST_RATE_TIME_FRAME:
			return isSetHighestRateTimeFrame();
		case EdtqosPackage.DATA__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? lowestRateNumberOfOccurrences != null
					: !LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(lowestRateNumberOfOccurrences);
		case EdtqosPackage.DATA__LOWEST_RATE_TIME_FRAME:
			return isSetLowestRateTimeFrame();
		case EdtqosPackage.DATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdtqosPackage.DATA__MAX_AGEING:
			return isSetMaxAgeing();
		case EdtqosPackage.DATA__NOTIFICATION_MAX_HANDLING_TIME:
			return isSetNotificationMaxHandlingTime();
		case EdtqosPackage.DATA__SERVICE_DEFINITION_DATA:
			return serviceDefinitionData != null;
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
		result.append(", maxAgeing: ");
		if (maxAgeingESet)
			result.append(maxAgeing);
		else
			result.append("<unset>");
		result.append(", notificationMaxHandlingTime: ");
		if (notificationMaxHandlingTimeESet)
			result.append(notificationMaxHandlingTime);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

} // DataImpl
