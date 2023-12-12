/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos.impl;

import edtqos.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdtqosFactoryImpl extends EFactoryImpl implements EdtqosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdtqosFactory init() {
		try {
			EdtqosFactory theEdtqosFactory = (EdtqosFactory)EPackage.Registry.INSTANCE.getEFactory(EdtqosPackage.eNS_URI);
			if (theEdtqosFactory != null) {
				return theEdtqosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtqosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtqosFactoryImpl() {
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
			case EdtqosPackage.SERVICE_INSTANCE_QOS: return createServiceInstanceQos();
			case EdtqosPackage.DATA: return createData();
			case EdtqosPackage.EVENT: return createEvent();
			case EdtqosPackage.REQUEST_RESPONSE: return createRequestResponse();
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
	public ServiceInstanceQos createServiceInstanceQos() {
		ServiceInstanceQosImpl serviceInstanceQos = new ServiceInstanceQosImpl();
		return serviceInstanceQos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResponse createRequestResponse() {
		RequestResponseImpl requestResponse = new RequestResponseImpl();
		return requestResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtqosPackage getEdtqosPackage() {
		return (EdtqosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtqosPackage getPackage() {
		return EdtqosPackage.eINSTANCE;
	}

} //EdtqosFactoryImpl
