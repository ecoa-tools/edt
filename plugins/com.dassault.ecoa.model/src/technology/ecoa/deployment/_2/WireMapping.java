/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.deployment._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wire Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a mapping between a wire and a
 *         computing platform link
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.deployment._2.WireMapping#getMappedOnLinkId <em>Mapped On Link Id</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.WireMapping#getSource <em>Source</em>}</li>
 *   <li>{@link technology.ecoa.deployment._2.WireMapping#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.deployment._2.depPackage#getWireMapping()
 * @model extendedMetaData="name='WireMapping' kind='empty'"
 * @generated
 */
public interface WireMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapped On Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the inter-nodes 
	 *           or the inter-platforms link
	 *           on which the wire is mapped. The link is
	 *           is defined at platform description level
	 *           in the logical system.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapped On Link Id</em>' attribute.
	 * @see #setMappedOnLinkId(String)
	 * @see technology.ecoa.deployment._2.depPackage#getWireMapping_MappedOnLinkId()
	 * @model dataType="technology.ecoa.deployment._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='mappedOnLinkId'"
	 * @generated
	 */
	String getMappedOnLinkId();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.WireMapping#getMappedOnLinkId <em>Mapped On Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped On Link Id</em>' attribute.
	 * @see #getMappedOnLinkId()
	 * @generated
	 */
	void setMappedOnLinkId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wire Source
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see technology.ecoa.deployment._2.depPackage#getWireMapping_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.WireMapping#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wire Target
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see technology.ecoa.deployment._2.depPackage#getWireMapping_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link technology.ecoa.deployment._2.WireMapping#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // WireMapping
