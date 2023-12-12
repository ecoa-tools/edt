/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.logicalsystem._2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see technology.ecoa.logicalsystem._2.logPackage#getNameType()
 * @model extendedMetaData="name='name_._type'"
 * @generated
 */
public enum NameType implements Enumerator {
	/**
	 * The '<em><b>Fastos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTOS_VALUE
	 * @generated
	 * @ordered
	 */
	FASTOS(0, "fastos", "fastos"),

	/**
	 * The '<em><b>Linux</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(1, "linux", "linux"),

	/**
	 * The '<em><b>Ima Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMA_INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	IMA_INTEGRITY(2, "imaIntegrity", "ima-integrity"),

	/**
	 * The '<em><b>Ims Vxworks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMS_VXWORKS_VALUE
	 * @generated
	 * @ordered
	 */
	IMS_VXWORKS(3, "imsVxworks", "ims-vxworks"),

	/**
	 * The '<em><b>Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY(4, "integrity", "integrity"),

	/**
	 * The '<em><b>Pikeos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIKEOS_VALUE
	 * @generated
	 * @ordered
	 */
	PIKEOS(5, "pikeos", "pikeos"),

	/**
	 * The '<em><b>Rtems</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTEMS_VALUE
	 * @generated
	 * @ordered
	 */
	RTEMS(6, "rtems", "rtems"),

	/**
	 * The '<em><b>Vxworks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS_VALUE
	 * @generated
	 * @ordered
	 */
	VXWORKS(7, "vxworks", "vxworks"),

	/**
	 * The '<em><b>Vxworks Arinc653</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS_ARINC653_VALUE
	 * @generated
	 * @ordered
	 */
	VXWORKS_ARINC653(8, "vxworksArinc653", "vxworks-arinc653"),

	/**
	 * The '<em><b>Vxworks Cert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS_CERT_VALUE
	 * @generated
	 * @ordered
	 */
	VXWORKS_CERT(9, "vxworksCert", "vxworks-cert"),

	/**
	 * The '<em><b>Windows</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(10, "windows", "windows"),

	/**
	 * The '<em><b>Zephyr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEPHYR_VALUE
	 * @generated
	 * @ordered
	 */
	ZEPHYR(11, "zephyr", "zephyr");

	/**
	 * The '<em><b>Fastos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FASTOS
	 * @model name="fastos"
	 * @generated
	 * @ordered
	 */
	public static final int FASTOS_VALUE = 0;

	/**
	 * The '<em><b>Linux</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="linux"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 1;

	/**
	 * The '<em><b>Ima Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMA_INTEGRITY
	 * @model name="imaIntegrity" literal="ima-integrity"
	 * @generated
	 * @ordered
	 */
	public static final int IMA_INTEGRITY_VALUE = 2;

	/**
	 * The '<em><b>Ims Vxworks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMS_VXWORKS
	 * @model name="imsVxworks" literal="ims-vxworks"
	 * @generated
	 * @ordered
	 */
	public static final int IMS_VXWORKS_VALUE = 3;

	/**
	 * The '<em><b>Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY
	 * @model name="integrity"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_VALUE = 4;

	/**
	 * The '<em><b>Pikeos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIKEOS
	 * @model name="pikeos"
	 * @generated
	 * @ordered
	 */
	public static final int PIKEOS_VALUE = 5;

	/**
	 * The '<em><b>Rtems</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTEMS
	 * @model name="rtems"
	 * @generated
	 * @ordered
	 */
	public static final int RTEMS_VALUE = 6;

	/**
	 * The '<em><b>Vxworks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS
	 * @model name="vxworks"
	 * @generated
	 * @ordered
	 */
	public static final int VXWORKS_VALUE = 7;

	/**
	 * The '<em><b>Vxworks Arinc653</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS_ARINC653
	 * @model name="vxworksArinc653" literal="vxworks-arinc653"
	 * @generated
	 * @ordered
	 */
	public static final int VXWORKS_ARINC653_VALUE = 8;

	/**
	 * The '<em><b>Vxworks Cert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VXWORKS_CERT
	 * @model name="vxworksCert" literal="vxworks-cert"
	 * @generated
	 * @ordered
	 */
	public static final int VXWORKS_CERT_VALUE = 9;

	/**
	 * The '<em><b>Windows</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model name="windows"
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 10;

	/**
	 * The '<em><b>Zephyr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEPHYR
	 * @model name="zephyr"
	 * @generated
	 * @ordered
	 */
	public static final int ZEPHYR_VALUE = 11;

	/**
	 * An array of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NameType[] VALUES_ARRAY =
		new NameType[] {
			FASTOS,
			LINUX,
			IMA_INTEGRITY,
			IMS_VXWORKS,
			INTEGRITY,
			PIKEOS,
			RTEMS,
			VXWORKS,
			VXWORKS_ARINC653,
			VXWORKS_CERT,
			WINDOWS,
			ZEPHYR,
		};

	/**
	 * A public read-only list of all the '<em><b>Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NameType get(int value) {
		switch (value) {
			case FASTOS_VALUE: return FASTOS;
			case LINUX_VALUE: return LINUX;
			case IMA_INTEGRITY_VALUE: return IMA_INTEGRITY;
			case IMS_VXWORKS_VALUE: return IMS_VXWORKS;
			case INTEGRITY_VALUE: return INTEGRITY;
			case PIKEOS_VALUE: return PIKEOS;
			case RTEMS_VALUE: return RTEMS;
			case VXWORKS_VALUE: return VXWORKS;
			case VXWORKS_ARINC653_VALUE: return VXWORKS_ARINC653;
			case VXWORKS_CERT_VALUE: return VXWORKS_CERT;
			case WINDOWS_VALUE: return WINDOWS;
			case ZEPHYR_VALUE: return ZEPHYR;
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
	private NameType(int value, String name, String literal) {
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
	
} //NameType
