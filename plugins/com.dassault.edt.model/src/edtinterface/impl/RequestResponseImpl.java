/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.OperationInstance;
import edtinterface.EDTInterfacePackage;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtinterface.RequestResponse;
import edtinterface.ServiceDefinition;
import edtinterface.util.EDTInterfaceValidator;
import edtproject.Steps;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Request
 * Response</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtinterface.impl.RequestResponseImpl#getComment
 * <em>Comment</em>}</li>
 * <li>{@link edtinterface.impl.RequestResponseImpl#getName <em>Name</em>}</li>
 * <li>{@link edtinterface.impl.RequestResponseImpl#getInput
 * <em>Input</em>}</li>
 * <li>{@link edtinterface.impl.RequestResponseImpl#getOutput
 * <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestResponseImpl extends MinimalEObjectImpl.Container implements RequestResponse {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> output;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RequestResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTInterfacePackage.Literals.REQUEST_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.REQUEST_RESPONSE__COMMENT,
					oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		EList<EObject> associatedDerivedRequestResponse = findAssociatedDerivedRequestResponse();
		for (EObject eObject : associatedDerivedRequestResponse) {
			if (eObject instanceof edtqos.RequestResponse qosRequestResponse) {
				qosRequestResponse.setName(newName);
			} else if (eObject instanceof OperationInstance instanceData) {
				instanceData.setName(newName);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.REQUEST_RESPONSE__NAME, oldName,
					name));
	}

	/**
	 * Finds all Derived Events that inherit from this ServiceDefinition Data
	 * 
	 * @return list of Derived Events that inherit from this ServiceDefinition Data
	 * @generated NOT
	 */
	public EList<EObject> findAssociatedDerivedRequestResponse() {
		EList<EObject> derivedRequestResponseAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof edtqos.RequestResponse
						|| crossReference.getEObject() instanceof OperationInstance) {
					derivedRequestResponseAssociated.add(crossReference.getEObject());
				}
			}
		}
		return derivedRequestResponseAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Parameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					EDTInterfacePackage.REQUEST_RESPONSE__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Parameter> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean nameIsUnique(DiagnosticChain chain, Map<?, ?> context) {
		String nameOfOperation = getName();
		if (nameOfOperation != null) {
			var edtServiceDefinition = (ServiceDefinition) eContainer;
			EList<OperationType> operations = edtServiceDefinition.getOperations();
			for (OperationType operation : operations) {
				if (!Objects.equals(operation, this) && Objects.equals(operation.getName(), nameOfOperation)) {
					if (chain != null) {
						chain.add(new BasicDiagnostic(Diagnostic.ERROR, EDTInterfaceValidator.DIAGNOSTIC_SOURCE,
								EDTInterfaceValidator.OPERATION_TYPE__NAME_IS_UNIQUE,
								"There are multiple operations with the name " + nameOfOperation,
								new Object[] { this, EDTInterfacePackage.eINSTANCE.getOperationType_Name() }));
					}
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTInterfacePackage.REQUEST_RESPONSE__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
		case EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT:
			return ((InternalEList<?>) getOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTInterfacePackage.REQUEST_RESPONSE__COMMENT:
			return getComment();
		case EDTInterfacePackage.REQUEST_RESPONSE__NAME:
			return getName();
		case EDTInterfacePackage.REQUEST_RESPONSE__INPUT:
			return getInput();
		case EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT:
			return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDTInterfacePackage.REQUEST_RESPONSE__COMMENT:
			setComment((String) newValue);
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__NAME:
			setName((String) newValue);
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Parameter>) newValue);
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT:
			getOutput().clear();
			getOutput().addAll((Collection<? extends Parameter>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EDTInterfacePackage.REQUEST_RESPONSE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__INPUT:
			getInput().clear();
			return;
		case EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT:
			getOutput().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EDTInterfacePackage.REQUEST_RESPONSE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTInterfacePackage.REQUEST_RESPONSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTInterfacePackage.REQUEST_RESPONSE__INPUT:
			return input != null && !input.isEmpty();
		case EDTInterfacePackage.REQUEST_RESPONSE__OUTPUT:
			return output != null && !output.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case EDTInterfacePackage.REQUEST_RESPONSE___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP:
			return nameIsUnique((DiagnosticChain) arguments.get(0), (Map<?, ?>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank());
	}

} // RequestResponseImpl
