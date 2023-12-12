/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.Instance#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.Instance#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.Instance#getRelativePriority <em>Relative Priority</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getInstance()
 * @model extendedMetaData="name='Instance' kind='empty'"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Behaviour</em>' attribute.
	 * @see #setModuleBehaviour(String)
	 * @see technology.ecoa.implementation._2.impPackage#getInstance_ModuleBehaviour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='moduleBehaviour'"
	 * @generated
	 */
	String getModuleBehaviour();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.Instance#getModuleBehaviour <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Behaviour</em>' attribute.
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	void setModuleBehaviour(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getInstance_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relative Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Relative priority of this module instance to
	 *           others module instances of the same component instance
	 *           to help
	 *           to distinguish them when allocating actual
	 *           priorities at
	 *           deployment level
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Priority</em>' attribute.
	 * @see #setRelativePriority(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getInstance_RelativePriority()
	 * @model dataType="technology.ecoa.implementation._2.RelativePriority" required="true"
	 *        extendedMetaData="kind='attribute' name='relativePriority'"
	 * @generated
	 */
	BigInteger getRelativePriority();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.Instance#getRelativePriority <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Priority</em>' attribute.
	 * @see #getRelativePriority()
	 * @generated
	 */
	void setRelativePriority(BigInteger value);

} // Instance
