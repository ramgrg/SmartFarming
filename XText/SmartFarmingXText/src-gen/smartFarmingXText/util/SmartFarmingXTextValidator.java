/**
 */
package smartFarmingXText.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import smartFarmingXText.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextPackage
 * @generated
 */
public class SmartFarmingXTextValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SmartFarmingXTextValidator INSTANCE = new SmartFarmingXTextValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "smartFarmingXText";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Size' of 'Farm'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FARM__VALID_SIZE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Must Have Name' of 'Named'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAMED__MUST_HAVE_NAME = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Crop Unique ID' of 'Crop'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CROP__CROP_UNIQUE_ID = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Farmer Must Have ID' of 'Farmer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FARMER__FARMER_MUST_HAVE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Farmer Unique ID' of 'Farmer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FARMER__FARMER_UNIQUE_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Unique ID' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__SERVICE_UNIQUE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Must Have ID' of 'Service'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE__SERVICE_MUST_HAVE_ID = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Device Unique ID' of 'Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEVICE__DEVICE_UNIQUE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Device Must Have ID' of 'Device'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEVICE__DEVICE_MUST_HAVE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Gateway Must Have ID' of 'Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATEWAY__GATEWAY_MUST_HAVE_ID = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Gateway Unique ID' of 'Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GATEWAY__GATEWAY_UNIQUE_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sensor Minus Constraint' of 'Sensor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SENSOR__SENSOR_MINUS_CONSTRAINT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartFarmingXTextValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SmartFarmingXTextPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SmartFarmingXTextPackage.FARM:
			return validateFarm((Farm) value, diagnostics, context);
		case SmartFarmingXTextPackage.NAMED:
			return validateNamed((Named) value, diagnostics, context);
		case SmartFarmingXTextPackage.CROP:
			return validateCrop((Crop) value, diagnostics, context);
		case SmartFarmingXTextPackage.FARMER:
			return validateFarmer((Farmer) value, diagnostics, context);
		case SmartFarmingXTextPackage.IO_TSYSTEM:
			return validateIoTSystem((IoTSystem) value, diagnostics, context);
		case SmartFarmingXTextPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		case SmartFarmingXTextPackage.DEVICE:
			return validateDevice((Device) value, diagnostics, context);
		case SmartFarmingXTextPackage.GATEWAY:
			return validateGateway((Gateway) value, diagnostics, context);
		case SmartFarmingXTextPackage.ANALYTICS_SYSTEM:
			return validateAnalyticsSystem((AnalyticsSystem) value, diagnostics, context);
		case SmartFarmingXTextPackage.MONITORING:
			return validateMonitoring((Monitoring) value, diagnostics, context);
		case SmartFarmingXTextPackage.CONTROLLING:
			return validateControlling((Controlling) value, diagnostics, context);
		case SmartFarmingXTextPackage.ACTUATOR:
			return validateActuator((Actuator) value, diagnostics, context);
		case SmartFarmingXTextPackage.SENSOR:
			return validateSensor((Sensor) value, diagnostics, context);
		case SmartFarmingXTextPackage.COMMUNICATION_PROTOCOL:
			return validateCommunicationProtocol((CommunicationProtocol) value, diagnostics, context);
		case SmartFarmingXTextPackage.CROP_GROUP:
			return validateCropGroup((CropGroup) value, diagnostics, context);
		case SmartFarmingXTextPackage.ACTUATOR_TYPE:
			return validateActuatorType((ActuatorType) value, diagnostics, context);
		case SmartFarmingXTextPackage.ANALYTICS_TYPE:
			return validateAnalyticsType((AnalyticsType) value, diagnostics, context);
		case SmartFarmingXTextPackage.COMMUNICATION_TYPE:
			return validateCommunicationType((CommunicationType) value, diagnostics, context);
		case SmartFarmingXTextPackage.CONTROLLER_ACTION:
			return validateControllerAction((ControllerAction) value, diagnostics, context);
		case SmartFarmingXTextPackage.CONTROL_TYPE:
			return validateControlType((ControlType) value, diagnostics, context);
		case SmartFarmingXTextPackage.MONITORING_CONDITION:
			return validateMonitoringCondition((MonitoringCondition) value, diagnostics, context);
		case SmartFarmingXTextPackage.MONITORING_METRICS:
			return validateMonitoringMetrics((MonitoringMetrics) value, diagnostics, context);
		case SmartFarmingXTextPackage.OUTPUT_TYPE:
			return validateOutputType((OutputType) value, diagnostics, context);
		case SmartFarmingXTextPackage.SENSOR_STATE:
			return validateSensorState((SensorState) value, diagnostics, context);
		case SmartFarmingXTextPackage.SENSOR_TYPE:
			return validateSensorType((SensorType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFarm(Farm farm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(farm, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(farm, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFarm_ValidSize(farm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidSize constraint of '<em>Farm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFarm_ValidSize(Farm farm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return farm.ValidSize(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(named, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(named, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(named, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MustHaveName constraint of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamed_MustHaveName(Named named, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return named.MustHaveName(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrop(Crop crop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crop, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(crop, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCrop_CropUniqueID(crop, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CropUniqueID constraint of '<em>Crop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrop_CropUniqueID(Crop crop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return crop.CropUniqueID(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFarmer(Farmer farmer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(farmer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFarmer_FarmerUniqueID(farmer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFarmer_FarmerMustHaveID(farmer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FarmerUniqueID constraint of '<em>Farmer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFarmer_FarmerUniqueID(Farmer farmer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return farmer.FarmerUniqueID(diagnostics, context);
	}

	/**
	 * Validates the FarmerMustHaveID constraint of '<em>Farmer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFarmer_FarmerMustHaveID(Farmer farmer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return farmer.FarmerMustHaveID(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIoTSystem(IoTSystem ioTSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ioTSystem, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ioTSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(ioTSystem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceMustHaveID(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceUniqueID(service, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ServiceMustHaveID constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceMustHaveID(Service service, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return service.ServiceMustHaveID(diagnostics, context);
	}

	/**
	 * Validates the ServiceUniqueID constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_ServiceUniqueID(Service service, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return service.ServiceUniqueID(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice(Device device, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(device, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceMustHaveID(device, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceUniqueID(device, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DeviceMustHaveID constraint of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice_DeviceMustHaveID(Device device, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return device.DeviceMustHaveID(diagnostics, context);
	}

	/**
	 * Validates the DeviceUniqueID constraint of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevice_DeviceUniqueID(Device device, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return device.DeviceUniqueID(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gateway, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGateway_GatewayUniqueID(gateway, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGateway_GatewayMustHaveID(gateway, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GatewayUniqueID constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway_GatewayUniqueID(Gateway gateway, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return gateway.GatewayUniqueID(diagnostics, context);
	}

	/**
	 * Validates the GatewayMustHaveID constraint of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway_GatewayMustHaveID(Gateway gateway, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return gateway.GatewayMustHaveID(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalyticsSystem(AnalyticsSystem analyticsSystem, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(analyticsSystem, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceMustHaveID(analyticsSystem, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceUniqueID(analyticsSystem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoring(Monitoring monitoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(monitoring, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceMustHaveID(monitoring, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceUniqueID(monitoring, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlling(Controlling controlling, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controlling, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceMustHaveID(controlling, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_ServiceUniqueID(controlling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuator(Actuator actuator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actuator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceMustHaveID(actuator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceUniqueID(actuator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceMustHaveID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevice_DeviceUniqueID(sensor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSensor_SensorMinusConstraint(sensor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SensorMinusConstraint constraint of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor_SensorMinusConstraint(Sensor sensor, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return sensor.SensorMinusConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationProtocol(CommunicationProtocol communicationProtocol,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(communicationProtocol, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(communicationProtocol, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamed_MustHaveName(communicationProtocol, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCropGroup(CropGroup cropGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActuatorType(ActuatorType actuatorType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalyticsType(AnalyticsType analyticsType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationType(CommunicationType communicationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerAction(ControllerAction controllerAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlType(ControlType controlType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoringCondition(MonitoringCondition monitoringCondition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoringMetrics(MonitoringMetrics monitoringMetrics, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(OutputType outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorState(SensorState sensorState, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensorType(SensorType sensorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SmartFarmingXTextValidator
