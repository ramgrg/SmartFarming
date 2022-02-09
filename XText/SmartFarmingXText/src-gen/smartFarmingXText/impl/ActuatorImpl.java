/**
 */
package smartFarmingXText.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import smartFarmingXText.Actuator;
import smartFarmingXText.ActuatorType;
import smartFarmingXText.CommunicationProtocol;
import smartFarmingXText.Controlling;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.ActuatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link smartFarmingXText.impl.ActuatorImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends DeviceImpl implements Actuator {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActuatorType TYPE_EDEFAULT = ActuatorType.AIR_CONDITIONER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType type = TYPE_EDEFAULT;

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
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActuatorType newType) {
		ActuatorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.ACTUATOR__TYPE, oldType,
					type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SmartFarmingXTextPackage.ACTUATOR__PROTOCOL, oldProtocol, protocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.ACTUATOR__PROTOCOL,
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
		 * Controlling.allInstances()
		 * ->select(x |
		 *   x.Actuators->exists(actuator | (actuator = self)))
		 * ->size() > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_smartFarmingXText_c_c_Controlling_0 = idResolver
				.getClass(SmartFarmingXTextTables.CLSSid_Controlling, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				SmartFarmingXTextTables.SET_CLSSid_Controlling, TYP_smartFarmingXText_c_c_Controlling_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSetAccumulatorValue(SmartFarmingXTextTables.SET_CLSSid_Controlling);
		Iterator<Object> ITERATOR_x = allInstances.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR_x.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Controlling x = (Controlling) ITERATOR_x.next();
			/**
			 * x.Actuators->exists(actuator | actuator = self)
			 */
			final /*@NonInvalid*/ List<Actuator> Actuators = x.getActuators();
			final /*@NonInvalid*/ OrderedSetValue BOXED_Actuators = idResolver
					.createOrderedSetOfAll(SmartFarmingXTextTables.ORD_CLSSid_Actuator, Actuators);
			/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_actuator = BOXED_Actuators.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_actuator.hasNext()) {
					if (accumulator_0 == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator_0;
					}
					break;
				}
				/*@NonInvalid*/ Actuator actuator = (Actuator) ITERATOR_actuator.next();
				/**
				 * actuator = self
				 */
				final /*@NonInvalid*/ boolean eq = actuator.equals(this);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.ACTUATOR__TYPE:
			return getType();
		case SmartFarmingXTextPackage.ACTUATOR__PROTOCOL:
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
		case SmartFarmingXTextPackage.ACTUATOR__TYPE:
			setType((ActuatorType) newValue);
			return;
		case SmartFarmingXTextPackage.ACTUATOR__PROTOCOL:
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
		case SmartFarmingXTextPackage.ACTUATOR__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case SmartFarmingXTextPackage.ACTUATOR__PROTOCOL:
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
		case SmartFarmingXTextPackage.ACTUATOR__TYPE:
			return type != TYPE_EDEFAULT;
		case SmartFarmingXTextPackage.ACTUATOR__PROTOCOL:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SmartFarmingXTextPackage.ACTUATOR___IS_USED:
			return isUsed();
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
		result.append(')');
		return result.toString();
	}

} //ActuatorImpl
