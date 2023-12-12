/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.impl;

import edtlogical.*;

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
public class EdtlogicalFactoryImpl extends EFactoryImpl implements EdtlogicalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdtlogicalFactory init() {
		try {
			EdtlogicalFactory theEdtlogicalFactory = (EdtlogicalFactory)EPackage.Registry.INSTANCE.getEFactory(EdtlogicalPackage.eNS_URI);
			if (theEdtlogicalFactory != null) {
				return theEdtlogicalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdtlogicalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtlogicalFactoryImpl() {
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
			case EdtlogicalPackage.LOGICAL_SYSTEM: return createLogicalSystem();
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM: return createLogicalComputingPlatform();
			case EdtlogicalPackage.LOGICAL_COMPUTING_PLATFORM_LINK: return createLogicalComputingPlatformLink();
			case EdtlogicalPackage.LOGICAL_COMPUTING_NODE_LINK: return createLogicalComputingNodeLink();
			case EdtlogicalPackage.LOGICAL_COMPUTING_NODE: return createLogicalComputingNode();
			case EdtlogicalPackage.LOGICAL_PROCESSOR: return createLogicalProcessor();
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
	public LogicalSystem createLogicalSystem() {
		LogicalSystemImpl logicalSystem = new LogicalSystemImpl();
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingPlatform createLogicalComputingPlatform() {
		LogicalComputingPlatformImpl logicalComputingPlatform = new LogicalComputingPlatformImpl();
		return logicalComputingPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingPlatformLink createLogicalComputingPlatformLink() {
		LogicalComputingPlatformLinkImpl logicalComputingPlatformLink = new LogicalComputingPlatformLinkImpl();
		return logicalComputingPlatformLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingNodeLink createLogicalComputingNodeLink() {
		LogicalComputingNodeLinkImpl logicalComputingNodeLink = new LogicalComputingNodeLinkImpl();
		return logicalComputingNodeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalComputingNode createLogicalComputingNode() {
		LogicalComputingNodeImpl logicalComputingNode = new LogicalComputingNodeImpl();
		return logicalComputingNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalProcessor createLogicalProcessor() {
		LogicalProcessorImpl logicalProcessor = new LogicalProcessorImpl();
		return logicalProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdtlogicalPackage getEdtlogicalPackage() {
		return (EdtlogicalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdtlogicalPackage getPackage() {
		return EdtlogicalPackage.eINSTANCE;
	}

} //EdtlogicalFactoryImpl
