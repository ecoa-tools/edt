/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType#getDeployable <em>Deployable</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getContributionType()
 * @model extendedMetaData="name='ContributionType' kind='elementOnly'"
 * @generated
 */
public interface ContributionType extends CommonExtensionBase {
	/**
	 * Returns the value of the '<em><b>Deployable</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployable</em>' containment reference list.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaPackage#getContributionType_Deployable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deployable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeployableType> getDeployable();

} // ContributionType
