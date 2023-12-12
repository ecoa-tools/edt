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

import technology.ecoa.module.behaviour._2.EntryPoint;
import technology.ecoa.module.behaviour._2.modPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.EntryPointImpl#getActivatingCondition <em>Activating Condition</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.EntryPointImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.impl.EntryPointImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends ActionSetImpl implements EntryPoint {
	/**
	 * The default value of the '{@link #getActivatingCondition() <em>Activating Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatingCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATING_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivatingCondition() <em>Activating Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatingCondition()
	 * @generated
	 * @ordered
	 */
	protected String activatingCondition = ACTIVATING_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final double DEADLINE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected double deadline = DEADLINE_EDEFAULT;

	/**
	 * This is true if the Deadline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadlineESet;

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
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActivatingCondition() {
		return activatingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatingCondition(String newActivatingCondition) {
		String oldActivatingCondition = activatingCondition;
		activatingCondition = newActivatingCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.ENTRY_POINT__ACTIVATING_CONDITION, oldActivatingCondition, activatingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(double newDeadline) {
		double oldDeadline = deadline;
		deadline = newDeadline;
		boolean oldDeadlineESet = deadlineESet;
		deadlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.ENTRY_POINT__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadline() {
		double oldDeadline = deadline;
		boolean oldDeadlineESet = deadlineESet;
		deadline = DEADLINE_EDEFAULT;
		deadlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, modPackage.ENTRY_POINT__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadline() {
		return deadlineESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, modPackage.ENTRY_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modPackage.ENTRY_POINT__ACTIVATING_CONDITION:
				return getActivatingCondition();
			case modPackage.ENTRY_POINT__DEADLINE:
				return getDeadline();
			case modPackage.ENTRY_POINT__NAME:
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
			case modPackage.ENTRY_POINT__ACTIVATING_CONDITION:
				setActivatingCondition((String)newValue);
				return;
			case modPackage.ENTRY_POINT__DEADLINE:
				setDeadline((Double)newValue);
				return;
			case modPackage.ENTRY_POINT__NAME:
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
			case modPackage.ENTRY_POINT__ACTIVATING_CONDITION:
				setActivatingCondition(ACTIVATING_CONDITION_EDEFAULT);
				return;
			case modPackage.ENTRY_POINT__DEADLINE:
				unsetDeadline();
				return;
			case modPackage.ENTRY_POINT__NAME:
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
			case modPackage.ENTRY_POINT__ACTIVATING_CONDITION:
				return ACTIVATING_CONDITION_EDEFAULT == null ? activatingCondition != null : !ACTIVATING_CONDITION_EDEFAULT.equals(activatingCondition);
			case modPackage.ENTRY_POINT__DEADLINE:
				return isSetDeadline();
			case modPackage.ENTRY_POINT__NAME:
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
		result.append(" (activatingCondition: ");
		result.append(activatingCondition);
		result.append(", deadline: ");
		if (deadlineESet) result.append(deadline); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EntryPointImpl
