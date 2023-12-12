/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Module
 * Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.ModuleType#getProperties <em>Properties</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#isHasUserContext <em>Has User Context</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}</li>
 *   <li>{@link edtimplementation.ModuleType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getModuleType()
 * @model
 * @generated
 */
public interface ModuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ModuleTypeProperty}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModuleTypeProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Pinfo</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ModuleTypePinfo}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pinfo</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_Pinfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleTypePinfo> getPinfo();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link edtimplementation.ModuleOperation}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModuleOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Activating Fault Notifs</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Activating Fault Notifs</em>' attribute.
	 * @see #isSetActivatingFaultNotifs()
	 * @see #unsetActivatingFaultNotifs()
	 * @see #setActivatingFaultNotifs(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_ActivatingFaultNotifs()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isActivatingFaultNotifs();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activating Fault Notifs</em>' attribute.
	 * @see #isSetActivatingFaultNotifs()
	 * @see #unsetActivatingFaultNotifs()
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 */
	void setActivatingFaultNotifs(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetActivatingFaultNotifs()
	 * @see #isActivatingFaultNotifs()
	 * @see #setActivatingFaultNotifs(boolean)
	 * @generated
	 */
	void unsetActivatingFaultNotifs();

	/**
	 * Returns whether the value of the '{@link edtimplementation.ModuleType#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}' attribute is set.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Has User Context</em>' attribute.
	 * @see #isSetHasUserContext()
	 * @see #unsetHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_HasUserContext()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isHasUserContext();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleType#isHasUserContext <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Has User Context</em>' attribute.
	 * @see #isSetHasUserContext()
	 * @see #unsetHasUserContext()
	 * @see #isHasUserContext()
	 * @generated
	 */
	void setHasUserContext(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ModuleType#isHasUserContext <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSetHasUserContext()
	 * @see #isHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @generated
	 */
	void unsetHasUserContext();

	/**
	 * Returns whether the value of the
	 * '{@link edtimplementation.ModuleType#isHasUserContext <em>Has User
	 * Context</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return whether the value of the '<em>Has User Context</em>' attribute is
	 *         set.
	 * @see #unsetHasUserContext()
	 * @see #isHasUserContext()
	 * @see #setHasUserContext(boolean)
	 * @generated
	 */
	boolean isSetHasUserContext();

	/**
	 * Returns the value of the '<em><b>Has Warm Start Context</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Has Warm Start Context</em>' attribute.
	 * @see #isSetHasWarmStartContext()
	 * @see #unsetHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_HasWarmStartContext()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isHasWarmStartContext();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Warm Start Context</em>' attribute.
	 * @see #isSetHasWarmStartContext()
	 * @see #unsetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @generated
	 */
	void setHasWarmStartContext(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ModuleType#isHasWarmStartContext <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @generated
	 */
	void unsetHasWarmStartContext();

	/**
	 * Returns whether the value of the
	 * '{@link edtimplementation.ModuleType#isHasWarmStartContext <em>Has Warm Start
	 * Context</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return whether the value of the '<em>Has Warm Start Context</em>' attribute
	 *         is set.
	 * @see #unsetHasWarmStartContext()
	 * @see #isHasWarmStartContext()
	 * @see #setHasWarmStartContext(boolean)
	 * @generated
	 */
	boolean isSetHasWarmStartContext();

	/**
	 * Returns the value of the '<em><b>Is Fault Handler</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the value of the '<em>Is Fault Handler</em>' attribute.
	 * @see #isSetIsFaultHandler()
	 * @see #unsetIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_IsFaultHandler()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsFaultHandler();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Is Fault Handler</em>' attribute.
	 * @see #isSetIsFaultHandler()
	 * @see #unsetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @generated
	 */
	void setIsFaultHandler(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.ModuleType#isIsFaultHandler <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isSetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @generated
	 */
	void unsetIsFaultHandler();

	/**
	 * Returns whether the value of the
	 * '{@link edtimplementation.ModuleType#isIsFaultHandler <em>Is Fault
	 * Handler</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return whether the value of the '<em>Is Fault Handler</em>' attribute is
	 *         set.
	 * @see #unsetIsFaultHandler()
	 * @see #isIsFaultHandler()
	 * @see #setIsFaultHandler(boolean)
	 * @generated
	 */
	boolean isSetIsFaultHandler();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtimplementation.EdtimplementationPackage#getModuleType_Name()
	 * @model dataType="technology.ecoa.implementation._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtimplementation.ModuleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @param edtPropertyTypes
	 * @param propertyValueName
	 * @return
	 */
	public edtimplementation.ModuleTypeProperty findPropertyTypeByName(String propertyValueName);

	/**
	 * 
	 * @param privatePinfos
	 * @param privatePinfoValueName
	 * @return
	 */
	public edtimplementation.PrivatePinfo findPrivatePinfoByName(String privatePinfoValueName);

	/**
	 * 
	 * @param publicPinfos
	 * @param publicPinfoValueName
	 * @return
	 */
	public edtimplementation.PublicPinfo findPublicPinfoByName(String publicPinfoValueName);

} // ModuleType
