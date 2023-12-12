/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtqos;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Operation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edtqos.Operation#getHighestRateNumberOfOccurrences <em>Highest
 * Rate Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.Operation#getHighestRateTimeFrame <em>Highest Rate Time
 * Frame</em>}</li>
 * <li>{@link edtqos.Operation#getLowestRateNumberOfOccurrences <em>Lowest Rate
 * Number Of Occurrences</em>}</li>
 * <li>{@link edtqos.Operation#getLowestRateTimeFrame <em>Lowest Rate Time
 * Frame</em>}</li>
 * <li>{@link edtqos.Operation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edtqos.EdtqosPackage#getOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Highest Rate Number Of Occurrences</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Highest Rate Number Of Occurrences</em>'
	 *         attribute.
	 * @see #setHighestRateNumberOfOccurrences(BigDecimal)
	 * @see edtqos.EdtqosPackage#getOperation_HighestRateNumberOfOccurrences()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getHighestRateNumberOfOccurrences();

	/**
	 * Sets the value of the
	 * '{@link edtqos.Operation#getHighestRateNumberOfOccurrences <em>Highest Rate
	 * Number Of Occurrences</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Highest Rate Number Of
	 *              Occurrences</em>' attribute.
	 * @see #getHighestRateNumberOfOccurrences()
	 * @generated
	 */
	void setHighestRateNumberOfOccurrences(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Highest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Highest Rate Time Frame</em>' attribute.
	 * @see #isSetHighestRateTimeFrame()
	 * @see #unsetHighestRateTimeFrame()
	 * @see #setHighestRateTimeFrame(double)
	 * @see edtqos.EdtqosPackage#getOperation_HighestRateTimeFrame()
	 * @model unsettable="true"
	 *        dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getHighestRateTimeFrame();

	/**
	 * Sets the value of the '{@link edtqos.Operation#getHighestRateTimeFrame
	 * <em>Highest Rate Time Frame</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Highest Rate Time Frame</em>'
	 *              attribute.
	 * @see #isSetHighestRateTimeFrame()
	 * @see #unsetHighestRateTimeFrame()
	 * @see #getHighestRateTimeFrame()
	 * @generated
	 */
	void setHighestRateTimeFrame(double value);

	/**
	 * Unsets the value of the '{@link edtqos.Operation#getHighestRateTimeFrame
	 * <em>Highest Rate Time Frame</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetHighestRateTimeFrame()
	 * @see #getHighestRateTimeFrame()
	 * @see #setHighestRateTimeFrame(double)
	 * @generated
	 */
	void unsetHighestRateTimeFrame();

	/**
	 * Returns whether the value of the
	 * '{@link edtqos.Operation#getHighestRateTimeFrame <em>Highest Rate Time
	 * Frame</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Highest Rate Time Frame</em>' attribute
	 *         is set.
	 * @see #unsetHighestRateTimeFrame()
	 * @see #getHighestRateTimeFrame()
	 * @see #setHighestRateTimeFrame(double)
	 * @generated
	 */
	boolean isSetHighestRateTimeFrame();

	/**
	 * Returns the value of the '<em><b>Lowest Rate Number Of Occurrences</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lowest Rate Number Of Occurrences</em>'
	 *         attribute.
	 * @see #setLowestRateNumberOfOccurrences(BigDecimal)
	 * @see edtqos.EdtqosPackage#getOperation_LowestRateNumberOfOccurrences()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 * @generated
	 */
	BigDecimal getLowestRateNumberOfOccurrences();

	/**
	 * Sets the value of the
	 * '{@link edtqos.Operation#getLowestRateNumberOfOccurrences <em>Lowest Rate
	 * Number Of Occurrences</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Lowest Rate Number Of
	 *              Occurrences</em>' attribute.
	 * @see #getLowestRateNumberOfOccurrences()
	 * @generated
	 */
	void setLowestRateNumberOfOccurrences(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Lowest Rate Time Frame</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lowest Rate Time Frame</em>' attribute.
	 * @see #isSetLowestRateTimeFrame()
	 * @see #unsetLowestRateTimeFrame()
	 * @see #setLowestRateTimeFrame(double)
	 * @see edtqos.EdtqosPackage#getOperation_LowestRateTimeFrame()
	 * @model unsettable="true"
	 *        dataType="technology.ecoa.interface_.qos._2.TimeDuration"
	 * @generated
	 */
	double getLowestRateTimeFrame();

	/**
	 * Sets the value of the '{@link edtqos.Operation#getLowestRateTimeFrame
	 * <em>Lowest Rate Time Frame</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Lowest Rate Time Frame</em>'
	 *              attribute.
	 * @see #isSetLowestRateTimeFrame()
	 * @see #unsetLowestRateTimeFrame()
	 * @see #getLowestRateTimeFrame()
	 * @generated
	 */
	void setLowestRateTimeFrame(double value);

	/**
	 * Unsets the value of the '{@link edtqos.Operation#getLowestRateTimeFrame
	 * <em>Lowest Rate Time Frame</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isSetLowestRateTimeFrame()
	 * @see #getLowestRateTimeFrame()
	 * @see #setLowestRateTimeFrame(double)
	 * @generated
	 */
	void unsetLowestRateTimeFrame();

	/**
	 * Returns whether the value of the
	 * '{@link edtqos.Operation#getLowestRateTimeFrame <em>Lowest Rate Time
	 * Frame</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Lowest Rate Time Frame</em>' attribute
	 *         is set.
	 * @see #unsetLowestRateTimeFrame()
	 * @see #getLowestRateTimeFrame()
	 * @see #setLowestRateTimeFrame(double)
	 * @generated
	 */
	boolean isSetLowestRateTimeFrame();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edtqos.EdtqosPackage#getOperation_Name()
	 * @model dataType="technology.ecoa.interface_.qos._2.NameId" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edtqos.Operation#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @return true if no missing attributes
	 */
	boolean isComplete();

} // Operation
