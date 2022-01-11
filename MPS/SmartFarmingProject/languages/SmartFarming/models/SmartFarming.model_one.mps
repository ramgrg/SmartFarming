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
      <concept id="3777166951715689324" name="SmartFarming.structure.Farmer" flags="ng" index="2Uce8S">
        <property id="3777166951715689332" name="PhoneNumber" index="2Uce8w" />
        <property id="3777166951715689327" name="FarmerID" index="2Uce8V" />
      </concept>
      <concept id="3777166951715689348" name="SmartFarming.structure.Crop" flags="ng" index="2Ucebg">
        <property id="3777166951715689367" name="growth_duration" index="2Uceb3" />
        <property id="3777166951715689370" name="seed_code" index="2Ucebe" />
        <property id="3777166951715689351" name="group" index="2Ucebj" />
      </concept>
      <concept id="779579670203455684" name="SmartFarming.structure.Farm" flags="ng" index="1Ih$tg">
        <property id="3777166951715689319" name="location" index="2Uce8N" />
        <property id="3777166951715689321" name="size" index="2Uce8X" />
        <child id="3777166951715689342" name="Farmers" index="2Uce8E" />
        <child id="3777166951715689374" name="Crops" index="2Uceba" />
      </concept>
    </language>
  </registry>
  <node concept="1Ih$tg" id="3hFclienkN0">
    <property role="TrG5h" value="Monster" />
    <property role="2Uce8N" value="Haha" />
    <property role="2Uce8X" value="10" />
    <node concept="2Uce8S" id="3hFclienkN1" role="2Uce8E">
      <property role="TrG5h" value="Haben" />
      <property role="2Uce8V" value="1234" />
      <property role="2Uce8w" value="08123" />
    </node>
    <node concept="2Uce8S" id="3hFclienqsY" role="2Uce8E">
      <property role="TrG5h" value="Mo" />
      <property role="2Uce8V" value="hahaha" />
      <property role="2Uce8w" value="12345" />
    </node>
    <node concept="2Ucebg" id="3hFclienkN2" role="2Uceba">
      <property role="2Uceb3" value="120" />
      <property role="2Ucebe" value="01234" />
      <property role="2Ucebj" value="3hFcliemXea/Vegetable" />
      <property role="TrG5h" value="Potato" />
    </node>
    <node concept="2Ucebg" id="3hFclienteS" role="2Uceba">
      <property role="TrG5h" value="tomato" />
    </node>
    <node concept="2Ucebg" id="3hFclienyqo" role="2Uceba" />
  </node>
</model>

