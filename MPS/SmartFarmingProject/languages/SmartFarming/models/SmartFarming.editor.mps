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
        <node concept="l2Vlx" id="3hFclien4Og" role="2iSdaV" />
        <node concept="lj46D" id="3hFclien4Oh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="3hFclien4Oi" role="3EZMnx">
          <property role="3F0ifm" value="location" />
        </node>
        <node concept="3F0ifn" id="3hFclien4Oj" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3hFclien4Ok" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclien4Ol" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdB" resolve="location" />
          <node concept="ljvvj" id="3hFclien4Om" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclien4On" role="3EZMnx">
          <property role="3F0ifm" value="size" />
        </node>
        <node concept="3F0ifn" id="3hFclien4Oo" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3hFclien4Op" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclien4Oq" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdD" resolve="size" />
          <node concept="ljvvj" id="3hFclien4Or" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclien4Ou" role="3EZMnx">
          <property role="3F0ifm" value="farmers" />
        </node>
        <node concept="3F0ifn" id="3hFclien4Ov" role="3EZMnx">
          <property role="3F0ifm" value=": [" />
          <node concept="11L4FC" id="3hFclien4Ow" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3hFclien4Ox" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="3hFclien4Oy" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdY" resolve="Farmers" />
          <node concept="l2Vlx" id="3hFclien4Oz" role="2czzBx" />
          <node concept="pj6Ft" id="3hFclien4O$" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="3hFclien4O_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3hFclien4OA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclien4OB" role="3EZMnx">
          <property role="3F0ifm" value="]" />
          <node concept="ljvvj" id="3hFclien4OC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclien4OD" role="3EZMnx">
          <property role="3F0ifm" value="crops" />
        </node>
        <node concept="3F0ifn" id="3hFclien4OE" role="3EZMnx">
          <property role="3F0ifm" value=": [" />
          <node concept="11L4FC" id="3hFclien4OF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3hFclien4OG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="3hFclien4OH" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXeu" resolve="Crops" />
          <node concept="l2Vlx" id="3hFclien4OI" role="2czzBx" />
          <node concept="pj6Ft" id="3hFclien4OJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="3hFclien4OK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3hFclien4OL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFcliennEf" role="3EZMnx">
          <property role="3F0ifm" value="]" />
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
        <node concept="3F0ifn" id="3hFclientfI" role="3EZMnx">
          <property role="3F0ifm" value="farmerID" />
        </node>
        <node concept="3F0ifn" id="3hFclientfJ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3hFclientfK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfL" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdJ" resolve="FarmerID" />
          <node concept="ljvvj" id="3hFclientfM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfN" role="3EZMnx">
          <property role="3F0ifm" value="email" />
        </node>
        <node concept="3F0ifn" id="3hFclientfO" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3hFclientfP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfQ" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdL" resolve="Email" />
          <node concept="ljvvj" id="3hFclientfR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3hFclientfS" role="3EZMnx">
          <property role="3F0ifm" value="phone number" />
        </node>
        <node concept="3F0ifn" id="3hFclientfT" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3hFclientfU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3hFclientfV" role="3EZMnx">
          <ref role="1NtTu8" to="gv5y:3hFcliemXdO" resolve="PhoneNumber" />
          <node concept="ljvvj" id="3hFclientfW" role="3F10Kt">
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
</model>

