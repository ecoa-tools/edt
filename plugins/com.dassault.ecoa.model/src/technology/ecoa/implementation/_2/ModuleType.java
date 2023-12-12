/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a single-threaded ECOA module,
 *         implemented as software, contributing to the implementation of
 *         an ECOA component.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#getProperties <em>Properties</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#getOperations <em>Operations</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#isHasUserContext <em>Has User Context</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}</li>
 *   <li>{@link technology.ecoa.implementation._2.ModuleType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getModuleType()
 * @model extendedMetaData="name='ModuleType' kind='elementOnly'"
 * @generated
 */
public interface ModuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of module properties. The value of each
	 *             module property is set at design time.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType getProperties();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType value);

	/**
	 * Returns the value of the '<em><b>Pinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of pinfo used by the module
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pinfo</em>' containment reference.
	 * @see #setPinfo(PinfoType1)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_Pinfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	PinfoType1 getPinfo();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#getPinfo <em>Pinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinfo</em>' containment reference.
	 * @see #getPinfo()
	 * @generated
	 */
	void setPinfo(PinfoType1 value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(OperationsType)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_Operations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operations' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationsType getOperations();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationsType value);

	/**
	 * Returns the value of the '<em><b>Activating Fault Notifs</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the reception of fault notifications
	 *           cause the activation of the receiver Fault Handler (only if
	 *           the Fault Handler is implemented as an ECOA component) ?
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activating Fault Notifs</em>' attribute.
	 * @see #isSetActivatingFaultNotifs()
	 * @see #unsetActivatingFaultNotifs()
	 * @see #setActivatingFaultNotifs(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_ActivatingFaultNotifs()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='activatingFaultNotifs'"
	 * @generated
	 */
	boolean isActivatingFaultNotifs();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activating Fault Notifs</em>' attribute.
	 * @see #isSetActivatingFaultNotifs()
	 * @see #unsetActivatingFaultNotifs()
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 */
	void setActivatingFaultNotifs(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivatingFaultNotifs()
	 * @see #isActivatingFaultNotifs()
	 * @see #setActivatingFaultNotifs(boolean)
	 * @generated
	 */
	void unsetActivatingFaultNotifs();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activating Fault Notifs</em>' attribute is set.
	 * @see #unsetActivatingFaultNotifs()
	 * @see #isActivatingFaultNotifs()
	 * @see #setActivatingFaultNotifs(boolean)
	 * @generated
	 */
	boolean isSetActivatingFaultNotifs();

	/**
	 * Returns the value of the '<em><b>Has User Context</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To indicate if the module relies on a user
	 *           context
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has User Context</em>' attribute.
	 * @see #isSetHasUserContext()
	 * @see #unsetHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_HasUserContext()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='hasUserContext'"
	 * @generated
	 */
	boolean isHasUserContext();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasUserContext <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has User Context</em>' attribute.
	 * @see #isSetHasUserContext()
	 * @see #unsetHasUserContext()
	 * @see #isHasUserContext()
	 * @generated
	 */
	void setHasUserContext(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasUserContext <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasUserContext()
	 * @see #isHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @generated
	 */
	void unsetHasUserContext();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasUserContext <em>Has User Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has User Context</em>' attribute is set.
	 * @see #unsetHasUserContext()
	 * @see #isHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @generated
	 */
	boolean isSetHasUserContext();

	/**
	 * Returns the value of the '<em><b>Has Warm Start Context</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To indicate if the module relies on a warm
	 *           start context
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Has Warm Start Context</em>' attribute.
	 * @see #isSetHasWarmStartContext()
	 * @see #unsetHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_HasWarmStartContext()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='hasWarmStartContext'"
	 * @generated
	 */
	boolean isHasWarmStartContext();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Warm Start Context</em>' attribute.
	 * @see #isSetHasWarmStartContext()
	 * @see #unsetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @generated
	 */
	void setHasWarmStartContext(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @generated
	 */
	void unsetHasWarmStartContext();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Warm Start Context</em>' attribute is set.
	 * @see #unsetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @generated
	 */
	boolean isSetHasWarmStartContext();

	/**
	 * Returns the value of the '<em><b>Is Fault Handler</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To indicate if the module is a Fault
	 *           Handler
	 *           or not and to generate fault handling API.
	 *           To enable the
	 *           generation, the platform has to support
	 *           this kind of Fault
	 *           Handler deployment. See Platform
	 *           Procurement Requirements.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Fault Handler</em>' attribute.
	 * @see #isSetIsFaultHandler()
	 * @see #unsetIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_IsFaultHandler()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isFaultHandler'"
	 * @generated
	 */
	boolean isIsFaultHandler();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fault Handler</em>' attribute.
	 * @see #isSetIsFaultHandler()
	 * @see #unsetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @generated
	 */
	void setIsFaultHandler(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @generated
	 */
	void unsetIsFaultHandler();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Fault Handler</em>' attribute is set.
	 * @see #unsetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @generated
	 */
	boolean isSetIsFaultHandler();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.implementation._2.impPackage#getModuleType_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.ModuleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ModuleType
