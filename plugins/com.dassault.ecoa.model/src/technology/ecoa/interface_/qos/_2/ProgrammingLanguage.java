/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.interface_.qos._2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Programming Language</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Programming languages supported by ECOA
 *         bindings
 *       
 * <!-- end-model-doc -->
 * @see technology.ecoa.interface_.qos._2.qosPackage#getProgrammingLanguage()
 * @model extendedMetaData="name='ProgrammingLanguage'"
 * @generated
 */
public enum ProgrammingLanguage implements Enumerator {
	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(0, "C", "C"),

	/**
	 * The '<em><b>C1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1_VALUE
	 * @generated
	 * @ordered
	 */
	C1(1, "C1", "C++"),

	/**
	 * The '<em><b>Ada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADA_VALUE
	 * @generated
	 * @ordered
	 */
	ADA(2, "Ada", "Ada"),

	/**
	 * The '<em><b>Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA(3, "Java", "Java"),

	/**
	 * The '<em><b>HI Ada</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HI_ADA_VALUE
	 * @generated
	 * @ordered
	 */
	HI_ADA(4, "HIAda", "HI_Ada");

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 0;

	/**
	 * The '<em><b>C1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1
	 * @model literal="C++"
	 * @generated
	 * @ordered
	 */
	public static final int C1_VALUE = 1;

	/**
	 * The '<em><b>Ada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADA
	 * @model name="Ada"
	 * @generated
	 * @ordered
	 */
	public static final int ADA_VALUE = 2;

	/**
	 * The '<em><b>Java</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @model name="Java"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VALUE = 3;

	/**
	 * The '<em><b>HI Ada</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HI_ADA
	 * @model name="HIAda" literal="HI_Ada"
	 * @generated
	 * @ordered
	 */
	public static final int HI_ADA_VALUE = 4;

	/**
	 * An array of all the '<em><b>Programming Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgrammingLanguage[] VALUES_ARRAY =
		new ProgrammingLanguage[] {
			C,
			C1,
			ADA,
			JAVA,
			HI_ADA,
		};

	/**
	 * A public read-only list of all the '<em><b>Programming Language</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgrammingLanguage> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Programming Language</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammingLanguage get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammingLanguage result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programming Language</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammingLanguage getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammingLanguage result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Programming Language</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammingLanguage get(int value) {
		switch (value) {
			case C_VALUE: return C;
			case C1_VALUE: return C1;
			case ADA_VALUE: return ADA;
			case JAVA_VALUE: return JAVA;
			case HI_ADA_VALUE: return HI_ADA;
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
	private ProgrammingLanguage(int value, String name, String literal) {
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
	
} //ProgrammingLanguage
