/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import temp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TempFactoryImpl extends EFactoryImpl implements TempFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TempFactory init() {
		try {
			TempFactory theTempFactory = (TempFactory)EPackage.Registry.INSTANCE.getEFactory(TempPackage.eNS_URI);
			if (theTempFactory != null) {
				return theTempFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TempFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TempPackage.MODULE_BEHAVIOUR: return createModuleBehaviour();
			case TempPackage.INSERTION_POLICIES: return createInsertionPolicies();
			case TempPackage.CROSS_PLATFORM_VIEW: return createCrossPlatformView();
			case TempPackage.EUID: return createEUID();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleBehaviour createModuleBehaviour() {
		ModuleBehaviourImpl moduleBehaviour = new ModuleBehaviourImpl();
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InsertionPolicies createInsertionPolicies() {
		InsertionPoliciesImpl insertionPolicies = new InsertionPoliciesImpl();
		return insertionPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossPlatformView createCrossPlatformView() {
		CrossPlatformViewImpl crossPlatformView = new CrossPlatformViewImpl();
		return crossPlatformView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EUID createEUID() {
		EUIDImpl euid = new EUIDImpl();
		return euid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TempPackage getTempPackage() {
		return (TempPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TempPackage getPackage() {
		return TempPackage.eINSTANCE;
	}

} //TempFactoryImpl
