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
      <concept id="3777166951715689377" name="SmartFarming.structure.IoTSystem" flags="ng" index="2UcebP">
        <property id="3777166951715689380" name="Version" index="2UcebK" />
      </concept>
      <concept id="779579670203455684" name="SmartFarming.structure.Farm" flags="ng" index="1Ih$tg">
        <property id="3777166951715689319" name="Location" index="2Uce8N" />
        <property id="3777166951715689321" name="Size" index="2Uce8X" />
        <child id="8486969697901931678" name="IoTSystems" index="rdi_B" />
      </concept>
    </language>
  </registry>
  <node concept="1Ih$tg" id="6LCgsI8h_5w">
    <property role="TrG5h" value="Haha" />
    <property role="2Uce8N" value="Tasikmalaya" />
    <property role="2Uce8X" value="12000" />
    <node concept="2UcebP" id="6LCgsI8h_5z" role="rdi_B">
      <property role="TrG5h" value="IoT1" />
      <property role="2UcebK" value="12.0.1" />
    </node>
  </node>
</model>

