package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0013\u001A\u00020\u00142\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u001E\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001E\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001EJ\u000F\u0010!\u001A\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R#\u0010\b\u001A\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001A\u0004\b\u000B\u0010\fR#\u0010\r\u001A\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class DpOffset {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/DpOffset;", "getZero-RKDOV3M", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-RKDOV3M() {
            return 0L;
        }
    }

    public static final Companion Companion;
    private static final long Zero;
    private final long packedValue;

    static {
        DpOffset.Companion = new Companion(null);
        DpOffset.Zero = 0L;
    }

    private DpOffset(long v) {
        this.packedValue = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final DpOffset box-impl(long v) {
        return new DpOffset(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-tPigGR8(long v, float f, float f1) {
        return DpKt.DpOffset-YgX7TsA(f, f1);
    }

    public static long copy-tPigGR8$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = DpOffset.getX-D9Ej5fM(v);
        }
        if((v1 & 2) != 0) {
            f1 = DpOffset.getY-D9Ej5fM(v);
        }
        return DpOffset.copy-tPigGR8(v, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return DpOffset.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof DpOffset ? v == ((DpOffset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getPackedValue$annotations() {
    }

    public static final float getX-D9Ej5fM(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static void getX-D9Ej5fM$annotations() {
    }

    public static final float getY-D9Ej5fM(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static void getY-D9Ej5fM$annotations() {
    }

    @Override
    public int hashCode() {
        return DpOffset.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long minus-CB-Mgk4(long v, long v1) {
        return DpKt.DpOffset-YgX7TsA(DpOffset.getX-D9Ej5fM(v) - DpOffset.getX-D9Ej5fM(v1), DpOffset.getY-D9Ej5fM(v) - DpOffset.getY-D9Ej5fM(v1));
    }

    public static final long plus-CB-Mgk4(long v, long v1) {
        return DpKt.DpOffset-YgX7TsA(DpOffset.getX-D9Ej5fM(v) + DpOffset.getX-D9Ej5fM(v1), DpOffset.getY-D9Ej5fM(v) + DpOffset.getY-D9Ej5fM(v1));
    }

    @Override
    public String toString() {
        return DpOffset.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "(" + Dp.toString-impl(DpOffset.getX-D9Ej5fM(v)) + ", " + Dp.toString-impl(DpOffset.getY-D9Ej5fM(v)) + ')';
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

