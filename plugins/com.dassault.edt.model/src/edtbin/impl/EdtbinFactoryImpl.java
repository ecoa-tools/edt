/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtbin.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edtbin.BinDesc;
import edtbin.BinaryModule;
import edtbin.EdtbinFactory;
import edtbin.EdtbinPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EdtbinFactoryImpl extends EFactoryImpl implements EdtbinFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EdtbinFactory init() {
		try {
			EdtbinFactory theEdtbinFactory = (EdtbinFactory) EPackage.Registry.INSTANCE
					.getEFactory(EdtbinPackage.eNS_URI);
			if (theEdtbinFactory != null) {
				return theEdtbinFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtbinFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EdtbinFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EdtbinPackage.BINARY_MODULE:
			return createBinaryModule();
		case EdtbinPackage.BIN_DESC:
			return createBinDesc();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BinaryModule createBinaryModule() {
		BinaryModuleImpl binaryModule = new BinaryModuleImpl();
		return binaryModule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BinDesc createBinDesc() {
		BinDescImpl binDesc = new BinDescImpl();
		return binDesc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EdtbinPackage getEdtbinPackage() {
		return (EdtbinPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtbinPackage getPackage() {
		return EdtbinPackage.eINSTANCE;
	}

} // EdtbinFactoryImpl
