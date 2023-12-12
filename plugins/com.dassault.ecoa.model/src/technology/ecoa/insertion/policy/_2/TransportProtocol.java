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
 * A representation of the model object '<em><b>Transport Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency <em>Max Latency</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMinBandwidth <em>Min Bandwidth</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.TransportProtocol#getQuality <em>Quality</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.insertion.policy._2.polPackage#getTransportProtocol()
 * @model extendedMetaData="name='TransportProtocol' kind='empty'"
 * @generated
 */
public interface TransportProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * The default value is <code>"high"</code>.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.IntegrityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Expected integrity of the underlying transport
	 *           protocol
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @see #isSetIntegrity()
	 * @see #unsetIntegrity()
	 * @see #setIntegrity(IntegrityType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getTransportProtocol_Integrity()
	 * @model default="high" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='integrity'"
	 * @generated
	 */
	IntegrityType getIntegrity();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.IntegrityType
	 * @see #isSetIntegrity()
	 * @see #unsetIntegrity()
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(IntegrityType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntegrity()
	 * @see #getIntegrity()
	 * @see #setIntegrity(IntegrityType)
	 * @generated
	 */
	void unsetIntegrity();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getIntegrity <em>Integrity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Integrity</em>' attribute is set.
	 * @see #unsetIntegrity()
	 * @see #getIntegrity()
	 * @see #setIntegrity(IntegrityType)
	 * @generated
	 */
	boolean isSetIntegrity();

	/**
	 * Returns the value of the '<em><b>Max Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Maximum latency for exchange of events between two
	 *           modules.
	 *           If the actual maximum latency is higher than the defined
	 *           value, the component may not run correctly.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Latency</em>' attribute.
	 * @see #isSetMaxLatency()
	 * @see #unsetMaxLatency()
	 * @see #setMaxLatency(double)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getTransportProtocol_MaxLatency()
	 * @model unsettable="true" dataType="technology.ecoa.insertion.policy._2.TimeDuration"
	 *        extendedMetaData="kind='attribute' name='maxLatency'"
	 * @generated
	 */
	double getMaxLatency();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Latency</em>' attribute.
	 * @see #isSetMaxLatency()
	 * @see #unsetMaxLatency()
	 * @see #getMaxLatency()
	 * @generated
	 */
	void setMaxLatency(double value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLatency()
	 * @see #getMaxLatency()
	 * @see #setMaxLatency(double)
	 * @generated
	 */
	void unsetMaxLatency();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMaxLatency <em>Max Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Latency</em>' attribute is set.
	 * @see #unsetMaxLatency()
	 * @see #getMaxLatency()
	 * @see #setMaxLatency(double)
	 * @generated
	 */
	boolean isSetMaxLatency();

	/**
	 * Returns the value of the '<em><b>Min Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Minimum bandwidth in kBytes/s for exchange of data
	 *           between two modules.
	 *           If the actual maximum bandwidth is lesser than the
	 *           defined
	 *           value, the component may not run correctly.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Bandwidth</em>' attribute.
	 * @see #setMinBandwidth(BigInteger)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getTransportProtocol_MinBandwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='minBandwidth'"
	 * @generated
	 */
	BigInteger getMinBandwidth();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getMinBandwidth <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Bandwidth</em>' attribute.
	 * @see #getMinBandwidth()
	 * @generated
	 */
	void setMinBandwidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * The default value is <code>"lossless"</code>.
	 * The literals are from the enumeration {@link technology.ecoa.insertion.policy._2.QualityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           Expected quality of the underlying transport protocol
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #setQuality(QualityType)
	 * @see technology.ecoa.insertion.policy._2.polPackage#getTransportProtocol_Quality()
	 * @model default="lossless" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='quality'"
	 * @generated
	 */
	QualityType getQuality();

	/**
	 * Sets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see technology.ecoa.insertion.policy._2.QualityType
	 * @see #isSetQuality()
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(QualityType value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuality()
	 * @see #getQuality()
	 * @see #setQuality(QualityType)
	 * @generated
	 */
	void unsetQuality();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.insertion.policy._2.TransportProtocol#getQuality <em>Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quality</em>' attribute is set.
	 * @see #unsetQuality()
	 * @see #getQuality()
	 * @see #setQuality(QualityType)
	 * @generated
	 */
	boolean isSetQuality();

} // TransportProtocol
