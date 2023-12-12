/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import technology.ecoa.implementation._2.ModuleInstance;
import technology.ecoa.implementation._2.PinfoType;
import technology.ecoa.implementation._2.PropertyValues;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleInstanceImpl#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleInstanceImpl#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ModuleInstanceImpl#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleInstanceImpl extends InstanceImpl implements ModuleInstance {
	/**
	 * The cached value of the '{@link #getPropertyValues() <em>Property Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected PropertyValues propertyValues;

	/**
	 * The cached value of the '{@link #getPinfo() <em>Pinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinfo()
	 * @generated
	 * @ordered
	 */
	protected PinfoType pinfo;

	/**
	 * The default value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationName() <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationName()
	 * @generated
	 * @ordered
	 */
	protected String implementationName = IMPLEMENTATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyValues(PropertyValues newPropertyValues, NotificationChain msgs) {
		PropertyValues oldPropertyValues = propertyValues;
		propertyValues = newPropertyValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.MODULE_INSTANCE__PROPERTY_VALUES, oldPropertyValues, newPropertyValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyValues(PropertyValues newPropertyValues) {
		if (newPropertyValues != propertyValues) {
			NotificationChain msgs = null;
			if (propertyValues != null)
				msgs = ((InternalEObject)propertyValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_INSTANCE__PROPERTY_VALUES, null, msgs);
			if (newPropertyValues != null)
				msgs = ((InternalEObject)newPropertyValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_INSTANCE__PROPERTY_VALUES, null, msgs);
			msgs = basicSetPropertyValues(newPropertyValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_INSTANCE__PROPERTY_VALUES, newPropertyValues, newPropertyValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinfoType getPinfo() {
		return pinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPinfo(PinfoType newPinfo, NotificationChain msgs) {
		PinfoType oldPinfo = pinfo;
		pinfo = newPinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.MODULE_INSTANCE__PINFO, oldPinfo, newPinfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinfo(PinfoType newPinfo) {
		if (newPinfo != pinfo) {
			NotificationChain msgs = null;
			if (pinfo != null)
				msgs = ((InternalEObject)pinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_INSTANCE__PINFO, null, msgs);
			if (newPinfo != null)
				msgs = ((InternalEObject)newPinfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.MODULE_INSTANCE__PINFO, null, msgs);
			msgs = basicSetPinfo(newPinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_INSTANCE__PINFO, newPinfo, newPinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementationName() {
		return implementationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationName(String newImplementationName) {
		String oldImplementationName = implementationName;
		implementationName = newImplementationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.MODULE_INSTANCE__IMPLEMENTATION_NAME, oldImplementationName, implementationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return basicSetPropertyValues(null, msgs);
			case impPackage.MODULE_INSTANCE__PINFO:
				return basicSetPinfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case impPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return getPropertyValues();
			case impPackage.MODULE_INSTANCE__PINFO:
				return getPinfo();
			case impPackage.MODULE_INSTANCE__IMPLEMENTATION_NAME:
				return getImplementationName();
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
			case impPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				setPropertyValues((PropertyValues)newValue);
				return;
			case impPackage.MODULE_INSTANCE__PINFO:
				setPinfo((PinfoType)newValue);
				return;
			case impPackage.MODULE_INSTANCE__IMPLEMENTATION_NAME:
				setImplementationName((String)newValue);
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
			case impPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				setPropertyValues((PropertyValues)null);
				return;
			case impPackage.MODULE_INSTANCE__PINFO:
				setPinfo((PinfoType)null);
				return;
			case impPackage.MODULE_INSTANCE__IMPLEMENTATION_NAME:
				setImplementationName(IMPLEMENTATION_NAME_EDEFAULT);
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
			case impPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return propertyValues != null;
			case impPackage.MODULE_INSTANCE__PINFO:
				return pinfo != null;
			case impPackage.MODULE_INSTANCE__IMPLEMENTATION_NAME:
				return IMPLEMENTATION_NAME_EDEFAULT == null ? implementationName != null : !IMPLEMENTATION_NAME_EDEFAULT.equals(implementationName);
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
		result.append(" (implementationName: ");
		result.append(implementationName);
		result.append(')');
		return result.toString();
	}

} //ModuleInstanceImpl
