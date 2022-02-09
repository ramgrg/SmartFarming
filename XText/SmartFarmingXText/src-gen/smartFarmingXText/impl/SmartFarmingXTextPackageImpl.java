/**
 */
package smartFarmingXText.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartFarmingXText.Actuator;
import smartFarmingXText.ActuatorType;
import smartFarmingXText.AnalyticsSystem;
import smartFarmingXText.AnalyticsType;
import smartFarmingXText.CommunicationProtocol;
import smartFarmingXText.CommunicationType;
import smartFarmingXText.ControlType;
import smartFarmingXText.ControllerAction;
import smartFarmingXText.Controlling;
import smartFarmingXText.Crop;
import smartFarmingXText.CropGroup;
import smartFarmingXText.Device;
import smartFarmingXText.Farm;
import smartFarmingXText.Farmer;
import smartFarmingXText.Gateway;
import smartFarmingXText.IoTSystem;
import smartFarmingXText.Monitoring;
import smartFarmingXText.MonitoringCondition;
import smartFarmingXText.MonitoringMetrics;
import smartFarmingXText.Named;
import smartFarmingXText.OutputType;
import smartFarmingXText.Sensor;
import smartFarmingXText.SensorState;
import smartFarmingXText.SensorType;
import smartFarmingXText.Service;
import smartFarmingXText.SmartFarmingXTextFactory;
import smartFarmingXText.SmartFarmingXTextPackage;

import smartFarmingXText.util.SmartFarmingXTextValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartFarmingXTextPackageImpl extends EPackageImpl implements SmartFarmingXTextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass farmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass farmerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioTSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyticsSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cropGroupEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum analyticsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controllerActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitoringMetricsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see smartFarmingXText.SmartFarmingXTextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SmartFarmingXTextPackageImpl() {
		super(eNS_URI, SmartFarmingXTextFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SmartFarmingXTextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SmartFarmingXTextPackage init() {
		if (isInited)
			return (SmartFarmingXTextPackage) EPackage.Registry.INSTANCE.getEPackage(SmartFarmingXTextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSmartFarmingXTextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SmartFarmingXTextPackageImpl theSmartFarmingXTextPackage = registeredSmartFarmingXTextPackage instanceof SmartFarmingXTextPackageImpl
				? (SmartFarmingXTextPackageImpl) registeredSmartFarmingXTextPackage
				: new SmartFarmingXTextPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSmartFarmingXTextPackage.createPackageContents();

		// Initialize created meta-data
		theSmartFarmingXTextPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theSmartFarmingXTextPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return SmartFarmingXTextValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theSmartFarmingXTextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SmartFarmingXTextPackage.eNS_URI, theSmartFarmingXTextPackage);
		return theSmartFarmingXTextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFarm() {
		return farmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarm_Location() {
		return (EAttribute) farmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarm_Size() {
		return (EAttribute) farmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarm_Crops() {
		return (EReference) farmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarm_Farmers() {
		return (EReference) farmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarm_IoTSystem() {
		return (EReference) farmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFarm__ValidSize__DiagnosticChain_Map() {
		return farmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute) namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamed__MustHaveName__DiagnosticChain_Map() {
		return namedEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrop() {
		return cropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_CropGroup() {
		return (EAttribute) cropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_GrowthDuration() {
		return (EAttribute) cropEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrop_SeedCode() {
		return (EAttribute) cropEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrop_Farm() {
		return (EReference) cropEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCrop__CropUniqueID__DiagnosticChain_Map() {
		return cropEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFarmer() {
		return farmerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarmer_FarmerID() {
		return (EAttribute) farmerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarmer_Email() {
		return (EAttribute) farmerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFarmer_PhoneNumber() {
		return (EAttribute) farmerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarmer_Farm() {
		return (EReference) farmerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFarmer_Services() {
		return (EReference) farmerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFarmer__FarmerMustHaveID__DiagnosticChain_Map() {
		return farmerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFarmer__FarmerUniqueID__DiagnosticChain_Map() {
		return farmerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIoTSystem() {
		return ioTSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIoTSystem_Version() {
		return (EAttribute) ioTSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTSystem_Services() {
		return (EReference) ioTSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTSystem_Devices() {
		return (EReference) ioTSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIoTSystem_Gateways() {
		return (EReference) ioTSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceID() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Host() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_URI() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_IoTSystem() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_PIC() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__ServiceUniqueID__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__ServiceMustHaveID__DiagnosticChain_Map() {
		return serviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceID() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_IPAddress() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Manufacturer() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_IoTSystem() {
		return (EReference) deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevice__DeviceUniqueID__DiagnosticChain_Map() {
		return deviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevice__DeviceMustHaveID__DiagnosticChain_Map() {
		return deviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_GatewayID() {
		return (EAttribute) gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_Model() {
		return (EAttribute) gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Protocols() {
		return (EReference) gatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Devices() {
		return (EReference) gatewayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_IoTSystem() {
		return (EReference) gatewayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGateway__GatewayMustHaveID__DiagnosticChain_Map() {
		return gatewayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGateway__GatewayUniqueID__DiagnosticChain_Map() {
		return gatewayEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyticsSystem() {
		return analyticsSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyticsSystem_AnalyticsType() {
		return (EAttribute) analyticsSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyticsSystem_DataSource() {
		return (EAttribute) analyticsSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyticsSystem_OutputType() {
		return (EAttribute) analyticsSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoring() {
		return monitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonitoring_Metrics() {
		return (EAttribute) monitoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_Sensors() {
		return (EReference) monitoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_Control() {
		return (EReference) monitoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMonitoring__CalculateAverage__SensorType() {
		return monitoringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMonitoring__CheckCondition() {
		return monitoringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlling() {
		return controllingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlling_ControlType() {
		return (EAttribute) controllingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlling_Action() {
		return (EAttribute) controllingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlling_Actuators() {
		return (EReference) controllingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuator_Type() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuator_Protocol() {
		return (EReference) actuatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActuator__IsUsed() {
		return actuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Type() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_State() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Unit() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensor_Value() {
		return (EAttribute) sensorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensor_Protocol() {
		return (EReference) sensorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__IsUsed() {
		return sensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__SensorMinusConstraint__DiagnosticChain_Map() {
		return sensorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProtocol() {
		return communicationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_Type() {
		return (EAttribute) communicationProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_SensorNumber() {
		return (EAttribute) communicationProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationProtocol_ActuatorNumber() {
		return (EAttribute) communicationProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCropGroup() {
		return cropGroupEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActuatorType() {
		return actuatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnalyticsType() {
		return analyticsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationType() {
		return communicationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControllerAction() {
		return controllerActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringCondition() {
		return monitoringConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitoringMetrics() {
		return monitoringMetricsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOutputType() {
		return outputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorState() {
		return sensorStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensorType() {
		return sensorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartFarmingXTextFactory getSmartFarmingXTextFactory() {
		return (SmartFarmingXTextFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		farmEClass = createEClass(FARM);
		createEAttribute(farmEClass, FARM__LOCATION);
		createEAttribute(farmEClass, FARM__SIZE);
		createEReference(farmEClass, FARM__CROPS);
		createEReference(farmEClass, FARM__FARMERS);
		createEReference(farmEClass, FARM__IO_TSYSTEM);
		createEOperation(farmEClass, FARM___VALID_SIZE__DIAGNOSTICCHAIN_MAP);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);
		createEOperation(namedEClass, NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);

		cropEClass = createEClass(CROP);
		createEAttribute(cropEClass, CROP__CROP_GROUP);
		createEAttribute(cropEClass, CROP__GROWTH_DURATION);
		createEAttribute(cropEClass, CROP__SEED_CODE);
		createEReference(cropEClass, CROP__FARM);
		createEOperation(cropEClass, CROP___CROP_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);

		farmerEClass = createEClass(FARMER);
		createEAttribute(farmerEClass, FARMER__FARMER_ID);
		createEAttribute(farmerEClass, FARMER__EMAIL);
		createEAttribute(farmerEClass, FARMER__PHONE_NUMBER);
		createEReference(farmerEClass, FARMER__FARM);
		createEReference(farmerEClass, FARMER__SERVICES);
		createEOperation(farmerEClass, FARMER___FARMER_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);
		createEOperation(farmerEClass, FARMER___FARMER_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);

		ioTSystemEClass = createEClass(IO_TSYSTEM);
		createEAttribute(ioTSystemEClass, IO_TSYSTEM__VERSION);
		createEReference(ioTSystemEClass, IO_TSYSTEM__SERVICES);
		createEReference(ioTSystemEClass, IO_TSYSTEM__DEVICES);
		createEReference(ioTSystemEClass, IO_TSYSTEM__GATEWAYS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_ID);
		createEAttribute(serviceEClass, SERVICE__HOST);
		createEAttribute(serviceEClass, SERVICE__URI);
		createEReference(serviceEClass, SERVICE__IO_TSYSTEM);
		createEReference(serviceEClass, SERVICE__PIC);
		createEOperation(serviceEClass, SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
		createEOperation(serviceEClass, SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__DEVICE_ID);
		createEAttribute(deviceEClass, DEVICE__IP_ADDRESS);
		createEAttribute(deviceEClass, DEVICE__MANUFACTURER);
		createEReference(deviceEClass, DEVICE__IO_TSYSTEM);
		createEOperation(deviceEClass, DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
		createEOperation(deviceEClass, DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__GATEWAY_ID);
		createEAttribute(gatewayEClass, GATEWAY__MODEL);
		createEReference(gatewayEClass, GATEWAY__PROTOCOLS);
		createEReference(gatewayEClass, GATEWAY__DEVICES);
		createEReference(gatewayEClass, GATEWAY__IO_TSYSTEM);
		createEOperation(gatewayEClass, GATEWAY___GATEWAY_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP);
		createEOperation(gatewayEClass, GATEWAY___GATEWAY_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);

		analyticsSystemEClass = createEClass(ANALYTICS_SYSTEM);
		createEAttribute(analyticsSystemEClass, ANALYTICS_SYSTEM__ANALYTICS_TYPE);
		createEAttribute(analyticsSystemEClass, ANALYTICS_SYSTEM__DATA_SOURCE);
		createEAttribute(analyticsSystemEClass, ANALYTICS_SYSTEM__OUTPUT_TYPE);

		monitoringEClass = createEClass(MONITORING);
		createEAttribute(monitoringEClass, MONITORING__METRICS);
		createEReference(monitoringEClass, MONITORING__SENSORS);
		createEReference(monitoringEClass, MONITORING__CONTROL);
		createEOperation(monitoringEClass, MONITORING___CALCULATE_AVERAGE__SENSORTYPE);
		createEOperation(monitoringEClass, MONITORING___CHECK_CONDITION);

		controllingEClass = createEClass(CONTROLLING);
		createEAttribute(controllingEClass, CONTROLLING__CONTROL_TYPE);
		createEAttribute(controllingEClass, CONTROLLING__ACTION);
		createEReference(controllingEClass, CONTROLLING__ACTUATORS);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__TYPE);
		createEReference(actuatorEClass, ACTUATOR__PROTOCOL);
		createEOperation(actuatorEClass, ACTUATOR___IS_USED);

		sensorEClass = createEClass(SENSOR);
		createEAttribute(sensorEClass, SENSOR__TYPE);
		createEAttribute(sensorEClass, SENSOR__STATE);
		createEAttribute(sensorEClass, SENSOR__UNIT);
		createEAttribute(sensorEClass, SENSOR__VALUE);
		createEReference(sensorEClass, SENSOR__PROTOCOL);
		createEOperation(sensorEClass, SENSOR___IS_USED);
		createEOperation(sensorEClass, SENSOR___SENSOR_MINUS_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		communicationProtocolEClass = createEClass(COMMUNICATION_PROTOCOL);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__TYPE);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__SENSOR_NUMBER);
		createEAttribute(communicationProtocolEClass, COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER);

		// Create enums
		cropGroupEEnum = createEEnum(CROP_GROUP);
		actuatorTypeEEnum = createEEnum(ACTUATOR_TYPE);
		analyticsTypeEEnum = createEEnum(ANALYTICS_TYPE);
		communicationTypeEEnum = createEEnum(COMMUNICATION_TYPE);
		controllerActionEEnum = createEEnum(CONTROLLER_ACTION);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
		monitoringConditionEEnum = createEEnum(MONITORING_CONDITION);
		monitoringMetricsEEnum = createEEnum(MONITORING_METRICS);
		outputTypeEEnum = createEEnum(OUTPUT_TYPE);
		sensorStateEEnum = createEEnum(SENSOR_STATE);
		sensorTypeEEnum = createEEnum(SENSOR_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		farmEClass.getESuperTypes().add(this.getNamed());
		cropEClass.getESuperTypes().add(this.getNamed());
		farmerEClass.getESuperTypes().add(this.getNamed());
		ioTSystemEClass.getESuperTypes().add(this.getNamed());
		serviceEClass.getESuperTypes().add(this.getNamed());
		deviceEClass.getESuperTypes().add(this.getNamed());
		gatewayEClass.getESuperTypes().add(this.getNamed());
		analyticsSystemEClass.getESuperTypes().add(this.getService());
		monitoringEClass.getESuperTypes().add(this.getService());
		controllingEClass.getESuperTypes().add(this.getService());
		actuatorEClass.getESuperTypes().add(this.getDevice());
		sensorEClass.getESuperTypes().add(this.getDevice());
		communicationProtocolEClass.getESuperTypes().add(this.getNamed());

		// Initialize classes, features, and operations; add parameters
		initEClass(farmEClass, Farm.class, "Farm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFarm_Location(), ecorePackage.getEString(), "Location", null, 0, 1, Farm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFarm_Size(), ecorePackage.getEFloat(), "Size", null, 1, 1, Farm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFarm_Crops(), this.getCrop(), this.getCrop_Farm(), "Crops", null, 1, -1, Farm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFarm_Farmers(), this.getFarmer(), this.getFarmer_Farm(), "Farmers", null, 1, -1, Farm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFarm_IoTSystem(), this.getIoTSystem(), null, "IoTSystem", null, 1, 1, Farm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFarm__ValidSize__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ValidSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNamed__MustHaveName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "MustHaveName",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cropEClass, Crop.class, "Crop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrop_CropGroup(), this.getCropGroup(), "CropGroup", null, 0, 1, Crop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrop_GrowthDuration(), ecorePackage.getEInt(), "GrowthDuration", null, 1, 1, Crop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrop_SeedCode(), ecorePackage.getEString(), "SeedCode", null, 0, 1, Crop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrop_Farm(), this.getFarm(), this.getFarm_Crops(), "Farm", null, 1, 1, Crop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCrop__CropUniqueID__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CropUniqueID", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(farmerEClass, Farmer.class, "Farmer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFarmer_FarmerID(), ecorePackage.getEString(), "FarmerID", null, 0, 1, Farmer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFarmer_Email(), ecorePackage.getEString(), "Email", null, 0, 1, Farmer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFarmer_PhoneNumber(), ecorePackage.getEString(), "PhoneNumber", null, 0, 1, Farmer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFarmer_Farm(), this.getFarm(), this.getFarm_Farmers(), "Farm", null, 1, 1, Farmer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFarmer_Services(), this.getService(), null, "Services", null, 1, -1, Farmer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFarmer__FarmerMustHaveID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"FarmerMustHaveID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFarmer__FarmerUniqueID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"FarmerUniqueID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ioTSystemEClass, IoTSystem.class, "IoTSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIoTSystem_Version(), ecorePackage.getEString(), "Version", null, 0, 1, IoTSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoTSystem_Services(), this.getService(), this.getService_IoTSystem(), "Services", null, 1, -1,
				IoTSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoTSystem_Devices(), this.getDevice(), this.getDevice_IoTSystem(), "Devices", null, 1, -1,
				IoTSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIoTSystem_Gateways(), this.getGateway(), this.getGateway_IoTSystem(), "Gateways", null, 1, -1,
				IoTSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_ServiceID(), ecorePackage.getEString(), "ServiceID", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Host(), ecorePackage.getEString(), "Host", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_URI(), ecorePackage.getEString(), "URI", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_IoTSystem(), this.getIoTSystem(), this.getIoTSystem_Services(), "IoTSystem", null, 1,
				1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_PIC(), this.getFarmer(), null, "PIC", null, 0, -1, Service.class, !IS_TRANSIENT,
				IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getService__ServiceUniqueID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ServiceUniqueID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__ServiceMustHaveID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ServiceMustHaveID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_DeviceID(), ecorePackage.getEString(), "DeviceID", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_IPAddress(), ecorePackage.getEString(), "IPAddress", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Manufacturer(), ecorePackage.getEString(), "Manufacturer", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_IoTSystem(), this.getIoTSystem(), this.getIoTSystem_Devices(), "IoTSystem", null, 1, 1,
				Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDevice__DeviceUniqueID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"DeviceUniqueID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDevice__DeviceMustHaveID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"DeviceMustHaveID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_GatewayID(), ecorePackage.getEString(), "GatewayID", null, 0, 1, Gateway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGateway_Model(), ecorePackage.getEString(), "Model", null, 0, 1, Gateway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Protocols(), this.getCommunicationProtocol(), null, "Protocols", null, 1, -1,
				Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Devices(), this.getDevice(), null, "Devices", null, 1, -1, Gateway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_IoTSystem(), this.getIoTSystem(), this.getIoTSystem_Gateways(), "IoTSystem", null, 1,
				1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGateway__GatewayMustHaveID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"GatewayMustHaveID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGateway__GatewayUniqueID__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"GatewayUniqueID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(analyticsSystemEClass, AnalyticsSystem.class, "AnalyticsSystem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalyticsSystem_AnalyticsType(), this.getAnalyticsType(), "AnalyticsType", null, 0, 1,
				AnalyticsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyticsSystem_DataSource(), ecorePackage.getEString(), "DataSource", null, 0, 1,
				AnalyticsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyticsSystem_OutputType(), this.getOutputType(), "OutputType", null, 0, 1,
				AnalyticsSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(monitoringEClass, Monitoring.class, "Monitoring", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonitoring_Metrics(), this.getMonitoringMetrics(), "Metrics", null, 0, 1, Monitoring.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoring_Sensors(), this.getSensor(), null, "Sensors", null, 1, -1, Monitoring.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitoring_Control(), this.getControlling(), null, "Control", null, 0, 1, Monitoring.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMonitoring__CalculateAverage__SensorType(), ecorePackage.getEFloat(), "calculateAverage",
				1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSensorType(), "type", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMonitoring__CheckCondition(), this.getMonitoringCondition(), "checkCondition", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(controllingEClass, Controlling.class, "Controlling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlling_ControlType(), this.getControlType(), "ControlType", null, 0, 1,
				Controlling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlling_Action(), this.getControllerAction(), "Action", null, 0, 1, Controlling.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlling_Actuators(), this.getActuator(), null, "Actuators", null, 1, -1,
				Controlling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Type(), this.getActuatorType(), "Type", null, 0, 1, Actuator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuator_Protocol(), this.getCommunicationProtocol(), null, "Protocol", null, 1, 1,
				Actuator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActuator__IsUsed(), ecorePackage.getEBooleanObject(), "isUsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensor_Type(), this.getSensorType(), "Type", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_State(), this.getSensorState(), "State", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Unit(), ecorePackage.getEString(), "Unit", null, 0, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSensor_Value(), ecorePackage.getEFloat(), "Value", null, 1, 1, Sensor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensor_Protocol(), this.getCommunicationProtocol(), null, "Protocol", null, 1, 1,
				Sensor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSensor__IsUsed(), ecorePackage.getEBooleanObject(), "isUsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSensor__SensorMinusConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"SensorMinusConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(communicationProtocolEClass, CommunicationProtocol.class, "CommunicationProtocol", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationProtocol_Type(), this.getCommunicationType(), "Type", null, 0, 1,
				CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_SensorNumber(), ecorePackage.getEBigInteger(), "SensorNumber", null, 0,
				1, CommunicationProtocol.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationProtocol_ActuatorNumber(), ecorePackage.getEBigInteger(), "ActuatorNumber", null,
				0, 1, CommunicationProtocol.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cropGroupEEnum, CropGroup.class, "CropGroup");
		addEEnumLiteral(cropGroupEEnum, CropGroup.VEGETABLE);
		addEEnumLiteral(cropGroupEEnum, CropGroup.FRUIT);
		addEEnumLiteral(cropGroupEEnum, CropGroup.FLOWER);
		addEEnumLiteral(cropGroupEEnum, CropGroup.TUBERS);

		initEEnum(actuatorTypeEEnum, ActuatorType.class, "ActuatorType");
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.AIR_CONDITIONER);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.NUTRIENT_CONTROLLER);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.LED_CONTROLLER);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.OXYGEN_CONTROLLER);
		addEEnumLiteral(actuatorTypeEEnum, ActuatorType.CO2_CONTROLLER);

		initEEnum(analyticsTypeEEnum, AnalyticsType.class, "AnalyticsType");
		addEEnumLiteral(analyticsTypeEEnum, AnalyticsType.HARVESTING);
		addEEnumLiteral(analyticsTypeEEnum, AnalyticsType.SEEDING);
		addEEnumLiteral(analyticsTypeEEnum, AnalyticsType.RESOURCE);

		initEEnum(communicationTypeEEnum, CommunicationType.class, "CommunicationType");
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.ZIG_BEE);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.MQTT);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.COAP);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.HTTP);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.WIFI);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.BLUETOOTH);
		addEEnumLiteral(communicationTypeEEnum, CommunicationType.ZWAVE);

		initEEnum(controllerActionEEnum, ControllerAction.class, "ControllerAction");
		addEEnumLiteral(controllerActionEEnum, ControllerAction.INCREASE);
		addEEnumLiteral(controllerActionEEnum, ControllerAction.DECREASE);
		addEEnumLiteral(controllerActionEEnum, ControllerAction.ON);
		addEEnumLiteral(controllerActionEEnum, ControllerAction.OFF);
		addEEnumLiteral(controllerActionEEnum, ControllerAction.ALERT);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.AIR_CONDITIONER);
		addEEnumLiteral(controlTypeEEnum, ControlType.NUTRIENT_CONTROLLER);
		addEEnumLiteral(controlTypeEEnum, ControlType.LED_CONTROLLER);
		addEEnumLiteral(controlTypeEEnum, ControlType.OXYGEN_CONTROLLER);
		addEEnumLiteral(controlTypeEEnum, ControlType.CO2_CONTROLLER);

		initEEnum(monitoringConditionEEnum, MonitoringCondition.class, "MonitoringCondition");
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.OPTIMUM);
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.HEALTHY);
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.GOOD);
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.WARNING);
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.DANGER);
		addEEnumLiteral(monitoringConditionEEnum, MonitoringCondition.INVALID);

		initEEnum(monitoringMetricsEEnum, MonitoringMetrics.class, "MonitoringMetrics");
		addEEnumLiteral(monitoringMetricsEEnum, MonitoringMetrics.NUTRIENT);
		addEEnumLiteral(monitoringMetricsEEnum, MonitoringMetrics.PHOTO_SYNTHESIS);
		addEEnumLiteral(monitoringMetricsEEnum, MonitoringMetrics.ENVIRONMENTAL_SAFETY);

		initEEnum(outputTypeEEnum, OutputType.class, "OutputType");
		addEEnumLiteral(outputTypeEEnum, OutputType.LINE_GRAPH);
		addEEnumLiteral(outputTypeEEnum, OutputType.PIE_CHART);
		addEEnumLiteral(outputTypeEEnum, OutputType.BAR_CHART);
		addEEnumLiteral(outputTypeEEnum, OutputType.TABULAR);

		initEEnum(sensorStateEEnum, SensorState.class, "SensorState");
		addEEnumLiteral(sensorStateEEnum, SensorState.ACTIVE);
		addEEnumLiteral(sensorStateEEnum, SensorState.PASSIVE);

		initEEnum(sensorTypeEEnum, SensorType.class, "SensorType");
		addEEnumLiteral(sensorTypeEEnum, SensorType.TEMPERATURE);
		addEEnumLiteral(sensorTypeEEnum, SensorType.HUMIDITY);
		addEEnumLiteral(sensorTypeEEnum, SensorType.CO2);
		addEEnumLiteral(sensorTypeEEnum, SensorType.OXYGEN);
		addEEnumLiteral(sensorTypeEEnum, SensorType.PH);
		addEEnumLiteral(sensorTypeEEnum, SensorType.EC);
		addEEnumLiteral(sensorTypeEEnum, SensorType.LED_LIGHT);
		addEEnumLiteral(sensorTypeEEnum, SensorType.SURVEILLANCE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(farmEClass, source, new String[] { "constraints", "ValidSize" });
		addAnnotation(namedEClass, source, new String[] { "constraints", "MustHaveName" });
		addAnnotation(cropEClass, source, new String[] { "constraints", "CropUniqueID" });
		addAnnotation(farmerEClass, source, new String[] { "constraints", "FarmerUniqueID" });
		addAnnotation(serviceEClass, source, new String[] { "constraints", "ServiceMustHaveID" });
		addAnnotation(deviceEClass, source, new String[] { "constraints", "DeviceMustHaveID" });
		addAnnotation(gatewayEClass, source, new String[] { "constraints", "GatewayUniqueID" });
		addAnnotation(sensorEClass, source, new String[] { "constraints", "SensorMinusConstraint" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getFarm__ValidSize__DiagnosticChain_Map(), source, new String[] { "body", "Size > 0" });
		addAnnotation(getNamed__MustHaveName__DiagnosticChain_Map(), source,
				new String[] { "body", "not name.oclIsUndefined()" });
		addAnnotation(getCrop__CropUniqueID__DiagnosticChain_Map(), source,
				new String[] { "body", "self.Farm.Crops->select(x | x.SeedCode = self.SeedCode)->size() = 1" });
		addAnnotation(getFarmer__FarmerMustHaveID__DiagnosticChain_Map(), source,
				new String[] { "body", "not FarmerID.oclIsUndefined()" });
		addAnnotation(getFarmer__FarmerUniqueID__DiagnosticChain_Map(), source,
				new String[] { "body", "self.Farm.Farmers->select(x | x.FarmerID = self.FarmerID)->size() = 1" });
		addAnnotation(getService__ServiceUniqueID__DiagnosticChain_Map(), source, new String[] { "body",
				"self.IoTSystem.Services->select(x | x.ServiceID = self.ServiceID)->size() = 1" });
		addAnnotation(getService__ServiceMustHaveID__DiagnosticChain_Map(), source,
				new String[] { "body", "not ServiceID.oclIsUndefined()" });
		addAnnotation(getDevice__DeviceUniqueID__DiagnosticChain_Map(), source,
				new String[] { "body", "self.IoTSystem.Devices->select(x | x.DeviceID = self.DeviceID)->size() = 1" });
		addAnnotation(getDevice__DeviceMustHaveID__DiagnosticChain_Map(), source,
				new String[] { "body", "not DeviceID.oclIsUndefined()" });
		addAnnotation(getGateway__GatewayMustHaveID__DiagnosticChain_Map(), source,
				new String[] { "body", "not GatewayID.oclIsUndefined()" });
		addAnnotation(getGateway__GatewayUniqueID__DiagnosticChain_Map(), source, new String[] { "body",
				"self.IoTSystem.Gateways->select(x | x.GatewayID = self.GatewayID)->size() = 1" });
		addAnnotation(getMonitoring__CalculateAverage__SensorType(), source, new String[] { "body",
				"self.Sensors->select(x: Sensor | x.Type = type)->iterate(x: Sensor; average: ecore::EFloat = 0 | average + x.Value) / self.Sensors->select(x: Sensor | x.Type = type)->size()" });
		addAnnotation(getMonitoring__CheckCondition(), source, new String[] { "body",
				"\n\t\t\tif(Metrics = MonitoringMetrics::Nutrient) then\n\t\t\t\tif (calculateAverage(SensorType::EC) < 40.0)  then\n\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\telse\n\t\t\t\t\tif(calculateAverage(SensorType::EC) < 55.0 and ((calculateAverage(SensorType::PH) >=-1 and calculateAverage(SensorType::PH) < 0) or (calculateAverage(SensorType::PH) > 3 and calculateAverage(SensorType::PH) <= 4))) then\n\t\t\t\t\t\tMonitoringCondition::Warning\n\t\t\t\t\telse\n\t\t\t\t\t\tif(calculateAverage(SensorType::EC) < 65.0 and ((calculateAverage(SensorType::PH) >=0 and calculateAverage(SensorType::PH) < 1) or (calculateAverage(SensorType::PH) > 2 and calculateAverage(SensorType::PH) <= 3))) then\n\t\t\t\t\t\t\tMonitoringCondition::Good\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(calculateAverage(SensorType::EC) < 75 and (calculateAverage(SensorType::PH) >= 1 and calculateAverage(SensorType::PH) <= 2)) then\n\t\t\t\t\t\t\t\tMonitoringCondition::Healthy\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(calculateAverage(SensorType::EC) >=75 and calculateAverage(SensorType::PH) = 1.5) then\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Optimum\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\tendif\n\t\t\telse\n\t\t\t\tif(Metrics = MonitoringMetrics::EnvironmentalSafety) then\n\t\t\t\t\tif (calculateAverage(SensorType::CO2) >= 5000)  then\n\t\t\t\t\t\tMonitoringCondition::Danger\n\t\t\t\t\telse \n\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) >=3000) then\n\t\t\t\t\t\t\tMonitoringCondition::Warning\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) >=1500) then\n\t\t\t\t\t\t\t\tMonitoringCondition::Good\n\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\tif(calculateAverage(SensorType::CO2) >= 900) then\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Healthy\n\t\t\t\t\t\t\t\telse\n\t\t\t\t\t\t\t\t\tMonitoringCondition::Optimum\n\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse\n\t\t\t\t\tMonitoringCondition::Invalid\n\t\t\t\tendif\n\t\t\tendif" });
		addAnnotation(getActuator__IsUsed(), source, new String[] { "body",
				" Controlling.allInstances()->select(x: Controlling | x.Actuators->exists(actuator | actuator = self))->size() > 0" });
		addAnnotation(getSensor__IsUsed(), source, new String[] { "body",
				"Monitoring.allInstances()->select(x: Monitoring | x.Sensors->exists(sensor | sensor = self))->size() > 0" });
		addAnnotation(getSensor__SensorMinusConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tif(self.Type = SensorType::Temperature) then\n\t\t\t\ttrue\n\t\t\telse \n\t\t\t\tself.Value > 0\n\t\t\tendif" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation(getService_PIC(), source, new String[] { "nullFree", "false" });
	}

} //SmartFarmingXTextPackageImpl
