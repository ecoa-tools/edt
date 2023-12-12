/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

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

import technology.ecoa.deployment._2.Deployment;
import technology.ecoa.deployment._2.LogPolicy;
import technology.ecoa.deployment._2.PlatformConfiguration;
import technology.ecoa.deployment._2.ProtectionDomain;
import technology.ecoa.deployment._2.WireMapping;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getProtectionDomain <em>Protection Domain</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getLogPolicy <em>Log Policy</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getPlatformConfiguration <em>Platform Configuration</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getWireMapping <em>Wire Mapping</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.DeploymentImpl#getLogicalSystem <em>Logical System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The cached value of the '{@link #getProtectionDomain() <em>Protection Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionDomain> protectionDomain;

	/**
	 * The cached value of the '{@link #getLogPolicy() <em>Log Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<LogPolicy> logPolicy;

	/**
	 * The cached value of the '{@link #getPlatformConfiguration() <em>Platform Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformConfiguration> platformConfiguration;

	/**
	 * The cached value of the '{@link #getWireMapping() <em>Wire Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<WireMapping> wireMapping;

	/**
	 * The default value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected static final String FINAL_ASSEMBLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected String finalAssembly = FINAL_ASSEMBLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalSystem() <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGICAL_SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalSystem() <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected String logicalSystem = LOGICAL_SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtectionDomain> getProtectionDomain() {
		if (protectionDomain == null) {
			protectionDomain = new EObjectContainmentEList<ProtectionDomain>(ProtectionDomain.class, this, depPackage.DEPLOYMENT__PROTECTION_DOMAIN);
		}
		return protectionDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogPolicy> getLogPolicy() {
		if (logPolicy == null) {
			logPolicy = new EObjectContainmentEList<LogPolicy>(LogPolicy.class, this, depPackage.DEPLOYMENT__LOG_POLICY);
		}
		return logPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlatformConfiguration> getPlatformConfiguration() {
		if (platformConfiguration == null) {
			platformConfiguration = new EObjectContainmentEList<PlatformConfiguration>(PlatformConfiguration.class, this, depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION);
		}
		return platformConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WireMapping> getWireMapping() {
		if (wireMapping == null) {
			wireMapping = new EObjectContainmentEList<WireMapping>(WireMapping.class, this, depPackage.DEPLOYMENT__WIRE_MAPPING);
		}
		return wireMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalAssembly(String newFinalAssembly) {
		String oldFinalAssembly = finalAssembly;
		finalAssembly = newFinalAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYMENT__FINAL_ASSEMBLY, oldFinalAssembly, finalAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogicalSystem() {
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalSystem(String newLogicalSystem) {
		String oldLogicalSystem = logicalSystem;
		logicalSystem = newLogicalSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DEPLOYMENT__LOGICAL_SYSTEM, oldLogicalSystem, logicalSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.DEPLOYMENT__PROTECTION_DOMAIN:
				return ((InternalEList<?>)getProtectionDomain()).basicRemove(otherEnd, msgs);
			case depPackage.DEPLOYMENT__LOG_POLICY:
				return ((InternalEList<?>)getLogPolicy()).basicRemove(otherEnd, msgs);
			case depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION:
				return ((InternalEList<?>)getPlatformConfiguration()).basicRemove(otherEnd, msgs);
			case depPackage.DEPLOYMENT__WIRE_MAPPING:
				return ((InternalEList<?>)getWireMapping()).basicRemove(otherEnd, msgs);
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
			case depPackage.DEPLOYMENT__PROTECTION_DOMAIN:
				return getProtectionDomain();
			case depPackage.DEPLOYMENT__LOG_POLICY:
				return getLogPolicy();
			case depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION:
				return getPlatformConfiguration();
			case depPackage.DEPLOYMENT__WIRE_MAPPING:
				return getWireMapping();
			case depPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				return getFinalAssembly();
			case depPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				return getLogicalSystem();
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
			case depPackage.DEPLOYMENT__PROTECTION_DOMAIN:
				getProtectionDomain().clear();
				getProtectionDomain().addAll((Collection<? extends ProtectionDomain>)newValue);
				return;
			case depPackage.DEPLOYMENT__LOG_POLICY:
				getLogPolicy().clear();
				getLogPolicy().addAll((Collection<? extends LogPolicy>)newValue);
				return;
			case depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION:
				getPlatformConfiguration().clear();
				getPlatformConfiguration().addAll((Collection<? extends PlatformConfiguration>)newValue);
				return;
			case depPackage.DEPLOYMENT__WIRE_MAPPING:
				getWireMapping().clear();
				getWireMapping().addAll((Collection<? extends WireMapping>)newValue);
				return;
			case depPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				setFinalAssembly((String)newValue);
				return;
			case depPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				setLogicalSystem((String)newValue);
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
			case depPackage.DEPLOYMENT__PROTECTION_DOMAIN:
				getProtectionDomain().clear();
				return;
			case depPackage.DEPLOYMENT__LOG_POLICY:
				getLogPolicy().clear();
				return;
			case depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION:
				getPlatformConfiguration().clear();
				return;
			case depPackage.DEPLOYMENT__WIRE_MAPPING:
				getWireMapping().clear();
				return;
			case depPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				setFinalAssembly(FINAL_ASSEMBLY_EDEFAULT);
				return;
			case depPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				setLogicalSystem(LOGICAL_SYSTEM_EDEFAULT);
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
			case depPackage.DEPLOYMENT__PROTECTION_DOMAIN:
				return protectionDomain != null && !protectionDomain.isEmpty();
			case depPackage.DEPLOYMENT__LOG_POLICY:
				return logPolicy != null && !logPolicy.isEmpty();
			case depPackage.DEPLOYMENT__PLATFORM_CONFIGURATION:
				return platformConfiguration != null && !platformConfiguration.isEmpty();
			case depPackage.DEPLOYMENT__WIRE_MAPPING:
				return wireMapping != null && !wireMapping.isEmpty();
			case depPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				return FINAL_ASSEMBLY_EDEFAULT == null ? finalAssembly != null : !FINAL_ASSEMBLY_EDEFAULT.equals(finalAssembly);
			case depPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				return LOGICAL_SYSTEM_EDEFAULT == null ? logicalSystem != null : !LOGICAL_SYSTEM_EDEFAULT.equals(logicalSystem);
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
		result.append(" (finalAssembly: ");
		result.append(finalAssembly);
		result.append(", logicalSystem: ");
		result.append(logicalSystem);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
