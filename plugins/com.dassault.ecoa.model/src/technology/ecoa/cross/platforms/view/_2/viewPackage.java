/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.cross.platforms.view._2;

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
 * @see technology.ecoa.cross.platforms.view._2.viewFactory
 * @model kind="package"
 * @generated
 */
public interface viewPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecoa.technology/cross-platforms-view-2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	viewPackage eINSTANCE = technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.CompositeImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 0;

	/**
	 * The feature id for the '<em><b>Deployed On Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.DocumentRootImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

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
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl <em>EUI Ds Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getEUIDsBinding()
	 * @generated
	 */
	int EUI_DS_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Specific Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUI_DS_BINDING__SPECIFIC_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Bound To Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUI_DS_BINDING__BOUND_TO_LINK_ID = 1;

	/**
	 * The feature id for the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUI_DS_BINDING__EUI_DS = 2;

	/**
	 * The number of structural features of the '<em>EUI Ds Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUI_DS_BINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EUI Ds Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EUI_DS_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl <em>Specific Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getSpecificBindingType()
	 * @generated
	 */
	int SPECIFIC_BINDING_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Bound To Computing Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_BINDING_TYPE__EUI_DS = 1;

	/**
	 * The number of structural features of the '<em>Specific Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specific Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_BINDING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.UseTypeImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getUseType()
	 * @generated
	 */
	int USE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Use Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.ViewImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Wire Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__WIRE_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Euids Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__EUIDS_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ASSEMBLY = 4;

	/**
	 * The feature id for the '<em><b>Logical System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LOGICAL_SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 6;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getWireMapping()
	 * @generated
	 */
	int WIRE_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Mapped On Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__MAPPED_ON_LINK_ID = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wire Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.cross.platforms.view._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 7;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 8;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 9;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 10;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 11;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 12;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 14;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 15;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 16;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 17;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.Composite#getDeployedOnComputingPlatform <em>Deployed On Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed On Computing Platform</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.Composite#getDeployedOnComputingPlatform()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_DeployedOnComputingPlatform();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.Composite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.Composite#getName()
	 * @see #getComposite()
	 * @generated
	 */
	EAttribute getComposite_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.cross.platforms.view._2.DocumentRoot#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.DocumentRoot#getView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_View();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding <em>EUI Ds Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EUI Ds Binding</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.EUIDsBinding
	 * @generated
	 */
	EClass getEUIDsBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getSpecificBinding <em>Specific Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specific Binding</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.EUIDsBinding#getSpecificBinding()
	 * @see #getEUIDsBinding()
	 * @generated
	 */
	EReference getEUIDsBinding_SpecificBinding();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getBoundToLinkId <em>Bound To Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound To Link Id</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.EUIDsBinding#getBoundToLinkId()
	 * @see #getEUIDsBinding()
	 * @generated
	 */
	EAttribute getEUIDsBinding_BoundToLinkId();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.EUIDsBinding#getEUIDs <em>EUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EUI Ds</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.EUIDsBinding#getEUIDs()
	 * @see #getEUIDsBinding()
	 * @generated
	 */
	EAttribute getEUIDsBinding_EUIDs();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType <em>Specific Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Binding Type</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.SpecificBindingType
	 * @generated
	 */
	EClass getSpecificBindingType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getBoundToComputingPlatform <em>Bound To Computing Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound To Computing Platform</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.SpecificBindingType#getBoundToComputingPlatform()
	 * @see #getSpecificBindingType()
	 * @generated
	 */
	EAttribute getSpecificBindingType_BoundToComputingPlatform();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.SpecificBindingType#getEUIDs <em>EUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EUI Ds</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.SpecificBindingType#getEUIDs()
	 * @see #getSpecificBindingType()
	 * @generated
	 */
	EAttribute getSpecificBindingType_EUIDs();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.cross.platforms.view._2.View#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getGroup()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.cross.platforms.view._2.View#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getComposite()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Composite();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.cross.platforms.view._2.View#getWireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire Mapping</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getWireMapping()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_WireMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.cross.platforms.view._2.View#getEuidsBinding <em>Euids Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Euids Binding</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getEuidsBinding()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_EuidsBinding();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.View#getAssembly <em>Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assembly</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getAssembly()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Assembly();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.View#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical System</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getLogicalSystem()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_LogicalSystem();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.cross.platforms.view._2.WireMapping <em>Wire Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire Mapping</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.WireMapping
	 * @generated
	 */
	EClass getWireMapping();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.WireMapping#getMappedOnLinkId <em>Mapped On Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped On Link Id</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.WireMapping#getMappedOnLinkId()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_MappedOnLinkId();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.WireMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.WireMapping#getSource()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_Source();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.cross.platforms.view._2.WireMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.WireMapping#getTarget()
	 * @see #getWireMapping()
	 * @generated
	 */
	EAttribute getWireMapping_Target();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.cross.platforms.view._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Hex Or Dec Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *  This type shall be used as the base type for
     *         any XML schema attribute or element that contains a hex-encoded
     *         binary value or a decimal-coded binary value.
     *         This hex-encoded binary value contains the mandatory string 0x
     *         followed by a finite-length sequence of characters 0–9 and a–f.
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Hex Or Dec Value</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='HexOrDecValue' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='0x[0-9A-Fa-f]+|[1-9][0-9]*|0'"
	 * @generated
	 */
	EDataType getHexOrDecValue();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Library Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Library Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LibraryName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_\\.]*'"
	 * @generated
	 */
	EDataType getLibraryName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Name Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Name Id</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NameId' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getNameId();

	/**
	 * Returns the meta object for data type '{@link technology.ecoa.cross.platforms.view._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.cross.platforms.view._2.ProgrammingLanguage"
	 *        extendedMetaData="name='ProgrammingLanguage:Object' baseType='ProgrammingLanguage'"
	 * @generated
	 */
	EDataType getProgrammingLanguageObject();

	/**
	 * Returns the meta object for data type '<em>Steps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A number of logical steps
     *         This allows to size
     *         durations in an abstract way.
     *         See stepDuration in the logical
     *         system
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steps</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='Steps' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getSteps();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Steps Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Steps Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='Steps:Object' baseType='Steps'"
	 * @generated
	 */
	EDataType getStepsObject();

	/**
	 * Returns the meta object for data type '<em>Time Duration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit is in seconds
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Time Duration</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='TimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0'"
	 * @generated
	 */
	EDataType getTimeDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Time Duration Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='TimeDuration:Object' baseType='TimeDuration'"
	 * @generated
	 */
	EDataType getTimeDurationObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeName' baseType='NameId'"
	 * @generated
	 */
	EDataType getTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Type QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type QName</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TypeQName' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z][A-Za-z0-9_\\.]*:)?[A-Za-z][A-Za-z0-9_]*'"
	 * @generated
	 */
	EDataType getTypeQName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	viewFactory getviewFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.CompositeImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Deployed On Computing Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__DEPLOYED_ON_COMPUTING_PLATFORM = eINSTANCE.getComposite_DeployedOnComputingPlatform();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE__NAME = eINSTANCE.getComposite_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.DocumentRootImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VIEW = eINSTANCE.getDocumentRoot_View();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl <em>EUI Ds Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.EUIDsBindingImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getEUIDsBinding()
		 * @generated
		 */
		EClass EUI_DS_BINDING = eINSTANCE.getEUIDsBinding();

		/**
		 * The meta object literal for the '<em><b>Specific Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EUI_DS_BINDING__SPECIFIC_BINDING = eINSTANCE.getEUIDsBinding_SpecificBinding();

		/**
		 * The meta object literal for the '<em><b>Bound To Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUI_DS_BINDING__BOUND_TO_LINK_ID = eINSTANCE.getEUIDsBinding_BoundToLinkId();

		/**
		 * The meta object literal for the '<em><b>EUI Ds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EUI_DS_BINDING__EUI_DS = eINSTANCE.getEUIDsBinding_EUIDs();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl <em>Specific Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.SpecificBindingTypeImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getSpecificBindingType()
		 * @generated
		 */
		EClass SPECIFIC_BINDING_TYPE = eINSTANCE.getSpecificBindingType();

		/**
		 * The meta object literal for the '<em><b>Bound To Computing Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_BINDING_TYPE__BOUND_TO_COMPUTING_PLATFORM = eINSTANCE.getSpecificBindingType_BoundToComputingPlatform();

		/**
		 * The meta object literal for the '<em><b>EUI Ds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_BINDING_TYPE__EUI_DS = eINSTANCE.getSpecificBindingType_EUIDs();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.UseTypeImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getUseType()
		 * @generated
		 */
		EClass USE_TYPE = eINSTANCE.getUseType();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_TYPE__LIBRARY = eINSTANCE.getUseType_Library();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.ViewImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__GROUP = eINSTANCE.getView_Group();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__COMPOSITE = eINSTANCE.getView_Composite();

		/**
		 * The meta object literal for the '<em><b>Wire Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__WIRE_MAPPING = eINSTANCE.getView_WireMapping();

		/**
		 * The meta object literal for the '<em><b>Euids Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__EUIDS_BINDING = eINSTANCE.getView_EuidsBinding();

		/**
		 * The meta object literal for the '<em><b>Assembly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ASSEMBLY = eINSTANCE.getView_Assembly();

		/**
		 * The meta object literal for the '<em><b>Logical System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LOGICAL_SYSTEM = eINSTANCE.getView_LogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl <em>Wire Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.WireMappingImpl
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getWireMapping()
		 * @generated
		 */
		EClass WIRE_MAPPING = eINSTANCE.getWireMapping();

		/**
		 * The meta object literal for the '<em><b>Mapped On Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__MAPPED_ON_LINK_ID = eINSTANCE.getWireMapping_MappedOnLinkId();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__SOURCE = eINSTANCE.getWireMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE_MAPPING__TARGET = eINSTANCE.getWireMapping_Target();

		/**
		 * The meta object literal for the '{@link technology.ecoa.cross.platforms.view._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.ProgrammingLanguage
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.cross.platforms.view._2.impl.viewPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //viewPackage
