/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.Composite#getDeployedOnComputingPlatform <em>Deployed On Computing Platform</em>}</li>
 *   <li>{@link technology.ecoa.cross.platforms.view._2.Composite#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getComposite()
 * @model extendedMetaData="name='Composite' kind='empty'"
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployed On Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of a logical platform
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed On Computing Platform</em>' attribute.
	 * @see #setDeployedOnComputingPlatform(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getComposite_DeployedOnComputingPlatform()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='deployedOnComputingPlatform'"
	 * @generated
	 */
	String getDeployedOnComputingPlatform();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.Composite#getDeployedOnComputingPlatform <em>Deployed On Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed On Computing Platform</em>' attribute.
	 * @see #getDeployedOnComputingPlatform()
	 * @generated
	 */
	void setDeployedOnComputingPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.cross.platforms.view._2.viewPackage#getComposite_Name()
	 * @model dataType="technology.ecoa.cross.platforms.view._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.cross.platforms.view._2.Composite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Composite
