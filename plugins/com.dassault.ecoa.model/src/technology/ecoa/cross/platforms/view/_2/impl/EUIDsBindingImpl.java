/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.cross.platforms.view._2.EUIDsBinding;
import technology.ecoa.cross.platforms.view._2.SpecificBindingType;
import technology.ecoa.cross.platforms.view._2.viewPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EUI Ds Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl#getSpecificBinding <em>Specific Binding</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl#getBoundToLinkId <em>Bound To Link Id</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl#getEUIDs <em>EUI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EUIDsBindingImpl extends MinimalEObjectImpl.Container implements EUIDsBinding {
	/**
	 * The cached value of the '{@link #getSpecificBinding() <em>Specific Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificBindingType> specificBinding;

	/**
	 * The default value of the '{@link #getBoundToLinkId() <em>Bound To Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundToLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUND_TO_LINK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundToLinkId() <em>Bound To Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundToLinkId()
	 * @generated
	 * @ordered
	 */
	protected String boundToLinkId = BOUND_TO_LINK_ID_EDEFAULT;

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
	protected EUIDsBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return viewPackage.Literals.EUI_DS_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificBindingType> getSpecificBinding() {
		if (specificBinding == null) {
			specificBinding = new EObjectContainmentEList<SpecificBindingType>(SpecificBindingType.class, this, viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING);
		}
		return specificBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundToLinkId() {
		return boundToLinkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundToLinkId(String newBoundToLinkId) {
		String oldBoundToLinkId = boundToLinkId;
		boundToLinkId = newBoundToLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.EUI_DS_BINDING__BOUND_TO_LINK_ID, oldBoundToLinkId, boundToLinkId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, viewPackage.EUI_DS_BINDING__EUI_DS, oldEUIDs, eUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING:
				return ((InternalEList<?>)getSpecificBinding()).basicRemove(otherEnd, msgs);
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
			case viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING:
				return getSpecificBinding();
			case viewPackage.EUI_DS_BINDING__BOUND_TO_LINK_ID:
				return getBoundToLinkId();
			case viewPackage.EUI_DS_BINDING__EUI_DS:
				return getEUIDs();
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
			case viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING:
				getSpecificBinding().clear();
				getSpecificBinding().addAll((Collection<? extends SpecificBindingType>)newValue);
				return;
			case viewPackage.EUI_DS_BINDING__BOUND_TO_LINK_ID:
				setBoundToLinkId((String)newValue);
				return;
			case viewPackage.EUI_DS_BINDING__EUI_DS:
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
			case viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING:
				getSpecificBinding().clear();
				return;
			case viewPackage.EUI_DS_BINDING__BOUND_TO_LINK_ID:
				setBoundToLinkId(BOUND_TO_LINK_ID_EDEFAULT);
				return;
			case viewPackage.EUI_DS_BINDING__EUI_DS:
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
			case viewPackage.EUI_DS_BINDING__SPECIFIC_BINDING:
				return specificBinding != null && !specificBinding.isEmpty();
			case viewPackage.EUI_DS_BINDING__BOUND_TO_LINK_ID:
				return BOUND_TO_LINK_ID_EDEFAULT == null ? boundToLinkId != null : !BOUND_TO_LINK_ID_EDEFAULT.equals(boundToLinkId);
			case viewPackage.EUI_DS_BINDING__EUI_DS:
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
		result.append(" (boundToLinkId: ");
		result.append(boundToLinkId);
		result.append(", eUIDs: ");
		result.append(eUIDs);
		result.append(')');
		return result.toString();
	}

} //EUIDsBindingImpl
