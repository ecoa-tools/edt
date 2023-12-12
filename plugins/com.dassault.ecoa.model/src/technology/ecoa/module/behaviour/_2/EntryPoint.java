/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.module.behaviour._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.module.behaviour._2.EntryPoint#getActivatingCondition <em>Activating Condition</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.EntryPoint#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link technology.ecoa.module.behaviour._2.EntryPoint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.module.behaviour._2.modPackage#getEntryPoint()
 * @model extendedMetaData="name='EntryPoint' kind='elementOnly'"
 * @generated
 */
public interface EntryPoint extends ActionSet {
	/**
	 * Returns the value of the '<em><b>Activating Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the activating operation if the
	 *             operation here described is not activating
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activating Condition</em>' attribute.
	 * @see #setActivatingCondition(String)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getEntryPoint_ActivatingCondition()
	 * @model dataType="technology.ecoa.module.behaviour._2.NameId"
	 *        extendedMetaData="kind='attribute' name='activatingCondition'"
	 * @generated
	 */
	String getActivatingCondition();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.EntryPoint#getActivatingCondition <em>Activating Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activating Condition</em>' attribute.
	 * @see #getActivatingCondition()
	 * @generated
	 */
	void setActivatingCondition(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deadline of the operation.
	 *               This value has no impact of the code generation.
	 *               It is only to store intermediate analysis result done by the
	 *               component supplier.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(double)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getEntryPoint_Deadline()
	 * @model unsettable="true" dataType="technology.ecoa.module.behaviour._2.Steps"
	 *        extendedMetaData="kind='attribute' name='deadline'"
	 * @generated
	 */
	double getDeadline();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.EntryPoint#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.module.behaviour._2.EntryPoint#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(double)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.module.behaviour._2.EntryPoint#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(double)
	 * @generated
	 */
	boolean isSetDeadline();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the incoming module operation
	 *               See compl.impl.xml.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.module.behaviour._2.modPackage#getEntryPoint_Name()
	 * @model dataType="technology.ecoa.module.behaviour._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.module.behaviour._2.EntryPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EntryPoint
