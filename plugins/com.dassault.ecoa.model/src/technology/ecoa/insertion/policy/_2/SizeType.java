/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see technology.ecoa.insertion.policy._2.polPackage#getSizeType()
 * @model extendedMetaData="name='size_._type'"
 * @generated
 */
public enum SizeType implements Enumerator {
	/**
	 * The '<em><b>16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16_VALUE
	 * @generated
	 * @ordered
	 */
	_16(0, "_16", "16"),

	/**
	 * The '<em><b>32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32_VALUE
	 * @generated
	 * @ordered
	 */
	_32(1, "_32", "32"),

	/**
	 * The '<em><b>64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_64_VALUE
	 * @generated
	 * @ordered
	 */
	_64(2, "_64", "64");

	/**
	 * The '<em><b>16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_16
	 * @model literal="16"
	 * @generated
	 * @ordered
	 */
	public static final int _16_VALUE = 0;

	/**
	 * The '<em><b>32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32
	 * @model literal="32"
	 * @generated
	 * @ordered
	 */
	public static final int _32_VALUE = 1;

	/**
	 * The '<em><b>64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_64
	 * @model literal="64"
	 * @generated
	 * @ordered
	 */
	public static final int _64_VALUE = 2;

	/**
	 * An array of all the '<em><b>Size Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeType[] VALUES_ARRAY =
		new SizeType[] {
			_16,
			_32,
			_64,
		};

	/**
	 * A public read-only list of all the '<em><b>Size Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeType get(int value) {
		switch (value) {
			case _16_VALUE: return _16;
			case _32_VALUE: return _32;
			case _64_VALUE: return _64;
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
	private SizeType(int value, String name, String literal) {
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
	
} //SizeType
