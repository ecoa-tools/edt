/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.implementation._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Ref Activatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.implementation._2.OpRefActivatable#isActivating <em>Activating</em>}</li>
 * </ul>
 *
 * @see technology.ecoa.implementation._2.impPackage#getOpRefActivatable()
 * @model extendedMetaData="name='OpRefActivatable' kind='empty'"
 * @generated
 */
public interface OpRefActivatable extends OpRef {
	/**
	 * Returns the value of the '<em><b>Activating</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the reception of the event/data/rr
	 *               cause the activation of the receiver module ?
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activating</em>' attribute.
	 * @see #isSetActivating()
	 * @see #unsetActivating()
	 * @see #setActivating(boolean)
	 * @see technology.ecoa.implementation._2.impPackage#getOpRefActivatable_Activating()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='activating'"
	 * @generated
	 */
	boolean isActivating();

	/**
	 * Sets the value of the '{@link technology.ecoa.implementation._2.OpRefActivatable#isActivating <em>Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activating</em>' attribute.
	 * @see #isSetActivating()
	 * @see #unsetActivating()
	 * @see #isActivating()
	 * @generated
	 */
	void setActivating(boolean value);

	/**
	 * Unsets the value of the '{@link technology.ecoa.implementation._2.OpRefActivatable#isActivating <em>Activating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivating()
	 * @see #isActivating()
	 * @see #setActivating(boolean)
	 * @generated
	 */
	void unsetActivating();

	/**
	 * Returns whether the value of the '{@link technology.ecoa.implementation._2.OpRefActivatable#isActivating <em>Activating</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activating</em>' attribute is set.
	 * @see #unsetActivating()
	 * @see #isActivating()
	 * @see #setActivating(boolean)
	 * @generated
	 */
	boolean isSetActivating();

} // OpRefActivatable
