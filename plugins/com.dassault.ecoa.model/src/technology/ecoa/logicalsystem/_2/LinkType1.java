/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.LinkType1#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LinkType1#getLatency <em>Latency</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LinkType1#getFrom <em>From</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LinkType1#getId <em>Id</em>}</li>
 *   <li>{@link technology.ecoa.logicalsystem._2.LinkType1#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1()
 * @model extendedMetaData="name='link_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface LinkType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(ThroughputType1)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1_Throughput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='throughput'"
	 * @generated
	 */
	ThroughputType1 getThroughput();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LinkType1#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(ThroughputType1 value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(LatencyType1)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1_Latency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='latency'"
	 * @generated
	 */
	LatencyType1 getLatency();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LinkType1#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(LatencyType1 value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='from'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LinkType1#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1_Id()
	 * @model dataType="technology.ecoa.logicalsystem._2.NameId"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LinkType1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getLinkType1_To()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='to'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.LinkType1#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

} // LinkType1
