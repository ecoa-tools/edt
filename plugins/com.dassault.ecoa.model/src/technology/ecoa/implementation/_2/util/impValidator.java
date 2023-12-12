/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import technology.ecoa.implementation._2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.implementation._2.impPackage
 * @generated
 */
public class impValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final impValidator INSTANCE = new impValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "technology.ecoa.implementation._2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return impPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case impPackage.CLIENTS_TYPE:
				return validateClientsType((ClientsType)value, diagnostics, context);
			case impPackage.COMPONENT_IMPLEMENTATION:
				return validateComponentImplementation((ComponentImplementation)value, diagnostics, context);
			case impPackage.DATA_LINK:
				return validateDataLink((DataLink)value, diagnostics, context);
			case impPackage.DATA_READ_TYPE:
				return validateDataReadType((DataReadType)value, diagnostics, context);
			case impPackage.DATA_WRITTEN_TYPE:
				return validateDataWrittenType((DataWrittenType)value, diagnostics, context);
			case impPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case impPackage.DYNAMIC_TRIGGER_INSTANCE:
				return validateDynamicTriggerInstance((DynamicTriggerInstance)value, diagnostics, context);
			case impPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case impPackage.EVENT_LINK:
				return validateEventLink((EventLink)value, diagnostics, context);
			case impPackage.EVENT_RECEIVED_TYPE:
				return validateEventReceivedType((EventReceivedType)value, diagnostics, context);
			case impPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case impPackage.MODULE_IMPLEMENTATION:
				return validateModuleImplementation((ModuleImplementation)value, diagnostics, context);
			case impPackage.MODULE_INSTANCE:
				return validateModuleInstance((ModuleInstance)value, diagnostics, context);
			case impPackage.MODULE_TYPE:
				return validateModuleType((ModuleType)value, diagnostics, context);
			case impPackage.OPERATIONS_TYPE:
				return validateOperationsType((OperationsType)value, diagnostics, context);
			case impPackage.OP_REF:
				return validateOpRef((OpRef)value, diagnostics, context);
			case impPackage.OP_REF_ACTIVATABLE:
				return validateOpRefActivatable((OpRefActivatable)value, diagnostics, context);
			case impPackage.OP_REF_ACTIVATABLE_FIFO:
				return validateOpRefActivatableFifo((OpRefActivatableFifo)value, diagnostics, context);
			case impPackage.OP_REF_ACTIVATING_FIFO:
				return validateOpRefActivatingFifo((OpRefActivatingFifo)value, diagnostics, context);
			case impPackage.OP_REF_EXTERNAL:
				return validateOpRefExternal((OpRefExternal)value, diagnostics, context);
			case impPackage.OP_REF_TRIGGER:
				return validateOpRefTrigger((OpRefTrigger)value, diagnostics, context);
			case impPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case impPackage.PINFO_TYPE:
				return validatePinfoType((PinfoType)value, diagnostics, context);
			case impPackage.PINFO_TYPE1:
				return validatePinfoType1((PinfoType1)value, diagnostics, context);
			case impPackage.PINFO_VALUE:
				return validatePinfoValue((PinfoValue)value, diagnostics, context);
			case impPackage.PRIVATE_PINFO:
				return validatePrivatePinfo((PrivatePinfo)value, diagnostics, context);
			case impPackage.PROPERTIES_TYPE:
				return validatePropertiesType((PropertiesType)value, diagnostics, context);
			case impPackage.PROPERTY_VALUE:
				return validatePropertyValue((PropertyValue)value, diagnostics, context);
			case impPackage.PROPERTY_VALUES:
				return validatePropertyValues((PropertyValues)value, diagnostics, context);
			case impPackage.PUBLIC_PINFO:
				return validatePublicPinfo((PublicPinfo)value, diagnostics, context);
			case impPackage.READERS_TYPE:
				return validateReadersType((ReadersType)value, diagnostics, context);
			case impPackage.RECEIVERS_TYPE:
				return validateReceiversType((ReceiversType)value, diagnostics, context);
			case impPackage.REQUEST_LINK:
				return validateRequestLink((RequestLink)value, diagnostics, context);
			case impPackage.REQUEST_RECEIVED_TYPE:
				return validateRequestReceivedType((RequestReceivedType)value, diagnostics, context);
			case impPackage.REQUEST_RESPONSE:
				return validateRequestResponse((RequestResponse)value, diagnostics, context);
			case impPackage.REQUEST_SENT_TYPE:
				return validateRequestSentType((RequestSentType)value, diagnostics, context);
			case impPackage.SENDERS_TYPE:
				return validateSendersType((SendersType)value, diagnostics, context);
			case impPackage.SERVER_TYPE:
				return validateServerType((ServerType)value, diagnostics, context);
			case impPackage.SERVICE_QO_S:
				return validateServiceQoS((ServiceQoS)value, diagnostics, context);
			case impPackage.TRIGGER_INSTANCE:
				return validateTriggerInstance((TriggerInstance)value, diagnostics, context);
			case impPackage.USE_TYPE:
				return validateUseType((UseType)value, diagnostics, context);
			case impPackage.VERSIONED_DATA:
				return validateVersionedData((VersionedData)value, diagnostics, context);
			case impPackage.WRITERS_TYPE:
				return validateWritersType((WritersType)value, diagnostics, context);
			case impPackage.PROGRAMMING_LANGUAGE:
				return validateProgrammingLanguage((ProgrammingLanguage)value, diagnostics, context);
			case impPackage.HEX_OR_DEC_VALUE:
				return validateHexOrDecValue((String)value, diagnostics, context);
			case impPackage.LIBRARY_NAME:
				return validateLibraryName((String)value, diagnostics, context);
			case impPackage.NAME_ID:
				return validateNameId((String)value, diagnostics, context);
			case impPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return validateProgrammingLanguageObject((ProgrammingLanguage)value, diagnostics, context);
			case impPackage.RELATIVE_PRIORITY:
				return validateRelativePriority((BigInteger)value, diagnostics, context);
			case impPackage.STEPS:
				return validateSteps((Double)value, diagnostics, context);
			case impPackage.STEPS_OBJECT:
				return validateStepsObject((Double)value, diagnostics, context);
			case impPackage.TIME_DURATION:
				return validateTimeDuration((Double)value, diagnostics, context);
			case impPackage.TIME_DURATION_OBJECT:
				return validateTimeDurationObject((Double)value, diagnostics, context);
			case impPackage.TYPE_NAME:
				return validateTypeName((String)value, diagnostics, context);
			case impPackage.TYPE_QNAME:
				return validateTypeQName((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClientsType(ClientsType clientsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clientsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentImplementation(ComponentImplementation componentImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataLink(DataLink dataLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataReadType(DataReadType dataReadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataReadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataWrittenType(DataWrittenType dataWrittenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataWrittenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicTriggerInstance(DynamicTriggerInstance dynamicTriggerInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicTriggerInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventLink(EventLink eventLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventReceivedType(EventReceivedType eventReceivedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventReceivedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleImplementation(ModuleImplementation moduleImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleInstance(ModuleInstance moduleInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleType(ModuleType moduleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(moduleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationsType(OperationsType operationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRef(OpRef opRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRefActivatable(OpRefActivatable opRefActivatable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRefActivatable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRefActivatableFifo(OpRefActivatableFifo opRefActivatableFifo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRefActivatableFifo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRefActivatingFifo(OpRefActivatingFifo opRefActivatingFifo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRefActivatingFifo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRefExternal(OpRefExternal opRefExternal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRefExternal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpRefTrigger(OpRefTrigger opRefTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opRefTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinfoType(PinfoType pinfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinfoType1(PinfoType1 pinfoType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinfoType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePinfoValue(PinfoValue pinfoValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pinfoValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivatePinfo(PrivatePinfo privatePinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(privatePinfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValue(PropertyValue propertyValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyValues(PropertyValues propertyValues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyValues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePublicPinfo(PublicPinfo publicPinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(publicPinfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadersType(ReadersType readersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(readersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiversType(ReceiversType receiversType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(receiversType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestLink(RequestLink requestLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestReceivedType(RequestReceivedType requestReceivedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestReceivedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestResponse(RequestResponse requestResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestSentType(RequestSentType requestSentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requestSentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendersType(SendersType sendersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sendersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerType(ServerType serverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceQoS(ServiceQoS serviceQoS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceQoS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerInstance(TriggerInstance triggerInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseType(UseType useType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionedData(VersionedData versionedData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionedData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWritersType(WritersType writersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(writersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguage(ProgrammingLanguage programmingLanguage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHexOrDecValue_Pattern(hexOrDecValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHexOrDecValue_Pattern
	 */
	public static final  PatternMatcher [][] HEX_OR_DEC_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("0x[0-9A-Fa-f]+|[1-9][0-9]*|0")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hex Or Dec Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHexOrDecValue_Pattern(String hexOrDecValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(impPackage.Literals.HEX_OR_DEC_VALUE, hexOrDecValue, HEX_OR_DEC_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLibraryName_Pattern(libraryName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLibraryName_Pattern
	 */
	public static final  PatternMatcher [][] LIBRARY_NAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_\\.]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Library Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibraryName_Pattern(String libraryName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(impPackage.Literals.LIBRARY_NAME, libraryName, LIBRARY_NAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(nameId, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNameId_Pattern
	 */
	public static final  PatternMatcher [][] NAME_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Name Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameId_Pattern(String nameId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(impPackage.Literals.NAME_ID, nameId, NAME_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammingLanguageObject(ProgrammingLanguage programmingLanguageObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePriority(BigInteger relativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRelativePriority_Min(relativePriority, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativePriority_Max(relativePriority, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativePriority_Min
	 */
	public static final BigInteger RELATIVE_PRIORITY__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Relative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePriority_Min(BigInteger relativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = relativePriority.compareTo(RELATIVE_PRIORITY__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(impPackage.Literals.RELATIVE_PRIORITY, relativePriority, RELATIVE_PRIORITY__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRelativePriority_Max
	 */
	public static final BigInteger RELATIVE_PRIORITY__MAX__VALUE = new BigInteger("255");

	/**
	 * Validates the Max constraint of '<em>Relative Priority</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePriority_Max(BigInteger relativePriority, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = relativePriority.compareTo(RELATIVE_PRIORITY__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(impPackage.Literals.RELATIVE_PRIORITY, relativePriority, RELATIVE_PRIORITY__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(steps, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSteps_Min
	 */
	public static final double STEPS__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSteps_Min(double steps, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = steps >= STEPS__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(impPackage.Literals.STEPS, steps, STEPS__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepsObject(Double stepsObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSteps_Min(stepsObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDuration, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeDuration_Min
	 */
	public static final double TIME_DURATION__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDuration_Min(double timeDuration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = timeDuration >= TIME_DURATION__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(impPackage.Literals.TIME_DURATION, timeDuration, TIME_DURATION__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeDurationObject(Double timeDurationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeDuration_Min(timeDurationObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeName(String typeName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameId_Pattern(typeName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeQName_Pattern(typeQName, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeQName_Pattern
	 */
	public static final  PatternMatcher [][] TYPE_QNAME__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Type QName</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeQName_Pattern(String typeQName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(impPackage.Literals.TYPE_QNAME, typeQName, TYPE_QNAME__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //impValidator
