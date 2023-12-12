/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throughput Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.logicalsystem._2.ThroughputType1#getMegaBytesPerSecond <em>Mega Bytes Per Second</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.logicalsystem._2.logPackage#getThroughputType1()
 * @model extendedMetaData="name='throughput_._1_._type' kind='empty'"
 * @generated
 */
public interface ThroughputType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Mega Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mega Bytes Per Second</em>' attribute.
	 * @see #setMegaBytesPerSecond(BigInteger)
	 * @see technology.ecoa.logicalsystem._2.logPackage#getThroughputType1_MegaBytesPerSecond()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='megaBytesPerSecond'"
	 * @generated
	 */
	BigInteger getMegaBytesPerSecond();

	/**
	 * Sets the value of the '{@link technology.ecoa.logicalsystem._2.ThroughputType1#getMegaBytesPerSecond <em>Mega Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mega Bytes Per Second</em>' attribute.
	 * @see #getMegaBytesPerSecond()
	 * @generated
	 */
	void setMegaBytesPerSecond(BigInteger value);

} // ThroughputType1
