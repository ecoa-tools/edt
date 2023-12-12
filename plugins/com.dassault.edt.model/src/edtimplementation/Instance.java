/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.Instance#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link edtimplementation.Instance#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.Instance#getRelativePriority <em>Relative Priority</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getInstance()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Behaviour</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Behaviour</em>' attribute.
	 * @see #setModuleBehaviour(String)
	 * @see edtimplementation.EdtimplementationPackage#getInstance_ModuleBehaviour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getModuleBehaviour();

	/**
	 * Sets the value of the '{@link edtimplementation.Instance#getModuleBehaviour <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Module Behaviour</em>' attribute.
	 * @see #getModuleBehaviour()
	 * @generated
	 */
	void setModuleBehaviour(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getInstance_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Relative Priority</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Relative Priority</em>' attribute.
	 * @see #setRelativePriority(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getInstance_RelativePriority()
	 * @model dataType="technology.ecoa.implementation._2.RelativePriority"
	 *        required="true"
	 * @generated
	 */
	BigInteger getRelativePriority();

	/**
	 * Sets the value of the '{@link edtimplementation.Instance#getRelativePriority <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Relative Priority</em>' attribute.
	 * @see #getRelativePriority()
	 * @generated
	 */
	void setRelativePriority(BigInteger value);

	/**
	 * Find all operationLinks to assert if deletion is authorized
	 * 
	 * @return list of OperationLinks
	 */
	public EList<OperationLink> findOperationLinks();

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();
} // Instance
