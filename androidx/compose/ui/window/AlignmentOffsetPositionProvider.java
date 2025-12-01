package androidx.compose.ui.window;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J5\u0010\f\u001A\u00020\u00052\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000B\u001A\u0004\b\t\u0010\n\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getOffset-nOcc-ac", "()J", "J", "calculatePosition", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment0, long v) {
        this.alignment = alignment0;
        this.offset = v;
    }

    public AlignmentOffsetPositionProvider(Alignment alignment0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(alignment0, v);
    }

    @Override  // androidx.compose.ui.window.PopupPositionProvider
    public long calculatePosition-llwVHH4(IntRect intRect0, long v, LayoutDirection layoutDirection0, long v1) {
        Intrinsics.checkNotNullParameter(intRect0, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        long v2 = IntOffsetKt.IntOffset(0, 0);
        long v3 = this.alignment.align-KFBX0sM(0L, IntSizeKt.IntSize(intRect0.getWidth(), intRect0.getHeight()), layoutDirection0);
        long v4 = this.alignment.align-KFBX0sM(0L, IntSizeKt.IntSize(((int)(v1 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL))), layoutDirection0);
        long v5 = IntOffsetKt.IntOffset(intRect0.getLeft(), intRect0.getTop());
        long v6 = IntOffsetKt.IntOffset(((int)(v2 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL)));
        long v7 = IntOffsetKt.IntOffset(((int)(v6 >> 0x20)) + ((int)(v3 >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL)));
        long v8 = IntOffsetKt.IntOffset(((int)(v4 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)));
        long v9 = IntOffsetKt.IntOffset(((int)(v7 >> 0x20)) - ((int)(v8 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)) - ((int)(v8 & 0xFFFFFFFFL)));
        long v10 = IntOffsetKt.IntOffset(((int)(this.getOffset-nOcc-ac() >> 0x20)) * (layoutDirection0 == LayoutDirection.Ltr ? 1 : -1), ((int)(this.getOffset-nOcc-ac() & 0xFFFFFFFFL)));
        return IntOffsetKt.IntOffset(((int)(v9 >> 0x20)) + ((int)(v10 >> 0x20)), ((int)(v9 & 0xFFFFFFFFL)) + ((int)(v10 & 0xFFFFFFFFL)));
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final long getOffset-nOcc-ac() {
        return this.offset;
    }
}

