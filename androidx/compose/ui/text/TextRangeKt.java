package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\u0010\r\n\u0002\b\u0004\u001A\u0016\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001A\u0018\u0010\b\u001A\u00020\t2\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003H\u0002\u001A)\u0010\n\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000E\u001A\u001F\u0010\u000F\u001A\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", "index", "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "constrain", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextRangeKt {
    public static final long TextRange(int v) {
        return TextRangeKt.TextRange(v, v);
    }

    public static final long TextRange(int v, int v1) {
        return TextRange.constructor-impl(TextRangeKt.packWithCheck(v, v1));
    }

    public static final long constrain-8ffj60Q(long v, int v1, int v2) {
        int v3 = RangesKt.coerceIn(((int)(v >> 0x20)), v1, v2);
        int v4 = RangesKt.coerceIn(((int)(v & 0xFFFFFFFFL)), v1, v2);
        return v3 != ((int)(v >> 0x20)) || v4 != ((int)(v & 0xFFFFFFFFL)) ? TextRangeKt.TextRange(v3, v4) : v;
    }

    private static final long packWithCheck(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + v + ']').toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("end cannot negative. [end: " + v1 + ']').toString());
        }
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final String substring-FDrldGo(CharSequence charSequence0, long v) {
        Intrinsics.checkNotNullParameter(charSequence0, "$this$substring");
        return charSequence0.subSequence(TextRange.getMin-impl(v), TextRange.getMax-impl(v)).toString();
    }
}

