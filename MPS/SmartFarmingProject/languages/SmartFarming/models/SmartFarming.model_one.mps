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
      <concept id="3777166951715689324" name="SmartFarming.structure.Farmer" flags="ng" index="2Uce8S" />
      <concept id="3777166951715689348" name="SmartFarming.structure.Crop" flags="ng" index="2Ucebg" />
      <concept id="3777166951715689377" name="SmartFarming.structure.IoTSystem" flags="ng" index="2UcebP">
        <child id="7499585253600205390" name="services" index="3jyJH3" />
      </concept>
      <concept id="7499585253600011743" name="SmartFarming.structure.Analytics" flags="ng" index="3jxsji" />
      <concept id="7499585253600011776" name="SmartFarming.structure.ControlSystem" flags="ng" index="3jxssd" />
      <concept id="7499585253600011823" name="SmartFarming.structure.MonitoringSystem" flags="ng" index="3jxssy" />
      <concept id="779579670203455684" name="SmartFarming.structure.Farm" flags="ng" index="1Ih$tg">
        <child id="8486969697901931678" name="IoTSystem" index="rdi_B" />
        <child id="3777166951715689342" name="Farmers" index="2Uce8E" />
        <child id="3777166951715689374" name="Crops" index="2Uceba" />
      </concept>
    </language>
  </registry>
  <node concept="1Ih$tg" id="6wjSgQVDkwN">
    <property role="TrG5h" value="Aquila" />
    <node concept="2Uce8S" id="6wjSgQVDkwO" role="2Uce8E" />
    <node concept="2Ucebg" id="6wjSgQVDkwP" role="2Uceba" />
    <node concept="2UcebP" id="6wjSgQVDkwQ" role="rdi_B">
      <node concept="3jxssy" id="6wjSgQVDkxA" role="3jyJH3" />
      <node concept="3jxssd" id="6wjSgQVDkwY" role="3jyJH3" />
      <node concept="3jxsji" id="6wjSgQVDkwS" role="3jyJH3" />
    </node>
  </node>
</model>

