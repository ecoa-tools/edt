/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply <em>Must Supply</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getProperty()
 * @model extendedMetaData="name='Property' kind='mixed'"
 * @generated
 */
public interface Property extends SCAPropertyBase {
	/**
	 * Returns the value of the '<em><b>Must Supply</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Supply</em>' attribute.
	 * @see #isSetMustSupply()
	 * @see #unsetMustSupply()
	 * @see #setMustSupply(boolean)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getProperty_MustSupply()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='mustSupply'"
	 * @generated
	 */
	boolean isMustSupply();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply <em>Must Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Supply</em>' attribute.
	 * @see #isSetMustSupply()
	 * @see #unsetMustSupply()
	 * @see #isMustSupply()
	 * @generated
	 */
	void setMustSupply(boolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply <em>Must Supply</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustSupply()
	 * @see #isMustSupply()
	 * @see #setMustSupply(boolean)
	 * @generated
	 */
	void unsetMustSupply();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply <em>Must Supply</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Supply</em>' attribute is set.
	 * @see #unsetMustSupply()
	 * @see #isMustSupply()
	 * @see #setMustSupply(boolean)
	 * @generated
	 */
	boolean isSetMustSupply();

} // Property
