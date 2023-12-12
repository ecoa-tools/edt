/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */
package edtuid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edtuid.EdtuidFactory;
import edtuid.EdtuidPackage;
import edtuid.ID;
import edtuid.IDMap;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class EdtuidFactoryImpl extends EFactoryImpl implements EdtuidFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static EdtuidFactory init() {
		try {
			EdtuidFactory theEdtuidFactory = (EdtuidFactory) EPackage.Registry.INSTANCE
					.getEFactory(EdtuidPackage.eNS_URI);
			if (theEdtuidFactory != null) {
				return theEdtuidFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtuidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EdtuidFactoryImpl() {
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
		case EdtuidPackage.ID_MAP:
			return createIDMap();
		case EdtuidPackage.ID:
			return createID();
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
	public IDMap createIDMap() {
		IDMapImpl idMap = new IDMapImpl();
		return idMap;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EdtuidPackage getEdtuidPackage() {
		return (EdtuidPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtuidPackage getPackage() {
		return EdtuidPackage.eINSTANCE;
	}

} // EdtuidFactoryImpl
