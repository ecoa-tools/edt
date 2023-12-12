/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.cross.platforms.view._2.Composite;
import technology.ecoa.cross.platforms.view._2.viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.CompositeImpl#getDeployedOnComputingPlatform <em>Deployed On Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.CompositeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends MinimalEObjectImpl.Container implements Composite {
	/**
	 * The default value of the '{@link #getDeployedOnComputingPlatform() <em>Deployed On Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedOnComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_ON_COMPUTING_PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedOnComputingPlatform() <em>Deployed On Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedOnComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected String deployedOnComputingPlatform = DEPLOYED_ON_COMPUTING_PLATFORM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return viewPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedOnComputingPlatform() {
		return deployedOnComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedOnComputingPlatform(String newDeployedOnComputingPlatform) {
		String oldDeployedOnComputingPlatform = deployedOnComputingPlatform;
		deployedOnComputingPlatform = newDeployedOnComputingPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM, oldDeployedOnComputingPlatform, deployedOnComputingPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case viewPackage.COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM:
				return getDeployedOnComputingPlatform();
			case viewPackage.COMPOSITE__NAME:
				return getName();
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
			case viewPackage.COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM:
				setDeployedOnComputingPlatform((String)newValue);
				return;
			case viewPackage.COMPOSITE__NAME:
				setName((String)newValue);
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
			case viewPackage.COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM:
				setDeployedOnComputingPlatform(DEPLOYED_ON_COMPUTING_PLATFORM_EDEFAULT);
				return;
			case viewPackage.COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
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
			case viewPackage.COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM:
				return DEPLOYED_ON_COMPUTING_PLATFORM_EDEFAULT == null ? deployedOnComputingPlatform != null : !DEPLOYED_ON_COMPUTING_PLATFORM_EDEFAULT.equals(deployedOnComputingPlatform);
			case viewPackage.COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (deployedOnComputingPlatform: ");
		result.append(deployedOnComputingPlatform);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompositeImpl
