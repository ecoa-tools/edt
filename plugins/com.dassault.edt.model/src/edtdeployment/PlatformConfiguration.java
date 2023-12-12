/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtdeployment;

import edtlogical.LogicalComputingPlatform;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtdeployment.PlatformConfiguration#getComputingNodeConfigurations <em>Computing Node Configurations</em>}</li>
 *   <li>{@link edtdeployment.PlatformConfiguration#getPlatformMessages <em>Platform Messages</em>}</li>
 *   <li>{@link edtdeployment.PlatformConfiguration#getEUIDs <em>EUI Ds</em>}</li>
 *   <li>{@link edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}</li>
 *   <li>{@link edtdeployment.PlatformConfiguration#getComputingPlatform <em>Computing Platform</em>}</li>
 * </ul>
 *
 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration()
 * @model
 * @generated
 */
public interface PlatformConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Computing Node Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.ComputingNodeConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the computing node level
	 *             configuration
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Computing Node Configurations</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration_ComputingNodeConfigurations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='computingNodeConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComputingNodeConfiguration> getComputingNodeConfigurations();

	/**
	 * Returns the value of the '<em><b>Platform Messages</b></em>' containment reference list.
	 * The list contents are of type {@link edtdeployment.PlatformMessage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Define on which the platform
	 *             domain messages are mapped
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Platform Messages</em>' containment reference list.
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration_PlatformMessages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='platformMessages' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlatformMessage> getPlatformMessages();

	/**
	 * Returns the value of the '<em><b>EUI Ds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific EUIDS file associated to one
	 *           given peer of the link
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EUI Ds</em>' attribute.
	 * @see #setEUIDs(String)
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration_EUIDs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='EUIDs'"
	 * @generated
	 */
	String getEUIDs();

	/**
	 * Sets the value of the '{@link edtdeployment.PlatformConfiguration#getEUIDs <em>EUI Ds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EUI Ds</em>' attribute.
	 * @see #getEUIDs()
	 * @generated
	 */
	void setEUIDs(String value);

	/**
	 * Returns the value of the '<em><b>Fault Handler Notification Max Number</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the number of fault handler
	 *           notifications that a Module Container shall be able
	 *           to handle at any time. These notifications are
	 *           relevant depending on the Module “isFaultHandler”
	 *           attribute.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fault Handler Notification Max Number</em>' attribute.
	 * @see #isSetFaultHandlerNotificationMaxNumber()
	 * @see #unsetFaultHandlerNotificationMaxNumber()
	 * @see #setFaultHandlerNotificationMaxNumber(BigDecimal)
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration_FaultHandlerNotificationMaxNumber()
	 * @model default="8" unsettable="true" dataType="technology.ecoa.deployment._2.FifoSize"
	 *        extendedMetaData="kind='attribute' name='faultHandlerNotificationMaxNumber'"
	 * @generated
	 */
	BigDecimal getFaultHandlerNotificationMaxNumber();

	/**
	 * Sets the value of the '{@link edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault Handler Notification Max Number</em>' attribute.
	 * @see #isSetFaultHandlerNotificationMaxNumber()
	 * @see #unsetFaultHandlerNotificationMaxNumber()
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @generated
	 */
	void setFaultHandlerNotificationMaxNumber(BigDecimal value);

	/**
	 * Unsets the value of the '{@link edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFaultHandlerNotificationMaxNumber()
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @see #setFaultHandlerNotificationMaxNumber(BigDecimal)
	 * @generated
	 */
	void unsetFaultHandlerNotificationMaxNumber();

	/**
	 * Returns whether the value of the '{@link edtdeployment.PlatformConfiguration#getFaultHandlerNotificationMaxNumber <em>Fault Handler Notification Max Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fault Handler Notification Max Number</em>' attribute is set.
	 * @see #unsetFaultHandlerNotificationMaxNumber()
	 * @see #getFaultHandlerNotificationMaxNumber()
	 * @see #setFaultHandlerNotificationMaxNumber(BigDecimal)
	 * @generated
	 */
	boolean isSetFaultHandlerNotificationMaxNumber();

	/**
	 * Returns the value of the '<em><b>Computing Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing Platform</em>' reference.
	 * @see #setComputingPlatform(LogicalComputingPlatform)
	 * @see edtdeployment.EdtdeploymentPackage#getPlatformConfiguration_ComputingPlatform()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatform getComputingPlatform();

	/**
	 * Sets the value of the '{@link edtdeployment.PlatformConfiguration#getComputingPlatform <em>Computing Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing Platform</em>' reference.
	 * @see #getComputingPlatform()
	 * @generated
	 */
	void setComputingPlatform(LogicalComputingPlatform value);

} // PlatformConfiguration
