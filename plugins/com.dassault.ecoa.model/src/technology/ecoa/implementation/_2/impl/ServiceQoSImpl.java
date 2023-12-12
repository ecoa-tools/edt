/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.ServiceQoS;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Qo S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ServiceQoSImpl#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ServiceQoSImpl#getNewQoS <em>New Qo S</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceQoSImpl extends MinimalEObjectImpl.Container implements ServiceQoS {
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
	 * The default value of the '{@link #getNewQoS() <em>New Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewQoS()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_QO_S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewQoS() <em>New Qo S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewQoS()
	 * @generated
	 * @ordered
	 */
	protected String newQoS = NEW_QO_S_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceQoSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.SERVICE_QO_S;
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
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.SERVICE_QO_S__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewQoS() {
		return newQoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewQoS(String newNewQoS) {
		String oldNewQoS = newQoS;
		newQoS = newNewQoS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.SERVICE_QO_S__NEW_QO_S, oldNewQoS, newQoS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.SERVICE_QO_S__NAME:
				return getName();
			case impPackage.SERVICE_QO_S__NEW_QO_S:
				return getNewQoS();
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
			case impPackage.SERVICE_QO_S__NAME:
				setName((String)newValue);
				return;
			case impPackage.SERVICE_QO_S__NEW_QO_S:
				setNewQoS((String)newValue);
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
			case impPackage.SERVICE_QO_S__NAME:
				setName(NAME_EDEFAULT);
				return;
			case impPackage.SERVICE_QO_S__NEW_QO_S:
				setNewQoS(NEW_QO_S_EDEFAULT);
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
			case impPackage.SERVICE_QO_S__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case impPackage.SERVICE_QO_S__NEW_QO_S:
				return NEW_QO_S_EDEFAULT == null ? newQoS != null : !NEW_QO_S_EDEFAULT.equals(newQoS);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", newQoS: ");
		result.append(newQoS);
		result.append(')');
		return result.toString();
	}

} //ServiceQoSImpl
