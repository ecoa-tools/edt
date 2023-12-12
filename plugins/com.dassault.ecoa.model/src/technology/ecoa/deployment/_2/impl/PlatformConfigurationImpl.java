/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.deployment._2.ComputingNodeConfiguration;
import technology.ecoa.deployment._2.PlatformConfiguration;
import technology.ecoa.deployment._2.PlatformMessages;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl#getComputingNodeConfiguration <em>Computing Node Configuration</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl#getPlatformMessages <em>Platform Messages</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl#getComputingPlatform <em>Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl#getEUIDs <em>EUI Ds</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.PlatformConfigurationImpl#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformConfigurationImpl extends MinimalEObjectImpl.Container implements PlatformConfiguration {
	/**
	 * The cached value of the '{@link #getComputingNodeConfiguration() <em>Computing Node Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingNodeConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingNodeConfiguration> computingNodeConfiguration;

	/**
	 * The cached value of the '{@link #getPlatformMessages() <em>Platform Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformMessages> platformMessages;

	/**
	 * The default value of the '{@link #getComputingPlatform() <em>Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTING_PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputingPlatform() <em>Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected String computingPlatform = COMPUTING_PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_DS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected String eUIDs = EUI_DS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultHandlerNotificationMaxNumber() <em>Fault Handler Notification Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT = new BigDecimal("8");

	/**
	 * The cached value of the '{@link #getFaultHandlerNotificationMaxNumber() <em>Fault Handler Notification Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal faultHandlerNotificationMaxNumber = FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT;

	/**
	 * This is true if the Fault Handler Notification Max Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean faultHandlerNotificationMaxNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.PLATFORM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputingNodeConfiguration> getComputingNodeConfiguration() {
		if (computingNodeConfiguration == null) {
			computingNodeConfiguration = new EObjectContainmentEList<ComputingNodeConfiguration>(ComputingNodeConfiguration.class, this, depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION);
		}
		return computingNodeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformMessages> getPlatformMessages() {
		if (platformMessages == null) {
			platformMessages = new EObjectContainmentEList<PlatformMessages>(PlatformMessages.class, this, depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES);
		}
		return platformMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputingPlatform() {
		return computingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingPlatform(String newComputingPlatform) {
		String oldComputingPlatform = computingPlatform;
		computingPlatform = newComputingPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM, oldComputingPlatform, computingPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEUIDs() {
		return eUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUIDs(String newEUIDs) {
		String oldEUIDs = eUIDs;
		eUIDs = newEUIDs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PLATFORM_CONFIGURATION__EUI_DS, oldEUIDs, eUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getFaultHandlerNotificationMaxNumber() {
		return faultHandlerNotificationMaxNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaultHandlerNotificationMaxNumber(BigDecimal newFaultHandlerNotificationMaxNumber) {
		BigDecimal oldFaultHandlerNotificationMaxNumber = faultHandlerNotificationMaxNumber;
		faultHandlerNotificationMaxNumber = newFaultHandlerNotificationMaxNumber;
		boolean oldFaultHandlerNotificationMaxNumberESet = faultHandlerNotificationMaxNumberESet;
		faultHandlerNotificationMaxNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER, oldFaultHandlerNotificationMaxNumber, faultHandlerNotificationMaxNumber, !oldFaultHandlerNotificationMaxNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFaultHandlerNotificationMaxNumber() {
		BigDecimal oldFaultHandlerNotificationMaxNumber = faultHandlerNotificationMaxNumber;
		boolean oldFaultHandlerNotificationMaxNumberESet = faultHandlerNotificationMaxNumberESet;
		faultHandlerNotificationMaxNumber = FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT;
		faultHandlerNotificationMaxNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER, oldFaultHandlerNotificationMaxNumber, FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT, oldFaultHandlerNotificationMaxNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFaultHandlerNotificationMaxNumber() {
		return faultHandlerNotificationMaxNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION:
				return ((InternalEList<?>)getComputingNodeConfiguration()).basicRemove(otherEnd, msgs);
			case depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return ((InternalEList<?>)getPlatformMessages()).basicRemove(otherEnd, msgs);
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
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION:
				return getComputingNodeConfiguration();
			case depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return getPlatformMessages();
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				return getComputingPlatform();
			case depPackage.PLATFORM_CONFIGURATION__EUI_DS:
				return getEUIDs();
			case depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				return getFaultHandlerNotificationMaxNumber();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION:
				getComputingNodeConfiguration().clear();
				getComputingNodeConfiguration().addAll((Collection<? extends ComputingNodeConfiguration>)newValue);
				return;
			case depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				getPlatformMessages().clear();
				getPlatformMessages().addAll((Collection<? extends PlatformMessages>)newValue);
				return;
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				setComputingPlatform((String)newValue);
				return;
			case depPackage.PLATFORM_CONFIGURATION__EUI_DS:
				setEUIDs((String)newValue);
				return;
			case depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				setFaultHandlerNotificationMaxNumber((BigDecimal)newValue);
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
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION:
				getComputingNodeConfiguration().clear();
				return;
			case depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				getPlatformMessages().clear();
				return;
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				setComputingPlatform(COMPUTING_PLATFORM_EDEFAULT);
				return;
			case depPackage.PLATFORM_CONFIGURATION__EUI_DS:
				setEUIDs(EUI_DS_EDEFAULT);
				return;
			case depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				unsetFaultHandlerNotificationMaxNumber();
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
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATION:
				return computingNodeConfiguration != null && !computingNodeConfiguration.isEmpty();
			case depPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return platformMessages != null && !platformMessages.isEmpty();
			case depPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				return COMPUTING_PLATFORM_EDEFAULT == null ? computingPlatform != null : !COMPUTING_PLATFORM_EDEFAULT.equals(computingPlatform);
			case depPackage.PLATFORM_CONFIGURATION__EUI_DS:
				return EUI_DS_EDEFAULT == null ? eUIDs != null : !EUI_DS_EDEFAULT.equals(eUIDs);
			case depPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				return isSetFaultHandlerNotificationMaxNumber();
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
		result.append(" (computingPlatform: ");
		result.append(computingPlatform);
		result.append(", eUIDs: ");
		result.append(eUIDs);
		result.append(", faultHandlerNotificationMaxNumber: ");
		if (faultHandlerNotificationMaxNumberESet) result.append(faultHandlerNotificationMaxNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlatformConfigurationImpl
