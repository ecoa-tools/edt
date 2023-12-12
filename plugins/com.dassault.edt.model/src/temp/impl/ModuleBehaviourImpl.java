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

import temp.ModuleBehaviour;
import temp.TempPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link temp.impl.ModuleBehaviourImpl#getName <em>Name</em>}</li>
 *   <li>{@link temp.impl.ModuleBehaviourImpl#getModuleBehaviour <em>Module Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleBehaviourImpl extends MinimalEObjectImpl.Container implements ModuleBehaviour {
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
	 * The cached value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected technology.ecoa.module.behaviour._2.ModuleBehaviour moduleBehaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TempPackage.Literals.MODULE_BEHAVIOUR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.MODULE_BEHAVIOUR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public technology.ecoa.module.behaviour._2.ModuleBehaviour getModuleBehaviour() {
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleBehaviour(technology.ecoa.module.behaviour._2.ModuleBehaviour newModuleBehaviour, NotificationChain msgs) {
		technology.ecoa.module.behaviour._2.ModuleBehaviour oldModuleBehaviour = moduleBehaviour;
		moduleBehaviour = newModuleBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR, oldModuleBehaviour, newModuleBehaviour);
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
	public void setModuleBehaviour(technology.ecoa.module.behaviour._2.ModuleBehaviour newModuleBehaviour) {
		if (newModuleBehaviour != moduleBehaviour) {
			NotificationChain msgs = null;
			if (moduleBehaviour != null)
				msgs = ((InternalEObject)moduleBehaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR, null, msgs);
			if (newModuleBehaviour != null)
				msgs = ((InternalEObject)newModuleBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR, null, msgs);
			msgs = basicSetModuleBehaviour(newModuleBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR, newModuleBehaviour, newModuleBehaviour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR:
				return basicSetModuleBehaviour(null, msgs);
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
			case TempPackage.MODULE_BEHAVIOUR__NAME:
				return getName();
			case TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR:
				return getModuleBehaviour();
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
			case TempPackage.MODULE_BEHAVIOUR__NAME:
				setName((String)newValue);
				return;
			case TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR:
				setModuleBehaviour((technology.ecoa.module.behaviour._2.ModuleBehaviour)newValue);
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
			case TempPackage.MODULE_BEHAVIOUR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR:
				setModuleBehaviour((technology.ecoa.module.behaviour._2.ModuleBehaviour)null);
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
			case TempPackage.MODULE_BEHAVIOUR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TempPackage.MODULE_BEHAVIOUR__MODULE_BEHAVIOUR:
				return moduleBehaviour != null;
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

} //ModuleBehaviourImpl
