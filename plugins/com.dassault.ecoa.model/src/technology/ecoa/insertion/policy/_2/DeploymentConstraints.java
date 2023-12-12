/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#getDeploymentExample <em>Deployment Example</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain <em>Unique Protection Domain</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getDeploymentConstraints()
 * @model extendedMetaData="name='DeploymentConstraints' kind='empty'"
 * @generated
 */
public interface DeploymentConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Link towards an external file showing the deployment
	 *           used to validate the
	 *           component
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Example</em>' attribute.
	 * @see #setDeploymentExample(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDeploymentConstraints_DeploymentExample()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='deploymentExample'"
	 * @generated
	 */
	String getDeploymentExample();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#getDeploymentExample <em>Deployment Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Example</em>' attribute.
	 * @see #getDeploymentExample()
	 * @generated
	 */
	void setDeploymentExample(String value);

	/**
	 * Returns the value of the '<em><b>Unique Protection Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do the modules need to be co-located in the same
	 *           protection domain ?
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Protection Domain</em>' attribute.
	 * @see #isSetUniqueProtectionDomain()
	 * @see #unsetUniqueProtectionDomain()
	 * @see #setUniqueProtectionDomain(boolean)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getDeploymentConstraints_UniqueProtectionDomain()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='uniqueProtectionDomain'"
	 * @generated
	 */
	boolean isUniqueProtectionDomain();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain <em>Unique Protection Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Protection Domain</em>' attribute.
	 * @see #isSetUniqueProtectionDomain()
	 * @see #unsetUniqueProtectionDomain()
	 * @see #isUniqueProtectionDomain()
	 * @generated
	 */
	void setUniqueProtectionDomain(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain <em>Unique Protection Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniqueProtectionDomain()
	 * @see #isUniqueProtectionDomain()
	 * @see #setUniqueProtectionDomain(boolean)
	 * @generated
	 */
	void unsetUniqueProtectionDomain();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.DeploymentConstraints#isUniqueProtectionDomain <em>Unique Protection Domain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unique Protection Domain</em>' attribute is set.
	 * @see #unsetUniqueProtectionDomain()
	 * @see #isUniqueProtectionDomain()
	 * @see #setUniqueProtectionDomain(boolean)
	 * @generated
	 */
	boolean isSetUniqueProtectionDomain();

} // DeploymentConstraints
