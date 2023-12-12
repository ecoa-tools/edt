/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes an instance of a Module (having its
 *         own internal state).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ModuleInstance#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleInstance#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleInstance#getImplementationName <em>Implementation Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getModuleInstance()
 * @model extendedMetaData="name='ModuleInstance' kind='elementOnly'"
 * @generated
 */
public interface ModuleInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference.
	 * @see #setPropertyValues(PropertyValues)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleInstance_PropertyValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyValues' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyValues getPropertyValues();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleInstance#getPropertyValues <em>Property Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Values</em>' containment reference.
	 * @see #getPropertyValues()
	 * @generated
	 */
	void setPropertyValues(PropertyValues value);

	/**
	 * Returns the value of the '<em><b>Pinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of pinfo used by the module
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pinfo</em>' containment reference.
	 * @see #setPinfo(PinfoType)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleInstance_Pinfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	PinfoType getPinfo();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleInstance#getPinfo <em>Pinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinfo</em>' containment reference.
	 * @see #getPinfo()
	 * @generated
	 */
	void setPinfo(PinfoType value);

	/**
	 * Returns the value of the '<em><b>Implementation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Name</em>' attribute.
	 * @see #setImplementationName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleInstance_ImplementationName()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='implementationName'"
	 * @generated
	 */
	String getImplementationName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleInstance#getImplementationName <em>Implementation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Name</em>' attribute.
	 * @see #getImplementationName()
	 * @generated
	 */
	void setImplementationName(String value);

} // ModuleInstance
