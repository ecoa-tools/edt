/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtlogical;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Logical
 * Computing Platform Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getId <em>Id</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getThroughputMegaBytesPerSecond
 * <em>Throughput Mega Bytes Per Second</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getLatencyMicroSeconds
 * <em>Latency Micro Seconds</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getFrom
 * <em>From</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getTo <em>To</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingParameters
 * <em>Transport Binding Parameters</em>}</li>
 * <li>{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingProtocol
 * <em>Transport Binding Protocol</em>}</li>
 * </ul>
 *
 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink()
 * @model
 * @generated
 */
public interface LogicalComputingPlatformLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingPlatformLink#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Throughput Mega Bytes Per Second</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Throughput Mega Bytes Per Second</em>'
	 *         attribute.
	 * @see #setThroughputMegaBytesPerSecond(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_ThroughputMegaBytesPerSecond()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getThroughputMegaBytesPerSecond();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingPlatformLink#getThroughputMegaBytesPerSecond
	 * <em>Throughput Mega Bytes Per Second</em>}' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Throughput Mega Bytes Per Second</em>'
	 *              attribute.
	 * @see #getThroughputMegaBytesPerSecond()
	 * @generated
	 */
	void setThroughputMegaBytesPerSecond(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Latency Micro Seconds</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Latency Micro Seconds</em>' attribute.
	 * @see #setLatencyMicroSeconds(BigInteger)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_LatencyMicroSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getLatencyMicroSeconds();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingPlatformLink#getLatencyMicroSeconds
	 * <em>Latency Micro Seconds</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Latency Micro Seconds</em>' attribute.
	 * @see #getLatencyMicroSeconds()
	 * @generated
	 */
	void setLatencyMicroSeconds(BigInteger value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(LogicalComputingPlatform)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_From()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatform getFrom();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingPlatformLink#getFrom
	 * <em>From</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(LogicalComputingPlatform value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(LogicalComputingPlatform)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_To()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingPlatform getTo();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingPlatformLink#getTo
	 * <em>To</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(LogicalComputingPlatform value);

	/**
	 * Returns the value of the '<em><b>Transport Binding Parameters</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transport Binding Parameters</em>' attribute.
	 * @see #setTransportBindingParameters(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_TransportBindingParameters()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 * @generated
	 */
	String getTransportBindingParameters();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingParameters
	 * <em>Transport Binding Parameters</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Transport Binding Parameters</em>'
	 *              attribute.
	 * @see #getTransportBindingParameters()
	 * @generated
	 */
	void setTransportBindingParameters(String value);

	/**
	 * Returns the value of the '<em><b>Transport Binding Protocol</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transport Binding Protocol</em>' attribute.
	 * @see #setTransportBindingProtocol(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingPlatformLink_TransportBindingProtocol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getTransportBindingProtocol();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingPlatformLink#getTransportBindingProtocol
	 * <em>Transport Binding Protocol</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Transport Binding Protocol</em>'
	 *              attribute.
	 * @see #getTransportBindingProtocol()
	 * @generated
	 */
	void setTransportBindingProtocol(String value);

	/**
	 * 
	 * @return true if missing no attributes
	 */
	boolean isComplete();

} // LogicalComputingPlatformLink
