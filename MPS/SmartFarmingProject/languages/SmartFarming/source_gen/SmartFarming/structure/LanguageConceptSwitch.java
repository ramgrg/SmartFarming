package SmartFarming.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Actuator = 0;
  public static final int ActuatorReference = 1;
  public static final int AnalyticsSystem = 2;
  public static final int CommunicationProtocol = 3;
  public static final int ControlSystem = 4;
  public static final int Crop = 5;
  public static final int Device = 6;
  public static final int DeviceReference = 7;
  public static final int Farm = 8;
  public static final int Farmer = 9;
  public static final int Gateway = 10;
  public static final int IoTSystem = 11;
  public static final int MonitoringSystem = 12;
  public static final int Sensor = 13;
  public static final int SensorReference = 14;
  public static final int Service = 15;
  public static final int ServiceReference = 16;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x5284d1bee3634c06L, 0xa2364161e9028c0dL);
    builder.put(0x4cd0d7ded3055af0L, Actuator);
    builder.put(0x50589ba2dcca1cf0L, ActuatorReference);
    builder.put(0x6813e10dbb9625dfL, AnalyticsSystem);
    builder.put(0x75c7c5f96ef4bb03L, CommunicationProtocol);
    builder.put(0x6813e10dbb962600L, ControlSystem);
    builder.put(0x346b31548e5bd384L, Crop);
    builder.put(0x4cd0d7ded30444b9L, Device);
    builder.put(0x50589ba2dccb47a0L, DeviceReference);
    builder.put(0xad19f946497d8c4L, Farm);
    builder.put(0x346b31548e5bd36cL, Farmer);
    builder.put(0x75c7c5f96ef4bafbL, Gateway);
    builder.put(0x346b31548e5bd3a1L, IoTSystem);
    builder.put(0x6813e10dbb96262fL, MonitoringSystem);
    builder.put(0x4cd0d7ded3049b6dL, Sensor);
    builder.put(0x50589ba2dcca1b15L, SensorReference);
    builder.put(0x6813e10dbb9625c4L, Service);
    builder.put(0x50589ba2dcca1b34L, ServiceReference);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
