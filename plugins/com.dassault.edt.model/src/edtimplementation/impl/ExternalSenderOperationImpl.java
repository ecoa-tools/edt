/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.EdtimplementationPackage;
import edtimplementation.ExternalSenderOperation;
import edtimplementation.OperationLink;
import edtproject.Steps;
import technology.ecoa.implementation._2.ProgrammingLanguage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>External Sender Operation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ExternalSenderOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.ExternalSenderOperationImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalSenderOperationImpl extends MinimalEObjectImpl.Container implements ExternalSenderOperation {
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
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammingLanguage LANGUAGE_EDEFAULT = ProgrammingLanguage.C;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected ProgrammingLanguage language = LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean languageESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalSenderOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.EXTERNAL_SENDER_OPERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammingLanguage getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage oldLanguage = language;
		language = newLanguage == null ? LANGUAGE_EDEFAULT : newLanguage;
		boolean oldLanguageESet = languageESet;
		languageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE, oldLanguage, language, !oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLanguage() {
		ProgrammingLanguage oldLanguage = language;
		boolean oldLanguageESet = languageESet;
		language = LANGUAGE_EDEFAULT;
		languageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE, oldLanguage, LANGUAGE_EDEFAULT, oldLanguageESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLanguage() {
		return languageESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__NAME:
				return getName();
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE:
				return getLanguage();
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
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE:
				setLanguage((ProgrammingLanguage)newValue);
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
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE:
				unsetLanguage();
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
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.EXTERNAL_SENDER_OPERATION__LANGUAGE:
				return isSetLanguage();
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
		result.append(", language: ");
		if (languageESet) result.append(language); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public String getSimplifiedClassName() {
		return "External Operation";
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

} // ExternalSenderOperationImpl
