/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Steps</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edtproject.Steps#getStep <em>Step</em>}</li>
 *   <li>{@link edtproject.Steps#getOutputDirectory <em>Output Directory</em>}</li>
 * </ul>
 *
 * @see edtproject.EDTProjectPackage#getSteps()
 * @model
 * @generated
 */
public interface Steps extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link edtproject.Step}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see edtproject.EDTProjectPackage#getSteps_Step()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Output Directory</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the value of the '<em>Output Directory</em>' containment reference.
	 * @see #setOutputDirectory(OutputDirectory)
	 * @see edtproject.EDTProjectPackage#getSteps_OutputDirectory()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputDirectory getOutputDirectory();

	/**
	 * Sets the value of the '{@link edtproject.Steps#getOutputDirectory <em>Output Directory</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Output Directory</em>' containment reference.
	 * @see #getOutputDirectory()
	 * @generated
	 */
	void setOutputDirectory(OutputDirectory value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step0 getStep0();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step1 getStep1();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step2 getStep2();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step3 getStep3();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step4 getStep4();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	Step5 getStep5();

	/**
	 * Search for root Steps object by testing recursively the eContainers
	 * 
	 * @param eObject : object that is a descendant of Steps
	 * @return Steps
	 */
	public static Steps findStepsContainer(EObject eObject) {
		if (eObject == null) {
			return null;
		}
		if (eObject instanceof Steps steps) {
			return steps;
		} else if (eObject.eContainer() != null) {
			return findStepsContainer(eObject.eContainer());
		} else {
			return null;
		}
	}

} // Steps
