/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import edtimplementation.ComponentImplementation;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Component#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link edtproject.Component#getComponentReferences <em>Component References</em>}</li>
 *   <li>{@link edtproject.Component#getComponentServices <em>Component Services</em>}</li>
 *   <li>{@link edtproject.Component#getProperties <em>Properties</em>}</li>
 *   <li>{@link edtproject.Component#getName <em>Name</em>}</li>
 *   <li>{@link edtproject.Component#getComponentImplementation <em>Component Implementation</em>}</li>
 *   <li>{@link edtproject.Component#getComponentDefinitionVersion <em>Component Definition Version</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition</em>' reference.
	 * @see #setComponentDefinition(ComponentDefinition)
	 * @see edtproject.EDTProjectPackage#getComponent_ComponentDefinition()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponentDefinition();

	/**
	 * Sets the value of the '{@link edtproject.Component#getComponentDefinition <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' reference.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Component References</b></em>' containment reference list.
	 * The list contents are of type {@link edtproject.ComponentReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component References</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponent_ComponentReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentReference> getComponentReferences();

	/**
	 * Returns the value of the '<em><b>Component Services</b></em>' containment reference list.
	 * The list contents are of type {@link edtproject.ComponentService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Services</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponent_ComponentServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentService> getComponentServices();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edtproject.ComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponent_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementation</em>' reference.
	 * @see #setComponentImplementation(ComponentImplementation)
	 * @see edtproject.EDTProjectPackage#getComponent_ComponentImplementation()
	 * @model required="true"
	 * @generated
	 */
	ComponentImplementation getComponentImplementation();

	/**
	 * Sets the value of the '{@link edtproject.Component#getComponentImplementation <em>Component Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Implementation</em>' reference.
	 * @see #getComponentImplementation()
	 * @generated
	 */
	void setComponentImplementation(ComponentImplementation value);

	/**
	 * Returns the value of the '<em><b>Component Definition Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Version</em>' attribute.
	 * @see #setComponentDefinitionVersion(String)
	 * @see edtproject.EDTProjectPackage#getComponent_ComponentDefinitionVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getComponentDefinitionVersion();

	/**
	 * Sets the value of the '{@link edtproject.Component#getComponentDefinitionVersion <em>Component Definition Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Version</em>' attribute.
	 * @see #getComponentDefinitionVersion()
	 * @generated
	 */
	void setComponentDefinitionVersion(String value);

} // Component
