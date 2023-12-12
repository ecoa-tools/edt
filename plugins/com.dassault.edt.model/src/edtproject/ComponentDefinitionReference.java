/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Definition Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.ComponentDefinitionReference#getName
 * <em>Name</em>}</li>
 * <li>{@link edtproject.ComponentDefinitionReference#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getComponentDefinitionReference()
 * @model
 * @generated
 */
public interface ComponentDefinitionReference extends Contract {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getComponentDefinitionReference_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.ComponentDefinitionReference#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see edtproject.EDTProjectPackage#getComponentDefinitionReference_Multiplicity()
	 * @model default="1..1" unsettable="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the
	 * '{@link edtproject.ComponentDefinitionReference#getMultiplicity
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
	 * Unsets the value of the
	 * '{@link edtproject.ComponentDefinitionReference#getMultiplicity
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
	 * Returns whether the value of the
	 * '{@link edtproject.ComponentDefinitionReference#getMultiplicity
	 * <em>Multiplicity</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * 
	 * @return true if no missing element
	 */
	boolean isComplete();

} // ComponentDefinitionReference
