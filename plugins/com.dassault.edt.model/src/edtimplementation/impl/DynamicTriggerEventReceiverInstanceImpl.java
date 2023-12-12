/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.dassault.edt.log.EDTLog;

import edtimplementation.DynamicTriggerEventReceiverInstance;
import edtimplementation.DynamicTriggerInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.OperationLink;
import edtimplementation.Parameter;
import edtproject.Steps;
import edttype.PredefinedType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dynamic
 * Trigger Event Receiver Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.DynamicTriggerEventReceiverInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicTriggerEventReceiverInstanceImpl extends MinimalEObjectImpl.Container
		implements DynamicTriggerEventReceiverInstance {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicTriggerEventReceiverInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Parameter> getInputs() {
		EList<Parameter> inputs = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (this.getName() != null && Objects.equals(this.getName(), "in") && findStepsContainer != null
				&& findStepsContainer.getStep0() != null) {
			EList<PredefinedType> ecoaPredefinedTypes = findStepsContainer.getStep0().getEcoaPredefinedTypes();
			Parameter firstParameter = createDelayParameter(ecoaPredefinedTypes);
			if (firstParameter == null) {
				EDTLog.toConsole(
						"There is a problem with finding the DynamicTriggerInstance 'in' operation first parameter");
			}

			inputs.add(firstParameter);
			inputs.addAll(((DynamicTriggerInstance) eContainer()).getParameter());
		}

		return inputs;
	}

	/**
	 * @param ecoaPredefinedTypes
	 * @return first parameter of 'in' operation
	 */
	private Parameter createDelayParameter(EList<PredefinedType> ecoaPredefinedTypes) {
		Parameter createParameter = EdtimplementationFactory.eINSTANCE.createParameter();
		createParameter.setName("delay");
		for (PredefinedType predefinedType : ecoaPredefinedTypes) {
			if (Objects.equals(predefinedType.getName(), "global_time")) {
				createParameter.setType(predefinedType);
				return createParameter;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME:
				return getName();
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME:
				setName((String)newValue);
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
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
			case EdtimplementationPackage.DYNAMIC_TRIGGER_EVENT_RECEIVER_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getSimplifiedClassName() {
		return "DynamicTrigger Operation";
	}

	@Override
	public EList<OperationLink> findOperationLink() {
		Steps steps = Steps.findStepsContainer(this);
		EList<OperationLink> operationLink = new BasicEList<>();
		if (steps != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, steps);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationLink component) {
					operationLink.add(component);
				}
			}
		}
		return operationLink;
	}

} // DynamicTriggerEventReceiverInstanceImpl
