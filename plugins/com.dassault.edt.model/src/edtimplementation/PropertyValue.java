/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.ecore.EObject;

import edtproject.Property;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Property
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.PropertyValue#getValue <em>Value</em>}</li>
 *   <li>{@link edtimplementation.PropertyValue#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.PropertyValue#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link edtimplementation.PropertyValue#getValueComponentDefinitionProperty <em>Value Component Definition Property</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getPropertyValue()
 * @model
 * @generated
 */
public interface PropertyValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edtimplementation.EdtimplementationPackage#getPropertyValue_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edtimplementation.PropertyValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getPropertyValue_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.PropertyValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Property Type</em>' reference.
	 * @see #setPropertyType(ModuleTypeProperty)
	 * @see edtimplementation.EdtimplementationPackage#getPropertyValue_PropertyType()
	 * @model required="true"
	 * @generated
	 */
	ModuleTypeProperty getPropertyType();

	/**
	 * Sets the value of the '{@link edtimplementation.PropertyValue#getPropertyType
	 * <em>Property Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Property Type</em>' reference.
	 * @see #getPropertyType()
	 * @generated
	 */
	void setPropertyType(ModuleTypeProperty value);

	/**
	 * Returns the value of the '<em><b>Value Component Definition Property</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Value Component Definition Property</em>' reference.
	 * @see #setValueComponentDefinitionProperty(Property)
	 * @see edtimplementation.EdtimplementationPackage#getPropertyValue_ValueComponentDefinitionProperty()
	 * @model
	 * @generated
	 */
	Property getValueComponentDefinitionProperty();

	/**
	 * Sets the value of the '{@link edtimplementation.PropertyValue#getValueComponentDefinitionProperty <em>Value Component Definition Property</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Component Definition Property</em>' reference.
	 * @see #getValueComponentDefinitionProperty()
	 * @generated
	 */
	void setValueComponentDefinitionProperty(Property value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // PropertyValue
