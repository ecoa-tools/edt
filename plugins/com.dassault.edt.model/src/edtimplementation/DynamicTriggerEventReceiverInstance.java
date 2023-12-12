/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Dynamic
 * Trigger Event Receiver Instance</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerEventReceiverInstance()
 * @model
 * @generated
 */
public interface DynamicTriggerEventReceiverInstance extends EventLinkReceiver {

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.Parameter}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getDynamicTriggerEventReceiverInstance_Inputs()
	 * @model containment="true" transient="true" changeable="false" derived="true"
	 * @generated NOT
	 */
	EList<Parameter> getInputs();

} // DynamicTriggerEventReceiverInstance
