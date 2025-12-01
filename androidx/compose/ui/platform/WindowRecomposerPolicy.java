package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job.DefaultImpls;
import kotlinx.coroutines.android.HandlerDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;

@InternalComposeUiApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u0005H\u0001J\u0015\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0010\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u0005H\u0001J\u000E\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0003\u001A\u00020\u0005J-\u0010\u0011\u001A\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0003\u001A\u00020\u00052\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "()V", "factory", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "compareAndSetFactory", "", "expected", "createAndInstallWindowRecomposer", "Landroidx/compose/runtime/Recomposer;", "rootView", "Landroid/view/View;", "createAndInstallWindowRecomposer$ui_release", "getAndSetFactory", "setFactory", "", "withFactory", "R", "block", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WindowRecomposerPolicy {
    public static final int $stable;
    public static final WindowRecomposerPolicy INSTANCE;
    private static final AtomicReference factory;

    static {
        WindowRecomposerPolicy.INSTANCE = new WindowRecomposerPolicy();
        WindowRecomposerPolicy.factory = new AtomicReference(WindowRecomposerFactory.Companion.getLifecycleAware());
        WindowRecomposerPolicy.$stable = 8;
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory0, WindowRecomposerFactory windowRecomposerFactory1) {
        Intrinsics.checkNotNullParameter(windowRecomposerFactory0, "expected");
        Intrinsics.checkNotNullParameter(windowRecomposerFactory1, "factory");
        return PainterModifier..ExternalSyntheticBackport0.m(WindowRecomposerPolicy.factory, windowRecomposerFactory0, windowRecomposerFactory1);
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view0) {
        Intrinsics.checkNotNullParameter(view0, "rootView");
        Recomposer recomposer0 = ((WindowRecomposerFactory)WindowRecomposerPolicy.factory.get()).createRecomposer(view0);
        WindowRecomposer_androidKt.setCompositionContext(view0, recomposer0);
        Handler handler0 = view0.getHandler();
        Intrinsics.checkNotNullExpressionValue(handler0, "rootView.handler");
        HandlerDispatcher handlerDispatcher0 = HandlerDispatcherKt.from(handler0, "windowRecomposer cleanup").getImmediate();
        androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1 windowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$10 = new Function2(view0, null) {
            final Recomposer $newRecomposer;
            final View $rootView;
            int label;

            {
                this.$newRecomposer = recomposer0;
                this.$rootView = view0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                return new androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1(this.$newRecomposer, this.$rootView, continuation0);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
            }

            public final Object invoke(CoroutineScope coroutineScope0, Continuation continuation0) {
                return ((androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        try {
                            this.label = 1;
                            if(this.$newRecomposer.join(this) == object1) {
                                return object1;
                            label_7:
                                ResultKt.throwOnFailure(object0);
                            }
                            break;
                        }
                        catch(Throwable throwable0) {
                            goto label_10;
                        }
                    }
                    case 1: {
                        goto label_7;
                    label_10:
                        if(WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                            WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
                        }
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                    WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
                }
                return Unit.INSTANCE;
            }
        };
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                Intrinsics.checkNotNullParameter(view0, "v");
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                Intrinsics.checkNotNullParameter(view0, "v");
                view0.removeOnAttachStateChangeListener(this);
                DefaultImpls.cancel$default(this.$unsetJob, null, 1, null);
            }
        });
        return recomposer0;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory0) {
        Intrinsics.checkNotNullParameter(windowRecomposerFactory0, "factory");
        Object object0 = WindowRecomposerPolicy.factory.getAndSet(windowRecomposerFactory0);
        Intrinsics.checkNotNullExpressionValue(object0, "factory.getAndSet(factory)");
        return (WindowRecomposerFactory)object0;
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory0) {
        Intrinsics.checkNotNullParameter(windowRecomposerFactory0, "factory");
        WindowRecomposerPolicy.factory.set(windowRecomposerFactory0);
    }

    public final Object withFactory(WindowRecomposerFactory windowRecomposerFactory0, Function0 function00) {
        Object object0;
        Intrinsics.checkNotNullParameter(windowRecomposerFactory0, "factory");
        Intrinsics.checkNotNullParameter(function00, "block");
        WindowRecomposerFactory windowRecomposerFactory1 = this.getAndSetFactory(windowRecomposerFactory0);
        try {
            object0 = function00.invoke();
        }
        catch(Throwable throwable0) {
            if(this.compareAndSetFactory(windowRecomposerFactory0, windowRecomposerFactory1)) {
                throw throwable0;
            }
            ExceptionsKt.addSuppressed(throwable0, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
            throw throwable0;
        }
        if(!this.compareAndSetFactory(windowRecomposerFactory0, windowRecomposerFactory1)) {
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        }
        return object0;
    }
}

