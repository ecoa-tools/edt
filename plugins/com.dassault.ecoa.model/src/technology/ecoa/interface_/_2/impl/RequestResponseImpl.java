/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import technology.ecoa.interface_._2.Parameter;
import technology.ecoa.interface_._2.RequestResponse;
import technology.ecoa.interface_._2.interPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.interface_._2.impl.RequestResponseImpl#getInput <em>Input</em>}</li>
 *   <li>{@link technology.ecoa.interface_._2.impl.RequestResponseImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestResponseImpl extends OperationImpl implements RequestResponse {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return interPackage.Literals.REQUEST_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Parameter>(Parameter.class, this, interPackage.REQUEST_RESPONSE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Parameter>(Parameter.class, this, interPackage.REQUEST_RESPONSE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case interPackage.REQUEST_RESPONSE__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case interPackage.REQUEST_RESPONSE__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case interPackage.REQUEST_RESPONSE__INPUT:
				return getInput();
			case interPackage.REQUEST_RESPONSE__OUTPUT:
				return getOutput();
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
			case interPackage.REQUEST_RESPONSE__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Parameter>)newValue);
				return;
			case interPackage.REQUEST_RESPONSE__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Parameter>)newValue);
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
			case interPackage.REQUEST_RESPONSE__INPUT:
				getInput().clear();
				return;
			case interPackage.REQUEST_RESPONSE__OUTPUT:
				getOutput().clear();
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
			case interPackage.REQUEST_RESPONSE__INPUT:
				return input != null && !input.isEmpty();
			case interPackage.REQUEST_RESPONSE__OUTPUT:
				return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequestResponseImpl
