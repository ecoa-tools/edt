/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

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

import edtproject.EDTProjectPackage;
import edtproject.OutputDirectory;
import edtproject.Step;
import edtproject.Step0;
import edtproject.Step1;
import edtproject.Step2;
import edtproject.Step3;
import edtproject.Step4;
import edtproject.Step5;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Steps</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtproject.impl.StepsImpl#getStep <em>Step</em>}</li>
 *   <li>{@link edtproject.impl.StepsImpl#getOutputDirectory <em>Output Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepsImpl extends MinimalEObjectImpl.Container implements Steps {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The cached value of the '{@link #getOutputDirectory() <em>Output Directory</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getOutputDirectory()
	 * @generated
	 * @ordered
	 */
	protected OutputDirectory outputDirectory;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StepsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEPS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, EDTProjectPackage.STEPS__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDirectory getOutputDirectory() {
		return outputDirectory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputDirectory(OutputDirectory newOutputDirectory, NotificationChain msgs) {
		OutputDirectory oldOutputDirectory = outputDirectory;
		outputDirectory = newOutputDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEPS__OUTPUT_DIRECTORY, oldOutputDirectory, newOutputDirectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDirectory(OutputDirectory newOutputDirectory) {
		if (newOutputDirectory != outputDirectory) {
			NotificationChain msgs = null;
			if (outputDirectory != null)
				msgs = ((InternalEObject)outputDirectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEPS__OUTPUT_DIRECTORY, null, msgs);
			if (newOutputDirectory != null)
				msgs = ((InternalEObject)newOutputDirectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEPS__OUTPUT_DIRECTORY, null, msgs);
			msgs = basicSetOutputDirectory(newOutputDirectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEPS__OUTPUT_DIRECTORY, newOutputDirectory, newOutputDirectory));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EDTProjectPackage.STEPS__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case EDTProjectPackage.STEPS__OUTPUT_DIRECTORY:
				return basicSetOutputDirectory(null, msgs);
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
			case EDTProjectPackage.STEPS__STEP:
				return getStep();
			case EDTProjectPackage.STEPS__OUTPUT_DIRECTORY:
				return getOutputDirectory();
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
			case EDTProjectPackage.STEPS__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case EDTProjectPackage.STEPS__OUTPUT_DIRECTORY:
				setOutputDirectory((OutputDirectory)newValue);
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
			case EDTProjectPackage.STEPS__STEP:
				getStep().clear();
				return;
			case EDTProjectPackage.STEPS__OUTPUT_DIRECTORY:
				setOutputDirectory((OutputDirectory)null);
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
			case EDTProjectPackage.STEPS__STEP:
				return step != null && !step.isEmpty();
			case EDTProjectPackage.STEPS__OUTPUT_DIRECTORY:
				return outputDirectory != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step0 getStep0() {
		if (step != null && !step.isEmpty() && step.get(0) instanceof Step0) {
			return (Step0) step.get(0);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step1 getStep1() {
		if (step != null && step.size() > 1 && step.get(1) instanceof Step1) {
			return (Step1) step.get(1);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step2 getStep2() {
		if (step != null && step.size() > 2 && step.get(2) instanceof Step2) {
			return (Step2) step.get(2);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step3 getStep3() {
		if (step != null && step.size() > 3 && step.get(3) instanceof Step3) {
			return (Step3) step.get(3);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step4 getStep4() {
		if (step != null && step.size() > 4 && step.get(4) instanceof Step4) {
			return (Step4) step.get(4);
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Step5 getStep5() {
		if (step != null && step.size() > 5 && step.get(5) instanceof Step5) {
			return (Step5) step.get(5);
		}
		return null;
	}

} // StepsImpl
