package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\n\u0010\b¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "rootNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "rootSemanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "getUnmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final LayoutNode rootNode;

    static {
    }

    public SemanticsOwner(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "rootNode");
        super();
        this.rootNode = layoutNode0;
    }

    public final SemanticsNode getRootSemanticsNode() {
        SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(this.rootNode);
        Intrinsics.checkNotNull(semanticsWrapper0);
        return new SemanticsNode(semanticsWrapper0, true);
    }

    public final SemanticsNode getUnmergedRootSemanticsNode() {
        SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(this.rootNode);
        Intrinsics.checkNotNull(semanticsWrapper0);
        return new SemanticsNode(semanticsWrapper0, false);
    }
}

