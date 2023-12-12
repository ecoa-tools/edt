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
import edtqos.RequestResponse;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Request
 * Response</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtqos.impl.RequestResponseImpl#getHighestRateNumberOfOccurrences
 * <em>Highest Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getHighestRateTimeFrame
 * <em>Highest Rate Time Frame</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getLowestRateNumberOfOccurrences
 * <em>Lowest Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getLowestRateTimeFrame <em>Lowest
 * Rate Time Frame</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getName <em>Name</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getCallbackMaxHandlingTime
 * <em>Callback Max Handling Time</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getMaxResponseTime <em>Max
 * Response Time</em>}</li>
 * <li>{@link edtqos.impl.RequestResponseImpl#getServiceDefinitionRequestResponse
 * <em>Service Definition Request Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestResponseImpl extends MinimalEObjectImpl.Container implements RequestResponse {
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
	 * The default value of the '{@link #getCallbackMaxHandlingTime() <em>Callback
	 * Max Handling Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getCallbackMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double CALLBACK_MAX_HANDLING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCallbackMaxHandlingTime() <em>Callback
	 * Max Handling Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getCallbackMaxHandlingTime()
	 * @generated
	 * @ordered
	 */
	protected double callbackMaxHandlingTime = CALLBACK_MAX_HANDLING_TIME_EDEFAULT;

	/**
	 * This is true if the Callback Max Handling Time attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean callbackMaxHandlingTimeESet;

	/**
	 * The default value of the '{@link #getMaxResponseTime() <em>Max Response
	 * Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_RESPONSE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxResponseTime() <em>Max Response
	 * Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected double maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Max Response Time attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean maxResponseTimeESet;

	/**
	 * The cached value of the '{@link #getServiceDefinitionRequestResponse()
	 * <em>Service Definition Request Response</em>}' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceDefinitionRequestResponse()
	 * @generated
	 * @ordered
	 */
	protected edtinterface.RequestResponse serviceDefinitionRequestResponse;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequestResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtqosPackage.Literals.REQUEST_RESPONSE;
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
					EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES,
					oldHighestRateNumberOfOccurrences, highestRateNumberOfOccurrences));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME, oldHighestRateTimeFrame,
					highestRateTimeFrame, !oldHighestRateTimeFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME, oldHighestRateTimeFrame,
					HIGHEST_RATE_TIME_FRAME_EDEFAULT, oldHighestRateTimeFrameESet));
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
					EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES, oldLowestRateNumberOfOccurrences,
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME, oldLowestRateTimeFrame, lowestRateTimeFrame,
					!oldLowestRateTimeFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME, oldLowestRateTimeFrame,
					LOWEST_RATE_TIME_FRAME_EDEFAULT, oldLowestRateTimeFrameESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.REQUEST_RESPONSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getCallbackMaxHandlingTime() {
		return callbackMaxHandlingTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCallbackMaxHandlingTime(double newCallbackMaxHandlingTime) {
		double oldCallbackMaxHandlingTime = callbackMaxHandlingTime;
		callbackMaxHandlingTime = newCallbackMaxHandlingTime;
		boolean oldCallbackMaxHandlingTimeESet = callbackMaxHandlingTimeESet;
		callbackMaxHandlingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME, oldCallbackMaxHandlingTime,
					callbackMaxHandlingTime, !oldCallbackMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetCallbackMaxHandlingTime() {
		double oldCallbackMaxHandlingTime = callbackMaxHandlingTime;
		boolean oldCallbackMaxHandlingTimeESet = callbackMaxHandlingTimeESet;
		callbackMaxHandlingTime = CALLBACK_MAX_HANDLING_TIME_EDEFAULT;
		callbackMaxHandlingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME, oldCallbackMaxHandlingTime,
					CALLBACK_MAX_HANDLING_TIME_EDEFAULT, oldCallbackMaxHandlingTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetCallbackMaxHandlingTime() {
		return callbackMaxHandlingTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public double getMaxResponseTime() {
		return maxResponseTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setMaxResponseTime(double newMaxResponseTime) {
		double oldMaxResponseTime = maxResponseTime;
		maxResponseTime = newMaxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME,
					oldMaxResponseTime, maxResponseTime, !oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetMaxResponseTime() {
		double oldMaxResponseTime = maxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;
		maxResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME,
					oldMaxResponseTime, MAX_RESPONSE_TIME_EDEFAULT, oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetMaxResponseTime() {
		return maxResponseTimeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public edtinterface.RequestResponse getServiceDefinitionRequestResponse() {
		if (serviceDefinitionRequestResponse != null && serviceDefinitionRequestResponse.eIsProxy()) {
			InternalEObject oldServiceDefinitionRequestResponse = (InternalEObject) serviceDefinitionRequestResponse;
			serviceDefinitionRequestResponse = (edtinterface.RequestResponse) eResolveProxy(
					oldServiceDefinitionRequestResponse);
			if (serviceDefinitionRequestResponse != oldServiceDefinitionRequestResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE,
							oldServiceDefinitionRequestResponse, serviceDefinitionRequestResponse));
			}
		}
		return serviceDefinitionRequestResponse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public edtinterface.RequestResponse basicGetServiceDefinitionRequestResponse() {
		return serviceDefinitionRequestResponse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setServiceDefinitionRequestResponse(edtinterface.RequestResponse newServiceDefinitionRequestResponse) {
		edtinterface.RequestResponse oldServiceDefinitionRequestResponse = serviceDefinitionRequestResponse;
		serviceDefinitionRequestResponse = newServiceDefinitionRequestResponse;
		/*
		 * The ServiceDefinition RequestResponse shall become null, only if it is
		 * removed (Sirius deletes the crossreference before, removing from the list
		 */
		if (serviceDefinitionRequestResponse != null) {
			name = serviceDefinitionRequestResponse.getName();
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE,
					oldServiceDefinitionRequestResponse, serviceDefinitionRequestResponse));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return getHighestRateNumberOfOccurrences();
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME:
			return getHighestRateTimeFrame();
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return getLowestRateNumberOfOccurrences();
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME:
			return getLowestRateTimeFrame();
		case EdtqosPackage.REQUEST_RESPONSE__NAME:
			return getName();
		case EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
			return getCallbackMaxHandlingTime();
		case EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
			return getMaxResponseTime();
		case EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE:
			if (resolve)
				return getServiceDefinitionRequestResponse();
			return basicGetServiceDefinitionRequestResponse();
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
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME:
			setHighestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences((BigDecimal) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME:
			setLowestRateTimeFrame((Double) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__NAME:
			setName((String) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
			setCallbackMaxHandlingTime((Double) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
			setMaxResponseTime((Double) newValue);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE:
			setServiceDefinitionRequestResponse((edtinterface.RequestResponse) newValue);
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
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			setHighestRateNumberOfOccurrences(HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME:
			unsetHighestRateTimeFrame();
			return;
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			setLowestRateNumberOfOccurrences(LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME:
			unsetLowestRateTimeFrame();
			return;
		case EdtqosPackage.REQUEST_RESPONSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
			unsetCallbackMaxHandlingTime();
			return;
		case EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
			unsetMaxResponseTime();
			return;
		case EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE:
			setServiceDefinitionRequestResponse((edtinterface.RequestResponse) null);
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
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_NUMBER_OF_OCCURRENCES:
			return HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? highestRateNumberOfOccurrences != null
					: !HIGHEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(highestRateNumberOfOccurrences);
		case EdtqosPackage.REQUEST_RESPONSE__HIGHEST_RATE_TIME_FRAME:
			return isSetHighestRateTimeFrame();
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_NUMBER_OF_OCCURRENCES:
			return LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT == null ? lowestRateNumberOfOccurrences != null
					: !LOWEST_RATE_NUMBER_OF_OCCURRENCES_EDEFAULT.equals(lowestRateNumberOfOccurrences);
		case EdtqosPackage.REQUEST_RESPONSE__LOWEST_RATE_TIME_FRAME:
			return isSetLowestRateTimeFrame();
		case EdtqosPackage.REQUEST_RESPONSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EdtqosPackage.REQUEST_RESPONSE__CALLBACK_MAX_HANDLING_TIME:
			return isSetCallbackMaxHandlingTime();
		case EdtqosPackage.REQUEST_RESPONSE__MAX_RESPONSE_TIME:
			return isSetMaxResponseTime();
		case EdtqosPackage.REQUEST_RESPONSE__SERVICE_DEFINITION_REQUEST_RESPONSE:
			return serviceDefinitionRequestResponse != null;
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
		result.append(", callbackMaxHandlingTime: ");
		if (callbackMaxHandlingTimeESet)
			result.append(callbackMaxHandlingTime);
		else
			result.append("<unset>");
		result.append(", maxResponseTime: ");
		if (maxResponseTimeESet)
			result.append(maxResponseTime);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

} // RequestResponseImpl
