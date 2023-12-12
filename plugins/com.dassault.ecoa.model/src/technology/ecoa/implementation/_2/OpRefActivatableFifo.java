/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Ref Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize <em>Fifo Size</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOpRefActivatableFifo()
 * @model extendedMetaData="name='OpRefActivatableFifo' kind='empty'"
 * @generated
 */
public interface OpRefActivatableFifo extends OpRefActivatable {
	/**
	 * Returns the value of the '<em><b>Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Max number of incoming operations that
	 *               can be
	 *               stored in the receiver module's FIFO queue for that
	 *               particular operation link, before the activation
	 *               of the
	 *               corresponding entrypoint.
	 *               There is one fifoSize per
	 *               operation link on the receiver side.
	 *               If this max number is
	 *               exceeded, new incoming operations are trashed.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fifo Size</em>' attribute.
	 * @see #isSetFifoSize()
	 * @see #unsetFifoSize()
	 * @see #setFifoSize(BigInteger)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefActivatableFifo_FifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='fifoSize'"
	 * @generated
	 */
	BigInteger getFifoSize();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize <em>Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifo Size</em>' attribute.
	 * @see #isSetFifoSize()
	 * @see #unsetFifoSize()
	 * @see #getFifoSize()
	 * @generated
	 */
	void setFifoSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize <em>Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFifoSize()
	 * @see #getFifoSize()
	 * @see #setFifoSize(BigInteger)
	 * @generated
	 */
	void unsetFifoSize();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.OpRefActivatableFifo#getFifoSize <em>Fifo Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fifo Size</em>' attribute is set.
	 * @see #unsetFifoSize()
	 * @see #getFifoSize()
	 * @see #setFifoSize(BigInteger)
	 * @generated
	 */
	boolean isSetFifoSize();

} // OpRefActivatableFifo
