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

public class Farmer_Constraints extends BaseConstraintsDescriptor {
  public Farmer_Constraints() {
    super(CONCEPTS.Farmer$1W);
  }

  public static class FarmerID_Property extends BasePropertyConstraintsDescriptor {
    public FarmerID_Property(ConstraintsDescriptor container) {
      super(PROPS.FarmerID$iX2e, container, false, false, true);
    }
    @Override
    public boolean validateValue(SNode node, Object propertyValue, CheckingNodeContext checkingNodeContext) {
      boolean result = staticValidateProperty(node, SPropertyOperations.castString(propertyValue));
      if (!(result) && checkingNodeContext != null) {
        checkingNodeContext.setBreakingNode(new SNodePointer("r:4238c262-210f-4459-bd66-e1eb2a494b4d(SmartFarming.constraints)", "3598660026872153299"));
      }
      return result;
    }
    private static boolean staticValidateProperty(SNode node, final String propertyValue) {
      return ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.cast(SNodeOperations.getParent(node), CONCEPTS.Farm$6b), LINKS.Farmers$v8um)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(SPropertyOperations.getString(it, PROPS.FarmerID$iX2e), propertyValue);
        }
      }).count() <= 1;
    }
  }
  @Override
  protected Map<SProperty, PropertyConstraintsDescriptor> getSpecifiedProperties() {
    Map<SProperty, PropertyConstraintsDescriptor> properties = new HashMap<SProperty, PropertyConstraintsDescriptor>();
    properties.put(PROPS.FarmerID$iX2e, new FarmerID_Property(this));
    return properties;
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Farmer$1W = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd36cL, "SmartFarming.structure.Farmer");
    /*package*/ static final SConcept Farm$6b = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0xad19f946497d8c4L, "SmartFarming.structure.Farm");
  }

  private static final class PROPS {
    /*package*/ static final SProperty FarmerID$iX2e = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x346b31548e5bd36cL, 0x346b31548e5bd36fL, "FarmerID");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink Farmers$v8um = MetaAdapterFactory.getContainmentLink(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0xad19f946497d8c4L, 0x346b31548e5bd37eL, "Farmers");
  }
}
