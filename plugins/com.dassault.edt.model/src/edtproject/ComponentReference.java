/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.ComponentReference#getComponentDefinitionReference <em>Component Definition Reference</em>}</li>
 *   <li>{@link edtproject.ComponentReference#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edtproject.ComponentReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentReference()
 * @model
 * @generated
 */
public interface ComponentReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Definition Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition Reference</em>' reference.
	 * @see #setComponentDefinitionReference(ComponentDefinitionReference)
	 * @see edtproject.EDTProjectPackage#getComponentReference_ComponentDefinitionReference()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinitionReference getComponentDefinitionReference();

	/**
	 * Sets the value of the '{@link edtproject.ComponentReference#getComponentDefinitionReference <em>Component Definition Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition Reference</em>' reference.
	 * @see #getComponentDefinitionReference()
	 * @generated
	 */
	void setComponentDefinitionReference(ComponentDefinitionReference value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute. The
	 * default value is <code>"1..1"</code>. The literals are from the enumeration
	 * {@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @see edtproject.EDTProjectPackage#getComponentReference_Multiplicity()
	 * @model default="1..1" unsettable="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link edtproject.ComponentReference#getMultiplicity
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Unsets the value of the '{@link edtproject.ComponentReference#getMultiplicity
	 * <em>Multiplicity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link edtproject.ComponentReference#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * 
	 * @return name of referenced ComponentDefinitionReference
	 * @generated NOT
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return serviceLink
	 */
	EList<ServiceLink> getServiceLink();

	/**
	 * get Name as component_Name/reference_Name
	 */
	String getWireString();

} // ComponentReference
