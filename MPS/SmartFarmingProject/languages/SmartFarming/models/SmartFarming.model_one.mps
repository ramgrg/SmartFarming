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
        <reference id="3598660026872233902" name="Uses" index="1CVfQk" />
      </concept>
      <concept id="5535161294061323449" name="SmartFarming.structure.Device" flags="ng" index="2vP9dB">
        <property id="5535161294061336524" name="IPAddress" index="2vPa0i" />
        <property id="5535161294061337829" name="Manufacturer" index="2vPaGV" />
        <property id="5535161294061333918" name="DeviceID" index="2vPbD0" />
      </concept>
      <concept id="5535161294061394672" name="SmartFarming.structure.Actuator" flags="ng" index="2vPoOI">
        <property id="5535161294061418717" name="Type" index="2vPmW3" />
        <reference id="3598660026872233904" name="Uses" index="1CVfQa" />
      </concept>
      <concept id="3777166951715689324" name="SmartFarming.structure.Farmer" flags="ng" index="2Uce8S">
        <property id="3777166951715689332" name="PhoneNumber" index="2Uce8w" />
        <property id="3777166951715689329" name="Email" index="2Uce8_" />
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
  <node concept="1Ih$tg" id="1DBpVrqpMWH">
    <property role="TrG5h" value="Farm_Aqila" />
    <property role="2Uce8N" value="L'Aquila" />
    <property role="2Uce8X" value="25" />
    <node concept="2Uce8S" id="1DBpVrqpMWI" role="2Uce8E">
      <property role="TrG5h" value="Ram" />
      <property role="2Uce8V" value="FAQ1" />
      <property role="2Uce8_" value="ram.gurung1990@gmail.com" />
      <property role="2Uce8w" value="3518214426" />
      <node concept="2c$C2m" id="1DBpVrqpNwU" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpMXa" resolve="NutriMoniteringSystem" />
      </node>
    </node>
    <node concept="2Uce8S" id="1DBpVrqpNwW" role="2Uce8E">
      <property role="TrG5h" value="Haben" />
      <property role="2Uce8V" value="FAQ2" />
      <property role="2Uce8_" value="checkhaben@gmail.com" />
      <property role="2Uce8w" value="3519521535" />
      <node concept="2c$C2m" id="1DBpVrqpNxd" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpNx6" resolve="Harvest" />
      </node>
    </node>
    <node concept="2Uce8S" id="1DBpVrqpNxf" role="2Uce8E">
      <property role="TrG5h" value="Mohammad" />
      <property role="2Uce8_" value="mohammad.rijal13@gmail.com" />
      <property role="2Uce8V" value="FAQ3" />
      <property role="2Uce8w" value="3337688713" />
      <node concept="2c$C2m" id="1DBpVrqpNxl" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpMXu" resolve="NutriControllingSystem" />
      </node>
    </node>
    <node concept="2Ucebg" id="1DBpVrqpMWJ" role="2Uceba">
      <property role="TrG5h" value="Cabbage" />
      <property role="2Ucebj" value="3hFcliemXea/Vegetable" />
      <property role="2Uceb3" value="70" />
      <property role="2Ucebe" value="Veg-Cab-1" />
    </node>
    <node concept="2Ucebg" id="1DBpVrqpNxn" role="2Uceba">
      <property role="TrG5h" value="Lily" />
      <property role="2Ucebj" value="3hFcliemXee/Flower" />
      <property role="2Uceb3" value="100" />
      <property role="2Ucebe" value="Flow-Li-1" />
    </node>
    <node concept="2Ucebg" id="1DBpVrqpNxq" role="2Uceba">
      <property role="TrG5h" value="Lemon" />
      <property role="2Ucebj" value="3hFcliemXeb/Fruit" />
      <property role="2Uceb3" value="300" />
      <property role="2Ucebe" value="Fru-Lem-1" />
    </node>
    <node concept="2UcebP" id="1DBpVrqpMWK" role="rdi_B">
      <property role="TrG5h" value="Aquila-IoT1" />
      <property role="2UcebK" value="1.0.0" />
      <node concept="3jxssy" id="1DBpVrqpMXa" role="3jyJH3">
        <property role="TrG5h" value="NutriMoniteringSystem" />
        <property role="3jxssX" value="6wjSgQV_yoN/Nutrient" />
        <property role="3jxssQ" value="6wjSgQV_yp3/Good" />
        <property role="3jxsj6" value="AQNutMon1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-aq/monitor/nutrient" />
        <ref role="2c$C2p" node="1DBpVrqpMXu" resolve="NutriControllingSystem" />
        <node concept="2c$C2R" id="1DBpVrqpMXc" role="2c$Cth">
          <ref role="2c$C2O" node="1DBpVrqpMXg" resolve="NutSensor1" />
        </node>
      </node>
      <node concept="3jxssd" id="1DBpVrqpMXu" role="3jyJH3">
        <property role="TrG5h" value="NutriControllingSystem" />
        <property role="3jxssc" value="6wjSgQV_yo6/Nutrient" />
        <property role="3jxssl" value="6wjSgQV_yoD/Alert" />
        <property role="3jxsj6" value="AQNutCon1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-aq/control/nutrient" />
        <node concept="2c$Cti" id="1DBpVrqpMXw" role="2c$Ctk">
          <ref role="2c$Ctj" node="1DBpVrqpMXm" resolve="NutActuator1" />
        </node>
      </node>
      <node concept="3jxsji" id="1DBpVrqpNx6" role="3jyJH3">
        <property role="TrG5h" value="Harvest" />
        <property role="3jxsj$" value="6wjSgQV_ynx/Harvesting" />
        <property role="3jxsjA" value="Data-AQ-Harvest.db" />
        <property role="3jxsjz" value="6wjSgQV_ynR/BarChart" />
        <property role="3jxsj6" value="AQHarAnl1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-aq/analytic/harvest" />
      </node>
      <node concept="2vP4MN" id="1DBpVrqpMXg" role="2vQXNg">
        <property role="TrG5h" value="NutSensor1" />
        <property role="2vPug8" value="4NgPXVj1epQ/Nutrients" />
        <property role="2vPuUM" value="4NgPXVj1iyF/Passive" />
        <property role="2vPuzt" value="mS/cm" />
        <property role="2vPuzp" value="1.3" />
        <property role="2vPbD0" value="NutAQSen1" />
        <property role="2vPa0i" value="19.24.33.10" />
        <property role="2vPaGV" value="Krohne" />
        <ref role="1CVfQk" node="1DBpVrqpMWO" resolve="Protocol-MQTT" />
      </node>
      <node concept="2vPoOI" id="1DBpVrqpMXm" role="2vQXNg">
        <property role="TrG5h" value="NutActuator1" />
        <property role="2vPmW3" value="4NgPXVj1plr/NutrientController" />
        <property role="2vPbD0" value="NutAQAct1" />
        <property role="2vPa0i" value="19.10.25.20" />
        <property role="2vPaGV" value="ElectroCraft" />
        <ref role="1CVfQa" node="1DBpVrqpMWO" resolve="Protocol-MQTT" />
      </node>
      <node concept="rcRW2" id="1DBpVrqpMWN" role="2vQWWP">
        <property role="TrG5h" value="MQTT-Gateway" />
        <property role="rcRW7" value="MQAQGate1" />
        <property role="rcRVT" value="MQ123" />
        <node concept="rcRVU" id="1DBpVrqpMWO" role="rcRVi">
          <property role="rcRVg" value="7n7Lv_IXbG8/MQTT" />
          <property role="TrG5h" value="Protocol-MQTT" />
        </node>
        <node concept="2c$XK2" id="1DBpVrqpOHi" role="2c$C2e">
          <ref role="2c$XK3" node="1DBpVrqpMXg" resolve="NutSensor1" />
        </node>
        <node concept="2c$XK2" id="1DBpVrqpOHm" role="2c$C2e">
          <ref role="2c$XK3" node="1DBpVrqpMXm" resolve="NutActuator1" />
        </node>
      </node>
    </node>
  </node>
  <node concept="1Ih$tg" id="1DBpVrqpNxu">
    <property role="TrG5h" value="Farm_Lappeenranta" />
    <property role="2Uce8N" value="Lappeenranta" />
    <property role="2Uce8X" value="28" />
    <node concept="2Uce8S" id="1DBpVrqpNxv" role="2Uce8E">
      <property role="TrG5h" value="Haben" />
      <property role="2Uce8V" value="FLap1" />
      <property role="2Uce8_" value="checkhaben@gmail.com" />
      <property role="2Uce8w" value="3519521535" />
      <node concept="2c$C2m" id="1DBpVrqpOI0" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpOHt" resolve="TemperatureControllingSystem" />
      </node>
    </node>
    <node concept="2Uce8S" id="1DBpVrqpOI2" role="2Uce8E">
      <property role="TrG5h" value="Ram" />
      <property role="2Uce8V" value="FLap2" />
      <property role="2Uce8_" value="ram.gurung1990@gmail.com" />
      <property role="2Uce8w" value="3518214426" />
      <node concept="2c$C2m" id="1DBpVrqpOI6" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpNxB" resolve="TemperatureMoniteringSystem" />
      </node>
    </node>
    <node concept="2Uce8S" id="1DBpVrqpOI8" role="2Uce8E">
      <property role="TrG5h" value="Mohammad" />
      <property role="2Uce8V" value="FLap3" />
      <property role="2Uce8_" value="mohammad.rijal13@gmail.com" />
      <property role="2Uce8w" value="3337688713" />
      <node concept="2c$C2m" id="1DBpVrqpOIe" role="2c$C3$">
        <ref role="2c$C2n" node="1DBpVrqpOHF" resolve="Seed" />
      </node>
    </node>
    <node concept="2Ucebg" id="1DBpVrqpNxw" role="2Uceba">
      <property role="TrG5h" value="Mushroom" />
      <property role="2Ucebj" value="3hFcliemXea/Vegetable" />
      <property role="2Uceb3" value="40" />
      <property role="2Ucebe" value="Veg-Mus-1" />
    </node>
    <node concept="2Ucebg" id="1DBpVrqpOIg" role="2Uceba">
      <property role="TrG5h" value="Rose" />
      <property role="2Ucebj" value="3hFcliemXee/Flower" />
      <property role="2Uceb3" value="100" />
      <property role="2Ucebe" value="Flo-Ros-1" />
    </node>
    <node concept="2Ucebg" id="1DBpVrqpOIj" role="2Uceba">
      <property role="TrG5h" value="Orange" />
      <property role="2Ucebj" value="3hFcliemXeb/Fruit" />
      <property role="2Uceb3" value="1500" />
      <property role="2Ucebe" value="Fru-Or-1" />
    </node>
    <node concept="2UcebP" id="1DBpVrqpNxx" role="rdi_B">
      <property role="TrG5h" value="Lappeenranta-IoT1" />
      <property role="2UcebK" value="1.0.0" />
      <node concept="3jxssy" id="1DBpVrqpNxB" role="3jyJH3">
        <property role="TrG5h" value="TemperatureMoniteringSystem" />
        <property role="3jxssX" value="6wjSgQV_yoR/EnvironemtalSafety" />
        <property role="3jxssQ" value="6wjSgQV_yp0/Health" />
        <property role="3jxsj6" value="LAPSafMon1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-lap/monitor/temperature" />
        <ref role="2c$C2p" node="1DBpVrqpOHt" resolve="TemperatureControllingSystem" />
        <node concept="2c$C2R" id="1DBpVrqpNxD" role="2c$Cth">
          <ref role="2c$C2O" node="1DBpVrqpOHQ" resolve="TempSensor1" />
        </node>
      </node>
      <node concept="3jxssd" id="1DBpVrqpOHt" role="3jyJH3">
        <property role="TrG5h" value="TemperatureControllingSystem" />
        <property role="3jxssc" value="6wjSgQV_yo5/AirConditioner" />
        <property role="3jxssl" value="6wjSgQV_yoD/Alert" />
        <property role="3jxsj6" value="LapTempCont1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-lap/control/temperature" />
        <node concept="2c$Cti" id="1DBpVrqpOHv" role="2c$Ctk">
          <ref role="2c$Ctj" node="1DBpVrqpOHW" resolve="TempActuator1" />
        </node>
      </node>
      <node concept="3jxsji" id="1DBpVrqpOHF" role="3jyJH3">
        <property role="TrG5h" value="Seed" />
        <property role="3jxsj$" value="6wjSgQV_yny/Seeding" />
        <property role="3jxsjA" value="Data-Lap-seeding.db" />
        <property role="3jxsjz" value="6wjSgQV_ynO/PieChart" />
        <property role="3jxsj6" value="LapSeedAnl1" />
        <property role="3jxsjt" value="localhost" />
        <property role="3jxsjp" value="farm://service-lap/analytic/seed" />
      </node>
      <node concept="2vP4MN" id="1DBpVrqpOHQ" role="2vQXNg">
        <property role="TrG5h" value="TempSensor1" />
        <property role="2vPug8" value="4NgPXVj1bmJ/Temperature" />
        <property role="2vPuUM" value="4NgPXVj1g6u/Active" />
        <property role="2vPuzt" value="celsius" />
        <property role="2vPuzp" value="24.0" />
        <property role="2vPbD0" value="TempLapSen1" />
        <property role="2vPa0i" value="12.23.11.2" />
        <property role="2vPaGV" value="Aquara" />
        <ref role="1CVfQk" node="1DBpVrqpNx_" resolve="Zigbee" />
      </node>
      <node concept="2vPoOI" id="1DBpVrqpOHW" role="2vQXNg">
        <property role="TrG5h" value="TempActuator1" />
        <property role="2vPmW3" value="4NgPXVj1n7E/AirConditioner" />
        <property role="2vPbD0" value="TempLapAct1" />
        <property role="2vPa0i" value="12.24.13.1" />
        <property role="2vPaGV" value="Netatmo" />
        <ref role="1CVfQa" node="1DBpVrqpNx_" resolve="Zigbee" />
      </node>
      <node concept="rcRW2" id="1DBpVrqpNx$" role="2vQWWP">
        <property role="TrG5h" value="Zigbee-Gateway" />
        <property role="rcRW7" value="ZigbeeLapGat1" />
        <property role="rcRVT" value="ZIG256" />
        <node concept="rcRVU" id="1DBpVrqpNx_" role="rcRVi">
          <property role="TrG5h" value="Zigbee" />
          <property role="rcRVg" value="7n7Lv_IXbG7/ZigBee" />
        </node>
        <node concept="2c$XK2" id="1DBpVrqpNxA" role="2c$C2e">
          <ref role="2c$XK3" node="1DBpVrqpOHW" resolve="TempActuator1" />
        </node>
        <node concept="2c$XK2" id="1DBpVrqpOIn" role="2c$C2e">
          <ref role="2c$XK3" node="1DBpVrqpOHQ" resolve="TempSensor1" />
        </node>
      </node>
    </node>
  </node>
</model>

