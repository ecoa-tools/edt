/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtqos.ServiceInstanceQos;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Definition</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.ComponentDefinition#getName <em>Name</em>}</li>
 * <li>{@link edtproject.ComponentDefinition#getProperties
 * <em>Properties</em>}</li>
 * <li>{@link edtproject.ComponentDefinition#getReferences
 * <em>References</em>}</li>
 * <li>{@link edtproject.ComponentDefinition#getServices <em>Services</em>}</li>
 * <li>{@link edtproject.ComponentDefinition#getAssociatedServiceQos
 * <em>Associated Service Qos</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComponentDefinition_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentDefinition#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference
	 * list. The list contents are of type {@link edtproject.Property}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponentDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link edtproject.ComponentDefinitionReference}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponentDefinition_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentDefinitionReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link edtproject.ComponentDefinitionService}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComponentDefinition_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentDefinitionService> getServices();

	/**
	 * Returns the value of the '<em><b>Associated Service Qos</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link edtqos.ServiceInstanceQos}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the value of the '<em>Associated Service Qos</em>' containment
	 *         reference list.
	 * @see edtproject.EDTProjectPackage#getComponentDefinition_AssociatedServiceQos()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<ServiceInstanceQos> getAssociatedServiceQos();

	/**
	 * Find all the Component referencing to this ComponentDefinitions
	 * 
	 * @return
	 * @generated NOT
	 */
	EList<Component> findAssociatedComponent();

	/**
	 * Find componentDefinitionProperty by name
	 * 
	 * @param name : name of ComponentDefinitionProperty to link
	 * @return ComponentDefinitionProperty to link
	 */
	public edtproject.Property findComponentDefinitionPropertyByName(String name);

	/**
	 * Find componentDefinitionService by name
	 * 
	 * @param name : name of ComponentDefinitionService to link
	 * @return ComponentDefinitionService to link
	 */
	public ComponentDefinitionService findComponentDefinitionServiceByName(String name);

	/**
	 * Find ComponentDefinitionReference by name
	 * 
	 * @param name : name of ComponentDefinitionReference to link
	 * @return ComponentDefinitionReference to link
	 */
	public ComponentDefinitionReference findComponentDefinitionReferenceByName(String name);

	/**
	 * 
	 * @return true if no missing elements
	 */
	boolean isComplete();

} // ComponentDefinition
