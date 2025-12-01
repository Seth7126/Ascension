package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u001D\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class PipHintTrackerKt {
    public static final Object trackPipAnimationHintView(Activity activity0, View view0, Continuation continuation0) {
        Object object0 = FlowKt.callbackFlow(new Function2(view0, null) {
            final View $view;
            private Object L$0;
            int label;

            {
                this.$view = view0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1 pipHintTrackerKt$trackPipAnimationHintView$flow$10 = new androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1(this.$view, continuation0);
                pipHintTrackerKt$trackPipAnimationHintView$flow$10.L$0 = object0;
                return pipHintTrackerKt$trackPipAnimationHintView$flow$10;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((ProducerScope)object0), ((Continuation)object1));
            }

            public final Object invoke(ProducerScope producerScope0, Continuation continuation0) {
                return ((androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1)this.create(producerScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        ProducerScope producerScope0 = (ProducerScope)this.L$0;
                        View.OnLayoutChangeListener view$OnLayoutChangeListener0 = new View.OnLayoutChangeListener() {
                            @Override  // android.view.View$OnLayoutChangeListener
                            public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                                if(v != v4 || v2 != v6 || v1 != v5 || v3 != v7) {
                                    Intrinsics.checkNotNullExpressionValue(view0, "v");
                                    Rect rect0 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view0);
                                    this.$$this$callbackFlow.offer(rect0);
                                }
                            }
                        };
                        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.scrollChangeListener.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10 = new ViewTreeObserver.OnScrollChangedListener() {
                            @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
                            public final void onScrollChanged() {
                                Rect rect0 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view);
                                this.$view.offer(rect0);
                            }
                        };
                        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10 = new View.OnAttachStateChangeListener() {
                            @Override  // android.view.View$OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view0) {
                                Intrinsics.checkNotNullParameter(view0, "v");
                                Rect rect0 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10);
                                this.$view.offer(rect0);
                                pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10.getViewTreeObserver().addOnScrollChangedListener(view$OnLayoutChangeListener0);
                                pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10.addOnLayoutChangeListener(this.$layoutChangeListener);
                            }

                            @Override  // android.view.View$OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view0) {
                                Intrinsics.checkNotNullParameter(view0, "v");
                                view0.getViewTreeObserver().removeOnScrollChangedListener(view$OnLayoutChangeListener0);
                                view0.removeOnLayoutChangeListener(this.$layoutChangeListener);
                            }
                        };
                        if(Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                            producerScope0.offer(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                            this.$view.getViewTreeObserver().addOnScrollChangedListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10);
                            this.$view.addOnLayoutChangeListener(view$OnLayoutChangeListener0);
                        }
                        this.$view.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10);
                        androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$10 = new Function0(pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$10, view$OnLayoutChangeListener0, pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10) {
                            final androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1 $attachStateChangeListener;
                            final View.OnLayoutChangeListener $layoutChangeListener;
                            final ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
                            final View $view;

                            {
                                this.$view = view0;
                                this.$scrollChangeListener = viewTreeObserver$OnScrollChangedListener0;
                                this.$layoutChangeListener = view$OnLayoutChangeListener0;
                                this.$attachStateChangeListener = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$10;
                                super(0);
                            }

                            @Override  // kotlin.jvm.functions.Function0
                            public Object invoke() {
                                this.invoke();
                                return Unit.INSTANCE;
                            }

                            public final void invoke() {
                                this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
                                this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
                                this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
                            }
                        };
                        this.label = 1;
                        return ProduceKt.awaitClose(producerScope0, pipHintTrackerKt$trackPipAnimationHintView$flow$1$10, this) == object1 ? object1 : Unit.INSTANCE;
                    }
                    case 1: {
                        ResultKt.throwOnFailure(object0);
                        return Unit.INSTANCE;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }).collect(new FlowCollector() {
            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity0, ((Rect)object0));
                return Unit.INSTANCE;
            }
        }, continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private static final Rect trackPipAnimationHintView$positionInWindow(View view0) {
        Rect rect0 = new Rect();
        view0.getGlobalVisibleRect(rect0);
        return rect0;
    }
}

