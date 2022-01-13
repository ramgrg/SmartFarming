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
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
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
  </registry>
  <node concept="24kQdi" id="3hFclien4O6">
    <ref role="1XX52x" to="gv5y:FhBTh$_Xz4" resolve="Farm" />
    <node concept="3EZMnI" id="3hFclien4O8" role="2wV5jI">
      <node concept="l2Vlx" id="3hFclien4O9" role="2iSdaV" />
      <node concept="3F0ifn" id="3hFclien4Oa" role="3EZMnx">
        <property role="3F0ifm" value="farm" />
      </node>
      <node concept="3F0A7n" id="3hFclien4Ob" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3hFclien4Oc" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="3hFclien4Od" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3hFclien4Oe" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3hFclien4Of" role="3EZMnx">
        <node concept="3F0ifn" id="7n7Lv_IWIzJ" role="3EZMnx">
          <property role="3F0ifm" value="props:" />
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
          <property role="3F0ifm" value="location:" />
          <node concept="lj46D" id="7n7Lv_IWIQv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWIMb" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdB" resolve="location" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIMn" role="3EZMnx">
          <property role="3F0ifm" value="," />
          <node concept="ljvvj" id="7n7Lv_IWIRE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIR9" role="3EZMnx">
          <property role="3F0ifm" value="size:" />
          <node concept="lj46D" id="7n7Lv_IWIRG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7n7Lv_IWIRt" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdD" resolve="size" />
          <node concept="ljvvj" id="7n7Lv_IWISz" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIRV" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="7n7Lv_IWIT8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKrj" role="3EZMnx">
          <node concept="ljvvj" id="7n7Lv_IWKs3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWISO" role="3EZMnx">
          <property role="3F0ifm" value="START" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWITL" role="3EZMnx">
          <property role="3F0ifm" value="IoT-System" />
          <node concept="ljvvj" id="7n7Lv_IWKb5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F1sOY" id="7n7Lv_IWKxc" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:7n7Lv_IWIMu" resolve="IoTSystem" />
          <node concept="ljvvj" id="7n7Lv_IWKxV" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7n7Lv_IWKxX" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJQB" role="3EZMnx">
          <property role="3F0ifm" value="END" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJSI" role="3EZMnx">
          <property role="3F0ifm" value="IoT-System" />
          <node concept="ljvvj" id="7n7Lv_IWJT9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJUU" role="3EZMnx">
          <node concept="ljvvj" id="7n7Lv_IWJVo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJWj" role="3EZMnx">
          <property role="3F0ifm" value="START" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJXh" role="3EZMnx">
          <property role="3F0ifm" value="Farmers" />
          <node concept="ljvvj" id="7n7Lv_IWKcF" role="3F10Kt">
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
          <property role="3F0ifm" value="END" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKdg" role="3EZMnx">
          <property role="3F0ifm" value="Farmers" />
          <node concept="ljvvj" id="7n7Lv_IWKeq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKga" role="3EZMnx">
          <node concept="ljvvj" id="7n7Lv_IWKhm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKi0" role="3EZMnx">
          <property role="3F0ifm" value="START" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKjT" role="3EZMnx">
          <property role="3F0ifm" value="Crop" />
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
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKnV" role="3EZMnx">
          <property role="3F0ifm" value="END" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWKpr" role="3EZMnx">
          <property role="3F0ifm" value="Crop" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWIQN" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3hFclien4OM" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3hFclien4ON" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3hFclientf8">
    <ref role="1XX52x" to="gv5y:3hFcliemXdG" resolve="Farmer" />
    <node concept="3EZMnI" id="3hFclientf$" role="2wV5jI">
      <node concept="l2Vlx" id="3hFclientf_" role="2iSdaV" />
      <node concept="3F0ifn" id="3hFclientfA" role="3EZMnx">
        <property role="3F0ifm" value="farmer" />
      </node>
      <node concept="3F0A7n" id="3hFclientfB" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3hFclientfC" role="3EZMnx">
        <property role="3F0ifm" value="{" />
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
          <property role="3F0ifm" value="props:" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWIZN" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="7n7Lv_IWJ0w" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfI" role="3EZMnx">
          <property role="3F0ifm" value="FarmerID" />
          <node concept="lj46D" id="7n7Lv_IWJ0y" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
        </node>
        <node concept="3F0ifn" id="3hFclientfO" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
          <node concept="11L4FC" id="3hFclientfP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfQ" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdL" resolve="Email" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ8m" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWJa3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfS" role="3EZMnx">
          <property role="3F0ifm" value="PhoneNumber" />
          <node concept="lj46D" id="7n7Lv_IWJ0A" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJpu" role="3EZMnx">
          <property role="3F0ifm" value=":&quot;" />
        </node>
        <node concept="3F0A7n" id="3hFclientfV" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdO" resolve="PhoneNumber" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJrd" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IWJNU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ0Z" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="7n7Lv_IWJtM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3hFclientfX" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3hFclientfY" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IWJac">
    <ref role="1XX52x" to="gv5y:3hFcliemXe4" resolve="Crop" />
    <node concept="3EZMnI" id="7n7Lv_IWJaC" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IWJaD" role="2iSdaV" />
      <node concept="3F0ifn" id="7n7Lv_IWJaE" role="3EZMnx">
        <property role="3F0ifm" value="crop" />
      </node>
      <node concept="3F0A7n" id="7n7Lv_IWJaF" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJaG" role="3EZMnx">
        <property role="3F0ifm" value="{" />
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
          <property role="3F0ifm" value="props" />
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
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJj2" role="3EZMnx">
          <property role="3F0ifm" value="&quot;," />
          <node concept="ljvvj" id="7n7Lv_IWJjt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJen" role="3EZMnx">
          <property role="3F0ifm" value="GrowthDuration" />
          <node concept="lj46D" id="7n7Lv_IWJeJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
          <node concept="lj46D" id="7n7Lv_IWJla" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJlE" role="3EZMnx">
          <property role="3F0ifm" value="," />
          <node concept="ljvvj" id="7n7Lv_IWJm9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJaW" role="3EZMnx">
          <property role="3F0ifm" value="SeedCode" />
          <node concept="lj46D" id="7n7Lv_IWJdB" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJo3" role="3EZMnx">
          <property role="3F0ifm" value="&quot;" />
          <node concept="ljvvj" id="7n7Lv_IWJps" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJfX" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJb1" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7n7Lv_IWJb2" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IWJgt">
    <ref role="1XX52x" to="gv5y:3hFcliemXex" resolve="IoTSystem" />
    <node concept="3EZMnI" id="7n7Lv_IWJgv" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IWJgw" role="2iSdaV" />
      <node concept="3F0ifn" id="7n7Lv_IWJgx" role="3EZMnx">
        <property role="3F0ifm" value="system" />
      </node>
      <node concept="3F0A7n" id="7n7Lv_IWJgy" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJgz" role="3EZMnx">
        <property role="3F0ifm" value="{" />
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
          <property role="3F0ifm" value="props" />
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
          <property role="3F0ifm" value="version" />
          <node concept="lj46D" id="7n7Lv_IWJwK" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
          <ref role="1NtTu8" to="gv5y:3hFcliemXe$" resolve="version" />
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
          <property role="3F0ifm" value="service" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJyR" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJ_D" role="3EZMnx">
          <property role="3F0ifm" value="[" />
          <node concept="ljvvj" id="7n7Lv_IWJBc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="6wjSgQVC1FR" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQVAhDe" resolve="services" />
          <node concept="l2Vlx" id="6wjSgQVC1FT" role="2czzBx" />
          <node concept="ljvvj" id="6wjSgQVC1Gs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="6wjSgQVC1Gu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJEz" role="3EZMnx">
          <property role="3F0ifm" value="]," />
          <node concept="ljvvj" id="7n7Lv_IWJFC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJFf" role="3EZMnx">
          <property role="3F0ifm" value="gateway" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJG3" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJGR" role="3EZMnx">
          <property role="3F0ifm" value="[" />
          <node concept="ljvvj" id="7n7Lv_IWJIw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="4NgPXVj2MmP" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj2LzF" resolve="gateways" />
          <node concept="l2Vlx" id="4NgPXVj2MmR" role="2czzBx" />
          <node concept="ljvvj" id="4NgPXVj2Mny" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="4NgPXVj2Mn_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJJO" role="3EZMnx">
          <property role="3F0ifm" value="]," />
          <node concept="ljvvj" id="7n7Lv_IWJL6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJM3" role="3EZMnx">
          <property role="3F0ifm" value="device:[" />
          <node concept="ljvvj" id="7n7Lv_IWJNu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="4NgPXVj2L5L" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:4NgPXVj2KGe" resolve="devices" />
          <node concept="l2Vlx" id="4NgPXVj2L5N" role="2czzBx" />
          <node concept="ljvvj" id="4NgPXVj2L6o" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="4NgPXVj2MnC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7n7Lv_IWJMZ" role="3EZMnx">
          <property role="3F0ifm" value="]" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IWJuL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IWJgI" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7n7Lv_IWJgJ" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IXbGS">
    <ref role="1XX52x" to="gv5y:7n7Lv_IXbFV" resolve="Gateway" />
    <node concept="3EZMnI" id="7n7Lv_IXbGU" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IXbGV" role="2iSdaV" />
      <node concept="3F0ifn" id="7n7Lv_IXbGW" role="3EZMnx">
        <property role="3F0ifm" value="gateway" />
      </node>
      <node concept="3F0A7n" id="7n7Lv_IXbGX" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7n7Lv_IXbGY" role="3EZMnx">
        <property role="3F0ifm" value="{" />
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
          <property role="3F0ifm" value="props" />
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
          <property role="3F0ifm" value="GatewayID" />
          <node concept="lj46D" id="7n7Lv_IXbO6" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
        <node concept="3F0ifn" id="7n7Lv_IXbHg" role="3EZMnx">
          <property role="3F0ifm" value="protocols" />
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
          <property role="3F0ifm" value="[" />
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
          <property role="3F0ifm" value="]" />
        </node>
      </node>
      <node concept="3F0ifn" id="7n7Lv_IXbHp" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7n7Lv_IXbHq" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7n7Lv_IXcik">
    <ref role="1XX52x" to="gv5y:7n7Lv_IXbG3" resolve="CommunicationProtocol" />
    <node concept="3EZMnI" id="7n7Lv_IXcim" role="2wV5jI">
      <node concept="l2Vlx" id="7n7Lv_IXcin" role="2iSdaV" />
      <node concept="3F0ifn" id="7n7Lv_IXciq" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7n7Lv_IXcir" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7n7Lv_IXcis" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7n7Lv_IXcit" role="3EZMnx">
        <node concept="l2Vlx" id="7n7Lv_IXciu" role="2iSdaV" />
        <node concept="lj46D" id="7n7Lv_IXciv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7n7Lv_IXcjj" role="3EZMnx">
          <property role="3F0ifm" value="props" />
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
          <property role="3F0ifm" value="type" />
          <node concept="lj46D" id="7n7Lv_IXckW" role="3F10Kt">
            <property role="VOm3f" value="true" />
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
      <node concept="3F0ifn" id="7n7Lv_IXci_" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7n7Lv_IXciA" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="6wjSgQV_ypp">
    <ref role="1XX52x" to="gv5y:6wjSgQV_ynv" resolve="Analytics" />
    <node concept="3EZMnI" id="6wjSgQV_yQz" role="2wV5jI">
      <node concept="l2Vlx" id="6wjSgQV_yQ$" role="2iSdaV" />
      <node concept="3F0ifn" id="6wjSgQV_yQ_" role="3EZMnx">
        <property role="3F0ifm" value="START analytics" />
      </node>
      <node concept="3F0A7n" id="6wjSgQV_yQA" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
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
          <node concept="lj46D" id="6wjSgQV_yXd" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_yYy" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_yY$" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_yYA" role="3F10Kt">
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
        <node concept="3F0ifn" id="6wjSgQV_yR1" role="3EZMnx">
          <property role="3F0ifm" value="Service_Name" />
          <node concept="lj46D" id="6wjSgQV_yYC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yR2" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yR3" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yR4" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynd" resolve="ServiceName" />
          <node concept="ljvvj" id="6wjSgQV_yR5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yR6" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="lj46D" id="6wjSgQV_yYE" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_yYG" role="3F10Kt">
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
      </node>
      <node concept="3F0A7n" id="6wjSgQV_yTu" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="6wjSgQVDkxF" role="3F10Kt">
          <property role="VOm3f" value="true" />
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
    <ref role="1XX52x" to="gv5y:6wjSgQV_yoJ" resolve="MonitoringSystem" />
    <node concept="3EZMnI" id="6wjSgQV_yYR" role="2wV5jI">
      <node concept="3F0ifn" id="6wjSgQV_z0P" role="3EZMnx">
        <property role="3F0ifm" value="START" />
      </node>
      <node concept="l2Vlx" id="6wjSgQV_yYS" role="2iSdaV" />
      <node concept="3F0ifn" id="6wjSgQV_yYT" role="3EZMnx">
        <property role="3F0ifm" value="monitoring system" />
      </node>
      <node concept="3F0A7n" id="6wjSgQV_yYU" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
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
          <property role="3F0ifm" value="PROPS" />
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
          <node concept="lj46D" id="6wjSgQV_z47" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_z49" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_z4b" role="3F10Kt">
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
        <node concept="3F0ifn" id="6wjSgQV_yZg" role="3EZMnx">
          <property role="3F0ifm" value="ServiceName" />
          <node concept="lj46D" id="6wjSgQV_z4d" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZh" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_yZi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_yZj" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynd" resolve="ServiceName" />
          <node concept="ljvvj" id="6wjSgQV_yZk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_yZl" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="lj46D" id="6wjSgQV_z4f" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_z4h" role="3F10Kt">
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
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="6wjSgQVCtjb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_z7a" role="3EZMnx">
        <property role="3F0ifm" value="END" />
      </node>
      <node concept="3F0A7n" id="6wjSgQV_z9B" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="6wjSgQVDkxJ" role="3F10Kt">
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
    <ref role="1XX52x" to="gv5y:6wjSgQV_yo0" resolve="ControlSystem" />
    <node concept="3EZMnI" id="6wjSgQV_za_" role="2wV5jI">
      <node concept="3F0ifn" id="6wjSgQV_zcz" role="3EZMnx">
        <property role="3F0ifm" value="START" />
      </node>
      <node concept="l2Vlx" id="6wjSgQV_zaA" role="2iSdaV" />
      <node concept="3F0ifn" id="6wjSgQV_zaB" role="3EZMnx">
        <property role="3F0ifm" value="control system" />
      </node>
      <node concept="3F0A7n" id="6wjSgQV_zaC" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
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
          <property role="3F0ifm" value="ontrol_Type" />
          <node concept="lj46D" id="6wjSgQV_zj4" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_zj6" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_zj8" role="3F10Kt">
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
        <node concept="3F0ifn" id="6wjSgQV_zaY" role="3EZMnx">
          <property role="3F0ifm" value="Service_Name" />
          <node concept="lj46D" id="6wjSgQV_zja" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zaZ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="6wjSgQV_zb0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="6wjSgQV_zb1" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:6wjSgQV_ynd" resolve="ServiceName" />
          <node concept="ljvvj" id="6wjSgQV_zb2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="6wjSgQV_zb3" role="3EZMnx">
          <property role="3F0ifm" value="Host" />
          <node concept="lj46D" id="6wjSgQV_zjc" role="3F10Kt">
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
          <node concept="lj46D" id="6wjSgQV_zje" role="3F10Kt">
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
        <node concept="3F0ifn" id="6wjSgQV_zn9" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="6wjSgQVCtj9" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="6wjSgQV_zeu" role="3EZMnx">
        <property role="3F0ifm" value="END" />
      </node>
      <node concept="3F0A7n" id="6wjSgQV_zfM" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="6wjSgQVDkxH" role="3F10Kt">
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
    <ref role="1XX52x" to="gv5y:4NgPXVj19HH" resolve="Sensor" />
    <node concept="3EZMnI" id="4NgPXVj1G2b" role="2wV5jI">
      <node concept="l2Vlx" id="4NgPXVj1G2c" role="2iSdaV" />
      <node concept="3F0ifn" id="4NgPXVj1G2d" role="3EZMnx">
        <property role="3F0ifm" value="START sensor" />
      </node>
      <node concept="3F0A7n" id="4NgPXVj1G2e" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
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
        <node concept="3F0ifn" id="4NgPXVj1Vj2" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
        </node>
        <node concept="3F0ifn" id="4NgPXVj1VkA" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="4NgPXVj1Vlp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1Vmf" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="4NgPXVj3gYg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="ljvvj" id="4NgPXVj3i9b" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4NgPXVj1Q4R" role="3EZMnx">
        <property role="3F0ifm" value="END" />
      </node>
      <node concept="3F0A7n" id="4NgPXVj1QRe" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="4NgPXVj3J1s" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4NgPXVj1SLD">
    <ref role="1XX52x" to="gv5y:4NgPXVj1lFK" resolve="Actuator" />
    <node concept="3EZMnI" id="4NgPXVj1TaB" role="2wV5jI">
      <node concept="l2Vlx" id="4NgPXVj1TaC" role="2iSdaV" />
      <node concept="3F0ifn" id="4NgPXVj1TaD" role="3EZMnx">
        <property role="3F0ifm" value="START actuator" />
      </node>
      <node concept="3F0A7n" id="4NgPXVj1TaE" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
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
        <node concept="3F0ifn" id="4NgPXVj1WyT" role="3EZMnx">
          <property role="3F0ifm" value="RELATION:" />
        </node>
        <node concept="3F0ifn" id="4NgPXVj1WzT" role="3EZMnx">
          <property role="3F0ifm" value="{" />
          <node concept="ljvvj" id="4NgPXVj1W$q" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="4NgPXVj1W$Y" role="3EZMnx">
          <property role="3F0ifm" value="}" />
          <node concept="ljvvj" id="4NgPXVj3hKa" role="3F10Kt">
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
      </node>
      <node concept="3F0A7n" id="4NgPXVj1TdC" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="ljvvj" id="4NgPXVj3Jqq" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
</model>

