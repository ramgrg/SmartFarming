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
      <property role="TrG5h" value="location" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXdD" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689321" />
      <property role="TrG5h" value="size" />
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
  </node>
  <node concept="1TIwiD" id="3hFcliemXdG">
    <property role="EcuMT" value="3777166951715689324" />
    <property role="TrG5h" value="Farmer" />
    <property role="R4oN_" value="Farmer represents the person that operates smart farming system. " />
    <property role="19KtqR" value="true" />
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
  </node>
  <node concept="QkHVr" id="3hFcliemXdS">
    <property role="3F6X1D" value="3777166951715689336" />
    <property role="TrG5h" value="double" />
  </node>
  <node concept="QkHVr" id="3hFcliemXdT">
    <property role="3F6X1D" value="3777166951715689337" />
    <property role="TrG5h" value="Email" />
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
      <property role="TrG5h" value="group" />
      <ref role="AX2Wp" node="3hFcliemXe9" resolve="CropGroup" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXen" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689367" />
      <property role="TrG5h" value="growth_duration" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="3hFcliemXeq" role="1TKVEl">
      <property role="IQ2nx" value="3777166951715689370" />
      <property role="TrG5h" value="seed_code" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="25R3W" id="3hFcliemXe9">
    <property role="3F6X1D" value="3777166951715689353" />
    <property role="TrG5h" value="CropGroup" />
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
      <property role="TrG5h" value="version" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
</model>

