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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.implementation._2.OpRef;
import technology.ecoa.implementation._2.OpRefActivatableFifo;
import technology.ecoa.implementation._2.ServerType;
import technology.ecoa.implementation._2.impPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.impl.ServerTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.impl.ServerTypeImpl#getModuleInstance <em>Module Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerTypeImpl extends MinimalEObjectImpl.Container implements ServerType {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected OpRef reference;

	/**
	 * The cached value of the '{@link #getModuleInstance() <em>Module Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleInstance()
	 * @generated
	 * @ordered
	 */
	protected OpRefActivatableFifo moduleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return impPackage.Literals.SERVER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRef getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(OpRef newReference, NotificationChain msgs) {
		OpRef oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.SERVER_TYPE__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(OpRef newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.SERVER_TYPE__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.SERVER_TYPE__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.SERVER_TYPE__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefActivatableFifo getModuleInstance() {
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleInstance(OpRefActivatableFifo newModuleInstance, NotificationChain msgs) {
		OpRefActivatableFifo oldModuleInstance = moduleInstance;
		moduleInstance = newModuleInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, impPackage.SERVER_TYPE__MODULE_INSTANCE, oldModuleInstance, newModuleInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleInstance(OpRefActivatableFifo newModuleInstance) {
		if (newModuleInstance != moduleInstance) {
			NotificationChain msgs = null;
			if (moduleInstance != null)
				msgs = ((InternalEObject)moduleInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - impPackage.SERVER_TYPE__MODULE_INSTANCE, null, msgs);
			if (newModuleInstance != null)
				msgs = ((InternalEObject)newModuleInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - impPackage.SERVER_TYPE__MODULE_INSTANCE, null, msgs);
			msgs = basicSetModuleInstance(newModuleInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, impPackage.SERVER_TYPE__MODULE_INSTANCE, newModuleInstance, newModuleInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case impPackage.SERVER_TYPE__REFERENCE:
				return basicSetReference(null, msgs);
			case impPackage.SERVER_TYPE__MODULE_INSTANCE:
				return basicSetModuleInstance(null, msgs);
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
			case impPackage.SERVER_TYPE__REFERENCE:
				return getReference();
			case impPackage.SERVER_TYPE__MODULE_INSTANCE:
				return getModuleInstance();
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
			case impPackage.SERVER_TYPE__REFERENCE:
				setReference((OpRef)newValue);
				return;
			case impPackage.SERVER_TYPE__MODULE_INSTANCE:
				setModuleInstance((OpRefActivatableFifo)newValue);
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
			case impPackage.SERVER_TYPE__REFERENCE:
				setReference((OpRef)null);
				return;
			case impPackage.SERVER_TYPE__MODULE_INSTANCE:
				setModuleInstance((OpRefActivatableFifo)null);
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
			case impPackage.SERVER_TYPE__REFERENCE:
				return reference != null;
			case impPackage.SERVER_TYPE__MODULE_INSTANCE:
				return moduleInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ServerTypeImpl
