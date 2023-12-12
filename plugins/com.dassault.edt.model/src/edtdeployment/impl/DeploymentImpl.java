/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtdeployment.Deployment;
import edtdeployment.EdtdeploymentPackage;
import edtdeployment.LogPolicy;
import edtdeployment.PlatformConfiguration;
import edtdeployment.ProtectionDomain;

import edtdeployment.WireMapping;
import edtlogical.LogicalSystem;

import edtproject.FinalAssembly;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getProtectionDomains <em>Protection Domains</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getLogPolicies <em>Log Policies</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getPlatformConfigurations <em>Platform Configurations</em>}</li>
 *   <li>{@link edtdeployment.impl.DeploymentImpl#getWireMappings <em>Wire Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalSystem() <em>Logical System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected LogicalSystem logicalSystem;

	/**
	 * The cached value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected FinalAssembly finalAssembly;

	/**
	 * The cached value of the '{@link #getProtectionDomains() <em>Protection Domains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionDomains()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionDomain> protectionDomains;

	/**
	 * The cached value of the '{@link #getLogPolicies() <em>Log Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<LogPolicy> logPolicies;

	/**
	 * The cached value of the '{@link #getPlatformConfigurations() <em>Platform Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<PlatformConfiguration> platformConfigurations;

	/**
	 * The cached value of the '{@link #getWireMappings() <em>Wire Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWireMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<WireMapping> wireMappings;

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
		return EdtdeploymentPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalSystem getLogicalSystem() {
		if (logicalSystem != null && logicalSystem.eIsProxy()) {
			InternalEObject oldLogicalSystem = (InternalEObject)logicalSystem;
			logicalSystem = (LogicalSystem)eResolveProxy(oldLogicalSystem);
			if (logicalSystem != oldLogicalSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM, oldLogicalSystem, logicalSystem));
			}
		}
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSystem basicGetLogicalSystem() {
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalSystem(LogicalSystem newLogicalSystem) {
		LogicalSystem oldLogicalSystem = logicalSystem;
		logicalSystem = newLogicalSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM, oldLogicalSystem, logicalSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalAssembly getFinalAssembly() {
		if (finalAssembly != null && finalAssembly.eIsProxy()) {
			InternalEObject oldFinalAssembly = (InternalEObject)finalAssembly;
			finalAssembly = (FinalAssembly)eResolveProxy(oldFinalAssembly);
			if (finalAssembly != oldFinalAssembly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY, oldFinalAssembly, finalAssembly));
			}
		}
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalAssembly basicGetFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalAssembly(FinalAssembly newFinalAssembly) {
		FinalAssembly oldFinalAssembly = finalAssembly;
		finalAssembly = newFinalAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY, oldFinalAssembly, finalAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtectionDomain> getProtectionDomains() {
		if (protectionDomains == null) {
			protectionDomains = new EObjectContainmentEList<ProtectionDomain>(ProtectionDomain.class, this, EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS);
		}
		return protectionDomains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LogPolicy> getLogPolicies() {
		if (logPolicies == null) {
			logPolicies = new EObjectContainmentEList<LogPolicy>(LogPolicy.class, this, EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES);
		}
		return logPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlatformConfiguration> getPlatformConfigurations() {
		if (platformConfigurations == null) {
			platformConfigurations = new EObjectContainmentEList<PlatformConfiguration>(PlatformConfiguration.class, this, EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS);
		}
		return platformConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WireMapping> getWireMappings() {
		if (wireMappings == null) {
			wireMappings = new EObjectContainmentEList<WireMapping>(WireMapping.class, this, EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS);
		}
		return wireMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS:
				return ((InternalEList<?>)getProtectionDomains()).basicRemove(otherEnd, msgs);
			case EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES:
				return ((InternalEList<?>)getLogPolicies()).basicRemove(otherEnd, msgs);
			case EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS:
				return ((InternalEList<?>)getPlatformConfigurations()).basicRemove(otherEnd, msgs);
			case EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS:
				return ((InternalEList<?>)getWireMappings()).basicRemove(otherEnd, msgs);
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
			case EdtdeploymentPackage.DEPLOYMENT__NAME:
				return getName();
			case EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				if (resolve) return getLogicalSystem();
				return basicGetLogicalSystem();
			case EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				if (resolve) return getFinalAssembly();
				return basicGetFinalAssembly();
			case EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS:
				return getProtectionDomains();
			case EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES:
				return getLogPolicies();
			case EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS:
				return getPlatformConfigurations();
			case EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS:
				return getWireMappings();
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
			case EdtdeploymentPackage.DEPLOYMENT__NAME:
				setName((String)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				setLogicalSystem((LogicalSystem)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				setFinalAssembly((FinalAssembly)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS:
				getProtectionDomains().clear();
				getProtectionDomains().addAll((Collection<? extends ProtectionDomain>)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES:
				getLogPolicies().clear();
				getLogPolicies().addAll((Collection<? extends LogPolicy>)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS:
				getPlatformConfigurations().clear();
				getPlatformConfigurations().addAll((Collection<? extends PlatformConfiguration>)newValue);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS:
				getWireMappings().clear();
				getWireMappings().addAll((Collection<? extends WireMapping>)newValue);
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
			case EdtdeploymentPackage.DEPLOYMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				setLogicalSystem((LogicalSystem)null);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				setFinalAssembly((FinalAssembly)null);
				return;
			case EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS:
				getProtectionDomains().clear();
				return;
			case EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES:
				getLogPolicies().clear();
				return;
			case EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS:
				getPlatformConfigurations().clear();
				return;
			case EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS:
				getWireMappings().clear();
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
			case EdtdeploymentPackage.DEPLOYMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtdeploymentPackage.DEPLOYMENT__LOGICAL_SYSTEM:
				return logicalSystem != null;
			case EdtdeploymentPackage.DEPLOYMENT__FINAL_ASSEMBLY:
				return finalAssembly != null;
			case EdtdeploymentPackage.DEPLOYMENT__PROTECTION_DOMAINS:
				return protectionDomains != null && !protectionDomains.isEmpty();
			case EdtdeploymentPackage.DEPLOYMENT__LOG_POLICIES:
				return logPolicies != null && !logPolicies.isEmpty();
			case EdtdeploymentPackage.DEPLOYMENT__PLATFORM_CONFIGURATIONS:
				return platformConfigurations != null && !platformConfigurations.isEmpty();
			case EdtdeploymentPackage.DEPLOYMENT__WIRE_MAPPINGS:
				return wireMappings != null && !wireMappings.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
