/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link temp.ModuleBehaviour#getName <em>Name</em>}</li>
 *   <li>{@link temp.ModuleBehaviour#getModuleBehaviour <em>Module Behaviour</em>}</li>
 * </ul>
 *
 * @see temp.TempPackage#getModuleBehaviour()
 * @model
 * @generated
 */
public interface ModuleBehaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see temp.TempPackage#getModuleBehaviour_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link temp.ModuleBehaviour#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Behaviour</em>' containment reference.
	 * @see #setModuleBehaviour(technology.ecoa.module.behaviour._2.ModuleBehaviour)
	 * @see temp.TempPackage#getModuleBehaviour_ModuleBehaviour()
	 * @model containment="true" required="true"
	 * @generated
	 */
	technology.ecoa.module.behaviour._2.ModuleBehaviour getModuleBehaviour();

	/**
	 * Sets the value of the '{@link temp.ModuleBehaviour#getModuleBehaviour <em>Module Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Behaviour</em>' containment reference.
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	void setModuleBehaviour(technology.ecoa.module.behaviour._2.ModuleBehaviour value);

} // ModuleBehaviour
