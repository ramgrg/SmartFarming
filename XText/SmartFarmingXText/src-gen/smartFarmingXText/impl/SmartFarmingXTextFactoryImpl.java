/**
 */
package smartFarmingXText.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smartFarmingXText.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartFarmingXTextFactoryImpl extends EFactoryImpl implements SmartFarmingXTextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartFarmingXTextFactory init() {
		try {
			SmartFarmingXTextFactory theSmartFarmingXTextFactory = (SmartFarmingXTextFactory) EPackage.Registry.INSTANCE
					.getEFactory(SmartFarmingXTextPackage.eNS_URI);
			if (theSmartFarmingXTextFactory != null) {
				return theSmartFarmingXTextFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartFarmingXTextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartFarmingXTextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SmartFarmingXTextPackage.FARM:
			return createFarm();
		case SmartFarmingXTextPackage.CROP:
			return createCrop();
		case SmartFarmingXTextPackage.FARMER:
			return createFarmer();
		case SmartFarmingXTextPackage.IO_TSYSTEM:
			return createIoTSystem();
		case SmartFarmingXTextPackage.GATEWAY:
			return createGateway();
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM:
			return createAnalyticsSystem();
		case SmartFarmingXTextPackage.MONITORING:
			return createMonitoring();
		case SmartFarmingXTextPackage.CONTROLLING:
			return createControlling();
		case SmartFarmingXTextPackage.ACTUATOR:
			return createActuator();
		case SmartFarmingXTextPackage.SENSOR:
			return createSensor();
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL:
			return createCommunicationProtocol();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SmartFarmingXTextPackage.CROP_GROUP:
			return createCropGroupFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.ACTUATOR_TYPE:
			return createActuatorTypeFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.ANALYTICS_TYPE:
			return createAnalyticsTypeFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.COMMUNICATION_TYPE:
			return createCommunicationTypeFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.CONTROLLER_ACTION:
			return createControllerActionFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.CONTROL_TYPE:
			return createControlTypeFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.MONITORING_CONDITION:
			return createMonitoringConditionFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.MONITORING_METRICS:
			return createMonitoringMetricsFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.OUTPUT_TYPE:
			return createOutputTypeFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.SENSOR_STATE:
			return createSensorStateFromString(eDataType, initialValue);
		case SmartFarmingXTextPackage.SENSOR_TYPE:
			return createSensorTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SmartFarmingXTextPackage.CROP_GROUP:
			return convertCropGroupToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.ACTUATOR_TYPE:
			return convertActuatorTypeToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.ANALYTICS_TYPE:
			return convertAnalyticsTypeToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.COMMUNICATION_TYPE:
			return convertCommunicationTypeToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.CONTROLLER_ACTION:
			return convertControllerActionToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.CONTROL_TYPE:
			return convertControlTypeToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.MONITORING_CONDITION:
			return convertMonitoringConditionToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.MONITORING_METRICS:
			return convertMonitoringMetricsToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.OUTPUT_TYPE:
			return convertOutputTypeToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.SENSOR_STATE:
			return convertSensorStateToString(eDataType, instanceValue);
		case SmartFarmingXTextPackage.SENSOR_TYPE:
			return convertSensorTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm createFarm() {
		FarmImpl farm = new FarmImpl();
		return farm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crop createCrop() {
		CropImpl crop = new CropImpl();
		return crop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farmer createFarmer() {
		FarmerImpl farmer = new FarmerImpl();
		return farmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IoTSystem createIoTSystem() {
		IoTSystemImpl ioTSystem = new IoTSystemImpl();
		return ioTSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gateway createGateway() {
		GatewayImpl gateway = new GatewayImpl();
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsSystem createAnalyticsSystem() {
		AnalyticsSystemImpl analyticsSystem = new AnalyticsSystemImpl();
		return analyticsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controlling createControlling() {
		ControllingImpl controlling = new ControllingImpl();
		return controlling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationProtocol createCommunicationProtocol() {
		CommunicationProtocolImpl communicationProtocol = new CommunicationProtocolImpl();
		return communicationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CropGroup createCropGroupFromString(EDataType eDataType, String initialValue) {
		CropGroup result = CropGroup.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCropGroupToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyticsType createAnalyticsTypeFromString(EDataType eDataType, String initialValue) {
		AnalyticsType result = AnalyticsType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnalyticsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationTypeFromString(EDataType eDataType, String initialValue) {
		CommunicationType result = CommunicationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerAction createControllerActionFromString(EDataType eDataType, String initialValue) {
		ControllerAction result = ControllerAction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControllerActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringCondition createMonitoringConditionFromString(EDataType eDataType, String initialValue) {
		MonitoringCondition result = MonitoringCondition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringMetrics createMonitoringMetricsFromString(EDataType eDataType, String initialValue) {
		MonitoringMetrics result = MonitoringMetrics.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringMetricsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputType createOutputTypeFromString(EDataType eDataType, String initialValue) {
		OutputType result = OutputType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorState createSensorStateFromString(EDataType eDataType, String initialValue) {
		SensorState result = SensorState.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartFarmingXTextPackage getSmartFarmingXTextPackage() {
		return (SmartFarmingXTextPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartFarmingXTextPackage getPackage() {
		return SmartFarmingXTextPackage.eINSTANCE;
	}

} //SmartFarmingXTextFactoryImpl
