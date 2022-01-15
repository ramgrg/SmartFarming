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
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SConcept;

public class Sensor_Constraints extends BaseConstraintsDescriptor {
  public Sensor_Constraints() {
    super(CONCEPTS.Sensor$u2);
  }

  public static class Value_Property extends BasePropertyConstraintsDescriptor {
    public Value_Property(ConstraintsDescriptor container) {
      super(PROPS.Value$k4Ig, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)", "2144816825579222110"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, String propertyValue) {
      if (SPropertyOperations.getEnum(node, PROPS.Type$gpvF) != ListSequence.fromList(SEnumOperations.getMembers(MetaAdapterFactory.getEnumeration(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded304b5aeL, "SmartFarming.structure.SensorType"))).getElement(0)) {
        return Double.valueOf(propertyValue) >= 0;
      } else {
        return true;
      }
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.Value$k4Ig, new Value_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Sensor$u2 = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3049b6dL, "SmartFarming.structure.Sensor");
  }

  private static final class PROPS {
    /*package*/ static final SProperty Value$k4Ig = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3049b6dL, 0x4cd0d7ded3053f07L, "Value");
    /*package*/ static final SProperty Type$gpvF = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x4cd0d7ded3049b6dL, 0x4cd0d7ded30533d6L, "Type");
  }
}
