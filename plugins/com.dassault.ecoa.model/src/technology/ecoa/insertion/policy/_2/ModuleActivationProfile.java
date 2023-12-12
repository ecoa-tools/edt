/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Activation Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getPeriodic <em>Periodic</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getReactive <em>Reactive</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType <em>Activation Type</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth <em>Queue Depth</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile()
 * @model extendedMetaData="name='ModuleActivationProfile' kind='elementOnly'"
 * @generated
 */
public interface ModuleActivationProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To describe a periodic activation model
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Periodic</em>' containment reference.
	 * @see #setPeriodic(PeriodicActivationProfile)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_Periodic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodic' namespace='##targetNamespace'"
	 * @generated
	 */
	PeriodicActivationProfile getPeriodic();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getPeriodic <em>Periodic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic</em>' containment reference.
	 * @see #getPeriodic()
	 * @generated
	 */
	void setPeriodic(PeriodicActivationProfile value);

	/**
	 * Returns the value of the '<em><b>Reactive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To describe an event-driven activation model
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reactive</em>' containment reference.
	 * @see #setReactive(AperiodicActivationProfile)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_Reactive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reactive' namespace='##targetNamespace'"
	 * @generated
	 */
	AperiodicActivationProfile getReactive();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getReactive <em>Reactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactive</em>' containment reference.
	 * @see #getReactive()
	 * @generated
	 */
	void setReactive(AperiodicActivationProfile value);

	/**
	 * Returns the value of the '<em><b>Activation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.ActivationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Module activation type (event-driven, time-driven,
	 *           other)
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation Type</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @see #isSetActivationType()
	 * @see #unsetActivationType()
	 * @see #setActivationType(ActivationTypeType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_ActivationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='activationType'"
	 * @generated
	 */
	ActivationTypeType getActivationType();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Type</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.ActivationTypeType
	 * @see #isSetActivationType()
	 * @see #unsetActivationType()
	 * @see #getActivationType()
	 * @generated
	 */
	void setActivationType(ActivationTypeType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType <em>Activation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivationType()
	 * @see #getActivationType()
	 * @see #setActivationType(ActivationTypeType)
	 * @generated
	 */
	void unsetActivationType();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getActivationType <em>Activation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activation Type</em>' attribute is set.
	 * @see #unsetActivationType()
	 * @see #getActivationType()
	 * @see #setActivationType(ActivationTypeType)
	 * @generated
	 */
	boolean isSetActivationType();

	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Link towards the module temporal behaviour
	 *           xxx.behaviour.xml
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behaviour</em>' attribute.
	 * @see #setBehaviour(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_Behaviour()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='behaviour'"
	 * @generated
	 */
	String getBehaviour();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getBehaviour <em>Behaviour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' attribute.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(String value);

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Reference to a module instance name
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_InstanceName()
	 * @model dataType="technology.ecoa.insertion.policy._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='instanceName'"
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

	/**
	 * Returns the value of the '<em><b>Max Nb Of Processed Ops Per Activation</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Max number of processed operations per
	 *           activation
	 *           including the
	 *           activating one.
	 *           This value has no
	 *           impact of the code
	 *           generation.
	 *           It is only to store intermediate
	 *           analysis result done by the
	 *           component supplier.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Nb Of Processed Ops Per Activation</em>' attribute.
	 * @see #isSetMaxNbOfProcessedOpsPerActivation()
	 * @see #unsetMaxNbOfProcessedOpsPerActivation()
	 * @see #setMaxNbOfProcessedOpsPerActivation(BigInteger)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_MaxNbOfProcessedOpsPerActivation()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maxNbOfProcessedOpsPerActivation'"
	 * @generated
	 */
	BigInteger getMaxNbOfProcessedOpsPerActivation();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Nb Of Processed Ops Per Activation</em>' attribute.
	 * @see #isSetMaxNbOfProcessedOpsPerActivation()
	 * @see #unsetMaxNbOfProcessedOpsPerActivation()
	 * @see #getMaxNbOfProcessedOpsPerActivation()
	 * @generated
	 */
	void setMaxNbOfProcessedOpsPerActivation(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxNbOfProcessedOpsPerActivation()
	 * @see #getMaxNbOfProcessedOpsPerActivation()
	 * @see #setMaxNbOfProcessedOpsPerActivation(BigInteger)
	 * @generated
	 */
	void unsetMaxNbOfProcessedOpsPerActivation();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getMaxNbOfProcessedOpsPerActivation <em>Max Nb Of Processed Ops Per Activation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Nb Of Processed Ops Per Activation</em>' attribute is set.
	 * @see #unsetMaxNbOfProcessedOpsPerActivation()
	 * @see #getMaxNbOfProcessedOpsPerActivation()
	 * @see #setMaxNbOfProcessedOpsPerActivation(BigInteger)
	 * @generated
	 */
	boolean isSetMaxNbOfProcessedOpsPerActivation();

	/**
	 * Returns the value of the '<em><b>Queue Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Depth of the incoming operations queue.
	 *           This value has
	 *           no impact of the code generation.
	 *           It is only to store intermediate
	 *           analysis result done by the
	 *           component supplier.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Depth</em>' attribute.
	 * @see #isSetQueueDepth()
	 * @see #unsetQueueDepth()
	 * @see #setQueueDepth(BigInteger)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getModuleActivationProfile_QueueDepth()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='queueDepth'"
	 * @generated
	 */
	BigInteger getQueueDepth();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth <em>Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Depth</em>' attribute.
	 * @see #isSetQueueDepth()
	 * @see #unsetQueueDepth()
	 * @see #getQueueDepth()
	 * @generated
	 */
	void setQueueDepth(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth <em>Queue Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueDepth()
	 * @see #getQueueDepth()
	 * @see #setQueueDepth(BigInteger)
	 * @generated
	 */
	void unsetQueueDepth();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.ModuleActivationProfile#getQueueDepth <em>Queue Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Depth</em>' attribute is set.
	 * @see #unsetQueueDepth()
	 * @see #getQueueDepth()
	 * @see #setQueueDepth(BigInteger)
	 * @generated
	 */
	boolean isSetQueueDepth();

} // ModuleActivationProfile
