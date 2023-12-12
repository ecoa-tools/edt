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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.ComponentImplementation;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.Parameter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dynamic
 * Trigger Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getSize <em>Size</em>}</li>
 *   <li>{@link edtimplementation.impl.DynamicTriggerInstanceImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicTriggerInstanceImpl extends MinimalEObjectImpl.Container implements DynamicTriggerInstance {
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
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SIZE_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInstance> operations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicTriggerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.DYNAMIC_TRIGGER_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR, oldModuleBehaviour, moduleBehaviour));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(BigInteger newSize) {
		BigInteger oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSize() {
		BigInteger oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationInstance> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationInstance>(OperationInstance.class, this, EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				return getModuleBehaviour();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__NAME:
				return getName();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				return getRelativePriority();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER:
				return getParameter();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE:
				return getSize();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour((String)newValue);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority((BigInteger)newValue);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE:
				setSize((BigInteger)newValue);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationInstance>)newValue);
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour(MODULE_BEHAVIOUR_EDEFAULT);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER:
				getParameter().clear();
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE:
				unsetSize();
				return;
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS:
				getOperations().clear();
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__MODULE_BEHAVIOUR:
				return MODULE_BEHAVIOUR_EDEFAULT == null ? moduleBehaviour != null : !MODULE_BEHAVIOUR_EDEFAULT.equals(moduleBehaviour);
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__RELATIVE_PRIORITY:
				return RELATIVE_PRIORITY_EDEFAULT == null ? relativePriority != null : !RELATIVE_PRIORITY_EDEFAULT.equals(relativePriority);
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__SIZE:
				return isSetSize();
			case EdtimplementationPackage.DYNAMIC_TRIGGER_INSTANCE__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	public EList<OperationLink> findOperationLinks() {
		EList<OperationLink> operationLinks = new BasicEList<>();
		EList<OperationInstance> operationInstances = this.getOperations();
		for (OperationInstance operationInstance : operationInstances) {
			ComponentImplementation componentImplementation = (ComponentImplementation) this.eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(operationInstance,
					componentImplementation);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationLink operationLink) {
					operationLinks.add(operationLink);
				}
			}
		}
		return operationLinks;
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getRelativePriority() != null);
	}

} // DynamicTriggerInstanceImpl
