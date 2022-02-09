/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /SmartFarmingXText/model/smartFarmingXText.ecore
 * using:
 *   /SmartFarmingXText/model/smartFarmingXText.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package smartFarmingXText;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;
// import smartFarmingXText.SmartFarmingXTextPackage;
// import smartFarmingXText.SmartFarmingXTextTables;

/**
 * SmartFarmingXTextTables provides the dispatch tables for the smartFarmingXText for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SmartFarmingXTextTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SmartFarmingXTextPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_smartFarmingXText = IdManager.getNsURIPackageId("http://www.example.org/smartFarmingXText", null, SmartFarmingXTextPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Actuator = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Actuator", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = SmartFarmingXTextTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CommunicationProtocol = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("CommunicationProtocol", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Controlling = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Controlling", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Crop = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Crop", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Device = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Device", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Farm = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Farm", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Farmer = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Farmer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Gateway = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Gateway", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_IoTSystem = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("IoTSystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Monitoring = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Monitoring", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Named = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Named", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sensor = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Sensor", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Service = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getClassId("Service", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = SmartFarmingXTextTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = SmartFarmingXTextTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ActuatorType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("ActuatorType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_AnalyticsType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("AnalyticsType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CommunicationType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("CommunicationType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ControlType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("ControlType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ControllerAction = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("ControllerAction");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CropGroup = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("CropGroup");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MonitoringCondition = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("MonitoringCondition");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MonitoringMetrics = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("MonitoringMetrics");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OutputType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("OutputType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SensorState = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("SensorState");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SensorType = SmartFarmingXTextTables.PACKid_http_c_s_s_www_example_org_s_smartFarmingXText.getEnumerationId("SensorType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_1500 = ValueUtil.integerValueOf("1500");
	public static final /*@NonInvalid*/ IntegerValue INT_2 = ValueUtil.integerValueOf("2");
	public static final /*@NonInvalid*/ IntegerValue INT_3 = ValueUtil.integerValueOf("3");
	public static final /*@NonInvalid*/ IntegerValue INT_3000 = ValueUtil.integerValueOf("3000");
	public static final /*@NonInvalid*/ IntegerValue INT_4 = ValueUtil.integerValueOf("4");
	public static final /*@NonInvalid*/ IntegerValue INT_5000 = ValueUtil.integerValueOf("5000");
	public static final /*@NonInvalid*/ IntegerValue INT_75 = ValueUtil.integerValueOf("75");
	public static final /*@NonInvalid*/ IntegerValue INT_900 = ValueUtil.integerValueOf("900");
	public static final /*@NonInvalid*/ RealValue REA_1_5 = ValueUtil.realValueOf("1.5");
	public static final /*@NonInvalid*/ RealValue REA_40_0 = ValueUtil.realValueOf("40.0");
	public static final /*@NonInvalid*/ RealValue REA_55_0 = ValueUtil.realValueOf("55.0");
	public static final /*@NonInvalid*/ RealValue REA_65_0 = ValueUtil.realValueOf("65.0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Actuator = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Actuator);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Controlling = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Controlling);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Farmer = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Farmer);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Gateway = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Gateway);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Monitoring = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Monitoring);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Sensor = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Sensor);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Service = TypeId.BAG.getSpecializedId(SmartFarmingXTextTables.CLSSid_Service);
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_CO2 = SmartFarmingXTextTables.ENUMid_SensorType.getEnumerationLiteralId("CO2");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Danger = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Danger");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_EC = SmartFarmingXTextTables.ENUMid_SensorType.getEnumerationLiteralId("EC");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_EnvironmentalSafety = SmartFarmingXTextTables.ENUMid_MonitoringMetrics.getEnumerationLiteralId("EnvironmentalSafety");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Good = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Good");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Healthy = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Healthy");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Invalid = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Invalid");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Nutrient = SmartFarmingXTextTables.ENUMid_MonitoringMetrics.getEnumerationLiteralId("Nutrient");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Optimum = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Optimum");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_PH = SmartFarmingXTextTables.ENUMid_SensorType.getEnumerationLiteralId("PH");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Temperature = SmartFarmingXTextTables.ENUMid_SensorType.getEnumerationLiteralId("Temperature");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_Warning = SmartFarmingXTextTables.ENUMid_MonitoringCondition.getEnumerationLiteralId("Warning");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Actuator = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Actuator);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CommunicationProtocol = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_CommunicationProtocol);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Crop = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Crop);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Device = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Device);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Farmer = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Farmer);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Gateway = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Gateway);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Sensor = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Sensor);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Service = TypeId.ORDERED_SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Service);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Actuator = TypeId.SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Actuator);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Controlling = TypeId.SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Controlling);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Farmer = TypeId.SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Farmer);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Monitoring = TypeId.SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Monitoring);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Sensor = TypeId.SET.getSpecializedId(SmartFarmingXTextTables.CLSSid_Sensor);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SmartFarmingXTextTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Actuator = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.ACTUATOR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ActuatorType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _AnalyticsSystem = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.ANALYTICS_SYSTEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _AnalyticsType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.ANALYTICS_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _CommunicationProtocol = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.COMMUNICATION_PROTOCOL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CommunicationType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ControlType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.CONTROL_TYPE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ControllerAction = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Controlling = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.CONTROLLING, PACKAGE, 0);
		public static final EcoreExecutorType _Crop = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.CROP, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CropGroup = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.CROP_GROUP, PACKAGE, 0);
		public static final EcoreExecutorType _Device = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.DEVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Farm = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.FARM, PACKAGE, 0);
		public static final EcoreExecutorType _Farmer = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.FARMER, PACKAGE, 0);
		public static final EcoreExecutorType _Gateway = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.GATEWAY, PACKAGE, 0);
		public static final EcoreExecutorType _IoTSystem = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.IO_TSYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _Monitoring = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.MONITORING, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MonitoringCondition = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MonitoringMetrics = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.MONITORING_METRICS, PACKAGE, 0);
		public static final EcoreExecutorType _Named = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.NAMED, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _OutputType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.OUTPUT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Sensor = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.SENSOR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SensorState = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.SENSOR_STATE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SensorType = new EcoreExecutorEnumeration(SmartFarmingXTextPackage.Literals.SENSOR_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Service = new EcoreExecutorType(SmartFarmingXTextPackage.Literals.SERVICE, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Actuator,
			_ActuatorType,
			_AnalyticsSystem,
			_AnalyticsType,
			_CommunicationProtocol,
			_CommunicationType,
			_ControlType,
			_ControllerAction,
			_Controlling,
			_Crop,
			_CropGroup,
			_Device,
			_Farm,
			_Farmer,
			_Gateway,
			_IoTSystem,
			_Monitoring,
			_MonitoringCondition,
			_MonitoringMetrics,
			_Named,
			_OutputType,
			_Sensor,
			_SensorState,
			_SensorType,
			_Service
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Actuator__Actuator = new ExecutorFragment(Types._Actuator, SmartFarmingXTextTables.Types._Actuator);
		private static final ExecutorFragment _Actuator__Device = new ExecutorFragment(Types._Actuator, SmartFarmingXTextTables.Types._Device);
		private static final ExecutorFragment _Actuator__Named = new ExecutorFragment(Types._Actuator, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Actuator__OclAny = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Actuator__OclElement = new ExecutorFragment(Types._Actuator, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ActuatorType__ActuatorType = new ExecutorFragment(Types._ActuatorType, SmartFarmingXTextTables.Types._ActuatorType);
		private static final ExecutorFragment _ActuatorType__OclAny = new ExecutorFragment(Types._ActuatorType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ActuatorType__OclElement = new ExecutorFragment(Types._ActuatorType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ActuatorType__OclEnumeration = new ExecutorFragment(Types._ActuatorType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ActuatorType__OclType = new ExecutorFragment(Types._ActuatorType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _AnalyticsSystem__AnalyticsSystem = new ExecutorFragment(Types._AnalyticsSystem, SmartFarmingXTextTables.Types._AnalyticsSystem);
		private static final ExecutorFragment _AnalyticsSystem__Named = new ExecutorFragment(Types._AnalyticsSystem, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _AnalyticsSystem__OclAny = new ExecutorFragment(Types._AnalyticsSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnalyticsSystem__OclElement = new ExecutorFragment(Types._AnalyticsSystem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AnalyticsSystem__Service = new ExecutorFragment(Types._AnalyticsSystem, SmartFarmingXTextTables.Types._Service);

		private static final ExecutorFragment _AnalyticsType__AnalyticsType = new ExecutorFragment(Types._AnalyticsType, SmartFarmingXTextTables.Types._AnalyticsType);
		private static final ExecutorFragment _AnalyticsType__OclAny = new ExecutorFragment(Types._AnalyticsType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AnalyticsType__OclElement = new ExecutorFragment(Types._AnalyticsType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AnalyticsType__OclEnumeration = new ExecutorFragment(Types._AnalyticsType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _AnalyticsType__OclType = new ExecutorFragment(Types._AnalyticsType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CommunicationProtocol__CommunicationProtocol = new ExecutorFragment(Types._CommunicationProtocol, SmartFarmingXTextTables.Types._CommunicationProtocol);
		private static final ExecutorFragment _CommunicationProtocol__Named = new ExecutorFragment(Types._CommunicationProtocol, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _CommunicationProtocol__OclAny = new ExecutorFragment(Types._CommunicationProtocol, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CommunicationProtocol__OclElement = new ExecutorFragment(Types._CommunicationProtocol, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CommunicationType__CommunicationType = new ExecutorFragment(Types._CommunicationType, SmartFarmingXTextTables.Types._CommunicationType);
		private static final ExecutorFragment _CommunicationType__OclAny = new ExecutorFragment(Types._CommunicationType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CommunicationType__OclElement = new ExecutorFragment(Types._CommunicationType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CommunicationType__OclEnumeration = new ExecutorFragment(Types._CommunicationType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CommunicationType__OclType = new ExecutorFragment(Types._CommunicationType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ControlType__ControlType = new ExecutorFragment(Types._ControlType, SmartFarmingXTextTables.Types._ControlType);
		private static final ExecutorFragment _ControlType__OclAny = new ExecutorFragment(Types._ControlType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ControlType__OclElement = new ExecutorFragment(Types._ControlType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ControlType__OclEnumeration = new ExecutorFragment(Types._ControlType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ControlType__OclType = new ExecutorFragment(Types._ControlType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _ControllerAction__ControllerAction = new ExecutorFragment(Types._ControllerAction, SmartFarmingXTextTables.Types._ControllerAction);
		private static final ExecutorFragment _ControllerAction__OclAny = new ExecutorFragment(Types._ControllerAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ControllerAction__OclElement = new ExecutorFragment(Types._ControllerAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ControllerAction__OclEnumeration = new ExecutorFragment(Types._ControllerAction, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ControllerAction__OclType = new ExecutorFragment(Types._ControllerAction, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Controlling__Controlling = new ExecutorFragment(Types._Controlling, SmartFarmingXTextTables.Types._Controlling);
		private static final ExecutorFragment _Controlling__Named = new ExecutorFragment(Types._Controlling, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Controlling__OclAny = new ExecutorFragment(Types._Controlling, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Controlling__OclElement = new ExecutorFragment(Types._Controlling, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Controlling__Service = new ExecutorFragment(Types._Controlling, SmartFarmingXTextTables.Types._Service);

		private static final ExecutorFragment _Crop__Crop = new ExecutorFragment(Types._Crop, SmartFarmingXTextTables.Types._Crop);
		private static final ExecutorFragment _Crop__Named = new ExecutorFragment(Types._Crop, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Crop__OclAny = new ExecutorFragment(Types._Crop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Crop__OclElement = new ExecutorFragment(Types._Crop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CropGroup__CropGroup = new ExecutorFragment(Types._CropGroup, SmartFarmingXTextTables.Types._CropGroup);
		private static final ExecutorFragment _CropGroup__OclAny = new ExecutorFragment(Types._CropGroup, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CropGroup__OclElement = new ExecutorFragment(Types._CropGroup, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CropGroup__OclEnumeration = new ExecutorFragment(Types._CropGroup, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CropGroup__OclType = new ExecutorFragment(Types._CropGroup, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Device__Device = new ExecutorFragment(Types._Device, SmartFarmingXTextTables.Types._Device);
		private static final ExecutorFragment _Device__Named = new ExecutorFragment(Types._Device, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Device__OclAny = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Device__OclElement = new ExecutorFragment(Types._Device, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Farm__Farm = new ExecutorFragment(Types._Farm, SmartFarmingXTextTables.Types._Farm);
		private static final ExecutorFragment _Farm__Named = new ExecutorFragment(Types._Farm, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Farm__OclAny = new ExecutorFragment(Types._Farm, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Farm__OclElement = new ExecutorFragment(Types._Farm, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Farmer__Farmer = new ExecutorFragment(Types._Farmer, SmartFarmingXTextTables.Types._Farmer);
		private static final ExecutorFragment _Farmer__Named = new ExecutorFragment(Types._Farmer, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Farmer__OclAny = new ExecutorFragment(Types._Farmer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Farmer__OclElement = new ExecutorFragment(Types._Farmer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Gateway__Gateway = new ExecutorFragment(Types._Gateway, SmartFarmingXTextTables.Types._Gateway);
		private static final ExecutorFragment _Gateway__Named = new ExecutorFragment(Types._Gateway, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Gateway__OclAny = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Gateway__OclElement = new ExecutorFragment(Types._Gateway, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _IoTSystem__IoTSystem = new ExecutorFragment(Types._IoTSystem, SmartFarmingXTextTables.Types._IoTSystem);
		private static final ExecutorFragment _IoTSystem__Named = new ExecutorFragment(Types._IoTSystem, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _IoTSystem__OclAny = new ExecutorFragment(Types._IoTSystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IoTSystem__OclElement = new ExecutorFragment(Types._IoTSystem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Monitoring__Monitoring = new ExecutorFragment(Types._Monitoring, SmartFarmingXTextTables.Types._Monitoring);
		private static final ExecutorFragment _Monitoring__Named = new ExecutorFragment(Types._Monitoring, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Monitoring__OclAny = new ExecutorFragment(Types._Monitoring, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Monitoring__OclElement = new ExecutorFragment(Types._Monitoring, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Monitoring__Service = new ExecutorFragment(Types._Monitoring, SmartFarmingXTextTables.Types._Service);

		private static final ExecutorFragment _MonitoringCondition__MonitoringCondition = new ExecutorFragment(Types._MonitoringCondition, SmartFarmingXTextTables.Types._MonitoringCondition);
		private static final ExecutorFragment _MonitoringCondition__OclAny = new ExecutorFragment(Types._MonitoringCondition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MonitoringCondition__OclElement = new ExecutorFragment(Types._MonitoringCondition, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MonitoringCondition__OclEnumeration = new ExecutorFragment(Types._MonitoringCondition, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MonitoringCondition__OclType = new ExecutorFragment(Types._MonitoringCondition, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _MonitoringMetrics__MonitoringMetrics = new ExecutorFragment(Types._MonitoringMetrics, SmartFarmingXTextTables.Types._MonitoringMetrics);
		private static final ExecutorFragment _MonitoringMetrics__OclAny = new ExecutorFragment(Types._MonitoringMetrics, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MonitoringMetrics__OclElement = new ExecutorFragment(Types._MonitoringMetrics, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MonitoringMetrics__OclEnumeration = new ExecutorFragment(Types._MonitoringMetrics, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MonitoringMetrics__OclType = new ExecutorFragment(Types._MonitoringMetrics, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Named__Named = new ExecutorFragment(Types._Named, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Named__OclAny = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Named__OclElement = new ExecutorFragment(Types._Named, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OutputType__OclAny = new ExecutorFragment(Types._OutputType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OutputType__OclElement = new ExecutorFragment(Types._OutputType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OutputType__OclEnumeration = new ExecutorFragment(Types._OutputType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OutputType__OclType = new ExecutorFragment(Types._OutputType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OutputType__OutputType = new ExecutorFragment(Types._OutputType, SmartFarmingXTextTables.Types._OutputType);

		private static final ExecutorFragment _Sensor__Device = new ExecutorFragment(Types._Sensor, SmartFarmingXTextTables.Types._Device);
		private static final ExecutorFragment _Sensor__Named = new ExecutorFragment(Types._Sensor, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Sensor__OclAny = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sensor__OclElement = new ExecutorFragment(Types._Sensor, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sensor__Sensor = new ExecutorFragment(Types._Sensor, SmartFarmingXTextTables.Types._Sensor);

		private static final ExecutorFragment _SensorState__OclAny = new ExecutorFragment(Types._SensorState, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SensorState__OclElement = new ExecutorFragment(Types._SensorState, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SensorState__OclEnumeration = new ExecutorFragment(Types._SensorState, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SensorState__OclType = new ExecutorFragment(Types._SensorState, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SensorState__SensorState = new ExecutorFragment(Types._SensorState, SmartFarmingXTextTables.Types._SensorState);

		private static final ExecutorFragment _SensorType__OclAny = new ExecutorFragment(Types._SensorType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SensorType__OclElement = new ExecutorFragment(Types._SensorType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SensorType__OclEnumeration = new ExecutorFragment(Types._SensorType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SensorType__OclType = new ExecutorFragment(Types._SensorType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SensorType__SensorType = new ExecutorFragment(Types._SensorType, SmartFarmingXTextTables.Types._SensorType);

		private static final ExecutorFragment _Service__Named = new ExecutorFragment(Types._Service, SmartFarmingXTextTables.Types._Named);
		private static final ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, SmartFarmingXTextTables.Types._Service);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _SensorType = TypeUtil.createParameterTypes(SmartFarmingXTextTables.Types._SensorType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Actuator__isUsed = new ExecutorOperation("isUsed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Actuator,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Monitoring__calculateAverage = new ExecutorOperation("calculateAverage", Parameters._SensorType, Types._Monitoring,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Monitoring__checkCondition = new ExecutorOperation("checkCondition", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Monitoring,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Sensor__isUsed = new ExecutorOperation("isUsed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Sensor,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Actuator__Protocol = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.ACTUATOR__PROTOCOL, Types._Actuator, 0);
		public static final ExecutorProperty _Actuator__Type = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.ACTUATOR__TYPE, Types._Actuator, 1);
		public static final ExecutorProperty _Actuator__Controlling__Actuators = new ExecutorPropertyWithImplementation("Controlling", Types._Actuator, 2, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.CONTROLLING__ACTUATORS));

		public static final ExecutorProperty _AnalyticsSystem__AnalyticsType = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.ANALYTICS_SYSTEM__ANALYTICS_TYPE, Types._AnalyticsSystem, 0);
		public static final ExecutorProperty _AnalyticsSystem__DataSource = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.ANALYTICS_SYSTEM__DATA_SOURCE, Types._AnalyticsSystem, 1);
		public static final ExecutorProperty _AnalyticsSystem__OutputType = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.ANALYTICS_SYSTEM__OUTPUT_TYPE, Types._AnalyticsSystem, 2);

		public static final ExecutorProperty _CommunicationProtocol__ActuatorNumber = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.COMMUNICATION_PROTOCOL__ACTUATOR_NUMBER, Types._CommunicationProtocol, 0);
		public static final ExecutorProperty _CommunicationProtocol__SensorNumber = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.COMMUNICATION_PROTOCOL__SENSOR_NUMBER, Types._CommunicationProtocol, 1);
		public static final ExecutorProperty _CommunicationProtocol__Type = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.COMMUNICATION_PROTOCOL__TYPE, Types._CommunicationProtocol, 2);
		public static final ExecutorProperty _CommunicationProtocol__Actuator__Protocol = new ExecutorPropertyWithImplementation("Actuator", Types._CommunicationProtocol, 3, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.ACTUATOR__PROTOCOL));
		public static final ExecutorProperty _CommunicationProtocol__Gateway__Protocols = new ExecutorPropertyWithImplementation("Gateway", Types._CommunicationProtocol, 4, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.GATEWAY__PROTOCOLS));
		public static final ExecutorProperty _CommunicationProtocol__Sensor__Protocol = new ExecutorPropertyWithImplementation("Sensor", Types._CommunicationProtocol, 5, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.SENSOR__PROTOCOL));

		public static final ExecutorProperty _Controlling__Action = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CONTROLLING__ACTION, Types._Controlling, 0);
		public static final ExecutorProperty _Controlling__Actuators = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CONTROLLING__ACTUATORS, Types._Controlling, 1);
		public static final ExecutorProperty _Controlling__ControlType = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CONTROLLING__CONTROL_TYPE, Types._Controlling, 2);
		public static final ExecutorProperty _Controlling__Monitoring__Control = new ExecutorPropertyWithImplementation("Monitoring", Types._Controlling, 3, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.MONITORING__CONTROL));

		public static final ExecutorProperty _Crop__CropGroup = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CROP__CROP_GROUP, Types._Crop, 0);
		public static final ExecutorProperty _Crop__Farm = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CROP__FARM, Types._Crop, 1);
		public static final ExecutorProperty _Crop__GrowthDuration = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CROP__GROWTH_DURATION, Types._Crop, 2);
		public static final ExecutorProperty _Crop__SeedCode = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.CROP__SEED_CODE, Types._Crop, 3);

		public static final ExecutorProperty _Device__DeviceID = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.DEVICE__DEVICE_ID, Types._Device, 0);
		public static final ExecutorProperty _Device__IPAddress = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.DEVICE__IP_ADDRESS, Types._Device, 1);
		public static final ExecutorProperty _Device__IoTSystem = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.DEVICE__IO_TSYSTEM, Types._Device, 2);
		public static final ExecutorProperty _Device__Manufacturer = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.DEVICE__MANUFACTURER, Types._Device, 3);
		public static final ExecutorProperty _Device__Gateway__Devices = new ExecutorPropertyWithImplementation("Gateway", Types._Device, 4, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.GATEWAY__DEVICES));

		public static final ExecutorProperty _Farm__Crops = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARM__CROPS, Types._Farm, 0);
		public static final ExecutorProperty _Farm__Farmers = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARM__FARMERS, Types._Farm, 1);
		public static final ExecutorProperty _Farm__IoTSystem = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARM__IO_TSYSTEM, Types._Farm, 2);
		public static final ExecutorProperty _Farm__Location = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARM__LOCATION, Types._Farm, 3);
		public static final ExecutorProperty _Farm__Size = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARM__SIZE, Types._Farm, 4);

		public static final ExecutorProperty _Farmer__Email = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARMER__EMAIL, Types._Farmer, 0);
		public static final ExecutorProperty _Farmer__Farm = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARMER__FARM, Types._Farmer, 1);
		public static final ExecutorProperty _Farmer__FarmerID = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARMER__FARMER_ID, Types._Farmer, 2);
		public static final ExecutorProperty _Farmer__PhoneNumber = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARMER__PHONE_NUMBER, Types._Farmer, 3);
		public static final ExecutorProperty _Farmer__Services = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.FARMER__SERVICES, Types._Farmer, 4);
		public static final ExecutorProperty _Farmer__Service__PIC = new ExecutorPropertyWithImplementation("Service", Types._Farmer, 5, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.SERVICE__PIC));

		public static final ExecutorProperty _Gateway__Devices = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.GATEWAY__DEVICES, Types._Gateway, 0);
		public static final ExecutorProperty _Gateway__GatewayID = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.GATEWAY__GATEWAY_ID, Types._Gateway, 1);
		public static final ExecutorProperty _Gateway__IoTSystem = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.GATEWAY__IO_TSYSTEM, Types._Gateway, 2);
		public static final ExecutorProperty _Gateway__Model = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.GATEWAY__MODEL, Types._Gateway, 3);
		public static final ExecutorProperty _Gateway__Protocols = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.GATEWAY__PROTOCOLS, Types._Gateway, 4);

		public static final ExecutorProperty _IoTSystem__Devices = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.IO_TSYSTEM__DEVICES, Types._IoTSystem, 0);
		public static final ExecutorProperty _IoTSystem__Gateways = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.IO_TSYSTEM__GATEWAYS, Types._IoTSystem, 1);
		public static final ExecutorProperty _IoTSystem__Services = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.IO_TSYSTEM__SERVICES, Types._IoTSystem, 2);
		public static final ExecutorProperty _IoTSystem__Version = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.IO_TSYSTEM__VERSION, Types._IoTSystem, 3);
		public static final ExecutorProperty _IoTSystem__Farm__IoTSystem = new ExecutorPropertyWithImplementation("Farm", Types._IoTSystem, 4, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.FARM__IO_TSYSTEM));

		public static final ExecutorProperty _Monitoring__Control = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.MONITORING__CONTROL, Types._Monitoring, 0);
		public static final ExecutorProperty _Monitoring__Metrics = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.MONITORING__METRICS, Types._Monitoring, 1);
		public static final ExecutorProperty _Monitoring__Sensors = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.MONITORING__SENSORS, Types._Monitoring, 2);

		public static final ExecutorProperty _Named__name = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.NAMED__NAME, Types._Named, 0);

		public static final ExecutorProperty _Sensor__Protocol = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SENSOR__PROTOCOL, Types._Sensor, 0);
		public static final ExecutorProperty _Sensor__State = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SENSOR__STATE, Types._Sensor, 1);
		public static final ExecutorProperty _Sensor__Type = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SENSOR__TYPE, Types._Sensor, 2);
		public static final ExecutorProperty _Sensor__Unit = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SENSOR__UNIT, Types._Sensor, 3);
		public static final ExecutorProperty _Sensor__Value = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SENSOR__VALUE, Types._Sensor, 4);
		public static final ExecutorProperty _Sensor__Monitoring__Sensors = new ExecutorPropertyWithImplementation("Monitoring", Types._Sensor, 5, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.MONITORING__SENSORS));

		public static final ExecutorProperty _Service__Host = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SERVICE__HOST, Types._Service, 0);
		public static final ExecutorProperty _Service__IoTSystem = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SERVICE__IO_TSYSTEM, Types._Service, 1);
		public static final ExecutorProperty _Service__PIC = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SERVICE__PIC, Types._Service, 2);
		public static final ExecutorProperty _Service__ServiceID = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SERVICE__SERVICE_ID, Types._Service, 3);
		public static final ExecutorProperty _Service__URI = new EcoreExecutorProperty(SmartFarmingXTextPackage.Literals.SERVICE__URI, Types._Service, 4);
		public static final ExecutorProperty _Service__Farmer__Services = new ExecutorPropertyWithImplementation("Farmer", Types._Service, 5, new EcoreLibraryOppositeProperty(SmartFarmingXTextPackage.Literals.FARMER__SERVICES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Actuator =
			{
				Fragments._Actuator__OclAny /* 0 */,
				Fragments._Actuator__OclElement /* 1 */,
				Fragments._Actuator__Named /* 2 */,
				Fragments._Actuator__Device /* 3 */,
				Fragments._Actuator__Actuator /* 4 */
			};
		private static final int /*@NonNull*/ [] __Actuator = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ActuatorType =
			{
				Fragments._ActuatorType__OclAny /* 0 */,
				Fragments._ActuatorType__OclElement /* 1 */,
				Fragments._ActuatorType__OclType /* 2 */,
				Fragments._ActuatorType__OclEnumeration /* 3 */,
				Fragments._ActuatorType__ActuatorType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ActuatorType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AnalyticsSystem =
			{
				Fragments._AnalyticsSystem__OclAny /* 0 */,
				Fragments._AnalyticsSystem__OclElement /* 1 */,
				Fragments._AnalyticsSystem__Named /* 2 */,
				Fragments._AnalyticsSystem__Service /* 3 */,
				Fragments._AnalyticsSystem__AnalyticsSystem /* 4 */
			};
		private static final int /*@NonNull*/ [] __AnalyticsSystem = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AnalyticsType =
			{
				Fragments._AnalyticsType__OclAny /* 0 */,
				Fragments._AnalyticsType__OclElement /* 1 */,
				Fragments._AnalyticsType__OclType /* 2 */,
				Fragments._AnalyticsType__OclEnumeration /* 3 */,
				Fragments._AnalyticsType__AnalyticsType /* 4 */
			};
		private static final int /*@NonNull*/ [] __AnalyticsType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CommunicationProtocol =
			{
				Fragments._CommunicationProtocol__OclAny /* 0 */,
				Fragments._CommunicationProtocol__OclElement /* 1 */,
				Fragments._CommunicationProtocol__Named /* 2 */,
				Fragments._CommunicationProtocol__CommunicationProtocol /* 3 */
			};
		private static final int /*@NonNull*/ [] __CommunicationProtocol = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CommunicationType =
			{
				Fragments._CommunicationType__OclAny /* 0 */,
				Fragments._CommunicationType__OclElement /* 1 */,
				Fragments._CommunicationType__OclType /* 2 */,
				Fragments._CommunicationType__OclEnumeration /* 3 */,
				Fragments._CommunicationType__CommunicationType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CommunicationType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ControlType =
			{
				Fragments._ControlType__OclAny /* 0 */,
				Fragments._ControlType__OclElement /* 1 */,
				Fragments._ControlType__OclType /* 2 */,
				Fragments._ControlType__OclEnumeration /* 3 */,
				Fragments._ControlType__ControlType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ControlType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ControllerAction =
			{
				Fragments._ControllerAction__OclAny /* 0 */,
				Fragments._ControllerAction__OclElement /* 1 */,
				Fragments._ControllerAction__OclType /* 2 */,
				Fragments._ControllerAction__OclEnumeration /* 3 */,
				Fragments._ControllerAction__ControllerAction /* 4 */
			};
		private static final int /*@NonNull*/ [] __ControllerAction = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Controlling =
			{
				Fragments._Controlling__OclAny /* 0 */,
				Fragments._Controlling__OclElement /* 1 */,
				Fragments._Controlling__Named /* 2 */,
				Fragments._Controlling__Service /* 3 */,
				Fragments._Controlling__Controlling /* 4 */
			};
		private static final int /*@NonNull*/ [] __Controlling = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Crop =
			{
				Fragments._Crop__OclAny /* 0 */,
				Fragments._Crop__OclElement /* 1 */,
				Fragments._Crop__Named /* 2 */,
				Fragments._Crop__Crop /* 3 */
			};
		private static final int /*@NonNull*/ [] __Crop = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CropGroup =
			{
				Fragments._CropGroup__OclAny /* 0 */,
				Fragments._CropGroup__OclElement /* 1 */,
				Fragments._CropGroup__OclType /* 2 */,
				Fragments._CropGroup__OclEnumeration /* 3 */,
				Fragments._CropGroup__CropGroup /* 4 */
			};
		private static final int /*@NonNull*/ [] __CropGroup = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Device =
			{
				Fragments._Device__OclAny /* 0 */,
				Fragments._Device__OclElement /* 1 */,
				Fragments._Device__Named /* 2 */,
				Fragments._Device__Device /* 3 */
			};
		private static final int /*@NonNull*/ [] __Device = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Farm =
			{
				Fragments._Farm__OclAny /* 0 */,
				Fragments._Farm__OclElement /* 1 */,
				Fragments._Farm__Named /* 2 */,
				Fragments._Farm__Farm /* 3 */
			};
		private static final int /*@NonNull*/ [] __Farm = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Farmer =
			{
				Fragments._Farmer__OclAny /* 0 */,
				Fragments._Farmer__OclElement /* 1 */,
				Fragments._Farmer__Named /* 2 */,
				Fragments._Farmer__Farmer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Farmer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Gateway =
			{
				Fragments._Gateway__OclAny /* 0 */,
				Fragments._Gateway__OclElement /* 1 */,
				Fragments._Gateway__Named /* 2 */,
				Fragments._Gateway__Gateway /* 3 */
			};
		private static final int /*@NonNull*/ [] __Gateway = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IoTSystem =
			{
				Fragments._IoTSystem__OclAny /* 0 */,
				Fragments._IoTSystem__OclElement /* 1 */,
				Fragments._IoTSystem__Named /* 2 */,
				Fragments._IoTSystem__IoTSystem /* 3 */
			};
		private static final int /*@NonNull*/ [] __IoTSystem = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Monitoring =
			{
				Fragments._Monitoring__OclAny /* 0 */,
				Fragments._Monitoring__OclElement /* 1 */,
				Fragments._Monitoring__Named /* 2 */,
				Fragments._Monitoring__Service /* 3 */,
				Fragments._Monitoring__Monitoring /* 4 */
			};
		private static final int /*@NonNull*/ [] __Monitoring = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MonitoringCondition =
			{
				Fragments._MonitoringCondition__OclAny /* 0 */,
				Fragments._MonitoringCondition__OclElement /* 1 */,
				Fragments._MonitoringCondition__OclType /* 2 */,
				Fragments._MonitoringCondition__OclEnumeration /* 3 */,
				Fragments._MonitoringCondition__MonitoringCondition /* 4 */
			};
		private static final int /*@NonNull*/ [] __MonitoringCondition = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MonitoringMetrics =
			{
				Fragments._MonitoringMetrics__OclAny /* 0 */,
				Fragments._MonitoringMetrics__OclElement /* 1 */,
				Fragments._MonitoringMetrics__OclType /* 2 */,
				Fragments._MonitoringMetrics__OclEnumeration /* 3 */,
				Fragments._MonitoringMetrics__MonitoringMetrics /* 4 */
			};
		private static final int /*@NonNull*/ [] __MonitoringMetrics = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Named =
			{
				Fragments._Named__OclAny /* 0 */,
				Fragments._Named__OclElement /* 1 */,
				Fragments._Named__Named /* 2 */
			};
		private static final int /*@NonNull*/ [] __Named = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OutputType =
			{
				Fragments._OutputType__OclAny /* 0 */,
				Fragments._OutputType__OclElement /* 1 */,
				Fragments._OutputType__OclType /* 2 */,
				Fragments._OutputType__OclEnumeration /* 3 */,
				Fragments._OutputType__OutputType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OutputType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sensor =
			{
				Fragments._Sensor__OclAny /* 0 */,
				Fragments._Sensor__OclElement /* 1 */,
				Fragments._Sensor__Named /* 2 */,
				Fragments._Sensor__Device /* 3 */,
				Fragments._Sensor__Sensor /* 4 */
			};
		private static final int /*@NonNull*/ [] __Sensor = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SensorState =
			{
				Fragments._SensorState__OclAny /* 0 */,
				Fragments._SensorState__OclElement /* 1 */,
				Fragments._SensorState__OclType /* 2 */,
				Fragments._SensorState__OclEnumeration /* 3 */,
				Fragments._SensorState__SensorState /* 4 */
			};
		private static final int /*@NonNull*/ [] __SensorState = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SensorType =
			{
				Fragments._SensorType__OclAny /* 0 */,
				Fragments._SensorType__OclElement /* 1 */,
				Fragments._SensorType__OclType /* 2 */,
				Fragments._SensorType__OclEnumeration /* 3 */,
				Fragments._SensorType__SensorType /* 4 */
			};
		private static final int /*@NonNull*/ [] __SensorType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Service =
			{
				Fragments._Service__OclAny /* 0 */,
				Fragments._Service__OclElement /* 1 */,
				Fragments._Service__Named /* 2 */,
				Fragments._Service__Service /* 3 */
			};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Actuator.initFragments(_Actuator, __Actuator);
			Types._ActuatorType.initFragments(_ActuatorType, __ActuatorType);
			Types._AnalyticsSystem.initFragments(_AnalyticsSystem, __AnalyticsSystem);
			Types._AnalyticsType.initFragments(_AnalyticsType, __AnalyticsType);
			Types._CommunicationProtocol.initFragments(_CommunicationProtocol, __CommunicationProtocol);
			Types._CommunicationType.initFragments(_CommunicationType, __CommunicationType);
			Types._ControlType.initFragments(_ControlType, __ControlType);
			Types._ControllerAction.initFragments(_ControllerAction, __ControllerAction);
			Types._Controlling.initFragments(_Controlling, __Controlling);
			Types._Crop.initFragments(_Crop, __Crop);
			Types._CropGroup.initFragments(_CropGroup, __CropGroup);
			Types._Device.initFragments(_Device, __Device);
			Types._Farm.initFragments(_Farm, __Farm);
			Types._Farmer.initFragments(_Farmer, __Farmer);
			Types._Gateway.initFragments(_Gateway, __Gateway);
			Types._IoTSystem.initFragments(_IoTSystem, __IoTSystem);
			Types._Monitoring.initFragments(_Monitoring, __Monitoring);
			Types._MonitoringCondition.initFragments(_MonitoringCondition, __MonitoringCondition);
			Types._MonitoringMetrics.initFragments(_MonitoringMetrics, __MonitoringMetrics);
			Types._Named.initFragments(_Named, __Named);
			Types._OutputType.initFragments(_OutputType, __OutputType);
			Types._Sensor.initFragments(_Sensor, __Sensor);
			Types._SensorState.initFragments(_SensorState, __SensorState);
			Types._SensorType.initFragments(_SensorType, __SensorType);
			Types._Service.initFragments(_Service, __Service);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Actuator = {
			SmartFarmingXTextTables.Operations._Actuator__isUsed /* isUsed() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Actuator__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ActuatorType__ActuatorType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ActuatorType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActuatorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActuatorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ActuatorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsSystem__AnalyticsSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsSystem__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsSystem__Service = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsType__AnalyticsType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AnalyticsType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationProtocol__CommunicationProtocol = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationProtocol__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationProtocol__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationProtocol__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationType__CommunicationType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CommunicationType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ControlType__ControlType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControlType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ControllerAction__ControllerAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ControllerAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControllerAction__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControllerAction__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ControllerAction__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Controlling__Controlling = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controlling__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Controlling__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Controlling__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Controlling__Service = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Crop__Crop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Crop__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Crop__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Crop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CropGroup__CropGroup = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CropGroup__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CropGroup__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CropGroup__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CropGroup__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Device__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Device__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Farm__Farm = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Farm__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Farm__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Farm__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Farmer__Farmer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Farmer__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Farmer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Farmer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__Gateway = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gateway__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _IoTSystem__IoTSystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IoTSystem__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IoTSystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IoTSystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Monitoring__Monitoring = {
			SmartFarmingXTextTables.Operations._Monitoring__calculateAverage /* calculateAverage(SensorType[1]) */,
			SmartFarmingXTextTables.Operations._Monitoring__checkCondition /* checkCondition() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Monitoring__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Monitoring__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Monitoring__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Monitoring__Service = {};

		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringCondition__MonitoringCondition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringCondition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringCondition__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringCondition__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringCondition__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringMetrics__MonitoringMetrics = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringMetrics__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringMetrics__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringMetrics__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MonitoringMetrics__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Named__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Named__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OutputType__OutputType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OutputType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Sensor = {
			SmartFarmingXTextTables.Operations._Sensor__isUsed /* isUsed() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Device = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sensor__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SensorState__SensorState = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorState__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorState__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorState__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SensorType__SensorType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SensorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Service__Service = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__Named = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initOperations(_Actuator__Actuator);
			Fragments._Actuator__Device.initOperations(_Actuator__Device);
			Fragments._Actuator__Named.initOperations(_Actuator__Named);
			Fragments._Actuator__OclAny.initOperations(_Actuator__OclAny);
			Fragments._Actuator__OclElement.initOperations(_Actuator__OclElement);

			Fragments._ActuatorType__ActuatorType.initOperations(_ActuatorType__ActuatorType);
			Fragments._ActuatorType__OclAny.initOperations(_ActuatorType__OclAny);
			Fragments._ActuatorType__OclElement.initOperations(_ActuatorType__OclElement);
			Fragments._ActuatorType__OclEnumeration.initOperations(_ActuatorType__OclEnumeration);
			Fragments._ActuatorType__OclType.initOperations(_ActuatorType__OclType);

			Fragments._AnalyticsSystem__AnalyticsSystem.initOperations(_AnalyticsSystem__AnalyticsSystem);
			Fragments._AnalyticsSystem__Named.initOperations(_AnalyticsSystem__Named);
			Fragments._AnalyticsSystem__OclAny.initOperations(_AnalyticsSystem__OclAny);
			Fragments._AnalyticsSystem__OclElement.initOperations(_AnalyticsSystem__OclElement);
			Fragments._AnalyticsSystem__Service.initOperations(_AnalyticsSystem__Service);

			Fragments._AnalyticsType__AnalyticsType.initOperations(_AnalyticsType__AnalyticsType);
			Fragments._AnalyticsType__OclAny.initOperations(_AnalyticsType__OclAny);
			Fragments._AnalyticsType__OclElement.initOperations(_AnalyticsType__OclElement);
			Fragments._AnalyticsType__OclEnumeration.initOperations(_AnalyticsType__OclEnumeration);
			Fragments._AnalyticsType__OclType.initOperations(_AnalyticsType__OclType);

			Fragments._CommunicationProtocol__CommunicationProtocol.initOperations(_CommunicationProtocol__CommunicationProtocol);
			Fragments._CommunicationProtocol__Named.initOperations(_CommunicationProtocol__Named);
			Fragments._CommunicationProtocol__OclAny.initOperations(_CommunicationProtocol__OclAny);
			Fragments._CommunicationProtocol__OclElement.initOperations(_CommunicationProtocol__OclElement);

			Fragments._CommunicationType__CommunicationType.initOperations(_CommunicationType__CommunicationType);
			Fragments._CommunicationType__OclAny.initOperations(_CommunicationType__OclAny);
			Fragments._CommunicationType__OclElement.initOperations(_CommunicationType__OclElement);
			Fragments._CommunicationType__OclEnumeration.initOperations(_CommunicationType__OclEnumeration);
			Fragments._CommunicationType__OclType.initOperations(_CommunicationType__OclType);

			Fragments._ControlType__ControlType.initOperations(_ControlType__ControlType);
			Fragments._ControlType__OclAny.initOperations(_ControlType__OclAny);
			Fragments._ControlType__OclElement.initOperations(_ControlType__OclElement);
			Fragments._ControlType__OclEnumeration.initOperations(_ControlType__OclEnumeration);
			Fragments._ControlType__OclType.initOperations(_ControlType__OclType);

			Fragments._ControllerAction__ControllerAction.initOperations(_ControllerAction__ControllerAction);
			Fragments._ControllerAction__OclAny.initOperations(_ControllerAction__OclAny);
			Fragments._ControllerAction__OclElement.initOperations(_ControllerAction__OclElement);
			Fragments._ControllerAction__OclEnumeration.initOperations(_ControllerAction__OclEnumeration);
			Fragments._ControllerAction__OclType.initOperations(_ControllerAction__OclType);

			Fragments._Controlling__Controlling.initOperations(_Controlling__Controlling);
			Fragments._Controlling__Named.initOperations(_Controlling__Named);
			Fragments._Controlling__OclAny.initOperations(_Controlling__OclAny);
			Fragments._Controlling__OclElement.initOperations(_Controlling__OclElement);
			Fragments._Controlling__Service.initOperations(_Controlling__Service);

			Fragments._Crop__Crop.initOperations(_Crop__Crop);
			Fragments._Crop__Named.initOperations(_Crop__Named);
			Fragments._Crop__OclAny.initOperations(_Crop__OclAny);
			Fragments._Crop__OclElement.initOperations(_Crop__OclElement);

			Fragments._CropGroup__CropGroup.initOperations(_CropGroup__CropGroup);
			Fragments._CropGroup__OclAny.initOperations(_CropGroup__OclAny);
			Fragments._CropGroup__OclElement.initOperations(_CropGroup__OclElement);
			Fragments._CropGroup__OclEnumeration.initOperations(_CropGroup__OclEnumeration);
			Fragments._CropGroup__OclType.initOperations(_CropGroup__OclType);

			Fragments._Device__Device.initOperations(_Device__Device);
			Fragments._Device__Named.initOperations(_Device__Named);
			Fragments._Device__OclAny.initOperations(_Device__OclAny);
			Fragments._Device__OclElement.initOperations(_Device__OclElement);

			Fragments._Farm__Farm.initOperations(_Farm__Farm);
			Fragments._Farm__Named.initOperations(_Farm__Named);
			Fragments._Farm__OclAny.initOperations(_Farm__OclAny);
			Fragments._Farm__OclElement.initOperations(_Farm__OclElement);

			Fragments._Farmer__Farmer.initOperations(_Farmer__Farmer);
			Fragments._Farmer__Named.initOperations(_Farmer__Named);
			Fragments._Farmer__OclAny.initOperations(_Farmer__OclAny);
			Fragments._Farmer__OclElement.initOperations(_Farmer__OclElement);

			Fragments._Gateway__Gateway.initOperations(_Gateway__Gateway);
			Fragments._Gateway__Named.initOperations(_Gateway__Named);
			Fragments._Gateway__OclAny.initOperations(_Gateway__OclAny);
			Fragments._Gateway__OclElement.initOperations(_Gateway__OclElement);

			Fragments._IoTSystem__IoTSystem.initOperations(_IoTSystem__IoTSystem);
			Fragments._IoTSystem__Named.initOperations(_IoTSystem__Named);
			Fragments._IoTSystem__OclAny.initOperations(_IoTSystem__OclAny);
			Fragments._IoTSystem__OclElement.initOperations(_IoTSystem__OclElement);

			Fragments._Monitoring__Monitoring.initOperations(_Monitoring__Monitoring);
			Fragments._Monitoring__Named.initOperations(_Monitoring__Named);
			Fragments._Monitoring__OclAny.initOperations(_Monitoring__OclAny);
			Fragments._Monitoring__OclElement.initOperations(_Monitoring__OclElement);
			Fragments._Monitoring__Service.initOperations(_Monitoring__Service);

			Fragments._MonitoringCondition__MonitoringCondition.initOperations(_MonitoringCondition__MonitoringCondition);
			Fragments._MonitoringCondition__OclAny.initOperations(_MonitoringCondition__OclAny);
			Fragments._MonitoringCondition__OclElement.initOperations(_MonitoringCondition__OclElement);
			Fragments._MonitoringCondition__OclEnumeration.initOperations(_MonitoringCondition__OclEnumeration);
			Fragments._MonitoringCondition__OclType.initOperations(_MonitoringCondition__OclType);

			Fragments._MonitoringMetrics__MonitoringMetrics.initOperations(_MonitoringMetrics__MonitoringMetrics);
			Fragments._MonitoringMetrics__OclAny.initOperations(_MonitoringMetrics__OclAny);
			Fragments._MonitoringMetrics__OclElement.initOperations(_MonitoringMetrics__OclElement);
			Fragments._MonitoringMetrics__OclEnumeration.initOperations(_MonitoringMetrics__OclEnumeration);
			Fragments._MonitoringMetrics__OclType.initOperations(_MonitoringMetrics__OclType);

			Fragments._Named__Named.initOperations(_Named__Named);
			Fragments._Named__OclAny.initOperations(_Named__OclAny);
			Fragments._Named__OclElement.initOperations(_Named__OclElement);

			Fragments._OutputType__OclAny.initOperations(_OutputType__OclAny);
			Fragments._OutputType__OclElement.initOperations(_OutputType__OclElement);
			Fragments._OutputType__OclEnumeration.initOperations(_OutputType__OclEnumeration);
			Fragments._OutputType__OclType.initOperations(_OutputType__OclType);
			Fragments._OutputType__OutputType.initOperations(_OutputType__OutputType);

			Fragments._Sensor__Device.initOperations(_Sensor__Device);
			Fragments._Sensor__Named.initOperations(_Sensor__Named);
			Fragments._Sensor__OclAny.initOperations(_Sensor__OclAny);
			Fragments._Sensor__OclElement.initOperations(_Sensor__OclElement);
			Fragments._Sensor__Sensor.initOperations(_Sensor__Sensor);

			Fragments._SensorState__OclAny.initOperations(_SensorState__OclAny);
			Fragments._SensorState__OclElement.initOperations(_SensorState__OclElement);
			Fragments._SensorState__OclEnumeration.initOperations(_SensorState__OclEnumeration);
			Fragments._SensorState__OclType.initOperations(_SensorState__OclType);
			Fragments._SensorState__SensorState.initOperations(_SensorState__SensorState);

			Fragments._SensorType__OclAny.initOperations(_SensorType__OclAny);
			Fragments._SensorType__OclElement.initOperations(_SensorType__OclElement);
			Fragments._SensorType__OclEnumeration.initOperations(_SensorType__OclEnumeration);
			Fragments._SensorType__OclType.initOperations(_SensorType__OclType);
			Fragments._SensorType__SensorType.initOperations(_SensorType__SensorType);

			Fragments._Service__Named.initOperations(_Service__Named);
			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Service.initOperations(_Service__Service);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Actuator = {
			SmartFarmingXTextTables.Properties._Device__DeviceID,
			SmartFarmingXTextTables.Properties._Device__IPAddress,
			SmartFarmingXTextTables.Properties._Device__IoTSystem,
			SmartFarmingXTextTables.Properties._Device__Manufacturer,
			SmartFarmingXTextTables.Properties._Actuator__Protocol,
			SmartFarmingXTextTables.Properties._Actuator__Type,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ActuatorType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AnalyticsSystem = {
			SmartFarmingXTextTables.Properties._AnalyticsSystem__AnalyticsType,
			SmartFarmingXTextTables.Properties._AnalyticsSystem__DataSource,
			SmartFarmingXTextTables.Properties._Service__Host,
			SmartFarmingXTextTables.Properties._Service__IoTSystem,
			SmartFarmingXTextTables.Properties._AnalyticsSystem__OutputType,
			SmartFarmingXTextTables.Properties._Service__PIC,
			SmartFarmingXTextTables.Properties._Service__ServiceID,
			SmartFarmingXTextTables.Properties._Service__URI,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AnalyticsType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CommunicationProtocol = {
			SmartFarmingXTextTables.Properties._CommunicationProtocol__ActuatorNumber,
			SmartFarmingXTextTables.Properties._CommunicationProtocol__SensorNumber,
			SmartFarmingXTextTables.Properties._CommunicationProtocol__Type,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CommunicationType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ControlType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ControllerAction = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Controlling = {
			SmartFarmingXTextTables.Properties._Controlling__Action,
			SmartFarmingXTextTables.Properties._Controlling__Actuators,
			SmartFarmingXTextTables.Properties._Controlling__ControlType,
			SmartFarmingXTextTables.Properties._Service__Host,
			SmartFarmingXTextTables.Properties._Service__IoTSystem,
			SmartFarmingXTextTables.Properties._Service__PIC,
			SmartFarmingXTextTables.Properties._Service__ServiceID,
			SmartFarmingXTextTables.Properties._Service__URI,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Crop = {
			SmartFarmingXTextTables.Properties._Crop__CropGroup,
			SmartFarmingXTextTables.Properties._Crop__Farm,
			SmartFarmingXTextTables.Properties._Crop__GrowthDuration,
			SmartFarmingXTextTables.Properties._Crop__SeedCode,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CropGroup = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Device = {
			SmartFarmingXTextTables.Properties._Device__DeviceID,
			SmartFarmingXTextTables.Properties._Device__IPAddress,
			SmartFarmingXTextTables.Properties._Device__IoTSystem,
			SmartFarmingXTextTables.Properties._Device__Manufacturer,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Farm = {
			SmartFarmingXTextTables.Properties._Farm__Crops,
			SmartFarmingXTextTables.Properties._Farm__Farmers,
			SmartFarmingXTextTables.Properties._Farm__IoTSystem,
			SmartFarmingXTextTables.Properties._Farm__Location,
			SmartFarmingXTextTables.Properties._Farm__Size,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Farmer = {
			SmartFarmingXTextTables.Properties._Farmer__Email,
			SmartFarmingXTextTables.Properties._Farmer__Farm,
			SmartFarmingXTextTables.Properties._Farmer__FarmerID,
			SmartFarmingXTextTables.Properties._Farmer__PhoneNumber,
			SmartFarmingXTextTables.Properties._Farmer__Services,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Gateway = {
			SmartFarmingXTextTables.Properties._Gateway__Devices,
			SmartFarmingXTextTables.Properties._Gateway__GatewayID,
			SmartFarmingXTextTables.Properties._Gateway__IoTSystem,
			SmartFarmingXTextTables.Properties._Gateway__Model,
			SmartFarmingXTextTables.Properties._Gateway__Protocols,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IoTSystem = {
			SmartFarmingXTextTables.Properties._IoTSystem__Devices,
			SmartFarmingXTextTables.Properties._IoTSystem__Gateways,
			SmartFarmingXTextTables.Properties._IoTSystem__Services,
			SmartFarmingXTextTables.Properties._IoTSystem__Version,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Monitoring = {
			SmartFarmingXTextTables.Properties._Monitoring__Control,
			SmartFarmingXTextTables.Properties._Service__Host,
			SmartFarmingXTextTables.Properties._Service__IoTSystem,
			SmartFarmingXTextTables.Properties._Monitoring__Metrics,
			SmartFarmingXTextTables.Properties._Service__PIC,
			SmartFarmingXTextTables.Properties._Monitoring__Sensors,
			SmartFarmingXTextTables.Properties._Service__ServiceID,
			SmartFarmingXTextTables.Properties._Service__URI,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MonitoringCondition = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MonitoringMetrics = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Named = {
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OutputType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sensor = {
			SmartFarmingXTextTables.Properties._Device__DeviceID,
			SmartFarmingXTextTables.Properties._Device__IPAddress,
			SmartFarmingXTextTables.Properties._Device__IoTSystem,
			SmartFarmingXTextTables.Properties._Device__Manufacturer,
			SmartFarmingXTextTables.Properties._Sensor__Protocol,
			SmartFarmingXTextTables.Properties._Sensor__State,
			SmartFarmingXTextTables.Properties._Sensor__Type,
			SmartFarmingXTextTables.Properties._Sensor__Unit,
			SmartFarmingXTextTables.Properties._Sensor__Value,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SensorState = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SensorType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Service = {
			SmartFarmingXTextTables.Properties._Service__Host,
			SmartFarmingXTextTables.Properties._Service__IoTSystem,
			SmartFarmingXTextTables.Properties._Service__PIC,
			SmartFarmingXTextTables.Properties._Service__ServiceID,
			SmartFarmingXTextTables.Properties._Service__URI,
			SmartFarmingXTextTables.Properties._Named__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Actuator__Actuator.initProperties(_Actuator);
			Fragments._ActuatorType__ActuatorType.initProperties(_ActuatorType);
			Fragments._AnalyticsSystem__AnalyticsSystem.initProperties(_AnalyticsSystem);
			Fragments._AnalyticsType__AnalyticsType.initProperties(_AnalyticsType);
			Fragments._CommunicationProtocol__CommunicationProtocol.initProperties(_CommunicationProtocol);
			Fragments._CommunicationType__CommunicationType.initProperties(_CommunicationType);
			Fragments._ControlType__ControlType.initProperties(_ControlType);
			Fragments._ControllerAction__ControllerAction.initProperties(_ControllerAction);
			Fragments._Controlling__Controlling.initProperties(_Controlling);
			Fragments._Crop__Crop.initProperties(_Crop);
			Fragments._CropGroup__CropGroup.initProperties(_CropGroup);
			Fragments._Device__Device.initProperties(_Device);
			Fragments._Farm__Farm.initProperties(_Farm);
			Fragments._Farmer__Farmer.initProperties(_Farmer);
			Fragments._Gateway__Gateway.initProperties(_Gateway);
			Fragments._IoTSystem__IoTSystem.initProperties(_IoTSystem);
			Fragments._Monitoring__Monitoring.initProperties(_Monitoring);
			Fragments._MonitoringCondition__MonitoringCondition.initProperties(_MonitoringCondition);
			Fragments._MonitoringMetrics__MonitoringMetrics.initProperties(_MonitoringMetrics);
			Fragments._Named__Named.initProperties(_Named);
			Fragments._OutputType__OutputType.initProperties(_OutputType);
			Fragments._Sensor__Sensor.initProperties(_Sensor);
			Fragments._SensorState__SensorState.initProperties(_SensorState);
			Fragments._SensorType__SensorType.initProperties(_SensorType);
			Fragments._Service__Service.initProperties(_Service);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ActuatorType__AirConditioner = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE.getEEnumLiteral("AirConditioner"), Types._ActuatorType, 0);
		public static final EcoreExecutorEnumerationLiteral _ActuatorType__NutrientController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE.getEEnumLiteral("NutrientController"), Types._ActuatorType, 1);
		public static final EcoreExecutorEnumerationLiteral _ActuatorType__LEDController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE.getEEnumLiteral("LEDController"), Types._ActuatorType, 2);
		public static final EcoreExecutorEnumerationLiteral _ActuatorType__OxygenController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE.getEEnumLiteral("OxygenController"), Types._ActuatorType, 3);
		public static final EcoreExecutorEnumerationLiteral _ActuatorType__CO2Controller = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ACTUATOR_TYPE.getEEnumLiteral("CO2Controller"), Types._ActuatorType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ActuatorType = {
			_ActuatorType__AirConditioner,
			_ActuatorType__NutrientController,
			_ActuatorType__LEDController,
			_ActuatorType__OxygenController,
			_ActuatorType__CO2Controller
		};

		public static final EcoreExecutorEnumerationLiteral _AnalyticsType__Harvesting = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ANALYTICS_TYPE.getEEnumLiteral("Harvesting"), Types._AnalyticsType, 0);
		public static final EcoreExecutorEnumerationLiteral _AnalyticsType__Seeding = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ANALYTICS_TYPE.getEEnumLiteral("Seeding"), Types._AnalyticsType, 1);
		public static final EcoreExecutorEnumerationLiteral _AnalyticsType__Resource = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.ANALYTICS_TYPE.getEEnumLiteral("Resource"), Types._AnalyticsType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _AnalyticsType = {
			_AnalyticsType__Harvesting,
			_AnalyticsType__Seeding,
			_AnalyticsType__Resource
		};

		public static final EcoreExecutorEnumerationLiteral _CommunicationType__ZigBee = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("ZigBee"), Types._CommunicationType, 0);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__MQTT = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("MQTT"), Types._CommunicationType, 1);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__COAP = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("COAP"), Types._CommunicationType, 2);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__HTTP = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("HTTP"), Types._CommunicationType, 3);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__WIFI = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("WIFI"), Types._CommunicationType, 4);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__Bluetooth = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("Bluetooth"), Types._CommunicationType, 5);
		public static final EcoreExecutorEnumerationLiteral _CommunicationType__ZWave = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.COMMUNICATION_TYPE.getEEnumLiteral("ZWave"), Types._CommunicationType, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CommunicationType = {
			_CommunicationType__ZigBee,
			_CommunicationType__MQTT,
			_CommunicationType__COAP,
			_CommunicationType__HTTP,
			_CommunicationType__WIFI,
			_CommunicationType__Bluetooth,
			_CommunicationType__ZWave
		};

		public static final EcoreExecutorEnumerationLiteral _ControlType__AirConditioner = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROL_TYPE.getEEnumLiteral("AirConditioner"), Types._ControlType, 0);
		public static final EcoreExecutorEnumerationLiteral _ControlType__NutrientController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROL_TYPE.getEEnumLiteral("NutrientController"), Types._ControlType, 1);
		public static final EcoreExecutorEnumerationLiteral _ControlType__LEDController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROL_TYPE.getEEnumLiteral("LEDController"), Types._ControlType, 2);
		public static final EcoreExecutorEnumerationLiteral _ControlType__OxygenController = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROL_TYPE.getEEnumLiteral("OxygenController"), Types._ControlType, 3);
		public static final EcoreExecutorEnumerationLiteral _ControlType__CO2Controller = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROL_TYPE.getEEnumLiteral("CO2Controller"), Types._ControlType, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ControlType = {
			_ControlType__AirConditioner,
			_ControlType__NutrientController,
			_ControlType__LEDController,
			_ControlType__OxygenController,
			_ControlType__CO2Controller
		};

		public static final EcoreExecutorEnumerationLiteral _ControllerAction__Increase = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION.getEEnumLiteral("Increase"), Types._ControllerAction, 0);
		public static final EcoreExecutorEnumerationLiteral _ControllerAction__Decrease = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION.getEEnumLiteral("Decrease"), Types._ControllerAction, 1);
		public static final EcoreExecutorEnumerationLiteral _ControllerAction__ON = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION.getEEnumLiteral("ON"), Types._ControllerAction, 2);
		public static final EcoreExecutorEnumerationLiteral _ControllerAction__OFF = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION.getEEnumLiteral("OFF"), Types._ControllerAction, 3);
		public static final EcoreExecutorEnumerationLiteral _ControllerAction__Alert = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CONTROLLER_ACTION.getEEnumLiteral("Alert"), Types._ControllerAction, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ControllerAction = {
			_ControllerAction__Increase,
			_ControllerAction__Decrease,
			_ControllerAction__ON,
			_ControllerAction__OFF,
			_ControllerAction__Alert
		};

		public static final EcoreExecutorEnumerationLiteral _CropGroup__Vegetable = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CROP_GROUP.getEEnumLiteral("Vegetable"), Types._CropGroup, 0);
		public static final EcoreExecutorEnumerationLiteral _CropGroup__Fruit = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CROP_GROUP.getEEnumLiteral("Fruit"), Types._CropGroup, 1);
		public static final EcoreExecutorEnumerationLiteral _CropGroup__Flower = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CROP_GROUP.getEEnumLiteral("Flower"), Types._CropGroup, 2);
		public static final EcoreExecutorEnumerationLiteral _CropGroup__Tubers = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.CROP_GROUP.getEEnumLiteral("Tubers"), Types._CropGroup, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CropGroup = {
			_CropGroup__Vegetable,
			_CropGroup__Fruit,
			_CropGroup__Flower,
			_CropGroup__Tubers
		};

		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Optimum = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Optimum"), Types._MonitoringCondition, 0);
		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Healthy = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Healthy"), Types._MonitoringCondition, 1);
		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Good = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Good"), Types._MonitoringCondition, 2);
		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Warning = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Warning"), Types._MonitoringCondition, 3);
		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Danger = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Danger"), Types._MonitoringCondition, 4);
		public static final EcoreExecutorEnumerationLiteral _MonitoringCondition__Invalid = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_CONDITION.getEEnumLiteral("Invalid"), Types._MonitoringCondition, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MonitoringCondition = {
			_MonitoringCondition__Optimum,
			_MonitoringCondition__Healthy,
			_MonitoringCondition__Good,
			_MonitoringCondition__Warning,
			_MonitoringCondition__Danger,
			_MonitoringCondition__Invalid
		};

		public static final EcoreExecutorEnumerationLiteral _MonitoringMetrics__Nutrient = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_METRICS.getEEnumLiteral("Nutrient"), Types._MonitoringMetrics, 0);
		public static final EcoreExecutorEnumerationLiteral _MonitoringMetrics__PhotoSynthesis = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_METRICS.getEEnumLiteral("PhotoSynthesis"), Types._MonitoringMetrics, 1);
		public static final EcoreExecutorEnumerationLiteral _MonitoringMetrics__EnvironmentalSafety = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.MONITORING_METRICS.getEEnumLiteral("EnvironmentalSafety"), Types._MonitoringMetrics, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MonitoringMetrics = {
			_MonitoringMetrics__Nutrient,
			_MonitoringMetrics__PhotoSynthesis,
			_MonitoringMetrics__EnvironmentalSafety
		};

		public static final EcoreExecutorEnumerationLiteral _OutputType__LineGraph = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.OUTPUT_TYPE.getEEnumLiteral("LineGraph"), Types._OutputType, 0);
		public static final EcoreExecutorEnumerationLiteral _OutputType__PieChart = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.OUTPUT_TYPE.getEEnumLiteral("PieChart"), Types._OutputType, 1);
		public static final EcoreExecutorEnumerationLiteral _OutputType__BarChart = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.OUTPUT_TYPE.getEEnumLiteral("BarChart"), Types._OutputType, 2);
		public static final EcoreExecutorEnumerationLiteral _OutputType__Tabular = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.OUTPUT_TYPE.getEEnumLiteral("Tabular"), Types._OutputType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OutputType = {
			_OutputType__LineGraph,
			_OutputType__PieChart,
			_OutputType__BarChart,
			_OutputType__Tabular
		};

		public static final EcoreExecutorEnumerationLiteral _SensorState__Active = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_STATE.getEEnumLiteral("Active"), Types._SensorState, 0);
		public static final EcoreExecutorEnumerationLiteral _SensorState__Passive = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_STATE.getEEnumLiteral("Passive"), Types._SensorState, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SensorState = {
			_SensorState__Active,
			_SensorState__Passive
		};

		public static final EcoreExecutorEnumerationLiteral _SensorType__Temperature = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("Temperature"), Types._SensorType, 0);
		public static final EcoreExecutorEnumerationLiteral _SensorType__Humidity = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("Humidity"), Types._SensorType, 1);
		public static final EcoreExecutorEnumerationLiteral _SensorType__CO2 = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("CO2"), Types._SensorType, 2);
		public static final EcoreExecutorEnumerationLiteral _SensorType__Oxygen = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("Oxygen"), Types._SensorType, 3);
		public static final EcoreExecutorEnumerationLiteral _SensorType__PH = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("PH"), Types._SensorType, 4);
		public static final EcoreExecutorEnumerationLiteral _SensorType__EC = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("EC"), Types._SensorType, 5);
		public static final EcoreExecutorEnumerationLiteral _SensorType__LEDLight = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("LEDLight"), Types._SensorType, 6);
		public static final EcoreExecutorEnumerationLiteral _SensorType__Surveillance = new EcoreExecutorEnumerationLiteral(SmartFarmingXTextPackage.Literals.SENSOR_TYPE.getEEnumLiteral("Surveillance"), Types._SensorType, 7);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SensorType = {
			_SensorType__Temperature,
			_SensorType__Humidity,
			_SensorType__CO2,
			_SensorType__Oxygen,
			_SensorType__PH,
			_SensorType__EC,
			_SensorType__LEDLight,
			_SensorType__Surveillance
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ActuatorType.initLiterals(_ActuatorType);
			Types._AnalyticsType.initLiterals(_AnalyticsType);
			Types._CommunicationType.initLiterals(_CommunicationType);
			Types._ControlType.initLiterals(_ControlType);
			Types._ControllerAction.initLiterals(_ControllerAction);
			Types._CropGroup.initLiterals(_CropGroup);
			Types._MonitoringCondition.initLiterals(_MonitoringCondition);
			Types._MonitoringMetrics.initLiterals(_MonitoringMetrics);
			Types._OutputType.initLiterals(_OutputType);
			Types._SensorState.initLiterals(_SensorState);
			Types._SensorType.initLiterals(_SensorType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SmartFarmingXTextTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SmartFarmingXTextTables();
	}

	private SmartFarmingXTextTables() {
		super(SmartFarmingXTextPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		SmartFarmingXTextPackage.Literals.ACTUATOR,
		SmartFarmingXTextPackage.Literals.CONTROLLING,
		SmartFarmingXTextPackage.Literals.FARMER,
		SmartFarmingXTextPackage.Literals.MONITORING,
		SmartFarmingXTextPackage.Literals.SENSOR
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
