/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link To Service Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.DataLinkToServiceOperation#getWriter <em>Writer</em>}</li>
 *   <li>{@link edtimplementation.DataLinkToServiceOperation#getReader <em>Reader</em>}</li>
 * </ul>
 *
 * @see edtimplementation.EdtimplementationPackage#getDataLinkToServiceOperation()
 * @model
 * @generated
 */
public interface DataLinkToServiceOperation extends DataLink {
	/**
	 * Returns the value of the '<em><b>Writer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writer</em>' reference.
	 * @see #setWriter(DataWriterInstance)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkToServiceOperation_Writer()
	 * @model required="true"
	 * @generated
	 */
	DataWriterInstance getWriter();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkToServiceOperation#getWriter <em>Writer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writer</em>' reference.
	 * @see #getWriter()
	 * @generated
	 */
	void setWriter(DataWriterInstance value);

	/**
	 * Returns the value of the '<em><b>Reader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader</em>' reference.
	 * @see #setReader(VersionedDataServiceInstance)
	 * @see edtimplementation.EdtimplementationPackage#getDataLinkToServiceOperation_Reader()
	 * @model required="true"
	 * @generated
	 */
	VersionedDataServiceInstance getReader();

	/**
	 * Sets the value of the '{@link edtimplementation.DataLinkToServiceOperation#getReader <em>Reader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader</em>' reference.
	 * @see #getReader()
	 * @generated
	 */
	void setReader(VersionedDataServiceInstance value);

} // DataLinkToServiceOperation
