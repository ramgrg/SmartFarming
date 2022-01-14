<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765907488" name="conceptShortDescription" index="R4oN_" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1083243159079" name="jetbrains.mps.lang.structure.structure.PrimitiveDataTypeDeclaration" flags="ng" index="QkHVr" />
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="FhBTh$_Xz4">
    <property role="EcuMT" value="779579670203455684" />
    <property role="TrG5h" value="Farm" />
    <property role="19KtqR" value="true" />
    <property role="R4oN_" value="Farm represents a controlled-environment farm where it powered by IoT System. It is root of the system. " />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="FhBTh$_Xza" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdB" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689319" />
      <property role="TrG5h" value="Location" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdD" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689321" />
      <property role="TrG5h" value="Size" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyj" id="3hFcliemXdY" role="1TKVEi">
      <property role="IQ2ns" value="3777166951715689342" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Farmers" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="3hFcliemXdG" resolve="Farmer" />
    </node>
    <node concept="1TJgyj" id="3hFcliemXeu" role="1TKVEi">
      <property role="IQ2ns" value="3777166951715689374" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Crops" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="3hFcliemXe4" resolve="Crop" />
    </node>
    <node concept="1TJgyj" id="7n7Lv_IWIMu" role="1TKVEi">
      <property role="IQ2ns" value="8486969697901931678" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="IoTSystems" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="3hFcliemXex" resolve="IoTSystem" />
    </node>
  </node>
  <node concept="1TIwiD" id="3hFcliemXdG">
    <property role="EcuMT" value="3777166951715689324" />
    <property role="TrG5h" value="Farmer" />
    <property role="R4oN_" value="Farmer represents the person that operates smart farming system. " />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="3hFcliemXdH" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdJ" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689327" />
      <property role="TrG5h" value="FarmerID" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdL" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689329" />
      <property role="TrG5h" value="Email" />
      <ref role="AX2Wp" node="3hFcliemXdT" resolve="Email" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdO" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689332" />
      <property role="TrG5h" value="PhoneNumber" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="51oAUbsMxH6" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776012614" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Services" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="51oAUbsMxGO" resolve="ServiceReference" />
    </node>
  </node>
  <node concept="QkHVr" id="3hFcliemXdS">
    <property role="3F6X1D" value="3777166951715689336" />
    <property role="TrG5h" value="double" />
    <property role="3GE5qa" value="DataType" />
  </node>
  <node concept="QkHVr" id="3hFcliemXdT">
    <property role="3F6X1D" value="3777166951715689337" />
    <property role="TrG5h" value="Email" />
    <property role="3GE5qa" value="DataType" />
  </node>
  <node concept="1TIwiD" id="3hFcliemXe4">
    <property role="EcuMT" value="3777166951715689348" />
    <property role="TrG5h" value="Crop" />
    <property role="R4oN_" value="Crop represents the crop in smart farming system. " />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="3hFcliemXe5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXe7" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689351" />
      <property role="TrG5h" value="Group" />
      <ref role="AX2Wp" node="3hFcliemXe9" resolve="CropGroup" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXen" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689367" />
      <property role="TrG5h" value="GrowthDuration" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXeq" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689370" />
      <property role="TrG5h" value="SeedCode" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="25R3W" id="3hFcliemXe9">
    <property role="3F6X1D" value="3777166951715689353" />
    <property role="TrG5h" value="CropGroup" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="3hFcliemXea" role="25R1y">
      <property role="3tVfz5" value="3777166951715689354" />
      <property role="TrG5h" value="Vegetable" />
    </node>
    <node concept="25R33" id="3hFcliemXeb" role="25R1y">
      <property role="3tVfz5" value="3777166951715689355" />
      <property role="TrG5h" value="Fruit" />
    </node>
    <node concept="25R33" id="3hFcliemXee" role="25R1y">
      <property role="3tVfz5" value="3777166951715689358" />
      <property role="TrG5h" value="Flower" />
    </node>
    <node concept="25R33" id="3hFcliemXei" role="25R1y">
      <property role="3tVfz5" value="3777166951715689362" />
      <property role="TrG5h" value="Tuber" />
    </node>
  </node>
  <node concept="1TIwiD" id="3hFcliemXex">
    <property role="EcuMT" value="3777166951715689377" />
    <property role="TrG5h" value="IoTSystem" />
    <property role="R4oN_" value="IoT System represents the system powered by IoT that manage farm." />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="3hFcliemXey" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXe$" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689380" />
      <property role="TrG5h" value="Version" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="6wjSgQVAhDe" role="1TKVEi">
      <property role="IQ2ns" value="7499585253600205390" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Services" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="6wjSgQV_yn4" resolve="Service" />
    </node>
    <node concept="1TJgyj" id="4NgPXVj2KGe" role="1TKVEi">
      <property role="IQ2ns" value="5535161294061767438" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Devices" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="4NgPXVj14iT" resolve="Device" />
    </node>
    <node concept="1TJgyj" id="4NgPXVj2LzF" role="1TKVEi">
      <property role="IQ2ns" value="5535161294061770987" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Gateways" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7n7Lv_IXbFV" resolve="Gateway" />
    </node>
  </node>
  <node concept="1TIwiD" id="7n7Lv_IXbFV">
    <property role="EcuMT" value="8486969697902050043" />
    <property role="TrG5h" value="Gateway" />
    <property role="R4oN_" value="Gateway represent gateway in IoT System" />
    <property role="3GE5qa" value="Gateway" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="7n7Lv_IXbFW" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7n7Lv_IXbFY" role="1TKVEl">
      <property role="IQ2nx" value="8486969697902050046" />
      <property role="TrG5h" value="GatewayID" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="7n7Lv_IXbG0" role="1TKVEl">
      <property role="IQ2nx" value="8486969697902050048" />
      <property role="TrG5h" value="Model" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="7n7Lv_IXbGF" role="1TKVEi">
      <property role="IQ2ns" value="8486969697902050091" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Protocols" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7n7Lv_IXbG3" resolve="CommunicationProtocol" />
    </node>
    <node concept="1TJgyj" id="51oAUbsMxGG" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776012588" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Devices" />
      <ref role="20lvS9" node="51oAUbsMOuw" resolve="DeviceReference" />
    </node>
  </node>
  <node concept="1TIwiD" id="7n7Lv_IXbG3">
    <property role="EcuMT" value="8486969697902050051" />
    <property role="TrG5h" value="CommunicationProtocol" />
    <property role="3GE5qa" value="Gateway" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="7n7Lv_IXbG4" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="7n7Lv_IXbGD" role="1TKVEl">
      <property role="IQ2nx" value="8486969697902050089" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="7n7Lv_IXbG6" resolve="CommunicationType" />
    </node>
  </node>
  <node concept="25R3W" id="7n7Lv_IXbG6">
    <property role="3F6X1D" value="8486969697902050054" />
    <property role="TrG5h" value="CommunicationType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="7n7Lv_IXbG7" role="25R1y">
      <property role="3tVfz5" value="8486969697902050055" />
      <property role="TrG5h" value="ZigBee" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbG8" role="25R1y">
      <property role="3tVfz5" value="8486969697902050056" />
      <property role="TrG5h" value="MQTT" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbGb" role="25R1y">
      <property role="3tVfz5" value="8486969697902050059" />
      <property role="TrG5h" value="CoAP" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbGf" role="25R1y">
      <property role="3tVfz5" value="8486969697902050063" />
      <property role="TrG5h" value="HTTP" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbGk" role="25R1y">
      <property role="3tVfz5" value="8486969697902050068" />
      <property role="TrG5h" value="WiFi" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbGq" role="25R1y">
      <property role="3tVfz5" value="8486969697902050074" />
      <property role="TrG5h" value="Bluetooth" />
    </node>
    <node concept="25R33" id="7n7Lv_IXbGx" role="25R1y">
      <property role="3tVfz5" value="8486969697902050081" />
      <property role="TrG5h" value="ZWave" />
    </node>
  </node>
  <node concept="1TIwiD" id="6wjSgQV_yn4">
    <property role="EcuMT" value="7499585253600011716" />
    <property role="TrG5h" value="Service" />
    <property role="R5$K7" value="true" />
    <property role="3GE5qa" value="Service" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="PrWs8" id="6wjSgQV_yn5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_ynb" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011723" />
      <property role="TrG5h" value="ServiceID" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_ynd" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011725" />
      <property role="TrG5h" value="ServiceName" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_yng" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011728" />
      <property role="TrG5h" value="Host" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_ynk" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011732" />
      <property role="TrG5h" value="URI" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="6wjSgQV_ynv">
    <property role="EcuMT" value="7499585253600011743" />
    <property role="TrG5h" value="AnalyticsSystem" />
    <property role="3GE5qa" value="Service" />
    <ref role="1TJDcQ" node="6wjSgQV_yn4" resolve="Service" />
    <node concept="1TJgyi" id="6wjSgQV_ynD" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011753" />
      <property role="TrG5h" value="AnalyticsType" />
      <ref role="AX2Wp" node="6wjSgQV_ynw" resolve="AnalyticType" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_ynF" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011755" />
      <property role="TrG5h" value="DataSource" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_ynI" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011758" />
      <property role="TrG5h" value="OutputType" />
      <ref role="AX2Wp" node="6wjSgQV_ynM" resolve="OutputType" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_ynw">
    <property role="3F6X1D" value="7499585253600011744" />
    <property role="TrG5h" value="AnalyticType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_ynx" role="25R1y">
      <property role="3tVfz5" value="7499585253600011745" />
      <property role="TrG5h" value="Harvesting" />
    </node>
    <node concept="25R33" id="6wjSgQV_yny" role="25R1y">
      <property role="3tVfz5" value="7499585253600011746" />
      <property role="TrG5h" value="Seeding" />
    </node>
    <node concept="25R33" id="6wjSgQV_yn_" role="25R1y">
      <property role="3tVfz5" value="7499585253600011749" />
      <property role="TrG5h" value="Resource" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_ynM">
    <property role="3F6X1D" value="7499585253600011762" />
    <property role="TrG5h" value="OutputType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_ynN" role="25R1y">
      <property role="3tVfz5" value="7499585253600011763" />
      <property role="TrG5h" value="LineGraph" />
    </node>
    <node concept="25R33" id="6wjSgQV_ynO" role="25R1y">
      <property role="3tVfz5" value="7499585253600011764" />
      <property role="TrG5h" value="PieChart" />
    </node>
    <node concept="25R33" id="6wjSgQV_ynR" role="25R1y">
      <property role="3tVfz5" value="7499585253600011767" />
      <property role="TrG5h" value="BarChart" />
    </node>
    <node concept="25R33" id="6wjSgQV_ynV" role="25R1y">
      <property role="3tVfz5" value="7499585253600011771" />
      <property role="TrG5h" value="Tabular" />
    </node>
  </node>
  <node concept="1TIwiD" id="6wjSgQV_yo0">
    <property role="EcuMT" value="7499585253600011776" />
    <property role="TrG5h" value="ControlSystem" />
    <property role="3GE5qa" value="Service" />
    <ref role="1TJDcQ" node="6wjSgQV_yn4" resolve="Service" />
    <node concept="1TJgyi" id="6wjSgQV_yo1" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011777" />
      <property role="TrG5h" value="ControlType" />
      <ref role="AX2Wp" node="6wjSgQV_yo4" resolve="ControlType" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_yoo" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011800" />
      <property role="TrG5h" value="Actions" />
      <ref role="AX2Wp" node="6wjSgQV_yor" resolve="Actions" />
    </node>
    <node concept="1TJgyj" id="51oAUbsMxNQ" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776013046" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Actuators" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="51oAUbsMxNK" resolve="ActuatorReference" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_yo4">
    <property role="3F6X1D" value="7499585253600011780" />
    <property role="TrG5h" value="ControlType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_yo5" role="25R1y">
      <property role="3tVfz5" value="7499585253600011781" />
      <property role="TrG5h" value="AirConditioner" />
    </node>
    <node concept="25R33" id="6wjSgQV_yo6" role="25R1y">
      <property role="3tVfz5" value="7499585253600011782" />
      <property role="TrG5h" value="Nutrient" />
    </node>
    <node concept="25R33" id="6wjSgQV_yo9" role="25R1y">
      <property role="3tVfz5" value="7499585253600011785" />
      <property role="TrG5h" value="Light" />
    </node>
    <node concept="25R33" id="6wjSgQV_yod" role="25R1y">
      <property role="3tVfz5" value="7499585253600011789" />
      <property role="TrG5h" value="Oxygen" />
    </node>
    <node concept="25R33" id="6wjSgQV_yoi" role="25R1y">
      <property role="3tVfz5" value="7499585253600011794" />
      <property role="TrG5h" value="CO2" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_yor">
    <property role="3F6X1D" value="7499585253600011803" />
    <property role="TrG5h" value="ControlActions" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_yos" role="25R1y">
      <property role="3tVfz5" value="7499585253600011804" />
      <property role="TrG5h" value="Increase" />
    </node>
    <node concept="25R33" id="6wjSgQV_yot" role="25R1y">
      <property role="3tVfz5" value="7499585253600011805" />
      <property role="TrG5h" value="Decrease" />
    </node>
    <node concept="25R33" id="6wjSgQV_yow" role="25R1y">
      <property role="3tVfz5" value="7499585253600011808" />
      <property role="TrG5h" value="ON" />
    </node>
    <node concept="25R33" id="6wjSgQV_yo$" role="25R1y">
      <property role="3tVfz5" value="7499585253600011812" />
      <property role="TrG5h" value="OFF" />
    </node>
    <node concept="25R33" id="6wjSgQV_yoD" role="25R1y">
      <property role="3tVfz5" value="7499585253600011817" />
      <property role="TrG5h" value="Alert" />
    </node>
  </node>
  <node concept="1TIwiD" id="6wjSgQV_yoJ">
    <property role="EcuMT" value="7499585253600011823" />
    <property role="TrG5h" value="MonitoringSystem" />
    <property role="3GE5qa" value="Service" />
    <ref role="1TJDcQ" node="6wjSgQV_yn4" resolve="Service" />
    <node concept="1TJgyi" id="6wjSgQV_yoK" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011824" />
      <property role="TrG5h" value="Metrics" />
      <ref role="AX2Wp" node="6wjSgQV_yoM" resolve="Metrics" />
    </node>
    <node concept="1TJgyi" id="6wjSgQV_yoV" role="1TKVEl">
      <property role="IQ2nx" value="7499585253600011835" />
      <property role="TrG5h" value="Condition" />
      <ref role="AX2Wp" node="6wjSgQV_yoY" resolve="Conditions" />
    </node>
    <node concept="1TJgyj" id="51oAUbsMxGV" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776012603" />
      <property role="20kJfa" value="Trigger" />
      <ref role="20lvS9" node="6wjSgQV_yo0" resolve="ControlSystem" />
    </node>
    <node concept="1TJgyj" id="51oAUbsMxNN" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776013043" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="Sensors" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="51oAUbsMxGl" resolve="SensorReference" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_yoM">
    <property role="3F6X1D" value="7499585253600011826" />
    <property role="TrG5h" value="MonitoringMetrics" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_yoN" role="25R1y">
      <property role="3tVfz5" value="7499585253600011827" />
      <property role="TrG5h" value="Nutrient" />
    </node>
    <node concept="25R33" id="6wjSgQV_yoO" role="25R1y">
      <property role="3tVfz5" value="7499585253600011828" />
      <property role="TrG5h" value="PhotoSynthesis" />
    </node>
    <node concept="25R33" id="6wjSgQV_yoR" role="25R1y">
      <property role="3tVfz5" value="7499585253600011831" />
      <property role="TrG5h" value="EnvironemtalSafety" />
    </node>
  </node>
  <node concept="25R3W" id="6wjSgQV_yoY">
    <property role="3F6X1D" value="7499585253600011838" />
    <property role="TrG5h" value="MonitoringConditions" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="6wjSgQV_yoZ" role="25R1y">
      <property role="3tVfz5" value="7499585253600011839" />
      <property role="TrG5h" value="Optimum" />
    </node>
    <node concept="25R33" id="6wjSgQV_yp0" role="25R1y">
      <property role="3tVfz5" value="7499585253600011840" />
      <property role="TrG5h" value="Health" />
    </node>
    <node concept="25R33" id="6wjSgQV_yp3" role="25R1y">
      <property role="3tVfz5" value="7499585253600011843" />
      <property role="TrG5h" value="Good" />
    </node>
    <node concept="25R33" id="6wjSgQV_yp7" role="25R1y">
      <property role="3tVfz5" value="7499585253600011847" />
      <property role="TrG5h" value="Warning" />
    </node>
    <node concept="25R33" id="6wjSgQV_ypc" role="25R1y">
      <property role="3tVfz5" value="7499585253600011852" />
      <property role="TrG5h" value="Danger" />
    </node>
  </node>
  <node concept="1TIwiD" id="4NgPXVj14iT">
    <property role="EcuMT" value="5535161294061323449" />
    <property role="TrG5h" value="Device" />
    <property role="R5$K7" value="true" />
    <property role="R4oN_" value="It is the abstract metamodel for Devices " />
    <property role="3GE5qa" value="Device" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyi" id="4NgPXVj16Qu" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061333918" />
      <property role="TrG5h" value="DeviceID" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4NgPXVj17vc" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061336524" />
      <property role="TrG5h" value="IPAddress" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4NgPXVj17N_" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061337829" />
      <property role="TrG5h" value="Manufacturer" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="4NgPXVj19HH">
    <property role="EcuMT" value="5535161294061345645" />
    <property role="TrG5h" value="Sensor" />
    <property role="R4oN_" value="Sensor defines all the sensor that will be used in the system " />
    <property role="3GE5qa" value="Device" />
    <ref role="1TJDcQ" node="4NgPXVj14iT" resolve="Device" />
    <node concept="1TJgyi" id="4NgPXVj1jfm" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061384662" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="4NgPXVj1bmI" resolve="SensorType" />
    </node>
    <node concept="1TJgyi" id="4NgPXVj1j_G" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061386092" />
      <property role="TrG5h" value="State" />
      <ref role="AX2Wp" node="4NgPXVj1g6t" resolve="SensorState" />
    </node>
    <node concept="1TJgyi" id="4NgPXVj1jW3" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061387523" />
      <property role="TrG5h" value="Unit" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="4NgPXVj1jW7" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061387527" />
      <property role="TrG5h" value="Value" />
      <ref role="AX2Wp" node="3hFcliemXdS" resolve="double" />
    </node>
    <node concept="PrWs8" id="4NgPXVj1E8H" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="25R3W" id="4NgPXVj1bmI">
    <property role="3F6X1D" value="5535161294061352366" />
    <property role="TrG5h" value="SensorType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="4NgPXVj1bmJ" role="25R1y">
      <property role="3tVfz5" value="5535161294061352367" />
      <property role="TrG5h" value="Temperature" />
    </node>
    <node concept="25R33" id="4NgPXVj1doG" role="25R1y">
      <property role="3tVfz5" value="5535161294061360684" />
      <property role="TrG5h" value="Humidity" />
    </node>
    <node concept="25R33" id="4NgPXVj1e43" role="25R1y">
      <property role="3tVfz5" value="5535161294061363459" />
      <property role="TrG5h" value="CO2" />
    </node>
    <node concept="25R33" id="4NgPXVj1epL" role="25R1y">
      <property role="3tVfz5" value="5535161294061364849" />
      <property role="TrG5h" value="O2" />
    </node>
    <node concept="25R33" id="4NgPXVj1epQ" role="25R1y">
      <property role="3tVfz5" value="5535161294061364854" />
      <property role="TrG5h" value="Nutrients" />
    </node>
    <node concept="25R33" id="4NgPXVj1f5g" role="25R1y">
      <property role="3tVfz5" value="5535161294061367632" />
      <property role="TrG5h" value="Light" />
    </node>
    <node concept="25R33" id="4NgPXVj1fr1" role="25R1y">
      <property role="3tVfz5" value="5535161294061369025" />
      <property role="TrG5h" value="Surveillance" />
    </node>
  </node>
  <node concept="25R3W" id="4NgPXVj1g6t">
    <property role="3F6X1D" value="5535161294061371805" />
    <property role="TrG5h" value="SensorState" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="4NgPXVj1g6u" role="25R1y">
      <property role="3tVfz5" value="5535161294061371806" />
      <property role="TrG5h" value="Active" />
    </node>
    <node concept="25R33" id="4NgPXVj1iyF" role="25R1y">
      <property role="3tVfz5" value="5535161294061381803" />
      <property role="TrG5h" value="Passive" />
    </node>
  </node>
  <node concept="1TIwiD" id="4NgPXVj1lFK">
    <property role="EcuMT" value="5535161294061394672" />
    <property role="TrG5h" value="Actuator" />
    <property role="3GE5qa" value="Device" />
    <ref role="1TJDcQ" node="4NgPXVj14iT" resolve="Device" />
    <node concept="1TJgyi" id="4NgPXVj1rzt" role="1TKVEl">
      <property role="IQ2nx" value="5535161294061418717" />
      <property role="TrG5h" value="Type" />
      <ref role="AX2Wp" node="4NgPXVj1n7D" resolve="ActuatorType" />
    </node>
    <node concept="PrWs8" id="4NgPXVj1ETj" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="25R3W" id="4NgPXVj1n7D">
    <property role="3F6X1D" value="5535161294061400553" />
    <property role="TrG5h" value="ActuatorType" />
    <property role="3GE5qa" value="Enumerations" />
    <node concept="25R33" id="4NgPXVj1n7E" role="25R1y">
      <property role="3tVfz5" value="5535161294061400554" />
      <property role="TrG5h" value="AirConditioner" />
    </node>
    <node concept="25R33" id="4NgPXVj1plr" role="25R1y">
      <property role="3tVfz5" value="5535161294061409627" />
      <property role="TrG5h" value="NutrientController" />
    </node>
    <node concept="25R33" id="4NgPXVj1pH6" role="25R1y">
      <property role="3tVfz5" value="5535161294061411142" />
      <property role="TrG5h" value="LEDController" />
    </node>
    <node concept="25R33" id="4NgPXVj1q4M" role="25R1y">
      <property role="3tVfz5" value="5535161294061412658" />
      <property role="TrG5h" value="OxygenController" />
    </node>
    <node concept="25R33" id="4NgPXVj1qsv" role="25R1y">
      <property role="3tVfz5" value="5535161294061414175" />
      <property role="TrG5h" value="CarbondioxideController" />
    </node>
  </node>
  <node concept="1TIwiD" id="51oAUbsMxGl">
    <property role="EcuMT" value="5789548444776012565" />
    <property role="3GE5qa" value="Device" />
    <property role="TrG5h" value="SensorReference" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="51oAUbsMxGm" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776012566" />
      <property role="20kJfa" value="Uses" />
      <ref role="20lvS9" node="4NgPXVj19HH" resolve="Sensor" />
    </node>
  </node>
  <node concept="1TIwiD" id="51oAUbsMxGO">
    <property role="EcuMT" value="5789548444776012596" />
    <property role="3GE5qa" value="Service" />
    <property role="TrG5h" value="ServiceReference" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="51oAUbsMxGP" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776012597" />
      <property role="20kJfa" value="Operates" />
      <ref role="20lvS9" node="6wjSgQV_yn4" resolve="Service" />
    </node>
  </node>
  <node concept="1TIwiD" id="51oAUbsMxNK">
    <property role="EcuMT" value="5789548444776013040" />
    <property role="3GE5qa" value="Device" />
    <property role="TrG5h" value="ActuatorReference" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="51oAUbsMxNL" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776013041" />
      <property role="20kJfa" value="Uses" />
      <ref role="20lvS9" node="4NgPXVj1lFK" resolve="Actuator" />
    </node>
  </node>
  <node concept="1TIwiD" id="51oAUbsMOuw">
    <property role="EcuMT" value="5789548444776089504" />
    <property role="3GE5qa" value="Device" />
    <property role="TrG5h" value="DeviceReference" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="51oAUbsMOux" role="1TKVEi">
      <property role="IQ2ns" value="5789548444776089505" />
      <property role="20kJfa" value="Manages" />
      <ref role="20lvS9" node="4NgPXVj14iT" resolve="Device" />
    </node>
  </node>
</model>

