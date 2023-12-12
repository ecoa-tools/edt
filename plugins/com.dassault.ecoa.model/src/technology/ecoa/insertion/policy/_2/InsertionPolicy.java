/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insertion Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A consistent set of policies for which the
 *         component was
 *         validated, which means that its functional
 *         behaviour is correct and it
 *         fulfills its expected QoS
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTarget <em>Target</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getProcessorTarget <em>Processor Target</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRegisterSize <em>Register Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRealtimeCharacteristics <em>Realtime Characteristics</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTimeAccuracy <em>Time Accuracy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDeploymentConstraints <em>Deployment Constraints</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getECOAProfile <em>ECOA Profile</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getGenericCompilationOptions <em>Generic Compilation Options</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getModulesDependencies <em>Modules Dependencies</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getExtraConcerns <em>Extra Concerns</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultPINFO <em>Default PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultProperties <em>Default Properties</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy()
 * @model extendedMetaData="name='InsertionPolicy' kind='elementOnly'"
 * @generated
 */
public interface InsertionPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Targeted system on which the insertion policy applies to
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_Target()
	 * @model dataType="technology.ecoa.insertion.policy._2.Target"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Processor Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processor Target
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Target</em>' containment reference.
	 * @see #setProcessorTarget(EObject)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_ProcessorTarget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='processorTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getProcessorTarget();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getProcessorTarget <em>Processor Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Target</em>' containment reference.
	 * @see #getProcessorTarget()
	 * @generated
	 */
	void setProcessorTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Register Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Size of the processor register
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register Size</em>' containment reference.
	 * @see #setRegisterSize(RegisterSize)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_RegisterSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='registerSize' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterSize getRegisterSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRegisterSize <em>Register Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Size</em>' containment reference.
	 * @see #getRegisterSize()
	 * @generated
	 */
	void setRegisterSize(RegisterSize value);

	/**
	 * Returns the value of the '<em><b>Memory Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Information on how the component uses memory
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Usage</em>' containment reference.
	 * @see #setMemoryUsage(MemoryUsage)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_MemoryUsage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='memoryUsage' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryUsage getMemoryUsage();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getMemoryUsage <em>Memory Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Usage</em>' containment reference.
	 * @see #getMemoryUsage()
	 * @generated
	 */
	void setMemoryUsage(MemoryUsage value);

	/**
	 * Returns the value of the '<em><b>Realtime Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Information on scheduling, module activation
	 *             profiles, etc.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realtime Characteristics</em>' containment reference.
	 * @see #setRealtimeCharacteristics(RealtimeCharacteristics)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_RealtimeCharacteristics()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='realtimeCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	RealtimeCharacteristics getRealtimeCharacteristics();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getRealtimeCharacteristics <em>Realtime Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realtime Characteristics</em>' containment reference.
	 * @see #getRealtimeCharacteristics()
	 * @generated
	 */
	void setRealtimeCharacteristics(RealtimeCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Time Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Time Accuracy
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Accuracy</em>' containment reference.
	 * @see #setTimeAccuracy(TimeAccuracy)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_TimeAccuracy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeAccuracy' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAccuracy getTimeAccuracy();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTimeAccuracy <em>Time Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Accuracy</em>' containment reference.
	 * @see #getTimeAccuracy()
	 * @generated
	 */
	void setTimeAccuracy(TimeAccuracy value);

	/**
	 * Returns the value of the '<em><b>Transport Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Transport Protocol Requirements
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transport Protocol</em>' containment reference.
	 * @see #setTransportProtocol(TransportProtocol)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_TransportProtocol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transportProtocol' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportProtocol getTransportProtocol();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getTransportProtocol <em>Transport Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Protocol</em>' containment reference.
	 * @see #getTransportProtocol()
	 * @generated
	 */
	void setTransportProtocol(TransportProtocol value);

	/**
	 * Returns the value of the '<em><b>Deployment Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Deployment Constraints
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Constraints</em>' containment reference.
	 * @see #setDeploymentConstraints(DeploymentConstraints)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_DeploymentConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deploymentConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	DeploymentConstraints getDeploymentConstraints();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDeploymentConstraints <em>Deployment Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Constraints</em>' containment reference.
	 * @see #getDeploymentConstraints()
	 * @generated
	 */
	void setDeploymentConstraints(DeploymentConstraints value);

	/**
	 * Returns the value of the '<em><b>ECOA Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             ECOA Profile used for developing the component
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ECOA Profile</em>' containment reference.
	 * @see #setECOAProfile(ECOAProfile)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_ECOAProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ECOAProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	ECOAProfile getECOAProfile();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getECOAProfile <em>ECOA Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECOA Profile</em>' containment reference.
	 * @see #getECOAProfile()
	 * @generated
	 */
	void setECOAProfile(ECOAProfile value);

	/**
	 * Returns the value of the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Compiler used to generate the binaries
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compiler</em>' containment reference.
	 * @see #setCompiler(technology.ecoa.insertion.policy._2.Compiler)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_Compiler()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='compiler' namespace='##targetNamespace'"
	 * @generated
	 */
	technology.ecoa.insertion.policy._2.Compiler getCompiler();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getCompiler <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiler</em>' containment reference.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(technology.ecoa.insertion.policy._2.Compiler value);

	/**
	 * Returns the value of the '<em><b>Generic Compilation Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Compilation/Linkage options global to the component
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Compilation Options</em>' attribute.
	 * @see #setGenericCompilationOptions(String)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_GenericCompilationOptions()
	 * @model dataType="technology.ecoa.insertion.policy._2.GenericCompilationOptions"
	 *        extendedMetaData="kind='element' name='genericCompilationOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGenericCompilationOptions();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getGenericCompilationOptions <em>Generic Compilation Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Compilation Options</em>' attribute.
	 * @see #getGenericCompilationOptions()
	 * @generated
	 */
	void setGenericCompilationOptions(String value);

	/**
	 * Returns the value of the '<em><b>Modules Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Compilation/Linkage options specific to a module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules Dependencies</em>' containment reference.
	 * @see #setModulesDependencies(ModulesDependencies)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_ModulesDependencies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modulesDependencies' namespace='##targetNamespace'"
	 * @generated
	 */
	ModulesDependencies getModulesDependencies();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getModulesDependencies <em>Modules Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modules Dependencies</em>' containment reference.
	 * @see #getModulesDependencies()
	 * @generated
	 */
	void setModulesDependencies(ModulesDependencies value);

	/**
	 * Returns the value of the '<em><b>Extra Concerns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Any other concerns stored in a separate file
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Concerns</em>' containment reference.
	 * @see #setExtraConcerns(ExtraConcerns)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_ExtraConcerns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extraConcerns' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtraConcerns getExtraConcerns();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getExtraConcerns <em>Extra Concerns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Concerns</em>' containment reference.
	 * @see #getExtraConcerns()
	 * @generated
	 */
	void setExtraConcerns(ExtraConcerns value);

	/**
	 * Returns the value of the '<em><b>Default PINFO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             PINFO which were used to validate the component
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default PINFO</em>' containment reference.
	 * @see #setDefaultPINFO(DefaultPINFO)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_DefaultPINFO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultPINFO' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultPINFO getDefaultPINFO();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultPINFO <em>Default PINFO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default PINFO</em>' containment reference.
	 * @see #getDefaultPINFO()
	 * @generated
	 */
	void setDefaultPINFO(DefaultPINFO value);

	/**
	 * Returns the value of the '<em><b>Default Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             Default property values against which the component
	 *             has been validated
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Properties</em>' containment reference.
	 * @see #setDefaultProperties(DefaultProperties)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getInsertionPolicy_DefaultProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultProperties getDefaultProperties();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.InsertionPolicy#getDefaultProperties <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Properties</em>' containment reference.
	 * @see #getDefaultProperties()
	 * @generated
	 */
	void setDefaultProperties(DefaultProperties value);

} // InsertionPolicy
