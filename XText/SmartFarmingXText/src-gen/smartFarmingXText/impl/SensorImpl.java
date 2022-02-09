/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import smartFarmingXText.CommunicationProtocol;
import smartFarmingXText.Monitoring;
import smartFarmingXText.Sensor;
import smartFarmingXText.SensorState;
import smartFarmingXText.SensorType;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.SensorImpl#getType <em>Type</em>}</li>
 *   <li>{@link smartFarmingXText.impl.SensorImpl#getState <em>State</em>}</li>
 *   <li>{@link smartFarmingXText.impl.SensorImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link smartFarmingXText.impl.SensorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link smartFarmingXText.impl.SensorImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends DeviceImpl implements Sensor {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SensorType TYPE_EDEFAULT = SensorType.TEMPERATURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SensorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SensorState STATE_EDEFAULT = SensorState.ACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SensorState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationProtocol protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SensorType newType) {
		SensorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SENSOR__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SensorState newState) {
		SensorState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SENSOR__STATE, oldState,
					state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SENSOR__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SENSOR__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject) protocol;
			protocol = (CommunicationProtocol) eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmartFarmingXTextPackage.SENSOR__PROTOCOL,
							oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommunicationProtocol newProtocol) {
		CommunicationProtocol oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.SENSOR__PROTOCOL,
					oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isUsed() {
		/**
		 *
		 * Monitoring.allInstances()
		 * ->select(x |
		 *   x.Sensors->exists(sensor | (sensor = self)))
		 * ->size() > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_smartFarmingXText_c_c_Monitoring_0 = idResolver
				.getClass(SmartFarmingXTextTables.CLSSid_Monitoring, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				SmartFarmingXTextTables.SET_CLSSid_Monitoring, TYP_smartFarmingXText_c_c_Monitoring_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSetAccumulatorValue(SmartFarmingXTextTables.SET_CLSSid_Monitoring);
		Iterator<Object> ITERATOR_x = allInstances.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR_x.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Monitoring x = (Monitoring) ITERATOR_x.next();
			/**
			 * x.Sensors->exists(sensor | sensor = self)
			 */
			final /*@NonInvalid*/ List<Sensor> Sensors = x.getSensors();
			final /*@NonInvalid*/ OrderedSetValue BOXED_Sensors = idResolver
					.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Sensor, Sensors);
			/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_sensor = BOXED_Sensors.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_sensor.hasNext()) {
					if (accumulator_0 == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator_0;
					}
					break;
				}
				/*@NonInvalid*/ Sensor sensor = (Sensor) ITERATOR_sensor.next();
				/**
				 * sensor = self
				 */
				final /*@NonInvalid*/ boolean eq = sensor.equals(this);
				//
				if (eq) { // Normal successful body evaluation result
					exists = ValueUtil.TRUE_VALUE;
					break; // Stop immediately
				} else if (!eq) { // Normal unsuccessful body evaluation result
					; // Carry on
				} else { // Impossible badly typed result
					accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
				}
			}
			if (exists == null) {
				throw new InvalidValueException(
						"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
			}
			//
			if (exists == ValueUtil.TRUE_VALUE) {
				accumulator.add(x);
			}
		}
		final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
				.evaluate(executor, size, SmartFarmingXTextTables.INT_0).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SensorMinusConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Sensor::SensorMinusConstraint";
		try {
			/**
			 *
			 * inv SensorMinusConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if self.Type = SensorType::Temperature
			 *         then true
			 *         else self.Value > 0
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SmartFarmingXTextPackage.Literals.SENSOR___SENSOR_MINUS_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SmartFarmingXTextTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			} else {
				final /*@NonInvalid*/ SensorType Type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_Type = Type == null ? null
						: SmartFarmingXTextTables.ENUMid_SensorType
								.getEnumerationLiteralId(ClassUtil.nonNullState(Type.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_Type == SmartFarmingXTextTables.ELITid_Temperature;
				/*@NonInvalid*/ boolean result;
				if (eq) {
					result = true;
				} else {
					final /*@NonInvalid*/ float Value = this.getValue();
					final /*@NonInvalid*/ RealValue BOXED_Value = ValueUtil.realValueOf(Value);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, BOXED_Value, SmartFarmingXTextTables.INT_0).booleanValue();
					result = gt;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.SENSOR__TYPE:
			return getType();
		case SmartFarmingXTextPackage.SENSOR__STATE:
			return getState();
		case SmartFarmingXTextPackage.SENSOR__UNIT:
			return getUnit();
		case SmartFarmingXTextPackage.SENSOR__VALUE:
			return getValue();
		case SmartFarmingXTextPackage.SENSOR__PROTOCOL:
			if (resolve)
				return getProtocol();
			return basicGetProtocol();
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
		case SmartFarmingXTextPackage.SENSOR__TYPE:
			setType((SensorType) newValue);
			return;
		case SmartFarmingXTextPackage.SENSOR__STATE:
			setState((SensorState) newValue);
			return;
		case SmartFarmingXTextPackage.SENSOR__UNIT:
			setUnit((String) newValue);
			return;
		case SmartFarmingXTextPackage.SENSOR__VALUE:
			setValue((Float) newValue);
			return;
		case SmartFarmingXTextPackage.SENSOR__PROTOCOL:
			setProtocol((CommunicationProtocol) newValue);
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
		case SmartFarmingXTextPackage.SENSOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SENSOR__STATE:
			setState(STATE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SENSOR__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SENSOR__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.SENSOR__PROTOCOL:
			setProtocol((CommunicationProtocol) null);
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
		case SmartFarmingXTextPackage.SENSOR__TYPE:
			return type != TYPE_EDEFAULT;
		case SmartFarmingXTextPackage.SENSOR__STATE:
			return state != STATE_EDEFAULT;
		case SmartFarmingXTextPackage.SENSOR__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case SmartFarmingXTextPackage.SENSOR__VALUE:
			return value != VALUE_EDEFAULT;
		case SmartFarmingXTextPackage.SENSOR__PROTOCOL:
			return protocol != null;
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
		case SmartFarmingXTextPackage.SENSOR___IS_USED:
			return isUsed();
		case SmartFarmingXTextPackage.SENSOR___SENSOR_MINUS_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return SensorMinusConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (Type: ");
		result.append(type);
		result.append(", State: ");
		result.append(state);
		result.append(", Unit: ");
		result.append(unit);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
