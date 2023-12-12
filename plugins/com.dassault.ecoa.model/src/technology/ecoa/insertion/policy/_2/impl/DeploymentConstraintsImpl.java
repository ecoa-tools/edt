/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.DeploymentConstraints;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl#getDeploymentExample <em>Deployment Example</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.DeploymentConstraintsImpl#isUniqueProtectionDomain <em>Unique Protection Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentConstraintsImpl extends MinimalEObjectImpl.Container implements DeploymentConstraints {
	/**
	 * The default value of the '{@link #getDeploymentExample() <em>Deployment Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentExample()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentExample() <em>Deployment Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentExample()
	 * @generated
	 * @ordered
	 */
	protected String deploymentExample = DEPLOYMENT_EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueProtectionDomain() <em>Unique Protection Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueProtectionDomain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_PROTECTION_DOMAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueProtectionDomain() <em>Unique Protection Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueProtectionDomain()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueProtectionDomain = UNIQUE_PROTECTION_DOMAIN_EDEFAULT;

	/**
	 * This is true if the Unique Protection Domain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueProtectionDomainESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.DEPLOYMENT_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentExample() {
		return deploymentExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentExample(String newDeploymentExample) {
		String oldDeploymentExample = deploymentExample;
		deploymentExample = newDeploymentExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE, oldDeploymentExample, deploymentExample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueProtectionDomain() {
		return uniqueProtectionDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueProtectionDomain(boolean newUniqueProtectionDomain) {
		boolean oldUniqueProtectionDomain = uniqueProtectionDomain;
		uniqueProtectionDomain = newUniqueProtectionDomain;
		boolean oldUniqueProtectionDomainESet = uniqueProtectionDomainESet;
		uniqueProtectionDomainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN, oldUniqueProtectionDomain, uniqueProtectionDomain, !oldUniqueProtectionDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniqueProtectionDomain() {
		boolean oldUniqueProtectionDomain = uniqueProtectionDomain;
		boolean oldUniqueProtectionDomainESet = uniqueProtectionDomainESet;
		uniqueProtectionDomain = UNIQUE_PROTECTION_DOMAIN_EDEFAULT;
		uniqueProtectionDomainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN, oldUniqueProtectionDomain, UNIQUE_PROTECTION_DOMAIN_EDEFAULT, oldUniqueProtectionDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniqueProtectionDomain() {
		return uniqueProtectionDomainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE:
				return getDeploymentExample();
			case polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN:
				return isUniqueProtectionDomain();
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
			case polPackage.DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE:
				setDeploymentExample((String)newValue);
				return;
			case polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN:
				setUniqueProtectionDomain((Boolean)newValue);
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
			case polPackage.DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE:
				setDeploymentExample(DEPLOYMENT_EXAMPLE_EDEFAULT);
				return;
			case polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN:
				unsetUniqueProtectionDomain();
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
			case polPackage.DEPLOYMENT_CONSTRAINTS__DEPLOYMENT_EXAMPLE:
				return DEPLOYMENT_EXAMPLE_EDEFAULT == null ? deploymentExample != null : !DEPLOYMENT_EXAMPLE_EDEFAULT.equals(deploymentExample);
			case polPackage.DEPLOYMENT_CONSTRAINTS__UNIQUE_PROTECTION_DOMAIN:
				return isSetUniqueProtectionDomain();
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
		result.append(" (deploymentExample: ");
		result.append(deploymentExample);
		result.append(", uniqueProtectionDomain: ");
		if (uniqueProtectionDomainESet) result.append(uniqueProtectionDomain); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DeploymentConstraintsImpl
