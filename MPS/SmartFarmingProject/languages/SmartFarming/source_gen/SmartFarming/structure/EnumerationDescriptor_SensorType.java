package SmartFarming.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_SensorType extends EnumerationDescriptorBase {

  public EnumerationDescriptor_SensorType() {
    super(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded304b5aeL, "SensorType", "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061352366");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_Temperature_0 = new EnumerationDescriptor.MemberDescriptor("Temperature", "Temperature", 0x4cd0d7ded304b5afL, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061352367");
  private final EnumerationDescriptor.MemberDescriptor myMember_Humidity_0 = new EnumerationDescriptor.MemberDescriptor("Humidity", "Humidity", 0x4cd0d7ded304d62cL, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061360684");
  private final EnumerationDescriptor.MemberDescriptor myMember_CO2_0 = new EnumerationDescriptor.MemberDescriptor("CO2", "CO2", 0x4cd0d7ded304e103L, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061363459");
  private final EnumerationDescriptor.MemberDescriptor myMember_O2_0 = new EnumerationDescriptor.MemberDescriptor("O2", "O2", 0x4cd0d7ded304e671L, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061364849");
  private final EnumerationDescriptor.MemberDescriptor myMember_Nutrients_0 = new EnumerationDescriptor.MemberDescriptor("Nutrients", "Nutrients", 0x4cd0d7ded304e676L, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061364854");
  private final EnumerationDescriptor.MemberDescriptor myMember_Light_0 = new EnumerationDescriptor.MemberDescriptor("Light", "Light", 0x4cd0d7ded304f150L, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061367632");
  private final EnumerationDescriptor.MemberDescriptor myMember_Surveillance_0 = new EnumerationDescriptor.MemberDescriptor("Surveillance", "Surveillance", 0x4cd0d7ded304f6c1L, "r:17f8e5c2-54e9-4f66-903e-aba76cf0e1c5(SmartFarming.structure)/5535161294061369025");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded304b5aeL, 0x4cd0d7ded304b5afL, 0x4cd0d7ded304d62cL, 0x4cd0d7ded304e103L, 0x4cd0d7ded304e671L, 0x4cd0d7ded304e676L, 0x4cd0d7ded304f150L, 0x4cd0d7ded304f6c1L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_Temperature_0, myMember_Humidity_0, myMember_CO2_0, myMember_O2_0, myMember_Nutrients_0, myMember_Light_0, myMember_Surveillance_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "Temperature":
        return myMember_Temperature_0;
      case "Humidity":
        return myMember_Humidity_0;
      case "CO2":
        return myMember_CO2_0;
      case "O2":
        return myMember_O2_0;
      case "Nutrients":
        return myMember_Nutrients_0;
      case "Light":
        return myMember_Light_0;
      case "Surveillance":
        return myMember_Surveillance_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}
