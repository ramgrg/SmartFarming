<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:c197ba8d-31b6-43d7-b724-bb56bd634715(SmartFarming.model_one)">
  <persistence version="9" />
  <languages>
    <use id="5284d1be-e363-4c06-a236-4161e9028c0d" name="SmartFarming" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="5284d1be-e363-4c06-a236-4161e9028c0d" name="SmartFarming">
      <concept id="5789548444776012596" name="SmartFarming.structure.ServiceReference" flags="ng" index="2c$C2m">
        <reference id="5789548444776012597" name="Operates" index="2c$C2n" />
      </concept>
      <concept id="5789548444776012565" name="SmartFarming.structure.SensorReference" flags="ng" index="2c$C2R">
        <reference id="5789548444776012566" name="Uses" index="2c$C2O" />
      </concept>
      <concept id="5789548444776013040" name="SmartFarming.structure.ActuatorReference" flags="ng" index="2c$Cti">
        <reference id="5789548444776013041" name="Uses" index="2c$Ctj" />
      </concept>
      <concept id="5789548444776089504" name="SmartFarming.structure.DeviceReference" flags="ng" index="2c$XK2">
        <reference id="5789548444776089505" name="Manages" index="2c$XK3" />
      </concept>
      <concept id="8486969697902050051" name="SmartFarming.structure.CommunicationProtocol" flags="ng" index="rcRVU">
        <property id="8486969697902050089" name="Type" index="rcRVg" />
      </concept>
      <concept id="8486969697902050043" name="SmartFarming.structure.Gateway" flags="ng" index="rcRW2">
        <property id="8486969697902050048" name="Model" index="rcRVT" />
        <property id="8486969697902050046" name="GatewayID" index="rcRW7" />
        <child id="5789548444776012588" name="Devices" index="2c$C2e" />
        <child id="8486969697902050091" name="Protocols" index="rcRVi" />
      </concept>
      <concept id="5535161294061345645" name="SmartFarming.structure.Sensor" flags="ng" index="2vP4MN">
        <property id="5535161294061384662" name="Type" index="2vPug8" />
        <property id="5535161294061387527" name="Value" index="2vPuzp" />
        <property id="5535161294061387523" name="Unit" index="2vPuzt" />
        <property id="5535161294061386092" name="State" index="2vPuUM" />
      </concept>
      <concept id="5535161294061323449" name="SmartFarming.structure.Device" flags="ng" index="2vP9dB">
        <property id="5535161294061336524" name="IPAddress" index="2vPa0i" />
        <property id="5535161294061337829" name="Manufacturer" index="2vPaGV" />
        <property id="5535161294061333918" name="DeviceID" index="2vPbD0" />
      </concept>
      <concept id="5535161294061394672" name="SmartFarming.structure.Actuator" flags="ng" index="2vPoOI">
        <property id="5535161294061418717" name="Type" index="2vPmW3" />
      </concept>
      <concept id="3777166951715689324" name="SmartFarming.structure.Farmer" flags="ng" index="2Uce8S">
        <property id="3777166951715689332" name="PhoneNumber" index="2Uce8w" />
        <property id="3777166951715689327" name="FarmerID" index="2Uce8V" />
        <child id="5789548444776012614" name="Services" index="2c$C3$" />
      </concept>
      <concept id="3777166951715689348" name="SmartFarming.structure.Crop" flags="ng" index="2Ucebg">
        <property id="3777166951715689367" name="GrowthDuration" index="2Uceb3" />
        <property id="3777166951715689370" name="SeedCode" index="2Ucebe" />
        <property id="3777166951715689351" name="Group" index="2Ucebj" />
      </concept>
      <concept id="3777166951715689377" name="SmartFarming.structure.IoTSystem" flags="ng" index="2UcebP">
        <property id="3777166951715689380" name="Version" index="2UcebK" />
        <child id="5535161294061770987" name="Gateways" index="2vQWWP" />
        <child id="5535161294061767438" name="Devices" index="2vQXNg" />
        <child id="7499585253600205390" name="Services" index="3jyJH3" />
      </concept>
      <concept id="7499585253600011716" name="SmartFarming.structure.Service" flags="ng" index="3jxsj9">
        <property id="7499585253600011723" name="ServiceID" index="3jxsj6" />
        <property id="7499585253600011732" name="URI" index="3jxsjp" />
        <property id="7499585253600011728" name="Host" index="3jxsjt" />
      </concept>
      <concept id="7499585253600011743" name="SmartFarming.structure.AnalyticsSystem" flags="ng" index="3jxsji">
        <property id="7499585253600011758" name="OutputType" index="3jxsjz" />
        <property id="7499585253600011753" name="AnalyticsType" index="3jxsj$" />
        <property id="7499585253600011755" name="DataSource" index="3jxsjA" />
      </concept>
      <concept id="7499585253600011776" name="SmartFarming.structure.ControlSystem" flags="ng" index="3jxssd">
        <property id="7499585253600011777" name="ControlType" index="3jxssc" />
        <property id="7499585253600011800" name="Actions" index="3jxssl" />
        <child id="5789548444776013046" name="Actuators" index="2c$Ctk" />
      </concept>
      <concept id="7499585253600011823" name="SmartFarming.structure.MonitoringSystem" flags="ng" index="3jxssy">
        <property id="7499585253600011835" name="Condition" index="3jxssQ" />
        <property id="7499585253600011824" name="Metrics" index="3jxssX" />
        <reference id="5789548444776012603" name="Trigger" index="2c$C2p" />
        <child id="5789548444776013043" name="Sensors" index="2c$Cth" />
      </concept>
      <concept id="779579670203455684" name="SmartFarming.structure.Farm" flags="ng" index="1Ih$tg">
        <property id="3777166951715689319" name="Location" index="2Uce8N" />
        <property id="3777166951715689321" name="Size" index="2Uce8X" />
        <child id="8486969697901931678" name="IoTSystems" index="rdi_B" />
        <child id="3777166951715689342" name="Farmers" index="2Uce8E" />
        <child id="3777166951715689374" name="Crops" index="2Uceba" />
      </concept>
    </language>
  </registry>
  <node concept="1Ih$tg" id="6LCgsI8h_5w">
    <property role="TrG5h" value="Haha" />
    <property role="2Uce8N" value="asdfsdfsd" />
    <property role="2Uce8X" value="500" />
    <node concept="2Ucebg" id="KyTPI15VV5" role="2Uceba">
      <property role="TrG5h" value="Lettuce" />
      <property role="2Ucebj" value="3hFcliemXea/Vegetable" />
      <property role="2Uceb3" value="27" />
      <property role="2Ucebe" value="sded" />
    </node>
    <node concept="2Ucebg" id="5vGOreg1X2N" role="2Uceba">
      <property role="2Ucebe" value="kjkj" />
      <property role="TrG5h" value="tomato" />
      <property role="2Ucebj" value="3hFcliemXea/Vegetable" />
    </node>
    <node concept="2Uce8S" id="KyTPI15VUU" role="2Uce8E">
      <property role="TrG5h" value="Mohammed" />
      <property role="2Uce8V" value="ssl331" />
      <property role="2Uce8w" value="0987736633" />
      <node concept="2c$C2m" id="KyTPI15VUW" role="2c$C3$">
        <ref role="2c$C2n" node="KyTPI15VT_" resolve="Harvest01" />
      </node>
      <node concept="2c$C2m" id="KyTPI15VUY" role="2c$C3$">
        <ref role="2c$C2n" node="KyTPI15VU6" resolve="Nutrient" />
      </node>
      <node concept="2c$C2m" id="KyTPI15VV1" role="2c$C3$">
        <ref role="2c$C2n" node="KyTPI15VTE" resolve="LED-Light" />
      </node>
    </node>
    <node concept="2Uce8S" id="5vGOrefP$Xb" role="2Uce8E">
      <property role="2Uce8V" value="dadf" />
      <property role="TrG5h" value="Monster" />
      <property role="2Uce8w" value="asddasd" />
      <node concept="2c$C2m" id="5vGOregap4n" role="2c$C3$" />
      <node concept="2c$C2m" id="5vGOrefP$Xj" role="2c$C3$">
        <ref role="2c$C2n" node="KyTPI15VT_" resolve="Harvest01" />
      </node>
    </node>
    <node concept="2UcebP" id="6LCgsI8h_5z" role="rdi_B">
      <property role="TrG5h" value="IoT1" />
      <property role="2UcebK" value="12.0.1" />
      <node concept="rcRW2" id="KyTPI15VUM" role="2vQWWP">
        <property role="TrG5h" value="Zig-Gateway" />
        <property role="rcRW7" value="092929" />
        <property role="rcRVT" value="2.3" />
        <node concept="2c$XK2" id="5vGOrefXM3P" role="2c$C2e">
          <ref role="2c$XK3" node="KyTPI15VUh" resolve="sensor 1" />
        </node>
        <node concept="rcRVU" id="KyTPI15VUN" role="rcRVi">
          <property role="TrG5h" value="Proto-01" />
          <property role="rcRVg" value="7n7Lv_IXbG8/MQTT" />
        </node>
        <node concept="rcRVU" id="5vGOrefYBAP" role="rcRVi">
          <property role="TrG5h" value="daf" />
        </node>
        <node concept="2c$XK2" id="5vGOrefYBAM" role="2c$C2e">
          <ref role="2c$XK3" node="KyTPI15VUm" resolve="sensor2" />
        </node>
      </node>
      <node concept="3jxssy" id="KyTPI15VU6" role="3jyJH3">
        <property role="TrG5h" value="Nutrient" />
        <property role="3jxssX" value="6wjSgQV_yoN/Nutrient" />
        <property role="3jxssQ" value="6wjSgQV_yp3/Good" />
        <property role="3jxsj6" value="1123" />
        <property role="3jxsjt" value="HaHa" />
        <property role="3jxsjp" value="xttedd" />
        <ref role="2c$C2p" node="KyTPI15VTE" resolve="LED-Light" />
        <node concept="2c$C2R" id="KyTPI15VU8" role="2c$Cth">
          <ref role="2c$C2O" node="KyTPI15VUh" resolve="sensor 1" />
        </node>
        <node concept="2c$C2R" id="KyTPI15VUz" role="2c$Cth">
          <ref role="2c$C2O" node="KyTPI15VUm" resolve="sensor2" />
        </node>
      </node>
      <node concept="3jxssd" id="KyTPI15VTE" role="3jyJH3">
        <property role="TrG5h" value="LED-Light" />
        <property role="3jxssc" value="6wjSgQV_yo9/Light" />
        <property role="3jxssl" value="6wjSgQV_yos/Increase" />
        <property role="3jxsj6" value="223" />
        <property role="3jxsjt" value="HaHa" />
        <property role="3jxsjp" value="xttedd" />
        <node concept="2c$Cti" id="KyTPI15VTG" role="2c$Ctk">
          <ref role="2c$Ctj" node="KyTPI15VUu" resolve="Nammp2" />
        </node>
      </node>
      <node concept="3jxsji" id="KyTPI15VT_" role="3jyJH3">
        <property role="TrG5h" value="Harvest01" />
        <property role="3jxsj$" value="6wjSgQV_ynx/Harvesting" />
        <property role="3jxsjA" value="Model-01" />
        <property role="3jxsjz" value="6wjSgQV_ynV/Tabular" />
        <property role="3jxsj6" value="21" />
        <property role="3jxsjt" value="HaHa" />
        <property role="3jxsjp" value="xttedd" />
      </node>
      <node concept="2vP4MN" id="KyTPI15VUh" role="2vQXNg">
        <property role="TrG5h" value="sensor 1" />
        <property role="2vPuUM" value="4NgPXVj1g6u/Active" />
        <property role="2vPuzt" value="celcius" />
        <property role="2vPbD0" value="1222444" />
        <property role="2vPa0i" value="123.33.33.2" />
        <property role="2vPaGV" value="teeeeprr" />
        <property role="2vPug8" value="4NgPXVj1bmJ/Temperature" />
        <property role="2vPuzp" value="12" />
      </node>
      <node concept="2vP4MN" id="KyTPI15VUm" role="2vQXNg">
        <property role="TrG5h" value="sensor2" />
        <property role="2vPuUM" value="4NgPXVj1g6u/Active" />
        <property role="2vPuzt" value="number" />
        <property role="2vPbD0" value="23244556" />
        <property role="2vPa0i" value="22.335.2.33" />
        <property role="2vPaGV" value="teeeeper" />
        <property role="2vPug8" value="4NgPXVj1epQ/Nutrients" />
      </node>
      <node concept="2vPoOI" id="KyTPI15VUu" role="2vQXNg">
        <property role="TrG5h" value="Nammp2" />
        <property role="2vPmW3" value="4NgPXVj1n7E/AirConditioner" />
        <property role="2vPbD0" value="34332" />
        <property role="2vPa0i" value="22.334.2.11" />
        <property role="2vPaGV" value="teeeper" />
      </node>
      <node concept="2vP4MN" id="5vGOreg49Ao" role="2vQXNg">
        <property role="TrG5h" value="Sensor" />
      </node>
    </node>
  </node>
</model>

