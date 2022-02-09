/**
 */
package smartFarmingXText.impl;

import java.math.BigInteger;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import smartFarmingXText.Actuator;
import smartFarmingXText.CommunicationProtocol;
import smartFarmingXText.CommunicationType;
import smartFarmingXText.Sensor;
import smartFarmingXText.SmartFarmingXTextPackage;
import smartFarmingXText.SmartFarmingXTextTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link smartFarmingXText.impl.CommunicationProtocolImpl#getType <em>Type</em>}</li>
 *   <li>{@link smartFarmingXText.impl.CommunicationProtocolImpl#getSensorNumber <em>Sensor Number</em>}</li>
 *   <li>{@link smartFarmingXText.impl.CommunicationProtocolImpl#getActuatorNumber <em>Actuator Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationProtocolImpl extends NamedImpl implements CommunicationProtocol {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationType TYPE_EDEFAULT = CommunicationType.ZIG_BEE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorNumber() <em>Sensor Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SENSOR_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getActuatorNumber() <em>Actuator Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuatorNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTUATOR_NUMBER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmartFarmingXTextPackage.Literals.COMMUNICATION_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CommunicationType newType) {
		CommunicationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSensorNumber() {
		/**
		 * Sensor.allInstances()->select(x | x.Protocol = self)->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_smartFarmingXText_c_c_Sensor_0 = idResolver
				.getClass(SmartFarmingXTextTables.CLSSid_Sensor, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				SmartFarmingXTextTables.SET_CLSSid_Sensor, TYP_smartFarmingXText_c_c_Sensor_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSetAccumulatorValue(SmartFarmingXTextTables.SET_CLSSid_Sensor);
		Iterator<Object> ITERATOR_x = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR_x.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Sensor x = (Sensor) ITERATOR_x.next();
			/**
			 * x.Protocol = self
			 */
			final /*@NonInvalid*/ CommunicationProtocol Protocol = x.getProtocol();
			final /*@NonInvalid*/ boolean eq = Protocol.equals(this);
			//
			if (eq) {
				accumulator.add(x);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getActuatorNumber() {
		/**
		 * Actuator.allInstances()->select(x | x.Protocol = self)->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_smartFarmingXText_c_c_Actuator_0 = idResolver
				.getClass(SmartFarmingXTextTables.CLSSid_Actuator, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
				SmartFarmingXTextTables.SET_CLSSid_Actuator, TYP_smartFarmingXText_c_c_Actuator_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil
				.createSetAccumulatorValue(SmartFarmingXTextTables.SET_CLSSid_Actuator);
		Iterator<Object> ITERATOR_x = allInstances.iterator();
		/*@NonInvalid*/ SetValue select;
		while (true) {
			if (!ITERATOR_x.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Actuator x = (Actuator) ITERATOR_x.next();
			/**
			 * x.Protocol = self
			 */
			final /*@NonInvalid*/ CommunicationProtocol Protocol = x.getProtocol();
			final /*@NonInvalid*/ boolean eq = Protocol.equals(this);
			//
			if (eq) {
				accumulator.add(x);
			}
		}
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__TYPE:
			return getType();
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__SENSOR_NUMBER:
			return getSensorNumber();
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER:
			return getActuatorNumber();
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
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__TYPE:
			setType((CommunicationType) newValue);
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
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__TYPE:
			setType(TYPE_EDEFAULT);
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
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__TYPE:
			return type != TYPE_EDEFAULT;
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__SENSOR_NUMBER:
			return SENSOR_NUMBER_EDEFAULT == null ? getSensorNumber() != null
					: !SENSOR_NUMBER_EDEFAULT.equals(getSensorNumber());
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER:
			return ACTUATOR_NUMBER_EDEFAULT == null ? getActuatorNumber() != null
					: !ACTUATOR_NUMBER_EDEFAULT.equals(getActuatorNumber());
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
		result.append(" (Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CommunicationProtocolImpl
