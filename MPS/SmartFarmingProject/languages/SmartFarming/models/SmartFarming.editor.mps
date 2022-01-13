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
</model>

