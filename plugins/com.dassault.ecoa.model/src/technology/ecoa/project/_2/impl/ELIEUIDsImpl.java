/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import technology.ecoa.project._2.ELIEUIDs;
import technology.ecoa.project._2.projPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ELIEUI Ds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.project._2.impl.ELIEUIDsImpl#getEUID <em>EUID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ELIEUIDsImpl extends MinimalEObjectImpl.Container implements ELIEUIDs {
	/**
	 * The cached value of the '{@link #getEUID() <em>EUID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELIEUIDsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return projPackage.Literals.ELIEUI_DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEUID() {
		if (eUID == null) {
			eUID = new EDataTypeEList<String>(String.class, this, projPackage.ELIEUI_DS__EUID);
		}
		return eUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case projPackage.ELIEUI_DS__EUID:
				return getEUID();
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
			case projPackage.ELIEUI_DS__EUID:
				getEUID().clear();
				getEUID().addAll((Collection<? extends String>)newValue);
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
			case projPackage.ELIEUI_DS__EUID:
				getEUID().clear();
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
			case projPackage.ELIEUI_DS__EUID:
				return eUID != null && !eUID.isEmpty();
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
		result.append(" (eUID: ");
		result.append(eUID);
		result.append(')');
		return result.toString();
	}

} //ELIEUIDsImpl
