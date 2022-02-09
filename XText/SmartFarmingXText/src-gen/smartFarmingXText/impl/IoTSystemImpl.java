/**
 */
package smartFarmingXText.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import smartFarmingXText.Device;
import smartFarmingXText.Gateway;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.Service;
import smartFarmingXText.SmartFarmingXTextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Io TSystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.IoTSystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link smartFarmingXText.impl.IoTSystemImpl#getServices <em>Services</em>}</li>
 *   <li>{@link smartFarmingXText.impl.IoTSystemImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link smartFarmingXText.impl.IoTSystemImpl#getGateways <em>Gateways</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IoTSystemImpl extends NamedImpl implements IoTSystem {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getGateways() <em>Gateways</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateways()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> gateways;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.IO_TSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.IO_TSYSTEM__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this,
					SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES, SmartFarmingXTextPackage.SERVICE__IO_TSYSTEM);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentWithInverseEList<Device>(Device.class, this,
					SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES, SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getGateways() {
		if (gateways == null) {
			gateways = new EObjectContainmentWithInverseEList<Gateway>(Gateway.class, this,
					SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS, SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM);
		}
		return gateways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServices()).basicAdd(otherEnd, msgs);
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDevices()).basicAdd(otherEnd, msgs);
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGateways()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			return ((InternalEList<?>) getDevices()).basicRemove(otherEnd, msgs);
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			return ((InternalEList<?>) getGateways()).basicRemove(otherEnd, msgs);
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
		case SmartFarmingXTextPackage.IO_TSYSTEM__VERSION:
			return getVersion();
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			return getServices();
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			return getDevices();
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			return getGateways();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SmartFarmingXTextPackage.IO_TSYSTEM__VERSION:
			setVersion((String) newValue);
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			getDevices().clear();
			getDevices().addAll((Collection<? extends Device>) newValue);
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			getGateways().clear();
			getGateways().addAll((Collection<? extends Gateway>) newValue);
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
		case SmartFarmingXTextPackage.IO_TSYSTEM__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			getServices().clear();
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			getDevices().clear();
			return;
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			getGateways().clear();
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
		case SmartFarmingXTextPackage.IO_TSYSTEM__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case SmartFarmingXTextPackage.IO_TSYSTEM__SERVICES:
			return services != null && !services.isEmpty();
		case SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES:
			return devices != null && !devices.isEmpty();
		case SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS:
			return gateways != null && !gateways.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //IoTSystemImpl
