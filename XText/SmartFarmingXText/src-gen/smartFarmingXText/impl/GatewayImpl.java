/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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

import smartFarmingXText.CommunicationProtocol;
import smartFarmingXText.Device;
import smartFarmingXText.Gateway;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.GatewayImpl#getGatewayID <em>Gateway ID</em>}</li>
 *   <li>{@link smartFarmingXText.impl.GatewayImpl#getModel <em>Model</em>}</li>
 *   <li>{@link smartFarmingXText.impl.GatewayImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link smartFarmingXText.impl.GatewayImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link smartFarmingXText.impl.GatewayImpl#getIoTSystem <em>Io TSystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GatewayImpl extends NamedImpl implements Gateway {
	/**
	 * The default value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayID()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayID()
	 * @generated
	 * @ordered
	 */
	protected String gatewayID = GATEWAY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationProtocol> protocols;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGatewayID() {
		return gatewayID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayID(String newGatewayID) {
		String oldGatewayID = gatewayID;
		gatewayID = newGatewayID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.GATEWAY__GATEWAY_ID,
					oldGatewayID, gatewayID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.GATEWAY__MODEL, oldModel,
					model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationProtocol> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<CommunicationProtocol>(CommunicationProtocol.class, this,
					SmartFarmingXTextPackage.GATEWAY__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, SmartFarmingXTextPackage.GATEWAY__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTSystem getIoTSystem() {
		if (eContainerFeatureID() != SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM)
			return null;
		return (IoTSystem) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoTSystem(IoTSystem newIoTSystem, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIoTSystem, SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoTSystem(IoTSystem newIoTSystem) {
		if (newIoTSystem != eInternalContainer()
				|| (eContainerFeatureID() != SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM && newIoTSystem != null)) {
			if (EcoreUtil.isAncestor(this, newIoTSystem))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIoTSystem != null)
				msgs = ((InternalEObject) newIoTSystem).eInverseAdd(this, SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS,
						IoTSystem.class, msgs);
			msgs = basicSetIoTSystem(newIoTSystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM,
					newIoTSystem, newIoTSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GatewayMustHaveID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Gateway::GatewayMustHaveID";
		try {
			/**
			 *
			 * inv GatewayMustHaveID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = not GatewayID.oclIsUndefined()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.GATEWAY___GATEWAY_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ String GatewayID = this.getGatewayID();
				final /*@NonInvalid*/ boolean oclIsUndefined = GatewayID == null;
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
	public boolean GatewayUniqueID(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Gateway::GatewayUniqueID";
		try {
			/**
			 *
			 * inv GatewayUniqueID:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.IoTSystem.Gateways->select(x | x.GatewayID = self.GatewayID)
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.GATEWAY___GATEWAY_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ IoTSystem IoTSystem = this.getIoTSystem();
				final /*@NonInvalid*/ List<Gateway> Gateways = IoTSystem.getGateways();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Gateways = idResolver
						.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Gateway, Gateways);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createOrderedSetAccumulatorValue(SmartFarmingXTextTables.ORD_CLSSid_Gateway);
				Iterator<Object> ITERATOR_x = BOXED_Gateways.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_x.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Gateway x = (Gateway) ITERATOR_x.next();
					/**
					 * x.GatewayID = self.GatewayID
					 */
					final /*@NonInvalid*/ String GatewayID = x.getGatewayID();
					final /*@NonInvalid*/ String GatewayID_0 = this.getGatewayID();
					final /*@NonInvalid*/ boolean eq = (GatewayID != null) ? GatewayID.equals(GatewayID_0)
							: (GatewayID_0 == null);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.GATEWAY__PROTOCOLS:
			return ((InternalEList<?>) getProtocols()).basicRemove(otherEnd, msgs);
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
			return eInternalContainer().eInverseRemove(this, SmartFarmingXTextPackage.IO_TSYSTEM__GATEWAYS,
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
		case SmartFarmingXTextPackage.GATEWAY__GATEWAY_ID:
			return getGatewayID();
		case SmartFarmingXTextPackage.GATEWAY__MODEL:
			return getModel();
		case SmartFarmingXTextPackage.GATEWAY__PROTOCOLS:
			return getProtocols();
		case SmartFarmingXTextPackage.GATEWAY__DEVICES:
			return getDevices();
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
			return getIoTSystem();
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
		case SmartFarmingXTextPackage.GATEWAY__GATEWAY_ID:
			setGatewayID((String) newValue);
			return;
		case SmartFarmingXTextPackage.GATEWAY__MODEL:
			setModel((String) newValue);
			return;
		case SmartFarmingXTextPackage.GATEWAY__PROTOCOLS:
			getProtocols().clear();
			getProtocols().addAll((Collection<? extends CommunicationProtocol>) newValue);
			return;
		case SmartFarmingXTextPackage.GATEWAY__DEVICES:
			getDevices().clear();
			getDevices().addAll((Collection<? extends Device>) newValue);
			return;
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.GATEWAY__GATEWAY_ID:
			setGatewayID(GATEWAY_ID_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.GATEWAY__MODEL:
			setModel(MODEL_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.GATEWAY__PROTOCOLS:
			getProtocols().clear();
			return;
		case SmartFarmingXTextPackage.GATEWAY__DEVICES:
			getDevices().clear();
			return;
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.GATEWAY__GATEWAY_ID:
			return GATEWAY_ID_EDEFAULT == null ? gatewayID != null : !GATEWAY_ID_EDEFAULT.equals(gatewayID);
		case SmartFarmingXTextPackage.GATEWAY__MODEL:
			return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		case SmartFarmingXTextPackage.GATEWAY__PROTOCOLS:
			return protocols != null && !protocols.isEmpty();
		case SmartFarmingXTextPackage.GATEWAY__DEVICES:
			return devices != null && !devices.isEmpty();
		case SmartFarmingXTextPackage.GATEWAY__IO_TSYSTEM:
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
		case SmartFarmingXTextPackage.GATEWAY___GATEWAY_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP:
			return GatewayMustHaveID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case SmartFarmingXTextPackage.GATEWAY___GATEWAY_UNIQUE_ID__DIAGNOSTICCHAIN_MAP:
			return GatewayUniqueID((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (GatewayID: ");
		result.append(gatewayID);
		result.append(", Model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
