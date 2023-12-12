/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package temp;

import org.eclipse.emf.ecore.EObject;

import technology.ecoa.cross.platforms.view._2.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Platform View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link temp.CrossPlatformView#getECOACrossPlatformView <em>ECOA Cross Platform View</em>}</li>
 *   <li>{@link temp.CrossPlatformView#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see temp.TempPackage#getCrossPlatformView()
 * @model
 * @generated
 */
public interface CrossPlatformView extends EObject {
	/**
	 * Returns the value of the '<em><b>ECOA Cross Platform View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECOA Cross Platform View</em>' containment reference.
	 * @see #setECOACrossPlatformView(View)
	 * @see temp.TempPackage#getCrossPlatformView_ECOACrossPlatformView()
	 * @model containment="true"
	 * @generated
	 */
	View getECOACrossPlatformView();

	/**
	 * Sets the value of the '{@link temp.CrossPlatformView#getECOACrossPlatformView <em>ECOA Cross Platform View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECOA Cross Platform View</em>' containment reference.
	 * @see #getECOACrossPlatformView()
	 * @generated
	 */
	void setECOACrossPlatformView(View value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see temp.TempPackage#getCrossPlatformView_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link temp.CrossPlatformView#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CrossPlatformView
