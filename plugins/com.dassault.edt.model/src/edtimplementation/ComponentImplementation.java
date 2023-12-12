/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edtbin.BinDesc;
import edtproject.ComponentDefinition;
import edtproject.Steps;
import edtqos.ServiceInstanceQos;
import edttype.Library;
import temp.InsertionPolicies;
import temp.ModuleBehaviour;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Component Implementation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ComponentImplementation#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getAssociatedServiceQos <em>Associated Service Qos</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getServices <em>Services</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getReferences <em>References</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getModuleTypes <em>Module Types</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getModuleImplementations <em>Module Implementations</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getInstances <em>Instances</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getComponentDefinitionReferences <em>Component Definition References</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getComponentDefinitionServices <em>Component Definition Services</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getOperationLinks <em>Operation Links</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getExternalSenders <em>External Senders</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getModuleBehaviours <em>Module Behaviours</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getBinDesc <em>Bin Desc</em>}</li>
 *   <li>{@link edtimplementation.ComponentImplementation#getInsertionPolicyList <em>Insertion Policy List</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation()
 * @model
 * @generated
 */
public interface ComponentImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Used Libraries</b></em>' reference list.
	 * The list contents are of type {@link edttype.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Libraries</em>' reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_UsedLibraries()
	 * @model
	 * @generated
	 */
	EList<Library> getUsedLibraries();

	/**
	 * Returns the value of the '<em><b>Associated Service Qos</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link edtqos.ServiceInstanceQos}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the value of the '<em>Associated Service Qos</em>' containment
	 *         reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_AssociatedServiceQos()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<ServiceInstanceQos> getAssociatedServiceQos();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ComponentImplementationService}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentImplementationService> getServices();

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link edtimplementation.ComponentImplementationReference}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentImplementationReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Component Definition</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition</em>' reference.
	 * @see #setComponentDefinition(ComponentDefinition)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ComponentDefinition()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponentDefinition();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' reference.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Module Types</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ModuleType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Module Types</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ModuleTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleType> getModuleTypes();

	/**
	 * Returns the value of the '<em><b>Module Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ModuleImplementation}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Module Implementations</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ModuleImplementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleImplementation> getModuleImplementations();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference
	 * list. The list contents are of type {@link edtimplementation.Instance}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Component Definition References</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edtimplementation.ReferenceOfLinkedComponentDefinition}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Definition References</em>'
	 *         containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ComponentDefinitionReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceOfLinkedComponentDefinition> getComponentDefinitionReferences();

	/**
	 * Returns the value of the '<em><b>Component Definition Services</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edtimplementation.ServiceOfLinkedComponentDefinition}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Definition Services</em>' containment
	 *         reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ComponentDefinitionServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceOfLinkedComponentDefinition> getComponentDefinitionServices();

	/**
	 * Returns the value of the '<em><b>Operation Links</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.OperationLink}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Operation Links</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_OperationLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationLink> getOperationLinks();

	/**
	 * Returns the value of the '<em><b>External Senders</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ExternalSenderOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Senders</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ExternalSenders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalSenderOperation> getExternalSenders();

	/**
	 * Returns the value of the '<em><b>Module Behaviours</b></em>' containment reference list.
	 * The list contents are of type {@link temp.ModuleBehaviour}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Module Behaviours</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_ModuleBehaviours()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<ModuleBehaviour> getModuleBehaviours();

	/**
	 * Returns the value of the '<em><b>Bin Desc</b></em>' containment reference
	 * list. The list contents are of type {@link edtbin.BinDesc}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bin Desc</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_BinDesc()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinDesc> getBinDesc();

	/**
	 * Returns the value of the '<em><b>Insertion Policy List</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Insertion Policy List</em>' containment reference.
	 * @see #setInsertionPolicyList(InsertionPolicies)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_InsertionPolicyList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InsertionPolicies getInsertionPolicyList();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementation#getInsertionPolicyList <em>Insertion Policy List</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertion Policy List</em>' containment reference.
	 * @see #getInsertionPolicyList()
	 * @generated
	 */
	void setInsertionPolicyList(InsertionPolicies value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getComponentImplementation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ComponentImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @param moduleImplementationName
	 * @return
	 */
	public edtimplementation.ModuleImplementation findModuleImplementationByName(String moduleImplementationName);

	/**
	 * 
	 * @param moduleTypeName
	 * @return
	 */
	public edtimplementation.ModuleType findModuleTypeByName(String moduleTypeName);

	/**
	 * 
	 * @param moduleInstanceName
	 * @return
	 */
	public Instance findInstanceByName(String moduleInstanceName);

	/**
	 * find operation by name in list
	 * 
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInModuleInstances(String instanceName,
			String operationName);

	/**
	 * Find operation by name in list
	 * 
	 * @param instanceName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInTriggerInstances(String instanceName);

	/**
	 * Find operation by name in list
	 * 
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInDynamicTriggerInstances(String instanceName,
			String operationName);

	/**
	 * Find operationInstance by name in List
	 * 
	 * @param edtDefRefs
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInReferences(String instanceName,
			String operationName);

	/**
	 * Find operationInstance by name in List
	 * 
	 * @param edtDefRefs
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInServices(String instanceName,
			String operationName);

	/**
	 * Find operationInstance by name in List
	 * 
	 * @param edtDefRefs
	 * @param instanceName
	 * @param operationName
	 * @return
	 */
	public edtimplementation.OperationInstance findOperationInstanceInExternal(String operationName);

	/**
	 * 
	 * @param eObject
	 * @return
	 */
	public static ComponentImplementation findComponentImplementationAncestor(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof ComponentImplementation ci) {
			return ci;
		} else if (eObject instanceof Steps) {
			return null;
		} else if (eObject.eContainer() != null) {
			return findComponentImplementationAncestor(eObject.eContainer());
		} else {
			return null;
		}
	}
} // ComponentImplementation
