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

import technology.ecoa.deployment._2.ComputingNodeConfiguration;
import technology.ecoa.deployment._2.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Node Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl#getComputingNode <em>Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.impl.ComputingNodeConfigurationImpl#getSchedulingInformation <em>Scheduling Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingNodeConfigurationImpl extends MinimalEObjectImpl.Container implements ComputingNodeConfiguration {
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
	 * The default value of the '{@link #getSchedulingInformation() <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULING_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedulingInformation() <em>Scheduling Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInformation()
	 * @generated
	 * @ordered
	 */
	protected String schedulingInformation = SCHEDULING_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingNodeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.COMPUTING_NODE_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE, oldComputingNode, computingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedulingInformation() {
		return schedulingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingInformation(String newSchedulingInformation) {
		String oldSchedulingInformation = schedulingInformation;
		schedulingInformation = newSchedulingInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION, oldSchedulingInformation, schedulingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				return getComputingNode();
			case depPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				return getSchedulingInformation();
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
			case depPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				setComputingNode((String)newValue);
				return;
			case depPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				setSchedulingInformation((String)newValue);
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
			case depPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				setComputingNode(COMPUTING_NODE_EDEFAULT);
				return;
			case depPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				setSchedulingInformation(SCHEDULING_INFORMATION_EDEFAULT);
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
			case depPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				return COMPUTING_NODE_EDEFAULT == null ? computingNode != null : !COMPUTING_NODE_EDEFAULT.equals(computingNode);
			case depPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				return SCHEDULING_INFORMATION_EDEFAULT == null ? schedulingInformation != null : !SCHEDULING_INFORMATION_EDEFAULT.equals(schedulingInformation);
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
		result.append(", schedulingInformation: ");
		result.append(schedulingInformation);
		result.append(')');
		return result.toString();
	}

} //ComputingNodeConfigurationImpl
