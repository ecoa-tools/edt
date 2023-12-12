/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment.impl;

import edtdeployment.ComputingNodeConfiguration;
import edtdeployment.EdtdeploymentPackage;

import edtlogical.LogicalComputingNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Node Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.impl.ComputingNodeConfigurationImpl#getSchedulingInformation <em>Scheduling Information</em>}</li>
 *   <li>{@link edtdeployment.impl.ComputingNodeConfigurationImpl#getComputingNode <em>Computing Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingNodeConfigurationImpl extends MinimalEObjectImpl.Container implements ComputingNodeConfiguration {
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
	 * The cached value of the '{@link #getComputingNode() <em>Computing Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputingNode()
	 * @generated
	 * @ordered
	 */
	protected LogicalComputingNode computingNode;

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
		return EdtdeploymentPackage.Literals.COMPUTING_NODE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchedulingInformation() {
		return schedulingInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedulingInformation(String newSchedulingInformation) {
		String oldSchedulingInformation = schedulingInformation;
		schedulingInformation = newSchedulingInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION, oldSchedulingInformation, schedulingInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingNode getComputingNode() {
		if (computingNode != null && computingNode.eIsProxy()) {
			InternalEObject oldComputingNode = (InternalEObject)computingNode;
			computingNode = (LogicalComputingNode)eResolveProxy(oldComputingNode);
			if (computingNode != oldComputingNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE, oldComputingNode, computingNode));
			}
		}
		return computingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComputingNode basicGetComputingNode() {
		return computingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComputingNode(LogicalComputingNode newComputingNode) {
		LogicalComputingNode oldComputingNode = computingNode;
		computingNode = newComputingNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE, oldComputingNode, computingNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				return getSchedulingInformation();
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				if (resolve) return getComputingNode();
				return basicGetComputingNode();
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
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				setSchedulingInformation((String)newValue);
				return;
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				setComputingNode((LogicalComputingNode)newValue);
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
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				setSchedulingInformation(SCHEDULING_INFORMATION_EDEFAULT);
				return;
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				setComputingNode((LogicalComputingNode)null);
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
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__SCHEDULING_INFORMATION:
				return SCHEDULING_INFORMATION_EDEFAULT == null ? schedulingInformation != null : !SCHEDULING_INFORMATION_EDEFAULT.equals(schedulingInformation);
			case EdtdeploymentPackage.COMPUTING_NODE_CONFIGURATION__COMPUTING_NODE:
				return computingNode != null;
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
		result.append(" (schedulingInformation: ");
		result.append(schedulingInformation);
		result.append(')');
		return result.toString();
	}

} //ComputingNodeConfigurationImpl
