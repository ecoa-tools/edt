/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtimplementation.impl;

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
import edtimplementation.ModuleInstance;
import edtimplementation.ModuleOperation;
import edtimplementation.ModuleType;
import edtimplementation.ModuleTypePinfo;
import edtimplementation.ModuleTypeProperty;
import edtimplementation.OperationInstance;
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
 * Type</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#getPinfo <em>Pinfo</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#isActivatingFaultNotifs <em>Activating Fault Notifs</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#isHasUserContext <em>Has User Context</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#isHasWarmStartContext <em>Has Warm Start Context</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#isIsFaultHandler <em>Is Fault Handler</em>}</li>
 *   <li>{@link edtimplementation.impl.ModuleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleTypeImpl extends MinimalEObjectImpl.Container implements ModuleType {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleTypeProperty> properties;

	/**
	 * The cached value of the '{@link #getPinfo() <em>Pinfo</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleTypePinfo> pinfo;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleOperation> operations;

	/**
	 * The default value of the '{@link #isActivatingFaultNotifs() <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATING_FAULT_NOTIFS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActivatingFaultNotifs() <em>Activating Fault Notifs</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isActivatingFaultNotifs()
	 * @generated
	 * @ordered
	 */
	protected boolean activatingFaultNotifs = ACTIVATING_FAULT_NOTIFS_EDEFAULT;

	/**
	 * This is true if the Activating Fault Notifs attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean activatingFaultNotifsESet;

	/**
	 * The default value of the '{@link #isHasUserContext() <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasUserContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_USER_CONTEXT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasUserContext() <em>Has User Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasUserContext()
	 * @generated
	 * @ordered
	 */
	protected boolean hasUserContext = HAS_USER_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Has User Context attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean hasUserContextESet;

	/**
	 * The default value of the '{@link #isHasWarmStartContext() <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasWarmStartContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_WARM_START_CONTEXT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasWarmStartContext() <em>Has Warm Start Context</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isHasWarmStartContext()
	 * @generated
	 * @ordered
	 */
	protected boolean hasWarmStartContext = HAS_WARM_START_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Has Warm Start Context attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean hasWarmStartContextESet;

	/**
	 * The default value of the '{@link #isIsFaultHandler() <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsFaultHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FAULT_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFaultHandler() <em>Is Fault Handler</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsFaultHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean isFaultHandler = IS_FAULT_HANDLER_EDEFAULT;

	/**
	 * This is true if the Is Fault Handler attribute has been set. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	protected boolean isFaultHandlerESet;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdtimplementationPackage.Literals.MODULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ModuleTypeProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ModuleTypeProperty>(ModuleTypeProperty.class, this,
					EdtimplementationPackage.MODULE_TYPE__PROPERTIES) {
				@Override
				public void addUnique(ModuleTypeProperty object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						PropertyValue propertyValueInstance = EdtimplementationFactory.eINSTANCE.createPropertyValue();
						propertyValueInstance.setPropertyType(object);
						propertyValueInstance.setName(object.getName());
						moduleInstance.getPropertyValues().add(propertyValueInstance);
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						cleanModuleInstanceProperties(object, moduleInstance);
					}
					return super.remove(object);
				}
			};
		}
		return properties;
	}

	/**
	 * @param object
	 * @param moduleInstance
	 */
	private void cleanModuleInstanceProperties(Object object, ModuleInstance moduleInstance) {
		EList<PropertyValue> propertiesValueInstances = moduleInstance.getPropertyValues();
		Iterator<PropertyValue> each = propertiesValueInstances.iterator();
		while (each.hasNext()) {
			PropertyValue propertyValue = each.next();
			if (Objects.equals(propertyValue.getName(), ((ModuleTypeProperty) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("serial")
	@Override
	public EList<ModuleTypePinfo> getPinfo() {
		if (pinfo == null) {
			pinfo = new EObjectContainmentEList<ModuleTypePinfo>(ModuleTypePinfo.class, this,
					EdtimplementationPackage.MODULE_TYPE__PINFO) {
				@Override
				public void addUnique(ModuleTypePinfo object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						if (object instanceof PrivatePinfo privatePinfo) {
							PrivatePinfoValue privatePinfoInstance = EdtimplementationFactory.eINSTANCE
									.createPrivatePinfoValue();
							privatePinfoInstance.setPrivatePinfoFromModuleType(privatePinfo);
							privatePinfoInstance.setName(privatePinfo.getName());
							moduleInstance.getPinfo().add(privatePinfoInstance);
						} else if (object instanceof PublicPinfo publicPinfo) {
							PublicPinfoValue publicPinfoInstance = EdtimplementationFactory.eINSTANCE
									.createPublicPinfoValue();
							publicPinfoInstance.setPublicPinfoFromModuleType(publicPinfo);
							publicPinfoInstance.setName(publicPinfo.getName());
							moduleInstance.getPinfo().add(publicPinfoInstance);
						}
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						cleanModuleInstancePinfos(object, moduleInstance);
					}
					return super.remove(object);
				}

			};
		}
		return pinfo;
	}

	/**
	 * @param object
	 * @param moduleInstance
	 */
	private void cleanModuleInstancePinfos(Object object, ModuleInstance moduleInstance) {
		EList<PinfoValue> pinfoInstances = moduleInstance.getPinfo();
		Iterator<PinfoValue> each = pinfoInstances.iterator();
		while (each.hasNext()) {
			PinfoValue pinfoValue = each.next();
			if (Objects.equals(pinfoValue.getName(), ((ModuleTypePinfo) object).getName())) {
				each.remove();
			}
		}
	}

	@SuppressWarnings("serial")
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<ModuleOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<ModuleOperation>(ModuleOperation.class, this,
					EdtimplementationPackage.MODULE_TYPE__OPERATIONS) {
				@Override
				public void addUnique(ModuleOperation object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						createModuleInstanceOperationFromModuleType(moduleInstance, object);
					}
					super.addUnique(object);
				}

				@Override
				public boolean remove(Object object) {
					EList<ModuleInstance> associatedModuleInstance = findAssociatedModuleInstance();
					for (ModuleInstance moduleInstance : associatedModuleInstance) {
						cleanModuleInstanceOperations(object, moduleInstance);
					}
					return super.remove(object);
				}
			};
		}
		return operations;
	}

	/**
	 * @param moduleInstance
	 * @param object
	 */
	private void createModuleInstanceOperationFromModuleType(ModuleInstance moduleInstance, ModuleOperation object) {
		if (object instanceof EventSent eventSent) {
			EventSenderInstance eventSenderInstance = EdtimplementationFactory.eINSTANCE.createEventSenderInstance();
			eventSenderInstance.setMTOperationRef(eventSent);
			eventSenderInstance.setName(eventSent.getName());
			moduleInstance.getOperations().add(eventSenderInstance);
		} else if (object instanceof EventReceived eventReceived) {
			EventReceiverInstance eventReceiversInstance = EdtimplementationFactory.eINSTANCE
					.createEventReceiverInstance();
			eventReceiversInstance.setMTOperationRef(eventReceived);
			eventReceiversInstance.setName(eventReceived.getName());
			moduleInstance.getOperations().add(eventReceiversInstance);
		} else if (object instanceof VersionedDataRead dataRead) {
			DataReaderInstance dataReaderInstance = EdtimplementationFactory.eINSTANCE.createDataReaderInstance();
			dataReaderInstance.setMTOperationRef(dataRead);
			dataReaderInstance.setName(dataRead.getName());
			moduleInstance.getOperations().add(dataReaderInstance);
		} else if (object instanceof VersionedDataWritten dataWritten) {
			DataWriterInstance dataWriterInstance = EdtimplementationFactory.eINSTANCE.createDataWriterInstance();
			dataWriterInstance.setMTOperationRef(dataWritten);
			dataWriterInstance.setName(dataWritten.getName());
			moduleInstance.getOperations().add(dataWriterInstance);
		} else if (object instanceof RequestSent requestSent) {
			RequestClientInstance requestClientInstance = EdtimplementationFactory.eINSTANCE
					.createRequestClientInstance();
			requestClientInstance.setMTOperationRef(requestSent);
			requestClientInstance.setName(requestSent.getName());
			moduleInstance.getOperations().add(requestClientInstance);
		} else if (object instanceof RequestReceived requestReceived) {
			RequestServerInstance requestServerInstance = EdtimplementationFactory.eINSTANCE
					.createRequestServerInstance();
			requestServerInstance.setMTOperationRef(requestReceived);
			requestServerInstance.setName(requestReceived.getName());
			moduleInstance.getOperations().add(requestServerInstance);
		}
	}

	/**
	 * @param object
	 * @param moduleInstance
	 */
	private void cleanModuleInstanceOperations(Object object, ModuleInstance moduleInstance) {
		EList<OperationInstance> operationsInstances = moduleInstance.getOperations();
		Iterator<OperationInstance> each = operationsInstances.iterator();
		while (each.hasNext()) {
			OperationInstance op = each.next();
			if (Objects.equals(op.getName(), ((ModuleOperation) object).getName())) {
				each.remove();
			}
		}
	}

	/**
	 * 
	 * @return
	 * @generated NOT
	 */
	public EList<ModuleInstance> findAssociatedModuleInstance() {
		EList<ModuleInstance> instanceAssociated = new BasicEList<>();
		if (this.eContainer() != null) {
			ComponentImplementation componentImplementation = (ComponentImplementation) this.eContainer();
			Collection<Setting> crossReferences = EcoreUtil.UsageCrossReferencer.find(this, componentImplementation);
			for (Setting crossReference : crossReferences) {
				if (crossReference.getEObject() instanceof ModuleInstance moduleInstance) {
					instanceAssociated.add(moduleInstance);
				}
			}
		}
		return instanceAssociated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActivatingFaultNotifs() {
		return activatingFaultNotifs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivatingFaultNotifs(boolean newActivatingFaultNotifs) {
		boolean oldActivatingFaultNotifs = activatingFaultNotifs;
		activatingFaultNotifs = newActivatingFaultNotifs;
		boolean oldActivatingFaultNotifsESet = activatingFaultNotifsESet;
		activatingFaultNotifsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS, oldActivatingFaultNotifs, activatingFaultNotifs, !oldActivatingFaultNotifsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActivatingFaultNotifs() {
		boolean oldActivatingFaultNotifs = activatingFaultNotifs;
		boolean oldActivatingFaultNotifsESet = activatingFaultNotifsESet;
		activatingFaultNotifs = ACTIVATING_FAULT_NOTIFS_EDEFAULT;
		activatingFaultNotifsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS, oldActivatingFaultNotifs, ACTIVATING_FAULT_NOTIFS_EDEFAULT, oldActivatingFaultNotifsESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActivatingFaultNotifs() {
		return activatingFaultNotifsESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasUserContext() {
		return hasUserContext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasUserContext(boolean newHasUserContext) {
		boolean oldHasUserContext = hasUserContext;
		hasUserContext = newHasUserContext;
		boolean oldHasUserContextESet = hasUserContextESet;
		hasUserContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT, oldHasUserContext, hasUserContext, !oldHasUserContextESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasUserContext() {
		boolean oldHasUserContext = hasUserContext;
		boolean oldHasUserContextESet = hasUserContextESet;
		hasUserContext = HAS_USER_CONTEXT_EDEFAULT;
		hasUserContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT, oldHasUserContext, HAS_USER_CONTEXT_EDEFAULT, oldHasUserContextESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasUserContext() {
		return hasUserContextESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasWarmStartContext() {
		return hasWarmStartContext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasWarmStartContext(boolean newHasWarmStartContext) {
		boolean oldHasWarmStartContext = hasWarmStartContext;
		hasWarmStartContext = newHasWarmStartContext;
		boolean oldHasWarmStartContextESet = hasWarmStartContextESet;
		hasWarmStartContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT, oldHasWarmStartContext, hasWarmStartContext, !oldHasWarmStartContextESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHasWarmStartContext() {
		boolean oldHasWarmStartContext = hasWarmStartContext;
		boolean oldHasWarmStartContextESet = hasWarmStartContextESet;
		hasWarmStartContext = HAS_WARM_START_CONTEXT_EDEFAULT;
		hasWarmStartContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT, oldHasWarmStartContext, HAS_WARM_START_CONTEXT_EDEFAULT, oldHasWarmStartContextESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHasWarmStartContext() {
		return hasWarmStartContextESet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFaultHandler() {
		return isFaultHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFaultHandler(boolean newIsFaultHandler) {
		boolean oldIsFaultHandler = isFaultHandler;
		isFaultHandler = newIsFaultHandler;
		boolean oldIsFaultHandlerESet = isFaultHandlerESet;
		isFaultHandlerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER, oldIsFaultHandler, isFaultHandler, !oldIsFaultHandlerESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsFaultHandler() {
		boolean oldIsFaultHandler = isFaultHandler;
		boolean oldIsFaultHandlerESet = isFaultHandlerESet;
		isFaultHandler = IS_FAULT_HANDLER_EDEFAULT;
		isFaultHandlerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER, oldIsFaultHandler, IS_FAULT_HANDLER_EDEFAULT, oldIsFaultHandlerESet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsFaultHandler() {
		return isFaultHandlerESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdtimplementationPackage.MODULE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdtimplementationPackage.MODULE_TYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
				return ((InternalEList<?>)getPinfo()).basicRemove(otherEnd, msgs);
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
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
			case EdtimplementationPackage.MODULE_TYPE__PROPERTIES:
				return getProperties();
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
				return getPinfo();
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
				return getOperations();
			case EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				return isActivatingFaultNotifs();
			case EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				return isHasUserContext();
			case EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				return isHasWarmStartContext();
			case EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				return isIsFaultHandler();
			case EdtimplementationPackage.MODULE_TYPE__NAME:
				return getName();
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
			case EdtimplementationPackage.MODULE_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ModuleTypeProperty>)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
				getPinfo().clear();
				getPinfo().addAll((Collection<? extends ModuleTypePinfo>)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ModuleOperation>)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				setActivatingFaultNotifs((Boolean)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				setHasUserContext((Boolean)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				setHasWarmStartContext((Boolean)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				setIsFaultHandler((Boolean)newValue);
				return;
			case EdtimplementationPackage.MODULE_TYPE__NAME:
				setName((String)newValue);
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
			case EdtimplementationPackage.MODULE_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
				getPinfo().clear();
				return;
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
				getOperations().clear();
				return;
			case EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				unsetActivatingFaultNotifs();
				return;
			case EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				unsetHasUserContext();
				return;
			case EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				unsetHasWarmStartContext();
				return;
			case EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				unsetIsFaultHandler();
				return;
			case EdtimplementationPackage.MODULE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case EdtimplementationPackage.MODULE_TYPE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case EdtimplementationPackage.MODULE_TYPE__PINFO:
				return pinfo != null && !pinfo.isEmpty();
			case EdtimplementationPackage.MODULE_TYPE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case EdtimplementationPackage.MODULE_TYPE__ACTIVATING_FAULT_NOTIFS:
				return isSetActivatingFaultNotifs();
			case EdtimplementationPackage.MODULE_TYPE__HAS_USER_CONTEXT:
				return isSetHasUserContext();
			case EdtimplementationPackage.MODULE_TYPE__HAS_WARM_START_CONTEXT:
				return isSetHasWarmStartContext();
			case EdtimplementationPackage.MODULE_TYPE__IS_FAULT_HANDLER:
				return isSetIsFaultHandler();
			case EdtimplementationPackage.MODULE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (activatingFaultNotifs: ");
		if (activatingFaultNotifsESet) result.append(activatingFaultNotifs); else result.append("<unset>");
		result.append(", hasUserContext: ");
		if (hasUserContextESet) result.append(hasUserContext); else result.append("<unset>");
		result.append(", hasWarmStartContext: ");
		if (hasWarmStartContextESet) result.append(hasWarmStartContext); else result.append("<unset>");
		result.append(", isFaultHandler: ");
		if (isFaultHandlerESet) result.append(isFaultHandler); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * 
	 * @param edtPropertyTypes
	 * @param propertyValueName
	 * @return
	 */
	public edtimplementation.ModuleTypeProperty findPropertyTypeByName(String propertyValueName) {
		for (edtimplementation.ModuleTypeProperty propertyType : properties) {
			if (Objects.equals(propertyType.getName(), propertyValueName)) {
				return propertyType;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param privatePinfos
	 * @param privatePinfoValueName
	 * @return
	 */
	public edtimplementation.PrivatePinfo findPrivatePinfoByName(String privatePinfoValueName) {
		for (ModuleTypePinfo pinfo : pinfo) {
			if (pinfo instanceof edtimplementation.PrivatePinfo privatePinfo
					&& Objects.equals(privatePinfo.getName(), privatePinfoValueName)) {
				return privatePinfo;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param publicPinfos
	 * @param publicPinfoValueName
	 * @return
	 */
	public edtimplementation.PublicPinfo findPublicPinfoByName(String publicPinfoValueName) {
		for (ModuleTypePinfo pinfo : pinfo) {
			if (pinfo instanceof edtimplementation.PublicPinfo publicPinfo
					&& Objects.equals(publicPinfo.getName(), publicPinfoValueName)) {
				return publicPinfo;
			}
		}
		return null;
	}

}
// ModuleTypeImpl
