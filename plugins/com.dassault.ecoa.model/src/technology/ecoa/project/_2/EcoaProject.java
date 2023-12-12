/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.project._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecoa Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Describes a whole ECOA project
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getServiceDefinitions <em>Service Definitions</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getComponentDefinitions <em>Component Definitions</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getTypes <em>Types</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getInitialAssembly <em>Initial Assembly</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getComponentImplementations <em>Component Implementations</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getLogicalSystem <em>Logical System</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getCrossPlatformsView <em>Cross Platforms View</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getDeploymentSchema <em>Deployment Schema</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getOutputDirectory <em>Output Directory</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getImplementationAssembly <em>Implementation Assembly</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getEUIDs <em>EUI Ds</em>}</li>
 *   <li>{@link technology.ecoa.project._2.EcoaProject#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.project._2.projPackage#getEcoaProject()
 * @model extendedMetaData="name='ECOAProject' kind='elementOnly'"
 * @generated
 */
public interface EcoaProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Service Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.project._2.Files}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Definitions</em>' containment reference list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_ServiceDefinitions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serviceDefinitions' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Files> getServiceDefinitions();

	/**
	 * Returns the value of the '<em><b>Component Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.project._2.Files}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definitions</em>' containment reference list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_ComponentDefinitions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentDefinitions' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Files> getComponentDefinitions();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.project._2.Files}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_Types()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='types' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Files> getTypes();

	/**
	 * Returns the value of the '<em><b>Initial Assembly</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Assembly</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_InitialAssembly()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='initialAssembly' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getInitialAssembly();

	/**
	 * Returns the value of the '<em><b>Component Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.project._2.Files}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Implementations</em>' containment reference list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_ComponentImplementations()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='componentImplementations' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Files> getComponentImplementations();

	/**
	 * Returns the value of the '<em><b>Logical System</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical System</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_LogicalSystem()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicalSystem' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getLogicalSystem();

	/**
	 * Returns the value of the '<em><b>Cross Platforms View</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Platforms View</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_CrossPlatformsView()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='crossPlatformsView' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getCrossPlatformsView();

	/**
	 * Returns the value of the '<em><b>Deployment Schema</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Schema</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_DeploymentSchema()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='deploymentSchema' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getDeploymentSchema();

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Directory</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_OutputDirectory()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outputDirectory' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getOutputDirectory();

	/**
	 * Returns the value of the '<em><b>Implementation Assembly</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Assembly</em>' attribute list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_ImplementationAssembly()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='implementationAssembly' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getImplementationAssembly();

	/**
	 * Returns the value of the '<em><b>EUI Ds</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.project._2.ELIEUIDs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EUI Ds</em>' containment reference list.
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_EUIDs()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EUIDs' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ELIEUIDs> getEUIDs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.project._2.projPackage#getEcoaProject_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.project._2.EcoaProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EcoaProject
