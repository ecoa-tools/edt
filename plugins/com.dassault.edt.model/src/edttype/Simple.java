/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edttype;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Simple</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edttype.Simple#getMaxRange <em>Max Range</em>}</li>
 *   <li>{@link edttype.Simple#getMinRange <em>Min Range</em>}</li>
 *   <li>{@link edttype.Simple#getPrecision <em>Precision</em>}</li>
 *   <li>{@link edttype.Simple#getUnit <em>Unit</em>}</li>
 *   <li>{@link edttype.Simple#getType <em>Type</em>}</li>
 *   <li>{@link edttype.Simple#getMaxRangeType <em>Max Range Type</em>}</li>
 *   <li>{@link edttype.Simple#getMinRangeType <em>Min Range Type</em>}</li>
 *   <li>{@link edttype.Simple#getPrecisionType <em>Precision Type</em>}</li>
 * </ul>
 *
 * @see edttype.EDTTypePackage#getSimple()
 * @model
 * @generated
 */
public interface Simple extends EDTDataType {
	/**
	 * Returns the value of the '<em><b>Max Range</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Max Range</em>' attribute.
	 * @see #setMaxRange(Object)
	 * @see edttype.EDTTypePackage#getSimple_MaxRange()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 * @generated
	 */
	Object getMaxRange();

	/**
	 * Sets the value of the '{@link edttype.Simple#getMaxRange <em>Max Range</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Range</em>' attribute.
	 * @see #getMaxRange()
	 * @generated
	 */
	void setMaxRange(Object value);

	/**
	 * Returns the value of the '<em><b>Min Range</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Min Range</em>' attribute.
	 * @see #setMinRange(Object)
	 * @see edttype.EDTTypePackage#getSimple_MinRange()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 * @generated
	 */
	Object getMinRange();

	/**
	 * Sets the value of the '{@link edttype.Simple#getMinRange <em>Min Range</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Range</em>' attribute.
	 * @see #getMinRange()
	 * @generated
	 */
	void setMinRange(Object value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Object)
	 * @see edttype.EDTTypePackage#getSimple_Precision()
	 * @model dataType="technology.ecoa.types._2.ConstantReferenceOrValue"
	 * @generated
	 */
	Object getPrecision();

	/**
	 * Sets the value of the '{@link edttype.Simple#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Object value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see edttype.EDTTypePackage#getSimple_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link edttype.Simple#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDTDataType)
	 * @see edttype.EDTTypePackage#getSimple_Type()
	 * @model required="true"
	 * @generated
	 */
	EDTDataType getType();

	/**
	 * Returns the value of the '<em><b>BasicType</b></em>' derived reference. <!--
	 * begin-user-doc --> Search for the BasicType that the Simple is derived from
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>BasicType</em>' reference.
	 * @generated NOT
	 */
	BasicType getBasicType();

	/**
	 * Sets the value of the '{@link edttype.Simple#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDTDataType value);

	/**
	 * Returns the value of the '<em><b>Max Range Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Range Type</em>' reference.
	 * @see #setMaxRangeType(Constant)
	 * @see edttype.EDTTypePackage#getSimple_MaxRangeType()
	 * @model
	 * @generated
	 */
	Constant getMaxRangeType();

	/**
	 * Sets the value of the '{@link edttype.Simple#getMaxRangeType <em>Max Range Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Range Type</em>' reference.
	 * @see #getMaxRangeType()
	 * @generated
	 */
	void setMaxRangeType(Constant value);

	/**
	 * Returns the value of the '<em><b>Min Range Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Range Type</em>' reference.
	 * @see #setMinRangeType(Constant)
	 * @see edttype.EDTTypePackage#getSimple_MinRangeType()
	 * @model
	 * @generated
	 */
	Constant getMinRangeType();

	/**
	 * Sets the value of the '{@link edttype.Simple#getMinRangeType <em>Min Range Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Range Type</em>' reference.
	 * @see #getMinRangeType()
	 * @generated
	 */
	void setMinRangeType(Constant value);

	/**
	 * Returns the value of the '<em><b>Precision Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Type</em>' reference.
	 * @see #setPrecisionType(Constant)
	 * @see edttype.EDTTypePackage#getSimple_PrecisionType()
	 * @model
	 * @generated
	 */
	Constant getPrecisionType();

	/**
	 * Sets the value of the '{@link edttype.Simple#getPrecisionType <em>Precision Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Type</em>' reference.
	 * @see #getPrecisionType()
	 * @generated
	 */
	void setPrecisionType(Constant value);

} // Simple
