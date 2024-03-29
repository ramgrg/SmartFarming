package SmartFarming.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Device_Constraints extends BaseConstraintsDescriptor {
  public Device_Constraints() {
    super(CONCEPTS.Device$W0);
  }

  public static class DeviceID_Property extends BasePropertyConstraintsDescriptor {
    public DeviceID_Property(ConstraintsDescriptor container) {
      super(PROPS.DeviceID$FImN, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)", "3598660026872334525"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, final String propertyValue) {
      return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(node), CONCEPTS.IoTSystem$eu), LINKS.Devices$2Bl5)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(SPropertyOperations.getString(it, PROPS.DeviceID$FImN), propertyValue);
        }
      }).count() <= 1;
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.DeviceID$FImN, new DeviceID_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Device$W0 = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L, "SmartFarming.structure.Device");
    /*package*/ static final SConcept IoTSystem$eu = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd3a1L, "SmartFarming.structure.IoTSystem");
  }

  private static final class PROPS {
    /*package*/ static final SProperty DeviceID$FImN = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded30444b9L, 0x4cd0d7ded3046d9eL, "DeviceID");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink Devices$2Bl5 = MetaAdapterFactory.getContainmentLink(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd3a1L, 0x4cd0d7ded30b0b0eL, "Devices");
  }
}
