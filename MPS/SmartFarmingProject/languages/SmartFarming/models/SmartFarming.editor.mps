<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:14c2bc34-22c8-45b2-826b-1fc9af5784bf(SmartFarming.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="gv5y" ref="r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3hFclien4O6">
    <ref role="1XX52x" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
    <node concept="3EZMnI" id="3hFclien4O8" role="2wV5jI">
      <node concept="l2Vlx" id="3hFclien4O9" role="2iSdaV" />
      <node concept="3F0ifn" id="6LCgsI8fsgS" role="3EZMnx">
        <property role="3F0ifm" value="START Farm" />
        <node concept="VechU" id="KyTPI1i_TN" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="3hFclien4Ob" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1i_Uf" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8ft3L" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="ljvvj" id="6LCgsI8ft4F" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3hFclien4Of" role="3EZMnx">
        <node concept="3F0ifn" id="7n7Lv_IWIzJ" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI1i_UF" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="l2Vlx" id="3hFclien4Og" role="2iSdaV" />
        <node concept="lj46D" id="3hFclien4Oh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIMP" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWIQt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIL6" role="3EZMnx">
          <property role="3F0ifm" value="Location:" />
          <node concept="lj46D" id="7n7Lv_IWIQv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1i_Va" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsNv3u" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWIMb" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdB" resolve="Location" />
          <node concept="11L4FC" id="KyTPI1pq8c" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1pq8h" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIMn" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWIRE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIR9" role="3EZMnx">
          <property role="3F0ifm" value="Size:" />
          <node concept="lj46D" id="7n7Lv_IWIRG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1i_VF" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWIRt" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdD" resolve="Size" />
        </node>
        <node concept="3F0ifn" id="KyTPI1pq97" role="3EZMnx">
          <property role="3F0ifm" value="sqm" />
          <node concept="ljvvj" id="KyTPI1qbdL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIRV" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="7n7Lv_IWIT8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWITL" role="3EZMnx">
          <property role="3F0ifm" value="IOT_SYSTEM:" />
          <node concept="VechU" id="KyTPI1i_W9" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8fsmN" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6LCgsI8fsny" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="6LCgsI8gFOh" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IWIMu" resolve="IoTSystems" />
          <node concept="ljvvj" id="6LCgsI8gFQm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6LCgsI8gFQo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJQB" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="6LCgsI8fsn$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJXh" role="3EZMnx">
          <property role="3F0ifm" value="FARMERS:" />
          <node concept="VechU" id="KyTPI1i_W_" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8fsLy" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6LCgsI8fsMi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7n7Lv_IWJZm" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdY" resolve="Farmers" />
          <node concept="l2Vlx" id="7n7Lv_IWJZo" role="2czzBx" />
          <node concept="ljvvj" id="7n7Lv_IWK8L" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7n7Lv_IWK9Y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWK9o" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="6LCgsI8fsN0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKi0" role="3EZMnx">
          <property role="3F0ifm" value="CROP:" />
          <node concept="VechU" id="KyTPI1i_X1" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKjT" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWKlb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7n7Lv_IWKmv" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXeu" resolve="Crops" />
          <node concept="l2Vlx" id="7n7Lv_IWKmx" role="2czzBx" />
          <node concept="ljvvj" id="7n7Lv_IWKnc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6LCgsI8fsP6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKnV" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWIQN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8fsSV" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1i_Xt" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8fsUG" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1i_XT" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3hFclientf8">
    <ref role="1XX52x" to="gv5y:3hFcliemXdG" resolve="Farmer" />
    <node concept="3EZMnI" id="3hFclientf$" role="2wV5jI">
      <node concept="l2Vlx" id="3hFclientf_" role="2iSdaV" />
      <node concept="3F0ifn" id="6LCgsI8fsPI" role="3EZMnx">
        <property role="3F0ifm" value="START Farmer" />
        <node concept="VechU" id="KyTPI1jlA7" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="3hFclientfB" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1jlAz" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="3hFclientfC" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="3hFclientfD" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3hFclientfE" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3hFclientfF" role="3EZMnx">
        <node concept="l2Vlx" id="3hFclientfG" role="2iSdaV" />
        <node concept="lj46D" id="3hFclientfH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIZf" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI1jlAZ" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIZN" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJ0w" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfI" role="3EZMnx">
          <property role="3F0ifm" value="Farmer_ID" />
          <node concept="lj46D" id="7n7Lv_IWJ0y" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlBu" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfJ" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
          <node concept="11L4FC" id="3hFclientfK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfL" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
          <node concept="11L4FC" id="KyTPI1pqcV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1pqd0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ6G" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWJ75" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfN" role="3EZMnx">
          <property role="3F0ifm" value="Email" />
          <node concept="lj46D" id="7n7Lv_IWJ0$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlBZ" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfO" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
          <node concept="11L4FC" id="3hFclientfP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfQ" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdL" resolve="Email" />
          <node concept="11L4FC" id="KyTPI1syQw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1syQ_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ8m" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWJa3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfS" role="3EZMnx">
          <property role="3F0ifm" value="Phone_Number" />
          <node concept="lj46D" id="7n7Lv_IWJ0A" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlCw" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJpu" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
        </node>
        <node concept="3F0A7n" id="3hFclientfV" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdO" resolve="PhoneNumber" />
          <node concept="11L4FC" id="KyTPI1syPz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1syPC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJrd" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IWJNU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ0Z" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="7n7Lv_IWJtM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMxI1" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
          <node concept="VechU" id="KyTPI1jlCY" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMxIV" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="51oAUbsMxLb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMxMa" role="3EZMnx">
          <property role="3F0ifm" value="Operates(" />
          <node concept="lj46D" id="51oAUbsMxNS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlDt" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F2HdR" id="51oAUbsMOIv" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:51oAUbsMxH6" resolve="Services" />
          <node concept="l2Vlx" id="51oAUbsMOIx" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="51oAUbsMxOr" role="3EZMnx">
          <property role="3F0ifm" value=")" />
          <node concept="ljvvj" id="51oAUbsMxQ2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlDY" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMxPv" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="51oAUbsO15l" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3hFclientfX" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="3mYdg7" id="3hFclientfY" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="VechU" id="KyTPI1n6O4" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8fsWb" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="51oAUbsO15n" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="VechU" id="KyTPI1n6O_" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="51oAUbsOxJT" role="3EZMnx" />
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IWJac">
    <ref role="1XX52x" to="gv5y:3hFcliemXe4" resolve="Crop" />
    <node concept="3EZMnI" id="7n7Lv_IWJaC" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IWJaD" role="2iSdaV" />
      <node concept="3F0ifn" id="6LCgsI8fta7" role="3EZMnx">
        <property role="3F0ifm" value="START Crop" />
        <node concept="VechU" id="KyTPI1jlxy" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="7n7Lv_IWJaF" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1jlxY" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJaG" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="7n7Lv_IWJaH" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWJaI" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7n7Lv_IWJaJ" role="3EZMnx">
        <node concept="l2Vlx" id="7n7Lv_IWJaK" role="2iSdaV" />
        <node concept="lj46D" id="7n7Lv_IWJaL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJbJ" role="3EZMnx">
          <property role="3F0ifm" value="PROPS" />
          <node concept="VechU" id="KyTPI1jlyq" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJcj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJeL" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJf9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaM" role="3EZMnx">
          <property role="3F0ifm" value="Group" />
          <node concept="lj46D" id="7n7Lv_IWJdz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlyT" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaN" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IWJaO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJie" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWJaP" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXe7" resolve="Group" />
          <node concept="11L4FC" id="KyTPI1pqco" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1pqct" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJj2" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWJjt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJen" role="3EZMnx">
          <property role="3F0ifm" value="Growth_Duration" />
          <node concept="lj46D" id="7n7Lv_IWJeJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlzq" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaS" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IWJaT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWJaU" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXen" resolve="GrowthDuration" />
        </node>
        <node concept="3F0ifn" id="KyTPI1pqbq" role="3EZMnx">
          <property role="3F0ifm" value="days" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJlE" role="3EZMnx">
          <property role="3F0ifm" value="," />
          <node concept="ljvvj" id="7n7Lv_IWJm9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaW" role="3EZMnx">
          <property role="3F0ifm" value="Seed_Code" />
          <node concept="lj46D" id="7n7Lv_IWJdB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1jlzV" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaX" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IWJaY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJn7" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWJaZ" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXeq" resolve="SeedCode" />
          <node concept="11L4FC" id="KyTPI1syP0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1syP5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJo3" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IWJps" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJfX" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="KyTPI1nRNC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJb1" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="3mYdg7" id="7n7Lv_IWJb2" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="VechU" id="KyTPI1jl$s" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8ftc6" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1jl$U" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
        <node concept="ljvvj" id="KyTPI1oCMm" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IWJgt">
    <ref role="1XX52x" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
    <node concept="3EZMnI" id="7n7Lv_IWJgv" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IWJgw" role="2iSdaV" />
      <node concept="3F0ifn" id="6LCgsI8gFM3" role="3EZMnx">
        <property role="3F0ifm" value="START IOTSystem" />
        <node concept="VechU" id="KyTPI1fBzt" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="7n7Lv_IWJgy" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1fBzT" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJgz" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="7n7Lv_IWJg$" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWJuD" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7n7Lv_IWJgA" role="3EZMnx">
        <node concept="l2Vlx" id="7n7Lv_IWJgB" role="2iSdaV" />
        <node concept="lj46D" id="7n7Lv_IWJgC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJvy" role="3EZMnx">
          <property role="3F0ifm" value="PROPS" />
          <node concept="VechU" id="KyTPI1fB$l" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJvQ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJwy" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJwI" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJgD" role="3EZMnx">
          <property role="3F0ifm" value="Version" />
          <node concept="lj46D" id="7n7Lv_IWJwK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1fB$O" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJgE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IWJgF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJtV" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWJgG" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXe$" resolve="Version" />
          <node concept="11L4FC" id="KyTPI1pqak" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="11LMrY" id="KyTPI1pqap" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJuZ" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IWJv7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJx0" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJxu" role="3EZMnx">
          <property role="3F0ifm" value="," />
          <node concept="ljvvj" id="7n7Lv_IWJxI" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJyj" role="3EZMnx">
          <property role="3F0ifm" value="SERVICE" />
          <node concept="VechU" id="KyTPI1fB_i" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJyR" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ_D" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJBc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6wjSgQVC1FR" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQVAhDe" resolve="Services" />
          <node concept="l2Vlx" id="6wjSgQVC1FT" role="2czzBx" />
          <node concept="ljvvj" id="6wjSgQVC1Gs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6wjSgQVC1Gu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJEz" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="7n7Lv_IWJFC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJFf" role="3EZMnx">
          <property role="3F0ifm" value="GATEWAY" />
          <node concept="VechU" id="KyTPI1fB_I" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJG3" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJGR" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJIw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="4NgPXVj2MmP" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj2LzF" resolve="Gateways" />
          <node concept="l2Vlx" id="4NgPXVj2MmR" role="2czzBx" />
          <node concept="ljvvj" id="4NgPXVj2Mny" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="4NgPXVj2Mn_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJJO" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="7n7Lv_IWJL6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJM3" role="3EZMnx">
          <property role="3F0ifm" value="DEVICE:{" />
          <node concept="ljvvj" id="7n7Lv_IWJNu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1fBAd" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F2HdR" id="4NgPXVj2L5L" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj2KGe" resolve="Devices" />
          <node concept="l2Vlx" id="4NgPXVj2L5N" role="2czzBx" />
          <node concept="ljvvj" id="4NgPXVj2L6o" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="4NgPXVj2MnC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJMZ" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWJuL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8ft63" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1fBAF" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8ft8B" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1fBB7" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IXbGS">
    <property role="3GE5qa" value="Gateway" />
    <ref role="1XX52x" to="gv5y:7n7Lv_IXbFV" resolve="Gateway" />
    <node concept="3EZMnI" id="7n7Lv_IXbGU" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IXbGV" role="2iSdaV" />
      <node concept="3F0ifn" id="6LCgsI8ftdt" role="3EZMnx">
        <property role="3F0ifm" value="START Gateway" />
        <node concept="VechU" id="KyTPI1gn4h" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="7n7Lv_IXbGX" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1gn4H" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IXbGY" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="7n7Lv_IXbGZ" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IXbH0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7n7Lv_IXbH1" role="3EZMnx">
        <node concept="l2Vlx" id="7n7Lv_IXbH2" role="2iSdaV" />
        <node concept="lj46D" id="7n7Lv_IXbH3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbM0" role="3EZMnx">
          <property role="3F0ifm" value="PROPS" />
          <node concept="VechU" id="KyTPI1gn4J" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbMM" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbNC" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IXbO4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbH4" role="3EZMnx">
          <property role="3F0ifm" value="Gateway_ID" />
          <node concept="lj46D" id="7n7Lv_IXbO6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1gn5e" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbH5" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
          <node concept="11L4FC" id="7n7Lv_IXbH6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IXbH7" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IXbFY" resolve="GatewayID" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbK7" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IXbKv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbH9" role="3EZMnx">
          <property role="3F0ifm" value="Model" />
          <node concept="lj46D" id="7n7Lv_IXbOa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1gn5J" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbHa" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
          <node concept="11L4FC" id="7n7Lv_IXbHb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IXbHc" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IXbG0" resolve="Model" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbOE" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IXbQ$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbPB" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="7n7Lv_IXbQ6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8h_6a" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
          <node concept="VechU" id="KyTPI1gn6d" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8h_bF" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6LCgsI8h_dO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8i4nw" role="3EZMnx">
          <property role="3F0ifm" value="Manages(" />
          <node concept="lj46D" id="6LCgsI8i4pD" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1gn6G" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F2HdR" id="KyTPI1l$ON" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:51oAUbsMxGG" resolve="Devices" />
          <node concept="l2Vlx" id="KyTPI1l$OP" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="6LCgsI8i4oU" role="3EZMnx">
          <property role="3F0ifm" value=")" />
          <node concept="ljvvj" id="6LCgsI8i4pB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1gn7d" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="6LCgsI8h_sL" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="6LCgsI8h_ts" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbHg" role="3EZMnx">
          <property role="3F0ifm" value="PROTOCOLS" />
          <node concept="VechU" id="KyTPI1gn7F" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbHh" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IXbHi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7n7Lv_IXbRy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbU2" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IXbU_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7n7Lv_IXbHk" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IXbGF" resolve="Protocols" />
          <node concept="l2Vlx" id="7n7Lv_IXbHl" role="2czzBx" />
          <node concept="pj6Ft" id="7n7Lv_IXbHm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7n7Lv_IXbHn" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7n7Lv_IXbHo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXbV8" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="KyTPI1mlP5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8ftea" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1gn87" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8ftfz" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1gn8z" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
        <node concept="ljvvj" id="KyTPI1kPcD" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IXcik">
    <property role="3GE5qa" value="Gateway" />
    <ref role="1XX52x" to="gv5y:7n7Lv_IXbG3" resolve="CommunicationProtocol" />
    <node concept="3EZMnI" id="7n7Lv_IXcim" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IXcin" role="2iSdaV" />
      <node concept="3F0ifn" id="7n7Lv_IXciq" role="3EZMnx">
        <property role="3F0ifm" value="START Protocol" />
        <node concept="3mYdg7" id="7n7Lv_IXcir" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="VechU" id="KyTPI1h6C_" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8ftjg" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1h6D3" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8ftjY" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="ljvvj" id="6LCgsI8ftkm" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7n7Lv_IXcit" role="3EZMnx">
        <node concept="l2Vlx" id="7n7Lv_IXciu" role="2iSdaV" />
        <node concept="lj46D" id="7n7Lv_IXciv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXcjj" role="3EZMnx">
          <property role="3F0ifm" value="PROPS" />
          <node concept="VechU" id="KyTPI1h6DX" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXcjx" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXcjL" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IXckd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXck3" role="3EZMnx">
          <property role="3F0ifm" value="Type" />
          <node concept="lj46D" id="7n7Lv_IXckW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1h6E2" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXcix" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7n7Lv_IXciy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IXciz" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IXbGD" resolve="Type" />
          <node concept="ljvvj" id="7n7Lv_IXci$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXckK" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
      </node>
      <node concept="3F0ifn" id="6LCgsI8ftko" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1h6Dv" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6LCgsI8ftl9" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1h6Dx" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6wjSgQV_ypp">
    <property role="3GE5qa" value="Service" />
    <ref role="1XX52x" to="gv5y:6wjSgQV_ynv" resolve="AnalyticsSystem" />
    <node concept="3EZMnI" id="6wjSgQV_yQz" role="2wV5jI">
      <node concept="l2Vlx" id="6wjSgQV_yQ$" role="2iSdaV" />
      <node concept="3F0ifn" id="6wjSgQV_yQ_" role="3EZMnx">
        <property role="3F0ifm" value="START Analytics" />
        <node concept="VechU" id="KyTPI15WeS" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6wjSgQV_yQA" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI16SIA" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_yQB" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="6wjSgQV_yQC" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6wjSgQV_yQD" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6wjSgQV_yQE" role="3EZMnx">
        <node concept="3F0ifn" id="4NgPXVj1IJY" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI15WfN" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yW$" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6wjSgQV_yXb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="l2Vlx" id="6wjSgQV_yQF" role="2iSdaV" />
        <node concept="lj46D" id="6wjSgQV_yQG" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQH" role="3EZMnx">
          <property role="3F0ifm" value="Analytics_Type" />
          <node concept="VechU" id="KyTPI15WgD" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5g" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQI" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yQJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yQK" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynD" resolve="AnalyticsType" />
          <node concept="ljvvj" id="6wjSgQV_yQL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQM" role="3EZMnx">
          <property role="3F0ifm" value="Data_Source" />
          <node concept="VechU" id="KyTPI15Whe" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5j" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQN" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yQO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yQP" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynF" resolve="DataSource" />
          <node concept="ljvvj" id="6wjSgQV_yQQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQR" role="3EZMnx">
          <property role="3F0ifm" value="Output_Type" />
          <node concept="VechU" id="KyTPI15WhF" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5m" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQS" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yQT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yQU" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynI" resolve="OutputType" />
          <node concept="ljvvj" id="6wjSgQV_yQV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQW" role="3EZMnx">
          <property role="3F0ifm" value="Service_ID" />
          <node concept="VechU" id="KyTPI15Wi8" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5p" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yQX" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yQY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yQZ" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
          <node concept="ljvvj" id="6wjSgQV_yR0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yR6" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="VechU" id="KyTPI15Wi_" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5s" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yR7" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yR8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yR9" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yng" resolve="Host" />
          <node concept="ljvvj" id="6wjSgQV_yRa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yRb" role="3EZMnx">
          <property role="3F0ifm" value="URI" />
          <node concept="VechU" id="KyTPI15Wj2" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bd5v" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yRc" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yRd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yRe" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynk" resolve="URI" />
          <node concept="ljvvj" id="6wjSgQV_yRf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yXS" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="6wjSgQVAI$S" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_yS1" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI15Wfm" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6wjSgQV_yTu" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI18l1o" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQVDKbi" role="3EZMnx">
        <node concept="ljvvj" id="6wjSgQVDKcf" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6wjSgQV_yYP">
    <property role="3GE5qa" value="Service" />
    <ref role="1XX52x" to="gv5y:6wjSgQV_yoJ" resolve="MonitoringSystem" />
    <node concept="3EZMnI" id="6wjSgQV_yYR" role="2wV5jI">
      <node concept="3F0ifn" id="6wjSgQV_z0P" role="3EZMnx">
        <property role="3F0ifm" value="START Monitoring" />
        <node concept="VechU" id="KyTPI1bV8u" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="l2Vlx" id="6wjSgQV_yYS" role="2iSdaV" />
      <node concept="3F0A7n" id="6wjSgQV_yYU" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1bV8W" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_yYV" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="6wjSgQV_yYW" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6wjSgQV_yYX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6wjSgQV_yYY" role="3EZMnx">
        <node concept="3F0ifn" id="6wjSgQV_z2x" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI1bVai" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_z3z" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6wjSgQV_z45" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="l2Vlx" id="6wjSgQV_yYZ" role="2iSdaV" />
        <node concept="lj46D" id="6wjSgQV_yZ0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZ1" role="3EZMnx">
          <property role="3F0ifm" value="Metrics" />
          <node concept="VechU" id="KyTPI1bVba" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bVdB" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZ2" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZ3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZ4" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yoK" resolve="Metrics" />
          <node concept="ljvvj" id="6wjSgQV_yZ5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZ6" role="3EZMnx">
          <property role="3F0ifm" value="Condition" />
          <node concept="VechU" id="KyTPI1bVc1" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bVd$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZ7" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZ8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZ9" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yoV" resolve="Condition" />
          <node concept="ljvvj" id="6wjSgQV_yZa" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZb" role="3EZMnx">
          <property role="3F0ifm" value="Service_ID" />
          <node concept="VechU" id="KyTPI1bVcu" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bVdx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZc" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZe" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
          <node concept="ljvvj" id="6wjSgQV_yZf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZl" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="VechU" id="KyTPI1bVcV" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bVdu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZm" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZn" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZo" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yng" resolve="Host" />
          <node concept="ljvvj" id="6wjSgQV_yZp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZq" role="3EZMnx">
          <property role="3F0ifm" value="URI" />
          <node concept="VechU" id="KyTPI1bVdo" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI1bVdr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZr" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZt" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynk" resolve="URI" />
          <node concept="ljvvj" id="6wjSgQV_yZu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_z4W" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="6wjSgQVCtjb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOy2" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
          <node concept="VechU" id="KyTPI1bVaI" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOzt" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="51oAUbsMO$b" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMODn" role="3EZMnx">
          <property role="3F0ifm" value="Monitor(" />
          <node concept="lj46D" id="51oAUbsMOJ5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1bVdH" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F2HdR" id="KyTPI1dpko" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:51oAUbsMxNN" resolve="Sensors" />
          <node concept="l2Vlx" id="KyTPI1dpkq" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="KyTPI1bVfo" role="3EZMnx">
          <property role="3F0ifm" value=")" />
          <node concept="ljvvj" id="KyTPI1bVgo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1bVgR" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOMp" role="3EZMnx">
          <property role="3F0ifm" value="Trigger(" />
          <node concept="lj46D" id="51oAUbsMOQP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1bVee" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="1iCGBv" id="51oAUbsMOO3" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:51oAUbsMxGV" resolve="Trigger" />
          <node concept="1sVBvm" id="51oAUbsMOO5" role="1sWHZn">
            <node concept="3F0A7n" id="51oAUbsMOOZ" role="2wV5jI">
              <property role="1Intyy" value="true" />
              <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            </node>
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOPU" role="3EZMnx">
          <property role="3F0ifm" value=")" />
          <node concept="ljvvj" id="51oAUbsMOQN" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1bVel" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOJW" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="KyTPI1eS8s" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_z7a" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1bV9p" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6wjSgQV_z9B" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1bV9P" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
        <node concept="ljvvj" id="KyTPI1eS8u" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQVEbRk" role="3EZMnx">
        <node concept="ljvvj" id="6wjSgQVEbSc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6wjSgQV_zaz">
    <property role="3GE5qa" value="Service" />
    <ref role="1XX52x" to="gv5y:6wjSgQV_yo0" resolve="ControlSystem" />
    <node concept="3EZMnI" id="6wjSgQV_za_" role="2wV5jI">
      <node concept="3F0ifn" id="6wjSgQV_zcz" role="3EZMnx">
        <property role="3F0ifm" value="START Control" />
        <node concept="VechU" id="KyTPI192Z8" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="l2Vlx" id="6wjSgQV_zaA" role="2iSdaV" />
      <node concept="3F0A7n" id="6wjSgQV_zaC" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1930_" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_zaD" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="6wjSgQV_zaE" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="6wjSgQV_zaF" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="6wjSgQV_zaG" role="3EZMnx">
        <node concept="3F0ifn" id="6wjSgQV_zhu" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI19311" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_ziw" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="6wjSgQV_zj2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="l2Vlx" id="6wjSgQV_zaH" role="2iSdaV" />
        <node concept="lj46D" id="6wjSgQV_zaI" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaJ" role="3EZMnx">
          <property role="3F0ifm" value="Control_Type" />
          <node concept="VechU" id="KyTPI1931t" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19L5b" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaK" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zaL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zaM" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yo1" resolve="ControlType" />
          <node concept="ljvvj" id="6wjSgQV_zaN" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaO" role="3EZMnx">
          <property role="3F0ifm" value="Actions" />
          <node concept="VechU" id="KyTPI1931U" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19L5e" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaP" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zaQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zaR" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yoo" resolve="Actions" />
          <node concept="ljvvj" id="6wjSgQV_zaS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaT" role="3EZMnx">
          <property role="3F0ifm" value="Service_ID" />
          <node concept="VechU" id="KyTPI1932n" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19L5h" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaU" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zaV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zaW" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynb" resolve="ServiceID" />
          <node concept="ljvvj" id="6wjSgQV_zaX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zb3" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="VechU" id="KyTPI1932O" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19L5k" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zb4" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zb5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zb6" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_yng" resolve="Host" />
          <node concept="ljvvj" id="6wjSgQV_zb7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zb8" role="3EZMnx">
          <property role="3F0ifm" value="URI" />
          <node concept="VechU" id="KyTPI1933h" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19L5n" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zb9" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zba" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zbb" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynk" resolve="URI" />
          <node concept="ljvvj" id="6wjSgQV_zbc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOSA" role="3EZMnx">
          <property role="3F0ifm" value="}," />
          <node concept="ljvvj" id="51oAUbsMOW4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOUk" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
          <node concept="VechU" id="KyTPI1933I" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOVu" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="51oAUbsMP1j" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOXY" role="3EZMnx">
          <property role="3F0ifm" value="Control(" />
          <node concept="VechU" id="KyTPI1934_" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="lj46D" id="KyTPI19358" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="51oAUbsMOZg" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:51oAUbsMxNQ" resolve="Actuators" />
          <node concept="l2Vlx" id="51oAUbsMOZi" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="51oAUbsMP0B" role="3EZMnx">
          <property role="3F0ifm" value=")" />
          <node concept="VechU" id="KyTPI1934C" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
          <node concept="ljvvj" id="KyTPI19355" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="51oAUbsMOXl" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="51oAUbsMP1n" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_zeu" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1930w" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="6wjSgQV_zfM" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1930y" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
        <node concept="ljvvj" id="KyTPI1av53" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQVEbPz" role="3EZMnx">
        <node concept="ljvvj" id="6wjSgQVEbQr" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4NgPXVj1AbF">
    <property role="3GE5qa" value="Device" />
    <ref role="1XX52x" to="gv5y:4NgPXVj19HH" resolve="Sensor" />
    <node concept="3EZMnI" id="4NgPXVj1G2b" role="2wV5jI">
      <node concept="l2Vlx" id="4NgPXVj1G2c" role="2iSdaV" />
      <node concept="3F0ifn" id="4NgPXVj1G2d" role="3EZMnx">
        <property role="3F0ifm" value="START Sensor" />
        <node concept="VechU" id="KyTPI1hQgu" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="4NgPXVj1G2e" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1hQgU" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="4NgPXVj1G2f" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="4NgPXVj1G2g" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4NgPXVj1G2h" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4NgPXVj1G2i" role="3EZMnx">
        <node concept="l2Vlx" id="4NgPXVj1G2j" role="2iSdaV" />
        <node concept="lj46D" id="4NgPXVj1G2k" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4NgPXVj1L2r" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI1hQhm" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1L3B" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="4NgPXVj1L4C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2l" role="3EZMnx">
          <property role="3F0ifm" value="Type" />
          <node concept="lj46D" id="4NgPXVj1L4E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQhP" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2m" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2n" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2o" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj1jfm" resolve="Type" />
          <node concept="ljvvj" id="4NgPXVj1G2p" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2q" role="3EZMnx">
          <property role="3F0ifm" value="State" />
          <node concept="lj46D" id="4NgPXVj1L4G" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQim" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2r" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2s" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2t" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj1j_G" resolve="State" />
          <node concept="ljvvj" id="4NgPXVj1G2u" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2v" role="3EZMnx">
          <property role="3F0ifm" value="Unit" />
          <node concept="lj46D" id="4NgPXVj1L4I" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQiR" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2w" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2x" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2y" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj1jW3" resolve="Unit" />
          <node concept="ljvvj" id="4NgPXVj1G2z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2$" role="3EZMnx">
          <property role="3F0ifm" value="Value" />
          <node concept="lj46D" id="4NgPXVj1L4K" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQjo" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2_" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2A" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2B" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj1jW7" resolve="Value" />
          <node concept="ljvvj" id="4NgPXVj1G2C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2D" role="3EZMnx">
          <property role="3F0ifm" value="Device_Id" />
          <node concept="lj46D" id="4NgPXVj1L4M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQjT" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2E" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2F" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2G" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
          <node concept="ljvvj" id="4NgPXVj1G2H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2I" role="3EZMnx">
          <property role="3F0ifm" value="IP_Address" />
          <node concept="lj46D" id="4NgPXVj1LPo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQkq" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2J" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2K" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2L" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj17vc" resolve="IPAddress" />
          <node concept="ljvvj" id="4NgPXVj1G2M" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2N" role="3EZMnx">
          <property role="3F0ifm" value="Manufacturer" />
          <node concept="lj46D" id="4NgPXVj1LSg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQkV" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1G2O" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1G2P" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1G2Q" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj17N_" resolve="Manufacturer" />
          <node concept="ljvvj" id="4NgPXVj1G2R" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1LT1" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="4NgPXVj1VgF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="ljvvj" id="4NgPXVj3i9b" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4NgPXVj1Q4R" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="VechU" id="KyTPI1hQo2" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="4NgPXVj1QRe" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="4NgPXVj3J1s" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="VechU" id="KyTPI1hQox" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4NgPXVj1SLD">
    <property role="3GE5qa" value="Device" />
    <ref role="1XX52x" to="gv5y:4NgPXVj1lFK" resolve="Actuator" />
    <node concept="3EZMnI" id="4NgPXVj1TaB" role="2wV5jI">
      <node concept="l2Vlx" id="4NgPXVj1TaC" role="2iSdaV" />
      <node concept="3F0ifn" id="4NgPXVj1TaD" role="3EZMnx">
        <property role="3F0ifm" value="START Actuator" />
        <node concept="VechU" id="KyTPI1hQ9N" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="4NgPXVj1TaE" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VechU" id="KyTPI1hQ9P" role="3F10Kt">
          <property role="Vb096" value="fLwANPs/magenta" />
        </node>
      </node>
      <node concept="3F0ifn" id="4NgPXVj1TaF" role="3EZMnx">
        <property role="3F0ifm" value=":" />
        <node concept="3mYdg7" id="4NgPXVj1TaG" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="4NgPXVj1TaH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4NgPXVj1TaI" role="3EZMnx">
        <node concept="l2Vlx" id="4NgPXVj1TaJ" role="2iSdaV" />
        <node concept="lj46D" id="4NgPXVj1TaK" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TeQ" role="3EZMnx">
          <property role="3F0ifm" value="PROPS:" />
          <node concept="VechU" id="KyTPI1hQah" role="3F10Kt">
            <property role="Vb096" value="fLwANPr/green" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1Tf$" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="4NgPXVj1TfW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaL" role="3EZMnx">
          <property role="3F0ifm" value="Type" />
          <node concept="lj46D" id="4NgPXVj1UqM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQaK" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaM" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1TaN" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1TaO" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj1rzt" resolve="Type" />
          <node concept="ljvvj" id="4NgPXVj1TaP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaQ" role="3EZMnx">
          <property role="3F0ifm" value="Device_Id" />
          <node concept="lj46D" id="4NgPXVj1UqO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQbh" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaR" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1TaS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1TaT" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj16Qu" resolve="DeviceID" />
          <node concept="ljvvj" id="4NgPXVj1TaU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaV" role="3EZMnx">
          <property role="3F0ifm" value="IP_Address" />
          <node concept="lj46D" id="4NgPXVj1UqQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQbM" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1TaW" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1TaX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1TaY" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj17vc" resolve="IPAddress" />
          <node concept="ljvvj" id="4NgPXVj1TaZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1Tb0" role="3EZMnx">
          <property role="3F0ifm" value="Manufacturer" />
          <node concept="lj46D" id="4NgPXVj1UqS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="VechU" id="KyTPI1hQcj" role="3F10Kt">
            <property role="Vb096" value="hGRnIZc/lightBlue" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1Tb1" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="4NgPXVj1Tb2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="4NgPXVj1Tb3" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj17N_" resolve="Manufacturer" />
          <node concept="ljvvj" id="4NgPXVj1Tb4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1Urn" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="4NgPXVj1WxS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="ljvvj" id="4NgPXVj3hKc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4NgPXVj1Tb5" role="3EZMnx">
        <property role="3F0ifm" value="END" />
        <node concept="3mYdg7" id="4NgPXVj1Tb6" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="VechU" id="KyTPI1hQeW" role="3F10Kt">
          <property role="Vb096" value="fLwANPp/orange" />
        </node>
      </node>
      <node concept="3F0A7n" id="4NgPXVj1TdC" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="4NgPXVj3Jqq" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="VechU" id="KyTPI1hQf3" role="3F10Kt">
          <property role="Vb096" value="hGRnIZc/lightBlue" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="51oAUbsMxQb">
    <property role="3GE5qa" value="Service" />
    <ref role="1XX52x" to="gv5y:51oAUbsMxGO" resolve="ServiceReference" />
    <node concept="3EZMnI" id="51oAUbsMxQd" role="2wV5jI">
      <node concept="l2Vlx" id="51oAUbsMxQe" role="2iSdaV" />
      <node concept="1iCGBv" id="51oAUbsMxQh" role="3EZMnx">
        <ref role="1NtTu8" to="gv5y:51oAUbsMxGP" resolve="Operates" />
        <node concept="1sVBvm" id="51oAUbsMxQk" role="1sWHZn">
          <node concept="3F0A7n" id="51oAUbsMxQm" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="51oAUbsMxQn" role="3EZMnx">
        <property role="3F0ifm" value="," />
        <node concept="11L4FC" id="51oAUbsMxQo" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="51oAUbsMP1D">
    <property role="3GE5qa" value="Device" />
    <ref role="1XX52x" to="gv5y:51oAUbsMxNK" resolve="ActuatorReference" />
    <node concept="3EZMnI" id="51oAUbsMP1F" role="2wV5jI">
      <node concept="l2Vlx" id="51oAUbsMP1G" role="2iSdaV" />
      <node concept="1iCGBv" id="51oAUbsMP1J" role="3EZMnx">
        <ref role="1NtTu8" to="gv5y:51oAUbsMxNL" resolve="Uses" />
        <node concept="1sVBvm" id="51oAUbsMP1M" role="1sWHZn">
          <node concept="3F0A7n" id="51oAUbsMP1O" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="VechU" id="KyTPI1hQfx" role="3F10Kt">
              <property role="Vb096" value="fLwANPs/magenta" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="KyTPI1cDQ2" role="3EZMnx">
        <property role="3F0ifm" value=";" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="KyTPI1cDP6">
    <property role="3GE5qa" value="Device" />
    <ref role="1XX52x" to="gv5y:51oAUbsMxGl" resolve="SensorReference" />
    <node concept="3EZMnI" id="KyTPI1cDP8" role="2wV5jI">
      <node concept="l2Vlx" id="KyTPI1cDP9" role="2iSdaV" />
      <node concept="1iCGBv" id="KyTPI1cDPc" role="3EZMnx">
        <ref role="1NtTu8" to="gv5y:51oAUbsMxGm" resolve="Uses" />
        <node concept="1sVBvm" id="KyTPI1cDPf" role="1sWHZn">
          <node concept="3F0A7n" id="KyTPI1cDPh" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="KyTPI1cDPi" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="KyTPI1cDPj" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="KyTPI1l$PJ">
    <property role="3GE5qa" value="Device" />
    <ref role="1XX52x" to="gv5y:51oAUbsMOuw" resolve="DeviceReference" />
    <node concept="3EZMnI" id="KyTPI1l$PL" role="2wV5jI">
      <node concept="l2Vlx" id="KyTPI1l$PM" role="2iSdaV" />
      <node concept="1iCGBv" id="KyTPI1l$PP" role="3EZMnx">
        <ref role="1NtTu8" to="gv5y:51oAUbsMOux" resolve="Manages" />
        <node concept="1sVBvm" id="KyTPI1l$PS" role="1sWHZn">
          <node concept="3F0A7n" id="KyTPI1l$PU" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="VechU" id="KyTPI1l$QS" role="3F10Kt">
              <property role="Vb096" value="fLwANPs/magenta" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="KyTPI1l$PV" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="KyTPI1l$PW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
</model>

