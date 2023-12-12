/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import edtproject.Composite;
import edtproject.EDTProjectPackage;
import edtproject.FinalAssembly;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.FinalAssemblyImpl#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link edtproject.impl.FinalAssemblyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalAssemblyImpl extends MinimalEObjectImpl.Container implements FinalAssembly {
	/**
	 * The cached value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected Composite finalAssembly;

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
	protected FinalAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.FINAL_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite getFinalAssembly() {
		if (finalAssembly != null && finalAssembly.eIsProxy()) {
			InternalEObject oldFinalAssembly = (InternalEObject)finalAssembly;
			finalAssembly = (Composite)eResolveProxy(oldFinalAssembly);
			if (finalAssembly != oldFinalAssembly) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY, oldFinalAssembly, finalAssembly));
			}
		}
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite basicGetFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinalAssembly(Composite newFinalAssembly) {
		Composite oldFinalAssembly = finalAssembly;
		finalAssembly = newFinalAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY, oldFinalAssembly, finalAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.FINAL_ASSEMBLY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY:
				if (resolve) return getFinalAssembly();
				return basicGetFinalAssembly();
			case EDTProjectPackage.FINAL_ASSEMBLY__NAME:
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
			case EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY:
				setFinalAssembly((Composite)newValue);
				return;
			case EDTProjectPackage.FINAL_ASSEMBLY__NAME:
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
			case EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY:
				setFinalAssembly((Composite)null);
				return;
			case EDTProjectPackage.FINAL_ASSEMBLY__NAME:
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
			case EDTProjectPackage.FINAL_ASSEMBLY__FINAL_ASSEMBLY:
				return finalAssembly != null;
			case EDTProjectPackage.FINAL_ASSEMBLY__NAME:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FinalAssemblyImpl
