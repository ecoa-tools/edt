/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import edtlogical.LogicalSystem;

import edtproject.FinalAssembly;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getProtectionDomains <em>Protection Domains</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getLogPolicies <em>Log Policies</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getPlatformConfigurations <em>Platform Configurations</em>}</li>
 *   <li>{@link edtdeployment.Deployment#getWireMappings <em>Wire Mappings</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtdeployment.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Logical System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical System</em>' reference.
	 * @see #setLogicalSystem(LogicalSystem)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_LogicalSystem()
	 * @model required="true"
	 * @generated
	 */
	LogicalSystem getLogicalSystem();

	/**
	 * Sets the value of the '{@link edtdeployment.Deployment#getLogicalSystem <em>Logical System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical System</em>' reference.
	 * @see #getLogicalSystem()
	 * @generated
	 */
	void setLogicalSystem(LogicalSystem value);

	/**
	 * Returns the value of the '<em><b>Final Assembly</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Assembly</em>' reference.
	 * @see #setFinalAssembly(FinalAssembly)
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_FinalAssembly()
	 * @model required="true"
	 * @generated
	 */
	FinalAssembly getFinalAssembly();

	/**
	 * Sets the value of the '{@link edtdeployment.Deployment#getFinalAssembly <em>Final Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Assembly</em>' reference.
	 * @see #getFinalAssembly()
	 * @generated
	 */
	void setFinalAssembly(FinalAssembly value);

	/**
	 * Returns the value of the '<em><b>Protection Domains</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.ProtectionDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Domains</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_ProtectionDomains()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='protectionDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtectionDomain> getProtectionDomains();

	/**
	 * Returns the value of the '<em><b>Log Policies</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.LogPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Policies</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_LogPolicies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogPolicy> getLogPolicies();

	/**
	 * Returns the value of the '<em><b>Platform Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.PlatformConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines platform-wide settings
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Configurations</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_PlatformConfigurations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='platformConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlatformConfiguration> getPlatformConfigurations();

	/**
	 * Returns the value of the '<em><b>Wire Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.WireMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a mapping between a wire and a
	 *             computing platform link
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Mappings</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getDeployment_WireMappings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wireMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WireMapping> getWireMappings();

} // Deployment
