/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.util;

import edtproject.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edtproject.EDTProjectPackage
 * @generated
 */
public class EDTProjectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EDTProjectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDTProjectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EDTProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDTProjectSwitch<Adapter> modelSwitch =
		new EDTProjectSwitch<Adapter>() {
			@Override
			public Adapter caseSteps(Steps object) {
				return createStepsAdapter();
			}
			@Override
			public Adapter caseStep0(Step0 object) {
				return createStep0Adapter();
			}
			@Override
			public Adapter caseStep1(Step1 object) {
				return createStep1Adapter();
			}
			@Override
			public Adapter caseStep2(Step2 object) {
				return createStep2Adapter();
			}
			@Override
			public Adapter caseStep3(Step3 object) {
				return createStep3Adapter();
			}
			@Override
			public Adapter caseStep4(Step4 object) {
				return createStep4Adapter();
			}
			@Override
			public Adapter caseStep5(Step5 object) {
				return createStep5Adapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseComponentDefinition(ComponentDefinition object) {
				return createComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentDefinitionReference(ComponentDefinitionReference object) {
				return createComponentDefinitionReferenceAdapter();
			}
			@Override
			public Adapter caseComponentDefinitionService(ComponentDefinitionService object) {
				return createComponentDefinitionServiceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseComponentProperty(ComponentProperty object) {
				return createComponentPropertyAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseComponentReference(ComponentReference object) {
				return createComponentReferenceAdapter();
			}
			@Override
			public Adapter caseComponentService(ComponentService object) {
				return createComponentServiceAdapter();
			}
			@Override
			public Adapter caseCompositeReference(CompositeReference object) {
				return createCompositeReferenceAdapter();
			}
			@Override
			public Adapter caseCompositeService(CompositeService object) {
				return createCompositeServiceAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseFinalAssembly(FinalAssembly object) {
				return createFinalAssemblyAdapter();
			}
			@Override
			public Adapter caseOutputDirectory(OutputDirectory object) {
				return createOutputDirectoryAdapter();
			}
			@Override
			public Adapter caseServiceLink(ServiceLink object) {
				return createServiceLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Steps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Steps
	 * @generated
	 */
	public Adapter createStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step0 <em>Step0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step0
	 * @generated
	 */
	public Adapter createStep0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step1 <em>Step1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step1
	 * @generated
	 */
	public Adapter createStep1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step2 <em>Step2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step2
	 * @generated
	 */
	public Adapter createStep2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step3 <em>Step3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step3
	 * @generated
	 */
	public Adapter createStep3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step4 <em>Step4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step4
	 * @generated
	 */
	public Adapter createStep4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step5 <em>Step5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step5
	 * @generated
	 */
	public Adapter createStep5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentDefinition <em>Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentDefinition
	 * @generated
	 */
	public Adapter createComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentDefinitionReference <em>Component Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentDefinitionReference
	 * @generated
	 */
	public Adapter createComponentDefinitionReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentDefinitionService <em>Component Definition Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentDefinitionService
	 * @generated
	 */
	public Adapter createComponentDefinitionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentProperty
	 * @generated
	 */
	public Adapter createComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentReference
	 * @generated
	 */
	public Adapter createComponentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ComponentService <em>Component Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ComponentService
	 * @generated
	 */
	public Adapter createComponentServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.CompositeReference <em>Composite Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.CompositeReference
	 * @generated
	 */
	public Adapter createCompositeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.CompositeService <em>Composite Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.CompositeService
	 * @generated
	 */
	public Adapter createCompositeServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.FinalAssembly <em>Final Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.FinalAssembly
	 * @generated
	 */
	public Adapter createFinalAssemblyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.OutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.OutputDirectory
	 * @generated
	 */
	public Adapter createOutputDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtproject.ServiceLink <em>Service Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtproject.ServiceLink
	 * @generated
	 */
	public Adapter createServiceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EDTProject2AdapterFactory
