/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import technology.ecoa.logicalsystem._2.*;

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
 * @see technology.ecoa.logicalsystem._2.logPackage
 * @generated
 */
public class logSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static logPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public logSwitch() {
		if (modelPackage == null) {
			modelPackage = logPackage.eINSTANCE;
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
			case logPackage.AVAILABLE_MEMORY_TYPE: {
				AvailableMemoryType availableMemoryType = (AvailableMemoryType)theEObject;
				T result = caseAvailableMemoryType(availableMemoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.ENDIANESS_TYPE: {
				EndianessType endianessType = (EndianessType)theEObject;
				T result = caseEndianessType(endianessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LATENCY_TYPE: {
				LatencyType latencyType = (LatencyType)theEObject;
				T result = caseLatencyType(latencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LATENCY_TYPE1: {
				LatencyType1 latencyType1 = (LatencyType1)theEObject;
				T result = caseLatencyType1(latencyType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LINK_TYPE1: {
				LinkType1 linkType1 = (LinkType1)theEObject;
				T result = caseLinkType1(linkType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_COMPUTING_NODE_LINKS: {
				LogicalComputingNodeLinks logicalComputingNodeLinks = (LogicalComputingNodeLinks)theEObject;
				T result = caseLogicalComputingNodeLinks(logicalComputingNodeLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_COMPUTING_NODE_TYPE: {
				LogicalComputingNodeType logicalComputingNodeType = (LogicalComputingNodeType)theEObject;
				T result = caseLogicalComputingNodeType(logicalComputingNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_COMPUTING_PLATFORM: {
				LogicalComputingPlatform logicalComputingPlatform = (LogicalComputingPlatform)theEObject;
				T result = caseLogicalComputingPlatform(logicalComputingPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_COMPUTING_PLATFORM_LINKS: {
				LogicalComputingPlatformLinks logicalComputingPlatformLinks = (LogicalComputingPlatformLinks)theEObject;
				T result = caseLogicalComputingPlatformLinks(logicalComputingPlatformLinks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_PROCESSORS_TYPE: {
				LogicalProcessorsType logicalProcessorsType = (LogicalProcessorsType)theEObject;
				T result = caseLogicalProcessorsType(logicalProcessorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.LOGICAL_SYSTEM: {
				LogicalSystem logicalSystem = (LogicalSystem)theEObject;
				T result = caseLogicalSystem(logicalSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.MODULE_SWITCH_TIME_TYPE: {
				ModuleSwitchTimeType moduleSwitchTimeType = (ModuleSwitchTimeType)theEObject;
				T result = caseModuleSwitchTimeType(moduleSwitchTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.OS_TYPE: {
				OsType osType = (OsType)theEObject;
				T result = caseOsType(osType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.STEP_DURATION_TYPE: {
				StepDurationType stepDurationType = (StepDurationType)theEObject;
				T result = caseStepDurationType(stepDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.THROUGHPUT_TYPE: {
				ThroughputType throughputType = (ThroughputType)theEObject;
				T result = caseThroughputType(throughputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.THROUGHPUT_TYPE1: {
				ThroughputType1 throughputType1 = (ThroughputType1)theEObject;
				T result = caseThroughputType1(throughputType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.TRANSPORT_BINDING_TYPE: {
				TransportBindingType transportBindingType = (TransportBindingType)theEObject;
				T result = caseTransportBindingType(transportBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case logPackage.USE_TYPE: {
				UseType useType = (UseType)theEObject;
				T result = caseUseType(useType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Available Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Available Memory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableMemoryType(AvailableMemoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endianess Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endianess Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndianessType(EndianessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatencyType(LatencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatencyType1(LatencyType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType1(LinkType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Node Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Node Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingNodeLinks(LogicalComputingNodeLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingNodeType(LogicalComputingNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingPlatform(LogicalComputingPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Platform Links</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Platform Links</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingPlatformLinks(LogicalComputingPlatformLinks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Processors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Processors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalProcessorsType(LogicalProcessorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalSystem(LogicalSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Switch Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Switch Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleSwitchTimeType(ModuleSwitchTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Os Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsType(OsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepDurationType(StepDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throughput Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throughput Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThroughputType(ThroughputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throughput Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throughput Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThroughputType1(ThroughputType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportBindingType(TransportBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseType(UseType object) {
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

} //logSwitch
