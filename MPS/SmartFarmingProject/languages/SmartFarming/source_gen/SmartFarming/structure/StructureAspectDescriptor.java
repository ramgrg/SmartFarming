package SmartFarming.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptActuator = createDescriptorForActuator();
  /*package*/ final ConceptDescriptor myConceptActuatorReference = createDescriptorForActuatorReference();
  /*package*/ final ConceptDescriptor myConceptAnalyticsSystem = createDescriptorForAnalyticsSystem();
  /*package*/ final ConceptDescriptor myConceptCommunicationProtocol = createDescriptorForCommunicationProtocol();
  /*package*/ final ConceptDescriptor myConceptControlSystem = createDescriptorForControlSystem();
  /*package*/ final ConceptDescriptor myConceptCrop = createDescriptorForCrop();
  /*package*/ final ConceptDescriptor myConceptDevice = createDescriptorForDevice();
  /*package*/ final ConceptDescriptor myConceptDeviceReference = createDescriptorForDeviceReference();
  /*package*/ final ConceptDescriptor myConceptFarm = createDescriptorForFarm();
  /*package*/ final ConceptDescriptor myConceptFarmer = createDescriptorForFarmer();
  /*package*/ final ConceptDescriptor myConceptGateway = createDescriptorForGateway();
  /*package*/ final ConceptDescriptor myConceptIoTSystem = createDescriptorForIoTSystem();
  /*package*/ final ConceptDescriptor myConceptMonitoringSystem = createDescriptorForMonitoringSystem();
  /*package*/ final ConceptDescriptor myConceptSensor = createDescriptorForSensor();
  /*package*/ final ConceptDescriptor myConceptSensorReference = createDescriptorForSensorReference();
  /*package*/ final ConceptDescriptor myConceptService = createDescriptorForService();
  /*package*/ final ConceptDescriptor myConceptServiceReference = createDescriptorForServiceReference();
  /*package*/ final EnumerationDescriptor myEnumerationActuatorType = new EnumerationDescriptor_ActuatorType();
  /*package*/ final EnumerationDescriptor myEnumerationAnalyticType = new EnumerationDescriptor_AnalyticType();
  /*package*/ final EnumerationDescriptor myEnumerationCommunicationType = new EnumerationDescriptor_CommunicationType();
  /*package*/ final EnumerationDescriptor myEnumerationControlActions = new EnumerationDescriptor_ControlActions();
  /*package*/ final EnumerationDescriptor myEnumerationControlType = new EnumerationDescriptor_ControlType();
  /*package*/ final EnumerationDescriptor myEnumerationCropGroup = new EnumerationDescriptor_CropGroup();
  /*package*/ final EnumerationDescriptor myEnumerationMonitoringConditions = new EnumerationDescriptor_MonitoringConditions();
  /*package*/ final EnumerationDescriptor myEnumerationMonitoringMetrics = new EnumerationDescriptor_MonitoringMetrics();
  /*package*/ final EnumerationDescriptor myEnumerationOutputType = new EnumerationDescriptor_OutputType();
  /*package*/ final EnumerationDescriptor myEnumerationSensorState = new EnumerationDescriptor_SensorState();
  /*package*/ final EnumerationDescriptor myEnumerationSensorType = new EnumerationDescriptor_SensorType();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptActuator, myConceptActuatorReference, myConceptAnalyticsSystem, myConceptCommunicationProtocol, myConceptControlSystem, myConceptCrop, myConceptDevice, myConceptDeviceReference, myConceptFarm, myConceptFarmer, myConceptGateway, myConceptIoTSystem, myConceptMonitoringSystem, myConceptSensor, myConceptSensorReference, myConceptService, myConceptServiceReference);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Actuator:
        return myConceptActuator;
      case LanguageConceptSwitch.ActuatorReference:
        return myConceptActuatorReference;
      case LanguageConceptSwitch.AnalyticsSystem:
        return myConceptAnalyticsSystem;
      case LanguageConceptSwitch.CommunicationProtocol:
        return myConceptCommunicationProtocol;
      case LanguageConceptSwitch.ControlSystem:
        return myConceptControlSystem;
      case LanguageConceptSwitch.Crop:
        return myConceptCrop;
      case LanguageConceptSwitch.Device:
        return myConceptDevice;
      case LanguageConceptSwitch.DeviceReference:
        return myConceptDeviceReference;
      case LanguageConceptSwitch.Farm:
        return myConceptFarm;
      case LanguageConceptSwitch.Farmer:
        return myConceptFarmer;
      case LanguageConceptSwitch.Gateway:
        return myConceptGateway;
      case LanguageConceptSwitch.IoTSystem:
        return myConceptIoTSystem;
      case LanguageConceptSwitch.MonitoringSystem:
        return myConceptMonitoringSystem;
      case LanguageConceptSwitch.Sensor:
        return myConceptSensor;
      case LanguageConceptSwitch.SensorReference:
        return myConceptSensorReference;
      case LanguageConceptSwitch.Service:
        return myConceptService;
      case LanguageConceptSwitch.ServiceReference:
        return myConceptServiceReference;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationActuatorType, myEnumerationAnalyticType, myEnumerationCommunicationType, myEnumerationControlActions, myEnumerationControlType, myEnumerationCropGroup, myEnumerationMonitoringConditions, myEnumerationMonitoringMetrics, myEnumerationOutputType, myEnumerationSensorState, myEnumerationSensorType);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForActuator() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Actuator", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3055af0L);
    b.class_(false, false, false);
    b.super_("SmartFarming.structure.Device", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061394672");
    b.version(2);
    b.property("Type", 0x4cd0d7ded305b8ddL).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30571e9L)).origin("5535161294061418717").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActuatorReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "ActuatorReference", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1cf0L);
    b.class_(false, false, false);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5789548444776013040");
    b.version(2);
    b.associate("Uses", 0x50589ba2dcca1cf1L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3055af0L).optional(true).origin("5789548444776013041").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAnalyticsSystem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "AnalyticsSystem", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625dfL);
    b.class_(false, false, false);
    b.super_("SmartFarming.structure.Service", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/7499585253600011743");
    b.version(2);
    b.property("AnalyticsType", 0x6813e10dbb9625e9L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625e0L)).origin("7499585253600011753").done();
    b.property("DataSource", 0x6813e10dbb9625ebL).type(PrimitiveTypeId.STRING).origin("7499585253600011755").done();
    b.property("OutputType", 0x6813e10dbb9625eeL).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625f2L)).origin("7499585253600011758").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCommunicationProtocol() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "CommunicationProtocol", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bb03L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/8486969697902050051");
    b.version(2);
    b.property("Type", 0x75c7c5f96ef4bb29L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bb06L)).origin("8486969697902050089").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForControlSystem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "ControlSystem", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb962600L);
    b.class_(false, false, false);
    b.super_("SmartFarming.structure.Service", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/7499585253600011776");
    b.version(2);
    b.property("ControlType", 0x6813e10dbb962601L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb962604L)).origin("7499585253600011777").done();
    b.property("Actions", 0x6813e10dbb962618L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb96261bL)).origin("7499585253600011800").done();
    b.aggregate("Actuators", 0x50589ba2dcca1cf6L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1cf0L).optional(false).ordered(true).multiple(true).origin("5789548444776013046").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCrop() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Crop", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd384L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/3777166951715689348");
    b.version(2);
    b.property("Group", 0x346b31548e5bd387L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd389L)).origin("3777166951715689351").done();
    b.property("GrowthDuration", 0x346b31548e5bd397L).type(PrimitiveTypeId.INTEGER).origin("3777166951715689367").done();
    b.property("SeedCode", 0x346b31548e5bd39aL).type(PrimitiveTypeId.STRING).origin("3777166951715689370").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDevice() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Device", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L);
    b.class_(false, true, false);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061323449");
    b.version(2);
    b.property("DeviceID", 0x4cd0d7ded3046d9eL).type(PrimitiveTypeId.STRING).origin("5535161294061333918").done();
    b.property("IPAddress", 0x4cd0d7ded30477ccL).type(PrimitiveTypeId.STRING).origin("5535161294061336524").done();
    b.property("Manufacturer", 0x4cd0d7ded3047ce5L).type(PrimitiveTypeId.STRING).origin("5535161294061337829").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDeviceReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "DeviceReference", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dccb47a0L);
    b.class_(false, false, false);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5789548444776089504");
    b.version(2);
    b.associate("Manages", 0x50589ba2dccb47a1L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L).optional(true).origin("5789548444776089505").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFarm() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Farm", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0xad19f946497d8c4L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/779579670203455684");
    b.version(2);
    b.property("Location", 0x346b31548e5bd367L).type(PrimitiveTypeId.STRING).origin("3777166951715689319").done();
    b.property("Size", 0x346b31548e5bd369L).type(PrimitiveTypeId.INTEGER).origin("3777166951715689321").done();
    b.aggregate("Farmers", 0x346b31548e5bd37eL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd36cL).optional(false).ordered(true).multiple(true).origin("3777166951715689342").done();
    b.aggregate("Crops", 0x346b31548e5bd39eL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd384L).optional(false).ordered(true).multiple(true).origin("3777166951715689374").done();
    b.aggregate("IoTSystems", 0x75c7c5f96ef2ec9eL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd3a1L).optional(false).ordered(true).multiple(false).origin("8486969697901931678").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFarmer() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Farmer", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd36cL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/3777166951715689324");
    b.version(2);
    b.property("FarmerID", 0x346b31548e5bd36fL).type(PrimitiveTypeId.STRING).origin("3777166951715689327").done();
    b.property("Email", 0x346b31548e5bd371L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd379L)).origin("3777166951715689329").done();
    b.property("PhoneNumber", 0x346b31548e5bd374L).type(PrimitiveTypeId.STRING).origin("3777166951715689332").done();
    b.aggregate("Services", 0x50589ba2dcca1b46L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1b34L).optional(true).ordered(true).multiple(true).origin("5789548444776012614").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGateway() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Gateway", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bafbL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/8486969697902050043");
    b.version(2);
    b.property("GatewayID", 0x75c7c5f96ef4bafeL).type(PrimitiveTypeId.STRING).origin("8486969697902050046").done();
    b.property("Model", 0x75c7c5f96ef4bb00L).type(PrimitiveTypeId.STRING).origin("8486969697902050048").done();
    b.aggregate("Protocols", 0x75c7c5f96ef4bb2bL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bb03L).optional(false).ordered(true).multiple(true).origin("8486969697902050091").done();
    b.aggregate("Devices", 0x50589ba2dcca1b2cL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dccb47a0L).optional(true).ordered(true).multiple(false).origin("5789548444776012588").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForIoTSystem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "IoTSystem", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd3a1L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/3777166951715689377");
    b.version(2);
    b.property("Version", 0x346b31548e5bd3a4L).type(PrimitiveTypeId.STRING).origin("3777166951715689380").done();
    b.aggregate("Services", 0x6813e10dbb991a4eL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L).optional(false).ordered(true).multiple(true).origin("7499585253600205390").done();
    b.aggregate("Devices", 0x4cd0d7ded30b0b0eL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L).optional(false).ordered(true).multiple(true).origin("5535161294061767438").done();
    b.aggregate("Gateways", 0x4cd0d7ded30b18ebL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bafbL).optional(false).ordered(true).multiple(true).origin("5535161294061770987").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMonitoringSystem() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "MonitoringSystem", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb96262fL);
    b.class_(false, false, false);
    b.super_("SmartFarming.structure.Service", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/7499585253600011823");
    b.version(2);
    b.property("Metrics", 0x6813e10dbb962630L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb962632L)).origin("7499585253600011824").done();
    b.property("Condition", 0x6813e10dbb96263bL).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb96263eL)).origin("7499585253600011835").done();
    b.associate("Trigger", 0x50589ba2dcca1b3bL).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb962600L).optional(true).origin("5789548444776012603").done();
    b.aggregate("Sensors", 0x50589ba2dcca1cf3L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1b15L).optional(false).ordered(true).multiple(true).origin("5789548444776013043").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSensor() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Sensor", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3049b6dL);
    b.class_(false, false, false);
    b.super_("SmartFarming.structure.Device", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061345645");
    b.version(2);
    b.property("Type", 0x4cd0d7ded30533d6L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded304b5aeL)).origin("5535161294061384662").done();
    b.property("State", 0x4cd0d7ded305396cL).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded305019dL)).origin("5535161294061386092").done();
    b.property("Unit", 0x4cd0d7ded3053f03L).type(PrimitiveTypeId.STRING).origin("5535161294061387523").done();
    b.property("Value", 0x4cd0d7ded3053f07L).type(MetaIdFactory.dataTypeId(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd378L)).origin("5535161294061387527").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSensorReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "SensorReference", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1b15L);
    b.class_(false, false, false);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5789548444776012565");
    b.version(2);
    b.associate("Uses", 0x50589ba2dcca1b16L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3049b6dL).optional(true).origin("5789548444776012566").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForService() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "Service", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L);
    b.class_(false, true, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/7499585253600011716");
    b.version(2);
    b.property("ServiceID", 0x6813e10dbb9625cbL).type(PrimitiveTypeId.STRING).origin("7499585253600011723").done();
    b.property("ServiceName", 0x6813e10dbb9625cdL).type(PrimitiveTypeId.STRING).origin("7499585253600011725").done();
    b.property("Host", 0x6813e10dbb9625d0L).type(PrimitiveTypeId.STRING).origin("7499585253600011728").done();
    b.property("URI", 0x6813e10dbb9625d4L).type(PrimitiveTypeId.STRING).origin("7499585253600011732").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForServiceReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("SmartFarming", "ServiceReference", 0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x50589ba2dcca1b34L);
    b.class_(false, false, false);
    b.origin("r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5789548444776012596");
    b.version(2);
    b.associate("Operates", 0x50589ba2dcca1b35L).target(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x6813e10dbb9625c4L).optional(true).origin("5789548444776012597").done();
    return b.create();
  }
}
