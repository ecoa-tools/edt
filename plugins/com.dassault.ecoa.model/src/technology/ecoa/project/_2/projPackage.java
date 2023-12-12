/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2;

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
 * @see technology.ecoa.project._2.projFactory
 * @model kind="package"
 * @generated
 */
public interface projPackage extends EPackage {
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
	String eNS_URI = "http://www.ecoa.technology/project-2.0";

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
	projPackage eINSTANCE = technology.ecoa.project._2.impl.projPackageImpl.init();

	/**
	 * The meta object id for the '{@link technology.ecoa.project._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.DocumentRootImpl
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>ECOA Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ECOA_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USE = 4;

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
	 * The meta object id for the '{@link technology.ecoa.project._2.impl.EcoaProjectImpl <em>Ecoa Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.EcoaProjectImpl
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getEcoaProject()
	 * @generated
	 */
	int ECOA_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Service Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__SERVICE_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Component Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__COMPONENT_DEFINITIONS = 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__TYPES = 3;

	/**
	 * The feature id for the '<em><b>Initial Assembly</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__INITIAL_ASSEMBLY = 4;

	/**
	 * The feature id for the '<em><b>Component Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Logical System</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__LOGICAL_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Cross Platforms View</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__CROSS_PLATFORMS_VIEW = 7;

	/**
	 * The feature id for the '<em><b>Deployment Schema</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__DEPLOYMENT_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Output Directory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__OUTPUT_DIRECTORY = 9;

	/**
	 * The feature id for the '<em><b>Implementation Assembly</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY = 10;

	/**
	 * The feature id for the '<em><b>EUI Ds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__EUI_DS = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT__NAME = 12;

	/**
	 * The number of structural features of the '<em>Ecoa Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Ecoa Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOA_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.project._2.impl.ELIEUIDsImpl <em>ELIEUI Ds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.ELIEUIDsImpl
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getELIEUIDs()
	 * @generated
	 */
	int ELIEUI_DS = 2;

	/**
	 * The feature id for the '<em><b>EUID</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIEUI_DS__EUID = 0;

	/**
	 * The number of structural features of the '<em>ELIEUI Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIEUI_DS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ELIEUI Ds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIEUI_DS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.project._2.impl.FilesImpl <em>Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.FilesImpl
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getFiles()
	 * @generated
	 */
	int FILES = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES__FILE = 0;

	/**
	 * The number of structural features of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link technology.ecoa.project._2.impl.UseTypeImpl <em>Use Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.UseTypeImpl
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getUseType()
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
	 * The meta object id for the '{@link technology.ecoa.project._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.ProgrammingLanguage
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 5;

	/**
	 * The meta object id for the '<em>Hex Or Dec Value</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getHexOrDecValue()
	 * @generated
	 */
	int HEX_OR_DEC_VALUE = 6;

	/**
	 * The meta object id for the '<em>Library Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getLibraryName()
	 * @generated
	 */
	int LIBRARY_NAME = 7;

	/**
	 * The meta object id for the '<em>Name Id</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getNameId()
	 * @generated
	 */
	int NAME_ID = 8;

	/**
	 * The meta object id for the '<em>Programming Language Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.ProgrammingLanguage
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getProgrammingLanguageObject()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE_OBJECT = 9;

	/**
	 * The meta object id for the '<em>Steps</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getSteps()
	 * @generated
	 */
	int STEPS = 10;

	/**
	 * The meta object id for the '<em>Steps Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getStepsObject()
	 * @generated
	 */
	int STEPS_OBJECT = 11;

	/**
	 * The meta object id for the '<em>Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getTimeDuration()
	 * @generated
	 */
	int TIME_DURATION = 12;

	/**
	 * The meta object id for the '<em>Time Duration Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getTimeDurationObject()
	 * @generated
	 */
	int TIME_DURATION_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Type Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 14;

	/**
	 * The meta object id for the '<em>Type QName</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see technology.ecoa.project._2.impl.projPackageImpl#getTypeQName()
	 * @generated
	 */
	int TYPE_QNAME = 15;


	/**
	 * Returns the meta object for class '{@link technology.ecoa.project._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.project._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link technology.ecoa.project._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.project._2.DocumentRoot#getECOAProject <em>ECOA Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ECOA Project</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot#getECOAProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ECOAProject();

	/**
	 * Returns the meta object for the containment reference '{@link technology.ecoa.project._2.DocumentRoot#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see technology.ecoa.project._2.DocumentRoot#getUse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Use();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.project._2.EcoaProject <em>Ecoa Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecoa Project</em>'.
	 * @see technology.ecoa.project._2.EcoaProject
	 * @generated
	 */
	EClass getEcoaProject();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getGroup()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.project._2.EcoaProject#getServiceDefinitions <em>Service Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Definitions</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getServiceDefinitions()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EReference getEcoaProject_ServiceDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.project._2.EcoaProject#getComponentDefinitions <em>Component Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Definitions</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getComponentDefinitions()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EReference getEcoaProject_ComponentDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.project._2.EcoaProject#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getTypes()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EReference getEcoaProject_Types();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getInitialAssembly <em>Initial Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Initial Assembly</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getInitialAssembly()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_InitialAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.project._2.EcoaProject#getComponentImplementations <em>Component Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Implementations</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getComponentImplementations()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EReference getEcoaProject_ComponentImplementations();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getLogicalSystem <em>Logical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Logical System</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getLogicalSystem()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_LogicalSystem();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getCrossPlatformsView <em>Cross Platforms View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cross Platforms View</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getCrossPlatformsView()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_CrossPlatformsView();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getDeploymentSchema <em>Deployment Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Deployment Schema</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getDeploymentSchema()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_DeploymentSchema();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getOutputDirectory <em>Output Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Directory</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getOutputDirectory()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_OutputDirectory();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.EcoaProject#getImplementationAssembly <em>Implementation Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Implementation Assembly</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getImplementationAssembly()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_ImplementationAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link technology.ecoa.project._2.EcoaProject#getEUIDs <em>EUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EUI Ds</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getEUIDs()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EReference getEcoaProject_EUIDs();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.project._2.EcoaProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see technology.ecoa.project._2.EcoaProject#getName()
	 * @see #getEcoaProject()
	 * @generated
	 */
	EAttribute getEcoaProject_Name();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.project._2.ELIEUIDs <em>ELIEUI Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ELIEUI Ds</em>'.
	 * @see technology.ecoa.project._2.ELIEUIDs
	 * @generated
	 */
	EClass getELIEUIDs();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.ELIEUIDs#getEUID <em>EUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EUID</em>'.
	 * @see technology.ecoa.project._2.ELIEUIDs#getEUID()
	 * @see #getELIEUIDs()
	 * @generated
	 */
	EAttribute getELIEUIDs_EUID();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.project._2.Files <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Files</em>'.
	 * @see technology.ecoa.project._2.Files
	 * @generated
	 */
	EClass getFiles();

	/**
	 * Returns the meta object for the attribute list '{@link technology.ecoa.project._2.Files#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>File</em>'.
	 * @see technology.ecoa.project._2.Files#getFile()
	 * @see #getFiles()
	 * @generated
	 */
	EAttribute getFiles_File();

	/**
	 * Returns the meta object for class '{@link technology.ecoa.project._2.UseType <em>Use Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Type</em>'.
	 * @see technology.ecoa.project._2.UseType
	 * @generated
	 */
	EClass getUseType();

	/**
	 * Returns the meta object for the attribute '{@link technology.ecoa.project._2.UseType#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see technology.ecoa.project._2.UseType#getLibrary()
	 * @see #getUseType()
	 * @generated
	 */
	EAttribute getUseType_Library();

	/**
	 * Returns the meta object for enum '{@link technology.ecoa.project._2.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see technology.ecoa.project._2.ProgrammingLanguage
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
	 * Returns the meta object for data type '{@link technology.ecoa.project._2.ProgrammingLanguage <em>Programming Language Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Programming Language Object</em>'.
	 * @see technology.ecoa.project._2.ProgrammingLanguage
	 * @model instanceClass="technology.ecoa.project._2.ProgrammingLanguage"
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
	projFactory getprojFactory();

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
		 * The meta object literal for the '{@link technology.ecoa.project._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.DocumentRootImpl
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>ECOA Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ECOA_PROJECT = eINSTANCE.getDocumentRoot_ECOAProject();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USE = eINSTANCE.getDocumentRoot_Use();

		/**
		 * The meta object literal for the '{@link technology.ecoa.project._2.impl.EcoaProjectImpl <em>Ecoa Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.EcoaProjectImpl
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getEcoaProject()
		 * @generated
		 */
		EClass ECOA_PROJECT = eINSTANCE.getEcoaProject();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__GROUP = eINSTANCE.getEcoaProject_Group();

		/**
		 * The meta object literal for the '<em><b>Service Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOA_PROJECT__SERVICE_DEFINITIONS = eINSTANCE.getEcoaProject_ServiceDefinitions();

		/**
		 * The meta object literal for the '<em><b>Component Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOA_PROJECT__COMPONENT_DEFINITIONS = eINSTANCE.getEcoaProject_ComponentDefinitions();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOA_PROJECT__TYPES = eINSTANCE.getEcoaProject_Types();

		/**
		 * The meta object literal for the '<em><b>Initial Assembly</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__INITIAL_ASSEMBLY = eINSTANCE.getEcoaProject_InitialAssembly();

		/**
		 * The meta object literal for the '<em><b>Component Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOA_PROJECT__COMPONENT_IMPLEMENTATIONS = eINSTANCE.getEcoaProject_ComponentImplementations();

		/**
		 * The meta object literal for the '<em><b>Logical System</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__LOGICAL_SYSTEM = eINSTANCE.getEcoaProject_LogicalSystem();

		/**
		 * The meta object literal for the '<em><b>Cross Platforms View</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__CROSS_PLATFORMS_VIEW = eINSTANCE.getEcoaProject_CrossPlatformsView();

		/**
		 * The meta object literal for the '<em><b>Deployment Schema</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__DEPLOYMENT_SCHEMA = eINSTANCE.getEcoaProject_DeploymentSchema();

		/**
		 * The meta object literal for the '<em><b>Output Directory</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__OUTPUT_DIRECTORY = eINSTANCE.getEcoaProject_OutputDirectory();

		/**
		 * The meta object literal for the '<em><b>Implementation Assembly</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__IMPLEMENTATION_ASSEMBLY = eINSTANCE.getEcoaProject_ImplementationAssembly();

		/**
		 * The meta object literal for the '<em><b>EUI Ds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOA_PROJECT__EUI_DS = eINSTANCE.getEcoaProject_EUIDs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOA_PROJECT__NAME = eINSTANCE.getEcoaProject_Name();

		/**
		 * The meta object literal for the '{@link technology.ecoa.project._2.impl.ELIEUIDsImpl <em>ELIEUI Ds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.ELIEUIDsImpl
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getELIEUIDs()
		 * @generated
		 */
		EClass ELIEUI_DS = eINSTANCE.getELIEUIDs();

		/**
		 * The meta object literal for the '<em><b>EUID</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELIEUI_DS__EUID = eINSTANCE.getELIEUIDs_EUID();

		/**
		 * The meta object literal for the '{@link technology.ecoa.project._2.impl.FilesImpl <em>Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.FilesImpl
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getFiles()
		 * @generated
		 */
		EClass FILES = eINSTANCE.getFiles();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILES__FILE = eINSTANCE.getFiles_File();

		/**
		 * The meta object literal for the '{@link technology.ecoa.project._2.impl.UseTypeImpl <em>Use Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.UseTypeImpl
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getUseType()
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
		 * The meta object literal for the '{@link technology.ecoa.project._2.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.ProgrammingLanguage
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '<em>Hex Or Dec Value</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getHexOrDecValue()
		 * @generated
		 */
		EDataType HEX_OR_DEC_VALUE = eINSTANCE.getHexOrDecValue();

		/**
		 * The meta object literal for the '<em>Library Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getLibraryName()
		 * @generated
		 */
		EDataType LIBRARY_NAME = eINSTANCE.getLibraryName();

		/**
		 * The meta object literal for the '<em>Name Id</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getNameId()
		 * @generated
		 */
		EDataType NAME_ID = eINSTANCE.getNameId();

		/**
		 * The meta object literal for the '<em>Programming Language Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.ProgrammingLanguage
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getProgrammingLanguageObject()
		 * @generated
		 */
		EDataType PROGRAMMING_LANGUAGE_OBJECT = eINSTANCE.getProgrammingLanguageObject();

		/**
		 * The meta object literal for the '<em>Steps</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getSteps()
		 * @generated
		 */
		EDataType STEPS = eINSTANCE.getSteps();

		/**
		 * The meta object literal for the '<em>Steps Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getStepsObject()
		 * @generated
		 */
		EDataType STEPS_OBJECT = eINSTANCE.getStepsObject();

		/**
		 * The meta object literal for the '<em>Time Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getTimeDuration()
		 * @generated
		 */
		EDataType TIME_DURATION = eINSTANCE.getTimeDuration();

		/**
		 * The meta object literal for the '<em>Time Duration Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getTimeDurationObject()
		 * @generated
		 */
		EDataType TIME_DURATION_OBJECT = eINSTANCE.getTimeDurationObject();

		/**
		 * The meta object literal for the '<em>Type Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getTypeName()
		 * @generated
		 */
		EDataType TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '<em>Type QName</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see technology.ecoa.project._2.impl.projPackageImpl#getTypeQName()
		 * @generated
		 */
		EDataType TYPE_QNAME = eINSTANCE.getTypeQName();

	}

} //projPackage
