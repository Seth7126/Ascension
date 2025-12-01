package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A \u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000B\u001A\"\u0010\f\u001A\u00020\u0002*\u00020\t2\u0006\u0010\r\u001A\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0019\u0010\u0010\u001A\u00020\u0011*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0019\u0010\u0014\u001A\u00020\u0015*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0006\"!\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class IntSizeKt {
    public static final long IntSize(int v, int v1) [...] // 潜在的解密器

    public static final long getCenter-ozmzZPI(long v) {
        return IntOffsetKt.IntOffset(((int)(v >> 0x20)) / 2, ((int)(v & 0xFFFFFFFFL)) / 2);
    }

    public static void getCenter-ozmzZPI$annotations(long v) {
    }

    public static final long times-O0kMr_c(int v, long v1) {
        return IntSize.times-YEO4UFw(v1, v);
    }

    // 去混淆评级： 低(20)
    public static final IntRect toIntRect-ozmzZPI(long v) {
        return IntRectKt.IntRect-VbeCjmY(0L, v);
    }

    public static final long toSize-ozmzZPI(long v) {
        return SizeKt.Size(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
    }
}

