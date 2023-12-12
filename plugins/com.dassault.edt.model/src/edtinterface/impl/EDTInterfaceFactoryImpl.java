/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edtinterface.Data;
import edtinterface.EDTInterfaceFactory;
import edtinterface.EDTInterfacePackage;
import edtinterface.Event;
import edtinterface.Parameter;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EDTInterfaceFactoryImpl extends EFactoryImpl implements EDTInterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static EDTInterfaceFactory init() {
		try {
			EDTInterfaceFactory theEDTInterfaceFactory = (EDTInterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(EDTInterfacePackage.eNS_URI);
			if (theEDTInterfaceFactory != null) {
				return theEDTInterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EDTInterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EDTInterfaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EDTInterfacePackage.SERVICE_DEFINITION: return createServiceDefinition();
			case EDTInterfacePackage.DATA: return createData();
			case EDTInterfacePackage.EVENT: return createEvent();
			case EDTInterfacePackage.REQUEST_RESPONSE: return createRequestResponse();
			case EDTInterfacePackage.PARAMETER: return createParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefinition createServiceDefinition() {
		ServiceDefinitionImpl serviceDefinition = new ServiceDefinitionImpl();
		return serviceDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestResponse createRequestResponse() {
		RequestResponseImpl requestResponse = new RequestResponseImpl();
		return requestResponse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDTInterfacePackage getEDTInterfacePackage() {
		return (EDTInterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EDTInterfacePackage getPackage() {
		return EDTInterfacePackage.eINSTANCE;
	}

} // EDTServiceFactoryImpl
