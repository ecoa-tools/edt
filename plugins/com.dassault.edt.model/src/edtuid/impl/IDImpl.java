/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edtinterface.OperationType;
import edtproject.ServiceLink;
import edtuid.EdtuidPackage;
import edtuid.ID;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>ID</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtuid.impl.IDImpl#getValue <em>Value</em>}</li>
 * <li>{@link edtuid.impl.IDImpl#getOperation <em>Operation</em>}</li>
 * <li>{@link edtuid.impl.IDImpl#getServiceLink <em>Service Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDImpl extends MinimalEObjectImpl.Container implements ID {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected OperationType operation;

	/**
	 * The cached value of the '{@link #getServiceLink() <em>Service Link</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServiceLink()
	 * @generated
	 * @ordered
	 */
	protected ServiceLink serviceLink;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtuidPackage.Literals.ID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtuidPackage.ID__VALUE, oldValue, value,
					!oldValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetValue() {
		int oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtuidPackage.ID__VALUE, oldValue, VALUE_EDEFAULT,
					oldValueESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public OperationType getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (OperationType) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtuidPackage.ID__OPERATION, oldOperation,
							operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OperationType basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOperation(OperationType newOperation) {
		OperationType oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtuidPackage.ID__OPERATION, oldOperation,
					operation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ServiceLink getServiceLink() {
		if (serviceLink != null && serviceLink.eIsProxy()) {
			InternalEObject oldServiceLink = (InternalEObject) serviceLink;
			serviceLink = (ServiceLink) eResolveProxy(oldServiceLink);
			if (serviceLink != oldServiceLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtuidPackage.ID__SERVICE_LINK,
							oldServiceLink, serviceLink));
			}
		}
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ServiceLink basicGetServiceLink() {
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setServiceLink(ServiceLink newServiceLink) {
		ServiceLink oldServiceLink = serviceLink;
		serviceLink = newServiceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtuidPackage.ID__SERVICE_LINK, oldServiceLink,
					serviceLink));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdtuidPackage.ID__VALUE:
			return getValue();
		case EdtuidPackage.ID__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case EdtuidPackage.ID__SERVICE_LINK:
			if (resolve)
				return getServiceLink();
			return basicGetServiceLink();
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
		case EdtuidPackage.ID__VALUE:
			setValue((Integer) newValue);
			return;
		case EdtuidPackage.ID__OPERATION:
			setOperation((OperationType) newValue);
			return;
		case EdtuidPackage.ID__SERVICE_LINK:
			setServiceLink((ServiceLink) newValue);
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
		case EdtuidPackage.ID__VALUE:
			unsetValue();
			return;
		case EdtuidPackage.ID__OPERATION:
			setOperation((OperationType) null);
			return;
		case EdtuidPackage.ID__SERVICE_LINK:
			setServiceLink((ServiceLink) null);
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
		case EdtuidPackage.ID__VALUE:
			return isSetValue();
		case EdtuidPackage.ID__OPERATION:
			return operation != null;
		case EdtuidPackage.ID__SERVICE_LINK:
			return serviceLink != null;
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
		result.append(" (value: ");
		if (valueESet)
			result.append(value);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // IDImpl
