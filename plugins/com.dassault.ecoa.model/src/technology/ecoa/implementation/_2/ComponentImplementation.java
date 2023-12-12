/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         Describes all the information needed to
 *         integrate the software implementation of an ECOA
 *         component in an
 *         ECOA system.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getUse <em>Use</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getService <em>Service</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getReference <em>Reference</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleImplementation <em>Module Implementation</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getModuleInstance <em>Module Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getTriggerInstance <em>Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getDynamicTriggerInstance <em>Dynamic Trigger Instance</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getGroup <em>Group</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getEventLink <em>Event Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getRequestLink <em>Request Link</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation()
 * @model extendedMetaData="name='ComponentImplementation' kind='elementOnly'"
 * @generated
 */
public interface ComponentImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.UseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Declares the use of a library of data types. A
	 *         type T defined in a library L will be denoted "L:T".
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_Use()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='use' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UseType> getUse();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.ServiceQoS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceQoS> getService();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.ServiceQoS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ServiceQoS> getReference();

	/**
	 * Returns the value of the '<em><b>Module Type</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.ModuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Type</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_ModuleType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleType> getModuleType();

	/**
	 * Returns the value of the '<em><b>Module Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.ModuleImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Implementation</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_ModuleImplementation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleImplementation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleImplementation> getModuleImplementation();

	/**
	 * Returns the value of the '<em><b>Module Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.ModuleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Instance</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_ModuleInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moduleInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleInstance> getModuleInstance();

	/**
	 * Returns the value of the '<em><b>Trigger Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.TriggerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Instance</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_TriggerInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='triggerInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TriggerInstance> getTriggerInstance();

	/**
	 * Returns the value of the '<em><b>Dynamic Trigger Instance</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.DynamicTriggerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Trigger Instance</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_DynamicTriggerInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicTriggerInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DynamicTriggerInstance> getDynamicTriggerInstance();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:8'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Data Link</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.DataLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Link</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_DataLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dataLink' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<DataLink> getDataLink();

	/**
	 * Returns the value of the '<em><b>Event Link</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.EventLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Link</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_EventLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='eventLink' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<EventLink> getEventLink();

	/**
	 * Returns the value of the '<em><b>Request Link</b></em>' containment reference list.
	 * The list contents are of type {@link technology.ecoa.implementation._2.RequestLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Link</em>' containment reference list.
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_RequestLink()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='requestLink' namespace='##targetNamespace' group='#group:8'"
	 * @generated
	 */
	EList<RequestLink> getRequestLink();

	/**
	 * Returns the value of the '<em><b>Component Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Definition</em>' attribute.
	 * @see #setComponentDefinition(String)
	 * @see technology.ecoa.implementation._2.impPackage#getComponentImplementation_ComponentDefinition()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='componentDefinition'"
	 * @generated
	 */
	String getComponentDefinition();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ComponentImplementation#getComponentDefinition <em>Component Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Definition</em>' attribute.
	 * @see #getComponentDefinition()
	 * @generated
	 */
	void setComponentDefinition(String value);

} // ComponentImplementation
