/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import technology.ecoa.sca.extension.scaExt.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scaExtFactoryImpl extends EFactoryImpl implements scaExtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static scaExtFactory init() {
		try {
			scaExtFactory thescaExtFactory = (scaExtFactory)EPackage.Registry.INSTANCE.getEFactory(scaExtPackage.eNS_URI);
			if (thescaExtFactory != null) {
				return thescaExtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new scaExtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaExtFactoryImpl() {
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
			case scaExtPackage.IMPLEMENTATION_TYPE: return createImplementationType();
			case scaExtPackage.INSTANCE: return createInstance();
			case scaExtPackage.INTERFACE: return createInterface();
			case scaExtPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case scaExtPackage.WIRE_INFORMATION: return createWireInformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationType createImplementationType() {
		ImplementationTypeImpl implementationType = new ImplementationTypeImpl();
		return implementationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireInformation createWireInformation() {
		WireInformationImpl wireInformation = new WireInformationImpl();
		return wireInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaExtPackage getscaExtPackage() {
		return (scaExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static scaExtPackage getPackage() {
		return scaExtPackage.eINSTANCE;
	}

} //scaExtFactoryImpl
