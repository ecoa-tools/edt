/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import technology.ecoa.implementation._2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class impFactoryImpl extends EFactoryImpl implements impFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static impFactory init() {
		try {
			impFactory theimpFactory = (impFactory)EPackage.Registry.INSTANCE.getEFactory(impPackage.eNS_URI);
			if (theimpFactory != null) {
				return theimpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new impFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impFactoryImpl() {
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
			case impPackage.CLIENTS_TYPE: return createClientsType();
			case impPackage.COMPONENT_IMPLEMENTATION: return createComponentImplementation();
			case impPackage.DATA_LINK: return createDataLink();
			case impPackage.DATA_READ_TYPE: return createDataReadType();
			case impPackage.DATA_WRITTEN_TYPE: return createDataWrittenType();
			case impPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case impPackage.DYNAMIC_TRIGGER_INSTANCE: return createDynamicTriggerInstance();
			case impPackage.EVENT: return createEvent();
			case impPackage.EVENT_LINK: return createEventLink();
			case impPackage.EVENT_RECEIVED_TYPE: return createEventReceivedType();
			case impPackage.INSTANCE: return createInstance();
			case impPackage.MODULE_IMPLEMENTATION: return createModuleImplementation();
			case impPackage.MODULE_INSTANCE: return createModuleInstance();
			case impPackage.MODULE_TYPE: return createModuleType();
			case impPackage.OPERATIONS_TYPE: return createOperationsType();
			case impPackage.OP_REF: return createOpRef();
			case impPackage.OP_REF_ACTIVATABLE: return createOpRefActivatable();
			case impPackage.OP_REF_ACTIVATABLE_FIFO: return createOpRefActivatableFifo();
			case impPackage.OP_REF_ACTIVATING_FIFO: return createOpRefActivatingFifo();
			case impPackage.OP_REF_EXTERNAL: return createOpRefExternal();
			case impPackage.OP_REF_TRIGGER: return createOpRefTrigger();
			case impPackage.PARAMETER: return createParameter();
			case impPackage.PINFO_TYPE: return createPinfoType();
			case impPackage.PINFO_TYPE1: return createPinfoType1();
			case impPackage.PINFO_VALUE: return createPinfoValue();
			case impPackage.PRIVATE_PINFO: return createPrivatePinfo();
			case impPackage.PROPERTIES_TYPE: return createPropertiesType();
			case impPackage.PROPERTY_VALUE: return createPropertyValue();
			case impPackage.PROPERTY_VALUES: return createPropertyValues();
			case impPackage.PUBLIC_PINFO: return createPublicPinfo();
			case impPackage.READERS_TYPE: return createReadersType();
			case impPackage.RECEIVERS_TYPE: return createReceiversType();
			case impPackage.REQUEST_LINK: return createRequestLink();
			case impPackage.REQUEST_RECEIVED_TYPE: return createRequestReceivedType();
			case impPackage.REQUEST_RESPONSE: return createRequestResponse();
			case impPackage.REQUEST_SENT_TYPE: return createRequestSentType();
			case impPackage.SENDERS_TYPE: return createSendersType();
			case impPackage.SERVER_TYPE: return createServerType();
			case impPackage.SERVICE_QO_S: return createServiceQoS();
			case impPackage.TRIGGER_INSTANCE: return createTriggerInstance();
			case impPackage.USE_TYPE: return createUseType();
			case impPackage.VERSIONED_DATA: return createVersionedData();
			case impPackage.WRITERS_TYPE: return createWritersType();
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
			case impPackage.PROGRAMMING_LANGUAGE:
				return createProgrammingLanguageFromString(eDataType, initialValue);
			case impPackage.HEX_OR_DEC_VALUE:
				return createHexOrDecValueFromString(eDataType, initialValue);
			case impPackage.LIBRARY_NAME:
				return createLibraryNameFromString(eDataType, initialValue);
			case impPackage.NAME_ID:
				return createNameIdFromString(eDataType, initialValue);
			case impPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return createProgrammingLanguageObjectFromString(eDataType, initialValue);
			case impPackage.RELATIVE_PRIORITY:
				return createRelativePriorityFromString(eDataType, initialValue);
			case impPackage.STEPS:
				return createStepsFromString(eDataType, initialValue);
			case impPackage.STEPS_OBJECT:
				return createStepsObjectFromString(eDataType, initialValue);
			case impPackage.TIME_DURATION:
				return createTimeDurationFromString(eDataType, initialValue);
			case impPackage.TIME_DURATION_OBJECT:
				return createTimeDurationObjectFromString(eDataType, initialValue);
			case impPackage.TYPE_NAME:
				return createTypeNameFromString(eDataType, initialValue);
			case impPackage.TYPE_QNAME:
				return createTypeQNameFromString(eDataType, initialValue);
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
			case impPackage.PROGRAMMING_LANGUAGE:
				return convertProgrammingLanguageToString(eDataType, instanceValue);
			case impPackage.HEX_OR_DEC_VALUE:
				return convertHexOrDecValueToString(eDataType, instanceValue);
			case impPackage.LIBRARY_NAME:
				return convertLibraryNameToString(eDataType, instanceValue);
			case impPackage.NAME_ID:
				return convertNameIdToString(eDataType, instanceValue);
			case impPackage.PROGRAMMING_LANGUAGE_OBJECT:
				return convertProgrammingLanguageObjectToString(eDataType, instanceValue);
			case impPackage.RELATIVE_PRIORITY:
				return convertRelativePriorityToString(eDataType, instanceValue);
			case impPackage.STEPS:
				return convertStepsToString(eDataType, instanceValue);
			case impPackage.STEPS_OBJECT:
				return convertStepsObjectToString(eDataType, instanceValue);
			case impPackage.TIME_DURATION:
				return convertTimeDurationToString(eDataType, instanceValue);
			case impPackage.TIME_DURATION_OBJECT:
				return convertTimeDurationObjectToString(eDataType, instanceValue);
			case impPackage.TYPE_NAME:
				return convertTypeNameToString(eDataType, instanceValue);
			case impPackage.TYPE_QNAME:
				return convertTypeQNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientsType createClientsType() {
		ClientsTypeImpl clientsType = new ClientsTypeImpl();
		return clientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentImplementation createComponentImplementation() {
		ComponentImplementationImpl componentImplementation = new ComponentImplementationImpl();
		return componentImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLink createDataLink() {
		DataLinkImpl dataLink = new DataLinkImpl();
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataReadType createDataReadType() {
		DataReadTypeImpl dataReadType = new DataReadTypeImpl();
		return dataReadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataWrittenType createDataWrittenType() {
		DataWrittenTypeImpl dataWrittenType = new DataWrittenTypeImpl();
		return dataWrittenType;
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
	public DynamicTriggerInstance createDynamicTriggerInstance() {
		DynamicTriggerInstanceImpl dynamicTriggerInstance = new DynamicTriggerInstanceImpl();
		return dynamicTriggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventLink createEventLink() {
		EventLinkImpl eventLink = new EventLinkImpl();
		return eventLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventReceivedType createEventReceivedType() {
		EventReceivedTypeImpl eventReceivedType = new EventReceivedTypeImpl();
		return eventReceivedType;
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
	public ModuleImplementation createModuleImplementation() {
		ModuleImplementationImpl moduleImplementation = new ModuleImplementationImpl();
		return moduleImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleInstance createModuleInstance() {
		ModuleInstanceImpl moduleInstance = new ModuleInstanceImpl();
		return moduleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType createModuleType() {
		ModuleTypeImpl moduleType = new ModuleTypeImpl();
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationsType createOperationsType() {
		OperationsTypeImpl operationsType = new OperationsTypeImpl();
		return operationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRef createOpRef() {
		OpRefImpl opRef = new OpRefImpl();
		return opRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefActivatable createOpRefActivatable() {
		OpRefActivatableImpl opRefActivatable = new OpRefActivatableImpl();
		return opRefActivatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefActivatableFifo createOpRefActivatableFifo() {
		OpRefActivatableFifoImpl opRefActivatableFifo = new OpRefActivatableFifoImpl();
		return opRefActivatableFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefActivatingFifo createOpRefActivatingFifo() {
		OpRefActivatingFifoImpl opRefActivatingFifo = new OpRefActivatingFifoImpl();
		return opRefActivatingFifo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefExternal createOpRefExternal() {
		OpRefExternalImpl opRefExternal = new OpRefExternalImpl();
		return opRefExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpRefTrigger createOpRefTrigger() {
		OpRefTriggerImpl opRefTrigger = new OpRefTriggerImpl();
		return opRefTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinfoType createPinfoType() {
		PinfoTypeImpl pinfoType = new PinfoTypeImpl();
		return pinfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinfoType1 createPinfoType1() {
		PinfoType1Impl pinfoType1 = new PinfoType1Impl();
		return pinfoType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinfoValue createPinfoValue() {
		PinfoValueImpl pinfoValue = new PinfoValueImpl();
		return pinfoValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivatePinfo createPrivatePinfo() {
		PrivatePinfoImpl privatePinfo = new PrivatePinfoImpl();
		return privatePinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValue createPropertyValue() {
		PropertyValueImpl propertyValue = new PropertyValueImpl();
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValues createPropertyValues() {
		PropertyValuesImpl propertyValues = new PropertyValuesImpl();
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicPinfo createPublicPinfo() {
		PublicPinfoImpl publicPinfo = new PublicPinfoImpl();
		return publicPinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadersType createReadersType() {
		ReadersTypeImpl readersType = new ReadersTypeImpl();
		return readersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiversType createReceiversType() {
		ReceiversTypeImpl receiversType = new ReceiversTypeImpl();
		return receiversType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestLink createRequestLink() {
		RequestLinkImpl requestLink = new RequestLinkImpl();
		return requestLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestReceivedType createRequestReceivedType() {
		RequestReceivedTypeImpl requestReceivedType = new RequestReceivedTypeImpl();
		return requestReceivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestResponse createRequestResponse() {
		RequestResponseImpl requestResponse = new RequestResponseImpl();
		return requestResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestSentType createRequestSentType() {
		RequestSentTypeImpl requestSentType = new RequestSentTypeImpl();
		return requestSentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendersType createSendersType() {
		SendersTypeImpl sendersType = new SendersTypeImpl();
		return sendersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerType createServerType() {
		ServerTypeImpl serverType = new ServerTypeImpl();
		return serverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceQoS createServiceQoS() {
		ServiceQoSImpl serviceQoS = new ServiceQoSImpl();
		return serviceQoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerInstance createTriggerInstance() {
		TriggerInstanceImpl triggerInstance = new TriggerInstanceImpl();
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseType createUseType() {
		UseTypeImpl useType = new UseTypeImpl();
		return useType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedData createVersionedData() {
		VersionedDataImpl versionedData = new VersionedDataImpl();
		return versionedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WritersType createWritersType() {
		WritersTypeImpl writersType = new WritersTypeImpl();
		return writersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageFromString(EDataType eDataType, String initialValue) {
		ProgrammingLanguage result = ProgrammingLanguage.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHexOrDecValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHexOrDecValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLibraryNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibraryNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNameIdFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameIdToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammingLanguage createProgrammingLanguageObjectFromString(EDataType eDataType, String initialValue) {
		return createProgrammingLanguageFromString(impPackage.Literals.PROGRAMMING_LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgrammingLanguageObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProgrammingLanguageToString(impPackage.Literals.PROGRAMMING_LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createRelativePriorityFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativePriorityToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createStepsFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createStepsObjectFromString(EDataType eDataType, String initialValue) {
		return createStepsFromString(impPackage.Literals.STEPS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepsToString(impPackage.Literals.STEPS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTimeDurationFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTimeDurationObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeDurationFromString(impPackage.Literals.TIME_DURATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeDurationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeDurationToString(impPackage.Literals.TIME_DURATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeNameFromString(EDataType eDataType, String initialValue) {
		return createNameIdFromString(impPackage.Literals.NAME_ID, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeNameToString(EDataType eDataType, Object instanceValue) {
		return convertNameIdToString(impPackage.Literals.NAME_ID, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeQNameFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeQNameToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public impPackage getimpPackage() {
		return (impPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static impPackage getPackage() {
		return impPackage.eINSTANCE;
	}

} //impFactoryImpl
