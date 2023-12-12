/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical.util;

import edtlogical.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edtlogical.EdtlogicalPackage
 * @generated
 */
public class EdtlogicalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdtlogicalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdtlogicalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdtlogicalPackage.eINSTANCE;
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
	protected EdtlogicalSwitch<Adapter> modelSwitch =
		new EdtlogicalSwitch<Adapter>() {
			@Override
			public Adapter caseLogicalSystem(LogicalSystem object) {
				return createLogicalSystemAdapter();
			}
			@Override
			public Adapter caseLogicalComputingPlatform(LogicalComputingPlatform object) {
				return createLogicalComputingPlatformAdapter();
			}
			@Override
			public Adapter caseLogicalComputingPlatformLink(LogicalComputingPlatformLink object) {
				return createLogicalComputingPlatformLinkAdapter();
			}
			@Override
			public Adapter caseLogicalComputingNodeLink(LogicalComputingNodeLink object) {
				return createLogicalComputingNodeLinkAdapter();
			}
			@Override
			public Adapter caseLogicalComputingNode(LogicalComputingNode object) {
				return createLogicalComputingNodeAdapter();
			}
			@Override
			public Adapter caseLogicalProcessor(LogicalProcessor object) {
				return createLogicalProcessorAdapter();
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
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalSystem
	 * @generated
	 */
	public Adapter createLogicalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalComputingPlatform <em>Logical Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalComputingPlatform
	 * @generated
	 */
	public Adapter createLogicalComputingPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalComputingPlatformLink <em>Logical Computing Platform Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalComputingPlatformLink
	 * @generated
	 */
	public Adapter createLogicalComputingPlatformLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalComputingNodeLink <em>Logical Computing Node Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalComputingNodeLink
	 * @generated
	 */
	public Adapter createLogicalComputingNodeLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalComputingNode <em>Logical Computing Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalComputingNode
	 * @generated
	 */
	public Adapter createLogicalComputingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edtlogical.LogicalProcessor <em>Logical Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edtlogical.LogicalProcessor
	 * @generated
	 */
	public Adapter createLogicalProcessorAdapter() {
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

} //EdtlogicalAdapterFactory
