/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Composite</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.Composite#getProperties <em>Properties</em>}</li>
 * <li>{@link edtproject.Composite#getComponents <em>Components</em>}</li>
 * <li>{@link edtproject.Composite#getName <em>Name</em>}</li>
 * <li>{@link edtproject.Composite#getReferences <em>References</em>}</li>
 * <li>{@link edtproject.Composite#getServices <em>Services</em>}</li>
 * <li>{@link edtproject.Composite#getTargetNamespace <em>Target
 * Namespace</em>}</li>
 * <li>{@link edtproject.Composite#getServiceLinks <em>Service Links</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference
	 * list. The list contents are of type {@link edtproject.Component}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference
	 * list. The list contents are of type {@link edtproject.Property}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComposite_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComposite_Name()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.Composite#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference
	 * list. The list contents are of type {@link edtproject.CompositeReference}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComposite_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference
	 * list. The list contents are of type {@link edtproject.CompositeService}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComposite_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeService> getServices();

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see edtproject.EDTProjectPackage#getComposite_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link edtproject.Composite#getTargetNamespace
	 * <em>Target Namespace</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Service Links</b></em>' containment
	 * reference list. The list contents are of type {@link edtproject.ServiceLink}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Service Links</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getComposite_ServiceLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceLink> getServiceLinks();

	/**
	 * Find Property
	 * 
	 * @param name          : name of Component to link
	 * @param componentList : list of Component imported
	 * @return : Component to link
	 */
	public edtproject.Property findPropertyByName(String name);

	/**
	 * Find Component
	 * 
	 * @param name          : name of Component to link
	 * @param componentList : list of Component imported
	 * @return : Component to link
	 */
	public edtproject.Component findComponentByName(String name);

	/**
	 * Find ComponentService
	 * 
	 * @param name
	 * @return
	 */
	public edtproject.ComponentService findComponentServiceFromWire(String name);

	/**
	 * Find ComponentReference
	 * 
	 * @param name
	 * @return
	 */
	public edtproject.ComponentReference findComponentReferenceFromWire(String name);

	/**
	 * Find ServiceLink from ComponentReference and Service
	 * 
	 * @param ref
	 * @param service
	 * @return
	 */
	public edtproject.ServiceLink findServiceLink(ComponentReference ref, ComponentService service);

} // Composite
