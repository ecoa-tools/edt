/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Link between DATA operations.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.DataLink#getWriters <em>Writers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DataLink#getReaders <em>Readers</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DataLink#isControlled <em>Controlled</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.DataLink#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getDataLink()
 * @model extendedMetaData="name='DataLink' kind='elementOnly'"
 * @generated
 */
public interface DataLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Writers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writers</em>' containment reference.
	 * @see #setWriters(WritersType)
	 * @see technology.ecoa.implementation._2.impPackage#getDataLink_Writers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='writers' namespace='##targetNamespace'"
	 * @generated
	 */
	WritersType getWriters();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DataLink#getWriters <em>Writers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writers</em>' containment reference.
	 * @see #getWriters()
	 * @generated
	 */
	void setWriters(WritersType value);

	/**
	 * Returns the value of the '<em><b>Readers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readers</em>' containment reference.
	 * @see #setReaders(ReadersType)
	 * @see technology.ecoa.implementation._2.impPackage#getDataLink_Readers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readers' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadersType getReaders();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DataLink#getReaders <em>Readers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readers</em>' containment reference.
	 * @see #getReaders()
	 * @generated
	 */
	void setReaders(ReadersType value);

	/**
	 * Returns the value of the '<em><b>Controlled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean flag to indicate if the Versioned
	 *           Data access are controlled by the Infrastructure.
	 *           If true, each concurrent write accesses to its own copy
	 *           of the data and readers are ensured that the copy they
	 *           access is stable until the release of the VD handle.
	 *           Otherwise, if false, any module getting a handle may
	 *           directly access the local data repository (as no copy is 
	 *           made by the Infrastructure).
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controlled</em>' attribute.
	 * @see #isSetControlled()
	 * @see #unsetControlled()
	 * @see #setControlled(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getDataLink_Controlled()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='controlled'"
	 * @generated
	 */
	boolean isControlled();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DataLink#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled</em>' attribute.
	 * @see #isSetControlled()
	 * @see #unsetControlled()
	 * @see #isControlled()
	 * @generated
	 */
	void setControlled(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.DataLink#isControlled <em>Controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControlled()
	 * @see #isControlled()
	 * @see #setControlled(boolean)
	 * @generated
	 */
	void unsetControlled();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.DataLink#isControlled <em>Controlled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controlled</em>' attribute is set.
	 * @see #unsetControlled()
	 * @see #isControlled()
	 * @see #setControlled(boolean)
	 * @generated
	 */
	boolean isSetControlled();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see technology.ecoa.implementation._2.impPackage#getDataLink_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.DataLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.DataLink#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.DataLink#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

} // DataLink
