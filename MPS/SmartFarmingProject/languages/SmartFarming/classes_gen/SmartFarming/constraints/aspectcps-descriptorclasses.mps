<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f807d0a(checkpoints/SmartFarming.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="2tul" ref="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="i8bi" ref="r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="2k9e" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.structure(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="79pl" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime.base(MPS.Core/)" />
    <import index="gv5y" ref="r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1082485599095" name="jetbrains.mps.baseLanguage.structure.BlockStatement" flags="nn" index="9aQIb">
        <child id="1082485599096" name="statements" index="9aQI4" />
      </concept>
      <concept id="1153417849900" name="jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression" flags="nn" index="2d3UOw" />
      <concept id="1153422305557" name="jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression" flags="nn" index="2dkUwp" />
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ng" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="4269842503726207156" name="jetbrains.mps.baseLanguage.structure.LongLiteral" flags="nn" index="1adDum">
        <property id="4269842503726207157" name="value" index="1adDun" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
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
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1081506762703" name="jetbrains.mps.baseLanguage.structure.GreaterThanExpression" flags="nn" index="3eOSWO" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
        <child id="3864140621129713365" name="outputNode" index="39e2AY" />
      </concept>
      <concept id="3864140621129713348" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry" flags="nn" index="39e2AJ">
        <property id="3864140621129715945" name="label" index="39e3Y2" />
        <child id="3864140621129715947" name="entries" index="39e3Y0" />
      </concept>
      <concept id="3864140621129713362" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef" flags="nn" index="39e2AT">
        <reference id="3864140621129713363" name="node" index="39e2AS" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
      <concept id="4927083583736784422" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToSingleConstantExpression" flags="ng" index="1BaE9c">
        <property id="3566113306135792467" name="baseContainerName" index="1ouuDV" />
        <property id="4927083583736815155" name="uniqueFieldName" index="1BaxDp" />
        <child id="4927083583736819744" name="expression" index="1Bazha" />
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
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="1139613262185" name="jetbrains.mps.lang.smodel.structure.Node_GetParentOperation" flags="nn" index="1mfA1w" />
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1140137987495" name="jetbrains.mps.lang.smodel.structure.SNodeTypeCastExpression" flags="nn" index="1PxgMI" />
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
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
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="1" role="1zkMxy">
      <ref role="3uigEE" to="ze1i:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="2" role="1B3o_S" />
    <node concept="3clFbW" id="3" role="jymVt">
      <node concept="3cqZAl" id="6" role="3clF45" />
      <node concept="3Tm1VV" id="7" role="1B3o_S" />
      <node concept="3clFbS" id="8" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="4" role="jymVt" />
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="9" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="a" role="1B3o_S" />
      <node concept="3uibUv" id="b" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="c" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="e" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="d" role="3clF47">
        <node concept="1_3QMa" id="f" role="3cqZAp">
          <node concept="37vLTw" id="h" role="1_3QMn">
            <ref role="3cqZAo" node="c" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="i" role="1_3QMm">
            <node concept="3clFbS" id="q" role="1pnPq1">
              <node concept="3cpWs6" id="s" role="3cqZAp">
                <node concept="1nCR9W" id="t" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Farmer_Constraints" />
                  <node concept="3uibUv" id="u" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="r" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:3hFcliemXdG" resolve="Farmer" />
            </node>
          </node>
          <node concept="1pnPoh" id="j" role="1_3QMm">
            <node concept="3clFbS" id="v" role="1pnPq1">
              <node concept="3cpWs6" id="x" role="3cqZAp">
                <node concept="1nCR9W" id="y" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Farm_Constraints" />
                  <node concept="3uibUv" id="z" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="w" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
            </node>
          </node>
          <node concept="1pnPoh" id="k" role="1_3QMm">
            <node concept="3clFbS" id="$" role="1pnPq1">
              <node concept="3cpWs6" id="A" role="3cqZAp">
                <node concept="1nCR9W" id="B" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Crop_Constraints" />
                  <node concept="3uibUv" id="C" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="_" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:3hFcliemXe4" resolve="Crop" />
            </node>
          </node>
          <node concept="1pnPoh" id="l" role="1_3QMm">
            <node concept="3clFbS" id="D" role="1pnPq1">
              <node concept="3cpWs6" id="F" role="3cqZAp">
                <node concept="1nCR9W" id="G" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Device_Constraints" />
                  <node concept="3uibUv" id="H" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="E" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:4NgPXVj14iT" resolve="Device" />
            </node>
          </node>
          <node concept="1pnPoh" id="m" role="1_3QMm">
            <node concept="3clFbS" id="I" role="1pnPq1">
              <node concept="3cpWs6" id="K" role="3cqZAp">
                <node concept="1nCR9W" id="L" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Gateway_Constraints" />
                  <node concept="3uibUv" id="M" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="J" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:7n7Lv_IXbFV" resolve="Gateway" />
            </node>
          </node>
          <node concept="1pnPoh" id="n" role="1_3QMm">
            <node concept="3clFbS" id="N" role="1pnPq1">
              <node concept="3cpWs6" id="P" role="3cqZAp">
                <node concept="1nCR9W" id="Q" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Service_Constraints" />
                  <node concept="3uibUv" id="R" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="O" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:6wjSgQV_yn4" resolve="Service" />
            </node>
          </node>
          <node concept="1pnPoh" id="o" role="1_3QMm">
            <node concept="3clFbS" id="S" role="1pnPq1">
              <node concept="3cpWs6" id="U" role="3cqZAp">
                <node concept="1nCR9W" id="V" role="3cqZAk">
                  <property role="1nD$Q0" value="SmartFarming.constraints.Sensor_Constraints" />
                  <node concept="3uibUv" id="W" role="2lIhxL">
                    <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="T" role="1pnPq6">
              <ref role="3gnhBz" to="gv5y:4NgPXVj19HH" resolve="Sensor" />
            </node>
          </node>
          <node concept="3clFbS" id="p" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="g" role="3cqZAp">
          <node concept="2ShNRf" id="X" role="3cqZAk">
            <node concept="1pGfFk" id="Y" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="Z" role="37wK5m">
                <ref role="3cqZAo" node="c" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="10">
    <property role="TrG5h" value="Crop_Constraints" />
    <uo k="s:originTrace" v="n:3598660026872253631" />
    <node concept="3Tm1VV" id="11" role="1B3o_S">
      <uo k="s:originTrace" v="n:3598660026872253631" />
    </node>
    <node concept="3uibUv" id="12" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:3598660026872253631" />
    </node>
    <node concept="3clFbW" id="13" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872253631" />
      <node concept="3cqZAl" id="17" role="3clF45">
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
      <node concept="3clFbS" id="18" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="XkiVB" id="1a" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="1BaE9c" id="1b" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Crop$xU" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="2YIFZM" id="1c" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="1adDum" id="1d" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
              <node concept="1adDum" id="1e" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
              <node concept="1adDum" id="1f" role="37wK5m">
                <property role="1adDun" value="0x346b31548e5bd384L" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
              <node concept="Xl_RD" id="1g" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Crop" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="19" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
    </node>
    <node concept="2tJIrI" id="14" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872253631" />
    </node>
    <node concept="312cEu" id="15" role="jymVt">
      <property role="TrG5h" value="SeedCode_Property" />
      <uo k="s:originTrace" v="n:3598660026872253631" />
      <node concept="3clFbW" id="1h" role="jymVt">
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="3cqZAl" id="1m" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="3Tm1VV" id="1n" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="3clFbS" id="1o" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="XkiVB" id="1q" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="1BaE9c" id="1r" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="SeedCode$jwgw" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="2YIFZM" id="1w" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="1adDum" id="1x" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="1adDum" id="1y" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="1adDum" id="1z" role="37wK5m">
                  <property role="1adDun" value="0x346b31548e5bd384L" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="1adDum" id="1$" role="37wK5m">
                  <property role="1adDun" value="0x346b31548e5bd39aL" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="Xl_RD" id="1_" role="37wK5m">
                  <property role="Xl_RC" value="SeedCode" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="1s" role="37wK5m">
              <ref role="3cqZAo" node="1p" resolve="container" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
            <node concept="3clFbT" id="1t" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
            <node concept="3clFbT" id="1u" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
            <node concept="3clFbT" id="1v" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="1p" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3uibUv" id="1A" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="1i" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="3Tm1VV" id="1B" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="10P_77" id="1C" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="37vLTG" id="1D" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3Tqbb2" id="1I" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
        <node concept="37vLTG" id="1E" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3uibUv" id="1J" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
        <node concept="37vLTG" id="1F" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3uibUv" id="1K" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
        <node concept="3clFbS" id="1G" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3cpWs8" id="1L" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="3cpWsn" id="1O" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="10P_77" id="1P" role="1tU5fm">
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
              <node concept="1rXfSq" id="1Q" role="33vP2m">
                <ref role="37wK5l" node="1j" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="37vLTw" id="1R" role="37wK5m">
                  <ref role="3cqZAo" node="1D" resolve="node" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="2YIFZM" id="1S" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                  <node concept="37vLTw" id="1T" role="37wK5m">
                    <ref role="3cqZAo" node="1E" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="1M" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="3clFbS" id="1U" role="3clFbx">
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="3clFbF" id="1W" role="3cqZAp">
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="2OqwBi" id="1X" role="3clFbG">
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                  <node concept="37vLTw" id="1Y" role="2Oq$k0">
                    <ref role="3cqZAo" node="1F" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                  <node concept="liA8E" id="1Z" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                    <node concept="2ShNRf" id="20" role="37wK5m">
                      <uo k="s:originTrace" v="n:3598660026872253631" />
                      <node concept="1pGfFk" id="21" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:3598660026872253631" />
                        <node concept="Xl_RD" id="22" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:3598660026872253631" />
                        </node>
                        <node concept="Xl_RD" id="23" role="37wK5m">
                          <property role="Xl_RC" value="3598660026872253738" />
                          <uo k="s:originTrace" v="n:3598660026872253631" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="1V" role="3clFbw">
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="3y3z36" id="24" role="3uHU7w">
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="10Nm6u" id="26" role="3uHU7w">
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="37vLTw" id="27" role="3uHU7B">
                  <ref role="3cqZAo" node="1F" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
              </node>
              <node concept="3fqX7Q" id="25" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="37vLTw" id="28" role="3fr31v">
                  <ref role="3cqZAo" node="1O" resolve="result" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="1N" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="37vLTw" id="29" role="3clFbG">
              <ref role="3cqZAo" node="1O" resolve="result" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="1H" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
      </node>
      <node concept="2YIFZL" id="1j" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="37vLTG" id="2a" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3Tqbb2" id="2f" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
        <node concept="37vLTG" id="2b" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3uibUv" id="2g" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
        <node concept="10P_77" id="2c" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="3Tm6S6" id="2d" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="3clFbS" id="2e" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872253739" />
          <node concept="3clFbF" id="2h" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872254046" />
            <node concept="2dkUwp" id="2i" role="3clFbG">
              <uo k="s:originTrace" v="n:3598660026872333102" />
              <node concept="3cmrfG" id="2j" role="3uHU7w">
                <property role="3cmrfH" value="1" />
                <uo k="s:originTrace" v="n:3598660026872333386" />
              </node>
              <node concept="2OqwBi" id="2k" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872321109" />
                <node concept="2OqwBi" id="2l" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:3598660026872305997" />
                  <node concept="2OqwBi" id="2n" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:3598660026872259723" />
                    <node concept="1PxgMI" id="2p" role="2Oq$k0">
                      <uo k="s:originTrace" v="n:3598660026872257052" />
                      <node concept="chp4Y" id="2r" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
                        <uo k="s:originTrace" v="n:3598660026872257114" />
                      </node>
                      <node concept="2OqwBi" id="2s" role="1m5AlR">
                        <uo k="s:originTrace" v="n:3598660026872254919" />
                        <node concept="37vLTw" id="2t" role="2Oq$k0">
                          <ref role="3cqZAo" node="2a" resolve="node" />
                          <uo k="s:originTrace" v="n:3598660026872254045" />
                        </node>
                        <node concept="1mfA1w" id="2u" role="2OqNvi">
                          <uo k="s:originTrace" v="n:3598660026872256079" />
                        </node>
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="2q" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:3hFcliemXeu" resolve="Crops" />
                      <uo k="s:originTrace" v="n:3598660026872260024" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="2o" role="2OqNvi">
                    <uo k="s:originTrace" v="n:3598660026872311417" />
                    <node concept="1bVj0M" id="2v" role="23t8la">
                      <uo k="s:originTrace" v="n:3598660026872311419" />
                      <node concept="3clFbS" id="2w" role="1bW5cS">
                        <uo k="s:originTrace" v="n:3598660026872311420" />
                        <node concept="3clFbF" id="2y" role="3cqZAp">
                          <uo k="s:originTrace" v="n:3598660026872311870" />
                          <node concept="17R0WA" id="2z" role="3clFbG">
                            <uo k="s:originTrace" v="n:3598660026872319029" />
                            <node concept="37vLTw" id="2$" role="3uHU7w">
                              <ref role="3cqZAo" node="2b" resolve="propertyValue" />
                              <uo k="s:originTrace" v="n:3598660026872320141" />
                            </node>
                            <node concept="2OqwBi" id="2_" role="3uHU7B">
                              <uo k="s:originTrace" v="n:3598660026872313040" />
                              <node concept="37vLTw" id="2A" role="2Oq$k0">
                                <ref role="3cqZAo" node="2x" resolve="it" />
                                <uo k="s:originTrace" v="n:3598660026872311869" />
                              </node>
                              <node concept="3TrcHB" id="2B" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:3hFcliemXeq" resolve="SeedCode" />
                                <uo k="s:originTrace" v="n:3598660026872314935" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="2x" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <uo k="s:originTrace" v="n:3598660026872311421" />
                        <node concept="2jxLKc" id="2C" role="1tU5fm">
                          <uo k="s:originTrace" v="n:3598660026872311422" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="2m" role="2OqNvi">
                  <uo k="s:originTrace" v="n:3598660026872324264" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="1k" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
      <node concept="3uibUv" id="1l" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
    </node>
    <node concept="3clFb_" id="16" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:3598660026872253631" />
      <node concept="3Tmbuc" id="2D" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
      <node concept="3uibUv" id="2E" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="3uibUv" id="2H" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
        <node concept="3uibUv" id="2I" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872253631" />
        </node>
      </node>
      <node concept="3clFbS" id="2F" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872253631" />
        <node concept="3cpWs8" id="2J" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="3cpWsn" id="2M" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="3uibUv" id="2N" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="3uibUv" id="2P" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
              <node concept="3uibUv" id="2Q" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
              </node>
            </node>
            <node concept="2ShNRf" id="2O" role="33vP2m">
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="1pGfFk" id="2R" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="3uibUv" id="2S" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
                <node concept="3uibUv" id="2T" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2K" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="2OqwBi" id="2U" role="3clFbG">
            <uo k="s:originTrace" v="n:3598660026872253631" />
            <node concept="37vLTw" id="2V" role="2Oq$k0">
              <ref role="3cqZAo" node="2M" resolve="properties" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
            </node>
            <node concept="liA8E" id="2W" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:3598660026872253631" />
              <node concept="1BaE9c" id="2X" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="SeedCode$jwgw" />
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="2YIFZM" id="2Z" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                  <node concept="1adDum" id="30" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                  <node concept="1adDum" id="31" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                  <node concept="1adDum" id="32" role="37wK5m">
                    <property role="1adDun" value="0x346b31548e5bd384L" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                  <node concept="1adDum" id="33" role="37wK5m">
                    <property role="1adDun" value="0x346b31548e5bd39aL" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                  <node concept="Xl_RD" id="34" role="37wK5m">
                    <property role="Xl_RC" value="SeedCode" />
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="2Y" role="37wK5m">
                <uo k="s:originTrace" v="n:3598660026872253631" />
                <node concept="1pGfFk" id="35" role="2ShVmc">
                  <ref role="37wK5l" node="1h" resolve="Crop_Constraints.SeedCode_Property" />
                  <uo k="s:originTrace" v="n:3598660026872253631" />
                  <node concept="Xjq3P" id="36" role="37wK5m">
                    <uo k="s:originTrace" v="n:3598660026872253631" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="2L" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872253631" />
          <node concept="37vLTw" id="37" role="3clFbG">
            <ref role="3cqZAo" node="2M" resolve="properties" />
            <uo k="s:originTrace" v="n:3598660026872253631" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2G" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3598660026872253631" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="38">
    <property role="3GE5qa" value="Device" />
    <property role="TrG5h" value="Device_Constraints" />
    <uo k="s:originTrace" v="n:3598660026872334470" />
    <node concept="3Tm1VV" id="39" role="1B3o_S">
      <uo k="s:originTrace" v="n:3598660026872334470" />
    </node>
    <node concept="3uibUv" id="3a" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:3598660026872334470" />
    </node>
    <node concept="3clFbW" id="3b" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872334470" />
      <node concept="3cqZAl" id="3f" role="3clF45">
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
      <node concept="3clFbS" id="3g" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="XkiVB" id="3i" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="1BaE9c" id="3j" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Device$W0" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="2YIFZM" id="3k" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="1adDum" id="3l" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
              <node concept="1adDum" id="3m" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
              <node concept="1adDum" id="3n" role="37wK5m">
                <property role="1adDun" value="0x4cd0d7ded30444b9L" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
              <node concept="Xl_RD" id="3o" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Device" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3h" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
    </node>
    <node concept="2tJIrI" id="3c" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872334470" />
    </node>
    <node concept="312cEu" id="3d" role="jymVt">
      <property role="TrG5h" value="DeviceID_Property" />
      <uo k="s:originTrace" v="n:3598660026872334470" />
      <node concept="3clFbW" id="3p" role="jymVt">
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="3cqZAl" id="3u" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="3Tm1VV" id="3v" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="3clFbS" id="3w" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="XkiVB" id="3y" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="1BaE9c" id="3z" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="DeviceID$FImN" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="2YIFZM" id="3C" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="1adDum" id="3D" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="1adDum" id="3E" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="1adDum" id="3F" role="37wK5m">
                  <property role="1adDun" value="0x4cd0d7ded30444b9L" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="1adDum" id="3G" role="37wK5m">
                  <property role="1adDun" value="0x4cd0d7ded3046d9eL" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="Xl_RD" id="3H" role="37wK5m">
                  <property role="Xl_RC" value="DeviceID" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="3$" role="37wK5m">
              <ref role="3cqZAo" node="3x" resolve="container" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
            <node concept="3clFbT" id="3_" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
            <node concept="3clFbT" id="3A" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
            <node concept="3clFbT" id="3B" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="3x" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3uibUv" id="3I" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="3q" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="3Tm1VV" id="3J" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="10P_77" id="3K" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="37vLTG" id="3L" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3Tqbb2" id="3Q" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
        <node concept="37vLTG" id="3M" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3uibUv" id="3R" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
        <node concept="37vLTG" id="3N" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3uibUv" id="3S" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
        <node concept="3clFbS" id="3O" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3cpWs8" id="3T" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="3cpWsn" id="3W" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="10P_77" id="3X" role="1tU5fm">
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
              <node concept="1rXfSq" id="3Y" role="33vP2m">
                <ref role="37wK5l" node="3r" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="37vLTw" id="3Z" role="37wK5m">
                  <ref role="3cqZAo" node="3L" resolve="node" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="2YIFZM" id="40" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                  <node concept="37vLTw" id="41" role="37wK5m">
                    <ref role="3cqZAo" node="3M" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="3U" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="3clFbS" id="42" role="3clFbx">
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="3clFbF" id="44" role="3cqZAp">
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="2OqwBi" id="45" role="3clFbG">
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                  <node concept="37vLTw" id="46" role="2Oq$k0">
                    <ref role="3cqZAo" node="3N" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                  <node concept="liA8E" id="47" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                    <node concept="2ShNRf" id="48" role="37wK5m">
                      <uo k="s:originTrace" v="n:3598660026872334470" />
                      <node concept="1pGfFk" id="49" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:3598660026872334470" />
                        <node concept="Xl_RD" id="4a" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:3598660026872334470" />
                        </node>
                        <node concept="Xl_RD" id="4b" role="37wK5m">
                          <property role="Xl_RC" value="3598660026872334525" />
                          <uo k="s:originTrace" v="n:3598660026872334470" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="43" role="3clFbw">
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="3y3z36" id="4c" role="3uHU7w">
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="10Nm6u" id="4e" role="3uHU7w">
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="37vLTw" id="4f" role="3uHU7B">
                  <ref role="3cqZAo" node="3N" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
              </node>
              <node concept="3fqX7Q" id="4d" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="37vLTw" id="4g" role="3fr31v">
                  <ref role="3cqZAo" node="3W" resolve="result" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="3V" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="37vLTw" id="4h" role="3clFbG">
              <ref role="3cqZAo" node="3W" resolve="result" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="3P" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
      </node>
      <node concept="2YIFZL" id="3r" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="37vLTG" id="4i" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3Tqbb2" id="4n" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
        <node concept="37vLTG" id="4j" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3uibUv" id="4o" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
        <node concept="10P_77" id="4k" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="3Tm6S6" id="4l" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="3clFbS" id="4m" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872334526" />
          <node concept="3clFbF" id="4p" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872334833" />
            <node concept="2dkUwp" id="4q" role="3clFbG">
              <uo k="s:originTrace" v="n:3598660026872387167" />
              <node concept="3cmrfG" id="4r" role="3uHU7w">
                <property role="3cmrfH" value="1" />
                <uo k="s:originTrace" v="n:3598660026872387454" />
              </node>
              <node concept="2OqwBi" id="4s" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872375673" />
                <node concept="2OqwBi" id="4t" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:3598660026872348471" />
                  <node concept="2OqwBi" id="4v" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:3598660026872338742" />
                    <node concept="1PxgMI" id="4x" role="2Oq$k0">
                      <uo k="s:originTrace" v="n:3598660026872338034" />
                      <node concept="chp4Y" id="4z" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                        <uo k="s:originTrace" v="n:3598660026872338096" />
                      </node>
                      <node concept="2OqwBi" id="4$" role="1m5AlR">
                        <uo k="s:originTrace" v="n:3598660026872335706" />
                        <node concept="37vLTw" id="4_" role="2Oq$k0">
                          <ref role="3cqZAo" node="4i" resolve="node" />
                          <uo k="s:originTrace" v="n:3598660026872334832" />
                        </node>
                        <node concept="1mfA1w" id="4A" role="2OqNvi">
                          <uo k="s:originTrace" v="n:3598660026872337361" />
                        </node>
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="4y" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:4NgPXVj2KGe" resolve="Devices" />
                      <uo k="s:originTrace" v="n:3598660026872340410" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="4w" role="2OqNvi">
                    <uo k="s:originTrace" v="n:3598660026872364821" />
                    <node concept="1bVj0M" id="4B" role="23t8la">
                      <uo k="s:originTrace" v="n:3598660026872364823" />
                      <node concept="3clFbS" id="4C" role="1bW5cS">
                        <uo k="s:originTrace" v="n:3598660026872364824" />
                        <node concept="3clFbF" id="4E" role="3cqZAp">
                          <uo k="s:originTrace" v="n:3598660026872365858" />
                          <node concept="17R0WA" id="4F" role="3clFbG">
                            <uo k="s:originTrace" v="n:3598660026872373593" />
                            <node concept="37vLTw" id="4G" role="3uHU7w">
                              <ref role="3cqZAo" node="4j" resolve="propertyValue" />
                              <uo k="s:originTrace" v="n:3598660026872374068" />
                            </node>
                            <node concept="2OqwBi" id="4H" role="3uHU7B">
                              <uo k="s:originTrace" v="n:3598660026872367028" />
                              <node concept="37vLTw" id="4I" role="2Oq$k0">
                                <ref role="3cqZAo" node="4D" resolve="it" />
                                <uo k="s:originTrace" v="n:3598660026872365857" />
                              </node>
                              <node concept="3TrcHB" id="4J" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
                                <uo k="s:originTrace" v="n:3598660026872369321" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="4D" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <uo k="s:originTrace" v="n:3598660026872364825" />
                        <node concept="2jxLKc" id="4K" role="1tU5fm">
                          <uo k="s:originTrace" v="n:3598660026872364826" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="4u" role="2OqNvi">
                  <uo k="s:originTrace" v="n:3598660026872378893" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="3s" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
      <node concept="3uibUv" id="3t" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
    </node>
    <node concept="3clFb_" id="3e" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:3598660026872334470" />
      <node concept="3Tmbuc" id="4L" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
      <node concept="3uibUv" id="4M" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="3uibUv" id="4P" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
        <node concept="3uibUv" id="4Q" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872334470" />
        </node>
      </node>
      <node concept="3clFbS" id="4N" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872334470" />
        <node concept="3cpWs8" id="4R" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="3cpWsn" id="4U" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="3uibUv" id="4V" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="3uibUv" id="4X" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
              <node concept="3uibUv" id="4Y" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
              </node>
            </node>
            <node concept="2ShNRf" id="4W" role="33vP2m">
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="1pGfFk" id="4Z" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="3uibUv" id="50" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
                <node concept="3uibUv" id="51" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4S" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="2OqwBi" id="52" role="3clFbG">
            <uo k="s:originTrace" v="n:3598660026872334470" />
            <node concept="37vLTw" id="53" role="2Oq$k0">
              <ref role="3cqZAo" node="4U" resolve="properties" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
            </node>
            <node concept="liA8E" id="54" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:3598660026872334470" />
              <node concept="1BaE9c" id="55" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="DeviceID$FImN" />
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="2YIFZM" id="57" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                  <node concept="1adDum" id="58" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                  <node concept="1adDum" id="59" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                  <node concept="1adDum" id="5a" role="37wK5m">
                    <property role="1adDun" value="0x4cd0d7ded30444b9L" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                  <node concept="1adDum" id="5b" role="37wK5m">
                    <property role="1adDun" value="0x4cd0d7ded3046d9eL" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                  <node concept="Xl_RD" id="5c" role="37wK5m">
                    <property role="Xl_RC" value="DeviceID" />
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="56" role="37wK5m">
                <uo k="s:originTrace" v="n:3598660026872334470" />
                <node concept="1pGfFk" id="5d" role="2ShVmc">
                  <ref role="37wK5l" node="3p" resolve="Device_Constraints.DeviceID_Property" />
                  <uo k="s:originTrace" v="n:3598660026872334470" />
                  <node concept="Xjq3P" id="5e" role="37wK5m">
                    <uo k="s:originTrace" v="n:3598660026872334470" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4T" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872334470" />
          <node concept="37vLTw" id="5f" role="3clFbG">
            <ref role="3cqZAo" node="4U" resolve="properties" />
            <uo k="s:originTrace" v="n:3598660026872334470" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="4O" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3598660026872334470" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="5g">
    <property role="TrG5h" value="Farm_Constraints" />
    <uo k="s:originTrace" v="n:874515657862460277" />
    <node concept="3Tm1VV" id="5h" role="1B3o_S">
      <uo k="s:originTrace" v="n:874515657862460277" />
    </node>
    <node concept="3uibUv" id="5i" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:874515657862460277" />
    </node>
    <node concept="3clFbW" id="5j" role="jymVt">
      <uo k="s:originTrace" v="n:874515657862460277" />
      <node concept="3cqZAl" id="5n" role="3clF45">
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
      <node concept="3clFbS" id="5o" role="3clF47">
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="XkiVB" id="5q" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="1BaE9c" id="5r" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Farm$6b" />
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="2YIFZM" id="5s" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="1adDum" id="5t" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
              <node concept="1adDum" id="5u" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
              <node concept="1adDum" id="5v" role="37wK5m">
                <property role="1adDun" value="0xad19f946497d8c4L" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
              <node concept="Xl_RD" id="5w" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Farm" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5p" role="1B3o_S">
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
    </node>
    <node concept="2tJIrI" id="5k" role="jymVt">
      <uo k="s:originTrace" v="n:874515657862460277" />
    </node>
    <node concept="312cEu" id="5l" role="jymVt">
      <property role="TrG5h" value="Size_Property" />
      <uo k="s:originTrace" v="n:874515657862460277" />
      <node concept="3clFbW" id="5x" role="jymVt">
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="3cqZAl" id="5A" role="3clF45">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="3Tm1VV" id="5B" role="1B3o_S">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="3clFbS" id="5C" role="3clF47">
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="XkiVB" id="5E" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="1BaE9c" id="5F" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="Size$uTGn" />
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="2YIFZM" id="5K" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="1adDum" id="5L" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="1adDum" id="5M" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="1adDum" id="5N" role="37wK5m">
                  <property role="1adDun" value="0xad19f946497d8c4L" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="1adDum" id="5O" role="37wK5m">
                  <property role="1adDun" value="0x346b31548e5bd369L" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="Xl_RD" id="5P" role="37wK5m">
                  <property role="Xl_RC" value="Size" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="5G" role="37wK5m">
              <ref role="3cqZAo" node="5D" resolve="container" />
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
            <node concept="3clFbT" id="5H" role="37wK5m">
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
            <node concept="3clFbT" id="5I" role="37wK5m">
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
            <node concept="3clFbT" id="5J" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="5D" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3uibUv" id="5Q" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="5y" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="3Tm1VV" id="5R" role="1B3o_S">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="10P_77" id="5S" role="3clF45">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="37vLTG" id="5T" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3Tqbb2" id="5Y" role="1tU5fm">
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
        <node concept="37vLTG" id="5U" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3uibUv" id="5Z" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
        <node concept="37vLTG" id="5V" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3uibUv" id="60" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
        <node concept="3clFbS" id="5W" role="3clF47">
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3cpWs8" id="61" role="3cqZAp">
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="3cpWsn" id="64" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="10P_77" id="65" role="1tU5fm">
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
              <node concept="1rXfSq" id="66" role="33vP2m">
                <ref role="37wK5l" node="5z" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="37vLTw" id="67" role="37wK5m">
                  <ref role="3cqZAo" node="5T" resolve="node" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="2YIFZM" id="68" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                  <node concept="37vLTw" id="69" role="37wK5m">
                    <ref role="3cqZAo" node="5U" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="62" role="3cqZAp">
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="3clFbS" id="6a" role="3clFbx">
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="3clFbF" id="6c" role="3cqZAp">
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="2OqwBi" id="6d" role="3clFbG">
                  <uo k="s:originTrace" v="n:874515657862460277" />
                  <node concept="37vLTw" id="6e" role="2Oq$k0">
                    <ref role="3cqZAo" node="5V" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                  <node concept="liA8E" id="6f" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                    <node concept="2ShNRf" id="6g" role="37wK5m">
                      <uo k="s:originTrace" v="n:874515657862460277" />
                      <node concept="1pGfFk" id="6h" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:874515657862460277" />
                        <node concept="Xl_RD" id="6i" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:874515657862460277" />
                        </node>
                        <node concept="Xl_RD" id="6j" role="37wK5m">
                          <property role="Xl_RC" value="874515657862460406" />
                          <uo k="s:originTrace" v="n:874515657862460277" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="6b" role="3clFbw">
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="3y3z36" id="6k" role="3uHU7w">
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="10Nm6u" id="6m" role="3uHU7w">
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="37vLTw" id="6n" role="3uHU7B">
                  <ref role="3cqZAo" node="5V" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
              </node>
              <node concept="3fqX7Q" id="6l" role="3uHU7B">
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="37vLTw" id="6o" role="3fr31v">
                  <ref role="3cqZAo" node="64" resolve="result" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="63" role="3cqZAp">
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="37vLTw" id="6p" role="3clFbG">
              <ref role="3cqZAo" node="64" resolve="result" />
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="5X" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
      </node>
      <node concept="2YIFZL" id="5z" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="37vLTG" id="6q" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3Tqbb2" id="6v" role="1tU5fm">
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
        <node concept="37vLTG" id="6r" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3uibUv" id="6w" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
        <node concept="10P_77" id="6s" role="3clF45">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="3Tm6S6" id="6t" role="1B3o_S">
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="3clFbS" id="6u" role="3clF47">
          <uo k="s:originTrace" v="n:874515657862460407" />
          <node concept="3cpWs6" id="6x" role="3cqZAp">
            <uo k="s:originTrace" v="n:874515657862460703" />
            <node concept="3eOSWO" id="6y" role="3cqZAk">
              <uo k="s:originTrace" v="n:874515657862467089" />
              <node concept="3cmrfG" id="6z" role="3uHU7w">
                <property role="3cmrfH" value="0" />
                <uo k="s:originTrace" v="n:874515657862467356" />
              </node>
              <node concept="2YIFZM" id="6$" role="3uHU7B">
                <ref role="1Pybhc" to="wyt6:~Double" resolve="Double" />
                <ref role="37wK5l" to="wyt6:~Double.valueOf(java.lang.String)" resolve="valueOf" />
                <uo k="s:originTrace" v="n:2144816825578005447" />
                <node concept="37vLTw" id="6_" role="37wK5m">
                  <ref role="3cqZAo" node="6r" resolve="propertyValue" />
                  <uo k="s:originTrace" v="n:2144816825578006791" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="5$" role="1B3o_S">
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
      <node concept="3uibUv" id="5_" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
    </node>
    <node concept="3clFb_" id="5m" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:874515657862460277" />
      <node concept="3Tmbuc" id="6A" role="1B3o_S">
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
      <node concept="3uibUv" id="6B" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="3uibUv" id="6E" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
        <node concept="3uibUv" id="6F" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:874515657862460277" />
        </node>
      </node>
      <node concept="3clFbS" id="6C" role="3clF47">
        <uo k="s:originTrace" v="n:874515657862460277" />
        <node concept="3cpWs8" id="6G" role="3cqZAp">
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="3cpWsn" id="6J" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="3uibUv" id="6K" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="3uibUv" id="6M" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
              <node concept="3uibUv" id="6N" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:874515657862460277" />
              </node>
            </node>
            <node concept="2ShNRf" id="6L" role="33vP2m">
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="1pGfFk" id="6O" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="3uibUv" id="6P" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
                <node concept="3uibUv" id="6Q" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6H" role="3cqZAp">
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="2OqwBi" id="6R" role="3clFbG">
            <uo k="s:originTrace" v="n:874515657862460277" />
            <node concept="37vLTw" id="6S" role="2Oq$k0">
              <ref role="3cqZAo" node="6J" resolve="properties" />
              <uo k="s:originTrace" v="n:874515657862460277" />
            </node>
            <node concept="liA8E" id="6T" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:874515657862460277" />
              <node concept="1BaE9c" id="6U" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="Size$uTGn" />
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="2YIFZM" id="6W" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                  <node concept="1adDum" id="6X" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                  <node concept="1adDum" id="6Y" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                  <node concept="1adDum" id="6Z" role="37wK5m">
                    <property role="1adDun" value="0xad19f946497d8c4L" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                  <node concept="1adDum" id="70" role="37wK5m">
                    <property role="1adDun" value="0x346b31548e5bd369L" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                  <node concept="Xl_RD" id="71" role="37wK5m">
                    <property role="Xl_RC" value="Size" />
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="6V" role="37wK5m">
                <uo k="s:originTrace" v="n:874515657862460277" />
                <node concept="1pGfFk" id="72" role="2ShVmc">
                  <ref role="37wK5l" node="5x" resolve="Farm_Constraints.Size_Property" />
                  <uo k="s:originTrace" v="n:874515657862460277" />
                  <node concept="Xjq3P" id="73" role="37wK5m">
                    <uo k="s:originTrace" v="n:874515657862460277" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="6I" role="3cqZAp">
          <uo k="s:originTrace" v="n:874515657862460277" />
          <node concept="37vLTw" id="74" role="3clFbG">
            <ref role="3cqZAo" node="6J" resolve="properties" />
            <uo k="s:originTrace" v="n:874515657862460277" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6D" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:874515657862460277" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="75">
    <property role="TrG5h" value="Farmer_Constraints" />
    <uo k="s:originTrace" v="n:4813725059249236449" />
    <node concept="3Tm1VV" id="76" role="1B3o_S">
      <uo k="s:originTrace" v="n:4813725059249236449" />
    </node>
    <node concept="3uibUv" id="77" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:4813725059249236449" />
    </node>
    <node concept="3clFbW" id="78" role="jymVt">
      <uo k="s:originTrace" v="n:4813725059249236449" />
      <node concept="3cqZAl" id="7c" role="3clF45">
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
      <node concept="3clFbS" id="7d" role="3clF47">
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="XkiVB" id="7f" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="1BaE9c" id="7g" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Farmer$1W" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="2YIFZM" id="7h" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="1adDum" id="7i" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
              <node concept="1adDum" id="7j" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
              <node concept="1adDum" id="7k" role="37wK5m">
                <property role="1adDun" value="0x346b31548e5bd36cL" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
              <node concept="Xl_RD" id="7l" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Farmer" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="7e" role="1B3o_S">
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
    </node>
    <node concept="2tJIrI" id="79" role="jymVt">
      <uo k="s:originTrace" v="n:4813725059249236449" />
    </node>
    <node concept="312cEu" id="7a" role="jymVt">
      <property role="TrG5h" value="FarmerID_Property" />
      <uo k="s:originTrace" v="n:4813725059249236449" />
      <node concept="3clFbW" id="7m" role="jymVt">
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="3cqZAl" id="7r" role="3clF45">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="3Tm1VV" id="7s" role="1B3o_S">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="3clFbS" id="7t" role="3clF47">
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="XkiVB" id="7v" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="1BaE9c" id="7w" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="FarmerID$iX2e" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="2YIFZM" id="7_" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="1adDum" id="7A" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="1adDum" id="7B" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="1adDum" id="7C" role="37wK5m">
                  <property role="1adDun" value="0x346b31548e5bd36cL" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="1adDum" id="7D" role="37wK5m">
                  <property role="1adDun" value="0x346b31548e5bd36fL" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="Xl_RD" id="7E" role="37wK5m">
                  <property role="Xl_RC" value="FarmerID" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="7x" role="37wK5m">
              <ref role="3cqZAo" node="7u" resolve="container" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
            <node concept="3clFbT" id="7y" role="37wK5m">
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
            <node concept="3clFbT" id="7z" role="37wK5m">
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
            <node concept="3clFbT" id="7$" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="7u" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3uibUv" id="7F" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="7n" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="3Tm1VV" id="7G" role="1B3o_S">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="10P_77" id="7H" role="3clF45">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="37vLTG" id="7I" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3Tqbb2" id="7N" role="1tU5fm">
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
        <node concept="37vLTG" id="7J" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3uibUv" id="7O" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
        <node concept="37vLTG" id="7K" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3uibUv" id="7P" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
        <node concept="3clFbS" id="7L" role="3clF47">
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3cpWs8" id="7Q" role="3cqZAp">
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="3cpWsn" id="7T" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="10P_77" id="7U" role="1tU5fm">
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
              <node concept="1rXfSq" id="7V" role="33vP2m">
                <ref role="37wK5l" node="7o" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="37vLTw" id="7W" role="37wK5m">
                  <ref role="3cqZAo" node="7I" resolve="node" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="2YIFZM" id="7X" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                  <node concept="37vLTw" id="7Y" role="37wK5m">
                    <ref role="3cqZAo" node="7J" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="7R" role="3cqZAp">
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="3clFbS" id="7Z" role="3clFbx">
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="3clFbF" id="81" role="3cqZAp">
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="2OqwBi" id="82" role="3clFbG">
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                  <node concept="37vLTw" id="83" role="2Oq$k0">
                    <ref role="3cqZAo" node="7K" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                  <node concept="liA8E" id="84" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                    <node concept="2ShNRf" id="85" role="37wK5m">
                      <uo k="s:originTrace" v="n:4813725059249236449" />
                      <node concept="1pGfFk" id="86" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:4813725059249236449" />
                        <node concept="Xl_RD" id="87" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:4813725059249236449" />
                        </node>
                        <node concept="Xl_RD" id="88" role="37wK5m">
                          <property role="Xl_RC" value="3598660026872153299" />
                          <uo k="s:originTrace" v="n:4813725059249236449" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="80" role="3clFbw">
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="3y3z36" id="89" role="3uHU7w">
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="10Nm6u" id="8b" role="3uHU7w">
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="37vLTw" id="8c" role="3uHU7B">
                  <ref role="3cqZAo" node="7K" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
              </node>
              <node concept="3fqX7Q" id="8a" role="3uHU7B">
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="37vLTw" id="8d" role="3fr31v">
                  <ref role="3cqZAo" node="7T" resolve="result" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="7S" role="3cqZAp">
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="37vLTw" id="8e" role="3clFbG">
              <ref role="3cqZAo" node="7T" resolve="result" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="7M" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
      </node>
      <node concept="2YIFZL" id="7o" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="37vLTG" id="8f" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3Tqbb2" id="8k" role="1tU5fm">
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
        <node concept="37vLTG" id="8g" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3uibUv" id="8l" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
        <node concept="10P_77" id="8h" role="3clF45">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="3Tm6S6" id="8i" role="1B3o_S">
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="3clFbS" id="8j" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872153300" />
          <node concept="3clFbF" id="8m" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872153607" />
            <node concept="2dkUwp" id="8n" role="3clFbG">
              <uo k="s:originTrace" v="n:3598660026872229216" />
              <node concept="3cmrfG" id="8o" role="3uHU7w">
                <property role="3cmrfH" value="1" />
                <uo k="s:originTrace" v="n:3598660026872229500" />
              </node>
              <node concept="2OqwBi" id="8p" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872219740" />
                <node concept="2OqwBi" id="8q" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:3598660026872190886" />
                  <node concept="2OqwBi" id="8s" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:3598660026872160623" />
                    <node concept="1PxgMI" id="8u" role="2Oq$k0">
                      <uo k="s:originTrace" v="n:3598660026872159439" />
                      <node concept="chp4Y" id="8w" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
                        <uo k="s:originTrace" v="n:3598660026872159739" />
                      </node>
                      <node concept="2OqwBi" id="8x" role="1m5AlR">
                        <uo k="s:originTrace" v="n:3598660026872157269" />
                        <node concept="37vLTw" id="8y" role="2Oq$k0">
                          <ref role="3cqZAo" node="8f" resolve="node" />
                          <uo k="s:originTrace" v="n:3598660026872153606" />
                        </node>
                        <node concept="1mfA1w" id="8z" role="2OqNvi">
                          <uo k="s:originTrace" v="n:3598660026872158714" />
                        </node>
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="8v" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:3hFcliemXdY" resolve="Farmers" />
                      <uo k="s:originTrace" v="n:3598660026872162180" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="8t" role="2OqNvi">
                    <uo k="s:originTrace" v="n:3598660026872209389" />
                    <node concept="1bVj0M" id="8$" role="23t8la">
                      <uo k="s:originTrace" v="n:3598660026872209391" />
                      <node concept="3clFbS" id="8_" role="1bW5cS">
                        <uo k="s:originTrace" v="n:3598660026872209392" />
                        <node concept="3clFbF" id="8B" role="3cqZAp">
                          <uo k="s:originTrace" v="n:3598660026872210222" />
                          <node concept="17R0WA" id="8C" role="3clFbG">
                            <uo k="s:originTrace" v="n:3598660026872216959" />
                            <node concept="37vLTw" id="8D" role="3uHU7w">
                              <ref role="3cqZAo" node="8g" resolve="propertyValue" />
                              <uo k="s:originTrace" v="n:3598660026872217669" />
                            </node>
                            <node concept="2OqwBi" id="8E" role="3uHU7B">
                              <uo k="s:originTrace" v="n:3598660026872211392" />
                              <node concept="37vLTw" id="8F" role="2Oq$k0">
                                <ref role="3cqZAo" node="8A" resolve="it" />
                                <uo k="s:originTrace" v="n:3598660026872210221" />
                              </node>
                              <node concept="3TrcHB" id="8G" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
                                <uo k="s:originTrace" v="n:3598660026872213287" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="8A" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <uo k="s:originTrace" v="n:3598660026872209393" />
                        <node concept="2jxLKc" id="8H" role="1tU5fm">
                          <uo k="s:originTrace" v="n:3598660026872209394" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="8r" role="2OqNvi">
                  <uo k="s:originTrace" v="n:3598660026872222715" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="7p" role="1B3o_S">
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
      <node concept="3uibUv" id="7q" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
    </node>
    <node concept="3clFb_" id="7b" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:4813725059249236449" />
      <node concept="3Tmbuc" id="8I" role="1B3o_S">
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
      <node concept="3uibUv" id="8J" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="3uibUv" id="8M" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
        <node concept="3uibUv" id="8N" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:4813725059249236449" />
        </node>
      </node>
      <node concept="3clFbS" id="8K" role="3clF47">
        <uo k="s:originTrace" v="n:4813725059249236449" />
        <node concept="3cpWs8" id="8O" role="3cqZAp">
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="3cpWsn" id="8R" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="3uibUv" id="8S" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="3uibUv" id="8U" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
              <node concept="3uibUv" id="8V" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
              </node>
            </node>
            <node concept="2ShNRf" id="8T" role="33vP2m">
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="1pGfFk" id="8W" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="3uibUv" id="8X" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
                <node concept="3uibUv" id="8Y" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8P" role="3cqZAp">
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="2OqwBi" id="8Z" role="3clFbG">
            <uo k="s:originTrace" v="n:4813725059249236449" />
            <node concept="37vLTw" id="90" role="2Oq$k0">
              <ref role="3cqZAo" node="8R" resolve="properties" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
            </node>
            <node concept="liA8E" id="91" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:4813725059249236449" />
              <node concept="1BaE9c" id="92" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="FarmerID$iX2e" />
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="2YIFZM" id="94" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                  <node concept="1adDum" id="95" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                  <node concept="1adDum" id="96" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                  <node concept="1adDum" id="97" role="37wK5m">
                    <property role="1adDun" value="0x346b31548e5bd36cL" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                  <node concept="1adDum" id="98" role="37wK5m">
                    <property role="1adDun" value="0x346b31548e5bd36fL" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                  <node concept="Xl_RD" id="99" role="37wK5m">
                    <property role="Xl_RC" value="FarmerID" />
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="93" role="37wK5m">
                <uo k="s:originTrace" v="n:4813725059249236449" />
                <node concept="1pGfFk" id="9a" role="2ShVmc">
                  <ref role="37wK5l" node="7m" resolve="Farmer_Constraints.FarmerID_Property" />
                  <uo k="s:originTrace" v="n:4813725059249236449" />
                  <node concept="Xjq3P" id="9b" role="37wK5m">
                    <uo k="s:originTrace" v="n:4813725059249236449" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="8Q" role="3cqZAp">
          <uo k="s:originTrace" v="n:4813725059249236449" />
          <node concept="37vLTw" id="9c" role="3clFbG">
            <ref role="3cqZAo" node="8R" resolve="properties" />
            <uo k="s:originTrace" v="n:4813725059249236449" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="8L" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:4813725059249236449" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="9d">
    <property role="3GE5qa" value="Gateway" />
    <property role="TrG5h" value="Gateway_Constraints" />
    <uo k="s:originTrace" v="n:3598660026872387979" />
    <node concept="3Tm1VV" id="9e" role="1B3o_S">
      <uo k="s:originTrace" v="n:3598660026872387979" />
    </node>
    <node concept="3uibUv" id="9f" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:3598660026872387979" />
    </node>
    <node concept="3clFbW" id="9g" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872387979" />
      <node concept="3cqZAl" id="9k" role="3clF45">
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
      <node concept="3clFbS" id="9l" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="XkiVB" id="9n" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="1BaE9c" id="9o" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Gateway$e0" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="2YIFZM" id="9p" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="1adDum" id="9q" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
              <node concept="1adDum" id="9r" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
              <node concept="1adDum" id="9s" role="37wK5m">
                <property role="1adDun" value="0x75c7c5f96ef4bafbL" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
              <node concept="Xl_RD" id="9t" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Gateway" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="9m" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
    </node>
    <node concept="2tJIrI" id="9h" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872387979" />
    </node>
    <node concept="312cEu" id="9i" role="jymVt">
      <property role="TrG5h" value="GatewayID_Property" />
      <uo k="s:originTrace" v="n:3598660026872387979" />
      <node concept="3clFbW" id="9u" role="jymVt">
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="3cqZAl" id="9z" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="3Tm1VV" id="9$" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="3clFbS" id="9_" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="XkiVB" id="9B" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="1BaE9c" id="9C" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="GatewayID$E34e" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="2YIFZM" id="9H" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="1adDum" id="9I" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="1adDum" id="9J" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="1adDum" id="9K" role="37wK5m">
                  <property role="1adDun" value="0x75c7c5f96ef4bafbL" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="1adDum" id="9L" role="37wK5m">
                  <property role="1adDun" value="0x75c7c5f96ef4bafeL" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="Xl_RD" id="9M" role="37wK5m">
                  <property role="Xl_RC" value="GatewayID" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="9D" role="37wK5m">
              <ref role="3cqZAo" node="9A" resolve="container" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
            <node concept="3clFbT" id="9E" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
            <node concept="3clFbT" id="9F" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
            <node concept="3clFbT" id="9G" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="9A" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3uibUv" id="9N" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="9v" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="3Tm1VV" id="9O" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="10P_77" id="9P" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="37vLTG" id="9Q" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3Tqbb2" id="9V" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
        <node concept="37vLTG" id="9R" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3uibUv" id="9W" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
        <node concept="37vLTG" id="9S" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3uibUv" id="9X" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
        <node concept="3clFbS" id="9T" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3cpWs8" id="9Y" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="3cpWsn" id="a1" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="10P_77" id="a2" role="1tU5fm">
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
              <node concept="1rXfSq" id="a3" role="33vP2m">
                <ref role="37wK5l" node="9w" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="37vLTw" id="a4" role="37wK5m">
                  <ref role="3cqZAo" node="9Q" resolve="node" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="2YIFZM" id="a5" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                  <node concept="37vLTw" id="a6" role="37wK5m">
                    <ref role="3cqZAo" node="9R" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="9Z" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="3clFbS" id="a7" role="3clFbx">
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="3clFbF" id="a9" role="3cqZAp">
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="2OqwBi" id="aa" role="3clFbG">
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                  <node concept="37vLTw" id="ab" role="2Oq$k0">
                    <ref role="3cqZAo" node="9S" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                  <node concept="liA8E" id="ac" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                    <node concept="2ShNRf" id="ad" role="37wK5m">
                      <uo k="s:originTrace" v="n:3598660026872387979" />
                      <node concept="1pGfFk" id="ae" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:3598660026872387979" />
                        <node concept="Xl_RD" id="af" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:3598660026872387979" />
                        </node>
                        <node concept="Xl_RD" id="ag" role="37wK5m">
                          <property role="Xl_RC" value="3598660026872388086" />
                          <uo k="s:originTrace" v="n:3598660026872387979" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="a8" role="3clFbw">
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="3y3z36" id="ah" role="3uHU7w">
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="10Nm6u" id="aj" role="3uHU7w">
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="37vLTw" id="ak" role="3uHU7B">
                  <ref role="3cqZAo" node="9S" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
              </node>
              <node concept="3fqX7Q" id="ai" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="37vLTw" id="al" role="3fr31v">
                  <ref role="3cqZAo" node="a1" resolve="result" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="a0" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="37vLTw" id="am" role="3clFbG">
              <ref role="3cqZAo" node="a1" resolve="result" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="9U" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
      </node>
      <node concept="2YIFZL" id="9w" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="37vLTG" id="an" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3Tqbb2" id="as" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
        <node concept="37vLTG" id="ao" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3uibUv" id="at" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
        <node concept="10P_77" id="ap" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="3Tm6S6" id="aq" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="3clFbS" id="ar" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872388087" />
          <node concept="3clFbF" id="au" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872388394" />
            <node concept="2dkUwp" id="av" role="3clFbG">
              <uo k="s:originTrace" v="n:3598660026872445740" />
              <node concept="3cmrfG" id="aw" role="3uHU7w">
                <property role="3cmrfH" value="1" />
                <uo k="s:originTrace" v="n:3598660026872445788" />
              </node>
              <node concept="2OqwBi" id="ax" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872435397" />
                <node concept="2OqwBi" id="ay" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:3598660026872402158" />
                  <node concept="2OqwBi" id="a$" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:3598660026872392046" />
                    <node concept="1PxgMI" id="aA" role="2Oq$k0">
                      <uo k="s:originTrace" v="n:3598660026872391335" />
                      <node concept="chp4Y" id="aC" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                        <uo k="s:originTrace" v="n:3598660026872391397" />
                      </node>
                      <node concept="2OqwBi" id="aD" role="1m5AlR">
                        <uo k="s:originTrace" v="n:3598660026872389267" />
                        <node concept="37vLTw" id="aE" role="2Oq$k0">
                          <ref role="3cqZAo" node="an" resolve="node" />
                          <uo k="s:originTrace" v="n:3598660026872388393" />
                        </node>
                        <node concept="1mfA1w" id="aF" role="2OqNvi">
                          <uo k="s:originTrace" v="n:3598660026872390533" />
                        </node>
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="aB" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:4NgPXVj2LzF" resolve="Gateways" />
                      <uo k="s:originTrace" v="n:3598660026872393594" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="a_" role="2OqNvi">
                    <uo k="s:originTrace" v="n:3598660026872425867" />
                    <node concept="1bVj0M" id="aG" role="23t8la">
                      <uo k="s:originTrace" v="n:3598660026872425869" />
                      <node concept="3clFbS" id="aH" role="1bW5cS">
                        <uo k="s:originTrace" v="n:3598660026872425870" />
                        <node concept="3clFbF" id="aJ" role="3cqZAp">
                          <uo k="s:originTrace" v="n:3598660026872426904" />
                          <node concept="17R0WA" id="aK" role="3clFbG">
                            <uo k="s:originTrace" v="n:3598660026872433958" />
                            <node concept="37vLTw" id="aL" role="3uHU7w">
                              <ref role="3cqZAo" node="ao" resolve="propertyValue" />
                              <uo k="s:originTrace" v="n:3598660026872434433" />
                            </node>
                            <node concept="2OqwBi" id="aM" role="3uHU7B">
                              <uo k="s:originTrace" v="n:3598660026872428074" />
                              <node concept="37vLTw" id="aN" role="2Oq$k0">
                                <ref role="3cqZAo" node="aI" resolve="it" />
                                <uo k="s:originTrace" v="n:3598660026872426903" />
                              </node>
                              <node concept="3TrcHB" id="aO" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:7n7Lv_IXbFY" resolve="GatewayID" />
                                <uo k="s:originTrace" v="n:3598660026872430566" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="aI" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <uo k="s:originTrace" v="n:3598660026872425871" />
                        <node concept="2jxLKc" id="aP" role="1tU5fm">
                          <uo k="s:originTrace" v="n:3598660026872425872" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="az" role="2OqNvi">
                  <uo k="s:originTrace" v="n:3598660026872438659" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="9x" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
      <node concept="3uibUv" id="9y" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
    </node>
    <node concept="3clFb_" id="9j" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:3598660026872387979" />
      <node concept="3Tmbuc" id="aQ" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
      <node concept="3uibUv" id="aR" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="3uibUv" id="aU" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
        <node concept="3uibUv" id="aV" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872387979" />
        </node>
      </node>
      <node concept="3clFbS" id="aS" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872387979" />
        <node concept="3cpWs8" id="aW" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="3cpWsn" id="aZ" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="3uibUv" id="b0" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="3uibUv" id="b2" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
              <node concept="3uibUv" id="b3" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
              </node>
            </node>
            <node concept="2ShNRf" id="b1" role="33vP2m">
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="1pGfFk" id="b4" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="3uibUv" id="b5" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
                <node concept="3uibUv" id="b6" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aX" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="2OqwBi" id="b7" role="3clFbG">
            <uo k="s:originTrace" v="n:3598660026872387979" />
            <node concept="37vLTw" id="b8" role="2Oq$k0">
              <ref role="3cqZAo" node="aZ" resolve="properties" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
            </node>
            <node concept="liA8E" id="b9" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:3598660026872387979" />
              <node concept="1BaE9c" id="ba" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="GatewayID$E34e" />
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="2YIFZM" id="bc" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                  <node concept="1adDum" id="bd" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                  <node concept="1adDum" id="be" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                  <node concept="1adDum" id="bf" role="37wK5m">
                    <property role="1adDun" value="0x75c7c5f96ef4bafbL" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                  <node concept="1adDum" id="bg" role="37wK5m">
                    <property role="1adDun" value="0x75c7c5f96ef4bafeL" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                  <node concept="Xl_RD" id="bh" role="37wK5m">
                    <property role="Xl_RC" value="GatewayID" />
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="bb" role="37wK5m">
                <uo k="s:originTrace" v="n:3598660026872387979" />
                <node concept="1pGfFk" id="bi" role="2ShVmc">
                  <ref role="37wK5l" node="9u" resolve="Gateway_Constraints.GatewayID_Property" />
                  <uo k="s:originTrace" v="n:3598660026872387979" />
                  <node concept="Xjq3P" id="bj" role="37wK5m">
                    <uo k="s:originTrace" v="n:3598660026872387979" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="aY" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872387979" />
          <node concept="37vLTw" id="bk" role="3clFbG">
            <ref role="3cqZAo" node="aZ" resolve="properties" />
            <uo k="s:originTrace" v="n:3598660026872387979" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="aT" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3598660026872387979" />
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="bl">
    <node concept="39e2AJ" id="bm" role="39e2AI">
      <property role="39e3Y2" value="aspectDescriptorClass" />
      <node concept="39e2AG" id="bn" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="bo" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="ConstraintsAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="bp">
    <property role="3GE5qa" value="Device" />
    <property role="TrG5h" value="Sensor_Constraints" />
    <uo k="s:originTrace" v="n:2144816825579222003" />
    <node concept="3Tm1VV" id="bq" role="1B3o_S">
      <uo k="s:originTrace" v="n:2144816825579222003" />
    </node>
    <node concept="3uibUv" id="br" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:2144816825579222003" />
    </node>
    <node concept="3clFbW" id="bs" role="jymVt">
      <uo k="s:originTrace" v="n:2144816825579222003" />
      <node concept="3cqZAl" id="bw" role="3clF45">
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
      <node concept="3clFbS" id="bx" role="3clF47">
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="XkiVB" id="bz" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="1BaE9c" id="b$" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Sensor$u2" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="2YIFZM" id="b_" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="1adDum" id="bA" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
              <node concept="1adDum" id="bB" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
              <node concept="1adDum" id="bC" role="37wK5m">
                <property role="1adDun" value="0x4cd0d7ded3049b6dL" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
              <node concept="Xl_RD" id="bD" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Sensor" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="by" role="1B3o_S">
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
    </node>
    <node concept="2tJIrI" id="bt" role="jymVt">
      <uo k="s:originTrace" v="n:2144816825579222003" />
    </node>
    <node concept="312cEu" id="bu" role="jymVt">
      <property role="TrG5h" value="Value_Property" />
      <uo k="s:originTrace" v="n:2144816825579222003" />
      <node concept="3clFbW" id="bE" role="jymVt">
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="3cqZAl" id="bJ" role="3clF45">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="3Tm1VV" id="bK" role="1B3o_S">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="3clFbS" id="bL" role="3clF47">
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="XkiVB" id="bN" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="1BaE9c" id="bO" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="Value$k4Ig" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="2YIFZM" id="bT" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="1adDum" id="bU" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="1adDum" id="bV" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="1adDum" id="bW" role="37wK5m">
                  <property role="1adDun" value="0x4cd0d7ded3049b6dL" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="1adDum" id="bX" role="37wK5m">
                  <property role="1adDun" value="0x4cd0d7ded3053f07L" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="Xl_RD" id="bY" role="37wK5m">
                  <property role="Xl_RC" value="Value" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="bP" role="37wK5m">
              <ref role="3cqZAo" node="bM" resolve="container" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
            <node concept="3clFbT" id="bQ" role="37wK5m">
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
            <node concept="3clFbT" id="bR" role="37wK5m">
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
            <node concept="3clFbT" id="bS" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="bM" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3uibUv" id="bZ" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="bF" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="3Tm1VV" id="c0" role="1B3o_S">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="10P_77" id="c1" role="3clF45">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="37vLTG" id="c2" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3Tqbb2" id="c7" role="1tU5fm">
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
        <node concept="37vLTG" id="c3" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3uibUv" id="c8" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
        <node concept="37vLTG" id="c4" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3uibUv" id="c9" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
        <node concept="3clFbS" id="c5" role="3clF47">
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3cpWs8" id="ca" role="3cqZAp">
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="3cpWsn" id="cd" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="10P_77" id="ce" role="1tU5fm">
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
              <node concept="1rXfSq" id="cf" role="33vP2m">
                <ref role="37wK5l" node="bG" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="37vLTw" id="cg" role="37wK5m">
                  <ref role="3cqZAo" node="c2" resolve="node" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="2YIFZM" id="ch" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                  <node concept="37vLTw" id="ci" role="37wK5m">
                    <ref role="3cqZAo" node="c3" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="cb" role="3cqZAp">
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="3clFbS" id="cj" role="3clFbx">
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="3clFbF" id="cl" role="3cqZAp">
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="2OqwBi" id="cm" role="3clFbG">
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                  <node concept="37vLTw" id="cn" role="2Oq$k0">
                    <ref role="3cqZAo" node="c4" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                  <node concept="liA8E" id="co" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                    <node concept="2ShNRf" id="cp" role="37wK5m">
                      <uo k="s:originTrace" v="n:2144816825579222003" />
                      <node concept="1pGfFk" id="cq" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:2144816825579222003" />
                        <node concept="Xl_RD" id="cr" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:2144816825579222003" />
                        </node>
                        <node concept="Xl_RD" id="cs" role="37wK5m">
                          <property role="Xl_RC" value="2144816825579222110" />
                          <uo k="s:originTrace" v="n:2144816825579222003" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="ck" role="3clFbw">
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="3y3z36" id="ct" role="3uHU7w">
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="10Nm6u" id="cv" role="3uHU7w">
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="37vLTw" id="cw" role="3uHU7B">
                  <ref role="3cqZAo" node="c4" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
              </node>
              <node concept="3fqX7Q" id="cu" role="3uHU7B">
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="37vLTw" id="cx" role="3fr31v">
                  <ref role="3cqZAo" node="cd" resolve="result" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="cc" role="3cqZAp">
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="37vLTw" id="cy" role="3clFbG">
              <ref role="3cqZAo" node="cd" resolve="result" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="c6" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
      </node>
      <node concept="2YIFZL" id="bG" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="37vLTG" id="cz" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3Tqbb2" id="cC" role="1tU5fm">
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
        <node concept="37vLTG" id="c$" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3uibUv" id="cD" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
        <node concept="10P_77" id="c_" role="3clF45">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="3Tm6S6" id="cA" role="1B3o_S">
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="3clFbS" id="cB" role="3clF47">
          <uo k="s:originTrace" v="n:2144816825579222111" />
          <node concept="3clFbJ" id="cE" role="3cqZAp">
            <uo k="s:originTrace" v="n:2144816825579222185" />
            <node concept="3y3z36" id="cF" role="3clFbw">
              <uo k="s:originTrace" v="n:2144816825579945982" />
              <node concept="2OqwBi" id="cI" role="3uHU7B">
                <uo k="s:originTrace" v="n:2144816825579233515" />
                <node concept="37vLTw" id="cK" role="2Oq$k0">
                  <ref role="3cqZAo" node="cz" resolve="node" />
                  <uo k="s:originTrace" v="n:2144816825579222216" />
                </node>
                <node concept="3TrcHB" id="cL" role="2OqNvi">
                  <ref role="3TsBF5" to="gv5y:4NgPXVj1jfm" resolve="Type" />
                  <uo k="s:originTrace" v="n:2144816825579234897" />
                </node>
              </node>
              <node concept="2OqwBi" id="cJ" role="3uHU7w">
                <uo k="s:originTrace" v="n:2144816825579962024" />
                <node concept="2OqwBi" id="cM" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:2144816825579955286" />
                  <node concept="1XH99k" id="cO" role="2Oq$k0">
                    <ref role="1XH99l" to="gv5y:4NgPXVj1bmI" resolve="SensorType" />
                    <uo k="s:originTrace" v="n:2144816825579952593" />
                  </node>
                  <node concept="2ViDtN" id="cP" role="2OqNvi">
                    <uo k="s:originTrace" v="n:2144816825579957059" />
                  </node>
                </node>
                <node concept="34jXtK" id="cN" role="2OqNvi">
                  <uo k="s:originTrace" v="n:2144816825579969279" />
                  <node concept="3cmrfG" id="cQ" role="25WWJ7">
                    <property role="3cmrfH" value="0" />
                    <uo k="s:originTrace" v="n:2144816825580283598" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="cG" role="3clFbx">
              <uo k="s:originTrace" v="n:2144816825579222187" />
              <node concept="3clFbF" id="cR" role="3cqZAp">
                <uo k="s:originTrace" v="n:2144816825579263907" />
                <node concept="2d3UOw" id="cS" role="3clFbG">
                  <uo k="s:originTrace" v="n:2144816825579316367" />
                  <node concept="2YIFZM" id="cT" role="3uHU7B">
                    <ref role="37wK5l" to="wyt6:~Double.valueOf(java.lang.String)" resolve="valueOf" />
                    <ref role="1Pybhc" to="wyt6:~Double" resolve="Double" />
                    <uo k="s:originTrace" v="n:2144816825579281414" />
                    <node concept="37vLTw" id="cV" role="37wK5m">
                      <ref role="3cqZAo" node="c$" resolve="propertyValue" />
                      <uo k="s:originTrace" v="n:2144816825579282795" />
                    </node>
                  </node>
                  <node concept="3cmrfG" id="cU" role="3uHU7w">
                    <property role="3cmrfH" value="0" />
                    <uo k="s:originTrace" v="n:2144816825579267693" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="9aQIb" id="cH" role="9aQIa">
              <uo k="s:originTrace" v="n:2144816825579939685" />
              <node concept="3clFbS" id="cW" role="9aQI4">
                <uo k="s:originTrace" v="n:2144816825579939686" />
                <node concept="3cpWs6" id="cX" role="3cqZAp">
                  <uo k="s:originTrace" v="n:2144816825579942018" />
                  <node concept="3clFbT" id="cY" role="3cqZAk">
                    <property role="3clFbU" value="true" />
                    <uo k="s:originTrace" v="n:2144816825579944421" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="bH" role="1B3o_S">
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
      <node concept="3uibUv" id="bI" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
    </node>
    <node concept="3clFb_" id="bv" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:2144816825579222003" />
      <node concept="3Tmbuc" id="cZ" role="1B3o_S">
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
      <node concept="3uibUv" id="d0" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="3uibUv" id="d3" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
        <node concept="3uibUv" id="d4" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:2144816825579222003" />
        </node>
      </node>
      <node concept="3clFbS" id="d1" role="3clF47">
        <uo k="s:originTrace" v="n:2144816825579222003" />
        <node concept="3cpWs8" id="d5" role="3cqZAp">
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="3cpWsn" id="d8" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="3uibUv" id="d9" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="3uibUv" id="db" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
              <node concept="3uibUv" id="dc" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
              </node>
            </node>
            <node concept="2ShNRf" id="da" role="33vP2m">
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="1pGfFk" id="dd" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="3uibUv" id="de" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
                <node concept="3uibUv" id="df" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d6" role="3cqZAp">
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="2OqwBi" id="dg" role="3clFbG">
            <uo k="s:originTrace" v="n:2144816825579222003" />
            <node concept="37vLTw" id="dh" role="2Oq$k0">
              <ref role="3cqZAo" node="d8" resolve="properties" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
            </node>
            <node concept="liA8E" id="di" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:2144816825579222003" />
              <node concept="1BaE9c" id="dj" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="Value$k4Ig" />
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="2YIFZM" id="dl" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                  <node concept="1adDum" id="dm" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                  <node concept="1adDum" id="dn" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                  <node concept="1adDum" id="do" role="37wK5m">
                    <property role="1adDun" value="0x4cd0d7ded3049b6dL" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                  <node concept="1adDum" id="dp" role="37wK5m">
                    <property role="1adDun" value="0x4cd0d7ded3053f07L" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                  <node concept="Xl_RD" id="dq" role="37wK5m">
                    <property role="Xl_RC" value="Value" />
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="dk" role="37wK5m">
                <uo k="s:originTrace" v="n:2144816825579222003" />
                <node concept="1pGfFk" id="dr" role="2ShVmc">
                  <ref role="37wK5l" node="bE" resolve="Sensor_Constraints.Value_Property" />
                  <uo k="s:originTrace" v="n:2144816825579222003" />
                  <node concept="Xjq3P" id="ds" role="37wK5m">
                    <uo k="s:originTrace" v="n:2144816825579222003" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="d7" role="3cqZAp">
          <uo k="s:originTrace" v="n:2144816825579222003" />
          <node concept="37vLTw" id="dt" role="3clFbG">
            <ref role="3cqZAo" node="d8" resolve="properties" />
            <uo k="s:originTrace" v="n:2144816825579222003" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="d2" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:2144816825579222003" />
      </node>
    </node>
  </node>
  <node concept="312cEu" id="du">
    <property role="3GE5qa" value="Service" />
    <property role="TrG5h" value="Service_Constraints" />
    <uo k="s:originTrace" v="n:3598660026872449704" />
    <node concept="3Tm1VV" id="dv" role="1B3o_S">
      <uo k="s:originTrace" v="n:3598660026872449704" />
    </node>
    <node concept="3uibUv" id="dw" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:3598660026872449704" />
    </node>
    <node concept="3clFbW" id="dx" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872449704" />
      <node concept="3cqZAl" id="d_" role="3clF45">
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
      <node concept="3clFbS" id="dA" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="XkiVB" id="dC" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="1BaE9c" id="dD" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Service$3A" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="2YIFZM" id="dE" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="1adDum" id="dF" role="37wK5m">
                <property role="1adDun" value="0x5284d1bee3634c06L" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
              <node concept="1adDum" id="dG" role="37wK5m">
                <property role="1adDun" value="0xa2364161e9028c0dL" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
              <node concept="1adDum" id="dH" role="37wK5m">
                <property role="1adDun" value="0x6813e10dbb9625c4L" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
              <node concept="Xl_RD" id="dI" role="37wK5m">
                <property role="Xl_RC" value="SmartFarming.structure.Service" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="dB" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
    </node>
    <node concept="2tJIrI" id="dy" role="jymVt">
      <uo k="s:originTrace" v="n:3598660026872449704" />
    </node>
    <node concept="312cEu" id="dz" role="jymVt">
      <property role="TrG5h" value="ServiceID_Property" />
      <uo k="s:originTrace" v="n:3598660026872449704" />
      <node concept="3clFbW" id="dJ" role="jymVt">
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="3cqZAl" id="dO" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="3Tm1VV" id="dP" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="3clFbS" id="dQ" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="XkiVB" id="dS" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="1BaE9c" id="dT" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="ServiceID$AzIB" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="2YIFZM" id="dY" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="1adDum" id="dZ" role="37wK5m">
                  <property role="1adDun" value="0x5284d1bee3634c06L" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="1adDum" id="e0" role="37wK5m">
                  <property role="1adDun" value="0xa2364161e9028c0dL" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="1adDum" id="e1" role="37wK5m">
                  <property role="1adDun" value="0x6813e10dbb9625c4L" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="1adDum" id="e2" role="37wK5m">
                  <property role="1adDun" value="0x6813e10dbb9625cbL" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="Xl_RD" id="e3" role="37wK5m">
                  <property role="Xl_RC" value="ServiceID" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="dU" role="37wK5m">
              <ref role="3cqZAo" node="dR" resolve="container" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
            <node concept="3clFbT" id="dV" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
            <node concept="3clFbT" id="dW" role="37wK5m">
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
            <node concept="3clFbT" id="dX" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="dR" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3uibUv" id="e4" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="dK" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="3Tm1VV" id="e5" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="10P_77" id="e6" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="37vLTG" id="e7" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3Tqbb2" id="ec" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
        <node concept="37vLTG" id="e8" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3uibUv" id="ed" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
        <node concept="37vLTG" id="e9" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3uibUv" id="ee" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
        <node concept="3clFbS" id="ea" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3cpWs8" id="ef" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="3cpWsn" id="ei" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="10P_77" id="ej" role="1tU5fm">
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
              <node concept="1rXfSq" id="ek" role="33vP2m">
                <ref role="37wK5l" node="dL" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="37vLTw" id="el" role="37wK5m">
                  <ref role="3cqZAo" node="e7" resolve="node" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="2YIFZM" id="em" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRhWnm" resolve="castString" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                  <node concept="37vLTw" id="en" role="37wK5m">
                    <ref role="3cqZAo" node="e8" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="eg" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="3clFbS" id="eo" role="3clFbx">
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="3clFbF" id="eq" role="3cqZAp">
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="2OqwBi" id="er" role="3clFbG">
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                  <node concept="37vLTw" id="es" role="2Oq$k0">
                    <ref role="3cqZAo" node="e9" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                  <node concept="liA8E" id="et" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                    <node concept="2ShNRf" id="eu" role="37wK5m">
                      <uo k="s:originTrace" v="n:3598660026872449704" />
                      <node concept="1pGfFk" id="ev" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:3598660026872449704" />
                        <node concept="Xl_RD" id="ew" role="37wK5m">
                          <property role="Xl_RC" value="r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)" />
                          <uo k="s:originTrace" v="n:3598660026872449704" />
                        </node>
                        <node concept="Xl_RD" id="ex" role="37wK5m">
                          <property role="Xl_RC" value="3598660026872449811" />
                          <uo k="s:originTrace" v="n:3598660026872449704" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="ep" role="3clFbw">
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="3y3z36" id="ey" role="3uHU7w">
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="10Nm6u" id="e$" role="3uHU7w">
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="37vLTw" id="e_" role="3uHU7B">
                  <ref role="3cqZAo" node="e9" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
              </node>
              <node concept="3fqX7Q" id="ez" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="37vLTw" id="eA" role="3fr31v">
                  <ref role="3cqZAo" node="ei" resolve="result" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="eh" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="37vLTw" id="eB" role="3clFbG">
              <ref role="3cqZAo" node="ei" resolve="result" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="eb" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
      </node>
      <node concept="2YIFZL" id="dL" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="37vLTG" id="eC" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3Tqbb2" id="eH" role="1tU5fm">
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
        <node concept="37vLTG" id="eD" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3uibUv" id="eI" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~String" resolve="String" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
        <node concept="10P_77" id="eE" role="3clF45">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="3Tm6S6" id="eF" role="1B3o_S">
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="3clFbS" id="eG" role="3clF47">
          <uo k="s:originTrace" v="n:3598660026872449812" />
          <node concept="3clFbF" id="eJ" role="3cqZAp">
            <uo k="s:originTrace" v="n:3598660026872450119" />
            <node concept="2dkUwp" id="eK" role="3clFbG">
              <uo k="s:originTrace" v="n:3598660026872505431" />
              <node concept="3cmrfG" id="eL" role="3uHU7w">
                <property role="3cmrfH" value="1" />
                <uo k="s:originTrace" v="n:3598660026872505479" />
              </node>
              <node concept="2OqwBi" id="eM" role="3uHU7B">
                <uo k="s:originTrace" v="n:3598660026872494034" />
                <node concept="2OqwBi" id="eN" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:3598660026872462920" />
                  <node concept="2OqwBi" id="eP" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:3598660026872453450" />
                    <node concept="1PxgMI" id="eR" role="2Oq$k0">
                      <uo k="s:originTrace" v="n:3598660026872452742" />
                      <node concept="chp4Y" id="eT" role="3oSUPX">
                        <ref role="cht4Q" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
                        <uo k="s:originTrace" v="n:3598660026872452804" />
                      </node>
                      <node concept="2OqwBi" id="eU" role="1m5AlR">
                        <uo k="s:originTrace" v="n:3598660026872450992" />
                        <node concept="37vLTw" id="eV" role="2Oq$k0">
                          <ref role="3cqZAo" node="eC" resolve="node" />
                          <uo k="s:originTrace" v="n:3598660026872450118" />
                        </node>
                        <node concept="1mfA1w" id="eW" role="2OqNvi">
                          <uo k="s:originTrace" v="n:3598660026872451966" />
                        </node>
                      </node>
                    </node>
                    <node concept="3Tsc0h" id="eS" role="2OqNvi">
                      <ref role="3TtcxE" to="gv5y:6wjSgQVAhDe" resolve="Services" />
                      <uo k="s:originTrace" v="n:3598660026872454998" />
                    </node>
                  </node>
                  <node concept="3zZkjj" id="eQ" role="2OqNvi">
                    <uo k="s:originTrace" v="n:3598660026872479192" />
                    <node concept="1bVj0M" id="eX" role="23t8la">
                      <uo k="s:originTrace" v="n:3598660026872479194" />
                      <node concept="3clFbS" id="eY" role="1bW5cS">
                        <uo k="s:originTrace" v="n:3598660026872479195" />
                        <node concept="3clFbF" id="f0" role="3cqZAp">
                          <uo k="s:originTrace" v="n:3598660026872480021" />
                          <node concept="17R0WA" id="f1" role="3clFbG">
                            <uo k="s:originTrace" v="n:3598660026872492450" />
                            <node concept="37vLTw" id="f2" role="3uHU7w">
                              <ref role="3cqZAo" node="eD" resolve="propertyValue" />
                              <uo k="s:originTrace" v="n:3598660026872492925" />
                            </node>
                            <node concept="2OqwBi" id="f3" role="3uHU7B">
                              <uo k="s:originTrace" v="n:3598660026872481191" />
                              <node concept="37vLTw" id="f4" role="2Oq$k0">
                                <ref role="3cqZAo" node="eZ" resolve="it" />
                                <uo k="s:originTrace" v="n:3598660026872480020" />
                              </node>
                              <node concept="3TrcHB" id="f5" role="2OqNvi">
                                <ref role="3TsBF5" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
                                <uo k="s:originTrace" v="n:3598660026872483882" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="Rh6nW" id="eZ" role="1bW2Oz">
                        <property role="TrG5h" value="it" />
                        <uo k="s:originTrace" v="n:3598660026872479196" />
                        <node concept="2jxLKc" id="f6" role="1tU5fm">
                          <uo k="s:originTrace" v="n:3598660026872479197" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="34oBXx" id="eO" role="2OqNvi">
                  <uo k="s:originTrace" v="n:3598660026872497730" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="dM" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
      <node concept="3uibUv" id="dN" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
    </node>
    <node concept="3clFb_" id="d$" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:3598660026872449704" />
      <node concept="3Tmbuc" id="f7" role="1B3o_S">
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
      <node concept="3uibUv" id="f8" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="3uibUv" id="fb" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
        <node concept="3uibUv" id="fc" role="11_B2D">
          <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:3598660026872449704" />
        </node>
      </node>
      <node concept="3clFbS" id="f9" role="3clF47">
        <uo k="s:originTrace" v="n:3598660026872449704" />
        <node concept="3cpWs8" id="fd" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="3cpWsn" id="fg" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="3uibUv" id="fh" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="3uibUv" id="fj" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
              <node concept="3uibUv" id="fk" role="11_B2D">
                <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
              </node>
            </node>
            <node concept="2ShNRf" id="fi" role="33vP2m">
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="1pGfFk" id="fl" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="3uibUv" id="fm" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
                <node concept="3uibUv" id="fn" role="1pMfVU">
                  <ref role="3uigEE" to="ze1i:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="fe" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="2OqwBi" id="fo" role="3clFbG">
            <uo k="s:originTrace" v="n:3598660026872449704" />
            <node concept="37vLTw" id="fp" role="2Oq$k0">
              <ref role="3cqZAo" node="fg" resolve="properties" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
            </node>
            <node concept="liA8E" id="fq" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:3598660026872449704" />
              <node concept="1BaE9c" id="fr" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="ServiceID$AzIB" />
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="2YIFZM" id="ft" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                  <node concept="1adDum" id="fu" role="37wK5m">
                    <property role="1adDun" value="0x5284d1bee3634c06L" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                  <node concept="1adDum" id="fv" role="37wK5m">
                    <property role="1adDun" value="0xa2364161e9028c0dL" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                  <node concept="1adDum" id="fw" role="37wK5m">
                    <property role="1adDun" value="0x6813e10dbb9625c4L" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                  <node concept="1adDum" id="fx" role="37wK5m">
                    <property role="1adDun" value="0x6813e10dbb9625cbL" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                  <node concept="Xl_RD" id="fy" role="37wK5m">
                    <property role="Xl_RC" value="ServiceID" />
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="fs" role="37wK5m">
                <uo k="s:originTrace" v="n:3598660026872449704" />
                <node concept="1pGfFk" id="fz" role="2ShVmc">
                  <ref role="37wK5l" node="dJ" resolve="Service_Constraints.ServiceID_Property" />
                  <uo k="s:originTrace" v="n:3598660026872449704" />
                  <node concept="Xjq3P" id="f$" role="37wK5m">
                    <uo k="s:originTrace" v="n:3598660026872449704" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="ff" role="3cqZAp">
          <uo k="s:originTrace" v="n:3598660026872449704" />
          <node concept="37vLTw" id="f_" role="3clFbG">
            <ref role="3cqZAo" node="fg" resolve="properties" />
            <uo k="s:originTrace" v="n:3598660026872449704" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="fa" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:3598660026872449704" />
      </node>
    </node>
  </node>
</model>

