package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001$B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001A\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0011\u0010\u000BJ\u0010\u0010\u0012\u001A\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0013\u0010\u000BJ!\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u0018\u001A\u00020\u00192\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001D\u0010\u000BJ!\u0010\u001E\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001F\u0010\u0017J\u000F\u0010 \u001A\u00020!H\u0017¢\u0006\u0004\b\"\u0010#R\u001A\u0010\u0006\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR\u001A\u0010\r\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000B\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)I", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "other", "div-YEO4UFw", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "times", "times-YEO4UFw", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class IntSize {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-YbymL2g() [...] // 潜在的解密器
    }

    public static final Companion Companion;
    private static final long Zero;
    private final long packedValue;

    static {
        IntSize.Companion = new Companion(null);
        IntSize.Zero = 0L;
    }

    private IntSize(long v) {
        this.packedValue = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final IntSize box-impl(long v) {
        return new IntSize(v);
    }

    public static final int component1-impl(long v) {
        return (int)(v >> 0x20);
    }

    public static final int component2-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long div-YEO4UFw(long v, int v1) {
        return IntSizeKt.IntSize(((int)(v >> 0x20)) / v1, ((int)(v & 0xFFFFFFFFL)) / v1);
    }

    @Override
    public boolean equals(Object object0) {
        return IntSize.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof IntSize ? v == ((IntSize)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getHeight$annotations() {
    }

    public static final int getHeight-impl(long v) [...] // Inlined contents

    public static void getPackedValue$annotations() {
    }

    public static void getWidth$annotations() {
    }

    public static final int getWidth-impl(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return IntSize.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long times-YEO4UFw(long v, int v1) {
        return IntSizeKt.IntSize(((int)(v >> 0x20)) * v1, ((int)(v & 0xFFFFFFFFL)) * v1);
    }

    @Override
    public String toString() {
        return IntSize.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return ((int)(v >> 0x20)) + " x " + ((int)(v & 0xFFFFFFFFL));
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

