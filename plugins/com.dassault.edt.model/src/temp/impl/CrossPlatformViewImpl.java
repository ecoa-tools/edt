/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.cross.platforms.view._2.View;

import temp.CrossPlatformView;
import temp.TempPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Platform View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link temp.impl.CrossPlatformViewImpl#getECOACrossPlatformView <em>ECOA Cross Platform View</em>}</li>
 *   <li>{@link temp.impl.CrossPlatformViewImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossPlatformViewImpl extends MinimalEObjectImpl.Container implements CrossPlatformView {
	/**
	 * The cached value of the '{@link #getECOACrossPlatformView() <em>ECOA Cross Platform View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECOACrossPlatformView()
	 * @generated
	 * @ordered
	 */
	protected View ecoaCrossPlatformView;

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
	protected CrossPlatformViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TempPackage.Literals.CROSS_PLATFORM_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public View getECOACrossPlatformView() {
		return ecoaCrossPlatformView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECOACrossPlatformView(View newECOACrossPlatformView, NotificationChain msgs) {
		View oldECOACrossPlatformView = ecoaCrossPlatformView;
		ecoaCrossPlatformView = newECOACrossPlatformView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW, oldECOACrossPlatformView, newECOACrossPlatformView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setECOACrossPlatformView(View newECOACrossPlatformView) {
		if (newECOACrossPlatformView != ecoaCrossPlatformView) {
			NotificationChain msgs = null;
			if (ecoaCrossPlatformView != null)
				msgs = ((InternalEObject)ecoaCrossPlatformView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW, null, msgs);
			if (newECOACrossPlatformView != null)
				msgs = ((InternalEObject)newECOACrossPlatformView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW, null, msgs);
			msgs = basicSetECOACrossPlatformView(newECOACrossPlatformView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW, newECOACrossPlatformView, newECOACrossPlatformView));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.CROSS_PLATFORM_VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW:
				return basicSetECOACrossPlatformView(null, msgs);
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
			case TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW:
				return getECOACrossPlatformView();
			case TempPackage.CROSS_PLATFORM_VIEW__NAME:
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
			case TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW:
				setECOACrossPlatformView((View)newValue);
				return;
			case TempPackage.CROSS_PLATFORM_VIEW__NAME:
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
			case TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW:
				setECOACrossPlatformView((View)null);
				return;
			case TempPackage.CROSS_PLATFORM_VIEW__NAME:
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
			case TempPackage.CROSS_PLATFORM_VIEW__ECOA_CROSS_PLATFORM_VIEW:
				return ecoaCrossPlatformView != null;
			case TempPackage.CROSS_PLATFORM_VIEW__NAME:
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

} //CrossPlatformViewImpl
