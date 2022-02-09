/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.RealValue;

import smartFarmingXText.Controlling;
import smartFarmingXText.Monitoring;
import smartFarmingXText.MonitoringCondition;
import smartFarmingXText.MonitoringMetrics;
import smartFarmingXText.Sensor;
import smartFarmingXText.SensorType;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.MonitoringImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link smartFarmingXText.impl.MonitoringImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link smartFarmingXText.impl.MonitoringImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringImpl extends ServiceImpl implements Monitoring {
	/**
	 * The default value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringMetrics METRICS_EDEFAULT = MonitoringMetrics.NUTRIENT;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected MonitoringMetrics metrics = METRICS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Controlling control;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.MONITORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMetrics getMetrics() {
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetrics(MonitoringMetrics newMetrics) {
		MonitoringMetrics oldMetrics = metrics;
		metrics = newMetrics == null ? METRICS_EDEFAULT : newMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.MONITORING__METRICS,
					oldMetrics, metrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectResolvingEList<Sensor>(Sensor.class, this,
					SmartFarmingXTextPackage.MONITORING__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlling getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject) control;
			control = (Controlling) eResolveProxy(oldControl);
			if (control != oldControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SmartFarmingXTextPackage.MONITORING__CONTROL, oldControl, control));
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlling basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(Controlling newControl) {
		Controlling oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.MONITORING__CONTROL,
					oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float calculateAverage(final SensorType type) {
		/**
		 *
		 * self.Sensors->select(x | (x.Type = type))
		 * ->iterate(x; average : ecore::EFloat[1] = 0 |
		 *   (average + x.Value
		 *   )) /
		 * self.Sensors->select(x | (x.Type = type))
		 * ->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Sensor> Sensors_0 = this.getSensors();
		final /*@NonInvalid*/ OrderedSetValue BOXED_Sensors_0 = idResolver
				.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Sensor, Sensors_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createOrderedSetAccumulatorValue(SmartFarmingXTextTables.ORD_CLSSid_Sensor);
		Iterator<Object> ITERATOR_x_1 = BOXED_Sensors_0.iterator();
		/*@NonInvalid*/ OrderedSetValue select_0;
		while (true) {
			if (!ITERATOR_x_1.hasNext()) {
				select_0 = accumulator;
				break;
			}
			/*@NonInvalid*/ Sensor x_1 = (Sensor) ITERATOR_x_1.next();
			/**
			 * x.Type = type
			 */
			final /*@NonInvalid*/ SensorType Type_0 = x_1.getType();
			final /*@NonInvalid*/ boolean eq_0 = type.equals(Type_0);
			//
			if (eq_0) {
				accumulator.add(x_1);
			}
		}
		/*@NonInvalid*/ RealValue average = SmartFarmingXTextTables.INT_0;
		Iterator<Object> ITERATOR_x_0 = select_0.iterator();
		/*@NonInvalid*/ RealValue iterate;
		while (true) {
			if (!ITERATOR_x_0.hasNext()) {
				iterate = average;
				break;
			}
			/*@NonInvalid*/ Sensor x_0 = (Sensor) ITERATOR_x_0.next();
			/**
			 * average + x.Value
			 */
			final /*@NonInvalid*/ float Value = x_0.getValue();
			final /*@NonInvalid*/ RealValue BOXED_Value = ValueUtil.realValueOf(Value);
			final /*@NonInvalid*/ RealValue sum = NumericPlusOperation.INSTANCE.evaluate(average, BOXED_Value);
			//
			average = sum;
		}
		if (iterate == null) {
			throw new InvalidValueException("Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select_0);
		final /*@Thrown*/ RealValue quot = NumericDivideOperation.INSTANCE.evaluate(iterate, size);
		final /*@Thrown*/ float ECORE_quot = ValueUtil.floatValueOf(quot);
		return ECORE_quot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringCondition checkCondition() {
		/**
		 *
		 * if Metrics = MonitoringMetrics::Nutrient
		 * then
		 *   if calculateAverage(SensorType::EC) < 40.0
		 *   then MonitoringCondition::Danger
		 *   else
		 *     if
		 *       calculateAverage(SensorType::EC) < 55.0 and
		 *       (
		 *         calculateAverage(SensorType::PH) >= -1 and
		 *         calculateAverage(SensorType::PH) < 0 or
		 *         calculateAverage(SensorType::PH) > 3 and
		 *         calculateAverage(SensorType::PH) <= 4
		 *       )
		 *     then MonitoringCondition::Warning
		 *     else
		 *       if
		 *         calculateAverage(SensorType::EC) < 65.0 and
		 *         (
		 *           calculateAverage(SensorType::PH) >= 0 and
		 *           calculateAverage(SensorType::PH) < 1 or
		 *           calculateAverage(SensorType::PH) > 2 and
		 *           calculateAverage(SensorType::PH) <= 3
		 *         )
		 *       then MonitoringCondition::Good
		 *       else
		 *         if
		 *           calculateAverage(SensorType::EC) < 75 and
		 *           calculateAverage(SensorType::PH) >= 1 and
		 *           calculateAverage(SensorType::PH) <= 2
		 *         then MonitoringCondition::Healthy
		 *         else
		 *           if
		 *             calculateAverage(SensorType::EC) >= 75 and
		 *             calculateAverage(SensorType::PH) = 1.5
		 *           then MonitoringCondition::Optimum
		 *           else MonitoringCondition::Danger
		 *           endif
		 *         endif
		 *       endif
		 *     endif
		 *   endif
		 * else
		 *   if Metrics = MonitoringMetrics::EnvironmentalSafety
		 *   then
		 *     if calculateAverage(SensorType::CO2) >= 5000
		 *     then MonitoringCondition::Danger
		 *     else
		 *       if calculateAverage(SensorType::CO2) >= 3000
		 *       then MonitoringCondition::Warning
		 *       else
		 *         if calculateAverage(SensorType::CO2) >= 1500
		 *         then MonitoringCondition::Good
		 *         else
		 *           if calculateAverage(SensorType::CO2) >= 900
		 *           then MonitoringCondition::Healthy
		 *           else MonitoringCondition::Optimum
		 *           endif
		 *         endif
		 *       endif
		 *     endif
		 *   else MonitoringCondition::Invalid
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ MonitoringMetrics Metrics = this.getMetrics();
		final /*@NonInvalid*/ EnumerationLiteralId BOXED_Metrics = Metrics == null ? null
				: SmartFarmingXTextTables.ENUMid_MonitoringMetrics
						.getEnumerationLiteralId(ClassUtil.nonNullState(Metrics.getName()));
		final /*@NonInvalid*/ boolean eq = BOXED_Metrics == SmartFarmingXTextTables.ELITid_Nutrient;
		/*@NonInvalid*/ EnumerationLiteralId symbol_10;
		if (eq) {
			final /*@NonInvalid*/ SensorType ECORE_ELITid_EC = (SensorType) idResolver.ecoreValueOf(Enumerator.class,
					SmartFarmingXTextTables.ELITid_EC);
			final /*@NonInvalid*/ float calculateAverage = this.calculateAverage(ECORE_ELITid_EC);
			final /*@NonInvalid*/ RealValue BOXED_calculateAverage = ValueUtil.realValueOf(calculateAverage);
			final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
					.evaluate(executor, BOXED_calculateAverage, SmartFarmingXTextTables.REA_40_0).booleanValue();
			/*@NonInvalid*/ EnumerationLiteralId symbol_4;
			if (lt) {
				symbol_4 = SmartFarmingXTextTables.ELITid_Danger;
			} else {
				final /*@NonInvalid*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
						.evaluate(executor, BOXED_calculateAverage, SmartFarmingXTextTables.REA_55_0).booleanValue();
				final /*@Thrown*/ Boolean and_1;
				if (!lt_0) {
					and_1 = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_or;
					try {
						final /*@NonInvalid*/ SensorType ECORE_ELITid_PH_0 = (SensorType) idResolver
								.ecoreValueOf(Enumerator.class, SmartFarmingXTextTables.ELITid_PH);
						final /*@NonInvalid*/ float calculateAverage_2 = this.calculateAverage(ECORE_ELITid_PH_0);
						final /*@NonInvalid*/ RealValue BOXED_calculateAverage_2 = ValueUtil
								.realValueOf(calculateAverage_2);
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(SmartFarmingXTextTables.INT_1);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_calculateAverage_2, diff).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean lt_1 = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage_2, SmartFarmingXTextTables.INT_0)
									.booleanValue();
							if (!lt_1) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean or;
						if (and == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage_2, SmartFarmingXTextTables.INT_3)
									.booleanValue();
							final /*@NonInvalid*/ Boolean and_0;
							if (!gt) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
										.evaluate(executor, BOXED_calculateAverage_2, SmartFarmingXTextTables.INT_4)
										.booleanValue();
								if (!le) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
							if (and_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								if ((and == null) || (and_0 == null)) {
									or = null;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or = or;
					} catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_or == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_or instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_or;
						}
						if (CAUGHT_or == null) {
							and_1 = null;
						} else {
							and_1 = ValueUtil.TRUE_VALUE;
						}
					}
				}
				if (and_1 == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ EnumerationLiteralId symbol_3;
				if (and_1) {
					symbol_3 = SmartFarmingXTextTables.ELITid_Warning;
				} else {
					final /*@NonInvalid*/ boolean lt_2 = OclComparableLessThanOperation.INSTANCE
							.evaluate(executor, BOXED_calculateAverage, SmartFarmingXTextTables.REA_65_0)
							.booleanValue();
					final /*@Thrown*/ Boolean and_4;
					if (!lt_2) {
						and_4 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or_0;
						try {
							final /*@NonInvalid*/ SensorType ECORE_ELITid_PH_4 = (SensorType) idResolver
									.ecoreValueOf(Enumerator.class, SmartFarmingXTextTables.ELITid_PH);
							final /*@NonInvalid*/ float calculateAverage_7 = this.calculateAverage(ECORE_ELITid_PH_4);
							final /*@NonInvalid*/ RealValue BOXED_calculateAverage_7 = ValueUtil
									.realValueOf(calculateAverage_7);
							final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage_7, SmartFarmingXTextTables.INT_0)
									.booleanValue();
							final /*@NonInvalid*/ Boolean and_2;
							if (!ge_0) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean lt_3 = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, BOXED_calculateAverage_7, SmartFarmingXTextTables.INT_1)
										.booleanValue();
								if (!lt_3) {
									and_2 = ValueUtil.FALSE_VALUE;
								} else {
									and_2 = ValueUtil.TRUE_VALUE;
								}
							}
							final /*@Thrown*/ Boolean or_0;
							if (and_2 == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, BOXED_calculateAverage_7, SmartFarmingXTextTables.INT_2)
										.booleanValue();
								final /*@NonInvalid*/ Boolean and_3;
								if (!gt_0) {
									and_3 = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
											.evaluate(executor, BOXED_calculateAverage_7, SmartFarmingXTextTables.INT_3)
											.booleanValue();
									if (!le_0) {
										and_3 = ValueUtil.FALSE_VALUE;
									} else {
										and_3 = ValueUtil.TRUE_VALUE;
									}
								}
								if (and_3 == ValueUtil.TRUE_VALUE) {
									or_0 = ValueUtil.TRUE_VALUE;
								} else {
									if ((and_2 == null) || (and_3 == null)) {
										or_0 = null;
									} else {
										or_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_0 = or_0;
						} catch (Exception e) {
							CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or_0 == ValueUtil.FALSE_VALUE) {
							and_4 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or_0;
							}
							if (CAUGHT_or_0 == null) {
								and_4 = null;
							} else {
								and_4 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					if (and_4 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@NonInvalid*/ EnumerationLiteralId symbol_2;
					if (and_4) {
						symbol_2 = SmartFarmingXTextTables.ELITid_Good;
					} else {
						final /*@NonInvalid*/ SensorType ECORE_ELITid_PH_8 = (SensorType) idResolver
								.ecoreValueOf(Enumerator.class, SmartFarmingXTextTables.ELITid_PH);
						final /*@NonInvalid*/ float calculateAverage_12 = this.calculateAverage(ECORE_ELITid_PH_8);
						final /*@NonInvalid*/ RealValue BOXED_calculateAverage_12 = ValueUtil
								.realValueOf(calculateAverage_12);
						final /*@NonInvalid*/ boolean lt_4 = OclComparableLessThanOperation.INSTANCE
								.evaluate(executor, BOXED_calculateAverage, SmartFarmingXTextTables.INT_75)
								.booleanValue();
						final /*@Thrown*/ Boolean and_6;
						if (!lt_4) {
							and_6 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ge_1 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage_12, SmartFarmingXTextTables.INT_1)
									.booleanValue();
							final /*@NonInvalid*/ Boolean and_5;
							if (!ge_1) {
								and_5 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
										.evaluate(executor, BOXED_calculateAverage_12, SmartFarmingXTextTables.INT_2)
										.booleanValue();
								if (!le_1) {
									and_5 = ValueUtil.FALSE_VALUE;
								} else {
									and_5 = ValueUtil.TRUE_VALUE;
								}
							}
							if (and_5 == ValueUtil.FALSE_VALUE) {
								and_6 = ValueUtil.FALSE_VALUE;
							} else {
								if (and_5 == null) {
									and_6 = null;
								} else {
									and_6 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and_6 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@NonInvalid*/ EnumerationLiteralId symbol_1;
						if (and_6) {
							symbol_1 = SmartFarmingXTextTables.ELITid_Healthy;
						} else {
							final /*@NonInvalid*/ boolean ge_2 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage, SmartFarmingXTextTables.INT_75)
									.booleanValue();
							final /*@NonInvalid*/ Boolean and_7;
							if (!ge_2) {
								and_7 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ boolean eq_0 = BOXED_calculateAverage_12
										.equals(SmartFarmingXTextTables.REA_1_5);
								if (!eq_0) {
									and_7 = ValueUtil.FALSE_VALUE;
								} else {
									and_7 = ValueUtil.TRUE_VALUE;
								}
							}
							if (and_7 == null) {
								throw new InvalidValueException("Null if condition");
							}
							/*@NonInvalid*/ EnumerationLiteralId symbol_0;
							if (and_7) {
								symbol_0 = SmartFarmingXTextTables.ELITid_Optimum;
							} else {
								symbol_0 = SmartFarmingXTextTables.ELITid_Danger;
							}
							symbol_1 = symbol_0;
						}
						symbol_2 = symbol_1;
					}
					symbol_3 = symbol_2;
				}
				symbol_4 = symbol_3;
			}
			symbol_10 = symbol_4;
		} else {
			final /*@NonInvalid*/ boolean eq_1 = BOXED_Metrics == SmartFarmingXTextTables.ELITid_EnvironmentalSafety;
			/*@NonInvalid*/ EnumerationLiteralId symbol_9;
			if (eq_1) {
				final /*@NonInvalid*/ SensorType ECORE_ELITid_CO2 = (SensorType) idResolver
						.ecoreValueOf(Enumerator.class, SmartFarmingXTextTables.ELITid_CO2);
				final /*@NonInvalid*/ float calculateAverage_15 = this.calculateAverage(ECORE_ELITid_CO2);
				final /*@NonInvalid*/ RealValue BOXED_calculateAverage_15 = ValueUtil.realValueOf(calculateAverage_15);
				final /*@NonInvalid*/ boolean ge_3 = OclComparableGreaterThanEqualOperation.INSTANCE
						.evaluate(executor, BOXED_calculateAverage_15, SmartFarmingXTextTables.INT_5000).booleanValue();
				/*@NonInvalid*/ EnumerationLiteralId symbol_8;
				if (ge_3) {
					symbol_8 = SmartFarmingXTextTables.ELITid_Danger;
				} else {
					final /*@NonInvalid*/ boolean ge_4 = OclComparableGreaterThanEqualOperation.INSTANCE
							.evaluate(executor, BOXED_calculateAverage_15, SmartFarmingXTextTables.INT_3000)
							.booleanValue();
					/*@NonInvalid*/ EnumerationLiteralId symbol_7;
					if (ge_4) {
						symbol_7 = SmartFarmingXTextTables.ELITid_Warning;
					} else {
						final /*@NonInvalid*/ boolean ge_5 = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_calculateAverage_15, SmartFarmingXTextTables.INT_1500)
								.booleanValue();
						/*@NonInvalid*/ EnumerationLiteralId symbol_6;
						if (ge_5) {
							symbol_6 = SmartFarmingXTextTables.ELITid_Good;
						} else {
							final /*@NonInvalid*/ boolean ge_6 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_calculateAverage_15, SmartFarmingXTextTables.INT_900)
									.booleanValue();
							/*@NonInvalid*/ EnumerationLiteralId symbol_5;
							if (ge_6) {
								symbol_5 = SmartFarmingXTextTables.ELITid_Healthy;
							} else {
								symbol_5 = SmartFarmingXTextTables.ELITid_Optimum;
							}
							symbol_6 = symbol_5;
						}
						symbol_7 = symbol_6;
					}
					symbol_8 = symbol_7;
				}
				symbol_9 = symbol_8;
			} else {
				symbol_9 = SmartFarmingXTextTables.ELITid_Invalid;
			}
			symbol_10 = symbol_9;
		}
		final /*@NonInvalid*/ MonitoringCondition ECORE_symbol_10 = (MonitoringCondition) idResolver
				.ecoreValueOf(Enumerator.class, symbol_10);
		return ECORE_symbol_10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.MONITORING__METRICS:
			return getMetrics();
		case SmartFarmingXTextPackage.MONITORING__SENSORS:
			return getSensors();
		case SmartFarmingXTextPackage.MONITORING__CONTROL:
			if (resolve)
				return getControl();
			return basicGetControl();
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
		case SmartFarmingXTextPackage.MONITORING__METRICS:
			setMetrics((MonitoringMetrics) newValue);
			return;
		case SmartFarmingXTextPackage.MONITORING__SENSORS:
			getSensors().clear();
			getSensors().addAll((Collection<? extends Sensor>) newValue);
			return;
		case SmartFarmingXTextPackage.MONITORING__CONTROL:
			setControl((Controlling) newValue);
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
		case SmartFarmingXTextPackage.MONITORING__METRICS:
			setMetrics(METRICS_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.MONITORING__SENSORS:
			getSensors().clear();
			return;
		case SmartFarmingXTextPackage.MONITORING__CONTROL:
			setControl((Controlling) null);
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
		case SmartFarmingXTextPackage.MONITORING__METRICS:
			return metrics != METRICS_EDEFAULT;
		case SmartFarmingXTextPackage.MONITORING__SENSORS:
			return sensors != null && !sensors.isEmpty();
		case SmartFarmingXTextPackage.MONITORING__CONTROL:
			return control != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SmartFarmingXTextPackage.MONITORING___CALCULATE_AVERAGE__SENSORTYPE:
			return calculateAverage((SensorType) arguments.get(0));
		case SmartFarmingXTextPackage.MONITORING___CHECK_CONDITION:
			return checkCondition();
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
		result.append(" (Metrics: ");
		result.append(metrics);
		result.append(')');
		return result.toString();
	}

} //MonitoringImpl
