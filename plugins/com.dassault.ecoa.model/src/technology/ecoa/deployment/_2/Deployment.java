/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

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
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getProtectionDomain <em>Protection Domain</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getLogPolicy <em>Log Policy</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getPlatformConfiguration <em>Platform Configuration</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getWireMapping <em>Wire Mapping</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getFinalAssembly <em>Final Assembly</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.Deployment#getLogicalSystem <em>Logical System</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getDeployment()
 * @model extendedMetaData="name='Deployment' kind='elementOnly'"
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Protection Domain</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.ProtectionDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Domain</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_ProtectionDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='protectionDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtectionDomain> getProtectionDomain();

	/**
	 * Returns the value of the '<em><b>Log Policy</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.LogPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Policy</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_LogPolicy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LogPolicy> getLogPolicy();

	/**
	 * Returns the value of the '<em><b>Platform Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.PlatformConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines platform-wide settings
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Configuration</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_PlatformConfiguration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='platformConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlatformConfiguration> getPlatformConfiguration();

	/**
	 * Returns the value of the '<em><b>Wire Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.deployment._2.WireMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a mapping between a wire and a
	 *             computing platform link
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wire Mapping</em>' containment reference list.
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_WireMapping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wireMapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WireMapping> getWireMapping();

	/**
	 * Returns the value of the '<em><b>Final Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the composite referenced by this
	 *           deployment
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Final Assembly</em>' attribute.
	 * @see #setFinalAssembly(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_FinalAssembly()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='finalAssembly'"
	 * @generated
	 */
	String getFinalAssembly();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.Deployment#getFinalAssembly <em>Final Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Assembly</em>' attribute.
	 * @see #getFinalAssembly()
	 * @generated
	 */
	void setFinalAssembly(String value);

	/**
	 * Returns the value of the '<em><b>Logical System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the logical system this deployment is
	 *           made on
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical System</em>' attribute.
	 * @see #setLogicalSystem(String)
	 * @see technology.ecoa.deployment._2.depPackage#getDeployment_LogicalSystem()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='logicalSystem'"
	 * @generated
	 */
	String getLogicalSystem();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.Deployment#getLogicalSystem <em>Logical System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical System</em>' attribute.
	 * @see #getLogicalSystem()
	 * @generated
	 */
	void setLogicalSystem(String value);

} // Deployment
