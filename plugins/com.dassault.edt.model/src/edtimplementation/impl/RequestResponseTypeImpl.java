/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

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

import edtimplementation.EdtimplementationPackage;
import edtimplementation.OperationInstance;
import edtimplementation.Parameter;
import edtimplementation.RequestResponseType;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Request
 * Response Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.RequestResponseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestResponseTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link edtimplementation.impl.RequestResponseTypeImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestResponseTypeImpl extends MinimalEObjectImpl.Container implements RequestResponseType {
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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> output;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestResponseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.REQUEST_RESPONSE_TYPE;
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
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;

		EList<OperationInstance> associatedRequestResponseInstance = findAssociatedRequestResponseInstance();
		for (OperationInstance operationInstance : associatedRequestResponseInstance) {
			operationInstance.setName(newName);
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.REQUEST_RESPONSE_TYPE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Parameter>(Parameter.class, this, EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Parameter>(Parameter.class, this, EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__NAME:
				return getName();
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT:
				return getInput();
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT:
				return getOutput();
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
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Parameter>)newValue);
				return;
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Parameter>)newValue);
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
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT:
				getInput().clear();
				return;
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT:
				getOutput().clear();
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
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__INPUT:
				return input != null && !input.isEmpty();
			case EdtimplementationPackage.REQUEST_RESPONSE_TYPE__OUTPUT:
				return output != null && !output.isEmpty();
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

	/**
	 * Find all RequestResponseInstance associated to the RequestResponseType
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<OperationInstance> findAssociatedRequestResponseInstance() {
		EList<OperationInstance> requestResponseInstanceAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationInstance operationInstance) {
					requestResponseInstanceAssociated.add(operationInstance);
				}
			}
		}
		return requestResponseInstanceAssociated;
	}

	/**
	 * 
	 * @return true if no missing attributes
	 */
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

}
// RequestResponseTypeImpl
