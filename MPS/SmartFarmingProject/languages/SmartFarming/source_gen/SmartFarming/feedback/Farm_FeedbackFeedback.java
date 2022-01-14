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

public final class Farm_FeedbackFeedback extends BaseFeedbackDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0xad19f946497d8c4L, "SmartFarming.structure.Farm");

  private static final FeedbackProvider<FailingPropertyConstraintContext> MSGPROVIDER_WhenPropertyConstraintFails_lp5vgp_a = new BaseMessageProvider<FailingPropertyConstraintContext>(new FailingPropertyConstraintProblemId(PROPS.Size$uTGn)) {
    @NotNull
    @Override
    public MessageProvider.Msg yieldMessage(FailingPropertyConstraintContext context) {
      return new MessageProvider.StringMsg("Size can't be negative or zero");
    }
  };

  private static final List<FeedbackProvider> PROVIDERS = Collections.unmodifiableList(Arrays.<FeedbackProvider>asList(MSGPROVIDER_WhenPropertyConstraintFails_lp5vgp_a));

  public Farm_FeedbackFeedback() {
    super(CONCEPT);
  }

  @NotNull
  @Override
  public Stream<FeedbackProvider> getDeclaredProviders() {
    return PROVIDERS.stream();
  }

  private static final class PROPS {
    /*package*/ static final SProperty Size$uTGn = MetaAdapterFactory.getProperty(0x5284d1bee3634c06L, 0xa2364161e9028c0dL, 0xad19f946497d8c4L, 0x346b31548e5bd369L, "Size");
  }
}
