/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.ComponentImplementation;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.TriggerInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Trigger
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.TriggerInstanceImpl#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link edtimplementation.impl.TriggerInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.TriggerInstanceImpl#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link edtimplementation.impl.TriggerInstanceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerInstanceImpl extends MinimalEObjectImpl.Container implements TriggerInstance {
	/**
	 * The default value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_BEHAVIOUR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected String moduleBehaviour = MODULE_BEHAVIOUR_EDEFAULT;
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
	 * The default value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RELATIVE_PRIORITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger relativePriority = RELATIVE_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected OperationInstance operations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.TRIGGER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleBehaviour() {
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleBehaviour(String newModuleBehaviour) {
		String oldModuleBehaviour = moduleBehaviour;
		moduleBehaviour = newModuleBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR, oldModuleBehaviour, moduleBehaviour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.TRIGGER_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRelativePriority() {
		return relativePriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePriority(BigInteger newRelativePriority) {
		BigInteger oldRelativePriority = relativePriority;
		relativePriority = newRelativePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationInstance getOperations() {
		return operations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperations(OperationInstance newOperations, NotificationChain msgs) {
		OperationInstance oldOperations = operations;
		operations = newOperations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS, oldOperations, newOperations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperations(OperationInstance newOperations) {
		if (newOperations != operations) {
			NotificationChain msgs = null;
			if (operations != null)
				msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS, null, msgs);
			if (newOperations != null)
				msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS, null, msgs);
			msgs = basicSetOperations(newOperations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS, newOperations, newOperations));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
				return basicSetOperations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				return getModuleBehaviour();
			case EdtimplementationPackage.TRIGGER_INSTANCE__NAME:
				return getName();
			case EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				return getRelativePriority();
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
				return getOperations();
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
			case EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour((String)newValue);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority((BigInteger)newValue);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
				setOperations((OperationInstance)newValue);
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
			case EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour(MODULE_BEHAVIOUR_EDEFAULT);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
				return;
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
				setOperations((OperationInstance)null);
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
			case EdtimplementationPackage.TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				return MODULE_BEHAVIOUR_EDEFAULT == null ? moduleBehaviour != null : !MODULE_BEHAVIOUR_EDEFAULT.equals(moduleBehaviour);
			case EdtimplementationPackage.TRIGGER_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				return RELATIVE_PRIORITY_EDEFAULT == null ? relativePriority != null : !RELATIVE_PRIORITY_EDEFAULT.equals(relativePriority);
			case EdtimplementationPackage.TRIGGER_INSTANCE__OPERATIONS:
				return operations != null;
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
		result.append(" (moduleBehaviour: ");
		result.append(moduleBehaviour);
		result.append(", name: ");
		result.append(name);
		result.append(", relativePriority: ");
		result.append(relativePriority);
		result.append(')');
		return result.toString();
	}

	public EList<OperationLink> findOperationLinks() {
		EList<OperationLink> operationLinks = new BasicEList<>();
		OperationInstance operationInstance = this.getOperations();
		ComponentImplementation componentImplementation = (ComponentImplementation) this.eContainer();
		Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(operationInstance,
				componentImplementation);
		for (Setting crossReference : crossReferences) {
			if (crossReference.getEObject() instanceof OperationLink operationLink) {
				operationLinks.add(operationLink);
			}
		}
		return operationLinks;
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getRelativePriority() != null);
	}

} // TriggerInstanceImpl
