/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edttype.EDTTypePackage;
import edttype.EnumValuePredefined;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enum
 * Value Predefined</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edttype.impl.EnumValuePredefinedImpl#getName <em>Name</em>}</li>
 * <li>{@link edttype.impl.EnumValuePredefinedImpl#getValnum
 * <em>Valnum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumValuePredefinedImpl extends MinimalEObjectImpl.Container implements EnumValuePredefined {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected static final String VALNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValnum() <em>Valnum</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValnum()
	 * @generated
	 * @ordered
	 */
	protected String valnum = VALNUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnumValuePredefinedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTTypePackage.Literals.ENUM_VALUE_PREDEFINED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE_PREDEFINED__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getValnum() {
		return valnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValnum(String newValnum) {
		String oldValnum = valnum;
		valnum = newValnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTTypePackage.ENUM_VALUE_PREDEFINED__VALNUM,
					oldValnum, valnum));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__NAME:
			return getName();
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__VALNUM:
			return getValnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__NAME:
			setName((String) newValue);
			return;
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__VALNUM:
			setValnum((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__VALNUM:
			setValnum(VALNUM_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTTypePackage.ENUM_VALUE_PREDEFINED__VALNUM:
			return VALNUM_EDEFAULT == null ? valnum != null : !VALNUM_EDEFAULT.equals(valnum);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", valnum: ");
		result.append(valnum);
		result.append(')');
		return result.toString();
	}

} // EnumValuePredefinedImpl
