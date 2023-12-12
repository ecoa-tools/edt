/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.ComponentProperty#getComponentDefinitionProperty <em>Component Definition Property</em>}</li>
 *   <li>{@link edtproject.ComponentProperty#getFile <em>File</em>}</li>
 *   <li>{@link edtproject.ComponentProperty#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link edtproject.ComponentProperty#getSource <em>Source</em>}</li>
 *   <li>{@link edtproject.ComponentProperty#getValue <em>Value</em>}</li>
 *   <li>{@link edtproject.ComponentProperty#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentProperty()
 * @model
 * @generated
 */
public interface ComponentProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Definition Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Property</em>' reference.
	 * @see #setComponentDefinitionProperty(Property)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_ComponentDefinitionProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getComponentDefinitionProperty();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getComponentDefinitionProperty <em>Component Definition Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Property</em>' reference.
	 * @see #getComponentDefinitionProperty()
	 * @generated
	 */
	void setComponentDefinitionProperty(Property value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_File()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' reference.
	 * @see #setSourceProperty(Property)
	 * @see edtproject.EDTProjectPackage#getComponentProperty_SourceProperty()
	 * @model required="true"
	 * @generated
	 */
	Property getSourceProperty();

	/**
	 * Sets the value of the '{@link edtproject.ComponentProperty#getSourceProperty <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' reference.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(Property value);

} // ComponentProperty
