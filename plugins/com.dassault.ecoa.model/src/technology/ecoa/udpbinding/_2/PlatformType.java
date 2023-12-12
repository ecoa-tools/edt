/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.udpbinding._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.udpbinding._2.PlatformType#getMaxChannels <em>Max Channels</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.PlatformType#getName <em>Name</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.PlatformType#getPlatformId <em>Platform Id</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingMulticastAddress <em>Receiving Multicast Address</em>}</li>
 *   <li>{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingPort <em>Receiving Port</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType()
 * @model extendedMetaData="name='platform_._type' kind='empty'"
 * @generated
 */
public interface PlatformType extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Channels</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Channels</em>' attribute.
	 * @see #isSetMaxChannels()
	 * @see #unsetMaxChannels()
	 * @see #setMaxChannels(BigInteger)
	 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType_MaxChannels()
	 * @model default="256" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='maxChannels'"
	 * @generated
	 */
	BigInteger getMaxChannels();

	/**
	 * Sets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getMaxChannels <em>Max Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Channels</em>' attribute.
	 * @see #isSetMaxChannels()
	 * @see #unsetMaxChannels()
	 * @see #getMaxChannels()
	 * @generated
	 */
	void setMaxChannels(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getMaxChannels <em>Max Channels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxChannels()
	 * @see #getMaxChannels()
	 * @see #setMaxChannels(BigInteger)
	 * @generated
	 */
	void unsetMaxChannels();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getMaxChannels <em>Max Channels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Channels</em>' attribute is set.
	 * @see #unsetMaxChannels()
	 * @see #getMaxChannels()
	 * @see #setMaxChannels(BigInteger)
	 * @generated
	 */
	boolean isSetMaxChannels();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Platform Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Id</em>' attribute.
	 * @see #isSetPlatformId()
	 * @see #unsetPlatformId()
	 * @see #setPlatformId(long)
	 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType_PlatformId()
	 * @model unsettable="true" dataType="technology.ecoa.udpbinding._2.PlatformID" required="true"
	 *        extendedMetaData="kind='attribute' name='platformId'"
	 * @generated
	 */
	long getPlatformId();

	/**
	 * Sets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getPlatformId <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Id</em>' attribute.
	 * @see #isSetPlatformId()
	 * @see #unsetPlatformId()
	 * @see #getPlatformId()
	 * @generated
	 */
	void setPlatformId(long value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getPlatformId <em>Platform Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlatformId()
	 * @see #getPlatformId()
	 * @see #setPlatformId(long)
	 * @generated
	 */
	void unsetPlatformId();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getPlatformId <em>Platform Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Platform Id</em>' attribute is set.
	 * @see #unsetPlatformId()
	 * @see #getPlatformId()
	 * @see #setPlatformId(long)
	 * @generated
	 */
	boolean isSetPlatformId();

	/**
	 * Returns the value of the '<em><b>Receiving Multicast Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Multicast Address</em>' attribute.
	 * @see #setReceivingMulticastAddress(String)
	 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType_ReceivingMulticastAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='receivingMulticastAddress'"
	 * @generated
	 */
	String getReceivingMulticastAddress();

	/**
	 * Sets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingMulticastAddress <em>Receiving Multicast Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Multicast Address</em>' attribute.
	 * @see #getReceivingMulticastAddress()
	 * @generated
	 */
	void setReceivingMulticastAddress(String value);

	/**
	 * Returns the value of the '<em><b>Receiving Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Port</em>' attribute.
	 * @see #setReceivingPort(BigInteger)
	 * @see technology.ecoa.udpbinding._2.udpPackage#getPlatformType_ReceivingPort()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='receivingPort'"
	 * @generated
	 */
	BigInteger getReceivingPort();

	/**
	 * Sets the value of the '{@link technology.ecoa.udpbinding._2.PlatformType#getReceivingPort <em>Receiving Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving Port</em>' attribute.
	 * @see #getReceivingPort()
	 * @generated
	 */
	void setReceivingPort(BigInteger value);

} // PlatformType
