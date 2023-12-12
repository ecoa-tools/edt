/**
 * Copyright (c) 2023 Dassault Aviation
 *
 * SPDX-License-Identifier: MIT
 */
package edtproject.impl;

import java.util.Collection;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edtdeployment.Deployment;
import edtlogical.LogicalSystem;
import edtproject.EDTProjectPackage;
import edtproject.FinalAssembly;
import edtproject.Step5;
import edtudp.UDPBinding;
import edtuid.IDMap;
import temp.CrossPlatformView;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Step5</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edtproject.impl.Step5Impl#getFolderName <em>Folder Name</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getLogicalSystem <em>Logical
 * System</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getDeployment <em>Deployment</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getUDPBindings <em>UDP
 * Bindings</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getCrossPlatformView <em>Cross Platform
 * View</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getIDS <em>IDS</em>}</li>
 * <li>{@link edtproject.impl.Step5Impl#getFinalAssembly <em>Final
 * Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Step5Impl extends MinimalEObjectImpl.Container implements Step5 {
	/**
	 * The default value of the '{@link #getFolderName() <em>Folder Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFolderName() <em>Folder Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFolderName()
	 * @generated
	 * @ordered
	 */
	protected String folderName = FOLDER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalSystem() <em>Logical System</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLogicalSystem()
	 * @generated
	 * @ordered
	 */
	protected LogicalSystem logicalSystem;
	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;
	/**
	 * The cached value of the '{@link #getUDPBindings() <em>UDP Bindings</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUDPBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<UDPBinding> udpBindings;
	/**
	 * The cached value of the '{@link #getCrossPlatformView() <em>Cross Platform
	 * View</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getCrossPlatformView()
	 * @generated
	 * @ordered
	 */
	protected CrossPlatformView crossPlatformView;
	/**
	 * The cached value of the '{@link #getIDS() <em>IDS</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIDS()
	 * @generated
	 * @ordered
	 */
	protected EList<IDMap> ids;
	/**
	 * The cached value of the '{@link #getFinalAssembly() <em>Final Assembly</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFinalAssembly()
	 * @generated
	 * @ordered
	 */
	protected FinalAssembly finalAssembly;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Step5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EDTProjectPackage.Literals.STEP5;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFolderName() {
		return folderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFolderName(String newFolderName) {
		String oldFolderName = folderName;
		folderName = newFolderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP5__FOLDER_NAME, oldFolderName,
					folderName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public LogicalSystem getLogicalSystem() {
		return logicalSystem;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetLogicalSystem(LogicalSystem newLogicalSystem, NotificationChain msgs) {
		LogicalSystem oldLogicalSystem = logicalSystem;
		logicalSystem = newLogicalSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.STEP5__LOGICAL_SYSTEM, oldLogicalSystem, newLogicalSystem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setLogicalSystem(LogicalSystem newLogicalSystem) {
		if (newLogicalSystem != logicalSystem) {
			NotificationChain msgs = null;
			if (logicalSystem != null)
				msgs = ((InternalEObject) logicalSystem).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__LOGICAL_SYSTEM, null, msgs);
			if (newLogicalSystem != null)
				msgs = ((InternalEObject) newLogicalSystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__LOGICAL_SYSTEM, null, msgs);
			msgs = basicSetLogicalSystem(newLogicalSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP5__LOGICAL_SYSTEM,
					newLogicalSystem, newLogicalSystem));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Deployment getDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.STEP5__DEPLOYMENT, oldDeployment, newDeployment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__DEPLOYMENT, null, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__DEPLOYMENT, null, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP5__DEPLOYMENT, newDeployment,
					newDeployment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<UDPBinding> getUDPBindings() {
		if (udpBindings == null) {
			udpBindings = new EObjectContainmentEList<UDPBinding>(UDPBinding.class, this,
					EDTProjectPackage.STEP5__UDP_BINDINGS);
		}
		return udpBindings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FinalAssembly getFinalAssembly() {
		return finalAssembly;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFinalAssembly(FinalAssembly newFinalAssembly, NotificationChain msgs) {
		FinalAssembly oldFinalAssembly = finalAssembly;
		finalAssembly = newFinalAssembly;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.STEP5__FINAL_ASSEMBLY, oldFinalAssembly, newFinalAssembly);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFinalAssembly(FinalAssembly newFinalAssembly) {
		if (newFinalAssembly != finalAssembly) {
			NotificationChain msgs = null;
			if (finalAssembly != null)
				msgs = ((InternalEObject) finalAssembly).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__FINAL_ASSEMBLY, null, msgs);
			if (newFinalAssembly != null)
				msgs = ((InternalEObject) newFinalAssembly).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__FINAL_ASSEMBLY, null, msgs);
			msgs = basicSetFinalAssembly(newFinalAssembly, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP5__FINAL_ASSEMBLY,
					newFinalAssembly, newFinalAssembly));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CrossPlatformView getCrossPlatformView() {
		return crossPlatformView;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCrossPlatformView(CrossPlatformView newCrossPlatformView, NotificationChain msgs) {
		CrossPlatformView oldCrossPlatformView = crossPlatformView;
		crossPlatformView = newCrossPlatformView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW, oldCrossPlatformView, newCrossPlatformView);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCrossPlatformView(CrossPlatformView newCrossPlatformView) {
		if (newCrossPlatformView != crossPlatformView) {
			NotificationChain msgs = null;
			if (crossPlatformView != null)
				msgs = ((InternalEObject) crossPlatformView).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW, null, msgs);
			if (newCrossPlatformView != null)
				msgs = ((InternalEObject) newCrossPlatformView).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW, null, msgs);
			msgs = basicSetCrossPlatformView(newCrossPlatformView, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW,
					newCrossPlatformView, newCrossPlatformView));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<IDMap> getIDS() {
		if (ids == null) {
			ids = new EObjectContainmentEList<IDMap>(IDMap.class, this, EDTProjectPackage.STEP5__IDS);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			return basicSetLogicalSystem(null, msgs);
		case EDTProjectPackage.STEP5__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
		case EDTProjectPackage.STEP5__UDP_BINDINGS:
			return ((InternalEList<?>) getUDPBindings()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			return basicSetCrossPlatformView(null, msgs);
		case EDTProjectPackage.STEP5__IDS:
			return ((InternalEList<?>) getIDS()).basicRemove(otherEnd, msgs);
		case EDTProjectPackage.STEP5__FINAL_ASSEMBLY:
			return basicSetFinalAssembly(null, msgs);
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
		case EDTProjectPackage.STEP5__FOLDER_NAME:
			return getFolderName();
		case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			return getLogicalSystem();
		case EDTProjectPackage.STEP5__DEPLOYMENT:
			return getDeployment();
		case EDTProjectPackage.STEP5__UDP_BINDINGS:
			return getUDPBindings();
		case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			return getCrossPlatformView();
		case EDTProjectPackage.STEP5__IDS:
			return getIDS();
		case EDTProjectPackage.STEP5__FINAL_ASSEMBLY:
			return getFinalAssembly();
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
		case EDTProjectPackage.STEP5__FOLDER_NAME:
			setFolderName((String) newValue);
			return;
		case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			setLogicalSystem((LogicalSystem) newValue);
			return;
		case EDTProjectPackage.STEP5__DEPLOYMENT:
			setDeployment((Deployment) newValue);
			return;
		case EDTProjectPackage.STEP5__UDP_BINDINGS:
			getUDPBindings().clear();
			getUDPBindings().addAll((Collection<? extends UDPBinding>) newValue);
			return;
		case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			setCrossPlatformView((CrossPlatformView) newValue);
			return;
		case EDTProjectPackage.STEP5__IDS:
			getIDS().clear();
			getIDS().addAll((Collection<? extends IDMap>) newValue);
			return;
		case EDTProjectPackage.STEP5__FINAL_ASSEMBLY:
			setFinalAssembly((FinalAssembly) newValue);
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
		case EDTProjectPackage.STEP5__FOLDER_NAME:
			setFolderName(FOLDER_NAME_EDEFAULT);
			return;
		case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			setLogicalSystem((LogicalSystem) null);
			return;
		case EDTProjectPackage.STEP5__DEPLOYMENT:
			setDeployment((Deployment) null);
			return;
		case EDTProjectPackage.STEP5__UDP_BINDINGS:
			getUDPBindings().clear();
			return;
		case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			setCrossPlatformView((CrossPlatformView) null);
			return;
		case EDTProjectPackage.STEP5__IDS:
			getIDS().clear();
			return;
		case EDTProjectPackage.STEP5__FINAL_ASSEMBLY:
			setFinalAssembly((FinalAssembly) null);
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
		case EDTProjectPackage.STEP5__FOLDER_NAME:
			return FOLDER_NAME_EDEFAULT == null ? folderName != null : !FOLDER_NAME_EDEFAULT.equals(folderName);
		case EDTProjectPackage.STEP5__LOGICAL_SYSTEM:
			return logicalSystem != null;
		case EDTProjectPackage.STEP5__DEPLOYMENT:
			return deployment != null;
		case EDTProjectPackage.STEP5__UDP_BINDINGS:
			return udpBindings != null && !udpBindings.isEmpty();
		case EDTProjectPackage.STEP5__CROSS_PLATFORM_VIEW:
			return crossPlatformView != null;
		case EDTProjectPackage.STEP5__IDS:
			return ids != null && !ids.isEmpty();
		case EDTProjectPackage.STEP5__FINAL_ASSEMBLY:
			return finalAssembly != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (FolderName: ");
		result.append(folderName);
		result.append(')');
		return result.toString();
	}

	@Override
	public IDMap findIDMap(String nameID) {
		for (IDMap idMap : this.getIDS()) {
			if (Objects.equals(idMap.getName(), nameID)) {
				return idMap;
			}
		}
		return null;
	}

} // Step5Impl
