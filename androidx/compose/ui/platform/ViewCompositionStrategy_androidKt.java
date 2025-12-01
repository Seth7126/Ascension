package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001E\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"installForLifecycle", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ViewCompositionStrategy_androidKt {
    private static final Function0 installForLifecycle(AbstractComposeView abstractComposeView0, Lifecycle lifecycle0) {
        if(lifecycle0.getCurrentState().compareTo(State.DESTROYED) <= 0) {
            throw new IllegalStateException(("Cannot configure " + abstractComposeView0 + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle0 + "is already destroyed").toString());
        }
        LifecycleEventObserver lifecycleEventObserver0 = new LifecycleEventObserver() {
            @Override  // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "$noName_0");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    abstractComposeView0.disposeComposition();
                }
            }
        };
        lifecycle0.addObserver(lifecycleEventObserver0);
        return new Function0(lifecycle0, lifecycleEventObserver0) {
            final Lifecycle $lifecycle;
            final LifecycleEventObserver $observer;

            {
                this.$lifecycle = lifecycle0;
                this.$observer = lifecycleEventObserver0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                this.$lifecycle.removeObserver(this.$observer);
            }
        };
    }
}

