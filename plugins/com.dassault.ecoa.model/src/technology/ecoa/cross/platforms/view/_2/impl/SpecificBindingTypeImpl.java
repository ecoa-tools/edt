/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.cross.platforms.view._2.SpecificBindingType;
import technology.ecoa.cross.platforms.view._2.viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl#getBoundToComputingPlatform <em>Bound To Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl#getEUIDs <em>EUI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificBindingTypeImpl extends MinimalEObjectImpl.Container implements SpecificBindingType {
	/**
	 * The default value of the '{@link #getBoundToComputingPlatform() <em>Bound To Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundToComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_TO_COMPUTING_PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundToComputingPlatform() <em>Bound To Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundToComputingPlatform()
	 * @generated
	 * @ordered
	 */
	protected String boundToComputingPlatform = BOUND_TO_COMPUTING_PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected static final String EUI_DS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEUIDs() <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEUIDs()
	 * @generated
	 * @ordered
	 */
	protected String eUIDs = EUI_DS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return viewPackage.Literals.SPECIFIC_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundToComputingPlatform() {
		return boundToComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundToComputingPlatform(String newBoundToComputingPlatform) {
		String oldBoundToComputingPlatform = boundToComputingPlatform;
		boundToComputingPlatform = newBoundToComputingPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM, oldBoundToComputingPlatform, boundToComputingPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEUIDs() {
		return eUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEUIDs(String newEUIDs) {
		String oldEUIDs = eUIDs;
		eUIDs = newEUIDs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.SPECIFIC_BINDING_TYPE__EUI_DS, oldEUIDs, eUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case viewPackage.SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM:
				return getBoundToComputingPlatform();
			case viewPackage.SPECIFIC_BINDING_TYPE__EUI_DS:
				return getEUIDs();
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
			case viewPackage.SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM:
				setBoundToComputingPlatform((String)newValue);
				return;
			case viewPackage.SPECIFIC_BINDING_TYPE__EUI_DS:
				setEUIDs((String)newValue);
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
			case viewPackage.SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM:
				setBoundToComputingPlatform(BOUND_TO_COMPUTING_PLATFORM_EDEFAULT);
				return;
			case viewPackage.SPECIFIC_BINDING_TYPE__EUI_DS:
				setEUIDs(EUI_DS_EDEFAULT);
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
			case viewPackage.SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM:
				return BOUND_TO_COMPUTING_PLATFORM_EDEFAULT == null ? boundToComputingPlatform != null : !BOUND_TO_COMPUTING_PLATFORM_EDEFAULT.equals(boundToComputingPlatform);
			case viewPackage.SPECIFIC_BINDING_TYPE__EUI_DS:
				return EUI_DS_EDEFAULT == null ? eUIDs != null : !EUI_DS_EDEFAULT.equals(eUIDs);
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
		result.append(" (boundToComputingPlatform: ");
		result.append(boundToComputingPlatform);
		result.append(", eUIDs: ");
		result.append(eUIDs);
		result.append(')');
		return result.toString();
	}

} //SpecificBindingTypeImpl
