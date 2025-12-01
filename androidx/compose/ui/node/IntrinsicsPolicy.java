package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fJ\u000E\u0010\u000E\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\fJ\b\u0010\u0010\u001A\u00020\tH\u0002J\u000E\u0010\u0011\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fJ\u000E\u0010\u0012\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\fJ\u000E\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001A\u0004\u0018\u00010\tX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "measurePolicyState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/layout/MeasurePolicy;", "pendingMeasurePolicy", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measurePolicyFromState", "minIntrinsicHeight", "minIntrinsicWidth", "updateFrom", "", "measurePolicy", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IntrinsicsPolicy {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;", "", "()V", "NoPolicyError", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    private static final Companion Companion = null;
    @Deprecated
    private static final String NoPolicyError = "Intrinsic size is queried but there is no measure policy in place.";
    private final LayoutNode layoutNode;
    private MutableState measurePolicyState;
    private MeasurePolicy pendingMeasurePolicy;

    static {
        IntrinsicsPolicy.Companion = new Companion(null);
    }

    public IntrinsicsPolicy(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        super();
        this.layoutNode = layoutNode0;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int v) {
        return this.measurePolicyFromState().maxIntrinsicHeight(this.getLayoutNode().getMeasureScope$ui_release(), this.getLayoutNode().getChildren$ui_release(), v);
    }

    public final int maxIntrinsicWidth(int v) {
        return this.measurePolicyFromState().maxIntrinsicWidth(this.getLayoutNode().getMeasureScope$ui_release(), this.getLayoutNode().getChildren$ui_release(), v);
    }

    private final MeasurePolicy measurePolicyFromState() {
        MutableState mutableState0 = this.measurePolicyState;
        if(mutableState0 == null) {
            MeasurePolicy measurePolicy0 = this.pendingMeasurePolicy;
            if(measurePolicy0 == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
            }
            mutableState0 = SnapshotStateKt.mutableStateOf$default(measurePolicy0, null, 2, null);
        }
        this.measurePolicyState = mutableState0;
        return (MeasurePolicy)mutableState0.getValue();
    }

    public final int minIntrinsicHeight(int v) {
        return this.measurePolicyFromState().minIntrinsicHeight(this.getLayoutNode().getMeasureScope$ui_release(), this.getLayoutNode().getChildren$ui_release(), v);
    }

    public final int minIntrinsicWidth(int v) {
        return this.measurePolicyFromState().minIntrinsicWidth(this.getLayoutNode().getMeasureScope$ui_release(), this.getLayoutNode().getChildren$ui_release(), v);
    }

    public final void updateFrom(MeasurePolicy measurePolicy0) {
        Intrinsics.checkNotNullParameter(measurePolicy0, "measurePolicy");
        MutableState mutableState0 = this.measurePolicyState;
        if(mutableState0 != null) {
            Intrinsics.checkNotNull(mutableState0);
            mutableState0.setValue(measurePolicy0);
            return;
        }
        this.pendingMeasurePolicy = measurePolicy0;
    }
}

