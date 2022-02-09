/**
 */
package smartFarmingXText;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see smartFarmingXText.SmartFarmingXTextFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SmartFarmingXTextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smartFarmingXText";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/smartFarmingXText";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smartFarmingXText";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmartFarmingXTextPackage eINSTANCE = smartFarmingXText.impl.SmartFarmingXTextPackageImpl.init();

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.NamedImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.FarmImpl <em>Farm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.FarmImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getFarm()
	 * @generated
	 */
	int FARM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__LOCATION = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__SIZE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__CROPS = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Farmers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__FARMERS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM__IO_TSYSTEM = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Farm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Valid Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM___VALID_SIZE__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Farm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARM_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.CropImpl <em>Crop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.CropImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCrop()
	 * @generated
	 */
	int CROP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Crop Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__CROP_GROUP = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Growth Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__GROWTH_DURATION = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Seed Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__SEED_CODE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Farm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP__FARM = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Crop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Crop Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP___CROP_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Crop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROP_OPERATION_COUNT = NAMED_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.FarmerImpl <em>Farmer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.FarmerImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getFarmer()
	 * @generated
	 */
	int FARMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Farmer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__FARMER_ID = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__EMAIL = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__PHONE_NUMBER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Farm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__FARM = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER__SERVICES = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Farmer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Farmer Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER___FARMER_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Farmer Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER___FARMER_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Farmer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARMER_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.IoTSystemImpl <em>Io TSystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.IoTSystemImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getIoTSystem()
	 * @generated
	 */
	int IO_TSYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM__VERSION = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM__SERVICES = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM__DEVICES = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gateways</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM__GATEWAYS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Io TSystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Io TSystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_TSYSTEM_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.ServiceImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_ID = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HOST = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__URI = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IO_TSYSTEM = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>PIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PIC = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Service Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.DeviceImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_ID = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IP_ADDRESS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MANUFACTURER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__IO_TSYSTEM = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Device Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Device Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.GatewayImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Gateway ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__GATEWAY_ID = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__MODEL = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__PROTOCOLS = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DEVICES = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__IO_TSYSTEM = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Gateway Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY___GATEWAY_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Gateway Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY___GATEWAY_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.AnalyticsSystemImpl <em>Analytics System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.AnalyticsSystemImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getAnalyticsSystem()
	 * @generated
	 */
	int ANALYTICS_SYSTEM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__SERVICE_ID = SERVICE__SERVICE_ID;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__HOST = SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__URI = SERVICE__URI;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__IO_TSYSTEM = SERVICE__IO_TSYSTEM;

	/**
	 * The feature id for the '<em><b>PIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__PIC = SERVICE__PIC;

	/**
	 * The feature id for the '<em><b>Analytics Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__ANALYTICS_TYPE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__DATA_SOURCE = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM__OUTPUT_TYPE = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Analytics System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = SERVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Analytics System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYTICS_SYSTEM_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.MonitoringImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__SERVICE_ID = SERVICE__SERVICE_ID;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__HOST = SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__URI = SERVICE__URI;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__IO_TSYSTEM = SERVICE__IO_TSYSTEM;

	/**
	 * The feature id for the '<em><b>PIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__PIC = SERVICE__PIC;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__METRICS = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__SENSORS = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__CONTROL = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = SERVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Calculate Average</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING___CALCULATE_AVERAGE__SENSORTYPE = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING___CHECK_CONDITION = SERVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.ControllingImpl <em>Controlling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.ControllingImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControlling()
	 * @generated
	 */
	int CONTROLLING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__SERVICE_ID = SERVICE__SERVICE_ID;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__HOST = SERVICE__HOST;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__URI = SERVICE__URI;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__IO_TSYSTEM = SERVICE__IO_TSYSTEM;

	/**
	 * The feature id for the '<em><b>PIC</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__PIC = SERVICE__PIC;

	/**
	 * The feature id for the '<em><b>Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__CONTROL_TYPE = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__ACTION = SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING__ACTUATORS = SERVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controlling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = SERVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Service Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Controlling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLING_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.ActuatorImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DEVICE_ID = DEVICE__DEVICE_ID;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IP_ADDRESS = DEVICE__IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MANUFACTURER = DEVICE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__IO_TSYSTEM = DEVICE__IO_TSYSTEM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PROTOCOL = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = DEVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Device Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Device Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___IS_USED = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.SensorImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEVICE_ID = DEVICE__DEVICE_ID;

	/**
	 * The feature id for the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IP_ADDRESS = DEVICE__IP_ADDRESS;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MANUFACTURER = DEVICE__MANUFACTURER;

	/**
	 * The feature id for the '<em><b>Io TSystem</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IO_TSYSTEM = DEVICE__IO_TSYSTEM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__STATE = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__UNIT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROTOCOL = DEVICE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = DEVICE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Device Unique ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Device Must Have ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Used</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___IS_USED = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Sensor Minus Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___SENSOR_MINUS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = DEVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link smartFarmingXText.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.impl.CommunicationProtocolImpl
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__SENSOR_NUMBER = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuator Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER = NAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_FEATURE_COUNT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Must Have Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link smartFarmingXText.CropGroup <em>Crop Group</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.CropGroup
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCropGroup()
	 * @generated
	 */
	int CROP_GROUP = 14;

	/**
	 * The meta object id for the '{@link smartFarmingXText.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.ActuatorType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link smartFarmingXText.AnalyticsType <em>Analytics Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.AnalyticsType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getAnalyticsType()
	 * @generated
	 */
	int ANALYTICS_TYPE = 16;

	/**
	 * The meta object id for the '{@link smartFarmingXText.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.CommunicationType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 17;

	/**
	 * The meta object id for the '{@link smartFarmingXText.ControllerAction <em>Controller Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.ControllerAction
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControllerAction()
	 * @generated
	 */
	int CONTROLLER_ACTION = 18;

	/**
	 * The meta object id for the '{@link smartFarmingXText.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.ControlType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 19;

	/**
	 * The meta object id for the '{@link smartFarmingXText.MonitoringCondition <em>Monitoring Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.MonitoringCondition
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoringCondition()
	 * @generated
	 */
	int MONITORING_CONDITION = 20;

	/**
	 * The meta object id for the '{@link smartFarmingXText.MonitoringMetrics <em>Monitoring Metrics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.MonitoringMetrics
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoringMetrics()
	 * @generated
	 */
	int MONITORING_METRICS = 21;

	/**
	 * The meta object id for the '{@link smartFarmingXText.OutputType <em>Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.OutputType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 22;

	/**
	 * The meta object id for the '{@link smartFarmingXText.SensorState <em>Sensor State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.SensorState
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensorState()
	 * @generated
	 */
	int SENSOR_STATE = 23;

	/**
	 * The meta object id for the '{@link smartFarmingXText.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see smartFarmingXText.SensorType
	 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 24;

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Farm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Farm</em>'.
	 * @see smartFarmingXText.Farm
	 * @generated
	 */
	EClass getFarm();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Farm#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see smartFarmingXText.Farm#getLocation()
	 * @see #getFarm()
	 * @generated
	 */
	EAttribute getFarm_Location();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Farm#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see smartFarmingXText.Farm#getSize()
	 * @see #getFarm()
	 * @generated
	 */
	EAttribute getFarm_Size();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.Farm#getCrops <em>Crops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crops</em>'.
	 * @see smartFarmingXText.Farm#getCrops()
	 * @see #getFarm()
	 * @generated
	 */
	EReference getFarm_Crops();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.Farm#getFarmers <em>Farmers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Farmers</em>'.
	 * @see smartFarmingXText.Farm#getFarmers()
	 * @see #getFarm()
	 * @generated
	 */
	EReference getFarm_Farmers();

	/**
	 * Returns the meta object for the containment reference '{@link smartFarmingXText.Farm#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io TSystem</em>'.
	 * @see smartFarmingXText.Farm#getIoTSystem()
	 * @see #getFarm()
	 * @generated
	 */
	EReference getFarm_IoTSystem();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Farm#ValidSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Size</em>' operation.
	 * @see smartFarmingXText.Farm#ValidSize(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFarm__ValidSize__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see smartFarmingXText.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see smartFarmingXText.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Named#MustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Must Have Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Have Name</em>' operation.
	 * @see smartFarmingXText.Named#MustHaveName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNamed__MustHaveName__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Crop <em>Crop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crop</em>'.
	 * @see smartFarmingXText.Crop
	 * @generated
	 */
	EClass getCrop();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Crop#getCropGroup <em>Crop Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crop Group</em>'.
	 * @see smartFarmingXText.Crop#getCropGroup()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_CropGroup();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Crop#getGrowthDuration <em>Growth Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Growth Duration</em>'.
	 * @see smartFarmingXText.Crop#getGrowthDuration()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_GrowthDuration();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Crop#getSeedCode <em>Seed Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed Code</em>'.
	 * @see smartFarmingXText.Crop#getSeedCode()
	 * @see #getCrop()
	 * @generated
	 */
	EAttribute getCrop_SeedCode();

	/**
	 * Returns the meta object for the container reference '{@link smartFarmingXText.Crop#getFarm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Farm</em>'.
	 * @see smartFarmingXText.Crop#getFarm()
	 * @see #getCrop()
	 * @generated
	 */
	EReference getCrop_Farm();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Crop#CropUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Crop Unique ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Crop Unique ID</em>' operation.
	 * @see smartFarmingXText.Crop#CropUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCrop__CropUniqueID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Farmer <em>Farmer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Farmer</em>'.
	 * @see smartFarmingXText.Farmer
	 * @generated
	 */
	EClass getFarmer();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Farmer#getFarmerID <em>Farmer ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Farmer ID</em>'.
	 * @see smartFarmingXText.Farmer#getFarmerID()
	 * @see #getFarmer()
	 * @generated
	 */
	EAttribute getFarmer_FarmerID();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Farmer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see smartFarmingXText.Farmer#getEmail()
	 * @see #getFarmer()
	 * @generated
	 */
	EAttribute getFarmer_Email();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Farmer#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see smartFarmingXText.Farmer#getPhoneNumber()
	 * @see #getFarmer()
	 * @generated
	 */
	EAttribute getFarmer_PhoneNumber();

	/**
	 * Returns the meta object for the container reference '{@link smartFarmingXText.Farmer#getFarm <em>Farm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Farm</em>'.
	 * @see smartFarmingXText.Farmer#getFarm()
	 * @see #getFarmer()
	 * @generated
	 */
	EReference getFarmer_Farm();

	/**
	 * Returns the meta object for the reference list '{@link smartFarmingXText.Farmer#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see smartFarmingXText.Farmer#getServices()
	 * @see #getFarmer()
	 * @generated
	 */
	EReference getFarmer_Services();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Farmer#FarmerMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Farmer Must Have ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Farmer Must Have ID</em>' operation.
	 * @see smartFarmingXText.Farmer#FarmerMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFarmer__FarmerMustHaveID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Farmer#FarmerUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Farmer Unique ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Farmer Unique ID</em>' operation.
	 * @see smartFarmingXText.Farmer#FarmerUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFarmer__FarmerUniqueID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.IoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Io TSystem</em>'.
	 * @see smartFarmingXText.IoTSystem
	 * @generated
	 */
	EClass getIoTSystem();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.IoTSystem#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see smartFarmingXText.IoTSystem#getVersion()
	 * @see #getIoTSystem()
	 * @generated
	 */
	EAttribute getIoTSystem_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.IoTSystem#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see smartFarmingXText.IoTSystem#getServices()
	 * @see #getIoTSystem()
	 * @generated
	 */
	EReference getIoTSystem_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.IoTSystem#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see smartFarmingXText.IoTSystem#getDevices()
	 * @see #getIoTSystem()
	 * @generated
	 */
	EReference getIoTSystem_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.IoTSystem#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gateways</em>'.
	 * @see smartFarmingXText.IoTSystem#getGateways()
	 * @see #getIoTSystem()
	 * @generated
	 */
	EReference getIoTSystem_Gateways();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see smartFarmingXText.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Service#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see smartFarmingXText.Service#getServiceID()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceID();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Service#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see smartFarmingXText.Service#getHost()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Host();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Service#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see smartFarmingXText.Service#getURI()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_URI();

	/**
	 * Returns the meta object for the container reference '{@link smartFarmingXText.Service#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Io TSystem</em>'.
	 * @see smartFarmingXText.Service#getIoTSystem()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_IoTSystem();

	/**
	 * Returns the meta object for the reference list '{@link smartFarmingXText.Service#getPIC <em>PIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>PIC</em>'.
	 * @see smartFarmingXText.Service#getPIC()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_PIC();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Service#ServiceUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Service Unique ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service Unique ID</em>' operation.
	 * @see smartFarmingXText.Service#ServiceUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getService__ServiceUniqueID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Service#ServiceMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Service Must Have ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service Must Have ID</em>' operation.
	 * @see smartFarmingXText.Service#ServiceMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getService__ServiceMustHaveID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see smartFarmingXText.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Device#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see smartFarmingXText.Device#getDeviceID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Device#getIPAddress <em>IP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP Address</em>'.
	 * @see smartFarmingXText.Device#getIPAddress()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_IPAddress();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Device#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see smartFarmingXText.Device#getManufacturer()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Manufacturer();

	/**
	 * Returns the meta object for the container reference '{@link smartFarmingXText.Device#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Io TSystem</em>'.
	 * @see smartFarmingXText.Device#getIoTSystem()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_IoTSystem();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Device#DeviceUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Device Unique ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Device Unique ID</em>' operation.
	 * @see smartFarmingXText.Device#DeviceUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDevice__DeviceUniqueID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Device#DeviceMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Device Must Have ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Device Must Have ID</em>' operation.
	 * @see smartFarmingXText.Device#DeviceMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDevice__DeviceMustHaveID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see smartFarmingXText.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Gateway#getGatewayID <em>Gateway ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway ID</em>'.
	 * @see smartFarmingXText.Gateway#getGatewayID()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_GatewayID();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Gateway#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see smartFarmingXText.Gateway#getModel()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link smartFarmingXText.Gateway#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see smartFarmingXText.Gateway#getProtocols()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Protocols();

	/**
	 * Returns the meta object for the reference list '{@link smartFarmingXText.Gateway#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see smartFarmingXText.Gateway#getDevices()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Devices();

	/**
	 * Returns the meta object for the container reference '{@link smartFarmingXText.Gateway#getIoTSystem <em>Io TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Io TSystem</em>'.
	 * @see smartFarmingXText.Gateway#getIoTSystem()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_IoTSystem();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Gateway#GatewayMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Gateway Must Have ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gateway Must Have ID</em>' operation.
	 * @see smartFarmingXText.Gateway#GatewayMustHaveID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGateway__GatewayMustHaveID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Gateway#GatewayUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Gateway Unique ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gateway Unique ID</em>' operation.
	 * @see smartFarmingXText.Gateway#GatewayUniqueID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGateway__GatewayUniqueID__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.AnalyticsSystem <em>Analytics System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analytics System</em>'.
	 * @see smartFarmingXText.AnalyticsSystem
	 * @generated
	 */
	EClass getAnalyticsSystem();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.AnalyticsSystem#getAnalyticsType <em>Analytics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analytics Type</em>'.
	 * @see smartFarmingXText.AnalyticsSystem#getAnalyticsType()
	 * @see #getAnalyticsSystem()
	 * @generated
	 */
	EAttribute getAnalyticsSystem_AnalyticsType();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.AnalyticsSystem#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source</em>'.
	 * @see smartFarmingXText.AnalyticsSystem#getDataSource()
	 * @see #getAnalyticsSystem()
	 * @generated
	 */
	EAttribute getAnalyticsSystem_DataSource();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.AnalyticsSystem#getOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type</em>'.
	 * @see smartFarmingXText.AnalyticsSystem#getOutputType()
	 * @see #getAnalyticsSystem()
	 * @generated
	 */
	EAttribute getAnalyticsSystem_OutputType();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see smartFarmingXText.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Monitoring#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metrics</em>'.
	 * @see smartFarmingXText.Monitoring#getMetrics()
	 * @see #getMonitoring()
	 * @generated
	 */
	EAttribute getMonitoring_Metrics();

	/**
	 * Returns the meta object for the reference list '{@link smartFarmingXText.Monitoring#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see smartFarmingXText.Monitoring#getSensors()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Sensors();

	/**
	 * Returns the meta object for the reference '{@link smartFarmingXText.Monitoring#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control</em>'.
	 * @see smartFarmingXText.Monitoring#getControl()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Control();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Monitoring#calculateAverage(smartFarmingXText.SensorType) <em>Calculate Average</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Average</em>' operation.
	 * @see smartFarmingXText.Monitoring#calculateAverage(smartFarmingXText.SensorType)
	 * @generated
	 */
	EOperation getMonitoring__CalculateAverage__SensorType();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Monitoring#checkCondition() <em>Check Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Condition</em>' operation.
	 * @see smartFarmingXText.Monitoring#checkCondition()
	 * @generated
	 */
	EOperation getMonitoring__CheckCondition();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Controlling <em>Controlling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlling</em>'.
	 * @see smartFarmingXText.Controlling
	 * @generated
	 */
	EClass getControlling();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Controlling#getControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Type</em>'.
	 * @see smartFarmingXText.Controlling#getControlType()
	 * @see #getControlling()
	 * @generated
	 */
	EAttribute getControlling_ControlType();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Controlling#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see smartFarmingXText.Controlling#getAction()
	 * @see #getControlling()
	 * @generated
	 */
	EAttribute getControlling_Action();

	/**
	 * Returns the meta object for the reference list '{@link smartFarmingXText.Controlling#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actuators</em>'.
	 * @see smartFarmingXText.Controlling#getActuators()
	 * @see #getControlling()
	 * @generated
	 */
	EReference getControlling_Actuators();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see smartFarmingXText.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smartFarmingXText.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for the reference '{@link smartFarmingXText.Actuator#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see smartFarmingXText.Actuator#getProtocol()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Protocol();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Actuator#isUsed() <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see smartFarmingXText.Actuator#isUsed()
	 * @generated
	 */
	EOperation getActuator__IsUsed();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see smartFarmingXText.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smartFarmingXText.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Sensor#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see smartFarmingXText.Sensor#getState()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_State();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Sensor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see smartFarmingXText.Sensor#getUnit()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Unit();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.Sensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see smartFarmingXText.Sensor#getValue()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Value();

	/**
	 * Returns the meta object for the reference '{@link smartFarmingXText.Sensor#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see smartFarmingXText.Sensor#getProtocol()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Protocol();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Sensor#isUsed() <em>Is Used</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Used</em>' operation.
	 * @see smartFarmingXText.Sensor#isUsed()
	 * @generated
	 */
	EOperation getSensor__IsUsed();

	/**
	 * Returns the meta object for the '{@link smartFarmingXText.Sensor#SensorMinusConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Sensor Minus Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sensor Minus Constraint</em>' operation.
	 * @see smartFarmingXText.Sensor#SensorMinusConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSensor__SensorMinusConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link smartFarmingXText.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Protocol</em>'.
	 * @see smartFarmingXText.CommunicationProtocol
	 * @generated
	 */
	EClass getCommunicationProtocol();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.CommunicationProtocol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see smartFarmingXText.CommunicationProtocol#getType()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_Type();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.CommunicationProtocol#getSensorNumber <em>Sensor Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor Number</em>'.
	 * @see smartFarmingXText.CommunicationProtocol#getSensorNumber()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_SensorNumber();

	/**
	 * Returns the meta object for the attribute '{@link smartFarmingXText.CommunicationProtocol#getActuatorNumber <em>Actuator Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Number</em>'.
	 * @see smartFarmingXText.CommunicationProtocol#getActuatorNumber()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EAttribute getCommunicationProtocol_ActuatorNumber();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.CropGroup <em>Crop Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crop Group</em>'.
	 * @see smartFarmingXText.CropGroup
	 * @generated
	 */
	EEnum getCropGroup();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see smartFarmingXText.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.AnalyticsType <em>Analytics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analytics Type</em>'.
	 * @see smartFarmingXText.AnalyticsType
	 * @generated
	 */
	EEnum getAnalyticsType();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see smartFarmingXText.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.ControllerAction <em>Controller Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controller Action</em>'.
	 * @see smartFarmingXText.ControllerAction
	 * @generated
	 */
	EEnum getControllerAction();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see smartFarmingXText.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.MonitoringCondition <em>Monitoring Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring Condition</em>'.
	 * @see smartFarmingXText.MonitoringCondition
	 * @generated
	 */
	EEnum getMonitoringCondition();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.MonitoringMetrics <em>Monitoring Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring Metrics</em>'.
	 * @see smartFarmingXText.MonitoringMetrics
	 * @generated
	 */
	EEnum getMonitoringMetrics();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Type</em>'.
	 * @see smartFarmingXText.OutputType
	 * @generated
	 */
	EEnum getOutputType();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.SensorState <em>Sensor State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor State</em>'.
	 * @see smartFarmingXText.SensorState
	 * @generated
	 */
	EEnum getSensorState();

	/**
	 * Returns the meta object for enum '{@link smartFarmingXText.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see smartFarmingXText.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmartFarmingXTextFactory getSmartFarmingXTextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.FarmImpl <em>Farm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.FarmImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getFarm()
		 * @generated
		 */
		EClass FARM = eINSTANCE.getFarm();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARM__LOCATION = eINSTANCE.getFarm_Location();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARM__SIZE = eINSTANCE.getFarm_Size();

		/**
		 * The meta object literal for the '<em><b>Crops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARM__CROPS = eINSTANCE.getFarm_Crops();

		/**
		 * The meta object literal for the '<em><b>Farmers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARM__FARMERS = eINSTANCE.getFarm_Farmers();

		/**
		 * The meta object literal for the '<em><b>Io TSystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARM__IO_TSYSTEM = eINSTANCE.getFarm_IoTSystem();

		/**
		 * The meta object literal for the '<em><b>Valid Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARM___VALID_SIZE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFarm__ValidSize__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.NamedImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '<em><b>Must Have Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAMED___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getNamed__MustHaveName__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.CropImpl <em>Crop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.CropImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCrop()
		 * @generated
		 */
		EClass CROP = eINSTANCE.getCrop();

		/**
		 * The meta object literal for the '<em><b>Crop Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__CROP_GROUP = eINSTANCE.getCrop_CropGroup();

		/**
		 * The meta object literal for the '<em><b>Growth Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__GROWTH_DURATION = eINSTANCE.getCrop_GrowthDuration();

		/**
		 * The meta object literal for the '<em><b>Seed Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROP__SEED_CODE = eINSTANCE.getCrop_SeedCode();

		/**
		 * The meta object literal for the '<em><b>Farm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROP__FARM = eINSTANCE.getCrop_Farm();

		/**
		 * The meta object literal for the '<em><b>Crop Unique ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CROP___CROP_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCrop__CropUniqueID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.FarmerImpl <em>Farmer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.FarmerImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getFarmer()
		 * @generated
		 */
		EClass FARMER = eINSTANCE.getFarmer();

		/**
		 * The meta object literal for the '<em><b>Farmer ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARMER__FARMER_ID = eINSTANCE.getFarmer_FarmerID();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARMER__EMAIL = eINSTANCE.getFarmer_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FARMER__PHONE_NUMBER = eINSTANCE.getFarmer_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Farm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARMER__FARM = eINSTANCE.getFarmer_Farm();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARMER__SERVICES = eINSTANCE.getFarmer_Services();

		/**
		 * The meta object literal for the '<em><b>Farmer Must Have ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARMER___FARMER_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFarmer__FarmerMustHaveID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Farmer Unique ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FARMER___FARMER_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFarmer__FarmerUniqueID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.IoTSystemImpl <em>Io TSystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.IoTSystemImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getIoTSystem()
		 * @generated
		 */
		EClass IO_TSYSTEM = eINSTANCE.getIoTSystem();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_TSYSTEM__VERSION = eINSTANCE.getIoTSystem_Version();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSYSTEM__SERVICES = eINSTANCE.getIoTSystem_Services();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSYSTEM__DEVICES = eINSTANCE.getIoTSystem_Devices();

		/**
		 * The meta object literal for the '<em><b>Gateways</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_TSYSTEM__GATEWAYS = eINSTANCE.getIoTSystem_Gateways();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.ServiceImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_ID = eINSTANCE.getService_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__HOST = eINSTANCE.getService_Host();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__URI = eINSTANCE.getService_URI();

		/**
		 * The meta object literal for the '<em><b>Io TSystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IO_TSYSTEM = eINSTANCE.getService_IoTSystem();

		/**
		 * The meta object literal for the '<em><b>PIC</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PIC = eINSTANCE.getService_PIC();

		/**
		 * The meta object literal for the '<em><b>Service Unique ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___SERVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getService__ServiceUniqueID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Service Must Have ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE___SERVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getService__ServiceMustHaveID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.DeviceImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_ID = eINSTANCE.getDevice_DeviceID();

		/**
		 * The meta object literal for the '<em><b>IP Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__IP_ADDRESS = eINSTANCE.getDevice_IPAddress();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__MANUFACTURER = eINSTANCE.getDevice_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Io TSystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__IO_TSYSTEM = eINSTANCE.getDevice_IoTSystem();

		/**
		 * The meta object literal for the '<em><b>Device Unique ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___DEVICE_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDevice__DeviceUniqueID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Device Must Have ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEVICE___DEVICE_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDevice__DeviceMustHaveID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.GatewayImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Gateway ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__GATEWAY_ID = eINSTANCE.getGateway_GatewayID();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__MODEL = eINSTANCE.getGateway_Model();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__PROTOCOLS = eINSTANCE.getGateway_Protocols();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__DEVICES = eINSTANCE.getGateway_Devices();

		/**
		 * The meta object literal for the '<em><b>Io TSystem</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__IO_TSYSTEM = eINSTANCE.getGateway_IoTSystem();

		/**
		 * The meta object literal for the '<em><b>Gateway Must Have ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATEWAY___GATEWAY_MUST_HAVE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGateway__GatewayMustHaveID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Gateway Unique ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GATEWAY___GATEWAY_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getGateway__GatewayUniqueID__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.AnalyticsSystemImpl <em>Analytics System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.AnalyticsSystemImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getAnalyticsSystem()
		 * @generated
		 */
		EClass ANALYTICS_SYSTEM = eINSTANCE.getAnalyticsSystem();

		/**
		 * The meta object literal for the '<em><b>Analytics Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTICS_SYSTEM__ANALYTICS_TYPE = eINSTANCE.getAnalyticsSystem_AnalyticsType();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTICS_SYSTEM__DATA_SOURCE = eINSTANCE.getAnalyticsSystem_DataSource();

		/**
		 * The meta object literal for the '<em><b>Output Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYTICS_SYSTEM__OUTPUT_TYPE = eINSTANCE.getAnalyticsSystem_OutputType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.MonitoringImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoring()
		 * @generated
		 */
		EClass MONITORING = eINSTANCE.getMonitoring();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING__METRICS = eINSTANCE.getMonitoring_Metrics();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__SENSORS = eINSTANCE.getMonitoring_Sensors();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__CONTROL = eINSTANCE.getMonitoring_Control();

		/**
		 * The meta object literal for the '<em><b>Calculate Average</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MONITORING___CALCULATE_AVERAGE__SENSORTYPE = eINSTANCE.getMonitoring__CalculateAverage__SensorType();

		/**
		 * The meta object literal for the '<em><b>Check Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MONITORING___CHECK_CONDITION = eINSTANCE.getMonitoring__CheckCondition();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.ControllingImpl <em>Controlling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.ControllingImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControlling()
		 * @generated
		 */
		EClass CONTROLLING = eINSTANCE.getControlling();

		/**
		 * The meta object literal for the '<em><b>Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLING__CONTROL_TYPE = eINSTANCE.getControlling_ControlType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLING__ACTION = eINSTANCE.getControlling_Action();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLING__ACTUATORS = eINSTANCE.getControlling_Actuators();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.ActuatorImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__PROTOCOL = eINSTANCE.getActuator_Protocol();

		/**
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___IS_USED = eINSTANCE.getActuator__IsUsed();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.SensorImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__STATE = eINSTANCE.getSensor_State();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__UNIT = eINSTANCE.getSensor_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__VALUE = eINSTANCE.getSensor_Value();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PROTOCOL = eINSTANCE.getSensor_Protocol();

		/**
		 * The meta object literal for the '<em><b>Is Used</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___IS_USED = eINSTANCE.getSensor__IsUsed();

		/**
		 * The meta object literal for the '<em><b>Sensor Minus Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___SENSOR_MINUS_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSensor__SensorMinusConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.impl.CommunicationProtocolImpl
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCommunicationProtocol()
		 * @generated
		 */
		EClass COMMUNICATION_PROTOCOL = eINSTANCE.getCommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__TYPE = eINSTANCE.getCommunicationProtocol_Type();

		/**
		 * The meta object literal for the '<em><b>Sensor Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__SENSOR_NUMBER = eINSTANCE.getCommunicationProtocol_SensorNumber();

		/**
		 * The meta object literal for the '<em><b>Actuator Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER = eINSTANCE.getCommunicationProtocol_ActuatorNumber();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.CropGroup <em>Crop Group</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.CropGroup
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCropGroup()
		 * @generated
		 */
		EEnum CROP_GROUP = eINSTANCE.getCropGroup();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.ActuatorType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.AnalyticsType <em>Analytics Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.AnalyticsType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getAnalyticsType()
		 * @generated
		 */
		EEnum ANALYTICS_TYPE = eINSTANCE.getAnalyticsType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.CommunicationType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.ControllerAction <em>Controller Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.ControllerAction
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControllerAction()
		 * @generated
		 */
		EEnum CONTROLLER_ACTION = eINSTANCE.getControllerAction();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.ControlType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.MonitoringCondition <em>Monitoring Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.MonitoringCondition
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoringCondition()
		 * @generated
		 */
		EEnum MONITORING_CONDITION = eINSTANCE.getMonitoringCondition();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.MonitoringMetrics <em>Monitoring Metrics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.MonitoringMetrics
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getMonitoringMetrics()
		 * @generated
		 */
		EEnum MONITORING_METRICS = eINSTANCE.getMonitoringMetrics();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.OutputType <em>Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.OutputType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getOutputType()
		 * @generated
		 */
		EEnum OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.SensorState <em>Sensor State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.SensorState
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensorState()
		 * @generated
		 */
		EEnum SENSOR_STATE = eINSTANCE.getSensorState();

		/**
		 * The meta object literal for the '{@link smartFarmingXText.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see smartFarmingXText.SensorType
		 * @see smartFarmingXText.impl.SmartFarmingXTextPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

	}

} //SmartFarmingXTextPackage
