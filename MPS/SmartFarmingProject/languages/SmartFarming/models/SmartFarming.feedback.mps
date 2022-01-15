<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:96cd50fa-da12-4f36-a2a5-dfb20bd54751(SmartFarming.feedback)">
  <persistence version="9" />
  <languages>
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="7127d409-29f0-43e8-917f-f016ea288944" name="jetbrains.mps.lang.feedback.problem.structural" version="0" />
    <use id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton" version="0" />
    <use id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages" version="0" />
    <use id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem" version="0" />
    <use id="cddf55b3-117e-46ec-837c-ff50eb7b89b0" name="jetbrains.mps.lang.feedback.problem.childAndProp" version="0" />
    <use id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="feec32f9-bc8f-4da8-8efd-7f3f9dd4101b" name="jetbrains.mps.lang.feedback.problem.scopes" version="0" />
    <devkit ref="0845ddb4-34c2-4a32-b2ae-270bffc5b430(jetbrains.mps.devkit.aspect.feedback)" />
  </languages>
  <imports>
    <import index="gv5y" ref="r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)" />
    <import index="fudv" ref="r:9006e6ce-991d-45e3-a20f-0deb45783955(jetbrains.mps.lang.feedback.problem.childAndProp.feedback)" />
  </imports>
  <registry>
    <language id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem">
      <concept id="7716791493892884282" name="jetbrains.mps.lang.feedback.problem.structure.ProblemPointsToKindRoot" flags="ng" index="sa$J0">
        <reference id="7716791493892884283" name="kind" index="sa$J1" />
      </concept>
    </language>
    <language id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback">
      <concept id="6285588811486118729" name="jetbrains.mps.lang.feedback.structure.Feedback" flags="ng" index="3JXyrL">
        <child id="6285588811486118732" name="problem" index="3JXyrO" />
      </concept>
    </language>
    <language id="cddf55b3-117e-46ec-837c-ff50eb7b89b0" name="jetbrains.mps.lang.feedback.problem.childAndProp">
      <concept id="24399255755597574" name="jetbrains.mps.lang.feedback.problem.childAndProp.structure.FailingPropertyConstraintsProblem" flags="ng" index="1GjwBS">
        <reference id="24399255755615671" name="property" index="1Gj$d9" />
      </concept>
    </language>
    <language id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages">
      <concept id="7291380803381892689" name="jetbrains.mps.lang.feedback.messages.structure.ShowMessage" flags="ng" index="3QByp$">
        <child id="5258059200641510856" name="message" index="16N$OO" />
      </concept>
    </language>
    <language id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages">
      <concept id="5258059200642172255" name="jetbrains.mps.lang.messages.structure.CombinedMessageExpression" flags="ng" index="16I2mz">
        <child id="5258059200642172257" name="part" index="16I2mt" />
      </concept>
      <concept id="5258059200641510853" name="jetbrains.mps.lang.messages.structure.LiteralMessageExpression" flags="ng" index="16N$OT">
        <property id="5258059200641510854" name="message" index="16N$OU" />
      </concept>
    </language>
    <language id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton">
      <concept id="7291380803381892615" name="jetbrains.mps.lang.feedback.skeleton.structure.FeedbackPerConceptRoot" flags="ng" index="3QByoM">
        <reference id="7188575577281228125" name="concept" index="3Z9TSV" />
        <child id="7291380803381927154" name="feedbacks" index="3QBEN7" />
      </concept>
    </language>
  </registry>
  <node concept="3QByoM" id="KyTPI1qd7K">
    <ref role="3Z9TSV" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
    <node concept="3QByp$" id="KyTPI1qd7L" role="3QBEN7">
      <node concept="1GjwBS" id="KyTPI1qd75" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:3hFcliemXdD" resolve="Size" />
      </node>
      <node concept="16I2mz" id="KyTPI1qd7P" role="16N$OO">
        <node concept="16N$OT" id="KyTPI1qd7Q" role="16I2mt">
          <property role="16N$OU" value="Size must be greater than zero." />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="KyTPI1qdsA">
    <ref role="3Z9TSV" to="gv5y:3hFcliemXdG" resolve="Farmer" />
    <node concept="3QByp$" id="1R3USC4NkuJ" role="3QBEN7">
      <node concept="16I2mz" id="1R3USC4NkuK" role="16N$OO">
        <node concept="16N$OT" id="1R3USC4NkuL" role="16I2mt">
          <property role="16N$OU" value="The &quot;Phone_Number&quot; you entered isn't valid" />
        </node>
      </node>
      <node concept="1GjwBS" id="1R3USC4NkuH" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:3hFcliemXdO" resolve="PhoneNumber" />
      </node>
    </node>
    <node concept="3QByp$" id="1R3USC4H$ds" role="3QBEN7">
      <node concept="16I2mz" id="1R3USC4H$dt" role="16N$OO">
        <node concept="16N$OT" id="1R3USC4H$du" role="16I2mt">
          <property role="16N$OU" value="The &quot;Email&quot; you entered isn't valid." />
        </node>
      </node>
      <node concept="1GjwBS" id="1R3USC4H$dq" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:3hFcliemXdL" resolve="Email" />
      </node>
    </node>
    <node concept="3QByp$" id="KyTPI1qdsB" role="3QBEN7">
      <node concept="1GjwBS" id="KyTPI1qdrL" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
      </node>
      <node concept="16I2mz" id="KyTPI1qdsF" role="16N$OO">
        <node concept="16N$OT" id="1R3USC4H$d7" role="16I2mt">
          <property role="16N$OU" value="The &quot;Farmer_ID&quot; you entered is already used. " />
        </node>
        <node concept="16N$OT" id="1R3USC4H$dg" role="16I2mt">
          <property role="16N$OU" value="" />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="37L0zDp7SxQ">
    <ref role="3Z9TSV" to="gv5y:3hFcliemXe4" resolve="Crop" />
    <node concept="3QByp$" id="37L0zDp7SxR" role="3QBEN7">
      <node concept="1GjwBS" id="37L0zDp7Sx1" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:3hFcliemXeq" resolve="SeedCode" />
      </node>
      <node concept="16I2mz" id="37L0zDp7SxV" role="16N$OO">
        <node concept="16N$OT" id="37L0zDp7SxW" role="16I2mt">
          <property role="16N$OU" value="The &quot;Seed_Code&quot; you entered is already used." />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="37L0zDp85_V">
    <ref role="3Z9TSV" to="gv5y:4NgPXVj14iT" resolve="Device" />
    <node concept="3QByp$" id="37L0zDp85_W" role="3QBEN7">
      <node concept="1GjwBS" id="37L0zDp85_6" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
      </node>
      <node concept="16I2mz" id="37L0zDp85A0" role="16N$OO">
        <node concept="16N$OT" id="37L0zDp85A1" role="16I2mt">
          <property role="16N$OU" value="The &quot;Device_ID&quot; you entered is already used." />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="37L0zDp8jTa">
    <ref role="3Z9TSV" to="gv5y:7n7Lv_IXbFV" resolve="Gateway" />
    <node concept="3QByp$" id="37L0zDp8jTb" role="3QBEN7">
      <node concept="1GjwBS" id="37L0zDp8jSl" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:7n7Lv_IXbFY" resolve="GatewayID" />
      </node>
      <node concept="16I2mz" id="37L0zDp8jTf" role="16N$OO">
        <node concept="16N$OT" id="37L0zDp8jTg" role="16I2mt">
          <property role="16N$OU" value="The &quot;Gateway_ID&quot; you entered is already used." />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="37L0zDp8yst">
    <ref role="3Z9TSV" to="gv5y:6wjSgQV_yn4" resolve="Service" />
    <node concept="3QByp$" id="37L0zDp8ysu" role="3QBEN7">
      <node concept="1GjwBS" id="37L0zDp8yrC" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
      </node>
      <node concept="16I2mz" id="37L0zDp8ysy" role="16N$OO">
        <node concept="16N$OT" id="37L0zDp8ysz" role="16I2mt">
          <property role="16N$OU" value="The &quot;Service_ID&quot; you entered is already used." />
        </node>
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="1R3USC50M4P">
    <ref role="3Z9TSV" to="gv5y:4NgPXVj19HH" resolve="Sensor" />
    <node concept="3QByp$" id="1R3USC50M4Q" role="3QBEN7">
      <node concept="1GjwBS" id="1R3USC50M40" role="3JXyrO">
        <ref role="sa$J1" to="fudv:1mFJTG7e$j" />
        <ref role="1Gj$d9" to="gv5y:4NgPXVj1jW7" resolve="Value" />
      </node>
      <node concept="16I2mz" id="1R3USC50M4U" role="16N$OO">
        <node concept="16N$OT" id="1R3USC50M4V" role="16I2mt">
          <property role="16N$OU" value="Only temperature value can be negative." />
        </node>
      </node>
    </node>
  </node>
</model>

