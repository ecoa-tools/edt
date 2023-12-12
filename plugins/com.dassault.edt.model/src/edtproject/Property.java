/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edttype.EDTDataType;
import edttype.Library;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.Property#isMustSupply <em>Must Supply</em>}</li>
 * <li>{@link edtproject.Property#getType <em>Type</em>}</li>
 * <li>{@link edtproject.Property#getName <em>Name</em>}</li>
 * <li>{@link edtproject.Property#getValue <em>Value</em>}</li>
 * <li>{@link edtproject.Property#getECOASCAType <em>ECOASCA Type</em>}</li>
 * <li>{@link edtproject.Property#getECOASCALibrary <em>ECOASCA
 * Library</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Must Supply</b></em>' attribute. The default
	 * value is <code>"false"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Must Supply</em>' attribute.
	 * @see #isSetMustSupply()
	 * @see #unsetMustSupply()
	 * @see #setMustSupply(boolean)
	 * @see edtproject.EDTProjectPackage#getProperty_MustSupply()
	 * @model default="false" unsettable="true"
	 *        dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMustSupply();

	/**
	 * Sets the value of the '{@link edtproject.Property#isMustSupply <em>Must
	 * Supply</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Must Supply</em>' attribute.
	 * @see #isSetMustSupply()
	 * @see #unsetMustSupply()
	 * @see #isMustSupply()
	 * @generated
	 */
	void setMustSupply(boolean value);

	/**
	 * Unsets the value of the '{@link edtproject.Property#isMustSupply <em>Must
	 * Supply</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetMustSupply()
	 * @see #isMustSupply()
	 * @see #setMustSupply(boolean)
	 * @generated
	 */
	void unsetMustSupply();

	/**
	 * Returns whether the value of the '{@link edtproject.Property#isMustSupply
	 * <em>Must Supply</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Must Supply</em>' attribute is set.
	 * @see #unsetMustSupply()
	 * @see #isMustSupply()
	 * @see #setMustSupply(boolean)
	 * @generated
	 */
	boolean isSetMustSupply();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see edtproject.EDTProjectPackage#getProperty_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link edtproject.Property#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getProperty_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.Property#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edtproject.EDTProjectPackage#getProperty_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edtproject.Property#getValue <em>Value</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>ECOASCA Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>ECOASCA Type</em>' reference.
	 * @see #setECOASCAType(EDTDataType)
	 * @see edtproject.EDTProjectPackage#getProperty_ECOASCAType()
	 * @model
	 * @generated
	 */
	EDTDataType getECOASCAType();

	/**
	 * Sets the value of the '{@link edtproject.Property#getECOASCAType <em>ECOASCA
	 * Type</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>ECOASCA Type</em>' reference.
	 * @see #getECOASCAType()
	 * @generated
	 */
	void setECOASCAType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>ECOASCA Library</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>ECOASCA Library</em>' reference.
	 * @see #setECOASCALibrary(Library)
	 * @see edtproject.EDTProjectPackage#getProperty_ECOASCALibrary()
	 * @model
	 * @generated
	 */
	Library getECOASCALibrary();

	/**
	 * Sets the value of the '{@link edtproject.Property#getECOASCALibrary
	 * <em>ECOASCA Library</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>ECOASCA Library</em>' reference.
	 * @see #getECOASCALibrary()
	 * @generated
	 */
	void setECOASCALibrary(Library value);

	/**
	 * Find all ComponentProperty associated to the ComponentDefinitionProperty
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<ComponentProperty> findAssociatedComponentProperty();

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // Property
