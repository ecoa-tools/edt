/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.logicalsystem._2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see technology.ecoa.logicalsystem._2.logPackage
 * @generated
 */
public class logAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static logPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = logPackage.eINSTANCE;
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
	protected logSwitch<Adapter> modelSwitch =
		new logSwitch<Adapter>() {
			@Override
			public Adapter caseAvailableMemoryType(AvailableMemoryType object) {
				return createAvailableMemoryTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndianessType(EndianessType object) {
				return createEndianessTypeAdapter();
			}
			@Override
			public Adapter caseLatencyType(LatencyType object) {
				return createLatencyTypeAdapter();
			}
			@Override
			public Adapter caseLatencyType1(LatencyType1 object) {
				return createLatencyType1Adapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseLinkType1(LinkType1 object) {
				return createLinkType1Adapter();
			}
			@Override
			public Adapter caseLogicalComputingNodeLinks(LogicalComputingNodeLinks object) {
				return createLogicalComputingNodeLinksAdapter();
			}
			@Override
			public Adapter caseLogicalComputingNodeType(LogicalComputingNodeType object) {
				return createLogicalComputingNodeTypeAdapter();
			}
			@Override
			public Adapter caseLogicalComputingPlatform(LogicalComputingPlatform object) {
				return createLogicalComputingPlatformAdapter();
			}
			@Override
			public Adapter caseLogicalComputingPlatformLinks(LogicalComputingPlatformLinks object) {
				return createLogicalComputingPlatformLinksAdapter();
			}
			@Override
			public Adapter caseLogicalProcessorsType(LogicalProcessorsType object) {
				return createLogicalProcessorsTypeAdapter();
			}
			@Override
			public Adapter caseLogicalSystem(LogicalSystem object) {
				return createLogicalSystemAdapter();
			}
			@Override
			public Adapter caseModuleSwitchTimeType(ModuleSwitchTimeType object) {
				return createModuleSwitchTimeTypeAdapter();
			}
			@Override
			public Adapter caseOsType(OsType object) {
				return createOsTypeAdapter();
			}
			@Override
			public Adapter caseStepDurationType(StepDurationType object) {
				return createStepDurationTypeAdapter();
			}
			@Override
			public Adapter caseThroughputType(ThroughputType object) {
				return createThroughputTypeAdapter();
			}
			@Override
			public Adapter caseThroughputType1(ThroughputType1 object) {
				return createThroughputType1Adapter();
			}
			@Override
			public Adapter caseTransportBindingType(TransportBindingType object) {
				return createTransportBindingTypeAdapter();
			}
			@Override
			public Adapter caseUseType(UseType object) {
				return createUseTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.AvailableMemoryType <em>Available Memory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.AvailableMemoryType
	 * @generated
	 */
	public Adapter createAvailableMemoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.EndianessType <em>Endianess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.EndianessType
	 * @generated
	 */
	public Adapter createEndianessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LatencyType <em>Latency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LatencyType
	 * @generated
	 */
	public Adapter createLatencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LatencyType1 <em>Latency Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LatencyType1
	 * @generated
	 */
	public Adapter createLatencyType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LinkType1 <em>Link Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LinkType1
	 * @generated
	 */
	public Adapter createLinkType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks <em>Logical Computing Node Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeLinks
	 * @generated
	 */
	public Adapter createLogicalComputingNodeLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalComputingNodeType <em>Logical Computing Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingNodeType
	 * @generated
	 */
	public Adapter createLogicalComputingNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatform <em>Logical Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatform
	 * @generated
	 */
	public Adapter createLogicalComputingPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks <em>Logical Computing Platform Links</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalComputingPlatformLinks
	 * @generated
	 */
	public Adapter createLogicalComputingPlatformLinksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalProcessorsType <em>Logical Processors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalProcessorsType
	 * @generated
	 */
	public Adapter createLogicalProcessorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.LogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.LogicalSystem
	 * @generated
	 */
	public Adapter createLogicalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.ModuleSwitchTimeType <em>Module Switch Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.ModuleSwitchTimeType
	 * @generated
	 */
	public Adapter createModuleSwitchTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.OsType <em>Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.OsType
	 * @generated
	 */
	public Adapter createOsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.StepDurationType <em>Step Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.StepDurationType
	 * @generated
	 */
	public Adapter createStepDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.ThroughputType <em>Throughput Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType
	 * @generated
	 */
	public Adapter createThroughputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.ThroughputType1 <em>Throughput Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.ThroughputType1
	 * @generated
	 */
	public Adapter createThroughputType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.TransportBindingType <em>Transport Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.TransportBindingType
	 * @generated
	 */
	public Adapter createTransportBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link technology.ecoa.logicalsystem._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see technology.ecoa.logicalsystem._2.UseType
	 * @generated
	 */
	public Adapter createUseTypeAdapter() {
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

} //logAdapterFactory
