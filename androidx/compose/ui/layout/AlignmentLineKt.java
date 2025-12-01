package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001C\u0010\u0006\u001A\u00020\u0007*\u00020\b2\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u0007H\u0000\"\u0011\u0010\u0000\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001A\u00020\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0003¨\u0006\u000B"}, d2 = {"FirstBaseline", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "getFirstBaseline", "()Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "LastBaseline", "getLastBaseline", "merge", "", "Landroidx/compose/ui/layout/AlignmentLine;", "position1", "position2", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AlignmentLineKt {
    private static final HorizontalAlignmentLine FirstBaseline;
    private static final HorizontalAlignmentLine LastBaseline;

    static {
        AlignmentLineKt.FirstBaseline = new HorizontalAlignmentLine(AlignmentLineKt.FirstBaseline.1.INSTANCE);
        AlignmentLineKt.LastBaseline = new HorizontalAlignmentLine(AlignmentLineKt.LastBaseline.1.INSTANCE);
    }

    public static final HorizontalAlignmentLine getFirstBaseline() {
        return AlignmentLineKt.FirstBaseline;
    }

    public static final HorizontalAlignmentLine getLastBaseline() {
        return AlignmentLineKt.LastBaseline;
    }

    public static final int merge(AlignmentLine alignmentLine0, int v, int v1) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "<this>");
        return ((Number)alignmentLine0.getMerger$ui_release().invoke(v, v1)).intValue();
    }
}

