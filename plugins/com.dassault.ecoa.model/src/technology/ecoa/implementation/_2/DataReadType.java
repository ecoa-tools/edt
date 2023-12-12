/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Read Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.DataReadType#isNotifying <em>Notifying</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getDataReadType()
 * @model extendedMetaData="name='dataRead_._type' kind='empty'"
 * @generated
 */
public interface DataReadType extends VersionedData {
	/**
	 * Returns the value of the '<em><b>Notifying</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifying</em>' attribute.
	 * @see #isSetNotifying()
	 * @see #unsetNotifying()
	 * @see #setNotifying(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getDataReadType_Notifying()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='notifying'"
	 * @generated
	 */
	boolean isNotifying();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DataReadType#isNotifying <em>Notifying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifying</em>' attribute.
	 * @see #isSetNotifying()
	 * @see #unsetNotifying()
	 * @see #isNotifying()
	 * @generated
	 */
	void setNotifying(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.DataReadType#isNotifying <em>Notifying</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNotifying()
	 * @see #isNotifying()
	 * @see #setNotifying(boolean)
	 * @generated
	 */
	void unsetNotifying();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.DataReadType#isNotifying <em>Notifying</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Notifying</em>' attribute is set.
	 * @see #unsetNotifying()
	 * @see #isNotifying()
	 * @see #setNotifying(boolean)
	 * @generated
	 */
	boolean isSetNotifying();

} // DataReadType
