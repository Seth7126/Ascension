package androidx.compose.ui.platform;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nJ\u0016\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "Companion", "DisposeOnDetachedFromWindow", "DisposeOnLifecycleDestroyed", "DisposeOnViewTreeLifecycleDestroyed", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ViewCompositionStrategy {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$Companion;", "", "()V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindow;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        public static final int $stable;
        public static final DisposeOnDetachedFromWindow INSTANCE;

        static {
            DisposeOnDetachedFromWindow.INSTANCE = new DisposeOnDetachedFromWindow();
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(AbstractComposeView abstractComposeView0) {
            Intrinsics.checkNotNullParameter(abstractComposeView0, "view");
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view0) {
                    Intrinsics.checkNotNullParameter(view0, "v");
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view0) {
                    this.$view.disposeComposition();
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10);
            return new Function0(viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10) {
                final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnDetachedFromWindow.installFor.listener.1 $listener;
                final AbstractComposeView $view;

                {
                    this.$view = abstractComposeView0;
                    this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$10;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$view.removeOnAttachStateChangeListener(this.$listener);
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000B\u001A\u00020\fH\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;)V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable = 8;
        private final Lifecycle lifecycle;

        static {
        }

        public DisposeOnLifecycleDestroyed(Lifecycle lifecycle0) {
            Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
            super();
            this.lifecycle = lifecycle0;
        }

        public DisposeOnLifecycleDestroyed(LifecycleOwner lifecycleOwner0) {
            Intrinsics.checkNotNullParameter(lifecycleOwner0, "lifecycleOwner");
            Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle0, "lifecycleOwner.lifecycle");
            this(lifecycle0);
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(AbstractComposeView abstractComposeView0) {
            Intrinsics.checkNotNullParameter(abstractComposeView0, "view");
            return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView0, this.lifecycle);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "()V", "installFor", "Lkotlin/Function0;", "", "view", "Landroidx/compose/ui/platform/AbstractComposeView;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final int $stable;
        public static final DisposeOnViewTreeLifecycleDestroyed INSTANCE;

        static {
            DisposeOnViewTreeLifecycleDestroyed.INSTANCE = new DisposeOnViewTreeLifecycleDestroyed();
        }

        @Override  // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0 installFor(AbstractComposeView abstractComposeView0) {
            Intrinsics.checkNotNullParameter(abstractComposeView0, "view");
            if(abstractComposeView0.isAttachedToWindow()) {
                LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(abstractComposeView0);
                if(lifecycleOwner0 == null) {
                    throw new IllegalStateException(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner").toString());
                }
                Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle0, "lco.lifecycle");
                return ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView0, lifecycle0);
            }
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.installFor.listener.1 viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10 = new View.OnAttachStateChangeListener() {
                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view0) {
                    LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.get(ref$ObjectRef0);
                    AbstractComposeView abstractComposeView0 = ref$ObjectRef0;
                    if(lifecycleOwner0 == null) {
                        throw new IllegalStateException(("View tree for " + abstractComposeView0 + " has no ViewTreeLifecycleOwner").toString());
                    }
                    Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle0, "lco.lifecycle");
                    this.$disposer.element = ViewCompositionStrategy_androidKt.installForLifecycle(abstractComposeView0, lifecycle0);
                    ref$ObjectRef0.removeOnAttachStateChangeListener(this);
                }

                @Override  // android.view.View$OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view0) {
                }
            };
            abstractComposeView0.addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10);
            ref$ObjectRef0.element = new Function0(viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10) {
                final androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.installFor.listener.1 $listener;
                final AbstractComposeView $view;

                {
                    this.$view = abstractComposeView0;
                    this.$listener = viewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$10;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$view.removeOnAttachStateChangeListener(this.$listener);
                }
            };
            return new Function0() {
                final ObjectRef $disposer;

                {
                    this.$disposer = ref$ObjectRef0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ((Function0)this.$disposer.element).invoke();
                }
            };
        }
    }

    public static final Companion Companion;

    static {
        ViewCompositionStrategy.Companion = Companion.$$INSTANCE;
    }

    Function0 installFor(AbstractComposeView arg1);
}

