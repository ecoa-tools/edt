/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ServerType#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ServerType#getModuleInstance <em>Module Instance</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getServerType()
 * @model extendedMetaData="name='server_._type' kind='elementOnly'"
 * @generated
 */
public interface ServerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(OpRef)
	 * @see technology.ecoa.implementation._2.impPackage#getServerType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	OpRef getReference();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ServerType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(OpRef value);

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: optional attributes concern the
	 *                   request
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Instance</em>' containment reference.
	 * @see #setModuleInstance(OpRefActivatableFifo)
	 * @see technology.ecoa.implementation._2.impPackage#getServerType_ModuleInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	OpRefActivatableFifo getModuleInstance();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ServerType#getModuleInstance <em>Module Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Instance</em>' containment reference.
	 * @see #getModuleInstance()
	 * @generated
	 */
	void setModuleInstance(OpRefActivatableFifo value);

} // ServerType
