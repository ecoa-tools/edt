/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.Instance;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.InstanceImpl#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.InstanceImpl#getRelativePriority <em>Relative Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
	/**
	 * The default value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_BEHAVIOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected String moduleBehaviour = MODULE_BEHAVIOUR_EDEFAULT;

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
	 * The default value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RELATIVE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger relativePriority = RELATIVE_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModuleBehaviour() {
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleBehaviour(String newModuleBehaviour) {
		String oldModuleBehaviour = moduleBehaviour;
		moduleBehaviour = newModuleBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.INSTANCE__MODULE_BEHAVIOUR, oldModuleBehaviour, moduleBehaviour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRelativePriority() {
		return relativePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePriority(BigInteger newRelativePriority) {
		BigInteger oldRelativePriority = relativePriority;
		relativePriority = newRelativePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.INSTANCE__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.INSTANCE__MODULE_BEHAVIOUR:
				return getModuleBehaviour();
			case impPackage.INSTANCE__NAME:
				return getName();
			case impPackage.INSTANCE__RELATIVE_PRIORITY:
				return getRelativePriority();
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
			case impPackage.INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour((String)newValue);
				return;
			case impPackage.INSTANCE__NAME:
				setName((String)newValue);
				return;
			case impPackage.INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority((BigInteger)newValue);
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
			case impPackage.INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour(MODULE_BEHAVIOUR_EDEFAULT);
				return;
			case impPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case impPackage.INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
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
			case impPackage.INSTANCE__MODULE_BEHAVIOUR:
				return MODULE_BEHAVIOUR_EDEFAULT == null ? moduleBehaviour != null : !MODULE_BEHAVIOUR_EDEFAULT.equals(moduleBehaviour);
			case impPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case impPackage.INSTANCE__RELATIVE_PRIORITY:
				return RELATIVE_PRIORITY_EDEFAULT == null ? relativePriority != null : !RELATIVE_PRIORITY_EDEFAULT.equals(relativePriority);
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
		result.append(" (moduleBehaviour: ");
		result.append(moduleBehaviour);
		result.append(", name: ");
		result.append(name);
		result.append(", relativePriority: ");
		result.append(relativePriority);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
