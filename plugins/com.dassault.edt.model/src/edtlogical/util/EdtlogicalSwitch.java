/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.util;

import edtlogical.*;

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
 * @see edtlogical.EdtlogicalPackage
 * @generated
 */
public class EdtlogicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtlogicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtlogicalSwitch() {
		if (modelPackage == null) {
			modelPackage = EdtlogicalPackage.eINSTANCE;
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
			case EdtlogicalPackage.LOGICAL_SYSTEM: {
				LogicalSystem logicalSystem = (LogicalSystem)theEObject;
				T result = caseLogicalSystem(logicalSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM: {
				LogicalComputingPlatform logicalComputingPlatform = (LogicalComputingPlatform)theEObject;
				T result = caseLogicalComputingPlatform(logicalComputingPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM_LINK: {
				LogicalComputingPlatformLink logicalComputingPlatformLink = (LogicalComputingPlatformLink)theEObject;
				T result = caseLogicalComputingPlatformLink(logicalComputingPlatformLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK: {
				LogicalComputingNodeLink logicalComputingNodeLink = (LogicalComputingNodeLink)theEObject;
				T result = caseLogicalComputingNodeLink(logicalComputingNodeLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtlogicalPackage.LOGICAL_COMPUTING_NODE: {
				LogicalComputingNode logicalComputingNode = (LogicalComputingNode)theEObject;
				T result = caseLogicalComputingNode(logicalComputingNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdtlogicalPackage.LOGICAL_PROCESSOR: {
				LogicalProcessor logicalProcessor = (LogicalProcessor)theEObject;
				T result = caseLogicalProcessor(logicalProcessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Platform Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Platform Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingPlatformLink(LogicalComputingPlatformLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Node Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Node Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingNodeLink(LogicalComputingNodeLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Computing Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Computing Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalComputingNode(LogicalComputingNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalProcessor(LogicalProcessor object) {
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

} //EdtlogicalSwitch
