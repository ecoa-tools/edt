/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package edttype;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Predefined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.RecordPredefined#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getRecordPredefined()
 * @model
 * @generated
 */
public interface RecordPredefined extends PredefinedType {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link edttype.FieldPredefined}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see edttype.EDTTypePackage#getRecordPredefined_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FieldPredefined> getField();

} // RecordPredefined
