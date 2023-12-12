/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentReference()
 * @model extendedMetaData="name='ComponentReference' kind='elementOnly'"
 * @generated
 */
public interface ComponentReference extends Contract {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"1..1"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getComponentReference_Multiplicity()
	 * @model default="1..1" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='multiplicity'"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

} // ComponentReference
