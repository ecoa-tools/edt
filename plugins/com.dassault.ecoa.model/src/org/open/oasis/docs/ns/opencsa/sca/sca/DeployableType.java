/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getComposite <em>Composite</em>}</li>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDeployableType()
 * @model extendedMetaData="name='DeployableType' kind='elementOnly'"
 * @generated
 */
public interface DeployableType extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDeployableType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' attribute.
	 * @see #setComposite(QName)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDeployableType_Composite()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='composite'"
	 * @generated
	 */
	QName getComposite();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getComposite <em>Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' attribute.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(QName value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' attribute.
	 * @see #setDeployment(String)
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getDeployableType_Deployment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='deployment' namespace='http://www.ecoa.technology/sca-extension-2.0'"
	 * @generated
	 */
	String getDeployment();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getDeployment <em>Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' attribute.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(String value);

} // DeployableType
