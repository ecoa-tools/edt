/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute On Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingNode <em>Computing Node</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingPlatform <em>Computing Platform</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getExecuteOnType()
 * @model extendedMetaData="name='executeOn_._type' kind='empty'"
 * @generated
 */
public interface ExecuteOnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Computing Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Node</em>' attribute.
	 * @see #setComputingNode(String)
	 * @see technology.ecoa.deployment._2.depPackage#getExecuteOnType_ComputingNode()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='computingNode'"
	 * @generated
	 */
	String getComputingNode();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingNode <em>Computing Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Node</em>' attribute.
	 * @see #getComputingNode()
	 * @generated
	 */
	void setComputingNode(String value);

	/**
	 * Returns the value of the '<em><b>Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of a logical system.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computing Platform</em>' attribute.
	 * @see #setComputingPlatform(String)
	 * @see technology.ecoa.deployment._2.depPackage#getExecuteOnType_ComputingPlatform()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='computingPlatform'"
	 * @generated
	 */
	String getComputingPlatform();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.ExecuteOnType#getComputingPlatform <em>Computing Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Platform</em>' attribute.
	 * @see #getComputingPlatform()
	 * @generated
	 */
	void setComputingPlatform(String value);

} // ExecuteOnType
