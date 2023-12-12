/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.sca.extension.scaExt;

import org.open.oasis.docs.ns.opencsa.sca.sca.Implementation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.Instance#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.Instance#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link technology.ecoa.sca.extension.scaExt.Instance#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInstance()
 * @model extendedMetaData="name='Instance' kind='elementOnly'"
 * @generated
 */
public interface Instance extends Implementation {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(ImplementationType)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInstance_Implementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implementation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImplementationType getImplementation();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.Instance#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ImplementationType value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see #setComponentType(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInstance_ComponentType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='componentType'"
	 * @generated
	 */
	String getComponentType();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.Instance#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see technology.ecoa.sca.extension.scaExt.scaExtPackage#getInstance_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link technology.ecoa.sca.extension.scaExt.Instance#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Instance
