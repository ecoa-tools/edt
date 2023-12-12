/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.udpbinding._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class udpFactoryImpl extends EFactoryImpl implements udpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static udpFactory init() {
		try {
			udpFactory theudpFactory = (udpFactory)EPackage.Registry.INSTANCE.getEFactory(udpPackage.eNS_URI);
			if (theudpFactory != null) {
				return theudpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new udpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public udpFactoryImpl() {
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
			case udpPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case udpPackage.PLATFORM_TYPE: return createPlatformType();
			case udpPackage.UDP_BINDING_TYPE: return createUDPBindingType();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case udpPackage.PLATFORM_ID:
				return createPlatformIDFromString(eDataType, initialValue);
			case udpPackage.PLATFORM_ID_OBJECT:
				return createPlatformIDObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case udpPackage.PLATFORM_ID:
				return convertPlatformIDToString(eDataType, instanceValue);
			case udpPackage.PLATFORM_ID_OBJECT:
				return convertPlatformIDObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public PlatformType createPlatformType() {
		PlatformTypeImpl platformType = new PlatformTypeImpl();
		return platformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPBindingType createUDPBindingType() {
		UDPBindingTypeImpl udpBindingType = new UDPBindingTypeImpl();
		return udpBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPlatformIDFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.UNSIGNED_INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.UNSIGNED_INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPlatformIDObjectFromString(EDataType eDataType, String initialValue) {
		return createPlatformIDFromString(udpPackage.Literals.PLATFORM_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlatformIDObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlatformIDToString(udpPackage.Literals.PLATFORM_ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public udpPackage getudpPackage() {
		return (udpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static udpPackage getPackage() {
		return udpPackage.eINSTANCE;
	}

} //udpFactoryImpl
