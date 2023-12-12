/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtinterface.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
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

import com.dassault.edt.log.EDTLog;

import edtimplementation.ComponentImplementation;
import edtimplementation.EventDefinitionInstance;
import edtimplementation.EventLink;
import edtimplementation.EventLinkReceiver;
import edtimplementation.EventLinkSender;
import edtimplementation.OperationInstance;
import edtinterface.EDTInterfacePackage;
import edtinterface.Event;
import edtinterface.OperationType;
import edtinterface.Parameter;
import edtinterface.ServiceDefinition;
import edtinterface.util.EDTInterfaceValidator;
import edtproject.Steps;
import technology.ecoa.interface_._2.EEventDirection;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Event</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtinterface.impl.EventImpl#getComment <em>Comment</em>}</li>
 * <li>{@link edtinterface.impl.EventImpl#getName <em>Name</em>}</li>
 * <li>{@link edtinterface.impl.EventImpl#getInput <em>Input</em>}</li>
 * <li>{@link edtinterface.impl.EventImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EEventDirection DIRECTION_EDEFAULT = EEventDirection.SENTBYPROVIDER;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EEventDirection direction = DIRECTION_EDEFAULT;

	/**
	 * This is true if the Direction attribute has been set. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean directionESet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTInterfacePackage.Literals.EVENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.EVENT__COMMENT, oldComment,
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
		EList<EObject> associatedDerivedEvent = findAssociatedDerivedEvent();
		for (EObject eObject : associatedDerivedEvent) {
			if (eObject instanceof edtqos.Event qosEvent) {
				qosEvent.setName(newName);
			} else if (eObject instanceof OperationInstance instanceData) {
				instanceData.setName(newName);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.EVENT__NAME, oldName, name));
	}

	/**
	 * Finds all Derived Events that inherit from this ServiceDefinition Data
	 * 
	 * @return list of Derived Events that inherit from this ServiceDefinition Data
	 * @generated NOT
	 */
	public EList<EObject> findAssociatedDerivedEvent() {
		EList<EObject> derivedEventAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof edtqos.Event
						|| crossReference.getEObject() instanceof OperationInstance) {
					derivedEventAssociated.add(crossReference.getEObject());
				}
			}
		}
		return derivedEventAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Parameter> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Parameter>(Parameter.class, this, EDTInterfacePackage.EVENT__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEventDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setDirection(EEventDirection newDirection) {
		EEventDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		boolean oldDirectionESet = directionESet;
		directionESet = true;
		StringBuilder warningMessage = new StringBuilder();
		if (oldDirection != direction) {
			EList<EventDefinitionInstance> associatedEventDefinitionInstances = findAssociatedEventDefinitionInstance();
			for (EventDefinitionInstance eventDefinitionInstance : associatedEventDefinitionInstances) {
				EList<EventLink> associatedEventLinks = findAssociatedEventLink(eventDefinitionInstance);
				Iterator<EventLink> each = associatedEventLinks.iterator();
				while (each.hasNext()) {
					EventLink associatedEventLink = each.next();
					EventLinkReceiver eventLinkReceiver = EventLink.getEventLinkReceiver(associatedEventLink);
					EventLinkSender eventLinkSender = EventLink.getEventLinkSender(associatedEventLink);
					ComponentImplementation componentImplementation = (ComponentImplementation) associatedEventLink
							.eContainer();
					componentImplementation.getOperationLinks().remove(associatedEventLink);
					warningMessage.append("The EventLink in " + componentImplementation.getName() + " between the"
							+ eventLinkSender.getSimplifiedClassName() + " " + eventLinkSender.getName() + " and the "
							+ eventLinkReceiver.getSimplifiedClassName() + " " + eventLinkReceiver.getName()
							+ " was deleted.\n");
				}
			}
			if (!warningMessage.isEmpty()) {
				EDTLog.toPopUpAndConsole(
						"The direction of Event " + this.name
								+ " has been changed, some EventLinks were removed. See the console for more details.",
						warningMessage.toString());
			}
		}

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTInterfacePackage.EVENT__DIRECTION, oldDirection,
					direction, !oldDirectionESet));
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<EventDefinitionInstance> findAssociatedEventDefinitionInstance() {
		EList<EventDefinitionInstance> eventDefinitionInstanceAssociated = new BasicEList<>();
		Steps findStepsContainer = Steps.findStepsContainer(this);
		if (findStepsContainer != null) {
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, findStepsContainer);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof EventDefinitionInstance eventDefinitionInstance) {
					eventDefinitionInstanceAssociated.add(eventDefinitionInstance);
				}
			}
		}
		return eventDefinitionInstanceAssociated;
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<EventLink> findAssociatedEventLink(EventDefinitionInstance associatedEventDefinitionInstance) {
		EList<EventLink> associatedEventLinks = new BasicEList<>();
		if (associatedEventDefinitionInstance.eContainer() != associatedEventDefinitionInstance
				&& associatedEventDefinitionInstance.eContainer().eContainer() != null) {
			ComponentImplementation componentImplementation = (ComponentImplementation) associatedEventDefinitionInstance
					.eContainer().eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(associatedEventDefinitionInstance,
					componentImplementation);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof EventLink eventLink) {
					associatedEventLinks.add(eventLink);
				}
			}
		}
		return associatedEventLinks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void unsetDirection() {
		EEventDirection oldDirection = direction;
		boolean oldDirectionESet = directionESet;
		direction = DIRECTION_EDEFAULT;
		directionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EDTInterfacePackage.EVENT__DIRECTION, oldDirection,
					DIRECTION_EDEFAULT, oldDirectionESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSetDirection() {
		return directionESet;
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
		case EDTInterfacePackage.EVENT__INPUT:
			return ((InternalEList<?>) getInput()).basicRemove(otherEnd, msgs);
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
		case EDTInterfacePackage.EVENT__COMMENT:
			return getComment();
		case EDTInterfacePackage.EVENT__NAME:
			return getName();
		case EDTInterfacePackage.EVENT__INPUT:
			return getInput();
		case EDTInterfacePackage.EVENT__DIRECTION:
			return getDirection();
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
		case EDTInterfacePackage.EVENT__COMMENT:
			setComment((String) newValue);
			return;
		case EDTInterfacePackage.EVENT__NAME:
			setName((String) newValue);
			return;
		case EDTInterfacePackage.EVENT__INPUT:
			getInput().clear();
			getInput().addAll((Collection<? extends Parameter>) newValue);
			return;
		case EDTInterfacePackage.EVENT__DIRECTION:
			setDirection((EEventDirection) newValue);
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
		case EDTInterfacePackage.EVENT__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case EDTInterfacePackage.EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EDTInterfacePackage.EVENT__INPUT:
			getInput().clear();
			return;
		case EDTInterfacePackage.EVENT__DIRECTION:
			unsetDirection();
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
		case EDTInterfacePackage.EVENT__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		case EDTInterfacePackage.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EDTInterfacePackage.EVENT__INPUT:
			return input != null && !input.isEmpty();
		case EDTInterfacePackage.EVENT__DIRECTION:
			return isSetDirection();
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
		case EDTInterfacePackage.EVENT___NAME_IS_UNIQUE__DIAGNOSTICCHAIN_MAP:
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
		result.append(", direction: ");
		if (directionESet)
			result.append(direction);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getDirection() != null);
	}

} // EventImpl
