package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001A\u00020\tH\u0087\u0002\u00A2\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001A\u00020\tH\u0087\u0002\u00A2\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0019H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\fJ\u001E\u0010#\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0000H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b$\u0010%J\u001E\u0010&\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0000H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b\'\u0010%J!\u0010(\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\tH\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b)\u0010*J!\u0010+\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0019H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b,\u0010\u001BJ\u000F\u0010-\u001A\u00020.H\u0017\u00A2\u0006\u0004\b/\u00100J\u0019\u00101\u001A\u00020\u0000H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b2\u0010\u0005R\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004\u00A2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u0007\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\t8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00064"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class IntOffset {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-nOcc-ac() [...] // 潜在的解密器
    }

    public static final Companion Companion;
    private static final long Zero;
    private final long packedValue;

    static {
        IntOffset.Companion = new Companion(null);
        IntOffset.Zero = IntOffsetKt.IntOffset(0, 0);
    }

    private IntOffset(long v) {
        this.packedValue = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final IntOffset box-impl(long v) {
        return new IntOffset(v);
    }

    public static final int component1-impl(long v) {
        return (int)(v >> 0x20);
    }

    public static final int component2-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-iSbpLlY(long v, int v1, int v2) {
        return IntOffsetKt.IntOffset(v1, v2);
    }

    public static long copy-iSbpLlY$default(long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = (int)(v >> 0x20);
        }
        if((v3 & 2) != 0) {
            v2 = (int)(v & 0xFFFFFFFFL);
        }
        return IntOffset.copy-iSbpLlY(v, v1, v2);
    }

    public static final long div-Bjo55l4(long v, float f) {
        return IntOffsetKt.IntOffset(MathKt.roundToInt(((float)(((int)(v >> 0x20)))) / f), MathKt.roundToInt(((float)(((int)(v & 0xFFFFFFFFL)))) / f));
    }

    @Override
    public boolean equals(Object object0) {
        return IntOffset.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof IntOffset ? v == ((IntOffset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getPackedValue$annotations() {
    }

    public static void getX$annotations() {
    }

    public static final int getX-impl(long v) [...] // Inlined contents

    public static void getY$annotations() {
    }

    public static final int getY-impl(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return IntOffset.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long minus-qkQi6aY(long v, long v1) {
        return IntOffsetKt.IntOffset(((int)(v >> 0x20)) - ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) - ((int)(v1 & 0xFFFFFFFFL)));
    }

    public static final long plus-qkQi6aY(long v, long v1) {
        return IntOffsetKt.IntOffset(IntOffset.getX-impl(v) + IntOffset.getX-impl(v1), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)));
    }

    public static final long rem-Bjo55l4(long v, int v1) {
        return IntOffsetKt.IntOffset(((int)(v >> 0x20)) % v1, IntOffset.getY-impl(v) % v1);
    }

    public static final long times-Bjo55l4(long v, float f) {
        return IntOffsetKt.IntOffset(MathKt.roundToInt(((float)(((int)(v >> 0x20)))) * f), MathKt.roundToInt(((float)(((int)(v & 0xFFFFFFFFL)))) * f));
    }

    @Override
    public String toString() {
        return IntOffset.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "(" + ((int)(v >> 0x20)) + ", " + ((int)(v & 0xFFFFFFFFL)) + ')';
    }

    public static final long unaryMinus-nOcc-ac(long v) {
        return IntOffsetKt.IntOffset(-((int)(v >> 0x20)), -IntOffset.getY-impl(v));
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

