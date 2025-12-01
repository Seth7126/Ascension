package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/TestModifierUpdater;", "", "node", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "updateModifier", "", "modifier", "Landroidx/compose/ui/Modifier;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    static {
    }

    public TestModifierUpdater(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        super();
        this.node = layoutNode0;
    }

    public final void updateModifier(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        this.node.setModifier(modifier0);
    }
}

