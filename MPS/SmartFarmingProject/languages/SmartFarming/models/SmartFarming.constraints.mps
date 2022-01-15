<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)">
  <persistence version="9" />
  <languages>
    <use id="5dae8159-ab99-46bb-a40d-0cee30ee7018" name="jetbrains.mps.lang.constraints.rules.kinds" version="0" />
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="e51810c5-7308-4642-bcb6-469e61b5dd18" name="jetbrains.mps.lang.constraints.msg.specification" version="0" />
    <use id="134c38d4-e3af-4d9e-b069-1c7df0a4005d" name="jetbrains.mps.lang.constraints.rules.skeleton" version="0" />
    <use id="b3551702-269c-4f05-ba61-58060cef4292" name="jetbrains.mps.lang.rulesAndMessages" version="0" />
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="6" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages" version="0" />
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="gv5y" ref="r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)" implicit="true" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1153417849900" name="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" flags="nn" index="2d3UOw" />
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1082485599094" name="ifFalseStatement" index="9aQIa" />
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="1147467115080" name="jetbrains.mps.lang.constraints.structure.NodePropertyConstraint" flags="ng" index="EnEH3">
        <reference id="1147467295099" name="applicableProperty" index="EomxK" />
        <child id="1212097481299" name="propertyValidator" index="QCWH9" />
      </concept>
      <concept id="1147468365020" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_node" flags="nn" index="EsrRn" />
      <concept id="1212096972063" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_PropertyValidator" flags="in" index="QB0g5" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="1213098023997" name="property" index="1MhHOB" />
      </concept>
      <concept id="1153138554286" name="jetbrains.mps.lang.constraints.structure.ConstraintsFunctionParameter_propertyValue" flags="nn" index="1Wqviy" />
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="2396822768958367367" name="jetbrains.mps.lang.smodel.structure.AbstractTypeCastExpression" flags="nn" index="$5XWr">
        <child id="6733348108486823193" name="leftExpression" index="1m5AlR" />
        <child id="3906496115198199033" name="conceptArgument" index="3oSUPX" />
      </concept>
      <concept id="1966870290088668520" name="jetbrains.mps.lang.smodel.structure.Enum_MembersOperation" flags="ng" index="2ViDtN" />
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
      <concept id="5779574625830813396" name="jetbrains.mps.lang.smodel.structure.EnumerationIdRefExpression" flags="ng" index="1XH99k">
        <reference id="5779574625830813397" name="enumDeclaration" index="1XH99l" />
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
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1162934736510" name="jetbrains.mps.baseLanguage.collections.structure.GetElementOperation" flags="nn" index="34jXtK" />
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
    </language>
  </registry>
  <node concept="1M2fIO" id="4bdMmZEWABx">
    <ref role="1M2myG" to="gv5y:3hFcliemXdG" resolve="Farmer" />
    <node concept="EnEH3" id="37L0zDp7cit" role="1MhHOB">
      <ref role="EomxK" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
      <node concept="QB0g5" id="37L0zDp7cjj" role="QCWH9">
        <node concept="3clFbS" id="37L0zDp7cjk" role="2VODD2">
          <node concept="3clFbF" id="37L0zDp7co7" role="3cqZAp">
            <node concept="2dkUwp" id="37L0zDp7uPw" role="3clFbG">
              <node concept="3cmrfG" id="37L0zDp7uTW" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="2OqwBi" id="37L0zDp7sxs" role="3uHU7B">
                <node concept="2OqwBi" id="37L0zDp7luA" role="2Oq$k0">
                  <node concept="2OqwBi" id="37L0zDp7e5J" role="2Oq$k0">
                    <node concept="1PxgMI" id="37L0zDp7dNf" role="2Oq$k0">
                      <node concept="chp4Y" id="37L0zDp7dRV" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
                      </node>
                      <node concept="2OqwBi" id="37L0zDp7dhl" role="1m5AlR">
                        <node concept="EsrRn" id="37L0zDp7co6" role="2Oq$k0" />
                        <node concept="1mfA1w" id="37L0zDp7dBU" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="37L0zDp7eu4" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:3hFcliemXdY" resolve="Farmers" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="37L0zDp7pZH" role="2OqNvi">
                    <node concept="1bVj0M" id="37L0zDp7pZJ" role="23t8la">
                      <node concept="3clFbS" id="37L0zDp7pZK" role="1bW5cS">
                        <node concept="3clFbF" id="37L0zDp7qcI" role="3cqZAp">
                          <node concept="17R0WA" id="37L0zDp7rPZ" role="3clFbG">
                            <node concept="1Wqviy" id="37L0zDp7s15" role="3uHU7w" />
                            <node concept="2OqwBi" id="37L0zDp7qv0" role="3uHU7B">
                              <node concept="37vLTw" id="37L0zDp7qcH" role="2Oq$k0">
                                <ref role="3cqZAo" node="37L0zDp7pZL" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="37L0zDp7qWB" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="37L0zDp7pZL" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="37L0zDp7pZM" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="37L0zDp7tfV" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="KyTPI1qbdP">
    <ref role="1M2myG" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
    <node concept="EnEH3" id="KyTPI1qbdQ" role="1MhHOB">
      <ref role="EomxK" to="gv5y:3hFcliemXdD" resolve="Size" />
      <node concept="QB0g5" id="KyTPI1qbfQ" role="QCWH9">
        <node concept="3clFbS" id="KyTPI1qbfR" role="2VODD2">
          <node concept="3cpWs6" id="KyTPI1qbkv" role="3cqZAp">
            <node concept="3eOSWO" id="KyTPI1qcSh" role="3cqZAk">
              <node concept="3cmrfG" id="KyTPI1qcWs" role="3uHU7w">
                <property role="3cmrfH" value="0" />
              </node>
              <node concept="2YIFZM" id="1R3USC4QUf7" role="3uHU7B">
                <ref role="1Pybhc" to="wyt6:~Double" resolve="Double" />
                <ref role="37wK5l" to="wyt6:~Double.valueOf(java.lang.String)" resolve="valueOf" />
                <node concept="1Wqviy" id="1R3USC4QU$7" role="37wK5m" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="37L0zDp7$MZ">
    <ref role="1M2myG" to="gv5y:3hFcliemXe4" resolve="Crop" />
    <node concept="EnEH3" id="37L0zDp7$N0" role="1MhHOB">
      <ref role="EomxK" to="gv5y:3hFcliemXeq" resolve="SeedCode" />
      <node concept="QB0g5" id="37L0zDp7$OE" role="QCWH9">
        <node concept="3clFbS" id="37L0zDp7$OF" role="2VODD2">
          <node concept="3clFbF" id="37L0zDp7$Tu" role="3cqZAp">
            <node concept="2dkUwp" id="37L0zDp7ScI" role="3clFbG">
              <node concept="3cmrfG" id="37L0zDp7Sha" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="2OqwBi" id="37L0zDp7Phl" role="3uHU7B">
                <node concept="2OqwBi" id="37L0zDp7L_d" role="2Oq$k0">
                  <node concept="2OqwBi" id="37L0zDp7Aib" role="2Oq$k0">
                    <node concept="1PxgMI" id="37L0zDp7_Cs" role="2Oq$k0">
                      <node concept="chp4Y" id="37L0zDp7_Dq" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
                      </node>
                      <node concept="2OqwBi" id="37L0zDp7_77" role="1m5AlR">
                        <node concept="EsrRn" id="37L0zDp7$Tt" role="2Oq$k0" />
                        <node concept="1mfA1w" id="37L0zDp7_pf" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="37L0zDp7AmS" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:3hFcliemXeu" resolve="Crops" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="37L0zDp7MTT" role="2OqNvi">
                    <node concept="1bVj0M" id="37L0zDp7MTV" role="23t8la">
                      <node concept="3clFbS" id="37L0zDp7MTW" role="1bW5cS">
                        <node concept="3clFbF" id="37L0zDp7N0Y" role="3cqZAp">
                          <node concept="17R0WA" id="37L0zDp7OKP" role="3clFbG">
                            <node concept="1Wqviy" id="37L0zDp7P2d" role="3uHU7w" />
                            <node concept="2OqwBi" id="37L0zDp7Njg" role="3uHU7B">
                              <node concept="37vLTw" id="37L0zDp7N0X" role="2Oq$k0">
                                <ref role="3cqZAo" node="37L0zDp7MTX" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="37L0zDp7NKR" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:3hFcliemXeq" resolve="SeedCode" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="37L0zDp7MTX" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="37L0zDp7MTY" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="37L0zDp7Q2C" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="37L0zDp7Sy6">
    <property role="3GE5qa" value="Device" />
    <ref role="1M2myG" to="gv5y:4NgPXVj14iT" resolve="Device" />
    <node concept="EnEH3" id="37L0zDp7Sy7" role="1MhHOB">
      <ref role="EomxK" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
      <node concept="QB0g5" id="37L0zDp7SyX" role="QCWH9">
        <node concept="3clFbS" id="37L0zDp7SyY" role="2VODD2">
          <node concept="3clFbF" id="37L0zDp7SBL" role="3cqZAp">
            <node concept="2dkUwp" id="37L0zDp85pv" role="3clFbG">
              <node concept="3cmrfG" id="37L0zDp85tY" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="2OqwBi" id="37L0zDp82_T" role="3uHU7B">
                <node concept="2OqwBi" id="37L0zDp7VWR" role="2Oq$k0">
                  <node concept="2OqwBi" id="37L0zDp7T$Q" role="2Oq$k0">
                    <node concept="1PxgMI" id="37L0zDp7TpM" role="2Oq$k0">
                      <node concept="chp4Y" id="37L0zDp7TqK" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                      </node>
                      <node concept="2OqwBi" id="37L0zDp7SPq" role="1m5AlR">
                        <node concept="EsrRn" id="37L0zDp7SBK" role="2Oq$k0" />
                        <node concept="1mfA1w" id="37L0zDp7Tfh" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="37L0zDp7TYU" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:4NgPXVj2KGe" resolve="Devices" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="37L0zDp7ZWl" role="2OqNvi">
                    <node concept="1bVj0M" id="37L0zDp7ZWn" role="23t8la">
                      <node concept="3clFbS" id="37L0zDp7ZWo" role="1bW5cS">
                        <node concept="3clFbF" id="37L0zDp80cy" role="3cqZAp">
                          <node concept="17R0WA" id="37L0zDp825p" role="3clFbG">
                            <node concept="1Wqviy" id="37L0zDp82cO" role="3uHU7w" />
                            <node concept="2OqwBi" id="37L0zDp80uO" role="3uHU7B">
                              <node concept="37vLTw" id="37L0zDp80cx" role="2Oq$k0">
                                <ref role="3cqZAo" node="37L0zDp7ZWp" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="37L0zDp812D" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="37L0zDp7ZWp" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="37L0zDp7ZWq" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="37L0zDp83od" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="37L0zDp85Ab">
    <property role="3GE5qa" value="Gateway" />
    <ref role="1M2myG" to="gv5y:7n7Lv_IXbFV" resolve="Gateway" />
    <node concept="EnEH3" id="37L0zDp85Ac" role="1MhHOB">
      <ref role="EomxK" to="gv5y:7n7Lv_IXbFY" resolve="GatewayID" />
      <node concept="QB0g5" id="37L0zDp85BQ" role="QCWH9">
        <node concept="3clFbS" id="37L0zDp85BR" role="2VODD2">
          <node concept="3clFbF" id="37L0zDp85GE" role="3cqZAp">
            <node concept="2dkUwp" id="37L0zDp8jGG" role="3clFbG">
              <node concept="3cmrfG" id="37L0zDp8jHs" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="2OqwBi" id="37L0zDp8hb5" role="3uHU7B">
                <node concept="2OqwBi" id="37L0zDp893I" role="2Oq$k0">
                  <node concept="2OqwBi" id="37L0zDp86_I" role="2Oq$k0">
                    <node concept="1PxgMI" id="37L0zDp86qB" role="2Oq$k0">
                      <node concept="chp4Y" id="37L0zDp86r_" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                      </node>
                      <node concept="2OqwBi" id="37L0zDp85Uj" role="1m5AlR">
                        <node concept="EsrRn" id="37L0zDp85GD" role="2Oq$k0" />
                        <node concept="1mfA1w" id="37L0zDp86e5" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="37L0zDp86XU" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:4NgPXVj2LzF" resolve="Gateways" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="37L0zDp8eQb" role="2OqNvi">
                    <node concept="1bVj0M" id="37L0zDp8eQd" role="23t8la">
                      <node concept="3clFbS" id="37L0zDp8eQe" role="1bW5cS">
                        <node concept="3clFbF" id="37L0zDp8f6o" role="3cqZAp">
                          <node concept="17R0WA" id="37L0zDp8gOA" role="3clFbG">
                            <node concept="1Wqviy" id="37L0zDp8gW1" role="3uHU7w" />
                            <node concept="2OqwBi" id="37L0zDp8foE" role="3uHU7B">
                              <node concept="37vLTw" id="37L0zDp8f6n" role="2Oq$k0">
                                <ref role="3cqZAo" node="37L0zDp8eQf" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="37L0zDp8fZA" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:7n7Lv_IXbFY" resolve="GatewayID" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="37L0zDp8eQf" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="37L0zDp8eQg" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="37L0zDp8hY3" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="37L0zDp8kEC">
    <property role="3GE5qa" value="Service" />
    <ref role="1M2myG" to="gv5y:6wjSgQV_yn4" resolve="Service" />
    <node concept="EnEH3" id="37L0zDp8kED" role="1MhHOB">
      <ref role="EomxK" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
      <node concept="QB0g5" id="37L0zDp8kGj" role="QCWH9">
        <node concept="3clFbS" id="37L0zDp8kGk" role="2VODD2">
          <node concept="3clFbF" id="37L0zDp8kL7" role="3cqZAp">
            <node concept="2dkUwp" id="37L0zDp8yhn" role="3clFbG">
              <node concept="3cmrfG" id="37L0zDp8yi7" role="3uHU7w">
                <property role="3cmrfH" value="1" />
              </node>
              <node concept="2OqwBi" id="37L0zDp8vvi" role="3uHU7B">
                <node concept="2OqwBi" id="37L0zDp8nT8" role="2Oq$k0">
                  <node concept="2OqwBi" id="37L0zDp8l_a" role="2Oq$k0">
                    <node concept="1PxgMI" id="37L0zDp8lq6" role="2Oq$k0">
                      <node concept="chp4Y" id="37L0zDp8lr4" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                      </node>
                      <node concept="2OqwBi" id="37L0zDp8kYK" role="1m5AlR">
                        <node concept="EsrRn" id="37L0zDp8kL6" role="2Oq$k0" />
                        <node concept="1mfA1w" id="37L0zDp8ldY" role="2OqNvi" />
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="37L0zDp8lXm" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:6wjSgQVAhDe" resolve="Services" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="37L0zDp8rRo" role="2OqNvi">
                    <node concept="1bVj0M" id="37L0zDp8rRq" role="23t8la">
                      <node concept="3clFbS" id="37L0zDp8rRr" role="1bW5cS">
                        <node concept="3clFbF" id="37L0zDp8s4l" role="3cqZAp">
                          <node concept="17R0WA" id="37L0zDp8v6y" role="3clFbG">
                            <node concept="1Wqviy" id="37L0zDp8vdX" role="3uHU7w" />
                            <node concept="2OqwBi" id="37L0zDp8smB" role="3uHU7B">
                              <node concept="37vLTw" id="37L0zDp8s4k" role="2Oq$k0">
                                <ref role="3cqZAo" node="37L0zDp8rRs" resolve="it" />
                              </node>
                              <node concept="3TrcHB" id="37L0zDp8t0E" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="37L0zDp8rRs" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <node concept="2jxLKc" id="37L0zDp8rRt" role="1tU5fm" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="37L0zDp8wp2" role="2OqNvi" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="1R3USC4VzfN">
    <property role="3GE5qa" value="Device" />
    <ref role="1M2myG" to="gv5y:4NgPXVj19HH" resolve="Sensor" />
    <node concept="EnEH3" id="1R3USC4VzfO" role="1MhHOB">
      <ref role="EomxK" to="gv5y:4NgPXVj1jW7" resolve="Value" />
      <node concept="QB0g5" id="1R3USC4Vzhu" role="QCWH9">
        <node concept="3clFbS" id="1R3USC4Vzhv" role="2VODD2">
          <node concept="3clFbJ" id="1R3USC4VziD" role="3cqZAp">
            <node concept="3y3z36" id="1R3USC4YjZY" role="3clFbw">
              <node concept="2OqwBi" id="1R3USC4VA3F" role="3uHU7B">
                <node concept="EsrRn" id="1R3USC4Vzj8" role="2Oq$k0" />
                <node concept="3TrcHB" id="1R3USC4VAph" role="2OqNvi">
                  <ref role="3TsBF5" to="gv5y:4NgPXVj1jfm" resolve="Type" />
                </node>
              </node>
              <node concept="2OqwBi" id="1R3USC4YnUC" role="3uHU7w">
                <node concept="2OqwBi" id="1R3USC4Ymhm" role="2Oq$k0">
                  <node concept="1XH99k" id="1R3USC4YlBh" role="2Oq$k0">
                    <ref role="1XH99l" to="gv5y:4NgPXVj1bmI" resolve="SensorType" />
                  </node>
                  <node concept="2ViDtN" id="1R3USC4YmH3" role="2OqNvi" />
                </node>
                <node concept="34jXtK" id="1R3USC4YpFZ" role="2OqNvi">
                  <node concept="3cmrfG" id="1R3USC4ZAre" role="25WWJ7">
                    <property role="3cmrfH" value="0" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="1R3USC4VziF" role="3clFbx">
              <node concept="3clFbF" id="1R3USC4VHuz" role="3cqZAp">
                <node concept="2d3UOw" id="1R3USC4VUif" role="3clFbG">
                  <node concept="2YIFZM" id="1R3USC4VLK6" role="3uHU7B">
                    <ref role="37wK5l" to="wyt6:~Double.valueOf(java.lang.String)" resolve="valueOf" />
                    <ref role="1Pybhc" to="wyt6:~Double" resolve="Double" />
                    <node concept="1Wqviy" id="1R3USC4VM5F" role="37wK5m" />
                  </node>
                  <node concept="3cmrfG" id="1R3USC4VIpH" role="3uHU7w">
                    <property role="3cmrfH" value="0" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="1R3USC4Yit_" role="9aQIa">
              <node concept="3clFbS" id="1R3USC4YitA" role="9aQI4">
                <node concept="3cpWs6" id="1R3USC4Yj22" role="3cqZAp">
                  <node concept="3clFbT" id="1R3USC4YjB_" role="3cqZAk">
                    <property role="3clFbU" value="true" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

