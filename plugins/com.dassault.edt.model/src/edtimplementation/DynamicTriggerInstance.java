/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Dynamic
 * Trigger Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.DynamicTriggerInstance#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edtimplementation.DynamicTriggerInstance#getSize <em>Size</em>}</li>
 *   <li>{@link edtimplementation.DynamicTriggerInstance#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerInstance()
 * @model
 * @generated
 */
public interface DynamicTriggerInstance extends Trigger {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference
	 * list. The list contents are of type {@link edtimplementation.Parameter}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerInstance_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerInstance_Size()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getSize();

	/**
	 * Sets the value of the '{@link edtimplementation.DynamicTriggerInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.DynamicTriggerInstance#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.DynamicTriggerInstance#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(BigInteger)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.OperationInstance}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerInstance_Operations()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<OperationInstance> getOperations();

} // DynamicTriggerInstance
