/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service
 * Link</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtproject.ServiceLink#getSource <em>Source</em>}</li>
 * <li>{@link edtproject.ServiceLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getServiceLink()
 * @model
 * @generated
 */
public interface ServiceLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComponentReference)
	 * @see edtproject.EDTProjectPackage#getServiceLink_Source()
	 * @model required="true"
	 * @generated
	 */
	ComponentReference getSource();

	/**
	 * Sets the value of the '{@link edtproject.ServiceLink#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComponentReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ComponentService)
	 * @see edtproject.EDTProjectPackage#getServiceLink_Target()
	 * @model required="true"
	 * @generated
	 */
	ComponentService getTarget();

	/**
	 * Sets the value of the '{@link edtproject.ServiceLink#getTarget
	 * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ComponentService value);

} // ServiceLink
