/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import edtimplementation.ComponentImplementation;
import edtimplementation.DataReaderInstance;
import edtimplementation.DataWriterInstance;
import edtimplementation.EdtimplementationFactory;
import edtimplementation.EdtimplementationPackage;
import edtimplementation.EventReceived;
import edtimplementation.EventReceiverInstance;
import edtimplementation.EventSenderInstance;
import edtimplementation.EventSent;
import edtimplementation.ModuleImplementation;
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationInstance;
import edtimplementation.OperationLink;
import edtimplementation.PinfoValue;
import edtimplementation.PrivatePinfo;
import edtimplementation.PrivatePinfoValue;
import edtimplementation.PropertyValue;
import edtimplementation.PublicPinfo;
import edtimplementation.PublicPinfoValue;
import edtimplementation.RequestClientInstance;
import edtimplementation.RequestReceived;
import edtimplementation.RequestSent;
import edtimplementation.RequestServerInstance;
import edtimplementation.VersionedDataRead;
import edtimplementation.VersionedDataWritten;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getModuleBehaviour <em>Module Behaviour</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getRelativePriority <em>Relative Priority</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleInstanceImpl#getModuleImplementation <em>Module Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleInstanceImpl extends MinimalEObjectImpl.Container implements ModuleInstance {
	/**
	 * The default value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_BEHAVIOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleBehaviour() <em>Module Behaviour</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleBehaviour()
	 * @generated
	 * @ordered
	 */
	protected String moduleBehaviour = MODULE_BEHAVIOUR_EDEFAULT;

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
	 * The default value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RELATIVE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePriority() <em>Relative Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelativePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger relativePriority = RELATIVE_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyValues() <em>Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValue> propertyValues;

	/**
	 * The cached value of the '{@link #getPinfo() <em>Pinfo</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<PinfoValue> pinfo;

	/**
	 * The cached value of the '{@link #getModuleType() <em>Module Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
	protected ModuleType moduleType;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationInstance> operations;

	/**
	 * The cached value of the '{@link #getModuleImplementation() <em>Module
	 * Implementation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getModuleImplementation()
	 * @generated
	 * @ordered
	 */
	protected ModuleImplementation moduleImplementation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.MODULE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModuleBehaviour() {
		return moduleBehaviour;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleBehaviour(String newModuleBehaviour) {
		String oldModuleBehaviour = moduleBehaviour;
		moduleBehaviour = newModuleBehaviour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_INSTANCE__MODULE_BEHAVIOUR, oldModuleBehaviour, moduleBehaviour));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getRelativePriority() {
		return relativePriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePriority(BigInteger newRelativePriority) {
		BigInteger oldRelativePriority = relativePriority;
		relativePriority = newRelativePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_INSTANCE__RELATIVE_PRIORITY, oldRelativePriority, relativePriority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<PropertyValue> getPropertyValues() {
		if (propertyValues == null) {
			propertyValues = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this,
					EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES) {
				@Override
				public void addUnique(PropertyValue object) {
					for (PropertyValue propertyValue : propertyValues) {
						if (alreadyExistsInInstanceProperty(object, propertyValue)) {
							if (object.getValue() != null) {
								propertyValue.setValue(object.getValue());
							}
							return;
						}
					}
					Iterator<PropertyValue> iterator = propertyValues.iterator();
					while (iterator.hasNext()) {
						PropertyValue propertyValue = iterator.next();
						if (alreadyExistsInInstanceProperty(object, propertyValue)) {
							iterator.remove();
						}

					}
					super.addUnique(object);
				}
			};
		}
		return propertyValues;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<PinfoValue> getPinfo() {
		if (pinfo == null) {
			pinfo = new EObjectContainmentEList<PinfoValue>(PinfoValue.class, this,
					EdtimplementationPackage.MODULE_INSTANCE__PINFO) {
				@Override
				public void addUnique(PinfoValue object) {
					for (PinfoValue pinfoValue : pinfo) {
						if (alreadyExistsInInstancePinfo(object, pinfoValue)) {
							if (object.getValue() != null) {
								pinfoValue.setValue(object.getValue());
							}
							return;
						}
					}

					super.addUnique(object);
				}

			};
		}
		return pinfo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleType getModuleType() {
		if (moduleType != null && moduleType.eIsProxy()) {
			InternalEObject oldModuleType = (InternalEObject)moduleType;
			moduleType = (ModuleType)eResolveProxy(oldModuleType);
			if (moduleType != oldModuleType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE, oldModuleType, moduleType));
			}
		}
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleType basicGetModuleType() {
		return moduleType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setModuleType(ModuleType newModuleType) {
		ModuleType oldModuleType = moduleType;
		moduleType = newModuleType;
		createOpFromModuleType();
		createPinfoFromModuleType();
		createPropertyValueFromModuleType();

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE,
					oldModuleType, moduleType));
	}

	/**
	 * Propagation of ModuleType Pinfo to ModuleInstance
	 * 
	 * Begins with deleting all unused Pinfo of ModuleInstance and then adding the
	 * new
	 * 
	 * @generated NOT
	 */
	private void createPinfoFromModuleType() {
		if (moduleType != null) {
			EList<ModuleTypePinfo> edtModuleTypePinfo = moduleType.getPinfo();
			if (pinfo != null) {
				cleanModuleInstancePinfo(edtModuleTypePinfo);
			}
			for (ModuleTypePinfo pinfoType : edtModuleTypePinfo) {
				if (pinfoType instanceof PublicPinfo publicPinfo) {
					PublicPinfoValue publicPinfoValue = EdtimplementationFactory.eINSTANCE.createPublicPinfoValue();
					publicPinfoValue.setPublicPinfoFromModuleType(publicPinfo);
					publicPinfoValue.setName(publicPinfo.getName());
					getPinfo().add(publicPinfoValue);
				} else if (pinfoType instanceof PrivatePinfo privatePinfo) {
					PrivatePinfoValue privatePinfoValue = EdtimplementationFactory.eINSTANCE.createPrivatePinfoValue();
					privatePinfoValue.setPrivatePinfoFromModuleType(privatePinfo);
					privatePinfoValue.setName(privatePinfo.getName());
					getPinfo().add(privatePinfoValue);
				}
			}
		} else {
			getPinfo().clear();
		}
	}

	/**
	 * Propagation of ModuleType PropertyValue to ModuleInstance
	 * 
	 * Begins with deleting all unused PropertyValue of ModuleInstance and then
	 * adding the new
	 * 
	 * @generated NOT
	 */
	private void createPropertyValueFromModuleType() {
		if (moduleType != null) {
			EList<ModuleTypeProperty> edtModuleTypeProperty = moduleType.getProperties();
			if (propertyValues != null) {
				cleanModuleInstancePropertyValue(edtModuleTypeProperty);
			}
			for (ModuleTypeProperty propertyType : edtModuleTypeProperty) {
				PropertyValue edtPropertyValue = EdtimplementationFactory.eINSTANCE.createPropertyValue();
				edtPropertyValue.setPropertyType(propertyType);
				edtPropertyValue.setName(propertyType.getName());
				getPropertyValues().add(edtPropertyValue);
			}
		} else {
			getPropertyValues().clear();
		}
	}

	/**
	 * @param edtModuleTypePinfo
	 */
	private void cleanModuleInstancePinfo(EList<ModuleTypePinfo> edtModuleTypePinfo) {
		Iterator<PinfoValue> each = pinfo.iterator();
		while (each.hasNext()) {
			PinfoValue pinfoValue = each.next();
			if (pinfoAlreadyInherited(edtModuleTypePinfo, pinfoValue)) {
				each.remove();
			}
		}
	}

	/**
	 * @param edtModuleTypeProperty
	 */
	private void cleanModuleInstancePropertyValue(EList<ModuleTypeProperty> edtModuleTypeProperty) {
		Iterator<PropertyValue> each = propertyValues.iterator();
		while (each.hasNext()) {
			PropertyValue propertyValue = each.next();
			if (propertyAlreadyInherited(edtModuleTypeProperty, propertyValue)) {
				each.remove();
			}
		}
	}

	/**
	 * @param edtModuleTypePinfo
	 * @param pinfoValue
	 * @return
	 */
	private boolean pinfoAlreadyInherited(EList<ModuleTypePinfo> edtModuleTypePinfo, PinfoValue pinfoValue) {
		return (pinfoValue instanceof PublicPinfoValue publicPinfoValue
				&& publicPinfoValue.getPublicPinfoFromModuleType() != null
				&& edtModuleTypePinfo.contains(publicPinfoValue.getPublicPinfoFromModuleType()))
				|| (pinfoValue instanceof PrivatePinfoValue privatePinfoValue
						&& privatePinfoValue.getPrivatePinfoFromModuleType() != null
						&& edtModuleTypePinfo.contains(privatePinfoValue.getPrivatePinfoFromModuleType()));
	}

	/**
	 * @param edtModuleTypeProperty
	 * @param propertyValue
	 * @return
	 */
	private boolean propertyAlreadyInherited(EList<ModuleTypeProperty> edtModuleTypeProperty,
			PropertyValue propertyValue) {
		return (propertyValue.getPropertyType() != null
				&& edtModuleTypeProperty.contains(propertyValue.getPropertyType()));
	}

	/**
	 * Propagation of ModuleType Operations to ModuleInstance
	 * 
	 * Begins with deleting all unused operations of ModuleInstance and then adding
	 * the new
	 * 
	 * @generated NOT
	 */
	private void createOpFromModuleType() {
		if (moduleType != null) {
			EList<ModuleOperation> edtModuleTypeOperations = moduleType.getOperations();
			if (operations != null) {
				cleanModuleInstanceOperations(edtModuleTypeOperations);
			}
			for (ModuleOperation moduleOperation : edtModuleTypeOperations) {
				if (moduleOperation instanceof VersionedDataRead dataRead) {
					DataReaderInstance dataReader = EdtimplementationFactory.eINSTANCE.createDataReaderInstance();
					dataReader.setMTOperationRef(dataRead);
					dataReader.setName(dataRead.getName());
					getOperations().add(dataReader);
				} else if (moduleOperation instanceof VersionedDataWritten dataWritten) {
					DataWriterInstance dataWriter = EdtimplementationFactory.eINSTANCE.createDataWriterInstance();
					dataWriter.setMTOperationRef(dataWritten);
					dataWriter.setName(dataWritten.getName());
					getOperations().add(dataWriter);
				} else if (moduleOperation instanceof EventSent eventSent) {
					EventSenderInstance eventSender = EdtimplementationFactory.eINSTANCE.createEventSenderInstance();
					eventSender.setMTOperationRef(eventSent);
					eventSender.setName(eventSent.getName());
					getOperations().add(eventSender);
				} else if (moduleOperation instanceof EventReceived eventReceived) {
					EventReceiverInstance eventReceiver = EdtimplementationFactory.eINSTANCE
							.createEventReceiverInstance();
					eventReceiver.setMTOperationRef(eventReceived);
					eventReceiver.setName(eventReceived.getName());
					getOperations().add(eventReceiver);
				} else if (moduleOperation instanceof RequestSent requestSent) {
					RequestClientInstance requestClient = EdtimplementationFactory.eINSTANCE
							.createRequestClientInstance();
					requestClient.setMTOperationRef(requestSent);
					requestClient.setName(requestSent.getName());
					getOperations().add(requestClient);
				} else if (moduleOperation instanceof RequestReceived requestReceived) {
					RequestServerInstance requestServer = EdtimplementationFactory.eINSTANCE
							.createRequestServerInstance();
					requestServer.setMTOperationRef(requestReceived);
					requestServer.setName(requestReceived.getName());
					getOperations().add(requestServer);
				}
			}
		} else {
			getOperations().clear();
		}
	}

	/**
	 * @param edtModuleTypeOperations
	 */
	private void cleanModuleInstanceOperations(EList<ModuleOperation> edtModuleTypeOperations) {
		Iterator<OperationInstance> each = operations.iterator();
		while (each.hasNext()) {
			OperationInstance op = each.next();
			if (moduleOperationAlreadyInherited(op, edtModuleTypeOperations)) {
				EList<OperationLink> findOperationLink = op.findOperationLink();
				ComponentImplementation componentImplementation = (ComponentImplementation) op.eContainer()
						.eContainer();
				componentImplementation.getOperationLinks().removeAll(findOperationLink);
				each.remove();
			}
		}
	}

	/**
	 * @param op
	 * @param edtModuleTypeOperations
	 * @return
	 */
	private boolean moduleOperationAlreadyInherited(OperationInstance op,
			EList<ModuleOperation> edtModuleTypeOperations) {
		return (op instanceof DataReaderInstance dataReader && dataReader.getMTOperationRef() != null
				&& !edtModuleTypeOperations.contains(dataReader.getMTOperationRef()))
				|| (op instanceof DataWriterInstance dataWriter && dataWriter.getMTOperationRef() != null
						&& !edtModuleTypeOperations.contains(dataWriter.getMTOperationRef()))
				|| (op instanceof EventSenderInstance eventSender && eventSender.getMTOperationRef() != null
						&& !edtModuleTypeOperations.contains(eventSender.getMTOperationRef()))
				|| (op instanceof EventReceiverInstance eventReceiver && eventReceiver.getMTOperationRef() != null
						&& !edtModuleTypeOperations.contains(eventReceiver.getMTOperationRef()))
				|| (op instanceof RequestClientInstance requestClient && requestClient.getMTOperationRef() != null
						&& !edtModuleTypeOperations.contains(requestClient.getMTOperationRef()))
				|| (op instanceof RequestServerInstance requestServer && requestServer.getMTOperationRef() != null
						&& !edtModuleTypeOperations.contains(requestServer.getMTOperationRef()));
	}

	/**
	 * @param object
	 * @param operation
	 * @return
	 */
	private boolean alreadyExistsInInstanceOperation(OperationInstance object, OperationInstance operation) {
		return (object instanceof DataReaderInstance newObject && operation instanceof DataReaderInstance op
				&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
						&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())))
				|| (object instanceof DataWriterInstance newObject && operation instanceof DataWriterInstance op
						&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
								&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())))
				|| (object instanceof EventSenderInstance newObject && operation instanceof EventSenderInstance op
						&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
								&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())))
				|| (object instanceof EventReceiverInstance newObject && operation instanceof EventReceiverInstance op
						&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
								&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())))
				|| (object instanceof RequestClientInstance newObject && operation instanceof RequestClientInstance op
						&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
								&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())))
				|| (object instanceof RequestServerInstance newObject && operation instanceof RequestServerInstance op
						&& (newObject.getMTOperationRef() != null && op.getMTOperationRef() != null
								&& Objects.equals(op.getMTOperationRef(), newObject.getMTOperationRef())));
	}

	/**
	 * @param object
	 * @param newObject
	 * @return
	 */
	private boolean alreadyExistsInInstancePinfo(PinfoValue object, PinfoValue pinfoValue) {
		return ((object instanceof PublicPinfoValue newObject && pinfoValue instanceof PublicPinfoValue publicPinfoValue
				&& (newObject.getPublicPinfoFromModuleType() != null
						&& publicPinfoValue.getPublicPinfoFromModuleType() != null
						&& Objects.equals(publicPinfoValue.getPublicPinfoFromModuleType(),
								newObject.getPublicPinfoFromModuleType())))
				|| (object instanceof PrivatePinfoValue newObject
						&& pinfoValue instanceof PrivatePinfoValue privatePinfoValue
						&& (newObject.getPrivatePinfoFromModuleType() != null
								&& privatePinfoValue.getPrivatePinfoFromModuleType() != null
								&& Objects.equals(privatePinfoValue.getPrivatePinfoFromModuleType(),
										newObject.getPrivatePinfoFromModuleType()))));
	}

	/**
	 * @param object
	 * @param newObject
	 * @return
	 */
	private boolean alreadyExistsInInstanceProperty(PropertyValue object, PropertyValue propertyValue) {
		return (object.getPropertyType() != null && propertyValue.getPropertyType() != null
				&& Objects.equals(propertyValue.getPropertyType(), object.getPropertyType()));
	}

	@SuppressWarnings("serial")
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<OperationInstance> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationInstance>(OperationInstance.class, this,
					EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS) {
				@Override
				public void addUnique(OperationInstance object) {
					for (OperationInstance operationInstance : operations) {
						if (alreadyExistsInInstanceOperation(object, operationInstance)) {
							return;
						}
					}
					super.addUnique(object);
				}
			};
		}
		return operations;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleImplementation getModuleImplementation() {
		if (moduleImplementation != null && moduleImplementation.eIsProxy()) {
			InternalEObject oldModuleImplementation = (InternalEObject)moduleImplementation;
			moduleImplementation = (ModuleImplementation)eResolveProxy(oldModuleImplementation);
			if (moduleImplementation != oldModuleImplementation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION, oldModuleImplementation, moduleImplementation));
			}
		}
		return moduleImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleImplementation basicGetModuleImplementation() {
		return moduleImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setModuleImplementation(ModuleImplementation newModuleImplementation) {
		ModuleImplementation oldModuleImplementation = moduleImplementation;
		moduleImplementation = newModuleImplementation;
		if (newModuleImplementation != null && newModuleImplementation.getModuleType() != null) {
			setModuleType(newModuleImplementation.getModuleType());
		} else {
			setModuleType(null);
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION, oldModuleImplementation,
					moduleImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return ((InternalEList<?>)getPropertyValues()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.MODULE_INSTANCE__PINFO:
				return ((InternalEList<?>)getPinfo()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_BEHAVIOUR:
				return getModuleBehaviour();
			case EdtimplementationPackage.MODULE_INSTANCE__NAME:
				return getName();
			case EdtimplementationPackage.MODULE_INSTANCE__RELATIVE_PRIORITY:
				return getRelativePriority();
			case EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return getPropertyValues();
			case EdtimplementationPackage.MODULE_INSTANCE__PINFO:
				return getPinfo();
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE:
				if (resolve) return getModuleType();
				return basicGetModuleType();
			case EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS:
				return getOperations();
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION:
				if (resolve) return getModuleImplementation();
				return basicGetModuleImplementation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour((String)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__NAME:
				setName((String)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority((BigInteger)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				getPropertyValues().clear();
				getPropertyValues().addAll((Collection<? extends PropertyValue>)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__PINFO:
				getPinfo().clear();
				getPinfo().addAll((Collection<? extends PinfoValue>)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE:
				setModuleType((ModuleType)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationInstance>)newValue);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION:
				setModuleImplementation((ModuleImplementation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_BEHAVIOUR:
				setModuleBehaviour(MODULE_BEHAVIOUR_EDEFAULT);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__RELATIVE_PRIORITY:
				setRelativePriority(RELATIVE_PRIORITY_EDEFAULT);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				getPropertyValues().clear();
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__PINFO:
				getPinfo().clear();
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE:
				setModuleType((ModuleType)null);
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS:
				getOperations().clear();
				return;
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION:
				setModuleImplementation((ModuleImplementation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_BEHAVIOUR:
				return MODULE_BEHAVIOUR_EDEFAULT == null ? moduleBehaviour != null : !MODULE_BEHAVIOUR_EDEFAULT.equals(moduleBehaviour);
			case EdtimplementationPackage.MODULE_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdtimplementationPackage.MODULE_INSTANCE__RELATIVE_PRIORITY:
				return RELATIVE_PRIORITY_EDEFAULT == null ? relativePriority != null : !RELATIVE_PRIORITY_EDEFAULT.equals(relativePriority);
			case EdtimplementationPackage.MODULE_INSTANCE__PROPERTY_VALUES:
				return propertyValues != null && !propertyValues.isEmpty();
			case EdtimplementationPackage.MODULE_INSTANCE__PINFO:
				return pinfo != null && !pinfo.isEmpty();
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_TYPE:
				return moduleType != null;
			case EdtimplementationPackage.MODULE_INSTANCE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case EdtimplementationPackage.MODULE_INSTANCE__MODULE_IMPLEMENTATION:
				return moduleImplementation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (moduleBehaviour: ");
		result.append(moduleBehaviour);
		result.append(", name: ");
		result.append(name);
		result.append(", relativePriority: ");
		result.append(relativePriority);
		result.append(')');
		return result.toString();
	}

	public EList<OperationLink> findOperationLinks() {
		EList<OperationLink> operationLinks = new BasicEList<>();
		EList<OperationInstance> operationInstances = this.getOperations();
		for (OperationInstance operationInstance : operationInstances) {
			ComponentImplementation componentImplementation = (ComponentImplementation) this.eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(operationInstance,
					componentImplementation);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof OperationLink operationLink) {
					operationLinks.add(operationLink);
				}
			}
		}
		return operationLinks;
	}

	public boolean isComplete() {
		return (this.getName() != null && !this.getName().isBlank() && this.getRelativePriority() != null
				&& this.getModuleImplementation() != null);
	}

} // ModuleInstanceImpl
