/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edtproject.EDTProjectPackage
 * @generated
 */
public interface EDTProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDTProjectFactory eINSTANCE = edtproject.impl.EDTProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps</em>'.
	 * @generated
	 */
	Steps createSteps();

	/**
	 * Returns a new object of class '<em>Step0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step0</em>'.
	 * @generated
	 */
	Step0 createStep0();

	/**
	 * Returns a new object of class '<em>Step1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step1</em>'.
	 * @generated
	 */
	Step1 createStep1();

	/**
	 * Returns a new object of class '<em>Step2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step2</em>'.
	 * @generated
	 */
	Step2 createStep2();

	/**
	 * Returns a new object of class '<em>Step3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step3</em>'.
	 * @generated
	 */
	Step3 createStep3();

	/**
	 * Returns a new object of class '<em>Step4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step4</em>'.
	 * @generated
	 */
	Step4 createStep4();

	/**
	 * Returns a new object of class '<em>Step5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step5</em>'.
	 * @generated
	 */
	Step5 createStep5();

	/**
	 * Returns a new object of class '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite</em>'.
	 * @generated
	 */
	Composite createComposite();

	/**
	 * Returns a new object of class '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition</em>'.
	 * @generated
	 */
	ComponentDefinition createComponentDefinition();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition Reference</em>'.
	 * @generated
	 */
	ComponentDefinitionReference createComponentDefinitionReference();

	/**
	 * Returns a new object of class '<em>Component Definition Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Definition Service</em>'.
	 * @generated
	 */
	ComponentDefinitionService createComponentDefinitionService();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Property</em>'.
	 * @generated
	 */
	ComponentProperty createComponentProperty();

	/**
	 * Returns a new object of class '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Reference</em>'.
	 * @generated
	 */
	ComponentReference createComponentReference();

	/**
	 * Returns a new object of class '<em>Component Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Service</em>'.
	 * @generated
	 */
	ComponentService createComponentService();

	/**
	 * Returns a new object of class '<em>Composite Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Reference</em>'.
	 * @generated
	 */
	CompositeReference createCompositeReference();

	/**
	 * Returns a new object of class '<em>Composite Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Service</em>'.
	 * @generated
	 */
	CompositeService createCompositeService();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Final Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final Assembly</em>'.
	 * @generated
	 */
	FinalAssembly createFinalAssembly();

	/**
	 * Returns a new object of class '<em>Output Directory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Directory</em>'.
	 * @generated
	 */
	OutputDirectory createOutputDirectory();

	/**
	 * Returns a new object of class '<em>Service Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Link</em>'.
	 * @generated
	 */
	ServiceLink createServiceLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EDTProjectPackage getEDTProjectPackage();

} //EDTProject2Factory
