package SmartFarming.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Actuator;
  private ConceptPresentation props_ActuatorReference;
  private ConceptPresentation props_AnalyticsSystem;
  private ConceptPresentation props_CommunicationProtocol;
  private ConceptPresentation props_ControlSystem;
  private ConceptPresentation props_Crop;
  private ConceptPresentation props_Device;
  private ConceptPresentation props_DeviceReference;
  private ConceptPresentation props_Farm;
  private ConceptPresentation props_Farmer;
  private ConceptPresentation props_Gateway;
  private ConceptPresentation props_IoTSystem;
  private ConceptPresentation props_MonitoringSystem;
  private ConceptPresentation props_Sensor;
  private ConceptPresentation props_SensorReference;
  private ConceptPresentation props_Service;
  private ConceptPresentation props_ServiceReference;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Actuator:
        if (props_Actuator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Actuator = cpb.create();
        }
        return props_Actuator;
      case LanguageConceptSwitch.ActuatorReference:
        if (props_ActuatorReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ActuatorReference");
          props_ActuatorReference = cpb.create();
        }
        return props_ActuatorReference;
      case LanguageConceptSwitch.AnalyticsSystem:
        if (props_AnalyticsSystem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_AnalyticsSystem = cpb.create();
        }
        return props_AnalyticsSystem;
      case LanguageConceptSwitch.CommunicationProtocol:
        if (props_CommunicationProtocol == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_CommunicationProtocol = cpb.create();
        }
        return props_CommunicationProtocol;
      case LanguageConceptSwitch.ControlSystem:
        if (props_ControlSystem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ControlSystem = cpb.create();
        }
        return props_ControlSystem;
      case LanguageConceptSwitch.Crop:
        if (props_Crop == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Crop represents the crop in smart farming system. ");
          cpb.presentationByName();
          props_Crop = cpb.create();
        }
        return props_Crop;
      case LanguageConceptSwitch.Device:
        if (props_Device == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("It is the abstract metamodel for Devices ");
          props_Device = cpb.create();
        }
        return props_Device;
      case LanguageConceptSwitch.DeviceReference:
        if (props_DeviceReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DeviceReference");
          props_DeviceReference = cpb.create();
        }
        return props_DeviceReference;
      case LanguageConceptSwitch.Farm:
        if (props_Farm == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Farm represents a controlled-environment farm where it powered by IoT System. It is root of the system. ");
          cpb.presentationByName();
          props_Farm = cpb.create();
        }
        return props_Farm;
      case LanguageConceptSwitch.Farmer:
        if (props_Farmer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Farmer represents the person that operates smart farming system. ");
          cpb.presentationByName();
          props_Farmer = cpb.create();
        }
        return props_Farmer;
      case LanguageConceptSwitch.Gateway:
        if (props_Gateway == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Gateway represent gateway in IoT System");
          cpb.presentationByName();
          props_Gateway = cpb.create();
        }
        return props_Gateway;
      case LanguageConceptSwitch.IoTSystem:
        if (props_IoTSystem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("IoT System represents the system powered by IoT that manage farm.");
          cpb.presentationByName();
          props_IoTSystem = cpb.create();
        }
        return props_IoTSystem;
      case LanguageConceptSwitch.MonitoringSystem:
        if (props_MonitoringSystem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_MonitoringSystem = cpb.create();
        }
        return props_MonitoringSystem;
      case LanguageConceptSwitch.Sensor:
        if (props_Sensor == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Sensor defines all the sensor that will be used in the system ");
          cpb.presentationByName();
          props_Sensor = cpb.create();
        }
        return props_Sensor;
      case LanguageConceptSwitch.SensorReference:
        if (props_SensorReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("SensorReference");
          props_SensorReference = cpb.create();
        }
        return props_SensorReference;
      case LanguageConceptSwitch.Service:
        if (props_Service == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Service = cpb.create();
        }
        return props_Service;
      case LanguageConceptSwitch.ServiceReference:
        if (props_ServiceReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ServiceReference");
          props_ServiceReference = cpb.create();
        }
        return props_ServiceReference;
    }
    return null;
  }
}
