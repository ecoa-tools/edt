/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_._2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EEvent Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see technology.ecoa.interface_._2.interPackage#getEEventDirection()
 * @model extendedMetaData="name='E_EventDirection'"
 * @generated
 */
public enum EEventDirection implements Enumerator {
	/**
	 * The '<em><b>SENTBYPROVIDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTBYPROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	SENTBYPROVIDER(0, "SENTBYPROVIDER", "SENT_BY_PROVIDER"),

	/**
	 * The '<em><b>RECEIVEDBYPROVIDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVEDBYPROVIDER_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVEDBYPROVIDER(1, "RECEIVEDBYPROVIDER", "RECEIVED_BY_PROVIDER");

	/**
	 * The '<em><b>SENTBYPROVIDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENTBYPROVIDER
	 * @model literal="SENT_BY_PROVIDER"
	 * @generated
	 * @ordered
	 */
	public static final int SENTBYPROVIDER_VALUE = 0;

	/**
	 * The '<em><b>RECEIVEDBYPROVIDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVEDBYPROVIDER
	 * @model literal="RECEIVED_BY_PROVIDER"
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVEDBYPROVIDER_VALUE = 1;

	/**
	 * An array of all the '<em><b>EEvent Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EEventDirection[] VALUES_ARRAY =
		new EEventDirection[] {
			SENTBYPROVIDER,
			RECEIVEDBYPROVIDER,
		};

	/**
	 * A public read-only list of all the '<em><b>EEvent Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EEventDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EEvent Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEventDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEventDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEvent Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEventDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EEventDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EEvent Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EEventDirection get(int value) {
		switch (value) {
			case SENTBYPROVIDER_VALUE: return SENTBYPROVIDER;
			case RECEIVEDBYPROVIDER_VALUE: return RECEIVEDBYPROVIDER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEventDirection(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EEventDirection
