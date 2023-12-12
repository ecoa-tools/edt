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
 * A representation of the literals of the enumeration '<em><b>Scheduling Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Scheduling policies
 * <!-- end-model-doc -->
 * @see technology.ecoa.insertion.policy._2.polPackage#getSchedulingPolicy()
 * @model extendedMetaData="name='SchedulingPolicy'"
 * @generated
 */
public enum SchedulingPolicy implements Enumerator {
	/**
	 * The '<em><b>RTFIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTFIFO_VALUE
	 * @generated
	 * @ordered
	 */
	RTFIFO(0, "RTFIFO", "RT-FIFO"),

	/**
	 * The '<em><b>ROUNDROBIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUNDROBIN(1, "ROUNDROBIN", "ROUND-ROBIN"),

	/**
	 * The '<em><b>ARINC653</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARINC653_VALUE
	 * @generated
	 * @ordered
	 */
	ARINC653(2, "ARINC653", "ARINC-653");

	/**
	 * The '<em><b>RTFIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTFIFO
	 * @model literal="RT-FIFO"
	 * @generated
	 * @ordered
	 */
	public static final int RTFIFO_VALUE = 0;

	/**
	 * The '<em><b>ROUNDROBIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDROBIN
	 * @model literal="ROUND-ROBIN"
	 * @generated
	 * @ordered
	 */
	public static final int ROUNDROBIN_VALUE = 1;

	/**
	 * The '<em><b>ARINC653</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARINC653
	 * @model literal="ARINC-653"
	 * @generated
	 * @ordered
	 */
	public static final int ARINC653_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scheduling Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedulingPolicy[] VALUES_ARRAY =
		new SchedulingPolicy[] {
			RTFIFO,
			ROUNDROBIN,
			ARINC653,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduling Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchedulingPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulingPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulingPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedulingPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedulingPolicy get(int value) {
		switch (value) {
			case RTFIFO_VALUE: return RTFIFO;
			case ROUNDROBIN_VALUE: return ROUNDROBIN;
			case ARINC653_VALUE: return ARINC653;
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
	private SchedulingPolicy(int value, String name, String literal) {
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
	
} //SchedulingPolicy
