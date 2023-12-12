/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link Activatable Fifo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.DataLinkActivatableFifo#getWriter <em>Writer</em>}</li>
 *   <li>{@link edtimplementation.DataLinkActivatableFifo#getReader <em>Reader</em>}</li>
 *   <li>{@link edtimplementation.DataLinkActivatableFifo#getReaderFifoSize <em>Reader Fifo Size</em>}</li>
 *   <li>{@link edtimplementation.DataLinkActivatableFifo#isReaderActivating <em>Reader Activating</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getDataLinkActivatableFifo()
 * @model
 * @generated
 */
public interface DataLinkActivatableFifo extends DataLink {
	/**
	 * Returns the value of the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' reference.
	 * @see #setWriter(DataLinkWriter)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkActivatableFifo_Writer()
	 * @model required="true"
	 * @generated
	 */
	DataLinkWriter getWriter();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkActivatableFifo#getWriter <em>Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' reference.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(DataLinkWriter value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' reference.
	 * @see #setReader(DataReaderInstance)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkActivatableFifo_Reader()
	 * @model required="true"
	 * @generated
	 */
	DataReaderInstance getReader();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkActivatableFifo#getReader <em>Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' reference.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(DataReaderInstance value);

	/**
	 * Returns the value of the '<em><b>Reader Fifo Size</b></em>' attribute.
	 * The default value is <code>"8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Fifo Size</em>' attribute.
	 * @see #isSetReaderFifoSize()
	 * @see #unsetReaderFifoSize()
	 * @see #setReaderFifoSize(BigInteger)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkActivatableFifo_ReaderFifoSize()
	 * @model default="8" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 * @generated
	 */
	BigInteger getReaderFifoSize();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkActivatableFifo#getReaderFifoSize <em>Reader Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Fifo Size</em>' attribute.
	 * @see #isSetReaderFifoSize()
	 * @see #unsetReaderFifoSize()
	 * @see #getReaderFifoSize()
	 * @generated
	 */
	void setReaderFifoSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link edtimplementation.DataLinkActivatableFifo#getReaderFifoSize <em>Reader Fifo Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReaderFifoSize()
	 * @see #getReaderFifoSize()
	 * @see #setReaderFifoSize(BigInteger)
	 * @generated
	 */
	void unsetReaderFifoSize();

	/**
	 * Returns whether the value of the '{@link edtimplementation.DataLinkActivatableFifo#getReaderFifoSize <em>Reader Fifo Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reader Fifo Size</em>' attribute is set.
	 * @see #unsetReaderFifoSize()
	 * @see #getReaderFifoSize()
	 * @see #setReaderFifoSize(BigInteger)
	 * @generated
	 */
	boolean isSetReaderFifoSize();

	/**
	 * Returns the value of the '<em><b>Reader Activating</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Activating</em>' attribute.
	 * @see #isSetReaderActivating()
	 * @see #unsetReaderActivating()
	 * @see #setReaderActivating(boolean)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkActivatableFifo_ReaderActivating()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReaderActivating();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkActivatableFifo#isReaderActivating <em>Reader Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Activating</em>' attribute.
	 * @see #isSetReaderActivating()
	 * @see #unsetReaderActivating()
	 * @see #isReaderActivating()
	 * @generated
	 */
	void setReaderActivating(boolean value);

	/**
	 * Unsets the value of the '{@link edtimplementation.DataLinkActivatableFifo#isReaderActivating <em>Reader Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReaderActivating()
	 * @see #isReaderActivating()
	 * @see #setReaderActivating(boolean)
	 * @generated
	 */
	void unsetReaderActivating();

	/**
	 * Returns whether the value of the '{@link edtimplementation.DataLinkActivatableFifo#isReaderActivating <em>Reader Activating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reader Activating</em>' attribute is set.
	 * @see #unsetReaderActivating()
	 * @see #isReaderActivating()
	 * @see #setReaderActivating(boolean)
	 * @generated
	 */
	boolean isSetReaderActivating();

} // DataLinkActivatableFifo
