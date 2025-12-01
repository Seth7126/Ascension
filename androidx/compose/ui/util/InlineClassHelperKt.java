package androidx.compose.ui.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001A\u0019\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0086\b\u001A\u0019\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u0006H\u0086\b\u001A\u0011\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\t\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\n\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0001H\u0086\b\u001A\u0011\u0010\u000B\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0001H\u0086\b¨\u0006\f"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackFloat1", "value", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class InlineClassHelperKt {
    public static final long packFloats(float f, float f1) {
        return ((long)Float.floatToIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f)) << 0x20;
    }

    public static final long packInts(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final float unpackFloat1(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float unpackFloat2(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final int unpackInt1(long v) {
        return (int)(v >> 0x20);
    }

    public static final int unpackInt2(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }
}

