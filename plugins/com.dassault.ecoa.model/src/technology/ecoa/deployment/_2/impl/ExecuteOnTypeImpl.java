/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.deployment._2.ExecuteOnType;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute On Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl#getComputingNode <em>Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ExecuteOnTypeImpl#getComputingPlatform <em>Computing Platform</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteOnTypeImpl extends MinimalEObjectImpl.Container implements ExecuteOnType {
	/**
	 * The default value of the '{@link #getComputingNode() <em>Computing Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingNode()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTING_NODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputingNode() <em>Computing Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingNode()
	 * @generated
	 * @ordered
	 */
	protected String computingNode = COMPUTING_NODE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecuteOnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.EXECUTE_ON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputingNode() {
		return computingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputingNode(String newComputingNode) {
		String oldComputingNode = computingNode;
		computingNode = newComputingNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.EXECUTE_ON_TYPE__COMPUTING_NODE, oldComputingNode, computingNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.EXECUTE_ON_TYPE__COMPUTING_PLATFORM, oldComputingPlatform, computingPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_NODE:
				return getComputingNode();
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_PLATFORM:
				return getComputingPlatform();
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
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_NODE:
				setComputingNode((String)newValue);
				return;
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_PLATFORM:
				setComputingPlatform((String)newValue);
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
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_NODE:
				setComputingNode(COMPUTING_NODE_EDEFAULT);
				return;
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_PLATFORM:
				setComputingPlatform(COMPUTING_PLATFORM_EDEFAULT);
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
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_NODE:
				return COMPUTING_NODE_EDEFAULT == null ? computingNode != null : !COMPUTING_NODE_EDEFAULT.equals(computingNode);
			case depPackage.EXECUTE_ON_TYPE__COMPUTING_PLATFORM:
				return COMPUTING_PLATFORM_EDEFAULT == null ? computingPlatform != null : !COMPUTING_PLATFORM_EDEFAULT.equals(computingPlatform);
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
		result.append(" (computingNode: ");
		result.append(computingNode);
		result.append(", computingPlatform: ");
		result.append(computingPlatform);
		result.append(')');
		return result.toString();
	}

} //ExecuteOnTypeImpl
