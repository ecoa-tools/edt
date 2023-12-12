/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Instance</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleInstance#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link edtimplementation.ModuleInstance#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link edtimplementation.ModuleInstance#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link edtimplementation.ModuleInstance#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.ModuleInstance#getModuleImplementation <em>Module Implementation</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleInstance()
 * @model
 * @generated
 */
public interface ModuleInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.PropertyValue}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleInstance_PropertyValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyValue> getPropertyValues();

	/**
	 * Returns the value of the '<em><b>Pinfo</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.PinfoValue}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pinfo</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleInstance_Pinfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<PinfoValue> getPinfo();

	/**
	 * Returns the value of the '<em><b>Module Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Type</em>' reference.
	 * @see #setModuleType(ModuleType)
	 * @see edtimplementation.EdtimplementationPackage#getModuleInstance_ModuleType()
	 * @model required="true"
	 * @generated
	 */
	ModuleType getModuleType();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleInstance#getModuleType
	 * <em>Module Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Module Type</em>' reference.
	 * @see #getModuleType()
	 * @generated
	 */
	void setModuleType(ModuleType value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.OperationInstance}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleInstance_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OperationInstance> getOperations();

	/**
	 * Returns the value of the '<em><b>Module Implementation</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Module Implementation</em>' reference.
	 * @see #setModuleImplementation(ModuleImplementation)
	 * @see edtimplementation.EdtimplementationPackage#getModuleInstance_ModuleImplementation()
	 * @model required="true"
	 * @generated
	 */
	ModuleImplementation getModuleImplementation();

	/**
	 * Sets the value of the
	 * '{@link edtimplementation.ModuleInstance#getModuleImplementation <em>Module
	 * Implementation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Module Implementation</em>' reference.
	 * @see #getModuleImplementation()
	 * @generated
	 */
	void setModuleImplementation(ModuleImplementation value);

} // ModuleInstance
