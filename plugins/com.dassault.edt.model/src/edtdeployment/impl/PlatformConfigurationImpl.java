/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.dassault.edt.log.EDTLog;

import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.PlatformConfiguration;
import edtdeployment.PlatformMessage;
import edtlogical.LogicalComputingPlatform;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Platform Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.PlatformConfigurationImpl#getComputingNodeConfigurations <em>Computing Node Configurations</em>}</li>
 *   <li>{@link edtdeployment.impl.PlatformConfigurationImpl#getPlatformMessages <em>Platform Messages</em>}</li>
 *   <li>{@link edtdeployment.impl.PlatformConfigurationImpl#getEUIDs <em>EUI Ds</em>}</li>
 *   <li>{@link edtdeployment.impl.PlatformConfigurationImpl#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}</li>
 *   <li>{@link edtdeployment.impl.PlatformConfigurationImpl#getComputingPlatform <em>Computing Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlatformConfigurationImpl extends MinimalEObjectImpl.Container implements PlatformConfiguration {
	/**
	 * The cached value of the '{@link #getComputingNodeConfigurations()
	 * <em>Computing Node Configurations</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComputingNodeConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputingNodeConfiguration> computingNodeConfigurations;

	/**
	 * The cached value of the '{@link #getPlatformMessages() <em>Platform Messages</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPlatformMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformMessage> platformMessages;

	/**
	 * The default value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_DS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected String eUIDs = EUI_DS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultHandlerNotificationMaxNumber()
	 * <em>Fault Handler Notification Max Number</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT = new BigDecimal("8");

	/**
	 * The cached value of the '{@link #getFaultHandlerNotificationMaxNumber()
	 * <em>Fault Handler Notification Max Number</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal faultHandlerNotificationMaxNumber = FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT;

	/**
	 * This is true if the Fault Handler Notification Max Number attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean faultHandlerNotificationMaxNumberESet;

	/**
	 * The cached value of the '{@link #getComputingPlatform() <em>Computing Platform</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingPlatform computingPlatform;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtdeploymentPackage.Literals.PLATFORM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComputingNodeConfiguration> getComputingNodeConfigurations() {
		if (computingNodeConfigurations == null) {
			computingNodeConfigurations = new EObjectContainmentEList<ComputingNodeConfiguration>(ComputingNodeConfiguration.class, this, EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS);
		}
		return computingNodeConfigurations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlatformMessage> getPlatformMessages() {
		if (platformMessages == null) {
			platformMessages = new EObjectContainmentEList<PlatformMessage>(PlatformMessage.class, this, EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES);
		}
		return platformMessages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEUIDs() {
		return eUIDs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEUIDs(String newEUIDs) {
		String oldEUIDs = eUIDs;
		eUIDs = newEUIDs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.PLATFORM_CONFIGURATION__EUI_DS, oldEUIDs, eUIDs));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFaultHandlerNotificationMaxNumber() {
		return faultHandlerNotificationMaxNumber;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaultHandlerNotificationMaxNumber(BigDecimal newFaultHandlerNotificationMaxNumber) {
		BigDecimal oldFaultHandlerNotificationMaxNumber = faultHandlerNotificationMaxNumber;
		faultHandlerNotificationMaxNumber = newFaultHandlerNotificationMaxNumber;
		boolean oldFaultHandlerNotificationMaxNumberESet = faultHandlerNotificationMaxNumberESet;
		faultHandlerNotificationMaxNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER, oldFaultHandlerNotificationMaxNumber, faultHandlerNotificationMaxNumber, !oldFaultHandlerNotificationMaxNumberESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFaultHandlerNotificationMaxNumber() {
		BigDecimal oldFaultHandlerNotificationMaxNumber = faultHandlerNotificationMaxNumber;
		boolean oldFaultHandlerNotificationMaxNumberESet = faultHandlerNotificationMaxNumberESet;
		faultHandlerNotificationMaxNumber = FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT;
		faultHandlerNotificationMaxNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER, oldFaultHandlerNotificationMaxNumber, FAULT_HANDLER_NOTIFICATION_MAX_NUMBER_EDEFAULT, oldFaultHandlerNotificationMaxNumberESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFaultHandlerNotificationMaxNumber() {
		return faultHandlerNotificationMaxNumberESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingPlatform getComputingPlatform() {
		if (computingPlatform != null && computingPlatform.eIsProxy()) {
			InternalEObject oldComputingPlatform = (InternalEObject)computingPlatform;
			computingPlatform = (LogicalComputingPlatform)eResolveProxy(oldComputingPlatform);
			if (computingPlatform != oldComputingPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM, oldComputingPlatform, computingPlatform));
			}
		}
		return computingPlatform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingPlatform basicGetComputingPlatform() {
		return computingPlatform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setComputingPlatform(LogicalComputingPlatform newComputingPlatform) {
		LogicalComputingPlatform oldComputingPlatform = computingPlatform;
		computingPlatform = newComputingPlatform;
		if (oldComputingPlatform != null && !Objects.equals(newComputingPlatform, oldComputingPlatform)
				&& !computingNodeConfigurations.isEmpty()) {
			EDTLog.toPopUpAndConsole(
					"Warning : The modification of the Computing Platform has impacts, see console for more details.",
					"The Computing Nodes of the Computing Node Configuration are cleared.");
			for (ComputingNodeConfiguration computingNodeConfiguration : computingNodeConfigurations) {
				computingNodeConfiguration.setComputingNode(null);
			}

		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM, oldComputingPlatform, computingPlatform));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS:
				return ((InternalEList<?>)getComputingNodeConfigurations()).basicRemove(otherEnd, msgs);
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return ((InternalEList<?>)getPlatformMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS:
				return getComputingNodeConfigurations();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return getPlatformMessages();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__EUI_DS:
				return getEUIDs();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				return getFaultHandlerNotificationMaxNumber();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				if (resolve) return getComputingPlatform();
				return basicGetComputingPlatform();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS:
				getComputingNodeConfigurations().clear();
				getComputingNodeConfigurations().addAll((Collection<? extends ComputingNodeConfiguration>)newValue);
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				getPlatformMessages().clear();
				getPlatformMessages().addAll((Collection<? extends PlatformMessage>)newValue);
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__EUI_DS:
				setEUIDs((String)newValue);
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				setFaultHandlerNotificationMaxNumber((BigDecimal)newValue);
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				setComputingPlatform((LogicalComputingPlatform)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS:
				getComputingNodeConfigurations().clear();
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				getPlatformMessages().clear();
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__EUI_DS:
				setEUIDs(EUI_DS_EDEFAULT);
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				unsetFaultHandlerNotificationMaxNumber();
				return;
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				setComputingPlatform((LogicalComputingPlatform)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_NODE_CONFIGURATIONS:
				return computingNodeConfigurations != null && !computingNodeConfigurations.isEmpty();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__PLATFORM_MESSAGES:
				return platformMessages != null && !platformMessages.isEmpty();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__EUI_DS:
				return EUI_DS_EDEFAULT == null ? eUIDs != null : !EUI_DS_EDEFAULT.equals(eUIDs);
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__FAULT_HANDLER_NOTIFICATION_MAX_NUMBER:
				return isSetFaultHandlerNotificationMaxNumber();
			case EdtdeploymentPackage.PLATFORM_CONFIGURATION__COMPUTING_PLATFORM:
				return computingPlatform != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (eUIDs: ");
		result.append(eUIDs);
		result.append(", faultHandlerNotificationMaxNumber: ");
		if (faultHandlerNotificationMaxNumberESet) result.append(faultHandlerNotificationMaxNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // PlatformConfigurationImpl
