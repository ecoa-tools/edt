/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.util;

import edtproject.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edtproject.EDTProjectPackage
 * @generated
 */
public class EDTProjectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDTProjectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDTProjectSwitch() {
		if (modelPackage == null) {
			modelPackage = EDTProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EDTProjectPackage.STEPS: {
				Steps steps = (Steps)theEObject;
				T result = caseSteps(steps);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP0: {
				Step0 step0 = (Step0)theEObject;
				T result = caseStep0(step0);
				if (result == null) result = caseStep(step0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP1: {
				Step1 step1 = (Step1)theEObject;
				T result = caseStep1(step1);
				if (result == null) result = caseStep(step1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP2: {
				Step2 step2 = (Step2)theEObject;
				T result = caseStep2(step2);
				if (result == null) result = caseStep(step2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP3: {
				Step3 step3 = (Step3)theEObject;
				T result = caseStep3(step3);
				if (result == null) result = caseStep(step3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP4: {
				Step4 step4 = (Step4)theEObject;
				T result = caseStep4(step4);
				if (result == null) result = caseStep(step4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP5: {
				Step5 step5 = (Step5)theEObject;
				T result = caseStep5(step5);
				if (result == null) result = caseStep(step5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_DEFINITION: {
				ComponentDefinition componentDefinition = (ComponentDefinition)theEObject;
				T result = caseComponentDefinition(componentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_DEFINITION_REFERENCE: {
				ComponentDefinitionReference componentDefinitionReference = (ComponentDefinitionReference)theEObject;
				T result = caseComponentDefinitionReference(componentDefinitionReference);
				if (result == null) result = caseContract(componentDefinitionReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_DEFINITION_SERVICE: {
				ComponentDefinitionService componentDefinitionService = (ComponentDefinitionService)theEObject;
				T result = caseComponentDefinitionService(componentDefinitionService);
				if (result == null) result = caseContract(componentDefinitionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_PROPERTY: {
				ComponentProperty componentProperty = (ComponentProperty)theEObject;
				T result = caseComponentProperty(componentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_REFERENCE: {
				ComponentReference componentReference = (ComponentReference)theEObject;
				T result = caseComponentReference(componentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPONENT_SERVICE: {
				ComponentService componentService = (ComponentService)theEObject;
				T result = caseComponentService(componentService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPOSITE_REFERENCE: {
				CompositeReference compositeReference = (CompositeReference)theEObject;
				T result = caseCompositeReference(compositeReference);
				if (result == null) result = caseContract(compositeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.COMPOSITE_SERVICE: {
				CompositeService compositeService = (CompositeService)theEObject;
				T result = caseCompositeService(compositeService);
				if (result == null) result = caseContract(compositeService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.FINAL_ASSEMBLY: {
				FinalAssembly finalAssembly = (FinalAssembly)theEObject;
				T result = caseFinalAssembly(finalAssembly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.OUTPUT_DIRECTORY: {
				OutputDirectory outputDirectory = (OutputDirectory)theEObject;
				T result = caseOutputDirectory(outputDirectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EDTProjectPackage.SERVICE_LINK: {
				ServiceLink serviceLink = (ServiceLink)theEObject;
				T result = caseServiceLink(serviceLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteps(Steps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep0(Step0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep1(Step1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep2(Step2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep3(Step3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep4(Step4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep5(Step5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinition(ComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinitionReference(ComponentDefinitionReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinitionService(ComponentDefinitionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentProperty(ComponentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentReference(ComponentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentService(ComponentService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeReference(CompositeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeService(CompositeService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Assembly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalAssembly(FinalAssembly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDirectory(OutputDirectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLink(ServiceLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EDTProject2Switch
