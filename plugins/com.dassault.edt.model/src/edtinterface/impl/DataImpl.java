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
import org.eclipse.emf.ecore.util.EcoreUtil;

import edtimplementation.OperationInstance;
import edtinterface.Data;
import edtinterface.EDTInterfacePackage;
import edtinterface.OperationType;
import edtinterface.ServiceDefinition;
import edtinterface.util.EDTInterfaceValidator;
import edtproject.Steps;
import edttype.EDTDataType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtinterface.impl.DataImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edtinterface.impl.DataImpl#getName <em>Name</em>}</li>
 * <li>{@link edtinterface.impl.DataImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDTDataType type;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTInterfacePackage.Literals.DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.DATA__COMMENT, oldComment,
					comment));
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
		EList<EObject> associatedDerivedData = findAssociatedDerivedData();
		for (EObject eObject : associatedDerivedData) {
			if (eObject instanceof edtqos.Data qosData) {
				qosData.setName(newName);
			} else if (eObject instanceof OperationInstance instanceData) {
				instanceData.setName(newName);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.DATA__NAME, oldName, name));
	}

	/**
	 * Finds all Derived Datas that inherit from this ServiceDefinition Data
	 * 
	 * @return list of Derived Data that inherit from this ServiceDefinition Data
	 * @generated NOT
	 */
	public EList<EObject> findAssociatedDerivedData() {
		EList<EObject> derivedDataAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof edtqos.Data
						|| crossReference.getEObject() instanceof OperationInstance) {
					derivedDataAssociated.add(crossReference.getEObject());
				}
			}
		}
		return derivedDataAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EDTDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EDTDataType) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDTInterfacePackage.DATA__TYPE, oldType,
							type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDTDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setType(EDTDataType newType) {
		EDTDataType oldType = type;
		type = newType;
//		if (newType.eContainer() instanceof Library lib && this.eContainer() instanceof ServiceDefinition sd) {
//			sd.getUsedLibraries().add(lib);
//		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.DATA__TYPE, oldType, type));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EDTInterfacePackage.DATA__COMMENT:
			return getComment();
		case EDTInterfacePackage.DATA__NAME:
			return getName();
		case EDTInterfacePackage.DATA__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EDTInterfacePackage.DATA__COMMENT:
			setComment((String) newValue);
			return;
		case EDTInterfacePackage.DATA__NAME:
			setName((String) newValue);
			return;
		case EDTInterfacePackage.DATA__TYPE:
			setType((EDTDataType) newValue);
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
		case EDTInterfacePackage.DATA__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTInterfacePackage.DATA__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTInterfacePackage.DATA__TYPE:
			setType((EDTDataType) null);
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
		case EDTInterfacePackage.DATA__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTInterfacePackage.DATA__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTInterfacePackage.DATA__TYPE:
			return type != null;
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
		case EDTInterfacePackage.DATA___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP:
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
		return (this.getType() != null && this.getName() != null && !this.getName().isBlank());
	}

} // DataImpl
