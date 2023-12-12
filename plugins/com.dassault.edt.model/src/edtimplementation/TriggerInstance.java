/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Trigger
 * Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.TriggerInstance#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getTriggerInstance()
 * @model
 * @generated
 */
public interface TriggerInstance extends Trigger {

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(OperationInstance)
	 * @see edtimplementation.EdtimplementationPackage#getTriggerInstance_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationInstance getOperations();

	/**
	 * Sets the value of the '{@link edtimplementation.TriggerInstance#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationInstance value);
} // TriggerInstance
