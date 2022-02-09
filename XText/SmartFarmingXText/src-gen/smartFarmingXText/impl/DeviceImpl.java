/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import smartFarmingXText.Device;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.DeviceImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link smartFarmingXText.impl.DeviceImpl#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link smartFarmingXText.impl.DeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link smartFarmingXText.impl.DeviceImpl#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeviceImpl extends NamedImpl implements Device {
	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.DEVICE__DEVICE_ID,
					oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPAddress(String newIPAddress) {
		String oldIPAddress = ipAddress;
		ipAddress = newIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.DEVICE__IP_ADDRESS,
					oldIPAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.DEVICE__MANUFACTURER,
					oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTSystem getIoTSystem() {
		if (eContainerFeatureID() != SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM)
			return null;
		return (IoTSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoTSystem(IoTSystem newIoTSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIoTSystem, SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoTSystem(IoTSystem newIoTSystem) {
		if (newIoTSystem != eInternalContainer()
				|| (eContainerFeatureID() != SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM && newIoTSystem != null)) {
			if (EcoreUtil.isAncestor(this, newIoTSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIoTSystem != null)
				msgs = ((InternalEObject) newIoTSystem).eInverseAdd(this, SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES,
						IoTSystem.class, msgs);
			msgs = basicSetIoTSystem(newIoTSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM,
					newIoTSystem, newIoTSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DeviceUniqueID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Device::DeviceUniqueID";
		try {
			/**
			 *
			 * inv DeviceUniqueID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.IoTSystem.Devices->select(x | x.DeviceID = self.DeviceID)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ IoTSystem IoTSystem = this.getIoTSystem();
				final /*@NonInvalid*/ List<Device> Devices = IoTSystem.getDevices();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Devices = idResolver
						.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Device, Devices);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(SmartFarmingXTextTables.ORD_CLSSid_Device);
				Iterator<Object> ITERATOR_x = BOXED_Devices.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Device x = (Device) ITERATOR_x.next();
					/**
					 * x.DeviceID = self.DeviceID
					 */
					final /*@NonInvalid*/ String DeviceID = x.getDeviceID();
					final /*@NonInvalid*/ String DeviceID_0 = this.getDeviceID();
					final /*@NonInvalid*/ boolean eq = (DeviceID != null) ? DeviceID.equals(DeviceID_0)
							: (DeviceID_0 == null);
					//
					if (eq) {
						accumulator.add(x);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
				final /*@NonInvalid*/ boolean result = size.equals(SmartFarmingXTextTables.INT_1);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SmartFarmingXTextTables.INT_0)
						.booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DeviceMustHaveID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Device::DeviceMustHaveID";
		try {
			/**
			 *
			 * inv DeviceMustHaveID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not DeviceID.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ String DeviceID = this.getDeviceID();
				final /*@NonInvalid*/ boolean oclIsUndefined = DeviceID == null;
				final /*@NonInvalid*/ Boolean result;
				if (!oclIsUndefined) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					if (oclIsUndefined) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						result = null;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SmartFarmingXTextTables.INT_0)
						.booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetIoTSystem((IoTSystem) otherEnd, msgs);
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
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			return basicSetIoTSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			return eInternalContainer().eInverseRemove(this, SmartFarmingXTextPackage.IO_TSYSTEM__DEVICES,
					IoTSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.DEVICE__DEVICE_ID:
			return getDeviceID();
		case SmartFarmingXTextPackage.DEVICE__IP_ADDRESS:
			return getIPAddress();
		case SmartFarmingXTextPackage.DEVICE__MANUFACTURER:
			return getManufacturer();
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			return getIoTSystem();
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
		case SmartFarmingXTextPackage.DEVICE__DEVICE_ID:
			setDeviceID((String) newValue);
			return;
		case SmartFarmingXTextPackage.DEVICE__IP_ADDRESS:
			setIPAddress((String) newValue);
			return;
		case SmartFarmingXTextPackage.DEVICE__MANUFACTURER:
			setManufacturer((String) newValue);
			return;
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			setIoTSystem((IoTSystem) newValue);
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
		case SmartFarmingXTextPackage.DEVICE__DEVICE_ID:
			setDeviceID(DEVICE_ID_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.DEVICE__IP_ADDRESS:
			setIPAddress(IP_ADDRESS_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.DEVICE__MANUFACTURER:
			setManufacturer(MANUFACTURER_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			setIoTSystem((IoTSystem) null);
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
		case SmartFarmingXTextPackage.DEVICE__DEVICE_ID:
			return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
		case SmartFarmingXTextPackage.DEVICE__IP_ADDRESS:
			return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
		case SmartFarmingXTextPackage.DEVICE__MANUFACTURER:
			return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
		case SmartFarmingXTextPackage.DEVICE__IO_TSYSTEM:
			return getIoTSystem() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SmartFarmingXTextPackage.DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP:
			return DeviceUniqueID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SmartFarmingXTextPackage.DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP:
			return DeviceMustHaveID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (DeviceID: ");
		result.append(deviceID);
		result.append(", IPAddress: ");
		result.append(ipAddress);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
