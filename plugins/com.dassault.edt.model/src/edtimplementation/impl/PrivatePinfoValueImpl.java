/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.PrivatePinfo;
import edtimplementation.PrivatePinfoValue;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Private
 * Pinfo Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.PrivatePinfoValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link edtimplementation.impl.PrivatePinfoValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.PrivatePinfoValueImpl#getPrivatePinfoFromModuleType <em>Private Pinfo From Module Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrivatePinfoValueImpl extends MinimalEObjectImpl.Container implements PrivatePinfoValue {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getPrivatePinfoFromModuleType() <em>Private Pinfo From Module Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPrivatePinfoFromModuleType()
	 * @generated
	 * @ordered
	 */
	protected PrivatePinfo privatePinfoFromModuleType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivatePinfoValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.PRIVATE_PINFO_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PRIVATE_PINFO_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PRIVATE_PINFO_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivatePinfo getPrivatePinfoFromModuleType() {
		if (privatePinfoFromModuleType != null && privatePinfoFromModuleType.eIsProxy()) {
			InternalEObject oldPrivatePinfoFromModuleType = (InternalEObject)privatePinfoFromModuleType;
			privatePinfoFromModuleType = (PrivatePinfo)eResolveProxy(oldPrivatePinfoFromModuleType);
			if (privatePinfoFromModuleType != oldPrivatePinfoFromModuleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE, oldPrivatePinfoFromModuleType, privatePinfoFromModuleType));
			}
		}
		return privatePinfoFromModuleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePinfo basicGetPrivatePinfoFromModuleType() {
		return privatePinfoFromModuleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivatePinfoFromModuleType(PrivatePinfo newPrivatePinfoFromModuleType) {
		PrivatePinfo oldPrivatePinfoFromModuleType = privatePinfoFromModuleType;
		privatePinfoFromModuleType = newPrivatePinfoFromModuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE, oldPrivatePinfoFromModuleType, privatePinfoFromModuleType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__VALUE:
				return getValue();
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__NAME:
				return getName();
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE:
				if (resolve) return getPrivatePinfoFromModuleType();
				return basicGetPrivatePinfoFromModuleType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE:
				setPrivatePinfoFromModuleType((PrivatePinfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE:
				setPrivatePinfoFromModuleType((PrivatePinfo)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.PRIVATE_PINFO_VALUE__PRIVATE_PINFO_FROM_MODULE_TYPE:
				return privatePinfoFromModuleType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getValue() != null
				&& !this.getValue().isBlank());
	}

} // PrivatePinfoValueImpl
