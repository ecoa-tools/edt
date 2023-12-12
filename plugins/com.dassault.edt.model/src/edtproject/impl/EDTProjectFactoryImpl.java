/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import edtproject.*;
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
public class EDTProjectFactoryImpl extends EFactoryImpl implements EDTProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EDTProjectFactory init() {
		try {
			EDTProjectFactory theEDTProjectFactory = (EDTProjectFactory)EPackage.Registry.INSTANCE.getEFactory(EDTProjectPackage.eNS_URI);
			if (theEDTProjectFactory != null) {
				return theEDTProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EDTProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDTProjectFactoryImpl() {
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
			case EDTProjectPackage.STEPS: return createSteps();
			case EDTProjectPackage.STEP0: return createStep0();
			case EDTProjectPackage.STEP1: return createStep1();
			case EDTProjectPackage.STEP2: return createStep2();
			case EDTProjectPackage.STEP3: return createStep3();
			case EDTProjectPackage.STEP4: return createStep4();
			case EDTProjectPackage.STEP5: return createStep5();
			case EDTProjectPackage.COMPOSITE: return createComposite();
			case EDTProjectPackage.COMPONENT_DEFINITION: return createComponentDefinition();
			case EDTProjectPackage.COMPONENT: return createComponent();
			case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE: return createComponentDefinitionReference();
			case EDTProjectPackage.COMPONENT_DEFINITION_SERVICE: return createComponentDefinitionService();
			case EDTProjectPackage.PROPERTY: return createProperty();
			case EDTProjectPackage.COMPONENT_PROPERTY: return createComponentProperty();
			case EDTProjectPackage.COMPONENT_REFERENCE: return createComponentReference();
			case EDTProjectPackage.COMPONENT_SERVICE: return createComponentService();
			case EDTProjectPackage.COMPOSITE_REFERENCE: return createCompositeReference();
			case EDTProjectPackage.COMPOSITE_SERVICE: return createCompositeService();
			case EDTProjectPackage.CONTRACT: return createContract();
			case EDTProjectPackage.FINAL_ASSEMBLY: return createFinalAssembly();
			case EDTProjectPackage.OUTPUT_DIRECTORY: return createOutputDirectory();
			case EDTProjectPackage.SERVICE_LINK: return createServiceLink();
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
	public Steps createSteps() {
		StepsImpl steps = new StepsImpl();
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step0 createStep0() {
		Step0Impl step0 = new Step0Impl();
		return step0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step1 createStep1() {
		Step1Impl step1 = new Step1Impl();
		return step1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step2 createStep2() {
		Step2Impl step2 = new Step2Impl();
		return step2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step3 createStep3() {
		Step3Impl step3 = new Step3Impl();
		return step3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step4 createStep4() {
		Step4Impl step4 = new Step4Impl();
		return step4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step5 createStep5() {
		Step5Impl step5 = new Step5Impl();
		return step5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition createComponentDefinition() {
		ComponentDefinitionImpl componentDefinition = new ComponentDefinitionImpl();
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionReference createComponentDefinitionReference() {
		ComponentDefinitionReferenceImpl componentDefinitionReference = new ComponentDefinitionReferenceImpl();
		return componentDefinitionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionService createComponentDefinitionService() {
		ComponentDefinitionServiceImpl componentDefinitionService = new ComponentDefinitionServiceImpl();
		return componentDefinitionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentProperty createComponentProperty() {
		ComponentPropertyImpl componentProperty = new ComponentPropertyImpl();
		return componentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentReference createComponentReference() {
		ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
		return componentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentService createComponentService() {
		ComponentServiceImpl componentService = new ComponentServiceImpl();
		return componentService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeReference createCompositeReference() {
		CompositeReferenceImpl compositeReference = new CompositeReferenceImpl();
		return compositeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeService createCompositeService() {
		CompositeServiceImpl compositeService = new CompositeServiceImpl();
		return compositeService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalAssembly createFinalAssembly() {
		FinalAssemblyImpl finalAssembly = new FinalAssemblyImpl();
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputDirectory createOutputDirectory() {
		OutputDirectoryImpl outputDirectory = new OutputDirectoryImpl();
		return outputDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceLink createServiceLink() {
		ServiceLinkImpl serviceLink = new ServiceLinkImpl();
		return serviceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDTProjectPackage getEDTProjectPackage() {
		return (EDTProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EDTProjectPackage getPackage() {
		return EDTProjectPackage.eINSTANCE;
	}

} //EDTProject2FactoryImpl
