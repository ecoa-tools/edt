/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.ns.opencsa.sca.sca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scaFactoryImpl extends EFactoryImpl implements scaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static scaFactory init() {
		try {
			scaFactory thescaFactory = (scaFactory)EPackage.Registry.INSTANCE.getEFactory(scaPackage.eNS_URI);
			if (thescaFactory != null) {
				return thescaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new scaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaFactoryImpl() {
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
			case scaPackage.COMMON_EXTENSION_BASE: return createCommonExtensionBase();
			case scaPackage.COMPONENT: return createComponent();
			case scaPackage.COMPONENT_REFERENCE: return createComponentReference();
			case scaPackage.COMPONENT_SERVICE: return createComponentService();
			case scaPackage.COMPONENT_TYPE: return createComponentType();
			case scaPackage.COMPONENT_TYPE_REFERENCE: return createComponentTypeReference();
			case scaPackage.COMPOSITE: return createComposite();
			case scaPackage.CONTRIBUTION_TYPE: return createContributionType();
			case scaPackage.DEPLOYABLE_TYPE: return createDeployableType();
			case scaPackage.DOCUMENTATION: return createDocumentation();
			case scaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case scaPackage.EXTENSIONS_TYPE: return createExtensionsType();
			case scaPackage.IMPLEMENTATION_TYPE: return createImplementationType();
			case scaPackage.PROPERTY: return createProperty();
			case scaPackage.PROPERTY_VALUE: return createPropertyValue();
			case scaPackage.REFERENCE: return createReference();
			case scaPackage.SCA_IMPLEMENTATION: return createSCAImplementation();
			case scaPackage.SCA_PROPERTY_BASE: return createSCAPropertyBase();
			case scaPackage.SERVICE: return createService();
			case scaPackage.SERVICE_TYPE: return createServiceType();
			case scaPackage.VALUE_TYPE: return createValueType();
			case scaPackage.WIRE: return createWire();
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
			case scaPackage.MULTIPLICITY:
				return createMultiplicityFromString(eDataType, initialValue);
			case scaPackage.LIST_OF_ANY_UR_IS:
				return createListOfAnyURIsFromString(eDataType, initialValue);
			case scaPackage.LIST_OF_QNAMES:
				return createListOfQNamesFromString(eDataType, initialValue);
			case scaPackage.MULTIPLICITY_OBJECT:
				return createMultiplicityObjectFromString(eDataType, initialValue);
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
			case scaPackage.MULTIPLICITY:
				return convertMultiplicityToString(eDataType, instanceValue);
			case scaPackage.LIST_OF_ANY_UR_IS:
				return convertListOfAnyURIsToString(eDataType, instanceValue);
			case scaPackage.LIST_OF_QNAMES:
				return convertListOfQNamesToString(eDataType, instanceValue);
			case scaPackage.MULTIPLICITY_OBJECT:
				return convertMultiplicityObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExtensionBase createCommonExtensionBase() {
		CommonExtensionBaseImpl commonExtensionBase = new CommonExtensionBaseImpl();
		return commonExtensionBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentReference createComponentReference() {
		ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
		return componentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentService createComponentService() {
		ComponentServiceImpl componentService = new ComponentServiceImpl();
		return componentService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeReference createComponentTypeReference() {
		ComponentTypeReferenceImpl componentTypeReference = new ComponentTypeReferenceImpl();
		return componentTypeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType createContributionType() {
		ContributionTypeImpl contributionType = new ContributionTypeImpl();
		return contributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeployableType createDeployableType() {
		DeployableTypeImpl deployableType = new DeployableTypeImpl();
		return deployableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
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
	public ExtensionsType createExtensionsType() {
		ExtensionsTypeImpl extensionsType = new ExtensionsTypeImpl();
		return extensionsType;
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
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
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
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAImplementation createSCAImplementation() {
		SCAImplementationImpl scaImplementation = new SCAImplementationImpl();
		return scaImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCAPropertyBase createSCAPropertyBase() {
		SCAPropertyBaseImpl scaPropertyBase = new SCAPropertyBaseImpl();
		return scaPropertyBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wire createWire() {
		WireImpl wire = new WireImpl();
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityFromString(EDataType eDataType, String initialValue) {
		Multiplicity result = Multiplicity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createListOfAnyURIsFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOfAnyURIsToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createListOfQNamesFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (String item : split(initialValue)) {
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOfQNamesToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity createMultiplicityObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiplicityFromString(scaPackage.Literals.MULTIPLICITY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiplicityToString(scaPackage.Literals.MULTIPLICITY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaPackage getscaPackage() {
		return (scaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static scaPackage getPackage() {
		return scaPackage.eINSTANCE;
	}

} //scaFactoryImpl
