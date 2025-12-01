package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B.\u0012\'\u0010\u0002\u001A#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\tJ\u0015\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u0001H\u0000¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001A\u00020\u0005H\u0000¢\u0006\u0002\b\u0013J#\u0010\u0014\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\r2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0017J#\u0010\u0018\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\r2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b\u0019JC\u0010\u001A\u001A\u00020\u0005\"\b\b\u0000\u0010\u001B*\u00020\u001C2\u0006\u0010\u0010\u001A\u0002H\u001B2\u0012\u0010\u001D\u001A\u000E\u0012\u0004\u0012\u0002H\u001B\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001E\u0010\u001FJ\r\u0010 \u001A\u00020\u0005H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001A\u00020\u0005H\u0000¢\u0006\u0002\b#J\u001B\u0010$\u001A\u00020\u00052\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0002\b%R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "onChangedExecutor", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "callback", "(Lkotlin/jvm/functions/Function1;)V", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLayout", "Landroidx/compose/ui/node/LayoutNode;", "onCommitAffectingMeasure", "clear", "target", "clear$ui_release", "clearInvalidObservations", "clearInvalidObservations$ui_release", "observeLayoutSnapshotReads", "node", "block", "observeLayoutSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeReads", "T", "Landroidx/compose/ui/node/OwnerScope;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "startObserving", "startObserving$ui_release", "stopObserving", "stopObserving$ui_release", "withNoSnapshotReadObservation", "withNoSnapshotReadObservation$ui_release", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OwnerSnapshotObserver {
    private final SnapshotStateObserver observer;
    private final Function1 onCommitAffectingLayout;
    private final Function1 onCommitAffectingMeasure;

    public OwnerSnapshotObserver(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onChangedExecutor");
        super();
        this.observer = new SnapshotStateObserver(function10);
        this.onCommitAffectingMeasure = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1.INSTANCE;
        this.onCommitAffectingLayout = androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1.INSTANCE;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1 INSTANCE;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1.INSTANCE = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingLayout.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((LayoutNode)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
                if(layoutNode0.isValid()) {
                    layoutNode0.requestRelayout$ui_release();
                }
            }
        }


        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1 INSTANCE;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1.INSTANCE = new androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.onCommitAffectingMeasure.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((LayoutNode)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
                if(layoutNode0.isValid()) {
                    layoutNode0.requestRemeasure$ui_release();
                }
            }
        }

    }

    public final void clear$ui_release(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "target");
        this.observer.clear(object0);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1.INSTANCE);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1 extends Lambda implements Function1 {
            public static final androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1 INSTANCE;

            static {
                androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1.INSTANCE = new androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1();
            }

            androidx.compose.ui.node.OwnerSnapshotObserver.clearInvalidObservations.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                Intrinsics.checkNotNullParameter(object0, "it");
                return !((OwnerScope)object0).isValid();
            }
        }

    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode0, Function0 function00) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        Intrinsics.checkNotNullParameter(function00, "block");
        this.observeReads$ui_release(layoutNode0, this.onCommitAffectingLayout, function00);
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode0, Function0 function00) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        Intrinsics.checkNotNullParameter(function00, "block");
        this.observeReads$ui_release(layoutNode0, this.onCommitAffectingMeasure, function00);
    }

    public final void observeReads$ui_release(OwnerScope ownerScope0, Function1 function10, Function0 function00) {
        Intrinsics.checkNotNullParameter(ownerScope0, "target");
        Intrinsics.checkNotNullParameter(function10, "onChanged");
        Intrinsics.checkNotNullParameter(function00, "block");
        this.observer.observeReads(ownerScope0, function10, function00);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }

    public final void withNoSnapshotReadObservation$ui_release(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.observer.withNoObservations(function00);
    }
}

