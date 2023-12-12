/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;

import edtdeployment.Deployment;
import edtlogical.LogicalSystem;
import edtudp.UDPBinding;
import edtuid.IDMap;
import temp.CrossPlatformView;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Step5</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.Step5#getLogicalSystem <em>Logical System</em>}</li>
 * <li>{@link edtproject.Step5#getDeployment <em>Deployment</em>}</li>
 * <li>{@link edtproject.Step5#getUDPBindings <em>UDP Bindings</em>}</li>
 * <li>{@link edtproject.Step5#getCrossPlatformView <em>Cross Platform
 * View</em>}</li>
 * <li>{@link edtproject.Step5#getIDS <em>IDS</em>}</li>
 * <li>{@link edtproject.Step5#getFinalAssembly <em>Final Assembly</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getStep5()
 * @model
 * @generated
 */
public interface Step5 extends Step {

	/**
	 * Returns the value of the '<em><b>Logical System</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Logical System</em>' containment reference.
	 * @see #setLogicalSystem(LogicalSystem)
	 * @see edtproject.EDTProjectPackage#getStep5_LogicalSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalSystem getLogicalSystem();

	/**
	 * Sets the value of the '{@link edtproject.Step5#getLogicalSystem <em>Logical
	 * System</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Logical System</em>' containment
	 *              reference.
	 * @see #getLogicalSystem()
	 * @generated
	 */
	void setLogicalSystem(LogicalSystem value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(Deployment)
	 * @see edtproject.EDTProjectPackage#getStep5_Deployment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link edtproject.Step5#getDeployment
	 * <em>Deployment</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Deployment</em>' containment
	 *              reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>UDP Bindings</b></em>' containment reference
	 * list. The list contents are of type {@link edtudp.UDPBinding}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>UDP Bindings</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep5_UDPBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<UDPBinding> getUDPBindings();

	/**
	 * Returns the value of the '<em><b>Final Assembly</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Final Assembly</em>' containment reference.
	 * @see #setFinalAssembly(FinalAssembly)
	 * @see edtproject.EDTProjectPackage#getStep5_FinalAssembly()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FinalAssembly getFinalAssembly();

	/**
	 * Sets the value of the '{@link edtproject.Step5#getFinalAssembly <em>Final
	 * Assembly</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Final Assembly</em>' containment
	 *              reference.
	 * @see #getFinalAssembly()
	 * @generated
	 */
	void setFinalAssembly(FinalAssembly value);

	/**
	 * Returns the value of the '<em><b>Cross Platform View</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cross Platform View</em>' containment
	 *         reference.
	 * @see #setCrossPlatformView(CrossPlatformView)
	 * @see edtproject.EDTProjectPackage#getStep5_CrossPlatformView()
	 * @model containment="true"
	 * @generated
	 */
	CrossPlatformView getCrossPlatformView();

	/**
	 * Sets the value of the '{@link edtproject.Step5#getCrossPlatformView <em>Cross
	 * Platform View</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Cross Platform View</em>' containment
	 *              reference.
	 * @see #getCrossPlatformView()
	 * @generated
	 */
	void setCrossPlatformView(CrossPlatformView value);

	/**
	 * Returns the value of the '<em><b>IDS</b></em>' containment reference list.
	 * The list contents are of type {@link edtuid.IDMap}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>IDS</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getStep5_IDS()
	 * @model containment="true"
	 * @generated
	 */
	EList<IDMap> getIDS();

	/**
	 * Find IDMap in Step5 by Name
	 * 
	 * @param nameID : name of EUID
	 * @return IDMap
	 */
	IDMap findIDMap(String nameID);
} // Step5
