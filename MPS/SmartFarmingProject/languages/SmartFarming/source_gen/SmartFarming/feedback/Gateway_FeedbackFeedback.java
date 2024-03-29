package SmartFarming.feedback;

/*Generated by MPS */

import jetbrains.mps.core.aspects.feedback.api.BaseFeedbackDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.feedback.api.FeedbackProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintContext;
import jetbrains.mps.core.aspects.feedback.messages.BaseMessageProvider;
import jetbrains.mps.core.aspects.feedback.messages.FailingPropertyConstraintProblemId;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.core.aspects.feedback.messages.MessageProvider;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;
import org.jetbrains.mps.openapi.language.SProperty;

public final class Gateway_FeedbackFeedback extends BaseFeedbackDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bafbL, "SmartFarming.structure.Gateway");

  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_jv451e_a = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.GatewayID$E34e)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("The \"Gateway_ID\" you entered is already used.");
    }
  };

  private static final List<FeedbackProvider> PROVIDERS = Collections.unmodifiableList(Arrays.<FeedbackProvider>asList(MSGPROVIDER_WhenPropertyConstraintFails_jv451e_a));

  public Gateway_FeedbackFeedback() {
    super(CONCEPT);
  }

  @NotNull
  @Override
  public Stream<FeedbackProvider> getDeclaredProviders() {
    return PROVIDERS.stream();
  }

  private static final class PROPS {
    /*package*/ static final SProperty GatewayID$E34e = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0x75c7c5f96ef4bafbL, 0x75c7c5f96ef4bafeL, "GatewayID");
  }
}
