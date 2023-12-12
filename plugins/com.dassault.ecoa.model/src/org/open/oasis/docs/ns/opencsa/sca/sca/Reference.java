/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getPromote <em>Promote</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getReference()
 * @model extendedMetaData="name='Reference' kind='elementOnly'"
 * @generated
 */
public interface Reference extends Contract {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getReference_Multiplicity()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='multiplicity'"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
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
	 * Unsets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * Returns the value of the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' attribute.
	 * @see #setPromote(List)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getReference_Promote()
	 * @model dataType="org.open.oasis.docs.ns.opencsa.sca.sca.ListOfAnyURIs" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='promote'"
	 * @generated
	 */
	List<String> getPromote();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getPromote <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' attribute.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(List<String> value);

} // Reference
