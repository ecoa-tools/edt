/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import java.util.List;
import org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.CompositeReference#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edtproject.CompositeReference#getPromote <em>Promote</em>}</li>
 *   <li>{@link edtproject.CompositeReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getCompositeReference()
 * @model
 * @generated
 */
public interface CompositeReference extends Contract {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @see edtproject.EDTProjectPackage#getCompositeReference_Multiplicity()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link edtproject.CompositeReference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.open.oasis.docs.ns.opencsa.sca.sca.Multiplicity
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Unsets the value of the '{@link edtproject.CompositeReference#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link edtproject.CompositeReference#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(Multiplicity)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * Returns the value of the '<em><b>Promote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promote</em>' attribute.
	 * @see #setPromote(List)
	 * @see edtproject.EDTProjectPackage#getCompositeReference_Promote()
	 * @model dataType="org.open.oasis.docs.ns.opencsa.sca.sca.ListOfAnyURIs" required="true" many="false"
	 * @generated
	 */
	List<String> getPromote();

	/**
	 * Sets the value of the '{@link edtproject.CompositeReference#getPromote <em>Promote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promote</em>' attribute.
	 * @see #getPromote()
	 * @generated
	 */
	void setPromote(List<String> value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtproject.EDTProjectPackage#getCompositeReference_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtproject.CompositeReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CompositeReference
