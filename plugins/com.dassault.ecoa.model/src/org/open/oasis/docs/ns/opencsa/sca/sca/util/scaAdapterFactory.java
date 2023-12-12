/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.ns.opencsa.sca.sca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage
 * @generated
 */
public class scaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static scaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = scaPackage.eINSTANCE;
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
	protected scaSwitch<Adapter> modelSwitch =
		new scaSwitch<Adapter>() {
			@Override
			public Adapter caseCommonExtensionBase(CommonExtensionBase object) {
				return createCommonExtensionBaseAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
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
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseComponentTypeReference(ComponentTypeReference object) {
				return createComponentTypeReferenceAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseContract(Contract object) {
				return createContractAdapter();
			}
			@Override
			public Adapter caseContributionType(ContributionType object) {
				return createContributionTypeAdapter();
			}
			@Override
			public Adapter caseDeployableType(DeployableType object) {
				return createDeployableTypeAdapter();
			}
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtensionsType(ExtensionsType object) {
				return createExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseImplementationType(ImplementationType object) {
				return createImplementationTypeAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePropertyValue(PropertyValue object) {
				return createPropertyValueAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseSCAImplementation(SCAImplementation object) {
				return createSCAImplementationAdapter();
			}
			@Override
			public Adapter caseSCAPropertyBase(SCAPropertyBase object) {
				return createSCAPropertyBaseAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseWire(Wire object) {
				return createWireAdapter();
			}
			@Override
			public Adapter caseWireFormatType(WireFormatType object) {
				return createWireFormatTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase
	 * @generated
	 */
	public Adapter createCommonExtensionBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference
	 * @generated
	 */
	public Adapter createComponentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService <em>Component Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService
	 * @generated
	 */
	public Adapter createComponentServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference <em>Component Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference
	 * @generated
	 */
	public Adapter createComponentTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType
	 * @generated
	 */
	public Adapter createContributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType <em>Deployable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType
	 * @generated
	 */
	public Adapter createDeployableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Documentation
	 * @generated
	 */
	public Adapter createDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType
	 * @generated
	 */
	public Adapter createExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType
	 * @generated
	 */
	public Adapter createImplementationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue
	 * @generated
	 */
	public Adapter createPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation <em>SCA Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation
	 * @generated
	 */
	public Adapter createSCAImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase <em>SCA Property Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase
	 * @generated
	 */
	public Adapter createSCAPropertyBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Wire
	 * @generated
	 */
	public Adapter createWireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType <em>Wire Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType
	 * @generated
	 */
	public Adapter createWireFormatTypeAdapter() {
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

} //scaAdapterFactory
