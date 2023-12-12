/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.module.behaviour._2.OperationCall;
import technology.ecoa.module.behaviour._2.modPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.OperationCallImpl#getMaxComputingSteps <em>Max Computing Steps</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.OperationCallImpl#getMinComputingSteps <em>Min Computing Steps</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.OperationCallImpl#getModuleOperationRef <em>Module Operation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallImpl extends MinimalEObjectImpl.Container implements OperationCall {
	/**
	 * The default value of the '{@link #getMaxComputingSteps() <em>Max Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxComputingSteps()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_COMPUTING_STEPS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxComputingSteps() <em>Max Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxComputingSteps()
	 * @generated
	 * @ordered
	 */
	protected double maxComputingSteps = MAX_COMPUTING_STEPS_EDEFAULT;

	/**
	 * This is true if the Max Computing Steps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxComputingStepsESet;

	/**
	 * The default value of the '{@link #getMinComputingSteps() <em>Min Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinComputingSteps()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_COMPUTING_STEPS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinComputingSteps() <em>Min Computing Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinComputingSteps()
	 * @generated
	 * @ordered
	 */
	protected double minComputingSteps = MIN_COMPUTING_STEPS_EDEFAULT;

	/**
	 * This is true if the Min Computing Steps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minComputingStepsESet;

	/**
	 * The default value of the '{@link #getModuleOperationRef() <em>Module Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleOperationRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_OPERATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleOperationRef() <em>Module Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleOperationRef()
	 * @generated
	 * @ordered
	 */
	protected String moduleOperationRef = MODULE_OPERATION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modPackage.Literals.OPERATION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxComputingSteps() {
		return maxComputingSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxComputingSteps(double newMaxComputingSteps) {
		double oldMaxComputingSteps = maxComputingSteps;
		maxComputingSteps = newMaxComputingSteps;
		boolean oldMaxComputingStepsESet = maxComputingStepsESet;
		maxComputingStepsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS, oldMaxComputingSteps, maxComputingSteps, !oldMaxComputingStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxComputingSteps() {
		double oldMaxComputingSteps = maxComputingSteps;
		boolean oldMaxComputingStepsESet = maxComputingStepsESet;
		maxComputingSteps = MAX_COMPUTING_STEPS_EDEFAULT;
		maxComputingStepsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS, oldMaxComputingSteps, MAX_COMPUTING_STEPS_EDEFAULT, oldMaxComputingStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxComputingSteps() {
		return maxComputingStepsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinComputingSteps() {
		return minComputingSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinComputingSteps(double newMinComputingSteps) {
		double oldMinComputingSteps = minComputingSteps;
		minComputingSteps = newMinComputingSteps;
		boolean oldMinComputingStepsESet = minComputingStepsESet;
		minComputingStepsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS, oldMinComputingSteps, minComputingSteps, !oldMinComputingStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinComputingSteps() {
		double oldMinComputingSteps = minComputingSteps;
		boolean oldMinComputingStepsESet = minComputingStepsESet;
		minComputingSteps = MIN_COMPUTING_STEPS_EDEFAULT;
		minComputingStepsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS, oldMinComputingSteps, MIN_COMPUTING_STEPS_EDEFAULT, oldMinComputingStepsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinComputingSteps() {
		return minComputingStepsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleOperationRef() {
		return moduleOperationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleOperationRef(String newModuleOperationRef) {
		String oldModuleOperationRef = moduleOperationRef;
		moduleOperationRef = newModuleOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.OPERATION_CALL__MODULE_OPERATION_REF, oldModuleOperationRef, moduleOperationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS:
				return getMaxComputingSteps();
			case modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS:
				return getMinComputingSteps();
			case modPackage.OPERATION_CALL__MODULE_OPERATION_REF:
				return getModuleOperationRef();
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
			case modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS:
				setMaxComputingSteps((Double)newValue);
				return;
			case modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS:
				setMinComputingSteps((Double)newValue);
				return;
			case modPackage.OPERATION_CALL__MODULE_OPERATION_REF:
				setModuleOperationRef((String)newValue);
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
			case modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS:
				unsetMaxComputingSteps();
				return;
			case modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS:
				unsetMinComputingSteps();
				return;
			case modPackage.OPERATION_CALL__MODULE_OPERATION_REF:
				setModuleOperationRef(MODULE_OPERATION_REF_EDEFAULT);
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
			case modPackage.OPERATION_CALL__MAX_COMPUTING_STEPS:
				return isSetMaxComputingSteps();
			case modPackage.OPERATION_CALL__MIN_COMPUTING_STEPS:
				return isSetMinComputingSteps();
			case modPackage.OPERATION_CALL__MODULE_OPERATION_REF:
				return MODULE_OPERATION_REF_EDEFAULT == null ? moduleOperationRef != null : !MODULE_OPERATION_REF_EDEFAULT.equals(moduleOperationRef);
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
		result.append(" (maxComputingSteps: ");
		if (maxComputingStepsESet) result.append(maxComputingSteps); else result.append("<unset>");
		result.append(", minComputingSteps: ");
		if (minComputingStepsESet) result.append(minComputingSteps); else result.append("<unset>");
		result.append(", moduleOperationRef: ");
		result.append(moduleOperationRef);
		result.append(')');
		return result.toString();
	}

} //OperationCallImpl
