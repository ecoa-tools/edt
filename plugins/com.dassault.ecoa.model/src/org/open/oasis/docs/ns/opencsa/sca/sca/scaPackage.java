/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package org.open.oasis.docs.ns.opencsa.sca.sca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.ns.opencsa.sca.sca.scaFactory
 * @model kind="package"
 *        annotation="http://java.sun.com/xml/ns/jaxb version='1.0'"
 * @generated
 */
public interface scaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/ns/opencsa/sca/200912";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scaPackage eINSTANCE = org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CommonExtensionBaseImpl <em>Common Extension Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.CommonExtensionBaseImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getCommonExtensionBase()
	 * @generated
	 */
	int COMMON_EXTENSION_BASE = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXTENSION_BASE__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Common Extension Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXTENSION_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Common Extension Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXTENSION_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Implementation Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION_GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContractImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INTERFACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentReferenceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentReference()
	 * @generated
	 */
	int COMPONENT_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__INTERFACE = CONTRACT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__NAME = CONTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentServiceImpl <em>Component Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentServiceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentService()
	 * @generated
	 */
	int COMPONENT_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE__INTERFACE = CONTRACT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE__NAME = CONTRACT__NAME;

	/**
	 * The number of structural features of the '<em>Component Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeReferenceImpl <em>Component Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeReferenceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentTypeReference()
	 * @generated
	 */
	int COMPONENT_TYPE_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE__DOCUMENTATION = COMPONENT_REFERENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE__INTERFACE = COMPONENT_REFERENCE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE__NAME = COMPONENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE__MULTIPLICITY = COMPONENT_REFERENCE__MULTIPLICITY;

	/**
	 * The number of structural features of the '<em>Component Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_REFERENCE_OPERATION_COUNT = COMPONENT_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GROUP = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SERVICE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__PROPERTY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REFERENCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__WIRE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = COMMON_EXTENSION_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET_NAMESPACE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContributionTypeImpl <em>Contribution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContributionTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getContributionType()
	 * @generated
	 */
	int CONTRIBUTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Deployable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_TYPE__DEPLOYABLE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contribution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_TYPE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl <em>Deployable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDeployableType()
	 * @generated
	 */
	int DEPLOYABLE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE__COMPOSITE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE__DEPLOYMENT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deployable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Deployable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYABLE_TYPE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentationImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__ANY = 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPOSITE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENSIONS = 6;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 10;

	/**
	 * The feature id for the '<em><b>Wire Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIRE_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRIBUTION = 12;

	/**
	 * The feature id for the '<em><b>Implementation Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ExtensionsTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationTypeImpl <em>Implementation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getImplementationType()
	 * @generated
	 */
	int IMPLEMENTATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE__TYPE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implementation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_TYPE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.InterfaceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAPropertyBaseImpl <em>SCA Property Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAPropertyBaseImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getSCAPropertyBase()
	 * @generated
	 */
	int SCA_PROPERTY_BASE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>SCA Property Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SCA Property Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_PROPERTY_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MIXED = SCA_PROPERTY_BASE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ANY = SCA_PROPERTY_BASE__ANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = SCA_PROPERTY_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = SCA_PROPERTY_BASE__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ANY_ATTRIBUTE = SCA_PROPERTY_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Must Supply</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUST_SUPPLY = SCA_PROPERTY_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = SCA_PROPERTY_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = SCA_PROPERTY_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyValueImpl <em>Property Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyValueImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getPropertyValue()
	 * @generated
	 */
	int PROPERTY_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__MIXED = SCA_PROPERTY_BASE__MIXED;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__ANY = SCA_PROPERTY_BASE__ANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__NAME = SCA_PROPERTY_BASE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__TYPE = SCA_PROPERTY_BASE__TYPE;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__ANY_ATTRIBUTE = SCA_PROPERTY_BASE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__FILE = SCA_PROPERTY_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE__SOURCE = SCA_PROPERTY_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_FEATURE_COUNT = SCA_PROPERTY_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_VALUE_OPERATION_COUNT = SCA_PROPERTY_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ReferenceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__INTERFACE = CONTRACT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = CONTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__MULTIPLICITY = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PROMOTE = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAImplementationImpl <em>SCA Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAImplementationImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getSCAImplementation()
	 * @generated
	 */
	int SCA_IMPLEMENTATION = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_IMPLEMENTATION__DOCUMENTATION = IMPLEMENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_IMPLEMENTATION__ANY = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_IMPLEMENTATION__NAME = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SCA Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_IMPLEMENTATION_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SCA Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCA_IMPLEMENTATION_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DOCUMENTATION = CONTRACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INTERFACE = CONTRACT__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = CONTRACT__NAME;

	/**
	 * The feature id for the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROMOTE = CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__DOCUMENTATION = COMPONENT_SERVICE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__INTERFACE = COMPONENT_SERVICE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__NAME = COMPONENT_SERVICE__NAME;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = COMPONENT_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = COMPONENT_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ValueTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__DOCUMENTATION = COMMON_EXTENSION_BASE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__ANY = COMMON_EXTENSION_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__SOURCE = COMMON_EXTENSION_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__TARGET = COMMON_EXTENSION_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = COMMON_EXTENSION_BASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_OPERATION_COUNT = COMMON_EXTENSION_BASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireFormatTypeImpl <em>Wire Format Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireFormatTypeImpl
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getWireFormatType()
	 * @generated
	 */
	int WIRE_FORMAT_TYPE = 25;

	/**
	 * The number of structural features of the '<em>Wire Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FORMAT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Wire Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FORMAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 26;

	/**
	 * The meta object id for the '<em>List Of Any UR Is</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getListOfAnyURIs()
	 * @generated
	 */
	int LIST_OF_ANY_UR_IS = 27;

	/**
	 * The meta object id for the '<em>List Of QNames</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getListOfQNames()
	 * @generated
	 */
	int LIST_OF_QNAMES = 28;

	/**
	 * The meta object id for the '<em>Multiplicity Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getMultiplicityObject()
	 * @generated
	 */
	int MULTIPLICITY_OBJECT = 29;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase <em>Common Extension Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Extension Base</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase
	 * @generated
	 */
	EClass getCommonExtensionBase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.CommonExtensionBase#getDocumentation()
	 * @see #getCommonExtensionBase()
	 * @generated
	 */
	EReference getCommonExtensionBase_Documentation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getImplementationGroup <em>Implementation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Implementation Group</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getImplementationGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ImplementationGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getImplementation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implementation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getGroup()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getService()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getReference()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getProperty()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference
	 * @generated
	 */
	EClass getComponentReference();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentReference#getMultiplicity()
	 * @see #getComponentReference()
	 * @generated
	 */
	EAttribute getComponentReference_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService <em>Component Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Service</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentService
	 * @generated
	 */
	EClass getComponentService();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getGroup()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getService()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getReference()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentType#getProperty()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Property();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference <em>Component Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ComponentTypeReference
	 * @generated
	 */
	EClass getComponentTypeReference();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getGroup()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getService()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getProperty()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getComponent()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getReference()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Reference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getWire()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Wire();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getName()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Composite#getTargetNamespace()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getInterface()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Contract#getName()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType
	 * @generated
	 */
	EClass getContributionType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType#getDeployable <em>Deployable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployable</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ContributionType#getDeployable()
	 * @see #getContributionType()
	 * @generated
	 */
	EReference getContributionType_Deployable();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType <em>Deployable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployable Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType
	 * @generated
	 */
	EClass getDeployableType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getAny()
	 * @see #getDeployableType()
	 * @generated
	 */
	EAttribute getDeployableType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composite</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getComposite()
	 * @see #getDeployableType()
	 * @generated
	 */
	EAttribute getDeployableType_Composite();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DeployableType#getDeployment()
	 * @see #getDeployableType()
	 * @generated
	 */
	EAttribute getDeployableType_Deployment();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Documentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Documentation#getMixed()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Documentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Documentation#getAny()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComponentType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getComposite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Composite();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getExtensions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Extensions();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Implementation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplementationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getInterface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getWireFormat <em>Wire Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wire Format</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getWireFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WireFormat();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contribution</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getContribution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationComposite <em>Implementation Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Composite</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.DocumentRoot#getImplementationComposite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImplementationComposite();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ExtensionsType#getAny()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EAttribute getExtensionsType_Any();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType
	 * @generated
	 */
	EClass getImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ImplementationType#getType()
	 * @see #getImplementationType()
	 * @generated
	 */
	EAttribute getImplementationType_Type();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply <em>Must Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Supply</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Property#isMustSupply()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_MustSupply();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Value</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue
	 * @generated
	 */
	EClass getPropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getFile()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_File();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.PropertyValue#getSource()
	 * @see #getPropertyValue()
	 * @generated
	 */
	EAttribute getPropertyValue_Source();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getMultiplicity()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promote</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Reference#getPromote()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Promote();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation <em>SCA Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCA Implementation</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation
	 * @generated
	 */
	EClass getSCAImplementation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation#getAny()
	 * @see #getSCAImplementation()
	 * @generated
	 */
	EAttribute getSCAImplementation_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAImplementation#getName()
	 * @see #getSCAImplementation()
	 * @generated
	 */
	EAttribute getSCAImplementation_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase <em>SCA Property Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SCA Property Base</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase
	 * @generated
	 */
	EClass getSCAPropertyBase();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getMixed()
	 * @see #getSCAPropertyBase()
	 * @generated
	 */
	EAttribute getSCAPropertyBase_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getAny()
	 * @see #getSCAPropertyBase()
	 * @generated
	 */
	EAttribute getSCAPropertyBase_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getName()
	 * @see #getSCAPropertyBase()
	 * @generated
	 */
	EAttribute getSCAPropertyBase_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getType()
	 * @see #getSCAPropertyBase()
	 * @generated
	 */
	EAttribute getSCAPropertyBase_Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.SCAPropertyBase#getAnyAttribute()
	 * @see #getSCAPropertyBase()
	 * @generated
	 */
	EAttribute getSCAPropertyBase_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Service#getPromote <em>Promote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Promote</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Service#getPromote()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Promote();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getMixed()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getAny()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.ValueType#getAnyAttribute()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getAny()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getSource()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Wire#getTarget()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Target();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType <em>Wire Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Format Type</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.WireFormatType
	 * @generated
	 */
	EClass getWireFormatType();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List Of Any UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Of Any UR Is</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='listOfAnyURIs' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getListOfAnyURIs();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List Of QNames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Of QNames</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='listOfQNames' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getListOfQNames();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity <em>Multiplicity Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Object</em>'.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @model instanceClass="org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity"
	 *        extendedMetaData="name='Multiplicity:Object' baseType='Multiplicity'"
	 * @generated
	 */
	EDataType getMultiplicityObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	scaFactory getscaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CommonExtensionBaseImpl <em>Common Extension Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.CommonExtensionBaseImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getCommonExtensionBase()
		 * @generated
		 */
		EClass COMMON_EXTENSION_BASE = eINSTANCE.getCommonExtensionBase();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_EXTENSION_BASE__DOCUMENTATION = eINSTANCE.getCommonExtensionBase_Documentation();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Implementation Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IMPLEMENTATION_GROUP = eINSTANCE.getComponent_ImplementationGroup();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTATION = eINSTANCE.getComponent_Implementation();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__GROUP = eINSTANCE.getComponent_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__SERVICE = eINSTANCE.getComponent_Service();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REFERENCE = eINSTANCE.getComponent_Reference();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROPERTY = eINSTANCE.getComponent_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentReferenceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentReference()
		 * @generated
		 */
		EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REFERENCE__MULTIPLICITY = eINSTANCE.getComponentReference_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentServiceImpl <em>Component Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentServiceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentService()
		 * @generated
		 */
		EClass COMPONENT_SERVICE = eINSTANCE.getComponentService();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__GROUP = eINSTANCE.getComponentType_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__SERVICE = eINSTANCE.getComponentType_Service();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__REFERENCE = eINSTANCE.getComponentType_Reference();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PROPERTY = eINSTANCE.getComponentType_Property();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeReferenceImpl <em>Component Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ComponentTypeReferenceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComponentTypeReference()
		 * @generated
		 */
		EClass COMPONENT_TYPE_REFERENCE = eINSTANCE.getComponentTypeReference();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.CompositeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__GROUP = eINSTANCE.getComposite_Group();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SERVICE = eINSTANCE.getComposite_Service();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__PROPERTY = eINSTANCE.getComposite_Property();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPONENT = eINSTANCE.getComposite_Component();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__REFERENCE = eINSTANCE.getComposite_Reference();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__WIRE = eINSTANCE.getComposite_Wire();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__NAME = eINSTANCE.getComposite_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__TARGET_NAMESPACE = eINSTANCE.getComposite_TargetNamespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContractImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__INTERFACE = eINSTANCE.getContract_Interface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__NAME = eINSTANCE.getContract_Name();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContributionTypeImpl <em>Contribution Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ContributionTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getContributionType()
		 * @generated
		 */
		EClass CONTRIBUTION_TYPE = eINSTANCE.getContributionType();

		/**
		 * The meta object literal for the '<em><b>Deployable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION_TYPE__DEPLOYABLE = eINSTANCE.getContributionType_Deployable();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl <em>Deployable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DeployableTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDeployableType()
		 * @generated
		 */
		EClass DEPLOYABLE_TYPE = eINSTANCE.getDeployableType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_TYPE__ANY = eINSTANCE.getDeployableType_Any();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_TYPE__COMPOSITE = eINSTANCE.getDeployableType_Composite();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYABLE_TYPE__DEPLOYMENT = eINSTANCE.getDeployableType_Deployment();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentationImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__MIXED = eINSTANCE.getDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__ANY = eINSTANCE.getDocumentation_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.DocumentRootImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPONENT_TYPE = eINSTANCE.getDocumentRoot_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPOSITE = eINSTANCE.getDocumentRoot_Composite();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXTENSIONS = eINSTANCE.getDocumentRoot_Extensions();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION = eINSTANCE.getDocumentRoot_Implementation();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_TYPE = eINSTANCE.getDocumentRoot_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERFACE = eINSTANCE.getDocumentRoot_Interface();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Wire Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WIRE_FORMAT = eINSTANCE.getDocumentRoot_WireFormat();

		/**
		 * The meta object literal for the '<em><b>Contribution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTRIBUTION = eINSTANCE.getDocumentRoot_Contribution();

		/**
		 * The meta object literal for the '<em><b>Implementation Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPLEMENTATION_COMPOSITE = eINSTANCE.getDocumentRoot_ImplementationComposite();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ExtensionsTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIONS_TYPE__ANY = eINSTANCE.getExtensionsType_Any();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationTypeImpl <em>Implementation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ImplementationTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getImplementationType()
		 * @generated
		 */
		EClass IMPLEMENTATION_TYPE = eINSTANCE.getImplementationType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION_TYPE__TYPE = eINSTANCE.getImplementationType_Type();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.InterfaceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Must Supply</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MUST_SUPPLY = eINSTANCE.getProperty_MustSupply();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyValueImpl <em>Property Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.PropertyValueImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getPropertyValue()
		 * @generated
		 */
		EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__FILE = eINSTANCE.getPropertyValue_File();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_VALUE__SOURCE = eINSTANCE.getPropertyValue_Source();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ReferenceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__MULTIPLICITY = eINSTANCE.getReference_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__PROMOTE = eINSTANCE.getReference_Promote();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAImplementationImpl <em>SCA Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAImplementationImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getSCAImplementation()
		 * @generated
		 */
		EClass SCA_IMPLEMENTATION = eINSTANCE.getSCAImplementation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_IMPLEMENTATION__ANY = eINSTANCE.getSCAImplementation_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_IMPLEMENTATION__NAME = eINSTANCE.getSCAImplementation_Name();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAPropertyBaseImpl <em>SCA Property Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.SCAPropertyBaseImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getSCAPropertyBase()
		 * @generated
		 */
		EClass SCA_PROPERTY_BASE = eINSTANCE.getSCAPropertyBase();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_PROPERTY_BASE__MIXED = eINSTANCE.getSCAPropertyBase_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_PROPERTY_BASE__ANY = eINSTANCE.getSCAPropertyBase_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_PROPERTY_BASE__NAME = eINSTANCE.getSCAPropertyBase_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_PROPERTY_BASE__TYPE = eINSTANCE.getSCAPropertyBase_Type();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCA_PROPERTY_BASE__ANY_ATTRIBUTE = eINSTANCE.getSCAPropertyBase_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Promote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PROMOTE = eINSTANCE.getService_Promote();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ServiceTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.ValueTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__MIXED = eINSTANCE.getValueType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__ANY = eINSTANCE.getValueType_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getValueType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__ANY = eINSTANCE.getWire_Any();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__SOURCE = eINSTANCE.getWire_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__TARGET = eINSTANCE.getWire_Target();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireFormatTypeImpl <em>Wire Format Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.WireFormatTypeImpl
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getWireFormatType()
		 * @generated
		 */
		EClass WIRE_FORMAT_TYPE = eINSTANCE.getWireFormatType();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

		/**
		 * The meta object literal for the '<em>List Of Any UR Is</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getListOfAnyURIs()
		 * @generated
		 */
		EDataType LIST_OF_ANY_UR_IS = eINSTANCE.getListOfAnyURIs();

		/**
		 * The meta object literal for the '<em>List Of QNames</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getListOfQNames()
		 * @generated
		 */
		EDataType LIST_OF_QNAMES = eINSTANCE.getListOfQNames();

		/**
		 * The meta object literal for the '<em>Multiplicity Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
		 * @see org.open.oasis.docs.ns.opencsa.sca.sca.impl.scaPackageImpl#getMultiplicityObject()
		 * @generated
		 */
		EDataType MULTIPLICITY_OBJECT = eINSTANCE.getMultiplicityObject();

	}

} //scaPackage
