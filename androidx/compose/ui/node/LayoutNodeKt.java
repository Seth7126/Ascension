package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0014\u0010\u0006\u001A\u00020\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0000\u001A(\u0010\n\u001A\u0002H\u000B\"\f\b\u0000\u0010\u000B*\u0006\u0012\u0002\b\u00030\f*\u0002H\u000B2\u0006\u0010\r\u001A\u00020\u000EH\u0082\b¢\u0006\u0002\u0010\u000F\u001A\f\u0010\u0010\u001A\u00020\u0011*\u00020\bH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"DebugChanges", "", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "add", "", "Landroidx/compose/ui/node/LayoutNode;", "child", "assignChained", "T", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "originalWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutNodeKt {
    private static final boolean DebugChanges;
    private static final LayoutNodeDrawScope sharedDrawScope;

    static {
        LayoutNodeKt.sharedDrawScope = new LayoutNodeDrawScope(null, 1, null);
    }

    public static final void add(LayoutNode layoutNode0, LayoutNode layoutNode1) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Intrinsics.checkNotNullParameter(layoutNode1, "child");
        layoutNode0.insertAt$ui_release(layoutNode0.getChildren$ui_release().size(), layoutNode1);
    }

    private static final DelegatingLayoutNodeWrapper assignChained(DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper0, LayoutNodeWrapper layoutNodeWrapper0) {
        if(layoutNodeWrapper0 != delegatingLayoutNodeWrapper0.getWrapped$ui_release()) {
            ((DelegatingLayoutNodeWrapper)delegatingLayoutNodeWrapper0.getWrapped$ui_release()).setChained(true);
        }
        return delegatingLayoutNodeWrapper0;
    }

    public static final LayoutNodeDrawScope getSharedDrawScope() {
        return LayoutNodeKt.sharedDrawScope;
    }

    public static final Owner requireOwner(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Owner owner0 = layoutNode0.getOwner$ui_release();
        if(owner0 == null) {
            throw new IllegalStateException("LayoutNode should be attached to an owner");
        }
        return owner0;
    }
}

