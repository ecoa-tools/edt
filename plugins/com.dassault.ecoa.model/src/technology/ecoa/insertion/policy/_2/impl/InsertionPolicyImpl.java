/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 *
 */

package technology.ecoa.insertion.policy._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import technology.ecoa.insertion.policy._2.DefaultPINFO;
import technology.ecoa.insertion.policy._2.DefaultProperties;
import technology.ecoa.insertion.policy._2.DeploymentConstraints;
import technology.ecoa.insertion.policy._2.ECOAProfile;
import technology.ecoa.insertion.policy._2.ExtraConcerns;
import technology.ecoa.insertion.policy._2.InsertionPolicy;
import technology.ecoa.insertion.policy._2.MemoryUsage;
import technology.ecoa.insertion.policy._2.ModulesDependencies;
import technology.ecoa.insertion.policy._2.RealtimeCharacteristics;
import technology.ecoa.insertion.policy._2.RegisterSize;
import technology.ecoa.insertion.policy._2.TimeAccuracy;
import technology.ecoa.insertion.policy._2.TransportProtocol;
import technology.ecoa.insertion.policy._2.polPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insertion Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getProcessorTarget <em>Processor Target</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getRegisterSize <em>Register Size</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getRealtimeCharacteristics <em>Realtime Characteristics</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getTimeAccuracy <em>Time Accuracy</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getTransportProtocol <em>Transport Protocol</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getDeploymentConstraints <em>Deployment Constraints</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getECOAProfile <em>ECOA Profile</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getGenericCompilationOptions <em>Generic Compilation Options</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getModulesDependencies <em>Modules Dependencies</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getExtraConcerns <em>Extra Concerns</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getDefaultPINFO <em>Default PINFO</em>}</li>
 *   <li>{@link technology.ecoa.insertion.policy._2.impl.InsertionPolicyImpl#getDefaultProperties <em>Default Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertionPolicyImpl extends MinimalEObjectImpl.Container implements InsertionPolicy {
	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessorTarget() <em>Processor Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject processorTarget;

	/**
	 * The cached value of the '{@link #getRegisterSize() <em>Register Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterSize()
	 * @generated
	 * @ordered
	 */
	protected RegisterSize registerSize;

	/**
	 * The cached value of the '{@link #getMemoryUsage() <em>Memory Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected MemoryUsage memoryUsage;

	/**
	 * The cached value of the '{@link #getRealtimeCharacteristics() <em>Realtime Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealtimeCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected RealtimeCharacteristics realtimeCharacteristics;

	/**
	 * The cached value of the '{@link #getTimeAccuracy() <em>Time Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAccuracy()
	 * @generated
	 * @ordered
	 */
	protected TimeAccuracy timeAccuracy;

	/**
	 * The cached value of the '{@link #getTransportProtocol() <em>Transport Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportProtocol()
	 * @generated
	 * @ordered
	 */
	protected TransportProtocol transportProtocol;

	/**
	 * The cached value of the '{@link #getDeploymentConstraints() <em>Deployment Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentConstraints()
	 * @generated
	 * @ordered
	 */
	protected DeploymentConstraints deploymentConstraints;

	/**
	 * The cached value of the '{@link #getECOAProfile() <em>ECOA Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECOAProfile()
	 * @generated
	 * @ordered
	 */
	protected ECOAProfile eCOAProfile;

	/**
	 * The cached value of the '{@link #getCompiler() <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected technology.ecoa.insertion.policy._2.Compiler compiler;

	/**
	 * The default value of the '{@link #getGenericCompilationOptions() <em>Generic Compilation Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericCompilationOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERIC_COMPILATION_OPTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenericCompilationOptions() <em>Generic Compilation Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericCompilationOptions()
	 * @generated
	 * @ordered
	 */
	protected String genericCompilationOptions = GENERIC_COMPILATION_OPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModulesDependencies() <em>Modules Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulesDependencies()
	 * @generated
	 * @ordered
	 */
	protected ModulesDependencies modulesDependencies;

	/**
	 * The cached value of the '{@link #getExtraConcerns() <em>Extra Concerns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraConcerns()
	 * @generated
	 * @ordered
	 */
	protected ExtraConcerns extraConcerns;

	/**
	 * The cached value of the '{@link #getDefaultPINFO() <em>Default PINFO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPINFO()
	 * @generated
	 * @ordered
	 */
	protected DefaultPINFO defaultPINFO;

	/**
	 * The cached value of the '{@link #getDefaultProperties() <em>Default Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultProperties()
	 * @generated
	 * @ordered
	 */
	protected DefaultProperties defaultProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertionPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return polPackage.Literals.INSERTION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getProcessorTarget() {
		return processorTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorTarget(EObject newProcessorTarget, NotificationChain msgs) {
		EObject oldProcessorTarget = processorTarget;
		processorTarget = newProcessorTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__PROCESSOR_TARGET, oldProcessorTarget, newProcessorTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorTarget(EObject newProcessorTarget) {
		if (newProcessorTarget != processorTarget) {
			NotificationChain msgs = null;
			if (processorTarget != null)
				msgs = ((InternalEObject)processorTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__PROCESSOR_TARGET, null, msgs);
			if (newProcessorTarget != null)
				msgs = ((InternalEObject)newProcessorTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__PROCESSOR_TARGET, null, msgs);
			msgs = basicSetProcessorTarget(newProcessorTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__PROCESSOR_TARGET, newProcessorTarget, newProcessorTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterSize getRegisterSize() {
		return registerSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterSize(RegisterSize newRegisterSize, NotificationChain msgs) {
		RegisterSize oldRegisterSize = registerSize;
		registerSize = newRegisterSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__REGISTER_SIZE, oldRegisterSize, newRegisterSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterSize(RegisterSize newRegisterSize) {
		if (newRegisterSize != registerSize) {
			NotificationChain msgs = null;
			if (registerSize != null)
				msgs = ((InternalEObject)registerSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__REGISTER_SIZE, null, msgs);
			if (newRegisterSize != null)
				msgs = ((InternalEObject)newRegisterSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__REGISTER_SIZE, null, msgs);
			msgs = basicSetRegisterSize(newRegisterSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__REGISTER_SIZE, newRegisterSize, newRegisterSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryUsage getMemoryUsage() {
		return memoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryUsage(MemoryUsage newMemoryUsage, NotificationChain msgs) {
		MemoryUsage oldMemoryUsage = memoryUsage;
		memoryUsage = newMemoryUsage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__MEMORY_USAGE, oldMemoryUsage, newMemoryUsage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsage(MemoryUsage newMemoryUsage) {
		if (newMemoryUsage != memoryUsage) {
			NotificationChain msgs = null;
			if (memoryUsage != null)
				msgs = ((InternalEObject)memoryUsage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__MEMORY_USAGE, null, msgs);
			if (newMemoryUsage != null)
				msgs = ((InternalEObject)newMemoryUsage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__MEMORY_USAGE, null, msgs);
			msgs = basicSetMemoryUsage(newMemoryUsage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__MEMORY_USAGE, newMemoryUsage, newMemoryUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeCharacteristics getRealtimeCharacteristics() {
		return realtimeCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealtimeCharacteristics(RealtimeCharacteristics newRealtimeCharacteristics, NotificationChain msgs) {
		RealtimeCharacteristics oldRealtimeCharacteristics = realtimeCharacteristics;
		realtimeCharacteristics = newRealtimeCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS, oldRealtimeCharacteristics, newRealtimeCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealtimeCharacteristics(RealtimeCharacteristics newRealtimeCharacteristics) {
		if (newRealtimeCharacteristics != realtimeCharacteristics) {
			NotificationChain msgs = null;
			if (realtimeCharacteristics != null)
				msgs = ((InternalEObject)realtimeCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS, null, msgs);
			if (newRealtimeCharacteristics != null)
				msgs = ((InternalEObject)newRealtimeCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS, null, msgs);
			msgs = basicSetRealtimeCharacteristics(newRealtimeCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS, newRealtimeCharacteristics, newRealtimeCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAccuracy getTimeAccuracy() {
		return timeAccuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAccuracy(TimeAccuracy newTimeAccuracy, NotificationChain msgs) {
		TimeAccuracy oldTimeAccuracy = timeAccuracy;
		timeAccuracy = newTimeAccuracy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__TIME_ACCURACY, oldTimeAccuracy, newTimeAccuracy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAccuracy(TimeAccuracy newTimeAccuracy) {
		if (newTimeAccuracy != timeAccuracy) {
			NotificationChain msgs = null;
			if (timeAccuracy != null)
				msgs = ((InternalEObject)timeAccuracy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__TIME_ACCURACY, null, msgs);
			if (newTimeAccuracy != null)
				msgs = ((InternalEObject)newTimeAccuracy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__TIME_ACCURACY, null, msgs);
			msgs = basicSetTimeAccuracy(newTimeAccuracy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__TIME_ACCURACY, newTimeAccuracy, newTimeAccuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol getTransportProtocol() {
		return transportProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportProtocol(TransportProtocol newTransportProtocol, NotificationChain msgs) {
		TransportProtocol oldTransportProtocol = transportProtocol;
		transportProtocol = newTransportProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL, oldTransportProtocol, newTransportProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportProtocol(TransportProtocol newTransportProtocol) {
		if (newTransportProtocol != transportProtocol) {
			NotificationChain msgs = null;
			if (transportProtocol != null)
				msgs = ((InternalEObject)transportProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL, null, msgs);
			if (newTransportProtocol != null)
				msgs = ((InternalEObject)newTransportProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL, null, msgs);
			msgs = basicSetTransportProtocol(newTransportProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL, newTransportProtocol, newTransportProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConstraints getDeploymentConstraints() {
		return deploymentConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeploymentConstraints(DeploymentConstraints newDeploymentConstraints, NotificationChain msgs) {
		DeploymentConstraints oldDeploymentConstraints = deploymentConstraints;
		deploymentConstraints = newDeploymentConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS, oldDeploymentConstraints, newDeploymentConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentConstraints(DeploymentConstraints newDeploymentConstraints) {
		if (newDeploymentConstraints != deploymentConstraints) {
			NotificationChain msgs = null;
			if (deploymentConstraints != null)
				msgs = ((InternalEObject)deploymentConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS, null, msgs);
			if (newDeploymentConstraints != null)
				msgs = ((InternalEObject)newDeploymentConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS, null, msgs);
			msgs = basicSetDeploymentConstraints(newDeploymentConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS, newDeploymentConstraints, newDeploymentConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECOAProfile getECOAProfile() {
		return eCOAProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECOAProfile(ECOAProfile newECOAProfile, NotificationChain msgs) {
		ECOAProfile oldECOAProfile = eCOAProfile;
		eCOAProfile = newECOAProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__ECOA_PROFILE, oldECOAProfile, newECOAProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECOAProfile(ECOAProfile newECOAProfile) {
		if (newECOAProfile != eCOAProfile) {
			NotificationChain msgs = null;
			if (eCOAProfile != null)
				msgs = ((InternalEObject)eCOAProfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__ECOA_PROFILE, null, msgs);
			if (newECOAProfile != null)
				msgs = ((InternalEObject)newECOAProfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__ECOA_PROFILE, null, msgs);
			msgs = basicSetECOAProfile(newECOAProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__ECOA_PROFILE, newECOAProfile, newECOAProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public technology.ecoa.insertion.policy._2.Compiler getCompiler() {
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompiler(technology.ecoa.insertion.policy._2.Compiler newCompiler, NotificationChain msgs) {
		technology.ecoa.insertion.policy._2.Compiler oldCompiler = compiler;
		compiler = newCompiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__COMPILER, oldCompiler, newCompiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiler(technology.ecoa.insertion.policy._2.Compiler newCompiler) {
		if (newCompiler != compiler) {
			NotificationChain msgs = null;
			if (compiler != null)
				msgs = ((InternalEObject)compiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__COMPILER, null, msgs);
			if (newCompiler != null)
				msgs = ((InternalEObject)newCompiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__COMPILER, null, msgs);
			msgs = basicSetCompiler(newCompiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__COMPILER, newCompiler, newCompiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenericCompilationOptions() {
		return genericCompilationOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericCompilationOptions(String newGenericCompilationOptions) {
		String oldGenericCompilationOptions = genericCompilationOptions;
		genericCompilationOptions = newGenericCompilationOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS, oldGenericCompilationOptions, genericCompilationOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModulesDependencies getModulesDependencies() {
		return modulesDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModulesDependencies(ModulesDependencies newModulesDependencies, NotificationChain msgs) {
		ModulesDependencies oldModulesDependencies = modulesDependencies;
		modulesDependencies = newModulesDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES, oldModulesDependencies, newModulesDependencies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulesDependencies(ModulesDependencies newModulesDependencies) {
		if (newModulesDependencies != modulesDependencies) {
			NotificationChain msgs = null;
			if (modulesDependencies != null)
				msgs = ((InternalEObject)modulesDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES, null, msgs);
			if (newModulesDependencies != null)
				msgs = ((InternalEObject)newModulesDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES, null, msgs);
			msgs = basicSetModulesDependencies(newModulesDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES, newModulesDependencies, newModulesDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtraConcerns getExtraConcerns() {
		return extraConcerns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtraConcerns(ExtraConcerns newExtraConcerns, NotificationChain msgs) {
		ExtraConcerns oldExtraConcerns = extraConcerns;
		extraConcerns = newExtraConcerns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__EXTRA_CONCERNS, oldExtraConcerns, newExtraConcerns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraConcerns(ExtraConcerns newExtraConcerns) {
		if (newExtraConcerns != extraConcerns) {
			NotificationChain msgs = null;
			if (extraConcerns != null)
				msgs = ((InternalEObject)extraConcerns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__EXTRA_CONCERNS, null, msgs);
			if (newExtraConcerns != null)
				msgs = ((InternalEObject)newExtraConcerns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__EXTRA_CONCERNS, null, msgs);
			msgs = basicSetExtraConcerns(newExtraConcerns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__EXTRA_CONCERNS, newExtraConcerns, newExtraConcerns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultPINFO getDefaultPINFO() {
		return defaultPINFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultPINFO(DefaultPINFO newDefaultPINFO, NotificationChain msgs) {
		DefaultPINFO oldDefaultPINFO = defaultPINFO;
		defaultPINFO = newDefaultPINFO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEFAULT_PINFO, oldDefaultPINFO, newDefaultPINFO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPINFO(DefaultPINFO newDefaultPINFO) {
		if (newDefaultPINFO != defaultPINFO) {
			NotificationChain msgs = null;
			if (defaultPINFO != null)
				msgs = ((InternalEObject)defaultPINFO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEFAULT_PINFO, null, msgs);
			if (newDefaultPINFO != null)
				msgs = ((InternalEObject)newDefaultPINFO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEFAULT_PINFO, null, msgs);
			msgs = basicSetDefaultPINFO(newDefaultPINFO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEFAULT_PINFO, newDefaultPINFO, newDefaultPINFO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultProperties getDefaultProperties() {
		return defaultProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultProperties(DefaultProperties newDefaultProperties, NotificationChain msgs) {
		DefaultProperties oldDefaultProperties = defaultProperties;
		defaultProperties = newDefaultProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES, oldDefaultProperties, newDefaultProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultProperties(DefaultProperties newDefaultProperties) {
		if (newDefaultProperties != defaultProperties) {
			NotificationChain msgs = null;
			if (defaultProperties != null)
				msgs = ((InternalEObject)defaultProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES, null, msgs);
			if (newDefaultProperties != null)
				msgs = ((InternalEObject)newDefaultProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES, null, msgs);
			msgs = basicSetDefaultProperties(newDefaultProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES, newDefaultProperties, newDefaultProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
				return basicSetProcessorTarget(null, msgs);
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
				return basicSetRegisterSize(null, msgs);
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
				return basicSetMemoryUsage(null, msgs);
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
				return basicSetRealtimeCharacteristics(null, msgs);
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
				return basicSetTimeAccuracy(null, msgs);
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
				return basicSetTransportProtocol(null, msgs);
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
				return basicSetDeploymentConstraints(null, msgs);
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
				return basicSetECOAProfile(null, msgs);
			case polPackage.INSERTION_POLICY__COMPILER:
				return basicSetCompiler(null, msgs);
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
				return basicSetModulesDependencies(null, msgs);
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
				return basicSetExtraConcerns(null, msgs);
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
				return basicSetDefaultPINFO(null, msgs);
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
				return basicSetDefaultProperties(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY__TARGET:
				return getTarget();
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
				return getProcessorTarget();
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
				return getRegisterSize();
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
				return getMemoryUsage();
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
				return getRealtimeCharacteristics();
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
				return getTimeAccuracy();
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
				return getTransportProtocol();
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
				return getDeploymentConstraints();
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
				return getECOAProfile();
			case polPackage.INSERTION_POLICY__COMPILER:
				return getCompiler();
			case polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS:
				return getGenericCompilationOptions();
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
				return getModulesDependencies();
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
				return getExtraConcerns();
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
				return getDefaultPINFO();
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
				return getDefaultProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY__TARGET:
				setTarget((String)newValue);
				return;
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
				setProcessorTarget((EObject)newValue);
				return;
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
				setRegisterSize((RegisterSize)newValue);
				return;
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
				setMemoryUsage((MemoryUsage)newValue);
				return;
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
				setRealtimeCharacteristics((RealtimeCharacteristics)newValue);
				return;
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
				setTimeAccuracy((TimeAccuracy)newValue);
				return;
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
				setTransportProtocol((TransportProtocol)newValue);
				return;
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
				setDeploymentConstraints((DeploymentConstraints)newValue);
				return;
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
				setECOAProfile((ECOAProfile)newValue);
				return;
			case polPackage.INSERTION_POLICY__COMPILER:
				setCompiler((technology.ecoa.insertion.policy._2.Compiler)newValue);
				return;
			case polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS:
				setGenericCompilationOptions((String)newValue);
				return;
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
				setModulesDependencies((ModulesDependencies)newValue);
				return;
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
				setExtraConcerns((ExtraConcerns)newValue);
				return;
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
				setDefaultPINFO((DefaultPINFO)newValue);
				return;
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
				setDefaultProperties((DefaultProperties)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
				setProcessorTarget((EObject)null);
				return;
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
				setRegisterSize((RegisterSize)null);
				return;
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
				setMemoryUsage((MemoryUsage)null);
				return;
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
				setRealtimeCharacteristics((RealtimeCharacteristics)null);
				return;
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
				setTimeAccuracy((TimeAccuracy)null);
				return;
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
				setTransportProtocol((TransportProtocol)null);
				return;
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
				setDeploymentConstraints((DeploymentConstraints)null);
				return;
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
				setECOAProfile((ECOAProfile)null);
				return;
			case polPackage.INSERTION_POLICY__COMPILER:
				setCompiler((technology.ecoa.insertion.policy._2.Compiler)null);
				return;
			case polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS:
				setGenericCompilationOptions(GENERIC_COMPILATION_OPTIONS_EDEFAULT);
				return;
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
				setModulesDependencies((ModulesDependencies)null);
				return;
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
				setExtraConcerns((ExtraConcerns)null);
				return;
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
				setDefaultPINFO((DefaultPINFO)null);
				return;
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
				setDefaultProperties((DefaultProperties)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case polPackage.INSERTION_POLICY__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case polPackage.INSERTION_POLICY__PROCESSOR_TARGET:
				return processorTarget != null;
			case polPackage.INSERTION_POLICY__REGISTER_SIZE:
				return registerSize != null;
			case polPackage.INSERTION_POLICY__MEMORY_USAGE:
				return memoryUsage != null;
			case polPackage.INSERTION_POLICY__REALTIME_CHARACTERISTICS:
				return realtimeCharacteristics != null;
			case polPackage.INSERTION_POLICY__TIME_ACCURACY:
				return timeAccuracy != null;
			case polPackage.INSERTION_POLICY__TRANSPORT_PROTOCOL:
				return transportProtocol != null;
			case polPackage.INSERTION_POLICY__DEPLOYMENT_CONSTRAINTS:
				return deploymentConstraints != null;
			case polPackage.INSERTION_POLICY__ECOA_PROFILE:
				return eCOAProfile != null;
			case polPackage.INSERTION_POLICY__COMPILER:
				return compiler != null;
			case polPackage.INSERTION_POLICY__GENERIC_COMPILATION_OPTIONS:
				return GENERIC_COMPILATION_OPTIONS_EDEFAULT == null ? genericCompilationOptions != null : !GENERIC_COMPILATION_OPTIONS_EDEFAULT.equals(genericCompilationOptions);
			case polPackage.INSERTION_POLICY__MODULES_DEPENDENCIES:
				return modulesDependencies != null;
			case polPackage.INSERTION_POLICY__EXTRA_CONCERNS:
				return extraConcerns != null;
			case polPackage.INSERTION_POLICY__DEFAULT_PINFO:
				return defaultPINFO != null;
			case polPackage.INSERTION_POLICY__DEFAULT_PROPERTIES:
				return defaultProperties != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (target: ");
		result.append(target);
		result.append(", genericCompilationOptions: ");
		result.append(genericCompilationOptions);
		result.append(')');
		return result.toString();
	}

} //InsertionPolicyImpl
