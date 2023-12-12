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
 * Computing Node Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtlogical.LogicalComputingNodeLink#getId <em>Id</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNodeLink#getThroughputMegaBytesPerSecond
 * <em>Throughput Mega Bytes Per Second</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNodeLink#getLatencyMicroSeconds
 * <em>Latency Micro Seconds</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNodeLink#getFrom <em>From</em>}</li>
 * <li>{@link edtlogical.LogicalComputingNodeLink#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink()
 * @model
 * @generated
 */
public interface LogicalComputingNodeLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNodeLink#getId
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
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink_ThroughputMegaBytesPerSecond()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getThroughputMegaBytesPerSecond();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingNodeLink#getThroughputMegaBytesPerSecond
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
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink_LatencyMicroSeconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 * @generated
	 */
	BigInteger getLatencyMicroSeconds();

	/**
	 * Sets the value of the
	 * '{@link edtlogical.LogicalComputingNodeLink#getLatencyMicroSeconds
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
	 * @see #setFrom(LogicalComputingNode)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink_From()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingNode getFrom();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNodeLink#getFrom
	 * <em>From</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(LogicalComputingNode value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(LogicalComputingNode)
	 * @see edtlogical.EdtlogicalPackage#getLogicalComputingNodeLink_To()
	 * @model required="true"
	 * @generated
	 */
	LogicalComputingNode getTo();

	/**
	 * Sets the value of the '{@link edtlogical.LogicalComputingNodeLink#getTo
	 * <em>To</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(LogicalComputingNode value);

	/**
	 * 
	 * @return true if no missing elements
	 */
	boolean isComplete();

} // LogicalComputingNodeLink
