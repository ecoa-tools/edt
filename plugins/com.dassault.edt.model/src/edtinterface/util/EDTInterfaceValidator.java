/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import edtinterface.Data;
import edtinterface.EDTInterfacePackage;
import edtinterface.Event;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc
 * -->
 * 
 * @see edtinterface.EDTInterfacePackage
 * @generated
 */
public class EDTInterfaceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final EDTInterfaceValidator INSTANCE = new EDTInterfaceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edtinterface";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Name Is Unique' of 'Operation Type'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int OPERATION_TYPE__NAME_IS_UNIQUE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for
	 * additional hand written constants. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public EDTInterfaceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EDTInterfacePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
			case EDTInterfacePackage.SERVICE_DEFINITION:
				return validateServiceDefinition((ServiceDefinition)value, diagnostics, context);
			case EDTInterfacePackage.OPERATION_TYPE:
				return validateOperationType((OperationType)value, diagnostics, context);
			case EDTInterfacePackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case EDTInterfacePackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case EDTInterfacePackage.REQUEST_RESPONSE:
				return validateRequestResponse((RequestResponse)value, diagnostics, context);
			case EDTInterfacePackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceDefinition(ServiceDefinition serviceDefinition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationType_nameIsUnique(operationType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameIsUnique constraint of '<em>Operation Type</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateOperationType_nameIsUnique(OperationType operationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return operationType.nameIsUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(data, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(data, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationType_nameIsUnique(data, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationType_nameIsUnique(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestResponse(RequestResponse requestResponse, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requestResponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requestResponse, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperationType_nameIsUnique(requestResponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // EDTServiceValidator
